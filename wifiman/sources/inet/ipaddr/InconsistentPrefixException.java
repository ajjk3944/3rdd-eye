package inet.ipaddr;

import ag.InterfaceC3849g;

/* loaded from: classes4.dex */
public class InconsistentPrefixException extends AddressValueException {
    public InconsistentPrefixException(InterfaceC3849g interfaceC3849g, InterfaceC3849g interfaceC3849g2, Integer num) {
        super(interfaceC3849g + ", " + interfaceC3849g2 + ", " + num + ", " + AddressValueException.f49271a + " " + a("ipaddress.error.inconsistent.prefixes"));
    }

    static String a(String str) {
        return HostIdentifierException.a(str);
    }
}
