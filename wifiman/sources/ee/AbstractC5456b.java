package ee;

import inet.ipaddr.g;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ee.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5456b {
    public static final g a(InetAddress inetAddress) {
        AbstractC6492s.i(inetAddress, "<this>");
        if (inetAddress instanceof Inet4Address) {
            return new C6180b((Inet4Address) inetAddress);
        }
        if (inetAddress instanceof Inet6Address) {
            return new C6205b((Inet6Address) inetAddress);
        }
        throw new IllegalStateException("Unknown subclass of InetAddress: " + inetAddress.getClass().getName());
    }
}
