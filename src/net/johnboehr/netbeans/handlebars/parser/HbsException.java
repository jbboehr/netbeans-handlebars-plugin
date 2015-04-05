/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.johnboehr.netbeans.handlebars.parser;

/**
 *
 * @author Rin
 */
public class HbsException extends RuntimeException {
    
  /**
   * The serial UUID.
   */
  private static final long serialVersionUID = -294368972176956335L;

  /**
   * A handlebars error. Optional.
   */
  private HbsError error;

  /**
   * Creates a new {@link HandlebarsException}.
   *
   * @param error The hbs error's. Required.
   */
  public HbsException(final HbsError error) {
    super(error.message);
    this.error = error;
  }

  /**
   * Creates a new {@link HandlebarsException}.
   *
   * @param cause The error's cause.
   */
  public HbsException(final Throwable cause) {
    super(cause);
  }

  /**
   * Creates a new {@link HandlebarsException}.
   *
   * @param error The error's message.
   * @param cause The error's cause.
   */
  public HbsException(final HbsError error,
      final Throwable cause) {
    super(error.message, cause);
    this.error = error;
  }

  /**
   * Creates a new {@link HandlebarsException}.
   *
   * @param message The error's message.
   * @param cause The error's cause.
   */
  public HbsException(final String message, final Throwable cause) {
    super(message, cause);
  }

  /**
   * A handlebars error.
   *
   * @return A handlebars error. It might be null.
   */
  public HbsError getError() {
    return error;
  }
}
