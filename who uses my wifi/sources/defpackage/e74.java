package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e74 extends f74 {
    @Override // defpackage.f74
    public final byte A1(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.f74
    public final void F1(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.f74
    public final void q1(Object obj, long j, byte b) {
        if (g74.h) {
            g74.d(obj, j, b);
        } else {
            g74.e(obj, j, b);
        }
    }

    @Override // defpackage.f74
    public final boolean t1(long j, Object obj) {
        return g74.h ? g74.q(j, obj) : g74.r(j, obj);
    }

    @Override // defpackage.f74
    public final void v1(Object obj, long j, boolean z) {
        if (g74.h) {
            g74.d(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            g74.e(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.f74
    public final float w1(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.g).getInt(obj, j));
    }

    @Override // defpackage.f74
    public final void x1(Object obj, long j, float f) {
        ((Unsafe) this.g).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.f74
    public final double y1(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.g).getLong(obj, j));
    }

    @Override // defpackage.f74
    public final void z1(Object obj, long j, double d) {
        ((Unsafe) this.g).putLong(obj, j, Double.doubleToLongBits(d));
    }
}
