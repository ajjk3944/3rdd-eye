package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w24 implements or3 {
    public static final byte[] f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    public final /* synthetic */ int a = 1;
    public final byte[] b;
    public final byte[] c;
    public final PublicKey d;
    public final Serializable e;

    public /* synthetic */ w24(RSAPublicKey rSAPublicKey, p34 p34Var, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (mu3.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        bd2.L(p34Var);
        bd2.M(rSAPublicKey.getModulus().bitLength());
        bd2.P(rSAPublicKey.getPublicExponent());
        this.d = rSAPublicKey;
        this.e = p34Var;
        this.b = bArr;
        this.c = bArr2;
    }

    public static w24 a(t14 t14Var) throws GeneralSecurityException {
        Provider providerT = ob1.t();
        if (providerT == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (yb.x(1)) {
            return new w24(t14Var.k.b(), t14Var.l.b(), t14Var.j.a.equals(p14.d) ? new byte[]{0} : new byte[0], providerT);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // defpackage.or3
    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.a) {
            case 0:
                byte[] bArr3 = this.b;
                int length = bArr3.length;
                if (bArr.length != length + 64) {
                    throw new GeneralSecurityException("Invalid signature length: 64");
                }
                if (!ow3.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                Signature signature = Signature.getInstance("Ed25519", (Provider) this.e);
                signature.initVerify(this.d);
                signature.update(bArr2);
                signature.update(this.c);
                try {
                    if (signature.verify(bArr, length, 64)) {
                        return;
                    }
                } catch (RuntimeException unused) {
                }
                throw new GeneralSecurityException("Signature check failed.");
            default:
                byte[] bArr4 = this.b;
                int length2 = bArr4.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!ow3.c(bArr4, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrK;
        int i;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.d;
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
        byte[] bArrV = a30.v(bigInteger.modPow(publicExponent, modulus), iBitLength);
        p34 p34Var = (p34) this.e;
        bd2.L(p34Var);
        MessageDigest messageDigest = (MessageDigest) m34.e.a.l(g82.A(p34Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = p34Var.ordinal();
        int i2 = 2;
        if (iOrdinal == 2) {
            bArrK = ou1.K("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrK = ou1.K("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(p34Var.toString()));
            }
            bArrK = ou1.K("3051300d060960864801650304020305000440");
        }
        if (iBitLength < bArrK.length + bArrDigest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i3 = 0;
        while (true) {
            i = i2 + 1;
            if (i3 >= (iBitLength - r5) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i3++;
            i2 = i;
        }
        bArr4[i2] = 0;
        int length = bArrK.length;
        System.arraycopy(bArrK, 0, bArr4, i, length);
        System.arraycopy(bArrDigest, 0, bArr4, i + length, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrV, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    public w24(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (yb.x(1)) {
            if (bArr.length == 32) {
                this.d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(i41.L(f, bArr)));
                this.b = bArr2;
                this.c = bArr3;
                this.e = provider;
                return;
            }
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
