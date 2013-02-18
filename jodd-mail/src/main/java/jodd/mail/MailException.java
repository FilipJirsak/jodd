// Copyright (c) 2003-2013, Jodd Team (jodd.org). All Rights Reserved.

package jodd.mail;

import jodd.exception.UncheckedException;

/**
 * Mailing exception.
 */
public class MailException extends UncheckedException {

	public MailException(String message) {
		super(message);
	}

	public MailException(String message, Throwable t) {
		super(message, t);
	}

	public MailException(Throwable t) {
		super(t);
	}
}
