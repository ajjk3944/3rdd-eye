package androidx.constraintlayout.motion.widget;

import a0.l;
import a0.m;
import a0.n;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.e0;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements e0 {

    /* renamed from: c1, reason: collision with root package name */
    public static boolean f1870c1;
    public Interpolator A;
    public int A0;
    public float B;
    public int B0;
    public int C;
    public int C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public float G0;
    public boolean H;
    public v.d H0;
    public HashMap I;
    public boolean I0;
    public long J;
    public i J0;
    public float K;
    public Runnable K0;
    public float L;
    public int[] L0;
    public float M;
    public int M0;
    public long N;
    public boolean N0;
    public float O;
    public int O0;
    public boolean P;
    public HashMap P0;
    public boolean Q;
    public int Q0;
    public boolean R;
    public int R0;
    public j S;
    public int S0;
    public float T;
    public Rect T0;
    public float U;
    public boolean U0;
    public int V;
    public TransitionState V0;
    public e W;
    public f W0;
    public boolean X0;
    public RectF Y0;
    public View Z0;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1871a0;

    /* renamed from: a1, reason: collision with root package name */
    public Matrix f1872a1;

    /* renamed from: b0, reason: collision with root package name */
    public z.a f1873b0;

    /* renamed from: b1, reason: collision with root package name */
    public ArrayList f1874b1;

    /* renamed from: c0, reason: collision with root package name */
    public d f1875c0;

    /* renamed from: d0, reason: collision with root package name */
    public a0.b f1876d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1877e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f1878f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f1879g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f1880h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1881i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f1882j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f1883k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f1884l0;

    /* renamed from: m0, reason: collision with root package name */
    public long f1885m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f1886n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1887o0;

    /* renamed from: p0, reason: collision with root package name */
    public ArrayList f1888p0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f1889q0;

    /* renamed from: r0, reason: collision with root package name */
    public ArrayList f1890r0;

    /* renamed from: s0, reason: collision with root package name */
    public CopyOnWriteArrayList f1891s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f1892t0;

    /* renamed from: u0, reason: collision with root package name */
    public long f1893u0;

    /* renamed from: v0, reason: collision with root package name */
    public float f1894v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1895w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f1896x0;

    /* renamed from: y, reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.a f1897y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f1898y0;

    /* renamed from: z, reason: collision with root package name */
    public Interpolator f1899z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1900z0;

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1906a;

        public a(View view) {
            this.f1906a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1906a.setNestedScrollingEnabled(true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.J0.a();
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1909a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            f1909a = iArr;
            try {
                iArr[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1909a[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1909a[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1909a[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class d extends n {

        /* renamed from: a, reason: collision with root package name */
        public float f1910a = 0.0f;

        /* renamed from: b, reason: collision with root package name */
        public float f1911b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f1912c;

        public d() {
        }

        @Override // a0.n
        public float a() {
            return MotionLayout.this.B;
        }

        public void b(float f10, float f11, float f12) {
            this.f1910a = f10;
            this.f1911b = f11;
            this.f1912c = f12;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11;
            float f12;
            float f13 = this.f1910a;
            if (f13 > 0.0f) {
                float f14 = this.f1912c;
                if (f13 / f14 < f10) {
                    f10 = f13 / f14;
                }
                MotionLayout.this.B = f13 - (f14 * f10);
                f11 = (f13 * f10) - (((f14 * f10) * f10) / 2.0f);
                f12 = this.f1911b;
            } else {
                float f15 = this.f1912c;
                if ((-f13) / f15 < f10) {
                    f10 = (-f13) / f15;
                }
                MotionLayout.this.B = (f15 * f10) + f13;
                f11 = (f13 * f10) + (((f15 * f10) * f10) / 2.0f);
                f12 = this.f1911b;
            }
            return f11 + f12;
        }
    }

    public class e {

        /* renamed from: a, reason: collision with root package name */
        public float[] f1914a;

        /* renamed from: b, reason: collision with root package name */
        public int[] f1915b;

        /* renamed from: c, reason: collision with root package name */
        public float[] f1916c;

        /* renamed from: d, reason: collision with root package name */
        public Path f1917d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f1918e;

        /* renamed from: f, reason: collision with root package name */
        public Paint f1919f;

        /* renamed from: g, reason: collision with root package name */
        public Paint f1920g;

        /* renamed from: h, reason: collision with root package name */
        public Paint f1921h;

        /* renamed from: i, reason: collision with root package name */
        public Paint f1922i;

        /* renamed from: j, reason: collision with root package name */
        public float[] f1923j;

        /* renamed from: p, reason: collision with root package name */
        public DashPathEffect f1929p;

        /* renamed from: q, reason: collision with root package name */
        public int f1930q;

        /* renamed from: t, reason: collision with root package name */
        public int f1933t;

        /* renamed from: k, reason: collision with root package name */
        public final int f1924k = -21965;

        /* renamed from: l, reason: collision with root package name */
        public final int f1925l = -2067046;

        /* renamed from: m, reason: collision with root package name */
        public final int f1926m = -13391360;

        /* renamed from: n, reason: collision with root package name */
        public final int f1927n = 1996488704;

        /* renamed from: o, reason: collision with root package name */
        public final int f1928o = 10;

        /* renamed from: r, reason: collision with root package name */
        public Rect f1931r = new Rect();

        /* renamed from: s, reason: collision with root package name */
        public boolean f1932s = false;

        public e() {
            this.f1933t = 1;
            Paint paint = new Paint();
            this.f1918e = paint;
            paint.setAntiAlias(true);
            this.f1918e.setColor(-21965);
            this.f1918e.setStrokeWidth(2.0f);
            Paint paint2 = this.f1918e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f1919f = paint3;
            paint3.setAntiAlias(true);
            this.f1919f.setColor(-2067046);
            this.f1919f.setStrokeWidth(2.0f);
            this.f1919f.setStyle(style);
            Paint paint4 = new Paint();
            this.f1920g = paint4;
            paint4.setAntiAlias(true);
            this.f1920g.setColor(-13391360);
            this.f1920g.setStrokeWidth(2.0f);
            this.f1920g.setStyle(style);
            Paint paint5 = new Paint();
            this.f1921h = paint5;
            paint5.setAntiAlias(true);
            this.f1921h.setColor(-13391360);
            this.f1921h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1923j = new float[8];
            Paint paint6 = new Paint();
            this.f1922i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f1929p = dashPathEffect;
            this.f1920g.setPathEffect(dashPathEffect);
            this.f1916c = new float[100];
            this.f1915b = new int[50];
            if (this.f1932s) {
                this.f1918e.setStrokeWidth(8.0f);
                this.f1922i.setStrokeWidth(8.0f);
                this.f1919f.setStrokeWidth(8.0f);
                this.f1933t = 4;
            }
        }

        public void a(Canvas canvas, HashMap map, int i10, int i11) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i11 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.E) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f1921h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f1918e);
            }
            for (l lVar : map.values()) {
                int iL = lVar.l();
                if (i11 > 0 && iL == 0) {
                    iL = 1;
                }
                if (iL != 0) {
                    this.f1930q = lVar.b(this.f1916c, this.f1915b);
                    if (iL >= 1) {
                        int i12 = i10 / 16;
                        float[] fArr = this.f1914a;
                        if (fArr == null || fArr.length != i12 * 2) {
                            this.f1914a = new float[i12 * 2];
                            this.f1917d = new Path();
                        }
                        int i13 = this.f1933t;
                        canvas.translate(i13, i13);
                        this.f1918e.setColor(1996488704);
                        this.f1922i.setColor(1996488704);
                        this.f1919f.setColor(1996488704);
                        this.f1920g.setColor(1996488704);
                        lVar.c(this.f1914a, i12);
                        b(canvas, iL, this.f1930q, lVar);
                        this.f1918e.setColor(-21965);
                        this.f1919f.setColor(-2067046);
                        this.f1922i.setColor(-2067046);
                        this.f1920g.setColor(-13391360);
                        int i14 = this.f1933t;
                        canvas.translate(-i14, -i14);
                        b(canvas, iL, this.f1930q, lVar);
                        if (iL == 5) {
                            j(canvas, lVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i10, int i11, l lVar) {
            if (i10 == 4) {
                d(canvas);
            }
            if (i10 == 2) {
                g(canvas);
            }
            if (i10 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i10, i11, lVar);
        }

        public final void c(Canvas canvas) {
            canvas.drawLines(this.f1914a, this.f1918e);
        }

        public final void d(Canvas canvas) {
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 = 0; i10 < this.f1930q; i10++) {
                int i11 = this.f1915b[i10];
                if (i11 == 1) {
                    z10 = true;
                }
                if (i11 == 0) {
                    z11 = true;
                }
            }
            if (z10) {
                g(canvas);
            }
            if (z11) {
                e(canvas);
            }
        }

        public final void e(Canvas canvas) {
            float[] fArr = this.f1914a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f1920g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f1920g);
        }

        public final void f(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f1914a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fMin = Math.min(f12, f14);
            float fMax = Math.max(f13, f15);
            float fMin2 = f10 - Math.min(f12, f14);
            float fMax2 = Math.max(f13, f15) - f11;
            String str = "" + (((int) (((fMin2 * 100.0f) / Math.abs(f14 - f12)) + 0.5d)) / 100.0f);
            l(str, this.f1921h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f1931r.width() / 2)) + fMin, f11 - 20.0f, this.f1921h);
            canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f1920g);
            String str2 = "" + (((int) (((fMax2 * 100.0f) / Math.abs(f15 - f13)) + 0.5d)) / 100.0f);
            l(str2, this.f1921h);
            canvas.drawText(str2, f10 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f1931r.height() / 2)), this.f1921h);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), this.f1920g);
        }

        public final void g(Canvas canvas) {
            float[] fArr = this.f1914a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1920g);
        }

        public final void h(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f1914a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f12 - f14, f13 - f15);
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f10 - f12) * f16) + ((f11 - f13) * f17)) / (fHypot * fHypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float fHypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            l(str, this.f1921h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f1931r.width() / 2), -20.0f, this.f1921h);
            canvas.drawLine(f10, f11, f19, f20, this.f1920g);
        }

        public final void i(Canvas canvas, float f10, float f11, int i10, int i11) {
            String str = "" + (((int) ((((f10 - (i10 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i10)) + 0.5d)) / 100.0f);
            l(str, this.f1921h);
            canvas.drawText(str, ((f10 / 2.0f) - (this.f1931r.width() / 2)) + 0.0f, f11 - 20.0f, this.f1921h);
            canvas.drawLine(f10, f11, Math.min(0.0f, 1.0f), f11, this.f1920g);
            String str2 = "" + (((int) ((((f11 - (i11 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i11)) + 0.5d)) / 100.0f);
            l(str2, this.f1921h);
            canvas.drawText(str2, 5.0f + f10, 0.0f - ((f11 / 2.0f) - (this.f1931r.height() / 2)), this.f1921h);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), this.f1920g);
        }

        public final void j(Canvas canvas, l lVar) {
            this.f1917d.reset();
            for (int i10 = 0; i10 <= 50; i10++) {
                lVar.d(i10 / 50, this.f1923j, 0);
                Path path = this.f1917d;
                float[] fArr = this.f1923j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f1917d;
                float[] fArr2 = this.f1923j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f1917d;
                float[] fArr3 = this.f1923j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f1917d;
                float[] fArr4 = this.f1923j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f1917d.close();
            }
            this.f1918e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f1917d, this.f1918e);
            canvas.translate(-2.0f, -2.0f);
            this.f1918e.setColor(-65536);
            canvas.drawPath(this.f1917d, this.f1918e);
        }

        public final void k(Canvas canvas, int i10, int i11, l lVar) {
            int width;
            int height;
            View view = lVar.f42b;
            if (view != null) {
                width = view.getWidth();
                height = lVar.f42b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i12 = 1; i12 < i11 - 1; i12++) {
                if (i10 != 4 || this.f1915b[i12 - 1] != 0) {
                    float[] fArr = this.f1916c;
                    int i13 = i12 * 2;
                    float f10 = fArr[i13];
                    float f11 = fArr[i13 + 1];
                    this.f1917d.reset();
                    this.f1917d.moveTo(f10, f11 + 10.0f);
                    this.f1917d.lineTo(f10 + 10.0f, f11);
                    this.f1917d.lineTo(f10, f11 - 10.0f);
                    this.f1917d.lineTo(f10 - 10.0f, f11);
                    this.f1917d.close();
                    int i14 = i12 - 1;
                    lVar.p(i14);
                    if (i10 == 4) {
                        int i15 = this.f1915b[i14];
                        if (i15 == 1) {
                            h(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i15 == 0) {
                            f(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i15 == 2) {
                            i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.f1917d, this.f1922i);
                    }
                    if (i10 == 2) {
                        h(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 3) {
                        f(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 6) {
                        i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f1917d, this.f1922i);
                }
            }
            float[] fArr2 = this.f1914a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f1919f);
                float[] fArr3 = this.f1914a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f1919f);
            }
        }

        public void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1931r);
        }
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f1935a = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: b, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f1936b = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: c, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f1937c = null;

        /* renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f1938d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f1939e;

        /* renamed from: f, reason: collision with root package name */
        public int f1940f;

        public f() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0130 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 338
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.f.a():void");
        }

        public void b(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ArrayList arrayListM1 = dVar.m1();
            HashMap map = new HashMap();
            map.put(dVar, dVar2);
            dVar2.m1().clear();
            dVar2.m(dVar, map);
            int size = arrayListM1.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListM1.get(i11);
                i11++;
                ConstraintWidget constraintWidget = (ConstraintWidget) obj;
                ConstraintWidget aVar = constraintWidget instanceof androidx.constraintlayout.core.widgets.a ? new androidx.constraintlayout.core.widgets.a() : constraintWidget instanceof androidx.constraintlayout.core.widgets.f ? new androidx.constraintlayout.core.widgets.f() : constraintWidget instanceof androidx.constraintlayout.core.widgets.e ? new androidx.constraintlayout.core.widgets.e() : constraintWidget instanceof x.a ? new x.b() : new ConstraintWidget();
                dVar2.a(aVar);
                map.put(constraintWidget, aVar);
            }
            int size2 = arrayListM1.size();
            while (i10 < size2) {
                Object obj2 = arrayListM1.get(i10);
                i10++;
                ConstraintWidget constraintWidget2 = (ConstraintWidget) obj2;
                ((ConstraintWidget) map.get(constraintWidget2)).m(constraintWidget2, map);
            }
        }

        public ConstraintWidget c(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.t() == view) {
                return dVar;
            }
            ArrayList arrayListM1 = dVar.m1();
            int size = arrayListM1.size();
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayListM1.get(i10);
                if (constraintWidget.t() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void d(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.c cVar, androidx.constraintlayout.widget.c cVar2) {
            this.f1937c = cVar;
            this.f1938d = cVar2;
            this.f1935a = new androidx.constraintlayout.core.widgets.d();
            this.f1936b = new androidx.constraintlayout.core.widgets.d();
            this.f1935a.Q1(MotionLayout.this.f2097c.D1());
            this.f1936b.Q1(MotionLayout.this.f2097c.D1());
            this.f1935a.p1();
            this.f1936b.p1();
            b(MotionLayout.this.f2097c, this.f1935a);
            b(MotionLayout.this.f2097c, this.f1936b);
            if (MotionLayout.this.M > 0.5d) {
                if (cVar != null) {
                    i(this.f1935a, cVar);
                }
                i(this.f1936b, cVar2);
            } else {
                i(this.f1936b, cVar2);
                if (cVar != null) {
                    i(this.f1935a, cVar);
                }
            }
            this.f1935a.T1(MotionLayout.this.r());
            this.f1935a.V1();
            this.f1936b.T1(MotionLayout.this.r());
            this.f1936b.V1();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f1935a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar2.K0(dimensionBehaviour);
                    this.f1936b.K0(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.d dVar3 = this.f1935a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar3.b1(dimensionBehaviour2);
                    this.f1936b.b1(dimensionBehaviour2);
                }
            }
        }

        public boolean e(int i10, int i11) {
            return (i10 == this.f1939e && i11 == this.f1940f) ? false : true;
        }

        public void f(int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.E0 = mode;
            motionLayout.F0 = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.D == motionLayout2.getStartState()) {
                MotionLayout motionLayout3 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar = this.f1936b;
                androidx.constraintlayout.widget.c cVar = this.f1938d;
                motionLayout3.v(dVar, optimizationLevel, (cVar == null || cVar.f2194d == 0) ? i10 : i11, (cVar == null || cVar.f2194d == 0) ? i11 : i10);
                androidx.constraintlayout.widget.c cVar2 = this.f1937c;
                if (cVar2 != null) {
                    MotionLayout motionLayout4 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f1935a;
                    int i12 = cVar2.f2194d;
                    motionLayout4.v(dVar2, optimizationLevel, i12 == 0 ? i10 : i11, i12 == 0 ? i11 : i10);
                }
            } else {
                androidx.constraintlayout.widget.c cVar3 = this.f1937c;
                if (cVar3 != null) {
                    MotionLayout motionLayout5 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.d dVar3 = this.f1935a;
                    int i13 = cVar3.f2194d;
                    motionLayout5.v(dVar3, optimizationLevel, i13 == 0 ? i10 : i11, i13 == 0 ? i11 : i10);
                }
                MotionLayout motionLayout6 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar4 = this.f1936b;
                androidx.constraintlayout.widget.c cVar4 = this.f1938d;
                motionLayout6.v(dVar4, optimizationLevel, (cVar4 == null || cVar4.f2194d == 0) ? i10 : i11, (cVar4 == null || cVar4.f2194d == 0) ? i11 : i10);
            }
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                MotionLayout motionLayout7 = MotionLayout.this;
                motionLayout7.E0 = mode;
                motionLayout7.F0 = mode2;
                if (motionLayout7.D == motionLayout7.getStartState()) {
                    MotionLayout motionLayout8 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.d dVar5 = this.f1936b;
                    int i14 = this.f1938d.f2194d;
                    motionLayout8.v(dVar5, optimizationLevel, i14 == 0 ? i10 : i11, i14 == 0 ? i11 : i10);
                    androidx.constraintlayout.widget.c cVar5 = this.f1937c;
                    if (cVar5 != null) {
                        MotionLayout motionLayout9 = MotionLayout.this;
                        androidx.constraintlayout.core.widgets.d dVar6 = this.f1935a;
                        int i15 = cVar5.f2194d;
                        motionLayout9.v(dVar6, optimizationLevel, i15 == 0 ? i10 : i11, i15 == 0 ? i11 : i10);
                    }
                } else {
                    androidx.constraintlayout.widget.c cVar6 = this.f1937c;
                    if (cVar6 != null) {
                        MotionLayout motionLayout10 = MotionLayout.this;
                        androidx.constraintlayout.core.widgets.d dVar7 = this.f1935a;
                        int i16 = cVar6.f2194d;
                        motionLayout10.v(dVar7, optimizationLevel, i16 == 0 ? i10 : i11, i16 == 0 ? i11 : i10);
                    }
                    MotionLayout motionLayout11 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.d dVar8 = this.f1936b;
                    int i17 = this.f1938d.f2194d;
                    motionLayout11.v(dVar8, optimizationLevel, i17 == 0 ? i10 : i11, i17 == 0 ? i11 : i10);
                }
                MotionLayout.this.A0 = this.f1935a.U();
                MotionLayout.this.B0 = this.f1935a.y();
                MotionLayout.this.C0 = this.f1936b.U();
                MotionLayout.this.D0 = this.f1936b.y();
                MotionLayout motionLayout12 = MotionLayout.this;
                motionLayout12.f1900z0 = (motionLayout12.A0 == motionLayout12.C0 && motionLayout12.B0 == motionLayout12.D0) ? false : true;
            }
            MotionLayout motionLayout13 = MotionLayout.this;
            int i18 = motionLayout13.A0;
            int i19 = motionLayout13.B0;
            int i20 = motionLayout13.E0;
            if (i20 == Integer.MIN_VALUE || i20 == 0) {
                i18 = (int) (i18 + (motionLayout13.G0 * (motionLayout13.C0 - i18)));
            }
            int i21 = i18;
            int i22 = motionLayout13.F0;
            if (i22 == Integer.MIN_VALUE || i22 == 0) {
                i19 = (int) (i19 + (motionLayout13.G0 * (motionLayout13.D0 - i19)));
            }
            MotionLayout.this.u(i10, i11, i21, i19, this.f1935a.L1() || this.f1936b.L1(), this.f1935a.J1() || this.f1936b.J1());
        }

        public void g() {
            f(MotionLayout.this.F, MotionLayout.this.G);
            MotionLayout.this.B0();
        }

        public void h(int i10, int i11) {
            this.f1939e = i10;
            this.f1940f = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void i(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.c cVar) {
            SparseArray sparseArray = new SparseArray();
            d.a aVar = new d.a(-2, -2);
            sparseArray.clear();
            int i10 = 0;
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            if (cVar != null && cVar.f2194d != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.v(this.f1936b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            ArrayList arrayListM1 = dVar.m1();
            int size = arrayListM1.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListM1.get(i11);
                i11++;
                ConstraintWidget constraintWidget = (ConstraintWidget) obj;
                sparseArray.put(((View) constraintWidget.t()).getId(), constraintWidget);
            }
            ArrayList arrayListM12 = dVar.m1();
            int size2 = arrayListM12.size();
            int i12 = 0;
            while (i12 < size2) {
                int i13 = i12 + 1;
                ConstraintWidget constraintWidget2 = (ConstraintWidget) arrayListM12.get(i12);
                View view = (View) constraintWidget2.t();
                cVar.l(view.getId(), aVar);
                constraintWidget2.f1(cVar.B(view.getId()));
                constraintWidget2.G0(cVar.w(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    cVar.j((androidx.constraintlayout.widget.b) view, constraintWidget2, aVar, sparseArray);
                    if (view instanceof androidx.constraintlayout.widget.a) {
                        ((androidx.constraintlayout.widget.a) view).v();
                    }
                }
                aVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.d(false, view, constraintWidget2, aVar, sparseArray);
                if (cVar.A(view.getId()) == 1) {
                    constraintWidget2.e1(view.getVisibility());
                } else {
                    constraintWidget2.e1(cVar.z(view.getId()));
                }
                i12 = i13;
            }
            ArrayList arrayListM13 = dVar.m1();
            int size3 = arrayListM13.size();
            while (i10 < size3) {
                Object obj2 = arrayListM13.get(i10);
                i10++;
                ConstraintWidget constraintWidget3 = (ConstraintWidget) obj2;
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.h) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) constraintWidget3.t();
                    x.a aVar2 = (x.a) constraintWidget3;
                    bVar.t(dVar, aVar2, sparseArray);
                    ((androidx.constraintlayout.core.widgets.h) aVar2).p1();
                }
            }
        }
    }

    public interface g {
        void a(MotionEvent motionEvent);

        float b();

        float c();

        void d();

        void e(int i10);
    }

    public static class h implements g {

        /* renamed from: b, reason: collision with root package name */
        public static h f1942b = new h();

        /* renamed from: a, reason: collision with root package name */
        public VelocityTracker f1943a;

        public static h f() {
            f1942b.f1943a = VelocityTracker.obtain();
            return f1942b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public void a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f1943a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public float b() {
            VelocityTracker velocityTracker = this.f1943a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public float c() {
            VelocityTracker velocityTracker = this.f1943a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public void d() {
            VelocityTracker velocityTracker = this.f1943a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1943a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public void e(int i10) {
            VelocityTracker velocityTracker = this.f1943a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10);
            }
        }
    }

    public class i {

        /* renamed from: a, reason: collision with root package name */
        public float f1944a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        public float f1945b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        public int f1946c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f1947d = -1;

        /* renamed from: e, reason: collision with root package name */
        public final String f1948e = "motion.progress";

        /* renamed from: f, reason: collision with root package name */
        public final String f1949f = "motion.velocity";

        /* renamed from: g, reason: collision with root package name */
        public final String f1950g = "motion.StartState";

        /* renamed from: h, reason: collision with root package name */
        public final String f1951h = "motion.EndState";

        public i() {
        }

        public void a() {
            int i10 = this.f1946c;
            if (i10 != -1 || this.f1947d != -1) {
                if (i10 == -1) {
                    MotionLayout.this.H0(this.f1947d);
                } else {
                    int i11 = this.f1947d;
                    if (i11 == -1) {
                        MotionLayout.this.z0(i10, -1, -1);
                    } else {
                        MotionLayout.this.A0(i10, i11);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.f1945b)) {
                if (Float.isNaN(this.f1944a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f1944a);
            } else {
                MotionLayout.this.y0(this.f1944a, this.f1945b);
                this.f1944a = Float.NaN;
                this.f1945b = Float.NaN;
                this.f1946c = -1;
                this.f1947d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1944a);
            bundle.putFloat("motion.velocity", this.f1945b);
            bundle.putInt("motion.StartState", this.f1946c);
            bundle.putInt("motion.EndState", this.f1947d);
            return bundle;
        }

        public void c() {
            this.f1947d = MotionLayout.this.E;
            this.f1946c = MotionLayout.this.C;
            this.f1945b = MotionLayout.this.getVelocity();
            this.f1944a = MotionLayout.this.getProgress();
        }

        public void d(int i10) {
            this.f1947d = i10;
        }

        public void e(float f10) {
            this.f1944a = f10;
        }

        public void f(int i10) {
            this.f1946c = i10;
        }

        public void g(Bundle bundle) {
            this.f1944a = bundle.getFloat("motion.progress");
            this.f1945b = bundle.getFloat("motion.velocity");
            this.f1946c = bundle.getInt("motion.StartState");
            this.f1947d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f1945b = f10;
        }
    }

    public interface j {
        void a(MotionLayout motionLayout, int i10, int i11, float f10);

        void b(MotionLayout motionLayout, int i10);

        void c(MotionLayout motionLayout, int i10, int i11);
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.A = null;
        this.B = 0.0f;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = 0;
        this.G = 0;
        this.H = true;
        this.I = new HashMap();
        this.J = 0L;
        this.K = 1.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        this.O = 0.0f;
        this.Q = false;
        this.R = false;
        this.V = 0;
        this.f1871a0 = false;
        this.f1873b0 = new z.a();
        this.f1875c0 = new d();
        this.f1877e0 = true;
        this.f1882j0 = false;
        this.f1887o0 = false;
        this.f1888p0 = null;
        this.f1889q0 = null;
        this.f1890r0 = null;
        this.f1891s0 = null;
        this.f1892t0 = 0;
        this.f1893u0 = -1L;
        this.f1894v0 = 0.0f;
        this.f1895w0 = 0;
        this.f1896x0 = 0.0f;
        this.f1898y0 = false;
        this.f1900z0 = false;
        this.H0 = new v.d();
        this.I0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = 0;
        this.N0 = false;
        this.O0 = 0;
        this.P0 = new HashMap();
        this.T0 = new Rect();
        this.U0 = false;
        this.V0 = TransitionState.UNDEFINED;
        this.W0 = new f();
        this.X0 = false;
        this.Y0 = new RectF();
        this.Z0 = null;
        this.f1872a1 = null;
        this.f1874b1 = new ArrayList();
        s0(null);
    }

    public static boolean M0(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            float f13 = f10 / f12;
            return f11 + ((f10 * f13) - (((f12 * f13) * f13) / 2.0f)) > 1.0f;
        }
        float f14 = (-f10) / f12;
        return f11 + ((f10 * f14) + (((f12 * f14) * f14) / 2.0f)) < 0.0f;
    }

    public void A0(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.J0 == null) {
                this.J0 = new i();
            }
            this.J0.f(i10);
            this.J0.d(i11);
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar != null) {
            this.C = i10;
            this.E = i11;
            aVar.W(i10, i11);
            this.W0.d(this.f2097c, this.f1897y.k(i10), this.f1897y.k(i11));
            x0();
            this.M = 0.0f;
            G0();
        }
    }

    public final void B0() {
        int childCount = getChildCount();
        this.W0.a();
        this.Q = true;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            sparseArray.put(childAt.getId(), (l) this.I.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int i12 = this.f1897y.i();
        if (i12 != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                l lVar = (l) this.I.get(getChildAt(i13));
                if (lVar != null) {
                    lVar.x(i12);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.I.size()];
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            l lVar2 = (l) this.I.get(getChildAt(i15));
            if (lVar2.g() != -1) {
                sparseBooleanArray.put(lVar2.g(), true);
                iArr[i14] = lVar2.g();
                i14++;
            }
        }
        if (this.f1890r0 != null) {
            for (int i16 = 0; i16 < i14; i16++) {
                l lVar3 = (l) this.I.get(findViewById(iArr[i16]));
                if (lVar3 != null) {
                    this.f1897y.s(lVar3);
                }
            }
            ArrayList arrayList = this.f1890r0;
            int size = arrayList.size();
            int i17 = 0;
            while (i17 < size) {
                Object obj = arrayList.get(i17);
                i17++;
                ((m) obj).C(this, this.I);
            }
            for (int i18 = 0; i18 < i14; i18++) {
                l lVar4 = (l) this.I.get(findViewById(iArr[i18]));
                if (lVar4 != null) {
                    lVar4.C(width, height, this.K, getNanoTime());
                }
            }
        } else {
            for (int i19 = 0; i19 < i14; i19++) {
                l lVar5 = (l) this.I.get(findViewById(iArr[i19]));
                if (lVar5 != null) {
                    this.f1897y.s(lVar5);
                    lVar5.C(width, height, this.K, getNanoTime());
                }
            }
        }
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            l lVar6 = (l) this.I.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && lVar6 != null) {
                this.f1897y.s(lVar6);
                lVar6.C(width, height, this.K, getNanoTime());
            }
        }
        float fD = this.f1897y.D();
        if (fD != 0.0f) {
            boolean z10 = ((double) fD) < 0.0d;
            float fAbs = Math.abs(fD);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i21 = 0; i21 < childCount; i21++) {
                l lVar7 = (l) this.I.get(getChildAt(i21));
                if (!Float.isNaN(lVar7.f52l)) {
                    for (int i22 = 0; i22 < childCount; i22++) {
                        l lVar8 = (l) this.I.get(getChildAt(i22));
                        if (!Float.isNaN(lVar8.f52l)) {
                            fMin = Math.min(fMin, lVar8.f52l);
                            fMax = Math.max(fMax, lVar8.f52l);
                        }
                    }
                    while (i10 < childCount) {
                        l lVar9 = (l) this.I.get(getChildAt(i10));
                        if (!Float.isNaN(lVar9.f52l)) {
                            lVar9.f54n = 1.0f / (1.0f - fAbs);
                            if (z10) {
                                lVar9.f53m = fAbs - (((fMax - lVar9.f52l) / (fMax - fMin)) * fAbs);
                            } else {
                                lVar9.f53m = fAbs - (((lVar9.f52l - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i10++;
                    }
                    return;
                }
                float fM = lVar7.m();
                float fN = lVar7.n();
                float f10 = z10 ? fN - fM : fN + fM;
                fMin2 = Math.min(fMin2, f10);
                fMax2 = Math.max(fMax2, f10);
            }
            while (i10 < childCount) {
                l lVar10 = (l) this.I.get(getChildAt(i10));
                float fM2 = lVar10.m();
                float fN2 = lVar10.n();
                float f11 = z10 ? fN2 - fM2 : fN2 + fM2;
                lVar10.f54n = 1.0f / (1.0f - fAbs);
                lVar10.f53m = fAbs - (((f11 - fMin2) * fAbs) / (fMax2 - fMin2));
                i10++;
            }
        }
    }

    public final Rect C0(ConstraintWidget constraintWidget) {
        this.T0.top = constraintWidget.W();
        this.T0.left = constraintWidget.V();
        Rect rect = this.T0;
        int iU = constraintWidget.U();
        Rect rect2 = this.T0;
        rect.right = iU + rect2.left;
        int iY = constraintWidget.y();
        Rect rect3 = this.T0;
        rect2.bottom = iY + rect3.top;
        return rect3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D0(int r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.D0(int, float, float):void");
    }

    public void E0() {
        c0(1.0f);
        this.K0 = null;
    }

    public void F0(Runnable runnable) {
        c0(1.0f);
        this.K0 = runnable;
    }

    public void G0() {
        c0(0.0f);
    }

    public void H0(int i10) {
        if (isAttachedToWindow()) {
            I0(i10, -1, -1);
            return;
        }
        if (this.J0 == null) {
            this.J0 = new i();
        }
        this.J0.d(i10);
    }

    public void I0(int i10, int i11, int i12) {
        J0(i10, i11, i12, -1);
    }

    public void J0(int i10, int i11, int i12, int i13) {
        b0.f fVar;
        int iA;
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar != null && (fVar = aVar.f1954b) != null && (iA = fVar.a(this.D, i10, i11, i12)) != -1) {
            i10 = iA;
        }
        int i14 = this.D;
        if (i14 == i10) {
            return;
        }
        if (this.C == i10) {
            c0(0.0f);
            if (i13 > 0) {
                this.K = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.E == i10) {
            c0(1.0f);
            if (i13 > 0) {
                this.K = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.E = i10;
        if (i14 != -1) {
            A0(i14, i10);
            c0(1.0f);
            this.M = 0.0f;
            E0();
            if (i13 > 0) {
                this.K = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f1871a0 = false;
        this.O = 1.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = getNanoTime();
        this.J = getNanoTime();
        this.P = false;
        this.f1899z = null;
        if (i13 == -1) {
            this.K = this.f1897y.o() / 1000.0f;
        }
        this.C = -1;
        this.f1897y.W(-1, this.E);
        SparseArray sparseArray = new SparseArray();
        if (i13 == 0) {
            this.K = this.f1897y.o() / 1000.0f;
        } else if (i13 > 0) {
            this.K = i13 / 1000.0f;
        }
        int childCount = getChildCount();
        this.I.clear();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            this.I.put(childAt, new l(childAt));
            sparseArray.put(childAt.getId(), (l) this.I.get(childAt));
        }
        this.Q = true;
        this.W0.d(this.f2097c, null, this.f1897y.k(i10));
        x0();
        this.W0.a();
        h0();
        int width = getWidth();
        int height = getHeight();
        if (this.f1890r0 != null) {
            for (int i16 = 0; i16 < childCount; i16++) {
                l lVar = (l) this.I.get(getChildAt(i16));
                if (lVar != null) {
                    this.f1897y.s(lVar);
                }
            }
            ArrayList arrayList = this.f1890r0;
            int size = arrayList.size();
            int i17 = 0;
            while (i17 < size) {
                Object obj = arrayList.get(i17);
                i17++;
                ((m) obj).C(this, this.I);
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                l lVar2 = (l) this.I.get(getChildAt(i18));
                if (lVar2 != null) {
                    lVar2.C(width, height, this.K, getNanoTime());
                }
            }
        } else {
            for (int i19 = 0; i19 < childCount; i19++) {
                l lVar3 = (l) this.I.get(getChildAt(i19));
                if (lVar3 != null) {
                    this.f1897y.s(lVar3);
                    lVar3.C(width, height, this.K, getNanoTime());
                }
            }
        }
        float fD = this.f1897y.D();
        if (fD != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i20 = 0; i20 < childCount; i20++) {
                l lVar4 = (l) this.I.get(getChildAt(i20));
                float fN = lVar4.n() + lVar4.m();
                fMin = Math.min(fMin, fN);
                fMax = Math.max(fMax, fN);
            }
            for (int i21 = 0; i21 < childCount; i21++) {
                l lVar5 = (l) this.I.get(getChildAt(i21));
                float fM = lVar5.m();
                float fN2 = lVar5.n();
                lVar5.f54n = 1.0f / (1.0f - fD);
                lVar5.f53m = fD - ((((fM + fN2) - fMin) * fD) / (fMax - fMin));
            }
        }
        this.L = 0.0f;
        this.M = 0.0f;
        this.Q = true;
        invalidate();
    }

    public void K0() {
        this.W0.d(this.f2097c, this.f1897y.k(this.C), this.f1897y.k(this.E));
        x0();
    }

    public void L0(int i10, androidx.constraintlayout.widget.c cVar) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar != null) {
            aVar.T(i10, cVar);
        }
        K0();
        if (this.D == i10) {
            cVar.i(this);
        }
    }

    public void c0(float f10) {
        if (this.f1897y == null) {
            return;
        }
        float f11 = this.M;
        float f12 = this.L;
        if (f11 != f12 && this.P) {
            this.M = f12;
        }
        float f13 = this.M;
        if (f13 == f10) {
            return;
        }
        this.f1871a0 = false;
        this.O = f10;
        this.K = r0.o() / 1000.0f;
        setProgress(this.O);
        this.f1899z = null;
        this.A = this.f1897y.r();
        this.P = false;
        this.J = getNanoTime();
        this.Q = true;
        this.L = f13;
        this.M = f13;
        invalidate();
    }

    public final boolean d0(View view, MotionEvent motionEvent, float f10, float f11) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f10, f11);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f10, -f11);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f10, f11);
        if (this.f1872a1 == null) {
            this.f1872a1 = new Matrix();
        }
        matrix.invert(this.f1872a1);
        motionEventObtain.transform(this.f1872a1);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        androidx.constraintlayout.motion.widget.d dVar;
        ArrayList arrayList = this.f1890r0;
        int i10 = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((m) obj).B(canvas);
            }
        }
        j0(false);
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar != null && (dVar = aVar.f1971s) != null) {
            dVar.c();
        }
        super.dispatchDraw(canvas);
        if (this.f1897y == null) {
            return;
        }
        if ((this.V & 1) == 1 && !isInEditMode()) {
            this.f1892t0++;
            long nanoTime = getNanoTime();
            long j10 = this.f1893u0;
            if (j10 != -1) {
                if (nanoTime - j10 > 200000000) {
                    this.f1894v0 = ((int) ((this.f1892t0 / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f1892t0 = 0;
                    this.f1893u0 = nanoTime;
                }
            } else {
                this.f1893u0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.f1894v0 + " fps " + a0.a.e(this, this.C) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(a0.a.e(this, this.E));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i12 = this.D;
            sb.append(i12 == -1 ? AdError.UNDEFINED_DOMAIN : a0.a.e(this, i12));
            String string = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.V > 1) {
            if (this.W == null) {
                this.W = new e();
            }
            this.W.a(canvas, this.I, this.f1897y.o(), this.V);
        }
        ArrayList arrayList2 = this.f1890r0;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((m) obj2).A(canvas);
            }
        }
    }

    public final void e0() {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iE = aVar.E();
        androidx.constraintlayout.motion.widget.a aVar2 = this.f1897y;
        f0(iE, aVar2.k(aVar2.E()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        ArrayList arrayListN = this.f1897y.n();
        int size = arrayListN.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListN.get(i10);
            i10++;
            a.b bVar = (a.b) obj;
            if (bVar == this.f1897y.f1955c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            g0(bVar);
            int iA = bVar.A();
            int iY = bVar.y();
            String strC = a0.a.c(getContext(), iA);
            String strC2 = a0.a.c(getContext(), iY);
            if (sparseIntArray.get(iA) == iY) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strC + "->" + strC2);
            }
            if (sparseIntArray2.get(iY) == iA) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strC + "->" + strC2);
            }
            sparseIntArray.put(iA, iY);
            sparseIntArray2.put(iY, iA);
            if (this.f1897y.k(iA) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + strC);
            }
            if (this.f1897y.k(iY) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + strC);
            }
        }
    }

    public final void f0(int i10, androidx.constraintlayout.widget.c cVar) {
        String strC = a0.a.c(getContext(), i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id = childAt.getId();
            if (id == -1) {
                Log.w("MotionLayout", "CHECK: " + strC + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (cVar.v(id) == null) {
                Log.w("MotionLayout", "CHECK: " + strC + " NO CONSTRAINTS for " + a0.a.d(childAt));
            }
        }
        int[] iArrX = cVar.x();
        for (int i12 = 0; i12 < iArrX.length; i12++) {
            int i13 = iArrX[i12];
            String strC2 = a0.a.c(getContext(), i13);
            if (findViewById(iArrX[i12]) == null) {
                Log.w("MotionLayout", "CHECK: " + strC + " NO View matches id " + strC2);
            }
            if (cVar.w(i13) == -1) {
                Log.w("MotionLayout", "CHECK: " + strC + "(" + strC2 + ") no LAYOUT_HEIGHT");
            }
            if (cVar.B(i13) == -1) {
                Log.w("MotionLayout", "CHECK: " + strC + "(" + strC2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    public final void g0(a.b bVar) {
        if (bVar.A() == bVar.y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar == null) {
            return null;
        }
        return aVar.m();
    }

    public int getCurrentState() {
        return this.D;
    }

    public ArrayList<a.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar == null) {
            return null;
        }
        return aVar.n();
    }

    public a0.b getDesignTool() {
        if (this.f1876d0 == null) {
            this.f1876d0 = new a0.b(this);
        }
        return this.f1876d0;
    }

    public int getEndState() {
        return this.E;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.M;
    }

    public int getStartState() {
        return this.C;
    }

    public float getTargetPosition() {
        return this.O;
    }

    public Bundle getTransitionState() {
        if (this.J0 == null) {
            this.J0 = new i();
        }
        this.J0.c();
        return this.J0.b();
    }

    public long getTransitionTimeMs() {
        if (this.f1897y != null) {
            this.K = r0.o() / 1000.0f;
        }
        return (long) (this.K * 1000.0f);
    }

    public float getVelocity() {
        return this.B;
    }

    public final void h0() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            l lVar = (l) this.I.get(childAt);
            if (lVar != null) {
                lVar.y(childAt);
            }
        }
    }

    @Override // androidx.core.view.d0
    public void i(View view, View view2, int i10, int i11) {
        this.f1885m0 = getNanoTime();
        this.f1886n0 = 0.0f;
        this.f1883k0 = 0.0f;
        this.f1884l0 = 0.0f;
    }

    public void i0(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            l lVar = (l) this.I.get(getChildAt(i10));
            if (lVar != null) {
                lVar.e(z10);
            }
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.core.view.d0
    public void j(View view, int i10) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar != null) {
            float f10 = this.f1886n0;
            if (f10 == 0.0f) {
                return;
            }
            aVar.P(this.f1883k0 / f10, this.f1884l0 / f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ae, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j0(boolean r21) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.j0(boolean):void");
    }

    @Override // androidx.core.view.d0
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVarB;
        int iQ;
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar == null || (bVar = aVar.f1955c) == null || !bVar.C()) {
            return;
        }
        int i13 = -1;
        if (!bVar.C() || (bVarB = bVar.B()) == null || (iQ = bVarB.q()) == -1 || view.getId() == iQ) {
            if (aVar.v()) {
                androidx.constraintlayout.motion.widget.b bVarB2 = bVar.B();
                if (bVarB2 != null && (bVarB2.e() & 4) != 0) {
                    i13 = i11;
                }
                float f10 = this.L;
                if ((f10 == 1.0f || f10 == 0.0f) && view.canScrollVertically(i13)) {
                    return;
                }
            }
            if (bVar.B() != null && (bVar.B().e() & 1) != 0) {
                float fW = aVar.w(i10, i11);
                float f11 = this.M;
                if ((f11 <= 0.0f && fW < 0.0f) || (f11 >= 1.0f && fW > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f12 = this.L;
            long nanoTime = getNanoTime();
            float f13 = i10;
            this.f1883k0 = f13;
            float f14 = i11;
            this.f1884l0 = f14;
            this.f1886n0 = (float) ((nanoTime - this.f1885m0) * 1.0E-9d);
            this.f1885m0 = nanoTime;
            aVar.O(f13, f14);
            if (f12 != this.L) {
                iArr[0] = i10;
                iArr[1] = i11;
            }
            j0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f1882j0 = true;
        }
    }

    public final void k0() {
        boolean z10;
        float fSignum = Math.signum(this.O - this.M);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f1899z;
        float interpolation = this.M + (!(interpolator instanceof z.a) ? (((nanoTime - this.N) * fSignum) * 1.0E-9f) / this.K : 0.0f);
        if (this.P) {
            interpolation = this.O;
        }
        if ((fSignum <= 0.0f || interpolation < this.O) && (fSignum > 0.0f || interpolation > this.O)) {
            z10 = false;
        } else {
            interpolation = this.O;
            z10 = true;
        }
        if (interpolator != null && !z10) {
            interpolation = this.f1871a0 ? interpolator.getInterpolation((nanoTime - this.J) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.O) || (fSignum <= 0.0f && interpolation <= this.O)) {
            interpolation = this.O;
        }
        this.G0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.A;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        float f10 = interpolation;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            l lVar = (l) this.I.get(childAt);
            if (lVar != null) {
                lVar.s(childAt, f10, nanoTime2, this.H0);
            }
        }
        if (this.f1900z0) {
            requestLayout();
        }
    }

    public final void l0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.S == null && ((copyOnWriteArrayList = this.f1891s0) == null || copyOnWriteArrayList.isEmpty())) || this.f1896x0 == this.L) {
            return;
        }
        if (this.f1895w0 != -1) {
            j jVar = this.S;
            if (jVar != null) {
                jVar.c(this, this.C, this.E);
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f1891s0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).c(this, this.C, this.E);
                }
            }
            this.f1898y0 = true;
        }
        this.f1895w0 = -1;
        float f10 = this.L;
        this.f1896x0 = f10;
        j jVar2 = this.S;
        if (jVar2 != null) {
            jVar2.a(this, this.C, this.E, f10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.f1891s0;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((j) it2.next()).a(this, this.C, this.E, this.L);
            }
        }
        this.f1898y0 = true;
    }

    @Override // androidx.core.view.e0
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f1882j0 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f1882j0 = false;
    }

    public void m0() {
        int iIntValue;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.S != null || ((copyOnWriteArrayList = this.f1891s0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1895w0 == -1) {
            this.f1895w0 = this.D;
            if (this.f1874b1.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList arrayList = this.f1874b1;
                iIntValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            }
            int i10 = this.D;
            if (iIntValue != i10 && i10 != -1) {
                this.f1874b1.add(Integer.valueOf(i10));
            }
        }
        w0();
        Runnable runnable = this.K0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.L0;
        if (iArr == null || this.M0 <= 0) {
            return;
        }
        H0(iArr[0]);
        int[] iArr2 = this.L0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.M0--;
    }

    @Override // androidx.core.view.d0
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public void n0(int i10, float f10, float f11, float f12, float[] fArr) throws Resources.NotFoundException {
        String resourceName;
        HashMap map = this.I;
        View viewL = l(i10);
        l lVar = (l) map.get(viewL);
        if (lVar != null) {
            lVar.k(f10, f11, f12, fArr);
            float y10 = viewL.getY();
            this.T = f10;
            this.U = y10;
            return;
        }
        if (viewL == null) {
            resourceName = "" + i10;
        } else {
            resourceName = viewL.getContext().getResources().getResourceName(i10);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    @Override // androidx.core.view.d0
    public boolean o(View view, View view2, int i10, int i11) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        return (aVar == null || (bVar = aVar.f1955c) == null || bVar.B() == null || (this.f1897y.f1955c.B().e() & 2) != 0) ? false : true;
    }

    public androidx.constraintlayout.widget.c o0(int i10) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar == null) {
            return null;
        }
        return aVar.k(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        a.b bVar;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.S0 = display.getRotation();
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar != null && (i10 = this.D) != -1) {
            androidx.constraintlayout.widget.c cVarK = aVar.k(i10);
            this.f1897y.S(this);
            ArrayList arrayList = this.f1890r0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((m) obj).z(this);
                }
            }
            if (cVarK != null) {
                cVarK.i(this);
            }
            this.C = this.D;
        }
        v0();
        i iVar = this.J0;
        if (iVar != null) {
            if (this.U0) {
                post(new b());
                return;
            } else {
                iVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.a aVar2 = this.f1897y;
        if (aVar2 == null || (bVar = aVar2.f1955c) == null || bVar.x() != 4) {
            return;
        }
        E0();
        setState(TransitionState.SETUP);
        setState(TransitionState.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.b bVarB;
        int iQ;
        RectF rectFP;
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar != null && this.H) {
            androidx.constraintlayout.motion.widget.d dVar = aVar.f1971s;
            if (dVar != null) {
                dVar.g(motionEvent);
            }
            a.b bVar = this.f1897y.f1955c;
            if (bVar != null && bVar.C() && (bVarB = bVar.B()) != null && ((motionEvent.getAction() != 0 || (rectFP = bVarB.p(this, new RectF())) == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) && (iQ = bVarB.q()) != -1)) {
                View view = this.Z0;
                if (view == null || view.getId() != iQ) {
                    this.Z0 = findViewById(iQ);
                }
                if (this.Z0 != null) {
                    this.Y0.set(r0.getLeft(), this.Z0.getTop(), this.Z0.getRight(), this.Z0.getBottom());
                    if (this.Y0.contains(motionEvent.getX(), motionEvent.getY()) && !r0(this.Z0.getLeft(), this.Z0.getTop(), this.Z0, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws Throwable {
        MotionLayout motionLayout;
        this.I0 = true;
        try {
            if (this.f1897y == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                this.I0 = false;
                return;
            }
            motionLayout = this;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            try {
                if (motionLayout.f1880h0 != i14 || motionLayout.f1881i0 != i15) {
                    x0();
                    j0(true);
                }
                motionLayout.f1880h0 = i14;
                motionLayout.f1881i0 = i15;
                motionLayout.f1878f0 = i14;
                motionLayout.f1879g0 = i15;
                motionLayout.I0 = false;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                motionLayout.I0 = false;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            motionLayout = this;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1897y == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        boolean z11 = (this.F == i10 && this.G == i11) ? false : true;
        if (this.X0) {
            this.X0 = false;
            v0();
            w0();
            z11 = true;
        }
        if (this.f2102h) {
            z11 = true;
        }
        this.F = i10;
        this.G = i11;
        int iE = this.f1897y.E();
        int iP = this.f1897y.p();
        if ((z11 || this.W0.e(iE, iP)) && this.C != -1) {
            super.onMeasure(i10, i11);
            this.W0.d(this.f2097c, this.f1897y.k(iE), this.f1897y.k(iP));
            this.W0.g();
            this.W0.h(iE, iP);
        } else {
            if (z11) {
                super.onMeasure(i10, i11);
            }
            z10 = true;
        }
        if (this.f1900z0 || z10) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iU = this.f2097c.U() + getPaddingLeft() + getPaddingRight();
            int iY = this.f2097c.y() + paddingTop;
            int i12 = this.E0;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                iU = (int) (this.A0 + (this.G0 * (this.C0 - r8)));
                requestLayout();
            }
            int i13 = this.F0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                iY = (int) (this.B0 + (this.G0 * (this.D0 - r8)));
                requestLayout();
            }
            setMeasuredDimension(iU, iY);
        }
        k0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar != null) {
            aVar.V(r());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar == null || !this.H || !aVar.a0()) {
            return super.onTouchEvent(motionEvent);
        }
        a.b bVar = this.f1897y.f1955c;
        if (bVar != null && !bVar.C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1897y.Q(motionEvent, getCurrentState(), this);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof m) {
            m mVar = (m) view;
            if (this.f1891s0 == null) {
                this.f1891s0 = new CopyOnWriteArrayList();
            }
            this.f1891s0.add(mVar);
            if (mVar.y()) {
                if (this.f1888p0 == null) {
                    this.f1888p0 = new ArrayList();
                }
                this.f1888p0.add(mVar);
            }
            if (mVar.x()) {
                if (this.f1889q0 == null) {
                    this.f1889q0 = new ArrayList();
                }
                this.f1889q0.add(mVar);
            }
            if (mVar.w()) {
                if (this.f1890r0 == null) {
                    this.f1890r0 = new ArrayList();
                }
                this.f1890r0.add(mVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f1888p0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f1889q0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public l p0(int i10) {
        return (l) this.I.get(findViewById(i10));
    }

    public a.b q0(int i10) {
        return this.f1897y.F(i10);
    }

    public final boolean r0(float f10, float f11, View view, MotionEvent motionEvent) {
        boolean z10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (r0((r3.getLeft() + f10) - view.getScrollX(), (r3.getTop() + f11) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.Y0.set(f10, f11, (view.getRight() + f10) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.Y0.contains(motionEvent.getX(), motionEvent.getY())) && d0(view, motionEvent, -f10, -f11)) {
                return true;
            }
        }
        return z10;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        androidx.constraintlayout.motion.widget.a aVar;
        a.b bVar;
        if (this.f1900z0 || this.D != -1 || (aVar = this.f1897y) == null || (bVar = aVar.f1955c) == null || bVar.z() != 0) {
            super.requestLayout();
        }
    }

    public final void s0(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.a aVar;
        f1870c1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b0.d.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == b0.d.MotionLayout_layoutDescription) {
                    this.f1897y = new androidx.constraintlayout.motion.widget.a(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == b0.d.MotionLayout_currentState) {
                    this.D = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == b0.d.MotionLayout_motionProgress) {
                    this.O = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.Q = true;
                } else if (index == b0.d.MotionLayout_applyMotionScene) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == b0.d.MotionLayout_showPaths) {
                    if (this.V == 0) {
                        this.V = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == b0.d.MotionLayout_motionDebug) {
                    this.V = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f1897y == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f1897y = null;
            }
        }
        if (this.V != 0) {
            e0();
        }
        if (this.D != -1 || (aVar = this.f1897y) == null) {
            return;
        }
        this.D = aVar.E();
        this.C = this.f1897y.E();
        this.E = this.f1897y.p();
    }

    public void setDebugMode(int i10) {
        this.V = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.U0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.H = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f1897y != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolatorR = this.f1897y.r();
            if (interpolatorR != null) {
                setProgress(interpolatorR.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList arrayList = this.f1889q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((m) this.f1889q0.get(i10)).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList arrayList = this.f1888p0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((m) this.f1888p0.get(i10)).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.J0 == null) {
                this.J0 = new i();
            }
            this.J0.e(f10);
            return;
        }
        if (f10 <= 0.0f) {
            if (this.M == 1.0f && this.D == this.E) {
                setState(TransitionState.MOVING);
            }
            this.D = this.C;
            if (this.M == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.M == 0.0f && this.D == this.C) {
                setState(TransitionState.MOVING);
            }
            this.D = this.E;
            if (this.M == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.D = -1;
            setState(TransitionState.MOVING);
        }
        if (this.f1897y == null) {
            return;
        }
        this.P = true;
        this.O = f10;
        this.L = f10;
        this.N = -1L;
        this.J = -1L;
        this.f1899z = null;
        this.Q = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        this.f1897y = aVar;
        aVar.V(r());
        x0();
    }

    public void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.D = i10;
            return;
        }
        if (this.J0 == null) {
            this.J0 = new i();
        }
        this.J0.f(i10);
        this.J0.d(i10);
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.D == -1) {
            return;
        }
        TransitionState transitionState3 = this.V0;
        this.V0 = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            l0();
        }
        int i10 = c.f1909a[transitionState3.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && transitionState == transitionState2) {
                m0();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            l0();
        }
        if (transitionState == transitionState2) {
            m0();
        }
    }

    public void setTransition(int i10) {
        if (this.f1897y != null) {
            a.b bVarQ0 = q0(i10);
            this.C = bVarQ0.A();
            this.E = bVarQ0.y();
            if (!isAttachedToWindow()) {
                if (this.J0 == null) {
                    this.J0 = new i();
                }
                this.J0.f(this.C);
                this.J0.d(this.E);
                return;
            }
            int i11 = this.D;
            float f10 = i11 == this.C ? 0.0f : i11 == this.E ? 1.0f : Float.NaN;
            this.f1897y.X(bVarQ0);
            this.W0.d(this.f2097c, this.f1897y.k(this.C), this.f1897y.k(this.E));
            x0();
            if (this.M != f10) {
                if (f10 == 0.0f) {
                    i0(true);
                    this.f1897y.k(this.C).i(this);
                } else if (f10 == 1.0f) {
                    i0(false);
                    this.f1897y.k(this.E).i(this);
                }
            }
            this.M = Float.isNaN(f10) ? 0.0f : f10;
            if (!Float.isNaN(f10)) {
                setProgress(f10);
                return;
            }
            Log.v("MotionLayout", a0.a.b() + " transitionToStart ");
            G0();
        }
    }

    public void setTransitionDuration(int i10) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            aVar.U(i10);
        }
    }

    public void setTransitionListener(j jVar) {
        this.S = jVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.J0 == null) {
            this.J0 = new i();
        }
        this.J0.g(bundle);
        if (isAttachedToWindow()) {
            this.J0.a();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void t(int i10) {
        this.f2105k = null;
    }

    public boolean t0() {
        return this.H;
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return a0.a.c(context, this.C) + "->" + a0.a.c(context, this.E) + " (pos:" + this.M + " Dpos/Dt:" + this.B;
    }

    public g u0() {
        return h.f();
    }

    public void v0() {
        androidx.constraintlayout.motion.widget.a aVar = this.f1897y;
        if (aVar == null) {
            return;
        }
        if (aVar.g(this, this.D)) {
            requestLayout();
            return;
        }
        int i10 = this.D;
        if (i10 != -1) {
            this.f1897y.f(this, i10);
        }
        if (this.f1897y.a0()) {
            this.f1897y.Y();
        }
    }

    public final void w0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.S == null && ((copyOnWriteArrayList = this.f1891s0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        int i10 = 0;
        this.f1898y0 = false;
        ArrayList arrayList = this.f1874b1;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            j jVar = this.S;
            if (jVar != null) {
                jVar.b(this, num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f1891s0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).b(this, num.intValue());
                }
            }
        }
        this.f1874b1.clear();
    }

    public void x0() {
        this.W0.g();
        invalidate();
    }

    public void y0(float f10, float f11) {
        if (isAttachedToWindow()) {
            setProgress(f10);
            setState(TransitionState.MOVING);
            this.B = f11;
            c0(1.0f);
            return;
        }
        if (this.J0 == null) {
            this.J0 = new i();
        }
        this.J0.e(f10);
        this.J0.h(f11);
    }

    public void z0(int i10, int i11, int i12) {
        setState(TransitionState.SETUP);
        this.D = i10;
        this.C = -1;
        this.E = -1;
        b0.a aVar = this.f2105k;
        if (aVar != null) {
            aVar.d(i10, i11, i12);
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar2 = this.f1897y;
        if (aVar2 != null) {
            aVar2.k(i10).i(this);
        }
    }

    public void setTransition(a.b bVar) {
        this.f1897y.X(bVar);
        setState(TransitionState.SETUP);
        if (this.D == this.f1897y.p()) {
            this.M = 1.0f;
            this.L = 1.0f;
            this.O = 1.0f;
        } else {
            this.M = 0.0f;
            this.L = 0.0f;
            this.O = 0.0f;
        }
        this.N = bVar.D(1) ? -1L : getNanoTime();
        int iE = this.f1897y.E();
        int iP = this.f1897y.p();
        if (iE == this.C && iP == this.E) {
            return;
        }
        this.C = iE;
        this.E = iP;
        this.f1897y.W(iE, iP);
        this.W0.d(this.f2097c, this.f1897y.k(this.C), this.f1897y.k(this.E));
        this.W0.h(this.C, this.E);
        this.W0.g();
        x0();
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = null;
        this.B = 0.0f;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = 0;
        this.G = 0;
        this.H = true;
        this.I = new HashMap();
        this.J = 0L;
        this.K = 1.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        this.O = 0.0f;
        this.Q = false;
        this.R = false;
        this.V = 0;
        this.f1871a0 = false;
        this.f1873b0 = new z.a();
        this.f1875c0 = new d();
        this.f1877e0 = true;
        this.f1882j0 = false;
        this.f1887o0 = false;
        this.f1888p0 = null;
        this.f1889q0 = null;
        this.f1890r0 = null;
        this.f1891s0 = null;
        this.f1892t0 = 0;
        this.f1893u0 = -1L;
        this.f1894v0 = 0.0f;
        this.f1895w0 = 0;
        this.f1896x0 = 0.0f;
        this.f1898y0 = false;
        this.f1900z0 = false;
        this.H0 = new v.d();
        this.I0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = 0;
        this.N0 = false;
        this.O0 = 0;
        this.P0 = new HashMap();
        this.T0 = new Rect();
        this.U0 = false;
        this.V0 = TransitionState.UNDEFINED;
        this.W0 = new f();
        this.X0 = false;
        this.Y0 = new RectF();
        this.Z0 = null;
        this.f1872a1 = null;
        this.f1874b1 = new ArrayList();
        s0(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A = null;
        this.B = 0.0f;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = 0;
        this.G = 0;
        this.H = true;
        this.I = new HashMap();
        this.J = 0L;
        this.K = 1.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        this.O = 0.0f;
        this.Q = false;
        this.R = false;
        this.V = 0;
        this.f1871a0 = false;
        this.f1873b0 = new z.a();
        this.f1875c0 = new d();
        this.f1877e0 = true;
        this.f1882j0 = false;
        this.f1887o0 = false;
        this.f1888p0 = null;
        this.f1889q0 = null;
        this.f1890r0 = null;
        this.f1891s0 = null;
        this.f1892t0 = 0;
        this.f1893u0 = -1L;
        this.f1894v0 = 0.0f;
        this.f1895w0 = 0;
        this.f1896x0 = 0.0f;
        this.f1898y0 = false;
        this.f1900z0 = false;
        this.H0 = new v.d();
        this.I0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = 0;
        this.N0 = false;
        this.O0 = 0;
        this.P0 = new HashMap();
        this.T0 = new Rect();
        this.U0 = false;
        this.V0 = TransitionState.UNDEFINED;
        this.W0 = new f();
        this.X0 = false;
        this.Y0 = new RectF();
        this.Z0 = null;
        this.f1872a1 = null;
        this.f1874b1 = new ArrayList();
        s0(attributeSet);
    }
}
