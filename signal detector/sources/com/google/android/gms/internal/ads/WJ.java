package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class WJ implements VD {

    /* renamed from: a, reason: collision with root package name */
    public final RJ f12201a;

    /* renamed from: b, reason: collision with root package name */
    public final C1041dK f12202b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12203c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12204d;

    public WJ(RJ rj, C1041dK c1041dK, int i, byte[] bArr) {
        this.f12201a = rj;
        this.f12202b = c1041dK;
        this.f12203c = i;
        this.f12204d = bArr;
    }

    public static WJ b(C1737qE c1737qE) {
        byte[] bArrB = ((C1313iK) c1737qE.f16331d.f15314b).b();
        C2060wE c2060wE = c1737qE.f16330c;
        RJ rj = new RJ(bArrB, c2060wE.f17411c);
        String strValueOf = String.valueOf(c2060wE.f17414f);
        C1728q5 c1728q5 = new C1728q5("HMAC".concat(strValueOf), new SecretKeySpec(((C1313iK) c1737qE.f16332e.f15314b).b(), "HMAC"));
        int i = c2060wE.f17412d;
        return new WJ(rj, new C1041dK(c1728q5, i), i, c1737qE.f16333f.b());
    }

    @Override // com.google.android.gms.internal.ads.VD
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f12204d;
        int length2 = bArr3.length;
        int i = this.f12203c;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!AbstractC2062wG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i3 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i3);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i3, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrQ = AbstractC0582Jp.q(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        C1041dK c1041dK = this.f12202b;
        int i6 = c1041dK.f13754b;
        TG tg = c1041dK.f13753a;
        byte[] bArr4 = c1041dK.f13755c;
        byte[] bArr5 = c1041dK.f13756d;
        if (!MessageDigest.isEqual(bArr5.length > 0 ? AbstractC0582Jp.q(bArr4, tg.j(i6, AbstractC0582Jp.q(bArrQ, bArr5))) : AbstractC0582Jp.q(bArr4, tg.j(i6, bArrQ)), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        RJ rj = this.f12201a;
        int i7 = rj.f10890b;
        if (length3 < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i7];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i7);
        int i8 = length3 - i7;
        byte[] bArr7 = new byte[i8];
        Cipher cipher = (Cipher) RJ.f10888d.get();
        byte[] bArr8 = new byte[rj.f10891c];
        System.arraycopy(bArr6, 0, bArr8, 0, i7);
        cipher.init(2, rj.f10889a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i7, i8, bArr7, 0) == i8) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
