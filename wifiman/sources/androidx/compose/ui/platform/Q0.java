package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6668G;
import m0.C6719o0;
import m0.InterfaceC6717n0;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class Q0 implements InterfaceC3941n0 {

    /* renamed from: k, reason: collision with root package name */
    private static boolean f29297k;

    /* renamed from: a, reason: collision with root package name */
    private final r f29299a;

    /* renamed from: b, reason: collision with root package name */
    private final RenderNode f29300b;

    /* renamed from: c, reason: collision with root package name */
    private int f29301c;

    /* renamed from: d, reason: collision with root package name */
    private int f29302d;

    /* renamed from: e, reason: collision with root package name */
    private int f29303e;

    /* renamed from: f, reason: collision with root package name */
    private int f29304f;

    /* renamed from: g, reason: collision with root package name */
    private int f29305g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29306h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f29295i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f29296j = 8;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f29298l = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Q0(r rVar) {
        this.f29299a = rVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", rVar);
        this.f29300b = renderNodeCreate;
        this.f29301c = androidx.compose.ui.graphics.a.f28894a.a();
        if (f29298l) {
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
            P(renderNodeCreate);
            o();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f29298l = false;
        }
        if (f29297k) {
            throw new NoClassDefFoundError();
        }
    }

    private final void P(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            C3924h1 c3924h1 = C3924h1.f29390a;
            c3924h1.c(renderNode, c3924h1.a(renderNode));
            c3924h1.d(renderNode, c3924h1.b(renderNode));
        }
    }

    private final void o() {
        C3921g1.f29385a.a(this.f29300b);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void A(int i10) {
        O(D() + i10);
        p(s() + i10);
        this.f29300b.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void B(Outline outline) {
        this.f29300b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean C() {
        return this.f29306h;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int D() {
        return this.f29303e;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void E(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C3924h1.f29390a.c(this.f29300b, i10);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean F() {
        return this.f29300b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void G(boolean z10) {
        this.f29300b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean H(boolean z10) {
        return this.f29300b.setHasOverlappingRendering(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void I(C6719o0 c6719o0, m0.U0 u02, InterfaceC6835l interfaceC6835l) {
        DisplayListCanvas displayListCanvasStart = this.f29300b.start(getWidth(), getHeight());
        Canvas canvasA = c6719o0.a().a();
        c6719o0.a().z((Canvas) displayListCanvasStart);
        C6668G c6668gA = c6719o0.a();
        if (u02 != null) {
            c6668gA.j();
            InterfaceC6717n0.t(c6668gA, u02, 0, 2, null);
        }
        interfaceC6835l.invoke(c6668gA);
        if (u02 != null) {
            c6668gA.r();
        }
        c6719o0.a().z(canvasA);
        this.f29300b.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void J(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C3924h1.f29390a.d(this.f29300b, i10);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void K(Matrix matrix) {
        this.f29300b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public float L() {
        return this.f29300b.getElevation();
    }

    public void M(int i10) {
        this.f29302d = i10;
    }

    public void N(int i10) {
        this.f29304f = i10;
    }

    public void O(int i10) {
        this.f29303e = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void a(float f10) {
        this.f29300b.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public float b() {
        return this.f29300b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int c() {
        return this.f29302d;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void d(float f10) {
        this.f29300b.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void e(float f10) {
        this.f29300b.setRotation(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void f(float f10) {
        this.f29300b.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void g(float f10) {
        this.f29300b.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int getHeight() {
        return s() - D();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int getWidth() {
        return n() - c();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void h() {
        o();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void i(float f10) {
        this.f29300b.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void j(float f10) {
        this.f29300b.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void k(m0.d1 d1Var) {
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void l(float f10) {
        this.f29300b.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void m(float f10) {
        this.f29300b.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int n() {
        return this.f29304f;
    }

    public void p(int i10) {
        this.f29305g = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean q() {
        return this.f29300b.isValid();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void r(int i10) {
        M(c() + i10);
        N(n() + i10);
        this.f29300b.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int s() {
        return this.f29305g;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void t(int i10) {
        a.C1065a c1065a = androidx.compose.ui.graphics.a.f28894a;
        if (androidx.compose.ui.graphics.a.e(i10, c1065a.c())) {
            this.f29300b.setLayerType(2);
            this.f29300b.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i10, c1065a.b())) {
            this.f29300b.setLayerType(0);
            this.f29300b.setHasOverlappingRendering(false);
        } else {
            this.f29300b.setLayerType(0);
            this.f29300b.setHasOverlappingRendering(true);
        }
        this.f29301c = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void u(Canvas canvas) {
        AbstractC6492s.g(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f29300b);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void v(float f10) {
        this.f29300b.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void w(boolean z10) {
        this.f29306h = z10;
        this.f29300b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean x(int i10, int i11, int i12, int i13) {
        M(i10);
        O(i11);
        N(i12);
        p(i13);
        return this.f29300b.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void y(float f10) {
        this.f29300b.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void z(float f10) {
        this.f29300b.setElevation(f10);
    }
}
