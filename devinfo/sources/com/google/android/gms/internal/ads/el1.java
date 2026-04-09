package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class el1 implements u91 {
    public static final byte[] g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f10820h = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f10821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10822b;

    /* renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f10823c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10824d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10825e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f10826f;

    public el1(RSAPublicKey rSAPublicKey, ik1 ik1Var, ik1 ik1Var2, int i4, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!al0.q(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!ik1Var.equals(ik1Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        al0.D(rSAPublicKey.getModulus().bitLength());
        al0.I(rSAPublicKey.getPublicExponent());
        this.f10821a = rSAPublicKey;
        this.f10822b = b(ik1Var);
        this.f10823c = c(ik1Var, ik1Var2, i4);
        this.f10824d = bArr;
        this.f10825e = bArr2;
        this.f10826f = provider;
    }

    public static String b(ik1 ik1Var) {
        if (ik1Var == ik1.f12361b) {
            return "SHA256withRSA/PSS";
        }
        if (ik1Var == ik1.f12362c) {
            return "SHA384withRSA/PSS";
        }
        if (ik1Var == ik1.f12363d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(ik1Var)));
    }

    public static PSSParameterSpec c(ik1 ik1Var, ik1 ik1Var2, int i4) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        ik1 ik1Var3 = ik1.f12363d;
        ik1 ik1Var4 = ik1.f12362c;
        ik1 ik1Var5 = ik1.f12361b;
        if (ik1Var == ik1Var5) {
            str = "SHA-256";
        } else if (ik1Var == ik1Var4) {
            str = "SHA-384";
        } else {
            if (ik1Var != ik1Var3) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(ik1Var)));
            }
            str = "SHA-512";
        }
        if (ik1Var2 == ik1Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (ik1Var2 == ik1Var4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (ik1Var2 != ik1Var3) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(ik1Var2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i4, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.el1 d(com.google.android.gms.internal.ads.mk1 r10) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        /*
            int r0 = com.google.android.gms.internal.ads.je1.f12739a
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
            java.security.Provider r1 = com.google.android.gms.internal.ads.a80.c()
            goto L2b
        L32:
            if (r9 == 0) goto L6f
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r9)
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r10.f13927d
            com.google.android.gms.internal.ads.kk1 r3 = r10.f13926c
            java.math.BigInteger r4 = r3.f13184b
            r1.<init>(r2, r4)
            java.security.PublicKey r0 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            com.google.android.gms.internal.ads.el1 r2 = new com.google.android.gms.internal.ads.el1
            com.google.android.gms.internal.ads.ik1 r4 = r3.f13186d
            com.google.android.gms.internal.ads.ik1 r5 = r3.f13187e
            int r6 = r3.f13188f
            com.google.android.gms.internal.ads.vl1 r10 = r10.f13928e
            byte[] r7 = r10.b()
            com.google.android.gms.internal.ads.jk1 r10 = r3.f13185c
            com.google.android.gms.internal.ads.jk1 r1 = com.google.android.gms.internal.ads.jk1.f12772d
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L68
            byte[] r10 = com.google.android.gms.internal.ads.el1.f10820h
        L65:
            r8 = r10
            r3 = r0
            goto L6b
        L68:
            byte[] r10 = com.google.android.gms.internal.ads.el1.g
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.el1.d(com.google.android.gms.internal.ads.mk1):com.google.android.gms.internal.ads.el1");
    }

    @Override // com.google.android.gms.internal.ads.u91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f10824d;
        if (!je1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f10822b, this.f10826f);
        signature.initVerify(this.f10821a);
        signature.setParameter(this.f10823c);
        signature.update(bArr2);
        byte[] bArr4 = this.f10825e;
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
