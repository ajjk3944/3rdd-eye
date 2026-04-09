package inet.ipaddr;

import ag.InterfaceC3849g;

/* loaded from: classes4.dex */
public class IncompatibleAddressException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private static String f49274a = a("ipaddress.address.error");

    public IncompatibleAddressException(InterfaceC3849g interfaceC3849g, String str) {
        super(interfaceC3849g + ", " + f49274a + " " + a(str));
    }

    static String a(String str) {
        return HostIdentifierException.a(str);
    }

    public IncompatibleAddressException(CharSequence charSequence, String str) {
        super(((Object) charSequence) + ", " + f49274a + " " + a(str));
    }

    public IncompatibleAddressException(long j10, long j11, String str) {
        super(j10 + "-" + j11 + ", " + f49274a + " " + a(str));
    }

    public IncompatibleAddressException(long j10, long j11, long j12, String str) {
        super(j10 + "-" + j11 + " /" + j12 + ", " + f49274a + " " + a(str));
    }

    public IncompatibleAddressException(String str, String str2, String str3, String str4) {
        super(str + "-" + str2 + " /" + str3 + ", " + f49274a + " " + a(str4));
    }

    public IncompatibleAddressException(InterfaceC3849g interfaceC3849g, int i10, String str) {
        super(interfaceC3849g + " /" + i10 + ", " + f49274a + " " + a(str));
    }

    public IncompatibleAddressException(InterfaceC3849g interfaceC3849g, InterfaceC3849g interfaceC3849g2, String str) {
        super(interfaceC3849g + ", " + interfaceC3849g2 + ", " + f49274a + " " + a(str));
    }
}
