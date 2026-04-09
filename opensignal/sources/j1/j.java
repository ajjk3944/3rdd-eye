package j1;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import g1.f0;
import g1.p;
import g1.q;
import g1.r;

/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: w, reason: collision with root package name */
    public static final i f13111w = new i();

    /* renamed from: b, reason: collision with root package name */
    public final k1.a f13112b;

    /* renamed from: c, reason: collision with root package name */
    public final q f13113c;

    /* renamed from: d, reason: collision with root package name */
    public final n f13114d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f13115e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f13116f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f13117g;

    /* renamed from: h, reason: collision with root package name */
    public int f13118h;

    /* renamed from: i, reason: collision with root package name */
    public int f13119i;
    public long j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13120l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13121m;

    /* renamed from: n, reason: collision with root package name */
    public int f13122n;

    /* renamed from: o, reason: collision with root package name */
    public int f13123o;

    /* renamed from: p, reason: collision with root package name */
    public float f13124p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13125q;

    /* renamed from: r, reason: collision with root package name */
    public float f13126r;

    /* renamed from: s, reason: collision with root package name */
    public float f13127s;

    /* renamed from: t, reason: collision with root package name */
    public float f13128t;

    /* renamed from: u, reason: collision with root package name */
    public long f13129u;

    /* renamed from: v, reason: collision with root package name */
    public long f13130v;

    public j(k1.a aVar) {
        q qVar = new q();
        i1.b bVar = new i1.b();
        this.f13112b = aVar;
        this.f13113c = qVar;
        n nVar = new n(aVar, qVar, bVar);
        this.f13114d = nVar;
        this.f13115e = aVar.getResources();
        this.f13116f = new Rect();
        aVar.addView(nVar);
        nVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.f13122n = 3;
        this.f13123o = 0;
        this.f13124p = 1.0f;
        this.f13126r = 1.0f;
        this.f13127s = 1.0f;
        long j = r.f9264b;
        this.f13129u = j;
        this.f13130v = j;
    }

    @Override // j1.e
    public final float A() {
        return this.f13114d.getCameraDistance() / this.f13115e.getDisplayMetrics().densityDpi;
    }

    @Override // j1.e
    public final float B() {
        return 0.0f;
    }

    @Override // j1.e
    public final void C() {
        this.f13114d.setTranslationX(0.0f);
    }

    @Override // j1.e
    public final void D(boolean z10) {
        boolean z11 = false;
        this.f13121m = z10 && !this.f13120l;
        this.k = true;
        if (z10 && this.f13120l) {
            z11 = true;
        }
        this.f13114d.setClipToOutline(z11);
    }

    @Override // j1.e
    public final float E() {
        return 0.0f;
    }

    @Override // j1.e
    public final void F(int i10) {
        this.f13123o = i10;
        O();
    }

    @Override // j1.e
    public final void G() {
        this.f13114d.setRotation(0.0f);
    }

    @Override // j1.e
    public final void H(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13130v = j;
            this.f13114d.setOutlineSpotShadowColor(f0.q(j));
        }
    }

    @Override // j1.e
    public final Matrix I() {
        return this.f13114d.getMatrix();
    }

    @Override // j1.e
    public final void J(float f10) {
        this.f13114d.setCameraDistance(f10 * this.f13115e.getDisplayMetrics().densityDpi);
    }

    @Override // j1.e
    public final float K() {
        return this.f13128t;
    }

    @Override // j1.e
    public final float L() {
        return this.f13127s;
    }

    @Override // j1.e
    public final int M() {
        return this.f13122n;
    }

    public final void N(int i10) {
        n nVar = this.f13114d;
        boolean z10 = true;
        if (i10 == 1) {
            nVar.setLayerType(2, this.f13117g);
        } else if (i10 == 2) {
            nVar.setLayerType(0, this.f13117g);
            z10 = false;
        } else {
            nVar.setLayerType(0, this.f13117g);
        }
        nVar.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    public final void O() {
        int i10 = this.f13123o;
        if (i10 != 1 && this.f13122n == 3) {
            N(i10);
        } else {
            N(1);
        }
    }

    @Override // j1.e
    public final float a() {
        return this.f13124p;
    }

    @Override // j1.e
    public final float b() {
        return this.f13126r;
    }

    @Override // j1.e
    public final void c(float f10) {
        this.f13128t = f10;
        this.f13114d.setElevation(f10);
    }

    @Override // j1.e
    public final void d(Outline outline, long j) {
        n nVar = this.f13114d;
        nVar.f13136x = outline;
        nVar.invalidateOutline();
        if ((this.f13121m || nVar.getClipToOutline()) && outline != null) {
            nVar.setClipToOutline(true);
            if (this.f13121m) {
                this.f13121m = false;
                this.k = true;
            }
        }
        this.f13120l = outline != null;
    }

    @Override // j1.e
    public final void e(int i10) {
        this.f13122n = i10;
        Paint paint = this.f13117g;
        if (paint == null) {
            paint = new Paint();
            this.f13117g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(f0.t(i10)));
        O();
    }

    @Override // j1.e
    public final void f() {
        this.f13112b.removeViewInLayout(this.f13114d);
    }

    @Override // j1.e
    public final int g() {
        return this.f13123o;
    }

    @Override // j1.e
    public final g1.m h() {
        return null;
    }

    @Override // j1.e
    public final void i(float f10) {
        this.f13127s = f10;
        this.f13114d.setScaleY(f10);
    }

    @Override // j1.e
    public final void j(int i10, int i11, long j) {
        boolean zT = ir.f0.t(this.j, j);
        n nVar = this.f13114d;
        if (zT) {
            int i12 = this.f13118h;
            if (i12 != i10) {
                nVar.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f13119i;
            if (i13 != i11) {
                nVar.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (this.f13121m || nVar.getClipToOutline()) {
                this.k = true;
            }
            int i14 = (int) (j >> 32);
            int i15 = (int) (4294967295L & j);
            nVar.layout(i10, i11, i10 + i14, i11 + i15);
            this.j = j;
            if (this.f13125q) {
                nVar.setPivotX(i14 / 2.0f);
                nVar.setPivotY(i15 / 2.0f);
            }
        }
        this.f13118h = i10;
        this.f13119i = i11;
    }

    @Override // j1.e
    public final float k() {
        return 0.0f;
    }

    @Override // j1.e
    public final float m() {
        return 0.0f;
    }

    @Override // j1.e
    public final void n(long j) {
        long j7 = 9223372034707292159L & j;
        n nVar = this.f13114d;
        if (j7 != 9205357640488583168L) {
            this.f13125q = false;
            nVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            nVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                nVar.resetPivot();
                return;
            }
            this.f13125q = true;
            nVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            nVar.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // j1.e
    public final long o() {
        return this.f13129u;
    }

    @Override // j1.e
    public final void p() {
        this.f13114d.setRotationX(0.0f);
    }

    @Override // j1.e
    public final void q(float f10) {
        this.f13124p = f10;
        this.f13114d.setAlpha(f10);
    }

    @Override // j1.e
    public final float r() {
        return 0.0f;
    }

    @Override // j1.e
    public final void s() {
        this.f13114d.setTranslationY(0.0f);
    }

    @Override // j1.e
    public final void t() {
        this.f13114d.setRotationY(0.0f);
    }

    @Override // j1.e
    public final long u() {
        return this.f13130v;
    }

    @Override // j1.e
    public final void v(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13129u = j;
            this.f13114d.setOutlineAmbientShadowColor(f0.q(j));
        }
    }

    @Override // j1.e
    public final void w(p pVar) {
        Rect rect;
        boolean z10 = this.k;
        n nVar = this.f13114d;
        if (z10) {
            if ((this.f13121m || nVar.getClipToOutline()) && !this.f13120l) {
                rect = this.f13116f;
                rect.left = 0;
                rect.top = 0;
                rect.right = nVar.getWidth();
                rect.bottom = nVar.getHeight();
            } else {
                rect = null;
            }
            nVar.setClipBounds(rect);
        }
        if (g1.c.a(pVar).isHardwareAccelerated()) {
            this.f13112b.a(pVar, nVar, nVar.getDrawingTime());
        }
    }

    @Override // j1.e
    public final void x(t2.c cVar, t2.i iVar, c cVar2, a aVar) {
        n nVar = this.f13114d;
        ViewParent parent = nVar.getParent();
        k1.a aVar2 = this.f13112b;
        if (parent == null) {
            aVar2.addView(nVar);
        }
        nVar.B = cVar;
        nVar.D = iVar;
        nVar.E = aVar;
        nVar.F = cVar2;
        if (nVar.isAttachedToWindow()) {
            nVar.setVisibility(4);
            nVar.setVisibility(0);
            try {
                q qVar = this.f13113c;
                i iVar2 = f13111w;
                g1.b bVar = qVar.f9263a;
                Canvas canvas = bVar.f9198a;
                bVar.f9198a = iVar2;
                aVar2.a(bVar, nVar, nVar.getDrawingTime());
                qVar.f9263a.f9198a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // j1.e
    public final void y() {
        Paint paint = this.f13117g;
        if (paint == null) {
            paint = new Paint();
            this.f13117g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // j1.e
    public final void z(float f10) {
        this.f13126r = f10;
        this.f13114d.setScaleX(f10);
    }
}
