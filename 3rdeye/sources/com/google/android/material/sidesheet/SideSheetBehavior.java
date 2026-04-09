package com.google.android.material.sidesheet;

import B0.h;
import C.V;
import L0.I;
import L0.S;
import M0.g;
import M0.i;
import V0.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
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
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import f4.C4334b;
import g0.C4356c;
import h4.C4415c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l4.C5282a;
import l4.C5287f;
import l4.C5290i;
import m4.C5324a;
import m4.C5325b;
import m4.InterfaceC5326c;
import m4.d;
import m4.f;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public d f23004a;

    /* renamed from: b, reason: collision with root package name */
    public final C5287f f23005b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f23006c;

    /* renamed from: d, reason: collision with root package name */
    public final C5290i f23007d;

    /* renamed from: e, reason: collision with root package name */
    public final SideSheetBehavior<V>.c f23008e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23009f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23010g;

    /* renamed from: h, reason: collision with root package name */
    public int f23011h;
    public V0.c i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23012j;

    /* renamed from: k, reason: collision with root package name */
    public final float f23013k;

    /* renamed from: l, reason: collision with root package name */
    public int f23014l;

    /* renamed from: m, reason: collision with root package name */
    public int f23015m;

    /* renamed from: n, reason: collision with root package name */
    public int f23016n;

    /* renamed from: o, reason: collision with root package name */
    public int f23017o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference<V> f23018p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference<View> f23019q;

    /* renamed from: r, reason: collision with root package name */
    public final int f23020r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f23021s;

    /* renamed from: t, reason: collision with root package name */
    public int f23022t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f23023u;

    /* renamed from: v, reason: collision with root package name */
    public final a f23024v;

    public class a extends c.AbstractC0180c {
        public a() {
        }

        @Override // V0.c.AbstractC0180c
        public final int a(int i, View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return B7.d.h(i, sideSheetBehavior.f23004a.f(), sideSheetBehavior.f23004a.e());
        }

        @Override // V0.c.AbstractC0180c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // V0.c.AbstractC0180c
        public final int c(View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.f23014l + sideSheetBehavior.f23017o;
        }

        @Override // V0.c.AbstractC0180c
        public final void g(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f23010g) {
                    sideSheetBehavior.s(1);
                }
            }
        }

        @Override // V0.c.AbstractC0180c
        public final void h(View view, int i, int i10) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f23019q;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.f23004a.n(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f23023u;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.f23004a.b(i);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC5326c) it.next()).b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
        @Override // V0.c.AbstractC0180c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void i(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                m4.d r1 = r0.f23004a
                boolean r1 = r1.j(r4)
                if (r1 == 0) goto Lb
                goto L53
            Lb:
                m4.d r1 = r0.f23004a
                boolean r1 = r1.m(r3, r4)
                if (r1 == 0) goto L24
                m4.d r1 = r0.f23004a
                boolean r4 = r1.l(r4, r5)
                if (r4 != 0) goto L55
                m4.d r4 = r0.f23004a
                boolean r4 = r4.k(r3)
                if (r4 == 0) goto L53
                goto L55
            L24:
                r1 = 0
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 == 0) goto L36
                float r4 = java.lang.Math.abs(r4)
                float r5 = java.lang.Math.abs(r5)
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 <= 0) goto L36
                goto L55
            L36:
                int r4 = r3.getLeft()
                m4.d r5 = r0.f23004a
                int r5 = r5.c()
                int r5 = r4 - r5
                int r5 = java.lang.Math.abs(r5)
                m4.d r1 = r0.f23004a
                int r1 = r1.d()
                int r4 = r4 - r1
                int r4 = java.lang.Math.abs(r4)
                if (r5 >= r4) goto L55
            L53:
                r4 = 3
                goto L56
            L55:
                r4 = 5
            L56:
                r5 = 1
                r0.u(r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.i(android.view.View, float, float):void");
        }

        @Override // V0.c.AbstractC0180c
        public final boolean j(int i, View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.f23011h == 1 || (weakReference = sideSheetBehavior.f23018p) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f23027a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f23028b;

        /* renamed from: c, reason: collision with root package name */
        public final V f23029c = new V(this, 29);

        public c() {
        }

        public final void a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f23018p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f23027a = i;
            if (this.f23028b) {
                return;
            }
            V v10 = sideSheetBehavior.f23018p.get();
            V v11 = this.f23029c;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            v10.postOnAnimation(v11);
            this.f23028b = true;
        }
    }

    public SideSheetBehavior() {
        this.f23008e = new c();
        this.f23010g = true;
        this.f23011h = 5;
        this.f23013k = 0.1f;
        this.f23020r = -1;
        this.f23023u = new LinkedHashSet();
        this.f23024v = new a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.f23018p = null;
        this.i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.f23018p = null;
        this.i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        V0.c cVar;
        VelocityTracker velocityTracker;
        if ((!v10.isShown() && I.f(v10) == null) || !this.f23010g) {
            this.f23012j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f23021s) != null) {
            velocityTracker.recycle();
            this.f23021s = null;
        }
        if (this.f23021s == null) {
            this.f23021s = VelocityTracker.obtain();
        }
        this.f23021s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f23022t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f23012j) {
            this.f23012j = false;
            return false;
        }
        return (this.f23012j || (cVar = this.i) == null || !cVar.r(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) throws Resources.NotFoundException {
        V v11;
        V v12;
        int i10;
        View viewFindViewById;
        C5287f c5287f = this.f23005b;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        int iG = 0;
        if (this.f23018p == null) {
            this.f23018p = new WeakReference<>(v10);
            Context context = v10.getContext();
            C4334b.d(context, R.attr.motionEasingStandardDecelerateInterpolator, N0.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            C4334b.c(context, R.attr.motionDurationMedium2, 300);
            C4334b.c(context, R.attr.motionDurationShort3, 150);
            C4334b.c(context, R.attr.motionDurationShort2, 100);
            Resources resources = v10.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c5287f != null) {
                v10.setBackground(c5287f);
                float fI = this.f23009f;
                if (fI == -1.0f) {
                    fI = I.d.i(v10);
                }
                c5287f.j(fI);
            } else {
                ColorStateList colorStateList = this.f23006c;
                if (colorStateList != null) {
                    I.d.q(v10, colorStateList);
                }
            }
            int i11 = this.f23011h == 5 ? 4 : 0;
            if (v10.getVisibility() != i11) {
                v10.setVisibility(i11);
            }
            v();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
            if (I.f(v10) == null) {
                I.p(v10, v10.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i12 = Gravity.getAbsoluteGravity(((CoordinatorLayout.f) v10.getLayoutParams()).f15470c, i) == 3 ? 1 : 0;
        d dVar = this.f23004a;
        if (dVar == null || dVar.i() != i12) {
            C5290i c5290i = this.f23007d;
            CoordinatorLayout.f fVar = null;
            if (i12 == 0) {
                this.f23004a = new C5325b(this);
                if (c5290i != null) {
                    WeakReference<V> weakReference = this.f23018p;
                    if (weakReference != null && (v12 = weakReference.get()) != null && (v12.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar = (CoordinatorLayout.f) v12.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).rightMargin <= 0) {
                        C5290i.a aVarE = c5290i.e();
                        aVarE.f43816f = new C5282a(0.0f);
                        aVarE.f43817g = new C5282a(0.0f);
                        C5290i c5290iA = aVarE.a();
                        if (c5287f != null) {
                            c5287f.setShapeAppearanceModel(c5290iA);
                        }
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalArgumentException(C4356c.i(i12, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f23004a = new C5324a(this);
                if (c5290i != null) {
                    WeakReference<V> weakReference2 = this.f23018p;
                    if (weakReference2 != null && (v11 = weakReference2.get()) != null && (v11.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar = (CoordinatorLayout.f) v11.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).leftMargin <= 0) {
                        C5290i.a aVarE2 = c5290i.e();
                        aVarE2.f43815e = new C5282a(0.0f);
                        aVarE2.f43818h = new C5282a(0.0f);
                        C5290i c5290iA2 = aVarE2.a();
                        if (c5287f != null) {
                            c5287f.setShapeAppearanceModel(c5290iA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new V0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f23024v);
        }
        int iG2 = this.f23004a.g(v10);
        coordinatorLayout.r(i, v10);
        this.f23015m = coordinatorLayout.getWidth();
        this.f23016n = this.f23004a.h(coordinatorLayout);
        this.f23014l = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        this.f23017o = marginLayoutParams != null ? this.f23004a.a(marginLayoutParams) : 0;
        int i13 = this.f23011h;
        if (i13 == 1 || i13 == 2) {
            iG = iG2 - this.f23004a.g(v10);
        } else if (i13 != 3) {
            if (i13 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f23011h);
            }
            iG = this.f23004a.d();
        }
        v10.offsetLeftAndRight(iG);
        if (this.f23019q == null && (i10 = this.f23020r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f23019q = new WeakReference<>(viewFindViewById);
        }
        for (InterfaceC5326c interfaceC5326c : this.f23023u) {
            if (interfaceC5326c instanceof f) {
                ((f) interfaceC5326c).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        int i = ((b) parcelable).f23026d;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f23011h = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new b(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f23011h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f23021s) != null) {
            velocityTracker.recycle();
            this.f23021s = null;
        }
        if (this.f23021s == null) {
            this.f23021s = VelocityTracker.obtain();
        }
        this.f23021s.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.f23012j && t()) {
            float fAbs = Math.abs(this.f23022t - motionEvent.getX());
            V0.c cVar = this.i;
            if (fAbs > cVar.f12849b) {
                cVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v10);
            }
        }
        return !this.f23012j;
    }

    public final void s(int i) {
        V v10;
        if (this.f23011h == i) {
            return;
        }
        this.f23011h = i;
        WeakReference<V> weakReference = this.f23018p;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        int i10 = this.f23011h == 5 ? 4 : 0;
        if (v10.getVisibility() != i10) {
            v10.setVisibility(i10);
        }
        Iterator it = this.f23023u.iterator();
        while (it.hasNext()) {
            ((InterfaceC5326c) it.next()).a();
        }
        v();
    }

    public final boolean t() {
        if (this.i != null) {
            return this.f23010g || this.f23011h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.q(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        s(2);
        r2.f23008e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            m4.d r0 = r2.f23004a
            int r0 = r0.d()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = g0.C4356c.h(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            m4.d r0 = r2.f23004a
            int r0 = r0.c()
        L1f:
            V0.c r1 = r2.i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.q(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f12865s = r3
            r3 = -1
            r1.f12850c = r3
            r3 = 0
            boolean r3 = r1.i(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f12848a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f12865s
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f12865s = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.s(r3)
            com.google.android.material.sidesheet.SideSheetBehavior<V>$c r3 = r2.f23008e
            r3.a(r4)
            return
        L57:
            r2.s(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.u(android.view.View, int, boolean):void");
    }

    public final void v() {
        V v10;
        WeakReference<V> weakReference = this.f23018p;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        I.l(262144, v10);
        I.i(0, v10);
        I.l(1048576, v10);
        I.i(0, v10);
        final int i = 5;
        if (this.f23011h != 5) {
            I.m(v10, g.a.f4129k, new i() { // from class: m4.e
                @Override // M0.i
                public final boolean a(View view) {
                    SideSheetBehavior sideSheetBehavior = this.f44079a;
                    sideSheetBehavior.getClass();
                    int i10 = i;
                    if (i10 == 1 || i10 == 2) {
                        throw new IllegalArgumentException(B4.f.c(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    Reference reference = sideSheetBehavior.f23018p;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.s(i10);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.f23018p.get();
                    h hVar = new h(i10, 3, sideSheetBehavior);
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap<View, S> weakHashMap = I.f3792a;
                        if (view2.isAttachedToWindow()) {
                            view2.post(hVar);
                            return true;
                        }
                    }
                    hVar.run();
                    return true;
                }
            });
        }
        final int i10 = 3;
        if (this.f23011h != 3) {
            I.m(v10, g.a.i, new i() { // from class: m4.e
                @Override // M0.i
                public final boolean a(View view) {
                    SideSheetBehavior sideSheetBehavior = this.f44079a;
                    sideSheetBehavior.getClass();
                    int i102 = i10;
                    if (i102 == 1 || i102 == 2) {
                        throw new IllegalArgumentException(B4.f.c(new StringBuilder("STATE_"), i102 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    Reference reference = sideSheetBehavior.f23018p;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.s(i102);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.f23018p.get();
                    h hVar = new h(i102, 3, sideSheetBehavior);
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap<View, S> weakHashMap = I.f3792a;
                        if (view2.isAttachedToWindow()) {
                            view2.post(hVar);
                            return true;
                        }
                    }
                    hVar.run();
                    return true;
                }
            });
        }
    }

    public static class b extends U0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final int f23026d;

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
            this.f23026d = parcel.readInt();
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23026d);
        }

        public b(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f23026d = sideSheetBehavior.f23011h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23008e = new c();
        this.f23010g = true;
        this.f23011h = 5;
        this.f23013k = 0.1f;
        this.f23020r = -1;
        this.f23023u = new LinkedHashSet();
        this.f23024v = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3137y);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f23006c = C4415c.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f23007d = C5290i.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f23020r = resourceId;
            WeakReference<View> weakReference = this.f23019q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f23019q = null;
            WeakReference<V> weakReference2 = this.f23018p;
            if (weakReference2 != null) {
                V v10 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    if (v10.isLaidOut()) {
                        v10.requestLayout();
                    }
                }
            }
        }
        C5290i c5290i = this.f23007d;
        if (c5290i != null) {
            C5287f c5287f = new C5287f(c5290i);
            this.f23005b = c5287f;
            c5287f.i(context);
            ColorStateList colorStateList = this.f23006c;
            if (colorStateList != null) {
                this.f23005b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f23005b.setTint(typedValue.data);
            }
        }
        this.f23009f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f23010g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
