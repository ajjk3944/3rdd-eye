package inet.ipaddr;

import ag.InterfaceC3849g;

/* loaded from: classes4.dex */
public class AddressConversionException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private static String f49269a = a("ipaddress.address.error");

    public AddressConversionException(InterfaceC3849g interfaceC3849g, InterfaceC3849g interfaceC3849g2) {
        super(interfaceC3849g + ", " + interfaceC3849g2 + ", " + f49269a + " " + a("ipaddress.error.version.mismatch"));
    }

    static String a(String str) {
        return HostIdentifierException.a(str);
    }
}
