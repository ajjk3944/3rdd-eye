package j1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import g1.f0;
import g1.p;
import g1.q;
import g1.r;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicBoolean f13074w = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final q f13075b;

    /* renamed from: c, reason: collision with root package name */
    public final i1.b f13076c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f13077d;

    /* renamed from: e, reason: collision with root package name */
    public long f13078e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f13079f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f13080g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13081h;

    /* renamed from: i, reason: collision with root package name */
    public long f13082i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public float f13083l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13084m;

    /* renamed from: n, reason: collision with root package name */
    public float f13085n;

    /* renamed from: o, reason: collision with root package name */
    public float f13086o;

    /* renamed from: p, reason: collision with root package name */
    public float f13087p;

    /* renamed from: q, reason: collision with root package name */
    public long f13088q;

    /* renamed from: r, reason: collision with root package name */
    public long f13089r;

    /* renamed from: s, reason: collision with root package name */
    public float f13090s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13091t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13092u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13093v;

    public f(AndroidComposeView androidComposeView, q qVar, i1.b bVar) {
        this.f13075b = qVar;
        this.f13076c = bVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f13077d = renderNodeCreate;
        this.f13078e = 0L;
        this.f13082i = 0L;
        if (f13074w.getAndSet(false)) {
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
            if (Build.VERSION.SDK_INT >= 28) {
                l.c(renderNodeCreate, l.a(renderNodeCreate));
                l.d(renderNodeCreate, l.b(renderNodeCreate));
            }
            k.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        O(0);
        this.j = 0;
        this.k = 3;
        this.f13083l = 1.0f;
        this.f13085n = 1.0f;
        this.f13086o = 1.0f;
        long j = r.f9264b;
        this.f13088q = j;
        this.f13089r = j;
        this.f13090s = 8.0f;
    }

    @Override // j1.e
    public final float A() {
        return this.f13090s;
    }

    @Override // j1.e
    public final float B() {
        return 0.0f;
    }

    @Override // j1.e
    public final void C() {
        this.f13077d.setTranslationX(0.0f);
    }

    @Override // j1.e
    public final void D(boolean z10) {
        this.f13091t = z10;
        N();
    }

    @Override // j1.e
    public final float E() {
        return 0.0f;
    }

    @Override // j1.e
    public final void F(int i10) {
        this.j = i10;
        P();
    }

    @Override // j1.e
    public final void G() {
        this.f13077d.setRotation(0.0f);
    }

    @Override // j1.e
    public final void H(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13089r = j;
            l.d(this.f13077d, f0.q(j));
        }
    }

    @Override // j1.e
    public final Matrix I() {
        Matrix matrix = this.f13080g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13080g = matrix;
        }
        this.f13077d.getMatrix(matrix);
        return matrix;
    }

    @Override // j1.e
    public final void J(float f10) {
        this.f13090s = f10;
        this.f13077d.setCameraDistance(-f10);
    }

    @Override // j1.e
    public final float K() {
        return this.f13087p;
    }

    @Override // j1.e
    public final float L() {
        return this.f13086o;
    }

    @Override // j1.e
    public final int M() {
        return this.k;
    }

    public final void N() {
        boolean z10 = this.f13091t;
        boolean z11 = false;
        boolean z12 = z10 && !this.f13081h;
        if (z10 && this.f13081h) {
            z11 = true;
        }
        if (z12 != this.f13092u) {
            this.f13092u = z12;
            this.f13077d.setClipToBounds(z12);
        }
        if (z11 != this.f13093v) {
            this.f13093v = z11;
            this.f13077d.setClipToOutline(z11);
        }
    }

    public final void O(int i10) {
        RenderNode renderNode = this.f13077d;
        if (i10 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f13079f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f13079f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f13079f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i10 = this.j;
        if (i10 != 1 && this.k == 3) {
            O(i10);
        } else {
            O(1);
        }
    }

    @Override // j1.e
    public final float a() {
        return this.f13083l;
    }

    @Override // j1.e
    public final float b() {
        return this.f13085n;
    }

    @Override // j1.e
    public final void c(float f10) {
        this.f13087p = f10;
        this.f13077d.setElevation(f10);
    }

    @Override // j1.e
    public final void d(Outline outline, long j) {
        this.f13082i = j;
        this.f13077d.setOutline(outline);
        this.f13081h = outline != null;
        N();
    }

    @Override // j1.e
    public final void e(int i10) {
        if (this.k == i10) {
            return;
        }
        this.k = i10;
        Paint paint = this.f13079f;
        if (paint == null) {
            paint = new Paint();
            this.f13079f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(f0.t(i10)));
        P();
    }

    @Override // j1.e
    public final void f() {
        k.a(this.f13077d);
    }

    @Override // j1.e
    public final int g() {
        return this.j;
    }

    @Override // j1.e
    public final g1.m h() {
        return null;
    }

    @Override // j1.e
    public final void i(float f10) {
        this.f13086o = f10;
        this.f13077d.setScaleY(f10);
    }

    @Override // j1.e
    public final void j(int i10, int i11, long j) {
        int i12 = (int) (j >> 32);
        int i13 = (int) (4294967295L & j);
        this.f13077d.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (ir.f0.t(this.f13078e, j)) {
            return;
        }
        if (this.f13084m) {
            this.f13077d.setPivotX(i12 / 2.0f);
            this.f13077d.setPivotY(i13 / 2.0f);
        }
        this.f13078e = j;
    }

    @Override // j1.e
    public final float k() {
        return 0.0f;
    }

    @Override // j1.e
    public final boolean l() {
        return this.f13077d.isValid();
    }

    @Override // j1.e
    public final float m() {
        return 0.0f;
    }

    @Override // j1.e
    public final void n(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f13084m = true;
            this.f13077d.setPivotX(((int) (this.f13078e >> 32)) / 2.0f);
            this.f13077d.setPivotY(((int) (4294967295L & this.f13078e)) / 2.0f);
        } else {
            this.f13084m = false;
            this.f13077d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f13077d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // j1.e
    public final long o() {
        return this.f13088q;
    }

    @Override // j1.e
    public final void p() {
        this.f13077d.setRotationX(0.0f);
    }

    @Override // j1.e
    public final void q(float f10) {
        this.f13083l = f10;
        this.f13077d.setAlpha(f10);
    }

    @Override // j1.e
    public final float r() {
        return 0.0f;
    }

    @Override // j1.e
    public final void s() {
        this.f13077d.setTranslationY(0.0f);
    }

    @Override // j1.e
    public final void t() {
        this.f13077d.setRotationY(0.0f);
    }

    @Override // j1.e
    public final long u() {
        return this.f13089r;
    }

    @Override // j1.e
    public final void v(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13088q = j;
            l.c(this.f13077d, f0.q(j));
        }
    }

    @Override // j1.e
    public final void w(p pVar) {
        DisplayListCanvas displayListCanvasA = g1.c.a(pVar);
        br.l.c(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f13077d);
    }

    @Override // j1.e
    public final void x(t2.c cVar, t2.i iVar, c cVar2, a aVar) {
        Canvas canvasStart = this.f13077d.start(Math.max((int) (this.f13078e >> 32), (int) (this.f13082i >> 32)), Math.max((int) (this.f13078e & 4294967295L), (int) (this.f13082i & 4294967295L)));
        try {
            g1.b bVar = this.f13075b.f9263a;
            Canvas canvas = bVar.f9198a;
            bVar.f9198a = canvasStart;
            i1.b bVar2 = this.f13076c;
            bm.d dVar = bVar2.f11141c;
            long jV = kc.f.V(this.f13078e);
            i1.a aVar2 = ((i1.b) dVar.f2828r).f11140b;
            t2.c cVar3 = aVar2.f11136a;
            t2.i iVar2 = aVar2.f11137b;
            p pVarY = dVar.y();
            long jH = dVar.H();
            c cVar4 = (c) dVar.f2827g;
            dVar.P(cVar);
            dVar.Q(iVar);
            dVar.O(bVar);
            dVar.R(jV);
            dVar.f2827g = cVar2;
            bVar.g();
            try {
                aVar.a(bVar2);
                bVar.n();
                dVar.P(cVar3);
                dVar.Q(iVar2);
                dVar.O(pVarY);
                dVar.R(jH);
                dVar.f2827g = cVar4;
                bVar.f9198a = canvas;
                this.f13077d.end(canvasStart);
            } catch (Throwable th2) {
                bVar.n();
                bm.d dVar2 = bVar2.f11141c;
                dVar2.P(cVar3);
                dVar2.Q(iVar2);
                dVar2.O(pVarY);
                dVar2.R(jH);
                dVar2.f2827g = cVar4;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f13077d.end(canvasStart);
            throw th3;
        }
    }

    @Override // j1.e
    public final void y() {
        P();
    }

    @Override // j1.e
    public final void z(float f10) {
        this.f13085n = f10;
        this.f13077d.setScaleX(f10);
    }
}
