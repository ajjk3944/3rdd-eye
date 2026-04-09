package s1;

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
import c2.l0;
import p1.m;
import p1.q;
import p1.r;
import p1.s;
import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements d {

    /* renamed from: y, reason: collision with root package name */
    public static final g f33296y = new g();

    /* renamed from: b, reason: collision with root package name */
    public final t1.a f33297b;

    /* renamed from: c, reason: collision with root package name */
    public final r f33298c;

    /* renamed from: d, reason: collision with root package name */
    public final l f33299d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f33300e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f33301f;
    public Paint g;

    /* renamed from: h, reason: collision with root package name */
    public int f33302h;

    /* renamed from: i, reason: collision with root package name */
    public int f33303i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f33304k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33305l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33306m;

    /* renamed from: n, reason: collision with root package name */
    public int f33307n;

    /* renamed from: o, reason: collision with root package name */
    public int f33308o;

    /* renamed from: p, reason: collision with root package name */
    public float f33309p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33310q;

    /* renamed from: r, reason: collision with root package name */
    public float f33311r;

    /* renamed from: s, reason: collision with root package name */
    public float f33312s;

    /* renamed from: t, reason: collision with root package name */
    public float f33313t;

    /* renamed from: u, reason: collision with root package name */
    public float f33314u;

    /* renamed from: v, reason: collision with root package name */
    public float f33315v;

    /* renamed from: w, reason: collision with root package name */
    public long f33316w;

    /* renamed from: x, reason: collision with root package name */
    public long f33317x;

    public h(t1.a aVar) {
        r rVar = new r();
        r1.b bVar = new r1.b();
        this.f33297b = aVar;
        this.f33298c = rVar;
        l lVar = new l(aVar, rVar, bVar);
        this.f33299d = lVar;
        this.f33300e = aVar.getResources();
        this.f33301f = new Rect();
        aVar.addView(lVar);
        lVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.f33307n = 3;
        this.f33308o = 0;
        this.f33309p = 1.0f;
        this.f33311r = 1.0f;
        this.f33312s = 1.0f;
        long j = s.f31013b;
        this.f33316w = j;
        this.f33317x = j;
    }

    @Override // s1.d
    public final float A() {
        return this.f33313t;
    }

    @Override // s1.d
    public final void B(boolean z3) {
        boolean z10 = false;
        this.f33306m = z3 && !this.f33305l;
        this.f33304k = true;
        if (z3 && this.f33305l) {
            z10 = true;
        }
        this.f33299d.setClipToOutline(z10);
    }

    @Override // s1.d
    public final float C() {
        return 0.0f;
    }

    @Override // s1.d
    public final void D(int i4) {
        this.f33308o = i4;
        O();
    }

    @Override // s1.d
    public final void E() {
        this.f33299d.setRotation(0.0f);
    }

    @Override // s1.d
    public final void F(float f10) {
        this.f33313t = f10;
        this.f33299d.setTranslationX(f10);
    }

    @Override // s1.d
    public final void G(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f33317x = j;
            a4.f.E(z.u(j), this.f33299d);
        }
    }

    @Override // s1.d
    public final Matrix H() {
        return this.f33299d.getMatrix();
    }

    @Override // s1.d
    public final void I(float f10) {
        this.f33299d.setCameraDistance(f10 * this.f33300e.getDisplayMetrics().densityDpi);
    }

    @Override // s1.d
    public final float J() {
        return this.f33315v;
    }

    @Override // s1.d
    public final float K() {
        return this.f33312s;
    }

    @Override // s1.d
    public final int L() {
        return this.f33307n;
    }

    @Override // s1.d
    public final void M(d3.c cVar, d3.l lVar, b bVar, l0 l0Var) {
        l lVar2 = this.f33299d;
        ViewParent parent = lVar2.getParent();
        t1.a aVar = this.f33297b;
        if (parent == null) {
            aVar.addView(lVar2);
        }
        lVar2.g = cVar;
        lVar2.f33325h = lVar;
        lVar2.f33326i = l0Var;
        lVar2.j = bVar;
        if (lVar2.isAttachedToWindow()) {
            lVar2.setVisibility(4);
            lVar2.setVisibility(0);
            try {
                r rVar = this.f33298c;
                g gVar = f33296y;
                p1.c cVar2 = rVar.f31012a;
                Canvas canvas = cVar2.f30949a;
                cVar2.f30949a = gVar;
                aVar.a(cVar2, lVar2, lVar2.getDrawingTime());
                rVar.f31012a.f30949a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    public final void N(int i4) {
        l lVar = this.f33299d;
        boolean z3 = true;
        if (i4 == 1) {
            lVar.setLayerType(2, this.g);
        } else if (i4 == 2) {
            lVar.setLayerType(0, this.g);
            z3 = false;
        } else {
            lVar.setLayerType(0, this.g);
        }
        lVar.setCanUseCompositingLayer$ui_graphics(z3);
    }

    public final void O() {
        int i4 = this.f33308o;
        if (i4 != 1 && this.f33307n == 3) {
            N(i4);
        } else {
            N(1);
        }
    }

    @Override // s1.d
    public final float a() {
        return this.f33309p;
    }

    @Override // s1.d
    public final float b() {
        return this.f33311r;
    }

    @Override // s1.d
    public final void c(float f10) {
        this.f33315v = f10;
        this.f33299d.setElevation(f10);
    }

    @Override // s1.d
    public final void d(float f10) {
        this.f33314u = f10;
        this.f33299d.setTranslationY(f10);
    }

    @Override // s1.d
    public final void e(Outline outline, long j) {
        l lVar = this.f33299d;
        lVar.f33323e = outline;
        lVar.invalidateOutline();
        if ((this.f33306m || lVar.getClipToOutline()) && outline != null) {
            lVar.setClipToOutline(true);
            if (this.f33306m) {
                this.f33306m = false;
                this.f33304k = true;
            }
        }
        this.f33305l = outline != null;
    }

    @Override // s1.d
    public final void f(int i4) {
        this.f33307n = i4;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(p1.b.e(i4)));
        O();
    }

    @Override // s1.d
    public final void g() {
        this.f33297b.removeViewInLayout(this.f33299d);
    }

    @Override // s1.d
    public final int h() {
        return this.f33308o;
    }

    @Override // s1.d
    public final m i() {
        return null;
    }

    @Override // s1.d
    public final void j(q qVar) {
        Rect rect;
        boolean z3 = this.f33304k;
        l lVar = this.f33299d;
        if (z3) {
            if ((this.f33306m || lVar.getClipToOutline()) && !this.f33305l) {
                rect = this.f33301f;
                rect.left = 0;
                rect.top = 0;
                rect.right = lVar.getWidth();
                rect.bottom = lVar.getHeight();
            } else {
                rect = null;
            }
            lVar.setClipBounds(rect);
        }
        if (p1.d.a(qVar).isHardwareAccelerated()) {
            this.f33297b.a(qVar, lVar, lVar.getDrawingTime());
        }
    }

    @Override // s1.d
    public final void k(float f10) {
        this.f33312s = f10;
        this.f33299d.setScaleY(f10);
    }

    @Override // s1.d
    public final void l(int i4, int i10, long j) {
        boolean zA = d3.k.a(this.j, j);
        l lVar = this.f33299d;
        if (zA) {
            int i11 = this.f33302h;
            if (i11 != i4) {
                lVar.offsetLeftAndRight(i4 - i11);
            }
            int i12 = this.f33303i;
            if (i12 != i10) {
                lVar.offsetTopAndBottom(i10 - i12);
            }
        } else {
            if (this.f33306m || lVar.getClipToOutline()) {
                this.f33304k = true;
            }
            int i13 = (int) (j >> 32);
            int i14 = (int) (4294967295L & j);
            lVar.layout(i4, i10, i4 + i13, i10 + i14);
            this.j = j;
            if (this.f33310q) {
                lVar.setPivotX(i13 / 2.0f);
                lVar.setPivotY(i14 / 2.0f);
            }
        }
        this.f33302h = i4;
        this.f33303i = i10;
    }

    @Override // s1.d
    public final float m() {
        return 0.0f;
    }

    @Override // s1.d
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // s1.d
    public final float o() {
        return 0.0f;
    }

    @Override // s1.d
    public final void p(long j) {
        long j8 = 9223372034707292159L & j;
        l lVar = this.f33299d;
        if (j8 != 9205357640488583168L) {
            this.f33310q = false;
            lVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            lVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                a4.f.w(lVar);
                return;
            }
            this.f33310q = true;
            lVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            lVar.setPivotY(((int) (4294967295L & this.j)) / 2.0f);
        }
    }

    @Override // s1.d
    public final long q() {
        return this.f33316w;
    }

    @Override // s1.d
    public final void r() {
        this.f33299d.setRotationX(0.0f);
    }

    @Override // s1.d
    public final void s(float f10) {
        this.f33309p = f10;
        this.f33299d.setAlpha(f10);
    }

    @Override // s1.d
    public final float t() {
        return this.f33314u;
    }

    @Override // s1.d
    public final void u() {
        this.f33299d.setRotationY(0.0f);
    }

    @Override // s1.d
    public final long v() {
        return this.f33317x;
    }

    @Override // s1.d
    public final void w(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f33316w = j;
            a4.f.D(z.u(j), this.f33299d);
        }
    }

    @Override // s1.d
    public final void x() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // s1.d
    public final void y(float f10) {
        this.f33311r = f10;
        this.f33299d.setScaleX(f10);
    }

    @Override // s1.d
    public final float z() {
        return this.f33299d.getCameraDistance() / this.f33300e.getDisplayMetrics().densityDpi;
    }
}
