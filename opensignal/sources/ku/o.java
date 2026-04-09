package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f14588a;

    /* renamed from: b, reason: collision with root package name */
    public int f14589b;

    @Override // ku.s0
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f14588a, this.f14589b);
        br.l.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // ku.s0
    public final void b(int i10) {
        double[] dArr = this.f14588a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
            br.l.d(dArrCopyOf, "copyOf(...)");
            this.f14588a = dArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14589b;
    }
}
