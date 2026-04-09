package p0;

import Y0.r;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6492s;
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
import o0.InterfaceC7037d;
import p0.AbstractC7181b;

/* renamed from: p0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7185f implements InterfaceC7183d {

    /* renamed from: G, reason: collision with root package name */
    private static boolean f57416G;

    /* renamed from: A, reason: collision with root package name */
    private float f57418A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f57419B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f57420C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f57421D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f57422E;

    /* renamed from: b, reason: collision with root package name */
    private final long f57423b;

    /* renamed from: c, reason: collision with root package name */
    private final C6719o0 f57424c;

    /* renamed from: d, reason: collision with root package name */
    private final C7034a f57425d;

    /* renamed from: e, reason: collision with root package name */
    private final RenderNode f57426e;

    /* renamed from: f, reason: collision with root package name */
    private long f57427f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f57428g;

    /* renamed from: h, reason: collision with root package name */
    private Matrix f57429h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f57430i;

    /* renamed from: j, reason: collision with root package name */
    private long f57431j;

    /* renamed from: k, reason: collision with root package name */
    private int f57432k;

    /* renamed from: l, reason: collision with root package name */
    private int f57433l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC6735w0 f57434m;

    /* renamed from: n, reason: collision with root package name */
    private float f57435n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f57436o;

    /* renamed from: p, reason: collision with root package name */
    private long f57437p;

    /* renamed from: q, reason: collision with root package name */
    private float f57438q;

    /* renamed from: r, reason: collision with root package name */
    private float f57439r;

    /* renamed from: s, reason: collision with root package name */
    private float f57440s;

    /* renamed from: t, reason: collision with root package name */
    private float f57441t;

    /* renamed from: u, reason: collision with root package name */
    private float f57442u;

    /* renamed from: v, reason: collision with root package name */
    private long f57443v;

    /* renamed from: w, reason: collision with root package name */
    private long f57444w;

    /* renamed from: x, reason: collision with root package name */
    private float f57445x;

    /* renamed from: y, reason: collision with root package name */
    private float f57446y;

    /* renamed from: z, reason: collision with root package name */
    private float f57447z;

    /* renamed from: F, reason: collision with root package name */
    public static final a f57415F = new a(null);

    /* renamed from: H, reason: collision with root package name */
    private static final AtomicBoolean f57417H = new AtomicBoolean(true);

    /* renamed from: p0.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7185f(View view, long j10, C6719o0 c6719o0, C7034a c7034a) {
        this.f57423b = j10;
        this.f57424c = c6719o0;
        this.f57425d = c7034a;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.f57426e = renderNodeCreate;
        r.a aVar = Y0.r.f24545b;
        this.f57427f = aVar.a();
        this.f57431j = aVar.a();
        if (f57417H.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            U(renderNodeCreate);
            Q();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (f57416G) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        AbstractC7181b.a aVar2 = AbstractC7181b.f57380a;
        P(aVar2.a());
        this.f57432k = aVar2.a();
        this.f57433l = AbstractC6697d0.f52884a.B();
        this.f57435n = 1.0f;
        this.f57437p = C6531g.f52335b.b();
        this.f57438q = 1.0f;
        this.f57439r = 1.0f;
        C6733v0.a aVar3 = C6733v0.f52951b;
        this.f57443v = aVar3.a();
        this.f57444w = aVar3.a();
        this.f57418A = 8.0f;
        this.f57422E = true;
    }

    private final void O() {
        boolean z10 = false;
        boolean z11 = R() && !this.f57430i;
        if (R() && this.f57430i) {
            z10 = true;
        }
        if (z11 != this.f57420C) {
            this.f57420C = z11;
            this.f57426e.setClipToBounds(z11);
        }
        if (z10 != this.f57421D) {
            this.f57421D = z10;
            this.f57426e.setClipToOutline(z10);
        }
    }

    private final void P(int i10) {
        RenderNode renderNode = this.f57426e;
        AbstractC7181b.a aVar = AbstractC7181b.f57380a;
        if (AbstractC7181b.e(i10, aVar.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f57428g);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC7181b.e(i10, aVar.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f57428g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f57428g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean S() {
        return (!AbstractC7181b.e(x(), AbstractC7181b.f57380a.c()) && AbstractC6697d0.E(r(), AbstractC6697d0.f52884a.B()) && p() == null) ? false : true;
    }

    private final void T() {
        if (S()) {
            P(AbstractC7181b.f57380a.c());
        } else {
            P(x());
        }
    }

    private final void U(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            P p10 = P.f57358a;
            p10.c(renderNode, p10.a(renderNode));
            p10.d(renderNode, p10.b(renderNode));
        }
    }

    @Override // p0.InterfaceC7183d
    public long A() {
        return this.f57443v;
    }

    @Override // p0.InterfaceC7183d
    public long B() {
        return this.f57444w;
    }

    @Override // p0.InterfaceC7183d
    public float C() {
        return this.f57441t;
    }

    @Override // p0.InterfaceC7183d
    public void D(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f57443v = j10;
            P.f57358a.c(this.f57426e, AbstractC6737x0.j(j10));
        }
    }

    @Override // p0.InterfaceC7183d
    public float E() {
        return this.f57418A;
    }

    @Override // p0.InterfaceC7183d
    public float F() {
        return this.f57440s;
    }

    @Override // p0.InterfaceC7183d
    public void G(boolean z10) {
        this.f57419B = z10;
        O();
    }

    @Override // p0.InterfaceC7183d
    public float H() {
        return this.f57445x;
    }

    @Override // p0.InterfaceC7183d
    public void I(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f57444w = j10;
            P.f57358a.d(this.f57426e, AbstractC6737x0.j(j10));
        }
    }

    @Override // p0.InterfaceC7183d
    public void J(Y0.d dVar, Y0.t tVar, C7182c c7182c, InterfaceC6835l interfaceC6835l) {
        Canvas canvasStart = this.f57426e.start(Math.max(Y0.r.g(this.f57427f), Y0.r.g(this.f57431j)), Math.max(Y0.r.f(this.f57427f), Y0.r.f(this.f57431j)));
        try {
            C6719o0 c6719o0 = this.f57424c;
            Canvas canvasA = c6719o0.a().a();
            c6719o0.a().z(canvasStart);
            C6668G c6668gA = c6719o0.a();
            C7034a c7034a = this.f57425d;
            long jD = Y0.s.d(this.f57427f);
            Y0.d density = c7034a.k1().getDensity();
            Y0.t layoutDirection = c7034a.k1().getLayoutDirection();
            InterfaceC6717n0 interfaceC6717n0D = c7034a.k1().d();
            long jC = c7034a.k1().c();
            C7182c c7182cG = c7034a.k1().g();
            InterfaceC7037d interfaceC7037dK1 = c7034a.k1();
            interfaceC7037dK1.a(dVar);
            interfaceC7037dK1.b(tVar);
            interfaceC7037dK1.i(c6668gA);
            interfaceC7037dK1.f(jD);
            interfaceC7037dK1.h(c7182c);
            c6668gA.j();
            try {
                interfaceC6835l.invoke(c7034a);
                c6668gA.r();
                InterfaceC7037d interfaceC7037dK12 = c7034a.k1();
                interfaceC7037dK12.a(density);
                interfaceC7037dK12.b(layoutDirection);
                interfaceC7037dK12.i(interfaceC6717n0D);
                interfaceC7037dK12.f(jC);
                interfaceC7037dK12.h(c7182cG);
                c6719o0.a().z(canvasA);
                this.f57426e.end(canvasStart);
                s(false);
            } catch (Throwable th2) {
                c6668gA.r();
                InterfaceC7037d interfaceC7037dK13 = c7034a.k1();
                interfaceC7037dK13.a(density);
                interfaceC7037dK13.b(layoutDirection);
                interfaceC7037dK13.i(interfaceC6717n0D);
                interfaceC7037dK13.f(jC);
                interfaceC7037dK13.h(c7182cG);
                throw th2;
            }
        } catch (Throwable th3) {
            this.f57426e.end(canvasStart);
            throw th3;
        }
    }

    @Override // p0.InterfaceC7183d
    public float K() {
        return this.f57439r;
    }

    @Override // p0.InterfaceC7183d
    public void L(int i10) {
        this.f57432k = i10;
        T();
    }

    @Override // p0.InterfaceC7183d
    public Matrix M() {
        Matrix matrix = this.f57429h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f57429h = matrix;
        }
        this.f57426e.getMatrix(matrix);
        return matrix;
    }

    @Override // p0.InterfaceC7183d
    public float N() {
        return this.f57442u;
    }

    public final void Q() {
        O.f57357a.a(this.f57426e);
    }

    public boolean R() {
        return this.f57419B;
    }

    @Override // p0.InterfaceC7183d
    public void a(float f10) {
        this.f57435n = f10;
        this.f57426e.setAlpha(f10);
    }

    @Override // p0.InterfaceC7183d
    public float b() {
        return this.f57435n;
    }

    @Override // p0.InterfaceC7183d
    public void c(InterfaceC6717n0 interfaceC6717n0) {
        DisplayListCanvas displayListCanvasD = AbstractC6670H.d(interfaceC6717n0);
        AbstractC6492s.g(displayListCanvasD, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasD.drawRenderNode(this.f57426e);
    }

    @Override // p0.InterfaceC7183d
    public void d(float f10) {
        this.f57446y = f10;
        this.f57426e.setRotationY(f10);
    }

    @Override // p0.InterfaceC7183d
    public void e(float f10) {
        this.f57447z = f10;
        this.f57426e.setRotation(f10);
    }

    @Override // p0.InterfaceC7183d
    public void f(float f10) {
        this.f57441t = f10;
        this.f57426e.setTranslationY(f10);
    }

    @Override // p0.InterfaceC7183d
    public void g(float f10) {
        this.f57439r = f10;
        this.f57426e.setScaleY(f10);
    }

    @Override // p0.InterfaceC7183d
    public void h() {
        Q();
    }

    @Override // p0.InterfaceC7183d
    public void i(float f10) {
        this.f57438q = f10;
        this.f57426e.setScaleX(f10);
    }

    @Override // p0.InterfaceC7183d
    public void j(float f10) {
        this.f57440s = f10;
        this.f57426e.setTranslationX(f10);
    }

    @Override // p0.InterfaceC7183d
    public void k(d1 d1Var) {
    }

    @Override // p0.InterfaceC7183d
    public void l(float f10) {
        this.f57418A = f10;
        this.f57426e.setCameraDistance(-f10);
    }

    @Override // p0.InterfaceC7183d
    public void m(float f10) {
        this.f57445x = f10;
        this.f57426e.setRotationX(f10);
    }

    @Override // p0.InterfaceC7183d
    public float n() {
        return this.f57438q;
    }

    @Override // p0.InterfaceC7183d
    public void o(float f10) {
        this.f57442u = f10;
        this.f57426e.setElevation(f10);
    }

    @Override // p0.InterfaceC7183d
    public AbstractC6735w0 p() {
        return this.f57434m;
    }

    @Override // p0.InterfaceC7183d
    public boolean q() {
        return this.f57426e.isValid();
    }

    @Override // p0.InterfaceC7183d
    public int r() {
        return this.f57433l;
    }

    @Override // p0.InterfaceC7183d
    public void s(boolean z10) {
        this.f57422E = z10;
    }

    @Override // p0.InterfaceC7183d
    public d1 t() {
        return null;
    }

    @Override // p0.InterfaceC7183d
    public float u() {
        return this.f57446y;
    }

    @Override // p0.InterfaceC7183d
    public void v(Outline outline, long j10) {
        this.f57431j = j10;
        this.f57426e.setOutline(outline);
        this.f57430i = outline != null;
        O();
    }

    @Override // p0.InterfaceC7183d
    public float w() {
        return this.f57447z;
    }

    @Override // p0.InterfaceC7183d
    public int x() {
        return this.f57432k;
    }

    @Override // p0.InterfaceC7183d
    public void y(int i10, int i11, long j10) {
        this.f57426e.setLeftTopRightBottom(i10, i11, Y0.r.g(j10) + i10, Y0.r.f(j10) + i11);
        if (Y0.r.e(this.f57427f, j10)) {
            return;
        }
        if (this.f57436o) {
            this.f57426e.setPivotX(Y0.r.g(j10) / 2.0f);
            this.f57426e.setPivotY(Y0.r.f(j10) / 2.0f);
        }
        this.f57427f = j10;
    }

    @Override // p0.InterfaceC7183d
    public void z(long j10) {
        this.f57437p = j10;
        if (AbstractC6532h.d(j10)) {
            this.f57436o = true;
            this.f57426e.setPivotX(Y0.r.g(this.f57427f) / 2.0f);
            this.f57426e.setPivotY(Y0.r.f(this.f57427f) / 2.0f);
        } else {
            this.f57436o = false;
            this.f57426e.setPivotX(C6531g.m(j10));
            this.f57426e.setPivotY(C6531g.n(j10));
        }
    }

    public /* synthetic */ C7185f(View view, long j10, C6719o0 c6719o0, C7034a c7034a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j10, (i10 & 4) != 0 ? new C6719o0() : c6719o0, (i10 & 8) != 0 ? new C7034a() : c7034a);
    }
}
