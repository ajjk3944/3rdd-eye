package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class EF extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f7933a;

    public EF(String str) {
        this.f7933a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f7933a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EF) {
            return this.f7933a.equals(((EF) obj).f7933a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f7933a);
    }

    public final int hashCode() {
        return this.f7933a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f7933a;
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
        String str = this.f7933a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f7933a;
    }
}
