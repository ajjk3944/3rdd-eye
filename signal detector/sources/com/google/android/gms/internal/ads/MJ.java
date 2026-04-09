package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* loaded from: classes.dex */
public final class MJ implements InterfaceC1144fE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f9858g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f9859h = {0};
    public static final byte[] i = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f9860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9861b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9862c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9863d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1199gE f9864e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f9865f;

    public MJ(RSAPrivateCrtKey rSAPrivateCrtKey, C1580nJ c1580nJ, byte[] bArr, byte[] bArr2, InterfaceC1199gE interfaceC1199gE, Provider provider) throws GeneralSecurityException {
        if (!Cr.m(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (c1580nJ != C1580nJ.f15763b && c1580nJ != C1580nJ.f15764c && c1580nJ != C1580nJ.f15765d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(c1580nJ)));
        }
        Cr.z(rSAPrivateCrtKey.getModulus().bitLength());
        Cr.F(rSAPrivateCrtKey.getPublicExponent());
        this.f9860a = rSAPrivateCrtKey;
        this.f9861b = NJ.b(c1580nJ);
        this.f9862c = bArr;
        this.f9863d = bArr2;
        this.f9864e = interfaceC1199gE;
        this.f9865f = provider;
    }
}
