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

/* loaded from: classes.dex */
public final class JJ implements InterfaceC1199gE {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9271f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9272a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9273b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9274c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicKey f9275d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f9276e;

    public /* synthetic */ JJ(RSAPublicKey rSAPublicKey, EnumC0932bK enumC0932bK, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (AbstractC2061wF.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        Cr.u(enumC0932bK);
        Cr.z(rSAPublicKey.getModulus().bitLength());
        Cr.F(rSAPublicKey.getPublicExponent());
        this.f9275d = rSAPublicKey;
        this.f9276e = enumC0932bK;
        this.f9273b = bArr;
        this.f9274c = bArr2;
    }

    public static JJ b(C1149fJ c1149fJ) throws GeneralSecurityException {
        Provider providerD = AbstractC1114el.d();
        if (providerD == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (Cr.m(1)) {
            return new JJ(c1149fJ.f14052d.b(), c1149fJ.f14053e.b(), c1149fJ.f14051c.f13548a.equals(C0931bJ.f13341d) ? new byte[]{0} : new byte[0], providerD);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1199gE
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f9272a) {
            case 0:
                byte[] bArr3 = this.f9273b;
                int length = bArr3.length;
                if (bArr.length != length + 64) {
                    throw new GeneralSecurityException("Invalid signature length: 64");
                }
                if (!AbstractC2062wG.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                Signature signature = Signature.getInstance("Ed25519", (Provider) this.f9276e);
                signature.initVerify(this.f9275d);
                signature.update(bArr2);
                signature.update(this.f9274c);
                try {
                    if (signature.verify(bArr, length, 64)) {
                        return;
                    }
                } catch (RuntimeException unused) {
                }
                throw new GeneralSecurityException("Signature check failed.");
            default:
                byte[] bArr4 = this.f9273b;
                int length2 = bArr4.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!AbstractC2062wG.c(bArr4, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrO;
        int i;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f9275d;
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
        byte[] bArrY = C1476lN.y(bigInteger.modPow(publicExponent, modulus), iBitLength);
        EnumC0932bK enumC0932bK = (EnumC0932bK) this.f9276e;
        Cr.u(enumC0932bK);
        MessageDigest messageDigest = (MessageDigest) YJ.f12629e.f12632a.c(AbstractC0582Jp.t(enumC0932bK));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f9274c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = enumC0932bK.ordinal();
        int i3 = 2;
        if (iOrdinal == 2) {
            bArrO = AbstractC1984ut.o("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrO = AbstractC1984ut.o("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(enumC0932bK.toString()));
            }
            bArrO = AbstractC1984ut.o("3051300d060960864801650304020305000440");
        }
        if (iBitLength < bArrO.length + bArrDigest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i6 = 0;
        while (true) {
            i = i3 + 1;
            if (i6 >= (iBitLength - r5) - 3) {
                break;
            }
            bArr4[i3] = -1;
            i6++;
            i3 = i;
        }
        bArr4[i3] = 0;
        int length = bArrO.length;
        System.arraycopy(bArrO, 0, bArr4, i, length);
        System.arraycopy(bArrDigest, 0, bArr4, i + length, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrY, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    public JJ(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (Cr.m(1)) {
            if (bArr.length == 32) {
                this.f9275d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(AbstractC0582Jp.q(f9271f, bArr)));
                this.f9273b = bArr2;
                this.f9274c = bArr3;
                this.f9276e = provider;
                return;
            }
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
