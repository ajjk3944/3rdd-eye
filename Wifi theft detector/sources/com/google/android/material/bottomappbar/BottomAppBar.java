package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.z;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.shape.MaterialShapeDrawable;
import j4.k;
import j4.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: x0, reason: collision with root package name */
    public static final int f9937x0 = k.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f9938y0 = j4.b.motionDurationLong2;

    /* renamed from: z0, reason: collision with root package name */
    public static final int f9939z0 = j4.b.motionEasingEmphasizedInterpolator;
    public Integer U;
    public final MaterialShapeDrawable V;
    public Animator W;

    /* renamed from: a0, reason: collision with root package name */
    public Animator f9940a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f9941b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f9942c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f9943d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f9944e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f9945f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f9946g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f9947h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f9948i0;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f9949j0;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f9950k0;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f9951l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f9952m0;

    /* renamed from: n0, reason: collision with root package name */
    public ArrayList f9953n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f9954o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f9955p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f9956q0;

    /* renamed from: r0, reason: collision with root package name */
    public Behavior f9957r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f9958s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f9959t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f9960u0;

    /* renamed from: v0, reason: collision with root package name */
    public AnimatorListenerAdapter f9961v0;

    /* renamed from: w0, reason: collision with root package name */
    public k4.k f9962w0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MenuAlignmentMode {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f9968c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9969d;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9968c);
            parcel.writeInt(this.f9969d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9968c = parcel.readInt();
            this.f9969d = parcel.readInt() != 0;
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.f9955p0) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.P0(bottomAppBar.f9941b0, BottomAppBar.this.f9956q0);
        }
    }

    public class b implements k4.k {
        public b() {
        }

        @Override // k4.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(FloatingActionButton floatingActionButton) {
            BottomAppBar.this.V.j0((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f9943d0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // k4.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.f9943d0 != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().j() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().p(translationX);
                BottomAppBar.this.V.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().c() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().k(fMax);
                BottomAppBar.this.V.invalidateSelf();
            }
            BottomAppBar.this.V.j0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    public class c implements d0.d {
        public c() {
        }

        @Override // com.google.android.material.internal.d0.d
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, d0.e eVar) {
            boolean z10;
            if (BottomAppBar.this.f9949j0) {
                BottomAppBar.this.f9958s0 = windowInsetsCompat.i();
            }
            boolean z11 = false;
            if (BottomAppBar.this.f9950k0) {
                z10 = BottomAppBar.this.f9960u0 != windowInsetsCompat.j();
                BottomAppBar.this.f9960u0 = windowInsetsCompat.j();
            } else {
                z10 = false;
            }
            if (BottomAppBar.this.f9951l0) {
                boolean z12 = BottomAppBar.this.f9959t0 != windowInsetsCompat.k();
                BottomAppBar.this.f9959t0 = windowInsetsCompat.k();
                z11 = z12;
            }
            if (!z10 && !z11) {
                return windowInsetsCompat;
            }
            BottomAppBar.this.E0();
            BottomAppBar.this.U0();
            BottomAppBar.this.T0();
            return windowInsetsCompat;
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.I0();
            BottomAppBar.this.W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.J0();
        }
    }

    public class e extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f9974a;

        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.I0();
            }
        }

        public e(int i10) {
            this.f9974a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.N0(this.f9974a));
            floatingActionButton.q(new a());
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.I0();
            BottomAppBar.this.f9955p0 = false;
            BottomAppBar.this.f9940a0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.J0();
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9978a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f9979b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f9980c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f9981d;

        public g(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f9979b = actionMenuView;
            this.f9980c = i10;
            this.f9981d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9978a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f9978a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f9954o0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.S0(bottomAppBar.f9954o0);
            BottomAppBar.this.Y0(this.f9979b, this.f9980c, this.f9981d, z10);
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f9983a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9984b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f9985c;

        public h(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f9983a = actionMenuView;
            this.f9984b = i10;
            this.f9985c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9983a.setTranslationX(BottomAppBar.this.M0(r0, this.f9984b, this.f9985c));
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f9961v0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonK0 = BottomAppBar.this.K0();
            if (floatingActionButtonK0 != null) {
                floatingActionButtonK0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }

    private Drawable R0(Drawable drawable) {
        if (drawable == null || this.U == null) {
            return drawable;
        }
        Drawable drawableR = k0.a.r(drawable.mutate());
        drawableR.setTint(this.U.intValue());
        return drawableR;
    }

    public static void Z0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        eVar.f2335d = 17;
        int i10 = bottomAppBar.f9943d0;
        if (i10 == 1) {
            eVar.f2335d = 17 | 48;
        }
        if (i10 == 0) {
            eVar.f2335d |= 80;
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f9958s0;
    }

    private int getFabAlignmentAnimationDuration() {
        return b5.k.f(getContext(), f9938y0, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return N0(this.f9941b0);
    }

    private float getFabTranslationY() {
        if (this.f9943d0 == 1) {
            return -getTopEdgeTreatment().c();
        }
        return L0() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f9960u0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f9959t0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public com.google.android.material.bottomappbar.d getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.d) this.V.K().p();
    }

    public final void D0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f9961v0);
        floatingActionButton.f(new i());
        floatingActionButton.g(this.f9962w0);
    }

    public final void E0() {
        Animator animator = this.f9940a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void F0(int i10, List list) {
        FloatingActionButton floatingActionButtonK0 = K0();
        if (floatingActionButtonK0 == null || floatingActionButtonK0.m()) {
            return;
        }
        J0();
        floatingActionButtonK0.k(new e(i10));
    }

    public final void G0(int i10, List list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(K0(), "translationX", N0(i10));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    public final void H0(int i10, boolean z10, List list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - M0(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(objectAnimatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat2.addListener(new g(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
            list.add(animatorSet);
        }
    }

    public final void I0() {
        ArrayList arrayList;
        int i10 = this.f9952m0 - 1;
        this.f9952m0 = i10;
        if (i10 != 0 || (arrayList = this.f9953n0) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
    }

    public final void J0() {
        ArrayList arrayList;
        int i10 = this.f9952m0;
        this.f9952m0 = i10 + 1;
        if (i10 != 0 || (arrayList = this.f9953n0) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
    }

    public final FloatingActionButton K0() {
        View viewL0 = L0();
        if (viewL0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewL0;
        }
        return null;
    }

    public final View L0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public int M0(ActionMenuView actionMenuView, int i10, boolean z10) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.f9946g0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zL = d0.l(this);
        int measuredWidth = zL ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f336a & 8388615) == 8388611) {
                measuredWidth = zL ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zL ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zL ? this.f9959t0 : -this.f9960u0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(j4.d.m3_bottomappbar_horizontal_padding);
            if (!zL) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    public final float N0(int i10) {
        boolean zL = d0.l(this);
        if (i10 != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((zL ? this.f9960u0 : this.f9959t0) + ((this.f9945f0 == -1 || L0() == null) ? this.f9944e0 : (r6.getMeasuredWidth() / 2) + this.f9945f0))) * (zL ? -1 : 1);
    }

    public final boolean O0() {
        FloatingActionButton floatingActionButtonK0 = K0();
        return floatingActionButtonK0 != null && floatingActionButtonK0.n();
    }

    public final void P0(int i10, boolean z10) {
        if (!isLaidOut()) {
            this.f9955p0 = false;
            S0(this.f9954o0);
            return;
        }
        Animator animator = this.f9940a0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!O0()) {
            i10 = 0;
            z10 = false;
        }
        H0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f9940a0 = animatorSet;
        animatorSet.addListener(new f());
        this.f9940a0.start();
    }

    public final void Q0(int i10) {
        if (this.f9941b0 == i10 || !isLaidOut()) {
            return;
        }
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f9942c0 == 1) {
            G0(i10, arrayList);
        } else {
            F0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(b5.k.g(getContext(), f9939z0, k4.a.f21834a));
        this.W = animatorSet;
        animatorSet.addListener(new d());
        this.W.start();
    }

    public void S0(int i10) {
        if (i10 != 0) {
            this.f9954o0 = 0;
            getMenu().clear();
            x(i10);
        }
    }

    public final void T0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f9940a0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (O0()) {
            X0(actionMenuView, this.f9941b0, this.f9956q0);
        } else {
            X0(actionMenuView, 0, false);
        }
    }

    public final void U0() {
        getTopEdgeTreatment().p(getFabTranslationX());
        this.V.j0((this.f9956q0 && O0() && this.f9943d0 == 1) ? 1.0f : 0.0f);
        View viewL0 = L0();
        if (viewL0 != null) {
            viewL0.setTranslationY(getFabTranslationY());
            viewL0.setTranslationX(getFabTranslationX());
        }
    }

    public void V0(int i10, int i11) {
        this.f9954o0 = i11;
        this.f9955p0 = true;
        P0(i10, this.f9956q0);
        Q0(i10);
        this.f9941b0 = i10;
    }

    public boolean W0(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().i()) {
            return false;
        }
        getTopEdgeTreatment().o(f10);
        this.V.invalidateSelf();
        return true;
    }

    public final void X0(ActionMenuView actionMenuView, int i10, boolean z10) {
        Y0(actionMenuView, i10, z10, false);
    }

    public final void Y0(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        h hVar = new h(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.V.O();
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.f9941b0;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.f9945f0;
    }

    public int getFabAnchorMode() {
        return this.f9943d0;
    }

    public int getFabAnimationMode() {
        return this.f9942c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f();
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.f9948i0;
    }

    public int getMenuAlignmentMode() {
        return this.f9946g0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5.h.f(this, this.V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            E0();
            U0();
            final View viewL0 = L0();
            if (viewL0 != null && viewL0.isLaidOut()) {
                viewL0.post(new Runnable() { // from class: com.google.android.material.bottomappbar.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewL0.requestLayout();
                    }
                });
            }
        }
        T0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        this.f9941b0 = savedState.f9968c;
        this.f9956q0 = savedState.f9969d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9968c = this.f9941b0;
        savedState.f9969d = this.f9956q0;
        return savedState;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        this.V.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().k(f10);
            this.V.invalidateSelf();
            U0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.V.h0(f10);
        getBehavior().R(this, this.V.J() - this.V.I());
    }

    public void setFabAlignmentMode(int i10) {
        V0(i10, 0);
    }

    public void setFabAlignmentModeEndMargin(@Px int i10) {
        if (this.f9945f0 != i10) {
            this.f9945f0 = i10;
            U0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f9943d0 = i10;
        U0();
        View viewL0 = L0();
        if (viewL0 != null) {
            Z0(this, viewL0);
            viewL0.requestLayout();
            this.V.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f9942c0 = i10;
    }

    public void setFabCornerSize(@Dimension float f10) {
        if (f10 != getTopEdgeTreatment().e()) {
            getTopEdgeTreatment().l(f10);
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f10);
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f10);
            this.V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f9948i0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f9946g0 != i10) {
            this.f9946g0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                X0(actionMenuView, this.f9941b0, O0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(R0(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i10) {
        this.U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public Behavior getBehavior() {
        if (this.f9957r0 == null) {
            this.f9957r0 = new Behavior();
        }
        return this.f9957r0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: p, reason: collision with root package name */
        public final Rect f9963p;

        /* renamed from: q, reason: collision with root package name */
        public WeakReference f9964q;

        /* renamed from: r, reason: collision with root package name */
        public int f9965r;

        /* renamed from: s, reason: collision with root package name */
        public final View.OnLayoutChangeListener f9966s;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f9964q.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.h(Behavior.this.f9963p);
                    int iHeight = Behavior.this.f9963p.height();
                    bottomAppBar.W0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f9963p)));
                    height = iHeight;
                }
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
                if (Behavior.this.f9965r == 0) {
                    if (bottomAppBar.f9943d0 == 1) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(j4.d.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                    if (d0.l(view)) {
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin += bottomAppBar.f9944e0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin += bottomAppBar.f9944e0;
                    }
                }
                bottomAppBar.U0();
            }
        }

        public Behavior() {
            this.f9966s = new a();
            this.f9963p = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: a0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f9964q = new WeakReference(bottomAppBar);
            View viewL0 = bottomAppBar.L0();
            if (viewL0 != null && !viewL0.isLaidOut()) {
                BottomAppBar.Z0(bottomAppBar, viewL0);
                this.f9965r = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) viewL0.getLayoutParams())).bottomMargin;
                if (viewL0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewL0;
                    if (bottomAppBar.f9943d0 == 0 && bottomAppBar.f9947h0) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(j4.a.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(j4.a.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.D0(floatingActionButton);
                }
                viewL0.addOnLayoutChangeListener(this.f9966s);
                bottomAppBar.U0();
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9966s = new a();
            this.f9963p = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f9937x0;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.V = materialShapeDrawable;
        this.f9952m0 = 0;
        this.f9954o0 = 0;
        this.f9955p0 = false;
        this.f9956q0 = true;
        this.f9961v0 = new a();
        this.f9962w0 = new b();
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, l.BottomAppBar, i10, i11, new int[0]);
        ColorStateList colorStateListA = d5.c.a(context2, typedArrayI, l.BottomAppBar_backgroundTint);
        int i12 = l.BottomAppBar_navigationIconTint;
        if (typedArrayI.hasValue(i12)) {
            setNavigationIconTint(typedArrayI.getColor(i12, -1));
        }
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayI.getDimensionPixelOffset(l.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayI.getDimensionPixelOffset(l.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayI.getDimensionPixelOffset(l.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f9941b0 = typedArrayI.getInt(l.BottomAppBar_fabAlignmentMode, 0);
        this.f9942c0 = typedArrayI.getInt(l.BottomAppBar_fabAnimationMode, 0);
        this.f9943d0 = typedArrayI.getInt(l.BottomAppBar_fabAnchorMode, 1);
        this.f9947h0 = typedArrayI.getBoolean(l.BottomAppBar_removeEmbeddedFabElevation, true);
        this.f9946g0 = typedArrayI.getInt(l.BottomAppBar_menuAlignmentMode, 0);
        this.f9948i0 = typedArrayI.getBoolean(l.BottomAppBar_hideOnScroll, false);
        this.f9949j0 = typedArrayI.getBoolean(l.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.f9950k0 = typedArrayI.getBoolean(l.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f9951l0 = typedArrayI.getBoolean(l.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.f9945f0 = typedArrayI.getDimensionPixelOffset(l.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z10 = typedArrayI.getBoolean(l.BottomAppBar_addElevationShadow, true);
        typedArrayI.recycle();
        this.f9944e0 = getResources().getDimensionPixelOffset(j4.d.mtrl_bottomappbar_fabOffsetEndMode);
        materialShapeDrawable.setShapeAppearanceModel(com.google.android.material.shape.a.a().A(new com.google.android.material.bottomappbar.d(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m());
        if (z10) {
            materialShapeDrawable.q0(2);
        } else {
            materialShapeDrawable.q0(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        materialShapeDrawable.m0(Paint.Style.FILL);
        materialShapeDrawable.W(context2);
        materialShapeDrawable.setTintList(colorStateListA);
        setElevation(dimensionPixelSize);
        setBackground(materialShapeDrawable);
        d0.e(this, attributeSet, i10, i11, new c());
    }
}
