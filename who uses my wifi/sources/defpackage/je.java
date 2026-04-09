package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.charts.LineChart;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class je extends ViewGroup implements ne {
    public float A;
    public float B;
    public boolean C;
    public v00[] D;
    public float E;
    public ArrayList F;
    public boolean G;
    public boolean f;
    public le g;
    public boolean h;
    public boolean i;
    public float j;
    public xn k;
    public Paint l;
    public Paint m;
    public cb1 n;
    public boolean o;
    public lo p;
    public k50 q;
    public oe r;
    public String s;
    public m50 t;
    public om u;
    public me v;
    public u61 w;
    public ke x;
    public float y;
    public float z;

    public static void e(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                e(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public abstract void a();

    public final v00 b(float f, float f2) {
        v00 v00Var;
        int i;
        LineChart lineChart;
        float f3;
        v00 v00Var2 = null;
        if (this.g == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        me meVar = (me) getHighlighter();
        LineChart lineChart2 = meVar.a;
        uk1 uk1Var = lineChart2.e0;
        uk1Var.getClass();
        ni0 ni0Var = z90.i;
        z90 z90Var = (z90) ni0Var.b();
        z90Var.g = 0.0d;
        z90Var.h = 0.0d;
        uk1Var.b(f, f2, z90Var);
        float f4 = (float) z90Var.g;
        ni0Var.c(z90Var);
        ArrayList arrayList = meVar.b;
        arrayList.clear();
        m9 data = lineChart2.getData();
        if (data != null) {
            ArrayList arrayList2 = data.i;
            int size = arrayList2 == null ? 0 : arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                q10 q10VarD = data.d(i2);
                if (((l60) q10VarD).e) {
                    ArrayList arrayList3 = new ArrayList();
                    l60 l60Var = (l60) q10VarD;
                    ArrayList arrayListA = l60Var.a(f4);
                    int i3 = l60Var.d;
                    if (arrayListA.size() == 0) {
                        v00Var = v00Var2;
                        i = 0;
                        xs xsVarC = l60Var.c(f4, Float.NaN, 3);
                        if (xsVarC != null) {
                            arrayListA = l60Var.a(xsVarC.h);
                        }
                    } else {
                        v00Var = v00Var2;
                        i = 0;
                    }
                    if (arrayListA.size() != 0) {
                        int size2 = arrayListA.size();
                        int i4 = i;
                        while (i4 < size2) {
                            Object obj = arrayListA.get(i4);
                            i4++;
                            xs xsVar = (xs) obj;
                            uk1 uk1VarF = lineChart2.f(i3);
                            float f5 = xsVar.h;
                            float f6 = xsVar.f;
                            float[] fArr = (float[]) uk1VarF.k;
                            fArr[i] = f5;
                            fArr[1] = f6;
                            uk1VarF.e(fArr);
                            double d = fArr[i];
                            int i5 = size2;
                            double d2 = fArr[1];
                            z90 z90Var2 = (z90) z90.i.b();
                            z90Var2.g = d;
                            z90Var2.h = d2;
                            float f7 = f4;
                            float f8 = xsVar.h;
                            float f9 = xsVar.f;
                            v00 v00Var3 = new v00();
                            v00Var3.a = f8;
                            v00Var3.b = f9;
                            v00Var3.c = (float) d;
                            v00Var3.d = (float) d2;
                            v00Var3.e = i2;
                            v00Var3.f = i3;
                            arrayList3.add(v00Var3);
                            lineChart2 = lineChart2;
                            size2 = i5;
                            f4 = f7;
                        }
                    }
                    lineChart = lineChart2;
                    f3 = f4;
                    arrayList.addAll(arrayList3);
                } else {
                    v00Var = v00Var2;
                    lineChart = lineChart2;
                    f3 = f4;
                }
                i2++;
                v00Var2 = v00Var;
                lineChart2 = lineChart;
                f4 = f3;
            }
        }
        v00 v00Var4 = v00Var2;
        LineChart lineChart3 = lineChart2;
        if (arrayList.isEmpty()) {
            return v00Var4;
        }
        int i6 = me.a(arrayList, f2, 1) < me.a(arrayList, f2, 2) ? 1 : 2;
        float maxHighlightDistance = lineChart3.getMaxHighlightDistance();
        v00 v00Var5 = v00Var4;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            v00 v00Var6 = (v00) arrayList.get(i7);
            if (v00Var6.f == i6) {
                float fHypot = (float) Math.hypot(f - v00Var6.c, f2 - v00Var6.d);
                if (fHypot < maxHighlightDistance) {
                    v00Var5 = v00Var6;
                    maxHighlightDistance = fHypot;
                }
            }
        }
        return v00Var5;
    }

    public final void c(v00 v00Var) {
        xs xsVarC;
        if (v00Var == null) {
            this.D = null;
        } else {
            int i = v00Var.e;
            if (this.f) {
                v00Var.toString();
            }
            le leVar = this.g;
            leVar.getClass();
            ArrayList arrayList = leVar.i;
            if (i >= arrayList.size()) {
                xsVarC = null;
            } else {
                xsVarC = ((l60) ((q10) arrayList.get(i))).c(v00Var.a, v00Var.b, 3);
            }
            if (xsVarC == null) {
                this.D = null;
            } else {
                this.D = new v00[]{v00Var};
            }
        }
        setLastHighlighted(this.D);
        invalidate();
    }

    public abstract void d();

    public ke getAnimator() {
        return this.x;
    }

    public aa0 getCenter() {
        return aa0.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public aa0 getCenterOfView() {
        return getCenter();
    }

    public aa0 getCenterOffsets() {
        RectF rectF = this.w.b;
        return aa0.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    public RectF getContentRect() {
        return this.w.b;
    }

    @Override // defpackage.ne
    public le getData() {
        return this.g;
    }

    public n41 getDefaultValueFormatter() {
        return this.k;
    }

    public lo getDescription() {
        return this.p;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.j;
    }

    public float getExtraBottomOffset() {
        return this.A;
    }

    public float getExtraLeftOffset() {
        return this.B;
    }

    public float getExtraRightOffset() {
        return this.z;
    }

    public float getExtraTopOffset() {
        return this.y;
    }

    public v00[] getHighlighted() {
        return this.D;
    }

    public r10 getHighlighter() {
        return this.v;
    }

    public ArrayList<Runnable> getJobs() {
        return this.F;
    }

    public k50 getLegend() {
        return this.q;
    }

    public m50 getLegendRenderer() {
        return this.t;
    }

    public s10 getMarker() {
        return null;
    }

    @Deprecated
    public s10 getMarkerView() {
        getMarker();
        return null;
    }

    @Override // defpackage.ne
    public float getMaxHighlightDistance() {
        return this.E;
    }

    @Override // defpackage.ne
    public abstract /* synthetic */ int getMaxVisibleCount();

    public bj0 getOnChartGestureListener() {
        return null;
    }

    public oe getOnTouchListener() {
        return this.r;
    }

    public om getRenderer() {
        return this.u;
    }

    public u61 getViewPortHandler() {
        return this.w;
    }

    public cb1 getXAxis() {
        return this.n;
    }

    public float getXChartMax() {
        return this.n.v;
    }

    public float getXChartMin() {
        return this.n.w;
    }

    public float getXRange() {
        return this.n.x;
    }

    @Override // defpackage.ne
    public abstract /* synthetic */ float getYChartMax();

    @Override // defpackage.ne
    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.g.a;
    }

    public float getYMin() {
        return this.g.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.G) {
            e(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.g == null) {
            if (TextUtils.isEmpty(this.s)) {
                return;
            }
            aa0 center = getCenter();
            canvas.drawText(this.s, center.g, center.h, this.m);
            return;
        }
        if (this.C) {
            return;
        }
        a();
        this.C = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iC = (int) k41.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iC, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iC, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.F;
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            u61 u61Var = this.w;
            float f = i;
            float f2 = i2;
            RectF rectF = u61Var.b;
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = u61Var.c - rectF.right;
            float f6 = u61Var.d - rectF.bottom;
            u61Var.d = f2;
            u61Var.c = f;
            rectF.set(f3, f4, f - f5, f2 - f6);
        }
        d();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            post((Runnable) obj);
        }
        arrayList.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(le leVar) {
        xn xnVar = this.k;
        this.g = leVar;
        int i = 0;
        this.C = false;
        if (leVar == null) {
            return;
        }
        float f = leVar.b;
        float f2 = leVar.a;
        float fD = k41.d(leVar.e() < 2 ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f));
        xnVar.b(Float.isInfinite(fD) ? 0 : ((int) Math.ceil(-Math.log10(fD))) + 2);
        ArrayList arrayList = this.g.i;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l60 l60Var = (l60) ((q10) obj);
            Object obj2 = l60Var.f;
            if (obj2 != null) {
                if (obj2 == null) {
                    obj2 = k41.g;
                }
                if (obj2 == xnVar) {
                }
            }
            l60Var.f = xnVar;
        }
        d();
    }

    public void setDescription(lo loVar) {
        this.p = loVar;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.i = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.j = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setExtraBottomOffset(float f) {
        this.A = k41.c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.B = k41.c(f);
    }

    public void setExtraRightOffset(float f) {
        this.z = k41.c(f);
    }

    public void setExtraTopOffset(float f) {
        this.y = k41.c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.h = z;
    }

    public void setHighlighter(me meVar) {
        this.v = meVar;
    }

    public void setLastHighlighted(v00[] v00VarArr) {
        v00 v00Var;
        if (v00VarArr == null || v00VarArr.length <= 0 || (v00Var = v00VarArr[0]) == null) {
            this.r.g = null;
        } else {
            this.r.g = v00Var;
        }
    }

    public void setLogEnabled(boolean z) {
        this.f = z;
    }

    @Deprecated
    public void setMarkerView(s10 s10Var) {
        setMarker(s10Var);
    }

    public void setMaxHighlightDistance(float f) {
        this.E = k41.c(f);
    }

    public void setNoDataText(String str) {
        this.s = str;
    }

    public void setNoDataTextColor(int i) {
        this.m.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.m.setTypeface(typeface);
    }

    public void setOnTouchListener(oe oeVar) {
        this.r = oeVar;
    }

    public void setRenderer(om omVar) {
        if (omVar != null) {
            this.u = omVar;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.o = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.G = z;
    }

    public void setDrawMarkers(boolean z) {
    }

    public void setMarker(s10 s10Var) {
    }

    public void setOnChartGestureListener(bj0 bj0Var) {
    }

    public void setOnChartValueSelectedListener(cj0 cj0Var) {
    }
}
