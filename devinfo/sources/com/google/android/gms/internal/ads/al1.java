package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class al1 implements u91 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9350f = new byte[0];
    public static final byte[] g = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f9351a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9352b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9353c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9354d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f9355e;

    public al1(RSAPublicKey rSAPublicKey, ak1 ak1Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!al0.q(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        al0.D(rSAPublicKey.getModulus().bitLength());
        al0.I(rSAPublicKey.getPublicExponent());
        this.f9351a = rSAPublicKey;
        this.f9352b = b(ak1Var);
        this.f9353c = bArr;
        this.f9354d = bArr2;
        this.f9355e = provider;
    }

    public static String b(ak1 ak1Var) throws GeneralSecurityException {
        if (ak1Var == ak1.f9340b) {
            return "SHA256withRSA";
        }
        if (ak1Var == ak1.f9341c) {
            return "SHA384withRSA";
        }
        if (ak1Var == ak1.f9342d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static al1 c(fk1 fk1Var, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = fk1Var.f11196d;
        ck1 ck1Var = fk1Var.f11195c;
        return new al1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, ck1Var.f10151b)), ck1Var.f10153d, fk1Var.f11197e.b(), ck1Var.f10152c.equals(bk1.f9706d) ? g : f9350f, provider);
    }

    @Override // com.google.android.gms.internal.ads.u91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f9353c;
        if (!je1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f9352b, this.f9355e);
        signature.initVerify(this.f9351a);
        signature.update(bArr2);
        byte[] bArr4 = this.f9354d;
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
