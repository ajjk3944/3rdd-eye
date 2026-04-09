package com.google.android.material.floatingactionbutton;

import ad.g;
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
import androidx.recyclerview.widget.v;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.liuzh.deviceinfo.R;
import e4.v0;
import ed.y;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jc.d;
import km.i;
import p.s;
import p3.b;
import xc.a;
import yc.e;
import yc.f;
import zc.c;
import zc.m;
import zc.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class FloatingActionButton extends o implements a, y, p3.a {

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f20516b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f20517c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f20518d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f20519e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f20520f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f20521h;

    /* renamed from: i, reason: collision with root package name */
    public int f20522i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20523k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f20524l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f20525m;

    /* renamed from: n, reason: collision with root package name */
    public final a0 f20526n;

    /* renamed from: o, reason: collision with root package name */
    public final p.a f20527o;

    /* renamed from: p, reason: collision with root package name */
    public f f20528p;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
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
        super(md.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f38237a = getVisibility();
        this.f20524l = new Rect();
        this.f20525m = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayG = m.g(context2, attributeSet, ic.a.f25950k, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f20516b = jm.a.j(context2, typedArrayG, 1);
        this.f20517c = m.h(typedArrayG.getInt(2, -1), null);
        this.f20520f = jm.a.j(context2, typedArrayG, 12);
        this.g = typedArrayG.getInt(7, -1);
        this.f20521h = typedArrayG.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayG.getDimensionPixelSize(3, 0);
        float dimension = typedArrayG.getDimension(4, 0.0f);
        float dimension2 = typedArrayG.getDimension(9, 0.0f);
        float dimension3 = typedArrayG.getDimension(11, 0.0f);
        this.f20523k = typedArrayG.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayG.getDimensionPixelSize(10, 0));
        d dVarA = d.a(context2, typedArrayG, 15);
        d dVarA2 = d.a(context2, typedArrayG, 8);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ic.a.f25963x, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ed.o oVarA = ed.o.b(context2, resourceId, resourceId2, ed.o.f23352m).a();
        boolean z3 = typedArrayG.getBoolean(5, false);
        setEnabled(typedArrayG.getBoolean(0, true));
        typedArrayG.recycle();
        a0 a0Var = new a0(this);
        this.f20526n = a0Var;
        a0Var.j(attributeSet, R.attr.floatingActionButtonStyle);
        this.f20527o = new p.a(this);
        getImpl().g(oVarA);
        f impl = getImpl();
        ColorStateList colorStateList2 = this.f20516b;
        PorterDuff.Mode mode = this.f20517c;
        ColorStateList colorStateList3 = this.f20520f;
        FloatingActionButton floatingActionButton = impl.f37562s;
        ed.o oVar = impl.f37546a;
        oVar.getClass();
        e eVar = new e(oVar);
        impl.f37547b = eVar;
        eVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.f37547b.setTintMode(mode);
        }
        impl.f37547b.l(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            ed.o oVar2 = impl.f37546a;
            oVar2.getClass();
            yc.a aVar = new yc.a(oVar2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            aVar.f37525i = color;
            aVar.j = color2;
            aVar.f37526k = color3;
            aVar.f37527l = color4;
            float f10 = dimensionPixelSize;
            if (aVar.f37524h != f10) {
                aVar.f37524h = f10;
                aVar.f37519b.setStrokeWidth(f10 * 1.3333f);
                aVar.f37529n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList2 != null) {
                aVar.f37528m = colorStateList2.getColorForState(aVar.getState(), aVar.f37528m);
            }
            aVar.f37531p = colorStateList2;
            aVar.f37529n = true;
            aVar.invalidateSelf();
            impl.f37549d = aVar;
            yc.a aVar2 = impl.f37549d;
            aVar2.getClass();
            e eVar2 = impl.f37547b;
            eVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{aVar2, eVar2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.f37549d = null;
            layerDrawable = impl.f37547b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(cd.a.b(colorStateList), layerDrawable, drawable);
        impl.f37548c = rippleDrawable;
        impl.f37550e = rippleDrawable;
        getImpl().f37554k = dimensionPixelSize2;
        f impl2 = getImpl();
        if (impl2.f37552h != dimension) {
            impl2.f37552h = dimension;
            impl2.e(dimension, impl2.f37553i, impl2.j);
        }
        f impl3 = getImpl();
        if (impl3.f37553i != dimension2) {
            impl3.f37553i = dimension2;
            impl3.e(impl3.f37552h, dimension2, impl3.j);
        }
        f impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.f37552h, impl4.f37553i, dimension3);
        }
        getImpl().f37557n = dVarA;
        getImpl().f37558o = dVarA2;
        getImpl().f37551f = z3;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private f getImpl() {
        if (this.f20528p == null) {
            this.f20528p = new f(this, new i(29, this));
        }
        return this.f20528p;
    }

    public final int c(int i4) {
        int i10 = this.f20521h;
        if (i10 != 0) {
            return i10;
        }
        Resources resources = getResources();
        return i4 != -1 ? i4 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        f impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f37562s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f37561r == 1) {
                return;
            }
        } else if (impl.f37561r != 2) {
            return;
        }
        Animator animator = impl.f37556m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.f37562s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        d dVar = impl.f37558o;
        AnimatorSet animatorSetB = dVar != null ? impl.b(dVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, f.B, f.C);
        animatorSetB.addListener(new v(impl));
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
        ColorStateList colorStateList = this.f20518d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f20519e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(s.c(colorForState, mode));
    }

    public final void f() {
        f impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f37562s;
        Matrix matrix = impl.f37567x;
        FloatingActionButton floatingActionButton2 = impl.f37562s;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f37561r == 2) {
                return;
            }
        } else if (impl.f37561r != 1) {
            return;
        }
        Animator animator = impl.f37556m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z3 = impl.f37557n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f37559p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z3 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z3 ? 0.4f : 0.0f);
            float f10 = z3 ? 0.4f : 0.0f;
            impl.f37559p = f10;
            impl.a(f10, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        d dVar = impl.f37557n;
        AnimatorSet animatorSetB = dVar != null ? impl.b(dVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, f.f37545z, f.A);
        animatorSetB.addListener(new g(16, impl));
        animatorSetB.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f20516b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f20517c;
    }

    @Override // p3.a
    public b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f37562s.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f37553i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().f37550e;
    }

    public int getCustomSize() {
        return this.f20521h;
    }

    public int getExpandedComponentIdHint() {
        return this.f20527o.f30606b;
    }

    public d getHideMotionSpec() {
        return getImpl().f37558o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f20520f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f20520f;
    }

    public ed.o getShapeAppearanceModel() {
        ed.o oVar = getImpl().f37546a;
        oVar.getClass();
        return oVar;
    }

    public d getShowMotionSpec() {
        return getImpl().f37557n;
    }

    public int getSize() {
        return this.g;
    }

    public int getSizeDimension() {
        return c(this.g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f20518d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f20519e;
    }

    public boolean getUseCompatPadding() {
        return this.f20523k;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f impl = getImpl();
        e eVar = impl.f37547b;
        if (eVar != null) {
            ii.a.E(impl.f37562s, eVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().f37562s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i10) {
        int sizeDimension = getSizeDimension();
        this.f20522i = (sizeDimension - this.j) / 2;
        getImpl().h();
        int iMin = Math.min(View.resolveSize(sizeDimension, i4), View.resolveSize(sizeDimension, i10));
        Rect rect = this.f20524l;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof id.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        id.a aVar = (id.a) parcelable;
        super.onRestoreInstanceState(aVar.f28876a);
        Bundle bundle = (Bundle) aVar.f25966c.get("expandableWidgetHelper");
        bundle.getClass();
        p.a aVar2 = this.f20527o;
        aVar2.getClass();
        aVar2.f30605a = bundle.getBoolean("expanded", false);
        aVar2.f30606b = bundle.getInt("expandedComponentIdHint", 0);
        if (aVar2.f30605a) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) aVar2.f30607c;
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
        id.a aVar = new id.a(parcelableOnSaveInstanceState);
        p.a aVar2 = this.f20527o;
        aVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", aVar2.f30605a);
        bundle.putInt("expandedComponentIdHint", aVar2.f30606b);
        aVar.f25966c.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f20525m;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i4 = rect.left;
            Rect rect2 = this.f20524l;
            rect.left = i4 + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            f fVar = this.f20528p;
            int i10 = -(fVar.f37551f ? Math.max((fVar.f37554k - fVar.f37562s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i10, i10);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f20516b != colorStateList) {
            this.f20516b = colorStateList;
            f impl = getImpl();
            e eVar = impl.f37547b;
            if (eVar != null) {
                eVar.setTintList(colorStateList);
            }
            yc.a aVar = impl.f37549d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f37528m = colorStateList.getColorForState(aVar.getState(), aVar.f37528m);
                }
                aVar.f37531p = colorStateList;
                aVar.f37529n = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f20517c != mode) {
            this.f20517c = mode;
            e eVar = getImpl().f37547b;
            if (eVar != null) {
                eVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        f impl = getImpl();
        if (impl.f37552h != f10) {
            impl.f37552h = f10;
            impl.e(f10, impl.f37553i, impl.j);
        }
    }

    public void setCompatElevationResource(int i4) {
        setCompatElevation(getResources().getDimension(i4));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        f impl = getImpl();
        if (impl.f37553i != f10) {
            impl.f37553i = f10;
            impl.e(impl.f37552h, f10, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i4) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i4));
    }

    public void setCompatPressedTranslationZ(float f10) {
        f impl = getImpl();
        if (impl.j != f10) {
            impl.j = f10;
            impl.e(impl.f37552h, impl.f37553i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i4) {
        setCompatPressedTranslationZ(getResources().getDimension(i4));
    }

    public void setCustomSize(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i4 != this.f20521h) {
            this.f20521h = i4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        e eVar = getImpl().f37547b;
        if (eVar != null) {
            eVar.n(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        if (z3 != getImpl().f37551f) {
            getImpl().f37551f = z3;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i4) {
        this.f20527o.f30606b = i4;
    }

    public void setHideMotionSpec(d dVar) {
        getImpl().f37558o = dVar;
    }

    public void setHideMotionSpecResource(int i4) {
        setHideMotionSpec(d.b(i4, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            f impl = getImpl();
            float f10 = impl.f37559p;
            impl.f37559p = f10;
            Matrix matrix = impl.f37567x;
            impl.a(f10, matrix);
            impl.f37562s.setImageMatrix(matrix);
            if (this.f20518d != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        this.f20526n.m(i4);
        e();
    }

    public void setMaxImageSize(int i4) {
        this.j = i4;
        f impl = getImpl();
        if (impl.f37560q != i4) {
            impl.f37560q = i4;
            float f10 = impl.f37559p;
            impl.f37559p = f10;
            Matrix matrix = impl.f37567x;
            impl.a(f10, matrix);
            impl.f37562s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i4) {
        setRippleColor(ColorStateList.valueOf(i4));
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

    public void setShadowPaddingEnabled(boolean z3) {
        f impl = getImpl();
        impl.g = z3;
        impl.h();
    }

    @Override // ed.y
    public void setShapeAppearanceModel(ed.o oVar) {
        getImpl().g(oVar);
    }

    public void setShowMotionSpec(d dVar) {
        getImpl().f37557n = dVar;
    }

    public void setShowMotionSpecResource(int i4) {
        setShowMotionSpec(d.b(i4, getContext()));
    }

    public void setSize(int i4) {
        this.f20521h = 0;
        if (i4 != this.g) {
            this.g = i4;
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
        if (this.f20518d != colorStateList) {
            this.f20518d = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f20519e != mode) {
            this.f20519e = mode;
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

    public void setUseCompatPadding(boolean z3) {
        if (this.f20523k != z3) {
            this.f20523k = z3;
            getImpl().h();
        }
    }

    @Override // zc.o, android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class BaseBehavior<T extends FloatingActionButton> extends b {

        /* renamed from: a, reason: collision with root package name */
        public Rect f20529a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20530b;

        public BaseBehavior() {
            this.f20530b = true;
        }

        @Override // p3.b
        public final boolean e(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f20524l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // p3.b
        public final void g(p3.e eVar) {
            if (eVar.f31153h == 0) {
                eVar.f31153h = 80;
            }
        }

        @Override // p3.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof p3.e ? ((p3.e) layoutParams).f31147a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // p3.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListK = coordinatorLayout.k(floatingActionButton);
            int size = arrayListK.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) arrayListK.get(i11);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof p3.e ? ((p3.e) layoutParams).f31147a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(i4, floatingActionButton);
            Rect rect = floatingActionButton.f20524l;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                p3.e eVar = (p3.e) floatingActionButton.getLayoutParams();
                int i12 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i10 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i10 = -rect.top;
                }
                if (i10 != 0) {
                    WeakHashMap weakHashMap = v0.f22405a;
                    floatingActionButton.offsetTopAndBottom(i10);
                }
                if (i12 != 0) {
                    WeakHashMap weakHashMap2 = v0.f22405a;
                    floatingActionButton.offsetLeftAndRight(i12);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            p3.e eVar = (p3.e) floatingActionButton.getLayoutParams();
            if (!this.f20530b || eVar.f31152f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f20529a == null) {
                this.f20529a = new Rect();
            }
            Rect rect = this.f20529a;
            ThreadLocal threadLocal = c.f38205a;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            c.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            p3.e eVar = (p3.e) floatingActionButton.getLayoutParams();
            if (!this.f20530b || eVar.f31152f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((p3.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.f25951l);
            this.f20530b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f20520f != colorStateList) {
            this.f20520f = colorStateList;
            f impl = getImpl();
            ColorStateList colorStateList2 = this.f20520f;
            RippleDrawable rippleDrawable = impl.f37548c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(cd.a.b(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(cd.a.b(colorStateList2));
            }
        }
    }
}
