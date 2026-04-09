package com.google.android.material.bottomsheet;

import ad.g;
import ad.h;
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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.internal.ads.h0;
import com.liuzh.deviceinfo.R;
import e4.m0;
import e4.v0;
import ed.j;
import ed.o;
import fd.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import je.u;
import n4.c;
import oc.a;
import p3.b;
import p3.e;
import t7.m;
import ya.d0;
import zc.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends b implements ad.b {
    public final k A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public c O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f20350a;

    /* renamed from: a0, reason: collision with root package name */
    public h f20351a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20352b;

    /* renamed from: b0, reason: collision with root package name */
    public int f20353b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f20354c;

    /* renamed from: c0, reason: collision with root package name */
    public int f20355c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f20356d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f20357d0;

    /* renamed from: e, reason: collision with root package name */
    public int f20358e;

    /* renamed from: e0, reason: collision with root package name */
    public HashMap f20359e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20360f;

    /* renamed from: f0, reason: collision with root package name */
    public final SparseIntArray f20361f0;
    public int g;

    /* renamed from: g0, reason: collision with root package name */
    public final d f20362g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f20363h;

    /* renamed from: i, reason: collision with root package name */
    public final j f20364i;
    public final ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20365k;

    /* renamed from: l, reason: collision with root package name */
    public int f20366l;

    /* renamed from: m, reason: collision with root package name */
    public int f20367m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f20368n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20369o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f20370p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f20371q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f20372r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20373s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f20374t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f20375u;

    /* renamed from: v, reason: collision with root package name */
    public int f20376v;

    /* renamed from: w, reason: collision with root package name */
    public int f20377w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f20378x;

    /* renamed from: y, reason: collision with root package name */
    public final o f20379y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20380z;

    public BottomSheetBehavior() {
        this.f20350a = 0;
        this.f20352b = true;
        this.f20365k = -1;
        this.f20366l = -1;
        this.A = new k(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f20355c0 = -1;
        this.f20361f0 = new SparseIntArray();
        this.f20362g0 = new d(this, 1);
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
        for (int i4 = 0; i4 < childCount; i4++) {
            View viewA = A(viewGroup.getChildAt(i4));
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    public static BottomSheetBehavior B(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        b bVar = ((e) layoutParams).f31147a;
        if (bVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) bVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int C(int i4, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, i10, i12);
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
        return View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET);
    }

    public final int D() {
        if (this.f20352b) {
            return this.D;
        }
        return Math.max(this.C, this.f20372r ? 0 : this.f20377w);
    }

    public final int E(int i4) {
        if (i4 == 3) {
            return D();
        }
        if (i4 == 4) {
            return this.G;
        }
        if (i4 == 5) {
            return this.V;
        }
        if (i4 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(u.r(i4, "Invalid state to get top offset: "));
    }

    public final boolean F() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void G(boolean z3) throws Resources.NotFoundException {
        if (this.f20352b == z3) {
            return;
        }
        this.f20352b = z3;
        if (this.W != null) {
            w();
        }
        K((this.f20352b && this.N == 6) ? 3 : this.N);
        O(this.N, true);
        N();
    }

    public final void H(boolean z3) throws Resources.NotFoundException {
        if (this.I != z3) {
            this.I = z3;
            if (!z3 && this.N == 5) {
                J(4);
            }
            N();
        }
    }

    public final void I(int i4) {
        if (i4 == -1) {
            if (this.f20360f) {
                return;
            } else {
                this.f20360f = true;
            }
        } else {
            if (!this.f20360f && this.f20358e == i4) {
                return;
            }
            this.f20360f = false;
            this.f20358e = Math.max(0, i4);
        }
        Q();
    }

    public final void J(int i4) {
        if (i4 == 1 || i4 == 2) {
            throw new IllegalArgumentException(d.h.w(new StringBuilder("STATE_"), i4 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i4 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i4);
            return;
        }
        int i10 = (i4 == 6 && this.f20352b && E(i4) <= this.D) ? 3 : i4;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            K(i4);
            return;
        }
        View view = (View) this.W.get();
        a aVar = new a(this, view, i10);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(aVar);
        } else {
            aVar.run();
        }
    }

    public final void K(int i4) {
        View view;
        if (this.N == i4) {
            return;
        }
        this.N = i4;
        if (i4 != 4 && i4 != 3 && i4 != 6) {
            boolean z3 = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = 0;
        if (i4 == 3) {
            P(true);
        } else if (i4 == 6 || i4 == 5 || i4 == 4) {
            P(false);
        }
        O(i4, true);
        while (true) {
            ArrayList arrayList = this.Y;
            if (i10 >= arrayList.size()) {
                N();
                return;
            } else {
                ((oc.b) arrayList.get(i10)).c(i4, view);
                i10++;
            }
        }
    }

    public final boolean L(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f10 * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) y()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        K(2);
        O(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.E(r4)
            n4.c r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f29761r = r3
            r3 = -1
            r1.f29748c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f29746a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f29761r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f29761r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.K(r3)
            r3 = 1
            r2.O(r4, r3)
            com.google.android.gms.common.api.internal.k r3 = r2.A
            r3.a(r4)
            return
        L40:
            r2.K(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.M(android.view.View, int, boolean):void");
    }

    public final void N() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.l(524288, view);
        v0.i(0, view);
        v0.l(262144, view);
        v0.i(0, view);
        v0.l(1048576, view);
        v0.i(0, view);
        SparseIntArray sparseIntArray = this.f20361f0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            v0.l(i4, view);
            v0.i(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.f20352b && this.N != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            m mVar = new m(this, i, 16);
            ArrayList arrayListG = v0.g(view);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayListG.size()) {
                    int i11 = 0;
                    int i12 = -1;
                    while (true) {
                        int[] iArr = v0.f22408d;
                        if (i11 >= 32 || i12 != -1) {
                            break;
                        }
                        int i13 = iArr[i11];
                        boolean z3 = true;
                        for (int i14 = 0; i14 < arrayListG.size(); i14++) {
                            z3 &= ((f4.c) arrayListG.get(i14)).a() != i13;
                        }
                        if (z3) {
                            i12 = i13;
                        }
                        i11++;
                    }
                    iA = i12;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f4.c) arrayListG.get(i10)).f23645a).getLabel())) {
                        iA = ((f4.c) arrayListG.get(i10)).a();
                        break;
                    }
                    i10++;
                }
            }
            if (iA != -1) {
                f4.c cVar = new f4.c(null, iA, string, mVar, null);
                View.AccessibilityDelegate accessibilityDelegateE = v0.e(view);
                e4.b bVar = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof e4.a ? ((e4.a) accessibilityDelegateE).f22299a : new e4.b(accessibilityDelegateE);
                if (bVar == null) {
                    bVar = new e4.b();
                }
                v0.o(view, bVar);
                v0.l(cVar.a(), view);
                v0.g(view).add(cVar);
                v0.i(0, view);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i15 = 5;
            if (this.N != 5) {
                v0.m(view, f4.c.f23637l, new m(this, i15, 16));
            }
        }
        int i16 = this.N;
        int i17 = 4;
        int i18 = 3;
        if (i16 == 3) {
            v0.m(view, f4.c.f23636k, new m(this, this.f20352b ? 4 : 6, 16));
            return;
        }
        if (i16 == 4) {
            v0.m(view, f4.c.j, new m(this, this.f20352b ? 3 : 6, 16));
        } else {
            if (i16 != 6) {
                return;
            }
            v0.m(view, f4.c.f23636k, new m(this, i17, 16));
            v0.m(view, f4.c.j, new m(this, i18, 16));
        }
    }

    public final void O(int i4, boolean z3) {
        j jVar;
        if (i4 == 2) {
            return;
        }
        boolean z10 = this.N == 3 && (this.f20378x || F());
        if (this.f20380z == z10 || (jVar = this.f20364i) == null) {
            return;
        }
        this.f20380z = z10;
        ValueAnimator valueAnimator = this.B;
        if (z3 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(jVar.f23316b.j, z10 ? x() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fX = this.f20380z ? x() : 1.0f;
        ed.h hVar = jVar.f23316b;
        if (hVar.j != fX) {
            hVar.j = fX;
            jVar.f23320f = true;
            jVar.g = true;
            jVar.invalidateSelf();
        }
    }

    public final void P(boolean z3) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.f20359e0 != null) {
                    return;
                } else {
                    this.f20359e0 = new HashMap(childCount);
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (childAt != this.W.get() && z3) {
                    this.f20359e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z3) {
                return;
            }
            this.f20359e0 = null;
        }
    }

    public final void Q() {
        View view;
        if (this.W != null) {
            w();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // ad.b
    public final void a(d.a aVar) {
        h hVar = this.f20351a0;
        if (hVar == null) {
            return;
        }
        if (hVar.f326f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        d.a aVar2 = hVar.f326f;
        hVar.f326f = aVar;
        if (aVar2 == null) {
            return;
        }
        hVar.b(aVar.f21572c);
    }

    @Override // ad.b
    public final void b() {
        h hVar = this.f20351a0;
        if (hVar == null) {
            return;
        }
        int i4 = hVar.f324d;
        int i10 = hVar.f323c;
        d.a aVar = hVar.f326f;
        hVar.f326f = null;
        if (aVar != null) {
            float f10 = aVar.f21572c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.I) {
                    AnimatorSet animatorSetA = hVar.a();
                    animatorSetA.setDuration(jc.a.c(f10, i10, i4));
                    animatorSetA.start();
                    J(4);
                    return;
                }
                g gVar = new g(10, this);
                View view = hVar.f322b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new d5.a(1));
                objectAnimatorOfFloat.setDuration(jc.a.c(f10, i10, i4));
                objectAnimatorOfFloat.addListener(new g(0, hVar));
                objectAnimatorOfFloat.addListener(gVar);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        J(this.I ? 5 : 4);
    }

    @Override // ad.b
    public final void c(d.a aVar) {
        h hVar = this.f20351a0;
        if (hVar == null) {
            return;
        }
        hVar.f326f = aVar;
    }

    @Override // ad.b
    public final void d() {
        h hVar = this.f20351a0;
        if (hVar == null) {
            return;
        }
        if (hVar.f326f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        d.a aVar = hVar.f326f;
        hVar.f326f = null;
        if (aVar == null) {
            return;
        }
        AnimatorSet animatorSetA = hVar.a();
        animatorSetA.setDuration(hVar.f325e);
        animatorSetA.start();
    }

    @Override // p3.b
    public final void g(e eVar) {
        this.W = null;
        this.O = null;
        this.f20351a0 = null;
    }

    @Override // p3.b
    public final void j() {
        this.W = null;
        this.O = null;
        this.f20351a0 = null;
    }

    @Override // p3.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i4;
        c cVar;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f20353b0 = -1;
            this.f20355c0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.f20355c0 = y10;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x10, y10)) {
                    this.f20353b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f20357d0 = true;
                }
            }
            this.P = this.f20353b0 == -1 && !coordinatorLayout.p(view, x10, this.f20355c0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f20357d0 = false;
            this.f20353b0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (cVar = this.O) == null || !cVar.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i4 = this.f20355c0) == -1 || Math.abs(i4 - motionEvent.getY()) <= this.O.f29747b) {
                return false;
            }
        }
        return true;
    }

    @Override // p3.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) throws Resources.NotFoundException {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i10 = 0;
        if (this.W == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z3 = (Build.VERSION.SDK_INT < 29 || this.f20368n || this.f20360f) ? false : true;
            if (this.f20369o || this.f20370p || this.f20371q || this.f20373s || this.f20374t || this.f20375u || z3) {
                a4.d dVar = new a4.d(this, z3);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                h0 h0Var = new h0();
                h0Var.f11671a = paddingStart;
                h0Var.f11672b = paddingEnd;
                h0Var.f11673c = paddingBottom;
                d0 d0Var = new d0(dVar, h0Var);
                WeakHashMap weakHashMap = v0.f22405a;
                m0.j(view, d0Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new n());
                }
            }
            v0.r(view, new oc.h(view));
            this.W = new WeakReference(view);
            this.f20351a0 = new h(view);
            j jVar = this.f20364i;
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.n(elevation);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    m0.g(view, colorStateList);
                }
            }
            N();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f20362g0);
        }
        int top = view.getTop();
        coordinatorLayout.r(i4, view);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i11 = iMin - height;
        int i12 = this.f20377w;
        if (i11 < i12) {
            if (this.f20372r) {
                int i13 = this.f20366l;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f20366l;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.T = iMin2;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        w();
        int i15 = this.N;
        if (i15 == 3) {
            int iD = D();
            WeakHashMap weakHashMap2 = v0.f22405a;
            view.offsetTopAndBottom(iD);
        } else if (i15 == 6) {
            int i16 = this.E;
            WeakHashMap weakHashMap3 = v0.f22405a;
            view.offsetTopAndBottom(i16);
        } else if (this.I && i15 == 5) {
            int i17 = this.V;
            WeakHashMap weakHashMap4 = v0.f22405a;
            view.offsetTopAndBottom(i17);
        } else if (i15 == 4) {
            int i18 = this.G;
            WeakHashMap weakHashMap5 = v0.f22405a;
            view.offsetTopAndBottom(i18);
        } else if (i15 == 1 || i15 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = v0.f22405a;
            view.offsetTopAndBottom(top2);
        }
        O(this.N, false);
        this.X = new WeakReference(A(view));
        while (true) {
            ArrayList arrayList = this.Y;
            if (i10 >= arrayList.size()) {
                return true;
            }
            ((oc.b) arrayList.get(i10)).a(view);
            i10++;
        }
    }

    @Override // p3.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f20365k, marginLayoutParams.width), C(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f20366l, marginLayoutParams.height));
        return true;
    }

    @Override // p3.b
    public final boolean n(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // p3.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i10, int[] iArr, int i11) {
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i12 = top - i10;
        boolean z3 = this.L;
        if (i10 > 0) {
            if (!this.R && !z3 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i12 < D()) {
                int iD = top - D();
                iArr[1] = iD;
                WeakHashMap weakHashMap = v0.f22405a;
                view.offsetTopAndBottom(-iD);
                K(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap2 = v0.f22405a;
                view.offsetTopAndBottom(-i10);
                K(1);
            }
        } else if (i10 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z3 && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i13 = this.G;
                if (i12 > i13 && !this.I) {
                    int i14 = top - i13;
                    iArr[1] = i14;
                    WeakHashMap weakHashMap3 = v0.f22405a;
                    view.offsetTopAndBottom(-i14);
                    K(4);
                } else {
                    if (!this.K) {
                        return;
                    }
                    iArr[1] = i10;
                    WeakHashMap weakHashMap4 = v0.f22405a;
                    view.offsetTopAndBottom(-i10);
                    K(1);
                }
            }
        }
        z(view.getTop());
        this.Q = i10;
        this.R = true;
        this.M = false;
    }

    @Override // p3.b
    public final void r(View view, Parcelable parcelable) {
        oc.c cVar = (oc.c) parcelable;
        int i4 = this.f20350a;
        if (i4 != 0) {
            if (i4 == -1 || (i4 & 1) == 1) {
                this.f20358e = cVar.f30498d;
            }
            if (i4 == -1 || (i4 & 2) == 2) {
                this.f20352b = cVar.f30499e;
            }
            if (i4 == -1 || (i4 & 4) == 4) {
                this.I = cVar.f30500f;
            }
            if (i4 == -1 || (i4 & 8) == 8) {
                this.J = cVar.g;
            }
        }
        int i10 = cVar.f30497c;
        if (i10 == 1 || i10 == 2) {
            this.N = 4;
        } else {
            this.N = i10;
        }
    }

    @Override // p3.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new oc.c(this);
    }

    @Override // p3.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i10) {
        this.Q = 0;
        this.R = false;
        return (i4 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // p3.b
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
            r2.K(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.X
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.R
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f20352b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.Z
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f20354c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.Z
            int r6 = r2.f20353b0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.L(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f20352b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f20352b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.M(r4, r0, r3)
            r2.R = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // p3.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i4 = this.N;
        if (i4 == 1 && actionMasked == 0) {
            return true;
        }
        c cVar = this.O;
        if (cVar != null && (this.K || i4 == 1)) {
            cVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f20353b0 = -1;
            this.f20355c0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float fAbs = Math.abs(this.f20355c0 - motionEvent.getY());
            c cVar2 = this.O;
            if (fAbs > cVar2.f29747b) {
                cVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.P;
    }

    public final void w() {
        int iY = y();
        if (this.f20352b) {
            this.G = Math.max(this.V - iY, this.D);
        } else {
            this.G = this.V - iY;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float x() {
        /*
            r6 = this;
            ed.j r0 = r6.f20364i
            r1 = 0
            if (r0 == 0) goto L8a
            java.lang.ref.WeakReference r0 = r6.W
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L8a
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L8a
            java.lang.ref.WeakReference r0 = r6.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r6.F()
            if (r2 == 0) goto L8a
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L8a
            ed.j r2 = r6.f20364i
            float[] r3 = r2.C
            if (r3 == 0) goto L33
            r2 = 3
            r2 = r3[r2]
            goto L41
        L33:
            ed.h r3 = r2.f23316b
            ed.o r3 = r3.f23298a
            ed.d r3 = r3.f23357e
            android.graphics.RectF r2 = r2.h()
            float r2 = r3.a(r2)
        L41:
            r3 = 0
            android.view.RoundedCorner r4 = r0.getRoundedCorner(r3)
            if (r4 == 0) goto L57
            int r4 = r4.getRadius()
            float r4 = (float) r4
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L57
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 <= 0) goto L57
            float r4 = r4 / r2
            goto L58
        L57:
            r4 = r1
        L58:
            ed.j r2 = r6.f20364i
            float[] r5 = r2.C
            if (r5 == 0) goto L61
            r2 = r5[r3]
            goto L6f
        L61:
            ed.h r3 = r2.f23316b
            ed.o r3 = r3.f23298a
            ed.d r3 = r3.f23358f
            android.graphics.RectF r2 = r2.h()
            float r2 = r3.a(r2)
        L6f:
            r3 = 1
            android.view.RoundedCorner r0 = r0.getRoundedCorner(r3)
            if (r0 == 0) goto L85
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 <= 0) goto L85
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L85
            float r1 = r0 / r2
        L85:
            float r0 = java.lang.Math.max(r4, r1)
            return r0
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.x():float");
    }

    public final int y() {
        int i4;
        return this.f20360f ? Math.min(Math.max(this.g, this.V - ((this.U * 9) / 16)), this.T) + this.f20376v : (this.f20368n || this.f20369o || (i4 = this.f20367m) <= 0) ? this.f20358e + this.f20376v : Math.max(this.f20358e, i4 + this.f20363h);
    }

    public final void z(int i4) {
        View view = (View) this.W.get();
        if (view != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i10 = this.G;
            if (i4 <= i10 && i10 != D()) {
                D();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((oc.b) arrayList.get(i11)).b(view);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i4;
        this.f20350a = 0;
        this.f20352b = true;
        this.f20365k = -1;
        this.f20366l = -1;
        this.A = new k(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f20355c0 = -1;
        this.f20361f0 = new SparseIntArray();
        this.f20362g0 = new d(this, 1);
        this.f20363h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.f25945d);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = jm.a.j(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f20379y = o.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o oVar = this.f20379y;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f20364i = jVar;
            jVar.l(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.f20364i.o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f20364i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new com.facebook.shimmer.d(4, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f20365k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f20366l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i4 = typedValuePeekValue.data) == -1) {
            I(i4);
        } else {
            I(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        H(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.f20368n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        G(typedArrayObtainStyledAttributes.getBoolean(7, true));
        this.J = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f20350a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.W != null) {
                this.E = (int) ((1.0f - f10) * this.V);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i10 = typedValuePeekValue2.data;
                if (i10 >= 0) {
                    this.C = i10;
                    O(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    O(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f20356d = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.f20369o = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f20370p = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f20371q = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.f20372r = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.f20373s = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f20374t = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f20375u = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f20378x = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f20354c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p3.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11, int[] iArr) {
    }
}
