package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s2 extends t2 {
    @Override // com.google.android.gms.internal.play_billing.t2
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(this.f20231a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(this.f20231a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void c(Object obj, long j, boolean z3) {
        if (u2.g) {
            u2.c(obj, j, z3 ? (byte) 1 : (byte) 0);
        } else {
            u2.d(obj, j, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void d(Object obj, long j, byte b10) {
        if (u2.g) {
            u2.c(obj, j, b10);
        } else {
            u2.d(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void e(Object obj, long j, double d10) {
        this.f20231a.putLong(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void f(Object obj, long j, float f10) {
        this.f20231a.putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final boolean g(Object obj, long j) {
        return u2.g ? u2.m(obj, j) : u2.n(obj, j);
    }
}
