package p0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6526b;
import l0.AbstractC6536l;
import l0.C6531g;
import l0.C6533i;
import l0.C6537m;
import m0.AbstractC6670H;
import m0.AbstractC6682S;
import m0.AbstractC6688Y;
import m0.AbstractC6697d0;
import m0.AbstractC6731u0;
import m0.AbstractC6735w0;
import m0.C6683T;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.Q0;
import m0.S0;
import m0.U0;
import m0.d1;
import mh.InterfaceC6835l;
import o0.AbstractC7038e;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7182c {

    /* renamed from: x, reason: collision with root package name */
    public static final a f57384x = new a(null);

    /* renamed from: y, reason: collision with root package name */
    private static final G f57385y;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7183d f57386a;

    /* renamed from: f, reason: collision with root package name */
    private Outline f57391f;

    /* renamed from: h, reason: collision with root package name */
    private long f57393h;

    /* renamed from: i, reason: collision with root package name */
    private long f57394i;

    /* renamed from: j, reason: collision with root package name */
    private float f57395j;

    /* renamed from: k, reason: collision with root package name */
    private Q0 f57396k;

    /* renamed from: l, reason: collision with root package name */
    private U0 f57397l;

    /* renamed from: m, reason: collision with root package name */
    private U0 f57398m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f57399n;

    /* renamed from: o, reason: collision with root package name */
    private S0 f57400o;

    /* renamed from: p, reason: collision with root package name */
    private int f57401p;

    /* renamed from: q, reason: collision with root package name */
    private final C7180a f57402q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f57403r;

    /* renamed from: s, reason: collision with root package name */
    private long f57404s;

    /* renamed from: t, reason: collision with root package name */
    private long f57405t;

    /* renamed from: u, reason: collision with root package name */
    private long f57406u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f57407v;

    /* renamed from: w, reason: collision with root package name */
    private RectF f57408w;

    /* renamed from: b, reason: collision with root package name */
    private Y0.d f57387b = AbstractC7038e.a();

    /* renamed from: c, reason: collision with root package name */
    private Y0.t f57388c = Y0.t.Ltr;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6835l f57389d = C2024c.f57410a;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6835l f57390e = new b();

    /* renamed from: g, reason: collision with root package name */
    private boolean f57392g = true;

    /* renamed from: p0.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: p0.c$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            U0 u02 = C7182c.this.f57397l;
            if (!C7182c.this.f57399n || !C7182c.this.k() || u02 == null) {
                C7182c.this.f57389d.invoke(interfaceC7039f);
                return;
            }
            InterfaceC6835l interfaceC6835l = C7182c.this.f57389d;
            int iB = AbstractC6731u0.f52948a.b();
            InterfaceC7037d interfaceC7037dK1 = interfaceC7039f.k1();
            long jC = interfaceC7037dK1.c();
            interfaceC7037dK1.d().j();
            try {
                interfaceC7037dK1.e().d(u02, iB);
                interfaceC6835l.invoke(interfaceC7039f);
            } finally {
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(jC);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: p0.c$c, reason: collision with other inner class name */
    static final class C2024c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C2024c f57410a = new C2024c();

        C2024c() {
            super(1);
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    static {
        f57385y = F.f57350a.a() ? H.f57352a : Build.VERSION.SDK_INT >= 28 ? J.f57354a : S.f57360a.a() ? I.f57353a : H.f57352a;
    }

    public C7182c(InterfaceC7183d interfaceC7183d, F f10) {
        this.f57386a = interfaceC7183d;
        C6531g.a aVar = C6531g.f52335b;
        this.f57393h = aVar.c();
        this.f57394i = C6537m.f52356b.a();
        this.f57402q = new C7180a();
        interfaceC7183d.G(false);
        this.f57404s = Y0.n.f24536b.a();
        this.f57405t = Y0.r.f24545b.a();
        this.f57406u = aVar.b();
    }

    private final Outline A() {
        Outline outline = this.f57391f;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f57391f = outline2;
        return outline2;
    }

    private final RectF B() {
        RectF rectF = this.f57408w;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f57408w = rectF2;
        return rectF2;
    }

    private final void C() {
        this.f57401p++;
    }

    private final void D() {
        this.f57401p--;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F() {
        /*
            r15 = this;
            p0.a r0 = r15.f57402q
            p0.c r1 = p0.C7180a.b(r0)
            p0.C7180a.g(r0, r1)
            o.I r1 = p0.C7180a.a(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.e()
            if (r2 == 0) goto L28
            o.I r2 = p0.C7180a.c(r0)
            if (r2 != 0) goto L22
            o.I r2 = o.U.a()
            p0.C7180a.f(r0, r2)
        L22:
            r2.j(r1)
            r1.m()
        L28:
            r1 = 1
            p0.C7180a.h(r0, r1)
            p0.d r1 = r15.f57386a
            Y0.d r2 = r15.f57387b
            Y0.t r3 = r15.f57388c
            mh.l r4 = r15.f57390e
            r1.J(r2, r3, r15, r4)
            r1 = 0
            p0.C7180a.h(r0, r1)
            p0.c r2 = p0.C7180a.d(r0)
            if (r2 == 0) goto L44
            r2.D()
        L44:
            o.I r0 = p0.C7180a.c(r0)
            if (r0 == 0) goto L97
            boolean r2 = r0.e()
            if (r2 == 0) goto L97
            java.lang.Object[] r2 = r0.f54929b
            long[] r3 = r0.f54928a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L94
            r5 = r1
        L5a:
            r6 = r3[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8f
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L74:
            if (r10 >= r8) goto L8d
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L89
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            p0.c r11 = (p0.C7182c) r11
            r11.D()
        L89:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L74
        L8d:
            if (r8 != r9) goto L94
        L8f:
            if (r5 == r4) goto L94
            int r5 = r5 + 1
            goto L5a
        L94:
            r0.m()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C7182c.F():void");
    }

    private final void G() {
        if (this.f57386a.q()) {
            return;
        }
        try {
            F();
        } catch (Throwable unused) {
        }
    }

    private final void I() {
        this.f57396k = null;
        this.f57397l = null;
        this.f57394i = C6537m.f52356b.a();
        this.f57393h = C6531g.f52335b.c();
        this.f57395j = 0.0f;
        this.f57392g = true;
        this.f57399n = false;
    }

    private final void Q(long j10, long j11) {
        this.f57386a.y(Y0.n.h(j10), Y0.n.i(j10), j11);
    }

    private final void a0(long j10) {
        if (Y0.r.e(this.f57405t, j10)) {
            return;
        }
        this.f57405t = j10;
        Q(this.f57404s, j10);
        if (this.f57394i == 9205357640488583168L) {
            this.f57392g = true;
            e();
        }
    }

    private final void d(C7182c c7182c) {
        if (this.f57402q.i(c7182c)) {
            c7182c.C();
        }
    }

    private final void e() {
        if (this.f57392g) {
            Outline outline = null;
            if (this.f57407v || u() > 0.0f) {
                U0 u02 = this.f57397l;
                if (u02 != null) {
                    RectF rectFB = B();
                    if (!(u02 instanceof C6683T)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((C6683T) u02).v().computeBounds(rectFB, false);
                    Outline outlineG0 = g0(u02);
                    if (outlineG0 != null) {
                        outlineG0.setAlpha(i());
                        outline = outlineG0;
                    }
                    this.f57386a.v(outline, Y0.s.a(Math.round(rectFB.width()), Math.round(rectFB.height())));
                    if (this.f57399n && this.f57407v) {
                        this.f57386a.G(false);
                        this.f57386a.h();
                    } else {
                        this.f57386a.G(this.f57407v);
                    }
                } else {
                    this.f57386a.G(this.f57407v);
                    C6537m.f52356b.b();
                    Outline outlineA = A();
                    long jD = Y0.s.d(this.f57405t);
                    long j10 = this.f57393h;
                    long j11 = this.f57394i;
                    long j12 = j11 == 9205357640488583168L ? jD : j11;
                    outlineA.setRoundRect(Math.round(C6531g.m(j10)), Math.round(C6531g.n(j10)), Math.round(C6531g.m(j10) + C6537m.i(j12)), Math.round(C6531g.n(j10) + C6537m.g(j12)), this.f57395j);
                    outlineA.setAlpha(i());
                    this.f57386a.v(outlineA, Y0.s.c(j12));
                }
            } else {
                this.f57386a.G(false);
                this.f57386a.v(null, Y0.r.f24545b.a());
            }
        }
        this.f57392g = false;
    }

    private final void f() {
        if (this.f57403r && this.f57401p == 0) {
            g();
        }
    }

    private final void f0(Canvas canvas) {
        float fH = Y0.n.h(this.f57404s);
        float fI = Y0.n.i(this.f57404s);
        float fH2 = Y0.n.h(this.f57404s) + Y0.r.g(this.f57405t);
        float fI2 = Y0.n.i(this.f57404s) + Y0.r.f(this.f57405t);
        float fI3 = i();
        AbstractC6735w0 abstractC6735w0L = l();
        int iJ = j();
        if (fI3 < 1.0f || !AbstractC6697d0.E(iJ, AbstractC6697d0.f52884a.B()) || abstractC6735w0L != null || AbstractC7181b.e(m(), AbstractC7181b.f57380a.c())) {
            S0 s0A = this.f57400o;
            if (s0A == null) {
                s0A = AbstractC6682S.a();
                this.f57400o = s0A;
            }
            s0A.a(fI3);
            s0A.v(iJ);
            s0A.D(abstractC6735w0L);
            canvas.saveLayer(fH, fI, fH2, fI2, s0A.x());
        } else {
            canvas.save();
        }
        canvas.translate(fH, fI);
        canvas.concat(this.f57386a.M());
    }

    private final Outline g0(U0 u02) {
        Outline outline;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || u02.c()) {
            Outline outlineA = A();
            if (i10 >= 30) {
                M.f57356a.a(outlineA, u02);
            } else {
                if (!(u02 instanceof C6683T)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineA.setConvexPath(((C6683T) u02).v());
            }
            this.f57399n = !outlineA.canClip();
            outline = outlineA;
        } else {
            Outline outline2 = this.f57391f;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.f57399n = true;
            this.f57386a.s(true);
            outline = null;
        }
        this.f57397l = u02;
        return outline;
    }

    public final void E(Y0.d dVar, Y0.t tVar, long j10, InterfaceC6835l interfaceC6835l) {
        a0(j10);
        this.f57387b = dVar;
        this.f57388c = tVar;
        this.f57389d = interfaceC6835l;
        this.f57386a.s(true);
        F();
    }

    public final void H() {
        if (this.f57403r) {
            return;
        }
        this.f57403r = true;
        f();
    }

    public final void J(float f10) {
        if (this.f57386a.b() == f10) {
            return;
        }
        this.f57386a.a(f10);
    }

    public final void K(long j10) {
        if (C6733v0.m(j10, this.f57386a.A())) {
            return;
        }
        this.f57386a.D(j10);
    }

    public final void L(float f10) {
        if (this.f57386a.E() == f10) {
            return;
        }
        this.f57386a.l(f10);
    }

    public final void M(boolean z10) {
        if (this.f57407v != z10) {
            this.f57407v = z10;
            this.f57392g = true;
            e();
        }
    }

    public final void N(int i10) {
        if (AbstractC7181b.e(this.f57386a.x(), i10)) {
            return;
        }
        this.f57386a.L(i10);
    }

    public final void O(U0 u02) {
        I();
        this.f57397l = u02;
        e();
    }

    public final void P(long j10) {
        if (C6531g.j(this.f57406u, j10)) {
            return;
        }
        this.f57406u = j10;
        this.f57386a.z(j10);
    }

    public final void R(long j10, long j11) {
        W(j10, j11, 0.0f);
    }

    public final void S(d1 d1Var) {
        this.f57386a.t();
        if (AbstractC6492s.d(null, d1Var)) {
            return;
        }
        this.f57386a.k(d1Var);
    }

    public final void T(float f10) {
        if (this.f57386a.H() == f10) {
            return;
        }
        this.f57386a.m(f10);
    }

    public final void U(float f10) {
        if (this.f57386a.u() == f10) {
            return;
        }
        this.f57386a.d(f10);
    }

    public final void V(float f10) {
        if (this.f57386a.w() == f10) {
            return;
        }
        this.f57386a.e(f10);
    }

    public final void W(long j10, long j11, float f10) {
        if (C6531g.j(this.f57393h, j10) && C6537m.f(this.f57394i, j11) && this.f57395j == f10 && this.f57397l == null) {
            return;
        }
        I();
        this.f57393h = j10;
        this.f57394i = j11;
        this.f57395j = f10;
        e();
    }

    public final void X(float f10) {
        if (this.f57386a.n() == f10) {
            return;
        }
        this.f57386a.i(f10);
    }

    public final void Y(float f10) {
        if (this.f57386a.K() == f10) {
            return;
        }
        this.f57386a.g(f10);
    }

    public final void Z(float f10) {
        if (this.f57386a.N() == f10) {
            return;
        }
        this.f57386a.o(f10);
        this.f57392g = true;
        e();
    }

    public final void b0(long j10) {
        if (C6733v0.m(j10, this.f57386a.B())) {
            return;
        }
        this.f57386a.I(j10);
    }

    public final void c0(long j10) {
        if (Y0.n.g(this.f57404s, j10)) {
            return;
        }
        this.f57404s = j10;
        Q(j10, this.f57405t);
    }

    public final void d0(float f10) {
        if (this.f57386a.F() == f10) {
            return;
        }
        this.f57386a.j(f10);
    }

    public final void e0(float f10) {
        if (this.f57386a.C() == f10) {
            return;
        }
        this.f57386a.f(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r15 = this;
            p0.a r0 = r15.f57402q
            p0.c r1 = p0.C7180a.b(r0)
            if (r1 == 0) goto Lf
            r1.D()
            r1 = 0
            p0.C7180a.e(r0, r1)
        Lf:
            o.I r0 = p0.C7180a.a(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.f54929b
            long[] r2 = r0.f54928a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            p0.c r11 = (p0.C7182c) r11
            r11.D()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.m()
        L5d:
            p0.d r0 = r15.f57386a
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C7182c.g():void");
    }

    public final void h(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        if (this.f57403r) {
            return;
        }
        e();
        G();
        boolean z10 = u() > 0.0f;
        if (z10) {
            interfaceC6717n0.y();
        }
        Canvas canvasD = AbstractC6670H.d(interfaceC6717n0);
        boolean zIsHardwareAccelerated = canvasD.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            canvasD.save();
            f0(canvasD);
        }
        boolean z11 = !zIsHardwareAccelerated && this.f57407v;
        if (z11) {
            interfaceC6717n0.j();
            Q0 q0N = n();
            if (q0N instanceof Q0.b) {
                InterfaceC6717n0.o(interfaceC6717n0, q0N.a(), 0, 2, null);
            } else if (q0N instanceof Q0.c) {
                U0 u0A = this.f57398m;
                if (u0A != null) {
                    u0A.q();
                } else {
                    u0A = AbstractC6688Y.a();
                    this.f57398m = u0A;
                }
                U0.t(u0A, ((Q0.c) q0N).b(), null, 2, null);
                InterfaceC6717n0.t(interfaceC6717n0, u0A, 0, 2, null);
            } else if (q0N instanceof Q0.a) {
                InterfaceC6717n0.t(interfaceC6717n0, ((Q0.a) q0N).b(), 0, 2, null);
            }
        }
        if (c7182c != null) {
            c7182c.d(this);
        }
        this.f57386a.c(interfaceC6717n0);
        if (z11) {
            interfaceC6717n0.r();
        }
        if (z10) {
            interfaceC6717n0.k();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasD.restore();
    }

    public final float i() {
        return this.f57386a.b();
    }

    public final int j() {
        return this.f57386a.r();
    }

    public final boolean k() {
        return this.f57407v;
    }

    public final AbstractC6735w0 l() {
        return this.f57386a.p();
    }

    public final int m() {
        return this.f57386a.x();
    }

    public final Q0 n() {
        Q0 q02 = this.f57396k;
        U0 u02 = this.f57397l;
        if (q02 != null) {
            return q02;
        }
        if (u02 != null) {
            Q0.a aVar = new Q0.a(u02);
            this.f57396k = aVar;
            return aVar;
        }
        long jD = Y0.s.d(this.f57405t);
        long j10 = this.f57393h;
        long j11 = this.f57394i;
        if (j11 != 9205357640488583168L) {
            jD = j11;
        }
        float fM = C6531g.m(j10);
        float fN = C6531g.n(j10);
        float fI = fM + C6537m.i(jD);
        float fG = fN + C6537m.g(jD);
        float f10 = this.f57395j;
        Q0 cVar = f10 > 0.0f ? new Q0.c(AbstractC6536l.d(fM, fN, fI, fG, AbstractC6526b.b(f10, 0.0f, 2, null))) : new Q0.b(new C6533i(fM, fN, fI, fG));
        this.f57396k = cVar;
        return cVar;
    }

    public final long o() {
        return this.f57406u;
    }

    public final float p() {
        return this.f57386a.H();
    }

    public final float q() {
        return this.f57386a.u();
    }

    public final float r() {
        return this.f57386a.w();
    }

    public final float s() {
        return this.f57386a.n();
    }

    public final float t() {
        return this.f57386a.K();
    }

    public final float u() {
        return this.f57386a.N();
    }

    public final long v() {
        return this.f57405t;
    }

    public final long w() {
        return this.f57404s;
    }

    public final float x() {
        return this.f57386a.F();
    }

    public final float y() {
        return this.f57386a.C();
    }

    public final boolean z() {
        return this.f57403r;
    }
}
