package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.uJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1957uJ {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f17105g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f17106h;

    /* renamed from: a, reason: collision with root package name */
    public Integer f17107a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f17108b = C2119xJ.f17569g;

    /* renamed from: c, reason: collision with root package name */
    public C2011vJ f17109c = null;

    /* renamed from: d, reason: collision with root package name */
    public C2011vJ f17110d = null;

    /* renamed from: e, reason: collision with root package name */
    public Integer f17111e = null;

    /* renamed from: f, reason: collision with root package name */
    public C2065wJ f17112f = C2065wJ.f17421e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f17105g = bigIntegerValueOf;
        f17106h = bigIntegerValueOf.pow(256);
    }

    public final void a(int i) {
        this.f17107a = Integer.valueOf(i);
    }

    public final void b(int i) throws GeneralSecurityException {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.f17111e = Integer.valueOf(i);
    }

    public final C2119xJ c() throws GeneralSecurityException {
        Integer num = this.f17107a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f17108b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f17109c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f17110d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f17112f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f17111e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f17107a, 2048));
        }
        if (this.f17109c != this.f17110d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f17108b;
        int iCompareTo = bigInteger.compareTo(C2119xJ.f17569g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f17105g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f17106h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C2119xJ(this.f17107a.intValue(), this.f17108b, this.f17112f, this.f17109c, this.f17110d, this.f17111e.intValue());
    }
}
