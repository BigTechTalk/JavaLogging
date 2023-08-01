package org.bigtechtalk.log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loj4j2PropertyFileDemo {

    static Logger logger = LogManager.getLogger(Loj4j2PropertyFileDemo.class);

    public static void main(String[] args) {
        logger.debug("Debug Message Logged !!!");
        logger.info("Info Message Logged !!!");
        logger.error("Error Message Logged !!!",
                new NullPointerException("NullError"));
    }
}




