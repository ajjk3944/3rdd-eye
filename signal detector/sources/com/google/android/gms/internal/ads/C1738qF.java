package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.qF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1738qF implements VD {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16336b;

    /* renamed from: c, reason: collision with root package name */
    public final TG f16337c;

    public C1738qF(byte[] bArr, C1313iK c1313iK, int i) {
        this.f16337c = C1476lN.s(RG.W(SG.b(bArr.length), new C1448kw(5, C1313iK.a(bArr))));
        this.f16335a = c1313iK.b();
        this.f16336b = i;
    }

    @Override // com.google.android.gms.internal.ads.VD
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f16335a;
        int length2 = bArr3.length;
        int i = this.f16336b + length2;
        int i3 = i + 28;
        if (length < i3) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC2062wG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        TG tg = this.f16337c;
        System.arraycopy(tg.j(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(tg.j(16, bArr5), 0, bArr6, 16, 16);
        if (!Cr.m(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        T2.i iVar = AbstractC1090eF.f13882a;
        Cr.i(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i6 = i + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i, i6);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i3) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOfRange2, 0, 12);
        Cipher cipher = (Cipher) AbstractC1090eF.f13882a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i6, length - i6);
    }
}
