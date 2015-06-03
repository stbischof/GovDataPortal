/**
 * Copyright (c) 2012, 2013 Fraunhofer Institute FOKUS
 *
 * This file is part of Open Data Platform.
 *
 * Open Data Platform is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * Open Data Plaform is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.

 * You should have received a copy of the GNU Affero General Public License
 * along with Open Data Platform.  If not, see <http://www.gnu.org/licenses/agpl-3.0>.
 */

/*
 * 
 */
package de.fhg.fokus.odp.registry.model.exception;

/**
 * The Class OpenDataRegistryModelException.
 */
public class OpenDataRegistryException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new open data registry model exception.
     */
    public OpenDataRegistryException() {
        super();
    }

    /**
     * Instantiates a new open data registry model exception.
     * 
     * @param message
     *            the message
     */
    public OpenDataRegistryException(String message) {
        super(message);
    }

}