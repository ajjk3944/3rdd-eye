package B4;

import com.google.crypto.tink.config.internal.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import x4.AbstractC8421a;
import z4.InterfaceC8710a;

/* loaded from: classes3.dex */
public final class m implements InterfaceC8710a {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC1214b f1199d = b.EnumC1214b.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f1200a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f1201b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f1202c;

    public m(byte[] bArr) throws GeneralSecurityException {
        r.a(bArr.length);
        this.f1200a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() throws GeneralSecurityException {
        Cipher cipherC = c();
        cipherC.init(1, this.f1200a);
        byte[] bArrB = AbstractC8421a.b(cipherC.doFinal(new byte[16]));
        this.f1201b = bArrB;
        this.f1202c = AbstractC8421a.b(bArrB);
    }

    private static Cipher c() throws GeneralSecurityException {
        if (f1199d.isCompatible()) {
            return (Cipher) i.f1188b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // z4.InterfaceC8710a
    public byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherC = c();
        cipherC.init(1, this.f1200a);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] bArrD = iMax * 16 == bArr.length ? f.d(bArr, (iMax - 1) * 16, this.f1201b, 0, 16) : f.e(AbstractC8421a.a(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.f1202c);
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipherC.doFinal(f.d(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipherC.doFinal(f.e(bArrD, bArrDoFinal)), i10);
    }
}
