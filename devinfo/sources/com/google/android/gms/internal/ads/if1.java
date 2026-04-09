package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class if1 implements hf1 {

    /* renamed from: d, reason: collision with root package name */
    public static final wa f12323d = new wa(4);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f12324a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12325b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f12326c;

    public if1(byte[] bArr) throws GeneralSecurityException {
        al0.m(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f12324a = secretKeySpec;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f12323d.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM = yr1.m(cipher.doFinal(new byte[16]));
        this.f12325b = bArrM;
        this.f12326c = yr1.m(bArrM);
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final byte[] g(int i4, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrC;
        if (i4 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f12323d.get();
        cipher.init(1, this.f12324a);
        int length = bArr.length;
        int i10 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i11 = i10 - 1;
        int i12 = i11 * 16;
        if (i10 * 16 == length) {
            bArrC = mq0.C(bArr, i12, this.f12325b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrC = mq0.C(bArrCopyOf, 0, this.f12326c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i13 * 16;
            for (int i15 = 0; i15 < 16; i15++) {
                bArr3[i15] = (byte) (bArr2[i15] ^ bArr[i15 + i14]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i16 = 0; i16 < 16; i16++) {
            bArr3[i16] = (byte) (bArr2[i16] ^ bArrC[i16]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i4 == 16 ? bArr2 : Arrays.copyOf(bArr2, i4);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
