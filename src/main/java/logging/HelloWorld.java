package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple example of how to use slf4j logger
 */
public class HelloWorld {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class.getCanonicalName());

	public static void main(final String[] args) {
		LOGGER.debug("Hello world.");
	}
}