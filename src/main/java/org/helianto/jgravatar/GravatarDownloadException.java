package org.helianto.jgravatar;

/**
 * 
 * @author Ralf Ebert  <a href="https://github.com/ralfebert/jgravatar"> Site on gitHub</a>
 *
 */
public class GravatarDownloadException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GravatarDownloadException(Throwable cause) {
		super("Gravatar could not be downloaded: " + cause.getMessage(), cause);
	}

}
