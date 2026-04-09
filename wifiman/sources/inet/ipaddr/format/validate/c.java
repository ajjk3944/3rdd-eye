package inet.ipaddr.format.validate;

import inet.ipaddr.g;

/* loaded from: classes4.dex */
abstract class c extends a {

    /* renamed from: k, reason: collision with root package name */
    private i f49356k;

    /* renamed from: l, reason: collision with root package name */
    private int f49357l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f49358m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f49359n;

    /* renamed from: o, reason: collision with root package name */
    private g.a f49360o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f49361p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f49362q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f49363r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f49364s;

    /* renamed from: t, reason: collision with root package name */
    r f49365t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f49366u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f49367v;

    c(CharSequence charSequence) {
        super(charSequence);
        this.f49356k = h.f49382j;
        this.f49357l = -1;
    }

    private void j1(StringBuilder sb2) {
        a aVarU0 = U0();
        int iW0 = W0();
        if (iW0 < 0) {
            sb2.append("unknown");
        } else {
            CharSequence charSequenceN = aVarU0.n();
            sb2.append(charSequenceN.subSequence(iW0, charSequenceN.length()));
        }
    }

    void T0() {
        this.f49357l = -1;
        this.f49359n = false;
        this.f49358m = false;
        this.f49367v = false;
        this.f49356k = h.f49382j;
    }

    a U0() {
        return this;
    }

    i V0() {
        return this.f49356k;
    }

    int W0() {
        return this.f49357l;
    }

    public boolean X0() {
        return this.f49358m;
    }

    boolean Y0() {
        return this.f49362q;
    }

    boolean Z0() {
        return this.f49367v;
    }

    boolean a1() {
        return U0().c() >= 0;
    }

    boolean b1(int i10) {
        return c1(i10, U0().m());
    }

    boolean c1(int i10, int[] iArr) {
        return a.j(i10, 6, iArr) == a.j(i10, 15, iArr);
    }

    public boolean d1() {
        return this.f49366u;
    }

    public boolean e1() {
        g.a aVarO0 = o0();
        return aVarO0 != null && aVarO0.isIPv4();
    }

    public boolean f1() {
        g.a aVarO0 = o0();
        return aVarO0 != null && aVarO0.isIPv6();
    }

    public boolean g1() {
        return this.f49365t != null;
    }

    boolean h1() {
        return this.f49359n;
    }

    boolean i1() {
        return this.f49361p;
    }

    void k1(boolean z10) {
        this.f49366u = z10;
    }

    void l1(boolean z10) {
        this.f49367v = z10;
    }

    void m1(boolean z10) {
        this.f49364s = z10;
    }

    void n1(boolean z10) {
        this.f49363r = z10;
    }

    public g.a o0() {
        return this.f49360o;
    }

    void o1(boolean z10) {
        this.f49358m = z10;
    }

    void p1(r rVar) {
        this.f49365t = rVar;
    }

    void q1(i iVar) {
        this.f49356k = iVar;
    }

    void r1(int i10) {
        this.f49357l = i10;
    }

    void s1(g.a aVar) {
        this.f49360o = aVar;
    }

    void t1(boolean z10) {
        this.f49359n = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        P0(sb2);
        sb2.append("ip version: ");
        sb2.append(o0());
        if (f1()) {
            if (g1()) {
                if (h1()) {
                    sb2.append(", with zone ");
                    j1(sb2);
                }
                if (X0()) {
                    sb2.append(", with prefix length ");
                    j1(sb2);
                }
                sb2.append(", with IPv4 embedded address: ");
                sb2.append('\n');
                sb2.append(this.f49365t);
            } else {
                if (d1()) {
                    sb2.append(" base 85");
                    if (Z0()) {
                        sb2.append(", with zone ");
                        j1(sb2);
                    }
                } else if (h1()) {
                    sb2.append(", with zone ");
                    j1(sb2);
                }
                if (X0()) {
                    sb2.append(", with prefix length ");
                    j1(sb2);
                }
                sb2.append('\n');
            }
        } else if (e1()) {
            if (X0()) {
                sb2.append(", with prefix length  ");
                j1(sb2);
            }
            if (i1()) {
                sb2.append(", with joined segments");
            }
            if (Y0()) {
                sb2.append(", with at least one hex or octal value");
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    void u1(boolean z10) {
        this.f49362q = z10;
    }

    void v1(boolean z10) {
        this.f49361p = z10;
    }
}
