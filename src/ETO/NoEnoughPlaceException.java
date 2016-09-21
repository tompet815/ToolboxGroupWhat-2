
package ETO;

/**
 * Thrown if the ferry has not enough places for 
 * desired amount of passengers or vehicles 
 * on desired date and time.
 *
 */
public class NoEnoughPlaceException extends Exception{

    public NoEnoughPlaceException(String message) {
        super(message);
    }
    
}
