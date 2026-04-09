package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v24 implements nr3 {
    public static final byte[] a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static v24 a(r14 r14Var) throws GeneralSecurityException {
        Provider providerT = ob1.t();
        if (providerT == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        yf3 yf3Var = r14Var.k;
        t14 t14Var = r14Var.j;
        byte[] bArrB = ((v34) yf3Var.f).b();
        t14Var.l.b();
        v24 v24Var = new v24();
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArrB.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", providerT).generatePrivate(new PKCS8EncodedKeySpec(i41.L(a, bArrB)));
        return v24Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.v24 b(defpackage.k24 r12) throws java.security.GeneralSecurityException {
        /*
            int r0 = defpackage.ow3.a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2c
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
            if (r0 > r2) goto L2c
            goto L30
        L2c:
            java.security.Provider r1 = defpackage.ob1.t()
        L30:
            if (r1 == 0) goto La8
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r1)
            l24 r1 = r12.j
            j24 r2 = r1.j
            java.security.spec.RSAPrivateCrtKeySpec r3 = new java.security.spec.RSAPrivateCrtKeySpec
            java.math.BigInteger r4 = r1.k
            java.math.BigInteger r5 = r2.b
            x34 r6 = r12.k
            java.lang.Object r6 = r6.f
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            x34 r7 = r12.l
            java.lang.Object r7 = r7.f
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            x34 r8 = r12.m
            java.lang.Object r8 = r8.f
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            x34 r9 = r12.n
            java.lang.Object r9 = r9.f
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            x34 r10 = r12.o
            java.lang.Object r10 = r10.f
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            x34 r12 = r12.p
            java.lang.Object r12 = r12.f
            r11 = r12
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            java.security.PrivateKey r12 = r0.generatePrivate(r3)
            java.security.interfaces.RSAPrivateCrtKey r12 = (java.security.interfaces.RSAPrivateCrtKey) r12
            v24 r0 = new v24
            h24 r3 = r2.d
            h24 r4 = r2.e
            int r2 = r2.f
            v34 r1 = r1.l
            r1.b()
            r0.<init>()
            r1 = 2
            boolean r1 = defpackage.yb.x(r1)
            if (r1 == 0) goto La0
            java.math.BigInteger r1 = r12.getModulus()
            int r1 = r1.bitLength()
            defpackage.bd2.M(r1)
            java.math.BigInteger r12 = r12.getPublicExponent()
            defpackage.bd2.P(r12)
            defpackage.d34.a(r3)
            defpackage.d34.c(r3, r4, r2)
            return r0
        La0:
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available."
            r12.<init>(r0)
            throw r12
        La8:
            java.security.NoSuchProviderException r12 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v24.b(k24):v24");
    }
}
