package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tb1 implements j91 {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f16774d = yo0.o("7a806c");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f16775e = yo0.o("46bb91c3c5");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f16776f = yo0.o("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] g = yo0.o("bae8e37fc83441b16034566b");

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f16777h = yo0.o("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: a, reason: collision with root package name */
    public final ub1 f16778a;

    /* renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f16779b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f16780c;

    public tb1(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        ub1 ub1Var = ub1.f17161r;
        this.f16780c = bArr2;
        al0.m(bArr.length);
        this.f16779b = new SecretKeySpec(bArr, "AES");
        this.f16778a = ub1Var;
    }

    public static boolean b(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = g;
            cipher.init(2, new SecretKeySpec(f16776f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f16775e);
            byte[] bArr2 = f16777h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f16774d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.j91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f16780c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!je1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.f16778a.getClass();
        try {
            Cipher cipher = (Cipher) hc1.f11838a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.f16779b, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e2);
        }
    }
}
