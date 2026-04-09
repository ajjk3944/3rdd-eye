package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6525a;
import l0.AbstractC6526b;
import l0.AbstractC6532h;
import l0.AbstractC6536l;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6533i;
import l0.C6535k;
import l0.C6537m;
import m0.AbstractC6688Y;
import m0.C6683T;
import m0.InterfaceC6717n0;
import m0.Q0;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29215a = true;

    /* renamed from: b, reason: collision with root package name */
    private final Outline f29216b;

    /* renamed from: c, reason: collision with root package name */
    private m0.Q0 f29217c;

    /* renamed from: d, reason: collision with root package name */
    private m0.U0 f29218d;

    /* renamed from: e, reason: collision with root package name */
    private m0.U0 f29219e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29220f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29221g;

    /* renamed from: h, reason: collision with root package name */
    private m0.U0 f29222h;

    /* renamed from: i, reason: collision with root package name */
    private C6535k f29223i;

    /* renamed from: j, reason: collision with root package name */
    private float f29224j;

    /* renamed from: k, reason: collision with root package name */
    private long f29225k;

    /* renamed from: l, reason: collision with root package name */
    private long f29226l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f29227m;

    /* renamed from: n, reason: collision with root package name */
    private m0.U0 f29228n;

    /* renamed from: o, reason: collision with root package name */
    private m0.U0 f29229o;

    public K0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f29216b = outline;
        this.f29225k = C6531g.f52335b.c();
        this.f29226l = C6537m.f52356b.b();
    }

    private final boolean g(C6535k c6535k, long j10, long j11, float f10) {
        return c6535k != null && AbstractC6536l.f(c6535k) && c6535k.e() == C6531g.m(j10) && c6535k.g() == C6531g.n(j10) && c6535k.f() == C6531g.m(j10) + C6537m.i(j11) && c6535k.a() == C6531g.n(j10) + C6537m.g(j11) && AbstractC6525a.d(c6535k.h()) == f10;
    }

    private final void i() {
        if (this.f29220f) {
            this.f29225k = C6531g.f52335b.c();
            this.f29224j = 0.0f;
            this.f29219e = null;
            this.f29220f = false;
            this.f29221g = false;
            m0.Q0 q02 = this.f29217c;
            if (q02 == null || !this.f29227m || C6537m.i(this.f29226l) <= 0.0f || C6537m.g(this.f29226l) <= 0.0f) {
                this.f29216b.setEmpty();
                return;
            }
            this.f29215a = true;
            if (q02 instanceof Q0.b) {
                k(((Q0.b) q02).b());
            } else if (q02 instanceof Q0.c) {
                l(((Q0.c) q02).b());
            } else if (q02 instanceof Q0.a) {
                j(((Q0.a) q02).b());
            }
        }
    }

    private final void j(m0.U0 u02) {
        if (Build.VERSION.SDK_INT > 28 || u02.c()) {
            Outline outline = this.f29216b;
            if (!(u02 instanceof C6683T)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C6683T) u02).v());
            this.f29221g = !this.f29216b.canClip();
        } else {
            this.f29215a = false;
            this.f29216b.setEmpty();
            this.f29221g = true;
        }
        this.f29219e = u02;
    }

    private final void k(C6533i c6533i) {
        this.f29225k = AbstractC6532h.a(c6533i.k(), c6533i.n());
        this.f29226l = AbstractC6538n.a(c6533i.r(), c6533i.j());
        this.f29216b.setRect(Math.round(c6533i.k()), Math.round(c6533i.n()), Math.round(c6533i.l()), Math.round(c6533i.e()));
    }

    private final void l(C6535k c6535k) {
        float fD = AbstractC6525a.d(c6535k.h());
        this.f29225k = AbstractC6532h.a(c6535k.e(), c6535k.g());
        this.f29226l = AbstractC6538n.a(c6535k.j(), c6535k.d());
        if (AbstractC6536l.f(c6535k)) {
            this.f29216b.setRoundRect(Math.round(c6535k.e()), Math.round(c6535k.g()), Math.round(c6535k.f()), Math.round(c6535k.a()), fD);
            this.f29224j = fD;
            return;
        }
        m0.U0 u0A = this.f29218d;
        if (u0A == null) {
            u0A = AbstractC6688Y.a();
            this.f29218d = u0A;
        }
        u0A.a();
        m0.U0.t(u0A, c6535k, null, 2, null);
        j(u0A);
    }

    public final void a(InterfaceC6717n0 interfaceC6717n0) {
        m0.U0 u0D = d();
        if (u0D != null) {
            InterfaceC6717n0.t(interfaceC6717n0, u0D, 0, 2, null);
            return;
        }
        float f10 = this.f29224j;
        if (f10 <= 0.0f) {
            InterfaceC6717n0.p(interfaceC6717n0, C6531g.m(this.f29225k), C6531g.n(this.f29225k), C6531g.m(this.f29225k) + C6537m.i(this.f29226l), C6531g.n(this.f29225k) + C6537m.g(this.f29226l), 0, 16, null);
            return;
        }
        m0.U0 u0A = this.f29222h;
        C6535k c6535k = this.f29223i;
        if (u0A == null || !g(c6535k, this.f29225k, this.f29226l, f10)) {
            C6535k c6535kD = AbstractC6536l.d(C6531g.m(this.f29225k), C6531g.n(this.f29225k), C6531g.m(this.f29225k) + C6537m.i(this.f29226l), C6531g.n(this.f29225k) + C6537m.g(this.f29226l), AbstractC6526b.b(this.f29224j, 0.0f, 2, null));
            if (u0A == null) {
                u0A = AbstractC6688Y.a();
            } else {
                u0A.a();
            }
            m0.U0.t(u0A, c6535kD, null, 2, null);
            this.f29223i = c6535kD;
            this.f29222h = u0A;
        }
        InterfaceC6717n0.t(interfaceC6717n0, u0A, 0, 2, null);
    }

    public final Outline b() {
        i();
        if (this.f29227m && this.f29215a) {
            return this.f29216b;
        }
        return null;
    }

    public final boolean c() {
        return this.f29220f;
    }

    public final m0.U0 d() {
        i();
        return this.f29219e;
    }

    public final boolean e() {
        return !this.f29221g;
    }

    public final boolean f(long j10) {
        m0.Q0 q02;
        if (this.f29227m && (q02 = this.f29217c) != null) {
            return AbstractC3939m1.b(q02, C6531g.m(j10), C6531g.n(j10), this.f29228n, this.f29229o);
        }
        return true;
    }

    public final boolean h(m0.Q0 q02, float f10, boolean z10, float f11, long j10) {
        this.f29216b.setAlpha(f10);
        boolean zD = AbstractC6492s.d(this.f29217c, q02);
        boolean z11 = !zD;
        if (!zD) {
            this.f29217c = q02;
            this.f29220f = true;
        }
        this.f29226l = j10;
        boolean z12 = q02 != null && (z10 || f11 > 0.0f);
        if (this.f29227m != z12) {
            this.f29227m = z12;
            this.f29220f = true;
        }
        return z11;
    }
}
