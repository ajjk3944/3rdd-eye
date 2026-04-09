package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vk1 implements t91 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f17641a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static vk1 a(rj1 rj1Var) throws GeneralSecurityException {
        Provider providerC = a80.c();
        if (providerC == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        kh0 kh0Var = rj1Var.f15668d;
        tj1 tj1Var = rj1Var.f15667c;
        byte[] bArrB = ((vl1) kh0Var.f13160b).b();
        tj1Var.f16832e.b();
        vk1 vk1Var = new vk1();
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArrB.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", providerC).generatePrivate(new PKCS8EncodedKeySpec(mq0.q(f17641a, bArrB)));
        return vk1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.vk1 b(com.google.android.gms.internal.ads.lk1 r12) throws java.security.GeneralSecurityException {
        /*
            int r0 = com.google.android.gms.internal.ads.je1.f12739a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = j$.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2c
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = j$.util.Objects.equals(r0, r2)
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
            java.security.Provider r1 = com.google.android.gms.internal.ads.a80.c()
        L30:
            if (r1 == 0) goto La8
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r1)
            com.google.android.gms.internal.ads.mk1 r1 = r12.f13513c
            com.google.android.gms.internal.ads.kk1 r2 = r1.f13926c
            java.security.spec.RSAPrivateCrtKeySpec r3 = new java.security.spec.RSAPrivateCrtKeySpec
            java.math.BigInteger r4 = r1.f13927d
            java.math.BigInteger r5 = r2.f13184b
            com.google.android.gms.internal.ads.ne0 r6 = r12.f13514d
            java.lang.Object r6 = r6.f14280b
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            com.google.android.gms.internal.ads.ne0 r7 = r12.f13515e
            java.lang.Object r7 = r7.f14280b
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            com.google.android.gms.internal.ads.ne0 r8 = r12.f13516f
            java.lang.Object r8 = r8.f14280b
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            com.google.android.gms.internal.ads.ne0 r9 = r12.g
            java.lang.Object r9 = r9.f14280b
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            com.google.android.gms.internal.ads.ne0 r10 = r12.f13517h
            java.lang.Object r10 = r10.f14280b
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            com.google.android.gms.internal.ads.ne0 r12 = r12.f13518i
            java.lang.Object r12 = r12.f14280b
            r11 = r12
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            java.security.PrivateKey r12 = r0.generatePrivate(r3)
            java.security.interfaces.RSAPrivateCrtKey r12 = (java.security.interfaces.RSAPrivateCrtKey) r12
            com.google.android.gms.internal.ads.vk1 r0 = new com.google.android.gms.internal.ads.vk1
            com.google.android.gms.internal.ads.ik1 r3 = r2.f13186d
            com.google.android.gms.internal.ads.ik1 r4 = r2.f13187e
            int r2 = r2.f13188f
            com.google.android.gms.internal.ads.vl1 r1 = r1.f13928e
            r1.b()
            r0.<init>()
            r1 = 2
            boolean r1 = com.google.android.gms.internal.ads.al0.q(r1)
            if (r1 == 0) goto La0
            java.math.BigInteger r1 = r12.getModulus()
            int r1 = r1.bitLength()
            com.google.android.gms.internal.ads.al0.D(r1)
            java.math.BigInteger r12 = r12.getPublicExponent()
            com.google.android.gms.internal.ads.al0.I(r12)
            com.google.android.gms.internal.ads.el1.b(r3)
            com.google.android.gms.internal.ads.el1.c(r3, r4, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vk1.b(com.google.android.gms.internal.ads.lk1):com.google.android.gms.internal.ads.vk1");
    }
}
