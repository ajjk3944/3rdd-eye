package com.google.android.material.bottomsheet;

import android.R;
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
import b4.f;
import bc.j;
import e3.b;
import e3.e;
import ed.d;
import ed.k;
import ee.i;
import ee.l;
import io.sentry.android.core.e0;
import ir.f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import u3.i0;
import u3.z;
import w.g;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b {

    /* renamed from: g0, reason: collision with root package name */
    public static final int f5508g0 = k.Widget_Design_BottomSheet_Modal;
    public final j A;
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
    public f O;
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
    public final int f5509a;

    /* renamed from: a0, reason: collision with root package name */
    public int f5510a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5511b;

    /* renamed from: b0, reason: collision with root package name */
    public int f5512b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f5513c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5514c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f5515d;

    /* renamed from: d0, reason: collision with root package name */
    public HashMap f5516d0;

    /* renamed from: e, reason: collision with root package name */
    public int f5517e;

    /* renamed from: e0, reason: collision with root package name */
    public final SparseIntArray f5518e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5519f;

    /* renamed from: f0, reason: collision with root package name */
    public final fe.b f5520f0;

    /* renamed from: g, reason: collision with root package name */
    public int f5521g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5522h;

    /* renamed from: i, reason: collision with root package name */
    public final i f5523i;
    public final ColorStateList j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5524l;

    /* renamed from: m, reason: collision with root package name */
    public int f5525m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5526n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5527o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5528p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5529q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5530r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5531s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5532t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5533u;

    /* renamed from: v, reason: collision with root package name */
    public int f5534v;

    /* renamed from: w, reason: collision with root package name */
    public int f5535w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5536x;

    /* renamed from: y, reason: collision with root package name */
    public final l f5537y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5538z;

    public BottomSheetBehavior() {
        this.f5509a = 0;
        this.f5511b = true;
        this.k = -1;
        this.f5524l = -1;
        this.A = new j(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f5512b0 = -1;
        this.f5518e0 = new SparseIntArray();
        this.f5520f0 = new fe.b(this, 1);
    }

    public static View w(View view) {
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
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewW = w(viewGroup.getChildAt(i10));
            if (viewW != null) {
                return viewW;
            }
        }
        return null;
    }

    public static int x(int i10, int i11, int i12, int i13) {
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

    public final boolean A() {
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

    public final void B(int i10) {
        if (i10 == -1) {
            if (this.f5519f) {
                return;
            } else {
                this.f5519f = true;
            }
        } else {
            if (!this.f5519f && this.f5517e == i10) {
                return;
            }
            this.f5519f = false;
            this.f5517e = Math.max(0, i10);
        }
        J();
    }

    public final void C(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(g.j(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i10 == 5) {
            e0.p("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f5511b && z(i10) <= this.D) ? 3 : i10;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            D(i10);
            return;
        }
        View view = (View) this.W.get();
        c.f fVar = new c.f(this, view, i11);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(fVar);
        } else {
            fVar.run();
        }
    }

    public final void D(int i10) {
        if (this.N == i10) {
            return;
        }
        this.N = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z10 = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            I(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            I(false);
        }
        H(i10, true);
        ArrayList arrayList = this.Y;
        if (arrayList.size() > 0) {
            throw h0.b.e(0, arrayList);
        }
        G();
    }

    public final boolean E(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f10 * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) u()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        D(2);
        H(r4, true);
        r2.A.f(r4);
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
    public final void F(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.z(r4)
            b4.f r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f2415r = r3
            r3 = -1
            r1.f2402c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f2400a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f2415r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f2415r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.D(r3)
            r3 = 1
            r2.H(r4, r3)
            bc.j r3 = r2.A
            r3.f(r4)
            return
        L40:
            r2.D(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.F(android.view.View, int, boolean):void");
    }

    public final void G() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        i0.k(view, 524288);
        i0.h(view, 0);
        i0.k(view, 262144);
        i0.h(view, 0);
        i0.k(view, 1048576);
        i0.h(view, 0);
        SparseIntArray sparseIntArray = this.f5518e0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            i0.k(view, i10);
            i0.h(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f5511b && this.N != 6) {
            String string = view.getResources().getString(ed.j.bottomsheet_action_expand_halfway);
            ag.b bVar = new ag.b(i, 9, this);
            ArrayList arrayListF = i0.f(view);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayListF.size()) {
                    int i12 = 0;
                    int i13 = -1;
                    while (true) {
                        int[] iArr = i0.f23180d;
                        if (i12 >= 32 || i13 != -1) {
                            break;
                        }
                        int i14 = iArr[i12];
                        boolean z10 = true;
                        for (int i15 = 0; i15 < arrayListF.size(); i15++) {
                            z10 &= ((v3.b) arrayListF.get(i15)).a() != i14;
                        }
                        if (z10) {
                            i13 = i14;
                        }
                        i12++;
                    }
                    iA = i13;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((v3.b) arrayListF.get(i11)).f23833a).getLabel())) {
                        iA = ((v3.b) arrayListF.get(i11)).a();
                        break;
                    }
                    i11++;
                }
            }
            if (iA != -1) {
                v3.b bVar2 = new v3.b(null, iA, string, bVar, null);
                View.AccessibilityDelegate accessibilityDelegateD = i0.d(view);
                u3.b bVar3 = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof u3.a ? ((u3.a) accessibilityDelegateD).f23144a : new u3.b(accessibilityDelegateD);
                if (bVar3 == null) {
                    bVar3 = new u3.b();
                }
                i0.n(view, bVar3);
                i0.k(view, bVar2.a());
                i0.f(view).add(bVar2);
                i0.h(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i16 = 5;
            if (this.N != 5) {
                i0.l(view, v3.b.f23830l, new ag.b(i16, 9, this));
            }
        }
        int i17 = this.N;
        int i18 = 4;
        int i19 = 3;
        if (i17 == 3) {
            i0.l(view, v3.b.k, new ag.b(this.f5511b ? 4 : 6, 9, this));
            return;
        }
        if (i17 == 4) {
            i0.l(view, v3.b.j, new ag.b(this.f5511b ? 3 : 6, 9, this));
        } else {
            if (i17 != 6) {
                return;
            }
            i0.l(view, v3.b.k, new ag.b(i18, 9, this));
            i0.l(view, v3.b.j, new ag.b(i19, 9, this));
        }
    }

    public final void H(int i10, boolean z10) {
        i iVar;
        if (i10 == 2) {
            return;
        }
        boolean z11 = this.N == 3 && (this.f5536x || A());
        if (this.f5538z == z11 || (iVar = this.f5523i) == null) {
            return;
        }
        this.f5538z = z11;
        ValueAnimator valueAnimator = this.B;
        if (!z10 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            iVar.r(this.f5538z ? t() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(iVar.f8117d.j, z11 ? t() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void I(boolean z10) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f5516d0 != null) {
                    return;
                } else {
                    this.f5516d0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.W.get() && z10) {
                    this.f5516d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z10) {
                return;
            }
            this.f5516d0 = null;
        }
    }

    public final void J() {
        View view;
        if (this.W != null) {
            s();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // e3.b
    public final void c(e eVar) {
        this.W = null;
        this.O = null;
    }

    @Override // e3.b
    public final void f() {
        this.W = null;
        this.O = null;
    }

    @Override // e3.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        f fVar;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5510a0 = -1;
            this.f5512b0 = -1;
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
            this.f5512b0 = y10;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x10, y10)) {
                    this.f5510a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f5514c0 = true;
                }
            }
            this.P = this.f5510a0 == -1 && !coordinatorLayout.p(view, x10, this.f5512b0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5514c0 = false;
            this.f5510a0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (fVar = this.O) == null || !fVar.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i10 = this.f5512b0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.O.f2401b) {
                return false;
            }
        }
        return true;
    }

    @Override // e3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) throws Resources.NotFoundException {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f5521g = coordinatorLayout.getResources().getDimensionPixelSize(d.design_bottom_sheet_peek_height_min);
            boolean z10 = (Build.VERSION.SDK_INT < 29 || this.f5526n || this.f5519f) ? false : true;
            if (this.f5527o || this.f5528p || this.f5529q || this.f5531s || this.f5532t || this.f5533u || z10) {
                xd.l.a(view, new ab.g(this, z10, 9));
            }
            i0.p(view, new ld.a(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            f0.U(context, ed.b.motionDurationMedium2, 300);
            f0.U(context, ed.b.motionDurationShort3, 150);
            f0.U(context, ed.b.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(d.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(d.m3_back_progress_bottom_container_max_scale_y_distance);
            i iVar = this.f5523i;
            if (iVar != null) {
                view.setBackground(iVar);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar.p(elevation);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    z.g(view, colorStateList);
                }
            }
            G();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f5520f0);
        }
        int top = view.getTop();
        coordinatorLayout.s(view, i10);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i11 = iMin - height;
        int i12 = this.f5535w;
        if (i11 < i12) {
            boolean z11 = this.f5530r;
            int i13 = this.f5524l;
            if (z11) {
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i12;
                if (i13 != -1) {
                    iMin2 = Math.min(iMin2, i13);
                }
                this.T = iMin2;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        s();
        int i14 = this.N;
        if (i14 == 3) {
            int iY = y();
            WeakHashMap weakHashMap = i0.f23177a;
            view.offsetTopAndBottom(iY);
        } else if (i14 == 6) {
            int i15 = this.E;
            WeakHashMap weakHashMap2 = i0.f23177a;
            view.offsetTopAndBottom(i15);
        } else if (this.I && i14 == 5) {
            int i16 = this.V;
            WeakHashMap weakHashMap3 = i0.f23177a;
            view.offsetTopAndBottom(i16);
        } else if (i14 == 4) {
            int i17 = this.G;
            WeakHashMap weakHashMap4 = i0.f23177a;
            view.offsetTopAndBottom(i17);
        } else if (i14 == 1 || i14 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = i0.f23177a;
            view.offsetTopAndBottom(top2);
        }
        H(this.N, false);
        this.X = new WeakReference(w(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        throw h0.b.e(0, arrayList);
    }

    @Override // e3.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.k, marginLayoutParams.width), x(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f5524l, marginLayoutParams.height));
        return true;
    }

    @Override // e3.b
    public final boolean j(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // e3.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        boolean z10 = this.K;
        boolean z11 = this.L;
        if (i11 > 0) {
            if (!this.R && !z11 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i13 < y()) {
                int iY = top - y();
                iArr[1] = iY;
                WeakHashMap weakHashMap = i0.f23177a;
                view.offsetTopAndBottom(-iY);
                D(3);
            } else {
                if (!z10) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap2 = i0.f23177a;
                view.offsetTopAndBottom(-i11);
                D(1);
            }
        } else if (i11 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z11 && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i14 = this.G;
                if (i13 > i14 && !this.I) {
                    int i15 = top - i14;
                    iArr[1] = i15;
                    WeakHashMap weakHashMap3 = i0.f23177a;
                    view.offsetTopAndBottom(-i15);
                    D(4);
                } else {
                    if (!z10) {
                        return;
                    }
                    iArr[1] = i11;
                    WeakHashMap weakHashMap4 = i0.f23177a;
                    view.offsetTopAndBottom(-i11);
                    D(1);
                }
            }
        }
        v(view.getTop());
        this.Q = i11;
        this.R = true;
        this.M = false;
    }

    @Override // e3.b
    public final void n(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i10 = this.f5509a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f5517e = savedState.f5540r;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f5511b = savedState.f5541x;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = savedState.f5542y;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = savedState.B;
            }
        }
        int i11 = savedState.f5539g;
        if (i11 == 1 || i11 == 2) {
            this.N = 4;
        } else {
            this.N = i11;
        }
    }

    @Override // e3.b
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // e3.b
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        this.Q = 0;
        this.R = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // e3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.y()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.D(r0)
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
            boolean r3 = r2.f5511b
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
            float r1 = r2.f5513c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.Z
            int r6 = r2.f5510a0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.E(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f5511b
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
            boolean r3 = r2.f5511b
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
            r2.F(r4, r0, r3)
            r2.R = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // e3.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.N;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        f fVar = this.O;
        if (fVar != null && (this.K || i10 == 1)) {
            fVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f5510a0 = -1;
            this.f5512b0 = -1;
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
            float fAbs = Math.abs(this.f5512b0 - motionEvent.getY());
            f fVar2 = this.O;
            if (fAbs > fVar2.f2401b) {
                fVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void s() {
        int iU = u();
        if (this.f5511b) {
            this.G = Math.max(this.V - iU, this.D);
        } else {
            this.G = this.V - iU;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float t() {
        /*
            r5 = this;
            ee.i r0 = r5.f5523i
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
            boolean r2 = r5.A()
            if (r2 == 0) goto L77
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L77
            ee.i r2 = r5.f5523i
            float r2 = r2.k()
            android.view.RoundedCorner r3 = fj.i.k(r0)
            if (r3 == 0) goto L44
            int r3 = fj.i.c(r3)
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
            ee.i r2 = r5.f5523i
            float[] r4 = r2.Y
            if (r4 == 0) goto L4f
            r2 = 0
            r2 = r4[r2]
            goto L5d
        L4f:
            ee.g r4 = r2.f8117d
            ee.l r4 = r4.f8097a
            ee.d r4 = r4.f8129f
            android.graphics.RectF r2 = r2.h()
            float r2 = r4.a(r2)
        L5d:
            android.view.RoundedCorner r0 = fj.i.C(r0)
            if (r0 == 0) goto L72
            int r0 = fj.i.c(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():float");
    }

    public final int u() {
        int i10;
        return this.f5519f ? Math.min(Math.max(this.f5521g, this.V - ((this.U * 9) / 16)), this.T) + this.f5534v : (this.f5526n || this.f5527o || (i10 = this.f5525m) <= 0) ? this.f5517e + this.f5534v : Math.max(this.f5517e, i10 + this.f5522h);
    }

    public final void v(int i10) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.G;
            if (i10 <= i11 && i11 != y()) {
                y();
            }
            if (arrayList.size() > 0) {
                throw h0.b.e(0, arrayList);
            }
        }
    }

    public final int y() {
        if (this.f5511b) {
            return this.D;
        }
        return Math.max(this.C, this.f5530r ? 0 : this.f5535w);
    }

    public final int z(int i10) {
        if (i10 == 3) {
            return y();
        }
        if (i10 == 4) {
            return this.G;
        }
        if (i10 == 5) {
            return this.V;
        }
        if (i10 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(h0.b.h(i10, "Invalid state to get top offset: "));
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final boolean B;

        /* renamed from: g, reason: collision with root package name */
        public final int f5539g;

        /* renamed from: r, reason: collision with root package name */
        public final int f5540r;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f5541x;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f5542y;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5539g = parcel.readInt();
            this.f5540r = parcel.readInt();
            this.f5541x = parcel.readInt() == 1;
            this.f5542y = parcel.readInt() == 1;
            this.B = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5539g);
            parcel.writeInt(this.f5540r);
            parcel.writeInt(this.f5541x ? 1 : 0);
            parcel.writeInt(this.f5542y ? 1 : 0);
            parcel.writeInt(this.B ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f5539g = bottomSheetBehavior.N;
            this.f5540r = bottomSheetBehavior.f5517e;
            this.f5541x = bottomSheetBehavior.f5511b;
            this.f5542y = bottomSheetBehavior.I;
            this.B = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i10;
        this.f5509a = 0;
        this.f5511b = true;
        this.k = -1;
        this.f5524l = -1;
        this.A = new j(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f5512b0 = -1;
        this.f5518e0 = new SparseIntArray();
        this.f5520f0 = new fe.b(this, 1);
        this.f5522h = context.getResources().getDimensionPixelSize(d.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ed.l.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(ed.l.BottomSheetBehavior_Layout_backgroundTint)) {
            this.j = xu.l.q(context, typedArrayObtainStyledAttributes, ed.l.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ed.l.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f5537y = l.c(context, attributeSet, ed.b.bottomSheetStyle, f5508g0).b();
        }
        l lVar = this.f5537y;
        if (lVar != null) {
            i iVar = new i(lVar);
            this.f5523i = iVar;
            iVar.m(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.f5523i.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f5523i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(t(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new bq.f(4, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(ed.l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(ed.l.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ed.l.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.f5524l = typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(ed.l.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            B(i10);
        } else {
            B(typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.N == 5) {
                C(4);
            }
            G();
        }
        this.f5526n = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f5511b != z11) {
            this.f5511b = z11;
            if (this.W != null) {
                s();
            }
            D((this.f5511b && this.N == 6) ? 3 : this.N);
            H(this.N, true);
            G();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true);
        this.f5509a = typedArrayObtainStyledAttributes.getInt(ed.l.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(ed.l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.W != null) {
                this.E = (int) ((1.0f - f10) * this.V);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(ed.l.BottomSheetBehavior_Layout_behavior_expandedOffset);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i11 = typedValuePeekValue2.data;
                if (i11 >= 0) {
                    this.C = i11;
                    H(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ed.l.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    H(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f5515d = typedArrayObtainStyledAttributes.getInt(ed.l.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
            this.f5527o = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
            this.f5528p = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
            this.f5529q = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
            this.f5530r = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
            this.f5531s = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
            this.f5532t = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
            this.f5533u = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
            this.f5536x = typedArrayObtainStyledAttributes.getBoolean(ed.l.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f5513c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // e3.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }
}
