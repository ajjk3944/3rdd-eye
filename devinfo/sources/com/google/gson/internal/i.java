package com.google.gson.internal;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f20844a;

    public i(String str) {
        this.f20844a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f20844a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f20844a.equals(((i) obj).f20844a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f20844a);
    }

    public final int hashCode() {
        return this.f20844a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f20844a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return g.i(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f20844a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return g.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f20844a;
    }
}
