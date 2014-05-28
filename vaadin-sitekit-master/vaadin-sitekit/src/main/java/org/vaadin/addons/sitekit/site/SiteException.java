/**
 * Copyright 2013 Tommi S.E. Laukkanen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.addons.sitekit.site;

/**
 * Exception class for Site related exceptions.
 *
 * @author Tommi S.E. Laukkanen
 */
public class SiteException extends RuntimeException {
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public SiteException() {
    }

    /**
     * @param message The portal exception message.
     * @param cause The throwable causing this portal exception.
     */
    public SiteException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message The portal exception message.
     */
    public SiteException(final String message) {
        super(message);
    }

}
