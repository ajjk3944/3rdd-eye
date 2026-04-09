package p0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import m0.AbstractC6670H;
import m0.AbstractC6697d0;
import m0.AbstractC6735w0;
import m0.AbstractC6737x0;
import m0.C6668G;
import m0.C6719o0;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.d1;
import mh.InterfaceC6835l;
import o0.C7034a;
import p0.AbstractC7181b;
import q0.AbstractC7408a;

/* loaded from: classes.dex */
public final class E implements InterfaceC7183d {

    /* renamed from: J, reason: collision with root package name */
    public static final b f57313J = new b(null);

    /* renamed from: K, reason: collision with root package name */
    private static final boolean f57314K = !S.f57360a.a();

    /* renamed from: L, reason: collision with root package name */
    private static final Canvas f57315L = new a();

    /* renamed from: A, reason: collision with root package name */
    private float f57316A;

    /* renamed from: B, reason: collision with root package name */
    private float f57317B;

    /* renamed from: C, reason: collision with root package name */
    private float f57318C;

    /* renamed from: D, reason: collision with root package name */
    private float f57319D;

    /* renamed from: E, reason: collision with root package name */
    private long f57320E;

    /* renamed from: F, reason: collision with root package name */
    private long f57321F;

    /* renamed from: G, reason: collision with root package name */
    private float f57322G;

    /* renamed from: H, reason: collision with root package name */
    private float f57323H;

    /* renamed from: I, reason: collision with root package name */
    private float f57324I;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7408a f57325b;

    /* renamed from: c, reason: collision with root package name */
    private final long f57326c;

    /* renamed from: d, reason: collision with root package name */
    private final C6719o0 f57327d;

    /* renamed from: e, reason: collision with root package name */
    private final T f57328e;

    /* renamed from: f, reason: collision with root package name */
    private final Resources f57329f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f57330g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f57331h;

    /* renamed from: i, reason: collision with root package name */
    private final Picture f57332i;

    /* renamed from: j, reason: collision with root package name */
    private final C7034a f57333j;

    /* renamed from: k, reason: collision with root package name */
    private final C6719o0 f57334k;

    /* renamed from: l, reason: collision with root package name */
    private int f57335l;

    /* renamed from: m, reason: collision with root package name */
    private int f57336m;

    /* renamed from: n, reason: collision with root package name */
    private long f57337n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f57338o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f57339p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f57340q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f57341r;

    /* renamed from: s, reason: collision with root package name */
    private final long f57342s;

    /* renamed from: t, reason: collision with root package name */
    private int f57343t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC6735w0 f57344u;

    /* renamed from: v, reason: collision with root package name */
    private int f57345v;

    /* renamed from: w, reason: collision with root package name */
    private float f57346w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f57347x;

    /* renamed from: y, reason: collision with root package name */
    private long f57348y;

    /* renamed from: z, reason: collision with root package name */
    private float f57349z;

    public static final class a extends Canvas {
        a() {
        }

        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public E(AbstractC7408a abstractC7408a, long j10, C6719o0 c6719o0, C7034a c7034a) {
        this.f57325b = abstractC7408a;
        this.f57326c = j10;
        this.f57327d = c6719o0;
        T t10 = new T(abstractC7408a, c6719o0, c7034a);
        this.f57328e = t10;
        this.f57329f = abstractC7408a.getResources();
        this.f57330g = new Rect();
        boolean z10 = f57314K;
        this.f57332i = z10 ? new Picture() : null;
        this.f57333j = z10 ? new C7034a() : null;
        this.f57334k = z10 ? new C6719o0() : null;
        abstractC7408a.addView(t10);
        t10.setClipBounds(null);
        this.f57337n = Y0.r.f24545b.a();
        this.f57339p = true;
        this.f57342s = View.generateViewId();
        this.f57343t = AbstractC6697d0.f52884a.B();
        this.f57345v = AbstractC7181b.f57380a.a();
        this.f57346w = 1.0f;
        this.f57348y = C6531g.f52335b.c();
        this.f57349z = 1.0f;
        this.f57316A = 1.0f;
        C6733v0.a aVar = C6733v0.f52951b;
        this.f57320E = aVar.a();
        this.f57321F = aVar.a();
    }

    private final void O(int i10) {
        T t10 = this.f57328e;
        AbstractC7181b.a aVar = AbstractC7181b.f57380a;
        boolean z10 = true;
        if (AbstractC7181b.e(i10, aVar.c())) {
            this.f57328e.setLayerType(2, this.f57331h);
        } else if (AbstractC7181b.e(i10, aVar.b())) {
            this.f57328e.setLayerType(0, this.f57331h);
            z10 = false;
        } else {
            this.f57328e.setLayerType(0, this.f57331h);
        }
        t10.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    private final void Q() {
        try {
            C6719o0 c6719o0 = this.f57327d;
            Canvas canvas = f57315L;
            Canvas canvasA = c6719o0.a().a();
            c6719o0.a().z(canvas);
            C6668G c6668gA = c6719o0.a();
            AbstractC7408a abstractC7408a = this.f57325b;
            T t10 = this.f57328e;
            abstractC7408a.a(c6668gA, t10, t10.getDrawingTime());
            c6719o0.a().z(canvasA);
        } catch (Throwable unused) {
        }
    }

    private final boolean R() {
        return AbstractC7181b.e(x(), AbstractC7181b.f57380a.c()) || S();
    }

    private final boolean S() {
        return (AbstractC6697d0.E(r(), AbstractC6697d0.f52884a.B()) && p() == null) ? false : true;
    }

    private final void T() {
        Rect rect;
        if (this.f57338o) {
            T t10 = this.f57328e;
            if (!P() || this.f57340q) {
                rect = null;
            } else {
                rect = this.f57330g;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.f57328e.getWidth();
                rect.bottom = this.f57328e.getHeight();
            }
            t10.setClipBounds(rect);
        }
    }

    private final void U() {
        if (R()) {
            O(AbstractC7181b.f57380a.c());
        } else {
            O(x());
        }
    }

    @Override // p0.InterfaceC7183d
    public long A() {
        return this.f57320E;
    }

    @Override // p0.InterfaceC7183d
    public long B() {
        return this.f57321F;
    }

    @Override // p0.InterfaceC7183d
    public float C() {
        return this.f57318C;
    }

    @Override // p0.InterfaceC7183d
    public void D(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f57320E = j10;
            X.f57373a.b(this.f57328e, AbstractC6737x0.j(j10));
        }
    }

    @Override // p0.InterfaceC7183d
    public float E() {
        return this.f57328e.getCameraDistance() / this.f57329f.getDisplayMetrics().densityDpi;
    }

    @Override // p0.InterfaceC7183d
    public float F() {
        return this.f57317B;
    }

    @Override // p0.InterfaceC7183d
    public void G(boolean z10) {
        boolean z11 = false;
        this.f57341r = z10 && !this.f57340q;
        this.f57338o = true;
        T t10 = this.f57328e;
        if (z10 && this.f57340q) {
            z11 = true;
        }
        t10.setClipToOutline(z11);
    }

    @Override // p0.InterfaceC7183d
    public float H() {
        return this.f57322G;
    }

    @Override // p0.InterfaceC7183d
    public void I(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f57321F = j10;
            X.f57373a.c(this.f57328e, AbstractC6737x0.j(j10));
        }
    }

    @Override // p0.InterfaceC7183d
    public void J(Y0.d dVar, Y0.t tVar, C7182c c7182c, InterfaceC6835l interfaceC6835l) {
        C6719o0 c6719o0;
        Canvas canvas;
        if (this.f57328e.getParent() == null) {
            this.f57325b.addView(this.f57328e);
        }
        this.f57328e.b(dVar, tVar, c7182c, interfaceC6835l);
        if (this.f57328e.isAttachedToWindow()) {
            this.f57328e.setVisibility(4);
            this.f57328e.setVisibility(0);
            Q();
            Picture picture = this.f57332i;
            if (picture != null) {
                Canvas canvasBeginRecording = picture.beginRecording(Y0.r.g(this.f57337n), Y0.r.f(this.f57337n));
                try {
                    C6719o0 c6719o02 = this.f57334k;
                    if (c6719o02 != null) {
                        Canvas canvasA = c6719o02.a().a();
                        c6719o02.a().z(canvasBeginRecording);
                        C6668G c6668gA = c6719o02.a();
                        C7034a c7034a = this.f57333j;
                        if (c7034a != null) {
                            long jD = Y0.s.d(this.f57337n);
                            C7034a.C1996a c1996aB = c7034a.B();
                            Y0.d dVarA = c1996aB.a();
                            Y0.t tVarB = c1996aB.b();
                            InterfaceC6717n0 interfaceC6717n0C = c1996aB.c();
                            c6719o0 = c6719o02;
                            canvas = canvasA;
                            long jD2 = c1996aB.d();
                            C7034a.C1996a c1996aB2 = c7034a.B();
                            c1996aB2.j(dVar);
                            c1996aB2.k(tVar);
                            c1996aB2.i(c6668gA);
                            c1996aB2.l(jD);
                            c6668gA.j();
                            interfaceC6835l.invoke(c7034a);
                            c6668gA.r();
                            C7034a.C1996a c1996aB3 = c7034a.B();
                            c1996aB3.j(dVarA);
                            c1996aB3.k(tVarB);
                            c1996aB3.i(interfaceC6717n0C);
                            c1996aB3.l(jD2);
                        } else {
                            c6719o0 = c6719o02;
                            canvas = canvasA;
                        }
                        c6719o0.a().z(canvas);
                        Yg.J j10 = Yg.J.f24997a;
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }

    @Override // p0.InterfaceC7183d
    public float K() {
        return this.f57316A;
    }

    @Override // p0.InterfaceC7183d
    public void L(int i10) {
        this.f57345v = i10;
        U();
    }

    @Override // p0.InterfaceC7183d
    public Matrix M() {
        return this.f57328e.getMatrix();
    }

    @Override // p0.InterfaceC7183d
    public float N() {
        return this.f57319D;
    }

    public boolean P() {
        return this.f57341r || this.f57328e.getClipToOutline();
    }

    @Override // p0.InterfaceC7183d
    public void a(float f10) {
        this.f57346w = f10;
        this.f57328e.setAlpha(f10);
    }

    @Override // p0.InterfaceC7183d
    public float b() {
        return this.f57346w;
    }

    @Override // p0.InterfaceC7183d
    public void c(InterfaceC6717n0 interfaceC6717n0) {
        T();
        Canvas canvasD = AbstractC6670H.d(interfaceC6717n0);
        if (canvasD.isHardwareAccelerated()) {
            AbstractC7408a abstractC7408a = this.f57325b;
            T t10 = this.f57328e;
            abstractC7408a.a(interfaceC6717n0, t10, t10.getDrawingTime());
        } else {
            Picture picture = this.f57332i;
            if (picture != null) {
                canvasD.drawPicture(picture);
            }
        }
    }

    @Override // p0.InterfaceC7183d
    public void d(float f10) {
        this.f57323H = f10;
        this.f57328e.setRotationY(f10);
    }

    @Override // p0.InterfaceC7183d
    public void e(float f10) {
        this.f57324I = f10;
        this.f57328e.setRotation(f10);
    }

    @Override // p0.InterfaceC7183d
    public void f(float f10) {
        this.f57318C = f10;
        this.f57328e.setTranslationY(f10);
    }

    @Override // p0.InterfaceC7183d
    public void g(float f10) {
        this.f57316A = f10;
        this.f57328e.setScaleY(f10);
    }

    @Override // p0.InterfaceC7183d
    public void h() {
        this.f57325b.removeViewInLayout(this.f57328e);
    }

    @Override // p0.InterfaceC7183d
    public void i(float f10) {
        this.f57349z = f10;
        this.f57328e.setScaleX(f10);
    }

    @Override // p0.InterfaceC7183d
    public void j(float f10) {
        this.f57317B = f10;
        this.f57328e.setTranslationX(f10);
    }

    @Override // p0.InterfaceC7183d
    public void k(d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            Z.f57374a.a(this.f57328e, d1Var);
        }
    }

    @Override // p0.InterfaceC7183d
    public void l(float f10) {
        this.f57328e.setCameraDistance(f10 * this.f57329f.getDisplayMetrics().densityDpi);
    }

    @Override // p0.InterfaceC7183d
    public void m(float f10) {
        this.f57322G = f10;
        this.f57328e.setRotationX(f10);
    }

    @Override // p0.InterfaceC7183d
    public float n() {
        return this.f57349z;
    }

    @Override // p0.InterfaceC7183d
    public void o(float f10) {
        this.f57319D = f10;
        this.f57328e.setElevation(f10);
    }

    @Override // p0.InterfaceC7183d
    public AbstractC6735w0 p() {
        return this.f57344u;
    }

    @Override // p0.InterfaceC7183d
    public int r() {
        return this.f57343t;
    }

    @Override // p0.InterfaceC7183d
    public void s(boolean z10) {
        this.f57339p = z10;
    }

    @Override // p0.InterfaceC7183d
    public d1 t() {
        return null;
    }

    @Override // p0.InterfaceC7183d
    public float u() {
        return this.f57323H;
    }

    @Override // p0.InterfaceC7183d
    public void v(Outline outline, long j10) {
        boolean zC = this.f57328e.c(outline);
        if (P() && outline != null) {
            this.f57328e.setClipToOutline(true);
            if (this.f57341r) {
                this.f57341r = false;
                this.f57338o = true;
            }
        }
        this.f57340q = outline != null;
        if (zC) {
            return;
        }
        this.f57328e.invalidate();
        Q();
    }

    @Override // p0.InterfaceC7183d
    public float w() {
        return this.f57324I;
    }

    @Override // p0.InterfaceC7183d
    public int x() {
        return this.f57345v;
    }

    @Override // p0.InterfaceC7183d
    public void y(int i10, int i11, long j10) {
        if (Y0.r.e(this.f57337n, j10)) {
            int i12 = this.f57335l;
            if (i12 != i10) {
                this.f57328e.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f57336m;
            if (i13 != i11) {
                this.f57328e.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (P()) {
                this.f57338o = true;
            }
            this.f57328e.layout(i10, i11, Y0.r.g(j10) + i10, Y0.r.f(j10) + i11);
            this.f57337n = j10;
            if (this.f57347x) {
                this.f57328e.setPivotX(Y0.r.g(j10) / 2.0f);
                this.f57328e.setPivotY(Y0.r.f(j10) / 2.0f);
            }
        }
        this.f57335l = i10;
        this.f57336m = i11;
    }

    @Override // p0.InterfaceC7183d
    public void z(long j10) {
        this.f57348y = j10;
        if (!AbstractC6532h.d(j10)) {
            this.f57347x = false;
            this.f57328e.setPivotX(C6531g.m(j10));
            this.f57328e.setPivotY(C6531g.n(j10));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                X.f57373a.a(this.f57328e);
                return;
            }
            this.f57347x = true;
            this.f57328e.setPivotX(Y0.r.g(this.f57337n) / 2.0f);
            this.f57328e.setPivotY(Y0.r.f(this.f57337n) / 2.0f);
        }
    }

    public /* synthetic */ E(AbstractC7408a abstractC7408a, long j10, C6719o0 c6719o0, C7034a c7034a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7408a, j10, (i10 & 4) != 0 ? new C6719o0() : c6719o0, (i10 & 8) != 0 ? new C7034a() : c7034a);
    }
}
