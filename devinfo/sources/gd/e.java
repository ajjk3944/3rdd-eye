package gd;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.slider.Slider;
import com.liuzh.deviceinfo.R;
import e4.v0;
import ed.j;
import ed.n;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import je.u;
import zc.k;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e extends View {
    public static final /* synthetic */ int V0 = 0;
    public final int A;
    public ColorStateList A0;
    public int B;
    public ColorStateList B0;
    public int C;
    public final Path C0;
    public int D;
    public final RectF D0;
    public int E;
    public final RectF E0;
    public int F;
    public final RectF F0;
    public int G;
    public final RectF G0;
    public int H;
    public final Rect H0;
    public int I;
    public final RectF I0;
    public int J;
    public final Rect J0;
    public int K;
    public final Matrix K0;
    public int L;
    public final j L0;
    public int M;
    public Drawable M0;
    public int N;
    public List N0;
    public boolean O;
    public float O0;
    public Drawable P;
    public int P0;
    public boolean Q;
    public final int Q0;
    public Drawable R;
    public final a R0;
    public boolean S;
    public final b S0;
    public ColorStateList T;
    public final o0 T0;
    public Drawable U;
    public boolean U0;
    public boolean V;
    public Drawable W;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f24639a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f24640a0;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f24641b;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f24642b0;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f24643c;

    /* renamed from: c0, reason: collision with root package name */
    public int f24644c0;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f24645d;

    /* renamed from: d0, reason: collision with root package name */
    public final int f24646d0;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f24647e;

    /* renamed from: e0, reason: collision with root package name */
    public final int f24648e0;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f24649f;

    /* renamed from: f0, reason: collision with root package name */
    public float f24650f0;
    public final Paint g;

    /* renamed from: g0, reason: collision with root package name */
    public float f24651g0;

    /* renamed from: h, reason: collision with root package name */
    public final c f24652h;

    /* renamed from: h0, reason: collision with root package name */
    public MotionEvent f24653h0;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManager f24654i;

    /* renamed from: i0, reason: collision with root package name */
    public f f24655i0;
    public b4.a j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f24656j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f24657k;

    /* renamed from: k0, reason: collision with root package name */
    public float f24658k0;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f24659l;

    /* renamed from: l0, reason: collision with root package name */
    public float f24660l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f24661m;

    /* renamed from: m0, reason: collision with root package name */
    public ArrayList f24662m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f24663n;

    /* renamed from: n0, reason: collision with root package name */
    public int f24664n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24665o;

    /* renamed from: o0, reason: collision with root package name */
    public int f24666o0;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f24667p;

    /* renamed from: p0, reason: collision with root package name */
    public float f24668p0;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f24669q;

    /* renamed from: q0, reason: collision with root package name */
    public float[] f24670q0;

    /* renamed from: r, reason: collision with root package name */
    public final int f24671r;

    /* renamed from: r0, reason: collision with root package name */
    public int f24672r0;

    /* renamed from: s, reason: collision with root package name */
    public final int f24673s;

    /* renamed from: s0, reason: collision with root package name */
    public int f24674s0;

    /* renamed from: t, reason: collision with root package name */
    public final int f24675t;

    /* renamed from: t0, reason: collision with root package name */
    public int f24676t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f24677u;

    /* renamed from: u0, reason: collision with root package name */
    public int f24678u0;

    /* renamed from: v, reason: collision with root package name */
    public final int f24679v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f24680v0;

    /* renamed from: w, reason: collision with root package name */
    public final int f24681w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f24682w0;

    /* renamed from: x, reason: collision with root package name */
    public final int f24683x;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f24684x0;

    /* renamed from: y, reason: collision with root package name */
    public final int f24685y;

    /* renamed from: y0, reason: collision with root package name */
    public ColorStateList f24686y0;

    /* renamed from: z, reason: collision with root package name */
    public int f24687z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f24688z0;

    /* JADX WARN: Type inference failed for: r1v11, types: [gd.a] */
    /* JADX WARN: Type inference failed for: r1v12, types: [gd.b] */
    public e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(md.a.a(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        this.f24659l = new ArrayList();
        this.f24661m = new ArrayList();
        this.f24663n = new ArrayList();
        this.f24665o = false;
        this.J = -1;
        this.K = -1;
        this.O = false;
        this.Q = false;
        this.S = false;
        this.V = false;
        this.f24640a0 = false;
        this.f24656j0 = false;
        this.f24662m0 = new ArrayList();
        this.f24664n0 = -1;
        this.f24666o0 = -1;
        this.f24668p0 = 0.0f;
        this.f24680v0 = false;
        this.C0 = new Path();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = new RectF();
        this.G0 = new RectF();
        this.H0 = new Rect();
        this.I0 = new RectF();
        this.J0 = new Rect();
        this.K0 = new Matrix();
        j jVar = new j();
        this.L0 = jVar;
        this.N0 = Collections.EMPTY_LIST;
        this.P0 = 0;
        final Slider slider = (Slider) this;
        this.R0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: gd.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                slider.E();
            }
        };
        this.S0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: gd.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                slider.E();
            }
        };
        this.T0 = new o0(23, slider);
        Context context2 = getContext();
        this.U0 = isShown();
        this.f24639a = new Paint();
        this.f24641b = new Paint();
        Paint paint = new Paint(1);
        this.f24643c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f24645d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f24647e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f24649f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.A = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f24673s = dimensionPixelOffset;
        this.E = dimensionPixelOffset;
        this.f24675t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f24677u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f24679v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f24681w = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f24683x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f24648e0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.f24646d0 = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
        m.a(context2, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = ic.a.G;
        m.b(context2, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        setOrientation(typedArrayObtainStyledAttributes.getInt(2, 0));
        this.f24657k = typedArrayObtainStyledAttributes.getResourceId(10, R.style.Widget_MaterialComponents_Tooltip);
        this.f24658k0 = typedArrayObtainStyledAttributes.getFloat(4, 0.0f);
        this.f24660l0 = typedArrayObtainStyledAttributes.getFloat(5, 1.0f);
        setValues(Float.valueOf(this.f24658k0));
        setCentered(typedArrayObtainStyledAttributes.getBoolean(6, false));
        this.f24668p0 = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f24685y = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(11, ii.a.A(context2)));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(27);
        int i4 = zHasValue ? 27 : 29;
        int i10 = zHasValue ? 27 : 28;
        ColorStateList colorStateListJ = jm.a.j(context2, typedArrayObtainStyledAttributes, i4);
        setTrackInactiveTintList(colorStateListJ == null ? wd.b.r(R.color.material_slider_inactive_track_color, context2) : colorStateListJ);
        ColorStateList colorStateListJ2 = jm.a.j(context2, typedArrayObtainStyledAttributes, i10);
        setTrackActiveTintList(colorStateListJ2 == null ? wd.b.r(R.color.material_slider_active_track_color, context2) : colorStateListJ2);
        jVar.o(jm.a.j(context2, typedArrayObtainStyledAttributes, 12));
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setThumbStrokeColor(jm.a.j(context2, typedArrayObtainStyledAttributes, 16));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(17, 0.0f));
        ColorStateList colorStateListJ3 = jm.a.j(context2, typedArrayObtainStyledAttributes, 7);
        setHaloTintList(colorStateListJ3 == null ? wd.b.r(R.color.material_slider_halo_color, context2) : colorStateListJ3);
        this.f24672r0 = typedArrayObtainStyledAttributes.hasValue(25) ? typedArrayObtainStyledAttributes.getInt(25, -1) : typedArrayObtainStyledAttributes.getBoolean(26, true) ? 0 : 2;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(20);
        int i11 = zHasValue2 ? 20 : 22;
        int i12 = zHasValue2 ? 20 : 21;
        ColorStateList colorStateListJ4 = jm.a.j(context2, typedArrayObtainStyledAttributes, i11);
        setTickInactiveTintList(colorStateListJ4 == null ? wd.b.r(R.color.material_slider_inactive_tick_marks_color, context2) : colorStateListJ4);
        ColorStateList colorStateListJ5 = jm.a.j(context2, typedArrayObtainStyledAttributes, i12);
        setTickActiveTintList(colorStateListJ5 == null ? wd.b.r(R.color.material_slider_active_tick_marks_color, context2) : colorStateListJ5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(40, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(30, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(39, 0));
        setTrackIconActiveStart(jm.a.m(context2, typedArrayObtainStyledAttributes, 34));
        setTrackIconActiveEnd(jm.a.m(context2, typedArrayObtainStyledAttributes, 33));
        setTrackIconActiveColor(jm.a.j(context2, typedArrayObtainStyledAttributes, 32));
        setTrackIconInactiveStart(jm.a.m(context2, typedArrayObtainStyledAttributes, 37));
        setTrackIconInactiveEnd(jm.a.m(context2, typedArrayObtainStyledAttributes, 36));
        setTrackIconInactiveColor(jm.a.j(context2, typedArrayObtainStyledAttributes, 35));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(38, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(13, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(31, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(23, this.L / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(24, this.L / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(9, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        jVar.p();
        this.f24671r = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(slider);
        this.f24652h = cVar;
        v0.o(this, cVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f24654i = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.Q0 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.Q0 = 120000;
        }
    }

    public final boolean A(int i4, float f10) {
        this.f24666o0 = i4;
        int i10 = 0;
        if (Math.abs(f10 - ((Float) this.f24662m0.get(i4)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.P0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f11 = this.f24658k0;
                minSeparation = r5.c.c(f11, this.f24660l0, (minSeparation - this.E) / this.f24678u0, f11);
            }
        }
        if (s() || t()) {
            minSeparation = -minSeparation;
        }
        int i11 = i4 + 1;
        int i12 = i4 - 1;
        this.f24662m0.set(i4, Float.valueOf(com.bumptech.glide.d.h(f10, i12 < 0 ? this.f24658k0 : minSeparation + ((Float) this.f24662m0.get(i12)).floatValue(), i11 >= this.f24662m0.size() ? this.f24660l0 : ((Float) this.f24662m0.get(i11)).floatValue() - minSeparation)));
        ArrayList arrayList = this.f24661m;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g) obj).a(this, ((Float) this.f24662m0.get(i4)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f24654i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.j;
            if (runnable == null) {
                this.j = new b4.a(this);
            } else {
                removeCallbacks(runnable);
            }
            b4.a aVar = this.j;
            aVar.f1667b = i4;
            postDelayed(aVar, 200L);
        }
        return true;
    }

    public final void B() {
        double dRound;
        float f10 = this.O0;
        float f11 = this.f24668p0;
        if (f11 > 0.0f) {
            dRound = Math.round(f10 * r1) / ((int) ((this.f24660l0 - this.f24658k0) / f11));
        } else {
            dRound = f10;
        }
        if (s() || t()) {
            dRound = 1.0d - dRound;
        }
        float f12 = this.f24660l0;
        A(this.f24664n0, (float) ((dRound * (f12 - r1)) + this.f24658k0));
    }

    public final void C(int i4, Rect rect) {
        int iW = this.E + ((int) (w(getValues().get(i4).floatValue()) * this.f24678u0));
        int iD = d();
        int iMax = Math.max(this.F / 2, this.f24685y / 2);
        int iMax2 = Math.max(this.G / 2, this.f24685y / 2);
        RectF rectF = new RectF(iW - iMax, iD - iMax2, iW + iMax, iD + iMax2);
        if (t()) {
            this.K0.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void D() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fW = (w(((Float) this.f24662m0.get(this.f24666o0)).floatValue()) * this.f24678u0) + this.E;
            int iD = d();
            float f10 = this.H;
            float[] fArr = {fW - f10, iD - r3, fW + f10, iD + r3};
            if (t()) {
                this.K0.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    public final void E() {
        float f10;
        boolean zT = t();
        boolean zS = s();
        float f11 = 0.5f;
        if (zT && zS) {
            f10 = 0.5f;
            f11 = -0.2f;
        } else {
            f10 = 1.2f;
            if (zT) {
                f11 = 1.2f;
                f10 = 0.5f;
            }
        }
        ArrayList arrayList = this.f24659l;
        int size = arrayList.size();
        boolean z3 = false;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            nd.a aVar = (nd.a) obj;
            aVar.W = f11;
            aVar.X = f10;
            aVar.invalidateSelf();
        }
        int i10 = this.C;
        if (i10 == 0 || i10 == 1) {
            if (this.f24664n0 == -1 || !isEnabled()) {
                l();
                return;
            } else {
                k();
                return;
            }
        }
        if (i10 == 2) {
            l();
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.C);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            m.e(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                if (Build.VERSION.SDK_INT >= 24 ? this.U0 : isShown()) {
                    z3 = true;
                }
            }
            if (z3) {
                k();
                return;
            }
        }
        l();
    }

    public final void F() {
        int i4 = this.I;
        if (i4 > 0) {
            int i10 = this.F;
            this.J = i10;
            this.K = i4;
            int iRound = Math.round(i10 * 0.5f);
            int i11 = this.F - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.I - (i11 / 2));
        }
    }

    public final void G() {
        O();
        float f10 = this.f24668p0;
        int iMin = 0;
        if (f10 <= 0.0f) {
            H(0);
            return;
        }
        int i4 = this.f24672r0;
        if (i4 == 0) {
            iMin = Math.min((int) (((this.f24660l0 - this.f24658k0) / f10) + 1.0f), (this.f24678u0 / this.f24683x) + 1);
        } else if (i4 == 1) {
            int i10 = (int) (((this.f24660l0 - this.f24658k0) / f10) + 1.0f);
            if (i10 <= (this.f24678u0 / this.f24683x) + 1) {
                iMin = i10;
            }
        } else if (i4 != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.f24672r0);
        }
        H(iMin);
    }

    public final void H(int i4) {
        if (i4 == 0) {
            this.f24670q0 = null;
            return;
        }
        float[] fArr = this.f24670q0;
        if (fArr == null || fArr.length != i4 * 2) {
            this.f24670q0 = new float[i4 * 2];
        }
        float f10 = this.f24678u0 / (i4 - 1);
        float fD = d();
        for (int i10 = 0; i10 < i4 * 2; i10 += 2) {
            float[] fArr2 = this.f24670q0;
            fArr2[i10] = ((i10 / 2.0f) * f10) + this.E;
            fArr2[i10 + 1] = fD;
        }
        if (t()) {
            this.K0.mapPoints(this.f24670q0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(android.graphics.Canvas r18, android.graphics.Paint r19, android.graphics.RectF r20, float r21, int r22) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.e.I(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, float, int):void");
    }

    public final void J() {
        Drawable drawable = this.R;
        if (drawable != null) {
            if (!this.S && this.T != null) {
                this.R = drawable.mutate();
                this.S = true;
            }
            if (this.S) {
                this.R.setTintList(this.T);
            }
        }
    }

    public final void K() {
        Drawable drawable = this.P;
        if (drawable != null) {
            if (!this.Q && this.T != null) {
                this.P = drawable.mutate();
                this.Q = true;
            }
            if (this.Q) {
                this.P.setTintList(this.T);
            }
        }
    }

    public final void L() {
        Drawable drawable = this.W;
        if (drawable != null) {
            if (!this.f24640a0 && this.f24642b0 != null) {
                this.W = drawable.mutate();
                this.f24640a0 = true;
            }
            if (this.f24640a0) {
                this.W.setTintList(this.f24642b0);
            }
        }
    }

    public final void M() {
        Drawable drawable = this.U;
        if (drawable != null) {
            if (!this.V && this.f24642b0 != null) {
                this.U = drawable.mutate();
                this.V = true;
            }
            if (this.V) {
                this.U.setTintList(this.f24642b0);
            }
        }
    }

    public final void N(boolean z3) {
        int paddingTop;
        int paddingBottom;
        boolean z10;
        if (t()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i4 = paddingBottom + paddingTop;
        int iMax = Math.max(this.A, Math.max(this.D + i4, this.G + i4));
        boolean z11 = true;
        if (iMax == this.B) {
            z10 = false;
        } else {
            this.B = iMax;
            z10 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.F / 2) - this.f24675t, 0), Math.max((this.D - this.f24677u) / 2, 0)), Math.max(Math.max(this.f24674s0 - this.f24679v, 0), Math.max(this.f24676t0 - this.f24681w, 0))) + this.f24673s;
        if (this.E == iMax2) {
            z11 = false;
        } else {
            this.E = iMax2;
            if (isLaidOut()) {
                this.f24678u0 = Math.max((t() ? getHeight() : getWidth()) - (this.E * 2), 0);
                G();
            }
        }
        if (t()) {
            float fD = d();
            Matrix matrix = this.K0;
            matrix.reset();
            matrix.setRotate(90.0f, fD, fD);
        }
        if (z10 || z3) {
            requestLayout();
        } else if (z11) {
            postInvalidate();
        }
    }

    public final void O() {
        if (this.f24682w0) {
            if (this.f24658k0 >= this.f24660l0) {
                throw new IllegalStateException("valueFrom(" + this.f24658k0 + ") must be smaller than valueTo(" + this.f24660l0 + ")");
            }
            ArrayList arrayList = this.f24662m0;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                Float f10 = (Float) obj;
                if (f10.floatValue() < this.f24658k0 || f10.floatValue() > this.f24660l0) {
                    throw new IllegalStateException("Slider value(" + f10 + ") must be greater or equal to valueFrom(" + this.f24658k0 + "), and lower or equal to valueTo(" + this.f24660l0 + ")");
                }
                if (this.f24668p0 > 0.0f && !P(f10.floatValue())) {
                    float f11 = this.f24658k0;
                    float f12 = this.f24668p0;
                    throw new IllegalStateException("Value(" + f10 + ") must be equal to valueFrom(" + f11 + ") plus a multiple of stepSize(" + f12 + ") when using stepSize(" + f12 + ")");
                }
            }
            if (this.f24668p0 > 0.0f && !P(this.f24660l0)) {
                throw new IllegalStateException("The stepSize(" + this.f24668p0 + ") must be 0, or a factor of the valueFrom(" + this.f24658k0 + ")-valueTo(" + this.f24660l0 + ") range");
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f13 = this.f24668p0;
            if (f13 > 0.0f && minSeparation > 0.0f) {
                if (this.P0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f24668p0 + ")");
                }
                if (minSeparation < f13 || !p(minSeparation)) {
                    float f14 = this.f24668p0;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f14 + ") when using stepSize(" + f14 + ")");
                }
            }
            float f15 = this.f24668p0;
            if (f15 != 0.0f) {
                if (((int) f15) != f15) {
                    Log.w("e", "Floating point value used for stepSize(" + f15 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f16 = this.f24658k0;
                if (((int) f16) != f16) {
                    Log.w("e", "Floating point value used for valueFrom(" + f16 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f17 = this.f24660l0;
                if (((int) f17) != f17) {
                    Log.w("e", "Floating point value used for valueTo(" + f17 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f24682w0 = false;
        }
    }

    public final boolean P(float f10) {
        return p(new BigDecimal(Float.toString(f10)).subtract(new BigDecimal(Float.toString(this.f24658k0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float Q(float f10) {
        return (w(f10) * this.f24678u0) + this.E;
    }

    public final void a(g gVar) {
        this.f24661m.add(gVar);
    }

    public final void b(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.F, this.G);
        } else {
            float fMax = Math.max(this.F, this.G) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final void c(Canvas canvas, RectF rectF, Drawable drawable, boolean z3) {
        if (drawable != null) {
            int i4 = this.f24644c0;
            float f10 = rectF.right - rectF.left;
            int i10 = this.f24646d0;
            float f11 = (i10 * 2) + i4;
            RectF rectF2 = this.I0;
            if (f10 >= f11) {
                float f12 = z3 ^ (s() || t()) ? rectF.left + i10 : (rectF.right - i10) - i4;
                float f13 = i4;
                float fD = d() - (f13 / 2.0f);
                rectF2.set(f12, fD, f12 + f13, f13 + fD);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (t()) {
                this.K0.mapRect(rectF2);
            }
            Rect rect = this.J0;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int d() {
        int i4 = this.B / 2;
        int i10 = this.C;
        return i4 + ((i10 == 1 || i10 == 3) ? ((nd.a) this.f24659l.get(0)).getIntrinsicHeight() : 0);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f24652h.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f24639a.setColor(o(this.B0));
        this.f24641b.setColor(o(this.A0));
        this.f24647e.setColor(o(this.f24688z0));
        this.f24649f.setColor(o(this.f24686y0));
        this.g.setColor(o(this.f24688z0));
        ArrayList arrayList = this.f24659l;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            nd.a aVar = (nd.a) obj;
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        j jVar = this.L0;
        if (jVar.isStateful()) {
            jVar.setState(getDrawableState());
        }
        int iO = o(this.f24684x0);
        Paint paint = this.f24645d;
        paint.setColor(iO);
        paint.setAlpha(63);
    }

    public final ValueAnimator e(boolean z3) {
        int iV;
        TimeInterpolator timeInterpolatorW;
        float fFloatValue = z3 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z3 ? this.f24669q : this.f24667p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z3 ? 1.0f : 0.0f);
        if (z3) {
            iV = nh.a.v(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorW = nh.a.w(getContext(), R.attr.motionEasingEmphasizedInterpolator, jc.a.f27486e);
        } else {
            iV = nh.a.v(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorW = nh.a.w(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, jc.a.f27484c);
        }
        valueAnimatorOfFloat.setDuration(iV);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorW);
        valueAnimatorOfFloat.addUpdateListener(new eh.a(2, this));
        return valueAnimatorOfFloat;
    }

    public final void f(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF, int i4) {
        if (f11 - f10 > getTrackCornerSize() - this.I) {
            rectF.set(f10, f12, f11, f13);
        } else {
            rectF.setEmpty();
        }
        I(canvas, this.f24639a, rectF, getTrackCornerSize(), i4);
    }

    public final void g(Canvas canvas, float f10, float f11) {
        ArrayList arrayList = this.f24662m0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            float fQ = Q(((Float) obj).floatValue());
            float f12 = (this.F / 2.0f) + this.I;
            if (f10 >= fQ - f12 && f10 <= fQ + f12) {
                return;
            }
        }
        boolean zT = t();
        Paint paint = this.g;
        if (zT) {
            canvas.drawPoint(f11, f10, paint);
        } else {
            canvas.drawPoint(f10, f11, paint);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f24652h.f29738k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public abstract int getTrackCornerSize();

    public List<Float> getValues() {
        return new ArrayList(this.f24662m0);
    }

    public final void h(Canvas canvas, int i4, int i10, float f10, Drawable drawable) {
        canvas.save();
        if (t()) {
            canvas.concat(this.K0);
        }
        canvas.translate((this.E + ((int) (w(f10) * i4))) - (drawable.getBounds().width() / 2.0f), i10 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r6, int r7, android.graphics.Canvas r8, android.graphics.Paint r9) {
        /*
            r5 = this;
        L0:
            if (r6 >= r7) goto L72
            boolean r0 = r5.t()
            if (r0 == 0) goto Lf
            float[] r0 = r5.f24670q0
            int r1 = r6 + 1
            r0 = r0[r1]
            goto L13
        Lf:
            float[] r0 = r5.f24670q0
            r0 = r0[r6]
        L13:
            int r1 = r5.I
            float r1 = (float) r1
            int r2 = r5.F
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r2 = r2 + r1
            java.util.ArrayList r1 = r5.f24662m0
            java.util.Iterator r1 = r1.iterator()
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r1 = r1.next()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r5.Q(r1)
            float r4 = r1 - r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L43
            float r1 = r1 + r2
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L43
            goto L6f
        L43:
            boolean r1 = r5.O
            if (r1 == 0) goto L64
            int r1 = r5.I
            float r1 = (float) r1
            int r2 = r5.F
            float r2 = (float) r2
            float r2 = r2 / r3
            float r2 = r2 + r1
            int r1 = r5.f24678u0
            int r4 = r5.E
            int r4 = r4 * 2
            int r4 = r4 + r1
            float r1 = (float) r4
            float r1 = r1 / r3
            float r3 = r1 - r2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L64
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L64
            goto L6f
        L64:
            float[] r0 = r5.f24670q0
            r1 = r0[r6]
            int r2 = r6 + 1
            r0 = r0[r2]
            r8.drawPoint(r1, r0, r9)
        L6f:
            int r6 = r6 + 2
            goto L0
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.e.i(int, int, android.graphics.Canvas, android.graphics.Paint):void");
    }

    public final void j(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.P == null && this.R == null && this.U == null && this.W == null) {
            return;
        }
        if (this.f24662m0.size() > 1) {
            Log.w("e", "Track icons can only be used when only 1 thumb is present.");
        }
        c(canvas, rectF, this.P, true);
        c(canvas, rectF2, this.U, true);
        c(canvas, rectF, this.R, false);
        c(canvas, rectF2, this.W, false);
    }

    public final void k() {
        if (!this.f24665o) {
            this.f24665o = true;
            ValueAnimator valueAnimatorE = e(true);
            this.f24667p = valueAnimatorE;
            this.f24669q = null;
            valueAnimatorE.start();
        }
        ArrayList arrayList = this.f24659l;
        Iterator it = arrayList.iterator();
        for (int i4 = 0; i4 < this.f24662m0.size() && it.hasNext(); i4++) {
            if (i4 != this.f24666o0) {
                y((nd.a) it.next(), ((Float) this.f24662m0.get(i4)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f24662m0.size())));
        }
        y((nd.a) it.next(), ((Float) this.f24662m0.get(this.f24666o0)).floatValue());
    }

    public final void l() {
        if (this.f24665o) {
            this.f24665o = false;
            ValueAnimator valueAnimatorE = e(false);
            this.f24669q = valueAnimatorE;
            this.f24667p = null;
            valueAnimatorE.addListener(new ad.g(3, this));
            this.f24669q.start();
        }
    }

    public final String m(float f10) {
        f fVar = this.f24655i0;
        if (fVar != null) {
            return fVar.a(f10);
        }
        return String.format(((float) ((int) f10)) == f10 ? "%.0f" : "%.2f", Float.valueOf(f10));
    }

    public final float[] n() {
        float fFloatValue = ((Float) this.f24662m0.get(0)).floatValue();
        float fFloatValue2 = ((Float) u.p(1, this.f24662m0)).floatValue();
        if (this.f24662m0.size() == 1) {
            fFloatValue = this.f24658k0;
        }
        float fW = w(fFloatValue);
        float fW2 = w(fFloatValue2);
        if (this.O) {
            float fMin = Math.min(0.5f, fW2);
            fW2 = Math.max(0.5f, fW2);
            fW = fMin;
        }
        return (this.O || !(s() || t())) ? new float[]{fW, fW2} : new float[]{fW2, fW};
    }

    public final int o(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U0 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.R0);
        getViewTreeObserver().addOnGlobalLayoutListener(this.S0);
        ArrayList arrayList = this.f24659l;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            nd.a aVar = (nd.a) obj;
            ViewGroup viewGroupE = m.e(this);
            if (viewGroupE == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                viewGroupE.getLocationOnScreen(iArr);
                aVar.T = iArr[0];
                viewGroupE.getWindowVisibleDisplayFrame(aVar.M);
                viewGroupE.addOnLayoutChangeListener(aVar.L);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        b4.a aVar = this.j;
        if (aVar != null) {
            removeCallbacks(aVar);
        }
        int i4 = 0;
        this.f24665o = false;
        ArrayList arrayList = this.f24659l;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            nd.a aVar2 = (nd.a) obj;
            ViewGroup viewGroupE = m.e(this);
            if (viewGroupE != null) {
                viewGroupE.getOverlay().remove(aVar2);
                viewGroupE.removeOnLayoutChangeListener(aVar2.L);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.R0);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.S0);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.e.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i4, Rect rect) {
        super.onFocusChanged(z3, i4, rect);
        c cVar = this.f24652h;
        if (!z3) {
            this.f24664n0 = -1;
            cVar.j(this.f24666o0);
            return;
        }
        if (i4 == 1) {
            u(Integer.MAX_VALUE);
        } else if (i4 == 2) {
            u(LinearLayoutManager.INVALID_OFFSET);
        } else if (i4 == 17) {
            v(Integer.MAX_VALUE);
        } else if (i4 == 66) {
            v(LinearLayoutManager.INVALID_OFFSET);
        }
        cVar.w(this.f24666o0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        this.f24680v0 = false;
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        int i11 = this.C;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.B + ((i11 == 1 || i11 == 3) ? ((nd.a) this.f24659l.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (t()) {
            super.onMeasure(iMakeMeasureSpec, i10);
        } else {
            super.onMeasure(i4, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f24658k0 = dVar.f24634a;
        this.f24660l0 = dVar.f24635b;
        z(dVar.f24636c);
        this.f24668p0 = dVar.f24637d;
        if (dVar.f24638e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f24634a = this.f24658k0;
        dVar.f24635b = this.f24660l0;
        dVar.f24636c = new ArrayList(this.f24662m0);
        dVar.f24637d = this.f24668p0;
        dVar.f24638e = hasFocus();
        return dVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        if (t()) {
            i4 = i10;
        }
        this.f24678u0 = Math.max(i4 - (this.E * 2), 0);
        G();
        D();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z3) {
        super.onVisibilityAggregated(z3);
        this.U0 = z3;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (i4 != 0) {
            ViewGroup viewGroupE = m.e(this);
            ViewOverlay overlay = viewGroupE == null ? null : viewGroupE.getOverlay();
            if (overlay == null) {
                return;
            }
            ArrayList arrayList = this.f24659l;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                overlay.remove((nd.a) obj);
            }
        }
    }

    public final boolean p(double d10) {
        double dDoubleValue = new BigDecimal(Double.toString(d10)).divide(new BigDecimal(Float.toString(this.f24668p0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean q(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        return getLayoutDirection() == 1;
    }

    public void setActiveThumbIndex(int i4) {
        this.f24664n0 = i4;
    }

    public abstract void setCentered(boolean z3);

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            drawableArr[i4] = getResources().getDrawable(iArr[i4]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        setLayerType(z3 ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i4);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i4);

    public abstract void setOrientation(int i4);

    public void setSeparationUnit(int i4) {
        this.P0 = i4;
        this.f24682w0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f10);

    public abstract void setThumbHeight(int i4);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f10);

    public abstract void setThumbTrackGapSize(int i4);

    public abstract void setThumbWidth(int i4);

    public abstract void setTickActiveRadius(int i4);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i4);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackCornerSize(int i4);

    public abstract void setTrackHeight(int i4);

    public abstract void setTrackIconActiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconActiveEnd(Drawable drawable);

    public abstract void setTrackIconActiveStart(Drawable drawable);

    public abstract void setTrackIconInactiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconInactiveEnd(Drawable drawable);

    public abstract void setTrackIconInactiveStart(Drawable drawable);

    public abstract void setTrackIconSize(int i4);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i4);

    public abstract void setTrackStopIndicatorSize(int i4);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        z(arrayList);
    }

    public final boolean t() {
        return this.f24687z == 1;
    }

    public final boolean u(int i4) {
        int i10 = this.f24666o0;
        long j = i10 + i4;
        long size = this.f24662m0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i11 = (int) j;
        this.f24666o0 = i11;
        if (i11 == i10) {
            return false;
        }
        if (this.f24664n0 != -1) {
            this.f24664n0 = i11;
        }
        D();
        postInvalidate();
        return true;
    }

    public final void v(int i4) {
        if (s() || t()) {
            i4 = i4 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i4;
        }
        u(i4);
    }

    public final float w(float f10) {
        float f11 = this.f24658k0;
        float f12 = (f10 - f11) / (this.f24660l0 - f11);
        return (s() || t()) ? 1.0f - f12 : f12;
    }

    public final void x() {
        Iterator it = this.f24663n.iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(nd.a r5, float r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.m(r6)
            java.lang.CharSequence r1 = r5.H
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 != 0) goto L16
            r5.H = r0
            zc.k r0 = r5.K
            r1 = 1
            r0.f38232e = r1
            r5.invalidateSelf()
        L16:
            boolean r0 = r4.t()
            if (r0 == 0) goto L5f
            int r0 = r4.E
            float r6 = r4.w(r6)
            int r1 = r4.f24678u0
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            int r6 = r5.getIntrinsicHeight()
            int r6 = r6 / 2
            int r0 = r0 - r6
            int r6 = r5.getIntrinsicHeight()
            int r6 = r6 + r0
            boolean r1 = r4.s()
            if (r1 == 0) goto L4d
            int r1 = r4.d()
            int r2 = r4.G
            int r2 = r2 / 2
            int r3 = r4.f24648e0
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r2 = r5.getIntrinsicWidth()
        L4a:
            int r2 = r1 - r2
            goto L88
        L4d:
            int r1 = r4.d()
            int r2 = r4.G
            int r2 = r2 / 2
            int r3 = r4.f24648e0
            int r2 = r2 + r3
            int r2 = r2 + r1
            int r1 = r5.getIntrinsicWidth()
            int r1 = r1 + r2
            goto L88
        L5f:
            int r0 = r4.E
            float r6 = r4.w(r6)
            int r1 = r4.f24678u0
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 / 2
            int r0 = r0 - r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 + r0
            int r1 = r4.d()
            int r2 = r4.G
            int r2 = r2 / 2
            int r3 = r4.f24648e0
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r2 = r5.getIntrinsicHeight()
            goto L4a
        L88:
            android.graphics.Rect r3 = r4.H0
            r3.set(r0, r2, r6, r1)
            boolean r6 = r4.t()
            if (r6 == 0) goto La0
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r3)
            android.graphics.Matrix r0 = r4.K0
            r0.mapRect(r6)
            r6.round(r3)
        La0:
            android.view.ViewGroup r6 = zc.m.e(r4)
            zc.c.b(r6, r4, r3)
            r5.setBounds(r3)
            android.view.ViewGroup r6 = zc.m.e(r4)
            if (r6 != 0) goto Lb2
            r6 = 0
            goto Lb6
        Lb2:
            android.view.ViewOverlay r6 = r6.getOverlay()
        Lb6:
            if (r6 != 0) goto Lb9
            return
        Lb9:
            r6.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.e.y(nd.a, float):void");
    }

    public final void z(ArrayList arrayList) {
        ViewGroup viewGroupE;
        int resourceId;
        ViewGroup viewGroupE2;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f24662m0.size() == arrayList.size() && this.f24662m0.equals(arrayList)) {
            return;
        }
        this.f24662m0 = arrayList;
        this.f24682w0 = true;
        this.f24666o0 = 0;
        D();
        ArrayList arrayList2 = this.f24659l;
        if (arrayList2.size() > this.f24662m0.size()) {
            List<nd.a> listSubList = arrayList2.subList(this.f24662m0.size(), arrayList2.size());
            for (nd.a aVar : listSubList) {
                if (isAttachedToWindow() && (viewGroupE2 = m.e(this)) != null) {
                    viewGroupE2.getOverlay().remove(aVar);
                    viewGroupE2.removeOnLayoutChangeListener(aVar.L);
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f24662m0.size()) {
            Context context = getContext();
            int i4 = this.f24657k;
            nd.a aVar2 = new nd.a(context, i4);
            TypedArray typedArrayG = m.g(aVar2.I, null, ic.a.N, 0, i4, new int[0]);
            Context context2 = aVar2.I;
            aVar2.S = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z3 = typedArrayG.getBoolean(8, true);
            aVar2.R = z3;
            if (z3) {
                n nVarG = aVar2.f23316b.f23298a.g();
                nVarG.f23350k = aVar2.x();
                aVar2.setShapeAppearanceModel(nVarG.a());
            } else {
                aVar2.S = 0;
            }
            CharSequence text = typedArrayG.getText(6);
            boolean zEquals = TextUtils.equals(aVar2.H, text);
            k kVar = aVar2.K;
            if (!zEquals) {
                aVar2.H = text;
                kVar.f38232e = true;
                aVar2.invalidateSelf();
            }
            bd.d dVar = (!typedArrayG.hasValue(0) || (resourceId = typedArrayG.getResourceId(0, 0)) == 0) ? null : new bd.d(context2, resourceId);
            if (dVar != null && typedArrayG.hasValue(1)) {
                dVar.f2134k = jm.a.j(context2, typedArrayG, 1);
            }
            kVar.c(dVar, context2);
            TypedValue typedValueB = ii.a.B(context2, R.attr.colorOnBackground, nd.a.class.getCanonicalName());
            int i10 = typedValueB.resourceId;
            int color = i10 != 0 ? context2.getColor(i10) : typedValueB.data;
            TypedValue typedValueB2 = ii.a.B(context2, android.R.attr.colorBackground, nd.a.class.getCanonicalName());
            int i11 = typedValueB2.resourceId;
            aVar2.o(ColorStateList.valueOf(typedArrayG.getColor(7, v3.a.b(v3.a.d(color, 153), v3.a.d(i11 != 0 ? context2.getColor(i11) : typedValueB2.data, 229)))));
            TypedValue typedValueB3 = ii.a.B(context2, R.attr.colorSurface, nd.a.class.getCanonicalName());
            int i12 = typedValueB3.resourceId;
            aVar2.r(ColorStateList.valueOf(i12 != 0 ? context2.getColor(i12) : typedValueB3.data));
            aVar2.N = typedArrayG.getDimensionPixelSize(2, 0);
            aVar2.O = typedArrayG.getDimensionPixelSize(4, 0);
            aVar2.P = typedArrayG.getDimensionPixelSize(5, 0);
            aVar2.Q = typedArrayG.getDimensionPixelSize(3, 0);
            typedArrayG.recycle();
            arrayList2.add(aVar2);
            if (isAttachedToWindow() && (viewGroupE = m.e(this)) != null) {
                int[] iArr = new int[2];
                viewGroupE.getLocationOnScreen(iArr);
                aVar2.T = iArr[0];
                viewGroupE.getWindowVisibleDisplayFrame(aVar2.M);
                viewGroupE.addOnLayoutChangeListener(aVar2.L);
            }
        }
        int i13 = arrayList2.size() == 1 ? 0 : 1;
        int size = arrayList2.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            nd.a aVar3 = (nd.a) obj;
            aVar3.f23316b.f23306k = i13;
            aVar3.invalidateSelf();
        }
        ArrayList arrayList3 = this.f24661m;
        int size2 = arrayList3.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList3.get(i15);
            i15++;
            g gVar = (g) obj2;
            ArrayList arrayList4 = this.f24662m0;
            int size3 = arrayList4.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList4.get(i16);
                i16++;
                gVar.a(this, ((Float) obj3).floatValue(), false);
            }
        }
        postInvalidate();
    }

    public void setValues(List<Float> list) {
        z(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.M0 = null;
        this.N0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.N0;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            b(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
