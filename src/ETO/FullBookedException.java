package ETO;

/**
 * Thrown if the ferry on desired date and time is fullbooked.
 *
 */
public class FullBookedException extends Exception {

    public FullBookedException(String message) {
        super(message);
    }

}
