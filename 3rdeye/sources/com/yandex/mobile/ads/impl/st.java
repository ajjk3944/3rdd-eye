package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.aa1;
import com.yandex.mobile.ads.impl.ti0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class st extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    private ImageView f33205A;

    /* renamed from: B, reason: collision with root package name */
    private LinearLayout f33206B;

    /* renamed from: C, reason: collision with root package name */
    private CustomizableMediaView f33207C;

    /* renamed from: D, reason: collision with root package name */
    private LinearLayout f33208D;

    /* renamed from: E, reason: collision with root package name */
    private kt f33209E;

    /* renamed from: F, reason: collision with root package name */
    private b91 f33210F;

    /* renamed from: G, reason: collision with root package name */
    private r81 f33211G;

    /* renamed from: H, reason: collision with root package name */
    private t51 f33212H;

    /* renamed from: I, reason: collision with root package name */
    private h61 f33213I;

    /* renamed from: J, reason: collision with root package name */
    private final b f33214J;

    /* renamed from: a, reason: collision with root package name */
    private final j10 f33215a;

    /* renamed from: b, reason: collision with root package name */
    private final tt f33216b;

    /* renamed from: c, reason: collision with root package name */
    private final mp1 f33217c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33218d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33219e;

    /* renamed from: f, reason: collision with root package name */
    private final int f33220f;

    /* renamed from: g, reason: collision with root package name */
    private yt f33221g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f33222h;
    private TextView i;

    /* renamed from: j, reason: collision with root package name */
    private Button f33223j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f33224k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f33225l;

    /* renamed from: m, reason: collision with root package name */
    private final ImageView f33226m;

    /* renamed from: n, reason: collision with root package name */
    private s12 f33227n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f33228o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f33229p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f33230q;

    /* renamed from: r, reason: collision with root package name */
    private jn1 f33231r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f33232s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f33233t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f33234u;

    /* renamed from: v, reason: collision with root package name */
    private LinearLayout f33235v;

    /* renamed from: w, reason: collision with root package name */
    private FrameLayout f33236w;

    /* renamed from: x, reason: collision with root package name */
    private LinearLayout f33237x;

    /* renamed from: y, reason: collision with root package name */
    private LinearLayout f33238y;

    /* renamed from: z, reason: collision with root package name */
    private LinearLayout f33239z;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33240a;

        static {
            int[] iArr = new int[aa1.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                aa1.a aVar = aa1.a.f24579b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                aa1.a aVar2 = aa1.a.f24579b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33240a = iArr;
        }
    }

    public static final class b implements nt {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.nt
        public final void onFinishLoadingImages() {
            h61 h61Var = st.this.f33213I;
            if (h61Var != null) {
                h61Var.a(this);
            }
            t51 t51Var = st.this.f33212H;
            if (t51Var != null) {
                t51Var.a();
            } else {
                kotlin.jvm.internal.l.l("nativeAdImagesAnimator");
                throw null;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public st(Context context, AttributeSet attributeSet, int i, yt defaultTemplateAppearance, g92 varioqubAdapterProvider, zd appAdAnalyticsActivator) {
        this(context, attributeSet, i, defaultTemplateAppearance, varioqubAdapterProvider, appAdAnalyticsActivator, null, null, null, 448, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(defaultTemplateAppearance, "defaultTemplateAppearance");
        kotlin.jvm.internal.l.f(varioqubAdapterProvider, "varioqubAdapterProvider");
        kotlin.jvm.internal.l.f(appAdAnalyticsActivator, "appAdAnalyticsActivator");
    }

    private final void a() {
        float borderWidth = this.f33221g.getBannerAppearance().getBorderWidth();
        j10 j10Var = this.f33215a;
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        j10Var.getClass();
        int iA = j10.a(context, borderWidth);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f33221g.getBannerAppearance().getBackgroundColor());
        paint.setStyle(Paint.Style.FILL);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new RectShape());
        Paint paint2 = shapeDrawable2.getPaint();
        paint2.setColor(this.f33221g.getBannerAppearance().getBorderColor());
        paint2.setStrokeWidth(iA * 2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        setBackground(new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2}));
        setPadding(iA, iA, iA, iA);
        x91 contentPadding = this.f33221g.getBannerAppearance().getContentPadding();
        if (contentPadding != null) {
            j10 j10Var2 = this.f33215a;
            Context context2 = getContext();
            kotlin.jvm.internal.l.e(context2, "getContext(...)");
            float left = contentPadding.getLeft();
            j10Var2.getClass();
            int iA2 = j10.a(context2, left);
            j10 j10Var3 = this.f33215a;
            Context context3 = getContext();
            kotlin.jvm.internal.l.e(context3, "getContext(...)");
            float right = contentPadding.getRight();
            j10Var3.getClass();
            int iA3 = j10.a(context3, right);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(iA2, this.f33219e, iA3, this.f33218d);
            LinearLayout linearLayout = this.f33237x;
            if (linearLayout == null) {
                kotlin.jvm.internal.l.l("topContainer");
                throw null;
            }
            linearLayout.setLayoutParams(layoutParams);
            LinearLayout linearLayout2 = this.f33237x;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.l.l("topContainer");
                throw null;
            }
            linearLayout2.invalidate();
        }
        x91 contentPadding2 = this.f33221g.getBannerAppearance().getContentPadding();
        if (contentPadding2 != null) {
            j10 j10Var4 = this.f33215a;
            Context context4 = getContext();
            kotlin.jvm.internal.l.e(context4, "getContext(...)");
            float left2 = contentPadding2.getLeft();
            j10Var4.getClass();
            int iA4 = j10.a(context4, left2);
            j10 j10Var5 = this.f33215a;
            Context context5 = getContext();
            kotlin.jvm.internal.l.e(context5, "getContext(...)");
            float right2 = contentPadding2.getRight();
            j10Var5.getClass();
            int iA5 = j10.a(context5, right2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.leftMargin = iA4;
            layoutParams2.rightMargin = iA5;
            layoutParams2.bottomMargin = this.f33218d;
            LinearLayout linearLayout3 = this.f33238y;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.l.l("centerContainer");
                throw null;
            }
            linearLayout3.setLayoutParams(layoutParams2);
            LinearLayout linearLayout4 = this.f33238y;
            if (linearLayout4 == null) {
                kotlin.jvm.internal.l.l("centerContainer");
                throw null;
            }
            linearLayout4.invalidate();
        }
        x91 contentPadding3 = this.f33221g.getBannerAppearance().getContentPadding();
        if (contentPadding3 != null) {
            j10 j10Var6 = this.f33215a;
            Context context6 = getContext();
            kotlin.jvm.internal.l.e(context6, "getContext(...)");
            float left3 = contentPadding3.getLeft();
            j10Var6.getClass();
            int iA6 = j10.a(context6, left3);
            j10 j10Var7 = this.f33215a;
            Context context7 = getContext();
            kotlin.jvm.internal.l.e(context7, "getContext(...)");
            float right3 = contentPadding3.getRight();
            j10Var7.getClass();
            int iA7 = j10.a(context7, right3);
            TextView warningView = getWarningView();
            int i = this.f33218d;
            warningView.setPadding(iA6, i, iA7, i);
            getWarningView().invalidate();
        }
        ba1 textAppearance = this.f33221g.getCallToActionAppearance().getTextAppearance();
        if (textAppearance != null) {
            getCallToActionView().setTextColor(textAppearance.getTextColor());
        }
        ba1 textAppearance2 = this.f33221g.getCallToActionAppearance().getTextAppearance();
        if (textAppearance2 != null) {
            getCallToActionView().setTextSize(textAppearance2.getTextSize());
            Button callToActionView = getCallToActionView();
            ba1 textAppearance3 = this.f33221g.getCallToActionAppearance().getTextAppearance();
            callToActionView.setTypeface(Typeface.create(textAppearance3 != null ? textAppearance3.getFontFamilyName() : null, textAppearance2.getFontStyle()));
        }
        j10 j10Var8 = this.f33215a;
        Context context8 = getContext();
        kotlin.jvm.internal.l.e(context8, "getContext(...)");
        j10Var8.getClass();
        float fA = j10.a(context8, 5.0f);
        float[] fArr = new float[8];
        Arrays.fill(fArr, fA);
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, fArr);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(roundRectShape);
        shapeDrawable3.getPaint().setColor(this.f33221g.getCallToActionAppearance().getPressedColor());
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(roundRectShape);
        shapeDrawable4.getPaint().setColor(this.f33221g.getCallToActionAppearance().getNormalColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, shapeDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable3);
        stateListDrawable.addState(new int[0], shapeDrawable4);
        j10 j10Var9 = this.f33215a;
        Context context9 = getContext();
        kotlin.jvm.internal.l.e(context9, "getContext(...)");
        float borderWidth2 = this.f33221g.getCallToActionAppearance().getBorderWidth();
        j10Var9.getClass();
        int iA8 = j10.a(context9, borderWidth2);
        ShapeDrawable shapeDrawable5 = new ShapeDrawable();
        shapeDrawable5.setShape(roundRectShape);
        Paint paint3 = shapeDrawable5.getPaint();
        paint3.setColor(this.f33221g.getCallToActionAppearance().getBorderColor());
        paint3.setStrokeWidth(iA8);
        paint3.setStyle(style);
        getCallToActionView().setBackground(new LayerDrawable(new Drawable[]{stateListDrawable, shapeDrawable5}));
        jn1 jn1Var = this.f33231r;
        if (jn1Var == null) {
            kotlin.jvm.internal.l.l("_ratingView");
            throw null;
        }
        Drawable progressDrawable = jn1Var.getProgressDrawable();
        kotlin.jvm.internal.l.d(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
        Drawable drawable = layerDrawable.getDrawable(2);
        int progressStarColor = this.f33221g.getRatingAppearance().getProgressStarColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawable.setColorFilter(progressStarColor, mode);
        layerDrawable.getDrawable(1).setColorFilter(this.f33221g.getRatingAppearance().getBackgroundStarColor(), mode);
        layerDrawable.getDrawable(0).setColorFilter(this.f33221g.getRatingAppearance().getBackgroundStarColor(), mode);
        getAgeView().setTypeface(Typeface.create(this.f33221g.getAgeAppearance().getFontFamilyName(), this.f33221g.getAgeAppearance().getFontStyle()));
        getAgeView().setTextColor(this.f33221g.getAgeAppearance().getTextColor());
        getAgeView().setTextSize(2, this.f33221g.getAgeAppearance().getTextSize());
        getBodyView().setTypeface(Typeface.create(this.f33221g.getBodyAppearance().getFontFamilyName(), this.f33221g.getBodyAppearance().getFontStyle()));
        getBodyView().setTextColor(this.f33221g.getBodyAppearance().getTextColor());
        getBodyView().setTextSize(2, this.f33221g.getBodyAppearance().getTextSize());
        getDomainView().setTypeface(Typeface.create(this.f33221g.getDomainAppearance().getFontFamilyName(), this.f33221g.getDomainAppearance().getFontStyle()));
        getDomainView().setTextColor(this.f33221g.getDomainAppearance().getTextColor());
        getDomainView().setTextSize(2, this.f33221g.getDomainAppearance().getTextSize());
        getReviewCountView().setTypeface(Typeface.create(this.f33221g.getReviewCountAppearance().getFontFamilyName(), this.f33221g.getReviewCountAppearance().getFontStyle()));
        getReviewCountView().setTextColor(this.f33221g.getReviewCountAppearance().getTextColor());
        getReviewCountView().setTextSize(2, this.f33221g.getReviewCountAppearance().getTextSize());
        s12 s12Var = this.f33227n;
        if (s12Var == null) {
            kotlin.jvm.internal.l.l("_sponsoredView");
            throw null;
        }
        s12Var.setTypeface(Typeface.create(this.f33221g.getSponsoredAppearance().getFontFamilyName(), this.f33221g.getSponsoredAppearance().getFontStyle()));
        s12 s12Var2 = this.f33227n;
        if (s12Var2 == null) {
            kotlin.jvm.internal.l.l("_sponsoredView");
            throw null;
        }
        s12Var2.setTextColor(this.f33221g.getSponsoredAppearance().getTextColor());
        s12 s12Var3 = this.f33227n;
        if (s12Var3 == null) {
            kotlin.jvm.internal.l.l("_sponsoredView");
            throw null;
        }
        s12Var3.setTextSize(2, this.f33221g.getSponsoredAppearance().getTextSize());
        getTitleView().setTypeface(Typeface.create(this.f33221g.getTitleAppearance().getFontFamilyName(), this.f33221g.getTitleAppearance().getFontStyle()));
        getTitleView().setTextColor(this.f33221g.getTitleAppearance().getTextColor());
        getTitleView().setTextSize(2, this.f33221g.getTitleAppearance().getTextSize());
        getWarningView().setTypeface(Typeface.create(this.f33221g.getWarningAppearance().getFontFamilyName(), this.f33221g.getWarningAppearance().getFontStyle()));
        getWarningView().setTextColor(this.f33221g.getWarningAppearance().getTextColor());
        getWarningView().setTextSize(2, this.f33221g.getWarningAppearance().getTextSize());
        invalidate();
        requestLayout();
    }

    private final void b() {
        this.f33234u = c();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f33237x = linearLayout2;
        linearLayout2.setOrientation(0);
        LinearLayout linearLayout3 = this.f33237x;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.l.l("topContainer");
            throw null;
        }
        linearLayout3.setGravity(17);
        LinearLayout linearLayout4 = this.f33237x;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.l.l("topContainer");
            throw null;
        }
        linearLayout4.setWeightSum(4.0f);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        linearLayout5.setGravity(17);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        s12 s12Var = new s12(context);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        s12Var.setEllipsize(truncateAt);
        s12Var.setMaxLines(1);
        s12Var.setGravity(17);
        j10 j10Var = this.f33215a;
        Context context2 = getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        j10Var.getClass();
        s12Var.setPadding(0, 0, 0, j10.a(context2, 4.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        s12Var.setLayoutParams(layoutParams);
        this.f33227n = s12Var;
        linearLayout5.addView(s12Var);
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(getContext());
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(8388611);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.rightMargin = this.f33218d;
        textView.setLayoutParams(layoutParams2);
        this.f33222h = textView;
        linearLayout6.addView(getAgeView());
        LinearLayout linearLayout7 = this.f33237x;
        if (linearLayout7 == null) {
            kotlin.jvm.internal.l.l("topContainer");
            throw null;
        }
        linearLayout7.addView(linearLayout6);
        LinearLayout linearLayout8 = this.f33237x;
        if (linearLayout8 == null) {
            kotlin.jvm.internal.l.l("topContainer");
            throw null;
        }
        linearLayout8.addView(linearLayout5);
        LinearLayout linearLayout9 = this.f33237x;
        if (linearLayout9 == null) {
            kotlin.jvm.internal.l.l("topContainer");
            throw null;
        }
        linearLayout9.addView(view);
        LinearLayout linearLayout10 = this.f33237x;
        if (linearLayout10 == null) {
            kotlin.jvm.internal.l.l("topContainer");
            throw null;
        }
        LinearLayout linearLayout11 = new LinearLayout(getContext());
        this.f33238y = linearLayout11;
        linearLayout11.setOrientation(0);
        LinearLayout linearLayout12 = this.f33238y;
        if (linearLayout12 == null) {
            kotlin.jvm.internal.l.l("centerContainer");
            throw null;
        }
        linearLayout12.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = this.f33218d;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(layoutParams3);
        this.f33230q = c();
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        this.f33233t = imageView;
        frameLayout.addView(getIconView());
        frameLayout.addView(this.f33226m);
        frameLayout.addView(getFaviconView());
        LinearLayout linearLayout13 = new LinearLayout(getContext());
        linearLayout13.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout13.setOrientation(1);
        TextView textView2 = new TextView(getContext());
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(2);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f33228o = textView2;
        TextView textView3 = new TextView(getContext());
        textView3.setEllipsize(truncateAt);
        textView3.setMaxLines(3);
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.i = textView3;
        TextView textView4 = new TextView(getContext());
        textView4.setEllipsize(truncateAt);
        textView4.setMaxLines(1);
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f33224k = textView4;
        linearLayout13.addView(getTitleView());
        linearLayout13.addView(getBodyView());
        linearLayout13.addView(getDomainView());
        LinearLayout linearLayout14 = new LinearLayout(getContext());
        this.f33239z = linearLayout14;
        linearLayout14.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = this.f33219e;
        LinearLayout linearLayout15 = this.f33239z;
        if (linearLayout15 == null) {
            kotlin.jvm.internal.l.l("callToActionContainer");
            throw null;
        }
        linearLayout15.setLayoutParams(layoutParams4);
        LinearLayout linearLayout16 = new LinearLayout(getContext());
        linearLayout16.setOrientation(1);
        linearLayout16.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Context context3 = getContext();
        kotlin.jvm.internal.l.e(context3, "getContext(...)");
        jn1 jn1Var = new jn1(context3, null, R.attr.ratingBarStyleSmall);
        jn1Var.setNumStars(5);
        jn1Var.setStepSize(0.5f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.rightMargin = this.f33219e;
        jn1Var.setLayoutParams(layoutParams5);
        this.f33231r = jn1Var;
        TextView textView5 = new TextView(getContext());
        textView5.setEllipsize(truncateAt);
        textView5.setMaxLines(1);
        textView5.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f33232s = textView5;
        jn1 jn1Var2 = this.f33231r;
        if (jn1Var2 == null) {
            kotlin.jvm.internal.l.l("_ratingView");
            throw null;
        }
        linearLayout16.addView(jn1Var2);
        linearLayout16.addView(getReviewCountView());
        LinearLayout linearLayout17 = new LinearLayout(getContext());
        linearLayout17.setOrientation(0);
        linearLayout17.setGravity(5);
        linearLayout17.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(getContext(), null, R.attr.borderlessButtonStyle);
        button.setEllipsize(truncateAt);
        button.setMaxLines(1);
        button.setTransformationMethod(null);
        j10 j10Var2 = this.f33215a;
        Context context4 = getContext();
        kotlin.jvm.internal.l.e(context4, "getContext(...)");
        j10Var2.getClass();
        int iA = j10.a(context4, 26.0f);
        button.setMinimumHeight(iA);
        button.setMinHeight(iA);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f33223j = button;
        linearLayout17.addView(getCallToActionView());
        LinearLayout linearLayout18 = this.f33239z;
        if (linearLayout18 == null) {
            kotlin.jvm.internal.l.l("callToActionContainer");
            throw null;
        }
        linearLayout18.addView(linearLayout16);
        LinearLayout linearLayout19 = this.f33239z;
        if (linearLayout19 == null) {
            kotlin.jvm.internal.l.l("callToActionContainer");
            throw null;
        }
        linearLayout19.addView(linearLayout17);
        LinearLayout linearLayout20 = this.f33239z;
        if (linearLayout20 == null) {
            kotlin.jvm.internal.l.l("callToActionContainer");
            throw null;
        }
        linearLayout13.addView(linearLayout20);
        LinearLayout linearLayout21 = this.f33238y;
        if (linearLayout21 == null) {
            kotlin.jvm.internal.l.l("centerContainer");
            throw null;
        }
        linearLayout21.addView(frameLayout);
        LinearLayout linearLayout22 = this.f33238y;
        if (linearLayout22 == null) {
            kotlin.jvm.internal.l.l("centerContainer");
            throw null;
        }
        linearLayout22.addView(linearLayout13);
        LinearLayout linearLayout23 = this.f33238y;
        if (linearLayout23 == null) {
            kotlin.jvm.internal.l.l("centerContainer");
            throw null;
        }
        LinearLayout linearLayout24 = new LinearLayout(getContext());
        linearLayout24.setOrientation(0);
        linearLayout24.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f33206B = linearLayout24;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setAdjustViewBounds(true);
        imageView2.setScaleType(scaleType);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f33205A = imageView2;
        LinearLayout linearLayout25 = this.f33206B;
        if (linearLayout25 == null) {
            kotlin.jvm.internal.l.l("largeImageContainer");
            throw null;
        }
        linearLayout25.addView(imageView2);
        LinearLayout linearLayout26 = this.f33206B;
        if (linearLayout26 == null) {
            kotlin.jvm.internal.l.l("largeImageContainer");
            throw null;
        }
        LinearLayout linearLayout27 = new LinearLayout(getContext());
        linearLayout27.setOrientation(0);
        linearLayout27.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f33208D = linearLayout27;
        Context context5 = getContext();
        kotlin.jvm.internal.l.e(context5, "getContext(...)");
        CustomizableMediaView customizableMediaView = new CustomizableMediaView(context5);
        customizableMediaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f33207C = customizableMediaView;
        LinearLayout linearLayout28 = this.f33208D;
        if (linearLayout28 == null) {
            kotlin.jvm.internal.l.l("mediaContainer");
            throw null;
        }
        linearLayout28.addView(getMediaView());
        LinearLayout linearLayout29 = this.f33208D;
        if (linearLayout29 == null) {
            kotlin.jvm.internal.l.l("mediaContainer");
            throw null;
        }
        TextView textView6 = new TextView(getContext());
        textView6.setEllipsize(truncateAt);
        this.f33229p = textView6;
        TextView warningView = getWarningView();
        linearLayout.addView(linearLayout10);
        linearLayout.addView(linearLayout23);
        linearLayout.addView(linearLayout26);
        linearLayout.addView(linearLayout29);
        linearLayout.addView(warningView);
        this.f33235v = linearLayout;
        x91 contentPadding = this.f33221g.getBannerAppearance().getContentPadding();
        if (contentPadding != null) {
            j10 j10Var3 = this.f33215a;
            Context context6 = getContext();
            kotlin.jvm.internal.l.e(context6, "getContext(...)");
            float right = contentPadding.getRight();
            j10Var3.getClass();
            int iA2 = j10.a(context6, right) - this.f33219e;
            Context context7 = getContext();
            kotlin.jvm.internal.l.e(context7, "getContext(...)");
            ya0 ya0Var = new ya0(context7);
            Context context8 = getContext();
            kotlin.jvm.internal.l.e(context8, "getContext(...)");
            this.f33236w = new qa0(context8).a();
            this.f33225l = ya0Var.a(iA2, this.f33218d);
            FrameLayout frameLayout2 = this.f33236w;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.l.l("feedbackContainer");
                throw null;
            }
            frameLayout2.addView(getFeedbackView());
            FrameLayout frameLayout3 = this.f33236w;
            if (frameLayout3 == null) {
                kotlin.jvm.internal.l.l("feedbackContainer");
                throw null;
            }
            frameLayout3.setVisibility(8);
        }
        ImageView imageView3 = this.f33234u;
        if (imageView3 == null) {
            kotlin.jvm.internal.l.l("adFoxView");
            throw null;
        }
        addView(imageView3, new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout30 = this.f33235v;
        if (linearLayout30 == null) {
            kotlin.jvm.internal.l.l("mainContainer");
            throw null;
        }
        addView(linearLayout30, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout4 = this.f33236w;
        if (frameLayout4 == null) {
            kotlin.jvm.internal.l.l("feedbackContainer");
            throw null;
        }
        addView(frameLayout4);
        hideContent();
        ImageView faviconView = getFaviconView();
        ImageView iconView = getIconView();
        ImageView imageView4 = this.f33226m;
        ImageView imageView5 = this.f33205A;
        if (imageView5 == null) {
            kotlin.jvm.internal.l.l("largeImageView");
            throw null;
        }
        ImageView imageView6 = this.f33234u;
        if (imageView6 == null) {
            kotlin.jvm.internal.l.l("adFoxView");
            throw null;
        }
        this.f33212H = new t51(faviconView, iconView, imageView4, imageView5, imageView6);
        a();
    }

    private final ImageView c() {
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    public final void applyAppearance(yt templateAppearance) {
        kotlin.jvm.internal.l.f(templateAppearance, "templateAppearance");
        if (templateAppearance.equals(this.f33221g)) {
            return;
        }
        this.f33221g = templateAppearance;
        a();
    }

    public final TextView getAgeView() {
        TextView textView = this.f33222h;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.l.l("ageView");
        throw null;
    }

    public final TextView getBodyView() {
        TextView textView = this.i;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.l.l("bodyView");
        throw null;
    }

    public final Button getCallToActionView() {
        Button button = this.f33223j;
        if (button != null) {
            return button;
        }
        kotlin.jvm.internal.l.l("callToActionView");
        throw null;
    }

    public final TextView getDomainView() {
        TextView textView = this.f33224k;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.l.l("domainView");
        throw null;
    }

    public final ImageView getFaviconView() {
        ImageView imageView = this.f33233t;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.l.l("faviconView");
        throw null;
    }

    public final ImageView getFeedbackView() {
        ImageView imageView = this.f33225l;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.l.l("feedbackView");
        throw null;
    }

    public final ImageView getIconView() {
        ImageView imageView = this.f33230q;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.l.l("iconView");
        throw null;
    }

    public final ImageView getImageView() {
        kt ktVar;
        mt mtVarH;
        ImageView imageView = this.f33226m;
        if (this.f33211G != null && (ktVar = this.f33209E) != null && (mtVarH = ktVar.h()) != null) {
            if ("fill".equals(mtVarH.c())) {
                ImageView imageView2 = this.f33234u;
                if (imageView2 != null) {
                    return imageView2;
                }
                kotlin.jvm.internal.l.l("adFoxView");
                throw null;
            }
            if (r81.a(mtVarH)) {
                ImageView imageView3 = this.f33205A;
                if (imageView3 != null) {
                    return imageView3;
                }
                kotlin.jvm.internal.l.l("largeImageView");
                throw null;
            }
        }
        return imageView;
    }

    public final CustomizableMediaView getMediaView() {
        CustomizableMediaView customizableMediaView = this.f33207C;
        if (customizableMediaView != null) {
            return customizableMediaView;
        }
        kotlin.jvm.internal.l.l("mediaView");
        throw null;
    }

    public final View getRatingView() {
        jn1 jn1Var = this.f33231r;
        if (jn1Var != null) {
            return jn1Var;
        }
        kotlin.jvm.internal.l.l("_ratingView");
        throw null;
    }

    public final TextView getReviewCountView() {
        TextView textView = this.f33232s;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.l.l("reviewCountView");
        throw null;
    }

    public final TextView getSponsoredView() {
        s12 s12Var = this.f33227n;
        if (s12Var != null) {
            return s12Var;
        }
        kotlin.jvm.internal.l.l("_sponsoredView");
        throw null;
    }

    public final TextView getTitleView() {
        TextView textView = this.f33228o;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.l.l("titleView");
        throw null;
    }

    public final TextView getWarningView() {
        TextView textView = this.f33229p;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.l.l("warningView");
        throw null;
    }

    public final void hideContent() {
        ImageView imageView = this.f33234u;
        if (imageView == null) {
            kotlin.jvm.internal.l.l("adFoxView");
            throw null;
        }
        imageView.setVisibility(8);
        LinearLayout linearLayout = this.f33235v;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        } else {
            kotlin.jvm.internal.l.l("mainContainer");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h61 h61Var = this.f33213I;
        if (h61Var != null) {
            h61Var.b(this.f33214J);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        h61 h61Var = this.f33213I;
        if (h61Var != null) {
            h61Var.a(this.f33214J);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        mt mtVarH;
        int iY;
        int iY2;
        b91 b91Var;
        kt ktVar;
        mt mtVarH2;
        kt ktVar2;
        mt mtVarG;
        kt ktVar3;
        mt mtVarE;
        int size = View.MeasureSpec.getSize(i);
        float borderWidth = this.f33221g.getBannerAppearance().getBorderWidth();
        j10 j10Var = this.f33215a;
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        j10Var.getClass();
        int iA = size - (j10.a(context, borderWidth) * 2);
        if (iA < 0) {
            iA = 0;
        }
        r81 r81Var = this.f33211G;
        if (r81Var != null) {
            x91 contentPadding = this.f33221g.getBannerAppearance().getContentPadding();
            if (contentPadding != null) {
                Context context2 = getContext();
                j10 j10Var2 = this.f33215a;
                kotlin.jvm.internal.l.c(context2);
                float left = contentPadding.getLeft();
                j10Var2.getClass();
                int iA2 = j10.a(context2, left);
                j10 j10Var3 = this.f33215a;
                float right = contentPadding.getRight();
                j10Var3.getClass();
                int iY3 = com.google.gson.internal.c.y(TypedValue.applyDimension(1, right, context2.getResources().getDisplayMetrics()));
                x91 imageMargins = this.f33221g.getBannerAppearance().getImageMargins();
                if (imageMargins != null) {
                    if (r81Var.a() || r81Var.b() || r81Var.e()) {
                        int iY4 = com.google.gson.internal.c.y((iA - iA2) - iY3);
                        float left2 = imageMargins.getLeft();
                        j10 j10Var4 = this.f33215a;
                        Context context3 = getContext();
                        kotlin.jvm.internal.l.e(context3, "getContext(...)");
                        j10Var4.getClass();
                        int iA3 = j10.a(context3, left2);
                        this.f33215a.getClass();
                        int iY5 = com.google.gson.internal.c.y(TypedValue.applyDimension(1, iA2, context2.getResources().getDisplayMetrics())) + iA3;
                        float right2 = imageMargins.getRight();
                        j10 j10Var5 = this.f33215a;
                        Context context4 = getContext();
                        kotlin.jvm.internal.l.e(context4, "getContext(...)");
                        j10Var5.getClass();
                        int iA4 = j10.a(context4, right2);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
                        if (r81Var.a() && (ktVar3 = this.f33209E) != null && (mtVarE = ktVar3.e()) != null) {
                            int iD = mtVarE.d();
                            int iB = mtVarE.b();
                            aa1 widthConstraint = this.f33221g.getFaviconAppearance().getWidthConstraint();
                            if (widthConstraint != null) {
                                ti0 ti0VarA = a(widthConstraint);
                                Context context5 = getContext();
                                kotlin.jvm.internal.l.e(context5, "getContext(...)");
                                ti0.d dVarA = ti0VarA.a(context5, iY4, iD, iB);
                                j10 j10Var6 = this.f33215a;
                                Context context6 = getContext();
                                kotlin.jvm.internal.l.e(context6, "getContext(...)");
                                j10Var6.getClass();
                                int iA5 = j10.a(context6, 5.0f);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dVarA.b(), dVarA.a());
                                layoutParams2.leftMargin = iY5;
                                layoutParams2.rightMargin = iA5;
                                layoutParams = layoutParams2;
                            }
                        }
                        getFaviconView().setLayoutParams(layoutParams);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                        if (r81Var.b() && (ktVar2 = this.f33209E) != null && (mtVarG = ktVar2.g()) != null) {
                            layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                            aa1 widthConstraint2 = this.f33221g.getImageAppearance().getWidthConstraint();
                            if (widthConstraint2 != null) {
                                int iD2 = mtVarG.d();
                                int iB2 = mtVarG.b();
                                ti0 ti0VarA2 = a(widthConstraint2);
                                Context context7 = getContext();
                                kotlin.jvm.internal.l.e(context7, "getContext(...)");
                                ti0.d dVarA2 = ti0VarA2.a(context7, iY4, iD2, iB2);
                                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(dVarA2.b(), dVarA2.a());
                                layoutParams4.leftMargin = iY5;
                                layoutParams4.rightMargin = iA4;
                                layoutParams3 = layoutParams4;
                            }
                        }
                        getIconView().setLayoutParams(layoutParams3);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(0, 0);
                        if (r81Var.e() && (ktVar = this.f33209E) != null && (mtVarH2 = ktVar.h()) != null) {
                            layoutParams5 = new FrameLayout.LayoutParams(0, 0);
                            aa1 widthConstraint3 = this.f33221g.getImageAppearance().getWidthConstraint();
                            if (widthConstraint3 != null) {
                                int iD3 = mtVarH2.d();
                                int iB3 = mtVarH2.b();
                                ti0 ti0VarA3 = a(widthConstraint3);
                                Context context8 = getContext();
                                kotlin.jvm.internal.l.e(context8, "getContext(...)");
                                ti0.d dVarA3 = ti0VarA3.a(context8, iY4, iD3, iB3);
                                layoutParams5 = new FrameLayout.LayoutParams(dVarA3.b(), dVarA3.a());
                                layoutParams5.leftMargin = iY5;
                                layoutParams5.rightMargin = iA4;
                            }
                        }
                        this.f33226m.setLayoutParams(layoutParams5);
                        LinearLayout linearLayout = this.f33238y;
                        if (linearLayout == null) {
                            kotlin.jvm.internal.l.l("centerContainer");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
                        kotlin.jvm.internal.l.d(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
                        layoutParams7.leftMargin = 0;
                        LinearLayout linearLayout2 = this.f33238y;
                        if (linearLayout2 == null) {
                            kotlin.jvm.internal.l.l("centerContainer");
                            throw null;
                        }
                        linearLayout2.setLayoutParams(layoutParams7);
                    } else {
                        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(0, 0);
                        getFaviconView().setLayoutParams(layoutParams8);
                        getIconView().setLayoutParams(layoutParams8);
                        this.f33226m.setLayoutParams(layoutParams8);
                        LinearLayout linearLayout3 = this.f33238y;
                        if (linearLayout3 == null) {
                            kotlin.jvm.internal.l.l("centerContainer");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams9 = linearLayout3.getLayoutParams();
                        kotlin.jvm.internal.l.d(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
                        layoutParams10.leftMargin = iA2;
                        LinearLayout linearLayout4 = this.f33238y;
                        if (linearLayout4 == null) {
                            kotlin.jvm.internal.l.l("centerContainer");
                            throw null;
                        }
                        linearLayout4.setLayoutParams(layoutParams10);
                    }
                }
            }
            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, 0);
            if (r81Var.c()) {
                layoutParams11 = new LinearLayout.LayoutParams(0, 0);
                kt ktVar4 = this.f33209E;
                if (ktVar4 != null && (mtVarH = ktVar4.h()) != null) {
                    int iD4 = mtVarH.d();
                    int iB4 = mtVarH.b();
                    float fD = mtVarH.d();
                    float fB = mtVarH.b();
                    if (fB != 0.0f && fD / fB < 1.0f) {
                        iY2 = com.google.gson.internal.c.y(iA * 0.75f);
                        iY = com.google.gson.internal.c.y((iY2 / iB4) * iD4);
                    } else {
                        if (iD4 != 0) {
                            iB4 = com.google.gson.internal.c.y(iB4 * (iA / iD4));
                        }
                        iY = iA;
                        iY2 = iB4;
                    }
                    float fD2 = mtVarH.d();
                    float fB2 = mtVarH.b();
                    if (fB2 == 0.0f || fD2 / fB2 <= 1.5f) {
                        iY2 = com.google.gson.internal.c.y(iY2 * 0.8f);
                    }
                    LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(iY, iY2);
                    b91 b91Var2 = this.f33210F;
                    layoutParams12.topMargin = ((b91Var2 == null || !b91Var2.a()) && ((b91Var = this.f33210F) == null || !b91Var.e())) ? 0 : this.f33218d;
                    layoutParams12.gravity = 1;
                    layoutParams11 = layoutParams12;
                }
            }
            LinearLayout linearLayout5 = this.f33206B;
            if (linearLayout5 == null) {
                kotlin.jvm.internal.l.l("largeImageContainer");
                throw null;
            }
            linearLayout5.setLayoutParams(layoutParams11);
        }
        r81 r81Var2 = this.f33211G;
        if (r81Var2 != null) {
            LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(0, 0);
            kt ktVar5 = this.f33209E;
            qt qtVarI = ktVar5 != null ? ktVar5.i() : null;
            if (qtVarI != null && r81Var2.d()) {
                layoutParams13 = new LinearLayout.LayoutParams(iA, new yf(qtVarI.a()).a(iA));
            }
            LinearLayout linearLayout6 = this.f33208D;
            if (linearLayout6 == null) {
                kotlin.jvm.internal.l.l("mediaContainer");
                throw null;
            }
            linearLayout6.setLayoutParams(layoutParams13);
        }
        b91 b91Var3 = this.f33210F;
        if (b91Var3 == null || !b91Var3.f()) {
            LinearLayout linearLayout7 = this.f33239z;
            if (linearLayout7 == null) {
                kotlin.jvm.internal.l.l("callToActionContainer");
                throw null;
            }
            linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        } else {
            b91 b91Var4 = this.f33210F;
            if (b91Var4 == null || !b91Var4.h()) {
                LinearLayout linearLayout8 = this.f33239z;
                if (linearLayout8 == null) {
                    kotlin.jvm.internal.l.l("callToActionContainer");
                    throw null;
                }
                ViewParent parent = linearLayout8.getParent();
                kotlin.jvm.internal.l.d(parent, "null cannot be cast to non-null type android.view.ViewManager");
                ViewManager viewManager = (ViewManager) parent;
                LinearLayout linearLayout9 = this.f33239z;
                if (linearLayout9 == null) {
                    kotlin.jvm.internal.l.l("callToActionContainer");
                    throw null;
                }
                viewManager.removeView(linearLayout9);
                LinearLayout linearLayout10 = this.f33239z;
                if (linearLayout10 == null) {
                    kotlin.jvm.internal.l.l("callToActionContainer");
                    throw null;
                }
                linearLayout10.setPadding(0, 0, 0, 0);
                LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
                int i11 = this.f33219e;
                layoutParams14.topMargin = i11;
                layoutParams14.bottomMargin = i11;
                ViewParent parent2 = getDomainView().getParent();
                kotlin.jvm.internal.l.d(parent2, "null cannot be cast to non-null type android.view.ViewManager");
                ViewManager viewManager2 = (ViewManager) parent2;
                LinearLayout linearLayout11 = this.f33239z;
                if (linearLayout11 == null) {
                    kotlin.jvm.internal.l.l("callToActionContainer");
                    throw null;
                }
                viewManager2.addView(linearLayout11, layoutParams14);
            } else {
                LinearLayout linearLayout12 = this.f33239z;
                if (linearLayout12 == null) {
                    kotlin.jvm.internal.l.l("callToActionContainer");
                    throw null;
                }
                ViewParent parent3 = linearLayout12.getParent();
                kotlin.jvm.internal.l.d(parent3, "null cannot be cast to non-null type android.view.ViewManager");
                ViewManager viewManager3 = (ViewManager) parent3;
                LinearLayout linearLayout13 = this.f33239z;
                if (linearLayout13 == null) {
                    kotlin.jvm.internal.l.l("callToActionContainer");
                    throw null;
                }
                viewManager3.removeView(linearLayout13);
                LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
                b91 b91Var5 = this.f33210F;
                if (b91Var5 == null || !b91Var5.c()) {
                    layoutParams15.topMargin = this.f33218d;
                } else {
                    layoutParams15.topMargin = this.f33220f;
                }
                layoutParams15.bottomMargin = this.f33219e;
                LinearLayout linearLayout14 = this.f33239z;
                if (linearLayout14 == null) {
                    kotlin.jvm.internal.l.l("callToActionContainer");
                    throw null;
                }
                linearLayout14.setLayoutParams(layoutParams15);
                x91 contentPadding2 = this.f33221g.getBannerAppearance().getContentPadding();
                if (contentPadding2 != null) {
                    j10 j10Var7 = this.f33215a;
                    Context context9 = getContext();
                    kotlin.jvm.internal.l.e(context9, "getContext(...)");
                    float left3 = contentPadding2.getLeft();
                    j10Var7.getClass();
                    int iA6 = j10.a(context9, left3);
                    j10 j10Var8 = this.f33215a;
                    Context context10 = getContext();
                    kotlin.jvm.internal.l.e(context10, "getContext(...)");
                    float right3 = contentPadding2.getRight();
                    j10Var8.getClass();
                    int iA7 = j10.a(context10, right3);
                    LinearLayout linearLayout15 = this.f33239z;
                    if (linearLayout15 == null) {
                        kotlin.jvm.internal.l.l("callToActionContainer");
                        throw null;
                    }
                    linearLayout15.setPadding(iA6, 0, iA7, 0);
                    LinearLayout linearLayout16 = this.f33235v;
                    if (linearLayout16 == null) {
                        kotlin.jvm.internal.l.l("mainContainer");
                        throw null;
                    }
                    LinearLayout linearLayout17 = this.f33239z;
                    if (linearLayout17 == null) {
                        kotlin.jvm.internal.l.l("callToActionContainer");
                        throw null;
                    }
                    if (linearLayout16 == null) {
                        kotlin.jvm.internal.l.l("mainContainer");
                        throw null;
                    }
                    linearLayout16.addView(linearLayout17, linearLayout16.getChildCount() - 1);
                }
            }
            b91 b91Var6 = this.f33210F;
            getCallToActionView().setLayoutParams((b91Var6 == null || !b91Var6.g()) ? new LinearLayout.LayoutParams(-2, -2) : new LinearLayout.LayoutParams(-1, -2));
        }
        int iY6 = com.google.gson.internal.c.y(iA * 0.4f);
        getCallToActionView().setMinWidth(iY6);
        getCallToActionView().setMinimumWidth(iY6);
        b91 b91Var7 = this.f33210F;
        if (b91Var7 != null && b91Var7.i()) {
            TextView warningView = getWarningView();
            b91 b91Var8 = this.f33210F;
            if (b91Var8 == null || !b91Var8.j()) {
                warningView.setBackgroundColor(jh2.a(warningView.getCurrentTextColor(), 92.0f));
            } else {
                warningView.setBackgroundColor(0);
            }
            getWarningView().setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        super.onMeasure(i, i10);
    }

    public final void setAd(h61 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        h61 h61Var = this.f33213I;
        if (h61Var != nativeAd) {
            if (h61Var != null) {
                try {
                    h61Var.a(this.f33214J);
                } catch (v51 e4) {
                    fp0.b(new Object[0]);
                    this.f33217c.reportError("Failed to set Native Ad", e4);
                    return;
                }
            }
            nativeAd.b(this.f33214J);
            ar1 adType = nativeAd.getAdType();
            kt adAssets = nativeAd.getAdAssets();
            this.f33210F = new b91(adAssets, adType);
            this.f33211G = new r81(adAssets, adType);
            this.f33209E = adAssets;
            Context context = getContext();
            kotlin.jvm.internal.l.e(context, "getContext(...)");
            ma0 ma0Var = new ma0(context, adAssets, new na0(adAssets, new ei()));
            ImageView feedbackView = getFeedbackView();
            FrameLayout frameLayout = this.f33236w;
            if (frameLayout == null) {
                kotlin.jvm.internal.l.l("feedbackContainer");
                throw null;
            }
            ma0Var.a(feedbackView, frameLayout, this.f33220f);
            this.f33216b.getClass();
            nativeAd.b(tt.a(this));
            showContent();
            this.f33213I = nativeAd;
        }
    }

    public final void showContent() {
        mt mtVarH;
        kt ktVar = this.f33209E;
        int i = 0;
        if (ktVar != null && (mtVarH = ktVar.h()) != null) {
            if (this.f33211G != null && "fill".equals(mtVarH.c())) {
                ImageView imageView = this.f33234u;
                if (imageView == null) {
                    kotlin.jvm.internal.l.l("adFoxView");
                    throw null;
                }
                imageView.setVisibility(0);
                i = 8;
            }
            if (this.f33211G != null && r81.a(mtVarH)) {
                b91 b91Var = this.f33210F;
                if (b91Var != null && !b91Var.a()) {
                    LinearLayout linearLayout = this.f33238y;
                    if (linearLayout == null) {
                        kotlin.jvm.internal.l.l("centerContainer");
                        throw null;
                    }
                    linearLayout.setVisibility(8);
                }
                b91 b91Var2 = this.f33210F;
                if (b91Var2 != null && !b91Var2.e()) {
                    LinearLayout linearLayout2 = this.f33237x;
                    if (linearLayout2 == null) {
                        kotlin.jvm.internal.l.l("topContainer");
                        throw null;
                    }
                    linearLayout2.setVisibility(8);
                }
            }
        }
        LinearLayout linearLayout3 = this.f33235v;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(i);
        } else {
            kotlin.jvm.internal.l.l("mainContainer");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public st(Context context, AttributeSet attributeSet, int i, yt defaultTemplateAppearance, g92 varioqubAdapterProvider, zd appAdAnalyticsActivator, j10 dimensionConverter) {
        this(context, attributeSet, i, defaultTemplateAppearance, varioqubAdapterProvider, appAdAnalyticsActivator, dimensionConverter, null, null, 384, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(defaultTemplateAppearance, "defaultTemplateAppearance");
        kotlin.jvm.internal.l.f(varioqubAdapterProvider, "varioqubAdapterProvider");
        kotlin.jvm.internal.l.f(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public st(Context context, AttributeSet attributeSet, int i, yt defaultTemplateAppearance, g92 varioqubAdapterProvider, zd appAdAnalyticsActivator, j10 dimensionConverter, tt coreNativeBannerViewAdapter) {
        this(context, attributeSet, i, defaultTemplateAppearance, varioqubAdapterProvider, appAdAnalyticsActivator, dimensionConverter, coreNativeBannerViewAdapter, null, 256, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(defaultTemplateAppearance, "defaultTemplateAppearance");
        kotlin.jvm.internal.l.f(varioqubAdapterProvider, "varioqubAdapterProvider");
        kotlin.jvm.internal.l.f(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
        kotlin.jvm.internal.l.f(coreNativeBannerViewAdapter, "coreNativeBannerViewAdapter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st(Context context, AttributeSet attributeSet, int i, yt defaultTemplateAppearance, g92 varioqubAdapterProvider, zd appAdAnalyticsActivator, j10 dimensionConverter, tt coreNativeBannerViewAdapter, mp1 reporter) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(defaultTemplateAppearance, "defaultTemplateAppearance");
        kotlin.jvm.internal.l.f(varioqubAdapterProvider, "varioqubAdapterProvider");
        kotlin.jvm.internal.l.f(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
        kotlin.jvm.internal.l.f(coreNativeBannerViewAdapter, "coreNativeBannerViewAdapter");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        this.f33215a = dimensionConverter;
        this.f33216b = coreNativeBannerViewAdapter;
        this.f33217c = reporter;
        Context context2 = getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        this.f33218d = j10.a(context2, 4.0f);
        Context context3 = getContext();
        kotlin.jvm.internal.l.e(context3, "getContext(...)");
        this.f33219e = j10.a(context3, 8.0f);
        Context context4 = getContext();
        kotlin.jvm.internal.l.e(context4, "getContext(...)");
        this.f33220f = j10.a(context4, 12.0f);
        this.f33221g = defaultTemplateAppearance;
        this.f33226m = c();
        this.f33214J = new b();
        b();
    }

    public /* synthetic */ st(Context context, AttributeSet attributeSet, int i, yt ytVar, g92 g92Var, zd zdVar, j10 j10Var, tt ttVar, mp1 mp1Var, int i10, kotlin.jvm.internal.g gVar) {
        this(context, attributeSet, i, ytVar, g92Var, zdVar, (i10 & 64) != 0 ? new j10() : j10Var, (i10 & 128) != 0 ? new tt() : ttVar, (i10 & 256) != 0 ? gd.a(context, g92Var, zdVar) : mp1Var);
    }

    private static ti0 a(aa1 aa1Var) {
        aa1.a type = aa1Var.getSizeConstraintType().getType();
        int i = type == null ? -1 : a.f33240a[type.ordinal()];
        if (i == 1) {
            return new ti0.a(aa1Var.getValue());
        }
        if (i == 2) {
            return new ti0.b(aa1Var.getValue());
        }
        if (i != 3) {
            return new ti0.c(aa1Var.getValue());
        }
        return new ti0.c(aa1Var.getValue());
    }
}
