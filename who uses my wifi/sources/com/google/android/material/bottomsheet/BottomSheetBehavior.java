package com.google.android.material.bottomsheet;

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
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.e61;
import defpackage.ex0;
import defpackage.f9;
import defpackage.fu;
import defpackage.gn0;
import defpackage.i61;
import defpackage.k7;
import defpackage.mb;
import defpackage.n1;
import defpackage.nb;
import defpackage.nb0;
import defpackage.nc0;
import defpackage.o0;
import defpackage.ob;
import defpackage.ob1;
import defpackage.p0;
import defpackage.pb;
import defpackage.qb;
import defpackage.qb1;
import defpackage.r4;
import defpackage.rb;
import defpackage.rb0;
import defpackage.su0;
import defpackage.t3;
import defpackage.t51;
import defpackage.v0;
import defpackage.v81;
import defpackage.vj;
import defpackage.w81;
import defpackage.x81;
import defpackage.yj;
import defpackage.z20;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends vj implements nb0 {
    public final rb A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public i61 O;
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
    public final int a;
    public rb0 a0;
    public boolean b;
    public int b0;
    public final float c;
    public int c0;
    public final int d;
    public boolean d0;
    public int e;
    public HashMap e0;
    public boolean f;
    public final SparseIntArray f0;
    public int g;
    public final ob g0;
    public final int h;
    public final nc0 i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final su0 y;
    public boolean z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new rb(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.c0 = -1;
        this.f0 = new SparseIntArray();
        this.g0 = new ob(this, 0);
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
        for (int i = 0; i < childCount; i++) {
            View viewA = A(viewGroup.getChildAt(i));
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    public static BottomSheetBehavior B(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof yj)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        vj vjVar = ((yj) layoutParams).a;
        if (vjVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) vjVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int C(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final int D() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int E(int i) {
        if (i == 3) {
            return D();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.V;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(ex0.f("Invalid state to get top offset: ", i));
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

    public final void G(boolean z) {
        if (this.I != z) {
            this.I = z;
            if (!z && this.N == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        P();
    }

    public final void I(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(ex0.k(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.I || i != 5) {
            int i2 = (i == 6 && this.b && E(i) <= this.D) ? 3 : i;
            WeakReference weakReference = this.W;
            if (weakReference == null || weakReference.get() == null) {
                J(i);
                return;
            }
            View view = (View) this.W.get();
            k7 k7Var = new k7(this, view, i2);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(k7Var);
            } else {
                k7Var.run();
            }
        }
    }

    public final void J(int i) {
        View view;
        if (this.N == i) {
            return;
        }
        this.N = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            O(true);
        } else if (i == 6 || i == 5 || i == 4) {
            O(false);
        }
        N(i, true);
        while (true) {
            ArrayList arrayList = this.Y;
            if (i2 >= arrayList.size()) {
                M();
                return;
            } else {
                ((pb) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean K(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) y()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        J(2);
        N(r4, true);
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
    public final void L(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.E(r4)
            i61 r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.J(r3)
            r3 = 1
            r2.N(r4, r3)
            rb r3 = r2.A
            r3.a(r4)
            return
        L40:
            r2.J(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.L(android.view.View, int, boolean):void");
    }

    public final void M() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        e61.i(view, 524288);
        e61.g(view, 0);
        e61.i(view, 262144);
        e61.g(view, 0);
        e61.i(view, 1048576);
        e61.g(view, 0);
        SparseIntArray sparseIntArray = this.f0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            e61.i(view, i);
            e61.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.b && this.N != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            t3 t3Var = new t3(this, i, 1);
            ArrayList arrayListE = e61.e(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListE.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = e61.d;
                        if (i3 >= 32 || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListE.size(); i6++) {
                            z &= ((v0) arrayListE.get(i6)).a() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iA = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((v0) arrayListE.get(i2)).a).getLabel())) {
                        iA = ((v0) arrayListE.get(i2)).a();
                        break;
                    }
                    i2++;
                }
            }
            if (iA != -1) {
                v0 v0Var = new v0(null, iA, string, t3Var, null);
                View.AccessibilityDelegate accessibilityDelegateC = e61.c(view);
                p0 p0Var = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof o0 ? ((o0) accessibilityDelegateC).a : new p0(accessibilityDelegateC);
                if (p0Var == null) {
                    p0Var = new p0();
                }
                e61.l(view, p0Var);
                e61.i(view, v0Var.a());
                e61.e(view).add(v0Var);
                e61.g(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i7 = 5;
            if (this.N != 5) {
                e61.j(view, v0.j, new t3(this, i7, 1));
            }
        }
        int i8 = this.N;
        int i9 = 4;
        int i10 = 3;
        if (i8 == 3) {
            e61.j(view, v0.i, new t3(this, this.b ? 4 : 6, 1));
            return;
        }
        if (i8 == 4) {
            e61.j(view, v0.h, new t3(this, this.b ? 3 : 6, 1));
        } else {
            if (i8 != 6) {
                return;
            }
            e61.j(view, v0.i, new t3(this, i9, 1));
            e61.j(view, v0.h, new t3(this, i10, 1));
        }
    }

    public final void N(int i, boolean z) {
        nc0 nc0Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.N == 3 && (this.x || F());
        if (this.z == z2 || (nc0Var = this.i) == null) {
            return;
        }
        this.z = z2;
        ValueAnimator valueAnimator = this.B;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            nc0Var.r(this.z ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(nc0Var.g.j, z2 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void O(boolean z) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.e0 != null) {
                    return;
                } else {
                    this.e0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.W.get() && z) {
                    this.e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.e0 = null;
        }
    }

    public final void P() {
        View view;
        if (this.W != null) {
            w();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.nb0
    public final void a() {
        rb0 rb0Var = this.a0;
        if (rb0Var == null) {
            return;
        }
        int i = rb0Var.d;
        int i2 = rb0Var.c;
        f9 f9Var = rb0Var.f;
        rb0Var.f = null;
        if (f9Var != null) {
            float f = f9Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.I) {
                    AnimatorSet animatorSetA = rb0Var.a();
                    animatorSetA.setDuration(r4.c(f, i2, i));
                    animatorSetA.start();
                    I(4);
                    return;
                }
                n1 n1Var = new n1(2, this);
                View view = rb0Var.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new fu(1));
                objectAnimatorOfFloat.setDuration(r4.c(f, i2, i));
                objectAnimatorOfFloat.addListener(new n1(8, rb0Var));
                objectAnimatorOfFloat.addListener(n1Var);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        I(this.I ? 5 : 4);
    }

    @Override // defpackage.nb0
    public final void b(f9 f9Var) {
        rb0 rb0Var = this.a0;
        if (rb0Var == null) {
            return;
        }
        f9 f9Var2 = rb0Var.f;
        rb0Var.f = f9Var;
        if (f9Var2 == null) {
            return;
        }
        rb0Var.b(f9Var.c);
    }

    @Override // defpackage.nb0
    public final void c(f9 f9Var) {
        rb0 rb0Var = this.a0;
        if (rb0Var == null) {
            return;
        }
        rb0Var.f = f9Var;
    }

    @Override // defpackage.nb0
    public final void d() {
        rb0 rb0Var = this.a0;
        if (rb0Var == null) {
            return;
        }
        f9 f9Var = rb0Var.f;
        rb0Var.f = null;
        if (f9Var == null) {
            return;
        }
        AnimatorSet animatorSetA = rb0Var.a();
        animatorSetA.setDuration(rb0Var.e);
        animatorSetA.start();
    }

    @Override // defpackage.vj
    public final void g(yj yjVar) {
        this.W = null;
        this.O = null;
        this.a0 = null;
    }

    @Override // defpackage.vj
    public final void j() {
        this.W = null;
        this.O = null;
        this.a0 = null;
    }

    @Override // defpackage.vj
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        i61 i61Var;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b0 = -1;
            this.c0 = -1;
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
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.c0 = y;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x, y)) {
                    this.b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.d0 = true;
                }
            }
            this.P = this.b0 == -1 && !coordinatorLayout.p(view, x, this.c0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.d0 = false;
            this.b0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (i61Var = this.O) == null || !i61Var.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i = this.c0) == -1 || Math.abs(i - motionEvent.getY()) <= this.O.b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vj
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.W == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            boolean z = (i3 < 29 || this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                qb1.h(view, new nb(this, z));
            }
            z20 z20Var = new z20(view);
            WeakHashMap weakHashMap = e61.a;
            if (i3 >= 30) {
                view.setWindowInsetsAnimationCallback(new x81(z20Var));
            } else {
                PathInterpolator pathInterpolator = w81.e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener v81Var = new v81(view, z20Var);
                view.setTag(R.id.tag_window_insets_animation_callback, v81Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(v81Var);
                }
            }
            this.W = new WeakReference(view);
            this.a0 = new rb0(view);
            nc0 nc0Var = this.i;
            if (nc0Var != null) {
                view.setBackground(nc0Var);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                nc0Var.p(elevation);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    t51.q(view, colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new i61(coordinatorLayout.getContext(), coordinatorLayout, this.g0);
        }
        int top = view.getTop();
        coordinatorLayout.r(view, i);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i4 = iMin - height;
        int i5 = this.w;
        if (i4 < i5) {
            boolean z2 = this.r;
            int i6 = this.l;
            if (z2) {
                if (i6 != -1) {
                    iMin = Math.min(iMin, i6);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i5;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.T = iMin2;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        w();
        int i7 = this.N;
        if (i7 == 3) {
            int iD = D();
            WeakHashMap weakHashMap2 = e61.a;
            view.offsetTopAndBottom(iD);
        } else if (i7 == 6) {
            int i8 = this.E;
            WeakHashMap weakHashMap3 = e61.a;
            view.offsetTopAndBottom(i8);
        } else if (this.I && i7 == 5) {
            int i9 = this.V;
            WeakHashMap weakHashMap4 = e61.a;
            view.offsetTopAndBottom(i9);
        } else if (i7 == 4) {
            int i10 = this.G;
            WeakHashMap weakHashMap5 = e61.a;
            view.offsetTopAndBottom(i10);
        } else if (i7 == 1 || i7 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = e61.a;
            view.offsetTopAndBottom(top2);
        }
        N(this.N, false);
        this.X = new WeakReference(A(view));
        while (true) {
            ArrayList arrayList = this.Y;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((pb) arrayList.get(i2)).a(view);
            i2++;
        }
    }

    @Override // defpackage.vj
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), C(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.vj
    public final boolean n(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // defpackage.vj
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.K;
        boolean z2 = this.L;
        if (i2 > 0) {
            if (!this.R && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i4 < D()) {
                int iD = top - D();
                iArr[1] = iD;
                WeakHashMap weakHashMap = e61.a;
                view.offsetTopAndBottom(-iD);
                J(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = e61.a;
                view.offsetTopAndBottom(-i2);
                J(1);
            }
        } else if (i2 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z2 && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i5 = this.G;
                if (i4 > i5 && !this.I) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    WeakHashMap weakHashMap3 = e61.a;
                    view.offsetTopAndBottom(-i6);
                    J(4);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap4 = e61.a;
                    view.offsetTopAndBottom(-i2);
                    J(1);
                }
            }
        }
        z(view.getTop());
        this.Q = i2;
        this.R = true;
        this.M = false;
    }

    @Override // defpackage.vj
    public final void r(View view, Parcelable parcelable) {
        qb qbVar = (qb) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = qbVar.i;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = qbVar.j;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = qbVar.k;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = qbVar.l;
            }
        }
        int i2 = qbVar.h;
        if (i2 == 1 || i2 == 2) {
            this.N = 4;
        } else {
            this.N = i2;
        }
    }

    @Override // defpackage.vj
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new qb(this);
    }

    @Override // defpackage.vj
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // defpackage.vj
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
            r2.J(r0)
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
            boolean r3 = r2.b
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
            float r1 = r2.c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.Z
            int r6 = r2.b0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.K(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.b
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
            boolean r3 = r2.b
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
            r2.L(r4, r0, r3)
            r2.R = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.vj
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        i61 i61Var = this.O;
        if (i61Var != null && (this.K || i == 1)) {
            i61Var.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.b0 = -1;
            this.c0 = -1;
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
            float fAbs = Math.abs(this.c0 - motionEvent.getY());
            i61 i61Var2 = this.O;
            if (fAbs > i61Var2.b) {
                i61Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void w() {
        int iY = y();
        if (this.b) {
            this.G = Math.max(this.V - iY, this.D);
        } else {
            this.G = this.V - iY;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float x() {
        /*
            r5 = this;
            nc0 r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L77
            java.lang.ref.WeakReference r0 = r5.W
            if (r0 == 0) goto L77
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L77
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L77
            java.lang.ref.WeakReference r0 = r5.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.F()
            if (r2 == 0) goto L77
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L77
            nc0 r2 = r5.i
            float r2 = r2.k()
            android.view.RoundedCorner r3 = defpackage.lb.p(r0)
            if (r3 == 0) goto L44
            int r3 = defpackage.lb.d(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r3 = r3 / r2
            goto L45
        L44:
            r3 = r1
        L45:
            nc0 r2 = r5.i
            float[] r4 = r2.H
            if (r4 == 0) goto L4f
            r2 = 0
            r2 = r4[r2]
            goto L5d
        L4f:
            lc0 r4 = r2.g
            su0 r4 = r4.a
            ck r4 = r4.f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
        L5d:
            android.view.RoundedCorner r0 = defpackage.lb.B(r0)
            if (r0 == 0) goto L72
            int r0 = defpackage.lb.d(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L72
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L72
            float r1 = r0 / r2
        L72:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.x():float");
    }

    public final int y() {
        int i;
        return this.f ? Math.min(Math.max(this.g, this.V - ((this.U * 9) / 16)), this.T) + this.v : (this.n || this.o || (i = this.m) <= 0) ? this.e + this.v : Math.max(this.e, i + this.h);
    }

    public final void z(int i) {
        View view = (View) this.W.get();
        if (view != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != D()) {
                D();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((pb) arrayList.get(i3)).b(view);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new rb(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.c0 = -1;
        this.f0 = new SparseIntArray();
        this.g0 = new ob(this, i2);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.e);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = ob1.e(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.y = su0.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        su0 su0Var = this.y;
        if (su0Var != null) {
            nc0 nc0Var = new nc0(su0Var);
            this.i = nc0Var;
            nc0Var.m(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new mb(i2, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            H(i);
        } else {
            H(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        G(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.b != z) {
            this.b = z;
            if (this.W != null) {
                w();
            }
            J((this.b && this.N == 6) ? 3 : this.N);
            N(this.N, true);
            M();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.F = f;
            if (this.W != null) {
                this.E = (int) ((1.0f - f) * this.V);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.C = i3;
                    N(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    N(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.o = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.q = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.s = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.t = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.u = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.x = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // defpackage.vj
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
