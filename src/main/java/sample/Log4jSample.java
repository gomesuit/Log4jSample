package sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jSample {
    private static Logger logger = LogManager.getLogger(Log4jSample.class);

    public static void main(String[] args) {
        logger.trace("TraceMessage");
        logger.debug("DebugMessage");
        logger.info("InfoMessage {}!", "Hello Log4j2");
        logger.warn("WarnMessage {}!", "Hello Log4j2");
        logger.error("ErrorMessage");
        logger.fatal("FatalMessage");
        //logger.info("Exception", new IllegalArgumentException("Oops!"));
        logger.trace("Run {}!!", Log4jSample.class.getSimpleName());
    }
}