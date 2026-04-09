package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class TL extends VL {
    @Override // com.google.android.gms.internal.ads.VL
    public final void Q(Object obj, long j6, byte b5) {
        if (WL.f12219h) {
            WL.d(obj, j6, b5);
        } else {
            WL.e(obj, j6, b5);
        }
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final boolean U(long j6, Object obj) {
        return WL.f12219h ? WL.q(j6, obj) : WL.r(j6, obj);
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final void Y(Object obj, long j6, boolean z6) {
        if (WL.f12219h) {
            WL.d(obj, j6, z6 ? (byte) 1 : (byte) 0);
        } else {
            WL.e(obj, j6, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final float Z(long j6, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f11985a).getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final void m1(Object obj, long j6, float f2) {
        ((Unsafe) this.f11985a).putInt(obj, j6, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final double o1(long j6, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f11985a).getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final void p1(Object obj, long j6, double d6) {
        ((Unsafe) this.f11985a).putLong(obj, j6, Double.doubleToLongBits(d6));
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final byte q1(long j6) {
        return Memory.peekByte((int) j6);
    }
}
