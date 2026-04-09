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
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.cb;
import defpackage.e61;
import defpackage.eb;
import defpackage.fb;
import defpackage.gb;
import defpackage.gn0;
import defpackage.h;
import defpackage.kf3;
import defpackage.kj;
import defpackage.ko;
import defpackage.l6;
import defpackage.mt;
import defpackage.ob1;
import defpackage.of3;
import defpackage.ot;
import defpackage.ou1;
import defpackage.pu1;
import defpackage.qb1;
import defpackage.qu;
import defpackage.rv0;
import defpackage.so1;
import defpackage.su;
import defpackage.su0;
import defpackage.u71;
import defpackage.uj;
import defpackage.uk2;
import defpackage.um;
import defpackage.vj;
import defpackage.vq2;
import defpackage.vu;
import defpackage.wl2;
import defpackage.wu;
import defpackage.yj;
import defpackage.yt;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class FloatingActionButton extends u71 implements mt, rv0, uj {
    public ColorStateList g;
    public PorterDuff.Mode h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public final Rect q;
    public final Rect r;
    public final so1 s;
    public final h t;
    public wu u;

    /* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
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
        super(um.z(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f = getVisibility();
        this.q = new Rect();
        this.r = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayS = uk2.s(context2, attributeSet, gn0.k, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.g = ob1.e(context2, typedArrayS, 1);
        this.h = qb1.m(typedArrayS.getInt(2, -1), null);
        this.k = ob1.e(context2, typedArrayS, 12);
        this.l = typedArrayS.getInt(7, -1);
        this.m = typedArrayS.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayS.getDimensionPixelSize(3, 0);
        float dimension = typedArrayS.getDimension(4, 0.0f);
        float dimension2 = typedArrayS.getDimension(9, 0.0f);
        float dimension3 = typedArrayS.getDimension(11, 0.0f);
        this.p = typedArrayS.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayS.getDimensionPixelSize(10, 0));
        ze0 ze0VarA = ze0.a(context2, typedArrayS, 15);
        ze0 ze0VarA2 = ze0.a(context2, typedArrayS, 8);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, gn0.A, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        su0 su0VarA = su0.a(context2, resourceId, resourceId2, su0.m).a();
        boolean z = typedArrayS.getBoolean(5, false);
        setEnabled(typedArrayS.getBoolean(0, true));
        typedArrayS.recycle();
        so1 so1Var = new so1(this);
        this.s = so1Var;
        so1Var.k(attributeSet, R.attr.floatingActionButtonStyle);
        this.t = new h(this);
        getImpl().h(su0VarA);
        wu impl = getImpl();
        ColorStateList colorStateList2 = this.g;
        PorterDuff.Mode mode = this.h;
        ColorStateList colorStateList3 = this.k;
        FloatingActionButton floatingActionButton = impl.v;
        su0 su0Var = impl.a;
        su0Var.getClass();
        vu vuVar = new vu(su0Var);
        impl.b = vuVar;
        vuVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.m(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            su0 su0Var2 = impl.a;
            su0Var2.getClass();
            cb cbVar = new cb(su0Var2);
            int iA = kj.a(context3, R.color.design_fab_stroke_top_outer_color);
            int iA2 = kj.a(context3, R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int iA3 = kj.a(context3, R.color.design_fab_stroke_end_inner_color);
            int iA4 = kj.a(context3, R.color.design_fab_stroke_end_outer_color);
            cbVar.i = iA;
            cbVar.j = iA2;
            cbVar.k = iA3;
            cbVar.l = iA4;
            float f = dimensionPixelSize;
            if (cbVar.h != f) {
                cbVar.h = f;
                cbVar.b.setStrokeWidth(f * 1.3333f);
                cbVar.n = true;
                cbVar.invalidateSelf();
            }
            if (colorStateList2 != null) {
                cbVar.m = colorStateList2.getColorForState(cbVar.getState(), cbVar.m);
            }
            cbVar.p = colorStateList2;
            cbVar.n = true;
            cbVar.invalidateSelf();
            impl.d = cbVar;
            cb cbVar2 = impl.d;
            cbVar2.getClass();
            vu vuVar2 = impl.b;
            vuVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{cbVar2, vuVar2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.d = null;
            layerDrawable = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(pu1.m(colorStateList), layerDrawable, drawable);
        impl.c = rippleDrawable;
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        wu impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        wu impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        wu impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = ze0VarA;
        getImpl().o = ze0VarA2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private wu getImpl() {
        if (this.u == null) {
            this.u = new wu(this, new kf3(4, this));
        }
        return this.u;
    }

    public final void c(eb ebVar) {
        wu impl = getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList();
        }
        impl.t.add(ebVar);
    }

    public final void d(eb ebVar) {
        wu impl = getImpl();
        if (impl.s == null) {
            impl.s = new ArrayList();
        }
        impl.s.add(ebVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e(of3 of3Var) {
        wu impl = getImpl();
        qu quVar = new qu(this, of3Var);
        if (impl.u == null) {
            impl.u = new ArrayList();
        }
        impl.u.add(quVar);
    }

    public final void f(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int i = rect.left;
        Rect rect2 = this.q;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final int g(int i) {
        int i2 = this.m;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.g;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.h;
    }

    @Override // defpackage.uj
    public vj getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().v.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.m;
    }

    public int getExpandedComponentIdHint() {
        return this.t.g;
    }

    public ze0 getHideMotionSpec() {
        return getImpl().o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.k;
    }

    public su0 getShapeAppearanceModel() {
        su0 su0Var = getImpl().a;
        su0Var.getClass();
        return su0Var;
    }

    public ze0 getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.l;
    }

    public int getSizeDimension() {
        return g(this.l);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.i;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.j;
    }

    public boolean getUseCompatPadding() {
        return this.p;
    }

    public final void h(gb gbVar, boolean z) {
        wu impl = getImpl();
        vq2 vq2Var = gbVar == null ? null : new vq2((Object) this, (Object) gbVar, 8, false);
        FloatingActionButton floatingActionButton = impl.v;
        FloatingActionButton floatingActionButton2 = impl.v;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.r == 1) {
                return;
            }
        } else if (impl.r != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.a(z ? 8 : 4, z);
            if (vq2Var != null) {
                ((wl2) vq2Var.g).r((FloatingActionButton) vq2Var.h);
                return;
            }
            return;
        }
        ze0 ze0Var = impl.o;
        AnimatorSet animatorSetB = ze0Var != null ? impl.b(ze0Var, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, wu.E, wu.F);
        animatorSetB.addListener(new su(impl, z, vq2Var));
        ArrayList arrayList = impl.t;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                animatorSetB.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetB.start();
    }

    public final boolean i() {
        wu impl = getImpl();
        if (impl.v.getVisibility() == 0) {
            if (impl.r != 1) {
                return false;
            }
        } else if (impl.r == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        wu impl = getImpl();
        if (impl.v.getVisibility() != 0) {
            if (impl.r != 2) {
                return false;
            }
        } else if (impl.r == 1) {
            return false;
        }
        return true;
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.i;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.j;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(l6.c(colorForState, mode));
    }

    public final void l(fb fbVar, boolean z) {
        wu impl = getImpl();
        vq2 vq2Var = fbVar == null ? null : new vq2((Object) this, (Object) fbVar, 8, false);
        FloatingActionButton floatingActionButton = impl.v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.v;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.r == 2) {
                return;
            }
        } else if (impl.r != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        int i = 0;
        boolean z2 = impl.n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (vq2Var != null) {
                ((wl2) vq2Var.g).s();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            float f = z2 ? 0.4f : 0.0f;
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        ze0 ze0Var = impl.n;
        AnimatorSet animatorSetB = ze0Var != null ? impl.b(ze0Var, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, wu.C, wu.D);
        animatorSetB.addListener(new yt(impl, z, vq2Var));
        ArrayList arrayList = impl.s;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                animatorSetB.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wu impl = getImpl();
        vu vuVar = impl.b;
        if (vuVar != null) {
            ou1.w(impl.v, vuVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().v.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.n = (sizeDimension - this.o) / 2;
        getImpl().i();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.q;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ot)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ot otVar = (ot) parcelable;
        super.onRestoreInstanceState(otVar.f);
        Bundle bundle = (Bundle) otVar.h.get("expandableWidgetHelper");
        bundle.getClass();
        h hVar = this.t;
        hVar.getClass();
        hVar.f = bundle.getBoolean("expanded", false);
        hVar.g = bundle.getInt("expandedComponentIdHint", 0);
        if (hVar.f) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) hVar.h;
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
        ot otVar = new ot(parcelableOnSaveInstanceState);
        h hVar = this.t;
        hVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", hVar.f);
        bundle.putInt("expandedComponentIdHint", hVar.g);
        otVar.h.put("expandableWidgetHelper", bundle);
        return otVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.r;
            f(rect);
            wu wuVar = this.u;
            int i = -(wuVar.f ? Math.max((wuVar.k - wuVar.v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            wu impl = getImpl();
            vu vuVar = impl.b;
            if (vuVar != null) {
                vuVar.setTintList(colorStateList);
            }
            cb cbVar = impl.d;
            if (cbVar != null) {
                if (colorStateList != null) {
                    cbVar.m = colorStateList.getColorForState(cbVar.getState(), cbVar.m);
                }
                cbVar.p = colorStateList;
                cbVar.n = true;
                cbVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            vu vuVar = getImpl().b;
            if (vuVar != null) {
                vuVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        wu impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        wu impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        wu impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.m) {
            this.m = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        vu vuVar = getImpl().b;
        if (vuVar != null) {
            vuVar.p(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.t.g = i;
    }

    public void setHideMotionSpec(ze0 ze0Var) {
        getImpl().o = ze0Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(ze0.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            wu impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
            if (this.i != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.s.l(i);
        k();
    }

    public void setMaxImageSize(int i) {
        this.o = i;
        wu impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().f();
    }

    public void setShadowPaddingEnabled(boolean z) {
        wu impl = getImpl();
        impl.g = z;
        impl.i();
    }

    @Override // defpackage.rv0
    public void setShapeAppearanceModel(su0 su0Var) {
        getImpl().h(su0Var);
    }

    public void setShowMotionSpec(ze0 ze0Var) {
        getImpl().n = ze0Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(ze0.b(getContext(), i));
    }

    public void setSize(int i) {
        this.m = 0;
        if (i != this.l) {
            this.l = i;
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
        if (this.i != colorStateList) {
            this.i = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().g();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.p != z) {
            this.p = z;
            getImpl().i();
        }
    }

    @Override // defpackage.u71, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
    public static class BaseBehavior<T extends FloatingActionButton> extends vj {
        public Rect a;
        public final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        @Override // defpackage.vj
        public final boolean e(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // defpackage.vj
        public final void g(yj yjVar) {
            if (yjVar.h == 0) {
                yjVar.h = 80;
            }
        }

        @Override // defpackage.vj
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof yj ? ((yj) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // defpackage.vj
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListK = coordinatorLayout.k(floatingActionButton);
            int size = arrayListK.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListK.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof yj ? ((yj) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i);
            Rect rect = floatingActionButton.q;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                yj yjVar = (yj) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) yjVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) yjVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) yjVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) yjVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = e61.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = e61.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            yj yjVar = (yj) floatingActionButton.getLayoutParams();
            if (!this.b || yjVar.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ko.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            yj yjVar = (yj) floatingActionButton.getLayoutParams();
            if (!this.b || yjVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((yj) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.l);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            wu impl = getImpl();
            ColorStateList colorStateList2 = this.k;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(pu1.m(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(pu1.m(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }
}
