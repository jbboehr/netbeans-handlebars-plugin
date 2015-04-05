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
 * Useful information about a handlebar error.
 *
 * @author edgar.espina
 * @since 0.5.0
 */
public class HbsError {

  /**
   * The error's line number.
   */
  public final int line;

  /**
   * The error's column number.
   */
  public final int column;

  /**
   * The error's problem.
   */
  public final String reason;

  /**
   * The error's evidence.
   */
  public final String evidence;

  /**
   * The full error's message.
   */
  public final String message;

  /**
   * Creates a new {@link HandlebarsError}.
   *
   * @param line The error's line number.
   * @param column The error's column number.
   * @param reason The error's reason. Required.
   * @param evidence The error's evidence. Required.
   * @param message The error's message. Required.
   */
  public HbsError(final int line,
      final int column, final String reason, final String evidence,
      final String message) {
    this.line = line;
    this.column = column;
    this.reason = reason;
    this.evidence = evidence;
    this.message = message;
  }

  @Override
  public String toString() {
    return message;
  }
}