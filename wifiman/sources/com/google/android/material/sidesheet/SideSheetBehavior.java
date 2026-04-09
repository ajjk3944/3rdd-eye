package com.google.android.material.sidesheet;

import F1.AbstractC2771s;
import F1.W;
import G1.t;
import G1.w;
import M1.c;
import O3.h;
import O3.i;
import O3.j;
import a4.C3763c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.ImageMetadata;
import f.AbstractC5487d;
import f4.C5527g;
import f4.C5531k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.snmp4j.mp.PduHandle;
import z1.AbstractC8707a;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.c f37616a;

    /* renamed from: b, reason: collision with root package name */
    private float f37617b;

    /* renamed from: c, reason: collision with root package name */
    private C5527g f37618c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f37619d;

    /* renamed from: e, reason: collision with root package name */
    private C5531k f37620e;

    /* renamed from: f, reason: collision with root package name */
    private final c f37621f;

    /* renamed from: g, reason: collision with root package name */
    private float f37622g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37623h;

    /* renamed from: i, reason: collision with root package name */
    private int f37624i;

    /* renamed from: j, reason: collision with root package name */
    private int f37625j;

    /* renamed from: k, reason: collision with root package name */
    private M1.c f37626k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f37627l;

    /* renamed from: m, reason: collision with root package name */
    private float f37628m;

    /* renamed from: n, reason: collision with root package name */
    private int f37629n;

    /* renamed from: o, reason: collision with root package name */
    private int f37630o;

    /* renamed from: p, reason: collision with root package name */
    private int f37631p;

    /* renamed from: q, reason: collision with root package name */
    private int f37632q;

    /* renamed from: r, reason: collision with root package name */
    private WeakReference f37633r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f37634s;

    /* renamed from: t, reason: collision with root package name */
    private int f37635t;

    /* renamed from: u, reason: collision with root package name */
    private VelocityTracker f37636u;

    /* renamed from: v, reason: collision with root package name */
    private C3763c f37637v;

    /* renamed from: w, reason: collision with root package name */
    private int f37638w;

    /* renamed from: x, reason: collision with root package name */
    private final Set f37639x;

    /* renamed from: y, reason: collision with root package name */
    private final c.AbstractC0492c f37640y;

    /* renamed from: z, reason: collision with root package name */
    private static final int f37615z = h.f17138w;

    /* renamed from: A, reason: collision with root package name */
    private static final int f37614A = i.f17144f;

    class a extends c.AbstractC0492c {
        a() {
        }

        @Override // M1.c.AbstractC0492c
        public int a(View view, int i10, int i11) {
            return AbstractC8707a.b(i10, SideSheetBehavior.this.f37616a.f(), SideSheetBehavior.this.f37616a.e());
        }

        @Override // M1.c.AbstractC0492c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // M1.c.AbstractC0492c
        public int d(View view) {
            return SideSheetBehavior.this.f37629n + SideSheetBehavior.this.d0();
        }

        @Override // M1.c.AbstractC0492c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f37623h) {
                SideSheetBehavior.this.B0(1);
            }
        }

        @Override // M1.c.AbstractC0492c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewZ = SideSheetBehavior.this.Z();
            if (viewZ != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewZ.getLayoutParams()) != null) {
                SideSheetBehavior.this.f37616a.n(marginLayoutParams, view.getLeft(), view.getRight());
                viewZ.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i10);
        }

        @Override // M1.c.AbstractC0492c
        public void l(View view, float f10, float f11) {
            int iR = SideSheetBehavior.this.R(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.G0(view, iR, sideSheetBehavior.F0());
        }

        @Override // M1.c.AbstractC0492c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f37624i == 1 || SideSheetBehavior.this.f37633r == null || SideSheetBehavior.this.f37633r.get() != view) ? false : true;
        }
    }

    class c {

        /* renamed from: a, reason: collision with root package name */
        private int f37643a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f37644b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f37645c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f37649a.c();
            }
        };

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f37644b = false;
            if (SideSheetBehavior.this.f37626k != null && SideSheetBehavior.this.f37626k.k(true)) {
                b(this.f37643a);
            } else if (SideSheetBehavior.this.f37624i == 2) {
                SideSheetBehavior.this.B0(this.f37643a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f37633r == null || SideSheetBehavior.this.f37633r.get() == null) {
                return;
            }
            this.f37643a = i10;
            if (this.f37644b) {
                return;
            }
            W.e0((View) SideSheetBehavior.this.f37633r.get(), this.f37645c);
            this.f37644b = true;
        }
    }

    public SideSheetBehavior() {
        this.f37621f = new c();
        this.f37623h = true;
        this.f37624i = 5;
        this.f37625j = 5;
        this.f37628m = 0.1f;
        this.f37635t = -1;
        this.f37639x = new LinkedHashSet();
        this.f37640y = new a();
    }

    private boolean C0() {
        return this.f37626k != null && (this.f37623h || this.f37624i == 1);
    }

    private boolean E0(View view) {
        return (view.isShown() || W.o(view) != null) && this.f37623h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(View view, int i10, boolean z10) {
        if (!p0(view, i10, z10)) {
            B0(i10);
        } else {
            B0(2);
            this.f37621f.b(i10);
        }
    }

    private void H0() {
        View view;
        WeakReference weakReference = this.f37633r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        W.g0(view, 262144);
        W.g0(view, ImageMetadata.SHADING_MODE);
        if (this.f37624i != 5) {
            t0(view, t.a.f6812y, 5);
        }
        if (this.f37624i != 3) {
            t0(view, t.a.f6810w, 3);
        }
    }

    private void I0(C5531k c5531k) {
        C5527g c5527g = this.f37618c;
        if (c5527g != null) {
            c5527g.setShapeAppearanceModel(c5531k);
        }
    }

    private void J0(View view) {
        int i10 = this.f37624i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int P(int i10, View view) {
        int i11 = this.f37624i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f37616a.g(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f37616a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f37624i);
    }

    private float Q(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(View view, float f10, float f11) {
        if (n0(f10)) {
            return 3;
        }
        if (D0(view, f10)) {
            if (!this.f37616a.l(f10, f11) && !this.f37616a.k(view)) {
                return 3;
            }
        } else if (f10 == 0.0f || !d.a(f10, f11)) {
            int left = view.getLeft();
            if (Math.abs(left - a0()) < Math.abs(left - this.f37616a.d())) {
                return 3;
            }
        }
        return 5;
    }

    private void S() {
        WeakReference weakReference = this.f37634s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f37634s = null;
    }

    private w T(final int i10) {
        return new w() { // from class: g4.a
            @Override // G1.w
            public final boolean a(View view, w.a aVar) {
                return this.f47707a.q0(i10, view, aVar);
            }
        };
    }

    private void U(Context context) {
        if (this.f37620e == null) {
            return;
        }
        C5527g c5527g = new C5527g(this.f37620e);
        this.f37618c = c5527g;
        c5527g.J(context);
        ColorStateList colorStateList = this.f37619d;
        if (colorStateList != null) {
            this.f37618c.T(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f37618c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(View view, int i10) {
        if (this.f37639x.isEmpty()) {
            return;
        }
        this.f37616a.b(i10);
        Iterator it = this.f37639x.iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
    }

    private void W(View view) {
        if (W.o(view) == null) {
            W.p0(view, view.getResources().getString(f37615z));
        }
    }

    private int X(int i10, int i11, int i12, int i13) {
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
        return View.MeasureSpec.makeMeasureSpec(i12, PduHandle.NONE);
    }

    private CoordinatorLayout.e j0() {
        View view;
        WeakReference weakReference = this.f37633r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.e)) {
            return null;
        }
        return (CoordinatorLayout.e) view.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.e eVarJ0 = j0();
        return eVarJ0 != null && ((ViewGroup.MarginLayoutParams) eVarJ0).leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.e eVarJ0 = j0();
        return eVarJ0 != null && ((ViewGroup.MarginLayoutParams) eVarJ0).rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return C0() && Q((float) this.f37638w, motionEvent.getX()) > ((float) this.f37626k.u());
    }

    private boolean n0(float f10) {
        return this.f37616a.j(f10);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && W.P(view);
    }

    private boolean p0(View view, int i10, boolean z10) {
        int iE0 = e0(i10);
        M1.c cVarI0 = i0();
        return cVarI0 != null && (!z10 ? !cVarI0.H(view, iE0, view.getTop()) : !cVarI0.F(iE0, view.getTop()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean q0(int i10, View view, w.a aVar) {
        A0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(int i10) {
        View view = (View) this.f37633r.get();
        if (view != null) {
            G0(view, i10, false);
        }
    }

    private void s0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f37634s != null || (i10 = this.f37635t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f37634s = new WeakReference(viewFindViewById);
    }

    private void t0(View view, t.a aVar, int i10) {
        W.i0(view, aVar, null, T(i10));
    }

    private void u0() {
        VelocityTracker velocityTracker = this.f37636u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37636u = null;
        }
    }

    private void v0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void y0(int i10) {
        com.google.android.material.sidesheet.c cVar = this.f37616a;
        if (cVar == null || cVar.i() != i10) {
            if (i10 == 0) {
                this.f37616a = new com.google.android.material.sidesheet.b(this);
                if (this.f37620e == null || l0()) {
                    return;
                }
                C5531k.b bVarV = this.f37620e.v();
                bVarV.E(0.0f).w(0.0f);
                I0(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f37616a = new com.google.android.material.sidesheet.a(this);
                if (this.f37620e == null || k0()) {
                    return;
                }
                C5531k.b bVarV2 = this.f37620e.v();
                bVarV2.A(0.0f).s(0.0f);
                I0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void z0(View view, int i10) {
        y0(AbstractC2771s.b(((CoordinatorLayout.e) view.getLayoutParams()).f30642c, i10) == 3 ? 1 : 0);
    }

    public void A0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference weakReference = this.f37633r;
        if (weakReference == null || weakReference.get() == null) {
            B0(i10);
        } else {
            v0((View) this.f37633r.get(), new Runnable() { // from class: g4.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47709a.r0(i10);
                }
            });
        }
    }

    void B0(int i10) {
        View view;
        if (this.f37624i == i10) {
            return;
        }
        this.f37624i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f37625j = i10;
        }
        WeakReference weakReference = this.f37633r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        J0(view);
        Iterator it = this.f37639x.iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
        H0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f37624i == 1 && actionMasked == 0) {
            return true;
        }
        if (C0()) {
            this.f37626k.z(motionEvent);
        }
        if (actionMasked == 0) {
            u0();
        }
        if (this.f37636u == null) {
            this.f37636u = VelocityTracker.obtain();
        }
        this.f37636u.addMovement(motionEvent);
        if (C0() && actionMasked == 2 && !this.f37627l && m0(motionEvent)) {
            this.f37626k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f37627l;
    }

    boolean D0(View view, float f10) {
        return this.f37616a.m(view, f10);
    }

    public boolean F0() {
        return true;
    }

    int Y() {
        return this.f37629n;
    }

    public View Z() {
        WeakReference weakReference = this.f37634s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f37616a.c();
    }

    public float b0() {
        return this.f37628m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f37632q;
    }

    int e0(int i10) {
        if (i10 == 3) {
            return a0();
        }
        if (i10 == 5) {
            return this.f37616a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int f0() {
        return this.f37631p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f37633r = null;
        this.f37626k = null;
        this.f37637v = null;
    }

    int g0() {
        return this.f37630o;
    }

    int h0() {
        return 500;
    }

    M1.c i0() {
        return this.f37626k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.f37633r = null;
        this.f37626k = null;
        this.f37637v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        M1.c cVar;
        if (!E0(view)) {
            this.f37627l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u0();
        }
        if (this.f37636u == null) {
            this.f37636u = VelocityTracker.obtain();
        }
        this.f37636u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f37638w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f37627l) {
            this.f37627l = false;
            return false;
        }
        return (this.f37627l || (cVar = this.f37626k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (W.w(coordinatorLayout) && !W.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f37633r == null) {
            this.f37633r = new WeakReference(view);
            this.f37637v = new C3763c(view);
            C5527g c5527g = this.f37618c;
            if (c5527g != null) {
                W.q0(view, c5527g);
                C5527g c5527g2 = this.f37618c;
                float fU = this.f37622g;
                if (fU == -1.0f) {
                    fU = W.u(view);
                }
                c5527g2.S(fU);
            } else {
                ColorStateList colorStateList = this.f37619d;
                if (colorStateList != null) {
                    W.r0(view, colorStateList);
                }
            }
            J0(view);
            H0();
            if (W.x(view) == 0) {
                W.u0(view, 1);
            }
            W(view);
        }
        z0(view, i10);
        if (this.f37626k == null) {
            this.f37626k = M1.c.m(coordinatorLayout, this.f37640y);
        }
        int iG = this.f37616a.g(view);
        coordinatorLayout.G(view, i10);
        this.f37630o = coordinatorLayout.getWidth();
        this.f37631p = this.f37616a.h(coordinatorLayout);
        this.f37629n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f37632q = marginLayoutParams != null ? this.f37616a.a(marginLayoutParams) : 0;
        W.W(view, P(iG, view));
        s0(coordinatorLayout);
        Iterator it = this.f37639x.iterator();
        while (it.hasNext()) {
            AbstractC5487d.a(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), X(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public void w0(int i10) {
        this.f37635t = i10;
        S();
        WeakReference weakReference = this.f37633r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !W.Q(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, view, bVar.a());
        }
        int i10 = bVar.f37642c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f37624i = i10;
        this.f37625j = i10;
    }

    public void x0(boolean z10) {
        this.f37623h = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    protected static class b extends L1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f37642c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37642c = parcel.readInt();
        }

        @Override // L1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f37642c);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f37642c = sideSheetBehavior.f37624i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37621f = new c();
        this.f37623h = true;
        this.f37624i = 5;
        this.f37625j = 5;
        this.f37628m = 0.1f;
        this.f37635t = -1;
        this.f37639x = new LinkedHashSet();
        this.f37640y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f17521u4);
        int i10 = j.f17537w4;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f37619d = c4.c.a(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(j.f17561z4)) {
            this.f37620e = C5531k.e(context, attributeSet, 0, f37614A).m();
        }
        int i11 = j.f17553y4;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            w0(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        U(context);
        this.f37622g = typedArrayObtainStyledAttributes.getDimension(j.f17529v4, -1.0f);
        x0(typedArrayObtainStyledAttributes.getBoolean(j.f17545x4, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f37617b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
