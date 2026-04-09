package inet.ipaddr;

/* loaded from: classes4.dex */
public class HostNameException extends HostIdentifierException {

    /* renamed from: b, reason: collision with root package name */
    private static String f49273b = HostIdentifierException.a("ipaddress.host.error");

    public HostNameException(String str, int i10) {
        super(str + " " + f49273b + " " + HostIdentifierException.a("ipaddress.host.error.invalid.character.at.index") + ' ' + i10);
    }

    public HostNameException(String str, int i10, Throwable th2) {
        super(str + " " + f49273b + " " + HostIdentifierException.a("ipaddress.host.error.invalid.character.at.index") + ' ' + i10, th2);
    }

    public HostNameException(String str, String str2) {
        super(str, f49273b, str2);
    }

    public HostNameException(String str, AddressStringException addressStringException, String str2) {
        super(str, f49273b, str2, addressStringException);
    }
}
