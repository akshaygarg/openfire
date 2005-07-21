/**
 * $RCSfile$
 * $Revision$
 * $Date$
 *
 * Copyright (C) 2004 Jive Software. All rights reserved.
 *
 * This software is published under the terms of the GNU Public License (GPL),
 * a copy of which is included in this distribution.
 */

package org.jivesoftware.messenger.plugin.presence;

import org.xmpp.packet.Presence;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Abstract class for the different ways to provide information about user presences.
 *
 * @author Gaston Dombiak
 */
abstract class PresenceInfoProvider {

    /**
     * Sends information to the sender of the http request about the presence of a user.
     *
     * @param httpServletRequest the http request.
     * @param httpServletResponse the http response.
     * @param presence the presence of the user or <tt>null</tt> if the user is offline.
     * @throws IOException If an error occured while sending the information.
     */
    public abstract void sendInfo(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse, Presence presence) throws IOException;

    /**
     * Informs the sender of the http request that the user presence is not available. This may
     * happen if the user does not exist or if the user that made the request is not allowed to
     * see the presence of the requested user.
     *
     * @param httpServletRequest the http request.
     * @param httpServletResponse the http response.
     * @throws IOException If an error occured while sending the information.
     */
    public abstract void sendUserNotFound(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) throws IOException;
}
