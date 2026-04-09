package androidx.media3.common;

/* loaded from: classes.dex */
public final class g1 implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final g1 f1687d;

    /* renamed from: a, reason: collision with root package name */
    public final oe.h0 f1688a;

    static {
        oe.f0 f0Var = oe.h0.f19336d;
        f1687d = new g1(oe.u0.f19383x);
        int i10 = a5.d0.f105a;
        Integer.toString(0, 36);
    }

    public g1(oe.h0 h0Var) {
        this.f1688a = oe.h0.l(h0Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            oe.h0 h0Var = this.f1688a;
            if (i11 >= h0Var.size()) {
                return false;
            }
            f1 f1Var = (f1) h0Var.get(i11);
            boolean[] zArr = f1Var.f1654x;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (!zArr[i12]) {
                    i12++;
                } else if (f1Var.f1651d.f1574g == i10) {
                    return true;
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g1.class != obj.getClass()) {
            return false;
        }
        return this.f1688a.equals(((g1) obj).f1688a);
    }

    public final int hashCode() {
        return this.f1688a.hashCode();
    }
}
