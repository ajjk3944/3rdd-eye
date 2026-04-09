package androidx.media3.common;

/* loaded from: classes.dex */
public class e1 implements i {
    public final int B;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final oe.h0 H;
    public final int I;
    public final oe.h0 J;
    public final int K;
    public final int L;
    public final int M;
    public final oe.h0 N;
    public final oe.h0 O;
    public final int P;
    public final int Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final oe.z0 U;
    public final oe.k0 V;

    /* renamed from: a, reason: collision with root package name */
    public final int f1613a;

    /* renamed from: d, reason: collision with root package name */
    public final int f1614d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1615g;

    /* renamed from: r, reason: collision with root package name */
    public final int f1616r;

    /* renamed from: x, reason: collision with root package name */
    public final int f1617x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1618y;

    static {
        new e1(new d1());
        int i10 = a5.d0.f105a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
    }

    public e1(d1 d1Var) {
        this.f1613a = d1Var.f1583a;
        this.f1614d = d1Var.f1584b;
        this.f1615g = d1Var.f1585c;
        this.f1616r = d1Var.f1586d;
        this.f1617x = d1Var.f1587e;
        this.f1618y = d1Var.f1588f;
        this.B = d1Var.f1589g;
        this.D = d1Var.f1590h;
        this.E = d1Var.f1591i;
        this.F = d1Var.j;
        this.G = d1Var.k;
        this.H = d1Var.f1592l;
        this.I = d1Var.f1593m;
        this.J = d1Var.f1594n;
        this.K = d1Var.f1595o;
        this.L = d1Var.f1596p;
        this.M = d1Var.f1597q;
        this.N = d1Var.f1598r;
        this.O = d1Var.f1599s;
        this.P = d1Var.f1600t;
        this.Q = d1Var.f1601u;
        this.R = d1Var.f1602v;
        this.S = d1Var.f1603w;
        this.T = d1Var.f1604x;
        this.U = oe.z0.a(d1Var.f1605y);
        this.V = oe.k0.m(d1Var.f1606z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f1613a == e1Var.f1613a && this.f1614d == e1Var.f1614d && this.f1615g == e1Var.f1615g && this.f1616r == e1Var.f1616r && this.f1617x == e1Var.f1617x && this.f1618y == e1Var.f1618y && this.B == e1Var.B && this.D == e1Var.D && this.G == e1Var.G && this.E == e1Var.E && this.F == e1Var.F && this.H.equals(e1Var.H) && this.I == e1Var.I && this.J.equals(e1Var.J) && this.K == e1Var.K && this.L == e1Var.L && this.M == e1Var.M && this.N.equals(e1Var.N) && this.O.equals(e1Var.O) && this.P == e1Var.P && this.Q == e1Var.Q && this.R == e1Var.R && this.S == e1Var.S && this.T == e1Var.T) {
                oe.z0 z0Var = e1Var.U;
                oe.z0 z0Var2 = this.U;
                z0Var2.getClass();
                if (oe.s.e(z0Var2, z0Var) && this.V.equals(e1Var.V)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.V.hashCode() + ((this.U.hashCode() + ((((((((((((this.O.hashCode() + ((this.N.hashCode() + ((((((((this.J.hashCode() + ((((this.H.hashCode() + ((((((((((((((((((((((this.f1613a + 31) * 31) + this.f1614d) * 31) + this.f1615g) * 31) + this.f1616r) * 31) + this.f1617x) * 31) + this.f1618y) * 31) + this.B) * 31) + this.D) * 31) + (this.G ? 1 : 0)) * 31) + this.E) * 31) + this.F) * 31)) * 31) + this.I) * 31)) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31)) * 31)) * 31) + this.P) * 31) + this.Q) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31)) * 31);
    }
}
