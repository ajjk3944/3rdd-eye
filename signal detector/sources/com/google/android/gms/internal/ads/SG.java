package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class SG extends AbstractC1089eE {

    /* renamed from: a, reason: collision with root package name */
    public final int f11164a;

    public SG(int i) {
        this.f11164a = i;
    }

    public static SG b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new SG(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SG) && ((SG) obj).f11164a == this.f11164a;
    }

    public final int hashCode() {
        return Objects.hash(SG.class, Integer.valueOf(this.f11164a));
    }

    public final String toString() {
        int i = this.f11164a;
        return A.f.n(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }
}
