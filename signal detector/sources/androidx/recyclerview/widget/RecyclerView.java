package androidx.recyclerview.widget;

import R.C0184k;
import R.C0187n;
import R.InterfaceC0183j;
import R.InterfaceC0193u;
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
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u.C2938g;
import u.C2940i;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0193u, InterfaceC0183j {

    /* renamed from: N0, reason: collision with root package name */
    public static final int[] f5304N0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: O0, reason: collision with root package name */
    public static final Class[] f5305O0;

    /* renamed from: P0, reason: collision with root package name */
    public static final X.e f5306P0;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f5307A0;

    /* renamed from: B0, reason: collision with root package name */
    public i0 f5308B0;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f5309C;

    /* renamed from: C0, reason: collision with root package name */
    public final int[] f5310C0;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f5311D;

    /* renamed from: D0, reason: collision with root package name */
    public C0184k f5312D0;

    /* renamed from: E, reason: collision with root package name */
    public C0317n f5313E;

    /* renamed from: E0, reason: collision with root package name */
    public final int[] f5314E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5315F;

    /* renamed from: F0, reason: collision with root package name */
    public final int[] f5316F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5317G;

    /* renamed from: G0, reason: collision with root package name */
    public final int[] f5318G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5319H;

    /* renamed from: H0, reason: collision with root package name */
    public final ArrayList f5320H0;

    /* renamed from: I, reason: collision with root package name */
    public int f5321I;

    /* renamed from: I0, reason: collision with root package name */
    public final D f5322I0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f5323J;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f5324J0;

    /* renamed from: K, reason: collision with root package name */
    public boolean f5325K;

    /* renamed from: K0, reason: collision with root package name */
    public int f5326K0;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5327L;

    /* renamed from: L0, reason: collision with root package name */
    public int f5328L0;
    public int M;

    /* renamed from: M0, reason: collision with root package name */
    public final E f5329M0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5330N;

    /* renamed from: O, reason: collision with root package name */
    public final AccessibilityManager f5331O;

    /* renamed from: P, reason: collision with root package name */
    public ArrayList f5332P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5333Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5334R;

    /* renamed from: S, reason: collision with root package name */
    public int f5335S;

    /* renamed from: T, reason: collision with root package name */
    public int f5336T;

    /* renamed from: U, reason: collision with root package name */
    public K f5337U;

    /* renamed from: V, reason: collision with root package name */
    public EdgeEffect f5338V;

    /* renamed from: W, reason: collision with root package name */
    public EdgeEffect f5339W;

    /* renamed from: a, reason: collision with root package name */
    public final L3.j f5340a;

    /* renamed from: a0, reason: collision with root package name */
    public EdgeEffect f5341a0;

    /* renamed from: b, reason: collision with root package name */
    public final X f5342b;
    public EdgeEffect b0;

    /* renamed from: c, reason: collision with root package name */
    public Z f5343c;

    /* renamed from: c0, reason: collision with root package name */
    public L f5344c0;

    /* renamed from: d, reason: collision with root package name */
    public final C0305b f5345d;

    /* renamed from: d0, reason: collision with root package name */
    public int f5346d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0306c f5347e;

    /* renamed from: e0, reason: collision with root package name */
    public int f5348e0;

    /* renamed from: f, reason: collision with root package name */
    public final V2.h f5349f;

    /* renamed from: f0, reason: collision with root package name */
    public VelocityTracker f5350f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5351g;

    /* renamed from: g0, reason: collision with root package name */
    public int f5352g0;

    /* renamed from: h, reason: collision with root package name */
    public final D f5353h;

    /* renamed from: h0, reason: collision with root package name */
    public int f5354h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public int f5355i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f5356j;

    /* renamed from: j0, reason: collision with root package name */
    public int f5357j0;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f5358k;

    /* renamed from: k0, reason: collision with root package name */
    public int f5359k0;

    /* renamed from: l, reason: collision with root package name */
    public G f5360l;

    /* renamed from: l0, reason: collision with root package name */
    public T f5361l0;

    /* renamed from: m, reason: collision with root package name */
    public Q f5362m;

    /* renamed from: m0, reason: collision with root package name */
    public final int f5363m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f5364n;

    /* renamed from: n0, reason: collision with root package name */
    public final int f5365n0;

    /* renamed from: o0, reason: collision with root package name */
    public final float f5366o0;

    /* renamed from: p0, reason: collision with root package name */
    public final float f5367p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f5368q0;

    /* renamed from: r0, reason: collision with root package name */
    public final f0 f5369r0;

    /* renamed from: s0, reason: collision with root package name */
    public RunnableC0320q f5370s0;

    /* renamed from: t0, reason: collision with root package name */
    public final C0318o f5371t0;

    /* renamed from: u0, reason: collision with root package name */
    public final d0 f5372u0;
    public U v0;

    /* renamed from: w0, reason: collision with root package name */
    public ArrayList f5373w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f5374x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f5375y0;

    /* renamed from: z0, reason: collision with root package name */
    public final E f5376z0;

    static {
        Class cls = Integer.TYPE;
        f5305O0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5306P0 = new X.e(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.apm.insight.R.attr.recyclerViewStyle);
    }

    public static RecyclerView E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewE = E(viewGroup.getChildAt(i));
            if (recyclerViewE != null) {
                return recyclerViewE;
            }
        }
        return null;
    }

    public static g0 J(View view) {
        if (view == null) {
            return null;
        }
        return ((S) view.getLayoutParams()).f5377a;
    }

    public static void K(View view, Rect rect) {
        S s5 = (S) view.getLayoutParams();
        Rect rect2 = s5.f5378b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) s5).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) s5).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) s5).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) s5).bottomMargin);
    }

    private C0184k getScrollingChildHelper() {
        if (this.f5312D0 == null) {
            this.f5312D0 = new C0184k(this);
        }
        return this.f5312D0;
    }

    public static void j(g0 g0Var) {
        WeakReference<RecyclerView> weakReference = g0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == g0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            g0Var.mNestedRecyclerView = null;
        }
    }

    public final void A(d0 d0Var) {
        if (getScrollState() != 2) {
            d0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f5369r0.f5468c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        d0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View B(View view) {
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
    public final boolean C(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f5311D
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            androidx.recyclerview.widget.n r5 = (androidx.recyclerview.widget.C0317n) r5
            int r6 = r5.f5549v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.b(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.a(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f5550w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f5543p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f5550w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f5540m = r6
        L55:
            r5.d(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f5313E = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(android.view.MotionEvent):boolean");
    }

    public final void D(int[] iArr) {
        int iE = this.f5347e.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i3 = LinearLayoutManager.INVALID_OFFSET;
        for (int i6 = 0; i6 < iE; i6++) {
            g0 g0VarJ = J(this.f5347e.d(i6));
            if (!g0VarJ.shouldIgnore()) {
                int layoutPosition = g0VarJ.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i3;
    }

    public final g0 F(int i) {
        g0 g0Var = null;
        if (this.f5333Q) {
            return null;
        }
        int iH = this.f5347e.h();
        for (int i3 = 0; i3 < iH; i3++) {
            g0 g0VarJ = J(this.f5347e.g(i3));
            if (g0VarJ != null && !g0VarJ.isRemoved() && G(g0VarJ) == i) {
                if (!this.f5347e.f5438c.contains(g0VarJ.itemView)) {
                    return g0VarJ;
                }
                g0Var = g0VarJ;
            }
        }
        return g0Var;
    }

    public final int G(g0 g0Var) {
        if (g0Var.hasAnyOfTheFlags(524) || !g0Var.isBound()) {
            return -1;
        }
        int i = g0Var.mPosition;
        ArrayList arrayList = (ArrayList) this.f5345d.f5432c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0304a c0304a = (C0304a) arrayList.get(i3);
            int i6 = c0304a.f5419a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = c0304a.f5420b;
                    if (i7 <= i) {
                        int i8 = c0304a.f5422d;
                        if (i7 + i8 > i) {
                            return -1;
                        }
                        i -= i8;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i9 = c0304a.f5420b;
                    if (i9 == i) {
                        i = c0304a.f5422d;
                    } else {
                        if (i9 < i) {
                            i--;
                        }
                        if (c0304a.f5422d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0304a.f5420b <= i) {
                i += c0304a.f5422d;
            }
        }
        return i;
    }

    public final long H(g0 g0Var) {
        return this.f5360l.hasStableIds() ? g0Var.getItemId() : g0Var.mPosition;
    }

    public final g0 I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect L(View view) {
        S s5 = (S) view.getLayoutParams();
        boolean z6 = s5.f5379c;
        Rect rect = s5.f5378b;
        if (z6) {
            d0 d0Var = this.f5372u0;
            if (!d0Var.f5448g || (!s5.f5377a.isUpdated() && !s5.f5377a.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f5309C;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.i;
                    rect2.set(0, 0, 0, 0);
                    ((M) arrayList.get(i)).getItemOffsets(rect2, view, this, d0Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                s5.f5379c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean M() {
        return !this.f5319H || this.f5333Q || this.f5345d.j();
    }

    public final boolean N() {
        return this.f5335S > 0;
    }

    public final void O(int i) {
        if (this.f5362m == null) {
            return;
        }
        setScrollState(2);
        this.f5362m.scrollToPosition(i);
        awakenScrollBars();
    }

    public final void P() {
        int iH = this.f5347e.h();
        for (int i = 0; i < iH; i++) {
            ((S) this.f5347e.g(i).getLayoutParams()).f5379c = true;
        }
        ArrayList arrayList = this.f5342b.f5412c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            S s5 = (S) ((g0) arrayList.get(i3)).itemView.getLayoutParams();
            if (s5 != null) {
                s5.f5379c = true;
            }
        }
    }

    public final void Q(int i, int i3, boolean z6) {
        int i6 = i + i3;
        int iH = this.f5347e.h();
        for (int i7 = 0; i7 < iH; i7++) {
            g0 g0VarJ = J(this.f5347e.g(i7));
            if (g0VarJ != null && !g0VarJ.shouldIgnore()) {
                int i8 = g0VarJ.mPosition;
                d0 d0Var = this.f5372u0;
                if (i8 >= i6) {
                    g0VarJ.offsetPosition(-i3, z6);
                    d0Var.f5447f = true;
                } else if (i8 >= i) {
                    g0VarJ.flagRemovedAndOffsetPosition(i - 1, -i3, z6);
                    d0Var.f5447f = true;
                }
            }
        }
        X x6 = this.f5342b;
        ArrayList arrayList = x6.f5412c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g0 g0Var = (g0) arrayList.get(size);
            if (g0Var != null) {
                int i9 = g0Var.mPosition;
                if (i9 >= i6) {
                    g0Var.offsetPosition(-i3, z6);
                } else if (i9 >= i) {
                    g0Var.addFlags(8);
                    x6.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void R() {
        this.f5335S++;
    }

    public final void S(boolean z6) {
        int i;
        AccessibilityManager accessibilityManager;
        int i3 = this.f5335S - 1;
        this.f5335S = i3;
        if (i3 < 1) {
            this.f5335S = 0;
            if (z6) {
                int i6 = this.M;
                this.M = 0;
                if (i6 != 0 && (accessibilityManager = this.f5331O) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i6);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f5320H0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    g0 g0Var = (g0) arrayList.get(size);
                    if (g0Var.itemView.getParent() == this && !g0Var.shouldIgnore() && (i = g0Var.mPendingAccessibilityState) != -1) {
                        View view = g0Var.itemView;
                        WeakHashMap weakHashMap = R.O.f3270a;
                        view.setImportantForAccessibility(i);
                        g0Var.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void T(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5348e0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5348e0 = motionEvent.getPointerId(i);
            int x6 = (int) (motionEvent.getX(i) + 0.5f);
            this.f5355i0 = x6;
            this.f5352g0 = x6;
            int y3 = (int) (motionEvent.getY(i) + 0.5f);
            this.f5357j0 = y3;
            this.f5354h0 = y3;
        }
    }

    public final void U() {
        if (this.f5307A0 || !this.f5315F) {
            return;
        }
        WeakHashMap weakHashMap = R.O.f3270a;
        postOnAnimation(this.f5322I0);
        this.f5307A0 = true;
    }

    public final void V() {
        boolean z6;
        boolean z7 = false;
        if (this.f5333Q) {
            C0305b c0305b = this.f5345d;
            c0305b.q((ArrayList) c0305b.f5432c);
            c0305b.q((ArrayList) c0305b.f5433d);
            c0305b.f5430a = 0;
            if (this.f5334R) {
                this.f5362m.onItemsChanged(this);
            }
        }
        if (this.f5344c0 == null || !this.f5362m.supportsPredictiveItemAnimations()) {
            this.f5345d.d();
        } else {
            this.f5345d.p();
        }
        boolean z8 = this.f5374x0 || this.f5375y0;
        boolean z9 = this.f5319H && this.f5344c0 != null && ((z6 = this.f5333Q) || z8 || this.f5362m.mRequestedSimpleAnimations) && (!z6 || this.f5360l.hasStableIds());
        d0 d0Var = this.f5372u0;
        d0Var.f5450j = z9;
        if (z9 && z8 && !this.f5333Q && this.f5344c0 != null && this.f5362m.supportsPredictiveItemAnimations()) {
            z7 = true;
        }
        d0Var.f5451k = z7;
    }

    public final void W(boolean z6) {
        this.f5334R = z6 | this.f5334R;
        this.f5333Q = true;
        int iH = this.f5347e.h();
        for (int i = 0; i < iH; i++) {
            g0 g0VarJ = J(this.f5347e.g(i));
            if (g0VarJ != null && !g0VarJ.shouldIgnore()) {
                g0VarJ.addFlags(6);
            }
        }
        P();
        X x6 = this.f5342b;
        ArrayList arrayList = x6.f5412c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            g0 g0Var = (g0) arrayList.get(i3);
            if (g0Var != null) {
                g0Var.addFlags(6);
                g0Var.addChangePayload(null);
            }
        }
        G g2 = x6.f5417h.f5360l;
        if (g2 == null || !g2.hasStableIds()) {
            x6.e();
        }
    }

    public final void X(g0 g0Var, C0187n c0187n) {
        g0Var.setFlags(0, 8192);
        boolean z6 = this.f5372u0.f5449h;
        V2.h hVar = this.f5349f;
        if (z6 && g0Var.isUpdated() && !g0Var.isRemoved() && !g0Var.shouldIgnore()) {
            ((C2938g) hVar.f3876c).h(H(g0Var), g0Var);
        }
        C2940i c2940i = (C2940i) hVar.f3875b;
        t0 t0VarA = (t0) c2940i.get(g0Var);
        if (t0VarA == null) {
            t0VarA = t0.a();
            c2940i.put(g0Var, t0VarA);
        }
        t0VarA.f5608b = c0187n;
        t0VarA.f5607a |= 4;
    }

    public final void Y(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof S) {
            S s5 = (S) layoutParams;
            if (!s5.f5379c) {
                Rect rect2 = s5.f5378b;
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
        this.f5362m.requestChildRectangleOnScreen(this, view, this.i, !this.f5319H, view2 == null);
    }

    public final void Z() {
        VelocityTracker velocityTracker = this.f5350f0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        h0(0);
        EdgeEffect edgeEffect = this.f5338V;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f5338V.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5339W;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f5339W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5341a0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f5341a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.b0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = R.O.f3270a;
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
    public final boolean a0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i3) {
        Q q3 = this.f5362m;
        if (q3 == null || !q3.onAddFocusables(this, arrayList, i, i3)) {
            super.addFocusables(arrayList, i, i3);
        }
    }

    public final void b0(int[] iArr, int i, int i3) {
        g0 g0Var;
        f0();
        R();
        int i6 = N.l.f2971a;
        Trace.beginSection("RV Scroll");
        d0 d0Var = this.f5372u0;
        A(d0Var);
        X x6 = this.f5342b;
        int iScrollHorizontallyBy = i != 0 ? this.f5362m.scrollHorizontallyBy(i, x6, d0Var) : 0;
        int iScrollVerticallyBy = i3 != 0 ? this.f5362m.scrollVerticallyBy(i3, x6, d0Var) : 0;
        Trace.endSection();
        C0306c c0306c = this.f5347e;
        int iE = c0306c.e();
        for (int i7 = 0; i7 < iE; i7++) {
            View viewD = c0306c.d(i7);
            g0 g0VarI = I(viewD);
            if (g0VarI != null && (g0Var = g0VarI.mShadowingHolder) != null) {
                View view = g0Var.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        S(true);
        g0(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public final void c0(int i) {
        if (this.f5325K) {
            return;
        }
        setScrollState(0);
        f0 f0Var = this.f5369r0;
        f0Var.f5472g.removeCallbacks(f0Var);
        f0Var.f5468c.abortAnimation();
        Q q3 = this.f5362m;
        if (q3 != null) {
            q3.stopSmoothScroller();
        }
        Q q6 = this.f5362m;
        if (q6 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            q6.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof S) && this.f5362m.checkLayoutParams((S) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        Q q3 = this.f5362m;
        if (q3 != null && q3.canScrollHorizontally()) {
            return this.f5362m.computeHorizontalScrollExtent(this.f5372u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        Q q3 = this.f5362m;
        if (q3 != null && q3.canScrollHorizontally()) {
            return this.f5362m.computeHorizontalScrollOffset(this.f5372u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        Q q3 = this.f5362m;
        if (q3 != null && q3.canScrollHorizontally()) {
            return this.f5362m.computeHorizontalScrollRange(this.f5372u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        Q q3 = this.f5362m;
        if (q3 != null && q3.canScrollVertically()) {
            return this.f5362m.computeVerticalScrollExtent(this.f5372u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        Q q3 = this.f5362m;
        if (q3 != null && q3.canScrollVertically()) {
            return this.f5362m.computeVerticalScrollOffset(this.f5372u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        Q q3 = this.f5362m;
        if (q3 != null && q3.canScrollVertically()) {
            return this.f5362m.computeVerticalScrollRange(this.f5372u0);
        }
        return 0;
    }

    public final void d0(int i, int i3, boolean z6) {
        Q q3 = this.f5362m;
        if (q3 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5325K) {
            return;
        }
        if (!q3.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.f5362m.canScrollVertically()) {
            i3 = 0;
        }
        if (i == 0 && i3 == 0) {
            return;
        }
        if (z6) {
            int i6 = i != 0 ? 1 : 0;
            if (i3 != 0) {
                i6 |= 2;
            }
            getScrollingChildHelper().g(i6, 1);
        }
        this.f5369r0.b(i, i3, LinearLayoutManager.INVALID_OFFSET, null);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f5, boolean z6) {
        return getScrollingChildHelper().a(f2, f5, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f5) {
        return getScrollingChildHelper().b(f2, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i3, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i, i3, i6, i7, iArr, 0, null);
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
        boolean z6;
        super.draw(canvas);
        ArrayList arrayList = this.f5309C;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i = 0; i < size; i++) {
            ((M) arrayList.get(i)).onDrawOver(canvas, this, this.f5372u0);
        }
        EdgeEffect edgeEffect = this.f5338V;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f5351g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f5338V;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f5339W;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f5351g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5339W;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f5341a0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5351g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5341a0;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.b0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5351g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.b0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z6 |= z7;
            canvas.restoreToCount(iSave4);
        }
        if ((z6 || this.f5344c0 == null || arrayList.size() <= 0 || !this.f5344c0.f()) ? z6 : true) {
            WeakHashMap weakHashMap = R.O.f3270a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public final void e0(int i) {
        if (this.f5325K) {
            return;
        }
        Q q3 = this.f5362m;
        if (q3 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            q3.smoothScrollToPosition(this, this.f5372u0, i);
        }
    }

    public final void f(g0 g0Var) {
        View view = g0Var.itemView;
        boolean z6 = view.getParent() == this;
        this.f5342b.k(I(view));
        if (g0Var.isTmpDetached()) {
            this.f5347e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z6) {
            this.f5347e.a(view, -1, true);
            return;
        }
        C0306c c0306c = this.f5347e;
        int iIndexOfChild = c0306c.f5436a.f5281a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c0306c.f5437b.C(iIndexOfChild);
            c0306c.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f0() {
        int i = this.f5321I + 1;
        this.f5321I = i;
        if (i != 1 || this.f5325K) {
            return;
        }
        this.f5323J = false;
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

    public final void g(M m6) {
        Q q3 = this.f5362m;
        if (q3 != null) {
            q3.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f5309C;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(m6);
        P();
        requestLayout();
    }

    public final void g0(boolean z6) {
        if (this.f5321I < 1) {
            this.f5321I = 1;
        }
        if (!z6 && !this.f5325K) {
            this.f5323J = false;
        }
        if (this.f5321I == 1) {
            if (z6 && this.f5323J && !this.f5325K && this.f5362m != null && this.f5360l != null) {
                p();
            }
            if (!this.f5325K) {
                this.f5323J = false;
            }
        }
        this.f5321I--;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Q q3 = this.f5362m;
        if (q3 != null) {
            return q3.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(A.f.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Q q3 = this.f5362m;
        if (q3 != null) {
            return q3.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(A.f.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public G getAdapter() {
        return this.f5360l;
    }

    @Override // android.view.View
    public int getBaseline() {
        Q q3 = this.f5362m;
        return q3 != null ? q3.getBaseline() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i3) {
        return super.getChildDrawingOrder(i, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5351g;
    }

    public i0 getCompatAccessibilityDelegate() {
        return this.f5308B0;
    }

    public K getEdgeEffectFactory() {
        return this.f5337U;
    }

    public L getItemAnimator() {
        return this.f5344c0;
    }

    public int getItemDecorationCount() {
        return this.f5309C.size();
    }

    public Q getLayoutManager() {
        return this.f5362m;
    }

    public int getMaxFlingVelocity() {
        return this.f5365n0;
    }

    public int getMinFlingVelocity() {
        return this.f5363m0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public T getOnFlingListener() {
        return this.f5361l0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5368q0;
    }

    public W getRecycledViewPool() {
        return this.f5342b.c();
    }

    public int getScrollState() {
        return this.f5346d0;
    }

    public final void h(U u6) {
        if (this.f5373w0 == null) {
            this.f5373w0 = new ArrayList();
        }
        this.f5373w0.add(u6);
    }

    public final void h0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (N()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(A.f.j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f5336T > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(A.f.j(this, new StringBuilder(""))));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f5315F;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f5325K;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3343d;
    }

    public final void k() {
        int iH = this.f5347e.h();
        for (int i = 0; i < iH; i++) {
            g0 g0VarJ = J(this.f5347e.g(i));
            if (!g0VarJ.shouldIgnore()) {
                g0VarJ.clearOldPosition();
            }
        }
        X x6 = this.f5342b;
        ArrayList arrayList = x6.f5410a;
        ArrayList arrayList2 = x6.f5412c;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((g0) arrayList2.get(i3)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ((g0) arrayList.get(i6)).clearOldPosition();
        }
        ArrayList arrayList3 = x6.f5411b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                ((g0) x6.f5411b.get(i7)).clearOldPosition();
            }
        }
    }

    public final void l(int i, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f5338V;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f5338V.onRelease();
            zIsFinished = this.f5338V.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5341a0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f5341a0.onRelease();
            zIsFinished |= this.f5341a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5339W;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f5339W.onRelease();
            zIsFinished |= this.f5339W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.b0.onRelease();
            zIsFinished |= this.b0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = R.O.f3270a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.f5319H || this.f5333Q) {
            int i = N.l.f2971a;
            Trace.beginSection("RV FullInvalidate");
            p();
            Trace.endSection();
            return;
        }
        C0305b c0305b = this.f5345d;
        if (c0305b.j()) {
            int i3 = c0305b.f5430a;
            if ((i3 & 4) == 0 || (i3 & 11) != 0) {
                if (c0305b.j()) {
                    int i6 = N.l.f2971a;
                    Trace.beginSection("RV FullInvalidate");
                    p();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i7 = N.l.f2971a;
            Trace.beginSection("RV PartialInvalidate");
            f0();
            R();
            c0305b.p();
            if (!this.f5323J) {
                C0306c c0306c = this.f5347e;
                int iE = c0306c.e();
                int i8 = 0;
                while (true) {
                    if (i8 < iE) {
                        g0 g0VarJ = J(c0306c.d(i8));
                        if (g0VarJ != null && !g0VarJ.shouldIgnore() && g0VarJ.isUpdated()) {
                            p();
                            break;
                        }
                        i8++;
                    } else {
                        c0305b.c();
                        break;
                    }
                }
            }
            g0(true);
            S(true);
            Trace.endSection();
        }
    }

    public final void n(int i, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = R.O.f3270a;
        setMeasuredDimension(Q.chooseSize(i, paddingRight, getMinimumWidth()), Q.chooseSize(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void o(View view) {
        g0 g0VarJ = J(view);
        G g2 = this.f5360l;
        if (g2 != null && g0VarJ != null) {
            g2.onViewDetachedFromWindow(g0VarJ);
        }
        ArrayList arrayList = this.f5332P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((S0.g) this.f5332P.get(size)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
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
            r5.f5335S = r0
            r1 = 1
            r5.f5315F = r1
            boolean r2 = r5.f5319H
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f5319H = r1
            androidx.recyclerview.widget.Q r1 = r5.f5362m
            if (r1 == 0) goto L1e
            r1.dispatchAttachedToWindow(r5)
        L1e:
            r5.f5307A0 = r0
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC0320q.f5583e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.q r1 = (androidx.recyclerview.widget.RunnableC0320q) r1
            r5.f5370s0 = r1
            if (r1 != 0) goto L68
            androidx.recyclerview.widget.q r1 = new androidx.recyclerview.widget.q
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5585a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5588d = r2
            r5.f5370s0 = r1
            java.util.WeakHashMap r1 = R.O.f3270a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5a
            if (r1 == 0) goto L5a
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5a
            goto L5c
        L5a:
            r1 = 1114636288(0x42700000, float:60.0)
        L5c:
            androidx.recyclerview.widget.q r2 = r5.f5370s0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5587c = r3
            r0.set(r2)
        L68:
            androidx.recyclerview.widget.q r0 = r5.f5370s0
            java.util.ArrayList r0 = r0.f5585a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        L l2 = this.f5344c0;
        if (l2 != null) {
            l2.e();
        }
        setScrollState(0);
        f0 f0Var = this.f5369r0;
        f0Var.f5472g.removeCallbacks(f0Var);
        f0Var.f5468c.abortAnimation();
        Q q3 = this.f5362m;
        if (q3 != null) {
            q3.stopSmoothScroller();
        }
        this.f5315F = false;
        Q q6 = this.f5362m;
        if (q6 != null) {
            q6.dispatchDetachedFromWindow(this, this.f5342b);
        }
        this.f5320H0.clear();
        removeCallbacks(this.f5322I0);
        this.f5349f.getClass();
        while (t0.f5606d.h() != null) {
        }
        RunnableC0320q runnableC0320q = this.f5370s0;
        if (runnableC0320q != null) {
            runnableC0320q.f5585a.remove(this);
            this.f5370s0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f5309C;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((M) arrayList.get(i)).onDraw(canvas, this, this.f5372u0);
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
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        if (!this.f5325K) {
            this.f5313E = null;
            if (C(motionEvent)) {
                Z();
                setScrollState(0);
                return true;
            }
            Q q3 = this.f5362m;
            if (q3 != null) {
                boolean zCanScrollHorizontally = q3.canScrollHorizontally();
                boolean zCanScrollVertically = this.f5362m.canScrollVertically();
                if (this.f5350f0 == null) {
                    this.f5350f0 = VelocityTracker.obtain();
                }
                this.f5350f0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f5327L) {
                        this.f5327L = false;
                    }
                    this.f5348e0 = motionEvent.getPointerId(0);
                    int x6 = (int) (motionEvent.getX() + 0.5f);
                    this.f5355i0 = x6;
                    this.f5352g0 = x6;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.f5357j0 = y3;
                    this.f5354h0 = y3;
                    if (this.f5346d0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        h0(1);
                    }
                    int[] iArr = this.f5316F0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zCanScrollHorizontally;
                    if (zCanScrollVertically) {
                        i = (zCanScrollHorizontally ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.f5350f0.clear();
                    h0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f5348e0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5348e0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x7 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f5346d0 != 1) {
                        int i3 = x7 - this.f5352g0;
                        int i6 = y4 - this.f5354h0;
                        if (zCanScrollHorizontally == 0 || Math.abs(i3) <= this.f5359k0) {
                            z6 = false;
                        } else {
                            this.f5355i0 = x7;
                            z6 = true;
                        }
                        if (zCanScrollVertically && Math.abs(i6) > this.f5359k0) {
                            this.f5357j0 = y4;
                            z6 = true;
                        }
                        if (z6) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    Z();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f5348e0 = motionEvent.getPointerId(actionIndex);
                    int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f5355i0 = x8;
                    this.f5352g0 = x8;
                    int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f5357j0 = y6;
                    this.f5354h0 = y6;
                } else if (actionMasked == 6) {
                    T(motionEvent);
                }
                if (this.f5346d0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        int i8 = N.l.f2971a;
        Trace.beginSection("RV OnLayout");
        p();
        Trace.endSection();
        this.f5319H = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        Q q3 = this.f5362m;
        if (q3 == null) {
            n(i, i3);
            return;
        }
        boolean zIsAutoMeasureEnabled = q3.isAutoMeasureEnabled();
        X x6 = this.f5342b;
        boolean z6 = false;
        d0 d0Var = this.f5372u0;
        if (zIsAutoMeasureEnabled) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f5362m.onMeasure(x6, d0Var, i, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z6 = true;
            }
            this.f5324J0 = z6;
            if (z6 || this.f5360l == null) {
                return;
            }
            if (d0Var.f5445d == 1) {
                q();
            }
            this.f5362m.setMeasureSpecs(i, i3);
            d0Var.i = true;
            r();
            this.f5362m.setMeasuredDimensionFromChildren(i, i3);
            if (this.f5362m.shouldMeasureTwice()) {
                this.f5362m.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                d0Var.i = true;
                r();
                this.f5362m.setMeasuredDimensionFromChildren(i, i3);
            }
            this.f5326K0 = getMeasuredWidth();
            this.f5328L0 = getMeasuredHeight();
            return;
        }
        if (this.f5317G) {
            this.f5362m.onMeasure(x6, d0Var, i, i3);
            return;
        }
        if (this.f5330N) {
            f0();
            R();
            V();
            S(true);
            if (d0Var.f5451k) {
                d0Var.f5448g = true;
            } else {
                this.f5345d.d();
                d0Var.f5448g = false;
            }
            this.f5330N = false;
            g0(false);
        } else if (d0Var.f5451k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        G g2 = this.f5360l;
        if (g2 != null) {
            d0Var.f5446e = g2.getItemCount();
        } else {
            d0Var.f5446e = 0;
        }
        f0();
        this.f5362m.onMeasure(x6, d0Var, i, i3);
        g0(false);
        d0Var.f5448g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (N()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Z z6 = (Z) parcelable;
        this.f5343c = z6;
        super.onRestoreInstanceState(z6.f3954a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Z z6 = new Z(super.onSaveInstanceState());
        Z z7 = this.f5343c;
        if (z7 != null) {
            z6.f5418c = z7.f5418c;
            return z6;
        }
        Q q3 = this.f5362m;
        if (q3 != null) {
            z6.f5418c = q3.onSaveInstanceState();
            return z6;
        }
        z6.f5418c = null;
        return z6;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        if (i == i6 && i3 == i7) {
            return;
        }
        this.b0 = null;
        this.f5339W = null;
        this.f5341a0 = null;
        this.f5338V = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7 A[PHI: r1
  0x01f7: PHI (r1v54 int) = (r1v39 int), (r1v58 int) binds: [B:90:0x01e0, B:94:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fa  */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
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
    public final void p() {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        t0 t0Var;
        View viewB;
        d0 d0Var = this.f5372u0;
        d0Var.a(1);
        A(d0Var);
        d0Var.i = false;
        f0();
        V2.h hVar = this.f5349f;
        C2940i c2940i = (C2940i) hVar.f3875b;
        C2940i c2940i2 = (C2940i) hVar.f3875b;
        c2940i.clear();
        C2938g c2938g = (C2938g) hVar.f3876c;
        c2938g.b();
        R();
        V();
        g0 g0VarI = null;
        View focusedChild = (this.f5368q0 && hasFocus() && this.f5360l != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewB = B(focusedChild)) != null) {
            g0VarI = I(viewB);
        }
        if (g0VarI == null) {
            d0Var.f5453m = -1L;
            d0Var.f5452l = -1;
            d0Var.f5454n = -1;
        } else {
            d0Var.f5453m = this.f5360l.hasStableIds() ? g0VarI.getItemId() : -1L;
            d0Var.f5452l = this.f5333Q ? -1 : g0VarI.isRemoved() ? g0VarI.mOldPosition : g0VarI.getAbsoluteAdapterPosition();
            View focusedChild2 = g0VarI.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            d0Var.f5454n = id;
        }
        d0Var.f5449h = d0Var.f5450j && this.f5375y0;
        this.f5375y0 = false;
        this.f5374x0 = false;
        d0Var.f5448g = d0Var.f5451k;
        d0Var.f5446e = this.f5360l.getItemCount();
        D(this.f5310C0);
        if (d0Var.f5450j) {
            int iE = this.f5347e.e();
            for (int i = 0; i < iE; i++) {
                g0 g0VarJ = J(this.f5347e.d(i));
                if (!g0VarJ.shouldIgnore() && (!g0VarJ.isInvalid() || this.f5360l.hasStableIds())) {
                    L l2 = this.f5344c0;
                    L.b(g0VarJ);
                    g0VarJ.getUnmodifiedPayloads();
                    l2.getClass();
                    C0187n c0187n = new C0187n();
                    c0187n.a(g0VarJ);
                    t0 t0VarA = (t0) c2940i2.get(g0VarJ);
                    if (t0VarA == null) {
                        t0VarA = t0.a();
                        c2940i2.put(g0VarJ, t0VarA);
                    }
                    t0VarA.f5608b = c0187n;
                    t0VarA.f5607a |= 4;
                    if (d0Var.f5449h && g0VarJ.isUpdated() && !g0VarJ.isRemoved() && !g0VarJ.shouldIgnore() && !g0VarJ.isInvalid()) {
                        c2938g.h(H(g0VarJ), g0VarJ);
                    }
                }
            }
        }
        if (d0Var.f5451k) {
            int iH = this.f5347e.h();
            for (int i3 = 0; i3 < iH; i3++) {
                g0 g0VarJ2 = J(this.f5347e.g(i3));
                if (!g0VarJ2.shouldIgnore()) {
                    g0VarJ2.saveOldPosition();
                }
            }
            boolean z6 = d0Var.f5447f;
            d0Var.f5447f = false;
            this.f5362m.onLayoutChildren(this.f5342b, d0Var);
            d0Var.f5447f = z6;
            for (int i6 = 0; i6 < this.f5347e.e(); i6++) {
                g0 g0VarJ3 = J(this.f5347e.d(i6));
                if (!g0VarJ3.shouldIgnore() && ((t0Var = (t0) c2940i2.get(g0VarJ3)) == null || (t0Var.f5607a & 4) == 0)) {
                    L.b(g0VarJ3);
                    boolean zHasAnyOfTheFlags = g0VarJ3.hasAnyOfTheFlags(8192);
                    L l6 = this.f5344c0;
                    g0VarJ3.getUnmodifiedPayloads();
                    l6.getClass();
                    C0187n c0187n2 = new C0187n();
                    c0187n2.a(g0VarJ3);
                    if (zHasAnyOfTheFlags) {
                        X(g0VarJ3, c0187n2);
                    } else {
                        t0 t0VarA2 = (t0) c2940i2.get(g0VarJ3);
                        if (t0VarA2 == null) {
                            t0VarA2 = t0.a();
                            c2940i2.put(g0VarJ3, t0VarA2);
                        }
                        t0VarA2.f5607a |= 2;
                        t0VarA2.f5608b = c0187n2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        S(true);
        g0(false);
        d0Var.f5445d = 2;
    }

    public final void r() {
        f0();
        R();
        d0 d0Var = this.f5372u0;
        d0Var.a(6);
        this.f5345d.d();
        d0Var.f5446e = this.f5360l.getItemCount();
        d0Var.f5444c = 0;
        if (this.f5343c != null && this.f5360l.canRestoreState()) {
            Parcelable parcelable = this.f5343c.f5418c;
            if (parcelable != null) {
                this.f5362m.onRestoreInstanceState(parcelable);
            }
            this.f5343c = null;
        }
        d0Var.f5448g = false;
        this.f5362m.onLayoutChildren(this.f5342b, d0Var);
        d0Var.f5447f = false;
        d0Var.f5450j = d0Var.f5450j && this.f5344c0 != null;
        d0Var.f5445d = 4;
        S(true);
        g0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z6) {
        g0 g0VarJ = J(view);
        if (g0VarJ != null) {
            if (g0VarJ.isTmpDetached()) {
                g0VarJ.clearTmpDetachFlag();
            } else if (!g0VarJ.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(g0VarJ);
                throw new IllegalArgumentException(A.f.j(this, sb));
            }
        }
        view.clearAnimation();
        o(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f5362m.onRequestChildFocus(this, this.f5372u0, view, view2) && view2 != null) {
            Y(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f5362m.requestChildRectangleOnScreen(this, view, rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        ArrayList arrayList = this.f5311D;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0317n) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5321I != 0 || this.f5325K) {
            this.f5323J = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s(int i, int i3, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i3, i6, iArr, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i3) {
        Q q3 = this.f5362m;
        if (q3 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5325K) {
            return;
        }
        boolean zCanScrollHorizontally = q3.canScrollHorizontally();
        boolean zCanScrollVertically = this.f5362m.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i3 = 0;
            }
            a0(i, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!N()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.M |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(i0 i0Var) {
        this.f5308B0 = i0Var;
        R.O.m(this, i0Var);
    }

    public void setAdapter(G g2) {
        setLayoutFrozen(false);
        G g6 = this.f5360l;
        L3.j jVar = this.f5340a;
        if (g6 != null) {
            g6.unregisterAdapterDataObserver(jVar);
            this.f5360l.onDetachedFromRecyclerView(this);
        }
        L l2 = this.f5344c0;
        if (l2 != null) {
            l2.e();
        }
        Q q3 = this.f5362m;
        X x6 = this.f5342b;
        if (q3 != null) {
            q3.removeAndRecycleAllViews(x6);
            this.f5362m.removeAndRecycleScrapInt(x6);
        }
        x6.f5410a.clear();
        x6.e();
        C0305b c0305b = this.f5345d;
        c0305b.q((ArrayList) c0305b.f5432c);
        c0305b.q((ArrayList) c0305b.f5433d);
        c0305b.f5430a = 0;
        G g7 = this.f5360l;
        this.f5360l = g2;
        if (g2 != null) {
            g2.registerAdapterDataObserver(jVar);
            g2.onAttachedToRecyclerView(this);
        }
        Q q6 = this.f5362m;
        if (q6 != null) {
            q6.onAdapterChanged(g7, this.f5360l);
        }
        G g8 = this.f5360l;
        x6.f5410a.clear();
        x6.e();
        W wC = x6.c();
        if (g7 != null) {
            wC.f5409b--;
        }
        if (wC.f5409b == 0) {
            SparseArray sparseArray = wC.f5408a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((V) sparseArray.valueAt(i)).f5404a.clear();
            }
        }
        if (g8 != null) {
            wC.f5409b++;
        }
        this.f5372u0.f5447f = true;
        W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(J j6) {
        if (j6 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f5351g) {
            this.b0 = null;
            this.f5339W = null;
            this.f5341a0 = null;
            this.f5338V = null;
        }
        this.f5351g = z6;
        super.setClipToPadding(z6);
        if (this.f5319H) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(K k6) {
        k6.getClass();
        this.f5337U = k6;
        this.b0 = null;
        this.f5339W = null;
        this.f5341a0 = null;
        this.f5338V = null;
    }

    public void setHasFixedSize(boolean z6) {
        this.f5317G = z6;
    }

    public void setItemAnimator(L l2) {
        L l6 = this.f5344c0;
        if (l6 != null) {
            l6.e();
            this.f5344c0.f5292a = null;
        }
        this.f5344c0 = l2;
        if (l2 != null) {
            l2.f5292a = this.f5376z0;
        }
    }

    public void setItemViewCacheSize(int i) {
        X x6 = this.f5342b;
        x6.f5414e = i;
        x6.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(Q q3) {
        if (q3 == this.f5362m) {
            return;
        }
        setScrollState(0);
        f0 f0Var = this.f5369r0;
        f0Var.f5472g.removeCallbacks(f0Var);
        f0Var.f5468c.abortAnimation();
        Q q6 = this.f5362m;
        if (q6 != null) {
            q6.stopSmoothScroller();
        }
        Q q7 = this.f5362m;
        X x6 = this.f5342b;
        if (q7 != null) {
            L l2 = this.f5344c0;
            if (l2 != null) {
                l2.e();
            }
            this.f5362m.removeAndRecycleAllViews(x6);
            this.f5362m.removeAndRecycleScrapInt(x6);
            x6.f5410a.clear();
            x6.e();
            if (this.f5315F) {
                this.f5362m.dispatchDetachedFromWindow(this, x6);
            }
            this.f5362m.setRecyclerView(null);
            this.f5362m = null;
        } else {
            x6.f5410a.clear();
            x6.e();
        }
        C0306c c0306c = this.f5347e;
        RecyclerView recyclerView = c0306c.f5436a.f5281a;
        c0306c.f5437b.B();
        ArrayList arrayList = c0306c.f5438c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g0 g0VarJ = J((View) arrayList.get(size));
            if (g0VarJ != null) {
                g0VarJ.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f5362m = q3;
        if (q3 != null) {
            if (q3.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(q3);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(A.f.j(q3.mRecyclerView, sb));
            }
            q3.setRecyclerView(this);
            if (this.f5315F) {
                this.f5362m.dispatchAttachedToWindow(this);
            }
        }
        x6.l();
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
    public void setNestedScrollingEnabled(boolean z6) {
        C0184k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3343d) {
            ViewGroup viewGroup = scrollingChildHelper.f3342c;
            WeakHashMap weakHashMap = R.O.f3270a;
            R.F.l(viewGroup);
        }
        scrollingChildHelper.f3343d = z6;
    }

    public void setOnFlingListener(T t6) {
        this.f5361l0 = t6;
    }

    @Deprecated
    public void setOnScrollListener(U u6) {
        this.v0 = u6;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f5368q0 = z6;
    }

    public void setRecycledViewPool(W w6) {
        X x6 = this.f5342b;
        if (x6.f5416g != null) {
            r1.f5409b--;
        }
        x6.f5416g = w6;
        if (w6 == null || x6.f5417h.getAdapter() == null) {
            return;
        }
        x6.f5416g.f5409b++;
    }

    @Deprecated
    public void setRecyclerListener(Y y3) {
    }

    public void setScrollState(int i) {
        if (i == this.f5346d0) {
            return;
        }
        this.f5346d0 = i;
        if (i != 2) {
            f0 f0Var = this.f5369r0;
            f0Var.f5472g.removeCallbacks(f0Var);
            f0Var.f5468c.abortAnimation();
            Q q3 = this.f5362m;
            if (q3 != null) {
                q3.stopSmoothScroller();
            }
        }
        Q q6 = this.f5362m;
        if (q6 != null) {
            q6.onScrollStateChanged(i);
        }
        U u6 = this.v0;
        if (u6 != null) {
            u6.onScrollStateChanged(this, i);
        }
        ArrayList arrayList = this.f5373w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((U) this.f5373w0.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f5359k0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f5359k0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(e0 e0Var) {
        this.f5342b.getClass();
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
    public final void suppressLayout(boolean z6) {
        if (z6 != this.f5325K) {
            i("Do not suppressLayout in layout or scroll");
            if (!z6) {
                this.f5325K = false;
                if (this.f5323J && this.f5362m != null && this.f5360l != null) {
                    requestLayout();
                }
                this.f5323J = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5325K = true;
            this.f5327L = true;
            setScrollState(0);
            f0 f0Var = this.f5369r0;
            f0Var.f5472g.removeCallbacks(f0Var);
            f0Var.f5468c.abortAnimation();
            Q q3 = this.f5362m;
            if (q3 != null) {
                q3.stopSmoothScroller();
            }
        }
    }

    public final void t(int i, int i3, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().d(i, i3, i6, i7, iArr, i8, iArr2);
    }

    public final void u(int i, int i3) {
        this.f5336T++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i3);
        U u6 = this.v0;
        if (u6 != null) {
            u6.onScrolled(this, i, i3);
        }
        ArrayList arrayList = this.f5373w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((U) this.f5373w0.get(size)).onScrolled(this, i, i3);
            }
        }
        this.f5336T--;
    }

    public final void v() {
        if (this.b0 != null) {
            return;
        }
        this.f5337U.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.b0 = edgeEffect;
        if (this.f5351g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void w() {
        if (this.f5338V != null) {
            return;
        }
        this.f5337U.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5338V = edgeEffect;
        if (this.f5351g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f5341a0 != null) {
            return;
        }
        this.f5337U.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5341a0 = edgeEffect;
        if (this.f5351g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y() {
        if (this.f5339W != null) {
            return;
        }
        this.f5337U.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5339W = edgeEffect;
        if (this.f5351g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String z() {
        return " " + super.toString() + ", adapter:" + this.f5360l + ", layout:" + this.f5362m + ", context:" + getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        float fA;
        char c6;
        int i3;
        char c7;
        boolean z6;
        int i6;
        TypedArray typedArray;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.f5340a = new L3.j(2, this);
        this.f5342b = new X(this);
        this.f5349f = new V2.h(17);
        this.f5353h = new D(this, 0);
        this.i = new Rect();
        this.f5356j = new Rect();
        this.f5358k = new RectF();
        this.f5364n = new ArrayList();
        this.f5309C = new ArrayList();
        this.f5311D = new ArrayList();
        this.f5321I = 0;
        this.f5333Q = false;
        this.f5334R = false;
        this.f5335S = 0;
        this.f5336T = 0;
        this.f5337U = new K();
        C0313j c0313j = new C0313j();
        c0313j.f5292a = null;
        c0313j.f5293b = new ArrayList();
        c0313j.f5294c = 120L;
        c0313j.f5295d = 120L;
        c0313j.f5296e = 250L;
        c0313j.f5297f = 250L;
        c0313j.f5496g = true;
        c0313j.f5497h = new ArrayList();
        c0313j.i = new ArrayList();
        c0313j.f5498j = new ArrayList();
        c0313j.f5499k = new ArrayList();
        c0313j.f5500l = new ArrayList();
        c0313j.f5501m = new ArrayList();
        c0313j.f5502n = new ArrayList();
        c0313j.f5503o = new ArrayList();
        c0313j.f5504p = new ArrayList();
        c0313j.f5505q = new ArrayList();
        c0313j.f5506r = new ArrayList();
        this.f5344c0 = c0313j;
        this.f5346d0 = 0;
        this.f5348e0 = -1;
        this.f5366o0 = Float.MIN_VALUE;
        this.f5367p0 = Float.MIN_VALUE;
        this.f5368q0 = true;
        this.f5369r0 = new f0(this);
        this.f5371t0 = new C0318o();
        d0 d0Var = new d0();
        d0Var.f5442a = -1;
        d0Var.f5443b = 0;
        d0Var.f5444c = 0;
        d0Var.f5445d = 1;
        d0Var.f5446e = 0;
        d0Var.f5447f = false;
        d0Var.f5448g = false;
        d0Var.f5449h = false;
        d0Var.i = false;
        d0Var.f5450j = false;
        d0Var.f5451k = false;
        this.f5372u0 = d0Var;
        this.f5374x0 = false;
        this.f5375y0 = false;
        E e6 = new E(this);
        this.f5376z0 = e6;
        this.f5307A0 = false;
        this.f5310C0 = new int[2];
        this.f5314E0 = new int[2];
        this.f5316F0 = new int[2];
        this.f5318G0 = new int[2];
        this.f5320H0 = new ArrayList();
        this.f5322I0 = new D(this, 1);
        this.f5326K0 = 0;
        this.f5328L0 = 0;
        this.f5329M0 = new E(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5359k0 = viewConfiguration.getScaledTouchSlop();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            Method method = R.P.f3276a;
            fA = H.a.b(viewConfiguration);
        } else {
            fA = R.P.a(viewConfiguration, context);
        }
        this.f5366o0 = fA;
        this.f5367p0 = i7 >= 26 ? H.a.c(viewConfiguration) : R.P.a(viewConfiguration, context);
        this.f5363m0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5365n0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5344c0.f5292a = e6;
        this.f5345d = new C0305b(new E(this));
        this.f5347e = new C0306c(new E(this));
        WeakHashMap weakHashMap = R.O.f3270a;
        if ((i7 >= 26 ? R.I.a(this) : 0) == 0 && i7 >= 26) {
            R.I.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f5331O = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new i0(this));
        int[] iArr = B0.a.f518a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        R.O.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5351g = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(A.f.j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c7 = 2;
            z6 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            c6 = 3;
            i3 = 4;
            i6 = i;
            new C0317n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.apm.insight.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.apm.insight.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.apm.insight.R.dimen.fastscroll_margin));
        } else {
            c6 = 3;
            i3 = 4;
            c7 = 2;
            z6 = 1;
            i6 = i;
            typedArray = typedArrayObtainStyledAttributes;
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
                    Class clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(Q.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f5305O0);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = context;
                        objArr2[z6] = attributeSet;
                        objArr2[c7] = Integer.valueOf(i6);
                        objArr2[c6] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e7) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e8) {
                            e8.initCause(e7);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e8);
                        }
                    }
                    constructor.setAccessible(z6);
                    setLayoutManager((Q) constructor.newInstance(objArr));
                } catch (ClassCastException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e9);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e11);
                } catch (InstantiationException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                }
            }
        }
        int[] iArr2 = f5304N0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i6, 0);
        R.O.l(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i6);
        boolean z7 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z7);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Q q3 = this.f5362m;
        if (q3 != null) {
            return q3.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(A.f.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
