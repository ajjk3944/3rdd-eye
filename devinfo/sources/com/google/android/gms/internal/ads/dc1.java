package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dc1 implements j91 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10433b;

    /* renamed from: c, reason: collision with root package name */
    public final hf1 f10434c;

    public dc1(byte[] bArr, vl1 vl1Var, int i4) {
        this.f10434c = yr1.r(ff1.Z(gf1.b(bArr.length), new kh0(16, vl1.a(bArr))));
        this.f10432a = vl1Var.b();
        this.f10433b = i4;
    }

    @Override // com.google.android.gms.internal.ads.j91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f10432a;
        int length2 = bArr3.length;
        int i4 = this.f10433b + length2;
        int i10 = i4 + 28;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!je1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i4);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        hf1 hf1Var = this.f10434c;
        System.arraycopy(hf1Var.g(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(hf1Var.g(16, bArr5), 0, bArr6, 16, 16);
        if (!al0.q(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        wa waVar = rb1.f15613a;
        al0.m(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i11 = i4 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i4, i11);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOfRange2, 0, 12);
        Cipher cipher = (Cipher) rb1.f15613a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i11, length - i11);
    }
}
