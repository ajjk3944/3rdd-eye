package s1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import c2.l0;
import me.t1;
import p1.m;
import p1.q;
import p1.r;
import p1.s;
import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    public final r f33277b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.b f33278c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f33279d;

    /* renamed from: e, reason: collision with root package name */
    public long f33280e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f33281f;
    public Matrix g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33282h;

    /* renamed from: i, reason: collision with root package name */
    public float f33283i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public float f33284k;

    /* renamed from: l, reason: collision with root package name */
    public float f33285l;

    /* renamed from: m, reason: collision with root package name */
    public float f33286m;

    /* renamed from: n, reason: collision with root package name */
    public float f33287n;

    /* renamed from: o, reason: collision with root package name */
    public float f33288o;

    /* renamed from: p, reason: collision with root package name */
    public long f33289p;

    /* renamed from: q, reason: collision with root package name */
    public long f33290q;

    /* renamed from: r, reason: collision with root package name */
    public float f33291r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33292s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f33293t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f33294u;

    /* renamed from: v, reason: collision with root package name */
    public int f33295v;

    public f() {
        r rVar = new r();
        r1.b bVar = new r1.b();
        this.f33277b = rVar;
        this.f33278c = bVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f33279d = renderNode;
        this.f33280e = 0L;
        renderNode.setClipToBounds(false);
        O(renderNode, 0);
        this.f33283i = 1.0f;
        this.j = 3;
        this.f33284k = 1.0f;
        this.f33285l = 1.0f;
        long j = s.f31013b;
        this.f33289p = j;
        this.f33290q = j;
        this.f33291r = 8.0f;
        this.f33295v = 0;
    }

    @Override // s1.d
    public final float A() {
        return this.f33286m;
    }

    @Override // s1.d
    public final void B(boolean z3) {
        this.f33292s = z3;
        N();
    }

    @Override // s1.d
    public final float C() {
        return 0.0f;
    }

    @Override // s1.d
    public final void D(int i4) {
        this.f33295v = i4;
        P();
    }

    @Override // s1.d
    public final void E() {
        this.f33279d.setRotationZ(0.0f);
    }

    @Override // s1.d
    public final void F(float f10) {
        this.f33286m = f10;
        this.f33279d.setTranslationX(f10);
    }

    @Override // s1.d
    public final void G(long j) {
        this.f33290q = j;
        this.f33279d.setSpotShadowColor(z.u(j));
    }

    @Override // s1.d
    public final Matrix H() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.f33279d.getMatrix(matrix);
        return matrix;
    }

    @Override // s1.d
    public final void I(float f10) {
        this.f33291r = f10;
        this.f33279d.setCameraDistance(f10);
    }

    @Override // s1.d
    public final float J() {
        return this.f33288o;
    }

    @Override // s1.d
    public final float K() {
        return this.f33285l;
    }

    @Override // s1.d
    public final int L() {
        return this.j;
    }

    @Override // s1.d
    public final void M(d3.c cVar, d3.l lVar, b bVar, l0 l0Var) {
        r1.b bVar2 = this.f33278c;
        RecordingCanvas recordingCanvasBeginRecording = this.f33279d.beginRecording();
        try {
            r rVar = this.f33277b;
            p1.c cVar2 = rVar.f31012a;
            Canvas canvas = cVar2.f30949a;
            cVar2.f30949a = recordingCanvasBeginRecording;
            i0.f fVar = bVar2.f32718b;
            fVar.P(cVar);
            fVar.Q(lVar);
            fVar.f25417c = bVar;
            fVar.R(this.f33280e);
            fVar.O(cVar2);
            l0Var.invoke(bVar2);
            rVar.f31012a.f30949a = canvas;
        } finally {
            this.f33279d.endRecording();
        }
    }

    public final void N() {
        boolean z3 = this.f33292s;
        boolean z10 = false;
        boolean z11 = z3 && !this.f33282h;
        if (z3 && this.f33282h) {
            z10 = true;
        }
        if (z11 != this.f33293t) {
            this.f33293t = z11;
            this.f33279d.setClipToBounds(z11);
        }
        if (z10 != this.f33294u) {
            this.f33294u = z10;
            this.f33279d.setClipToOutline(z10);
        }
    }

    public final void O(RenderNode renderNode, int i4) {
        if (i4 == 1) {
            renderNode.setUseCompositingLayer(true, this.f33281f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i4 == 2) {
            renderNode.setUseCompositingLayer(false, this.f33281f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f33281f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i4 = this.f33295v;
        if (i4 != 1 && this.j == 3) {
            O(this.f33279d, i4);
        } else {
            O(this.f33279d, 1);
        }
    }

    @Override // s1.d
    public final float a() {
        return this.f33283i;
    }

    @Override // s1.d
    public final float b() {
        return this.f33284k;
    }

    @Override // s1.d
    public final void c(float f10) {
        this.f33288o = f10;
        this.f33279d.setElevation(f10);
    }

    @Override // s1.d
    public final void d(float f10) {
        this.f33287n = f10;
        this.f33279d.setTranslationY(f10);
    }

    @Override // s1.d
    public final void e(Outline outline, long j) {
        this.f33279d.setOutline(outline);
        this.f33282h = outline != null;
        N();
    }

    @Override // s1.d
    public final void f(int i4) {
        this.j = i4;
        Paint paint = this.f33281f;
        if (paint == null) {
            paint = new Paint();
            this.f33281f = paint;
        }
        paint.setBlendMode(p1.b.d(i4));
        P();
    }

    @Override // s1.d
    public final void g() {
        this.f33279d.discardDisplayList();
    }

    @Override // s1.d
    public final int h() {
        return this.f33295v;
    }

    @Override // s1.d
    public final m i() {
        return null;
    }

    @Override // s1.d
    public final void j(q qVar) {
        p1.d.a(qVar).drawRenderNode(this.f33279d);
    }

    @Override // s1.d
    public final void k(float f10) {
        this.f33285l = f10;
        this.f33279d.setScaleY(f10);
    }

    @Override // s1.d
    public final void l(int i4, int i10, long j) {
        this.f33279d.setPosition(i4, i10, ((int) (j >> 32)) + i4, ((int) (4294967295L & j)) + i10);
        this.f33280e = t1.F(j);
    }

    @Override // s1.d
    public final float m() {
        return 0.0f;
    }

    @Override // s1.d
    public final boolean n() {
        return this.f33279d.hasDisplayList();
    }

    @Override // s1.d
    public final float o() {
        return 0.0f;
    }

    @Override // s1.d
    public final void p(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f33279d.resetPivot();
        } else {
            this.f33279d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f33279d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // s1.d
    public final long q() {
        return this.f33289p;
    }

    @Override // s1.d
    public final void r() {
        this.f33279d.setRotationX(0.0f);
    }

    @Override // s1.d
    public final void s(float f10) {
        this.f33283i = f10;
        this.f33279d.setAlpha(f10);
    }

    @Override // s1.d
    public final float t() {
        return this.f33287n;
    }

    @Override // s1.d
    public final void u() {
        this.f33279d.setRotationY(0.0f);
    }

    @Override // s1.d
    public final long v() {
        return this.f33290q;
    }

    @Override // s1.d
    public final void w(long j) {
        this.f33289p = j;
        this.f33279d.setAmbientShadowColor(z.u(j));
    }

    @Override // s1.d
    public final void x() {
        Paint paint = this.f33281f;
        if (paint == null) {
            paint = new Paint();
            this.f33281f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // s1.d
    public final void y(float f10) {
        this.f33284k = f10;
        this.f33279d.setScaleX(f10);
    }

    @Override // s1.d
    public final float z() {
        return this.f33291r;
    }
}
