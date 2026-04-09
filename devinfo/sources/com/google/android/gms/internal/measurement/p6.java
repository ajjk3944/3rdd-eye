package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p6 extends q6 {
    @Override // com.google.android.gms.internal.measurement.q6
    public final void a(Object obj, long j, byte b10) {
        if (r6.g) {
            r6.c(obj, j, b10);
        } else {
            r6.d(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final boolean b(Object obj, long j) {
        return r6.g ? r6.n(obj, j) : r6.o(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void c(Object obj, long j, boolean z3) {
        if (r6.g) {
            r6.c(obj, j, z3 ? (byte) 1 : (byte) 0);
        } else {
            r6.d(obj, j, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final float d(Object obj, long j) {
        return Float.intBitsToFloat(this.f19885a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void e(Object obj, long j, float f10) {
        this.f19885a.putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final double f(Object obj, long j) {
        return Double.longBitsToDouble(this.f19885a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void g(Object obj, long j, double d10) {
        this.f19885a.putLong(obj, j, Double.doubleToLongBits(d10));
    }
}
