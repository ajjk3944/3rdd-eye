package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class n1 extends p1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f1328b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean c(Object obj, long j) {
        switch (this.f1328b) {
            case 0:
                if (!q1.f1343g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!q1.f1343g) {
                    break;
                } else {
                    break;
                }
        }
        return q1.c(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final double d(Object obj, long j) {
        switch (this.f1328b) {
        }
        return Double.longBitsToDouble(g(obj, j));
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final float e(Object obj, long j) {
        switch (this.f1328b) {
        }
        return Float.intBitsToFloat(f(obj, j));
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void j(Object obj, long j, boolean z10) {
        switch (this.f1328b) {
            case 0:
                if (!q1.f1343g) {
                    q1.l(obj, j, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    q1.k(obj, j, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!q1.f1343g) {
                    q1.l(obj, j, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    q1.k(obj, j, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void k(Object obj, long j, byte b2) {
        switch (this.f1328b) {
            case 0:
                if (!q1.f1343g) {
                    q1.l(obj, j, b2);
                    break;
                } else {
                    q1.k(obj, j, b2);
                    break;
                }
            default:
                if (!q1.f1343g) {
                    q1.l(obj, j, b2);
                    break;
                } else {
                    q1.k(obj, j, b2);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void l(Object obj, long j, double d6) {
        switch (this.f1328b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d6));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d6));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void m(Object obj, long j, float f10) {
        switch (this.f1328b) {
            case 0:
                n(Float.floatToIntBits(f10), j, obj);
                break;
            default:
                n(Float.floatToIntBits(f10), j, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean r() {
        switch (this.f1328b) {
        }
        return false;
    }
}
