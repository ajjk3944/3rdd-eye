package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b34 implements or3 {
    public static final byte[] f = new byte[0];
    public static final byte[] g = {0};
    public final RSAPublicKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final Provider e;

    public b34(RSAPublicKey rSAPublicKey, a24 a24Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!yb.x(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        bd2.M(rSAPublicKey.getModulus().bitLength());
        bd2.P(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = a(a24Var);
        this.c = bArr;
        this.d = bArr2;
        this.e = provider;
    }

    public static String a(a24 a24Var) throws GeneralSecurityException {
        if (a24Var == a24.b) {
            return "SHA256withRSA";
        }
        if (a24Var == a24.c) {
            return "SHA384withRSA";
        }
        if (a24Var == a24.d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static b34 c(e24 e24Var, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = e24Var.k;
        c24 c24Var = e24Var.j;
        return new b34((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c24Var.b)), c24Var.d, e24Var.l.b(), c24Var.c.equals(b24.d) ? g : f, provider);
    }

    @Override // defpackage.or3
    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.c;
        if (!ow3.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.b, this.e);
        signature.initVerify(this.a);
        signature.update(bArr2);
        byte[] bArr4 = this.d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
