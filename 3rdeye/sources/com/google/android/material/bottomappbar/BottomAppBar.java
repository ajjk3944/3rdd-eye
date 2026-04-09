package com.google.android.material.bottomappbar;

import D0.a;
import E.u;
import L0.I;
import L0.S;
import O3.c;
import O3.d;
import O3.e;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d4.n;
import f4.C4334b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import m0.C5316i;

/* loaded from: classes2.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f22512j0 = 0;

    /* renamed from: V, reason: collision with root package name */
    public Integer f22513V;

    /* renamed from: W, reason: collision with root package name */
    public AnimatorSet f22514W;

    /* renamed from: a0, reason: collision with root package name */
    public AnimatorSet f22515a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f22516b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f22517c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f22518d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f22519e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f22520f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f22521g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f22522h0;

    /* renamed from: i0, reason: collision with root package name */
    public Behavior f22523i0;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f22528b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f22529c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f22530d;

        public a(ActionMenuView actionMenuView, int i, boolean z10) {
            this.f22528b = actionMenuView;
            this.f22529c = i;
            this.f22530d = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f22529c;
            boolean z10 = this.f22530d;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            this.f22528b.setTranslationX(bottomAppBar.A(r3, i, z10));
        }
    }

    public static class b extends U0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public int f22532d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22533e;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new b[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22532d = parcel.readInt();
            this.f22533e = parcel.readInt() != 0;
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f22532d);
            parcel.writeInt(this.f22533e ? 1 : 0);
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
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return C4334b.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return B(this.f22516b0);
    }

    private float getFabTranslationY() {
        if (this.f22518d0 == 1) {
            return -getTopEdgeTreatment().f10224e;
        }
        return z() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private e getTopEdgeTreatment() {
        throw null;
    }

    public final int A(ActionMenuView actionMenuView, int i, boolean z10) throws Resources.NotFoundException {
        int i10 = 0;
        if (this.f22520f0 != 1 && (i != 1 || !z10)) {
            return 0;
        }
        boolean zA = n.a(this);
        int measuredWidth = zA ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f37966a & 8388615) == 8388611) {
                measuredWidth = zA ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zA ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            i10 = zA ? dimensionPixelOffset : -dimensionPixelOffset;
        }
        return measuredWidth - (right + i10);
    }

    public final float B(int i) {
        boolean zA = n.a(this);
        if (i != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((this.f22519e0 == -1 || z() == null) ? 0 : (r5.getMeasuredWidth() / 2) + this.f22519e0)) * (zA ? -1 : 1);
    }

    public final boolean C() {
        View viewZ = z();
        FloatingActionButton floatingActionButton = viewZ instanceof FloatingActionButton ? (FloatingActionButton) viewZ : null;
        return floatingActionButton != null && floatingActionButton.j();
    }

    public final void D() {
        e topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f22522h0 && C()) {
            int i = this.f22518d0;
        }
        throw null;
    }

    public final void E(int i) {
        float f10 = i;
        if (f10 == getTopEdgeTreatment().f10223d) {
            return;
        }
        getTopEdgeTreatment().f10223d = f10;
        throw null;
    }

    public final void F(ActionMenuView actionMenuView, int i, boolean z10, boolean z11) {
        a aVar = new a(actionMenuView, i, z10);
        if (z11) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f10224e;
    }

    public int getFabAlignmentMode() {
        return this.f22516b0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f22519e0;
    }

    public int getFabAnchorMode() {
        return this.f22518d0;
    }

    public int getFabAnimationMode() {
        return this.f22517c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f10222c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f10221b;
    }

    public boolean getHideOnScroll() {
        return this.f22521g0;
    }

    public int getMenuAlignmentMode() {
        return this.f22520f0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.N(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        if (z10) {
            AnimatorSet animatorSet = this.f22515a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f22514W;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            D();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f22515a0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (C()) {
            F(actionMenuView, this.f22516b0, this.f22522h0, false);
        } else {
            F(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f12348b);
        this.f22516b0 = bVar.f22532d;
        this.f22522h0 = bVar.f22533e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f22532d = this.f22516b0;
        bVar.f22533e = this.f22522h0;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.C0009a.h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            e topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f10224e = f10;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i10;
        boolean z10 = this.f22522h0;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.f22515a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (C()) {
                i10 = i;
            } else {
                z10 = false;
                i10 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - A(actionMenuView, i10, z10)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new c(this, actionMenuView, i10, z10));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.f22515a0 = animatorSet3;
            animatorSet3.addListener(new N3.a(this, 1));
            this.f22515a0.start();
        }
        if (this.f22516b0 != i && isLaidOut()) {
            AnimatorSet animatorSet4 = this.f22514W;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f22517c0 == 1) {
                View viewZ = z();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewZ instanceof FloatingActionButton ? (FloatingActionButton) viewZ : null, "translationX", B(i));
                objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewZ2 = z();
                FloatingActionButton floatingActionButton = viewZ2 instanceof FloatingActionButton ? (FloatingActionButton) viewZ2 : null;
                if (floatingActionButton != null && !floatingActionButton.i()) {
                    floatingActionButton.h(new O3.b(this, i), true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            animatorSet5.setInterpolator(C4334b.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, L3.a.f4034a));
            this.f22514W = animatorSet5;
            animatorSet5.addListener(new O3.a(this));
            this.f22514W.start();
        }
        this.f22516b0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.f22519e0 == i) {
            return;
        }
        this.f22519e0 = i;
        D();
        throw null;
    }

    public void setFabAnchorMode(int i) {
        this.f22518d0 = i;
        D();
        throw null;
    }

    public void setFabAnimationMode(int i) {
        this.f22517c0 = i;
    }

    public void setFabCornerSize(float f10) {
        if (f10 == getTopEdgeTreatment().f10225f) {
            return;
        }
        getTopEdgeTreatment().f10225f = f10;
        throw null;
    }

    public void setFabCradleMargin(float f10) {
        if (f10 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f10222c = f10;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f10221b = f10;
        throw null;
    }

    public void setHideOnScroll(boolean z10) {
        this.f22521g0 = z10;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f22520f0 != i) {
            this.f22520f0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                F(actionMenuView, this.f22516b0, C(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f22513V != null) {
            drawable = drawable.mutate();
            a.C0009a.g(drawable, this.f22513V.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f22513V = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public final View z() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((C5316i) coordinatorLayout.f15449c.f1911b).get(this);
        ArrayList arrayList = coordinatorLayout.f15451e;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f22523i0 == null) {
            this.f22523i0 = new Behavior();
        }
        return this.f22523i0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect i;

        /* renamed from: j, reason: collision with root package name */
        public WeakReference<BottomAppBar> f22524j;

        /* renamed from: k, reason: collision with root package name */
        public int f22525k;

        /* renamed from: l, reason: collision with root package name */
        public final a f22526l;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f22524j.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    int measuredWidth = floatingActionButton.getMeasuredWidth();
                    int measuredHeight = floatingActionButton.getMeasuredHeight();
                    Rect rect = behavior.i;
                    rect.set(0, 0, measuredWidth, measuredHeight);
                    floatingActionButton.k(rect);
                    int iHeight = rect.height();
                    bottomAppBar.E(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f43804e.a(new RectF(rect)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (behavior.f22525k == 0) {
                    if (bottomAppBar.f22518d0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (n.a(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
                    }
                }
                int i17 = BottomAppBar.f22512j0;
                bottomAppBar.D();
                throw null;
            }
        }

        public Behavior() {
            this.f22526l = new a();
            this.i = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f22524j = new WeakReference<>(bottomAppBar);
            int i10 = BottomAppBar.f22512j0;
            View viewZ = bottomAppBar.z();
            if (viewZ != null) {
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                if (!viewZ.isLaidOut()) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewZ.getLayoutParams();
                    fVar.f15471d = 17;
                    int i11 = bottomAppBar.f22518d0;
                    if (i11 == 1) {
                        fVar.f15471d = 49;
                    }
                    if (i11 == 0) {
                        fVar.f15471d |= 80;
                    }
                    this.f22525k = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewZ.getLayoutParams())).bottomMargin;
                    if (viewZ instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewZ;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.d();
                        floatingActionButton.e(new d(bottomAppBar, 0));
                        floatingActionButton.f();
                    }
                    viewZ.addOnLayoutChangeListener(this.f22526l);
                    bottomAppBar.D();
                    throw null;
                }
            }
            coordinatorLayout.r(i, bottomAppBar);
            super.h(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22526l = new a();
            this.i = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
