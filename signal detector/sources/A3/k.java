package A3;

import A2.C0117e;
import G3.C0152f;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.BaselineLayout;
import e3.AbstractC2303a;
import g3.C2332a;
import g3.C2335d;
import j3.C2561a;

/* loaded from: classes.dex */
public abstract class k extends FrameLayout implements n {

    /* renamed from: x0, reason: collision with root package name */
    public static final int[] f378x0 = {R.attr.state_checked};

    /* renamed from: y0, reason: collision with root package name */
    public static final C0152f f379y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final j f380z0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f381C;

    /* renamed from: D, reason: collision with root package name */
    public final LinearLayout f382D;

    /* renamed from: E, reason: collision with root package name */
    public final LinearLayout f383E;

    /* renamed from: F, reason: collision with root package name */
    public final View f384F;

    /* renamed from: G, reason: collision with root package name */
    public final FrameLayout f385G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f386H;

    /* renamed from: I, reason: collision with root package name */
    public final BaselineLayout f387I;

    /* renamed from: J, reason: collision with root package name */
    public final TextView f388J;

    /* renamed from: K, reason: collision with root package name */
    public final TextView f389K;

    /* renamed from: L, reason: collision with root package name */
    public final BaselineLayout f390L;
    public final TextView M;

    /* renamed from: N, reason: collision with root package name */
    public final TextView f391N;

    /* renamed from: O, reason: collision with root package name */
    public BaselineLayout f392O;

    /* renamed from: P, reason: collision with root package name */
    public int f393P;

    /* renamed from: Q, reason: collision with root package name */
    public int f394Q;

    /* renamed from: R, reason: collision with root package name */
    public int f395R;

    /* renamed from: S, reason: collision with root package name */
    public int f396S;

    /* renamed from: T, reason: collision with root package name */
    public int f397T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f398U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f399V;

    /* renamed from: W, reason: collision with root package name */
    public n.m f400W;

    /* renamed from: a, reason: collision with root package name */
    public boolean f401a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f402a0;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f403b;
    public Drawable b0;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f404c;

    /* renamed from: c0, reason: collision with root package name */
    public Drawable f405c0;

    /* renamed from: d, reason: collision with root package name */
    public int f406d;

    /* renamed from: d0, reason: collision with root package name */
    public ValueAnimator f407d0;

    /* renamed from: e, reason: collision with root package name */
    public int f408e;

    /* renamed from: e0, reason: collision with root package name */
    public C0152f f409e0;

    /* renamed from: f, reason: collision with root package name */
    public int f410f;

    /* renamed from: f0, reason: collision with root package name */
    public float f411f0;

    /* renamed from: g, reason: collision with root package name */
    public int f412g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f413g0;

    /* renamed from: h, reason: collision with root package name */
    public float f414h;

    /* renamed from: h0, reason: collision with root package name */
    public int f415h0;
    public float i;

    /* renamed from: i0, reason: collision with root package name */
    public int f416i0;

    /* renamed from: j, reason: collision with root package name */
    public float f417j;

    /* renamed from: j0, reason: collision with root package name */
    public int f418j0;

    /* renamed from: k, reason: collision with root package name */
    public float f419k;

    /* renamed from: k0, reason: collision with root package name */
    public int f420k0;

    /* renamed from: l, reason: collision with root package name */
    public float f421l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f422l0;

    /* renamed from: m, reason: collision with root package name */
    public float f423m;

    /* renamed from: m0, reason: collision with root package name */
    public int f424m0;

    /* renamed from: n, reason: collision with root package name */
    public int f425n;

    /* renamed from: n0, reason: collision with root package name */
    public int f426n0;

    /* renamed from: o0, reason: collision with root package name */
    public C2332a f427o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f428p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f429q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f430r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f431s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f432t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f433u0;
    public boolean v0;

    /* renamed from: w0, reason: collision with root package name */
    public Rect f434w0;

    static {
        int i = 12;
        f379y0 = new C0152f(i);
        f380z0 = new j(i);
    }

    public k(Context context) throws Resources.NotFoundException {
        super(context);
        this.f401a = false;
        this.f393P = -1;
        this.f394Q = 0;
        this.f395R = 0;
        this.f396S = 0;
        this.f397T = 0;
        this.f399V = false;
        this.f409e0 = f379y0;
        this.f411f0 = 0.0f;
        this.f413g0 = false;
        this.f415h0 = 0;
        this.f416i0 = 0;
        this.f418j0 = -2;
        this.f420k0 = 0;
        this.f422l0 = false;
        this.f424m0 = 0;
        this.f426n0 = 0;
        this.f429q0 = 0;
        this.f430r0 = 49;
        this.f431s0 = false;
        this.f432t0 = false;
        this.f433u0 = false;
        this.v0 = false;
        this.f434w0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f382D = (LinearLayout) findViewById(com.apm.insight.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.apm.insight.R.id.navigation_bar_item_inner_content_container);
        this.f383E = linearLayout;
        this.f384F = findViewById(com.apm.insight.R.id.navigation_bar_item_active_indicator_view);
        this.f385G = (FrameLayout) findViewById(com.apm.insight.R.id.navigation_bar_item_icon_container);
        this.f386H = (ImageView) findViewById(com.apm.insight.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.apm.insight.R.id.navigation_bar_item_labels_group);
        this.f387I = baselineLayout;
        TextView textView = (TextView) findViewById(com.apm.insight.R.id.navigation_bar_item_small_label_view);
        this.f388J = textView;
        TextView textView2 = (TextView) findViewById(com.apm.insight.R.id.navigation_bar_item_large_label_view);
        this.f389K = textView2;
        float dimension = getResources().getDimension(com.apm.insight.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.apm.insight.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext(), null, 0);
        baselineLayout2.f18381a = -1;
        this.f390L = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.f390L.setDuplicateParentStateEnabled(true);
        this.f390L.setMeasurePaddingFromBaseline(this.f433u0);
        TextView textView3 = new TextView(getContext());
        this.M = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.M;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.M.setDuplicateParentStateEnabled(true);
        this.M.setIncludeFontPadding(false);
        this.M.setGravity(16);
        this.M.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.f391N = textView5;
        textView5.setMaxLines(1);
        this.f391N.setEllipsize(truncateAt);
        this.f391N.setDuplicateParentStateEnabled(true);
        this.f391N.setVisibility(4);
        this.f391N.setIncludeFontPadding(false);
        this.f391N.setGravity(16);
        this.f391N.setTextSize(dimension2);
        this.f390L.addView(this.M);
        this.f390L.addView(this.f391N);
        this.f392O = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f406d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f408e = baselineLayout.getPaddingBottom();
        this.f410f = 0;
        this.f412g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.M.setImportantForAccessibility(2);
        this.f391N.setImportantForAccessibility(2);
        setFocusable(true);
        b();
        this.f420k0 = getResources().getDimensionPixelSize(com.apm.insight.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new g(0, (C2561a) this));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i3 = 0; i3 < iIndexOfChild; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof k) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        C2332a c2332a = this.f427o0;
        int minimumWidth = c2332a == null ? 0 : c2332a.getMinimumWidth() - this.f427o0.f20172e.f20211b.f20189K.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f385G.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f386H.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(int i, int i3, int i6, View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i3;
        layoutParams.gravity = i6;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    @Override // n.x
    public final void a(n.m mVar) {
        this.f400W = mVar;
        setCheckable(mVar.isCheckable());
        setChecked(mVar.isChecked());
        setEnabled(mVar.isEnabled());
        setIcon(mVar.getIcon());
        setTitle(mVar.f22110e);
        setId(mVar.f22106a);
        if (!TextUtils.isEmpty(mVar.f22094E)) {
            setContentDescription(mVar.f22094E);
        }
        CharSequence charSequence = !TextUtils.isEmpty(mVar.f22095F) ? mVar.f22095F : mVar.f22110e;
        if (Build.VERSION.SDK_INT > 23) {
            d5.y.r(this, charSequence);
        }
        l();
        this.f401a = true;
    }

    public final void b() {
        float textSize = this.f388J.getTextSize();
        float textSize2 = this.f389K.getTextSize();
        this.f414h = textSize - textSize2;
        this.i = (textSize2 * 1.0f) / textSize;
        this.f417j = (textSize * 1.0f) / textSize2;
        float textSize3 = this.M.getTextSize();
        float textSize4 = this.f391N.getTextSize();
        this.f419k = textSize3 - textSize4;
        this.f421l = (textSize4 * 1.0f) / textSize3;
        this.f423m = (textSize3 * 1.0f) / textSize4;
    }

    public final void c() {
        Drawable rippleDrawable = this.f404c;
        RippleDrawable rippleDrawable2 = null;
        boolean z6 = true;
        if (this.f403b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f413g0 && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(E3.a.c(this.f403b), null, activeIndicatorDrawable);
                z6 = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(E3.a.a(this.f403b), null, null);
            }
        }
        FrameLayout frameLayout = this.f385G;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(rippleDrawable2);
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z6);
        }
    }

    public final void d(float f2, float f5) {
        C0152f c0152f = this.f409e0;
        c0152f.getClass();
        float fA = AbstractC2303a.a(0.4f, 1.0f, f2);
        View view = this.f384F;
        view.setScaleX(fA);
        view.setScaleY(c0152f.e(f2));
        view.setAlpha(AbstractC2303a.b(0.0f, 1.0f, f5 == 0.0f ? 0.8f : 0.0f, f5 == 0.0f ? 1.0f : 0.2f, f2));
        this.f411f0 = f2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f413g0) {
            this.f385G.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i = this.f386H.getLayoutParams().width > 0 ? this.f412g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f390L.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f2, float f5) {
        i(this.f428p0 == 0 ? (int) (this.f406d + f5) : 0, 0, this.f430r0, this.f382D);
        int i = this.f428p0;
        i(i == 0 ? 0 : this.f434w0.top, i == 0 ? 0 : this.f434w0.bottom, i == 0 ? 17 : 8388627, this.f383E);
        int i3 = this.f408e;
        BaselineLayout baselineLayout = this.f387I;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i3);
        this.f392O.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f2);
        textView2.setScaleY(f2);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i = this.f406d;
        i(i, i, this.f428p0 == 0 ? 17 : this.f430r0, this.f382D);
        i(0, 0, 17, this.f383E);
        BaselineLayout baselineLayout = this.f387I;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.f392O.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f384F.getBackground();
    }

    public C2332a getBadge() {
        return this.f427o0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.f390L;
    }

    public int getItemBackgroundResId() {
        return com.apm.insight.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // n.x
    public n.m getItemData() {
        return this.f400W;
    }

    public int getItemDefaultMarginResId() {
        return com.apm.insight.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f393P;
    }

    public BaselineLayout getLabelGroup() {
        return this.f387I;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.f382D;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.f428p0 == 1) {
            LinearLayout linearLayout = this.f383E;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.f387I;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.widget.TextView r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.v0
            if (r0 == 0) goto L8
            r5.setTextAppearance(r6)
            return
        L8:
            r5.setTextAppearance(r6)
            android.content.Context r0 = r5.getContext()
            r1 = 0
            if (r6 != 0) goto L13
            goto L27
        L13:
            int[] r2 = g.AbstractC2327a.f20137y
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r6.getValue(r1, r2)
            r6.recycle()
            if (r3 != 0) goto L29
        L27:
            r6 = r1
            goto L54
        L29:
            int r6 = r2.getComplexUnit()
            r3 = 2
            if (r6 != r3) goto L46
            int r6 = r2.data
            float r6 = android.util.TypedValue.complexToFloat(r6)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)
            goto L54
        L46:
            int r6 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r6 = android.util.TypedValue.complexToDimensionPixelSize(r6, r0)
        L54:
            if (r6 == 0) goto L5a
            float r6 = (float) r6
            r5.setTextSize(r1, r6)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.k.h(android.widget.TextView, int):void");
    }

    public final void j(int i) {
        if (i > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.f415h0, i - (this.f424m0 * 2));
            int iMax = this.f416i0;
            if (this.f428p0 == 1) {
                int measuredWidth = i - (this.f426n0 * 2);
                int i3 = this.f418j0;
                if (i3 != -1) {
                    measuredWidth = i3 == -2 ? this.f382D.getMeasuredWidth() : Math.min(i3, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f420k0, this.f383E.getMeasuredHeight());
            }
            View view = this.f384F;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f422l0 && this.f425n == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void k(TextView textView, int i) throws Resources.NotFoundException {
        if (textView == null) {
            return;
        }
        h(textView, i);
        b();
        textView.setMinimumHeight(com.bumptech.glide.c.z(textView.getContext(), i));
        ColorStateList colorStateList = this.f398U;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.f389K;
        textView2.setTypeface(textView2.getTypeface(), this.f399V ? 1 : 0);
        TextView textView3 = this.f391N;
        textView3.setTypeface(textView3.getTypeface(), this.f399V ? 1 : 0);
    }

    public final void l() {
        n.m mVar = this.f400W;
        if (mVar != null) {
            setVisibility((!mVar.isVisible() || (!this.f431s0 && this.f432t0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        n.m mVar = this.f400W;
        if (mVar != null && mVar.isCheckable() && this.f400W.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f378x0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2332a c2332a = this.f427o0;
        if (c2332a != null && c2332a.isVisible()) {
            n.m mVar = this.f400W;
            CharSequence charSequence = mVar.f22110e;
            if (!TextUtils.isEmpty(mVar.f22094E)) {
                charSequence = this.f400W.f22094E;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f427o0.d()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0117e.w(false, isSelected(), 0, 1, getItemVisiblePosition(), 1).f245b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) S.c.f3433g.f3441a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.apm.insight.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        post(new h(i, 0, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f384F.setBackground(drawable);
        c();
    }

    public void setActiveIndicatorEnabled(boolean z6) {
        this.f413g0 = z6;
        c();
        this.f384F.setVisibility(z6 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.f420k0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f426n0 = i;
        if (this.f428p0 == 1) {
            setPadding(i, 0, i, 0);
        }
        j(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.f434w0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.f418j0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.f416i0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f410f != i) {
            this.f410f = i;
            ((LinearLayout.LayoutParams) this.f387I.getLayoutParams()).topMargin = i;
            if (this.f390L.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f390L.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f424m0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z6) {
        this.f422l0 = z6;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f415h0 = i;
        j(getWidth());
    }

    public void setBadge(C2332a c2332a) {
        C2332a c2332a2 = this.f427o0;
        if (c2332a2 == c2332a) {
            return;
        }
        ImageView imageView = this.f386H;
        if (c2332a2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f427o0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C2332a c2332a3 = this.f427o0;
                if (c2332a3 != null) {
                    if (c2332a3.e() != null) {
                        c2332a3.e().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c2332a3);
                    }
                }
                this.f427o0 = null;
            }
        }
        this.f427o0 = c2332a;
        int i = this.f429q0;
        C2335d c2335d = c2332a.f20172e;
        if (c2335d.f20220l != i) {
            c2335d.f20220l = i;
            c2332a.k();
        }
        if (imageView == null || this.f427o0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C2332a c2332a4 = this.f427o0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c2332a4.setBounds(rect);
        c2332a4.j(imageView, null);
        if (c2332a4.e() != null) {
            c2332a4.e().setForeground(c2332a4);
        } else {
            imageView.getOverlay().add(c2332a4);
        }
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
    }

    public void setChecked(boolean z6) {
        TextView textView = this.f389K;
        setLabelPivots(textView);
        TextView textView2 = this.f388J;
        setLabelPivots(textView2);
        TextView textView3 = this.f391N;
        setLabelPivots(textView3);
        TextView textView4 = this.M;
        setLabelPivots(textView4);
        float f2 = z6 ? 1.0f : 0.0f;
        if (this.f413g0 && this.f401a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.f407d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f407d0 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f411f0, f2);
            this.f407d0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new i(this, f2));
            this.f407d0.setInterpolator(com.bumptech.glide.d.P(getContext(), com.apm.insight.R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19928b));
            this.f407d0.setDuration(com.bumptech.glide.d.O(getContext(), com.apm.insight.R.attr.motionDurationLong2, getResources().getInteger(com.apm.insight.R.integer.material_motion_duration_long_1)));
            this.f407d0.start();
        } else {
            d(f2, f2);
        }
        float f5 = this.f414h;
        float f6 = this.i;
        float f7 = this.f417j;
        if (this.f428p0 == 1) {
            f5 = this.f419k;
            f6 = this.f421l;
            f7 = this.f423m;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.f425n;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        g();
                    }
                } else if (z6) {
                    f(textView, textView2, f6, f5);
                } else {
                    f(textView2, textView, f7, 0.0f);
                }
            } else if (z6) {
                f(textView, textView2, f6, 0.0f);
            } else {
                g();
            }
        } else if (this.f381C) {
            if (z6) {
                f(textView, textView2, f6, 0.0f);
            } else {
                g();
            }
        } else if (z6) {
            f(textView, textView2, f6, f5);
        } else {
            f(textView2, textView, f7, 0.0f);
        }
        refreshDrawableState();
        setSelected(z6);
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        this.f388J.setEnabled(z6);
        this.f389K.setEnabled(z6);
        this.M.setEnabled(z6);
        this.f391N.setEnabled(z6);
        this.f386H.setEnabled(z6);
    }

    @Override // A3.n
    public void setExpanded(boolean z6) {
        this.f431s0 = z6;
        l();
    }

    public void setHorizontalTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.f396S = i;
        if (i == 0) {
            i = this.f394Q;
        }
        k(this.f391N, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f397T = i;
        if (i == 0) {
            i = this.f395R;
        }
        TextView textView = this.M;
        if (textView == null) {
            return;
        }
        h(textView, i);
        b();
        textView.setMinimumHeight(com.bumptech.glide.c.z(textView.getContext(), i));
        ColorStateList colorStateList = this.f398U;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.b0) {
            return;
        }
        this.b0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f405c0 = drawable;
            ColorStateList colorStateList = this.f402a0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f386H.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.f412g != i) {
            this.f412g = i;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f386H;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f402a0 = colorStateList;
        if (this.f400W == null || (drawable = this.f405c0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f405c0.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemGravity(int i) {
        this.f430r0 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        int i3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f428p0 != i) {
            this.f428p0 = i;
            this.f429q0 = 0;
            BaselineLayout baselineLayout = this.f387I;
            this.f392O = baselineLayout;
            LinearLayout linearLayout = this.f383E;
            int i11 = 8;
            if (i == 1) {
                if (this.f390L.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(this.f390L, layoutParams);
                    e();
                }
                Rect rect = this.f434w0;
                int i12 = rect.left;
                int i13 = rect.right;
                int i14 = rect.top;
                i3 = rect.bottom;
                this.f429q0 = 1;
                int i15 = this.f426n0;
                this.f392O = this.f390L;
                i9 = i14;
                i8 = i13;
                i7 = i12;
                i6 = i15;
                i10 = 0;
            } else {
                i3 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 8;
                i11 = 0;
            }
            baselineLayout.setVisibility(i11);
            this.f390L.setVisibility(i10);
            ((FrameLayout.LayoutParams) this.f382D.getLayoutParams()).gravity = this.f430r0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i7;
            layoutParams2.rightMargin = i8;
            layoutParams2.topMargin = i9;
            layoutParams2.bottomMargin = i3;
            setPadding(i6, 0, i6, 0);
            j(getWidth());
            c();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.f408e != i) {
            this.f408e = i;
            n.m mVar = this.f400W;
            if (mVar != null) {
                setChecked(mVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f406d != i) {
            this.f406d = i;
            n.m mVar = this.f400W;
            if (mVar != null) {
                setChecked(mVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.f393P = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f403b = colorStateList;
        c();
    }

    public void setLabelFontScalingEnabled(boolean z6) throws Resources.NotFoundException {
        this.v0 = z6;
        setTextAppearanceActive(this.f394Q);
        setTextAppearanceInactive(this.f395R);
        setHorizontalTextAppearanceActive(this.f396S);
        setHorizontalTextAppearanceInactive(this.f397T);
    }

    public void setLabelMaxLines(int i) {
        TextView textView = this.f388J;
        textView.setMaxLines(i);
        TextView textView2 = this.f389K;
        textView2.setMaxLines(i);
        this.M.setMaxLines(i);
        this.f391N.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f425n != i) {
            this.f425n = i;
            if (this.f422l0 && i == 2) {
                this.f409e0 = f380z0;
            } else {
                this.f409e0 = f379y0;
            }
            j(getWidth());
            n.m mVar = this.f400W;
            if (mVar != null) {
                setChecked(mVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z6) {
        this.f433u0 = z6;
        this.f387I.setMeasurePaddingFromBaseline(z6);
        this.f388J.setIncludeFontPadding(z6);
        this.f389K.setIncludeFontPadding(z6);
        this.f390L.setMeasurePaddingFromBaseline(z6);
        this.M.setIncludeFontPadding(z6);
        this.f391N.setIncludeFontPadding(z6);
        requestLayout();
    }

    @Override // A3.n
    public void setOnlyShowWhenExpanded(boolean z6) {
        this.f432t0 = z6;
        l();
    }

    public void setShifting(boolean z6) {
        if (this.f381C != z6) {
            this.f381C = z6;
            n.m mVar = this.f400W;
            if (mVar != null) {
                setChecked(mVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.f394Q = i;
        k(this.f389K, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z6) throws Resources.NotFoundException {
        this.f399V = z6;
        setTextAppearanceActive(this.f394Q);
        setHorizontalTextAppearanceActive(this.f396S);
        TextView textView = this.f389K;
        textView.setTypeface(textView.getTypeface(), this.f399V ? 1 : 0);
        TextView textView2 = this.f391N;
        textView2.setTypeface(textView2.getTypeface(), this.f399V ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f395R = i;
        TextView textView = this.f388J;
        if (textView == null) {
            return;
        }
        h(textView, i);
        b();
        textView.setMinimumHeight(com.bumptech.glide.c.z(textView.getContext(), i));
        ColorStateList colorStateList = this.f398U;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f398U = colorStateList;
        if (colorStateList != null) {
            this.f388J.setTextColor(colorStateList);
            this.f389K.setTextColor(colorStateList);
            this.M.setTextColor(colorStateList);
            this.f391N.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f388J.setText(charSequence);
        this.f389K.setText(charSequence);
        this.M.setText(charSequence);
        this.f391N.setText(charSequence);
        n.m mVar = this.f400W;
        if (mVar == null || TextUtils.isEmpty(mVar.f22094E)) {
            setContentDescription(charSequence);
        }
        n.m mVar2 = this.f400W;
        if (mVar2 != null && !TextUtils.isEmpty(mVar2.f22095F)) {
            charSequence = this.f400W.f22095F;
        }
        if (Build.VERSION.SDK_INT > 23) {
            d5.y.r(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f404c = drawable;
        c();
    }
}
