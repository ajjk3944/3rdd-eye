package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.a71;
import defpackage.bw0;
import defpackage.c21;
import defpackage.db;
import defpackage.eb;
import defpackage.fr;
import defpackage.gb;
import defpackage.gn0;
import defpackage.hb;
import defpackage.ib;
import defpackage.jb;
import defpackage.kb;
import defpackage.l;
import defpackage.nc0;
import defpackage.ob1;
import defpackage.of3;
import defpackage.ou1;
import defpackage.qb1;
import defpackage.r4;
import defpackage.sq0;
import defpackage.su0;
import defpackage.uj;
import defpackage.uk2;
import defpackage.um;
import defpackage.wl2;
import defpackage.wq0;
import defpackage.yj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements uj {
    public static final /* synthetic */ int z0 = 0;
    public Integer c0;
    public final nc0 d0;
    public AnimatorSet e0;
    public AnimatorSet f0;
    public int g0;
    public int h0;
    public int i0;
    public final int j0;
    public int k0;
    public int l0;
    public final boolean m0;
    public boolean n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public boolean r0;
    public boolean s0;
    public Behavior t0;
    public int u0;
    public int v0;
    public int w0;
    public final eb x0;
    public final of3 y0;

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        super(um.z(context, attributeSet, R.attr.bottomAppBarStyle, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, R.attr.bottomAppBarStyle);
        nc0 nc0Var = new nc0();
        this.d0 = nc0Var;
        this.r0 = false;
        this.s0 = true;
        this.x0 = new eb(this, 0);
        this.y0 = new of3(2, this);
        Context context2 = getContext();
        TypedArray typedArrayS = uk2.s(context2, attributeSet, gn0.d, R.attr.bottomAppBarStyle, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateListE = ob1.e(context2, typedArrayS, 1);
        if (typedArrayS.hasValue(12)) {
            setNavigationIconTint(typedArrayS.getColor(12, -1));
        }
        int dimensionPixelSize = typedArrayS.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = typedArrayS.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = typedArrayS.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = typedArrayS.getDimensionPixelOffset(9, 0);
        this.g0 = typedArrayS.getInt(3, 0);
        this.h0 = typedArrayS.getInt(6, 0);
        this.i0 = typedArrayS.getInt(5, 1);
        this.m0 = typedArrayS.getBoolean(16, true);
        this.l0 = typedArrayS.getInt(11, 0);
        this.n0 = typedArrayS.getBoolean(10, false);
        this.o0 = typedArrayS.getBoolean(13, false);
        this.p0 = typedArrayS.getBoolean(14, false);
        this.q0 = typedArrayS.getBoolean(15, false);
        this.k0 = typedArrayS.getDimensionPixelOffset(4, -1);
        boolean z = typedArrayS.getBoolean(0, true);
        typedArrayS.recycle();
        this.j0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        kb kbVar = new kb(0);
        kbVar.z = -1.0f;
        kbVar.v = dimensionPixelOffset;
        kbVar.u = dimensionPixelOffset2;
        kbVar.u(dimensionPixelOffset3);
        kbVar.y = 0.0f;
        wq0 wq0Var = new wq0();
        wq0 wq0Var2 = new wq0();
        wq0 wq0Var3 = new wq0();
        wq0 wq0Var4 = new wq0();
        l lVar = new l(0.0f);
        l lVar2 = new l(0.0f);
        l lVar3 = new l(0.0f);
        l lVar4 = new l(0.0f);
        fr frVar = new fr(0);
        fr frVar2 = new fr(0);
        fr frVar3 = new fr(0);
        su0 su0Var = new su0();
        su0Var.a = wq0Var;
        su0Var.b = wq0Var2;
        su0Var.c = wq0Var3;
        su0Var.d = wq0Var4;
        su0Var.e = lVar;
        su0Var.f = lVar2;
        su0Var.g = lVar3;
        su0Var.h = lVar4;
        su0Var.i = kbVar;
        su0Var.j = frVar;
        su0Var.k = frVar2;
        su0Var.l = frVar3;
        nc0Var.setShapeAppearanceModel(su0Var);
        if (z) {
            nc0Var.u(2);
        } else {
            nc0Var.u(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        Paint.Style style = Paint.Style.FILL;
        nc0Var.s();
        nc0Var.m(context2);
        nc0Var.setTintList(colorStateListE);
        setElevation(dimensionPixelSize);
        setBackground(nc0Var);
        sq0 sq0Var = new sq0(3, this);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gn0.n, R.attr.bottomAppBarStyle, R.style.Widget_MaterialComponents_BottomAppBar);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
        qb1.h(this, new a71(z2, z3, z4, sq0Var));
    }

    public static void K(BottomAppBar bottomAppBar, View view) {
        yj yjVar = (yj) view.getLayoutParams();
        yjVar.d = 17;
        int i = bottomAppBar.i0;
        if (i == 1) {
            yjVar.d = 49;
        }
        if (i == 0) {
            yjVar.d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.u0;
    }

    private int getFabAlignmentAnimationDuration() {
        return wl2.t(getContext(), R.attr.motionDurationLong2, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return D(this.g0);
    }

    private float getFabTranslationY() {
        if (this.i0 == 1) {
            return -getTopEdgeTreatment().x;
        }
        return B() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.w0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.v0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public kb getTopEdgeTreatment() {
        return (kb) this.d0.g.a.i;
    }

    public final View B() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((bw0) coordinatorLayout.g.h).get(this);
        ArrayList arrayList = coordinatorLayout.i;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if (view instanceof FloatingActionButton) {
                return view;
            }
        }
        return null;
    }

    public final int C(ActionMenuView actionMenuView, int i, boolean z) throws Resources.NotFoundException {
        int i2 = 0;
        if (this.l0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean z2 = getLayoutDirection() == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof c21) && (((c21) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z2 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i4 = z2 ? this.v0 : -this.w0;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!z2) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i2 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i4) + i2);
    }

    public final float D(int i) {
        boolean z = getLayoutDirection() == 1;
        if (i != 1) {
            return 0.0f;
        }
        View viewB = B();
        int i2 = z ? this.w0 : this.v0;
        return ((getMeasuredWidth() / 2) - ((this.k0 == -1 || viewB == null) ? this.j0 + i2 : ((viewB.getMeasuredWidth() / 2) + this.k0) + i2)) * (z ? -1 : 1);
    }

    public final boolean E() {
        View viewB = B();
        FloatingActionButton floatingActionButton = viewB != null ? (FloatingActionButton) viewB : null;
        return floatingActionButton != null && floatingActionButton.j();
    }

    public final void F(int i, boolean z) {
        if (!isLaidOut()) {
            this.r0 = false;
            return;
        }
        AnimatorSet animatorSet = this.f0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!E()) {
            i = 0;
            z = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        int i2 = 2;
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - C(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new hb(this, actionMenuView, i, z));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.f0 = animatorSet3;
        animatorSet3.addListener(new eb(this, i2));
        this.f0.start();
    }

    public final void G() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (E()) {
            J(actionMenuView, this.g0, this.s0, false);
        } else {
            J(actionMenuView, 0, false, false);
        }
    }

    public final void H() {
        getTopEdgeTreatment().y = getFabTranslationX();
        this.d0.r((this.s0 && E() && this.i0 == 1) ? 1.0f : 0.0f);
        View viewB = B();
        if (viewB != null) {
            viewB.setTranslationY(getFabTranslationY());
            viewB.setTranslationX(getFabTranslationX());
        }
    }

    public final void I(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().w) {
            getTopEdgeTreatment().w = f;
            this.d0.invalidateSelf();
        }
    }

    public final void J(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        ib ibVar = new ib(this, actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(ibVar);
        } else {
            ibVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.d0.g.f;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().x;
    }

    public int getFabAlignmentMode() {
        return this.g0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.k0;
    }

    public int getFabAnchorMode() {
        return this.i0;
    }

    public int getFabAnimationMode() {
        return this.h0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().v;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().u;
    }

    public boolean getHideOnScroll() {
        return this.n0;
    }

    public int getMenuAlignmentMode() {
        return this.l0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ou1.w(this, this.d0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.f0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.e0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            H();
            View viewB = B();
            if (viewB != null && viewB.isLaidOut()) {
                viewB.post(new db(viewB, 0));
            }
        }
        G();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof jb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jb jbVar = (jb) parcelable;
        super.onRestoreInstanceState(jbVar.f);
        this.g0 = jbVar.h;
        this.s0 = jbVar.i;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        jb jbVar = new jb(super.onSaveInstanceState());
        jbVar.h = this.g0;
        jbVar.i = this.s0;
        return jbVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.d0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().u(f);
            this.d0.invalidateSelf();
            H();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        nc0 nc0Var = this.d0;
        nc0Var.p(f);
        int i = nc0Var.g.p - nc0Var.i();
        Behavior behavior = getBehavior();
        behavior.k = i;
        if (behavior.j == 1) {
            setTranslationY(behavior.f + i);
        }
    }

    public void setFabAlignmentMode(int i) {
        int i2 = 1;
        this.r0 = true;
        F(i, this.s0);
        if (this.g0 != i && isLaidOut()) {
            AnimatorSet animatorSet = this.e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.h0 == 1) {
                View viewB = B();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewB != null ? (FloatingActionButton) viewB : null, "translationX", D(i));
                objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(objectAnimatorOfFloat);
            } else {
                View viewB2 = B();
                FloatingActionButton floatingActionButton = viewB2 != null ? (FloatingActionButton) viewB2 : null;
                if (floatingActionButton != null && !floatingActionButton.i()) {
                    floatingActionButton.h(new gb(this, i), true);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setInterpolator(wl2.u(getContext(), R.attr.motionEasingEmphasizedInterpolator, r4.a));
            this.e0 = animatorSet2;
            animatorSet2.addListener(new eb(this, i2));
            this.e0.start();
        }
        this.g0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.k0 != i) {
            this.k0 = i;
            H();
        }
    }

    public void setFabAnchorMode(int i) {
        this.i0 = i;
        H();
        View viewB = B();
        if (viewB != null) {
            K(this, viewB);
            viewB.requestLayout();
            this.d0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.h0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().z) {
            getTopEdgeTreatment().z = f;
            this.d0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().v = f;
            this.d0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().u = f;
            this.d0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.n0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.l0 != i) {
            this.l0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                J(actionMenuView, this.g0, E(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.c0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.c0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.c0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // defpackage.uj
    public Behavior getBehavior() {
        if (this.t0 == null) {
            this.t0 = new Behavior();
        }
        return this.t0;
    }

    /* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect m;
        public WeakReference n;
        public int o;
        public final a p;

        public Behavior() {
            this.p = new a(this);
            this.m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.vj
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.n = new WeakReference(bottomAppBar);
            int i2 = BottomAppBar.z0;
            View viewB = bottomAppBar.B();
            if (viewB != null && !viewB.isLaidOut()) {
                BottomAppBar.K(bottomAppBar, viewB);
                this.o = ((ViewGroup.MarginLayoutParams) ((yj) viewB.getLayoutParams())).bottomMargin;
                FloatingActionButton floatingActionButton = (FloatingActionButton) viewB;
                if (bottomAppBar.i0 == 0 && bottomAppBar.m0) {
                    floatingActionButton.setElevation(0.0f);
                    floatingActionButton.setCompatElevation(0.0f);
                }
                if (floatingActionButton.getShowMotionSpec() == null) {
                    floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                }
                if (floatingActionButton.getHideMotionSpec() == null) {
                    floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                }
                floatingActionButton.c(bottomAppBar.x0);
                floatingActionButton.d(new eb(bottomAppBar, 3));
                floatingActionButton.e(bottomAppBar.y0);
                viewB.addOnLayoutChangeListener(this.p);
                bottomAppBar.H();
            }
            coordinatorLayout.r(bottomAppBar, i);
            super.l(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.vj
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.t(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.p = new a(this);
            this.m = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
