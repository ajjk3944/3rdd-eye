package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.fK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150fK implements InterfaceC1199gE {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f14055a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0932bK f14056b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0932bK f14057c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14058d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14059e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f14060f;

    public /* synthetic */ C1150fK(RSAPublicKey rSAPublicKey, EnumC0932bK enumC0932bK, EnumC0932bK enumC0932bK2, int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (AbstractC2061wF.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        Cr.u(enumC0932bK);
        if (!enumC0932bK.equals(enumC0932bK2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        Cr.z(rSAPublicKey.getModulus().bitLength());
        Cr.F(rSAPublicKey.getPublicExponent());
        this.f14055a = rSAPublicKey;
        this.f14056b = enumC0932bK;
        this.f14057c = enumC0932bK2;
        this.f14058d = i;
        this.f14059e = bArr;
        this.f14060f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1199gE
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f14059e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!AbstractC2062wG.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.f14055a;
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
        byte[] bArrY = C1476lN.y(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        EnumC0932bK enumC0932bK = this.f14056b;
        Cr.u(enumC0932bK);
        YJ yj = YJ.f12629e;
        MessageDigest messageDigest = (MessageDigest) yj.f12632a.c(AbstractC0582Jp.t(enumC0932bK));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f14060f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrY.length;
        int i = this.f14058d;
        if (length < digestLength + i + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrY[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i3 = length - digestLength;
        int i6 = i3 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrY, i6);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrY, length2, length2 + digestLength);
        int i7 = 0;
        while (true) {
            long j6 = (length * 8) - iBitLength3;
            if (i7 < j6) {
                if (((bArrCopyOf[i7 / 8] >> (7 - (i7 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i7++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) yj.f12632a.c(AbstractC0582Jp.t(this.f14057c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i6];
                int i8 = 0;
                int i9 = 0;
                while (i8 <= (i3 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    int i10 = i;
                    messageDigest2.update(C1476lN.y(BigInteger.valueOf(i8), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i9, Math.min(length3, i6 - i9));
                    i9 += length3;
                    i8++;
                    i = i10;
                    messageDigest2 = messageDigest2;
                }
                int i11 = i;
                byte[] bArr5 = new byte[i6];
                for (int i12 = 0; i12 < i6; i12++) {
                    bArr5[i12] = (byte) (bArr4[i12] ^ bArrCopyOf[i12]);
                }
                for (int i13 = 0; i13 <= j6; i13++) {
                    int i14 = i13 / 8;
                    bArr5[i14] = (byte) ((~(1 << (7 - (i13 % 8)))) & bArr5[i14]);
                }
                int i15 = 0;
                while (true) {
                    int i16 = (i3 - i11) - 2;
                    if (i15 >= i16) {
                        if (bArr5[i16] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i6 - i11, i6);
                        int i17 = digestLength + 8;
                        byte[] bArr6 = new byte[i17 + i11];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i17, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i15] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i15++;
                }
            }
        }
    }
}
