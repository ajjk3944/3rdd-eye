package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* loaded from: classes.dex */
public final class IJ implements InterfaceC1144fE {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9086a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static IJ a(C1040dJ c1040dJ) throws GeneralSecurityException {
        Provider providerD = AbstractC1114el.d();
        if (providerD == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        C1448kw c1448kw = c1040dJ.f13751d;
        C1149fJ c1149fJ = c1040dJ.f13750c;
        byte[] bArrB = ((C1313iK) c1448kw.f15314b).b();
        c1149fJ.f14053e.b();
        IJ ij = new IJ();
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArrB.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", providerD).generatePrivate(new PKCS8EncodedKeySpec(AbstractC0582Jp.q(f9086a, bArrB)));
        return ij;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.IJ b(com.google.android.gms.internal.ads.C2173yJ r12) throws java.security.GeneralSecurityException {
        /*
            int r0 = com.google.android.gms.internal.ads.AbstractC2062wG.f17417a
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
            java.security.Provider r1 = com.google.android.gms.internal.ads.AbstractC1114el.d()
        L30:
            if (r1 == 0) goto La8
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r1)
            com.google.android.gms.internal.ads.zJ r1 = r12.f17704c
            com.google.android.gms.internal.ads.xJ r2 = r1.f17853c
            java.security.spec.RSAPrivateCrtKeySpec r3 = new java.security.spec.RSAPrivateCrtKeySpec
            java.math.BigInteger r4 = r1.f17854d
            java.math.BigInteger r5 = r2.f17571b
            com.google.android.gms.internal.ads.Wu r6 = r12.f17705d
            java.lang.Object r6 = r6.f12337b
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            com.google.android.gms.internal.ads.Wu r7 = r12.f17706e
            java.lang.Object r7 = r7.f12337b
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            com.google.android.gms.internal.ads.Wu r8 = r12.f17707f
            java.lang.Object r8 = r8.f12337b
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            com.google.android.gms.internal.ads.Wu r9 = r12.f17708g
            java.lang.Object r9 = r9.f12337b
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            com.google.android.gms.internal.ads.Wu r10 = r12.f17709h
            java.lang.Object r10 = r10.f12337b
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            com.google.android.gms.internal.ads.Wu r12 = r12.i
            java.lang.Object r12 = r12.f12337b
            r11 = r12
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            java.security.PrivateKey r12 = r0.generatePrivate(r3)
            java.security.interfaces.RSAPrivateCrtKey r12 = (java.security.interfaces.RSAPrivateCrtKey) r12
            com.google.android.gms.internal.ads.IJ r0 = new com.google.android.gms.internal.ads.IJ
            com.google.android.gms.internal.ads.vJ r3 = r2.f17573d
            com.google.android.gms.internal.ads.vJ r4 = r2.f17574e
            int r2 = r2.f17575f
            com.google.android.gms.internal.ads.iK r1 = r1.f17855e
            r1.b()
            r0.<init>()
            r1 = 2
            boolean r1 = com.google.android.gms.internal.ads.Cr.m(r1)
            if (r1 == 0) goto La0
            java.math.BigInteger r1 = r12.getModulus()
            int r1 = r1.bitLength()
            com.google.android.gms.internal.ads.Cr.z(r1)
            java.math.BigInteger r12 = r12.getPublicExponent()
            com.google.android.gms.internal.ads.Cr.F(r12)
            com.google.android.gms.internal.ads.QJ.b(r3)
            com.google.android.gms.internal.ads.QJ.c(r3, r4, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.IJ.b(com.google.android.gms.internal.ads.yJ):com.google.android.gms.internal.ads.IJ");
    }
}
