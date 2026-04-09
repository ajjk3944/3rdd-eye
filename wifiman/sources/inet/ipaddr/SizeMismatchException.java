package inet.ipaddr;

import ag.InterfaceC3849g;

/* loaded from: classes4.dex */
public class SizeMismatchException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private static String f49276a = a("ipaddress.address.error");

    public SizeMismatchException(InterfaceC3849g interfaceC3849g, InterfaceC3849g interfaceC3849g2) {
        super(interfaceC3849g + ", " + interfaceC3849g2 + ", " + f49276a + " " + a("ipaddress.error.sizeMismatch"));
    }

    static String a(String str) {
        return HostIdentifierException.a(str);
    }
}
