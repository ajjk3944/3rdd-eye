package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.mJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1526mJ {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f15604e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f15605f;

    /* renamed from: a, reason: collision with root package name */
    public Integer f15606a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f15607b = C1688pJ.f16156e;

    /* renamed from: c, reason: collision with root package name */
    public C1580nJ f15608c = null;

    /* renamed from: d, reason: collision with root package name */
    public C1634oJ f15609d = C1634oJ.f15931e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f15604e = bigIntegerValueOf;
        f15605f = bigIntegerValueOf.pow(256);
    }

    public final void a(int i) {
        this.f15606a = Integer.valueOf(i);
    }

    public final C1688pJ b() throws GeneralSecurityException {
        Integer num = this.f15606a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f15607b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f15608c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f15609d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f15606a));
        }
        BigInteger bigInteger = this.f15607b;
        int iCompareTo = bigInteger.compareTo(C1688pJ.f16156e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f15604e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f15605f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C1688pJ(this.f15606a.intValue(), this.f15607b, this.f15609d, this.f15608c);
    }
}
