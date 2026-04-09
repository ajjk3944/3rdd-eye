package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d34 implements or3 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public final RSAPublicKey a;
    public final String b;
    public final PSSParameterSpec c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    public d34(RSAPublicKey rSAPublicKey, h24 h24Var, h24 h24Var2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!yb.x(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!h24Var.equals(h24Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        bd2.M(rSAPublicKey.getModulus().bitLength());
        bd2.P(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = a(h24Var);
        this.c = c(h24Var, h24Var2, i);
        this.d = bArr;
        this.e = bArr2;
        this.f = provider;
    }

    public static String a(h24 h24Var) {
        if (h24Var == h24.b) {
            return "SHA256withRSA/PSS";
        }
        if (h24Var == h24.c) {
            return "SHA384withRSA/PSS";
        }
        if (h24Var == h24.d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(h24Var)));
    }

    public static PSSParameterSpec c(h24 h24Var, h24 h24Var2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        h24 h24Var3 = h24.d;
        h24 h24Var4 = h24.c;
        h24 h24Var5 = h24.b;
        if (h24Var == h24Var5) {
            str = "SHA-256";
        } else if (h24Var == h24Var4) {
            str = "SHA-384";
        } else {
            if (h24Var != h24Var3) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(h24Var)));
            }
            str = "SHA-512";
        }
        if (h24Var2 == h24Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (h24Var2 == h24Var4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (h24Var2 != h24Var3) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(h24Var2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.d34 d(defpackage.l24 r10) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        /*
            int r0 = defpackage.ow3.a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2d
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.util.Objects.equals(r0, r2)
            r1 = 0
            if (r0 != 0) goto L1d
            r0 = r1
            goto L23
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            int r0 = r0.intValue()
            r2 = 23
            if (r0 > r2) goto L2d
        L2b:
            r9 = r1
            goto L32
        L2d:
            java.security.Provider r1 = defpackage.ob1.t()
            goto L2b
        L32:
            if (r9 == 0) goto L6f
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r9)
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r10.k
            j24 r3 = r10.j
            java.math.BigInteger r4 = r3.b
            r1.<init>(r2, r4)
            java.security.PublicKey r0 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            d34 r2 = new d34
            h24 r4 = r3.d
            h24 r5 = r3.e
            int r6 = r3.f
            v34 r10 = r10.l
            byte[] r7 = r10.b()
            i24 r10 = r3.c
            i24 r1 = defpackage.i24.d
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L68
            byte[] r10 = defpackage.d34.h
        L65:
            r8 = r10
            r3 = r0
            goto L6b
        L68:
            byte[] r10 = defpackage.d34.g
            goto L65
        L6b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L6f:
            java.security.NoSuchProviderException r10 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d34.d(l24):d34");
    }

    @Override // defpackage.or3
    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        if (!ow3.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.b, this.f);
        signature.initVerify(this.a);
        signature.setParameter(this.c);
        signature.update(bArr2);
        byte[] bArr4 = this.e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
