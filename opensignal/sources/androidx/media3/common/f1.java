package androidx.media3.common;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f1 implements i {
    public static final String B;
    public static final String D;
    public static final String E;

    /* renamed from: y, reason: collision with root package name */
    public static final String f1649y;

    /* renamed from: a, reason: collision with root package name */
    public final int f1650a;

    /* renamed from: d, reason: collision with root package name */
    public final b1 f1651d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1652g;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f1653r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f1654x;

    static {
        int i10 = a5.d0.f105a;
        f1649y = Integer.toString(0, 36);
        B = Integer.toString(1, 36);
        D = Integer.toString(3, 36);
        E = Integer.toString(4, 36);
    }

    public f1(b1 b1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = b1Var.f1572a;
        this.f1650a = i10;
        boolean z11 = false;
        a5.a.e(i10 == iArr.length && i10 == zArr.length);
        this.f1651d = b1Var;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.f1652g = z11;
        this.f1653r = (int[]) iArr.clone();
        this.f1654x = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f1652g == f1Var.f1652g && this.f1651d.equals(f1Var.f1651d) && Arrays.equals(this.f1653r, f1Var.f1653r) && Arrays.equals(this.f1654x, f1Var.f1654x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1654x) + ((Arrays.hashCode(this.f1653r) + (((this.f1651d.hashCode() * 31) + (this.f1652g ? 1 : 0)) * 31)) * 31);
    }
}
