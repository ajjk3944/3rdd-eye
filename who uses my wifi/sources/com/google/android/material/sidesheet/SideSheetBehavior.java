package com.google.android.material.sidesheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
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
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.e61;
import defpackage.ex0;
import defpackage.f2;
import defpackage.f9;
import defpackage.fu;
import defpackage.gn0;
import defpackage.i30;
import defpackage.i50;
import defpackage.i61;
import defpackage.j1;
import defpackage.l;
import defpackage.ma0;
import defpackage.n1;
import defpackage.nb0;
import defpackage.nc0;
import defpackage.ob;
import defpackage.ob1;
import defpackage.oc0;
import defpackage.pc0;
import defpackage.r4;
import defpackage.rb;
import defpackage.su0;
import defpackage.t51;
import defpackage.v0;
import defpackage.vj;
import defpackage.xv0;
import defpackage.yj;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends vj implements nb0 {
    public i30 a;
    public final nc0 b;
    public final ColorStateList c;
    public final su0 d;
    public final rb e;
    public final float f;
    public final boolean g;
    public int h;
    public i61 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public pc0 t;
    public int u;
    public final LinkedHashSet v;
    public final ob w;

    public SideSheetBehavior() {
        this.e = new rb(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new ob(this, 1);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        e61.i(view, 262144);
        e61.g(view, 0);
        e61.i(view, 1048576);
        e61.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            e61.j(view, v0.j, new j1() { // from class: vv0
                @Override // defpackage.j1
                public final boolean h(View view2) {
                    this.f.w(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            e61.j(view, v0.h, new j1() { // from class: vv0
                @Override // defpackage.j1
                public final boolean h(View view2) {
                    this.f.w(i2);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.nb0
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        pc0 pc0Var = this.t;
        if (pc0Var == null) {
            return;
        }
        f9 f9Var = pc0Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        pc0Var.f = null;
        int i2 = 5;
        if (f9Var == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        i30 i30Var = this.a;
        if (i30Var != null && i30Var.A() != 0) {
            i2 = 3;
        }
        n1 n1Var = new n1(9, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iT = this.a.t(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: wv0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.a.U(marginLayoutParams, r4.c(valueAnimator.getAnimatedFraction(), iT, 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = pc0Var.b;
        boolean z = f9Var.d == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new fu(1));
        objectAnimatorOfFloat.setDuration(r4.c(f9Var.c, pc0Var.c, pc0Var.d));
        objectAnimatorOfFloat.addListener(new oc0(pc0Var, z, i2));
        objectAnimatorOfFloat.addListener(n1Var);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.nb0
    public final void b(f9 f9Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        pc0 pc0Var = this.t;
        if (pc0Var == null) {
            return;
        }
        i30 i30Var = this.a;
        int i = (i30Var == null || i30Var.A() == 0) ? 5 : 3;
        f9 f9Var2 = pc0Var.f;
        pc0Var.f = f9Var;
        if (f9Var2 != null) {
            pc0Var.a(f9Var.c, f9Var.d == 0, i);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.U(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // defpackage.nb0
    public final void c(f9 f9Var) {
        pc0 pc0Var = this.t;
        if (pc0Var == null) {
            return;
        }
        pc0Var.f = f9Var;
    }

    @Override // defpackage.nb0
    public final void d() {
        pc0 pc0Var = this.t;
        if (pc0Var == null) {
            return;
        }
        View view = pc0Var.b;
        f9 f9Var = pc0Var.f;
        pc0Var.f = null;
        if (f9Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(pc0Var.e);
        animatorSet.start();
    }

    @Override // defpackage.vj
    public final void g(yj yjVar) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.vj
    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.vj
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        i61 i61Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && e61.d(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (i61Var = this.i) == null || !i61Var.p(motionEvent)) ? false : true;
    }

    @Override // defpackage.vj
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        nc0 nc0Var = this.b;
        int iY = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new pc0(view);
            if (nc0Var != null) {
                view.setBackground(nc0Var);
                float elevation = this.f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                nc0Var.p(elevation);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = e61.a;
                    t51.q(view, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (e61.d(view) == null) {
                e61.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((yj) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        i30 i30Var = this.a;
        if (i30Var == null || i30Var.A() != i5) {
            yj yjVar = null;
            su0 su0Var = this.d;
            if (i5 == 0) {
                this.a = new i50(this, i3);
                if (su0Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof yj)) {
                        yjVar = (yj) view3.getLayoutParams();
                    }
                    if (yjVar == null || ((ViewGroup.MarginLayoutParams) yjVar).rightMargin <= 0) {
                        f2 f2VarF = su0Var.f();
                        f2VarF.f = new l(0.0f);
                        f2VarF.g = new l(0.0f);
                        su0 su0VarA = f2VarF.a();
                        if (nc0Var != null) {
                            nc0Var.setShapeAppearanceModel(su0VarA);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i5 + ". Must be 0 or 1.");
                }
                this.a = new i50(this, iY);
                if (su0Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof yj)) {
                        yjVar = (yj) view2.getLayoutParams();
                    }
                    if (yjVar == null || ((ViewGroup.MarginLayoutParams) yjVar).leftMargin <= 0) {
                        f2 f2VarF2 = su0Var.f();
                        f2VarF2.e = new l(0.0f);
                        f2VarF2.h = new l(0.0f);
                        su0 su0VarA2 = f2VarF2.a();
                        if (nc0Var != null) {
                            nc0Var.setShapeAppearanceModel(su0VarA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new i61(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int iY2 = this.a.y(view);
        coordinatorLayout.r(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.z(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.g(marginLayoutParams) : 0;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            iY = iY2 - this.a.y(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iY = this.a.v();
        }
        WeakHashMap weakHashMap2 = e61.a;
        view.offsetLeftAndRight(iY);
        if (this.q == null && (i2 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // defpackage.vj
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.vj
    public final void r(View view, Parcelable parcelable) {
        int i = ((xv0) parcelable).h;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.vj
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new xv0(this);
    }

    @Override // defpackage.vj
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.j && y()) {
            float fAbs = Math.abs(this.u - motionEvent.getX());
            i61 i61Var = this.i;
            if (fAbs > i61Var.b) {
                i61Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void w(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(ex0.k(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        View view = (View) this.p.get();
        ma0 ma0Var = new ma0(this, i, 2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(ma0Var);
        } else {
            ma0Var.run();
        }
    }

    public final void x(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            throw ex0.e(it);
        }
        A();
    }

    public final boolean y() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        x(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            i30 r0 = r2.a
            int r0 = r0.v()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = defpackage.ex0.f(r5, r4)
            r3.<init>(r4)
            throw r3
        L19:
            i30 r0 = r2.a
            int r0 = r0.u()
        L1f:
            i61 r1 = r2.i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.x(r3)
            rb r3 = r2.e
            r3.a(r4)
            return
        L57:
            r2.x(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.z(android.view.View, int, boolean):void");
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new rb(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new ob(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.I);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = ob1.e(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = su0.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        su0 su0Var = this.d;
        if (su0Var != null) {
            nc0 nc0Var = new nc0(su0Var);
            this.b = nc0Var;
            nc0Var.m(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
