package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h1 extends j1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Unsafe unsafe, int i4) {
        super(unsafe);
        this.f987b = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean c(Object obj, long j) {
        switch (this.f987b) {
            case 0:
                if (!k1.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!k1.g) {
                    break;
                } else {
                    break;
                }
        }
        return k1.c(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final double d(Object obj, long j) {
        switch (this.f987b) {
        }
        return Double.longBitsToDouble(g(obj, j));
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final float e(Object obj, long j) {
        switch (this.f987b) {
        }
        return Float.intBitsToFloat(f(obj, j));
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void j(Object obj, long j, boolean z3) {
        switch (this.f987b) {
            case 0:
                if (!k1.g) {
                    k1.l(obj, j, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.k(obj, j, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!k1.g) {
                    k1.l(obj, j, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.k(obj, j, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void k(Object obj, long j, byte b10) {
        switch (this.f987b) {
            case 0:
                if (!k1.g) {
                    k1.l(obj, j, b10);
                    break;
                } else {
                    k1.k(obj, j, b10);
                    break;
                }
            default:
                if (!k1.g) {
                    k1.l(obj, j, b10);
                    break;
                } else {
                    k1.k(obj, j, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void l(Object obj, long j, double d10) {
        switch (this.f987b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d10));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void m(Object obj, long j, float f10) {
        switch (this.f987b) {
            case 0:
                n(j, obj, Float.floatToIntBits(f10));
                break;
            default:
                n(j, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean r() {
        switch (this.f987b) {
        }
        return false;
    }
}
