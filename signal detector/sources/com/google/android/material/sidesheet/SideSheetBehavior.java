package com.google.android.material.sidesheet;

import B3.x;
import E.b;
import G3.C0147a;
import G3.j;
import G3.o;
import H3.a;
import H3.e;
import H3.g;
import R.F;
import R.O;
import S.n;
import X.f;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.C0377b;
import com.apm.insight.R;
import com.bumptech.glide.c;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import d3.AbstractC2266a;
import e3.AbstractC2303a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import z3.C3023h;
import z3.InterfaceC3017b;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b implements InterfaceC3017b {

    /* renamed from: C, reason: collision with root package name */
    public int f18419C;

    /* renamed from: D, reason: collision with root package name */
    public WeakReference f18420D;

    /* renamed from: E, reason: collision with root package name */
    public WeakReference f18421E;

    /* renamed from: F, reason: collision with root package name */
    public final int f18422F;

    /* renamed from: G, reason: collision with root package name */
    public VelocityTracker f18423G;

    /* renamed from: H, reason: collision with root package name */
    public C3023h f18424H;

    /* renamed from: I, reason: collision with root package name */
    public int f18425I;

    /* renamed from: J, reason: collision with root package name */
    public final LinkedHashSet f18426J;

    /* renamed from: K, reason: collision with root package name */
    public final e f18427K;

    /* renamed from: a, reason: collision with root package name */
    public c f18428a;

    /* renamed from: b, reason: collision with root package name */
    public final j f18429b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f18430c;

    /* renamed from: d, reason: collision with root package name */
    public final o f18431d;

    /* renamed from: e, reason: collision with root package name */
    public final g f18432e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18433f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18434g;

    /* renamed from: h, reason: collision with root package name */
    public int f18435h;
    public f i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18436j;

    /* renamed from: k, reason: collision with root package name */
    public final float f18437k;

    /* renamed from: l, reason: collision with root package name */
    public int f18438l;

    /* renamed from: m, reason: collision with root package name */
    public int f18439m;

    /* renamed from: n, reason: collision with root package name */
    public int f18440n;

    public SideSheetBehavior() {
        this.f18432e = new g(this);
        this.f18434g = true;
        this.f18435h = 5;
        this.f18437k = 0.1f;
        this.f18422F = -1;
        this.f18426J = new LinkedHashSet();
        this.f18427K = new e(this, 0);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f18420D;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        O.j(262144, view);
        O.h(0, view);
        O.j(1048576, view);
        O.h(0, view);
        final int i = 5;
        if (this.f18435h != 5) {
            O.k(view, S.c.f3437l, new n() { // from class: H3.b
                @Override // S.n
                public final boolean e(View view2) {
                    this.f1784a.w(i);
                    return true;
                }
            });
        }
        final int i3 = 3;
        if (this.f18435h != 3) {
            O.k(view, S.c.f3435j, new n() { // from class: H3.b
                @Override // S.n
                public final boolean e(View view2) {
                    this.f1784a.w(i3);
                    return true;
                }
            });
        }
    }

    @Override // z3.InterfaceC3017b
    public final void a(C0377b c0377b) {
        C3023h c3023h = this.f18424H;
        if (c3023h == null) {
            return;
        }
        c3023h.f24467f = c0377b;
    }

    @Override // z3.InterfaceC3017b
    public final void b() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        C3023h c3023h = this.f18424H;
        if (c3023h == null) {
            return;
        }
        C0377b c0377b = c3023h.f24467f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        c3023h.f24467f = null;
        int i = 5;
        if (c0377b == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        c cVar = this.f18428a;
        if (cVar != null && cVar.y() != 0) {
            i = 3;
        }
        x xVar = new x(1, this);
        WeakReference weakReference = this.f18421E;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iP = this.f18428a.p(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: H3.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f1789a.f18428a.P(marginLayoutParams, AbstractC2303a.c(valueAnimator.getAnimatedFraction(), iP, 0));
                    view.requestLayout();
                }
            };
        }
        c3023h.b(c0377b, i, xVar, animatorUpdateListener);
    }

    @Override // z3.InterfaceC3017b
    public final void c(C0377b c0377b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C3023h c3023h = this.f18424H;
        if (c3023h == null) {
            return;
        }
        c cVar = this.f18428a;
        int i = (cVar == null || cVar.y() == 0) ? 5 : 3;
        if (c3023h.f24467f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0377b c0377b2 = c3023h.f24467f;
        c3023h.f24467f = c0377b;
        if (c0377b2 != null) {
            c3023h.c(i, c0377b.f5820c, c0377b.f5821d == 0);
        }
        WeakReference weakReference = this.f18420D;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f18420D.get();
        WeakReference weakReference2 = this.f18421E;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f18428a.P(marginLayoutParams, (int) ((view.getScaleX() * this.f18438l) + this.f18419C));
        view2.requestLayout();
    }

    @Override // z3.InterfaceC3017b
    public final void d() {
        C3023h c3023h = this.f18424H;
        if (c3023h == null) {
            return;
        }
        c3023h.a();
    }

    @Override // E.b
    public final void g(E.e eVar) {
        this.f18420D = null;
        this.i = null;
        this.f18424H = null;
    }

    @Override // E.b
    public final void j() {
        this.f18420D = null;
        this.i = null;
        this.f18424H = null;
    }

    @Override // E.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f fVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && O.e(view) == null) || !this.f18434g) {
            this.f18436j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f18423G) != null) {
            velocityTracker.recycle();
            this.f18423G = null;
        }
        if (this.f18423G == null) {
            this.f18423G = VelocityTracker.obtain();
        }
        this.f18423G.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f18425I = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f18436j) {
            this.f18436j = false;
            return false;
        }
        return (this.f18436j || (fVar = this.i) == null || !fVar.r(motionEvent)) ? false : true;
    }

    @Override // E.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i3;
        View viewFindViewById;
        int i6 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f18420D;
        j jVar = this.f18429b;
        int iW = 0;
        if (weakReference == null) {
            this.f18420D = new WeakReference(view);
            this.f18424H = new C3023h(view);
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.f18433f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.p(elevation);
            } else {
                ColorStateList colorStateList = this.f18430c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = O.f3270a;
                    F.h(view, colorStateList);
                }
            }
            int i7 = this.f18435h == 5 ? 4 : 0;
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (O.e(view) == null) {
                O.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i8 = Gravity.getAbsoluteGravity(((E.e) view.getLayoutParams()).f1313c, i) == 3 ? 1 : 0;
        c cVar = this.f18428a;
        if (cVar == null || cVar.y() != i8) {
            E.e eVar = null;
            o oVar = this.f18431d;
            if (i8 == 0) {
                this.f18428a = new a(this, i6);
                if (oVar != null) {
                    WeakReference weakReference2 = this.f18420D;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof E.e)) {
                        eVar = (E.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        G3.n nVarG = oVar.g();
                        nVarG.f1617f = new C0147a(0.0f);
                        nVarG.f1618g = new C0147a(0.0f);
                        o oVarA = nVarG.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA);
                        }
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalArgumentException(A.f.h(i8, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f18428a = new a(this, iW);
                if (oVar != null) {
                    WeakReference weakReference3 = this.f18420D;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof E.e)) {
                        eVar = (E.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        G3.n nVarG2 = oVar.g();
                        nVarG2.f1616e = new C0147a(0.0f);
                        nVarG2.f1619h = new C0147a(0.0f);
                        o oVarA2 = nVarG2.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f18427K);
        }
        int iW2 = this.f18428a.w(view);
        coordinatorLayout.r(i, view);
        this.f18439m = coordinatorLayout.getWidth();
        this.f18440n = this.f18428a.x(coordinatorLayout);
        this.f18438l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f18419C = marginLayoutParams != null ? this.f18428a.b(marginLayoutParams) : 0;
        int i9 = this.f18435h;
        if (i9 == 1 || i9 == 2) {
            iW = iW2 - this.f18428a.w(view);
        } else if (i9 != 3) {
            if (i9 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f18435h);
            }
            iW = this.f18428a.t();
        }
        WeakHashMap weakHashMap2 = O.f3270a;
        view.offsetLeftAndRight(iW);
        if (this.f18421E == null && (i3 = this.f18422F) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f18421E = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f18426J.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // E.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i3, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // E.b
    public final void r(View view, Parcelable parcelable) {
        int i = ((H3.f) parcelable).f1795c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f18435h = i;
    }

    @Override // E.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new H3.f(this);
    }

    @Override // E.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f18435h == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f18423G) != null) {
            velocityTracker.recycle();
            this.f18423G = null;
        }
        if (this.f18423G == null) {
            this.f18423G = VelocityTracker.obtain();
        }
        this.f18423G.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.f18436j && y()) {
            float fAbs = Math.abs(this.f18425I - motionEvent.getX());
            f fVar = this.i;
            if (fAbs > fVar.f4125b) {
                fVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f18436j;
    }

    public final void w(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(A.f.p(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f18420D;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        View view = (View) this.f18420D.get();
        H3.c cVar = new H3.c(i, 0, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(cVar);
        } else {
            cVar.run();
        }
    }

    public final void x(int i) {
        View view;
        if (this.f18435h == i) {
            return;
        }
        this.f18435h = i;
        WeakReference weakReference = this.f18420D;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = this.f18435h == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
        Iterator it = this.f18426J.iterator();
        if (it.hasNext()) {
            throw A.f.f(it);
        }
        A();
    }

    public final boolean y() {
        if (this.i != null) {
            return this.f18434g || this.f18435h == 1;
        }
        return false;
    }

    public final void z(View view, int i, boolean z6) {
        int iS;
        if (i == 3) {
            iS = this.f18428a.s();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC1135f5.l(i, "Invalid state to get outer edge offset: "));
            }
            iS = this.f18428a.t();
        }
        f fVar = this.i;
        if (fVar == null || (!z6 ? fVar.s(view, iS, view.getTop()) : fVar.q(iS, view.getTop()))) {
            x(i);
        } else {
            x(2);
            this.f18432e.b(i);
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f18432e = new g(this);
        this.f18434g = true;
        this.f18435h = 5;
        this.f18437k = 0.1f;
        this.f18422F = -1;
        this.f18426J = new LinkedHashSet();
        this.f18427K = new e(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19737P);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f18430c = c.n(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f18431d = o.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f18422F = resourceId;
            WeakReference weakReference = this.f18421E;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f18421E = null;
            WeakReference weakReference2 = this.f18420D;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o oVar = this.f18431d;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f18429b = jVar;
            jVar.m(context);
            ColorStateList colorStateList = this.f18430c;
            if (colorStateList != null) {
                this.f18429b.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f18429b.setTint(typedValue.data);
            }
        }
        this.f18433f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f18434g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
