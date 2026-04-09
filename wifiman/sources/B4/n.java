package B4;

import com.google.crypto.tink.config.internal.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import z4.InterfaceC8710a;

/* loaded from: classes3.dex */
public final class n implements InterfaceC8710a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC1214b f1203e = b.EnumC1214b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f1204a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1205b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f1206c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1207d;

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() throws InvalidKeyException {
            try {
                Mac mac = (Mac) i.f1189c.a(n.this.f1205b);
                mac.init(n.this.f1206c);
                return mac;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public n(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f1204a = aVar;
        if (!f1203e.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f1205b = str;
        this.f1206c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                this.f1207d = 20;
                break;
            case "HMACSHA224":
                this.f1207d = 28;
                break;
            case "HMACSHA256":
                this.f1207d = 32;
                break;
            case "HMACSHA384":
                this.f1207d = 48;
                break;
            case "HMACSHA512":
                this.f1207d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // z4.InterfaceC8710a
    public byte[] a(byte[] bArr, int i10) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i10 > this.f1207d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f1204a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f1204a.get()).doFinal(), i10);
    }
}
