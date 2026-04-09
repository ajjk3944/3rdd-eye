package m9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.gms.common.api.internal.a0;
import java.util.ArrayList;
import n9.e;
import n9.f;
import n9.g;
import o9.i;
import u9.d;
import w9.h;
import wj.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b extends ViewGroup implements r9.b {
    public float A;
    public final ArrayList B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public boolean f28996a;

    /* renamed from: b, reason: collision with root package name */
    public o9.b f28997b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28998c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28999d;

    /* renamed from: e, reason: collision with root package name */
    public float f29000e;

    /* renamed from: f, reason: collision with root package name */
    public final p9.b f29001f;
    public Paint g;

    /* renamed from: h, reason: collision with root package name */
    public Paint f29002h;

    /* renamed from: i, reason: collision with root package name */
    public g f29003i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public n9.c f29004k;

    /* renamed from: l, reason: collision with root package name */
    public e f29005l;

    /* renamed from: m, reason: collision with root package name */
    public d f29006m;

    /* renamed from: n, reason: collision with root package name */
    public u9.b f29007n;

    /* renamed from: o, reason: collision with root package name */
    public String f29008o;

    /* renamed from: p, reason: collision with root package name */
    public v9.c f29009p;

    /* renamed from: q, reason: collision with root package name */
    public v9.b f29010q;

    /* renamed from: r, reason: collision with root package name */
    public q9.c f29011r;

    /* renamed from: s, reason: collision with root package name */
    public final h f29012s;

    /* renamed from: t, reason: collision with root package name */
    public l9.a f29013t;

    /* renamed from: u, reason: collision with root package name */
    public float f29014u;

    /* renamed from: v, reason: collision with root package name */
    public float f29015v;

    /* renamed from: w, reason: collision with root package name */
    public float f29016w;

    /* renamed from: x, reason: collision with root package name */
    public float f29017x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29018y;

    /* renamed from: z, reason: collision with root package name */
    public q9.b[] f29019z;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28996a = false;
        this.f28997b = null;
        this.f28998c = true;
        this.f28999d = true;
        this.f29000e = 0.9f;
        this.f29001f = new p9.b(0);
        this.j = true;
        this.f29008o = "No chart data available.";
        this.f29012s = new h();
        this.f29014u = 0.0f;
        this.f29015v = 0.0f;
        this.f29016w = 0.0f;
        this.f29017x = 0.0f;
        this.f29018y = false;
        this.A = 0.0f;
        this.B = new ArrayList();
        this.C = false;
        e();
    }

    public static void g(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i4 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i4 >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                g(viewGroup.getChildAt(i4));
                i4++;
            }
        }
    }

    public abstract void a();

    public final void b(Canvas canvas) {
        n9.c cVar = this.f29004k;
        if (cVar == null || !cVar.f29850a) {
            return;
        }
        Paint paint = this.g;
        cVar.getClass();
        paint.setTypeface(null);
        this.g.setTextSize(this.f29004k.f29853d);
        this.g.setColor(this.f29004k.f29854e);
        this.g.setTextAlign(this.f29004k.g);
        float width = getWidth();
        h hVar = this.f29012s;
        float f10 = hVar.f36565c;
        RectF rectF = hVar.f36564b;
        float f11 = (width - (f10 - rectF.right)) - this.f29004k.f29851b;
        float height = getHeight() - (hVar.f36566d - rectF.bottom);
        n9.c cVar2 = this.f29004k;
        canvas.drawText(cVar2.f29855f, f11, height - cVar2.f29852c, this.g);
    }

    public final q9.b c(float f10, float f11) {
        if (this.f28997b != null) {
            return getHighlighter().a(f10, f11);
        }
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
        return null;
    }

    public final void d(q9.b bVar) {
        o9.d dVar = null;
        if (bVar == null) {
            this.f29019z = null;
        } else {
            if (this.f28996a) {
                Log.i("MPAndroidChart", "Highlighted: " + bVar.toString());
            }
            o9.d dVarF = this.f28997b.f(bVar);
            if (dVarF == null) {
                this.f29019z = null;
            } else {
                this.f29019z = new q9.b[]{bVar};
            }
            dVar = dVarF;
        }
        setLastHighlighted(this.f29019z);
        if (this.f29006m != null) {
            if (h()) {
                a0 a0Var = (a0) this.f29006m;
                a0Var.getClass();
                i iVar = (i) dVar;
                k kVar = (k) a0Var.f9071d;
                float f10 = iVar.f30453a / a0Var.f9069b;
                String str = kVar.f36803e.format(f10 * 100.0f) + "%";
                kVar.f36799a.setCenterText(iVar.f30478d + "\n" + str);
            } else {
                a0 a0Var2 = (a0) this.f29006m;
                ((k) a0Var2.f9071d).f36799a.setCenterText((String) a0Var2.f9070c);
            }
        }
        invalidate();
    }

    public void e() {
        setWillNotDraw(false);
        com.facebook.shimmer.d dVar = new com.facebook.shimmer.d(3, this);
        l9.a aVar = new l9.a();
        aVar.f28624a = dVar;
        this.f29013t = aVar;
        Context context = getContext();
        DisplayMetrics displayMetrics = w9.g.f36555a;
        if (context == null) {
            w9.g.f36556b = ViewConfiguration.getMinimumFlingVelocity();
            w9.g.f36557c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            w9.g.f36556b = viewConfiguration.getScaledMinimumFlingVelocity();
            w9.g.f36557c = viewConfiguration.getScaledMaximumFlingVelocity();
            w9.g.f36555a = context.getResources().getDisplayMetrics();
        }
        this.A = w9.g.c(500.0f);
        this.f29004k = new n9.c();
        e eVar = new e();
        eVar.f29856f = new f[0];
        eVar.g = 1;
        eVar.f29857h = 3;
        eVar.f29858i = 1;
        eVar.j = 1;
        eVar.f29859k = 4;
        eVar.f29860l = 8.0f;
        eVar.f29861m = 3.0f;
        eVar.f29862n = 6.0f;
        eVar.f29863o = 5.0f;
        eVar.f29864p = 3.0f;
        eVar.f29865q = 0.95f;
        eVar.f29866r = 0.0f;
        eVar.f29867s = 0.0f;
        eVar.f29868t = 0.0f;
        eVar.f29869u = new ArrayList(16);
        eVar.f29870v = new ArrayList(16);
        eVar.f29871w = new ArrayList(16);
        eVar.f29853d = w9.g.c(10.0f);
        eVar.f29851b = w9.g.c(5.0f);
        eVar.f29852c = w9.g.c(3.0f);
        this.f29005l = eVar;
        v9.c cVar = new v9.c(9, this.f29012s);
        cVar.f35990f = new ArrayList(16);
        cVar.g = new Paint.FontMetrics();
        cVar.f35991h = new Path();
        cVar.f35989e = eVar;
        Paint paint = new Paint(1);
        cVar.f35987c = paint;
        paint.setTextSize(w9.g.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        cVar.f35988d = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f29009p = cVar;
        g gVar = new g();
        gVar.f29875w = 1;
        gVar.f29876x = 1;
        gVar.f29852c = w9.g.c(4.0f);
        this.f29003i = gVar;
        this.g = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f29002h = paint3;
        paint3.setColor(Color.rgb(247, 189, 51));
        this.f29002h.setTextAlign(Paint.Align.CENTER);
        this.f29002h.setTextSize(w9.g.c(12.0f));
        if (this.f28996a) {
            Log.i("", "Chart.init()");
        }
    }

    public abstract void f();

    public l9.a getAnimator() {
        return this.f29013t;
    }

    public w9.d getCenter() {
        return w9.d.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public w9.d getCenterOfView() {
        return getCenter();
    }

    public w9.d getCenterOffsets() {
        RectF rectF = this.f29012s.f36564b;
        return w9.d.b(rectF.centerX(), rectF.centerY());
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
        return this.f29012s.f36564b;
    }

    public o9.b getData() {
        return this.f28997b;
    }

    public p9.d getDefaultValueFormatter() {
        return this.f29001f;
    }

    public n9.c getDescription() {
        return this.f29004k;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f29000e;
    }

    public float getExtraBottomOffset() {
        return this.f29016w;
    }

    public float getExtraLeftOffset() {
        return this.f29017x;
    }

    public float getExtraRightOffset() {
        return this.f29015v;
    }

    public float getExtraTopOffset() {
        return this.f29014u;
    }

    public q9.b[] getHighlighted() {
        return this.f29019z;
    }

    public q9.c getHighlighter() {
        return this.f29011r;
    }

    public ArrayList<Runnable> getJobs() {
        return this.B;
    }

    public e getLegend() {
        return this.f29005l;
    }

    public v9.c getLegendRenderer() {
        return this.f29009p;
    }

    public n9.d getMarker() {
        return null;
    }

    @Deprecated
    public n9.d getMarkerView() {
        getMarker();
        return null;
    }

    @Override // r9.b
    public float getMaxHighlightDistance() {
        return this.A;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public u9.c getOnChartGestureListener() {
        return null;
    }

    public u9.b getOnTouchListener() {
        return this.f29007n;
    }

    public v9.b getRenderer() {
        return this.f29010q;
    }

    public h getViewPortHandler() {
        return this.f29012s;
    }

    public g getXAxis() {
        return this.f29003i;
    }

    public float getXChartMax() {
        return this.f29003i.f29847t;
    }

    public float getXChartMin() {
        return this.f29003i.f29848u;
    }

    public float getXRange() {
        return this.f29003i.f29849v;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.f28997b.f30433a;
    }

    public float getYMin() {
        return this.f28997b.f30434b;
    }

    public final boolean h() {
        q9.b[] bVarArr = this.f29019z;
        return (bVarArr == null || bVarArr.length <= 0 || bVarArr[0] == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.C) {
            g(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f28997b == null) {
            if (TextUtils.isEmpty(this.f29008o)) {
                return;
            }
            w9.d center = getCenter();
            canvas.drawText(this.f29008o, center.f36546b, center.f36547c, this.f29002h);
            return;
        }
        if (this.f29018y) {
            return;
        }
        a();
        this.f29018y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            getChildAt(i13).layout(i4, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        int iC = (int) w9.g.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iC, i4)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iC, i10)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i10, int i11, int i12) {
        if (this.f28996a) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i4 > 0 && i10 > 0 && i4 < 10000 && i10 < 10000) {
            if (this.f28996a) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i4 + ", height: " + i10);
            }
            float f10 = i4;
            float f11 = i10;
            h hVar = this.f29012s;
            RectF rectF = hVar.f36564b;
            float f12 = rectF.left;
            float f13 = rectF.top;
            float f14 = hVar.f36565c - rectF.right;
            float f15 = hVar.f36566d - rectF.bottom;
            hVar.f36566d = f11;
            hVar.f36565c = f10;
            rectF.set(f12, f13, f10 - f14, f11 - f15);
        } else if (this.f28996a) {
            Log.w("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + i4 + ", height: " + i10);
        }
        f();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            post((Runnable) obj);
        }
        arrayList.clear();
        super.onSizeChanged(i4, i10, i11, i12);
    }

    public void setData(o9.b bVar) {
        this.f28997b = bVar;
        int i4 = 0;
        this.f29018y = false;
        if (bVar == null) {
            return;
        }
        float f10 = bVar.f30434b;
        float f11 = bVar.f30433a;
        float fD = w9.g.d(bVar.e() < 2 ? Math.max(Math.abs(f10), Math.abs(f11)) : Math.abs(f11 - f10));
        int iCeil = Float.isInfinite(fD) ? 0 : ((int) Math.ceil(-Math.log10(fD))) + 2;
        p9.b bVar2 = this.f29001f;
        bVar2.d(iCeil);
        ArrayList arrayList = this.f28997b.f30440i;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            o9.c cVar = (o9.c) ((s9.a) obj);
            Object obj2 = cVar.f30445e;
            if (obj2 != null) {
                if (obj2 == null) {
                    obj2 = w9.g.f36561h;
                }
                if (obj2 == bVar2) {
                }
            }
            cVar.f30445e = bVar2;
        }
        f();
        if (this.f28996a) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(n9.c cVar) {
        this.f29004k = cVar;
    }

    public void setDragDecelerationEnabled(boolean z3) {
        this.f28999d = z3;
    }

    public void setDragDecelerationFrictionCoef(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 >= 1.0f) {
            f10 = 0.999f;
        }
        this.f29000e = f10;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z3) {
        setDrawMarkers(z3);
    }

    public void setExtraBottomOffset(float f10) {
        this.f29016w = w9.g.c(f10);
    }

    public void setExtraLeftOffset(float f10) {
        this.f29017x = w9.g.c(f10);
    }

    public void setExtraRightOffset(float f10) {
        this.f29015v = w9.g.c(f10);
    }

    public void setExtraTopOffset(float f10) {
        this.f29014u = w9.g.c(f10);
    }

    public void setHardwareAccelerationEnabled(boolean z3) {
        if (z3) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z3) {
        this.f28998c = z3;
    }

    public void setHighlighter(q9.a aVar) {
        this.f29011r = aVar;
    }

    public void setLastHighlighted(q9.b[] bVarArr) {
        q9.b bVar;
        if (bVarArr == null || bVarArr.length <= 0 || (bVar = bVarArr[0]) == null) {
            this.f29007n.f35213b = null;
        } else {
            this.f29007n.f35213b = bVar;
        }
    }

    public void setLogEnabled(boolean z3) {
        this.f28996a = z3;
    }

    @Deprecated
    public void setMarkerView(n9.d dVar) {
        setMarker(dVar);
    }

    public void setMaxHighlightDistance(float f10) {
        this.A = w9.g.c(f10);
    }

    public void setNoDataText(String str) {
        this.f29008o = str;
    }

    public void setNoDataTextColor(int i4) {
        this.f29002h.setColor(i4);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.f29002h.setTypeface(typeface);
    }

    public void setOnChartValueSelectedListener(d dVar) {
        this.f29006m = dVar;
    }

    public void setOnTouchListener(u9.b bVar) {
        this.f29007n = bVar;
    }

    public void setRenderer(v9.b bVar) {
        if (bVar != null) {
            this.f29010q = bVar;
        }
    }

    public void setTouchEnabled(boolean z3) {
        this.j = z3;
    }

    public void setUnbindEnabled(boolean z3) {
        this.C = z3;
    }

    public void setDrawMarkers(boolean z3) {
    }

    public void setMarker(n9.d dVar) {
    }

    public void setOnChartGestureListener(u9.c cVar) {
    }
}
