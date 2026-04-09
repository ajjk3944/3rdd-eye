package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import b5.j;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import h5.d;
import j4.k;
import j4.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import s0.a0;
import s0.x;
import y0.c;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c implements b5.b {

    /* renamed from: a, reason: collision with root package name */
    public h5.c f11074a;

    /* renamed from: b, reason: collision with root package name */
    public float f11075b;

    /* renamed from: c, reason: collision with root package name */
    public MaterialShapeDrawable f11076c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f11077d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.material.shape.a f11078e;

    /* renamed from: f, reason: collision with root package name */
    public final c f11079f;

    /* renamed from: g, reason: collision with root package name */
    public float f11080g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11081h;

    /* renamed from: i, reason: collision with root package name */
    public int f11082i;

    /* renamed from: j, reason: collision with root package name */
    public int f11083j;

    /* renamed from: k, reason: collision with root package name */
    public y0.c f11084k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11085l;

    /* renamed from: m, reason: collision with root package name */
    public float f11086m;

    /* renamed from: n, reason: collision with root package name */
    public int f11087n;

    /* renamed from: o, reason: collision with root package name */
    public int f11088o;

    /* renamed from: p, reason: collision with root package name */
    public int f11089p;

    /* renamed from: q, reason: collision with root package name */
    public int f11090q;

    /* renamed from: r, reason: collision with root package name */
    public WeakReference f11091r;

    /* renamed from: s, reason: collision with root package name */
    public WeakReference f11092s;

    /* renamed from: t, reason: collision with root package name */
    public int f11093t;

    /* renamed from: u, reason: collision with root package name */
    public VelocityTracker f11094u;

    /* renamed from: v, reason: collision with root package name */
    public j f11095v;

    /* renamed from: w, reason: collision with root package name */
    public int f11096w;

    /* renamed from: x, reason: collision with root package name */
    public final Set f11097x;

    /* renamed from: y, reason: collision with root package name */
    public final c.AbstractC0503c f11098y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f11073z = j4.j.side_sheet_accessibility_pane_title;
    public static final int A = k.Widget_Material3_SideSheet;

    public class a extends c.AbstractC0503c {
        public a() {
        }

        @Override // y0.c.AbstractC0503c
        public int a(View view, int i10, int i11) {
            return m0.a.b(i10, SideSheetBehavior.this.f11074a.g(), SideSheetBehavior.this.f11074a.f());
        }

        @Override // y0.c.AbstractC0503c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // y0.c.AbstractC0503c
        public int d(View view) {
            return SideSheetBehavior.this.f11087n + SideSheetBehavior.this.k0();
        }

        @Override // y0.c.AbstractC0503c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f11081h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        @Override // y0.c.AbstractC0503c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f11074a.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // y0.c.AbstractC0503c
        public void l(View view, float f10, float f11) {
            int iW = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, iW, sideSheetBehavior.K0());
        }

        @Override // y0.c.AbstractC0503c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f11082i == 1 || SideSheetBehavior.this.f11091r == null || SideSheetBehavior.this.f11091r.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.f11091r == null || SideSheetBehavior.this.f11091r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f11091r.get()).requestLayout();
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f11102a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11103b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f11104c = new Runnable() { // from class: h5.h
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(this.f21411a);
            }
        };

        public c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f11103b = false;
            if (SideSheetBehavior.this.f11084k != null && SideSheetBehavior.this.f11084k.m(true)) {
                cVar.b(cVar.f11102a);
            } else if (SideSheetBehavior.this.f11082i == 2) {
                SideSheetBehavior.this.G0(cVar.f11102a);
            }
        }

        public void b(int i10) {
            if (SideSheetBehavior.this.f11091r == null || SideSheetBehavior.this.f11091r.get() == null) {
                return;
            }
            this.f11102a = i10;
            if (this.f11103b) {
                return;
            }
            ((View) SideSheetBehavior.this.f11091r.get()).postOnAnimation(this.f11104c);
            this.f11103b = true;
        }
    }

    public SideSheetBehavior() {
        this.f11079f = new c();
        this.f11081h = true;
        this.f11082i = 5;
        this.f11083j = 5;
        this.f11086m = 0.1f;
        this.f11093t = -1;
        this.f11097x = new LinkedHashSet();
        this.f11098y = new a();
    }

    private void A0(View view, Runnable runnable) {
        if (v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean H0() {
        if (this.f11084k != null) {
            return this.f11081h || this.f11082i == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i10, View view, a0.a aVar) {
        sideSheetBehavior.F0(i10);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i10) {
        View view = (View) sideSheetBehavior.f11091r.get();
        if (view != null) {
            sideSheetBehavior.L0(view, i10, false);
        }
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f11074a.o(marginLayoutParams, k4.a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i10, boolean z10) {
        if (!w0(view, i10, z10)) {
            G0(i10);
        } else {
            G0(2);
            this.f11079f.b(i10);
        }
    }

    private void M0() {
        View view;
        WeakReference weakReference = this.f11091r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.d0(view, 262144);
        ViewCompat.d0(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        if (this.f11082i != 5) {
            y0(view, x.a.f24216y, 5);
        }
        if (this.f11082i != 3) {
            y0(view, x.a.f24214w, 3);
        }
    }

    private a0 Y(final int i10) {
        return new a0() { // from class: h5.e
            @Override // s0.a0
            public final boolean a(View view, a0.a aVar) {
                return SideSheetBehavior.I(this.f21403a, i10, view, aVar);
            }
        };
    }

    private void Z(Context context) {
        if (this.f11078e == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f11078e);
        this.f11076c = materialShapeDrawable;
        materialShapeDrawable.W(context);
        ColorStateList colorStateList = this.f11077d;
        if (colorStateList != null) {
            this.f11076c.i0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f11076c.setTint(typedValue.data);
    }

    private int c0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private void y0(View view, x.a aVar, int i10) {
        ViewCompat.f0(view, aVar, null, Y(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.c() != null) {
            super.B(coordinatorLayout, view, savedState.c());
        }
        int i10 = savedState.f11099c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f11082i = i10;
        this.f11083j = i10;
    }

    public void B0(int i10) {
        this.f11093t = i10;
        X();
        WeakReference weakReference = this.f11091r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.C(coordinatorLayout, view), this);
    }

    public void C0(boolean z10) {
        this.f11081h = z10;
    }

    public final void D0(int i10) {
        h5.c cVar = this.f11074a;
        if (cVar == null || cVar.j() != i10) {
            if (i10 == 0) {
                this.f11074a = new h5.b(this);
                if (this.f11078e == null || s0()) {
                    return;
                }
                a.b bVarW = this.f11078e.w();
                bVarW.H(0.0f).y(0.0f);
                O0(bVarW.m());
                return;
            }
            if (i10 == 1) {
                this.f11074a = new h5.a(this);
                if (this.f11078e == null || r0()) {
                    return;
                }
                a.b bVarW2 = this.f11078e.w();
                bVarW2.D(0.0f).u(0.0f);
                O0(bVarW2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    public final void E0(View view, int i10) {
        D0(Gravity.getAbsoluteGravity(((CoordinatorLayout.e) view.getLayoutParams()).f2334c, i10) == 3 ? 1 : 0);
    }

    public void F0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f11091r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i10);
        } else {
            A0((View) this.f11091r.get(), new Runnable() { // from class: h5.f
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(this.f21405a, i10);
                }
            });
        }
    }

    public void G0(int i10) {
        View view;
        if (this.f11082i == i10) {
            return;
        }
        this.f11082i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f11083j = i10;
        }
        WeakReference weakReference = this.f11091r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        P0(view);
        Iterator it = this.f11097x.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11082i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f11084k.F(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f11094u == null) {
            this.f11094u = VelocityTracker.obtain();
        }
        this.f11094u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f11085l && t0(motionEvent)) {
            this.f11084k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f11085l;
    }

    public boolean I0(View view, float f10) {
        return this.f11074a.n(view, f10);
    }

    public final boolean J0(View view) {
        return (view.isShown() || ViewCompat.n(view) != null) && this.f11081h;
    }

    public boolean K0() {
        return true;
    }

    public final void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f11091r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f11091r.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f11074a.o(marginLayoutParams, (int) ((this.f11087n * view.getScaleX()) + this.f11090q));
        viewF0.requestLayout();
    }

    public final void O0(com.google.android.material.shape.a aVar) {
        MaterialShapeDrawable materialShapeDrawable = this.f11076c;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(aVar);
        }
    }

    public final void P0(View view) {
        int i10 = this.f11082i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    public final int U(int i10, View view) {
        int i11 = this.f11082i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f11074a.h(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f11074a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f11082i);
    }

    public final float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    public final int W(View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (I0(view, f10)) {
            return (this.f11074a.m(f10, f11) || this.f11074a.l(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && d.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - g0()) < Math.abs(left - this.f11074a.e()) ? 3 : 5;
    }

    public final void X() {
        WeakReference weakReference = this.f11092s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11092s = null;
    }

    @Override // b5.b
    public void a() {
        j jVar = this.f11095v;
        if (jVar == null) {
            return;
        }
        jVar.f();
    }

    public final void a0(View view, int i10) {
        if (this.f11097x.isEmpty()) {
            return;
        }
        this.f11074a.b(i10);
        Iterator it = this.f11097x.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
    }

    @Override // b5.b
    public void b(BackEventCompat backEventCompat) {
        j jVar = this.f11095v;
        if (jVar == null) {
            return;
        }
        jVar.j(backEventCompat);
    }

    public final void b0(View view) {
        if (ViewCompat.n(view) == null) {
            ViewCompat.l0(view, view.getResources().getString(f11073z));
        }
    }

    @Override // b5.b
    public void c(BackEventCompat backEventCompat) {
        j jVar = this.f11095v;
        if (jVar == null) {
            return;
        }
        jVar.l(backEventCompat, h0());
        N0();
    }

    @Override // b5.b
    public void d() {
        j jVar = this.f11095v;
        if (jVar == null) {
            return;
        }
        BackEventCompat backEventCompatC = jVar.c();
        if (backEventCompatC == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.f11095v.h(backEventCompatC, h0(), new b(), e0());
        }
    }

    public int d0() {
        return this.f11087n;
    }

    public final ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f11074a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: h5.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(this.f21407a, marginLayoutParams, iC, viewF0, valueAnimator);
            }
        };
    }

    public View f0() {
        WeakReference weakReference = this.f11092s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f11074a.d();
    }

    public final int h0() {
        h5.c cVar = this.f11074a;
        return (cVar == null || cVar.j() == 0) ? 5 : 3;
    }

    public float i0() {
        return this.f11086m;
    }

    public float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.e eVar) {
        super.k(eVar);
        this.f11091r = null;
        this.f11084k = null;
        this.f11095v = null;
    }

    public int k0() {
        return this.f11090q;
    }

    public int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f11074a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    public int m0() {
        return this.f11089p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f11091r = null;
        this.f11084k = null;
        this.f11095v = null;
    }

    public int n0() {
        return this.f11088o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        y0.c cVar;
        if (!J0(view)) {
            this.f11085l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f11094u == null) {
            this.f11094u = VelocityTracker.obtain();
        }
        this.f11094u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f11096w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f11085l) {
            this.f11085l = false;
            return false;
        }
        return (this.f11085l || (cVar = this.f11084k) == null || !cVar.P(motionEvent)) ? false : true;
    }

    public int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f11091r == null) {
            this.f11091r = new WeakReference(view);
            this.f11095v = new j(view);
            MaterialShapeDrawable materialShapeDrawable = this.f11076c;
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f11076c;
                float elevation = this.f11080g;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                materialShapeDrawable2.h0(elevation);
            } else {
                ColorStateList colorStateList = this.f11077d;
                if (colorStateList != null) {
                    ViewCompat.n0(view, colorStateList);
                }
            }
            P0(view);
            M0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            b0(view);
        }
        E0(view, i10);
        if (this.f11084k == null) {
            this.f11084k = y0.c.o(coordinatorLayout, this.f11098y);
        }
        int iH = this.f11074a.h(view);
        coordinatorLayout.I(view, i10);
        this.f11088o = coordinatorLayout.getWidth();
        this.f11089p = this.f11074a.i(coordinatorLayout);
        this.f11087n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f11090q = marginLayoutParams != null ? this.f11074a.a(marginLayoutParams) : 0;
        ViewCompat.T(view, U(iH, view));
        x0(coordinatorLayout);
        Iterator it = this.f11097x.iterator();
        while (it.hasNext()) {
            z.a(it.next());
        }
        return true;
    }

    public y0.c p0() {
        return this.f11084k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public final CoordinatorLayout.e q0() {
        View view;
        WeakReference weakReference = this.f11091r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.e)) {
            return null;
        }
        return (CoordinatorLayout.e) view.getLayoutParams();
    }

    public final boolean r0() {
        CoordinatorLayout.e eVarQ0 = q0();
        return eVarQ0 != null && ((ViewGroup.MarginLayoutParams) eVarQ0).leftMargin > 0;
    }

    public final boolean s0() {
        CoordinatorLayout.e eVarQ0 = q0();
        return eVarQ0 != null && ((ViewGroup.MarginLayoutParams) eVarQ0).rightMargin > 0;
    }

    public final boolean t0(MotionEvent motionEvent) {
        return H0() && V((float) this.f11096w, motionEvent.getX()) > ((float) this.f11084k.z());
    }

    public final boolean u0(float f10) {
        return this.f11074a.k(f10);
    }

    public final boolean v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    public final boolean w0(View view, int i10, boolean z10) {
        int iL0 = l0(i10);
        y0.c cVarP0 = p0();
        if (cVarP0 != null) {
            return z10 ? cVarP0.O(iL0, view.getTop()) : cVarP0.Q(view, iL0, view.getTop());
        }
        return false;
    }

    public final void x0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f11092s != null || (i10 = this.f11093t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f11092s = new WeakReference(viewFindViewById);
    }

    public final void z0() {
        VelocityTracker velocityTracker = this.f11094u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11094u = null;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f11099c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11099c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f11099c);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f11099c = sideSheetBehavior.f11082i;
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11079f = new c();
        this.f11081h = true;
        this.f11082i = 5;
        this.f11083j = 5;
        this.f11086m = 0.1f;
        this.f11093t = -1;
        this.f11097x = new LinkedHashSet();
        this.f11098y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.SideSheetBehavior_Layout);
        int i10 = l.SideSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f11077d = d5.c.a(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f11078e = com.google.android.material.shape.a.e(context, attributeSet, 0, A).m();
        }
        int i11 = l.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            B0(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        Z(context);
        this.f11080g = typedArrayObtainStyledAttributes.getDimension(l.SideSheetBehavior_Layout_android_elevation, -1.0f);
        C0(typedArrayObtainStyledAttributes.getBoolean(l.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f11075b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
