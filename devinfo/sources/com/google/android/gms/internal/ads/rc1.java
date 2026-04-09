package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rc1 extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f15616a;

    public rc1(String str) {
        this.f15616a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f15616a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rc1) {
            return this.f15616a.equals(((rc1) obj).f15616a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f15616a);
    }

    public final int hashCode() {
        return this.f15616a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f15616a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f15616a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f15616a;
    }
}
