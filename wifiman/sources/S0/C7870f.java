package s0;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6687X;
import m0.AbstractC6688Y;
import m0.AbstractC6713l0;
import m0.U0;
import m0.X0;
import mh.InterfaceC6824a;
import o0.C7044k;
import o0.InterfaceC7039f;

/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7870f extends k {

    /* renamed from: b, reason: collision with root package name */
    private String f60872b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC6713l0 f60873c;

    /* renamed from: d, reason: collision with root package name */
    private float f60874d;

    /* renamed from: e, reason: collision with root package name */
    private List f60875e;

    /* renamed from: f, reason: collision with root package name */
    private int f60876f;

    /* renamed from: g, reason: collision with root package name */
    private float f60877g;

    /* renamed from: h, reason: collision with root package name */
    private float f60878h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC6713l0 f60879i;

    /* renamed from: j, reason: collision with root package name */
    private int f60880j;

    /* renamed from: k, reason: collision with root package name */
    private int f60881k;

    /* renamed from: l, reason: collision with root package name */
    private float f60882l;

    /* renamed from: m, reason: collision with root package name */
    private float f60883m;

    /* renamed from: n, reason: collision with root package name */
    private float f60884n;

    /* renamed from: o, reason: collision with root package name */
    private float f60885o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f60886p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f60887q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f60888r;

    /* renamed from: s, reason: collision with root package name */
    private C7044k f60889s;

    /* renamed from: t, reason: collision with root package name */
    private final U0 f60890t;

    /* renamed from: u, reason: collision with root package name */
    private U0 f60891u;

    /* renamed from: v, reason: collision with root package name */
    private final Yg.m f60892v;

    /* renamed from: s0.f$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60893a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X0 invoke() {
            return AbstractC6687X.a();
        }
    }

    public C7870f() {
        super(null);
        this.f60872b = "";
        this.f60874d = 1.0f;
        this.f60875e = n.d();
        this.f60876f = n.a();
        this.f60877g = 1.0f;
        this.f60880j = n.b();
        this.f60881k = n.c();
        this.f60882l = 4.0f;
        this.f60884n = 1.0f;
        this.f60886p = true;
        this.f60887q = true;
        U0 u0A = AbstractC6688Y.a();
        this.f60890t = u0A;
        this.f60891u = u0A;
        this.f60892v = Yg.n.a(Yg.q.NONE, a.f60893a);
    }

    private final X0 f() {
        return (X0) this.f60892v.getValue();
    }

    private final void v() {
        j.c(this.f60875e, this.f60890t);
        w();
    }

    private final void w() {
        if (this.f60883m == 0.0f && this.f60884n == 1.0f) {
            this.f60891u = this.f60890t;
            return;
        }
        if (AbstractC6492s.d(this.f60891u, this.f60890t)) {
            this.f60891u = AbstractC6688Y.a();
        } else {
            int iL = this.f60891u.l();
            this.f60891u.q();
            this.f60891u.h(iL);
        }
        f().a(this.f60890t, false);
        float fC = f().c();
        float f10 = this.f60883m;
        float f11 = this.f60885o;
        float f12 = ((f10 + f11) % 1.0f) * fC;
        float f13 = ((this.f60884n + f11) % 1.0f) * fC;
        if (f12 <= f13) {
            f().b(f12, f13, this.f60891u, true);
        } else {
            f().b(f12, fC, this.f60891u, true);
            f().b(0.0f, f13, this.f60891u, true);
        }
    }

    @Override // s0.k
    public void a(InterfaceC7039f interfaceC7039f) {
        if (this.f60886p) {
            v();
        } else if (this.f60888r) {
            w();
        }
        this.f60886p = false;
        this.f60888r = false;
        AbstractC6713l0 abstractC6713l0 = this.f60873c;
        if (abstractC6713l0 != null) {
            InterfaceC7039f.R0(interfaceC7039f, this.f60891u, abstractC6713l0, this.f60874d, null, null, 0, 56, null);
        }
        AbstractC6713l0 abstractC6713l02 = this.f60879i;
        if (abstractC6713l02 != null) {
            C7044k c7044k = this.f60889s;
            if (this.f60887q || c7044k == null) {
                c7044k = new C7044k(this.f60878h, this.f60882l, this.f60880j, this.f60881k, null, 16, null);
                this.f60889s = c7044k;
                this.f60887q = false;
            }
            InterfaceC7039f.R0(interfaceC7039f, this.f60891u, abstractC6713l02, this.f60877g, c7044k, null, 0, 48, null);
        }
    }

    public final AbstractC6713l0 e() {
        return this.f60873c;
    }

    public final AbstractC6713l0 g() {
        return this.f60879i;
    }

    public final void h(AbstractC6713l0 abstractC6713l0) {
        this.f60873c = abstractC6713l0;
        c();
    }

    public final void i(float f10) {
        this.f60874d = f10;
        c();
    }

    public final void j(String str) {
        this.f60872b = str;
        c();
    }

    public final void k(List list) {
        this.f60875e = list;
        this.f60886p = true;
        c();
    }

    public final void l(int i10) {
        this.f60876f = i10;
        this.f60891u.h(i10);
        c();
    }

    public final void m(AbstractC6713l0 abstractC6713l0) {
        this.f60879i = abstractC6713l0;
        c();
    }

    public final void n(float f10) {
        this.f60877g = f10;
        c();
    }

    public final void o(int i10) {
        this.f60880j = i10;
        this.f60887q = true;
        c();
    }

    public final void p(int i10) {
        this.f60881k = i10;
        this.f60887q = true;
        c();
    }

    public final void q(float f10) {
        this.f60882l = f10;
        this.f60887q = true;
        c();
    }

    public final void r(float f10) {
        this.f60878h = f10;
        this.f60887q = true;
        c();
    }

    public final void s(float f10) {
        this.f60884n = f10;
        this.f60888r = true;
        c();
    }

    public final void t(float f10) {
        this.f60885o = f10;
        this.f60888r = true;
        c();
    }

    public String toString() {
        return this.f60890t.toString();
    }

    public final void u(float f10) {
        this.f60883m = f10;
        this.f60888r = true;
        c();
    }
}
