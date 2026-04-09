package javax.jmdns.impl;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import javax.jmdns.NetworkTopologyDiscovery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes4.dex */
public class NetworkTopologyDiscoveryImpl implements NetworkTopologyDiscovery {
    private static final Logger logger = LoggerFactory.getLogger(NetworkTopologyDiscoveryImpl.class.getName());

    @Override // javax.jmdns.NetworkTopologyDiscovery
    public InetAddress[] getInetAddresses() throws SocketException {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    Logger logger2 = logger;
                    if (logger2.isTraceEnabled()) {
                        logger2.trace("Found NetworkInterface/InetAddress: " + networkInterfaceNextElement + " -- " + inetAddressNextElement);
                    }
                    if (useInetAddress(networkInterfaceNextElement, inetAddressNextElement)) {
                        hashSet.add(inetAddressNextElement);
                    }
                }
            }
        } catch (SocketException e10) {
            logger.warn("Error while fetching network interfaces addresses: " + e10);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }

    @Override // javax.jmdns.NetworkTopologyDiscovery
    public void lockInetAddress(InetAddress inetAddress) {
    }

    @Override // javax.jmdns.NetworkTopologyDiscovery
    public void unlockInetAddress(InetAddress inetAddress) {
    }

    @Override // javax.jmdns.NetworkTopologyDiscovery
    public boolean useInetAddress(NetworkInterface networkInterface, InetAddress inetAddress) {
        try {
            if (networkInterface.isUp() && networkInterface.supportsMulticast()) {
                return !networkInterface.isLoopback();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
