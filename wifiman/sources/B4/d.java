package B4;

import com.google.crypto.tink.config.internal.b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o4.InterfaceC7070e;
import x4.AbstractC8421a;

/* loaded from: classes3.dex */
public final class d implements InterfaceC7070e {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC1214b f1161c = b.EnumC1214b.ALGORITHM_NOT_FIPS;

    /* renamed from: d, reason: collision with root package name */
    private static final Collection f1162d = Arrays.asList(64);

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f1163e = new byte[16];

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f1164f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private final m f1165a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f1166b;

    public d(byte[] bArr) throws GeneralSecurityException {
        if (!f1161c.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (f1162d.contains(Integer.valueOf(bArr.length))) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f1166b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f1165a = new m(bArrCopyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    private byte[] c(byte[]... bArr) throws GeneralSecurityException {
        if (bArr.length == 0) {
            return this.f1165a.a(f1164f, 16);
        }
        byte[] bArrA = this.f1165a.a(f1163e, 16);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = f.e(AbstractC8421a.b(bArrA), this.f1165a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f1165a.a(bArr3.length >= 16 ? f.f(bArr3, bArrA) : f.e(AbstractC8421a.a(bArr3), AbstractC8421a.b(bArrA)), 16);
    }

    @Override // o4.InterfaceC7070e
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) i.f1188b.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f1166b, "AES"), new IvParameterSpec(bArr3));
        return f.a(bArrC, cipher.doFinal(bArr));
    }

    @Override // o4.InterfaceC7070e
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) i.f1188b.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f1166b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && q.b()) {
            bArrDoFinal = new byte[0];
        }
        if (f.b(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
