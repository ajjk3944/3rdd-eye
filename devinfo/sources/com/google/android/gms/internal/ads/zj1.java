package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zj1 {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f19089e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f19090f;

    /* renamed from: a, reason: collision with root package name */
    public Integer f19091a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f19092b = ck1.f10149e;

    /* renamed from: c, reason: collision with root package name */
    public ak1 f19093c = null;

    /* renamed from: d, reason: collision with root package name */
    public bk1 f19094d = bk1.f9707e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f19089e = bigIntegerValueOf;
        f19090f = bigIntegerValueOf.pow(256);
    }

    public final void a(int i4) {
        this.f19091a = Integer.valueOf(i4);
    }

    public final ck1 b() throws GeneralSecurityException {
        Integer num = this.f19091a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f19092b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f19093c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f19094d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f19091a));
        }
        BigInteger bigInteger = this.f19092b;
        int iCompareTo = bigInteger.compareTo(ck1.f10149e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f19089e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f19090f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new ck1(this.f19091a.intValue(), this.f19092b, this.f19094d, this.f19093c);
    }
}
