package oe;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class s0 extends t0 implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final s0 f19372d = new s0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final s0 f19373g = new s0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19374a;

    public /* synthetic */ s0(int i10) {
        this.f19374a = i10;
    }

    @Override // oe.t0
    public final t0 b() {
        switch (this.f19374a) {
            case 0:
                return f19373g;
            default:
                return f19372d;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f19374a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f19374a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
