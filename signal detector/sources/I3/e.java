package I3;

import A3.C0133b;
import A3.h;
import A3.z;
import B3.x;
import G3.j;
import G3.n;
import R.O;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.material.slider.Slider;
import d3.AbstractC2266a;
import d5.y;
import e3.AbstractC2303a;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public abstract class e extends View {
    public static final /* synthetic */ int i1 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public int f1903A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f1904B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1905C;

    /* renamed from: C0, reason: collision with root package name */
    public float f1906C0;

    /* renamed from: D, reason: collision with root package name */
    public ValueAnimator f1907D;

    /* renamed from: D0, reason: collision with root package name */
    public float[] f1908D0;

    /* renamed from: E, reason: collision with root package name */
    public ValueAnimator f1909E;

    /* renamed from: E0, reason: collision with root package name */
    public int f1910E0;

    /* renamed from: F, reason: collision with root package name */
    public final int f1911F;

    /* renamed from: F0, reason: collision with root package name */
    public int f1912F0;

    /* renamed from: G, reason: collision with root package name */
    public final int f1913G;

    /* renamed from: G0, reason: collision with root package name */
    public int f1914G0;

    /* renamed from: H, reason: collision with root package name */
    public final int f1915H;

    /* renamed from: H0, reason: collision with root package name */
    public int f1916H0;

    /* renamed from: I, reason: collision with root package name */
    public final int f1917I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f1918I0;

    /* renamed from: J, reason: collision with root package name */
    public final int f1919J;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f1920J0;

    /* renamed from: K, reason: collision with root package name */
    public final int f1921K;

    /* renamed from: K0, reason: collision with root package name */
    public ColorStateList f1922K0;

    /* renamed from: L, reason: collision with root package name */
    public final int f1923L;

    /* renamed from: L0, reason: collision with root package name */
    public ColorStateList f1924L0;
    public final int M;

    /* renamed from: M0, reason: collision with root package name */
    public ColorStateList f1925M0;

    /* renamed from: N, reason: collision with root package name */
    public int f1926N;

    /* renamed from: N0, reason: collision with root package name */
    public ColorStateList f1927N0;

    /* renamed from: O, reason: collision with root package name */
    public final int f1928O;

    /* renamed from: O0, reason: collision with root package name */
    public ColorStateList f1929O0;

    /* renamed from: P, reason: collision with root package name */
    public int f1930P;

    /* renamed from: P0, reason: collision with root package name */
    public final Path f1931P0;

    /* renamed from: Q, reason: collision with root package name */
    public int f1932Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final RectF f1933Q0;

    /* renamed from: R, reason: collision with root package name */
    public int f1934R;

    /* renamed from: R0, reason: collision with root package name */
    public final RectF f1935R0;

    /* renamed from: S, reason: collision with root package name */
    public int f1936S;

    /* renamed from: S0, reason: collision with root package name */
    public final RectF f1937S0;

    /* renamed from: T, reason: collision with root package name */
    public int f1938T;

    /* renamed from: T0, reason: collision with root package name */
    public final RectF f1939T0;

    /* renamed from: U, reason: collision with root package name */
    public int f1940U;

    /* renamed from: U0, reason: collision with root package name */
    public final Rect f1941U0;

    /* renamed from: V, reason: collision with root package name */
    public int f1942V;

    /* renamed from: V0, reason: collision with root package name */
    public final RectF f1943V0;

    /* renamed from: W, reason: collision with root package name */
    public int f1944W;

    /* renamed from: W0, reason: collision with root package name */
    public final Rect f1945W0;

    /* renamed from: X0, reason: collision with root package name */
    public final Matrix f1946X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final j f1947Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public Drawable f1948Z0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1949a;

    /* renamed from: a0, reason: collision with root package name */
    public int f1950a0;

    /* renamed from: a1, reason: collision with root package name */
    public List f1951a1;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1952b;
    public int b0;

    /* renamed from: b1, reason: collision with root package name */
    public float f1953b1;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1954c;

    /* renamed from: c0, reason: collision with root package name */
    public int f1955c0;

    /* renamed from: c1, reason: collision with root package name */
    public int f1956c1;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f1957d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1958d0;

    /* renamed from: d1, reason: collision with root package name */
    public final int f1959d1;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f1960e;

    /* renamed from: e0, reason: collision with root package name */
    public int f1961e0;

    /* renamed from: e1, reason: collision with root package name */
    public final a f1962e1;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f1963f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1964f0;

    /* renamed from: f1, reason: collision with root package name */
    public final b f1965f1;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f1966g;

    /* renamed from: g0, reason: collision with root package name */
    public Drawable f1967g0;

    /* renamed from: g1, reason: collision with root package name */
    public final z f1968g1;

    /* renamed from: h, reason: collision with root package name */
    public final c f1969h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1970h0;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f1971h1;
    public final AccessibilityManager i;

    /* renamed from: i0, reason: collision with root package name */
    public Drawable f1972i0;

    /* renamed from: j, reason: collision with root package name */
    public h f1973j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f1974j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f1975k;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f1976k0;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1977l;

    /* renamed from: l0, reason: collision with root package name */
    public Drawable f1978l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1979m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f1980m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1981n;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f1982n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1983o0;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f1984p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1985q0;

    /* renamed from: r0, reason: collision with root package name */
    public final int f1986r0;

    /* renamed from: s0, reason: collision with root package name */
    public final int f1987s0;

    /* renamed from: t0, reason: collision with root package name */
    public float f1988t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f1989u0;
    public MotionEvent v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1990w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f1991x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f1992y0;

    /* renamed from: z0, reason: collision with root package name */
    public ArrayList f1993z0;

    /* JADX WARN: Type inference failed for: r1v11, types: [I3.a] */
    /* JADX WARN: Type inference failed for: r1v12, types: [I3.b] */
    public e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(O3.a.a(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        this.f1977l = new ArrayList();
        this.f1979m = new ArrayList();
        this.f1981n = new ArrayList();
        this.f1905C = false;
        this.f1950a0 = -1;
        this.b0 = -1;
        this.f1964f0 = false;
        this.f1970h0 = false;
        this.f1974j0 = false;
        this.f1980m0 = false;
        this.f1983o0 = false;
        this.f1990w0 = false;
        this.f1993z0 = new ArrayList();
        this.f1903A0 = -1;
        this.f1904B0 = -1;
        this.f1906C0 = 0.0f;
        this.f1918I0 = false;
        this.f1931P0 = new Path();
        this.f1933Q0 = new RectF();
        this.f1935R0 = new RectF();
        this.f1937S0 = new RectF();
        this.f1939T0 = new RectF();
        this.f1941U0 = new Rect();
        this.f1943V0 = new RectF();
        this.f1945W0 = new Rect();
        this.f1946X0 = new Matrix();
        j jVar = new j();
        this.f1947Y0 = jVar;
        this.f1951a1 = Collections.EMPTY_LIST;
        this.f1956c1 = 0;
        final Slider slider = (Slider) this;
        this.f1962e1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: I3.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                slider.C();
            }
        };
        this.f1965f1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: I3.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                slider.C();
            }
        };
        this.f1968g1 = new z(4, slider);
        Context context2 = getContext();
        this.f1971h1 = isShown();
        this.f1949a = new Paint();
        this.f1952b = new Paint();
        Paint paint = new Paint(1);
        this.f1954c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f1957d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f1960e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f1963f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f1966g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f1928O = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f1913G = dimensionPixelOffset;
        this.f1936S = dimensionPixelOffset;
        this.f1915H = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f1917I = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f1919J = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f1921K = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f1923L = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f1987s0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.f1986r0 = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
        AbstractC2993B.a(context2, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = AbstractC2266a.f19738Q;
        AbstractC2993B.b(context2, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        setOrientation(typedArrayObtainStyledAttributes.getInt(2, 0));
        this.f1975k = typedArrayObtainStyledAttributes.getResourceId(10, R.style.Widget_MaterialComponents_Tooltip);
        this.f1991x0 = typedArrayObtainStyledAttributes.getFloat(4, 0.0f);
        this.f1992y0 = typedArrayObtainStyledAttributes.getFloat(5, 1.0f);
        setValues(Float.valueOf(this.f1991x0));
        setCentered(typedArrayObtainStyledAttributes.getBoolean(6, false));
        this.f1906C0 = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.M = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(11, y.p(context2)));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(27);
        int i = zHasValue ? 27 : 29;
        int i3 = zHasValue ? 27 : 28;
        ColorStateList colorStateListN = com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, i);
        setTrackInactiveTintList(colorStateListN == null ? G.c.b(context2, R.color.material_slider_inactive_track_color) : colorStateListN);
        ColorStateList colorStateListN2 = com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, i3);
        setTrackActiveTintList(colorStateListN2 == null ? G.c.b(context2, R.color.material_slider_active_track_color) : colorStateListN2);
        jVar.q(com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 12));
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setThumbStrokeColor(com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 16));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(17, 0.0f));
        ColorStateList colorStateListN3 = com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 7);
        setHaloTintList(colorStateListN3 == null ? G.c.b(context2, R.color.material_slider_halo_color) : colorStateListN3);
        this.f1910E0 = typedArrayObtainStyledAttributes.hasValue(25) ? typedArrayObtainStyledAttributes.getInt(25, -1) : typedArrayObtainStyledAttributes.getBoolean(26, true) ? 0 : 2;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(20);
        int i6 = zHasValue2 ? 20 : 22;
        int i7 = zHasValue2 ? 20 : 21;
        ColorStateList colorStateListN4 = com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, i6);
        setTickInactiveTintList(colorStateListN4 == null ? G.c.b(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListN4);
        ColorStateList colorStateListN5 = com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, i7);
        setTickActiveTintList(colorStateListN5 == null ? G.c.b(context2, R.color.material_slider_active_tick_marks_color) : colorStateListN5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(40, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(30, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(39, 0));
        setTrackIconActiveStart(com.bumptech.glide.c.r(context2, typedArrayObtainStyledAttributes, 34));
        setTrackIconActiveEnd(com.bumptech.glide.c.r(context2, typedArrayObtainStyledAttributes, 33));
        setTrackIconActiveColor(com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 32));
        setTrackIconInactiveStart(com.bumptech.glide.c.r(context2, typedArrayObtainStyledAttributes, 37));
        setTrackIconInactiveEnd(com.bumptech.glide.c.r(context2, typedArrayObtainStyledAttributes, 36));
        setTrackIconInactiveColor(com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 35));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(38, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(13, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(31, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(23, this.f1955c0 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(24, this.f1955c0 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(9, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        jVar.t();
        this.f1911F = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(slider);
        this.f1969h = cVar;
        O.m(this, cVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.i = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1959d1 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.f1959d1 = 120000;
        }
    }

    public final void A(int i, Rect rect) {
        int iU = this.f1936S + ((int) (u(getValues().get(i).floatValue()) * this.f1916H0));
        int iC = c();
        int iMax = Math.max(this.f1938T / 2, this.M / 2);
        int iMax2 = Math.max(this.f1940U / 2, this.M / 2);
        RectF rectF = new RectF(iU - iMax, iC - iMax2, iU + iMax, iC + iMax2);
        if (r()) {
            this.f1946X0.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void B() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fU = (u(((Float) this.f1993z0.get(this.f1904B0)).floatValue()) * this.f1916H0) + this.f1936S;
            int iC = c();
            float f2 = this.f1942V;
            float[] fArr = {fU - f2, iC - r3, fU + f2, iC + r3};
            if (r()) {
                this.f1946X0.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    public final void C() {
        float f2;
        boolean zR = r();
        boolean zQ = q();
        float f5 = 0.5f;
        if (zR && zQ) {
            f2 = 0.5f;
            f5 = -0.2f;
        } else {
            f2 = 1.2f;
            if (zR) {
                f5 = 1.2f;
                f2 = 0.5f;
            }
        }
        ArrayList arrayList = this.f1977l;
        int size = arrayList.size();
        boolean z6 = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            P3.b bVar = (P3.b) obj;
            bVar.f3142k0 = f5;
            bVar.f3143l0 = f2;
            bVar.invalidateSelf();
        }
        int i3 = this.f1932Q;
        if (i3 == 0 || i3 == 1) {
            if (this.f1903A0 == -1 || !isEnabled()) {
                k();
                return;
            } else {
                j();
                return;
            }
        }
        if (i3 == 2) {
            k();
            return;
        }
        if (i3 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f1932Q);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            AbstractC2993B.f(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                if (Build.VERSION.SDK_INT >= 24 ? this.f1971h1 : isShown()) {
                    z6 = true;
                }
            }
            if (z6) {
                j();
                return;
            }
        }
        k();
    }

    public final void D() {
        int i = this.f1944W;
        if (i > 0) {
            int i3 = this.f1938T;
            this.f1950a0 = i3;
            this.b0 = i;
            int iRound = Math.round(i3 * 0.5f);
            int i6 = this.f1938T - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.f1944W - (i6 / 2));
        }
    }

    public final void E() {
        M();
        float f2 = this.f1906C0;
        int iMin = 0;
        if (f2 <= 0.0f) {
            F(0);
            return;
        }
        int i = this.f1910E0;
        if (i == 0) {
            iMin = Math.min((int) (((this.f1992y0 - this.f1991x0) / f2) + 1.0f), (this.f1916H0 / this.f1923L) + 1);
        } else if (i == 1) {
            int i3 = (int) (((this.f1992y0 - this.f1991x0) / f2) + 1.0f);
            if (i3 <= (this.f1916H0 / this.f1923L) + 1) {
                iMin = i3;
            }
        } else if (i != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.f1910E0);
        }
        F(iMin);
    }

    public final void F(int i) {
        if (i == 0) {
            this.f1908D0 = null;
            return;
        }
        float[] fArr = this.f1908D0;
        if (fArr == null || fArr.length != i * 2) {
            this.f1908D0 = new float[i * 2];
        }
        float f2 = this.f1916H0 / (i - 1);
        float fC = c();
        for (int i3 = 0; i3 < i * 2; i3 += 2) {
            float[] fArr2 = this.f1908D0;
            fArr2[i3] = ((i3 / 2.0f) * f2) + this.f1936S;
            fArr2[i3 + 1] = fC;
        }
        if (r()) {
            this.f1946X0.mapPoints(this.f1908D0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(android.graphics.Canvas r18, android.graphics.Paint r19, android.graphics.RectF r20, float r21, int r22) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.e.G(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, float, int):void");
    }

    public final void H() {
        Drawable drawable = this.f1972i0;
        if (drawable != null) {
            if (!this.f1974j0 && this.f1976k0 != null) {
                this.f1972i0 = drawable.mutate();
                this.f1974j0 = true;
            }
            if (this.f1974j0) {
                this.f1972i0.setTintList(this.f1976k0);
            }
        }
    }

    public final void I() {
        Drawable drawable = this.f1967g0;
        if (drawable != null) {
            if (!this.f1970h0 && this.f1976k0 != null) {
                this.f1967g0 = drawable.mutate();
                this.f1970h0 = true;
            }
            if (this.f1970h0) {
                this.f1967g0.setTintList(this.f1976k0);
            }
        }
    }

    public final void J() {
        Drawable drawable = this.f1982n0;
        if (drawable != null) {
            if (!this.f1983o0 && this.f1984p0 != null) {
                this.f1982n0 = drawable.mutate();
                this.f1983o0 = true;
            }
            if (this.f1983o0) {
                this.f1982n0.setTintList(this.f1984p0);
            }
        }
    }

    public final void K() {
        Drawable drawable = this.f1978l0;
        if (drawable != null) {
            if (!this.f1980m0 && this.f1984p0 != null) {
                this.f1978l0 = drawable.mutate();
                this.f1980m0 = true;
            }
            if (this.f1980m0) {
                this.f1978l0.setTintList(this.f1984p0);
            }
        }
    }

    public final void L(boolean z6) {
        int paddingTop;
        int paddingBottom;
        boolean z7;
        if (r()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingBottom + paddingTop;
        int iMax = Math.max(this.f1928O, Math.max(this.f1934R + i, this.f1940U + i));
        boolean z8 = true;
        if (iMax == this.f1930P) {
            z7 = false;
        } else {
            this.f1930P = iMax;
            z7 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.f1938T / 2) - this.f1915H, 0), Math.max((this.f1934R - this.f1917I) / 2, 0)), Math.max(Math.max(this.f1912F0 - this.f1919J, 0), Math.max(this.f1914G0 - this.f1921K, 0))) + this.f1913G;
        if (this.f1936S == iMax2) {
            z8 = false;
        } else {
            this.f1936S = iMax2;
            if (isLaidOut()) {
                this.f1916H0 = Math.max((r() ? getHeight() : getWidth()) - (this.f1936S * 2), 0);
                E();
            }
        }
        if (r()) {
            float fC = c();
            Matrix matrix = this.f1946X0;
            matrix.reset();
            matrix.setRotate(90.0f, fC, fC);
        }
        if (z7 || z6) {
            requestLayout();
        } else if (z8) {
            postInvalidate();
        }
    }

    public final void M() {
        if (this.f1920J0) {
            if (this.f1991x0 >= this.f1992y0) {
                throw new IllegalStateException("valueFrom(" + this.f1991x0 + ") must be smaller than valueTo(" + this.f1992y0 + ")");
            }
            ArrayList arrayList = this.f1993z0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Float f2 = (Float) obj;
                if (f2.floatValue() < this.f1991x0 || f2.floatValue() > this.f1992y0) {
                    throw new IllegalStateException("Slider value(" + f2 + ") must be greater or equal to valueFrom(" + this.f1991x0 + "), and lower or equal to valueTo(" + this.f1992y0 + ")");
                }
                if (this.f1906C0 > 0.0f && !N(f2.floatValue())) {
                    float f5 = this.f1991x0;
                    float f6 = this.f1906C0;
                    throw new IllegalStateException("Value(" + f2 + ") must be equal to valueFrom(" + f5 + ") plus a multiple of stepSize(" + f6 + ") when using stepSize(" + f6 + ")");
                }
            }
            if (this.f1906C0 > 0.0f && !N(this.f1992y0)) {
                throw new IllegalStateException("The stepSize(" + this.f1906C0 + ") must be 0, or a factor of the valueFrom(" + this.f1991x0 + ")-valueTo(" + this.f1992y0 + ") range");
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f7 = this.f1906C0;
            if (f7 > 0.0f && minSeparation > 0.0f) {
                if (this.f1956c1 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f1906C0 + ")");
                }
                if (minSeparation < f7 || !n(minSeparation)) {
                    float f8 = this.f1906C0;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f8 + ") when using stepSize(" + f8 + ")");
                }
            }
            float f9 = this.f1906C0;
            if (f9 != 0.0f) {
                if (((int) f9) != f9) {
                    Log.w("e", "Floating point value used for stepSize(" + f9 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f10 = this.f1991x0;
                if (((int) f10) != f10) {
                    Log.w("e", "Floating point value used for valueFrom(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f11 = this.f1992y0;
                if (((int) f11) != f11) {
                    Log.w("e", "Floating point value used for valueTo(" + f11 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f1920J0 = false;
        }
    }

    public final boolean N(float f2) {
        return n(new BigDecimal(Float.toString(f2)).subtract(new BigDecimal(Float.toString(this.f1991x0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float O(float f2) {
        return (u(f2) * this.f1916H0) + this.f1936S;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f1938T, this.f1940U);
        } else {
            float fMax = Math.max(this.f1938T, this.f1940U) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final void b(Canvas canvas, RectF rectF, Drawable drawable, boolean z6) {
        if (drawable != null) {
            int i = this.f1985q0;
            float f2 = rectF.right - rectF.left;
            int i3 = this.f1986r0;
            float f5 = (i3 * 2) + i;
            RectF rectF2 = this.f1943V0;
            if (f2 >= f5) {
                float f6 = z6 ^ (q() || r()) ? rectF.left + i3 : (rectF.right - i3) - i;
                float f7 = i;
                float fC = c() - (f7 / 2.0f);
                rectF2.set(f6, fC, f6 + f7, f7 + fC);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (r()) {
                this.f1946X0.mapRect(rectF2);
            }
            Rect rect = this.f1945W0;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int c() {
        int i = this.f1930P / 2;
        int i3 = this.f1932Q;
        return i + ((i3 == 1 || i3 == 3) ? ((P3.b) this.f1977l.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator d(boolean z6) {
        int iO;
        TimeInterpolator timeInterpolatorP;
        float fFloatValue = z6 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z6 ? this.f1909E : this.f1907D;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z6 ? 1.0f : 0.0f);
        if (z6) {
            iO = com.bumptech.glide.d.O(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorP = com.bumptech.glide.d.P(getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19931e);
        } else {
            iO = com.bumptech.glide.d.O(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorP = com.bumptech.glide.d.P(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, AbstractC2303a.f19929c);
        }
        valueAnimatorOfFloat.setDuration(iO);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorP);
        valueAnimatorOfFloat.addUpdateListener(new C0133b(i, this));
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f1969h.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1949a.setColor(m(this.f1929O0));
        this.f1952b.setColor(m(this.f1927N0));
        this.f1960e.setColor(m(this.f1925M0));
        this.f1963f.setColor(m(this.f1924L0));
        this.f1966g.setColor(m(this.f1925M0));
        ArrayList arrayList = this.f1977l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            P3.b bVar = (P3.b) obj;
            if (bVar.isStateful()) {
                bVar.setState(getDrawableState());
            }
        }
        j jVar = this.f1947Y0;
        if (jVar.isStateful()) {
            jVar.setState(getDrawableState());
        }
        int iM = m(this.f1922K0);
        Paint paint = this.f1957d;
        paint.setColor(iM);
        paint.setAlpha(63);
    }

    public final void e(float f2, float f5, float f6, float f7, Canvas canvas, RectF rectF, int i) {
        if (f5 - f2 > getTrackCornerSize() - this.f1944W) {
            rectF.set(f2, f6, f5, f7);
        } else {
            rectF.setEmpty();
        }
        G(canvas, this.f1949a, rectF, getTrackCornerSize(), i);
    }

    public final void f(Canvas canvas, float f2, float f5) {
        ArrayList arrayList = this.f1993z0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            float fO = O(((Float) obj).floatValue());
            float f6 = (this.f1938T / 2.0f) + this.f1944W;
            if (f2 >= fO - f6 && f2 <= fO + f6) {
                return;
            }
        }
        boolean zR = r();
        Paint paint = this.f1966g;
        if (zR) {
            canvas.drawPoint(f5, f2, paint);
        } else {
            canvas.drawPoint(f2, f5, paint);
        }
    }

    public final void g(Canvas canvas, int i, int i3, float f2, Drawable drawable) {
        canvas.save();
        if (r()) {
            canvas.concat(this.f1946X0);
        }
        canvas.translate((this.f1936S + ((int) (u(f2) * i))) - (drawable.getBounds().width() / 2.0f), i3 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f1969h.f4115k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public abstract int getTrackCornerSize();

    public List<Float> getValues() {
        return new ArrayList(this.f1993z0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r6, int r7, android.graphics.Canvas r8, android.graphics.Paint r9) {
        /*
            r5 = this;
        L0:
            if (r6 >= r7) goto L72
            boolean r0 = r5.r()
            if (r0 == 0) goto Lf
            float[] r0 = r5.f1908D0
            int r1 = r6 + 1
            r0 = r0[r1]
            goto L13
        Lf:
            float[] r0 = r5.f1908D0
            r0 = r0[r6]
        L13:
            int r1 = r5.f1944W
            float r1 = (float) r1
            int r2 = r5.f1938T
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r2 = r2 + r1
            java.util.ArrayList r1 = r5.f1993z0
            java.util.Iterator r1 = r1.iterator()
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r1 = r1.next()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r5.O(r1)
            float r4 = r1 - r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L43
            float r1 = r1 + r2
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L43
            goto L6f
        L43:
            boolean r1 = r5.f1964f0
            if (r1 == 0) goto L64
            int r1 = r5.f1944W
            float r1 = (float) r1
            int r2 = r5.f1938T
            float r2 = (float) r2
            float r2 = r2 / r3
            float r2 = r2 + r1
            int r1 = r5.f1916H0
            int r4 = r5.f1936S
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
            float[] r0 = r5.f1908D0
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
        throw new UnsupportedOperationException("Method not decompiled: I3.e.h(int, int, android.graphics.Canvas, android.graphics.Paint):void");
    }

    public final void i(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.f1967g0 == null && this.f1972i0 == null && this.f1978l0 == null && this.f1982n0 == null) {
            return;
        }
        if (this.f1993z0.size() > 1) {
            Log.w("e", "Track icons can only be used when only 1 thumb is present.");
        }
        b(canvas, rectF, this.f1967g0, true);
        b(canvas, rectF2, this.f1978l0, true);
        b(canvas, rectF, this.f1972i0, false);
        b(canvas, rectF2, this.f1982n0, false);
    }

    public final void j() {
        if (!this.f1905C) {
            this.f1905C = true;
            ValueAnimator valueAnimatorD = d(true);
            this.f1907D = valueAnimatorD;
            this.f1909E = null;
            valueAnimatorD.start();
        }
        ArrayList arrayList = this.f1977l;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.f1993z0.size() && it.hasNext(); i++) {
            if (i != this.f1904B0) {
                w((P3.b) it.next(), ((Float) this.f1993z0.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f1993z0.size())));
        }
        w((P3.b) it.next(), ((Float) this.f1993z0.get(this.f1904B0)).floatValue());
    }

    public final void k() {
        if (this.f1905C) {
            this.f1905C = false;
            ValueAnimator valueAnimatorD = d(false);
            this.f1909E = valueAnimatorD;
            this.f1907D = null;
            valueAnimatorD.addListener(new x(2, this));
            this.f1909E.start();
        }
    }

    public final float[] l() {
        float fFloatValue = ((Float) this.f1993z0.get(0)).floatValue();
        ArrayList arrayList = this.f1993z0;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f1993z0.size() == 1) {
            fFloatValue = this.f1991x0;
        }
        float fU = u(fFloatValue);
        float fU2 = u(fFloatValue2);
        if (this.f1964f0) {
            float fMin = Math.min(0.5f, fU2);
            fU2 = Math.max(0.5f, fU2);
            fU = fMin;
        }
        return (this.f1964f0 || !(q() || r())) ? new float[]{fU, fU2} : new float[]{fU2, fU};
    }

    public final int m(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean n(double d6) {
        double dDoubleValue = new BigDecimal(Double.toString(d6)).divide(new BigDecimal(Float.toString(this.f1906C0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean o(MotionEvent motionEvent) {
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

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1971h1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.f1962e1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1965f1);
        ArrayList arrayList = this.f1977l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            P3.b bVar = (P3.b) obj;
            ViewGroup viewGroupF = AbstractC2993B.f(this);
            if (viewGroupF == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                int[] iArr = new int[2];
                viewGroupF.getLocationOnScreen(iArr);
                bVar.f3139h0 = iArr[0];
                viewGroupF.getWindowVisibleDisplayFrame(bVar.f3133a0);
                viewGroupF.addOnLayoutChangeListener(bVar.f3132Z);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        h hVar = this.f1973j;
        if (hVar != null) {
            removeCallbacks(hVar);
        }
        int i = 0;
        this.f1905C = false;
        ArrayList arrayList = this.f1977l;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            P3.b bVar = (P3.b) obj;
            ViewGroup viewGroupF = AbstractC2993B.f(this);
            if (viewGroupF != null) {
                viewGroupF.getOverlay().remove(bVar);
                viewGroupF.removeOnLayoutChangeListener(bVar.f3132Z);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f1962e1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f1965f1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.e.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z6, int i, Rect rect) {
        super.onFocusChanged(z6, i, rect);
        c cVar = this.f1969h;
        if (!z6) {
            this.f1903A0 = -1;
            cVar.j(this.f1904B0);
            return;
        }
        if (i == 1) {
            s(Integer.MAX_VALUE);
        } else if (i == 2) {
            s(LinearLayoutManager.INVALID_OFFSET);
        } else if (i == 17) {
            t(Integer.MAX_VALUE);
        } else if (i == 66) {
            t(LinearLayoutManager.INVALID_OFFSET);
        }
        cVar.w(this.f1904B0);
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
        throw new UnsupportedOperationException("Method not decompiled: I3.e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f1918I0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        int i6 = this.f1932Q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1930P + ((i6 == 1 || i6 == 3) ? ((P3.b) this.f1977l.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (r()) {
            super.onMeasure(iMakeMeasureSpec, i3);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f1991x0 = dVar.f1898a;
        this.f1992y0 = dVar.f1899b;
        x(dVar.f1900c);
        this.f1906C0 = dVar.f1901d;
        if (dVar.f1902e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1898a = this.f1991x0;
        dVar.f1899b = this.f1992y0;
        dVar.f1900c = new ArrayList(this.f1993z0);
        dVar.f1901d = this.f1906C0;
        dVar.f1902e = hasFocus();
        return dVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        if (r()) {
            i = i3;
        }
        this.f1916H0 = Math.max(i - (this.f1936S * 2), 0);
        E();
        B();
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
        throw new UnsupportedOperationException("Method not decompiled: I3.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z6) {
        super.onVisibilityAggregated(z6);
        this.f1971h1 = z6;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupF = AbstractC2993B.f(this);
            ViewOverlay overlay = viewGroupF == null ? null : viewGroupF.getOverlay();
            if (overlay == null) {
                return;
            }
            ArrayList arrayList = this.f1977l;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                overlay.remove((P3.b) obj);
            }
        }
    }

    public final boolean p(MotionEvent motionEvent) {
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

    public final boolean q() {
        return getLayoutDirection() == 1;
    }

    public final boolean r() {
        return this.f1926N == 1;
    }

    public final boolean s(int i) {
        int i3 = this.f1904B0;
        long j6 = i3 + i;
        long size = this.f1993z0.size() - 1;
        if (j6 < 0) {
            j6 = 0;
        } else if (j6 > size) {
            j6 = size;
        }
        int i6 = (int) j6;
        this.f1904B0 = i6;
        if (i6 == i3) {
            return false;
        }
        if (this.f1903A0 != -1) {
            this.f1903A0 = i6;
        }
        B();
        postInvalidate();
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.f1903A0 = i;
    }

    public abstract void setCentered(boolean z6);

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        setLayerType(z6 ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public abstract void setOrientation(int i);

    public void setSeparationUnit(int i) {
        this.f1956c1 = i;
        this.f1920J0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f2);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f2);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackCornerSize(int i);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackIconActiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconActiveEnd(Drawable drawable);

    public abstract void setTrackIconActiveStart(Drawable drawable);

    public abstract void setTrackIconInactiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconInactiveEnd(Drawable drawable);

    public abstract void setTrackIconInactiveStart(Drawable drawable);

    public abstract void setTrackIconSize(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        x(arrayList);
    }

    public final void t(int i) {
        if (q() || r()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        s(i);
    }

    public final float u(float f2) {
        float f5 = this.f1991x0;
        float f6 = (f2 - f5) / (this.f1992y0 - f5);
        return (q() || r()) ? 1.0f - f6 : f6;
    }

    public final void v() {
        Iterator it = this.f1981n.iterator();
        if (it.hasNext()) {
            throw A.f.f(it);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(P3.b r6, float r7) {
        /*
            r5 = this;
            int r0 = (int) r7
            float r0 = (float) r0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L9
            java.lang.String r0 = "%.0f"
            goto Lb
        L9:
            java.lang.String r0 = "%.2f"
        Lb:
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.lang.CharSequence r1 = r6.f3128V
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 != 0) goto L2a
            r6.f3128V = r0
            x3.y r0 = r6.f3131Y
            r0.f24180e = r2
            r6.invalidateSelf()
        L2a:
            boolean r0 = r5.r()
            int r1 = r5.f1987s0
            if (r0 == 0) goto L72
            int r0 = r5.f1936S
            float r7 = r5.u(r7)
            int r2 = r5.f1916H0
            float r2 = (float) r2
            float r7 = r7 * r2
            int r7 = (int) r7
            int r0 = r0 + r7
            int r7 = r6.getIntrinsicHeight()
            int r7 = r7 / 2
            int r0 = r0 - r7
            int r7 = r6.getIntrinsicHeight()
            int r7 = r7 + r0
            boolean r2 = r5.q()
            if (r2 == 0) goto L61
            int r2 = r5.c()
            int r3 = r5.f1940U
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = r6.getIntrinsicWidth()
        L5e:
            int r1 = r2 - r1
            goto L99
        L61:
            int r2 = r5.c()
            int r3 = r5.f1940U
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r1 = r3 + r2
            int r2 = r6.getIntrinsicWidth()
            int r2 = r2 + r1
            goto L99
        L72:
            int r0 = r5.f1936S
            float r7 = r5.u(r7)
            int r2 = r5.f1916H0
            float r2 = (float) r2
            float r7 = r7 * r2
            int r7 = (int) r7
            int r0 = r0 + r7
            int r7 = r6.getIntrinsicWidth()
            int r7 = r7 / 2
            int r0 = r0 - r7
            int r7 = r6.getIntrinsicWidth()
            int r7 = r7 + r0
            int r2 = r5.c()
            int r3 = r5.f1940U
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = r6.getIntrinsicHeight()
            goto L5e
        L99:
            android.graphics.Rect r3 = r5.f1941U0
            r3.set(r0, r1, r7, r2)
            boolean r7 = r5.r()
            if (r7 == 0) goto Lb1
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r3)
            android.graphics.Matrix r0 = r5.f1946X0
            r0.mapRect(r7)
            r7.round(r3)
        Lb1:
            android.view.ViewGroup r7 = x3.AbstractC2993B.f(r5)
            x3.AbstractC2998c.c(r7, r5, r3)
            r6.setBounds(r3)
            android.view.ViewGroup r7 = x3.AbstractC2993B.f(r5)
            if (r7 != 0) goto Lc3
            r7 = 0
            goto Lc7
        Lc3:
            android.view.ViewOverlay r7 = r7.getOverlay()
        Lc7:
            if (r7 != 0) goto Lca
            return
        Lca:
            r7.add(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.e.w(P3.b, float):void");
    }

    public final void x(ArrayList arrayList) {
        ViewGroup viewGroupF;
        int resourceId;
        ViewGroup viewGroupF2;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f1993z0.size() == arrayList.size() && this.f1993z0.equals(arrayList)) {
            return;
        }
        this.f1993z0 = arrayList;
        this.f1920J0 = true;
        this.f1904B0 = 0;
        B();
        ArrayList arrayList2 = this.f1977l;
        if (arrayList2.size() > this.f1993z0.size()) {
            List<P3.b> listSubList = arrayList2.subList(this.f1993z0.size(), arrayList2.size());
            for (P3.b bVar : listSubList) {
                if (isAttachedToWindow() && (viewGroupF2 = AbstractC2993B.f(this)) != null) {
                    viewGroupF2.getOverlay().remove(bVar);
                    viewGroupF2.removeOnLayoutChangeListener(bVar.f3132Z);
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f1993z0.size()) {
            Context context = getContext();
            int i = this.f1975k;
            P3.b bVar2 = new P3.b(context, i);
            TypedArray typedArrayI = AbstractC2993B.i(bVar2.f3129W, null, AbstractC2266a.f19746Y, 0, i, new int[0]);
            Context context2 = bVar2.f3129W;
            bVar2.f3138g0 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z6 = typedArrayI.getBoolean(8, true);
            bVar2.f3137f0 = z6;
            if (z6) {
                n nVarG = bVar2.f1597b.f1560a.g();
                nVarG.f1621k = bVar2.B();
                bVar2.setShapeAppearanceModel(nVarG.a());
            } else {
                bVar2.f3138g0 = 0;
            }
            CharSequence text = typedArrayI.getText(6);
            boolean zEquals = TextUtils.equals(bVar2.f3128V, text);
            x3.y yVar = bVar2.f3131Y;
            if (!zEquals) {
                bVar2.f3128V = text;
                yVar.f24180e = true;
                bVar2.invalidateSelf();
            }
            D3.e eVar = (!typedArrayI.hasValue(0) || (resourceId = typedArrayI.getResourceId(0, 0)) == 0) ? null : new D3.e(context2, resourceId);
            if (eVar != null && typedArrayI.hasValue(1)) {
                eVar.f1276k = com.bumptech.glide.c.n(context2, typedArrayI, 1);
            }
            yVar.c(eVar, context2);
            TypedValue typedValueQ = y.q(context2, R.attr.colorOnBackground, P3.b.class.getCanonicalName());
            int i3 = typedValueQ.resourceId;
            int color = i3 != 0 ? context2.getColor(i3) : typedValueQ.data;
            TypedValue typedValueQ2 = y.q(context2, android.R.attr.colorBackground, P3.b.class.getCanonicalName());
            int i6 = typedValueQ2.resourceId;
            bVar2.q(ColorStateList.valueOf(typedArrayI.getColor(7, J.a.c(J.a.e(color, 153), J.a.e(i6 != 0 ? context2.getColor(i6) : typedValueQ2.data, 229)))));
            TypedValue typedValueQ3 = y.q(context2, R.attr.colorSurface, P3.b.class.getCanonicalName());
            int i7 = typedValueQ3.resourceId;
            bVar2.v(ColorStateList.valueOf(i7 != 0 ? context2.getColor(i7) : typedValueQ3.data));
            bVar2.b0 = typedArrayI.getDimensionPixelSize(2, 0);
            bVar2.f3134c0 = typedArrayI.getDimensionPixelSize(4, 0);
            bVar2.f3135d0 = typedArrayI.getDimensionPixelSize(5, 0);
            bVar2.f3136e0 = typedArrayI.getDimensionPixelSize(3, 0);
            typedArrayI.recycle();
            arrayList2.add(bVar2);
            if (isAttachedToWindow() && (viewGroupF = AbstractC2993B.f(this)) != null) {
                int[] iArr = new int[2];
                viewGroupF.getLocationOnScreen(iArr);
                bVar2.f3139h0 = iArr[0];
                viewGroupF.getWindowVisibleDisplayFrame(bVar2.f3133a0);
                viewGroupF.addOnLayoutChangeListener(bVar2.f3132Z);
            }
        }
        int i8 = arrayList2.size() == 1 ? 0 : 1;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            P3.b bVar3 = (P3.b) obj;
            bVar3.f1597b.f1569k = i8;
            bVar3.invalidateSelf();
        }
        ArrayList arrayList3 = this.f1979m;
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            R4.a aVar = (R4.a) obj2;
            ArrayList arrayList4 = this.f1993z0;
            int size3 = arrayList4.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList4.get(i11);
                i11++;
                aVar.a(this, ((Float) obj3).floatValue());
            }
        }
        postInvalidate();
    }

    public final boolean y(int i, float f2) {
        this.f1904B0 = i;
        int i3 = 0;
        if (Math.abs(f2 - ((Float) this.f1993z0.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f1956c1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f5 = this.f1991x0;
                minSeparation = AbstractC1135f5.h(f5, this.f1992y0, (minSeparation - this.f1936S) / this.f1916H0, f5);
            }
        }
        if (q() || r()) {
            minSeparation = -minSeparation;
        }
        int i6 = i + 1;
        int i7 = i - 1;
        this.f1993z0.set(i, Float.valueOf(y.e(f2, i7 < 0 ? this.f1991x0 : minSeparation + ((Float) this.f1993z0.get(i7)).floatValue(), i6 >= this.f1993z0.size() ? this.f1992y0 : ((Float) this.f1993z0.get(i6)).floatValue() - minSeparation)));
        ArrayList arrayList = this.f1979m;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((R4.a) obj).a(this, ((Float) this.f1993z0.get(i)).floatValue());
        }
        AccessibilityManager accessibilityManager = this.i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.f1973j;
            if (runnable == null) {
                this.f1973j = new h(this);
            } else {
                removeCallbacks(runnable);
            }
            h hVar = this.f1973j;
            hVar.f374b = i;
            postDelayed(hVar, 200L);
        }
        return true;
    }

    public final void z() {
        double dRound;
        float f2 = this.f1953b1;
        float f5 = this.f1906C0;
        if (f5 > 0.0f) {
            dRound = Math.round(f2 * r1) / ((int) ((this.f1992y0 - this.f1991x0) / f5));
        } else {
            dRound = f2;
        }
        if (q() || r()) {
            dRound = 1.0d - dRound;
        }
        float f6 = this.f1992y0;
        y(this.f1903A0, (float) ((dRound * (f6 - r1)) + this.f1991x0));
    }

    public void setValues(List<Float> list) {
        x(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f1948Z0 = null;
        this.f1951a1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f1951a1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
