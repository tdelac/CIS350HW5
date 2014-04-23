import java.util.*;
import java.io.*;


public class EvilHangMan extends HangmanGame {
	
	private char letterGuess;// the letter the user guess right now
	private ArrayList<String> wordlist = new ArrayList<String>();// to store the dictionary
	private int numWords = 0;// count the number of possible secret words.
	private int secretStringLength;// the length of the secret string
	private boolean guessResult = false;
	private String latestword;

	public EvilHangMan(int StringLength, int numGuesses) {
		guessesRemaining = numGuesses;
		secretStringLength = StringLength;
		numLettersLeft = 26;
		history = new HashSet<Character>();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("dictionary.txt"));// read the dictionary
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		int i = 0;
		while (scanner.hasNext()) {
			String temp = scanner.nextLine().toUpperCase();
			if (temp.length() == StringLength) {
				wordlist.add(temp);
				numWords++;
			}
		}

		for (i = 0; i < StringLength; i++) {
			currentState += "_ ";
		}
		scanner.close();
	}

	@Override
	public boolean makeGuess(char ch) {

		System.out.println("makeGuess: " + ch + "; numWords=" + numWords);
		guessResult = false;
		letterGuess = ch;
		if (Character.isLetter(ch) && !alreadyGuessed(ch)) {
			// adjust the Wordlist in order to avoid the word with the letter
			// user guessed
			Iterator<String> iter = wordlist.iterator();
			while (iter.hasNext()){
				String tmp = iter.next();
				for (int i = 0; i < secretStringLength; i++){
					if (tmp.charAt(i) == ch){
						latestword = tmp;
						iter.remove();
						break;
					}
				}
			}
			
			if (wordlist.size() == 0) {
				System.out.println("tempWordNum is zero!");
				secretWord = latestword;
				guessResult = true;
			} else {
				secretWord = wordlist.get(0);
				numWords = wordlist.size();
				guessesRemaining--;
				guessResult = false;
			}
			if (!guessResult) {
				history.add(letterGuess);
			}

		} else return false;
		
		return guessResult;
	}
}