package m9;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;
import n9.e;
import n9.h;
import v9.g;
import w9.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a extends b implements r9.a {
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public Paint M;
    public Paint N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public h T;
    public h U;
    public v9.h V;
    public v9.h W;

    /* renamed from: a0, reason: collision with root package name */
    public pe.c f28986a0;

    /* renamed from: b0, reason: collision with root package name */
    public pe.c f28987b0;

    /* renamed from: c0, reason: collision with root package name */
    public g f28988c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f28989d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f28990e0;

    /* renamed from: f0, reason: collision with root package name */
    public RectF f28991f0;

    /* renamed from: g0, reason: collision with root package name */
    public Matrix f28992g0;

    /* renamed from: h0, reason: collision with root package name */
    public w9.c f28993h0;

    /* renamed from: i0, reason: collision with root package name */
    public w9.c f28994i0;

    /* renamed from: j0, reason: collision with root package name */
    public float[] f28995j0;

    @Override // m9.b
    public final void a() {
        RectF rectF = this.f28991f0;
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        e eVar = this.f29005l;
        w9.h hVar = this.f29012s;
        if (eVar != null && eVar.f29850a) {
            int iC = i3.e.c(eVar.f29858i);
            if (iC == 0) {
                int iC2 = i3.e.c(this.f29005l.f29857h);
                if (iC2 == 0) {
                    float f10 = rectF.top;
                    e eVar2 = this.f29005l;
                    rectF.top = Math.min(eVar2.f29867s, hVar.f36566d * eVar2.f29865q) + this.f29005l.f29852c + f10;
                } else if (iC2 == 2) {
                    float f11 = rectF.bottom;
                    e eVar3 = this.f29005l;
                    rectF.bottom = Math.min(eVar3.f29867s, hVar.f36566d * eVar3.f29865q) + this.f29005l.f29852c + f11;
                }
            } else if (iC == 1) {
                int iC3 = i3.e.c(this.f29005l.g);
                if (iC3 == 0) {
                    float f12 = rectF.left;
                    e eVar4 = this.f29005l;
                    rectF.left = Math.min(eVar4.f29866r, hVar.f36565c * eVar4.f29865q) + this.f29005l.f29851b + f12;
                } else if (iC3 == 1) {
                    int iC4 = i3.e.c(this.f29005l.f29857h);
                    if (iC4 == 0) {
                        float f13 = rectF.top;
                        e eVar5 = this.f29005l;
                        rectF.top = Math.min(eVar5.f29867s, hVar.f36566d * eVar5.f29865q) + this.f29005l.f29852c + f13;
                    } else if (iC4 == 2) {
                        float f14 = rectF.bottom;
                        e eVar6 = this.f29005l;
                        rectF.bottom = Math.min(eVar6.f29867s, hVar.f36566d * eVar6.f29865q) + this.f29005l.f29852c + f14;
                    }
                } else if (iC3 == 2) {
                    float f15 = rectF.right;
                    e eVar7 = this.f29005l;
                    rectF.right = Math.min(eVar7.f29866r, hVar.f36565c * eVar7.f29865q) + this.f29005l.f29851b + f15;
                }
            }
        }
        float fD = rectF.left + 0.0f;
        float f16 = rectF.top + 0.0f;
        float fD2 = rectF.right + 0.0f;
        float f17 = rectF.bottom + 0.0f;
        h hVar2 = this.T;
        if (hVar2.f29850a && hVar2.f29844q && hVar2.A == 1) {
            fD += hVar2.d(this.V.f35982f);
        }
        h hVar3 = this.U;
        if (hVar3.f29850a && hVar3.f29844q && hVar3.A == 1) {
            fD2 += hVar3.d(this.W.f35982f);
        }
        n9.g gVar = this.f29003i;
        if (gVar.f29850a && gVar.f29844q) {
            float f18 = gVar.f29875w + gVar.f29852c;
            int i4 = gVar.f29876x;
            if (i4 == 2) {
                f17 += f18;
            } else if (i4 == 1) {
                f16 += f18;
            } else if (i4 == 3) {
                f17 += f18;
                f16 += f18;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f16;
        float extraRightOffset = getExtraRightOffset() + fD2;
        float extraBottomOffset = getExtraBottomOffset() + f17;
        float extraLeftOffset = getExtraLeftOffset() + fD;
        float fC = w9.g.c(this.R);
        hVar.f36564b.set(Math.max(fC, extraLeftOffset), Math.max(fC, extraTopOffset), hVar.f36565c - Math.max(fC, extraRightOffset), hVar.f36566d - Math.max(fC, extraBottomOffset));
        if (this.f28996a) {
            Log.i("MPAndroidChart", "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
            StringBuilder sb2 = new StringBuilder("Content: ");
            sb2.append(hVar.f36564b.toString());
            Log.i("MPAndroidChart", sb2.toString());
        }
        pe.c cVar = this.f28987b0;
        this.U.getClass();
        cVar.h();
        pe.c cVar2 = this.f28986a0;
        this.T.getClass();
        cVar2.h();
        if (this.f28996a) {
            Log.i("MPAndroidChart", "Preparing Value-Px Matrix, xmin: " + this.f29003i.f29848u + ", xmax: " + this.f29003i.f29847t + ", xdelta: " + this.f29003i.f29849v);
        }
        pe.c cVar3 = this.f28987b0;
        n9.g gVar2 = this.f29003i;
        float f19 = gVar2.f29848u;
        float f20 = gVar2.f29849v;
        h hVar4 = this.U;
        cVar3.i(f19, f20, hVar4.f29849v, hVar4.f29848u);
        pe.c cVar4 = this.f28986a0;
        n9.g gVar3 = this.f29003i;
        float f21 = gVar3.f29848u;
        float f22 = gVar3.f29849v;
        h hVar5 = this.T;
        cVar4.i(f21, f22, hVar5.f29849v, hVar5.f29848u);
    }

    @Override // android.view.View
    public final void computeScroll() {
        u9.b bVar = this.f29007n;
        if (bVar instanceof u9.a) {
            u9.a aVar = (u9.a) bVar;
            d dVar = aVar.f35209p;
            b bVar2 = aVar.f35215d;
            d dVar2 = aVar.g;
            d dVar3 = aVar.f35208o;
            if (dVar.f36546b == 0.0f && dVar.f36547c == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            a aVar2 = (a) bVar2;
            dVar.f36546b = aVar2.getDragDecelerationFrictionCoef() * dVar.f36546b;
            float dragDecelerationFrictionCoef = aVar2.getDragDecelerationFrictionCoef() * dVar.f36547c;
            dVar.f36547c = dragDecelerationFrictionCoef;
            float f10 = (jCurrentAnimationTimeMillis - aVar.f35207n) / 1000.0f;
            float f11 = dVar3.f36546b + (dVar.f36546b * f10);
            dVar3.f36546b = f11;
            float f12 = dVar3.f36547c + (dragDecelerationFrictionCoef * f10);
            dVar3.f36547c = f12;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f11, f12, 0);
            float f13 = aVar2.I ? dVar3.f36546b - dVar2.f36546b : 0.0f;
            float f14 = aVar2.J ? dVar3.f36547c - dVar2.f36547c : 0.0f;
            aVar.f35200e.set(aVar.f35201f);
            ((a) bVar2).getOnChartGestureListener();
            aVar.b();
            aVar.f35200e.postTranslate(f13, f14);
            motionEventObtain.recycle();
            w9.h viewPortHandler = aVar2.getViewPortHandler();
            Matrix matrix = aVar.f35200e;
            viewPortHandler.e(matrix, bVar2, false);
            aVar.f35200e = matrix;
            aVar.f35207n = jCurrentAnimationTimeMillis;
            if (Math.abs(dVar.f36546b) >= 0.01d || Math.abs(dVar.f36547c) >= 0.01d) {
                DisplayMetrics displayMetrics = w9.g.f36555a;
                bVar2.postInvalidateOnAnimation();
            } else {
                aVar2.a();
                aVar2.postInvalidate();
                dVar.f36546b = 0.0f;
                dVar.f36547c = 0.0f;
            }
        }
    }

    @Override // m9.b
    public void e() {
        super.e();
        this.T = new h(1);
        this.U = new h(2);
        w9.h hVar = this.f29012s;
        this.f28986a0 = new pe.c(hVar);
        this.f28987b0 = new pe.c(hVar);
        this.V = new v9.h(hVar, this.T, this.f28986a0);
        this.W = new v9.h(hVar, this.U, this.f28987b0);
        n9.g gVar = this.f29003i;
        g gVar2 = new g(hVar, this.f28986a0, gVar);
        gVar2.f36022i = new Path();
        gVar2.j = new float[2];
        gVar2.f36023k = new RectF();
        gVar2.f36024l = new float[2];
        new RectF();
        new Path();
        gVar2.f36021h = gVar;
        gVar2.f35982f.setColor(-16777216);
        gVar2.f35982f.setTextAlign(Paint.Align.CENTER);
        gVar2.f35982f.setTextSize(w9.g.c(10.0f));
        this.f28988c0 = gVar2;
        q9.a aVar = new q9.a();
        aVar.f32226b = new ArrayList();
        aVar.f32225a = this;
        setHighlighter(aVar);
        Matrix matrix = hVar.f36563a;
        u9.a aVar2 = new u9.a(this);
        aVar2.f35200e = new Matrix();
        aVar2.f35201f = new Matrix();
        aVar2.g = d.b(0.0f, 0.0f);
        aVar2.f35202h = d.b(0.0f, 0.0f);
        aVar2.f35203i = 1.0f;
        aVar2.j = 1.0f;
        aVar2.f35204k = 1.0f;
        aVar2.f35207n = 0L;
        aVar2.f35208o = d.b(0.0f, 0.0f);
        aVar2.f35209p = d.b(0.0f, 0.0f);
        aVar2.f35200e = matrix;
        aVar2.f35210q = w9.g.c(3.0f);
        aVar2.f35211r = w9.g.c(3.5f);
        this.f29007n = aVar2;
        Paint paint = new Paint();
        this.M = paint;
        paint.setStyle(Paint.Style.FILL);
        this.M.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.N = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.N.setColor(-16777216);
        this.N.setStrokeWidth(w9.g.c(1.0f));
    }

    @Override // m9.b
    public final void f() {
        if (this.f28997b == null) {
            if (this.f28996a) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.f28996a) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        n9.g gVar = this.f29003i;
        o9.a aVar = (o9.a) this.f28997b;
        gVar.a(aVar.f30436d, aVar.f30435c);
        this.T.a(((o9.a) this.f28997b).h(1), ((o9.a) this.f28997b).g(1));
        this.U.a(((o9.a) this.f28997b).h(2), ((o9.a) this.f28997b).g(2));
        v9.h hVar = this.V;
        h hVar2 = this.T;
        hVar.C(hVar2.f29848u, hVar2.f29847t);
        v9.h hVar3 = this.W;
        h hVar4 = this.U;
        hVar3.C(hVar4.f29848u, hVar4.f29847t);
        g gVar2 = this.f28988c0;
        n9.g gVar3 = this.f29003i;
        gVar2.C(gVar3.f29848u, gVar3.f29847t);
        if (this.f29005l != null) {
            this.f29009p.C(this.f28997b);
        }
        a();
    }

    public h getAxisLeft() {
        return this.T;
    }

    public h getAxisRight() {
        return this.U;
    }

    @Override // m9.b, r9.b, r9.a
    public /* bridge */ /* synthetic */ o9.a getData() {
        return (o9.a) super.getData();
    }

    public u9.e getDrawListener() {
        return null;
    }

    @Override // r9.a
    public float getHighestVisibleX() {
        pe.c cVar = this.f28986a0;
        RectF rectF = this.f29012s.f36564b;
        float f10 = rectF.right;
        float f11 = rectF.bottom;
        w9.c cVar2 = this.f28994i0;
        cVar.c(f10, f11, cVar2);
        return (float) Math.min(this.f29003i.f29847t, cVar2.f36543b);
    }

    @Override // r9.a
    public float getLowestVisibleX() {
        pe.c cVar = this.f28986a0;
        RectF rectF = this.f29012s.f36564b;
        float f10 = rectF.left;
        float f11 = rectF.bottom;
        w9.c cVar2 = this.f28993h0;
        cVar.c(f10, f11, cVar2);
        return (float) Math.max(this.f29003i.f29848u, cVar2.f36543b);
    }

    @Override // m9.b, r9.b
    public int getMaxVisibleCount() {
        return this.D;
    }

    public float getMinOffset() {
        return this.R;
    }

    public v9.h getRendererLeftYAxis() {
        return this.V;
    }

    public v9.h getRendererRightYAxis() {
        return this.W;
    }

    public g getRendererXAxis() {
        return this.f28988c0;
    }

    @Override // android.view.View
    public float getScaleX() {
        w9.h hVar = this.f29012s;
        if (hVar == null) {
            return 1.0f;
        }
        return hVar.f36570i;
    }

    @Override // android.view.View
    public float getScaleY() {
        w9.h hVar = this.f29012s;
        if (hVar == null) {
            return 1.0f;
        }
        return hVar.j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // m9.b, r9.b
    public float getYChartMax() {
        return Math.max(this.T.f29847t, this.U.f29847t);
    }

    @Override // m9.b, r9.b
    public float getYChartMin() {
        return Math.min(this.T.f29848u, this.U.f29848u);
    }

    public final pe.c i(int i4) {
        return i4 == 1 ? this.f28986a0 : this.f28987b0;
    }

    @Override // m9.b, android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f28997b == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = this.O;
        w9.h hVar = this.f29012s;
        if (z3) {
            canvas2.drawRect(hVar.f36564b, this.M);
        }
        if (this.P) {
            canvas2.drawRect(hVar.f36564b, this.N);
        }
        int i10 = 2;
        int i11 = 1;
        if (this.E) {
            float lowestVisibleX = getLowestVisibleX();
            float highestVisibleX = getHighestVisibleX();
            o9.a aVar = (o9.a) this.f28997b;
            ArrayList arrayList = aVar.f30440i;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                o9.c cVar = (o9.c) ((s9.a) obj);
                List list = cVar.j;
                if (list != null && !list.isEmpty()) {
                    cVar.f30449k = -3.4028235E38f;
                    cVar.f30450l = Float.MAX_VALUE;
                    int iF = cVar.f(i10, lowestVisibleX, Float.NaN);
                    int iF2 = cVar.f(i11, highestVisibleX, Float.NaN);
                    for (int i13 = iF; i13 <= iF2; i13++) {
                        cVar.b((o9.d) list.get(i13));
                    }
                }
                i10 = 2;
                i11 = 1;
            }
            i4 = 0;
            aVar.b();
            n9.g gVar = this.f29003i;
            o9.a aVar2 = (o9.a) this.f28997b;
            gVar.a(aVar2.f30436d, aVar2.f30435c);
            h hVar2 = this.T;
            if (hVar2.f29850a) {
                hVar2.a(((o9.a) this.f28997b).h(1), ((o9.a) this.f28997b).g(1));
            }
            h hVar3 = this.U;
            if (hVar3.f29850a) {
                hVar3.a(((o9.a) this.f28997b).h(2), ((o9.a) this.f28997b).g(2));
            }
            a();
        } else {
            i4 = 0;
        }
        h hVar4 = this.T;
        if (hVar4.f29850a) {
            this.V.C(hVar4.f29848u, hVar4.f29847t);
        }
        h hVar5 = this.U;
        if (hVar5.f29850a) {
            this.W.C(hVar5.f29848u, hVar5.f29847t);
        }
        n9.g gVar2 = this.f29003i;
        if (gVar2.f29850a) {
            this.f28988c0.C(gVar2.f29848u, gVar2.f29847t);
        }
        g gVar3 = this.f28988c0;
        w9.h hVar6 = (w9.h) gVar3.f218b;
        Paint paint = gVar3.g;
        n9.g gVar4 = gVar3.f36021h;
        if (gVar4.f29843p && gVar4.f29850a) {
            paint.setColor(gVar4.f29837i);
            paint.setStrokeWidth(gVar4.j);
            paint.setPathEffect(null);
            int i14 = gVar4.f29876x;
            if (i14 == 1 || i14 == 4 || i14 == 3) {
                RectF rectF = hVar6.f36564b;
                float f10 = rectF.left;
                float f11 = rectF.top;
                canvas2.drawLine(f10, f11, rectF.right, f11, paint);
            }
            int i15 = gVar4.f29876x;
            if (i15 == 2 || i15 == 5 || i15 == 3) {
                RectF rectF2 = hVar6.f36564b;
                float f12 = rectF2.left;
                float f13 = rectF2.bottom;
                float f14 = rectF2.right;
                canvas2 = canvas;
                canvas2.drawLine(f12, f13, f14, f13, paint);
            } else {
                canvas2 = canvas;
            }
        }
        this.V.G(canvas2);
        this.W.G(canvas2);
        if (this.f29003i.f29846s) {
            this.f28988c0.F(canvas2);
        }
        if (this.T.f29846s) {
            this.V.H(canvas2);
        }
        if (this.U.f29846s) {
            this.W.H(canvas2);
        }
        boolean z10 = this.f29003i.f29850a;
        boolean z11 = this.T.f29850a;
        boolean z12 = this.U.f29850a;
        int iSave = canvas2.save();
        canvas2.clipRect(hVar.f36564b);
        this.f29010q.D(canvas2);
        if (!this.f29003i.f29846s) {
            this.f28988c0.F(canvas2);
        }
        if (!this.T.f29846s) {
            this.V.H(canvas2);
        }
        if (!this.U.f29846s) {
            this.W.H(canvas2);
        }
        if (h()) {
            this.f29010q.F(canvas2, this.f29019z);
        }
        canvas2.restoreToCount(iSave);
        this.f29010q.E(canvas2);
        if (this.f29003i.f29850a) {
            g gVar5 = this.f28988c0;
            ArrayList arrayList2 = gVar5.f36021h.f29845r;
            if (arrayList2 != null && arrayList2.size() > 0) {
                float[] fArr = gVar5.f36024l;
                fArr[i4] = 0.0f;
                fArr[1] = 0.0f;
                if (arrayList2.size() > 0) {
                    arrayList2.get(i4).getClass();
                    throw new ClassCastException();
                }
            }
        }
        if (this.T.f29850a) {
            this.V.I();
        }
        if (this.U.f29850a) {
            this.W.I();
        }
        g gVar6 = this.f28988c0;
        Paint paint2 = gVar6.f35982f;
        w9.h hVar7 = (w9.h) gVar6.f218b;
        n9.g gVar7 = gVar6.f36021h;
        if (gVar7.f29850a && gVar7.f29844q) {
            float f15 = gVar7.f29852c;
            paint2.setTypeface(null);
            paint2.setTextSize(gVar7.f29853d);
            paint2.setColor(gVar7.f29854e);
            d dVarB = d.b(0.0f, 0.0f);
            int i16 = gVar7.f29876x;
            if (i16 == 1) {
                dVarB.f36546b = 0.5f;
                dVarB.f36547c = 1.0f;
                gVar6.E(canvas2, hVar7.f36564b.top - f15, dVarB);
            } else if (i16 == 4) {
                dVarB.f36546b = 0.5f;
                dVarB.f36547c = 1.0f;
                gVar6.E(canvas2, hVar7.f36564b.top + f15 + gVar7.f29875w, dVarB);
            } else if (i16 == 2) {
                dVarB.f36546b = 0.5f;
                dVarB.f36547c = 0.0f;
                gVar6.E(canvas2, hVar7.f36564b.bottom + f15, dVarB);
            } else if (i16 == 5) {
                dVarB.f36546b = 0.5f;
                dVarB.f36547c = 0.0f;
                gVar6.E(canvas2, (hVar7.f36564b.bottom - f15) - gVar7.f29875w, dVarB);
            } else {
                dVarB.f36546b = 0.5f;
                dVarB.f36547c = 1.0f;
                gVar6.E(canvas2, hVar7.f36564b.top - f15, dVarB);
                dVarB.f36546b = 0.5f;
                dVarB.f36547c = 0.0f;
                gVar6.E(canvas2, hVar7.f36564b.bottom + f15, dVarB);
            }
            d.c(dVarB);
        }
        this.V.F(canvas2);
        this.W.F(canvas2);
        if (this.Q) {
            int iSave2 = canvas2.save();
            canvas2.clipRect(hVar.f36564b);
            this.f29010q.G(canvas2);
            canvas2.restoreToCount(iSave2);
        } else {
            this.f29010q.G(canvas2);
        }
        this.f29009p.E(canvas2);
        b(canvas);
        if (this.f28996a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            long j = this.f28989d0 + jCurrentTimeMillis2;
            this.f28989d0 = j;
            long j8 = this.f28990e0 + 1;
            this.f28990e0 = j8;
            StringBuilder sbY = d.h.y(jCurrentTimeMillis2, "Drawtime: ", " ms, average: ");
            sbY.append(j / j8);
            sbY.append(" ms, cycles: ");
            sbY.append(this.f28990e0);
            Log.i("MPAndroidChart", sbY.toString());
        }
    }

    @Override // m9.b, android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        float[] fArr = this.f28995j0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        boolean z3 = this.S;
        w9.h hVar = this.f29012s;
        if (z3) {
            RectF rectF = hVar.f36564b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            this.f28986a0.e(fArr);
        }
        super.onSizeChanged(i4, i10, i11, i12);
        if (!this.S) {
            hVar.e(hVar.f36563a, this, true);
        } else {
            this.f28986a0.f(fArr);
            hVar.a(this, fArr);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        u9.b bVar = this.f29007n;
        if (bVar == null || this.f28997b == null || !this.j) {
            return false;
        }
        return bVar.onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z3) {
        this.E = z3;
    }

    public void setBorderColor(int i4) {
        this.N.setColor(i4);
    }

    public void setBorderWidth(float f10) {
        this.N.setStrokeWidth(w9.g.c(f10));
    }

    public void setClipValuesToContent(boolean z3) {
        this.Q = z3;
    }

    public void setDoubleTapToZoomEnabled(boolean z3) {
        this.G = z3;
    }

    public void setDragEnabled(boolean z3) {
        this.I = z3;
        this.J = z3;
    }

    public void setDragOffsetX(float f10) {
        w9.h hVar = this.f29012s;
        hVar.getClass();
        hVar.f36572l = w9.g.c(f10);
    }

    public void setDragOffsetY(float f10) {
        w9.h hVar = this.f29012s;
        hVar.getClass();
        hVar.f36573m = w9.g.c(f10);
    }

    public void setDragXEnabled(boolean z3) {
        this.I = z3;
    }

    public void setDragYEnabled(boolean z3) {
        this.J = z3;
    }

    public void setDrawBorders(boolean z3) {
        this.P = z3;
    }

    public void setDrawGridBackground(boolean z3) {
        this.O = z3;
    }

    public void setGridBackgroundColor(int i4) {
        this.M.setColor(i4);
    }

    public void setHighlightPerDragEnabled(boolean z3) {
        this.H = z3;
    }

    public void setKeepPositionOnRotation(boolean z3) {
        this.S = z3;
    }

    public void setMaxVisibleValueCount(int i4) {
        this.D = i4;
    }

    public void setMinOffset(float f10) {
        this.R = f10;
    }

    public void setPinchZoom(boolean z3) {
        this.F = z3;
    }

    public void setRendererLeftYAxis(v9.h hVar) {
        this.V = hVar;
    }

    public void setRendererRightYAxis(v9.h hVar) {
        this.W = hVar;
    }

    public void setScaleEnabled(boolean z3) {
        this.K = z3;
        this.L = z3;
    }

    public void setScaleXEnabled(boolean z3) {
        this.K = z3;
    }

    public void setScaleYEnabled(boolean z3) {
        this.L = z3;
    }

    public void setVisibleXRangeMaximum(float f10) {
        float f11 = this.f29003i.f29849v / f10;
        w9.h hVar = this.f29012s;
        hVar.getClass();
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        hVar.g = f11;
        hVar.d(hVar.f36563a, hVar.f36564b);
    }

    public void setVisibleXRangeMinimum(float f10) {
        float f11 = this.f29003i.f29849v / f10;
        w9.h hVar = this.f29012s;
        hVar.getClass();
        if (f11 == 0.0f) {
            f11 = Float.MAX_VALUE;
        }
        hVar.f36569h = f11;
        hVar.d(hVar.f36563a, hVar.f36564b);
    }

    public void setXAxisRenderer(g gVar) {
        this.f28988c0 = gVar;
    }

    public void setOnDrawListener(u9.e eVar) {
    }
}
