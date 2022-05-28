package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main method
 * @author Samuel Spencer
 *
 */
public class Main {
    /**
     * Here is the logger
     */
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {


        logger.debug("It is a debug logger.");
        logger.info("Info Logger");
        logger.error("Error Logger");
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 5));
        System.out.println(calculator.minus(10, 5));
        System.out.println(calculator.divide(10, 7));
        System.out.println(calculator.multiply(10, 5));

    }
}
