package com.google.android.material.bottomsheet;

import B4.f;
import L0.C0770a;
import L0.I;
import L0.S;
import L0.V;
import M0.g;
import V0.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
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
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import d4.l;
import d4.m;
import d4.n;
import f4.C4334b;
import g0.C4356c;
import h4.C4415c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l4.C5287f;
import l4.C5290i;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: A, reason: collision with root package name */
    public final BottomSheetBehavior<V>.e f22534A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f22535B;

    /* renamed from: C, reason: collision with root package name */
    public final int f22536C;

    /* renamed from: D, reason: collision with root package name */
    public int f22537D;

    /* renamed from: E, reason: collision with root package name */
    public int f22538E;

    /* renamed from: F, reason: collision with root package name */
    public final float f22539F;

    /* renamed from: G, reason: collision with root package name */
    public int f22540G;

    /* renamed from: H, reason: collision with root package name */
    public final float f22541H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f22542I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f22543J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f22544K;

    /* renamed from: L, reason: collision with root package name */
    public int f22545L;

    /* renamed from: M, reason: collision with root package name */
    public V0.c f22546M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f22547N;

    /* renamed from: O, reason: collision with root package name */
    public int f22548O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f22549P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f22550Q;

    /* renamed from: R, reason: collision with root package name */
    public int f22551R;

    /* renamed from: S, reason: collision with root package name */
    public int f22552S;

    /* renamed from: T, reason: collision with root package name */
    public int f22553T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference<V> f22554U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference<View> f22555V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList<c> f22556W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f22557X;

    /* renamed from: Y, reason: collision with root package name */
    public int f22558Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f22559Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f22560a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f22561a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22562b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f22563b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f22564c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f22565c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f22566d;

    /* renamed from: d0, reason: collision with root package name */
    public final b f22567d0;

    /* renamed from: e, reason: collision with root package name */
    public int f22568e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22569f;

    /* renamed from: g, reason: collision with root package name */
    public int f22570g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22571h;
    public final C5287f i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f22572j;

    /* renamed from: k, reason: collision with root package name */
    public final int f22573k;

    /* renamed from: l, reason: collision with root package name */
    public final int f22574l;

    /* renamed from: m, reason: collision with root package name */
    public int f22575m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f22576n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f22577o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f22578p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f22579q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f22580r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f22581s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f22582t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f22583u;

    /* renamed from: v, reason: collision with root package name */
    public int f22584v;

    /* renamed from: w, reason: collision with root package name */
    public int f22585w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f22586x;

    /* renamed from: y, reason: collision with root package name */
    public final C5290i f22587y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22588z;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f22589b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f22590c;

        public a(View view, int i) {
            this.f22589b = view;
            this.f22590c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.G(this.f22589b, this.f22590c, false);
        }
    }

    public class b extends c.AbstractC0180c {
        public b() {
        }

        @Override // V0.c.AbstractC0180c
        public final int a(int i, View view) {
            return view.getLeft();
        }

        @Override // V0.c.AbstractC0180c
        public final int b(int i, View view) {
            return B7.d.h(i, BottomSheetBehavior.this.z(), d());
        }

        @Override // V0.c.AbstractC0180c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f22542I ? bottomSheetBehavior.f22553T : bottomSheetBehavior.f22540G;
        }

        @Override // V0.c.AbstractC0180c
        public final void g(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f22544K) {
                    bottomSheetBehavior.E(1);
                }
            }
        }

        @Override // V0.c.AbstractC0180c
        public final void h(View view, int i, int i10) {
            BottomSheetBehavior.this.v(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        @Override // V0.c.AbstractC0180c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void i(android.view.View r6, float r7, float r8) {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.i(android.view.View, float, float):void");
        }

        @Override // V0.c.AbstractC0180c
        public final boolean j(int i, View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i10 = bottomSheetBehavior.f22545L;
            if (i10 == 1 || bottomSheetBehavior.f22561a0) {
                return false;
            }
            if (i10 == 3 && bottomSheetBehavior.f22558Y == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f22555V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.f22554U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class c {
        public abstract void a(int i);
    }

    public class e {

        /* renamed from: a, reason: collision with root package name */
        public int f22598a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f22599b;

        /* renamed from: c, reason: collision with root package name */
        public final a f22600c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f22599b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                V0.c cVar = bottomSheetBehavior.f22546M;
                if (cVar != null && cVar.g()) {
                    eVar.a(eVar.f22598a);
                } else if (bottomSheetBehavior.f22545L == 2) {
                    bottomSheetBehavior.E(eVar.f22598a);
                }
            }
        }

        public e() {
        }

        public final void a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f22554U;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f22598a = i;
            if (this.f22599b) {
                return;
            }
            V v10 = bottomSheetBehavior.f22554U.get();
            a aVar = this.f22600c;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            v10.postOnAnimation(aVar);
            this.f22599b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f22560a = 0;
        this.f22562b = true;
        this.f22573k = -1;
        this.f22574l = -1;
        this.f22534A = new e();
        this.f22539F = 0.5f;
        this.f22541H = -1.0f;
        this.f22544K = true;
        this.f22545L = 4;
        this.f22550Q = 0.1f;
        this.f22556W = new ArrayList<>();
        this.f22559Z = -1;
        this.f22565c0 = new SparseIntArray();
        this.f22567d0 = new b();
    }

    public static View w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (I.d.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewW = w(viewGroup.getChildAt(i));
            if (viewW != null) {
                return viewW;
            }
        }
        return null;
    }

    public static <V extends View> BottomSheetBehavior<V> x(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f15468a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int y(int i, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = Math.min(size, i11);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, RecyclerView.UNDEFINED_DURATION);
    }

    public final int A(int i) {
        if (i == 3) {
            return z();
        }
        if (i == 4) {
            return this.f22540G;
        }
        if (i == 5) {
            return this.f22553T;
        }
        if (i == 6) {
            return this.f22538E;
        }
        throw new IllegalArgumentException(C4356c.h(i, "Invalid state to get top offset: "));
    }

    public final boolean B() {
        WeakReference<V> weakReference = this.f22554U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.f22554U.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void C(int i) {
        if (i == -1) {
            if (this.f22569f) {
                return;
            } else {
                this.f22569f = true;
            }
        } else {
            if (!this.f22569f && this.f22568e == i) {
                return;
            }
            this.f22569f = false;
            this.f22568e = Math.max(0, i);
        }
        K();
    }

    public final void D(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(f.c(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f22542I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i10 = (i == 6 && this.f22562b && A(i) <= this.f22537D) ? 3 : i;
        WeakReference<V> weakReference = this.f22554U;
        if (weakReference == null || weakReference.get() == null) {
            E(i);
            return;
        }
        V v10 = this.f22554U.get();
        a aVar = new a(v10, i10);
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (v10.isAttachedToWindow()) {
                v10.post(aVar);
                return;
            }
        }
        aVar.run();
    }

    public final void E(int i) {
        if (this.f22545L == i) {
            return;
        }
        this.f22545L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z10 = this.f22542I;
        }
        WeakReference<V> weakReference = this.f22554U;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i10 = 0;
        if (i == 3) {
            J(true);
        } else if (i == 6 || i == 5 || i == 4) {
            J(false);
        }
        I(i, true);
        while (true) {
            ArrayList<c> arrayList = this.f22556W;
            if (i10 >= arrayList.size()) {
                H();
                return;
            } else {
                arrayList.get(i10).a(i);
                i10++;
            }
        }
    }

    public final boolean F(View view, float f10) {
        if (this.f22543J) {
            return true;
        }
        if (view.getTop() < this.f22540G) {
            return false;
        }
        return Math.abs(((f10 * this.f22550Q) + ((float) view.getTop())) - ((float) this.f22540G)) / ((float) u()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        E(2);
        I(r4, true);
        r2.f22534A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.q(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.A(r4)
            V0.c r1 = r2.f22546M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.q(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f12865s = r3
            r3 = -1
            r1.f12850c = r3
            r3 = 0
            boolean r3 = r1.i(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f12848a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f12865s
            if (r5 == 0) goto L30
            r5 = 0
            r1.f12865s = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.E(r3)
            r3 = 1
            r2.I(r4, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r3 = r2.f22534A
            r3.a(r4)
            return
        L40:
            r2.E(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(android.view.View, int, boolean):void");
    }

    public final void H() {
        V v10;
        int iA;
        WeakReference<V> weakReference = this.f22554U;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        I.l(524288, v10);
        I.i(0, v10);
        I.l(262144, v10);
        I.i(0, v10);
        I.l(1048576, v10);
        I.i(0, v10);
        SparseIntArray sparseIntArray = this.f22565c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            I.l(i, v10);
            I.i(0, v10);
            sparseIntArray.delete(0);
        }
        if (!this.f22562b && this.f22545L != 6) {
            String string = v10.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            P3.c cVar = new P3.c(this, 6);
            ArrayList arrayListG = I.g(v10);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayListG.size()) {
                    int i11 = -1;
                    for (int i12 = 0; i12 < 32 && i11 == -1; i12++) {
                        int i13 = I.f3795d[i12];
                        boolean z10 = true;
                        for (int i14 = 0; i14 < arrayListG.size(); i14++) {
                            z10 &= ((g.a) arrayListG.get(i14)).a() != i13;
                        }
                        if (z10) {
                            i11 = i13;
                        }
                    }
                    iA = i11;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((g.a) arrayListG.get(i10)).f4132a).getLabel())) {
                        iA = ((g.a) arrayListG.get(i10)).a();
                        break;
                    }
                    i10++;
                }
            }
            if (iA != -1) {
                g.a aVar = new g.a(null, iA, string, cVar, null);
                C0770a c0770aD = I.d(v10);
                if (c0770aD == null) {
                    c0770aD = new C0770a();
                }
                I.o(v10, c0770aD);
                I.l(aVar.a(), v10);
                I.g(v10).add(aVar);
                I.i(0, v10);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.f22542I && this.f22545L != 5) {
            I.m(v10, g.a.f4129k, new P3.c(this, 5));
        }
        int i15 = this.f22545L;
        if (i15 == 3) {
            I.m(v10, g.a.f4128j, new P3.c(this, this.f22562b ? 4 : 6));
            return;
        }
        if (i15 == 4) {
            I.m(v10, g.a.i, new P3.c(this, this.f22562b ? 3 : 6));
        } else {
            if (i15 != 6) {
                return;
            }
            I.m(v10, g.a.f4128j, new P3.c(this, 4));
            I.m(v10, g.a.i, new P3.c(this, 3));
        }
    }

    public final void I(int i, boolean z10) {
        C5287f c5287f = this.i;
        ValueAnimator valueAnimator = this.f22535B;
        if (i == 2) {
            return;
        }
        boolean z11 = this.f22545L == 3 && (this.f22586x || B());
        if (this.f22588z == z11 || c5287f == null) {
            return;
        }
        this.f22588z = z11;
        if (z10 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c5287f.f43759b.i, z11 ? t() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fT = this.f22588z ? t() : 1.0f;
        C5287f.b bVar = c5287f.f43759b;
        if (bVar.i != fT) {
            bVar.i = fT;
            c5287f.f43763f = true;
            c5287f.invalidateSelf();
        }
    }

    public final void J(boolean z10) {
        WeakReference<V> weakReference = this.f22554U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f22563b0 != null) {
                    return;
                } else {
                    this.f22563b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f22554U.get() && z10) {
                    this.f22563b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z10) {
                return;
            }
            this.f22563b0 = null;
        }
    }

    public final void K() {
        V v10;
        if (this.f22554U != null) {
            s();
            if (this.f22545L != 4 || (v10 = this.f22554U.get()) == null) {
                return;
            }
            v10.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.f22554U = null;
        this.f22546M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.f22554U = null;
        this.f22546M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int i;
        V0.c cVar;
        if (!v10.isShown() || !this.f22544K) {
            this.f22547N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f22558Y = -1;
            this.f22559Z = -1;
            VelocityTracker velocityTracker = this.f22557X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f22557X = null;
            }
        }
        if (this.f22557X == null) {
            this.f22557X = VelocityTracker.obtain();
        }
        this.f22557X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f22559Z = (int) motionEvent.getY();
            if (this.f22545L != 2) {
                WeakReference<View> weakReference = this.f22555V;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.p(view, x10, this.f22559Z)) {
                    this.f22558Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f22561a0 = true;
                }
            }
            this.f22547N = this.f22558Y == -1 && !coordinatorLayout.p(v10, x10, this.f22559Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f22561a0 = false;
            this.f22558Y = -1;
            if (this.f22547N) {
                this.f22547N = false;
                return false;
            }
        }
        if (this.f22547N || (cVar = this.f22546M) == null || !cVar.r(motionEvent)) {
            WeakReference<View> weakReference2 = this.f22555V;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view2 == null || this.f22547N || this.f22545L == 1 || coordinatorLayout.p(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f22546M == null || (i = this.f22559Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.f22546M.f12849b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) throws Resources.NotFoundException {
        int i10 = this.f22574l;
        C5287f c5287f = this.i;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.f22554U == null) {
            this.f22570g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i12 = Build.VERSION.SDK_INT;
            boolean z10 = (i12 < 29 || this.f22576n || this.f22569f) ? false : true;
            if (this.f22577o || this.f22578p || this.f22579q || this.f22581s || this.f22582t || this.f22583u || z10) {
                P3.b bVar = new P3.b(this, z10);
                int paddingStart = v10.getPaddingStart();
                v10.getPaddingTop();
                int paddingEnd = v10.getPaddingEnd();
                int paddingBottom = v10.getPaddingBottom();
                n.a aVar = new n.a();
                aVar.f37522a = paddingStart;
                aVar.f37523b = paddingEnd;
                aVar.f37524c = paddingBottom;
                I.d.u(v10, new l(bVar, aVar));
                if (v10.isAttachedToWindow()) {
                    I.c.c(v10);
                } else {
                    v10.addOnAttachStateChangeListener(new m());
                }
            }
            P3.d dVar = new P3.d(v10);
            if (i12 >= 30) {
                v10.setWindowInsetsAnimationCallback(new V.d.a(dVar));
            } else {
                PathInterpolator pathInterpolator = V.c.f3824e;
                Object tag = v10.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener aVar2 = new V.c.a(v10, dVar);
                v10.setTag(R.id.tag_window_insets_animation_callback, aVar2);
                if (tag == null) {
                    v10.setOnApplyWindowInsetsListener(aVar2);
                }
            }
            this.f22554U = new WeakReference<>(v10);
            Context context = v10.getContext();
            C4334b.d(context, R.attr.motionEasingStandardDecelerateInterpolator, N0.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            C4334b.c(context, R.attr.motionDurationMedium2, 300);
            C4334b.c(context, R.attr.motionDurationShort3, 150);
            C4334b.c(context, R.attr.motionDurationShort2, 100);
            Resources resources = v10.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (c5287f != null) {
                v10.setBackground(c5287f);
                float fI = this.f22541H;
                if (fI == -1.0f) {
                    fI = I.d.i(v10);
                }
                c5287f.j(fI);
            } else {
                ColorStateList colorStateList = this.f22572j;
                if (colorStateList != null) {
                    I.d.q(v10, colorStateList);
                }
            }
            H();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
        }
        if (this.f22546M == null) {
            this.f22546M = new V0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f22567d0);
        }
        int top = v10.getTop();
        coordinatorLayout.r(i, v10);
        this.f22552S = coordinatorLayout.getWidth();
        this.f22553T = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f22551R = height;
        int iMin = this.f22553T;
        int i13 = iMin - height;
        int i14 = this.f22585w;
        if (i13 < i14) {
            if (this.f22580r) {
                if (i10 != -1) {
                    iMin = Math.min(iMin, i10);
                }
                this.f22551R = iMin;
            } else {
                int iMin2 = iMin - i14;
                if (i10 != -1) {
                    iMin2 = Math.min(iMin2, i10);
                }
                this.f22551R = iMin2;
            }
        }
        this.f22537D = Math.max(0, this.f22553T - this.f22551R);
        this.f22538E = (int) ((1.0f - this.f22539F) * this.f22553T);
        s();
        int i15 = this.f22545L;
        if (i15 == 3) {
            v10.offsetTopAndBottom(z());
        } else if (i15 == 6) {
            v10.offsetTopAndBottom(this.f22538E);
        } else if (this.f22542I && i15 == 5) {
            v10.offsetTopAndBottom(this.f22553T);
        } else if (i15 == 4) {
            v10.offsetTopAndBottom(this.f22540G);
        } else if (i15 == 1 || i15 == 2) {
            v10.offsetTopAndBottom(top - v10.getTop());
        }
        I(this.f22545L, false);
        this.f22555V = new WeakReference<>(w(v10));
        while (true) {
            ArrayList<c> arrayList = this.f22556W;
            if (i11 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i11).getClass();
            i11++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(y(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f22573k, marginLayoutParams.width), y(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f22574l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(View view) {
        WeakReference<View> weakReference = this.f22555V;
        return (weakReference == null || view != weakReference.get() || this.f22545L == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i, int i10, int[] iArr, int i11) {
        boolean z10 = this.f22544K;
        if (i11 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f22555V;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v10.getTop();
        int i12 = top - i10;
        if (i10 > 0) {
            if (i12 < z()) {
                int iZ = top - z();
                iArr[1] = iZ;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                v10.offsetTopAndBottom(-iZ);
                E(3);
            } else {
                if (!z10) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                v10.offsetTopAndBottom(-i10);
                E(1);
            }
        } else if (i10 < 0 && !view.canScrollVertically(-1)) {
            int i13 = this.f22540G;
            if (i12 > i13 && !this.f22542I) {
                int i14 = top - i13;
                iArr[1] = i14;
                WeakHashMap<View, S> weakHashMap3 = I.f3792a;
                v10.offsetTopAndBottom(-i14);
                E(4);
            } else {
                if (!z10) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap<View, S> weakHashMap4 = I.f3792a;
                v10.offsetTopAndBottom(-i10);
                E(1);
            }
        }
        v(v10.getTop());
        this.f22548O = i10;
        this.f22549P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i = this.f22560a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f22568e = dVar.f22594e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f22562b = dVar.f22595f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f22542I = dVar.f22596g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f22543J = dVar.f22597h;
            }
        }
        int i10 = dVar.f22593d;
        if (i10 == 1 || i10 == 2) {
            this.f22545L = 4;
        } else {
            this.f22545L = i10;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i, int i10) {
        this.f22548O = 0;
        this.f22549P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.z()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.E(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f22555V
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.f22549P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.f22548O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f22562b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.f22538E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.f22542I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.f22557X
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f22564c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f22557X
            int r6 = r2.f22558Y
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.F(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.f22548O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f22562b
            if (r1 == 0) goto L74
            int r5 = r2.f22537D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f22540G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.f22538E
            if (r3 >= r1) goto L83
            int r6 = r2.f22540G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f22540G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f22562b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.f22538E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f22540G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.G(r4, r0, r3)
            r2.f22549P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f22545L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        V0.c cVar = this.f22546M;
        if (cVar != null && (this.f22544K || i == 1)) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.f22558Y = -1;
            this.f22559Z = -1;
            VelocityTracker velocityTracker = this.f22557X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f22557X = null;
            }
        }
        if (this.f22557X == null) {
            this.f22557X = VelocityTracker.obtain();
        }
        this.f22557X.addMovement(motionEvent);
        if (this.f22546M != null && ((this.f22544K || this.f22545L == 1) && actionMasked == 2 && !this.f22547N)) {
            float fAbs = Math.abs(this.f22559Z - motionEvent.getY());
            V0.c cVar2 = this.f22546M;
            if (fAbs > cVar2.f12849b) {
                cVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v10);
            }
        }
        return !this.f22547N;
    }

    public final void s() {
        int iU = u();
        if (this.f22562b) {
            this.f22540G = Math.max(this.f22553T - iU, this.f22537D);
        } else {
            this.f22540G = this.f22553T - iU;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float t() {
        /*
            r5 = this;
            l4.f r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.f22554U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.f22554U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.B()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            l4.f r2 = r5.i
            l4.f$b r3 = r2.f43759b
            l4.i r3 = r3.f43782a
            l4.c r3 = r3.f43804e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = L0.C0772c.i(r0)
            if (r3 == 0) goto L4e
            int r3 = I0.j.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            l4.f r2 = r5.i
            l4.f$b r4 = r2.f43759b
            l4.i r4 = r4.f43782a
            l4.c r4 = r4.f43805f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = I0.f.l(r0)
            if (r0 == 0) goto L74
            int r0 = I0.j.b(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():float");
    }

    public final int u() {
        int i;
        return this.f22569f ? Math.min(Math.max(this.f22570g, this.f22553T - ((this.f22552S * 9) / 16)), this.f22551R) + this.f22584v : (this.f22576n || this.f22577o || (i = this.f22575m) <= 0) ? this.f22568e + this.f22584v : Math.max(this.f22568e, i + this.f22571h);
    }

    public final void v(int i) {
        if (this.f22554U.get() != null) {
            ArrayList<c> arrayList = this.f22556W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i10 = this.f22540G;
            if (i <= i10 && i10 != z()) {
                z();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList.get(i11).getClass();
            }
        }
    }

    public final int z() {
        if (this.f22562b) {
            return this.f22537D;
        }
        return Math.max(this.f22536C, this.f22580r ? 0 : this.f22585w);
    }

    public static class d extends U0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final int f22593d;

        /* renamed from: e, reason: collision with root package name */
        public final int f22594e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f22595f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f22596g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f22597h;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new d[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22593d = parcel.readInt();
            this.f22594e = parcel.readInt();
            this.f22595f = parcel.readInt() == 1;
            this.f22596g = parcel.readInt() == 1;
            this.f22597h = parcel.readInt() == 1;
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f22593d);
            parcel.writeInt(this.f22594e);
            parcel.writeInt(this.f22595f ? 1 : 0);
            parcel.writeInt(this.f22596g ? 1 : 0);
            parcel.writeInt(this.f22597h ? 1 : 0);
        }

        public d(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f22593d = bottomSheetBehavior.f22545L;
            this.f22594e = bottomSheetBehavior.f22568e;
            this.f22595f = bottomSheetBehavior.f22562b;
            this.f22596g = bottomSheetBehavior.f22542I;
            this.f22597h = bottomSheetBehavior.f22543J;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f22560a = 0;
        this.f22562b = true;
        this.f22573k = -1;
        this.f22574l = -1;
        this.f22534A = new e();
        this.f22539F = 0.5f;
        this.f22541H = -1.0f;
        this.f22544K = true;
        this.f22545L = 4;
        this.f22550Q = 0.1f;
        this.f22556W = new ArrayList<>();
        this.f22559Z = -1;
        this.f22565c0 = new SparseIntArray();
        this.f22567d0 = new b();
        this.f22571h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3115b);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f22572j = C4415c.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f22587y = C5290i.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        C5290i c5290i = this.f22587y;
        if (c5290i != null) {
            C5287f c5287f = new C5287f(c5290i);
            this.i = c5287f;
            c5287f.i(context);
            ColorStateList colorStateList = this.f22572j;
            if (colorStateList != null) {
                this.i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(t(), 1.0f);
        this.f22535B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f22535B.addUpdateListener(new P3.a(this));
        this.f22541H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f22573k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f22574l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            C(i);
        } else {
            C(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f22542I != z10) {
            this.f22542I = z10;
            if (!z10 && this.f22545L == 5) {
                D(4);
            }
            H();
        }
        this.f22576n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f22562b != z11) {
            this.f22562b = z11;
            if (this.f22554U != null) {
                s();
            }
            E((this.f22562b && this.f22545L == 6) ? 3 : this.f22545L);
            I(this.f22545L, true);
            H();
        }
        this.f22543J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f22544K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f22560a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f22539F = f10;
            if (this.f22554U != null) {
                this.f22538E = (int) ((1.0f - f10) * this.f22553T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i10 = typedValuePeekValue2.data;
                if (i10 >= 0) {
                    this.f22536C = i10;
                    I(this.f22545L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f22536C = dimensionPixelOffset;
                    I(this.f22545L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f22566d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f22577o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f22578p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f22579q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f22580r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f22581s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f22582t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f22583u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f22586x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f22564c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
    }
}
