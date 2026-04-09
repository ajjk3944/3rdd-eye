package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zk1 implements t91 {
    public static final byte[] g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f19102h = {0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f19103i = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f19104a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19105b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f19106c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f19107d;

    /* renamed from: e, reason: collision with root package name */
    public final u91 f19108e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f19109f;

    public zk1(RSAPrivateCrtKey rSAPrivateCrtKey, ak1 ak1Var, byte[] bArr, byte[] bArr2, u91 u91Var, Provider provider) throws GeneralSecurityException {
        if (!al0.q(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (ak1Var != ak1.f9340b && ak1Var != ak1.f9341c && ak1Var != ak1.f9342d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(ak1Var)));
        }
        al0.D(rSAPrivateCrtKey.getModulus().bitLength());
        al0.I(rSAPrivateCrtKey.getPublicExponent());
        this.f19104a = rSAPrivateCrtKey;
        this.f19105b = al1.b(ak1Var);
        this.f19106c = bArr;
        this.f19107d = bArr2;
        this.f19108e = u91Var;
        this.f19109f = provider;
    }
}
