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
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
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
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.be1;
import j2.l2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements e4.y, e4.o {
    public static boolean C0 = false;
    public static boolean D0 = false;
    public static final int[] E0 = {R.attr.nestedScrollingEnabled};
    public static final float F0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean G0 = true;
    public static final boolean H0 = true;
    public static final Class[] I0;
    public static final q0 J0;
    public static final u1 K0;
    public int A;
    public final r0 A0;
    public boolean B;
    public final e4.i B0;
    public final AccessibilityManager C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public y0 H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public a1 M;
    public int N;
    public int O;
    public VelocityTracker P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public h1 V;
    public final int W;

    /* renamed from: a, reason: collision with root package name */
    public final float f1219a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f1220a0;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f1221b;

    /* renamed from: b0, reason: collision with root package name */
    public final float f1222b0;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f1223c;

    /* renamed from: c0, reason: collision with root package name */
    public final float f1224c0;

    /* renamed from: d, reason: collision with root package name */
    public p1 f1225d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1226d0;

    /* renamed from: e, reason: collision with root package name */
    public final be1 f1227e;

    /* renamed from: e0, reason: collision with root package name */
    public final w1 f1228e0;

    /* renamed from: f, reason: collision with root package name */
    public final e f1229f;

    /* renamed from: f0, reason: collision with root package name */
    public a0 f1230f0;
    public final y4.a g;

    /* renamed from: g0, reason: collision with root package name */
    public final y f1231g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1232h;

    /* renamed from: h0, reason: collision with root package name */
    public final t1 f1233h0;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f1234i;

    /* renamed from: i0, reason: collision with root package name */
    public j1 f1235i0;
    public final Rect j;

    /* renamed from: j0, reason: collision with root package name */
    public ArrayList f1236j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f1237k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1238k0;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1239l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f1240l0;

    /* renamed from: m, reason: collision with root package name */
    public t0 f1241m;

    /* renamed from: m0, reason: collision with root package name */
    public final r0 f1242m0;

    /* renamed from: n, reason: collision with root package name */
    public f1 f1243n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f1244n0;

    /* renamed from: o, reason: collision with root package name */
    public n1 f1245o;

    /* renamed from: o0, reason: collision with root package name */
    public z1 f1246o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1247p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f1248p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1249q;

    /* renamed from: q0, reason: collision with root package name */
    public e4.p f1250q0;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f1251r;

    /* renamed from: r0, reason: collision with root package name */
    public final int[] f1252r0;

    /* renamed from: s, reason: collision with root package name */
    public i1 f1253s;

    /* renamed from: s0, reason: collision with root package name */
    public final int[] f1254s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1255t;

    /* renamed from: t0, reason: collision with root package name */
    public final int[] f1256t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1257u;

    /* renamed from: u0, reason: collision with root package name */
    public final ArrayList f1258u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1259v;

    /* renamed from: v0, reason: collision with root package name */
    public final p0 f1260v0;

    /* renamed from: w, reason: collision with root package name */
    public int f1261w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1262w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1263x;

    /* renamed from: x0, reason: collision with root package name */
    public int f1264x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1265y;

    /* renamed from: y0, reason: collision with root package name */
    public int f1266y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1267z;

    /* renamed from: z0, reason: collision with root package name */
    public final boolean f1268z0;

    static {
        Class cls = Integer.TYPE;
        I0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        J0 = new q0(0);
        K0 = new u1();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.liuzh.deviceinfo.R.attr.recyclerViewStyle);
    }

    public static RecyclerView I(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView recyclerViewI = I(viewGroup.getChildAt(i4));
            if (recyclerViewI != null) {
                return recyclerViewI;
            }
        }
        return null;
    }

    public static int N(View view) {
        x1 x1VarP = P(view);
        if (x1VarP != null) {
            return x1VarP.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static x1 P(View view) {
        if (view == null) {
            return null;
        }
        return ((g1) view.getLayoutParams()).f1374a;
    }

    public static void Q(Rect rect, View view) {
        g1 g1Var = (g1) view.getLayoutParams();
        Rect rect2 = g1Var.f1375b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) g1Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) g1Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) g1Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) g1Var).bottomMargin);
    }

    private e4.p getScrollingChildHelper() {
        if (this.f1250q0 == null) {
            this.f1250q0 = new e4.p(this);
        }
        return this.f1250q0;
    }

    public static void m(x1 x1Var) {
        WeakReference<RecyclerView> weakReference = x1Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == x1Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            x1Var.mNestedRecyclerView = null;
        }
    }

    public static int p(int i4, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i4 > 0 && edgeEffect != null && pd.b.i(edgeEffect) != 0.0f) {
            int iRound = Math.round(pd.b.m(edgeEffect, ((-i4) * 4.0f) / i10, 0.5f) * ((-i10) / 4.0f));
            if (iRound != i4) {
                edgeEffect.finish();
            }
            return i4 - iRound;
        }
        if (i4 >= 0 || edgeEffect2 == null || pd.b.i(edgeEffect2) == 0.0f) {
            return i4;
        }
        float f10 = i10;
        int iRound2 = Math.round(pd.b.m(edgeEffect2, (i4 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i4) {
            edgeEffect2.finish();
        }
        return i4 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z3) {
        C0 = z3;
    }

    public static void setVerboseLoggingEnabled(boolean z3) {
        D0 = z3;
    }

    public final void A() {
        if (this.K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this);
        this.K = edgeEffectA;
        if (this.f1232h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this);
        this.J = edgeEffectA;
        if (this.f1232h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.f1241m + ", layout:" + this.f1243n + ", context:" + getContext();
    }

    public final void D(t1 t1Var) {
        if (getScrollState() != 2) {
            t1Var.getClass();
            return;
        }
        OverScroller overScroller = this.f1228e0.f1523c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        t1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(float f10, float f11) {
        for (int iE = this.f1229f.e() - 1; iE >= 0; iE--) {
            View viewD = this.f1229f.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f10 >= viewD.getLeft() + translationX && f10 <= viewD.getRight() + translationX && f11 >= viewD.getTop() + translationY && f11 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public final View F(View view) {
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

    public final boolean G(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f1251r;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            i1 i1Var = (i1) arrayList.get(i4);
            if (i1Var.a(motionEvent) && action != 3) {
                this.f1253s = i1Var;
                return true;
            }
        }
        return false;
    }

    public final void H(int[] iArr) {
        int iE = this.f1229f.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i10 = LinearLayoutManager.INVALID_OFFSET;
        for (int i11 = 0; i11 < iE; i11++) {
            x1 x1VarP = P(this.f1229f.d(i11));
            if (!x1VarP.shouldIgnore()) {
                int layoutPosition = x1VarP.getLayoutPosition();
                if (layoutPosition < i4) {
                    i4 = layoutPosition;
                }
                if (layoutPosition > i10) {
                    i10 = layoutPosition;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i10;
    }

    public final x1 J(int i4) {
        x1 x1Var = null;
        if (this.D) {
            return null;
        }
        int iH = this.f1229f.h();
        for (int i10 = 0; i10 < iH; i10++) {
            x1 x1VarP = P(this.f1229f.g(i10));
            if (x1VarP != null && !x1VarP.isRemoved() && L(x1VarP) == i4) {
                if (!this.f1229f.f1330c.contains(x1VarP.itemView)) {
                    return x1VarP;
                }
                x1Var = x1VarP;
            }
        }
        return x1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K(int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.K(int, int, int, int):boolean");
    }

    public final int L(x1 x1Var) {
        if (x1Var.hasAnyOfTheFlags(524) || !x1Var.isBound()) {
            return -1;
        }
        int i4 = x1Var.mPosition;
        ArrayList arrayList = (ArrayList) this.f1227e.f9659c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f1289a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = aVar.f1290b;
                    if (i12 <= i4) {
                        int i13 = aVar.f1292d;
                        if (i12 + i13 > i4) {
                            return -1;
                        }
                        i4 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = aVar.f1290b;
                    if (i14 == i4) {
                        i4 = aVar.f1292d;
                    } else {
                        if (i14 < i4) {
                            i4--;
                        }
                        if (aVar.f1292d <= i4) {
                            i4++;
                        }
                    }
                }
            } else if (aVar.f1290b <= i4) {
                i4 += aVar.f1292d;
            }
        }
        return i4;
    }

    public final long M(x1 x1Var) {
        return this.f1241m.hasStableIds() ? x1Var.getItemId() : x1Var.mPosition;
    }

    public final x1 O(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return P(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect R(View view) {
        g1 g1Var = (g1) view.getLayoutParams();
        boolean z3 = g1Var.f1376c;
        Rect rect = g1Var.f1375b;
        if (z3) {
            t1 t1Var = this.f1233h0;
            if (!t1Var.g || (!g1Var.f1374a.isUpdated() && !g1Var.f1374a.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f1249q;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Rect rect2 = this.j;
                    rect2.set(0, 0, 0, 0);
                    ((b1) arrayList.get(i4)).getItemOffsets(rect2, view, this, t1Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                g1Var.f1376c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean S() {
        return !this.f1259v || this.D || this.f1227e.w();
    }

    public final boolean T() {
        return this.F > 0;
    }

    public final void U(int i4) {
        if (this.f1243n == null) {
            return;
        }
        setScrollState(2);
        this.f1243n.scrollToPosition(i4);
        awakenScrollBars();
    }

    public final void V() {
        int iH = this.f1229f.h();
        for (int i4 = 0; i4 < iH; i4++) {
            ((g1) this.f1229f.g(i4).getLayoutParams()).f1376c = true;
        }
        ArrayList arrayList = this.f1223c.f1457c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            g1 g1Var = (g1) ((x1) arrayList.get(i10)).itemView.getLayoutParams();
            if (g1Var != null) {
                g1Var.f1376c = true;
            }
        }
    }

    public final void W(int i4, int i10, boolean z3) {
        int i11 = i4 + i10;
        int iH = this.f1229f.h();
        for (int i12 = 0; i12 < iH; i12++) {
            x1 x1VarP = P(this.f1229f.g(i12));
            if (x1VarP != null && !x1VarP.shouldIgnore()) {
                int i13 = x1VarP.mPosition;
                t1 t1Var = this.f1233h0;
                if (i13 >= i11) {
                    if (D0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + x1VarP + " now at position " + (x1VarP.mPosition - i10));
                    }
                    x1VarP.offsetPosition(-i10, z3);
                    t1Var.f1508f = true;
                } else if (i13 >= i4) {
                    if (D0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + x1VarP + " now REMOVED");
                    }
                    x1VarP.flagRemovedAndOffsetPosition(i4 - 1, -i10, z3);
                    t1Var.f1508f = true;
                }
            }
        }
        m1 m1Var = this.f1223c;
        ArrayList arrayList = m1Var.f1457c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x1 x1Var = (x1) arrayList.get(size);
            if (x1Var != null) {
                int i14 = x1Var.mPosition;
                if (i14 >= i11) {
                    if (D0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + x1Var + " now at position " + (x1Var.mPosition - i10));
                    }
                    x1Var.offsetPosition(-i10, z3);
                } else if (i14 >= i4) {
                    x1Var.addFlags(8);
                    m1Var.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void X() {
        this.F++;
    }

    public final void Y(boolean z3) {
        int i4;
        AccessibilityManager accessibilityManager;
        int i10 = this.F - 1;
        this.F = i10;
        if (i10 < 1) {
            if (C0 && i10 < 0) {
                throw new IllegalStateException(a0.g.k(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.F = 0;
            if (z3) {
                int i11 = this.A;
                this.A = 0;
                if (i11 != 0 && (accessibilityManager = this.C) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i11);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f1258u0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    x1 x1Var = (x1) arrayList.get(size);
                    if (x1Var.itemView.getParent() == this && !x1Var.shouldIgnore() && (i4 = x1Var.mPendingAccessibilityState) != -1) {
                        x1Var.itemView.setImportantForAccessibility(i4);
                        x1Var.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void Z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getPointerId(i4);
            int x10 = (int) (motionEvent.getX(i4) + 0.5f);
            this.S = x10;
            this.Q = x10;
            int y10 = (int) (motionEvent.getY(i4) + 0.5f);
            this.T = y10;
            this.R = y10;
        }
    }

    public final void a0() {
        if (this.f1244n0 || !this.f1255t) {
            return;
        }
        WeakHashMap weakHashMap = e4.v0.f22405a;
        postOnAnimation(this.f1260v0);
        this.f1244n0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i10) {
        f1 f1Var = this.f1243n;
        if (f1Var == null || !f1Var.onAddFocusables(this, arrayList, i4, i10)) {
            super.addFocusables(arrayList, i4, i10);
        }
    }

    public final void b0() {
        boolean z3;
        boolean z10 = false;
        if (this.D) {
            be1 be1Var = this.f1227e;
            be1Var.D((ArrayList) be1Var.f9659c);
            be1Var.D((ArrayList) be1Var.f9660d);
            be1Var.f9657a = 0;
            if (this.E) {
                this.f1243n.onItemsChanged(this);
            }
        }
        if (this.M == null || !this.f1243n.supportsPredictiveItemAnimations()) {
            this.f1227e.e();
        } else {
            this.f1227e.C();
        }
        boolean z11 = this.f1238k0 || this.f1240l0;
        boolean z12 = this.f1259v && this.M != null && ((z3 = this.D) || z11 || this.f1243n.mRequestedSimpleAnimations) && (!z3 || this.f1241m.hasStableIds());
        t1 t1Var = this.f1233h0;
        t1Var.j = z12;
        if (z12 && z11 && !this.D && this.M != null && this.f1243n.supportsPredictiveItemAnimations()) {
            z10 = true;
        }
        t1Var.f1511k = z10;
    }

    public final void c0(boolean z3) {
        this.E = z3 | this.E;
        this.D = true;
        int iH = this.f1229f.h();
        for (int i4 = 0; i4 < iH; i4++) {
            x1 x1VarP = P(this.f1229f.g(i4));
            if (x1VarP != null && !x1VarP.shouldIgnore()) {
                x1VarP.addFlags(6);
            }
        }
        V();
        m1 m1Var = this.f1223c;
        ArrayList arrayList = m1Var.f1457c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x1 x1Var = (x1) arrayList.get(i10);
            if (x1Var != null) {
                x1Var.addFlags(6);
                x1Var.addChangePayload(null);
            }
        }
        t0 t0Var = m1Var.f1461h.f1241m;
        if (t0Var == null || !t0Var.hasStableIds()) {
            m1Var.g();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g1) && this.f1243n.checkLayoutParams((g1) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        f1 f1Var = this.f1243n;
        if (f1Var != null && f1Var.canScrollHorizontally()) {
            return this.f1243n.computeHorizontalScrollExtent(this.f1233h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        f1 f1Var = this.f1243n;
        if (f1Var != null && f1Var.canScrollHorizontally()) {
            return this.f1243n.computeHorizontalScrollOffset(this.f1233h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        f1 f1Var = this.f1243n;
        if (f1Var != null && f1Var.canScrollHorizontally()) {
            return this.f1243n.computeHorizontalScrollRange(this.f1233h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        f1 f1Var = this.f1243n;
        if (f1Var != null && f1Var.canScrollVertically()) {
            return this.f1243n.computeVerticalScrollExtent(this.f1233h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        f1 f1Var = this.f1243n;
        if (f1Var != null && f1Var.canScrollVertically()) {
            return this.f1243n.computeVerticalScrollOffset(this.f1233h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        f1 f1Var = this.f1243n;
        if (f1Var != null && f1Var.canScrollVertically()) {
            return this.f1243n.computeVerticalScrollRange(this.f1233h0);
        }
        return 0;
    }

    public final void d0(x1 x1Var, z0 z0Var) {
        x1Var.setFlags(0, Segment.SIZE);
        boolean z3 = this.f1233h0.f1509h;
        y4.a aVar = this.g;
        if (z3 && x1Var.isUpdated() && !x1Var.isRemoved() && !x1Var.shouldIgnore()) {
            ((x.o) aVar.f37324b).i(x1Var, M(x1Var));
        }
        x.n0 n0Var = (x.n0) aVar.f37323a;
        k2 k2VarA = (k2) n0Var.get(x1Var);
        if (k2VarA == null) {
            k2VarA = k2.a();
            n0Var.put(x1Var, k2VarA);
        }
        k2VarA.f1433b = z0Var;
        k2VarA.f1432a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        f1 layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager != null) {
            if (layoutManager.canScrollVertically()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m0(0, measuredHeight, false);
                        return true;
                    }
                    m0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zIsLayoutReversed = layoutManager.isLayoutReversed();
                    if (keyCode == 122) {
                        if (zIsLayoutReversed) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zIsLayoutReversed) {
                        itemCount = getAdapter().getItemCount();
                    }
                    n0(itemCount);
                    return true;
                }
            } else if (layoutManager.canScrollHorizontally()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m0(measuredWidth, 0, false);
                        return true;
                    }
                    m0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zIsLayoutReversed2 = layoutManager.isLayoutReversed();
                    if (keyCode2 == 122) {
                        if (zIsLayoutReversed2) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zIsLayoutReversed2) {
                        itemCount = getAdapter().getItemCount();
                    }
                    n0(itemCount);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z3) {
        return getScrollingChildHelper().a(f10, f11, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i4, i10, i11, i12, iArr, 0, null);
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
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.f1249q;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ((b1) arrayList.get(i4)).onDrawOver(canvas, this, this.f1233h0);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1232h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1232h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1232h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.K;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1232h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z3 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z3 || this.M == null || arrayList.size() <= 0 || !this.M.f()) ? z3 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.I.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final int f0(int i4, float f10) {
        float height = f10 / getHeight();
        float width = i4 / getWidth();
        EdgeEffect edgeEffect = this.I;
        float f11 = 0.0f;
        if (edgeEffect == null || pd.b.i(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.K;
            if (edgeEffect2 != null && pd.b.i(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.K.onRelease();
                } else {
                    float fM = pd.b.m(this.K, width, height);
                    if (pd.b.i(this.K) == 0.0f) {
                        this.K.onRelease();
                    }
                    f11 = fM;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.I.onRelease();
            } else {
                float f12 = -pd.b.m(this.I, -width, 1.0f - height);
                if (pd.b.i(this.I) == 0.0f) {
                    this.I.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0 A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final int g0(int i4, float f10) {
        float width = f10 / getWidth();
        float height = i4 / getHeight();
        EdgeEffect edgeEffect = this.J;
        float f11 = 0.0f;
        if (edgeEffect == null || pd.b.i(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && pd.b.i(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.L.onRelease();
                } else {
                    float fM = pd.b.m(this.L, height, 1.0f - width);
                    if (pd.b.i(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f11 = fM;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.J.onRelease();
            } else {
                float f12 = -pd.b.m(this.J, -height, width);
                if (pd.b.i(this.J) == 0.0f) {
                    this.J.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f1 f1Var = this.f1243n;
        if (f1Var != null) {
            return f1Var.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(a0.g.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        f1 f1Var = this.f1243n;
        if (f1Var != null) {
            return f1Var.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(a0.g.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public t0 getAdapter() {
        return this.f1241m;
    }

    @Override // android.view.View
    public int getBaseline() {
        f1 f1Var = this.f1243n;
        return f1Var != null ? f1Var.getBaseline() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i10) {
        return super.getChildDrawingOrder(i4, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1232h;
    }

    public z1 getCompatAccessibilityDelegate() {
        return this.f1246o0;
    }

    public y0 getEdgeEffectFactory() {
        return this.H;
    }

    public a1 getItemAnimator() {
        return this.M;
    }

    public int getItemDecorationCount() {
        return this.f1249q.size();
    }

    public f1 getLayoutManager() {
        return this.f1243n;
    }

    public int getMaxFlingVelocity() {
        return this.f1220a0;
    }

    public int getMinFlingVelocity() {
        return this.W;
    }

    public long getNanoTime() {
        if (H0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public h1 getOnFlingListener() {
        return this.V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1226d0;
    }

    public l1 getRecycledViewPool() {
        return this.f1223c.c();
    }

    public int getScrollState() {
        return this.N;
    }

    public final void h(x1 x1Var) {
        View view = x1Var.itemView;
        boolean z3 = view.getParent() == this;
        this.f1223c.m(O(view));
        if (x1Var.isTmpDetached()) {
            this.f1229f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z3) {
            this.f1229f.a(view, -1, true);
            return;
        }
        e eVar = this.f1229f;
        int iIndexOfChild = eVar.f1328a.f1497a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            eVar.f1329b.s(iIndexOfChild);
            eVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof g1) {
            g1 g1Var = (g1) layoutParams;
            if (!g1Var.f1376c) {
                Rect rect2 = g1Var.f1375b;
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
        this.f1243n.requestChildRectangleOnScreen(this, view, this.j, !this.f1259v, view2 == null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(b1 b1Var) {
        f1 f1Var = this.f1243n;
        if (f1Var != null) {
            f1Var.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1249q;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(b1Var);
        V();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1255t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1265y;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f22383d;
    }

    public final void j(j1 j1Var) {
        if (this.f1236j0 == null) {
            this.f1236j0 = new ArrayList();
        }
        this.f1236j0.add(j1Var);
    }

    public final void j0(int[] iArr, int i4, int i10) {
        x1 x1Var;
        o0();
        X();
        Trace.beginSection("RV Scroll");
        t1 t1Var = this.f1233h0;
        D(t1Var);
        m1 m1Var = this.f1223c;
        int iScrollHorizontallyBy = i4 != 0 ? this.f1243n.scrollHorizontallyBy(i4, m1Var, t1Var) : 0;
        int iScrollVerticallyBy = i10 != 0 ? this.f1243n.scrollVerticallyBy(i10, m1Var, t1Var) : 0;
        Trace.endSection();
        int iE = this.f1229f.e();
        for (int i11 = 0; i11 < iE; i11++) {
            View viewD = this.f1229f.d(i11);
            x1 x1VarO = O(viewD);
            if (x1VarO != null && (x1Var = x1VarO.mShadowingHolder) != null) {
                View view = x1Var.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Y(true);
        q0(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public final void k(n1 n1Var) {
        this.f1247p.add(n1Var);
    }

    public final void k0(int i4) {
        if (this.f1265y) {
            return;
        }
        s0();
        f1 f1Var = this.f1243n;
        if (f1Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            f1Var.scrollToPosition(i4);
            awakenScrollBars();
        }
    }

    public final void l(String str) {
        if (T()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(a0.g.k(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a0.g.k(this, new StringBuilder(""))));
        }
    }

    public final boolean l0(EdgeEffect edgeEffect, int i4, int i10) {
        if (i4 > 0) {
            return true;
        }
        float fI = pd.b.i(edgeEffect) * i10;
        float fAbs = Math.abs(-i4) * 0.35f;
        float f10 = this.f1219a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = F0;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fI;
    }

    public final void m0(int i4, int i10, boolean z3) {
        f1 f1Var = this.f1243n;
        if (f1Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1265y) {
            return;
        }
        if (!f1Var.canScrollHorizontally()) {
            i4 = 0;
        }
        if (!this.f1243n.canScrollVertically()) {
            i10 = 0;
        }
        if (i4 == 0 && i10 == 0) {
            return;
        }
        if (z3) {
            int i11 = i4 != 0 ? 1 : 0;
            if (i10 != 0) {
                i11 |= 2;
            }
            getScrollingChildHelper().g(i11, 1);
        }
        this.f1228e0.c(i4, i10, LinearLayoutManager.INVALID_OFFSET, null);
    }

    public final void n() {
        int iH = this.f1229f.h();
        for (int i4 = 0; i4 < iH; i4++) {
            x1 x1VarP = P(this.f1229f.g(i4));
            if (!x1VarP.shouldIgnore()) {
                x1VarP.clearOldPosition();
            }
        }
        m1 m1Var = this.f1223c;
        ArrayList arrayList = m1Var.f1455a;
        ArrayList arrayList2 = m1Var.f1457c;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((x1) arrayList2.get(i10)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((x1) arrayList.get(i11)).clearOldPosition();
        }
        ArrayList arrayList3 = m1Var.f1456b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((x1) m1Var.f1456b.get(i12)).clearOldPosition();
            }
        }
    }

    public final void n0(int i4) {
        if (this.f1265y) {
            return;
        }
        f1 f1Var = this.f1243n;
        if (f1Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            f1Var.smoothScrollToPosition(this, this.f1233h0, i4);
        }
    }

    public final void o(int i4, int i10) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            zIsFinished = false;
        } else {
            this.I.onRelease();
            zIsFinished = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.J.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void o0() {
        int i4 = this.f1261w + 1;
        this.f1261w = i4;
        if (i4 != 1 || this.f1265y) {
            return;
        }
        this.f1263x = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
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
            r5.F = r0
            r1 = 1
            r5.f1255t = r1
            boolean r2 = r5.f1259v
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f1259v = r1
            androidx.recyclerview.widget.m1 r1 = r5.f1223c
            r1.e()
            androidx.recyclerview.widget.f1 r1 = r5.f1243n
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.f1244n0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.H0
            if (r0 == 0) goto L7d
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.a0.f1293e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.a0 r1 = (androidx.recyclerview.widget.a0) r1
            r5.f1230f0 = r1
            if (r1 != 0) goto L63
            androidx.recyclerview.widget.a0 r1 = new androidx.recyclerview.widget.a0
            r1.<init>()
            r5.f1230f0 = r1
            java.util.WeakHashMap r1 = e4.v0.f22405a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            androidx.recyclerview.widget.a0 r2 = r5.f1230f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f1297c = r3
            r0.set(r2)
        L63:
            androidx.recyclerview.widget.a0 r0 = r5.f1230f0
            java.util.ArrayList r0 = r0.f1295a
            boolean r1 = androidx.recyclerview.widget.RecyclerView.C0
            if (r1 == 0) goto L7a
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L72
            goto L7a
        L72:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L7a:
            r0.add(r5)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a0 a0Var;
        super.onDetachedFromWindow();
        a1 a1Var = this.M;
        if (a1Var != null) {
            a1Var.e();
        }
        s0();
        int i4 = 0;
        this.f1255t = false;
        f1 f1Var = this.f1243n;
        m1 m1Var = this.f1223c;
        if (f1Var != null) {
            f1Var.dispatchDetachedFromWindow(this, m1Var);
        }
        this.f1258u0.clear();
        removeCallbacks(this.f1260v0);
        this.g.getClass();
        while (k2.f1431d.k() != null) {
        }
        ArrayList arrayList = m1Var.f1457c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            pd.b.d(((x1) arrayList.get(i10)).itemView);
        }
        m1Var.f(m1Var.f1461h.f1241m, false);
        while (i4 < getChildCount()) {
            int i11 = i4 + 1;
            View childAt = getChildAt(i4);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = pd.b.k(childAt).f28588a;
            for (int iR = cm.g.r(arrayList2); -1 < iR; iR--) {
                j2.a aVar = ((j2.v1) arrayList2.get(iR)).f27330a;
                l2 l2Var = aVar.f27062c;
                if (l2Var != null) {
                    l2Var.a();
                }
                aVar.f27062c = null;
                aVar.requestLayout();
            }
            i4 = i11;
        }
        if (!H0 || (a0Var = this.f1230f0) == null) {
            return;
        }
        boolean zRemove = a0Var.f1295a.remove(this);
        if (C0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1230f0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1249q;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((b1) arrayList.get(i4)).onDraw(canvas, this, this.f1233h0);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i4;
        boolean z3;
        if (this.f1243n != null && !this.f1265y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f10 = this.f1243n.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f1243n.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                i4 = 0;
                z3 = false;
                f = f10;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f1243n.canScrollVertically()) {
                    float f11 = -axisValue;
                    axisValue = 0.0f;
                    f = f11;
                } else if (!this.f1243n.canScrollHorizontally()) {
                    axisValue = 0.0f;
                }
                i4 = 26;
                z3 = this.f1268z0;
            } else {
                axisValue = 0.0f;
                i4 = 0;
                z3 = false;
            }
            int i10 = (int) (f * this.f1224c0);
            int i11 = (int) (axisValue * this.f1222b0);
            if (z3) {
                OverScroller overScroller = this.f1228e0.f1523c;
                m0((overScroller.getFinalX() - overScroller.getCurrX()) + i11, (overScroller.getFinalY() - overScroller.getCurrY()) + i10, true);
            } else {
                f1 f1Var = this.f1243n;
                if (f1Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f1265y) {
                    int[] iArr = this.f1256t0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zCanScrollHorizontally = f1Var.canScrollHorizontally();
                    boolean zCanScrollVertically = this.f1243n.canScrollVertically();
                    int i12 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
                    float y10 = motionEvent.getY();
                    float x10 = motionEvent.getX();
                    int iF0 = i11 - f0(i11, y10);
                    int iG0 = i10 - g0(i10, x10);
                    getScrollingChildHelper().g(i12, 1);
                    if (v(zCanScrollHorizontally ? iF0 : 0, zCanScrollVertically ? iG0 : 0, 1, this.f1256t0, this.f1252r0)) {
                        iF0 -= iArr[0];
                        iG0 -= iArr[1];
                    }
                    i0(zCanScrollHorizontally ? iF0 : 0, zCanScrollVertically ? iG0 : 0, motionEvent, 1);
                    a0 a0Var = this.f1230f0;
                    if (a0Var != null && (iF0 != 0 || iG0 != 0)) {
                        a0Var.a(this, iF0, iG0);
                    }
                    r0(1);
                }
            }
            if (i4 != 0 && !z3) {
                this.B0.a(motionEvent, i4);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z10;
        if (!this.f1265y) {
            this.f1253s = null;
            if (G(motionEvent)) {
                VelocityTracker velocityTracker = this.P;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                r0(0);
                e0();
                setScrollState(0);
                return true;
            }
            f1 f1Var = this.f1243n;
            if (f1Var != null) {
                boolean zCanScrollHorizontally = f1Var.canScrollHorizontally();
                boolean zCanScrollVertically = this.f1243n.canScrollVertically();
                if (this.P == null) {
                    this.P = VelocityTracker.obtain();
                }
                this.P.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f1267z) {
                        this.f1267z = false;
                    }
                    this.O = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.S = x10;
                    this.Q = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.T = y10;
                    this.R = y10;
                    EdgeEffect edgeEffect = this.I;
                    if (edgeEffect == null || pd.b.i(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z3 = false;
                    } else {
                        pd.b.m(this.I, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z3 = true;
                    }
                    EdgeEffect edgeEffect2 = this.K;
                    if (edgeEffect2 != null && pd.b.i(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        pd.b.m(this.K, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                    EdgeEffect edgeEffect3 = this.J;
                    if (edgeEffect3 != null && pd.b.i(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        pd.b.m(this.J, 0.0f, motionEvent.getX() / getWidth());
                        z3 = true;
                    }
                    EdgeEffect edgeEffect4 = this.L;
                    if (edgeEffect4 != null && pd.b.i(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        pd.b.m(this.L, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z3 = true;
                    }
                    if (z3 || this.N == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        r0(1);
                    }
                    int[] iArr = this.f1254s0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    p0(0);
                } else if (actionMasked == 1) {
                    this.P.clear();
                    r0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.O);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.N != 1) {
                        int i4 = x11 - this.Q;
                        int i10 = y11 - this.R;
                        if (!zCanScrollHorizontally || Math.abs(i4) <= this.U) {
                            z10 = false;
                        } else {
                            this.S = x11;
                            z10 = true;
                        }
                        if (zCanScrollVertically && Math.abs(i10) > this.U) {
                            this.T = y11;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.P;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    r0(0);
                    e0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.O = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.S = x12;
                    this.Q = x12;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.T = y12;
                    this.R = y12;
                } else if (actionMasked == 6) {
                    Z(motionEvent);
                }
                if (this.N == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.f1259v = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        f1 f1Var = this.f1243n;
        if (f1Var == null) {
            r(i4, i10);
            return;
        }
        boolean zIsAutoMeasureEnabled = f1Var.isAutoMeasureEnabled();
        m1 m1Var = this.f1223c;
        boolean z3 = false;
        t1 t1Var = this.f1233h0;
        if (zIsAutoMeasureEnabled) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.f1243n.onMeasure(m1Var, t1Var, i4, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z3 = true;
            }
            this.f1262w0 = z3;
            if (z3 || this.f1241m == null) {
                return;
            }
            if (t1Var.f1506d == 1) {
                t();
            }
            this.f1243n.setMeasureSpecs(i4, i10);
            t1Var.f1510i = true;
            u();
            this.f1243n.setMeasuredDimensionFromChildren(i4, i10);
            if (this.f1243n.shouldMeasureTwice()) {
                this.f1243n.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                t1Var.f1510i = true;
                u();
                this.f1243n.setMeasuredDimensionFromChildren(i4, i10);
            }
            this.f1264x0 = getMeasuredWidth();
            this.f1266y0 = getMeasuredHeight();
            return;
        }
        if (this.f1257u) {
            this.f1243n.onMeasure(m1Var, t1Var, i4, i10);
            return;
        }
        if (this.B) {
            o0();
            X();
            b0();
            Y(true);
            if (t1Var.f1511k) {
                t1Var.g = true;
            } else {
                this.f1227e.e();
                t1Var.g = false;
            }
            this.B = false;
            q0(false);
        } else if (t1Var.f1511k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        t0 t0Var = this.f1241m;
        if (t0Var != null) {
            t1Var.f1507e = t0Var.getItemCount();
        } else {
            t1Var.f1507e = 0;
        }
        o0();
        this.f1243n.onMeasure(m1Var, t1Var, i4, i10);
        q0(false);
        t1Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (T()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p1 p1Var = (p1) parcelable;
        this.f1225d = p1Var;
        super.onRestoreInstanceState(p1Var.f28876a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p1 p1Var = new p1(super.onSaveInstanceState());
        p1 p1Var2 = this.f1225d;
        if (p1Var2 != null) {
            p1Var.f1480c = p1Var2.f1480c;
            return p1Var;
        }
        f1 f1Var = this.f1243n;
        if (f1Var != null) {
            p1Var.f1480c = f1Var.onSaveInstanceState();
            return p1Var;
        }
        p1Var.f1480c = null;
        return p1Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        if (i4 == i11 && i10 == i12) {
            return;
        }
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0111 A[PHI: r1
  0x0111: PHI (r1v47 int) = (r1v31 int), (r1v51 int) binds: [B:56:0x00fa, B:60:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(int i4) {
        boolean zCanScrollHorizontally = this.f1243n.canScrollHorizontally();
        int i10 = zCanScrollHorizontally;
        if (this.f1243n.canScrollVertically()) {
            i10 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i10, i4);
    }

    public final void q() {
        if (!this.f1259v || this.D) {
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        if (this.f1227e.w()) {
            be1 be1Var = this.f1227e;
            int i4 = be1Var.f9657a;
            if ((i4 & 4) == 0 || (i4 & 11) != 0) {
                if (be1Var.w()) {
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            o0();
            X();
            this.f1227e.C();
            if (!this.f1263x) {
                int iE = this.f1229f.e();
                int i10 = 0;
                while (true) {
                    if (i10 < iE) {
                        x1 x1VarP = P(this.f1229f.d(i10));
                        if (x1VarP != null && !x1VarP.shouldIgnore() && x1VarP.isUpdated()) {
                            s();
                            break;
                        }
                        i10++;
                    } else {
                        this.f1227e.d();
                        break;
                    }
                }
            }
            q0(true);
            Y(true);
            Trace.endSection();
        }
    }

    public final void q0(boolean z3) {
        if (this.f1261w < 1) {
            if (C0) {
                throw new IllegalStateException(a0.g.k(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f1261w = 1;
        }
        if (!z3 && !this.f1265y) {
            this.f1263x = false;
        }
        if (this.f1261w == 1) {
            if (z3 && this.f1263x && !this.f1265y && this.f1243n != null && this.f1241m != null) {
                s();
            }
            if (!this.f1265y) {
                this.f1263x = false;
            }
        }
        this.f1261w--;
    }

    public final void r(int i4, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = e4.v0.f22405a;
        setMeasuredDimension(f1.chooseSize(i4, paddingRight, getMinimumWidth()), f1.chooseSize(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r0(int i4) {
        getScrollingChildHelper().h(i4);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        x1 x1VarP = P(view);
        if (x1VarP != null) {
            if (x1VarP.isTmpDetached()) {
                x1VarP.clearTmpDetachFlag();
            } else if (!x1VarP.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(x1VarP);
                throw new IllegalArgumentException(a0.g.k(this, sb2));
            }
        } else if (C0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(a0.g.k(this, sb3));
        }
        view.clearAnimation();
        x1 x1VarP2 = P(view);
        t0 t0Var = this.f1241m;
        if (t0Var != null && x1VarP2 != null) {
            t0Var.onViewDetachedFromWindow(x1VarP2);
        }
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f1243n.onRequestChildFocus(this, this.f1233h0, view, view2) && view2 != null) {
            h0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f1243n.requestChildRectangleOnScreen(this, view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f1251r;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((i1) arrayList.get(i4)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1261w != 0 || this.f1265y) {
            this.f1263x = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03bb  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    public final void s0() {
        setScrollState(0);
        w1 w1Var = this.f1228e0;
        w1Var.g.removeCallbacks(w1Var);
        w1Var.f1523c.abortAnimation();
        f1 f1Var = this.f1243n;
        if (f1Var != null) {
            f1Var.stopSmoothScroller();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i10) {
        f1 f1Var = this.f1243n;
        if (f1Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1265y) {
            return;
        }
        boolean zCanScrollHorizontally = f1Var.canScrollHorizontally();
        boolean zCanScrollVertically = this.f1243n.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i4 = 0;
            }
            if (!zCanScrollVertically) {
                i10 = 0;
            }
            i0(i4, i10, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!T()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.A |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(z1 z1Var) {
        this.f1246o0 = z1Var;
        e4.v0.o(this, z1Var);
    }

    public void setAdapter(t0 t0Var) {
        setLayoutFrozen(false);
        t0 t0Var2 = this.f1241m;
        o1 o1Var = this.f1221b;
        if (t0Var2 != null) {
            t0Var2.unregisterAdapterDataObserver(o1Var);
            this.f1241m.onDetachedFromRecyclerView(this);
        }
        a1 a1Var = this.M;
        if (a1Var != null) {
            a1Var.e();
        }
        f1 f1Var = this.f1243n;
        m1 m1Var = this.f1223c;
        if (f1Var != null) {
            f1Var.removeAndRecycleAllViews(m1Var);
            this.f1243n.removeAndRecycleScrapInt(m1Var);
        }
        m1Var.f1455a.clear();
        m1Var.g();
        be1 be1Var = this.f1227e;
        be1Var.D((ArrayList) be1Var.f9659c);
        be1Var.D((ArrayList) be1Var.f9660d);
        be1Var.f9657a = 0;
        t0 t0Var3 = this.f1241m;
        this.f1241m = t0Var;
        if (t0Var != null) {
            t0Var.registerAdapterDataObserver(o1Var);
            t0Var.onAttachedToRecyclerView(this);
        }
        f1 f1Var2 = this.f1243n;
        if (f1Var2 != null) {
            f1Var2.onAdapterChanged(t0Var3, this.f1241m);
        }
        t0 t0Var4 = this.f1241m;
        m1Var.f1455a.clear();
        m1Var.g();
        m1Var.f(t0Var3, true);
        l1 l1VarC = m1Var.c();
        if (t0Var3 != null) {
            l1VarC.f1448b--;
        }
        if (l1VarC.f1448b == 0) {
            SparseArray sparseArray = l1VarC.f1447a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                k1 k1Var = (k1) sparseArray.valueAt(i4);
                ArrayList arrayList = k1Var.f1427a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    pd.b.d(((x1) obj).itemView);
                }
                k1Var.f1427a.clear();
            }
        }
        if (t0Var4 != null) {
            l1VarC.f1448b++;
        }
        m1Var.e();
        this.f1233h0.f1508f = true;
        c0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(x0 x0Var) {
        if (x0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f1232h) {
            this.L = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
        this.f1232h = z3;
        super.setClipToPadding(z3);
        if (this.f1259v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(y0 y0Var) {
        y0Var.getClass();
        this.H = y0Var;
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f1257u = z3;
    }

    public void setItemAnimator(a1 a1Var) {
        a1 a1Var2 = this.M;
        if (a1Var2 != null) {
            a1Var2.e();
            this.M.f1299a = null;
        }
        this.M = a1Var;
        if (a1Var != null) {
            a1Var.f1299a = this.f1242m0;
        }
    }

    public void setItemViewCacheSize(int i4) {
        m1 m1Var = this.f1223c;
        m1Var.f1459e = i4;
        m1Var.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(f1 f1Var) {
        if (f1Var == this.f1243n) {
            return;
        }
        s0();
        f1 f1Var2 = this.f1243n;
        m1 m1Var = this.f1223c;
        if (f1Var2 != null) {
            a1 a1Var = this.M;
            if (a1Var != null) {
                a1Var.e();
            }
            this.f1243n.removeAndRecycleAllViews(m1Var);
            this.f1243n.removeAndRecycleScrapInt(m1Var);
            m1Var.f1455a.clear();
            m1Var.g();
            if (this.f1255t) {
                this.f1243n.dispatchDetachedFromWindow(this, m1Var);
            }
            this.f1243n.setRecyclerView(null);
            this.f1243n = null;
        } else {
            m1Var.f1455a.clear();
            m1Var.g();
        }
        e eVar = this.f1229f;
        RecyclerView recyclerView = eVar.f1328a.f1497a;
        eVar.f1329b.r();
        ArrayList arrayList = eVar.f1330c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x1 x1VarP = P((View) arrayList.get(size));
            if (x1VarP != null) {
                x1VarP.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            x1 x1VarP2 = P(childAt);
            t0 t0Var = recyclerView.f1241m;
            if (t0Var != null && x1VarP2 != null) {
                t0Var.onViewDetachedFromWindow(x1VarP2);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1243n = f1Var;
        if (f1Var != null) {
            if (f1Var.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(f1Var);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(a0.g.k(f1Var.mRecyclerView, sb2));
            }
            f1Var.setRecyclerView(this);
            if (this.f1255t) {
                this.f1243n.dispatchAttachedToWindow(this);
            }
        }
        m1Var.n();
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
    public void setNestedScrollingEnabled(boolean z3) {
        e4.p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f22383d) {
            ViewGroup viewGroup = scrollingChildHelper.f22382c;
            WeakHashMap weakHashMap = e4.v0.f22405a;
            e4.m0.k(viewGroup);
        }
        scrollingChildHelper.f22383d = z3;
    }

    public void setOnFlingListener(h1 h1Var) {
        this.V = h1Var;
    }

    @Deprecated
    public void setOnScrollListener(j1 j1Var) {
        this.f1235i0 = j1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f1226d0 = z3;
    }

    public void setRecycledViewPool(l1 l1Var) {
        m1 m1Var = this.f1223c;
        RecyclerView recyclerView = m1Var.f1461h;
        m1Var.f(recyclerView.f1241m, false);
        if (m1Var.g != null) {
            r2.f1448b--;
        }
        m1Var.g = l1Var;
        if (l1Var != null && recyclerView.getAdapter() != null) {
            m1Var.g.f1448b++;
        }
        m1Var.e();
    }

    @Deprecated
    public void setRecyclerListener(n1 n1Var) {
        this.f1245o = n1Var;
    }

    public void setScrollState(int i4) {
        if (i4 == this.N) {
            return;
        }
        if (D0) {
            StringBuilder sbW = je.u.w(i4, "setting scroll state to ", " from ");
            sbW.append(this.N);
            Log.d("RecyclerView", sbW.toString(), new Exception());
        }
        this.N = i4;
        if (i4 != 2) {
            w1 w1Var = this.f1228e0;
            w1Var.g.removeCallbacks(w1Var);
            w1Var.f1523c.abortAnimation();
            f1 f1Var = this.f1243n;
            if (f1Var != null) {
                f1Var.stopSmoothScroller();
            }
        }
        f1 f1Var2 = this.f1243n;
        if (f1Var2 != null) {
            f1Var2.onScrollStateChanged(i4);
        }
        j1 j1Var = this.f1235i0;
        if (j1Var != null) {
            j1Var.onScrollStateChanged(this, i4);
        }
        ArrayList arrayList = this.f1236j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((j1) this.f1236j0.get(size)).onScrollStateChanged(this, i4);
            }
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.U = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.U = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(v1 v1Var) {
        this.f1223c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        if (z3 != this.f1265y) {
            l("Do not suppressLayout in layout or scroll");
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f1265y = true;
                this.f1267z = true;
                s0();
                return;
            }
            this.f1265y = false;
            if (this.f1263x && this.f1243n != null && this.f1241m != null) {
                requestLayout();
            }
            this.f1263x = false;
        }
    }

    public final void t() {
        k2 k2Var;
        View viewF;
        t1 t1Var = this.f1233h0;
        t1Var.a(1);
        D(t1Var);
        t1Var.f1510i = false;
        o0();
        y4.a aVar = this.g;
        x.n0 n0Var = (x.n0) aVar.f37323a;
        x.n0 n0Var2 = (x.n0) aVar.f37323a;
        n0Var.clear();
        x.o oVar = (x.o) aVar.f37324b;
        oVar.b();
        X();
        b0();
        x1 x1VarO = null;
        View focusedChild = (this.f1226d0 && hasFocus() && this.f1241m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewF = F(focusedChild)) != null) {
            x1VarO = O(viewF);
        }
        if (x1VarO == null) {
            t1Var.f1513m = -1L;
            t1Var.f1512l = -1;
            t1Var.f1514n = -1;
        } else {
            t1Var.f1513m = this.f1241m.hasStableIds() ? x1VarO.getItemId() : -1L;
            t1Var.f1512l = this.D ? -1 : x1VarO.isRemoved() ? x1VarO.mOldPosition : x1VarO.getAbsoluteAdapterPosition();
            View focusedChild2 = x1VarO.itemView;
            int id2 = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id2 = focusedChild2.getId();
                }
            }
            t1Var.f1514n = id2;
        }
        t1Var.f1509h = t1Var.j && this.f1240l0;
        this.f1240l0 = false;
        this.f1238k0 = false;
        t1Var.g = t1Var.f1511k;
        t1Var.f1507e = this.f1241m.getItemCount();
        H(this.f1248p0);
        if (t1Var.j) {
            int iE = this.f1229f.e();
            for (int i4 = 0; i4 < iE; i4++) {
                x1 x1VarP = P(this.f1229f.d(i4));
                if (!x1VarP.shouldIgnore() && (!x1VarP.isInvalid() || this.f1241m.hasStableIds())) {
                    a1 a1Var = this.M;
                    a1.b(x1VarP);
                    x1VarP.getUnmodifiedPayloads();
                    a1Var.getClass();
                    z0 z0Var = new z0();
                    z0Var.a(x1VarP);
                    k2 k2VarA = (k2) n0Var2.get(x1VarP);
                    if (k2VarA == null) {
                        k2VarA = k2.a();
                        n0Var2.put(x1VarP, k2VarA);
                    }
                    k2VarA.f1433b = z0Var;
                    k2VarA.f1432a |= 4;
                    if (t1Var.f1509h && x1VarP.isUpdated() && !x1VarP.isRemoved() && !x1VarP.shouldIgnore() && !x1VarP.isInvalid()) {
                        oVar.i(x1VarP, M(x1VarP));
                    }
                }
            }
        }
        if (t1Var.f1511k) {
            int iH = this.f1229f.h();
            for (int i10 = 0; i10 < iH; i10++) {
                x1 x1VarP2 = P(this.f1229f.g(i10));
                if (C0 && x1VarP2.mPosition == -1 && !x1VarP2.isRemoved()) {
                    throw new IllegalStateException(a0.g.k(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!x1VarP2.shouldIgnore()) {
                    x1VarP2.saveOldPosition();
                }
            }
            boolean z3 = t1Var.f1508f;
            t1Var.f1508f = false;
            this.f1243n.onLayoutChildren(this.f1223c, t1Var);
            t1Var.f1508f = z3;
            for (int i11 = 0; i11 < this.f1229f.e(); i11++) {
                x1 x1VarP3 = P(this.f1229f.d(i11));
                if (!x1VarP3.shouldIgnore() && ((k2Var = (k2) n0Var2.get(x1VarP3)) == null || (k2Var.f1432a & 4) == 0)) {
                    a1.b(x1VarP3);
                    boolean zHasAnyOfTheFlags = x1VarP3.hasAnyOfTheFlags(Segment.SIZE);
                    a1 a1Var2 = this.M;
                    x1VarP3.getUnmodifiedPayloads();
                    a1Var2.getClass();
                    z0 z0Var2 = new z0();
                    z0Var2.a(x1VarP3);
                    if (zHasAnyOfTheFlags) {
                        d0(x1VarP3, z0Var2);
                    } else {
                        k2 k2VarA2 = (k2) n0Var2.get(x1VarP3);
                        if (k2VarA2 == null) {
                            k2VarA2 = k2.a();
                            n0Var2.put(x1VarP3, k2VarA2);
                        }
                        k2VarA2.f1432a |= 2;
                        k2VarA2.f1433b = z0Var2;
                    }
                }
            }
            n();
        } else {
            n();
        }
        Y(true);
        q0(false);
        t1Var.f1506d = 2;
    }

    public final void u() {
        o0();
        X();
        t1 t1Var = this.f1233h0;
        t1Var.a(6);
        this.f1227e.e();
        t1Var.f1507e = this.f1241m.getItemCount();
        t1Var.f1505c = 0;
        if (this.f1225d != null && this.f1241m.canRestoreState()) {
            Parcelable parcelable = this.f1225d.f1480c;
            if (parcelable != null) {
                this.f1243n.onRestoreInstanceState(parcelable);
            }
            this.f1225d = null;
        }
        t1Var.g = false;
        this.f1243n.onLayoutChildren(this.f1223c, t1Var);
        t1Var.f1508f = false;
        t1Var.j = t1Var.j && this.M != null;
        t1Var.f1506d = 4;
        Y(true);
        q0(false);
    }

    public final boolean v(int i4, int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i10, i11, iArr, iArr2);
    }

    public final void w(int i4, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i4, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void x(int i4, int i10) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i10);
        j1 j1Var = this.f1235i0;
        if (j1Var != null) {
            j1Var.onScrolled(this, i4, i10);
        }
        ArrayList arrayList = this.f1236j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((j1) this.f1236j0.get(size)).onScrolled(this, i4, i10);
            }
        }
        this.G--;
    }

    public final void y() {
        if (this.L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this);
        this.L = edgeEffectA;
        if (this.f1232h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.I != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this);
        this.I = edgeEffectA;
        if (this.f1232h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i4) throws NoSuchMethodException, SecurityException {
        float fA;
        char c9;
        int i10;
        boolean z3;
        char c10;
        int i11;
        TypedArray typedArray;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i4);
        this.f1221b = new o1(this);
        this.f1223c = new m1(this);
        this.g = new y4.a(6);
        this.f1234i = new p0(this, 0);
        this.j = new Rect();
        this.f1237k = new Rect();
        this.f1239l = new RectF();
        this.f1247p = new ArrayList();
        this.f1249q = new ArrayList();
        this.f1251r = new ArrayList();
        this.f1261w = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = K0;
        l lVar = new l();
        lVar.f1299a = null;
        lVar.f1300b = new ArrayList();
        lVar.f1301c = 120L;
        lVar.f1302d = 120L;
        lVar.f1303e = 250L;
        lVar.f1304f = 250L;
        int i12 = 1;
        lVar.g = true;
        lVar.f1436h = new ArrayList();
        lVar.f1437i = new ArrayList();
        lVar.j = new ArrayList();
        lVar.f1438k = new ArrayList();
        lVar.f1439l = new ArrayList();
        lVar.f1440m = new ArrayList();
        lVar.f1441n = new ArrayList();
        lVar.f1442o = new ArrayList();
        lVar.f1443p = new ArrayList();
        lVar.f1444q = new ArrayList();
        lVar.f1445r = new ArrayList();
        this.M = lVar;
        this.N = 0;
        this.O = -1;
        this.f1222b0 = Float.MIN_VALUE;
        this.f1224c0 = Float.MIN_VALUE;
        this.f1226d0 = true;
        this.f1228e0 = new w1(this);
        this.f1231g0 = H0 ? new y() : null;
        t1 t1Var = new t1();
        t1Var.f1503a = -1;
        t1Var.f1504b = 0;
        t1Var.f1505c = 0;
        t1Var.f1506d = 1;
        t1Var.f1507e = 0;
        t1Var.f1508f = false;
        t1Var.g = false;
        t1Var.f1509h = false;
        t1Var.f1510i = false;
        t1Var.j = false;
        t1Var.f1511k = false;
        this.f1233h0 = t1Var;
        this.f1238k0 = false;
        this.f1240l0 = false;
        r0 r0Var = new r0(this);
        this.f1242m0 = r0Var;
        this.f1244n0 = false;
        this.f1248p0 = new int[2];
        this.f1252r0 = new int[2];
        this.f1254s0 = new int[2];
        this.f1256t0 = new int[2];
        this.f1258u0 = new ArrayList();
        this.f1260v0 = new p0(this, i12);
        this.f1264x0 = 0;
        this.f1266y0 = 0;
        this.A0 = new r0(this);
        this.B0 = new e4.i(getContext(), new r0(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = e4.w0.f22414a;
            fA = ub.a.f(viewConfiguration);
        } else {
            fA = e4.w0.a(viewConfiguration, context);
        }
        this.f1222b0 = fA;
        this.f1224c0 = i13 >= 26 ? ub.a.g(viewConfiguration) : e4.w0.a(viewConfiguration, context);
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1220a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1219a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.M.f1299a = r0Var;
        r0 r0Var2 = new r0(this);
        be1 be1Var = new be1();
        be1Var.f9658b = new d4.d(30);
        be1Var.f9659c = new ArrayList();
        be1Var.f9660d = new ArrayList();
        be1Var.f9657a = 0;
        be1Var.f9661e = r0Var2;
        be1Var.f9662f = new b(be1Var);
        this.f1227e = be1Var;
        this.f1229f = new e(new r0(this));
        WeakHashMap weakHashMap = e4.v0.f22405a;
        if ((i13 >= 26 ? e4.p0.a(this) : 0) == 0 && i13 >= 26) {
            e4.p0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new z1(this));
        int[] iArr = s5.a.f33469a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        e4.v0.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i4);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1232h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(a0.g.k(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c10 = 2;
            z3 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            i11 = i4;
            c9 = 3;
            i10 = 4;
            new x(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.fastscroll_margin));
        } else {
            c9 = 3;
            i10 = 4;
            z3 = 1;
            c10 = 2;
            i11 = i4;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        this.f1268z0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
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
                    Class clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(f1.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(I0);
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = context;
                        objArr2[z3] = attributeSet;
                        objArr2[c10] = Integer.valueOf(i11);
                        objArr2[c9] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e10) {
                            e10.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e10);
                        }
                    }
                    constructor.setAccessible(z3);
                    setLayoutManager((f1) constructor.newInstance(objArr));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                }
            }
        }
        int[] iArr2 = E0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
        e4.v0.n(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i11);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(com.liuzh.deviceinfo.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        f1 f1Var = this.f1243n;
        if (f1Var != null) {
            return f1Var.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(a0.g.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
