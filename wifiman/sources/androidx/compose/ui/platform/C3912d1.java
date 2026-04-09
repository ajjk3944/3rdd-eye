package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import m0.C6668G;
import m0.C6719o0;
import m0.InterfaceC6717n0;
import mh.InterfaceC6835l;
import s.AbstractC7855p;

/* renamed from: androidx.compose.ui.platform.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3912d1 implements InterfaceC3941n0 {

    /* renamed from: a, reason: collision with root package name */
    private final r f29351a;

    /* renamed from: b, reason: collision with root package name */
    private final RenderNode f29352b = AbstractC7855p.a("Compose");

    /* renamed from: c, reason: collision with root package name */
    private int f29353c = androidx.compose.ui.graphics.a.f28894a.a();

    public C3912d1(r rVar) {
        this.f29351a = rVar;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void A(int i10) {
        this.f29352b.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void B(Outline outline) {
        this.f29352b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean C() {
        return this.f29352b.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int D() {
        return this.f29352b.getTop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void E(int i10) {
        this.f29352b.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean F() {
        return this.f29352b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void G(boolean z10) {
        this.f29352b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean H(boolean z10) {
        return this.f29352b.setHasOverlappingRendering(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void I(C6719o0 c6719o0, m0.U0 u02, InterfaceC6835l interfaceC6835l) {
        RecordingCanvas recordingCanvasBeginRecording = this.f29352b.beginRecording();
        Canvas canvasA = c6719o0.a().a();
        c6719o0.a().z(recordingCanvasBeginRecording);
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
        this.f29352b.endRecording();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void J(int i10) {
        this.f29352b.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void K(Matrix matrix) {
        this.f29352b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public float L() {
        return this.f29352b.getElevation();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void a(float f10) {
        this.f29352b.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public float b() {
        return this.f29352b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int c() {
        return this.f29352b.getLeft();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void d(float f10) {
        this.f29352b.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void e(float f10) {
        this.f29352b.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void f(float f10) {
        this.f29352b.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void g(float f10) {
        this.f29352b.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int getHeight() {
        return this.f29352b.getHeight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int getWidth() {
        return this.f29352b.getWidth();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void h() {
        this.f29352b.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void i(float f10) {
        this.f29352b.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void j(float f10) {
        this.f29352b.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void k(m0.d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            C3915e1.f29362a.a(this.f29352b, d1Var);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void l(float f10) {
        this.f29352b.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void m(float f10) {
        this.f29352b.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int n() {
        return this.f29352b.getRight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean q() {
        return this.f29352b.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void r(int i10) {
        this.f29352b.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public int s() {
        return this.f29352b.getBottom();
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void t(int i10) {
        RenderNode renderNode = this.f29352b;
        a.C1065a c1065a = androidx.compose.ui.graphics.a.f28894a;
        if (androidx.compose.ui.graphics.a.e(i10, c1065a.c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i10, c1065a.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f29353c = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void u(Canvas canvas) {
        canvas.drawRenderNode(this.f29352b);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void v(float f10) {
        this.f29352b.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void w(boolean z10) {
        this.f29352b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public boolean x(int i10, int i11, int i12, int i13) {
        return this.f29352b.setPosition(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void y(float f10) {
        this.f29352b.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3941n0
    public void z(float f10) {
        this.f29352b.setElevation(f10);
    }
}
