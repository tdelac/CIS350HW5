import java.util.Set;

public abstract class HangmanGame{

	protected String secretWord = "";//To store the secret word
	protected int guessesRemaining;//to store the number of guess for the user
	protected int numLettersLeft;//to store the number of the letters in the secret word has not been guessed correctly
	protected Set<Character> history;//store the letter user has tried
	protected String currentState = "";//store the current guessing situation
	
    /**
     * @return the original secret word.
     */
	public String getSecretWord(){
        return this.secretWord;
    }
    
    /**
     * Simulates the player guessing a letter in the word and updates the state of game
     * accordingly -- number of guesses remaining, number of letters 
     * if the guessed letter is not in the word, and hasn't been guessed yet, numGuesses is decremented
     * if the guessed letter is in the word, and hasn't been guessed yet, then update the current state of
     * the guessed word to reveal the position(s) of the letter(s) that was just guessed, and update numLettersRemaining.
     * There should be no guess penalty for guessing a letter that has already been 
     * guessed, just return false.  
     * @param ch the char that is the next letter to be guessed on the word
     * @return true if the game isn't over and the guessed letter was in the word, false otherwise
     */
    public abstract boolean makeGuess(char ch);
    
    /**
     * @return true if there are no more letters to be guessed and there is still at least one guess remaining
     */
	public boolean isWin(){
        if (guessesRemaining == 0)
            return false;//if the user has no chance to guess again, it means the user loses.
        else
            return true;
    } 
    
    /** 
     * @return true if either num guesses remaining is 0 or num letters remaining to be guessed is 0.
     */
	public boolean gameOver(){
		if (guessesRemaining == 0 || numLettersLeft == 0)
			return true;
		else
			return false;
	}
    
    /**
     * @return the number of guesses the player has left
     */
	public int numGuessesRemaining(){
        return guessesRemaining;
    }
    
    /**
     * The number of letters remaining to be guessed in the secret word - i.e.
     * the number of blank spaces the player sees, which may be different from
     * the actually number of letters it will take to fill those blanks.
     * @return the number of letters in the secret word that still have to be guessed
     */
	public int numLettersRemaining(){
        return numLettersLeft;
    }
    
    /**
     * Gives a display-ready String-ified version of the current state of the secret word, showing letters
     * that have been guessed and blank spaces for letters that still need to be guessed.
     * For example if the secrect word is "LABORATORY" and the player has guessed L, A, B, R, and Y
     * the method might return something like "L A B _ R A _ _ R Y"
     * @return a String of the current state of the secret word.
     */
	 public String displayGameState(){
	        return currentState;
	 }
    
    /**
     * A String representing the letters guessed so far in the order they were guessed.
     * Duplicates should not be added.
     * @return a String showing which letters have already been guessed.
     */
	public Set<Character> lettersGuessed(){
        return history;
    }
	
	/**
	 * Check to see if letter is already guessed
	 * @param c character guessed by user
	 * @return true if already guessed, false otherwise
	 */
	
	public boolean alreadyGuessed(char c){
		if (history.contains(c)) return true;
    	return false;
    }  
}
