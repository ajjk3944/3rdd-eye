package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.gF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1200gF implements VD {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f14237d = AbstractC1984ut.o("7a806c");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f14238e = AbstractC1984ut.o("46bb91c3c5");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f14239f = AbstractC1984ut.o("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f14240g = AbstractC1984ut.o("bae8e37fc83441b16034566b");

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f14241h = AbstractC1984ut.o("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: a, reason: collision with root package name */
    public final C1414kF f14242a;

    /* renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f14243b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14244c;

    public C1200gF(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        C1414kF c1414kF = C1414kF.f15100k;
        this.f14244c = bArr2;
        Cr.i(bArr.length);
        this.f14243b = new SecretKeySpec(bArr, "AES");
        this.f14242a = c1414kF;
    }

    public static boolean b(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = f14240g;
            cipher.init(2, new SecretKeySpec(f14239f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f14238e);
            byte[] bArr2 = f14241h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f14237d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.VD
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f14244c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC2062wG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.f14242a.getClass();
        try {
            Cipher cipher = (Cipher) AbstractC1953uF.f17094a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.f14243b, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e6) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e6);
        }
    }
}
