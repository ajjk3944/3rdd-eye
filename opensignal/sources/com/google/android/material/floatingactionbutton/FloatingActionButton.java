package com.google.android.material.floatingactionbutton;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bc.f0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import e3.e;
import ed.b;
import ed.c;
import ed.d;
import ed.k;
import ed.l;
import ee.v;
import h7.g;
import h7.w;
import java.util.List;
import java.util.WeakHashMap;
import p.l2;
import p.p;
import u3.i0;
import vd.a;
import wd.h;
import xd.o;

/* loaded from: classes.dex */
public class FloatingActionButton extends o implements a, v, e3.a {
    public static final int M = k.Widget_Design_FloatingActionButton;
    public int B;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final Rect H;
    public final Rect I;
    public final f0 J;
    public final g K;
    public h L;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f5648d;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f5649g;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f5650r;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f5651x;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f5652y;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        int i10 = b.floatingActionButtonStyle;
        int i11 = M;
        super(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        this.f25298a = getVisibility();
        this.H = new Rect();
        this.I = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = xd.k.d(context2, attributeSet, l.FloatingActionButton, i10, i11, new int[0]);
        this.f5648d = xu.l.q(context2, typedArrayD, l.FloatingActionButton_backgroundTint);
        this.f5649g = xd.l.d(typedArrayD.getInt(l.FloatingActionButton_backgroundTintMode, -1), null);
        this.f5652y = xu.l.q(context2, typedArrayD, l.FloatingActionButton_rippleColor);
        this.B = typedArrayD.getInt(l.FloatingActionButton_fabSize, -1);
        this.D = typedArrayD.getDimensionPixelSize(l.FloatingActionButton_fabCustomSize, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(l.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayD.getDimension(l.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayD.getDimension(l.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayD.getDimension(l.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.G = typedArrayD.getBoolean(l.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(l.FloatingActionButton_maxImageSize, 0));
        fd.d dVarA = fd.d.a(context2, typedArrayD, l.FloatingActionButton_showMotionSpec);
        fd.d dVarA2 = fd.d.a(context2, typedArrayD, l.FloatingActionButton_hideMotionSpec);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.MaterialShape, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(l.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        ee.l lVarB = ee.l.b(context2, resourceId, resourceId2, ee.l.f8123m).b();
        boolean z10 = typedArrayD.getBoolean(l.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayD.getBoolean(l.FloatingActionButton_android_enabled, true));
        typedArrayD.recycle();
        f0 f0Var = new f0(this);
        this.J = f0Var;
        f0Var.j(attributeSet, i10);
        g gVar = new g();
        gVar.f10067b = false;
        gVar.f10066a = 0;
        gVar.f10068c = this;
        this.K = gVar;
        getImpl().g(lVarB);
        h impl = getImpl();
        ColorStateList colorStateList2 = this.f5648d;
        PorterDuff.Mode mode = this.f5649g;
        ColorStateList colorStateList3 = this.f5652y;
        FloatingActionButton floatingActionButton = impl.f24465s;
        ee.l lVar = impl.f24449a;
        lVar.getClass();
        wd.g gVar2 = new wd.g(lVar);
        impl.f24450b = gVar2;
        gVar2.setTintList(colorStateList2);
        if (mode != null) {
            impl.f24450b.setTintMode(mode);
        }
        impl.f24450b.m(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            ee.l lVar2 = impl.f24449a;
            lVar2.getClass();
            wd.a aVar = new wd.a(lVar2);
            int color = context3.getColor(c.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(c.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(c.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(c.design_fab_stroke_end_outer_color);
            aVar.f24424i = color;
            aVar.j = color2;
            aVar.k = color3;
            aVar.f24425l = color4;
            float f10 = dimensionPixelSize;
            if (aVar.f24423h != f10) {
                aVar.f24423h = f10;
                aVar.f24417b.setStrokeWidth(f10 * 1.3333f);
                aVar.f24427n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList2 != null) {
                aVar.f24426m = colorStateList2.getColorForState(aVar.getState(), aVar.f24426m);
            }
            aVar.f24429p = colorStateList2;
            aVar.f24427n = true;
            aVar.invalidateSelf();
            impl.f24452d = aVar;
            wd.a aVar2 = impl.f24452d;
            aVar2.getClass();
            wd.g gVar3 = impl.f24450b;
            gVar3.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{aVar2, gVar3});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.f24452d = null;
            layerDrawable = impl.f24450b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ce.a.c(colorStateList), layerDrawable, drawable);
        impl.f24451c = rippleDrawable;
        impl.f24453e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        h impl2 = getImpl();
        if (impl2.f24456h != dimension) {
            impl2.f24456h = dimension;
            impl2.e(dimension, impl2.f24457i, impl2.j);
        }
        h impl3 = getImpl();
        if (impl3.f24457i != dimension2) {
            impl3.f24457i = dimension2;
            impl3.e(impl3.f24456h, dimension2, impl3.j);
        }
        h impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.f24456h, impl4.f24457i, dimension3);
        }
        getImpl().f24460n = dVarA;
        getImpl().f24461o = dVarA2;
        getImpl().f24454f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private h getImpl() {
        if (this.L == null) {
            this.L = new h(this, new l2(21, this));
        }
        return this.L;
    }

    public final int c(int i10) {
        int i11 = this.D;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(d.design_fab_size_normal) : resources.getDimensionPixelSize(d.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d(boolean z10) {
        h impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f24465s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f24464r == 1) {
                return;
            }
        } else if (impl.f24464r != 2) {
            return;
        }
        Animator animator = impl.f24459m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.f24465s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(z10 ? 8 : 4, z10);
            return;
        }
        fd.d dVar = impl.f24461o;
        AnimatorSet animatorSetB = dVar != null ? impl.b(dVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, h.B, h.C);
        animatorSetB.addListener(new wd.d(impl, z10));
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
        ColorStateList colorStateList = this.f5650r;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f5651x;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(p.c(colorForState, mode));
    }

    public final void f(boolean z10) {
        h impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f24465s;
        Matrix matrix = impl.f24470x;
        FloatingActionButton floatingActionButton2 = impl.f24465s;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f24464r == 2) {
                return;
            }
        } else if (impl.f24464r != 1) {
            return;
        }
        Animator animator = impl.f24459m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = impl.f24460n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f24462p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z11 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z11 ? 0.4f : 0.0f);
            float f10 = z11 ? 0.4f : 0.0f;
            impl.f24462p = f10;
            impl.a(f10, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        fd.d dVar = impl.f24460n;
        AnimatorSet animatorSetB = dVar != null ? impl.b(dVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, h.f24448z, h.A);
        animatorSetB.addListener(new w(impl, z10));
        animatorSetB.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f5648d;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f5649g;
    }

    @Override // e3.a
    public e3.b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f24465s.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f24457i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().f24453e;
    }

    public int getCustomSize() {
        return this.D;
    }

    public int getExpandedComponentIdHint() {
        return this.K.f10066a;
    }

    public fd.d getHideMotionSpec() {
        return getImpl().f24461o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f5652y;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f5652y;
    }

    public ee.l getShapeAppearanceModel() {
        ee.l lVar = getImpl().f24449a;
        lVar.getClass();
        return lVar;
    }

    public fd.d getShowMotionSpec() {
        return getImpl().f24460n;
    }

    public int getSize() {
        return this.B;
    }

    public int getSizeDimension() {
        return c(this.B);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f5650r;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f5651x;
    }

    public boolean getUseCompatPadding() {
        return this.G;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h impl = getImpl();
        wd.g gVar = impl.f24450b;
        if (gVar != null) {
            se.b.U(impl.f24465s, gVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().f24465s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.E = (sizeDimension - this.F) / 2;
        getImpl().h();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.H;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f1243a);
        Bundle bundle = (Bundle) extendableSavedState.f5709g.get("expandableWidgetHelper");
        bundle.getClass();
        g gVar = this.K;
        gVar.getClass();
        gVar.f10067b = bundle.getBoolean("expanded", false);
        gVar.f10066a = bundle.getInt("expandedComponentIdHint", 0);
        if (gVar.f10067b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) gVar.f10068c;
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
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        g gVar = this.K;
        gVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", gVar.f10067b);
        bundle.putInt("expandedComponentIdHint", gVar.f10066a);
        extendableSavedState.f5709g.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.I;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i10 = rect.left;
            Rect rect2 = this.H;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            h hVar = this.L;
            int i11 = -(hVar.f24454f ? Math.max((hVar.k - hVar.f24465s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i11, i11);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f5648d != colorStateList) {
            this.f5648d = colorStateList;
            h impl = getImpl();
            wd.g gVar = impl.f24450b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            wd.a aVar = impl.f24452d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f24426m = colorStateList.getColorForState(aVar.getState(), aVar.f24426m);
                }
                aVar.f24429p = colorStateList;
                aVar.f24427n = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f5649g != mode) {
            this.f5649g = mode;
            wd.g gVar = getImpl().f24450b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        h impl = getImpl();
        if (impl.f24456h != f10) {
            impl.f24456h = f10;
            impl.e(f10, impl.f24457i, impl.j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        h impl = getImpl();
        if (impl.f24457i != f10) {
            impl.f24457i = f10;
            impl.e(impl.f24456h, f10, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        h impl = getImpl();
        if (impl.j != f10) {
            impl.j = f10;
            impl.e(impl.f24456h, impl.f24457i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.D) {
            this.D = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        wd.g gVar = getImpl().f24450b;
        if (gVar != null) {
            gVar.p(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f24454f) {
            getImpl().f24454f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.K.f10066a = i10;
    }

    public void setHideMotionSpec(fd.d dVar) {
        getImpl().f24461o = dVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(fd.d.b(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            h impl = getImpl();
            float f10 = impl.f24462p;
            impl.f24462p = f10;
            Matrix matrix = impl.f24470x;
            impl.a(f10, matrix);
            impl.f24465s.setImageMatrix(matrix);
            if (this.f5650r != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.J.t(i10);
        e();
    }

    public void setMaxImageSize(int i10) {
        this.F = i10;
        h impl = getImpl();
        if (impl.f24463q != i10) {
            impl.f24463q = i10;
            float f10 = impl.f24462p;
            impl.f24462p = f10;
            Matrix matrix = impl.f24470x;
            impl.a(f10, matrix);
            impl.f24465s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        h impl = getImpl();
        impl.f24455g = z10;
        impl.h();
    }

    @Override // ee.v
    public void setShapeAppearanceModel(ee.l lVar) {
        getImpl().g(lVar);
    }

    public void setShowMotionSpec(fd.d dVar) {
        getImpl().f24460n = dVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(fd.d.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.D = 0;
        if (i10 != this.B) {
            this.B = i10;
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
        if (this.f5650r != colorStateList) {
            this.f5650r = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f5651x != mode) {
            this.f5651x = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            getImpl().h();
        }
    }

    @Override // xd.o, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends e3.b {

        /* renamed from: a, reason: collision with root package name */
        public Rect f5653a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5654b;

        public BaseBehavior() {
            this.f5654b = true;
        }

        @Override // e3.b
        public final boolean a(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.H;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // e3.b
        public final void c(e eVar) {
            if (eVar.f7778h == 0) {
                eVar.f7778h = 80;
            }
        }

        @Override // e3.b
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof e ? ((e) layoutParams).f7771a instanceof BottomSheetBehavior : false) {
                    t(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // e3.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listK = coordinatorLayout.k(floatingActionButton);
            int size = listK.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) listK.get(i12);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof e ? ((e) layoutParams).f7771a instanceof BottomSheetBehavior : false) && t(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.s(floatingActionButton, i10);
            Rect rect = floatingActionButton.H;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                e eVar = (e) floatingActionButton.getLayoutParams();
                int i13 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    WeakHashMap weakHashMap = i0.f23177a;
                    floatingActionButton.offsetTopAndBottom(i11);
                }
                if (i13 != 0) {
                    WeakHashMap weakHashMap2 = i0.f23177a;
                    floatingActionButton.offsetLeftAndRight(i13);
                }
            }
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            e eVar = (e) floatingActionButton.getLayoutParams();
            if (!this.f5654b || eVar.f7776f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f5653a == null) {
                this.f5653a = new Rect();
            }
            Rect rect = this.f5653a;
            xd.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.f(false);
            return true;
        }

        public final boolean t(View view, FloatingActionButton floatingActionButton) {
            e eVar = (e) floatingActionButton.getLayoutParams();
            if (!this.f5654b || eVar.f7776f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.f(false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.FloatingActionButton_Behavior_Layout);
            this.f5654b = typedArrayObtainStyledAttributes.getBoolean(l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f5652y != colorStateList) {
            this.f5652y = colorStateList;
            h impl = getImpl();
            ColorStateList colorStateList2 = this.f5652y;
            RippleDrawable rippleDrawable = impl.f24451c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(ce.a.c(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(ce.a.c(colorStateList2));
            }
        }
    }
}
