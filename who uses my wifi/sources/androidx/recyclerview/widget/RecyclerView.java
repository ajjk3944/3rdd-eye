package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.ao0;
import defpackage.bw0;
import defpackage.co0;
import defpackage.do0;
import defpackage.e61;
import defpackage.ef;
import defpackage.en0;
import defpackage.eo0;
import defpackage.ex0;
import defpackage.f23;
import defpackage.f61;
import defpackage.fo0;
import defpackage.fw3;
import defpackage.g3;
import defpackage.gw3;
import defpackage.ho0;
import defpackage.io0;
import defpackage.iu;
import defpackage.jo0;
import defpackage.ko0;
import defpackage.l61;
import defpackage.l80;
import defpackage.ln;
import defpackage.lo0;
import defpackage.mo0;
import defpackage.no0;
import defpackage.o21;
import defpackage.oo0;
import defpackage.pg0;
import defpackage.po0;
import defpackage.qg0;
import defpackage.qo0;
import defpackage.t51;
import defpackage.t83;
import defpackage.tg0;
import defpackage.to0;
import defpackage.ue;
import defpackage.uo0;
import defpackage.uy;
import defpackage.v51;
import defpackage.vg0;
import defpackage.vo0;
import defpackage.w60;
import defpackage.wo0;
import defpackage.yn0;
import defpackage.yo0;
import defpackage.z71;
import defpackage.zn0;
import defpackage.zs1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements pg0 {
    public static final int[] D0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] E0;
    public static final zn0 F0;
    public boolean A;
    public int A0;
    public boolean B;
    public int B0;
    public boolean C;
    public final vg0 C0;
    public int D;
    public boolean E;
    public final AccessibilityManager F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public do0 K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public eo0 P;
    public int Q;
    public int R;
    public VelocityTracker S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public jo0 b0;
    public final int c0;
    public final int d0;
    public final float e0;
    public final po0 f;
    public final float f0;
    public final no0 g;
    public boolean g0;
    public qo0 h;
    public final vo0 h0;
    public final fw3 i;
    public uy i0;
    public final t83 j;
    public final ef j0;
    public final gw3 k;
    public final to0 k0;
    public boolean l;
    public ko0 l0;
    public final yn0 m;
    public ArrayList m0;
    public final Rect n;
    public boolean n0;
    public final Rect o;
    public boolean o0;
    public final RectF p;
    public final f23 p0;
    public ao0 q;
    public boolean q0;
    public ho0 r;
    public yo0 r0;
    public final ArrayList s;
    public final int[] s0;
    public final ArrayList t;
    public qg0 t0;
    public final ArrayList u;
    public final int[] u0;
    public iu v;
    public final int[] v0;
    public boolean w;
    public final int[] w0;
    public boolean x;
    public final ArrayList x0;
    public boolean y;
    public final yn0 y0;
    public int z;
    public boolean z0;

    static {
        Class cls = Integer.TYPE;
        E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        F0 = new zn0(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewD = D(viewGroup.getChildAt(i));
            if (recyclerViewD != null) {
                return recyclerViewD;
            }
        }
        return null;
    }

    public static wo0 I(View view) {
        if (view == null) {
            return null;
        }
        return ((io0) view.getLayoutParams()).a;
    }

    private qg0 getScrollingChildHelper() {
        if (this.t0 == null) {
            this.t0 = new qg0(this);
        }
        return this.t0;
    }

    public static void j(wo0 wo0Var) {
        WeakReference weakReference = wo0Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == wo0Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            wo0Var.b = null;
        }
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.u
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            iu r5 = (defpackage.iu) r5
            int r6 = r5.v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L55:
            r5.g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.v = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.MotionEvent):boolean");
    }

    public final void C(int[] iArr) {
        int iC = this.j.C();
        if (iC == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iC; i3++) {
            wo0 wo0VarI = I(this.j.B(i3));
            if (!wo0VarI.o()) {
                int iB = wo0VarI.b();
                if (iB < i) {
                    i = iB;
                }
                if (iB > i2) {
                    i2 = iB;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final wo0 E(int i) {
        wo0 wo0Var = null;
        if (this.G) {
            return null;
        }
        int iH = this.j.H();
        for (int i2 = 0; i2 < iH; i2++) {
            wo0 wo0VarI = I(this.j.G(i2));
            if (wo0VarI != null && !wo0VarI.h() && F(wo0VarI) == i) {
                if (!((ArrayList) this.j.i).contains(wo0VarI.a)) {
                    return wo0VarI;
                }
                wo0Var = wo0VarI;
            }
        }
        return wo0Var;
    }

    public final int F(wo0 wo0Var) {
        if ((wo0Var.j & 524) == 0 && wo0Var.e()) {
            int i = wo0Var.c;
            ArrayList arrayList = (ArrayList) this.i.h;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                g3 g3Var = (g3) arrayList.get(i2);
                int i3 = g3Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = g3Var.b;
                        if (i4 <= i) {
                            int i5 = g3Var.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = g3Var.b;
                        if (i6 == i) {
                            i = g3Var.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (g3Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (g3Var.b <= i) {
                    i += g3Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long G(wo0 wo0Var) {
        return this.q.g ? wo0Var.e : wo0Var.c;
    }

    public final wo0 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        io0 io0Var = (io0) view.getLayoutParams();
        boolean z = io0Var.c;
        Rect rect = io0Var.b;
        if (!z || (this.k0.g && (io0Var.a.k() || io0Var.a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.n;
            rect2.set(0, 0, 0, 0);
            ((fo0) arrayList.get(i)).a(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        io0Var.c = false;
        return rect;
    }

    public final boolean K() {
        return !this.y || this.G || this.i.j();
    }

    public final boolean L() {
        return this.I > 0;
    }

    public final void M(int i) {
        if (this.r == null) {
            return;
        }
        setScrollState(2);
        this.r.o0(i);
        awakenScrollBars();
    }

    public final void N() {
        int iH = this.j.H();
        for (int i = 0; i < iH; i++) {
            ((io0) this.j.G(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.g.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            io0 io0Var = (io0) ((wo0) arrayList.get(i2)).a.getLayoutParams();
            if (io0Var != null) {
                io0Var.c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iH = this.j.H();
        for (int i4 = 0; i4 < iH; i4++) {
            wo0 wo0VarI = I(this.j.G(i4));
            if (wo0VarI != null && !wo0VarI.o()) {
                int i5 = wo0VarI.c;
                to0 to0Var = this.k0;
                if (i5 >= i3) {
                    wo0VarI.l(-i2, z);
                    to0Var.f = true;
                } else if (i5 >= i) {
                    wo0VarI.a(8);
                    wo0VarI.l(-i2, z);
                    wo0VarI.c = i - 1;
                    to0Var.f = true;
                }
            }
        }
        no0 no0Var = this.g;
        ArrayList arrayList = no0Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wo0 wo0Var = (wo0) arrayList.get(size);
            if (wo0Var != null) {
                int i6 = wo0Var.c;
                if (i6 >= i3) {
                    wo0Var.l(-i2, z);
                } else if (i6 >= i) {
                    wo0Var.a(8);
                    no0Var.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.I++;
    }

    public final void Q(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.I - 1;
        this.I = i2;
        if (i2 < 1) {
            this.I = 0;
            if (z) {
                int i3 = this.D;
                this.D = 0;
                if (i3 != 0 && (accessibilityManager = this.F) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.x0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    wo0 wo0Var = (wo0) arrayList.get(size);
                    if (wo0Var.a.getParent() == this && !wo0Var.o() && (i = wo0Var.q) != -1) {
                        View view = wo0Var.a;
                        WeakHashMap weakHashMap = e61.a;
                        view.setImportantForAccessibility(i);
                        wo0Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            int i = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.V = x;
            this.T = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.W = y;
            this.U = y;
        }
    }

    public final void S() {
        if (this.q0 || !this.w) {
            return;
        }
        WeakHashMap weakHashMap = e61.a;
        postOnAnimation(this.y0);
        this.q0 = true;
    }

    public final void T() {
        boolean z;
        boolean z2 = false;
        if (this.G) {
            fw3 fw3Var = this.i;
            fw3Var.q((ArrayList) fw3Var.h);
            fw3Var.q((ArrayList) fw3Var.i);
            fw3Var.f = 0;
            if (this.H) {
                this.r.Y();
            }
        }
        if (this.P == null || !this.r.A0()) {
            this.i.d();
        } else {
            this.i.p();
        }
        boolean z3 = this.n0 || this.o0;
        boolean z4 = this.y && this.P != null && ((z = this.G) || z3 || this.r.f) && (!z || this.q.g);
        to0 to0Var = this.k0;
        to0Var.j = z4;
        if (z4 && z3 && !this.G && this.P != null && this.r.A0()) {
            z2 = true;
        }
        to0Var.k = z2;
    }

    public final void U(boolean z) {
        this.H = z | this.H;
        this.G = true;
        int iH = this.j.H();
        for (int i = 0; i < iH; i++) {
            wo0 wo0VarI = I(this.j.G(i));
            if (wo0VarI != null && !wo0VarI.o()) {
                wo0VarI.a(6);
            }
        }
        N();
        no0 no0Var = this.g;
        ArrayList arrayList = no0Var.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wo0 wo0Var = (wo0) arrayList.get(i2);
            if (wo0Var != null) {
                wo0Var.a(6);
                wo0Var.a(1024);
            }
        }
        ao0 ao0Var = no0Var.h.q;
        if (ao0Var == null || !ao0Var.g) {
            no0Var.e();
        }
    }

    public final void V(wo0 wo0Var, tg0 tg0Var) {
        wo0Var.j &= -8193;
        boolean z = this.k0.h;
        gw3 gw3Var = this.k;
        if (z && wo0Var.k() && !wo0Var.h() && !wo0Var.o()) {
            ((l80) gw3Var.h).e(G(wo0Var), wo0Var);
        }
        bw0 bw0Var = (bw0) gw3Var.g;
        l61 l61VarA = (l61) bw0Var.get(wo0Var);
        if (l61VarA == null) {
            l61VarA = l61.a();
            bw0Var.put(wo0Var, l61VarA);
        }
        l61VarA.b = tg0Var;
        l61VarA.a |= 4;
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof io0) {
            io0 io0Var = (io0) layoutParams;
            if (!io0Var.c) {
                Rect rect2 = io0Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.r.l0(this, view, this.n, !this.y, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        e0(0);
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = e61.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void Z(int i, int i2, int[] iArr) {
        wo0 wo0Var;
        c0();
        P();
        int i3 = o21.a;
        Trace.beginSection("RV Scroll");
        to0 to0Var = this.k0;
        z(to0Var);
        no0 no0Var = this.g;
        int iN0 = i != 0 ? this.r.n0(i, no0Var, to0Var) : 0;
        int iP0 = i2 != 0 ? this.r.p0(i2, no0Var, to0Var) : 0;
        Trace.endSection();
        t83 t83Var = this.j;
        int iC = t83Var.C();
        for (int i4 = 0; i4 < iC; i4++) {
            View viewB = t83Var.B(i4);
            wo0 wo0VarH = H(viewB);
            if (wo0VarH != null && (wo0Var = wo0VarH.i) != null) {
                View view = wo0Var.a;
                int left = viewB.getLeft();
                int top = viewB.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = iN0;
            iArr[1] = iP0;
        }
    }

    public final void a0(int i) {
        w60 w60Var;
        if (this.B) {
            return;
        }
        setScrollState(0);
        vo0 vo0Var = this.h0;
        vo0Var.l.removeCallbacks(vo0Var);
        vo0Var.h.abortAnimation();
        ho0 ho0Var = this.r;
        if (ho0Var != null && (w60Var = ho0Var.e) != null) {
            w60Var.i();
        }
        ho0 ho0Var2 = this.r;
        if (ho0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            ho0Var2.o0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ho0 ho0Var = this.r;
        if (ho0Var != null) {
            ho0Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(int i, int i2, boolean z) {
        ho0 ho0Var = this.r;
        if (ho0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!ho0Var.d()) {
            i = 0;
        }
        if (!this.r.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.h0.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void c0() {
        int i = this.z + 1;
        this.z = i;
        if (i != 1 || this.B) {
            return;
        }
        this.A = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof io0) && this.r.f((io0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        ho0 ho0Var = this.r;
        if (ho0Var != null && ho0Var.d()) {
            return this.r.j(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        ho0 ho0Var = this.r;
        if (ho0Var != null && ho0Var.d()) {
            return this.r.k(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        ho0 ho0Var = this.r;
        if (ho0Var != null && ho0Var.d()) {
            return this.r.l(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        ho0 ho0Var = this.r;
        if (ho0Var != null && ho0Var.e()) {
            return this.r.m(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        ho0 ho0Var = this.r;
        if (ho0Var != null && ho0Var.e()) {
            return this.r.n(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        ho0 ho0Var = this.r;
        if (ho0Var != null && ho0Var.e()) {
            return this.r.o(this.k0);
        }
        return 0;
    }

    public final void d0(boolean z) {
        if (this.z < 1) {
            this.z = 1;
        }
        if (!z && !this.B) {
            this.A = false;
        }
        if (this.z == 1) {
            if (z && this.A && !this.B && this.r != null && this.q != null) {
                o();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.z--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((fo0) arrayList.get(i)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.L;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.M;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.N;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.P == null || arrayList.size() <= 0 || !this.P.f()) ? z : true) {
            WeakHashMap weakHashMap = e61.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void f(wo0 wo0Var) {
        View view = wo0Var.a;
        boolean z = view.getParent() == this;
        this.g.k(H(view));
        if (wo0Var.j()) {
            this.j.x(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.j.w(view, -1, true);
            return;
        }
        t83 t83Var = this.j;
        int iIndexOfChild = ((RecyclerView) ((z71) t83Var.g).g).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((ue) t83Var.h).E(iIndexOfChild);
            t83Var.I(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(fo0 fo0Var) {
        ho0 ho0Var = this.r;
        if (ho0Var != null) {
            ho0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(fo0Var);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ho0 ho0Var = this.r;
        if (ho0Var != null) {
            return ho0Var.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ho0 ho0Var = this.r;
        if (ho0Var != null) {
            return ho0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public ao0 getAdapter() {
        return this.q;
    }

    @Override // android.view.View
    public int getBaseline() {
        ho0 ho0Var = this.r;
        if (ho0Var == null) {
            return super.getBaseline();
        }
        ho0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.l;
    }

    public yo0 getCompatAccessibilityDelegate() {
        return this.r0;
    }

    public do0 getEdgeEffectFactory() {
        return this.K;
    }

    public eo0 getItemAnimator() {
        return this.P;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    public ho0 getLayoutManager() {
        return this.r;
    }

    public int getMaxFlingVelocity() {
        return this.d0;
    }

    public int getMinFlingVelocity() {
        return this.c0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public jo0 getOnFlingListener() {
        return this.b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.g0;
    }

    public mo0 getRecycledViewPool() {
        return this.g.c();
    }

    public int getScrollState() {
        return this.Q;
    }

    public final void h(ko0 ko0Var) {
        if (this.m0 == null) {
            this.m0 = new ArrayList();
        }
        this.m0.add(ko0Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.J > 0) {
            new IllegalStateException("" + y());
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int iH = this.j.H();
        for (int i = 0; i < iH; i++) {
            wo0 wo0VarI = I(this.j.G(i));
            if (!wo0VarI.o()) {
                wo0VarI.d = -1;
                wo0VarI.g = -1;
            }
        }
        no0 no0Var = this.g;
        ArrayList arrayList = no0Var.a;
        ArrayList arrayList2 = no0Var.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            wo0 wo0Var = (wo0) arrayList2.get(i2);
            wo0Var.d = -1;
            wo0Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            wo0 wo0Var2 = (wo0) arrayList.get(i3);
            wo0Var2.d = -1;
            wo0Var2.g = -1;
        }
        ArrayList arrayList3 = no0Var.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                wo0 wo0Var3 = (wo0) no0Var.b.get(i4);
                wo0Var3.d = -1;
                wo0Var3.g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.L.onRelease();
            zIsFinished = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.N.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.O.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = e61.a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.y || this.G) {
            int i = o21.a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        fw3 fw3Var = this.i;
        if (fw3Var.j()) {
            int i2 = fw3Var.f;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (fw3Var.j()) {
                    int i3 = o21.a;
                    Trace.beginSection("RV FullInvalidate");
                    o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = o21.a;
            Trace.beginSection("RV PartialInvalidate");
            c0();
            P();
            fw3Var.p();
            if (!this.A) {
                t83 t83Var = this.j;
                int iC = t83Var.C();
                int i5 = 0;
                while (true) {
                    if (i5 < iC) {
                        wo0 wo0VarI = I(t83Var.B(i5));
                        if (wo0VarI != null && !wo0VarI.o() && wo0VarI.k()) {
                            o();
                            break;
                        }
                        i5++;
                    } else {
                        fw3Var.c();
                        break;
                    }
                }
            }
            d0(true);
            Q(true);
            Trace.endSection();
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = e61.a;
        setMeasuredDimension(ho0.g(i, paddingRight, getMinimumWidth()), ho0.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ba  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.I = r0
            r1 = 1
            r5.w = r1
            boolean r2 = r5.y
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.y = r2
            ho0 r2 = r5.r
            if (r2 == 0) goto L21
            r2.g = r1
            r2.R(r5)
        L21:
            r5.q0 = r0
            java.lang.ThreadLocal r0 = defpackage.uy.j
            java.lang.Object r1 = r0.get()
            uy r1 = (defpackage.uy) r1
            r5.i0 = r1
            if (r1 != 0) goto L6b
            uy r1 = new uy
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.i = r2
            r5.i0 = r1
            java.util.WeakHashMap r1 = defpackage.e61.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            uy r2 = r5.i0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.h = r3
            r0.set(r2)
        L6b:
            uy r0 = r5.i0
            java.util.ArrayList r0 = r0.f
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        w60 w60Var;
        super.onDetachedFromWindow();
        eo0 eo0Var = this.P;
        if (eo0Var != null) {
            eo0Var.e();
        }
        setScrollState(0);
        vo0 vo0Var = this.h0;
        vo0Var.l.removeCallbacks(vo0Var);
        vo0Var.h.abortAnimation();
        ho0 ho0Var = this.r;
        if (ho0Var != null && (w60Var = ho0Var.e) != null) {
            w60Var.i();
        }
        this.w = false;
        ho0 ho0Var2 = this.r;
        if (ho0Var2 != null) {
            ho0Var2.g = false;
            ho0Var2.S(this);
        }
        this.x0.clear();
        removeCallbacks(this.y0);
        this.k.getClass();
        while (l61.d.a() != null) {
        }
        uy uyVar = this.i0;
        if (uyVar != null) {
            uyVar.f.remove(this);
            this.i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fo0) arrayList.get(i)).b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.B) {
            this.v = null;
            if (B(motionEvent)) {
                X();
                setScrollState(0);
                return true;
            }
            ho0 ho0Var = this.r;
            if (ho0Var != null) {
                boolean zD = ho0Var.d();
                boolean zE = this.r.e();
                if (this.S == null) {
                    this.S = VelocityTracker.obtain();
                }
                this.S.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.C) {
                        this.C = false;
                    }
                    this.R = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.V = x;
                    this.T = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.W = y;
                    this.U = y;
                    if (this.Q == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        e0(1);
                    }
                    int[] iArr = this.v0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zD;
                    if (zE) {
                        i = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.S.clear();
                    e0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.R);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.Q != 1) {
                        int i2 = x2 - this.T;
                        int i3 = y2 - this.U;
                        if (zD == 0 || Math.abs(i2) <= this.a0) {
                            z = false;
                        } else {
                            this.V = x2;
                            z = true;
                        }
                        if (zE && Math.abs(i3) > this.a0) {
                            this.W = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    X();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.R = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.V = x3;
                    this.T = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.W = y3;
                    this.U = y3;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.Q == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = o21.a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ho0 ho0Var = this.r;
        if (ho0Var == null) {
            n(i, i2);
            return;
        }
        boolean zL = ho0Var.L();
        boolean z = false;
        to0 to0Var = this.k0;
        if (zL) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.r.b.n(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.z0 = z;
            if (z || this.q == null) {
                return;
            }
            if (to0Var.d == 1) {
                p();
            }
            this.r.r0(i, i2);
            to0Var.i = true;
            q();
            this.r.t0(i, i2);
            if (this.r.w0()) {
                this.r.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                to0Var.i = true;
                q();
                this.r.t0(i, i2);
            }
            this.A0 = getMeasuredWidth();
            this.B0 = getMeasuredHeight();
            return;
        }
        if (this.x) {
            this.r.b.n(i, i2);
            return;
        }
        if (this.E) {
            c0();
            P();
            T();
            Q(true);
            if (to0Var.k) {
                to0Var.g = true;
            } else {
                this.i.d();
                to0Var.g = false;
            }
            this.E = false;
            d0(false);
        } else if (to0Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        ao0 ao0Var = this.q;
        if (ao0Var != null) {
            to0Var.e = ao0Var.a();
        } else {
            to0Var.e = 0;
        }
        c0();
        this.r.b.n(i, i2);
        d0(false);
        to0Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qo0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qo0 qo0Var = (qo0) parcelable;
        this.h = qo0Var;
        super.onRestoreInstanceState(qo0Var.f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        qo0 qo0Var = new qo0(super.onSaveInstanceState());
        qo0 qo0Var2 = this.h;
        if (qo0Var2 != null) {
            qo0Var.h = qo0Var2.h;
            return qo0Var;
        }
        ho0 ho0Var = this.r;
        if (ho0Var != null) {
            qo0Var.h = ho0Var.f0();
            return qo0Var;
        }
        qo0Var.h = null;
        return qo0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8 A[PHI: r1
  0x01f8: PHI (r1v53 int) = (r1v38 int), (r1v57 int) binds: [B:90:0x01e1, B:94:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        c0();
        P();
        to0 to0Var = this.k0;
        to0Var.a(6);
        this.i.d();
        to0Var.e = this.q.a();
        to0Var.c = 0;
        if (this.h != null) {
            ao0 ao0Var = this.q;
            int iS = ex0.s(ao0Var.h);
            if (iS == 1 ? ao0Var.a() > 0 : iS != 2) {
                Parcelable parcelable = this.h.h;
                if (parcelable != null) {
                    this.r.e0(parcelable);
                }
                this.h = null;
            }
        }
        to0Var.g = false;
        this.r.c0(this.g, to0Var);
        to0Var.f = false;
        to0Var.j = to0Var.j && this.P != null;
        to0Var.d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        wo0 wo0VarI = I(view);
        if (wo0VarI != null) {
            if (wo0VarI.j()) {
                wo0VarI.j &= -257;
            } else if (!wo0VarI.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + wo0VarI + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        w60 w60Var = this.r.e;
        if ((w60Var == null || !w60Var.e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.r.l0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((iu) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        ho0 ho0Var = this.r;
        if (ho0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean zD = ho0Var.d();
        boolean zE = this.r.e();
        if (zD || zE) {
            if (!zD) {
                i = 0;
            }
            if (!zE) {
                i2 = 0;
            }
            Y(i, i2, null, 0);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(yo0 yo0Var) {
        this.r0 = yo0Var;
        e61.l(this, yo0Var);
    }

    public void setAdapter(ao0 ao0Var) {
        setLayoutFrozen(false);
        ao0 ao0Var2 = this.q;
        po0 po0Var = this.f;
        if (ao0Var2 != null) {
            ao0Var2.f.unregisterObserver(po0Var);
            this.q.getClass();
        }
        eo0 eo0Var = this.P;
        if (eo0Var != null) {
            eo0Var.e();
        }
        ho0 ho0Var = this.r;
        no0 no0Var = this.g;
        if (ho0Var != null) {
            ho0Var.h0(no0Var);
            this.r.i0(no0Var);
        }
        no0Var.a.clear();
        no0Var.e();
        fw3 fw3Var = this.i;
        fw3Var.q((ArrayList) fw3Var.h);
        fw3Var.q((ArrayList) fw3Var.i);
        fw3Var.f = 0;
        ao0 ao0Var3 = this.q;
        this.q = ao0Var;
        if (ao0Var != null) {
            ao0Var.f.registerObserver(po0Var);
        }
        ho0 ho0Var2 = this.r;
        if (ho0Var2 != null) {
            ho0Var2.Q();
        }
        ao0 ao0Var4 = this.q;
        no0Var.a.clear();
        no0Var.e();
        mo0 mo0VarC = no0Var.c();
        if (ao0Var3 != null) {
            mo0VarC.b--;
        }
        if (mo0VarC.b == 0) {
            SparseArray sparseArray = mo0VarC.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((lo0) sparseArray.valueAt(i)).a.clear();
            }
        }
        if (ao0Var4 != null) {
            mo0VarC.b++;
        }
        this.k0.f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(co0 co0Var) {
        if (co0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.l) {
            this.O = null;
            this.M = null;
            this.N = null;
            this.L = null;
        }
        this.l = z;
        super.setClipToPadding(z);
        if (this.y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(do0 do0Var) {
        do0Var.getClass();
        this.K = do0Var;
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    public void setHasFixedSize(boolean z) {
        this.x = z;
    }

    public void setItemAnimator(eo0 eo0Var) {
        eo0 eo0Var2 = this.P;
        if (eo0Var2 != null) {
            eo0Var2.e();
            this.P.a = null;
        }
        this.P = eo0Var;
        if (eo0Var != null) {
            eo0Var.a = this.p0;
        }
    }

    public void setItemViewCacheSize(int i) {
        no0 no0Var = this.g;
        no0Var.e = i;
        no0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(ho0 ho0Var) {
        w60 w60Var;
        if (ho0Var == this.r) {
            return;
        }
        setScrollState(0);
        vo0 vo0Var = this.h0;
        vo0Var.l.removeCallbacks(vo0Var);
        vo0Var.h.abortAnimation();
        ho0 ho0Var2 = this.r;
        if (ho0Var2 != null && (w60Var = ho0Var2.e) != null) {
            w60Var.i();
        }
        ho0 ho0Var3 = this.r;
        no0 no0Var = this.g;
        if (ho0Var3 != null) {
            eo0 eo0Var = this.P;
            if (eo0Var != null) {
                eo0Var.e();
            }
            this.r.h0(no0Var);
            this.r.i0(no0Var);
            no0Var.a.clear();
            no0Var.e();
            if (this.w) {
                ho0 ho0Var4 = this.r;
                ho0Var4.g = false;
                ho0Var4.S(this);
            }
            this.r.u0(null);
            this.r = null;
        } else {
            no0Var.a.clear();
            no0Var.e();
        }
        t83 t83Var = this.j;
        RecyclerView recyclerView = (RecyclerView) ((z71) t83Var.g).g;
        ((ue) t83Var.h).D();
        ArrayList arrayList = (ArrayList) t83Var.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wo0 wo0VarI = I((View) arrayList.get(size));
            if (wo0VarI != null) {
                int i = wo0VarI.p;
                if (recyclerView.L()) {
                    wo0VarI.q = i;
                    recyclerView.x0.add(wo0VarI);
                } else {
                    View view = wo0VarI.a;
                    WeakHashMap weakHashMap = e61.a;
                    view.setImportantForAccessibility(i);
                }
                wo0VarI.p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.r = ho0Var;
        if (ho0Var != null) {
            if (ho0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + ho0Var + " is already attached to a RecyclerView:" + ho0Var.b.y());
            }
            ho0Var.u0(this);
            if (this.w) {
                ho0 ho0Var5 = this.r;
                ho0Var5.g = true;
                ho0Var5.R(this);
            }
        }
        no0Var.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        qg0 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = e61.a;
            t51.z(viewGroup);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(jo0 jo0Var) {
        this.b0 = jo0Var;
    }

    @Deprecated
    public void setOnScrollListener(ko0 ko0Var) {
        this.l0 = ko0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.g0 = z;
    }

    public void setRecycledViewPool(mo0 mo0Var) {
        no0 no0Var = this.g;
        if (no0Var.g != null) {
            r1.b--;
        }
        no0Var.g = mo0Var;
        if (mo0Var == null || no0Var.h.getAdapter() == null) {
            return;
        }
        no0Var.g.b++;
    }

    public void setScrollState(int i) {
        w60 w60Var;
        if (i == this.Q) {
            return;
        }
        this.Q = i;
        if (i != 2) {
            vo0 vo0Var = this.h0;
            vo0Var.l.removeCallbacks(vo0Var);
            vo0Var.h.abortAnimation();
            ho0 ho0Var = this.r;
            if (ho0Var != null && (w60Var = ho0Var.e) != null) {
                w60Var.i();
            }
        }
        ho0 ho0Var2 = this.r;
        if (ho0Var2 != null) {
            ho0Var2.g0(i);
        }
        ko0 ko0Var = this.l0;
        if (ko0Var != null) {
            ko0Var.a(i);
        }
        ArrayList arrayList = this.m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ko0) this.m0.get(size)).a(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.a0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.a0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(uo0 uo0Var) {
        this.g.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        w60 w60Var;
        if (z != this.B) {
            i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.B = false;
                if (this.A && this.r != null && this.q != null) {
                    requestLayout();
                }
                this.A = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.B = true;
            this.C = true;
            setScrollState(0);
            vo0 vo0Var = this.h0;
            vo0Var.l.removeCallbacks(vo0Var);
            vo0Var.h.abortAnimation();
            ho0 ho0Var = this.r;
            if (ho0Var == null || (w60Var = ho0Var.e) == null) {
                return;
            }
            w60Var.i();
        }
    }

    public final void t(int i, int i2) {
        this.J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        ko0 ko0Var = this.l0;
        if (ko0Var != null) {
            ko0Var.b(this, i, i2);
        }
        ArrayList arrayList = this.m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ko0) this.m0.get(size)).b(this, i, i2);
            }
        }
        this.J--;
    }

    public final void u() {
        if (this.O != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.O = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.L != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.N != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.M != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.q + ", layout:" + this.r + ", context:" + getContext();
    }

    public final void z(to0 to0Var) {
        if (getScrollState() != 2) {
            to0Var.getClass();
            return;
        }
        OverScroller overScroller = this.h0.h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        to0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        int i2;
        char c;
        TypedArray typedArray;
        boolean z;
        char c2;
        AttributeSet attributeSet2;
        int i3;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f = new po0(this);
        this.g = new no0(this);
        this.k = new gw3(14);
        this.m = new yn0(this, 0);
        this.n = new Rect();
        this.o = new Rect();
        this.p = new RectF();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.z = 0;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = new do0();
        ln lnVar = new ln();
        Object[] objArr = null;
        lnVar.a = null;
        lnVar.b = new ArrayList();
        lnVar.c = 120L;
        lnVar.d = 120L;
        lnVar.e = 250L;
        lnVar.f = 250L;
        lnVar.g = true;
        lnVar.h = new ArrayList();
        lnVar.i = new ArrayList();
        lnVar.j = new ArrayList();
        lnVar.k = new ArrayList();
        lnVar.l = new ArrayList();
        lnVar.m = new ArrayList();
        lnVar.n = new ArrayList();
        lnVar.o = new ArrayList();
        lnVar.p = new ArrayList();
        lnVar.q = new ArrayList();
        lnVar.r = new ArrayList();
        this.P = lnVar;
        this.Q = 0;
        this.R = -1;
        this.e0 = Float.MIN_VALUE;
        this.f0 = Float.MIN_VALUE;
        this.g0 = true;
        this.h0 = new vo0(this);
        this.j0 = new ef();
        to0 to0Var = new to0();
        to0Var.a = -1;
        to0Var.b = 0;
        to0Var.c = 0;
        to0Var.d = 1;
        to0Var.e = 0;
        to0Var.f = false;
        to0Var.g = false;
        to0Var.h = false;
        to0Var.i = false;
        to0Var.j = false;
        to0Var.k = false;
        this.k0 = to0Var;
        this.n0 = false;
        this.o0 = false;
        f23 f23Var = new f23(7, this);
        this.p0 = f23Var;
        this.q0 = false;
        this.s0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new ArrayList();
        this.y0 = new yn0(this, 1);
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new vg0(6, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.a0 = viewConfiguration.getScaledTouchSlop();
        this.e0 = f61.a(viewConfiguration);
        this.f0 = f61.b(viewConfiguration);
        this.c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.P.a = f23Var;
        this.i = new fw3(new zs1(5, this));
        this.j = new t83(new z71(8, this));
        WeakHashMap weakHashMap = e61.a;
        if (v51.c(this) == 0) {
            v51.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new yo0(this));
        int[] iArr = en0.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        e61.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.l = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            i2 = i;
            typedArray = typedArrayObtainStyledAttributes;
            z = 1;
            i3 = 4;
            c = 3;
            attributeSet2 = attributeSet;
            new iu(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.fastscroll_margin));
        } else {
            i2 = i;
            c = 3;
            typedArray = typedArrayObtainStyledAttributes;
            z = 1;
            c2 = 2;
            attributeSet2 = attributeSet;
            i3 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(ho0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(E0);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = context;
                        objArr2[z] = attributeSet2;
                        objArr2[c2] = Integer.valueOf(i2);
                        objArr2[c] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((ho0) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = D0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        e61.k(this, context, iArr2, attributeSet2, typedArrayObtainStyledAttributes2, i2);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ho0 ho0Var = this.r;
        if (ho0Var != null) {
            return ho0Var.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Deprecated
    public void setRecyclerListener(oo0 oo0Var) {
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }
}
