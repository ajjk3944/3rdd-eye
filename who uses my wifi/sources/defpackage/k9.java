package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.LineChart;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class k9 extends je implements n9 {
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Paint Q;
    public Paint R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public boolean W;
    public eb1 a0;
    public eb1 b0;
    public fb1 c0;
    public fb1 d0;
    public uk1 e0;
    public uk1 f0;
    public db1 g0;
    public RectF h0;
    public Matrix i0;
    public z90 j0;
    public z90 k0;
    public float[] l0;

    @Override // defpackage.je
    public final void a() {
        RectF rectF = this.h0;
        u61 u61Var = this.w;
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        k50 k50Var = this.q;
        if (k50Var != null && k50Var.a) {
            int iS = ex0.s(k50Var.i);
            if (iS == 0) {
                int iS2 = ex0.s(this.q.h);
                if (iS2 == 0) {
                    float f = rectF.top;
                    k50 k50Var2 = this.q;
                    rectF.top = Math.min(k50Var2.s, u61Var.d * k50Var2.q) + this.q.c + f;
                } else if (iS2 == 2) {
                    float f2 = rectF.bottom;
                    k50 k50Var3 = this.q;
                    rectF.bottom = Math.min(k50Var3.s, u61Var.d * k50Var3.q) + this.q.c + f2;
                }
            } else if (iS == 1) {
                int iS3 = ex0.s(this.q.g);
                if (iS3 == 0) {
                    float f3 = rectF.left;
                    k50 k50Var4 = this.q;
                    rectF.left = Math.min(k50Var4.r, u61Var.c * k50Var4.q) + this.q.b + f3;
                } else if (iS3 == 1) {
                    int iS4 = ex0.s(this.q.h);
                    if (iS4 == 0) {
                        float f4 = rectF.top;
                        k50 k50Var5 = this.q;
                        rectF.top = Math.min(k50Var5.s, u61Var.d * k50Var5.q) + this.q.c + f4;
                    } else if (iS4 == 2) {
                        float f5 = rectF.bottom;
                        k50 k50Var6 = this.q;
                        rectF.bottom = Math.min(k50Var6.s, u61Var.d * k50Var6.q) + this.q.c + f5;
                    }
                } else if (iS3 == 2) {
                    float f6 = rectF.right;
                    k50 k50Var7 = this.q;
                    rectF.right = Math.min(k50Var7.r, u61Var.c * k50Var7.q) + this.q.b + f6;
                }
            }
        }
        float fE = rectF.left + 0.0f;
        float f7 = rectF.top + 0.0f;
        float fE2 = rectF.right + 0.0f;
        float f8 = rectF.bottom + 0.0f;
        eb1 eb1Var = this.a0;
        if (eb1Var.a && eb1Var.r && eb1Var.C == 1) {
            fE += eb1Var.e(this.c0.l);
        }
        eb1 eb1Var2 = this.b0;
        if (eb1Var2.a && eb1Var2.r && eb1Var2.C == 1) {
            fE2 += eb1Var2.e(this.d0.l);
        }
        cb1 cb1Var = this.n;
        if (cb1Var.a && cb1Var.r) {
            float f9 = cb1Var.y + cb1Var.c;
            int i = cb1Var.z;
            if (i == 2) {
                f8 += f9;
            } else if (i == 1) {
                f7 += f9;
            } else if (i == 3) {
                f8 += f9;
                f7 += f9;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f7;
        float extraRightOffset = getExtraRightOffset() + fE2;
        float extraBottomOffset = getExtraBottomOffset() + f8;
        float extraLeftOffset = getExtraLeftOffset() + fE;
        float fC = k41.c(this.V);
        u61Var.b.set(Math.max(fC, extraLeftOffset), Math.max(fC, extraTopOffset), u61Var.c - Math.max(fC, extraRightOffset), u61Var.d - Math.max(fC, extraBottomOffset));
        if (this.f) {
            u61Var.b.toString();
        }
        uk1 uk1Var = this.f0;
        this.b0.getClass();
        uk1Var.f();
        uk1 uk1Var2 = this.e0;
        this.a0.getClass();
        uk1Var2.f();
        if (this.f) {
            float f10 = this.n.w;
        }
        uk1 uk1Var3 = this.f0;
        cb1 cb1Var2 = this.n;
        float f11 = cb1Var2.w;
        float f12 = cb1Var2.x;
        eb1 eb1Var3 = this.b0;
        uk1Var3.h(f11, f12, eb1Var3.x, eb1Var3.w);
        uk1 uk1Var4 = this.e0;
        cb1 cb1Var3 = this.n;
        float f13 = cb1Var3.w;
        float f14 = cb1Var3.x;
        eb1 eb1Var4 = this.a0;
        uk1Var4.h(f13, f14, eb1Var4.x, eb1Var4.w);
    }

    @Override // android.view.View
    public final void computeScroll() {
        oe oeVar = this.r;
        if (oeVar instanceof l9) {
            l9 l9Var = (l9) oeVar;
            aa0 aa0Var = l9Var.u;
            LineChart lineChart = l9Var.i;
            aa0 aa0Var2 = l9Var.l;
            aa0 aa0Var3 = l9Var.t;
            if (aa0Var.g == 0.0f && aa0Var.h == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            aa0Var.g = lineChart.getDragDecelerationFrictionCoef() * aa0Var.g;
            float dragDecelerationFrictionCoef = lineChart.getDragDecelerationFrictionCoef() * aa0Var.h;
            aa0Var.h = dragDecelerationFrictionCoef;
            float f = (jCurrentAnimationTimeMillis - l9Var.s) / 1000.0f;
            float f2 = aa0Var3.g + (aa0Var.g * f);
            aa0Var3.g = f2;
            float f3 = aa0Var3.h + (dragDecelerationFrictionCoef * f);
            aa0Var3.h = f3;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f2, f3, 0);
            float f4 = lineChart.M ? aa0Var3.g - aa0Var2.g : 0.0f;
            float f5 = lineChart.N ? aa0Var3.h - aa0Var2.h : 0.0f;
            l9Var.j.set(l9Var.k);
            lineChart.getOnChartGestureListener();
            l9Var.b();
            l9Var.j.postTranslate(f4, f5);
            motionEventObtain.recycle();
            u61 viewPortHandler = lineChart.getViewPortHandler();
            Matrix matrix = l9Var.j;
            viewPortHandler.e(matrix, lineChart, false);
            l9Var.j = matrix;
            l9Var.s = jCurrentAnimationTimeMillis;
            if (Math.abs(aa0Var.g) >= 0.01d || Math.abs(aa0Var.h) >= 0.01d) {
                DisplayMetrics displayMetrics = k41.a;
                lineChart.postInvalidateOnAnimation();
            } else {
                lineChart.a();
                lineChart.postInvalidate();
                aa0Var.g = 0.0f;
                aa0Var.h = 0.0f;
            }
        }
    }

    @Override // defpackage.je
    public final void d() {
        ArrayList arrayList;
        String str;
        float f;
        int i;
        float f2;
        le leVar = this.g;
        if (leVar == null) {
            return;
        }
        m9 m9Var = (m9) leVar;
        this.n.a(m9Var.d, m9Var.c);
        int i2 = 1;
        this.a0.a(((m9) this.g).g(1), ((m9) this.g).f(1));
        this.b0.a(((m9) this.g).g(2), ((m9) this.g).f(2));
        fb1 fb1Var = this.c0;
        eb1 eb1Var = this.a0;
        fb1Var.U1(eb1Var.w, eb1Var.v);
        fb1 fb1Var2 = this.d0;
        eb1 eb1Var2 = this.b0;
        fb1Var2.U1(eb1Var2.w, eb1Var2.v);
        db1 db1Var = this.g0;
        cb1 cb1Var = this.n;
        db1Var.U1(cb1Var.w, cb1Var.v);
        if (this.q != null) {
            m50 m50Var = this.t;
            le leVar2 = this.g;
            Paint paint = m50Var.i;
            k50 k50Var = m50Var.k;
            k50Var.getClass();
            ArrayList arrayList2 = m50Var.l;
            arrayList2.clear();
            int i3 = 0;
            while (true) {
                ArrayList arrayList3 = leVar2.i;
                if (i3 >= (arrayList3 == null ? 0 : arrayList3.size())) {
                    break;
                }
                q10 q10VarD = leVar2.d(i3);
                l60 l60Var = (l60) q10VarD;
                ArrayList arrayList4 = l60Var.a;
                int size = ((l60) q10VarD).o.size();
                int i4 = 0;
                while (i4 < arrayList4.size() && i4 < size) {
                    String str2 = (i4 >= arrayList4.size() - i2 || i4 >= size + (-1)) ? ((l60) leVar2.d(i3)).c : null;
                    int i5 = l60Var.g;
                    float f3 = l60Var.h;
                    float f4 = l60Var.i;
                    int iIntValue = ((Integer) arrayList4.get(i4)).intValue();
                    l50 l50Var = new l50();
                    l50Var.a = str2;
                    l50Var.b = i5;
                    l50Var.c = f3;
                    l50Var.d = f4;
                    l50Var.e = iIntValue;
                    arrayList2.add(l50Var);
                    i4++;
                    i2 = 1;
                }
                i3++;
                i2 = 1;
            }
            k50Var.f = (l50[]) arrayList2.toArray(new l50[arrayList2.size()]);
            paint.setTextSize(k50Var.d);
            paint.setColor(k50Var.e);
            u61 u61Var = (u61) m50Var.g;
            ArrayList arrayList5 = k50Var.u;
            ArrayList arrayList6 = k50Var.t;
            ArrayList arrayList7 = k50Var.v;
            float f5 = k50Var.l;
            float fC = k41.c(f5);
            float fC2 = k41.c(k50Var.p);
            float f6 = k50Var.o;
            float fC3 = k41.c(f6);
            float fC4 = k41.c(k50Var.n);
            float fC5 = k41.c(0.0f);
            l50[] l50VarArr = k50Var.f;
            int length = l50VarArr.length;
            k41.c(f6);
            l50[] l50VarArr2 = k50Var.f;
            int length2 = l50VarArr2.length;
            int i6 = 0;
            float f7 = 0.0f;
            float f8 = 0.0f;
            while (i6 < length2) {
                int i7 = i6;
                l50 l50Var2 = l50VarArr2[i7];
                float f9 = fC;
                float fC6 = k41.c(Float.isNaN(l50Var2.c) ? f5 : l50Var2.c);
                if (fC6 > f8) {
                    f8 = fC6;
                }
                String str3 = l50Var2.a;
                if (str3 != null) {
                    float fMeasureText = (int) paint.measureText(str3);
                    if (fMeasureText > f7) {
                        f7 = fMeasureText;
                    }
                }
                i6 = i7 + 1;
                fC = f9;
            }
            float f10 = fC;
            l50[] l50VarArr3 = k50Var.f;
            int length3 = l50VarArr3.length;
            float f11 = 0.0f;
            int i8 = 0;
            while (i8 < length3) {
                l50[] l50VarArr4 = l50VarArr3;
                String str4 = l50VarArr4[i8].a;
                if (str4 != null) {
                    float fA = k41.a(paint, str4);
                    if (fA > f11) {
                        f11 = fA;
                    }
                }
                i8++;
                l50VarArr3 = l50VarArr4;
            }
            int iS = ex0.s(k50Var.i);
            if (iS == 0) {
                Paint.FontMetrics fontMetrics = k41.e;
                paint.getFontMetrics(fontMetrics);
                float f12 = fontMetrics.descent - fontMetrics.ascent;
                paint.getFontMetrics(fontMetrics);
                float f13 = (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom + fC5;
                u61Var.b.width();
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                int i9 = -1;
                int i10 = 0;
                float fMax = 0.0f;
                float f14 = 0.0f;
                float f15 = 0.0f;
                while (i10 < length) {
                    l50 l50Var3 = l50VarArr[i10];
                    float f16 = fC2;
                    int i11 = l50Var3.b;
                    float f17 = f13;
                    float f18 = l50Var3.c;
                    boolean z = i11 != 1;
                    float fC7 = Float.isNaN(f18) ? f10 : k41.c(f18);
                    String str5 = l50Var3.a;
                    boolean z2 = z;
                    arrayList5.add(Boolean.FALSE);
                    float f19 = i9 == -1 ? 0.0f : f14 + f16;
                    if (str5 != null) {
                        arrayList = arrayList5;
                        arrayList6.add(k41.b(paint, str5));
                        f = f19 + (z2 ? fC3 + fC7 : 0.0f) + ((xt) arrayList6.get(i10)).g;
                        str = str5;
                        i = -1;
                    } else {
                        arrayList = arrayList5;
                        xt xtVar = (xt) xt.i.b();
                        str = str5;
                        xtVar.g = 0.0f;
                        xtVar.h = 0.0f;
                        arrayList6.add(xtVar);
                        if (!z2) {
                            fC7 = 0.0f;
                        }
                        f = f19 + fC7;
                        i = -1;
                        if (i9 == -1) {
                            i9 = i10;
                        }
                    }
                    if (str != null || i10 == length - 1) {
                        float f20 = (f15 == 0.0f ? 0.0f : fC4) + f + f15;
                        if (i10 == length - 1) {
                            xt xtVar2 = (xt) xt.i.b();
                            xtVar2.g = f20;
                            xtVar2.h = f12;
                            arrayList7.add(xtVar2);
                            fMax = Math.max(fMax, f20);
                        }
                        f15 = f20;
                    }
                    if (str != null) {
                        i9 = i;
                    }
                    i10++;
                    arrayList5 = arrayList;
                    f13 = f17;
                    f14 = f;
                    fC2 = f16;
                }
                float f21 = f13;
                k50Var.r = fMax;
                k50Var.s = (f21 * (arrayList7.size() == 0 ? 0 : arrayList7.size() - 1)) + (f12 * arrayList7.size());
            } else if (iS == 1) {
                Paint.FontMetrics fontMetrics2 = k41.e;
                paint.getFontMetrics(fontMetrics2);
                float f22 = fontMetrics2.descent - fontMetrics2.ascent;
                float fMax2 = 0.0f;
                float f23 = 0.0f;
                float f24 = 0.0f;
                int i12 = 0;
                boolean z3 = false;
                while (i12 < length) {
                    l50 l50Var4 = l50VarArr[i12];
                    int i13 = l50Var4.b;
                    float f25 = l50Var4.c;
                    float f26 = f22;
                    boolean z4 = i13 != 1;
                    float fC8 = Float.isNaN(f25) ? f10 : k41.c(f25);
                    String str6 = l50Var4.a;
                    if (!z3) {
                        f24 = 0.0f;
                    }
                    if (z4) {
                        if (z3) {
                            f24 += fC2;
                        }
                        f24 += fC8;
                    }
                    if (str6 != null) {
                        if (z4 && !z3) {
                            f2 = f24 + fC3;
                        } else if (z3) {
                            fMax2 = Math.max(fMax2, f24);
                            f23 += f26 + fC5;
                            f2 = 0.0f;
                            z3 = false;
                        } else {
                            f2 = f24;
                        }
                        float fMeasureText2 = f2 + ((int) paint.measureText(str6));
                        if (i12 < length - 1) {
                            f23 = f26 + fC5 + f23;
                        }
                        f24 = fMeasureText2;
                    } else {
                        f24 += fC8;
                        if (i12 < length - 1) {
                            f24 += fC2;
                        }
                        z3 = true;
                    }
                    fMax2 = Math.max(fMax2, f24);
                    i12++;
                    f22 = f26;
                }
                k50Var.r = fMax2;
                k50Var.s = f23;
            }
            k50Var.s += k50Var.c;
            k50Var.r += k50Var.b;
        }
        a();
    }

    public final uk1 f(int i) {
        return i == 1 ? this.e0 : this.f0;
    }

    public eb1 getAxisLeft() {
        return this.a0;
    }

    public eb1 getAxisRight() {
        return this.b0;
    }

    @Override // defpackage.je, defpackage.ne
    public /* bridge */ /* synthetic */ m9 getData() {
        return (m9) super.getData();
    }

    public fj0 getDrawListener() {
        return null;
    }

    @Override // defpackage.n9
    public float getHighestVisibleX() {
        uk1 uk1Var = this.e0;
        RectF rectF = this.w.b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        z90 z90Var = this.k0;
        uk1Var.b(f, f2, z90Var);
        return (float) Math.min(this.n.v, z90Var.g);
    }

    @Override // defpackage.n9
    public float getLowestVisibleX() {
        uk1 uk1Var = this.e0;
        RectF rectF = this.w.b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        z90 z90Var = this.j0;
        uk1Var.b(f, f2, z90Var);
        return (float) Math.max(this.n.w, z90Var.g);
    }

    @Override // defpackage.je, defpackage.ne
    public int getMaxVisibleCount() {
        return this.H;
    }

    public float getMinOffset() {
        return this.V;
    }

    public fb1 getRendererLeftYAxis() {
        return this.c0;
    }

    public fb1 getRendererRightYAxis() {
        return this.d0;
    }

    public db1 getRendererXAxis() {
        return this.g0;
    }

    @Override // android.view.View
    public float getScaleX() {
        u61 u61Var = this.w;
        if (u61Var == null) {
            return 1.0f;
        }
        return u61Var.i;
    }

    @Override // android.view.View
    public float getScaleY() {
        u61 u61Var = this.w;
        if (u61Var == null) {
            return 1.0f;
        }
        return u61Var.j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // defpackage.je, defpackage.ne
    public float getYChartMax() {
        return Math.max(this.a0.v, this.b0.v);
    }

    @Override // defpackage.je, defpackage.ne
    public float getYChartMin() {
        return Math.min(this.a0.w, this.b0.w);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0981  */
    @Override // defpackage.je, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r48) {
        /*
            Method dump skipped, instructions count: 2897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9.onDraw(android.graphics.Canvas):void");
    }

    @Override // defpackage.je, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        u61 u61Var = this.w;
        float[] fArr = this.l0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.W) {
            RectF rectF = u61Var.b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            this.e0.d(fArr);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.W) {
            u61Var.e(u61Var.a, this, true);
        } else {
            this.e0.e(fArr);
            u61Var.a(fArr, this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        oe oeVar = this.r;
        if (oeVar == null || this.g == null || !this.o) {
            return false;
        }
        return ((l9) oeVar).onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.I = z;
    }

    public void setBorderColor(int i) {
        this.R.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.R.setStrokeWidth(k41.c(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.U = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.K = z;
    }

    public void setDragEnabled(boolean z) {
        this.M = z;
        this.N = z;
    }

    public void setDragOffsetX(float f) {
        u61 u61Var = this.w;
        u61Var.getClass();
        u61Var.l = k41.c(f);
    }

    public void setDragOffsetY(float f) {
        u61 u61Var = this.w;
        u61Var.getClass();
        u61Var.m = k41.c(f);
    }

    public void setDragXEnabled(boolean z) {
        this.M = z;
    }

    public void setDragYEnabled(boolean z) {
        this.N = z;
    }

    public void setDrawBorders(boolean z) {
        this.T = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.S = z;
    }

    public void setGridBackgroundColor(int i) {
        this.Q.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.L = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.W = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.H = i;
    }

    public void setMinOffset(float f) {
        this.V = f;
    }

    public void setPinchZoom(boolean z) {
        this.J = z;
    }

    public void setRendererLeftYAxis(fb1 fb1Var) {
        this.c0 = fb1Var;
    }

    public void setRendererRightYAxis(fb1 fb1Var) {
        this.d0 = fb1Var;
    }

    public void setScaleEnabled(boolean z) {
        this.O = z;
        this.P = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.O = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.P = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.n.x / f;
        u61 u61Var = this.w;
        u61Var.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        u61Var.g = f2;
        u61Var.d(u61Var.a, u61Var.b);
    }

    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.n.x / f;
        u61 u61Var = this.w;
        u61Var.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        u61Var.h = f2;
        u61Var.d(u61Var.a, u61Var.b);
    }

    public void setXAxisRenderer(db1 db1Var) {
        this.g0 = db1Var;
    }

    public void setOnDrawListener(fj0 fj0Var) {
    }
}
