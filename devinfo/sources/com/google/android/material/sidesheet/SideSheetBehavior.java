package com.google.android.material.sidesheet;

import ad.g;
import ad.i;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
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
import com.google.android.gms.common.api.internal.k;
import com.liuzh.deviceinfo.R;
import d.a;
import d.h;
import e4.m0;
import e4.v0;
import ed.j;
import ed.n;
import ed.o;
import f4.p;
import fd.d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import je.u;
import n4.c;
import p3.b;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends b implements ad.b {

    /* renamed from: a, reason: collision with root package name */
    public e f20545a;

    /* renamed from: b, reason: collision with root package name */
    public final j f20546b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f20547c;

    /* renamed from: d, reason: collision with root package name */
    public final o f20548d;

    /* renamed from: e, reason: collision with root package name */
    public final k f20549e;

    /* renamed from: f, reason: collision with root package name */
    public final float f20550f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f20551h;

    /* renamed from: i, reason: collision with root package name */
    public c f20552i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final float f20553k;

    /* renamed from: l, reason: collision with root package name */
    public int f20554l;

    /* renamed from: m, reason: collision with root package name */
    public int f20555m;

    /* renamed from: n, reason: collision with root package name */
    public int f20556n;

    /* renamed from: o, reason: collision with root package name */
    public int f20557o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f20558p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f20559q;

    /* renamed from: r, reason: collision with root package name */
    public final int f20560r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f20561s;

    /* renamed from: t, reason: collision with root package name */
    public ad.j f20562t;

    /* renamed from: u, reason: collision with root package name */
    public int f20563u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f20564v;

    /* renamed from: w, reason: collision with root package name */
    public final d f20565w;

    public SideSheetBehavior() {
        this.f20549e = new k(this);
        this.g = true;
        this.f20551h = 5;
        this.f20553k = 0.1f;
        this.f20560r = -1;
        this.f20564v = new LinkedHashSet();
        this.f20565w = new d(this, 0);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f20558p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.l(262144, view);
        v0.i(0, view);
        v0.l(1048576, view);
        v0.i(0, view);
        final int i4 = 5;
        if (this.f20551h != 5) {
            v0.m(view, f4.c.f23637l, new p() { // from class: fd.b
                @Override // f4.p
                public final boolean c(View view2) throws Resources.NotFoundException {
                    this.f24005a.w(i4);
                    return true;
                }
            });
        }
        final int i10 = 3;
        if (this.f20551h != 3) {
            v0.m(view, f4.c.j, new p() { // from class: fd.b
                @Override // f4.p
                public final boolean c(View view2) throws Resources.NotFoundException {
                    this.f24005a.w(i10);
                    return true;
                }
            });
        }
    }

    @Override // ad.b
    public final void a(a aVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ad.j jVar = this.f20562t;
        if (jVar == null) {
            return;
        }
        e eVar = this.f20545a;
        int i4 = (eVar == null || eVar.A() == 0) ? 5 : 3;
        if (jVar.f326f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        a aVar2 = jVar.f326f;
        jVar.f326f = aVar;
        if (aVar2 != null) {
            jVar.a(i4, aVar.f21572c, aVar.f21573d == 0);
        }
        WeakReference weakReference = this.f20558p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f20558p.get();
        WeakReference weakReference2 = this.f20559q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f20545a.N(marginLayoutParams, (int) ((view.getScaleX() * this.f20554l) + this.f20557o));
        view2.requestLayout();
    }

    @Override // ad.b
    public final void b() throws Resources.NotFoundException {
        int i4;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        ad.j jVar = this.f20562t;
        if (jVar == null) {
            return;
        }
        a aVar = jVar.f326f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        jVar.f326f = null;
        int i10 = 5;
        if (aVar == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        e eVar = this.f20545a;
        if (eVar != null && eVar.A() != 0) {
            i10 = 3;
        }
        g gVar = new g(2, this);
        WeakReference weakReference = this.f20559q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iT = this.f20545a.t(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: fd.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f24007a.f20545a.N(marginLayoutParams, jc.a.c(valueAnimator.getAnimatedFraction(), iT, 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = jVar.f322b;
        boolean z3 = aVar.f21573d == 0;
        boolean z10 = (Gravity.getAbsoluteGravity(i10, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i4 = z10 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i4 = 0;
        }
        float f10 = scaleX + i4;
        Property property = View.TRANSLATION_X;
        if (z10) {
            f10 = -f10;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f10);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new d5.a(1));
        objectAnimatorOfFloat.setDuration(jc.a.c(aVar.f21572c, jVar.f323c, jVar.f324d));
        objectAnimatorOfFloat.addListener(new i(jVar, z3, i10));
        objectAnimatorOfFloat.addListener(gVar);
        objectAnimatorOfFloat.start();
    }

    @Override // ad.b
    public final void c(a aVar) {
        ad.j jVar = this.f20562t;
        if (jVar == null) {
            return;
        }
        jVar.f326f = aVar;
    }

    @Override // ad.b
    public final void d() {
        ad.j jVar = this.f20562t;
        if (jVar == null) {
            return;
        }
        View view = jVar.f322b;
        if (jVar.f326f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        a aVar = jVar.f326f;
        jVar.f326f = null;
        if (aVar == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i4), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(jVar.f325e);
        animatorSet.start();
    }

    @Override // p3.b
    public final void g(p3.e eVar) {
        this.f20558p = null;
        this.f20552i = null;
        this.f20562t = null;
    }

    @Override // p3.b
    public final void j() {
        this.f20558p = null;
        this.f20552i = null;
        this.f20562t = null;
    }

    @Override // p3.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        c cVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && v0.f(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f20561s) != null) {
            velocityTracker.recycle();
            this.f20561s = null;
        }
        if (this.f20561s == null) {
            this.f20561s = VelocityTracker.obtain();
        }
        this.f20561s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f20563u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (cVar = this.f20552i) == null || !cVar.p(motionEvent)) ? false : true;
    }

    @Override // p3.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        View view2;
        View view3;
        int i10;
        View viewFindViewById;
        int i11 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f20558p;
        j jVar = this.f20546b;
        int iY = 0;
        if (weakReference == null) {
            this.f20558p = new WeakReference(view);
            this.f20562t = new ad.j(view);
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.f20550f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.n(elevation);
            } else {
                ColorStateList colorStateList = this.f20547c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = v0.f22405a;
                    m0.g(view, colorStateList);
                }
            }
            int i12 = this.f20551h == 5 ? 4 : 0;
            if (view.getVisibility() != i12) {
                view.setVisibility(i12);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (v0.f(view) == null) {
                v0.p(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i13 = Gravity.getAbsoluteGravity(((p3.e) view.getLayoutParams()).f31149c, i4) == 3 ? 1 : 0;
        e eVar = this.f20545a;
        if (eVar == null || eVar.A() != i13) {
            p3.e eVar2 = null;
            o oVar = this.f20548d;
            if (i13 == 0) {
                this.f20545a = new fd.a(this, i11);
                if (oVar != null) {
                    WeakReference weakReference2 = this.f20558p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof p3.e)) {
                        eVar2 = (p3.e) view3.getLayoutParams();
                    }
                    if (eVar2 == null || ((ViewGroup.MarginLayoutParams) eVar2).rightMargin <= 0) {
                        n nVarG = oVar.g();
                        nVarG.f23347f = new ed.a(0.0f);
                        nVarG.g = new ed.a(0.0f);
                        o oVarA = nVarG.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA);
                        }
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException(r5.c.h(i13, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f20545a = new fd.a(this, iY);
                if (oVar != null) {
                    WeakReference weakReference3 = this.f20558p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof p3.e)) {
                        eVar2 = (p3.e) view2.getLayoutParams();
                    }
                    if (eVar2 == null || ((ViewGroup.MarginLayoutParams) eVar2).leftMargin <= 0) {
                        n nVarG2 = oVar.g();
                        nVarG2.f23346e = new ed.a(0.0f);
                        nVarG2.f23348h = new ed.a(0.0f);
                        o oVarA2 = nVarG2.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA2);
                        }
                    }
                }
            }
        }
        if (this.f20552i == null) {
            this.f20552i = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f20565w);
        }
        int iY2 = this.f20545a.y(view);
        coordinatorLayout.r(i4, view);
        this.f20555m = coordinatorLayout.getWidth();
        this.f20556n = this.f20545a.z(coordinatorLayout);
        this.f20554l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f20557o = marginLayoutParams != null ? this.f20545a.c(marginLayoutParams) : 0;
        int i14 = this.f20551h;
        if (i14 == 1 || i14 == 2) {
            iY = iY2 - this.f20545a.y(view);
        } else if (i14 != 3) {
            if (i14 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f20551h);
            }
            iY = this.f20545a.v();
        }
        WeakHashMap weakHashMap2 = v0.f22405a;
        view.offsetLeftAndRight(iY);
        if (this.f20559q == null && (i10 = this.f20560r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f20559q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f20564v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p3.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p3.b
    public final void r(View view, Parcelable parcelable) {
        int i4 = ((fd.e) parcelable).f24013c;
        if (i4 == 1 || i4 == 2) {
            i4 = 5;
        }
        this.f20551h = i4;
    }

    @Override // p3.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new fd.e(this);
    }

    @Override // p3.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f20551h == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.f20552i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f20561s) != null) {
            velocityTracker.recycle();
            this.f20561s = null;
        }
        if (this.f20561s == null) {
            this.f20561s = VelocityTracker.obtain();
        }
        this.f20561s.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.j && y()) {
            float fAbs = Math.abs(this.f20563u - motionEvent.getX());
            c cVar = this.f20552i;
            if (fAbs > cVar.f29747b) {
                cVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.j;
    }

    public final void w(int i4) throws Resources.NotFoundException {
        if (i4 == 1 || i4 == 2) {
            throw new IllegalArgumentException(h.w(new StringBuilder("STATE_"), i4 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f20558p;
        if (weakReference == null || weakReference.get() == null) {
            x(i4);
            return;
        }
        View view = (View) this.f20558p.get();
        com.applovin.impl.adview.p pVar = new com.applovin.impl.adview.p(this, i4, 3);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(pVar);
        } else {
            pVar.run();
        }
    }

    public final void x(int i4) {
        View view;
        if (this.f20551h == i4) {
            return;
        }
        this.f20551h = i4;
        WeakReference weakReference = this.f20558p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = this.f20551h == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
        Iterator it = this.f20564v.iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
        A();
    }

    public final boolean y() {
        if (this.f20552i != null) {
            return this.g || this.f20551h == 1;
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
        r2.f20549e.a(r4);
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
            wb.e r0 = r2.f20545a
            int r0 = r0.v()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = je.u.r(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            wb.e r0 = r2.f20545a
            int r0 = r0.u()
        L1f:
            n4.c r1 = r2.f20552i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f29761r = r3
            r3 = -1
            r1.f29748c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f29746a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f29761r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f29761r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.x(r3)
            com.google.android.gms.common.api.internal.k r3 = r2.f20549e
            r3.a(r4)
            return
        L57:
            r2.x(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.z(android.view.View, int, boolean):void");
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f20549e = new k(this);
        this.g = true;
        this.f20551h = 5;
        this.f20553k = 0.1f;
        this.f20560r = -1;
        this.f20564v = new LinkedHashSet();
        this.f20565w = new d(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.F);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f20547c = jm.a.j(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f20548d = o.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f20560r = resourceId;
            WeakReference weakReference = this.f20559q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f20559q = null;
            WeakReference weakReference2 = this.f20558p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o oVar = this.f20548d;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f20546b = jVar;
            jVar.l(context);
            ColorStateList colorStateList = this.f20547c;
            if (colorStateList != null) {
                this.f20546b.o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f20546b.setTint(typedValue.data);
            }
        }
        this.f20550f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
