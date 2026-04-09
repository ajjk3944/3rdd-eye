package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* loaded from: classes.dex */
public final class QJ implements InterfaceC1199gE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f10601g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f10602h = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f10603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10604b;

    /* renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f10605c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10606d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10607e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f10608f;

    public QJ(RSAPublicKey rSAPublicKey, C2011vJ c2011vJ, C2011vJ c2011vJ2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!Cr.m(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!c2011vJ.equals(c2011vJ2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        Cr.z(rSAPublicKey.getModulus().bitLength());
        Cr.F(rSAPublicKey.getPublicExponent());
        this.f10603a = rSAPublicKey;
        this.f10604b = b(c2011vJ);
        this.f10605c = c(c2011vJ, c2011vJ2, i);
        this.f10606d = bArr;
        this.f10607e = bArr2;
        this.f10608f = provider;
    }

    public static String b(C2011vJ c2011vJ) {
        if (c2011vJ == C2011vJ.f17253b) {
            return "SHA256withRSA/PSS";
        }
        if (c2011vJ == C2011vJ.f17254c) {
            return "SHA384withRSA/PSS";
        }
        if (c2011vJ == C2011vJ.f17255d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(c2011vJ)));
    }

    public static PSSParameterSpec c(C2011vJ c2011vJ, C2011vJ c2011vJ2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        C2011vJ c2011vJ3 = C2011vJ.f17255d;
        C2011vJ c2011vJ4 = C2011vJ.f17254c;
        C2011vJ c2011vJ5 = C2011vJ.f17253b;
        if (c2011vJ == c2011vJ5) {
            str = "SHA-256";
        } else if (c2011vJ == c2011vJ4) {
            str = "SHA-384";
        } else {
            if (c2011vJ != c2011vJ3) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(c2011vJ)));
            }
            str = "SHA-512";
        }
        if (c2011vJ2 == c2011vJ5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (c2011vJ2 == c2011vJ4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (c2011vJ2 != c2011vJ3) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(c2011vJ2)));
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
    public static com.google.android.gms.internal.ads.QJ d(com.google.android.gms.internal.ads.C2227zJ r10) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        /*
            int r0 = com.google.android.gms.internal.ads.AbstractC2062wG.f17417a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = j$.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2d
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
            if (r0 > r2) goto L2d
        L2b:
            r9 = r1
            goto L32
        L2d:
            java.security.Provider r1 = com.google.android.gms.internal.ads.AbstractC1114el.d()
            goto L2b
        L32:
            if (r9 == 0) goto L6f
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r9)
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r10.f17854d
            com.google.android.gms.internal.ads.xJ r3 = r10.f17853c
            java.math.BigInteger r4 = r3.f17571b
            r1.<init>(r2, r4)
            java.security.PublicKey r0 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            com.google.android.gms.internal.ads.QJ r2 = new com.google.android.gms.internal.ads.QJ
            com.google.android.gms.internal.ads.vJ r4 = r3.f17573d
            com.google.android.gms.internal.ads.vJ r5 = r3.f17574e
            int r6 = r3.f17575f
            com.google.android.gms.internal.ads.iK r10 = r10.f17855e
            byte[] r7 = r10.b()
            com.google.android.gms.internal.ads.wJ r10 = r3.f17572c
            com.google.android.gms.internal.ads.wJ r1 = com.google.android.gms.internal.ads.C2065wJ.f17420d
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L68
            byte[] r10 = com.google.android.gms.internal.ads.QJ.f10602h
        L65:
            r8 = r10
            r3 = r0
            goto L6b
        L68:
            byte[] r10 = com.google.android.gms.internal.ads.QJ.f10601g
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.QJ.d(com.google.android.gms.internal.ads.zJ):com.google.android.gms.internal.ads.QJ");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1199gE
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f10606d;
        if (!AbstractC2062wG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f10604b, this.f10608f);
        signature.initVerify(this.f10603a);
        signature.setParameter(this.f10605c);
        signature.update(bArr2);
        byte[] bArr4 = this.f10607e;
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
