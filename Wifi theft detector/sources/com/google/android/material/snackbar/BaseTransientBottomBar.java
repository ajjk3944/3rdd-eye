package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.g0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.f0;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.snackbar.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import s0.x;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar {

    /* renamed from: a, reason: collision with root package name */
    public final int f11114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11115b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11116c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f11117d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f11118e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f11119f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f11120g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f11121h;

    /* renamed from: i, reason: collision with root package name */
    public final r f11122i;

    /* renamed from: j, reason: collision with root package name */
    public final i5.a f11123j;

    /* renamed from: k, reason: collision with root package name */
    public int f11124k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11125l;

    /* renamed from: o, reason: collision with root package name */
    public int f11128o;

    /* renamed from: p, reason: collision with root package name */
    public int f11129p;

    /* renamed from: q, reason: collision with root package name */
    public int f11130q;

    /* renamed from: r, reason: collision with root package name */
    public int f11131r;

    /* renamed from: s, reason: collision with root package name */
    public int f11132s;

    /* renamed from: t, reason: collision with root package name */
    public int f11133t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11134u;

    /* renamed from: v, reason: collision with root package name */
    public List f11135v;

    /* renamed from: w, reason: collision with root package name */
    public Behavior f11136w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f11137x;

    /* renamed from: z, reason: collision with root package name */
    public static final TimeInterpolator f11113z = k4.a.f21835b;
    public static final TimeInterpolator A = k4.a.f21834a;
    public static final TimeInterpolator B = k4.a.f21837d;
    public static final int[] D = {j4.b.snackbarStyle};
    public static final String E = BaseTransientBottomBar.class.getSimpleName();
    public static final Handler C = new Handler(Looper.getMainLooper(), new h());

    /* renamed from: m, reason: collision with root package name */
    public boolean f11126m = false;

    /* renamed from: n, reason: collision with root package name */
    public final Runnable f11127n = new i();

    /* renamed from: y, reason: collision with root package name */
    public a.b f11138y = new l();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AnimationMode {
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: l, reason: collision with root package name */
        public final q f11139l = new q(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f11139l.a(view);
        }

        public final void U(BaseTransientBottomBar baseTransientBottomBar) {
            this.f11139l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f11139l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    @IntRange(from = -2)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Duration {
    }

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11140a;

        public a(int i10) {
            this.f11140a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.N(this.f11140a);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f11122i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f11122i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f11122i.setScaleY(fFloatValue);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.O();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11123j.a(BaseTransientBottomBar.this.f11116c - BaseTransientBottomBar.this.f11114a, BaseTransientBottomBar.this.f11114a);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f11122i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11146a;

        public f(int i10) {
            this.f11146a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.N(this.f11146a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11123j.b(0, BaseTransientBottomBar.this.f11115b);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {
        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f11122i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).V();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).H(message.arg1);
            return true;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f11122i == null || baseTransientBottomBar.f11121h == null) {
                return;
            }
            int iHeight = (f0.a(BaseTransientBottomBar.this.f11121h).height() - BaseTransientBottomBar.this.F()) + ((int) BaseTransientBottomBar.this.f11122i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f11132s) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f11133t = baseTransientBottomBar2.f11132s;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f11122i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.E, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f11133t = baseTransientBottomBar3.f11132s;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f11132s - iHeight;
            BaseTransientBottomBar.this.f11122i.requestLayout();
        }
    }

    public class j implements g0 {
        public j() {
        }

        @Override // androidx.core.view.g0
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f11128o = windowInsetsCompat.i();
            BaseTransientBottomBar.this.f11129p = windowInsetsCompat.j();
            BaseTransientBottomBar.this.f11130q = windowInsetsCompat.k();
            BaseTransientBottomBar.this.b0();
            return windowInsetsCompat;
        }
    }

    public class k extends androidx.core.view.a {
        public k() {
        }

        @Override // androidx.core.view.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            xVar.r0(true);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.w();
            return true;
        }
    }

    public class l implements a.b {
        public l() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void a(int i10) {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void show() {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.N(3);
        }
    }

    public class n implements SwipeDismissBehavior.c {
        public n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.x(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.f11138y);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.a.c().j(BaseTransientBottomBar.this.f11138y);
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar = BaseTransientBottomBar.this.f11122i;
            if (rVar == null) {
                return;
            }
            if (rVar.getParent() != null) {
                BaseTransientBottomBar.this.f11122i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f11122i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.X();
            } else {
                BaseTransientBottomBar.this.Z();
            }
        }
    }

    public class p extends AnimatorListenerAdapter {
        public p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.O();
        }
    }

    public static class q {

        /* renamed from: a, reason: collision with root package name */
        public a.b f11157a;

        public q(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof r;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.c().j(this.f11157a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.c().k(this.f11157a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f11157a = baseTransientBottomBar.f11138y;
        }
    }

    public static class r extends FrameLayout {

        /* renamed from: l, reason: collision with root package name */
        public static final View.OnTouchListener f11158l = new a();

        /* renamed from: a, reason: collision with root package name */
        public BaseTransientBottomBar f11159a;

        /* renamed from: b, reason: collision with root package name */
        public com.google.android.material.shape.a f11160b;

        /* renamed from: c, reason: collision with root package name */
        public int f11161c;

        /* renamed from: d, reason: collision with root package name */
        public final float f11162d;

        /* renamed from: e, reason: collision with root package name */
        public final float f11163e;

        /* renamed from: f, reason: collision with root package name */
        public final int f11164f;

        /* renamed from: g, reason: collision with root package name */
        public final int f11165g;

        /* renamed from: h, reason: collision with root package name */
        public ColorStateList f11166h;

        /* renamed from: i, reason: collision with root package name */
        public PorterDuff.Mode f11167i;

        /* renamed from: j, reason: collision with root package name */
        public Rect f11168j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f11169k;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public r(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f11159a = baseTransientBottomBar;
        }

        public void c(ViewGroup viewGroup) {
            this.f11169k = true;
            viewGroup.addView(this);
            this.f11169k = false;
        }

        public final Drawable d() {
            int iK = u4.a.k(this, j4.b.colorSurface, j4.b.colorOnSurface, getBackgroundOverlayColorAlpha());
            com.google.android.material.shape.a aVar = this.f11160b;
            Drawable drawableV = aVar != null ? BaseTransientBottomBar.v(iK, aVar) : BaseTransientBottomBar.u(iK, getResources());
            if (this.f11166h == null) {
                return k0.a.r(drawableV);
            }
            Drawable drawableR = k0.a.r(drawableV);
            drawableR.setTintList(this.f11166h);
            return drawableR;
        }

        public final void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f11168j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f11163e;
        }

        public int getAnimationMode() {
            return this.f11161c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f11162d;
        }

        public int getMaxInlineActionWidth() {
            return this.f11165g;
        }

        public int getMaxWidth() {
            return this.f11164f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f11159a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.K();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f11159a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.L();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar baseTransientBottomBar = this.f11159a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.M();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f11164f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f11164f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        public void setAnimationMode(int i10) {
            this.f11161c = i10;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f11166h != null) {
                drawable = k0.a.r(drawable.mutate());
                drawable.setTintList(this.f11166h);
                drawable.setTintMode(this.f11167i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f11166h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = k0.a.r(getBackground().mutate());
                drawableR.setTintList(colorStateList);
                drawableR.setTintMode(this.f11167i);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f11167i = mode;
            if (getBackground() != null) {
                Drawable drawableR = k0.a.r(getBackground().mutate());
                drawableR.setTintMode(mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f11169k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f11159a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.b0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f11158l);
            super.setOnClickListener(onClickListener);
        }

        public r(Context context, AttributeSet attributeSet) {
            super(l5.a.d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j4.l.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(j4.l.SnackbarLayout_elevation)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f11161c = typedArrayObtainStyledAttributes.getInt(j4.l.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(j4.l.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(j4.l.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f11160b = com.google.android.material.shape.a.e(context2, attributeSet, 0, 0).m();
            }
            this.f11162d = typedArrayObtainStyledAttributes.getFloat(j4.l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(d5.c.a(context2, typedArrayObtainStyledAttributes, j4.l.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(d0.m(typedArrayObtainStyledAttributes.getInt(j4.l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f11163e = typedArrayObtainStyledAttributes.getFloat(j4.l.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f11164f = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4.l.SnackbarLayout_android_maxWidth, -1);
            this.f11165g = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4.l.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f11158l);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(d());
            }
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, i5.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f11120g = viewGroup;
        this.f11123j = aVar;
        this.f11121h = context;
        a0.a(context);
        r rVar = (r) LayoutInflater.from(context).inflate(D(), viewGroup, false);
        this.f11122i = rVar;
        rVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(rVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(rVar.getMaxInlineActionWidth());
        }
        rVar.addView(view);
        rVar.setAccessibilityLiveRegion(1);
        rVar.setImportantForAccessibility(1);
        rVar.setFitsSystemWindows(true);
        ViewCompat.t0(rVar, new j());
        ViewCompat.j0(rVar, new k());
        this.f11137x = (AccessibilityManager) context.getSystemService("accessibility");
        int i10 = j4.b.motionDurationLong2;
        this.f11116c = b5.k.f(context, i10, 250);
        this.f11114a = b5.k.f(context, i10, 150);
        this.f11115b = b5.k.f(context, j4.b.motionDurationMedium1, 75);
        int i11 = j4.b.motionEasingEmphasizedInterpolator;
        this.f11117d = b5.k.g(context, i11, A);
        this.f11119f = b5.k.g(context, i11, B);
        this.f11118e = b5.k.g(context, i11, f11113z);
    }

    public static GradientDrawable u(int i10, Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(j4.d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public static MaterialShapeDrawable v(int i10, com.google.android.material.shape.a aVar) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar);
        materialShapeDrawable.i0(ColorStateList.valueOf(i10));
        return materialShapeDrawable;
    }

    public int A() {
        return this.f11124k;
    }

    public SwipeDismissBehavior B() {
        return new Behavior();
    }

    public final ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f11119f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    public int D() {
        return G() ? j4.h.mtrl_layout_snackbar : j4.h.design_layout_snackbar;
    }

    public final int E() {
        int height = this.f11122i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f11122i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final int F() {
        int[] iArr = new int[2];
        this.f11122i.getLocationInWindow(iArr);
        return iArr[1] + this.f11122i.getHeight();
    }

    public boolean G() {
        TypedArray typedArrayObtainStyledAttributes = this.f11121h.obtainStyledAttributes(D);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void H(int i10) {
        if (S() && this.f11122i.getVisibility() == 0) {
            s(i10);
        } else {
            N(i10);
        }
    }

    public boolean I() {
        return com.google.android.material.snackbar.a.c().e(this.f11138y);
    }

    public final boolean J() {
        ViewGroup.LayoutParams layoutParams = this.f11122i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.e) && (((CoordinatorLayout.e) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    public void K() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f11122i.getRootWindowInsets()) == null) {
            return;
        }
        this.f11132s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        b0();
    }

    public void L() {
        if (I()) {
            C.post(new m());
        }
    }

    public void M() {
        if (this.f11134u) {
            W();
            this.f11134u = false;
        }
    }

    public void N(int i10) {
        int size;
        com.google.android.material.snackbar.a.c().h(this.f11138y);
        if (this.f11135v != null && r2.size() - 1 >= 0) {
            z.a(this.f11135v.get(size));
            throw null;
        }
        ViewParent parent = this.f11122i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f11122i);
        }
    }

    public void O() {
        int size;
        com.google.android.material.snackbar.a.c().i(this.f11138y);
        if (this.f11135v == null || r0.size() - 1 < 0) {
            return;
        }
        z.a(this.f11135v.get(size));
        throw null;
    }

    public final void P() {
        this.f11131r = t();
        b0();
    }

    public BaseTransientBottomBar Q(int i10) {
        this.f11124k = i10;
        return this;
    }

    public final void R(CoordinatorLayout.e eVar) {
        SwipeDismissBehavior swipeDismissBehaviorB = this.f11136w;
        if (swipeDismissBehaviorB == null) {
            swipeDismissBehaviorB = B();
        }
        if (swipeDismissBehaviorB instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorB).U(this);
        }
        swipeDismissBehaviorB.P(new n());
        eVar.o(swipeDismissBehaviorB);
        if (z() == null) {
            eVar.f2338g = 80;
        }
    }

    public boolean S() {
        AccessibilityManager accessibilityManager = this.f11137x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean T() {
        return this.f11132s > 0 && !this.f11125l && J();
    }

    public void U() {
        com.google.android.material.snackbar.a.c().m(A(), this.f11138y);
    }

    public final void V() {
        if (this.f11122i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f11122i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                R((CoordinatorLayout.e) layoutParams);
            }
            this.f11122i.c(this.f11120g);
            P();
            this.f11122i.setVisibility(4);
        }
        if (this.f11122i.isLaidOut()) {
            W();
        } else {
            this.f11134u = true;
        }
    }

    public final void W() {
        if (S()) {
            r();
            return;
        }
        if (this.f11122i.getParent() != null) {
            this.f11122i.setVisibility(0);
        }
        O();
    }

    public final void X() {
        ValueAnimator valueAnimatorY = y(0.0f, 1.0f);
        ValueAnimator valueAnimatorC = C(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorY, valueAnimatorC);
        animatorSet.setDuration(this.f11114a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    public final void Y(int i10) {
        ValueAnimator valueAnimatorY = y(1.0f, 0.0f);
        valueAnimatorY.setDuration(this.f11115b);
        valueAnimatorY.addListener(new a(i10));
        valueAnimatorY.start();
    }

    public final void Z() {
        int iE = E();
        this.f11122i.setTranslationY(iE);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iE, 0);
        valueAnimator.setInterpolator(this.f11118e);
        valueAnimator.setDuration(this.f11116c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e());
        valueAnimator.start();
    }

    public final void a0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, E());
        valueAnimator.setInterpolator(this.f11118e);
        valueAnimator.setDuration(this.f11116c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public final void b0() {
        ViewGroup.LayoutParams layoutParams = this.f11122i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(E, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f11122i.f11168j == null) {
            Log.w(E, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f11122i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f11122i.f11168j.bottom + (z() != null ? this.f11131r : this.f11128o);
        int i11 = this.f11122i.f11168j.left + this.f11129p;
        int i12 = this.f11122i.f11168j.right + this.f11130q;
        int i13 = this.f11122i.f11168j.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f11122i.requestLayout();
        }
        if ((z10 || this.f11133t != this.f11132s) && Build.VERSION.SDK_INT >= 29 && T()) {
            this.f11122i.removeCallbacks(this.f11127n);
            this.f11122i.post(this.f11127n);
        }
    }

    public void r() {
        this.f11122i.post(new o());
    }

    public final void s(int i10) {
        if (this.f11122i.getAnimationMode() == 1) {
            Y(i10);
        } else {
            a0(i10);
        }
    }

    public final int t() {
        if (z() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        z().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f11120g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f11120g.getHeight()) - i10;
    }

    public void w() {
        x(3);
    }

    public void x(int i10) {
        com.google.android.material.snackbar.a.c().b(this.f11138y, i10);
    }

    public final ValueAnimator y(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f11117d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    public View z() {
        return null;
    }
}
