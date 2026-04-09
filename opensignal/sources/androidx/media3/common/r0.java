package androidx.media3.common;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r0 implements i {
    public final long B;
    public final int D;
    public final int E;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1790a;

    /* renamed from: d, reason: collision with root package name */
    public final int f1791d;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f1792g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f1793r;

    /* renamed from: x, reason: collision with root package name */
    public final int f1794x;

    /* renamed from: y, reason: collision with root package name */
    public final long f1795y;

    static {
        int i10 = a5.d0.f105a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public r0(Object obj, int i10, e0 e0Var, Object obj2, int i11, long j, long j7, int i12, int i13) {
        this.f1790a = obj;
        this.f1791d = i10;
        this.f1792g = e0Var;
        this.f1793r = obj2;
        this.f1794x = i11;
        this.f1795y = j;
        this.B = j7;
        this.D = i12;
        this.E = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (this.f1791d == r0Var.f1791d && this.f1794x == r0Var.f1794x && this.f1795y == r0Var.f1795y && this.B == r0Var.B && this.D == r0Var.D && this.E == r0Var.E && a.a.k(this.f1790a, r0Var.f1790a) && a.a.k(this.f1793r, r0Var.f1793r) && a.a.k(this.f1792g, r0Var.f1792g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1790a, Integer.valueOf(this.f1791d), this.f1792g, this.f1793r, Integer.valueOf(this.f1794x), Long.valueOf(this.f1795y), Long.valueOf(this.B), Integer.valueOf(this.D), Integer.valueOf(this.E)});
    }
}
