package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class em1 extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f10829a;

    public em1(String str) {
        this.f10829a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f10829a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof em1) {
            return this.f10829a.equals(((em1) obj).f10829a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f10829a);
    }

    public final int hashCode() {
        return this.f10829a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f10829a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return yr1.e(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f10829a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return yr1.e(str).longValue();
        }
    }

    public final String toString() {
        return this.f10829a;
    }
}
