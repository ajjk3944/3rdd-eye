package inet.ipaddr;

import ag.InterfaceC3849g;

/* loaded from: classes4.dex */
public class NetworkMismatchException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private static String f49275a = a("ipaddress.address.error");

    public NetworkMismatchException(InterfaceC3849g interfaceC3849g) {
        super(interfaceC3849g + ", " + f49275a + " " + a("ipaddress.error.mixedNetworks"));
    }

    static String a(String str) {
        return HostIdentifierException.a(str);
    }

    public NetworkMismatchException(InterfaceC3849g interfaceC3849g, InterfaceC3849g interfaceC3849g2) {
        super(interfaceC3849g + ", " + interfaceC3849g2 + ", " + f49275a + " " + a("ipaddress.error.mixedNetworks"));
    }
}
