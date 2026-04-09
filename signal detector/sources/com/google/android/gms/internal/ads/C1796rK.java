package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1796rK extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f16513a;

    public C1796rK(String str) {
        this.f16513a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f16513a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1796rK) {
            return this.f16513a.equals(((C1796rK) obj).f16513a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f16513a);
    }

    public final int hashCode() {
        return this.f16513a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f16513a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return C1476lN.e(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f16513a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return C1476lN.e(str).longValue();
        }
    }

    public final String toString() {
        return this.f16513a;
    }
}
