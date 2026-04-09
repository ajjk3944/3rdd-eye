package ec;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x0 {
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
    public final o1 f23138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23139b;

    /* renamed from: c, reason: collision with root package name */
    public String f23140c;

    /* renamed from: d, reason: collision with root package name */
    public String f23141d;

    /* renamed from: e, reason: collision with root package name */
    public String f23142e;

    /* renamed from: f, reason: collision with root package name */
    public String f23143f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f23144h;

    /* renamed from: i, reason: collision with root package name */
    public long f23145i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public long f23146k;

    /* renamed from: l, reason: collision with root package name */
    public String f23147l;

    /* renamed from: m, reason: collision with root package name */
    public long f23148m;

    /* renamed from: n, reason: collision with root package name */
    public long f23149n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23150o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23151p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f23152q;

    /* renamed from: r, reason: collision with root package name */
    public long f23153r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f23154s;

    /* renamed from: t, reason: collision with root package name */
    public String f23155t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23156u;

    /* renamed from: v, reason: collision with root package name */
    public long f23157v;

    /* renamed from: w, reason: collision with root package name */
    public long f23158w;

    /* renamed from: x, reason: collision with root package name */
    public int f23159x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23160y;

    /* renamed from: z, reason: collision with root package name */
    public Long f23161z;

    public x0(o1 o1Var, String str) {
        pb.y.h(o1Var);
        pb.y.e(str);
        this.f23138a = o1Var;
        this.f23139b = str;
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        l1Var.B();
    }

    public final void A(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.f23158w != j;
        this.f23158w = j;
    }

    public final void B(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.B != j;
        this.B = j;
    }

    public final String C() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.C;
    }

    public final String D() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.f23139b;
    }

    public final String E() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.f23140c;
    }

    public final void F(String str) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= !Objects.equals(this.f23140c, str);
        this.f23140c = str;
    }

    public final String G() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.f23141d;
    }

    public final void H(String str) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= true ^ Objects.equals(this.f23141d, str);
        this.f23141d = str;
    }

    public final void I(String str) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= !Objects.equals(this.f23142e, str);
        this.f23142e = str;
    }

    public final String J() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.f23143f;
    }

    public final void K(String str) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= !Objects.equals(this.f23143f, str);
        this.f23143f = str;
    }

    public final void L(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.f23144h != j;
        this.f23144h = j;
    }

    public final void M(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.f23145i != j;
        this.f23145i = j;
    }

    public final String N() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.j;
    }

    public final void O(String str) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long P() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.f23146k;
    }

    public final void Q(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.f23146k != j;
        this.f23146k = j;
    }

    public final void R(String str) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= !Objects.equals(this.f23147l, str);
        this.f23147l = str;
    }

    public final void S(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.f23148m != j;
        this.f23148m = j;
    }

    public final void a(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.f23149n != j;
        this.f23149n = j;
    }

    public final long b() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.f23153r;
    }

    public final void c(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.f23153r != j;
        this.f23153r = j;
    }

    public final void d(boolean z3) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.f23150o != z3;
        this.f23150o = z3;
    }

    public final void e(long j) {
        pb.y.b(j >= 0);
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.g != j;
        this.g = j;
    }

    public final void f(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.R != j;
        this.R = j;
    }

    public final void g(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.S != j;
        this.S = j;
    }

    public final void h(long j) {
        o1 o1Var = this.f23138a;
        l1 l1Var = o1Var.g;
        s0 s0Var = o1Var.f22954f;
        o1.m(l1Var);
        l1Var.B();
        long j8 = this.g + j;
        String str = this.f23139b;
        if (j8 > 2147483647L) {
            o1.m(s0Var);
            s0Var.j.e(s0.J(str), "Bundle index overflow. appId");
            j8 = (-1) + j;
        }
        long j9 = this.F + 1;
        if (j9 > 2147483647L) {
            o1.m(s0Var);
            s0Var.j.e(s0.J(str), "Delivery index overflow. appId");
            j9 = 0;
        }
        this.Q = true;
        this.g = j8;
        this.F = j9;
    }

    public final void i(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.J != j;
        this.J = j;
    }

    public final void j(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.K != j;
        this.K = j;
    }

    public final void k(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.L != j;
        this.L = j;
    }

    public final void l(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.M != j;
        this.M = j;
    }

    public final void m(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.O != j;
        this.O = j;
    }

    public final void n(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.N != j;
        this.N = j;
    }

    public final boolean o() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.Q;
    }

    public final void p(int i4) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.D != i4;
        this.D = i4;
    }

    public final void q(int i4) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.E != i4;
        this.E = i4;
    }

    public final void r(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.F != j;
        this.F = j;
    }

    public final String s() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.G;
    }

    public final int t() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.I;
    }

    public final String u() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        String str = this.P;
        v(null);
        return str;
    }

    public final void v(String str) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final Boolean w() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.f23152q;
    }

    public final void x(List list) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        if (Objects.equals(this.f23154s, list)) {
            return;
        }
        this.Q = true;
        this.f23154s = list != null ? new ArrayList(list) : null;
    }

    public final boolean y() {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        return this.f23156u;
    }

    public final void z(long j) {
        l1 l1Var = this.f23138a.g;
        o1.m(l1Var);
        l1Var.B();
        this.Q |= this.f23157v != j;
        this.f23157v = j;
    }
}
