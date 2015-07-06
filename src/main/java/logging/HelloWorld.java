package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple example of how to use slf4j logger
 */
public class HelloWorld {

	public static void main(final String[] args) {
		final Logger logger = LoggerFactory.getLogger(HelloWorld.class.getCanonicalName());
		logger.debug("Hello world.");
	}
}