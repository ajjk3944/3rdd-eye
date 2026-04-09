package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kl1 implements j91 {

    /* renamed from: a, reason: collision with root package name */
    public final fl1 f13193a;

    /* renamed from: b, reason: collision with root package name */
    public final ql1 f13194b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13195c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f13196d;

    public kl1(fl1 fl1Var, ql1 ql1Var, int i4, byte[] bArr) {
        this.f13193a = fl1Var;
        this.f13194b = ql1Var;
        this.f13195c = i4;
        this.f13196d = bArr;
    }

    public static kl1 b(fa1 fa1Var) {
        byte[] bArrB = ((vl1) fa1Var.f11083d.f13160b).b();
        la1 la1Var = fa1Var.f11082c;
        fl1 fl1Var = new fl1(bArrB, la1Var.f13436c);
        String strValueOf = String.valueOf(la1Var.f13439f);
        wb wbVar = new wb("HMAC".concat(strValueOf), new SecretKeySpec(((vl1) fa1Var.f11084e.f13160b).b(), "HMAC"));
        int i4 = la1Var.f13437d;
        return new kl1(fl1Var, new ql1(wbVar, i4), i4, fa1Var.f11085f.b());
    }

    @Override // com.google.android.gms.internal.ads.j91
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f13196d;
        int length2 = bArr3.length;
        int i4 = this.f13195c;
        if (length < i4 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!je1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i10 = length - i4;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i10, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrQ = mq0.q(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        ql1 ql1Var = this.f13194b;
        int i11 = ql1Var.f15362b;
        hf1 hf1Var = ql1Var.f15361a;
        byte[] bArr4 = ql1Var.f15363c;
        byte[] bArr5 = ql1Var.f15364d;
        if (!MessageDigest.isEqual(bArr5.length > 0 ? mq0.q(bArr4, hf1Var.g(i11, mq0.q(bArrQ, bArr5))) : mq0.q(bArr4, hf1Var.g(i11, bArrQ)), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        fl1 fl1Var = this.f13193a;
        int i12 = fl1Var.f11206b;
        if (length3 < i12) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i12];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i12);
        int i13 = length3 - i12;
        byte[] bArr7 = new byte[i13];
        Cipher cipher = (Cipher) fl1.f11204d.get();
        byte[] bArr8 = new byte[fl1Var.f11207c];
        System.arraycopy(bArr6, 0, bArr8, 0, i12);
        cipher.init(2, fl1Var.f11205a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i12, i13, bArr7, 0) == i13) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
