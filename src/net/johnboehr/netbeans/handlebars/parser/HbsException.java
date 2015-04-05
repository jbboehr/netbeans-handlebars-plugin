/**
 * Copyright (c) 2012-2013 Edgar Espina
 *
 * This file is part of Handlebars.java.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
