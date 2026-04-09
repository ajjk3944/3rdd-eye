package p0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6537m;
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
import s.AbstractC7855p;

/* loaded from: classes.dex */
public final class D implements InterfaceC7183d {

    /* renamed from: A, reason: collision with root package name */
    private boolean f57285A;

    /* renamed from: B, reason: collision with root package name */
    private int f57286B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f57287C;

    /* renamed from: b, reason: collision with root package name */
    private final long f57288b;

    /* renamed from: c, reason: collision with root package name */
    private final C6719o0 f57289c;

    /* renamed from: d, reason: collision with root package name */
    private final C7034a f57290d;

    /* renamed from: e, reason: collision with root package name */
    private final RenderNode f57291e;

    /* renamed from: f, reason: collision with root package name */
    private long f57292f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f57293g;

    /* renamed from: h, reason: collision with root package name */
    private Matrix f57294h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f57295i;

    /* renamed from: j, reason: collision with root package name */
    private float f57296j;

    /* renamed from: k, reason: collision with root package name */
    private int f57297k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC6735w0 f57298l;

    /* renamed from: m, reason: collision with root package name */
    private long f57299m;

    /* renamed from: n, reason: collision with root package name */
    private float f57300n;

    /* renamed from: o, reason: collision with root package name */
    private float f57301o;

    /* renamed from: p, reason: collision with root package name */
    private float f57302p;

    /* renamed from: q, reason: collision with root package name */
    private float f57303q;

    /* renamed from: r, reason: collision with root package name */
    private float f57304r;

    /* renamed from: s, reason: collision with root package name */
    private long f57305s;

    /* renamed from: t, reason: collision with root package name */
    private long f57306t;

    /* renamed from: u, reason: collision with root package name */
    private float f57307u;

    /* renamed from: v, reason: collision with root package name */
    private float f57308v;

    /* renamed from: w, reason: collision with root package name */
    private float f57309w;

    /* renamed from: x, reason: collision with root package name */
    private float f57310x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f57311y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f57312z;

    public D(long j10, C6719o0 c6719o0, C7034a c7034a) {
        this.f57288b = j10;
        this.f57289c = c6719o0;
        this.f57290d = c7034a;
        RenderNode renderNodeA = AbstractC7855p.a("graphicsLayer");
        this.f57291e = renderNodeA;
        this.f57292f = C6537m.f52356b.b();
        renderNodeA.setClipToBounds(false);
        AbstractC7181b.a aVar = AbstractC7181b.f57380a;
        P(renderNodeA, aVar.a());
        this.f57296j = 1.0f;
        this.f57297k = AbstractC6697d0.f52884a.B();
        this.f57299m = C6531g.f52335b.b();
        this.f57300n = 1.0f;
        this.f57301o = 1.0f;
        C6733v0.a aVar2 = C6733v0.f52951b;
        this.f57305s = aVar2.a();
        this.f57306t = aVar2.a();
        this.f57310x = 8.0f;
        this.f57286B = aVar.a();
        this.f57287C = true;
    }

    private final void O() {
        boolean z10 = false;
        boolean z11 = Q() && !this.f57295i;
        if (Q() && this.f57295i) {
            z10 = true;
        }
        if (z11 != this.f57312z) {
            this.f57312z = z11;
            this.f57291e.setClipToBounds(z11);
        }
        if (z10 != this.f57285A) {
            this.f57285A = z10;
            this.f57291e.setClipToOutline(z10);
        }
    }

    private final void P(RenderNode renderNode, int i10) {
        AbstractC7181b.a aVar = AbstractC7181b.f57380a;
        if (AbstractC7181b.e(i10, aVar.c())) {
            renderNode.setUseCompositingLayer(true, this.f57293g);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC7181b.e(i10, aVar.b())) {
            renderNode.setUseCompositingLayer(false, this.f57293g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f57293g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean R() {
        if (AbstractC7181b.e(x(), AbstractC7181b.f57380a.c()) || S()) {
            return true;
        }
        t();
        return false;
    }

    private final boolean S() {
        return (AbstractC6697d0.E(r(), AbstractC6697d0.f52884a.B()) && p() == null) ? false : true;
    }

    private final void T() {
        if (R()) {
            P(this.f57291e, AbstractC7181b.f57380a.c());
        } else {
            P(this.f57291e, x());
        }
    }

    @Override // p0.InterfaceC7183d
    public long A() {
        return this.f57305s;
    }

    @Override // p0.InterfaceC7183d
    public long B() {
        return this.f57306t;
    }

    @Override // p0.InterfaceC7183d
    public float C() {
        return this.f57303q;
    }

    @Override // p0.InterfaceC7183d
    public void D(long j10) {
        this.f57305s = j10;
        this.f57291e.setAmbientShadowColor(AbstractC6737x0.j(j10));
    }

    @Override // p0.InterfaceC7183d
    public float E() {
        return this.f57310x;
    }

    @Override // p0.InterfaceC7183d
    public float F() {
        return this.f57302p;
    }

    @Override // p0.InterfaceC7183d
    public void G(boolean z10) {
        this.f57311y = z10;
        O();
    }

    @Override // p0.InterfaceC7183d
    public float H() {
        return this.f57307u;
    }

    @Override // p0.InterfaceC7183d
    public void I(long j10) {
        this.f57306t = j10;
        this.f57291e.setSpotShadowColor(AbstractC6737x0.j(j10));
    }

    @Override // p0.InterfaceC7183d
    public void J(Y0.d dVar, Y0.t tVar, C7182c c7182c, InterfaceC6835l interfaceC6835l) {
        RecordingCanvas recordingCanvasBeginRecording = this.f57291e.beginRecording();
        try {
            C6719o0 c6719o0 = this.f57289c;
            Canvas canvasA = c6719o0.a().a();
            c6719o0.a().z(recordingCanvasBeginRecording);
            C6668G c6668gA = c6719o0.a();
            InterfaceC7037d interfaceC7037dK1 = this.f57290d.k1();
            interfaceC7037dK1.a(dVar);
            interfaceC7037dK1.b(tVar);
            interfaceC7037dK1.h(c7182c);
            interfaceC7037dK1.f(this.f57292f);
            interfaceC7037dK1.i(c6668gA);
            interfaceC6835l.invoke(this.f57290d);
            c6719o0.a().z(canvasA);
            this.f57291e.endRecording();
            s(false);
        } catch (Throwable th2) {
            this.f57291e.endRecording();
            throw th2;
        }
    }

    @Override // p0.InterfaceC7183d
    public float K() {
        return this.f57301o;
    }

    @Override // p0.InterfaceC7183d
    public void L(int i10) {
        this.f57286B = i10;
        T();
    }

    @Override // p0.InterfaceC7183d
    public Matrix M() {
        Matrix matrix = this.f57294h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f57294h = matrix;
        }
        this.f57291e.getMatrix(matrix);
        return matrix;
    }

    @Override // p0.InterfaceC7183d
    public float N() {
        return this.f57304r;
    }

    public boolean Q() {
        return this.f57311y;
    }

    @Override // p0.InterfaceC7183d
    public void a(float f10) {
        this.f57296j = f10;
        this.f57291e.setAlpha(f10);
    }

    @Override // p0.InterfaceC7183d
    public float b() {
        return this.f57296j;
    }

    @Override // p0.InterfaceC7183d
    public void c(InterfaceC6717n0 interfaceC6717n0) {
        AbstractC6670H.d(interfaceC6717n0).drawRenderNode(this.f57291e);
    }

    @Override // p0.InterfaceC7183d
    public void d(float f10) {
        this.f57308v = f10;
        this.f57291e.setRotationY(f10);
    }

    @Override // p0.InterfaceC7183d
    public void e(float f10) {
        this.f57309w = f10;
        this.f57291e.setRotationZ(f10);
    }

    @Override // p0.InterfaceC7183d
    public void f(float f10) {
        this.f57303q = f10;
        this.f57291e.setTranslationY(f10);
    }

    @Override // p0.InterfaceC7183d
    public void g(float f10) {
        this.f57301o = f10;
        this.f57291e.setScaleY(f10);
    }

    @Override // p0.InterfaceC7183d
    public void h() {
        this.f57291e.discardDisplayList();
    }

    @Override // p0.InterfaceC7183d
    public void i(float f10) {
        this.f57300n = f10;
        this.f57291e.setScaleX(f10);
    }

    @Override // p0.InterfaceC7183d
    public void j(float f10) {
        this.f57302p = f10;
        this.f57291e.setTranslationX(f10);
    }

    @Override // p0.InterfaceC7183d
    public void k(d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            Q.f57359a.a(this.f57291e, d1Var);
        }
    }

    @Override // p0.InterfaceC7183d
    public void l(float f10) {
        this.f57310x = f10;
        this.f57291e.setCameraDistance(f10);
    }

    @Override // p0.InterfaceC7183d
    public void m(float f10) {
        this.f57307u = f10;
        this.f57291e.setRotationX(f10);
    }

    @Override // p0.InterfaceC7183d
    public float n() {
        return this.f57300n;
    }

    @Override // p0.InterfaceC7183d
    public void o(float f10) {
        this.f57304r = f10;
        this.f57291e.setElevation(f10);
    }

    @Override // p0.InterfaceC7183d
    public AbstractC6735w0 p() {
        return this.f57298l;
    }

    @Override // p0.InterfaceC7183d
    public boolean q() {
        return this.f57291e.hasDisplayList();
    }

    @Override // p0.InterfaceC7183d
    public int r() {
        return this.f57297k;
    }

    @Override // p0.InterfaceC7183d
    public void s(boolean z10) {
        this.f57287C = z10;
    }

    @Override // p0.InterfaceC7183d
    public d1 t() {
        return null;
    }

    @Override // p0.InterfaceC7183d
    public float u() {
        return this.f57308v;
    }

    @Override // p0.InterfaceC7183d
    public void v(Outline outline, long j10) {
        this.f57291e.setOutline(outline);
        this.f57295i = outline != null;
        O();
    }

    @Override // p0.InterfaceC7183d
    public float w() {
        return this.f57309w;
    }

    @Override // p0.InterfaceC7183d
    public int x() {
        return this.f57286B;
    }

    @Override // p0.InterfaceC7183d
    public void y(int i10, int i11, long j10) {
        this.f57291e.setPosition(i10, i11, Y0.r.g(j10) + i10, Y0.r.f(j10) + i11);
        this.f57292f = Y0.s.d(j10);
    }

    @Override // p0.InterfaceC7183d
    public void z(long j10) {
        this.f57299m = j10;
        if (AbstractC6532h.d(j10)) {
            this.f57291e.resetPivot();
        } else {
            this.f57291e.setPivotX(C6531g.m(j10));
            this.f57291e.setPivotY(C6531g.n(j10));
        }
    }

    public /* synthetic */ D(long j10, C6719o0 c6719o0, C7034a c7034a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? new C6719o0() : c6719o0, (i10 & 4) != 0 ? new C7034a() : c7034a);
    }
}
