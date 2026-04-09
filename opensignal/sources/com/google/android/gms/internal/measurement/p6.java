package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class p6 extends r6 {
    @Override // com.google.android.gms.internal.measurement.r6
    public final void a(Object obj, long j, byte b2) {
        if (s6.f5195g) {
            s6.c(obj, j, b2);
        } else {
            s6.d(obj, j, b2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r6
    public final boolean b(Object obj, long j) {
        return s6.f5195g ? s6.n(obj, j) : s6.o(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.r6
    public final void c(Object obj, long j, boolean z10) {
        if (s6.f5195g) {
            s6.c(obj, j, z10 ? (byte) 1 : (byte) 0);
        } else {
            s6.d(obj, j, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r6
    public final float d(Object obj, long j) {
        return Float.intBitsToFloat(this.f5183a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.r6
    public final void e(Object obj, long j, float f10) {
        this.f5183a.putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.r6
    public final double f(Object obj, long j) {
        return Double.longBitsToDouble(this.f5183a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.r6
    public final void g(Object obj, long j, double d6) {
        this.f5183a.putLong(obj, j, Double.doubleToLongBits(d6));
    }
}
