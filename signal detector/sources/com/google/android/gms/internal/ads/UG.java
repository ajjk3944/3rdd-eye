package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class UG implements TG {

    /* renamed from: d, reason: collision with root package name */
    public static final T2.i f11631d = new T2.i(5);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f11632a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11633b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11634c;

    public UG(byte[] bArr) throws GeneralSecurityException {
        Cr.i(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f11632a = secretKeySpec;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f11631d.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM = C1476lN.m(cipher.doFinal(new byte[16]));
        this.f11633b = bArrM;
        this.f11634c = C1476lN.m(bArrM);
    }

    @Override // com.google.android.gms.internal.ads.TG
    public final byte[] j(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrC;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f11631d.get();
        cipher.init(1, this.f11632a);
        int length = bArr.length;
        int i3 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i6 = i3 - 1;
        int i7 = i6 * 16;
        if (i3 * 16 == length) {
            bArrC = AbstractC0582Jp.C(bArr, i7, this.f11633b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrC = AbstractC0582Jp.C(bArrCopyOf, 0, this.f11634c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = i8 * 16;
            for (int i10 = 0; i10 < 16; i10++) {
                bArr3[i10] = (byte) (bArr2[i10] ^ bArr[i10 + i9]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr2[i11] ^ bArrC[i11]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
