package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fp1 extends hp1 {
    @Override // com.google.android.gms.internal.ads.hp1
    public final void G(Object obj, long j, byte b10) {
        if (ip1.f12416h) {
            ip1.d(obj, j, b10);
        } else {
            ip1.e(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final boolean I(Object obj, long j) {
        return ip1.f12416h ? ip1.q(obj, j) : ip1.r(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final void O(Object obj, long j, boolean z3) {
        if (ip1.f12416h) {
            ip1.d(obj, j, z3 ? (byte) 1 : (byte) 0);
        } else {
            ip1.e(obj, j, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final float Z0(Object obj, long j) {
        return Float.intBitsToFloat(((Unsafe) this.f11937a).getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final void a1(Object obj, long j, float f10) {
        ((Unsafe) this.f11937a).putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final double b1(Object obj, long j) {
        return Double.longBitsToDouble(((Unsafe) this.f11937a).getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final void c1(Object obj, long j, double d10) {
        ((Unsafe) this.f11937a).putLong(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final byte d1(long j) {
        return Memory.peekByte((int) j);
    }
}
