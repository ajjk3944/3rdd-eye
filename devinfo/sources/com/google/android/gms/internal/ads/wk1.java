package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wk1 implements u91 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f18046f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18047a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18048b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f18049c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicKey f18050d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f18051e;

    public /* synthetic */ wk1(RSAPublicKey rSAPublicKey, ol1 ol1Var, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (jc1.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        al0.y(ol1Var);
        al0.D(rSAPublicKey.getModulus().bitLength());
        al0.I(rSAPublicKey.getPublicExponent());
        this.f18050d = rSAPublicKey;
        this.f18051e = ol1Var;
        this.f18048b = bArr;
        this.f18049c = bArr2;
    }

    public static wk1 b(tj1 tj1Var) throws GeneralSecurityException {
        Provider providerC = a80.c();
        if (providerC == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (al0.q(1)) {
            return new wk1(tj1Var.f16831d.b(), tj1Var.f16832e.b(), tj1Var.f16830c.f15352a.equals(pj1.f15021d) ? new byte[]{0} : new byte[0], providerC);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.u91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f18047a) {
            case 0:
                byte[] bArr3 = this.f18048b;
                int length = bArr3.length;
                if (bArr.length != length + 64) {
                    throw new GeneralSecurityException("Invalid signature length: 64");
                }
                if (!je1.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                Signature signature = Signature.getInstance("Ed25519", (Provider) this.f18051e);
                signature.initVerify(this.f18050d);
                signature.update(bArr2);
                signature.update(this.f18049c);
                try {
                    if (signature.verify(bArr, length, 64)) {
                        return;
                    }
                } catch (RuntimeException unused) {
                }
                throw new GeneralSecurityException("Signature check failed.");
            default:
                byte[] bArr4 = this.f18048b;
                int length2 = bArr4.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!je1.c(bArr4, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrO;
        int i4;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f18050d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrX = yr1.x(bigInteger.modPow(publicExponent, modulus), iBitLength);
        ol1 ol1Var = (ol1) this.f18051e;
        al0.y(ol1Var);
        MessageDigest messageDigest = (MessageDigest) ml1.f13941e.f13943a.g(mq0.t(ol1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f18049c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = ol1Var.ordinal();
        int i10 = 2;
        if (iOrdinal == 2) {
            bArrO = yo0.o("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrO = yo0.o("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(ol1Var.toString()));
            }
            bArrO = yo0.o("3051300d060960864801650304020305000440");
        }
        if (iBitLength < bArrO.length + bArrDigest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i11 = 0;
        while (true) {
            i4 = i10 + 1;
            if (i11 >= (iBitLength - r5) - 3) {
                break;
            }
            bArr4[i10] = -1;
            i11++;
            i10 = i4;
        }
        bArr4[i10] = 0;
        int length = bArrO.length;
        System.arraycopy(bArrO, 0, bArr4, i4, length);
        System.arraycopy(bArrDigest, 0, bArr4, i4 + length, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrX, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    public wk1(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (al0.q(1)) {
            if (bArr.length == 32) {
                this.f18050d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(mq0.q(f18046f, bArr)));
                this.f18048b = bArr2;
                this.f18049c = bArr3;
                this.f18051e = provider;
                return;
            }
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
