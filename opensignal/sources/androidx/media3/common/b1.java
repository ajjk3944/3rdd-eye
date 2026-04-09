package androidx.media3.common;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b1 implements i {
    public static final String B;
    public static final ab.c D;

    /* renamed from: y, reason: collision with root package name */
    public static final String f1571y;

    /* renamed from: a, reason: collision with root package name */
    public final int f1572a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1573d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1574g;

    /* renamed from: r, reason: collision with root package name */
    public final r[] f1575r;

    /* renamed from: x, reason: collision with root package name */
    public int f1576x;

    static {
        int i10 = a5.d0.f105a;
        f1571y = Integer.toString(0, 36);
        B = Integer.toString(1, 36);
        D = new ab.c(17);
    }

    public b1(String str, r... rVarArr) {
        a5.a.e(rVarArr.length > 0);
        this.f1573d = str;
        this.f1575r = rVarArr;
        this.f1572a = rVarArr.length;
        int iG = j0.g(rVarArr[0].H);
        this.f1574g = iG == -1 ? j0.g(rVarArr[0].G) : iG;
        String str2 = rVarArr[0].f1786g;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = rVarArr[0].f1788x | 16384;
        for (int i11 = 1; i11 < rVarArr.length; i11++) {
            String str3 = rVarArr[i11].f1786g;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i11, "languages", rVarArr[0].f1786g, rVarArr[i11].f1786g);
                return;
            } else {
                if (i10 != (rVarArr[i11].f1788x | 16384)) {
                    b(i11, "role flags", Integer.toBinaryString(rVarArr[0].f1788x), Integer.toBinaryString(rVarArr[i11].f1788x));
                    return;
                }
            }
        }
    }

    public static void b(int i10, String str, String str2, String str3) {
        a5.a.n("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public final int a(r rVar) {
        int i10 = 0;
        while (true) {
            r[] rVarArr = this.f1575r;
            if (i10 >= rVarArr.length) {
                return -1;
            }
            if (rVar == rVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f1573d.equals(b1Var.f1573d) && Arrays.equals(this.f1575r, b1Var.f1575r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1576x == 0) {
            this.f1576x = c7.a.g(this.f1573d, 527, 31) + Arrays.hashCode(this.f1575r);
        }
        return this.f1576x;
    }
}
