package ua.lviv.lgs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class LoggeredFile {

    private static Logger LOG = Logger.getLogger(LoggeredFile.class);

    public static void main(String[] args) {
        logWithDomConfigurator();

    }

    public static void logWithDomConfigurator() {
        DOMConfigurator.configure("loggerConfig.xml");
        LOG.debug("Debug message");
        LOG.info("INFO message");
        LOG.warn("WARN message");
        LOG.error("ERROR message");


    }

}
