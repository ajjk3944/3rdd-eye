package Lg;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class o implements Kg.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Ej.b f11787a = Ej.c.i(o.class);

    @Override // Kg.b
    public InetAddress[] a() throws SocketException {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    f11787a.g("Found NetworkInterface/InetAddress: {} -- {}", networkInterfaceNextElement, inetAddressNextElement);
                    if (b(networkInterfaceNextElement, inetAddressNextElement)) {
                        hashSet.add(inetAddressNextElement);
                    }
                }
            }
        } catch (SocketException e10) {
            f11787a.r("Error while fetching network interfaces addresses: ", e10);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }

    public boolean b(NetworkInterface networkInterface, InetAddress inetAddress) {
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
