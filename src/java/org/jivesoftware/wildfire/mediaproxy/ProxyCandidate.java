package org.jivesoftware.wildfire.mediaproxy;

import java.net.InetAddress;

/**
 * Basic interface to access a Candidate provided by a Session
 */
public interface ProxyCandidate {

    public String getSID();

    public String getPass();

    public InetAddress getLocalhost();

    public InetAddress getHostA();

    public InetAddress getHostB();

    public void setHostA(InetAddress hostA);

    public void setHostB(InetAddress hostB);

    public void sendFromPortA(String host, int port);

    public void sendFromPortB(String host, int port);

    public int getPortA();

    public int getPortB();

    public void setPortA(int portA);

    public void setPortB(int portB);

    public int getLocalPortA();

    public int getLocalPortB();

    public void start();

    public void stopAgent();

}
