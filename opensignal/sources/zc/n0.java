package zc;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n0 {
    public Long A;
    public long B;
    public String C;
    public int D;
    public int E;
    public long F;
    public String G;
    public byte[] H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public String P;
    public boolean Q;
    public long R;
    public long S;

    /* renamed from: a, reason: collision with root package name */
    public final c1 f27019a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27020b;

    /* renamed from: c, reason: collision with root package name */
    public String f27021c;

    /* renamed from: d, reason: collision with root package name */
    public String f27022d;

    /* renamed from: e, reason: collision with root package name */
    public String f27023e;

    /* renamed from: f, reason: collision with root package name */
    public String f27024f;

    /* renamed from: g, reason: collision with root package name */
    public long f27025g;

    /* renamed from: h, reason: collision with root package name */
    public long f27026h;

    /* renamed from: i, reason: collision with root package name */
    public long f27027i;
    public String j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public String f27028l;

    /* renamed from: m, reason: collision with root package name */
    public long f27029m;

    /* renamed from: n, reason: collision with root package name */
    public long f27030n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27031o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27032p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f27033q;

    /* renamed from: r, reason: collision with root package name */
    public long f27034r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f27035s;

    /* renamed from: t, reason: collision with root package name */
    public String f27036t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27037u;

    /* renamed from: v, reason: collision with root package name */
    public long f27038v;

    /* renamed from: w, reason: collision with root package name */
    public long f27039w;

    /* renamed from: x, reason: collision with root package name */
    public int f27040x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27041y;

    /* renamed from: z, reason: collision with root package name */
    public Long f27042z;

    public n0(c1 c1Var, String str) {
        cc.s.h(c1Var);
        cc.s.e(str);
        this.f27019a = c1Var;
        this.f27020b = str;
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        a1Var.s1();
    }

    public final void A(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.f27039w != j;
        this.f27039w = j;
    }

    public final void B(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.B != j;
        this.B = j;
    }

    public final String C() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.C;
    }

    public final String D() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.f27020b;
    }

    public final String E() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.f27021c;
    }

    public final void F(String str) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= !Objects.equals(this.f27021c, str);
        this.f27021c = str;
    }

    public final String G() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.f27022d;
    }

    public final void H(String str) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= true ^ Objects.equals(this.f27022d, str);
        this.f27022d = str;
    }

    public final void I(String str) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= !Objects.equals(this.f27023e, str);
        this.f27023e = str;
    }

    public final String J() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.f27024f;
    }

    public final void K(String str) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= !Objects.equals(this.f27024f, str);
        this.f27024f = str;
    }

    public final void L(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.f27026h != j;
        this.f27026h = j;
    }

    public final void M(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.f27027i != j;
        this.f27027i = j;
    }

    public final String N() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.j;
    }

    public final void O(String str) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long P() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.k;
    }

    public final void Q(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.k != j;
        this.k = j;
    }

    public final void R(String str) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= !Objects.equals(this.f27028l, str);
        this.f27028l = str;
    }

    public final void S(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.f27029m != j;
        this.f27029m = j;
    }

    public final void a(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.f27030n != j;
        this.f27030n = j;
    }

    public final long b() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.f27034r;
    }

    public final void c(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.f27034r != j;
        this.f27034r = j;
    }

    public final void d(boolean z10) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.f27031o != z10;
        this.f27031o = z10;
    }

    public final void e(long j) {
        cc.s.b(j >= 0);
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.f27025g != j;
        this.f27025g = j;
    }

    public final void f(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.R != j;
        this.R = j;
    }

    public final void g(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.S != j;
        this.S = j;
    }

    public final void h(long j) {
        c1 c1Var = this.f27019a;
        a1 a1Var = c1Var.B;
        j0 j0Var = c1Var.f26889y;
        c1.g(a1Var);
        a1Var.s1();
        long j7 = this.f27025g + j;
        String str = this.f27020b;
        if (j7 > 2147483647L) {
            c1.g(j0Var);
            j0Var.F.c(j0.A1(str), "Bundle index overflow. appId");
            j7 = (-1) + j;
        }
        long j10 = this.F + 1;
        if (j10 > 2147483647L) {
            c1.g(j0Var);
            j0Var.F.c(j0.A1(str), "Delivery index overflow. appId");
            j10 = 0;
        }
        this.Q = true;
        this.f27025g = j7;
        this.F = j10;
    }

    public final void i(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.J != j;
        this.J = j;
    }

    public final void j(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.K != j;
        this.K = j;
    }

    public final void k(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.L != j;
        this.L = j;
    }

    public final void l(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.M != j;
        this.M = j;
    }

    public final void m(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.O != j;
        this.O = j;
    }

    public final void n(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.N != j;
        this.N = j;
    }

    public final boolean o() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.Q;
    }

    public final void p(int i10) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.D != i10;
        this.D = i10;
    }

    public final void q(int i10) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.E != i10;
        this.E = i10;
    }

    public final void r(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.F != j;
        this.F = j;
    }

    public final String s() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.G;
    }

    public final int t() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.I;
    }

    public final String u() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        String str = this.P;
        v(null);
        return str;
    }

    public final void v(String str) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final Boolean w() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.f27033q;
    }

    public final void x(List list) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        if (Objects.equals(this.f27035s, list)) {
            return;
        }
        this.Q = true;
        this.f27035s = list != null ? new ArrayList(list) : null;
    }

    public final boolean y() {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        return this.f27037u;
    }

    public final void z(long j) {
        a1 a1Var = this.f27019a.B;
        c1.g(a1Var);
        a1Var.s1();
        this.Q |= this.f27038v != j;
        this.f27038v = j;
    }
}
