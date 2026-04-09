package inet.ipaddr;

import ag.InterfaceC3849g;

/* loaded from: classes4.dex */
public class AddressValueException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    static String f49271a = a("ipaddress.address.error");

    public AddressValueException(long j10) {
        super(j10 + ", " + f49271a + " " + a("ipaddress.error.exceeds.size"));
    }

    static String a(String str) {
        return HostIdentifierException.a(str);
    }

    public AddressValueException(String str, long j10) {
        super(j10 + ", " + f49271a + " " + a(str));
    }

    public AddressValueException(InterfaceC3849g interfaceC3849g, InterfaceC3849g interfaceC3849g2) {
        super(interfaceC3849g + ", " + interfaceC3849g2 + ", " + f49271a + " " + a("ipaddress.error.exceeds.size"));
    }

    AddressValueException(String str) {
        super(str);
    }
}
