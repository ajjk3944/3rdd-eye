package inet.ipaddr;

/* loaded from: classes4.dex */
public class AddressPositionException extends AddressValueException {
    public AddressPositionException(int i10) {
        super(i10 + ", " + AddressValueException.f49271a + " " + a("ipaddress.error.invalid.position"));
    }

    static String a(String str) {
        return HostIdentifierException.a(str);
    }
}
