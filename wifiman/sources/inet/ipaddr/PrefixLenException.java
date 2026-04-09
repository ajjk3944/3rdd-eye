package inet.ipaddr;

import ag.InterfaceC3849g;
import inet.ipaddr.g;

/* loaded from: classes4.dex */
public class PrefixLenException extends AddressValueException {
    public PrefixLenException(int i10) {
        super(AddressValueException.f49271a + " " + a("ipaddress.error.prefixSize"));
    }

    static String a(String str) {
        return HostIdentifierException.a(str);
    }

    public PrefixLenException(InterfaceC3849g interfaceC3849g, int i10) {
        super(interfaceC3849g + ", " + AddressValueException.f49271a + " " + a("ipaddress.error.prefixSize"));
    }

    public PrefixLenException(int i10, g.a aVar) {
        super(aVar + " /" + i10 + ", " + AddressValueException.f49271a + " " + a("ipaddress.error.prefixSize"));
    }
}
