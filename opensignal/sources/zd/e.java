package zd;

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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bc.m;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.internal.BaselineLayout;
import io.sentry.android.core.e0;
import ir.f0;
import o.o;

/* loaded from: classes.dex */
public abstract class e extends FrameLayout implements h {
    public static final int[] F0 = {R.attr.state_checked};
    public static final z4.f G0;
    public static final d H0;
    public boolean A0;
    public int B;
    public boolean B0;
    public boolean C0;
    public float D;
    public boolean D0;
    public float E;
    public Rect E0;
    public float F;
    public float G;
    public float H;
    public float I;
    public int J;
    public boolean K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final View N;
    public final FrameLayout O;
    public final ImageView P;
    public final BaselineLayout Q;
    public final TextView R;
    public final TextView S;
    public final BaselineLayout T;
    public final TextView U;
    public final TextView V;
    public BaselineLayout W;

    /* renamed from: a, reason: collision with root package name */
    public boolean f27293a;

    /* renamed from: a0, reason: collision with root package name */
    public int f27294a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f27295b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f27296c0;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f27297d;

    /* renamed from: d0, reason: collision with root package name */
    public int f27298d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f27299e0;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f27300f0;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f27301g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f27302g0;

    /* renamed from: h0, reason: collision with root package name */
    public o f27303h0;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f27304i0;

    /* renamed from: j0, reason: collision with root package name */
    public Drawable f27305j0;

    /* renamed from: k0, reason: collision with root package name */
    public Drawable f27306k0;

    /* renamed from: l0, reason: collision with root package name */
    public ValueAnimator f27307l0;

    /* renamed from: m0, reason: collision with root package name */
    public z4.f f27308m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f27309n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f27310o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f27311p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f27312q0;

    /* renamed from: r, reason: collision with root package name */
    public int f27313r;

    /* renamed from: r0, reason: collision with root package name */
    public int f27314r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f27315s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f27316t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f27317u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f27318v0;

    /* renamed from: w0, reason: collision with root package name */
    public hd.a f27319w0;

    /* renamed from: x, reason: collision with root package name */
    public int f27320x;

    /* renamed from: x0, reason: collision with root package name */
    public int f27321x0;

    /* renamed from: y, reason: collision with root package name */
    public int f27322y;

    /* renamed from: y0, reason: collision with root package name */
    public int f27323y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f27324z0;

    static {
        int i10 = 17;
        G0 = new z4.f(i10);
        H0 = new d(i10);
    }

    public e(Context context) throws Resources.NotFoundException {
        super(context);
        this.f27293a = false;
        this.f27294a0 = -1;
        this.f27295b0 = 0;
        this.f27296c0 = 0;
        this.f27298d0 = 0;
        this.f27299e0 = 0;
        this.f27302g0 = false;
        this.f27308m0 = G0;
        this.f27309n0 = 0.0f;
        this.f27310o0 = false;
        this.f27311p0 = 0;
        this.f27312q0 = 0;
        this.f27314r0 = -2;
        this.f27315s0 = 0;
        this.f27316t0 = false;
        this.f27317u0 = 0;
        this.f27318v0 = 0;
        this.f27323y0 = 0;
        this.f27324z0 = 49;
        this.A0 = false;
        this.B0 = false;
        this.C0 = false;
        this.D0 = false;
        this.E0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.L = (LinearLayout) findViewById(ed.f.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(ed.f.navigation_bar_item_inner_content_container);
        this.M = linearLayout;
        this.N = findViewById(ed.f.navigation_bar_item_active_indicator_view);
        this.O = (FrameLayout) findViewById(ed.f.navigation_bar_item_icon_container);
        this.P = (ImageView) findViewById(ed.f.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(ed.f.navigation_bar_item_labels_group);
        this.Q = baselineLayout;
        TextView textView = (TextView) findViewById(ed.f.navigation_bar_item_small_label_view);
        this.R = textView;
        TextView textView2 = (TextView) findViewById(ed.f.navigation_bar_item_large_label_view);
        this.S = textView2;
        float dimension = getResources().getDimension(ed.d.default_navigation_text_size);
        float dimension2 = getResources().getDimension(ed.d.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext(), null, 0);
        baselineLayout2.f5655a = -1;
        this.T = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.T.setDuplicateParentStateEnabled(true);
        this.T.setMeasurePaddingFromBaseline(this.C0);
        TextView textView3 = new TextView(getContext());
        this.U = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.U;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.U.setDuplicateParentStateEnabled(true);
        this.U.setIncludeFontPadding(false);
        this.U.setGravity(16);
        this.U.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.V = textView5;
        textView5.setMaxLines(1);
        this.V.setEllipsize(truncateAt);
        this.V.setDuplicateParentStateEnabled(true);
        this.V.setVisibility(4);
        this.V.setIncludeFontPadding(false);
        this.V.setGravity(16);
        this.V.setTextSize(dimension2);
        this.T.addView(this.U);
        this.T.addView(this.V);
        this.W = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f27313r = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f27320x = baselineLayout.getPaddingBottom();
        this.f27322y = 0;
        this.B = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.U.setImportantForAccessibility(2);
        this.V.setImportantForAccessibility(2);
        setFocusable(true);
        b();
        this.f27315s0 = getResources().getDimensionPixelSize(ed.d.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new od.a(1, (kd.a) this));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof e) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconWidth() {
        hd.a aVar = this.f27319w0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f27319w0.f10624x.f10627b.S.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.O.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.P.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(View view, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    @Override // o.z
    public final void a(o oVar) {
        this.f27303h0 = oVar;
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setIcon(oVar.getIcon());
        setTitle(oVar.f18642e);
        setId(oVar.f18638a);
        if (!TextUtils.isEmpty(oVar.f18652q)) {
            setContentDescription(oVar.f18652q);
        }
        y3.N(this, !TextUtils.isEmpty(oVar.f18653r) ? oVar.f18653r : oVar.f18642e);
        l();
        this.f27293a = true;
    }

    public final void b() {
        float textSize = this.R.getTextSize();
        float textSize2 = this.S.getTextSize();
        this.D = textSize - textSize2;
        this.E = (textSize2 * 1.0f) / textSize;
        this.F = (textSize * 1.0f) / textSize2;
        float textSize3 = this.U.getTextSize();
        float textSize4 = this.V.getTextSize();
        this.G = textSize3 - textSize4;
        this.H = (textSize4 * 1.0f) / textSize3;
        this.I = (textSize3 * 1.0f) / textSize4;
    }

    public final void c() {
        Drawable rippleDrawable = this.f27301g;
        RippleDrawable rippleDrawable2 = null;
        boolean z10 = true;
        if (this.f27297d != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f27310o0 && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(ce.a.c(this.f27297d), null, activeIndicatorDrawable);
                z10 = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(ce.a.a(this.f27297d), null, null);
            }
        }
        FrameLayout frameLayout = this.O;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(rippleDrawable2);
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    public final void d(float f10, float f11) {
        z4.f fVar = this.f27308m0;
        fVar.getClass();
        float fA = fd.a.a(0.4f, 1.0f, f10);
        View view = this.N;
        view.setScaleX(fA);
        view.setScaleY(fVar.a(f10));
        view.setAlpha(fd.a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10));
        this.f27309n0 = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27310o0) {
            this.O.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i10 = this.P.getLayoutParams().width > 0 ? this.B : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.T.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i10 : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f10, float f11) {
        i(this.L, this.f27321x0 == 0 ? (int) (this.f27313r + f11) : 0, 0, this.f27324z0);
        int i10 = this.f27321x0;
        i(this.M, i10 == 0 ? 0 : this.E0.top, i10 == 0 ? 0 : this.E0.bottom, i10 == 0 ? 17 : 8388627);
        int i11 = this.f27320x;
        BaselineLayout baselineLayout = this.Q;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i11);
        this.W.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f10);
        textView2.setScaleY(f10);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i10 = this.f27313r;
        i(this.L, i10, i10, this.f27321x0 == 0 ? 17 : this.f27324z0);
        i(this.M, 0, 0, 17);
        BaselineLayout baselineLayout = this.Q;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.W.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.N.getBackground();
    }

    public hd.a getBadge() {
        return this.f27319w0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.T;
    }

    public int getItemBackgroundResId() {
        return ed.e.mtrl_navigation_bar_item_background;
    }

    @Override // o.z
    public o getItemData() {
        return this.f27303h0;
    }

    public int getItemDefaultMarginResId() {
        return ed.d.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f27294a0;
    }

    public BaselineLayout getLabelGroup() {
        return this.Q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.f27321x0 == 1) {
            LinearLayout linearLayout = this.M;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.Q;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.widget.TextView r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.D0
            if (r0 == 0) goto L8
            r5.setTextAppearance(r6)
            return
        L8:
            r5.setTextAppearance(r6)
            android.content.Context r0 = r5.getContext()
            r1 = 0
            if (r6 != 0) goto L13
            goto L29
        L13:
            int[] r2 = h.j.TextAppearance
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            int r3 = h.j.TextAppearance_android_textSize
            boolean r3 = r6.getValue(r3, r2)
            r6.recycle()
            if (r3 != 0) goto L2b
        L29:
            r6 = r1
            goto L56
        L2b:
            int r6 = r2.getComplexUnit()
            r3 = 2
            if (r6 != r3) goto L48
            int r6 = r2.data
            float r6 = android.util.TypedValue.complexToFloat(r6)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)
            goto L56
        L48:
            int r6 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r6 = android.util.TypedValue.complexToDimensionPixelSize(r6, r0)
        L56:
            if (r6 == 0) goto L5c
            float r6 = (float) r6
            r5.setTextSize(r1, r6)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.e.h(android.widget.TextView, int):void");
    }

    public final void j(int i10) {
        if (i10 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.f27311p0, i10 - (this.f27317u0 * 2));
            int iMax = this.f27312q0;
            if (this.f27321x0 == 1) {
                int measuredWidth = i10 - (this.f27318v0 * 2);
                int i11 = this.f27314r0;
                if (i11 != -1) {
                    measuredWidth = i11 == -2 ? this.L.getMeasuredWidth() : Math.min(i11, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f27315s0, this.M.getMeasuredHeight());
            }
            View view = this.N;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f27316t0 && this.J == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void k(TextView textView, int i10) throws Resources.NotFoundException {
        if (textView == null) {
            return;
        }
        h(textView, i10);
        b();
        textView.setMinimumHeight(xu.l.z(textView.getContext(), i10));
        ColorStateList colorStateList = this.f27300f0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.S;
        textView2.setTypeface(textView2.getTypeface(), this.f27302g0 ? 1 : 0);
        TextView textView3 = this.V;
        textView3.setTypeface(textView3.getTypeface(), this.f27302g0 ? 1 : 0);
    }

    public final void l() {
        o oVar = this.f27303h0;
        if (oVar != null) {
            setVisibility((!oVar.isVisible() || (!this.A0 && this.B0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        o oVar = this.f27303h0;
        if (oVar != null && oVar.isCheckable() && this.f27303h0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hd.a aVar = this.f27319w0;
        if (aVar != null && aVar.isVisible()) {
            o oVar = this.f27303h0;
            CharSequence charSequence = oVar.f18642e;
            if (!TextUtils.isEmpty(oVar.f18652q)) {
                charSequence = this.f27303h0.f18652q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f27319w0.d()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) g.a.a(isSelected(), 0, 1, getItemVisiblePosition(), 1).f9121a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) v3.b.f23825e.f23833a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(ed.j.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new m(i10, 5, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.N.setBackground(drawable);
        c();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f27310o0 = z10;
        c();
        this.N.setVisibility(z10 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i10) {
        this.f27315s0 = i10;
        j(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f27318v0 = i10;
        if (this.f27321x0 == 1) {
            setPadding(i10, 0, i10, 0);
        }
        j(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.E0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i10) {
        this.f27314r0 = i10;
        j(getWidth());
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f27312q0 = i10;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f27322y != i10) {
            this.f27322y = i10;
            ((LinearLayout.LayoutParams) this.Q.getLayoutParams()).topMargin = i10;
            if (this.T.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.T.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
                if (getLayoutDirection() == 1) {
                    i10 = 0;
                }
                layoutParams.leftMargin = i10;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f27317u0 = i10;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f27316t0 = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f27311p0 = i10;
        j(getWidth());
    }

    public void setBadge(hd.a aVar) {
        hd.a aVar2 = this.f27319w0;
        if (aVar2 == aVar) {
            return;
        }
        ImageView imageView = this.P;
        if (aVar2 != null && imageView != null) {
            e0.p("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f27319w0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                hd.a aVar3 = this.f27319w0;
                if (aVar3 != null) {
                    if (aVar3.e() != null) {
                        aVar3.e().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.f27319w0 = null;
            }
        }
        this.f27319w0 = aVar;
        int i10 = this.f27323y0;
        hd.b bVar = aVar.f10624x;
        if (bVar.f10635l != i10) {
            bVar.f10635l = i10;
            aVar.k();
        }
        if (imageView == null || this.f27319w0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        hd.a aVar4 = this.f27319w0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar4.setBounds(rect);
        aVar4.j(imageView, null);
        if (aVar4.e() != null) {
            aVar4.e().setForeground(aVar4);
        } else {
            imageView.getOverlay().add(aVar4);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        TextView textView = this.S;
        setLabelPivots(textView);
        TextView textView2 = this.R;
        setLabelPivots(textView2);
        TextView textView3 = this.V;
        setLabelPivots(textView3);
        TextView textView4 = this.U;
        setLabelPivots(textView4);
        float f10 = z10 ? 1.0f : 0.0f;
        if (this.f27310o0 && this.f27293a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.f27307l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f27307l0 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f27309n0, f10);
            this.f27307l0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new c(this, f10));
            this.f27307l0.setInterpolator(f0.V(getContext(), ed.b.motionEasingEmphasizedInterpolator, fd.a.f8823b));
            this.f27307l0.setDuration(f0.U(getContext(), ed.b.motionDurationLong2, getResources().getInteger(ed.g.material_motion_duration_long_1)));
            this.f27307l0.start();
        } else {
            d(f10, f10);
        }
        float f11 = this.D;
        float f12 = this.E;
        float f13 = this.F;
        if (this.f27321x0 == 1) {
            f11 = this.G;
            f12 = this.H;
            f13 = this.I;
            textView = textView3;
            textView2 = textView4;
        }
        int i10 = this.J;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        g();
                    }
                } else if (z10) {
                    f(textView, textView2, f12, f11);
                } else {
                    f(textView2, textView, f13, 0.0f);
                }
            } else if (z10) {
                f(textView, textView2, f12, 0.0f);
            } else {
                g();
            }
        } else if (this.K) {
            if (z10) {
                f(textView, textView2, f12, 0.0f);
            } else {
                g();
            }
        } else if (z10) {
            f(textView, textView2, f12, f11);
        } else {
            f(textView2, textView, f13, 0.0f);
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.R.setEnabled(z10);
        this.S.setEnabled(z10);
        this.U.setEnabled(z10);
        this.V.setEnabled(z10);
        this.P.setEnabled(z10);
    }

    @Override // zd.h
    public void setExpanded(boolean z10) {
        this.A0 = z10;
        l();
    }

    public void setHorizontalTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.f27298d0 = i10;
        if (i10 == 0) {
            i10 = this.f27295b0;
        }
        k(this.V, i10);
    }

    public void setHorizontalTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.f27299e0 = i10;
        if (i10 == 0) {
            i10 = this.f27296c0;
        }
        TextView textView = this.U;
        if (textView == null) {
            return;
        }
        h(textView, i10);
        b();
        textView.setMinimumHeight(xu.l.z(textView.getContext(), i10));
        ColorStateList colorStateList = this.f27300f0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f27305j0) {
            return;
        }
        this.f27305j0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f27306k0 = drawable;
            ColorStateList colorStateList = this.f27304i0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.P.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        if (this.B != i10) {
            this.B = i10;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i10) {
        ImageView imageView = this.P;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f27304i0 = colorStateList;
        if (this.f27303h0 == null || (drawable = this.f27306k0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f27306k0.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : getContext().getDrawable(i10));
    }

    public void setItemGravity(int i10) {
        this.f27324z0 = i10;
        requestLayout();
    }

    public void setItemIconGravity(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.f27321x0 != i10) {
            this.f27321x0 = i10;
            this.f27323y0 = 0;
            BaselineLayout baselineLayout = this.Q;
            this.W = baselineLayout;
            LinearLayout linearLayout = this.M;
            int i17 = 8;
            if (i10 == 1) {
                if (this.T.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(this.T, layoutParams);
                    e();
                }
                Rect rect = this.E0;
                int i18 = rect.left;
                int i19 = rect.right;
                int i20 = rect.top;
                i11 = rect.bottom;
                this.f27323y0 = 1;
                int i21 = this.f27318v0;
                this.W = this.T;
                i15 = i20;
                i14 = i19;
                i13 = i18;
                i12 = i21;
                i16 = 0;
            } else {
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                i16 = 8;
                i17 = 0;
            }
            baselineLayout.setVisibility(i17);
            this.T.setVisibility(i16);
            ((FrameLayout.LayoutParams) this.L.getLayoutParams()).gravity = this.f27324z0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i14;
            layoutParams2.topMargin = i15;
            layoutParams2.bottomMargin = i11;
            setPadding(i12, 0, i12, 0);
            j(getWidth());
            c();
        }
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f27320x != i10) {
            this.f27320x = i10;
            o oVar = this.f27303h0;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f27313r != i10) {
            this.f27313r = i10;
            o oVar = this.f27303h0;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i10) {
        this.f27294a0 = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f27297d = colorStateList;
        c();
    }

    public void setLabelFontScalingEnabled(boolean z10) throws Resources.NotFoundException {
        this.D0 = z10;
        setTextAppearanceActive(this.f27295b0);
        setTextAppearanceInactive(this.f27296c0);
        setHorizontalTextAppearanceActive(this.f27298d0);
        setHorizontalTextAppearanceInactive(this.f27299e0);
    }

    public void setLabelMaxLines(int i10) {
        TextView textView = this.R;
        textView.setMaxLines(i10);
        TextView textView2 = this.S;
        textView2.setMaxLines(i10);
        this.U.setMaxLines(i10);
        this.V.setMaxLines(i10);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i10 > 1) {
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

    public void setLabelVisibilityMode(int i10) {
        if (this.J != i10) {
            this.J = i10;
            if (this.f27316t0 && i10 == 2) {
                this.f27308m0 = H0;
            } else {
                this.f27308m0 = G0;
            }
            j(getWidth());
            o oVar = this.f27303h0;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.C0 = z10;
        this.Q.setMeasurePaddingFromBaseline(z10);
        this.R.setIncludeFontPadding(z10);
        this.S.setIncludeFontPadding(z10);
        this.T.setMeasurePaddingFromBaseline(z10);
        this.U.setIncludeFontPadding(z10);
        this.V.setIncludeFontPadding(z10);
        requestLayout();
    }

    @Override // zd.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.B0 = z10;
        l();
    }

    public void setShifting(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            o oVar = this.f27303h0;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.f27295b0 = i10;
        k(this.S, i10);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) throws Resources.NotFoundException {
        this.f27302g0 = z10;
        setTextAppearanceActive(this.f27295b0);
        setHorizontalTextAppearanceActive(this.f27298d0);
        TextView textView = this.S;
        textView.setTypeface(textView.getTypeface(), this.f27302g0 ? 1 : 0);
        TextView textView2 = this.V;
        textView2.setTypeface(textView2.getTypeface(), this.f27302g0 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.f27296c0 = i10;
        TextView textView = this.R;
        if (textView == null) {
            return;
        }
        h(textView, i10);
        b();
        textView.setMinimumHeight(xu.l.z(textView.getContext(), i10));
        ColorStateList colorStateList = this.f27300f0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f27300f0 = colorStateList;
        if (colorStateList != null) {
            this.R.setTextColor(colorStateList);
            this.S.setTextColor(colorStateList);
            this.U.setTextColor(colorStateList);
            this.V.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.R.setText(charSequence);
        this.S.setText(charSequence);
        this.U.setText(charSequence);
        this.V.setText(charSequence);
        o oVar = this.f27303h0;
        if (oVar == null || TextUtils.isEmpty(oVar.f18652q)) {
            setContentDescription(charSequence);
        }
        o oVar2 = this.f27303h0;
        if (oVar2 != null && !TextUtils.isEmpty(oVar2.f18653r)) {
            charSequence = this.f27303h0.f18653r;
        }
        y3.N(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f27301g = drawable;
        c();
    }
}
