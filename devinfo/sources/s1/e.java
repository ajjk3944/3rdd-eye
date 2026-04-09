package s1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import c2.l0;
import java.util.concurrent.atomic.AtomicBoolean;
import me.t1;
import p1.m;
import p1.q;
import p1.r;
import p1.s;
import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicBoolean f33255y = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final r f33256b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.b f33257c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f33258d;

    /* renamed from: e, reason: collision with root package name */
    public long f33259e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f33260f;
    public Matrix g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33261h;

    /* renamed from: i, reason: collision with root package name */
    public long f33262i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f33263k;

    /* renamed from: l, reason: collision with root package name */
    public float f33264l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33265m;

    /* renamed from: n, reason: collision with root package name */
    public float f33266n;

    /* renamed from: o, reason: collision with root package name */
    public float f33267o;

    /* renamed from: p, reason: collision with root package name */
    public float f33268p;

    /* renamed from: q, reason: collision with root package name */
    public float f33269q;

    /* renamed from: r, reason: collision with root package name */
    public float f33270r;

    /* renamed from: s, reason: collision with root package name */
    public long f33271s;

    /* renamed from: t, reason: collision with root package name */
    public long f33272t;

    /* renamed from: u, reason: collision with root package name */
    public float f33273u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f33274v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33275w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33276x;

    public e(j2.r rVar, r rVar2, r1.b bVar) {
        this.f33256b = rVar2;
        this.f33257c = bVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", rVar);
        this.f33258d = renderNodeCreate;
        this.f33259e = 0L;
        this.f33262i = 0L;
        if (f33255y.getAndSet(false)) {
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
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                k.c(renderNodeCreate, k.a(renderNodeCreate));
                k.d(renderNodeCreate, k.b(renderNodeCreate));
            }
            if (i4 >= 24) {
                j.a(renderNodeCreate);
            } else {
                i.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        O(0);
        this.j = 0;
        this.f33263k = 3;
        this.f33264l = 1.0f;
        this.f33266n = 1.0f;
        this.f33267o = 1.0f;
        long j = s.f31013b;
        this.f33271s = j;
        this.f33272t = j;
        this.f33273u = 8.0f;
    }

    @Override // s1.d
    public final float A() {
        return this.f33268p;
    }

    @Override // s1.d
    public final void B(boolean z3) {
        this.f33274v = z3;
        N();
    }

    @Override // s1.d
    public final float C() {
        return 0.0f;
    }

    @Override // s1.d
    public final void D(int i4) {
        this.j = i4;
        P();
    }

    @Override // s1.d
    public final void E() {
        this.f33258d.setRotation(0.0f);
    }

    @Override // s1.d
    public final void F(float f10) {
        this.f33268p = f10;
        this.f33258d.setTranslationX(f10);
    }

    @Override // s1.d
    public final void G(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f33272t = j;
            k.d(this.f33258d, z.u(j));
        }
    }

    @Override // s1.d
    public final Matrix H() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.f33258d.getMatrix(matrix);
        return matrix;
    }

    @Override // s1.d
    public final void I(float f10) {
        this.f33273u = f10;
        this.f33258d.setCameraDistance(-f10);
    }

    @Override // s1.d
    public final float J() {
        return this.f33270r;
    }

    @Override // s1.d
    public final float K() {
        return this.f33267o;
    }

    @Override // s1.d
    public final int L() {
        return this.f33263k;
    }

    @Override // s1.d
    public final void M(d3.c cVar, d3.l lVar, b bVar, l0 l0Var) {
        Canvas canvasStart = this.f33258d.start(Math.max((int) (this.f33259e >> 32), (int) (this.f33262i >> 32)), Math.max((int) (this.f33259e & 4294967295L), (int) (4294967295L & this.f33262i)));
        try {
            p1.c cVar2 = this.f33256b.f31012a;
            Canvas canvas = cVar2.f30949a;
            cVar2.f30949a = canvasStart;
            r1.b bVar2 = this.f33257c;
            i0.f fVar = bVar2.f32718b;
            long jF = t1.F(this.f33259e);
            r1.a aVar = ((r1.b) fVar.f25418d).f32717a;
            d3.c cVar3 = aVar.f32713a;
            d3.l lVar2 = aVar.f32714b;
            q qVarX = fVar.x();
            long jE = fVar.E();
            b bVar3 = (b) fVar.f25417c;
            fVar.P(cVar);
            fVar.Q(lVar);
            fVar.O(cVar2);
            fVar.R(jF);
            fVar.f25417c = bVar;
            cVar2.c();
            try {
                l0Var.invoke(bVar2);
                cVar2.k();
                fVar.P(cVar3);
                fVar.Q(lVar2);
                fVar.O(qVarX);
                fVar.R(jE);
                fVar.f25417c = bVar3;
                cVar2.f30949a = canvas;
                this.f33258d.end(canvasStart);
            } catch (Throwable th2) {
                cVar2.k();
                i0.f fVar2 = bVar2.f32718b;
                fVar2.P(cVar3);
                fVar2.Q(lVar2);
                fVar2.O(qVarX);
                fVar2.R(jE);
                fVar2.f25417c = bVar3;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f33258d.end(canvasStart);
            throw th3;
        }
    }

    public final void N() {
        boolean z3 = this.f33274v;
        boolean z10 = false;
        boolean z11 = z3 && !this.f33261h;
        if (z3 && this.f33261h) {
            z10 = true;
        }
        if (z11 != this.f33275w) {
            this.f33275w = z11;
            this.f33258d.setClipToBounds(z11);
        }
        if (z10 != this.f33276x) {
            this.f33276x = z10;
            this.f33258d.setClipToOutline(z10);
        }
    }

    public final void O(int i4) {
        RenderNode renderNode = this.f33258d;
        if (i4 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f33260f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i4 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f33260f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f33260f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i4 = this.j;
        if (i4 != 1 && this.f33263k == 3) {
            O(i4);
        } else {
            O(1);
        }
    }

    @Override // s1.d
    public final float a() {
        return this.f33264l;
    }

    @Override // s1.d
    public final float b() {
        return this.f33266n;
    }

    @Override // s1.d
    public final void c(float f10) {
        this.f33270r = f10;
        this.f33258d.setElevation(f10);
    }

    @Override // s1.d
    public final void d(float f10) {
        this.f33269q = f10;
        this.f33258d.setTranslationY(f10);
    }

    @Override // s1.d
    public final void e(Outline outline, long j) {
        this.f33262i = j;
        this.f33258d.setOutline(outline);
        this.f33261h = outline != null;
        N();
    }

    @Override // s1.d
    public final void f(int i4) {
        if (this.f33263k == i4) {
            return;
        }
        this.f33263k = i4;
        Paint paint = this.f33260f;
        if (paint == null) {
            paint = new Paint();
            this.f33260f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(p1.b.e(i4)));
        P();
    }

    @Override // s1.d
    public final void g() {
        if (Build.VERSION.SDK_INT >= 24) {
            j.a(this.f33258d);
        } else {
            i.a(this.f33258d);
        }
    }

    @Override // s1.d
    public final int h() {
        return this.j;
    }

    @Override // s1.d
    public final m i() {
        return null;
    }

    @Override // s1.d
    public final void j(q qVar) {
        DisplayListCanvas displayListCanvasA = p1.d.a(qVar);
        nk.k.c(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f33258d);
    }

    @Override // s1.d
    public final void k(float f10) {
        this.f33267o = f10;
        this.f33258d.setScaleY(f10);
    }

    @Override // s1.d
    public final void l(int i4, int i10, long j) {
        int i11 = (int) (j >> 32);
        int i12 = (int) (4294967295L & j);
        this.f33258d.setLeftTopRightBottom(i4, i10, i4 + i11, i10 + i12);
        if (d3.k.a(this.f33259e, j)) {
            return;
        }
        if (this.f33265m) {
            this.f33258d.setPivotX(i11 / 2.0f);
            this.f33258d.setPivotY(i12 / 2.0f);
        }
        this.f33259e = j;
    }

    @Override // s1.d
    public final float m() {
        return 0.0f;
    }

    @Override // s1.d
    public final boolean n() {
        return this.f33258d.isValid();
    }

    @Override // s1.d
    public final float o() {
        return 0.0f;
    }

    @Override // s1.d
    public final void p(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f33265m = true;
            this.f33258d.setPivotX(((int) (this.f33259e >> 32)) / 2.0f);
            this.f33258d.setPivotY(((int) (4294967295L & this.f33259e)) / 2.0f);
        } else {
            this.f33265m = false;
            this.f33258d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f33258d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // s1.d
    public final long q() {
        return this.f33271s;
    }

    @Override // s1.d
    public final void r() {
        this.f33258d.setRotationX(0.0f);
    }

    @Override // s1.d
    public final void s(float f10) {
        this.f33264l = f10;
        this.f33258d.setAlpha(f10);
    }

    @Override // s1.d
    public final float t() {
        return this.f33269q;
    }

    @Override // s1.d
    public final void u() {
        this.f33258d.setRotationY(0.0f);
    }

    @Override // s1.d
    public final long v() {
        return this.f33272t;
    }

    @Override // s1.d
    public final void w(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f33271s = j;
            k.c(this.f33258d, z.u(j));
        }
    }

    @Override // s1.d
    public final void x() {
        P();
    }

    @Override // s1.d
    public final void y(float f10) {
        this.f33266n = f10;
        this.f33258d.setScaleX(f10);
    }

    @Override // s1.d
    public final float z() {
        return this.f33273u;
    }
}
