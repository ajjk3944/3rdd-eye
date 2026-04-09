package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.pF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1684pF implements VD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16151a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16152b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16153c;

    public C1684pF(VD vd, byte[] bArr) {
        this.f16151a = 0;
        this.f16153c = vd;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f16152b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.VD
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.f16151a;
        Object obj = this.f16153c;
        byte[] bArr3 = this.f16152b;
        switch (i) {
            case 0:
                VD vd = (VD) obj;
                if (bArr3.length == 0) {
                    return vd.a(bArr, bArr2);
                }
                if (AbstractC2062wG.c(bArr3, bArr)) {
                    return vd.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
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
                if (!AbstractC2062wG.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                T2.i iVar = AbstractC1090eF.f13882a;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
                Cipher cipher = (Cipher) AbstractC1090eF.f13882a.get();
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
                if (AbstractC2062wG.c(bArr3, bArr)) {
                    return b(Arrays.copyOfRange(bArr, length3, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            default:
                int length4 = bArr3.length;
                if (length4 == 0) {
                    return c(bArr, bArr2);
                }
                if (AbstractC2062wG.c(bArr3, bArr)) {
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
        return ((C1630oF) this.f16153c).z(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((C1630oF) this.f16153c).z(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public C1684pF(byte[] bArr, int i, byte[] bArr2) {
        this.f16151a = i;
        switch (i) {
            case 3:
                this.f16153c = new C1630oF(bArr, 1);
                this.f16152b = bArr2;
                break;
            default:
                this.f16153c = new C1630oF(bArr, 0);
                this.f16152b = bArr2;
                break;
        }
    }

    public C1684pF(byte[] bArr, C1313iK c1313iK) throws GeneralSecurityException {
        this.f16151a = 1;
        if (Cr.m(2)) {
            T2.i iVar = AbstractC1090eF.f13882a;
            Cr.i(bArr.length);
            this.f16153c = new SecretKeySpec(bArr, "AES");
            this.f16152b = c1313iK.b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
