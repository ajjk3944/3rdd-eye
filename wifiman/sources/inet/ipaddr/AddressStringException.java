package inet.ipaddr;

/* loaded from: classes4.dex */
public class AddressStringException extends HostIdentifierException {

    /* renamed from: b, reason: collision with root package name */
    private static final String f49270b = HostIdentifierException.a("ipaddress.address.error");

    public AddressStringException(CharSequence charSequence, String str, Throwable th2) {
        super(charSequence, f49270b, str, th2);
    }

    public AddressStringException(CharSequence charSequence, String str) {
        super(charSequence, f49270b, str);
    }

    public AddressStringException(CharSequence charSequence, String str, int i10) {
        super(charSequence.toString() + ' ' + f49270b + ' ' + HostIdentifierException.a(str) + ' ' + i10);
    }

    public AddressStringException(CharSequence charSequence, int i10) {
        this(charSequence, i10, false);
    }

    public AddressStringException(CharSequence charSequence, int i10, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence.toString());
        sb2.append(' ');
        sb2.append(f49270b);
        sb2.append(' ');
        sb2.append(HostIdentifierException.a(z10 ? "ipaddress.error.invalid.character.combination.at.index" : "ipaddress.error.invalid.character.at.index"));
        sb2.append(' ');
        sb2.append(i10);
        super(sb2.toString());
    }

    public AddressStringException(String str) {
        super(f49270b, str);
    }
}
