package j1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import g1.f0;
import g1.p;
import g1.q;
import g1.r;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    public final q f13094b;

    /* renamed from: c, reason: collision with root package name */
    public final i1.b f13095c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f13096d;

    /* renamed from: e, reason: collision with root package name */
    public long f13097e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f13098f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f13099g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13100h;

    /* renamed from: i, reason: collision with root package name */
    public float f13101i;
    public int j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public float f13102l;

    /* renamed from: m, reason: collision with root package name */
    public float f13103m;

    /* renamed from: n, reason: collision with root package name */
    public long f13104n;

    /* renamed from: o, reason: collision with root package name */
    public long f13105o;

    /* renamed from: p, reason: collision with root package name */
    public float f13106p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13107q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13108r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13109s;

    /* renamed from: t, reason: collision with root package name */
    public int f13110t;

    public h() {
        q qVar = new q();
        i1.b bVar = new i1.b();
        this.f13094b = qVar;
        this.f13095c = bVar;
        RenderNode renderNodeA = g.a();
        this.f13096d = renderNodeA;
        this.f13097e = 0L;
        renderNodeA.setClipToBounds(false);
        O(renderNodeA, 0);
        this.f13101i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.f13102l = 1.0f;
        long j = r.f9264b;
        this.f13104n = j;
        this.f13105o = j;
        this.f13106p = 8.0f;
        this.f13110t = 0;
    }

    @Override // j1.e
    public final float A() {
        return this.f13106p;
    }

    @Override // j1.e
    public final float B() {
        return 0.0f;
    }

    @Override // j1.e
    public final void C() {
        this.f13096d.setTranslationX(0.0f);
    }

    @Override // j1.e
    public final void D(boolean z10) {
        this.f13107q = z10;
        N();
    }

    @Override // j1.e
    public final float E() {
        return 0.0f;
    }

    @Override // j1.e
    public final void F(int i10) {
        this.f13110t = i10;
        P();
    }

    @Override // j1.e
    public final void G() {
        this.f13096d.setRotationZ(0.0f);
    }

    @Override // j1.e
    public final void H(long j) {
        this.f13105o = j;
        this.f13096d.setSpotShadowColor(f0.q(j));
    }

    @Override // j1.e
    public final Matrix I() {
        Matrix matrix = this.f13099g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13099g = matrix;
        }
        this.f13096d.getMatrix(matrix);
        return matrix;
    }

    @Override // j1.e
    public final void J(float f10) {
        this.f13106p = f10;
        this.f13096d.setCameraDistance(f10);
    }

    @Override // j1.e
    public final float K() {
        return this.f13103m;
    }

    @Override // j1.e
    public final float L() {
        return this.f13102l;
    }

    @Override // j1.e
    public final int M() {
        return this.j;
    }

    public final void N() {
        boolean z10 = this.f13107q;
        boolean z11 = false;
        boolean z12 = z10 && !this.f13100h;
        if (z10 && this.f13100h) {
            z11 = true;
        }
        if (z12 != this.f13108r) {
            this.f13108r = z12;
            this.f13096d.setClipToBounds(z12);
        }
        if (z11 != this.f13109s) {
            this.f13109s = z11;
            this.f13096d.setClipToOutline(z11);
        }
    }

    public final void O(RenderNode renderNode, int i10) {
        if (i10 == 1) {
            renderNode.setUseCompositingLayer(true, this.f13098f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, this.f13098f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f13098f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i10 = this.f13110t;
        if (i10 != 1 && this.j == 3) {
            O(this.f13096d, i10);
        } else {
            O(this.f13096d, 1);
        }
    }

    @Override // j1.e
    public final float a() {
        return this.f13101i;
    }

    @Override // j1.e
    public final float b() {
        return this.k;
    }

    @Override // j1.e
    public final void c(float f10) {
        this.f13103m = f10;
        this.f13096d.setElevation(f10);
    }

    @Override // j1.e
    public final void d(Outline outline, long j) {
        this.f13096d.setOutline(outline);
        this.f13100h = outline != null;
        N();
    }

    @Override // j1.e
    public final void e(int i10) {
        this.j = i10;
        Paint paint = this.f13098f;
        if (paint == null) {
            paint = new Paint();
            this.f13098f = paint;
        }
        paint.setBlendMode(f0.o(i10));
        P();
    }

    @Override // j1.e
    public final void f() {
        this.f13096d.discardDisplayList();
    }

    @Override // j1.e
    public final int g() {
        return this.f13110t;
    }

    @Override // j1.e
    public final g1.m h() {
        return null;
    }

    @Override // j1.e
    public final void i(float f10) {
        this.f13102l = f10;
        this.f13096d.setScaleY(f10);
    }

    @Override // j1.e
    public final void j(int i10, int i11, long j) {
        this.f13096d.setPosition(i10, i11, ((int) (j >> 32)) + i10, ((int) (4294967295L & j)) + i11);
        this.f13097e = kc.f.V(j);
    }

    @Override // j1.e
    public final float k() {
        return 0.0f;
    }

    @Override // j1.e
    public final boolean l() {
        return this.f13096d.hasDisplayList();
    }

    @Override // j1.e
    public final float m() {
        return 0.0f;
    }

    @Override // j1.e
    public final void n(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f13096d.resetPivot();
        } else {
            this.f13096d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f13096d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // j1.e
    public final long o() {
        return this.f13104n;
    }

    @Override // j1.e
    public final void p() {
        this.f13096d.setRotationX(0.0f);
    }

    @Override // j1.e
    public final void q(float f10) {
        this.f13101i = f10;
        this.f13096d.setAlpha(f10);
    }

    @Override // j1.e
    public final float r() {
        return 0.0f;
    }

    @Override // j1.e
    public final void s() {
        this.f13096d.setTranslationY(0.0f);
    }

    @Override // j1.e
    public final void t() {
        this.f13096d.setRotationY(0.0f);
    }

    @Override // j1.e
    public final long u() {
        return this.f13105o;
    }

    @Override // j1.e
    public final void v(long j) {
        this.f13104n = j;
        this.f13096d.setAmbientShadowColor(f0.q(j));
    }

    @Override // j1.e
    public final void w(p pVar) {
        g1.c.a(pVar).drawRenderNode(this.f13096d);
    }

    @Override // j1.e
    public final void x(t2.c cVar, t2.i iVar, c cVar2, a aVar) {
        i1.b bVar = this.f13095c;
        RecordingCanvas recordingCanvasBeginRecording = this.f13096d.beginRecording();
        try {
            q qVar = this.f13094b;
            g1.b bVar2 = qVar.f9263a;
            Canvas canvas = bVar2.f9198a;
            bVar2.f9198a = recordingCanvasBeginRecording;
            bm.d dVar = bVar.f11141c;
            dVar.P(cVar);
            dVar.Q(iVar);
            dVar.f2827g = cVar2;
            dVar.R(this.f13097e);
            dVar.O(bVar2);
            aVar.a(bVar);
            qVar.f9263a.f9198a = canvas;
        } finally {
            this.f13096d.endRecording();
        }
    }

    @Override // j1.e
    public final void y() {
        Paint paint = this.f13098f;
        if (paint == null) {
            paint = new Paint();
            this.f13098f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // j1.e
    public final void z(float f10) {
        this.k = f10;
        this.f13096d.setScaleX(f10);
    }
}
