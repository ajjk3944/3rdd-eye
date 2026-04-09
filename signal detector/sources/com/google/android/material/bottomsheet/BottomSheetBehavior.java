package com.google.android.material.bottomsheet;

import B3.x;
import E.b;
import G3.j;
import G3.o;
import H3.e;
import H3.g;
import L2.w;
import R.C0174a;
import R.C0175b;
import R.F;
import R.O;
import R.V;
import R.W;
import R.X;
import S.c;
import X.f;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import c.C0377b;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C2195yo;
import d3.AbstractC2266a;
import e3.AbstractC2303a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k3.AbstractC2626a;
import m0.C2650a;
import x3.AbstractC2993B;
import z3.C3021f;
import z3.InterfaceC3017b;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b implements InterfaceC3017b {

    /* renamed from: C, reason: collision with root package name */
    public final boolean f18114C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f18115D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f18116E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f18117F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f18118G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f18119H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f18120I;

    /* renamed from: J, reason: collision with root package name */
    public int f18121J;

    /* renamed from: K, reason: collision with root package name */
    public int f18122K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f18123L;
    public final o M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f18124N;

    /* renamed from: O, reason: collision with root package name */
    public final g f18125O;

    /* renamed from: P, reason: collision with root package name */
    public final ValueAnimator f18126P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f18127Q;

    /* renamed from: R, reason: collision with root package name */
    public int f18128R;

    /* renamed from: S, reason: collision with root package name */
    public int f18129S;

    /* renamed from: T, reason: collision with root package name */
    public final float f18130T;

    /* renamed from: U, reason: collision with root package name */
    public int f18131U;

    /* renamed from: V, reason: collision with root package name */
    public final float f18132V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f18133W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f18134X;

    /* renamed from: Y, reason: collision with root package name */
    public final boolean f18135Y;

    /* renamed from: Z, reason: collision with root package name */
    public final boolean f18136Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f18137a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f18138a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18139b;
    public int b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f18140c;

    /* renamed from: c0, reason: collision with root package name */
    public f f18141c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f18142d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f18143d0;

    /* renamed from: e, reason: collision with root package name */
    public int f18144e;

    /* renamed from: e0, reason: collision with root package name */
    public int f18145e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18146f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f18147f0;

    /* renamed from: g, reason: collision with root package name */
    public int f18148g;

    /* renamed from: g0, reason: collision with root package name */
    public final float f18149g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f18150h;

    /* renamed from: h0, reason: collision with root package name */
    public int f18151h0;
    public final j i;

    /* renamed from: i0, reason: collision with root package name */
    public int f18152i0;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f18153j;

    /* renamed from: j0, reason: collision with root package name */
    public int f18154j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f18155k;

    /* renamed from: k0, reason: collision with root package name */
    public WeakReference f18156k0;

    /* renamed from: l, reason: collision with root package name */
    public int f18157l;

    /* renamed from: l0, reason: collision with root package name */
    public WeakReference f18158l0;

    /* renamed from: m, reason: collision with root package name */
    public int f18159m;

    /* renamed from: m0, reason: collision with root package name */
    public final ArrayList f18160m0;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18161n;

    /* renamed from: n0, reason: collision with root package name */
    public VelocityTracker f18162n0;

    /* renamed from: o0, reason: collision with root package name */
    public C3021f f18163o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f18164p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f18165q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f18166r0;

    /* renamed from: s0, reason: collision with root package name */
    public HashMap f18167s0;

    /* renamed from: t0, reason: collision with root package name */
    public final SparseIntArray f18168t0;

    /* renamed from: u0, reason: collision with root package name */
    public final e f18169u0;

    public BottomSheetBehavior() {
        this.f18137a = 0;
        this.f18139b = true;
        this.f18155k = -1;
        this.f18157l = -1;
        this.f18125O = new g(this);
        this.f18130T = 0.5f;
        this.f18132V = -1.0f;
        this.f18135Y = true;
        this.f18136Z = true;
        this.b0 = 4;
        this.f18149g0 = 0.1f;
        this.f18160m0 = new ArrayList();
        this.f18165q0 = -1;
        this.f18168t0 = new SparseIntArray();
        this.f18169u0 = new e(this, 1);
    }

    public static View A(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewA = A(viewGroup.getChildAt(i));
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    public static BottomSheetBehavior B(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof E.e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        b bVar = ((E.e) layoutParams).f1311a;
        if (bVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) bVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int C(int i, int i3, int i6, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i3, i7);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (size != 0) {
            i6 = Math.min(size, i6);
        }
        return View.MeasureSpec.makeMeasureSpec(i6, LinearLayoutManager.INVALID_OFFSET);
    }

    public final int D() {
        if (this.f18139b) {
            return this.f18128R;
        }
        return Math.max(this.f18127Q, this.f18117F ? 0 : this.f18122K);
    }

    public final int E(int i) {
        if (i == 3) {
            return D();
        }
        if (i == 4) {
            return this.f18131U;
        }
        if (i == 5) {
            return this.f18154j0;
        }
        if (i == 6) {
            return this.f18129S;
        }
        throw new IllegalArgumentException(AbstractC1135f5.l(i, "Invalid state to get top offset: "));
    }

    public final boolean F() {
        WeakReference weakReference = this.f18156k0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f18156k0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void G(boolean z6) throws Resources.NotFoundException {
        if (this.f18133W != z6) {
            this.f18133W = z6;
            if (!z6 && this.b0 == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i) {
        if (i == -1) {
            if (this.f18146f) {
                return;
            } else {
                this.f18146f = true;
            }
        } else {
            if (!this.f18146f && this.f18144e == i) {
                return;
            }
            this.f18146f = false;
            this.f18144e = Math.max(0, i);
        }
        P();
    }

    public final void I(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(A.f.p(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f18133W && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i3 = (i == 6 && this.f18139b && E(i) <= this.f18128R) ? 3 : i;
        WeakReference weakReference = this.f18156k0;
        if (weakReference == null || weakReference.get() == null) {
            J(i);
            return;
        }
        View view = (View) this.f18156k0.get();
        Y0.g gVar = new Y0.g(this, view, i3);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(gVar);
        } else {
            gVar.run();
        }
    }

    public final void J(int i) {
        View view;
        if (this.b0 == i) {
            return;
        }
        this.b0 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z6 = this.f18133W;
        }
        WeakReference weakReference = this.f18156k0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            O(true);
        } else if (i == 6 || i == 5 || i == 4) {
            O(false);
        }
        N(i, true);
        while (true) {
            ArrayList arrayList = this.f18160m0;
            if (i3 >= arrayList.size()) {
                M();
                return;
            } else {
                ((AbstractC2626a) arrayList.get(i3)).c(i, view);
                i3++;
            }
        }
    }

    public final boolean K(View view, float f2) {
        if (this.f18134X) {
            return true;
        }
        if (view.getTop() < this.f18131U) {
            return false;
        }
        return Math.abs(((f2 * this.f18149g0) + ((float) view.getTop())) - ((float) this.f18131U)) / ((float) y()) > 0.5f;
    }

    public final void L(View view, int i, boolean z6) {
        int iE = E(i);
        f fVar = this.f18141c0;
        if (fVar == null || (!z6 ? fVar.s(view, view.getLeft(), iE) : fVar.q(view.getLeft(), iE))) {
            J(i);
            return;
        }
        J(2);
        N(i, true);
        this.f18125O.b(i);
    }

    public final void M() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.f18156k0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        O.j(524288, view);
        O.h(0, view);
        O.j(262144, view);
        O.h(0, view);
        O.j(1048576, view);
        O.h(0, view);
        SparseIntArray sparseIntArray = this.f18168t0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            O.j(i, view);
            O.h(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.f18139b && this.b0 != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            w wVar = new w(i, 14, this);
            ArrayList arrayListF = O.f(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListF.size()) {
                    int i6 = 0;
                    int i7 = -1;
                    while (true) {
                        int[] iArr = O.f3273d;
                        if (i6 >= 32 || i7 != -1) {
                            break;
                        }
                        int i8 = iArr[i6];
                        boolean z6 = true;
                        for (int i9 = 0; i9 < arrayListF.size(); i9++) {
                            z6 &= ((c) arrayListF.get(i9)).a() != i8;
                        }
                        if (z6) {
                            i7 = i8;
                        }
                        i6++;
                    }
                    iA = i7;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c) arrayListF.get(i3)).f3441a).getLabel())) {
                        iA = ((c) arrayListF.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (iA != -1) {
                c cVar = new c(null, iA, string, wVar, null);
                View.AccessibilityDelegate accessibilityDelegateD = O.d(view);
                C0175b c0175b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C0174a ? ((C0174a) accessibilityDelegateD).f3299a : new C0175b(accessibilityDelegateD);
                if (c0175b == null) {
                    c0175b = new C0175b();
                }
                O.m(view, c0175b);
                O.j(cVar.a(), view);
                O.f(view).add(cVar);
                O.h(0, view);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.f18133W) {
            int i10 = 5;
            if (this.b0 != 5) {
                O.k(view, c.f3437l, new w(i10, 14, this));
            }
        }
        int i11 = this.b0;
        int i12 = 4;
        int i13 = 3;
        if (i11 == 3) {
            O.k(view, c.f3436k, new w(this.f18139b ? 4 : 6, 14, this));
            return;
        }
        if (i11 == 4) {
            O.k(view, c.f3435j, new w(this.f18139b ? 3 : 6, 14, this));
        } else {
            if (i11 != 6) {
                return;
            }
            O.k(view, c.f3436k, new w(i12, 14, this));
            O.k(view, c.f3435j, new w(i13, 14, this));
        }
    }

    public final void N(int i, boolean z6) {
        j jVar;
        if (i == 2) {
            return;
        }
        boolean z7 = this.b0 == 3 && (this.f18123L || F());
        if (this.f18124N == z7 || (jVar = this.i) == null) {
            return;
        }
        this.f18124N = z7;
        ValueAnimator valueAnimator = this.f18126P;
        if (!z6 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            jVar.r(this.f18124N ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(jVar.f1597b.f1568j, z7 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void O(boolean z6) {
        WeakReference weakReference = this.f18156k0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f18167s0 != null) {
                    return;
                } else {
                    this.f18167s0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f18156k0.get() && z6) {
                    this.f18167s0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z6) {
                return;
            }
            this.f18167s0 = null;
        }
    }

    public final void P() {
        View view;
        if (this.f18156k0 != null) {
            w();
            if (this.b0 != 4 || (view = (View) this.f18156k0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // z3.InterfaceC3017b
    public final void a(C0377b c0377b) {
        C3021f c3021f = this.f18163o0;
        if (c3021f == null) {
            return;
        }
        c3021f.f24467f = c0377b;
    }

    @Override // z3.InterfaceC3017b
    public final void b() {
        C3021f c3021f = this.f18163o0;
        if (c3021f == null) {
            return;
        }
        int i = c3021f.f24465d;
        int i3 = c3021f.f24464c;
        C0377b c0377b = c3021f.f24467f;
        c3021f.f24467f = null;
        if (c0377b != null) {
            float f2 = c0377b.f5820c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.f18133W) {
                    AnimatorSet animatorSetA = c3021f.a();
                    animatorSetA.setDuration(AbstractC2303a.c(f2, i3, i));
                    animatorSetA.start();
                    I(4);
                    return;
                }
                x xVar = new x(9, this);
                View view = c3021f.f24463b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new C2650a(1));
                objectAnimatorOfFloat.setDuration(AbstractC2303a.c(f2, i3, i));
                objectAnimatorOfFloat.addListener(new x(13, c3021f));
                objectAnimatorOfFloat.addListener(xVar);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        I(this.f18133W ? 5 : 4);
    }

    @Override // z3.InterfaceC3017b
    public final void c(C0377b c0377b) {
        C3021f c3021f = this.f18163o0;
        if (c3021f == null) {
            return;
        }
        if (c3021f.f24467f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0377b c0377b2 = c3021f.f24467f;
        c3021f.f24467f = c0377b;
        if (c0377b2 == null) {
            return;
        }
        c3021f.b(c0377b.f5820c);
    }

    @Override // z3.InterfaceC3017b
    public final void d() {
        C3021f c3021f = this.f18163o0;
        if (c3021f == null) {
            return;
        }
        if (c3021f.f24467f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0377b c0377b = c3021f.f24467f;
        c3021f.f24467f = null;
        if (c0377b == null) {
            return;
        }
        AnimatorSet animatorSetA = c3021f.a();
        animatorSetA.setDuration(c3021f.f24466e);
        animatorSetA.start();
    }

    @Override // E.b
    public final void g(E.e eVar) {
        this.f18156k0 = null;
        this.f18141c0 = null;
        this.f18163o0 = null;
    }

    @Override // E.b
    public final void j() {
        this.f18156k0 = null;
        this.f18141c0 = null;
        this.f18163o0 = null;
    }

    @Override // E.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        f fVar;
        if (!view.isShown() || !this.f18135Y) {
            this.f18143d0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f18164p0 = -1;
            this.f18165q0 = -1;
            VelocityTracker velocityTracker = this.f18162n0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f18162n0 = null;
            }
        }
        if (this.f18162n0 == null) {
            this.f18162n0 = VelocityTracker.obtain();
        }
        this.f18162n0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x6 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            this.f18165q0 = y3;
            if (this.b0 != 2) {
                WeakReference weakReference = this.f18158l0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x6, y3)) {
                    this.f18164p0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f18166r0 = true;
                }
            }
            this.f18143d0 = this.f18164p0 == -1 && !coordinatorLayout.p(view, x6, this.f18165q0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f18166r0 = false;
            this.f18164p0 = -1;
            if (this.f18143d0) {
                this.f18143d0 = false;
                return false;
            }
        }
        if (this.f18143d0 || (fVar = this.f18141c0) == null || !fVar.r(motionEvent)) {
            WeakReference weakReference2 = this.f18158l0;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f18143d0 || this.b0 == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f18141c0 == null || (i = this.f18165q0) == -1 || Math.abs(i - motionEvent.getY()) <= this.f18141c0.f4125b) {
                return false;
            }
        }
        return true;
    }

    @Override // E.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i3 = 0;
        if (this.f18156k0 == null) {
            this.f18148g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i6 = Build.VERSION.SDK_INT;
            boolean z6 = (i6 < 29 || this.f18161n || this.f18146f) ? false : true;
            if (this.f18114C || this.f18115D || this.f18116E || this.f18118G || this.f18119H || this.f18120I || z6) {
                AbstractC2993B.d(view, new P.g(this, z6));
            }
            C2195yo c2195yo = new C2195yo(view);
            WeakHashMap weakHashMap = O.f3270a;
            if (i6 >= 30) {
                view.setWindowInsetsAnimationCallback(new X(c2195yo));
            } else {
                PathInterpolator pathInterpolator = W.f3286e;
                View.OnApplyWindowInsetsListener v6 = new V(view, c2195yo);
                view.setTag(R.id.tag_window_insets_animation_callback, v6);
                if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    view.setOnApplyWindowInsetsListener(v6);
                }
            }
            this.f18156k0 = new WeakReference(view);
            this.f18163o0 = new C3021f(view);
            j jVar = this.i;
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.f18132V;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.p(elevation);
            } else {
                ColorStateList colorStateList = this.f18153j;
                if (colorStateList != null) {
                    F.h(view, colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f18141c0 == null) {
            this.f18141c0 = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f18169u0);
        }
        int top = view.getTop();
        coordinatorLayout.r(i, view);
        this.f18152i0 = coordinatorLayout.getWidth();
        this.f18154j0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f18151h0 = height;
        int iMin = this.f18154j0;
        int i7 = iMin - height;
        int i8 = this.f18122K;
        if (i7 < i8) {
            if (this.f18117F) {
                int i9 = this.f18157l;
                if (i9 != -1) {
                    iMin = Math.min(iMin, i9);
                }
                this.f18151h0 = iMin;
            } else {
                int iMin2 = iMin - i8;
                int i10 = this.f18157l;
                if (i10 != -1) {
                    iMin2 = Math.min(iMin2, i10);
                }
                this.f18151h0 = iMin2;
            }
        }
        this.f18128R = Math.max(0, this.f18154j0 - this.f18151h0);
        this.f18129S = (int) ((1.0f - this.f18130T) * this.f18154j0);
        w();
        int i11 = this.b0;
        if (i11 == 3) {
            int iD = D();
            WeakHashMap weakHashMap2 = O.f3270a;
            view.offsetTopAndBottom(iD);
        } else if (i11 == 6) {
            int i12 = this.f18129S;
            WeakHashMap weakHashMap3 = O.f3270a;
            view.offsetTopAndBottom(i12);
        } else if (this.f18133W && i11 == 5) {
            int i13 = this.f18154j0;
            WeakHashMap weakHashMap4 = O.f3270a;
            view.offsetTopAndBottom(i13);
        } else if (i11 == 4) {
            int i14 = this.f18131U;
            WeakHashMap weakHashMap5 = O.f3270a;
            view.offsetTopAndBottom(i14);
        } else if (i11 == 1 || i11 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = O.f3270a;
            view.offsetTopAndBottom(top2);
        }
        N(this.b0, false);
        this.f18158l0 = new WeakReference(A(view));
        while (true) {
            ArrayList arrayList = this.f18160m0;
            if (i3 >= arrayList.size()) {
                return true;
            }
            ((AbstractC2626a) arrayList.get(i3)).a(view);
            i3++;
        }
    }

    @Override // E.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i3, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f18155k, marginLayoutParams.width), C(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f18157l, marginLayoutParams.height));
        return true;
    }

    @Override // E.b
    public final boolean n(View view) {
        WeakReference weakReference = this.f18158l0;
        return (weakReference == null || view != weakReference.get() || this.b0 == 3 || this.f18138a0) ? false : true;
    }

    @Override // E.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i3, int[] iArr, int i6) {
        if (i6 == 1) {
            return;
        }
        WeakReference weakReference = this.f18158l0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i7 = top - i3;
        boolean z6 = this.f18135Y;
        boolean z7 = this.f18136Z;
        if (i3 > 0) {
            if (!this.f18147f0 && !z7 && view2 == view3 && view2.canScrollVertically(1)) {
                this.f18138a0 = true;
                return;
            }
            if (i7 < D()) {
                int iD = top - D();
                iArr[1] = iD;
                WeakHashMap weakHashMap = O.f3270a;
                view.offsetTopAndBottom(-iD);
                J(3);
            } else {
                if (!z6) {
                    return;
                }
                iArr[1] = i3;
                WeakHashMap weakHashMap2 = O.f3270a;
                view.offsetTopAndBottom(-i3);
                J(1);
            }
        } else if (i3 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.f18147f0 && !z7 && view2 == view3 && zCanScrollVertically) {
                this.f18138a0 = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i8 = this.f18131U;
                if (i7 > i8 && !this.f18133W) {
                    int i9 = top - i8;
                    iArr[1] = i9;
                    WeakHashMap weakHashMap3 = O.f3270a;
                    view.offsetTopAndBottom(-i9);
                    J(4);
                } else {
                    if (!z6) {
                        return;
                    }
                    iArr[1] = i3;
                    WeakHashMap weakHashMap4 = O.f3270a;
                    view.offsetTopAndBottom(-i3);
                    J(1);
                }
            }
        }
        z(view.getTop());
        this.f18145e0 = i3;
        this.f18147f0 = true;
        this.f18138a0 = false;
    }

    @Override // E.b
    public final void r(View view, Parcelable parcelable) {
        k3.b bVar = (k3.b) parcelable;
        int i = this.f18137a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f18144e = bVar.f21781d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f18139b = bVar.f21782e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f18133W = bVar.f21783f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f18134X = bVar.f21784g;
            }
        }
        int i3 = bVar.f21780c;
        if (i3 == 1 || i3 == 2) {
            this.b0 = 4;
        } else {
            this.b0 = i3;
        }
    }

    @Override // E.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new k3.b(this);
    }

    @Override // E.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i3) {
        this.f18145e0 = 0;
        this.f18147f0 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // E.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.D()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.J(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.f18158l0
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.f18147f0
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.f18145e0
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f18139b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.f18129S
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.f18133W
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.f18162n0
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f18140c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f18162n0
            int r6 = r2.f18164p0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.K(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.f18145e0
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f18139b
            if (r1 == 0) goto L74
            int r5 = r2.f18128R
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f18131U
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.f18129S
            if (r3 >= r1) goto L83
            int r6 = r2.f18131U
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f18131U
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f18139b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.f18129S
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f18131U
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.L(r4, r0, r3)
            r2.f18147f0 = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // E.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.b0;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        f fVar = this.f18141c0;
        if (fVar != null && (this.f18135Y || i == 1)) {
            fVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.f18164p0 = -1;
            this.f18165q0 = -1;
            VelocityTracker velocityTracker = this.f18162n0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f18162n0 = null;
            }
        }
        if (this.f18162n0 == null) {
            this.f18162n0 = VelocityTracker.obtain();
        }
        this.f18162n0.addMovement(motionEvent);
        if (this.f18141c0 != null && ((this.f18135Y || this.b0 == 1) && actionMasked == 2 && !this.f18143d0)) {
            float fAbs = Math.abs(this.f18165q0 - motionEvent.getY());
            f fVar2 = this.f18141c0;
            if (fAbs > fVar2.f4125b) {
                fVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f18143d0;
    }

    public final void w() {
        int iY = y();
        if (this.f18139b) {
            this.f18131U = Math.max(this.f18154j0 - iY, this.f18128R);
        } else {
            this.f18131U = this.f18154j0 - iY;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float x() {
        /*
            r5 = this;
            G3.j r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L77
            java.lang.ref.WeakReference r0 = r5.f18156k0
            if (r0 == 0) goto L77
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L77
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L77
            java.lang.ref.WeakReference r0 = r5.f18156k0
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.F()
            if (r2 == 0) goto L77
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L77
            G3.j r2 = r5.i
            float r2 = r2.k()
            android.view.RoundedCorner r3 = com.google.android.gms.internal.ads.KO.p(r0)
            if (r3 == 0) goto L44
            int r3 = U4.n.d(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r3 = r3 / r2
            goto L45
        L44:
            r3 = r1
        L45:
            G3.j r2 = r5.i
            float[] r4 = r2.f1593Q
            if (r4 == 0) goto L4f
            r2 = 0
            r2 = r4[r2]
            goto L5d
        L4f:
            G3.h r4 = r2.f1597b
            G3.o r4 = r4.f1560a
            G3.d r4 = r4.f1629f
            android.graphics.RectF r2 = r2.h()
            float r2 = r4.a(r2)
        L5d:
            android.view.RoundedCorner r0 = com.google.android.gms.internal.ads.KO.A(r0)
            if (r0 == 0) goto L72
            int r0 = U4.n.d(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L72
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L72
            float r1 = r0 / r2
        L72:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.x():float");
    }

    public final int y() {
        int i;
        return this.f18146f ? Math.min(Math.max(this.f18148g, this.f18154j0 - ((this.f18152i0 * 9) / 16)), this.f18151h0) + this.f18121J : (this.f18161n || this.f18114C || (i = this.f18159m) <= 0) ? this.f18144e + this.f18121J : Math.max(this.f18144e, i + this.f18150h);
    }

    public final void z(int i) {
        View view = (View) this.f18156k0.get();
        if (view != null) {
            ArrayList arrayList = this.f18160m0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.f18131U;
            if (i <= i3 && i3 != D()) {
                D();
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                ((AbstractC2626a) arrayList.get(i6)).b(view);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        this.f18137a = 0;
        this.f18139b = true;
        this.f18155k = -1;
        this.f18157l = -1;
        this.f18125O = new g(this);
        this.f18130T = 0.5f;
        this.f18132V = -1.0f;
        this.f18135Y = true;
        this.f18136Z = true;
        this.b0 = 4;
        this.f18149g0 = 0.1f;
        this.f18160m0 = new ArrayList();
        this.f18165q0 = -1;
        this.f18168t0 = new SparseIntArray();
        this.f18169u0 = new e(this, 1);
        this.f18150h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19752f);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f18153j = com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.M = o.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o oVar = this.M;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.i = jVar;
            jVar.m(context);
            ColorStateList colorStateList = this.f18153j;
            if (colorStateList != null) {
                this.i.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.f18126P = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f18126P.addUpdateListener(new L3.b(i, this));
        this.f18132V = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f18155k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f18157l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            H(i);
        } else {
            H(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        G(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.f18161n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.f18139b != z6) {
            this.f18139b = z6;
            if (this.f18156k0 != null) {
                w();
            }
            J((this.f18139b && this.b0 == 6) ? 3 : this.b0);
            N(this.b0, true);
            M();
        }
        this.f18134X = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f18135Y = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f18136Z = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f18137a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f2 = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f18130T = f2;
            if (this.f18156k0 != null) {
                this.f18129S = (int) ((1.0f - f2) * this.f18154j0);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.f18127Q = i3;
                    N(this.b0, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f18127Q = dimensionPixelOffset;
                    N(this.b0, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f18142d = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.f18114C = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f18115D = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f18116E = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.f18117F = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.f18118G = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f18119H = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f18120I = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f18123L = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f18140c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // E.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i3, int i6, int[] iArr) {
    }
}
