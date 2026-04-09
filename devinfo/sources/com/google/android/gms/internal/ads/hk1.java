package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hk1 {
    public static final BigInteger g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f11897h;

    /* renamed from: a, reason: collision with root package name */
    public Integer f11898a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f11899b = kk1.g;

    /* renamed from: c, reason: collision with root package name */
    public ik1 f11900c = null;

    /* renamed from: d, reason: collision with root package name */
    public ik1 f11901d = null;

    /* renamed from: e, reason: collision with root package name */
    public Integer f11902e = null;

    /* renamed from: f, reason: collision with root package name */
    public jk1 f11903f = jk1.f12773e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        g = bigIntegerValueOf;
        f11897h = bigIntegerValueOf.pow(256);
    }

    public final void a(int i4) {
        this.f11898a = Integer.valueOf(i4);
    }

    public final void b(int i4) throws GeneralSecurityException {
        if (i4 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i4)));
        }
        this.f11902e = Integer.valueOf(i4);
    }

    public final kk1 c() throws GeneralSecurityException {
        Integer num = this.f11898a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f11899b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f11900c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f11901d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f11903f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f11902e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f11898a, 2048));
        }
        if (this.f11900c != this.f11901d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f11899b;
        int iCompareTo = bigInteger.compareTo(kk1.g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f11897h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new kk1(this.f11898a.intValue(), this.f11899b, this.f11903f, this.f11900c, this.f11901d, this.f11902e.intValue());
    }
}
