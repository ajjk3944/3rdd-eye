package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gf1 extends s91 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11513a;

    public gf1(int i4) {
        this.f11513a = i4;
    }

    public static gf1 b(int i4) throws InvalidAlgorithmParameterException {
        if (i4 == 16 || i4 == 32) {
            return new gf1(i4);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i4 * 8)));
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gf1) && ((gf1) obj).f11513a == this.f11513a;
    }

    public final int hashCode() {
        return Objects.hash(gf1.class, Integer.valueOf(this.f11513a));
    }

    public final String toString() {
        int i4 = this.f11513a;
        return je.u.v(new StringBuilder(String.valueOf(i4).length() + 34), "AesCmac PRF Parameters (", i4, "-byte key)");
    }
}
