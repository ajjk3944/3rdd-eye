package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sl1 implements u91 {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f16466a;

    /* renamed from: b, reason: collision with root package name */
    public final ol1 f16467b;

    /* renamed from: c, reason: collision with root package name */
    public final ol1 f16468c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16469d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f16470e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f16471f;

    public /* synthetic */ sl1(RSAPublicKey rSAPublicKey, ol1 ol1Var, ol1 ol1Var2, int i4, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (jc1.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        al0.y(ol1Var);
        if (!ol1Var.equals(ol1Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        al0.D(rSAPublicKey.getModulus().bitLength());
        al0.I(rSAPublicKey.getPublicExponent());
        this.f16466a = rSAPublicKey;
        this.f16467b = ol1Var;
        this.f16468c = ol1Var2;
        this.f16469d = i4;
        this.f16470e = bArr;
        this.f16471f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.u91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f16470e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!je1.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.f16466a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrX = yr1.x(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        ol1 ol1Var = this.f16467b;
        al0.y(ol1Var);
        ml1 ml1Var = ml1.f13941e;
        MessageDigest messageDigest = (MessageDigest) ml1Var.f13943a.g(mq0.t(ol1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f16471f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrX.length;
        int i4 = this.f16469d;
        if (length < digestLength + i4 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrX[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i10 = length - digestLength;
        int i11 = i10 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrX, i11);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrX, length2, length2 + digestLength);
        int i12 = 0;
        while (true) {
            long j = (length * 8) - iBitLength3;
            if (i12 < j) {
                if (((bArrCopyOf[i12 / 8] >> (7 - (i12 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i12++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) ml1Var.f13943a.g(mq0.t(this.f16468c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i11];
                int i13 = 0;
                int i14 = 0;
                while (i13 <= (i10 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    int i15 = i4;
                    messageDigest2.update(yr1.x(BigInteger.valueOf(i13), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i14, Math.min(length3, i11 - i14));
                    i14 += length3;
                    i13++;
                    i4 = i15;
                    messageDigest2 = messageDigest2;
                }
                int i16 = i4;
                byte[] bArr5 = new byte[i11];
                for (int i17 = 0; i17 < i11; i17++) {
                    bArr5[i17] = (byte) (bArr4[i17] ^ bArrCopyOf[i17]);
                }
                for (int i18 = 0; i18 <= j; i18++) {
                    int i19 = i18 / 8;
                    bArr5[i19] = (byte) ((~(1 << (7 - (i18 % 8)))) & bArr5[i19]);
                }
                int i20 = 0;
                while (true) {
                    int i21 = (i10 - i16) - 2;
                    if (i20 >= i21) {
                        if (bArr5[i21] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i11 - i16, i11);
                        int i22 = digestLength + 8;
                        byte[] bArr6 = new byte[i22 + i16];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i22, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i20] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i20++;
                }
            }
        }
    }
}
