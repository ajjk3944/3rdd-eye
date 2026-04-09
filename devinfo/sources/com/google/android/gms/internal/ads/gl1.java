package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gl1 implements j91 {

    /* renamed from: e, reason: collision with root package name */
    public static final wa f11547e = new wa(6);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11548a;

    /* renamed from: b, reason: collision with root package name */
    public final hf1 f11549b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f11550c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11551d;

    public gl1(byte[] bArr, int i4, byte[] bArr2) throws GeneralSecurityException {
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i4 != 12 && i4 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f11551d = i4;
        int length = bArr.length;
        al0.m(length);
        this.f11550c = new SecretKeySpec(bArr, "AES");
        this.f11549b = yr1.r(ff1.Z(gf1.b(length), new kh0(16, vl1.a(bArr))));
        this.f11548a = bArr2;
    }

    public static gl1 b(ma1 ma1Var) throws GeneralSecurityException {
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        ma1Var.getClass();
        return new gl1(((vl1) ma1Var.f13834d.f13160b).b(), ma1Var.f13833c.f14952b, ma1Var.f13835e.b());
    }

    @Override // com.google.android.gms.internal.ads.j91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f11548a;
        int length2 = bArr3.length;
        int i4 = this.f11551d;
        int i10 = ((length - length2) - i4) - 16;
        if (i10 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!je1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrC = c(0, bArr, length2, i4);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, bArr2, 0, bArr2.length);
        byte[] bArrC3 = c(2, bArr, length2 + i4, i10);
        int i11 = length - 16;
        byte b10 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            b10 = (byte) (b10 | (((bArr[i11 + i12] ^ bArrC2[i12]) ^ bArrC[i12]) ^ bArrC3[i12]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f11547e.get();
        cipher.init(1, this.f11550c, new IvParameterSpec(bArrC));
        return cipher.doFinal(bArr, bArr3.length + i4, i10);
    }

    public final byte[] c(int i4, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 16];
        bArr2[15] = (byte) i4;
        System.arraycopy(bArr, i10, bArr2, 16, i11);
        return this.f11549b.g(16, bArr2);
    }
}
