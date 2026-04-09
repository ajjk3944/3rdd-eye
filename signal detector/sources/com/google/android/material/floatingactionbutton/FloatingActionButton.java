package com.google.android.material.floatingactionbutton;

import B3.x;
import E.a;
import E.b;
import G3.o;
import G3.z;
import I.d;
import R.O;
import a4.p;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.apm.insight.R;
import com.bumptech.glide.c;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d3.AbstractC2266a;
import d4.h;
import e3.e;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C2701a;
import o.r;
import u3.InterfaceC2955a;
import v3.C2961a;
import v3.f;
import x3.AbstractC2993B;
import x3.AbstractC2995D;
import x3.AbstractC2998c;

/* loaded from: classes.dex */
public class FloatingActionButton extends AbstractC2995D implements InterfaceC2955a, z, a {

    /* renamed from: C, reason: collision with root package name */
    public final C2701a f18348C;

    /* renamed from: D, reason: collision with root package name */
    public f f18349D;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f18350b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f18351c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f18352d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f18353e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f18354f;

    /* renamed from: g, reason: collision with root package name */
    public int f18355g;

    /* renamed from: h, reason: collision with root package name */
    public int f18356h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f18357j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18358k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f18359l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f18360m;

    /* renamed from: n, reason: collision with root package name */
    public final d f18361n;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        super(O3.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f24038a = getVisibility();
        this.f18359l = new Rect();
        this.f18360m = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = AbstractC2993B.i(context2, attributeSet, AbstractC2266a.f19760o, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f18350b = c.n(context2, typedArrayI, 1);
        this.f18351c = AbstractC2993B.k(typedArrayI.getInt(2, -1), null);
        this.f18354f = c.n(context2, typedArrayI, 12);
        this.f18355g = typedArrayI.getInt(7, -1);
        this.f18356h = typedArrayI.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(3, 0);
        float dimension = typedArrayI.getDimension(4, 0.0f);
        float dimension2 = typedArrayI.getDimension(9, 0.0f);
        float dimension3 = typedArrayI.getDimension(11, 0.0f);
        this.f18358k = typedArrayI.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(10, 0));
        e eVarA = e.a(context2, typedArrayI, 15);
        e eVarA2 = e.a(context2, typedArrayI, 8);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC2266a.f19725C, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        o oVarA = o.b(context2, resourceId, resourceId2, o.f1623m).a();
        boolean z6 = typedArrayI.getBoolean(5, false);
        setEnabled(typedArrayI.getBoolean(0, true));
        typedArrayI.recycle();
        d dVar = new d(this);
        this.f18361n = dVar;
        dVar.d(attributeSet, R.attr.floatingActionButtonStyle);
        this.f18348C = new C2701a(this);
        getImpl().g(oVarA);
        f impl = getImpl();
        ColorStateList colorStateList2 = this.f18350b;
        PorterDuff.Mode mode = this.f18351c;
        ColorStateList colorStateList3 = this.f18354f;
        FloatingActionButton floatingActionButton = impl.f23886s;
        o oVar = impl.f23869a;
        oVar.getClass();
        v3.e eVar = new v3.e(oVar);
        impl.f23870b = eVar;
        eVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.f23870b.setTintMode(mode);
        }
        impl.f23870b.m(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            o oVar2 = impl.f23869a;
            oVar2.getClass();
            C2961a c2961a = new C2961a(oVar2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            c2961a.i = color;
            c2961a.f23839j = color2;
            c2961a.f23840k = color3;
            c2961a.f23841l = color4;
            float f2 = dimensionPixelSize;
            if (c2961a.f23838h != f2) {
                c2961a.f23838h = f2;
                c2961a.f23832b.setStrokeWidth(f2 * 1.3333f);
                c2961a.f23843n = true;
                c2961a.invalidateSelf();
            }
            if (colorStateList2 != null) {
                c2961a.f23842m = colorStateList2.getColorForState(c2961a.getState(), c2961a.f23842m);
            }
            c2961a.f23845p = colorStateList2;
            c2961a.f23843n = true;
            c2961a.invalidateSelf();
            impl.f23872d = c2961a;
            C2961a c2961a2 = impl.f23872d;
            c2961a2.getClass();
            v3.e eVar2 = impl.f23870b;
            eVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{c2961a2, eVar2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.f23872d = null;
            layerDrawable = impl.f23870b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(E3.a.c(colorStateList), layerDrawable, drawable);
        impl.f23871c = rippleDrawable;
        impl.f23873e = rippleDrawable;
        getImpl().f23878k = dimensionPixelSize2;
        f impl2 = getImpl();
        if (impl2.f23876h != dimension) {
            impl2.f23876h = dimension;
            impl2.e(dimension, impl2.i, impl2.f23877j);
        }
        f impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.f23876h, dimension2, impl3.f23877j);
        }
        f impl4 = getImpl();
        if (impl4.f23877j != dimension3) {
            impl4.f23877j = dimension3;
            impl4.e(impl4.f23876h, impl4.i, dimension3);
        }
        getImpl().f23881n = eVarA;
        getImpl().f23882o = eVarA2;
        getImpl().f23874f = z6;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private f getImpl() {
        if (this.f18349D == null) {
            this.f18349D = new f(this, new h(20, this));
        }
        return this.f18349D;
    }

    public final int c(int i) {
        int i3 = this.f18356h;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        f impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f23886s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f23885r == 1) {
                return;
            }
        } else if (impl.f23885r != 2) {
            return;
        }
        Animator animator = impl.f23880m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.f23886s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        e eVar = impl.f23882o;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, f.f23859B, f.f23860C);
        animatorSetB.addListener(new Q3.c(impl));
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f18352d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f18353e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(r.c(colorForState, mode));
    }

    public final void f() {
        f impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f23886s;
        Matrix matrix = impl.f23891x;
        FloatingActionButton floatingActionButton2 = impl.f23886s;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f23885r == 2) {
                return;
            }
        } else if (impl.f23885r != 1) {
            return;
        }
        Animator animator = impl.f23880m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z6 = impl.f23881n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f23883p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z6 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z6 ? 0.4f : 0.0f);
            float f2 = z6 ? 0.4f : 0.0f;
            impl.f23883p = f2;
            impl.a(f2, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        e eVar = impl.f23881n;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, f.f23868z, f.f23858A);
        animatorSetB.addListener(new x(12, impl));
        animatorSetB.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f18350b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f18351c;
    }

    @Override // E.a
    public b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f23886s.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f23877j;
    }

    public Drawable getContentBackground() {
        return getImpl().f23873e;
    }

    public int getCustomSize() {
        return this.f18356h;
    }

    public int getExpandedComponentIdHint() {
        return this.f18348C.f22476b;
    }

    public e getHideMotionSpec() {
        return getImpl().f23882o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f18354f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f18354f;
    }

    public o getShapeAppearanceModel() {
        o oVar = getImpl().f23869a;
        oVar.getClass();
        return oVar;
    }

    public e getShowMotionSpec() {
        return getImpl().f23881n;
    }

    public int getSize() {
        return this.f18355g;
    }

    public int getSizeDimension() {
        return c(this.f18355g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f18352d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f18353e;
    }

    public boolean getUseCompatPadding() {
        return this.f18358k;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f impl = getImpl();
        v3.e eVar = impl.f23870b;
        if (eVar != null) {
            p.r(impl.f23886s, eVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().f23886s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i3) {
        int sizeDimension = getSizeDimension();
        this.i = (sizeDimension - this.f18357j) / 2;
        getImpl().h();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i3));
        Rect rect = this.f18359l;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof K3.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        K3.a aVar = (K3.a) parcelable;
        super.onRestoreInstanceState(aVar.f3954a);
        Bundle bundle = (Bundle) aVar.f2159c.get("expandableWidgetHelper");
        bundle.getClass();
        C2701a c2701a = this.f18348C;
        c2701a.getClass();
        c2701a.f22475a = bundle.getBoolean("expanded", false);
        c2701a.f22476b = bundle.getInt("expandedComponentIdHint", 0);
        if (c2701a.f22475a) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) c2701a.f22477c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        K3.a aVar = new K3.a(parcelableOnSaveInstanceState);
        C2701a c2701a = this.f18348C;
        c2701a.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c2701a.f22475a);
        bundle.putInt("expandedComponentIdHint", c2701a.f22476b);
        aVar.f2159c.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f18360m;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.f18359l;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            f fVar = this.f18349D;
            int i3 = -(fVar.f23874f ? Math.max((fVar.f23878k - fVar.f23886s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i3, i3);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f18350b != colorStateList) {
            this.f18350b = colorStateList;
            f impl = getImpl();
            v3.e eVar = impl.f23870b;
            if (eVar != null) {
                eVar.setTintList(colorStateList);
            }
            C2961a c2961a = impl.f23872d;
            if (c2961a != null) {
                if (colorStateList != null) {
                    c2961a.f23842m = colorStateList.getColorForState(c2961a.getState(), c2961a.f23842m);
                }
                c2961a.f23845p = colorStateList;
                c2961a.f23843n = true;
                c2961a.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f18351c != mode) {
            this.f18351c = mode;
            v3.e eVar = getImpl().f23870b;
            if (eVar != null) {
                eVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f2) {
        f impl = getImpl();
        if (impl.f23876h != f2) {
            impl.f23876h = f2;
            impl.e(f2, impl.i, impl.f23877j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        f impl = getImpl();
        if (impl.i != f2) {
            impl.i = f2;
            impl.e(impl.f23876h, f2, impl.f23877j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f2) {
        f impl = getImpl();
        if (impl.f23877j != f2) {
            impl.f23877j = f2;
            impl.e(impl.f23876h, impl.i, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f18356h) {
            this.f18356h = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        v3.e eVar = getImpl().f23870b;
        if (eVar != null) {
            eVar.p(f2);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        if (z6 != getImpl().f23874f) {
            getImpl().f23874f = z6;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f18348C.f22476b = i;
    }

    public void setHideMotionSpec(e eVar) {
        getImpl().f23882o = eVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(e.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            f impl = getImpl();
            float f2 = impl.f23883p;
            impl.f23883p = f2;
            Matrix matrix = impl.f23891x;
            impl.a(f2, matrix);
            impl.f23886s.setImageMatrix(matrix);
            if (this.f18352d != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f18361n.e(i);
        e();
    }

    public void setMaxImageSize(int i) {
        this.f18357j = i;
        f impl = getImpl();
        if (impl.f23884q != i) {
            impl.f23884q = i;
            float f2 = impl.f23883p;
            impl.f23883p = f2;
            Matrix matrix = impl.f23891x;
            impl.a(f2, matrix);
            impl.f23886s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z6) {
        f impl = getImpl();
        impl.f23875g = z6;
        impl.h();
    }

    @Override // G3.z
    public void setShapeAppearanceModel(o oVar) {
        getImpl().g(oVar);
    }

    public void setShowMotionSpec(e eVar) {
        getImpl().f23881n = eVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(e.b(getContext(), i));
    }

    public void setSize(int i) {
        this.f18356h = 0;
        if (i != this.f18355g) {
            this.f18355g = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f18352d != colorStateList) {
            this.f18352d = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f18353e != mode) {
            this.f18353e = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f18358k != z6) {
            this.f18358k = z6;
            getImpl().h();
        }
    }

    @Override // x3.AbstractC2995D, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends b {

        /* renamed from: a, reason: collision with root package name */
        public Rect f18362a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18363b;

        public BaseBehavior() {
            this.f18363b = true;
        }

        @Override // E.b
        public final boolean e(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f18359l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // E.b
        public final void g(E.e eVar) {
            if (eVar.f1318h == 0) {
                eVar.f1318h = 80;
            }
        }

        @Override // E.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof E.e ? ((E.e) layoutParams).f1311a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // E.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListK = coordinatorLayout.k(floatingActionButton);
            int size = arrayListK.size();
            int i3 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                View view2 = (View) arrayListK.get(i6);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof E.e ? ((E.e) layoutParams).f1311a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(i, floatingActionButton);
            Rect rect = floatingActionButton.f18359l;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                E.e eVar = (E.e) floatingActionButton.getLayoutParams();
                int i7 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    WeakHashMap weakHashMap = O.f3270a;
                    floatingActionButton.offsetTopAndBottom(i3);
                }
                if (i7 != 0) {
                    WeakHashMap weakHashMap2 = O.f3270a;
                    floatingActionButton.offsetLeftAndRight(i7);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            E.e eVar = (E.e) floatingActionButton.getLayoutParams();
            if (!this.f18363b || eVar.f1316f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f18362a == null) {
                this.f18362a = new Rect();
            }
            Rect rect = this.f18362a;
            AbstractC2998c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            E.e eVar = (E.e) floatingActionButton.getLayoutParams();
            if (!this.f18363b || eVar.f1316f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((E.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19761p);
            this.f18363b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f18354f != colorStateList) {
            this.f18354f = colorStateList;
            f impl = getImpl();
            ColorStateList colorStateList2 = this.f18354f;
            RippleDrawable rippleDrawable = impl.f23871c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(E3.a.c(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(E3.a.c(colorStateList2));
            }
        }
    }
}
