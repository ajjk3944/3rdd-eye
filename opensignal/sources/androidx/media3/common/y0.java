package androidx.media3.common;

/* loaded from: classes.dex */
public final class y0 implements i {
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public b B = b.f1565y;

    /* renamed from: a, reason: collision with root package name */
    public Object f1827a;

    /* renamed from: d, reason: collision with root package name */
    public Object f1828d;

    /* renamed from: g, reason: collision with root package name */
    public int f1829g;

    /* renamed from: r, reason: collision with root package name */
    public long f1830r;

    /* renamed from: x, reason: collision with root package name */
    public long f1831x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1832y;

    static {
        int i10 = a5.d0.f105a;
        D = Integer.toString(0, 36);
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
        G = Integer.toString(3, 36);
        H = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        a aVarA = this.B.a(i10);
        if (aVarA.f1555d != -1) {
            return aVarA.f1559y[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        a aVarA;
        int i10;
        b bVar = this.B;
        long j7 = this.f1830r;
        int i11 = bVar.f1566a;
        if (j != Long.MIN_VALUE && (j7 == -9223372036854775807L || j < j7)) {
            int i12 = bVar.f1569r;
            while (i12 < i11 && ((bVar.a(i12).f1554a != Long.MIN_VALUE && bVar.a(i12).f1554a <= j) || ((i10 = (aVarA = bVar.a(i12)).f1555d) != -1 && aVarA.a(-1) >= i10))) {
                i12++;
            }
            if (i12 < i11) {
                return i12;
            }
        }
        return -1;
    }

    public final int c(long j) {
        b bVar = this.B;
        long j7 = this.f1830r;
        int i10 = bVar.f1566a - 1;
        while (i10 >= 0 && j != Long.MIN_VALUE) {
            long j10 = bVar.a(i10).f1554a;
            if (j10 != Long.MIN_VALUE) {
                if (j >= j10) {
                    break;
                }
                i10--;
            } else {
                if (j7 != -9223372036854775807L && j >= j7) {
                    break;
                }
                i10--;
            }
        }
        if (i10 >= 0) {
            a aVarA = bVar.a(i10);
            int i11 = aVarA.f1555d;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = aVarA.f1558x[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i10) {
        return this.B.a(i10).f1554a;
    }

    public final int e(int i10, int i11) {
        a aVarA = this.B.a(i10);
        if (aVarA.f1555d != -1) {
            return aVarA.f1558x[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class.equals(obj.getClass())) {
            y0 y0Var = (y0) obj;
            if (a5.d0.a(this.f1827a, y0Var.f1827a) && a5.d0.a(this.f1828d, y0Var.f1828d) && this.f1829g == y0Var.f1829g && this.f1830r == y0Var.f1830r && this.f1831x == y0Var.f1831x && this.f1832y == y0Var.f1832y && a5.d0.a(this.B, y0Var.B)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10) {
        return this.B.a(i10).a(-1);
    }

    public final boolean g(int i10) {
        return this.B.a(i10).D;
    }

    public final void h(Object obj, Object obj2, int i10, long j, long j7, b bVar, boolean z10) {
        this.f1827a = obj;
        this.f1828d = obj2;
        this.f1829g = i10;
        this.f1830r = j;
        this.f1831x = j7;
        this.B = bVar;
        this.f1832y = z10;
    }

    public final int hashCode() {
        Object obj = this.f1827a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f1828d;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f1829g) * 31;
        long j = this.f1830r;
        int i10 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j7 = this.f1831x;
        return this.B.hashCode() + ((((i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f1832y ? 1 : 0)) * 31);
    }
}
