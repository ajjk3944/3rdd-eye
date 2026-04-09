package com.google.android.material.bottomsheet;

import F1.W;
import G1.t;
import G1.w;
import M1.c;
import O3.h;
import O3.i;
import O3.j;
import a4.C3762b;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.n;
import com.google.ar.core.ImageMetadata;
import f.AbstractC5487d;
import f4.C5527g;
import f4.C5531k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.snmp4j.mp.PduHandle;
import z1.AbstractC8707a;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: i0, reason: collision with root package name */
    private static final int f37033i0 = i.f17141c;

    /* renamed from: A, reason: collision with root package name */
    private boolean f37034A;

    /* renamed from: B, reason: collision with root package name */
    private final g f37035B;

    /* renamed from: C, reason: collision with root package name */
    private ValueAnimator f37036C;

    /* renamed from: D, reason: collision with root package name */
    int f37037D;

    /* renamed from: E, reason: collision with root package name */
    int f37038E;

    /* renamed from: F, reason: collision with root package name */
    int f37039F;

    /* renamed from: G, reason: collision with root package name */
    float f37040G;

    /* renamed from: H, reason: collision with root package name */
    int f37041H;

    /* renamed from: I, reason: collision with root package name */
    float f37042I;

    /* renamed from: J, reason: collision with root package name */
    boolean f37043J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f37044K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f37045L;

    /* renamed from: M, reason: collision with root package name */
    int f37046M;

    /* renamed from: N, reason: collision with root package name */
    int f37047N;

    /* renamed from: O, reason: collision with root package name */
    M1.c f37048O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f37049P;

    /* renamed from: Q, reason: collision with root package name */
    private int f37050Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f37051R;

    /* renamed from: S, reason: collision with root package name */
    private float f37052S;

    /* renamed from: T, reason: collision with root package name */
    private int f37053T;

    /* renamed from: U, reason: collision with root package name */
    int f37054U;

    /* renamed from: V, reason: collision with root package name */
    int f37055V;

    /* renamed from: W, reason: collision with root package name */
    WeakReference f37056W;

    /* renamed from: X, reason: collision with root package name */
    WeakReference f37057X;

    /* renamed from: Y, reason: collision with root package name */
    WeakReference f37058Y;

    /* renamed from: Z, reason: collision with root package name */
    private final ArrayList f37059Z;

    /* renamed from: a, reason: collision with root package name */
    private int f37060a;

    /* renamed from: a0, reason: collision with root package name */
    private VelocityTracker f37061a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37062b;

    /* renamed from: b0, reason: collision with root package name */
    C3762b f37063b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37064c;

    /* renamed from: c0, reason: collision with root package name */
    int f37065c0;

    /* renamed from: d, reason: collision with root package name */
    private float f37066d;

    /* renamed from: d0, reason: collision with root package name */
    private int f37067d0;

    /* renamed from: e, reason: collision with root package name */
    private int f37068e;

    /* renamed from: e0, reason: collision with root package name */
    boolean f37069e0;

    /* renamed from: f, reason: collision with root package name */
    private int f37070f;

    /* renamed from: f0, reason: collision with root package name */
    private Map f37071f0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37072g;

    /* renamed from: g0, reason: collision with root package name */
    final SparseIntArray f37073g0;

    /* renamed from: h, reason: collision with root package name */
    private int f37074h;

    /* renamed from: h0, reason: collision with root package name */
    private final c.AbstractC0492c f37075h0;

    /* renamed from: i, reason: collision with root package name */
    private int f37076i;

    /* renamed from: j, reason: collision with root package name */
    private C5527g f37077j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f37078k;

    /* renamed from: l, reason: collision with root package name */
    private int f37079l;

    /* renamed from: m, reason: collision with root package name */
    private int f37080m;

    /* renamed from: n, reason: collision with root package name */
    private int f37081n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f37082o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f37083p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37084q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f37085r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f37086s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f37087t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f37088u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f37089v;

    /* renamed from: w, reason: collision with root package name */
    private int f37090w;

    /* renamed from: x, reason: collision with root package name */
    private int f37091x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f37092y;

    /* renamed from: z, reason: collision with root package name */
    private C5531k f37093z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f37094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37095b;

        a(View view, int i10) {
            this.f37094a = view;
            this.f37095b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.V0(this.f37094a, this.f37095b, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f37077j != null) {
                BottomSheetBehavior.this.f37077j.U(fFloatValue);
            }
        }
    }

    class c implements n.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37098a;

        c(boolean z10) {
            this.f37098a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.n.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public F1.C2780w0 a(android.view.View r11, F1.C2780w0 r12, com.google.android.material.internal.n.d r13) {
            /*
                r10 = this;
                int r0 = F1.C2780w0.l.h()
                w1.f r0 = r12.f(r0)
                int r1 = F1.C2780w0.l.e()
                w1.f r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f64337b
                com.google.android.material.bottomsheet.BottomSheetBehavior.P(r2, r3)
                boolean r2 = com.google.android.material.internal.n.g(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.i()
                com.google.android.material.bottomsheet.BottomSheetBehavior.S(r3, r6)
                int r3 = r13.f37612d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f37611c
                goto L50
            L4e:
                int r4 = r13.f37609a
            L50:
                int r6 = r0.f64336a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f37609a
                goto L62
            L60:
                int r13 = r13.f37611c
            L62:
                int r2 = r0.f64338c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f64336a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.W(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f64338c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f64337b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f37098a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f64339d
                com.google.android.material.bottomsheet.BottomSheetBehavior.G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f37098a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.H(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, F1.w0, com.google.android.material.internal.n$d):F1.w0");
        }
    }

    class d extends c.AbstractC0492c {

        /* renamed from: a, reason: collision with root package name */
        private long f37100a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f37055V + bottomSheetBehavior.m0()) / 2;
        }

        @Override // M1.c.AbstractC0492c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // M1.c.AbstractC0492c
        public int b(View view, int i10, int i11) {
            return AbstractC8707a.b(i10, BottomSheetBehavior.this.m0(), e(view));
        }

        @Override // M1.c.AbstractC0492c
        public int e(View view) {
            return BottomSheetBehavior.this.e0() ? BottomSheetBehavior.this.f37055V : BottomSheetBehavior.this.f37041H;
        }

        @Override // M1.c.AbstractC0492c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f37045L) {
                BottomSheetBehavior.this.O0(1);
            }
        }

        @Override // M1.c.AbstractC0492c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.j0(i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // M1.c.AbstractC0492c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // M1.c.AbstractC0492c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f37046M;
            if (i11 == 1 || bottomSheetBehavior.f37069e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f37065c0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f37058Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f37100a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f37056W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37102a;

        e(int i10) {
            this.f37102a = i10;
        }

        @Override // G1.w
        public boolean a(View view, w.a aVar) {
            BottomSheetBehavior.this.N0(this.f37102a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f37060a = 0;
        this.f37062b = true;
        this.f37064c = false;
        this.f37079l = -1;
        this.f37080m = -1;
        this.f37035B = new g(this, null);
        this.f37040G = 0.5f;
        this.f37042I = -1.0f;
        this.f37045L = true;
        this.f37046M = 4;
        this.f37047N = 4;
        this.f37052S = 0.1f;
        this.f37059Z = new ArrayList();
        this.f37067d0 = -1;
        this.f37073g0 = new SparseIntArray();
        this.f37075h0 = new d();
    }

    private void P0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || r0() || this.f37072g) ? false : true;
        if (this.f37083p || this.f37084q || this.f37085r || this.f37087t || this.f37088u || this.f37089v || z10) {
            n.b(view, new c(z10));
        }
    }

    private boolean R0() {
        return this.f37048O != null && (this.f37045L || this.f37046M == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(View view, int i10, boolean z10) {
        int iN0 = n0(i10);
        M1.c cVar = this.f37048O;
        if (cVar == null || (!z10 ? cVar.H(view, view.getLeft(), iN0) : cVar.F(view.getLeft(), iN0))) {
            O0(i10);
            return;
        }
        O0(2);
        Y0(i10, true);
        this.f37035B.c(i10);
    }

    private void W0() {
        WeakReference weakReference = this.f37056W;
        if (weakReference != null) {
            X0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f37057X;
        if (weakReference2 != null) {
            X0((View) weakReference2.get(), 1);
        }
    }

    private int X(View view, int i10, int i11) {
        return W.c(view, view.getResources().getString(i10), g0(i11));
    }

    private void X0(View view, int i10) {
        if (view == null) {
            return;
        }
        f0(view, i10);
        if (!this.f37062b && this.f37046M != 6) {
            this.f37073g0.put(i10, X(view, h.f17116a, 6));
        }
        if (this.f37043J && t0() && this.f37046M != 5) {
            w0(view, t.a.f6812y, 5);
        }
        int i11 = this.f37046M;
        if (i11 == 3) {
            w0(view, t.a.f6811x, this.f37062b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            w0(view, t.a.f6810w, this.f37062b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            w0(view, t.a.f6811x, 4);
            w0(view, t.a.f6810w, 3);
        }
    }

    private void Y() {
        int iC0 = c0();
        if (this.f37062b) {
            this.f37041H = Math.max(this.f37055V - iC0, this.f37038E);
        } else {
            this.f37041H = this.f37055V - iC0;
        }
    }

    private void Y0(int i10, boolean z10) {
        boolean zQ0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f37034A == (zQ0 = q0()) || this.f37077j == null) {
            return;
        }
        this.f37034A = zQ0;
        if (!z10 || (valueAnimator = this.f37036C) == null) {
            ValueAnimator valueAnimator2 = this.f37036C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f37036C.cancel();
            }
            this.f37077j.U(this.f37034A ? b0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f37036C.reverse();
        } else {
            this.f37036C.setFloatValues(this.f37077j.w(), zQ0 ? b0() : 1.0f);
            this.f37036C.start();
        }
    }

    private float Z(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    private void Z0(boolean z10) {
        Map map;
        WeakReference weakReference = this.f37056W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f37071f0 != null) {
                    return;
                } else {
                    this.f37071f0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f37056W.get()) {
                    if (z10) {
                        this.f37071f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f37064c) {
                            W.u0(childAt, 4);
                        }
                    } else if (this.f37064c && (map = this.f37071f0) != null && map.containsKey(childAt)) {
                        W.u0(childAt, ((Integer) this.f37071f0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f37071f0 = null;
            } else if (this.f37064c) {
                ((View) this.f37056W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void a0() {
        this.f37039F = (int) (this.f37055V * (1.0f - this.f37040G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(boolean z10) {
        View view;
        if (this.f37056W != null) {
            Y();
            if (this.f37046M != 4 || (view = (View) this.f37056W.get()) == null) {
                return;
            }
            if (z10) {
                N0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private float b0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f37077j == null || (weakReference = this.f37056W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f37056W.get();
        if (!p0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(Z(this.f37077j.C(), rootWindowInsets.getRoundedCorner(0)), Z(this.f37077j.D(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int c0() {
        int i10;
        return this.f37072g ? Math.min(Math.max(this.f37074h, this.f37055V - ((this.f37054U * 9) / 16)), this.f37053T) + this.f37090w : (this.f37082o || this.f37083p || (i10 = this.f37081n) <= 0) ? this.f37070f + this.f37090w : Math.max(this.f37070f, i10 + this.f37076i);
    }

    private float d0(int i10) {
        float f10;
        float fM0;
        int i11 = this.f37041H;
        if (i10 > i11 || i11 == m0()) {
            int i12 = this.f37041H;
            f10 = i12 - i10;
            fM0 = this.f37055V - i12;
        } else {
            int i13 = this.f37041H;
            f10 = i13 - i10;
            fM0 = i13 - m0();
        }
        return f10 / fM0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e0() {
        return s0() && t0();
    }

    private void f0(View view, int i10) {
        if (view == null) {
            return;
        }
        W.g0(view, ImageMetadata.LENS_APERTURE);
        W.g0(view, 262144);
        W.g0(view, ImageMetadata.SHADING_MODE);
        int i11 = this.f37073g0.get(i10, -1);
        if (i11 != -1) {
            W.g0(view, i11);
            this.f37073g0.delete(i10);
        }
    }

    private w g0(int i10) {
        return new e(i10);
    }

    private void h0(Context context) {
        if (this.f37093z == null) {
            return;
        }
        C5527g c5527g = new C5527g(this.f37093z);
        this.f37077j = c5527g;
        c5527g.J(context);
        ColorStateList colorStateList = this.f37078k;
        if (colorStateList != null) {
            this.f37077j.T(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f37077j.setTint(typedValue.data);
    }

    private void i0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(b0(), 1.0f);
        this.f37036C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f37036C.addUpdateListener(new b());
    }

    private int l0(int i10, int i11, int i12, int i13) {
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

    private int n0(int i10) {
        if (i10 == 3) {
            return m0();
        }
        if (i10 == 4) {
            return this.f37041H;
        }
        if (i10 == 5) {
            return this.f37055V;
        }
        if (i10 == 6) {
            return this.f37039F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float o0() {
        VelocityTracker velocityTracker = this.f37061a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f37066d);
        return this.f37061a0.getYVelocity(this.f37065c0);
    }

    private boolean p0() {
        WeakReference weakReference = this.f37056W;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f37056W.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean q0() {
        return this.f37046M == 3 && (this.f37092y || p0());
    }

    private boolean u0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && W.P(view);
    }

    private void w0(View view, t.a aVar, int i10) {
        W.i0(view, aVar, null, g0(i10));
    }

    private void x0() {
        this.f37065c0 = -1;
        this.f37067d0 = -1;
        VelocityTracker velocityTracker = this.f37061a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37061a0 = null;
        }
    }

    private void y0(f fVar) {
        int i10 = this.f37060a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f37070f = fVar.f37105d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f37062b = fVar.f37106e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f37043J = fVar.f37107f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f37044K = fVar.f37108g;
        }
    }

    private void z0(View view, Runnable runnable) {
        if (u0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f37050Q = 0;
        this.f37051R = false;
        return (i10 & 2) != 0;
    }

    public void A0(boolean z10) {
        this.f37045L = z10;
    }

    public void B0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f37037D = i10;
        Y0(this.f37046M, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.O0(r0)
            return
        Lf:
            boolean r3 = r2.v0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f37058Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f37051R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f37050Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f37062b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f37039F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f37043J
            if (r3 == 0) goto L49
            float r3 = r2.o0()
            boolean r3 = r2.S0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f37050Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f37062b
            if (r1 == 0) goto L68
            int r5 = r2.f37038E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f37041H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f37039F
            if (r3 >= r1) goto L7e
            int r1 = r2.f37041H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.T0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f37041H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f37062b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f37039F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f37041H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.V0(r4, r0, r3)
            r2.f37051R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(boolean z10) {
        if (this.f37062b == z10) {
            return;
        }
        this.f37062b = z10;
        if (this.f37056W != null) {
            Y();
        }
        O0((this.f37062b && this.f37046M == 6) ? 3 : this.f37046M);
        Y0(this.f37046M, true);
        W0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f37046M == 1 && actionMasked == 0) {
            return true;
        }
        if (R0()) {
            this.f37048O.z(motionEvent);
        }
        if (actionMasked == 0) {
            x0();
        }
        if (this.f37061a0 == null) {
            this.f37061a0 = VelocityTracker.obtain();
        }
        this.f37061a0.addMovement(motionEvent);
        if (R0() && actionMasked == 2 && !this.f37049P && Math.abs(this.f37067d0 - motionEvent.getY()) > this.f37048O.u()) {
            this.f37048O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f37049P;
    }

    public void D0(boolean z10) {
        this.f37082o = z10;
    }

    public void E0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f37040G = f10;
        if (this.f37056W != null) {
            a0();
        }
    }

    public void F0(boolean z10) {
        if (this.f37043J != z10) {
            this.f37043J = z10;
            if (!z10 && this.f37046M == 5) {
                N0(4);
            }
            W0();
        }
    }

    public void G0(int i10) {
        this.f37080m = i10;
    }

    public void H0(int i10) {
        this.f37079l = i10;
    }

    public void I0(int i10) {
        J0(i10, false);
    }

    public final void J0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f37072g) {
                return;
            } else {
                this.f37072g = true;
            }
        } else {
            if (!this.f37072g && this.f37070f == i10) {
                return;
            }
            this.f37072g = false;
            this.f37070f = Math.max(0, i10);
        }
        a1(z10);
    }

    public void K0(int i10) {
        this.f37060a = i10;
    }

    public void L0(int i10) {
        this.f37068e = i10;
    }

    public void M0(boolean z10) {
        this.f37044K = z10;
    }

    public void N0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f37043J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f37062b && n0(i10) <= this.f37038E) ? 3 : i10;
        WeakReference weakReference = this.f37056W;
        if (weakReference == null || weakReference.get() == null) {
            O0(i10);
        } else {
            View view = (View) this.f37056W.get();
            z0(view, new a(view, i11));
        }
    }

    void O0(int i10) {
        if (this.f37046M == i10) {
            return;
        }
        this.f37046M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f37043J && i10 == 5)) {
            this.f37047N = i10;
        }
        WeakReference weakReference = this.f37056W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            Z0(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            Z0(false);
        }
        Y0(i10, true);
        if (this.f37059Z.size() <= 0) {
            W0();
        } else {
            AbstractC5487d.a(this.f37059Z.get(0));
            throw null;
        }
    }

    public boolean Q0(long j10, float f10) {
        return false;
    }

    boolean S0(View view, float f10) {
        if (this.f37044K) {
            return true;
        }
        if (t0() && view.getTop() >= this.f37041H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f37052S)) - ((float) this.f37041H)) / ((float) c0()) > 0.5f;
        }
        return false;
    }

    public boolean T0() {
        return false;
    }

    public boolean U0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f37056W = null;
        this.f37048O = null;
        this.f37063b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.f37056W = null;
        this.f37048O = null;
        this.f37063b0 = null;
    }

    void j0(int i10) {
        if (((View) this.f37056W.get()) == null || this.f37059Z.isEmpty()) {
            return;
        }
        d0(i10);
        if (this.f37059Z.size() <= 0) {
            return;
        }
        AbstractC5487d.a(this.f37059Z.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        M1.c cVar;
        if (!view.isShown() || !this.f37045L) {
            this.f37049P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x0();
        }
        if (this.f37061a0 == null) {
            this.f37061a0 = VelocityTracker.obtain();
        }
        this.f37061a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f37067d0 = (int) motionEvent.getY();
            if (this.f37046M != 2) {
                WeakReference weakReference = this.f37058Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.z(view2, x10, this.f37067d0)) {
                    this.f37065c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f37069e0 = true;
                }
            }
            this.f37049P = this.f37065c0 == -1 && !coordinatorLayout.z(view, x10, this.f37067d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f37069e0 = false;
            this.f37065c0 = -1;
            if (this.f37049P) {
                this.f37049P = false;
                return false;
            }
        }
        if (!this.f37049P && (cVar = this.f37048O) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f37058Y;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f37049P || this.f37046M == 1 || coordinatorLayout.z(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f37048O == null || (i10 = this.f37067d0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f37048O.u())) ? false : true;
    }

    View k0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (W.R(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewK0 = k0(viewGroup.getChildAt(i10));
                if (viewK0 != null) {
                    return viewK0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (W.w(coordinatorLayout) && !W.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f37056W == null) {
            this.f37074h = coordinatorLayout.getResources().getDimensionPixelSize(O3.c.f17019a);
            P0(view);
            W.D0(view, new com.google.android.material.bottomsheet.a(view));
            this.f37056W = new WeakReference(view);
            this.f37063b0 = new C3762b(view);
            C5527g c5527g = this.f37077j;
            if (c5527g != null) {
                W.q0(view, c5527g);
                C5527g c5527g2 = this.f37077j;
                float fU = this.f37042I;
                if (fU == -1.0f) {
                    fU = W.u(view);
                }
                c5527g2.S(fU);
            } else {
                ColorStateList colorStateList = this.f37078k;
                if (colorStateList != null) {
                    W.r0(view, colorStateList);
                }
            }
            W0();
            if (W.x(view) == 0) {
                W.u0(view, 1);
            }
        }
        if (this.f37048O == null) {
            this.f37048O = M1.c.m(coordinatorLayout, this.f37075h0);
        }
        int top = view.getTop();
        coordinatorLayout.G(view, i10);
        this.f37054U = coordinatorLayout.getWidth();
        this.f37055V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f37053T = height;
        int iMin = this.f37055V;
        int i11 = iMin - height;
        int i12 = this.f37091x;
        if (i11 < i12) {
            if (this.f37086s) {
                int i13 = this.f37080m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f37053T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f37080m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f37053T = iMin2;
            }
        }
        this.f37038E = Math.max(0, this.f37055V - this.f37053T);
        a0();
        Y();
        int i15 = this.f37046M;
        if (i15 == 3) {
            W.X(view, m0());
        } else if (i15 == 6) {
            W.X(view, this.f37039F);
        } else if (this.f37043J && i15 == 5) {
            W.X(view, this.f37055V);
        } else if (i15 == 4) {
            W.X(view, this.f37041H);
        } else if (i15 == 1 || i15 == 2) {
            W.X(view, top - view.getTop());
        }
        Y0(this.f37046M, false);
        this.f37058Y = new WeakReference(k0(view));
        if (this.f37059Z.size() <= 0) {
            return true;
        }
        AbstractC5487d.a(this.f37059Z.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(l0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f37079l, marginLayoutParams.width), l0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f37080m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        if (this.f37062b) {
            return this.f37038E;
        }
        return Math.max(this.f37037D, this.f37086s ? 0 : this.f37091x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        if (v0() && (weakReference = this.f37058Y) != null && view2 == weakReference.get()) {
            return this.f37046M != 3 || super.o(coordinatorLayout, view, view2, f10, f11);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f37058Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!v0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < m0()) {
                    int iM0 = top - m0();
                    iArr[1] = iM0;
                    W.X(view, -iM0);
                    O0(3);
                } else {
                    if (!this.f37045L) {
                        return;
                    }
                    iArr[1] = i11;
                    W.X(view, -i11);
                    O0(1);
                }
            } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
                if (i13 > this.f37041H && !e0()) {
                    int i14 = top - this.f37041H;
                    iArr[1] = i14;
                    W.X(view, -i14);
                    O0(4);
                } else {
                    if (!this.f37045L) {
                        return;
                    }
                    iArr[1] = i11;
                    W.X(view, -i11);
                    O0(1);
                }
            }
            j0(view.getTop());
            this.f37050Q = i11;
            this.f37051R = true;
        }
    }

    public boolean r0() {
        return this.f37082o;
    }

    public boolean s0() {
        return this.f37043J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public boolean t0() {
        return true;
    }

    public boolean v0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        y0(fVar);
        int i10 = fVar.f37104c;
        if (i10 == 1 || i10 == 2) {
            this.f37046M = 4;
            this.f37047N = 4;
        } else {
            this.f37046M = i10;
            this.f37047N = i10;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    private class g {

        /* renamed from: a, reason: collision with root package name */
        private int f37109a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f37110b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f37111c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f37110b = false;
                M1.c cVar = BottomSheetBehavior.this.f37048O;
                if (cVar != null && cVar.k(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f37109a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f37046M == 2) {
                    bottomSheetBehavior.O0(gVar2.f37109a);
                }
            }
        }

        private g() {
            this.f37111c = new a();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f37056W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f37109a = i10;
            if (this.f37110b) {
                return;
            }
            W.e0((View) BottomSheetBehavior.this.f37056W.get(), this.f37111c);
            this.f37110b = true;
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class f extends L1.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f37104c;

        /* renamed from: d, reason: collision with root package name */
        int f37105d;

        /* renamed from: e, reason: collision with root package name */
        boolean f37106e;

        /* renamed from: f, reason: collision with root package name */
        boolean f37107f;

        /* renamed from: g, reason: collision with root package name */
        boolean f37108g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37104c = parcel.readInt();
            this.f37105d = parcel.readInt();
            this.f37106e = parcel.readInt() == 1;
            this.f37107f = parcel.readInt() == 1;
            this.f37108g = parcel.readInt() == 1;
        }

        @Override // L1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f37104c);
            parcel.writeInt(this.f37105d);
            parcel.writeInt(this.f37106e ? 1 : 0);
            parcel.writeInt(this.f37107f ? 1 : 0);
            parcel.writeInt(this.f37108g ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f37104c = bottomSheetBehavior.f37046M;
            this.f37105d = bottomSheetBehavior.f37070f;
            this.f37106e = bottomSheetBehavior.f37062b;
            this.f37107f = bottomSheetBehavior.f37043J;
            this.f37108g = bottomSheetBehavior.f37044K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f37060a = 0;
        this.f37062b = true;
        this.f37064c = false;
        this.f37079l = -1;
        this.f37080m = -1;
        this.f37035B = new g(this, null);
        this.f37040G = 0.5f;
        this.f37042I = -1.0f;
        this.f37045L = true;
        this.f37046M = 4;
        this.f37047N = 4;
        this.f37052S = 0.1f;
        this.f37059Z = new ArrayList();
        this.f37067d0 = -1;
        this.f37073g0 = new SparseIntArray();
        this.f37075h0 = new d();
        this.f37076i = context.getResources().getDimensionPixelSize(O3.c.f17012S);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f17540x);
        int i11 = j.f17162B;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f37078k = c4.c.a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(j.f17306T)) {
            this.f37093z = C5531k.e(context, attributeSet, O3.a.f16963b, f37033i0).m();
        }
        h0(context);
        i0();
        this.f37042I = typedArrayObtainStyledAttributes.getDimension(j.f17154A, -1.0f);
        int i12 = j.f17548y;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            H0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = j.f17556z;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            G0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = j.f17210H;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            I0(i10);
        } else {
            I0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        F0(typedArrayObtainStyledAttributes.getBoolean(j.f17202G, false));
        D0(typedArrayObtainStyledAttributes.getBoolean(j.f17242L, false));
        C0(typedArrayObtainStyledAttributes.getBoolean(j.f17186E, true));
        M0(typedArrayObtainStyledAttributes.getBoolean(j.f17234K, false));
        A0(typedArrayObtainStyledAttributes.getBoolean(j.f17170C, true));
        K0(typedArrayObtainStyledAttributes.getInt(j.f17218I, 0));
        E0(typedArrayObtainStyledAttributes.getFloat(j.f17194F, 0.5f));
        int i15 = j.f17178D;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            B0(typedValuePeekValue2.data);
        } else {
            B0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        L0(typedArrayObtainStyledAttributes.getInt(j.f17226J, 500));
        this.f37083p = typedArrayObtainStyledAttributes.getBoolean(j.f17274P, false);
        this.f37084q = typedArrayObtainStyledAttributes.getBoolean(j.f17282Q, false);
        this.f37085r = typedArrayObtainStyledAttributes.getBoolean(j.f17290R, false);
        this.f37086s = typedArrayObtainStyledAttributes.getBoolean(j.f17298S, true);
        this.f37087t = typedArrayObtainStyledAttributes.getBoolean(j.f17250M, false);
        this.f37088u = typedArrayObtainStyledAttributes.getBoolean(j.f17258N, false);
        this.f37089v = typedArrayObtainStyledAttributes.getBoolean(j.f17266O, false);
        this.f37092y = typedArrayObtainStyledAttributes.getBoolean(j.f17314U, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f37066d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
