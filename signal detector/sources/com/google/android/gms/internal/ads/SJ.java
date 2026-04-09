package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class SJ implements VD {

    /* renamed from: e, reason: collision with root package name */
    public static final T2.i f11165e = new T2.i(7);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11166a;

    /* renamed from: b, reason: collision with root package name */
    public final TG f11167b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f11168c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11169d;

    public SJ(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f11169d = i;
        int length = bArr.length;
        Cr.i(length);
        this.f11168c = new SecretKeySpec(bArr, "AES");
        this.f11167b = C1476lN.s(RG.W(SG.b(length), new C1448kw(5, C1313iK.a(bArr))));
        this.f11166a = bArr2;
    }

    public static SJ b(C2114xE c2114xE) throws GeneralSecurityException {
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        c2114xE.getClass();
        return new SJ(((C1313iK) c2114xE.f17559d.f15314b).b(), c2114xE.f17558c.f7320b, c2114xE.f17560e.b());
    }

    @Override // com.google.android.gms.internal.ads.VD
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f11166a;
        int length2 = bArr3.length;
        int i = this.f11169d;
        int i3 = ((length - length2) - i) - 16;
        if (i3 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC2062wG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrC = c(0, bArr, length2, i);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, bArr2, 0, bArr2.length);
        byte[] bArrC3 = c(2, bArr, length2 + i, i3);
        int i6 = length - 16;
        byte b5 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            b5 = (byte) (b5 | (((bArr[i6 + i7] ^ bArrC2[i7]) ^ bArrC[i7]) ^ bArrC3[i7]));
        }
        if (b5 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f11165e.get();
        cipher.init(1, this.f11168c, new IvParameterSpec(bArrC));
        return cipher.doFinal(bArr, bArr3.length + i, i3);
    }

    public final byte[] c(int i, byte[] bArr, int i3, int i6) {
        byte[] bArr2 = new byte[i6 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i3, bArr2, 16, i6);
        return this.f11167b.j(16, bArr2);
    }
}
