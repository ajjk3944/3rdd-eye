package com.google.android.material.bottomsheet;

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
import android.os.SystemClock;
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
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.d0;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import j4.j;
import j4.k;
import j4.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import s0.a0;
import s0.x;
import y0.c;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c implements b5.b {

    /* renamed from: l0, reason: collision with root package name */
    public static final int f9995l0 = k.Widget_Design_BottomSheet_Modal;
    public boolean A;
    public final g B;
    public ValueAnimator C;
    public int D;
    public int E;
    public int F;
    public float G;
    public int H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public y0.c Q;
    public boolean R;
    public int S;
    public boolean T;
    public float U;
    public int V;
    public int W;
    public int X;
    public WeakReference Y;
    public WeakReference Z;

    /* renamed from: a, reason: collision with root package name */
    public int f9996a;

    /* renamed from: a0, reason: collision with root package name */
    public WeakReference f9997a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9998b;

    /* renamed from: b0, reason: collision with root package name */
    public WeakReference f9999b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10000c;

    /* renamed from: c0, reason: collision with root package name */
    public final ArrayList f10001c0;

    /* renamed from: d, reason: collision with root package name */
    public float f10002d;

    /* renamed from: d0, reason: collision with root package name */
    public VelocityTracker f10003d0;

    /* renamed from: e, reason: collision with root package name */
    public int f10004e;

    /* renamed from: e0, reason: collision with root package name */
    public b5.f f10005e0;

    /* renamed from: f, reason: collision with root package name */
    public int f10006f;

    /* renamed from: f0, reason: collision with root package name */
    public int f10007f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10008g;

    /* renamed from: g0, reason: collision with root package name */
    public int f10009g0;

    /* renamed from: h, reason: collision with root package name */
    public int f10010h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f10011h0;

    /* renamed from: i, reason: collision with root package name */
    public int f10012i;

    /* renamed from: i0, reason: collision with root package name */
    public Map f10013i0;

    /* renamed from: j, reason: collision with root package name */
    public MaterialShapeDrawable f10014j;

    /* renamed from: j0, reason: collision with root package name */
    public final SparseIntArray f10015j0;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f10016k;

    /* renamed from: k0, reason: collision with root package name */
    public final c.AbstractC0503c f10017k0;

    /* renamed from: l, reason: collision with root package name */
    public int f10018l;

    /* renamed from: m, reason: collision with root package name */
    public int f10019m;

    /* renamed from: n, reason: collision with root package name */
    public int f10020n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10021o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10022p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10023q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10024r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10025s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10026t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10027u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10028v;

    /* renamed from: w, reason: collision with root package name */
    public int f10029w;

    /* renamed from: x, reason: collision with root package name */
    public int f10030x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10031y;

    /* renamed from: z, reason: collision with root package name */
    public com.google.android.material.shape.a f10032z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SaveFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f10038a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10039b;

        public a(View view, int i10) {
            this.f10038a = view;
            this.f10039b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.c1(this.f10038a, this.f10039b, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.V0(5);
            WeakReference weakReference = BottomSheetBehavior.this.Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.Y.get()).requestLayout();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f10014j != null) {
                BottomSheetBehavior.this.f10014j.j0(fFloatValue);
            }
        }
    }

    public class d implements d0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10043a;

        public d(boolean z10) {
            this.f10043a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.d0.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.core.view.WindowInsetsCompat a(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, com.google.android.material.internal.d0.e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.WindowInsetsCompat.Type.e()
                j0.b r0 = r12.f(r0)
                int r1 = androidx.core.view.WindowInsetsCompat.Type.d()
                j0.b r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f21687b
                com.google.android.material.bottomsheet.BottomSheetBehavior.T(r2, r3)
                boolean r2 = com.google.android.material.internal.d0.l(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.i()
                com.google.android.material.bottomsheet.BottomSheetBehavior.W(r3, r6)
                int r3 = r13.f10697d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.X(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f10696c
                goto L50
            L4e:
                int r4 = r13.f10694a
            L50:
                int r6 = r0.f21686a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Y(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f10694a
                goto L62
            L60:
                int r13 = r13.f10696c
            L62:
                int r2 = r0.f21688c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.Z(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f21686a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.a0(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f21688c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.J(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f21687b
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
                boolean r11 = r10.f10043a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f21689d
                com.google.android.material.bottomsheet.BottomSheetBehavior.K(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r11)
                if (r11 != 0) goto Lc9
                boolean r11 = r10.f10043a
                if (r11 == 0) goto Lc8
                goto Lc9
            Lc8:
                return r12
            Lc9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.L(r11, r6)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.d0$e):androidx.core.view.WindowInsetsCompat");
        }
    }

    public class e extends c.AbstractC0503c {

        /* renamed from: a, reason: collision with root package name */
        public long f10045a;

        public e() {
        }

        @Override // y0.c.AbstractC0503c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // y0.c.AbstractC0503c
        public int b(View view, int i10, int i11) {
            return m0.a.b(i10, BottomSheetBehavior.this.q0(), e(view));
        }

        @Override // y0.c.AbstractC0503c
        public int e(View view) {
            return BottomSheetBehavior.this.i0() ? BottomSheetBehavior.this.X : BottomSheetBehavior.this.H;
        }

        @Override // y0.c.AbstractC0503c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.V0(1);
            }
        }

        @Override // y0.c.AbstractC0503c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.n0(i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // y0.c.AbstractC0503c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        @Override // y0.c.AbstractC0503c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.O;
            if (i11 == 1 || bottomSheetBehavior.f10011h0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f10007f0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f9999b0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f10045a = SystemClock.uptimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.Y;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.X + bottomSheetBehavior.q0()) / 2;
        }
    }

    public class f implements a0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10047a;

        public f(int i10) {
            this.f10047a = i10;
        }

        @Override // s0.a0
        public boolean a(View view, a0.a aVar) {
            BottomSheetBehavior.this.U0(this.f10047a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f9996a = 0;
        this.f9998b = true;
        this.f10000c = false;
        this.f10018l = -1;
        this.f10019m = -1;
        this.B = new g(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.P = 4;
        this.U = 0.1f;
        this.f10001c0 = new ArrayList();
        this.f10009g0 = -1;
        this.f10015j0 = new SparseIntArray();
        this.f10017k0 = new e();
    }

    public final boolean A0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f9997a0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.B(view, i10, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.B(coordinatorLayout, view, savedState.c());
        E0(savedState);
        int i10 = savedState.f10033c;
        if (i10 == 1 || i10 == 2) {
            this.O = 4;
            this.P = 4;
        } else {
            this.O = i10;
            this.P = i10;
        }
    }

    public final boolean B0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f9999b0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.B(view, i10, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.C(coordinatorLayout, view), this);
    }

    public final void C0(View view, x.a aVar, int i10) {
        ViewCompat.f0(view, aVar, null, k0(i10));
    }

    public final void D0() {
        this.f10007f0 = -1;
        this.f10009g0 = -1;
        VelocityTracker velocityTracker = this.f10003d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10003d0 = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.S = 0;
        this.T = false;
        return (i10 & 2) != 0;
    }

    public final void E0(SavedState savedState) {
        int i10 = this.f9996a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f10006f = savedState.f10034d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f9998b = savedState.f10035e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.J = savedState.f10036f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.K = savedState.f10037g;
        }
    }

    public final void F0(View view, Runnable runnable) {
        if (y0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.q0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.V0(r0)
            return
        Lf:
            boolean r3 = r2.z0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f9999b0
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.T
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.S
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f9998b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.s0()
            boolean r3 = r2.Z0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.S
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f9998b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.a1()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f9998b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.c1(r4, r0, r3)
            r2.T = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void G0(boolean z10) {
        this.L = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.O == 1 && actionMasked == 0) {
            return true;
        }
        if (Y0()) {
            this.Q.F(motionEvent);
        }
        if (actionMasked == 0) {
            D0();
        }
        if (this.f10003d0 == null) {
            this.f10003d0 = VelocityTracker.obtain();
        }
        this.f10003d0.addMovement(motionEvent);
        if (Y0() && actionMasked == 2 && !this.R && Math.abs(this.f10009g0 - motionEvent.getY()) > this.Q.z()) {
            this.Q.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.R;
    }

    public void H0(boolean z10) {
        this.M = z10;
    }

    public void I0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i10;
        f1(this.O, true);
    }

    public void J0(boolean z10) {
        if (this.f9998b == z10) {
            return;
        }
        this.f9998b = z10;
        if (this.Y != null) {
            c0();
        }
        V0((this.f9998b && this.O == 6) ? 3 : this.O);
        f1(this.O, true);
        d1();
    }

    public void K0(boolean z10) {
        this.f10021o = z10;
    }

    public void L0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f10;
        if (this.Y != null) {
            e0();
        }
    }

    public void M0(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10 && this.O == 5) {
                U0(4);
            }
            d1();
        }
    }

    public void N0(int i10) {
        this.f10019m = i10;
    }

    public void O0(int i10) {
        this.f10018l = i10;
    }

    public void P0(int i10) {
        Q0(i10, false);
    }

    public final void Q0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f10008g) {
                return;
            } else {
                this.f10008g = true;
            }
        } else {
            if (!this.f10008g && this.f10006f == i10) {
                return;
            }
            this.f10008g = false;
            this.f10006f = Math.max(0, i10);
        }
        h1(z10);
    }

    public void R0(int i10) {
        this.f9996a = i10;
    }

    public void S0(int i10) {
        this.f10004e = i10;
    }

    public void T0(boolean z10) {
        this.K = z10;
    }

    public void U0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f9998b && r0(i10) <= this.E) ? 3 : i10;
        WeakReference weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            V0(i10);
        } else {
            View view = (View) this.Y.get();
            F0(view, new a(view, i11));
        }
    }

    public void V0(int i10) {
        if (this.O == i10) {
            return;
        }
        this.O = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.J && i10 == 5)) {
            this.P = i10;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            g1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            g1(false);
        }
        f1(i10, true);
        if (this.f10001c0.size() <= 0) {
            d1();
        } else {
            z.a(this.f10001c0.get(0));
            throw null;
        }
    }

    public final void W0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || v0() || this.f10008g) ? false : true;
        if (this.f10022p || this.f10023q || this.f10024r || this.f10026t || this.f10027u || this.f10028v || z10) {
            d0.f(view, new d(z10));
        }
    }

    public boolean X0(long j10, float f10) {
        return false;
    }

    public final boolean Y0() {
        if (this.Q != null) {
            return this.L || this.O == 1;
        }
        return false;
    }

    public boolean Z0(View view, float f10) {
        if (this.K) {
            return true;
        }
        if (x0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.U)) - ((float) this.H)) / ((float) g0()) > 0.5f;
        }
        return false;
    }

    @Override // b5.b
    public void a() {
        b5.f fVar = this.f10005e0;
        if (fVar == null) {
            return;
        }
        fVar.f();
    }

    public boolean a1() {
        return false;
    }

    @Override // b5.b
    public void b(BackEventCompat backEventCompat) {
        b5.f fVar = this.f10005e0;
        if (fVar == null) {
            return;
        }
        fVar.j(backEventCompat);
    }

    public final int b0(View view, int i10, int i11) {
        return ViewCompat.c(view, view.getResources().getString(i10), k0(i11));
    }

    public boolean b1() {
        return true;
    }

    @Override // b5.b
    public void c(BackEventCompat backEventCompat) {
        b5.f fVar = this.f10005e0;
        if (fVar == null) {
            return;
        }
        fVar.l(backEventCompat);
    }

    public final void c0() {
        int iG0 = g0();
        if (this.f9998b) {
            this.H = Math.max(this.X - iG0, this.E);
        } else {
            this.H = this.X - iG0;
        }
    }

    public final void c1(View view, int i10, boolean z10) {
        int iR0 = r0(i10);
        y0.c cVar = this.Q;
        if (cVar == null || (!z10 ? cVar.Q(view, view.getLeft(), iR0) : cVar.O(view.getLeft(), iR0))) {
            V0(i10);
            return;
        }
        V0(2);
        f1(i10, true);
        this.B.c(i10);
    }

    @Override // b5.b
    public void d() {
        b5.f fVar = this.f10005e0;
        if (fVar == null) {
            return;
        }
        BackEventCompat backEventCompatC = fVar.c();
        if (backEventCompatC == null || Build.VERSION.SDK_INT < 34) {
            U0(this.J ? 5 : 4);
        } else if (this.J) {
            this.f10005e0.h(backEventCompatC, new b());
        } else {
            this.f10005e0.i(backEventCompatC, null);
            U0(4);
        }
    }

    public final float d0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    public final void d1() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            e1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.Z;
        if (weakReference2 != null) {
            e1((View) weakReference2.get(), 1);
        }
    }

    public final void e0() {
        this.F = (int) (this.X * (1.0f - this.G));
    }

    public final void e1(View view, int i10) {
        if (view == null) {
            return;
        }
        j0(view, i10);
        if (!this.f9998b && this.O != 6) {
            this.f10015j0.put(i10, b0(view, j.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J && x0() && this.O != 5) {
            C0(view, x.a.f24216y, 5);
        }
        int i11 = this.O;
        if (i11 == 3) {
            C0(view, x.a.f24215x, this.f9998b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            C0(view, x.a.f24214w, this.f9998b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            C0(view, x.a.f24215x, 4);
            C0(view, x.a.f24214w, 3);
        }
    }

    public final float f0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f10014j == null || (weakReference = this.Y) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.Y.get();
        if (!t0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(d0(this.f10014j.P(), rootWindowInsets.getRoundedCorner(0)), d0(this.f10014j.Q(), rootWindowInsets.getRoundedCorner(1)));
    }

    public final void f1(int i10, boolean z10) {
        boolean zU0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.A == (zU0 = u0()) || this.f10014j == null) {
            return;
        }
        this.A = zU0;
        if (!z10 || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.f10014j.j0(this.A ? f0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.f10014j.E(), zU0 ? f0() : 1.0f);
            this.C.start();
        }
    }

    public final int g0() {
        int i10;
        return this.f10008g ? Math.min(Math.max(this.f10010h, this.X - ((this.W * 9) / 16)), this.V) + this.f10029w : (this.f10021o || this.f10022p || (i10 = this.f10020n) <= 0) ? this.f10006f + this.f10029w : Math.max(this.f10006f, i10 + this.f10012i);
    }

    public final void g1(boolean z10) {
        Map map;
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f10013i0 != null) {
                    return;
                } else {
                    this.f10013i0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.Y.get()) {
                    if (z10) {
                        this.f10013i0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f10000c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f10000c && (map = this.f10013i0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f10013i0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f10013i0 = null;
            } else if (this.f10000c) {
                ((View) this.Y.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final float h0(int i10) {
        float f10;
        float fQ0;
        int i11 = this.H;
        if (i10 > i11 || i11 == q0()) {
            int i12 = this.H;
            f10 = i12 - i10;
            fQ0 = this.X - i12;
        } else {
            int i13 = this.H;
            f10 = i13 - i10;
            fQ0 = i13 - q0();
        }
        return f10 / fQ0;
    }

    public final void h1(boolean z10) {
        View view;
        if (this.Y != null) {
            c0();
            if (this.O != 4 || (view = (View) this.Y.get()) == null) {
                return;
            }
            if (z10) {
                U0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public final boolean i0() {
        return w0() && x0();
    }

    public final void j0(View view, int i10) {
        if (view == null) {
            return;
        }
        ViewCompat.d0(view, 524288);
        ViewCompat.d0(view, 262144);
        ViewCompat.d0(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        int i11 = this.f10015j0.get(i10, -1);
        if (i11 != -1) {
            ViewCompat.d0(view, i11);
            this.f10015j0.delete(i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.e eVar) {
        super.k(eVar);
        this.Y = null;
        this.Q = null;
        this.f10005e0 = null;
    }

    public final a0 k0(int i10) {
        return new f(i10);
    }

    public final void l0(Context context) {
        if (this.f10032z == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f10032z);
        this.f10014j = materialShapeDrawable;
        materialShapeDrawable.W(context);
        ColorStateList colorStateList = this.f10016k;
        if (colorStateList != null) {
            this.f10014j.i0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f10014j.setTint(typedValue.data);
    }

    public final void m0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f0(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.Y = null;
        this.Q = null;
        this.f10005e0 = null;
    }

    public void n0(int i10) {
        if (((View) this.Y.get()) == null || this.f10001c0.isEmpty()) {
            return;
        }
        h0(i10);
        if (this.f10001c0.size() <= 0) {
            return;
        }
        z.a(this.f10001c0.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        y0.c cVar;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            D0();
        }
        if (this.f10003d0 == null) {
            this.f10003d0 = VelocityTracker.obtain();
        }
        this.f10003d0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.f10009g0 = y10;
            if (this.O != 2 && B0(coordinatorLayout, x10, y10)) {
                this.f10007f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!A0(coordinatorLayout, x10, this.f10009g0)) {
                    this.f10011h0 = true;
                }
            }
            this.R = this.f10007f0 == -1 && !coordinatorLayout.B(view, x10, this.f10009g0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10011h0 = false;
            this.f10007f0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (!this.R && (cVar = this.Q) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference = this.f9999b0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        return (actionMasked != 2 || view2 == null || this.R || this.O == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.Q == null || (i10 = this.f10009g0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.Q.z())) ? false : true;
    }

    public View o0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewO0 = o0(viewGroup.getChildAt(i10));
                if (viewO0 != null) {
                    return viewO0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.Y == null) {
            this.f10010h = coordinatorLayout.getResources().getDimensionPixelSize(j4.d.design_bottom_sheet_peek_height_min);
            W0(view);
            ViewCompat.A0(view, new o4.a(view));
            this.Y = new WeakReference(view);
            this.f10005e0 = new b5.f(view);
            MaterialShapeDrawable materialShapeDrawable = this.f10014j;
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f10014j;
                float elevation = this.I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                materialShapeDrawable2.h0(elevation);
            } else {
                ColorStateList colorStateList = this.f10016k;
                if (colorStateList != null) {
                    ViewCompat.n0(view, colorStateList);
                }
            }
            d1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = y0.c.o(coordinatorLayout, this.f10017k0);
        }
        int top = view.getTop();
        coordinatorLayout.I(view, i10);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int iMin = this.X;
        int i11 = iMin - height;
        int i12 = this.f10030x;
        if (i11 < i12) {
            if (this.f10025s) {
                int i13 = this.f10019m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.V = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f10019m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.V = iMin2;
            }
        }
        this.E = Math.max(0, this.X - this.V);
        e0();
        c0();
        int i15 = this.O;
        if (i15 == 3) {
            ViewCompat.U(view, q0());
        } else if (i15 == 6) {
            ViewCompat.U(view, this.F);
        } else if (this.J && i15 == 5) {
            ViewCompat.U(view, this.X);
        } else if (i15 == 4) {
            ViewCompat.U(view, this.H);
        } else if (i15 == 1 || i15 == 2) {
            ViewCompat.U(view, top - view.getTop());
        }
        f1(this.O, false);
        this.f9999b0 = new WeakReference(o0(view));
        if (this.f10001c0.size() <= 0) {
            return true;
        }
        z.a(this.f10001c0.get(0));
        throw null;
    }

    public final int p0(int i10, int i11, int i12, int i13) {
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(p0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f10018l, marginLayoutParams.width), p0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f10019m, marginLayoutParams.height));
        return true;
    }

    public int q0() {
        if (this.f9998b) {
            return this.E;
        }
        return Math.max(this.D, this.f10025s ? 0 : this.f10030x);
    }

    public final int r0(int i10) {
        if (i10 == 3) {
            return q0();
        }
        if (i10 == 4) {
            return this.H;
        }
        if (i10 == 5) {
            return this.X;
        }
        if (i10 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        return z0() && (weakReference = this.f9999b0) != null && view2 == weakReference.get() && (!(this.O == 3 || this.N) || super.s(coordinatorLayout, view, view2, f10, f11));
    }

    public final float s0() {
        VelocityTracker velocityTracker = this.f10003d0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f10002d);
        return this.f10003d0.getYVelocity(this.f10007f0);
    }

    public final boolean t0() {
        WeakReference weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f9999b0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!z0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (!this.T && !this.M && view2 == view3 && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i13 < q0()) {
                    int iQ0 = top - q0();
                    iArr[1] = iQ0;
                    ViewCompat.U(view, -iQ0);
                    V0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i11;
                    ViewCompat.U(view, -i11);
                    V0(1);
                }
            } else if (i11 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !this.M && view2 == view3 && zCanScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i13 > this.H && !i0()) {
                        int i14 = top - this.H;
                        iArr[1] = i14;
                        ViewCompat.U(view, -i14);
                        V0(4);
                    } else {
                        if (!this.L) {
                            return;
                        }
                        iArr[1] = i11;
                        ViewCompat.U(view, -i11);
                        V0(1);
                    }
                }
            }
            n0(view.getTop());
            this.S = i11;
            this.T = true;
            this.N = false;
        }
    }

    public final boolean u0() {
        if (this.O == 3) {
            return this.f10031y || t0();
        }
        return false;
    }

    public boolean v0() {
        return this.f10021o;
    }

    public boolean w0() {
        return this.J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public boolean x0() {
        return true;
    }

    public final boolean y0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    public boolean z0() {
        return true;
    }

    public class g {

        /* renamed from: a, reason: collision with root package name */
        public int f10049a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10050b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f10051c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f10050b = false;
                y0.c cVar = BottomSheetBehavior.this.Q;
                if (cVar != null && cVar.m(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f10049a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.O == 2) {
                    bottomSheetBehavior.V0(gVar2.f10049a);
                }
            }
        }

        public g() {
            this.f10051c = new a();
        }

        public void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f10049a = i10;
            if (this.f10050b) {
                return;
            }
            ((View) BottomSheetBehavior.this.Y.get()).postOnAnimation(this.f10051c);
            this.f10050b = true;
        }

        public /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f10033c;

        /* renamed from: d, reason: collision with root package name */
        public int f10034d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f10035e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f10036f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f10037g;

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
            this.f10033c = parcel.readInt();
            this.f10034d = parcel.readInt();
            this.f10035e = parcel.readInt() == 1;
            this.f10036f = parcel.readInt() == 1;
            this.f10037g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f10033c);
            parcel.writeInt(this.f10034d);
            parcel.writeInt(this.f10035e ? 1 : 0);
            parcel.writeInt(this.f10036f ? 1 : 0);
            parcel.writeInt(this.f10037g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f10033c = bottomSheetBehavior.O;
            this.f10034d = bottomSheetBehavior.f10006f;
            this.f10035e = bottomSheetBehavior.f9998b;
            this.f10036f = bottomSheetBehavior.J;
            this.f10037g = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f9996a = 0;
        this.f9998b = true;
        this.f10000c = false;
        this.f10018l = -1;
        this.f10019m = -1;
        this.B = new g(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.P = 4;
        this.U = 0.1f;
        this.f10001c0 = new ArrayList();
        this.f10009g0 = -1;
        this.f10015j0 = new SparseIntArray();
        this.f10017k0 = new e();
        this.f10012i = context.getResources().getDimensionPixelSize(j4.d.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.BottomSheetBehavior_Layout);
        int i11 = l.BottomSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f10016k = d5.c.a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f10032z = com.google.android.material.shape.a.e(context, attributeSet, j4.b.bottomSheetStyle, f9995l0).m();
        }
        l0(context);
        m0();
        this.I = typedArrayObtainStyledAttributes.getDimension(l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i12 = l.BottomSheetBehavior_Layout_android_maxWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            O0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = l.BottomSheetBehavior_Layout_android_maxHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            N0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = l.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            P0(i10);
        } else {
            P0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        M0(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_hideable, false));
        K0(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        J0(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        T0(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        G0(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_draggable, true));
        H0(typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true));
        R0(typedArrayObtainStyledAttributes.getInt(l.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        L0(typedArrayObtainStyledAttributes.getFloat(l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i15 = l.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            I0(typedValuePeekValue2.data);
        } else {
            I0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        S0(typedArrayObtainStyledAttributes.getInt(l.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.f10022p = typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f10023q = typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f10024r = typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f10025s = typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f10026t = typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f10027u = typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f10028v = typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f10031y = typedArrayObtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f10002d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
