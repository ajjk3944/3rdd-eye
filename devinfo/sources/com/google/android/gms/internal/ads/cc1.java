package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cc1 implements j91 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10080a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10081b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10082c;

    public cc1(j91 j91Var, byte[] bArr) {
        this.f10080a = 0;
        this.f10082c = j91Var;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f10081b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.j91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i4 = this.f10080a;
        Object obj = this.f10082c;
        byte[] bArr3 = this.f10081b;
        switch (i4) {
            case 0:
                j91 j91Var = (j91) obj;
                if (bArr3.length == 0) {
                    return j91Var.a(bArr, bArr2);
                }
                if (je1.c(bArr3, bArr)) {
                    return j91Var.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 1:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                int length = bArr.length;
                int length2 = bArr3.length;
                if (length < length2 + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!je1.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                wa waVar = rb1.f15613a;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
                Cipher cipher = (Cipher) rb1.f15613a.get();
                cipher.init(2, (SecretKeySpec) obj, gCMParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
            case 2:
                int length3 = bArr3.length;
                if (length3 == 0) {
                    return b(bArr, bArr2);
                }
                if (je1.c(bArr3, bArr)) {
                    return b(Arrays.copyOfRange(bArr, length3, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            default:
                int length4 = bArr3.length;
                if (length4 == 0) {
                    return c(bArr, bArr2);
                }
                if (je1.c(bArr3, bArr)) {
                    return c(Arrays.copyOfRange(bArr, length4, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((bc1) this.f10082c).u(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((bc1) this.f10082c).u(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public cc1(byte[] bArr, int i4, byte[] bArr2) {
        this.f10080a = i4;
        switch (i4) {
            case 3:
                this.f10082c = new bc1(bArr, 1);
                this.f10081b = bArr2;
                break;
            default:
                this.f10082c = new bc1(bArr, 0);
                this.f10081b = bArr2;
                break;
        }
    }

    public cc1(byte[] bArr, vl1 vl1Var) throws GeneralSecurityException {
        this.f10080a = 1;
        if (al0.q(2)) {
            wa waVar = rb1.f15613a;
            al0.m(bArr.length);
            this.f10082c = new SecretKeySpec(bArr, "AES");
            this.f10081b = vl1Var.b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
