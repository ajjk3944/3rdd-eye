package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class NJ implements InterfaceC1199gE {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9986f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f9987g = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f9988a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9989b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9990c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9991d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f9992e;

    public NJ(RSAPublicKey rSAPublicKey, C1580nJ c1580nJ, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!Cr.m(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        Cr.z(rSAPublicKey.getModulus().bitLength());
        Cr.F(rSAPublicKey.getPublicExponent());
        this.f9988a = rSAPublicKey;
        this.f9989b = b(c1580nJ);
        this.f9990c = bArr;
        this.f9991d = bArr2;
        this.f9992e = provider;
    }

    public static String b(C1580nJ c1580nJ) throws GeneralSecurityException {
        if (c1580nJ == C1580nJ.f15763b) {
            return "SHA256withRSA";
        }
        if (c1580nJ == C1580nJ.f15764c) {
            return "SHA384withRSA";
        }
        if (c1580nJ == C1580nJ.f15765d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static NJ c(C1849sJ c1849sJ, Provider provider) {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = c1849sJ.f16703d;
        C1688pJ c1688pJ = c1849sJ.f16702c;
        return new NJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c1688pJ.f16158b)), c1688pJ.f16160d, c1849sJ.f16704e.b(), c1688pJ.f16159c.equals(C1634oJ.f15930d) ? f9987g : f9986f, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1199gE
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f9990c;
        if (!AbstractC2062wG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f9989b, this.f9992e);
        signature.initVerify(this.f9988a);
        signature.update(bArr2);
        byte[] bArr4 = this.f9991d;
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
