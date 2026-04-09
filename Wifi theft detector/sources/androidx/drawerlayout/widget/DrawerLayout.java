package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.r;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS.SimpleResolver;
import s0.a0;
import s0.x;
import y0.c;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] L = {R.attr.colorPrimaryDark};
    public static final int[] M = {R.attr.layout_gravity};
    public static final boolean N;
    public static final boolean O;
    public static boolean P;
    public CharSequence A;
    public Object B;
    public boolean C;
    public Drawable D;
    public Drawable E;
    public Drawable F;
    public Drawable G;
    public final ArrayList H;
    public Rect I;
    public Matrix J;
    public final a0 K;

    /* renamed from: a, reason: collision with root package name */
    public final d f2928a;

    /* renamed from: b, reason: collision with root package name */
    public float f2929b;

    /* renamed from: c, reason: collision with root package name */
    public int f2930c;

    /* renamed from: d, reason: collision with root package name */
    public int f2931d;

    /* renamed from: e, reason: collision with root package name */
    public float f2932e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f2933f;

    /* renamed from: g, reason: collision with root package name */
    public final y0.c f2934g;

    /* renamed from: h, reason: collision with root package name */
    public final y0.c f2935h;

    /* renamed from: i, reason: collision with root package name */
    public final h f2936i;

    /* renamed from: j, reason: collision with root package name */
    public final h f2937j;

    /* renamed from: k, reason: collision with root package name */
    public int f2938k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2939l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2940m;

    /* renamed from: n, reason: collision with root package name */
    public int f2941n;

    /* renamed from: o, reason: collision with root package name */
    public int f2942o;

    /* renamed from: p, reason: collision with root package name */
    public int f2943p;

    /* renamed from: q, reason: collision with root package name */
    public int f2944q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2945r;

    /* renamed from: s, reason: collision with root package name */
    public e f2946s;

    /* renamed from: t, reason: collision with root package name */
    public List f2947t;

    /* renamed from: u, reason: collision with root package name */
    public float f2948u;

    /* renamed from: v, reason: collision with root package name */
    public float f2949v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f2950w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f2951x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f2952y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f2953z;

    public class a implements a0 {
        public a() {
        }

        @Override // s0.a0
        public boolean a(View view, a0.a aVar) {
            if (!DrawerLayout.this.D(view) || DrawerLayout.this.r(view) == 2) {
                return false;
            }
            DrawerLayout.this.f(view);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        public b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        public final Rect f2961d = new Rect();

        public c() {
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = DrawerLayout.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = DrawerLayout.this.s(DrawerLayout.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.a
        public void g(View view, x xVar) {
            if (DrawerLayout.N) {
                super.g(view, xVar);
            } else {
                x xVarB0 = x.b0(xVar);
                super.g(view, xVarB0);
                xVar.K0(view);
                Object objE = ViewCompat.E(view);
                if (objE instanceof View) {
                    xVar.D0((View) objE);
                }
                o(xVar, xVarB0);
                xVarB0.d0();
                n(xVar, (ViewGroup) view);
            }
            xVar.m0("androidx.drawerlayout.widget.DrawerLayout");
            xVar.u0(false);
            xVar.v0(false);
            xVar.e0(x.a.f24196e);
            xVar.e0(x.a.f24197f);
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.N || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void n(x xVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.A(childAt)) {
                    xVar.c(childAt);
                }
            }
        }

        public final void o(x xVar, x xVar2) {
            Rect rect = this.f2961d;
            xVar2.n(rect);
            xVar.j0(rect);
            xVar.P0(xVar2.Y());
            xVar.B0(xVar2.y());
            xVar.m0(xVar2.q());
            xVar.q0(xVar2.t());
            xVar.s0(xVar2.N());
            xVar.v0(xVar2.P());
            xVar.g0(xVar2.I());
            xVar.I0(xVar2.V());
            xVar.a(xVar2.k());
        }
    }

    public static final class d extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            if (DrawerLayout.A(view)) {
                return;
            }
            xVar.D0(null);
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    public static abstract class g implements e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void c(int i10) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view, float f10) {
        }
    }

    public class h extends c.AbstractC0503c {

        /* renamed from: a, reason: collision with root package name */
        public final int f2967a;

        /* renamed from: b, reason: collision with root package name */
        public y0.c f2968b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f2969c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        public h(int i10) {
            this.f2967a = i10;
        }

        @Override // y0.c.AbstractC0503c
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // y0.c.AbstractC0503c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // y0.c.AbstractC0503c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // y0.c.AbstractC0503c
        public void f(int i10, int i11) {
            View viewN = (i10 & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if (viewN == null || DrawerLayout.this.r(viewN) != 0) {
                return;
            }
            this.f2968b.b(viewN, i11);
        }

        @Override // y0.c.AbstractC0503c
        public boolean g(int i10) {
            return false;
        }

        @Override // y0.c.AbstractC0503c
        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f2969c, 160L);
        }

        @Override // y0.c.AbstractC0503c
        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f2965c = false;
            n();
        }

        @Override // y0.c.AbstractC0503c
        public void j(int i10) {
            DrawerLayout.this.X(i10, this.f2968b.v());
        }

        @Override // y0.c.AbstractC0503c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = (DrawerLayout.this.c(view, 3) ? i10 + r3 : DrawerLayout.this.getWidth() - i10) / view.getWidth();
            DrawerLayout.this.U(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // y0.c.AbstractC0503c
        public void l(View view, float f10, float f11) {
            int i10;
            float fU = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f2968b.O(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // y0.c.AbstractC0503c
        public boolean m(View view, int i10) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f2967a) && DrawerLayout.this.r(view) == 0;
        }

        public final void n() {
            View viewN = DrawerLayout.this.n(this.f2967a == 3 ? 5 : 3);
            if (viewN != null) {
                DrawerLayout.this.f(viewN);
            }
        }

        public void o() {
            View viewN;
            int width;
            int iX = this.f2968b.x();
            boolean z10 = this.f2967a == 3;
            if (z10) {
                viewN = DrawerLayout.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iX;
            } else {
                viewN = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - iX;
            }
            if (viewN != null) {
                if (((!z10 || viewN.getLeft() >= width) && (z10 || viewN.getLeft() <= width)) || DrawerLayout.this.r(viewN) != 0) {
                    return;
                }
                f fVar = (f) viewN.getLayoutParams();
                this.f2968b.Q(viewN, width, viewN.getTop());
                fVar.f2965c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f2969c);
        }

        public void q(y0.c cVar) {
            this.f2968b = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        N = true;
        O = true;
        P = i10 >= 29;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    public static boolean A(View view) {
        return (ViewCompat.w(view) == 4 || ViewCompat.w(view) == 2) ? false : true;
    }

    public static String w(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public boolean B(View view) {
        return ((f) view.getLayoutParams()).f2963a == 0;
    }

    public boolean C(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return D(viewN);
        }
        return false;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((f) view.getLayoutParams()).f2966d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean E(View view) {
        int iB = r.b(((f) view.getLayoutParams()).f2963a, ViewCompat.y(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean F(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return G(viewN);
        }
        return false;
    }

    public boolean G(View view) {
        if (E(view)) {
            return ((f) view.getLayoutParams()).f2964b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean H(float f10, float f11, View view) {
        if (this.I == null) {
            this.I = new Rect();
        }
        view.getHitRect(this.I);
        return this.I.contains((int) f10, (int) f11);
    }

    public final void I(Drawable drawable, int i10) {
        if (drawable == null || !k0.a.h(drawable)) {
            return;
        }
        k0.a.m(drawable, i10);
    }

    public void J(View view, float f10) {
        float fU = u(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        U(view, f10);
    }

    public void K(int i10) {
        L(i10, true);
    }

    public void L(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            N(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f2940m) {
            fVar.f2964b = 1.0f;
            fVar.f2966d = 1;
            W(view, true);
            V(view);
        } else if (z10) {
            fVar.f2966d |= 2;
            if (c(view, 3)) {
                this.f2934g.Q(view, 0, view.getTop());
            } else {
                this.f2935h.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            J(view, 1.0f);
            X(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void O(e eVar) {
        List list;
        if (eVar == null || (list = this.f2947t) == null) {
            return;
        }
        list.remove(eVar);
    }

    public final Drawable P() {
        int iY = ViewCompat.y(this);
        if (iY == 0) {
            Drawable drawable = this.D;
            if (drawable != null) {
                I(drawable, iY);
                return this.D;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                I(drawable2, iY);
                return this.E;
            }
        }
        return this.F;
    }

    public final Drawable Q() {
        int iY = ViewCompat.y(this);
        if (iY == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                I(drawable, iY);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.D;
            if (drawable2 != null) {
                I(drawable2, iY);
                return this.D;
            }
        }
        return this.G;
    }

    public final void R() {
        if (O) {
            return;
        }
        this.f2951x = P();
        this.f2952y = Q();
    }

    public void S(Object obj, boolean z10) {
        this.B = obj;
        this.C = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void T(int i10, int i11) {
        View viewN;
        int iB = r.b(i11, ViewCompat.y(this));
        if (i11 == 3) {
            this.f2941n = i10;
        } else if (i11 == 5) {
            this.f2942o = i10;
        } else if (i11 == 8388611) {
            this.f2943p = i10;
        } else if (i11 == 8388613) {
            this.f2944q = i10;
        }
        if (i10 != 0) {
            (iB == 3 ? this.f2934g : this.f2935h).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewN = n(iB)) != null) {
                M(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iB);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    public void U(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f2964b) {
            return;
        }
        fVar.f2964b = f10;
        l(view, f10);
    }

    public final void V(View view) {
        x.a aVar = x.a.f24216y;
        ViewCompat.d0(view, aVar.b());
        if (!D(view) || r(view) == 2) {
            return;
        }
        ViewCompat.f0(view, aVar, null, this.K);
    }

    public final void W(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || E(childAt)) && !(z10 && childAt == view)) {
                ViewCompat.q0(childAt, 4);
            } else {
                ViewCompat.q0(childAt, 1);
            }
        }
    }

    public void X(int i10, View view) {
        int i11;
        int iA = this.f2934g.A();
        int iA2 = this.f2935h.A();
        if (iA == 1 || iA2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (iA != 2 && iA2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f2964b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i11 != this.f2938k) {
            this.f2938k = i11;
            List list = this.f2947t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f2947t.get(size)).c(i11);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f2947t == null) {
            this.f2947t = new ArrayList();
        }
        this.f2947t.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!E(childAt)) {
                this.H.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.H.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) this.H.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() != null || E(view)) {
            ViewCompat.q0(view, 4);
        } else {
            ViewCompat.q0(view, 1);
        }
        if (N) {
            return;
        }
        ViewCompat.j0(view, this.f2928a);
    }

    public void b() {
        if (this.f2945r) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f2945r = true;
    }

    public boolean c(View view, int i10) {
        return (t(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((f) getChildAt(i10).getLayoutParams()).f2964b);
        }
        this.f2932e = fMax;
        boolean zM = this.f2934g.m(true);
        boolean zM2 = this.f2935h.m(true);
        if (zM || zM2) {
            ViewCompat.a0(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2932e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (H(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f2932e;
        if (f10 > 0.0f && zB) {
            this.f2933f.setColor((this.f2931d & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f2933f);
            return zDrawChild;
        }
        if (this.f2951x != null && c(view, 3)) {
            int intrinsicWidth = this.f2951x.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f2934g.x(), 1.0f));
            this.f2951x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f2951x.setAlpha((int) (fMax * 255.0f));
            this.f2951x.draw(canvas);
            return zDrawChild;
        }
        if (this.f2952y != null && c(view, 5)) {
            int intrinsicWidth2 = this.f2952y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f2935h.x(), 1.0f));
            this.f2952y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f2952y.setAlpha((int) (fMax2 * 255.0f));
            this.f2952y.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            g(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f2940m) {
            fVar.f2964b = 0.0f;
            fVar.f2966d = 0;
        } else if (z10) {
            fVar.f2966d |= 4;
            if (c(view, 3)) {
                this.f2934g.Q(view, -view.getWidth(), view.getTop());
            } else {
                this.f2935h.Q(view, getWidth(), view.getTop());
            }
        } else {
            J(view, 0.0f);
            X(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.f2929b;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2950w;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z10) {
        int childCount = getChildCount();
        boolean zQ = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z10 || fVar.f2965c)) {
                zQ |= c(childAt, 3) ? this.f2934g.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2935h.Q(childAt, getWidth(), childAt.getTop());
                fVar.f2965c = false;
            }
        }
        this.f2936i.p();
        this.f2937j.p();
        if (zQ) {
            invalidate();
        }
    }

    public void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f2966d & 1) == 1) {
            fVar.f2966d = 0;
            List list = this.f2947t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f2947t.get(size)).b(view);
                }
            }
            W(view, false);
            V(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f2966d & 1) == 0) {
            fVar.f2966d = 1;
            List list = this.f2947t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f2947t.get(size)).a(view);
                }
            }
            W(view, true);
            V(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f10) {
        List list = this.f2947t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.f2947t.get(size)).d(view, f10);
            }
        }
    }

    public final boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    public View n(int i10) {
        int iB = r.b(i10, ViewCompat.y(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f2966d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2940m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2940m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.C || this.f2950w == null) {
            return;
        }
        Object obj = this.B;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f2950w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f2950w.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            y0.c r1 = r6.f2934g
            boolean r1 = r1.P(r7)
            y0.c r2 = r6.f2935h
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            y0.c r7 = r6.f2934g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f2936i
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f2937j
            r7.p()
            goto L36
        L31:
            r6.i(r2)
            r6.f2945r = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2948u = r0
            r6.f2949v = r7
            float r4 = r6.f2932e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            y0.c r4 = r6.f2934g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f2945r = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.y()
            if (r7 != 0) goto L70
            boolean r7 = r6.f2945r
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !z()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.f2939l = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f2964b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i15 - r11) / f12;
                        i14 = i15 - ((int) (fVar.f2964b * f12));
                    }
                    boolean z12 = f10 != fVar.f2964b ? z11 : false;
                    int i18 = fVar.f2963a & 112;
                    if (i18 == 16) {
                        int i19 = i13 - i11;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i22 > i19 - i23) {
                                i20 = (i19 - i23) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight + i24);
                    } else {
                        int i25 = i13 - i11;
                        childAt.layout(i14, (i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z12) {
                        U(childAt, f10);
                    }
                    int i26 = fVar.f2964b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (P && (rootWindowInsets = getRootWindowInsets()) != null) {
            j0.b bVarH = WindowInsetsCompat.w(rootWindowInsets).h();
            y0.c cVar = this.f2934g;
            cVar.L(Math.max(cVar.w(), bVarH.f21686a));
            y0.c cVar2 = this.f2935h;
            cVar2.L(Math.max(cVar2.w(), bVarH.f21688c));
        }
        this.f2939l = false;
        this.f2940m = false;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.B != null && ViewCompat.v(this);
        int iY = ViewCompat.y(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int iB = r.b(fVar.f2963a, iY);
                    if (ViewCompat.v(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.B;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.B;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!E(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (O) {
                        float fT = ViewCompat.t(childAt);
                        float f10 = this.f2929b;
                        if (fT != f10) {
                            ViewCompat.p0(childAt, f10);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z13 = iT == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f2930c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        int i10 = savedState.f2954c;
        if (i10 != 0 && (viewN = n(i10)) != null) {
            M(viewN);
        }
        int i11 = savedState.f2955d;
        if (i11 != 3) {
            T(i11, 3);
        }
        int i12 = savedState.f2956e;
        if (i12 != 3) {
            T(i12, 5);
        }
        int i13 = savedState.f2957f;
        if (i13 != 3) {
            T(i13, 8388611);
        }
        int i14 = savedState.f2958g;
        if (i14 != 3) {
            T(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        R();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f2966d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                savedState.f2954c = fVar.f2963a;
                break;
            }
        }
        savedState.f2955d = this.f2941n;
        savedState.f2956e = this.f2942o;
        savedState.f2957f = this.f2943p;
        savedState.f2958g = this.f2944q;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            y0.c r0 = r6.f2934g
            r0.F(r7)
            y0.c r0 = r6.f2935h
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.i(r2)
            r6.f2945r = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            y0.c r3 = r6.f2934g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f2948u
            float r0 = r0 - r3
            float r3 = r6.f2949v
            float r7 = r7 - r3
            y0.c r3 = r6.f2934g
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5a
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.i(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2948u = r0
            r6.f2949v = r7
            r6.f2945r = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int iY = ViewCompat.y(this);
        if (i10 == 3) {
            int i11 = this.f2941n;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iY == 0 ? this.f2943p : this.f2944q;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f2942o;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iY == 0 ? this.f2944q : this.f2943p;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f2943p;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iY == 0 ? this.f2941n : this.f2942o;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f2944q;
        if (i17 != 3) {
            return i17;
        }
        int i18 = iY == 0 ? this.f2942o : this.f2941n;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public int r(View view) {
        if (E(view)) {
            return q(((f) view.getLayoutParams()).f2963a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f2939l) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i10) {
        int iB = r.b(i10, ViewCompat.y(this));
        if (iB == 3) {
            return this.f2953z;
        }
        if (iB == 5) {
            return this.A;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.f2929b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt)) {
                ViewCompat.p0(childAt, this.f2929b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f2946s;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f2946s = eVar;
    }

    public void setDrawerLockMode(int i10) {
        T(i10, 3);
        T(i10, 5);
    }

    public void setScrimColor(@ColorInt int i10) {
        this.f2931d = i10;
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f2950w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i10) {
        this.f2950w = new ColorDrawable(i10);
        invalidate();
    }

    public int t(View view) {
        return r.b(((f) view.getLayoutParams()).f2963a, ViewCompat.y(this));
    }

    public float u(View view) {
        return ((f) view.getLayoutParams()).f2964b;
    }

    public final MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.J == null) {
                this.J = new Matrix();
            }
            matrix.invert(this.J);
            motionEventObtain.transform(this.J);
        }
        return motionEventObtain;
    }

    public final boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f2965c) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return p() != null;
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c1.a.drawerLayoutStyle);
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2928a = new d();
        this.f2931d = -1728053248;
        this.f2933f = new Paint();
        this.f2940m = true;
        this.f2941n = 3;
        this.f2942o = 3;
        this.f2943p = 3;
        this.f2944q = 3;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.K = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f2930c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        h hVar = new h(3);
        this.f2936i = hVar;
        h hVar2 = new h(5);
        this.f2937j = hVar2;
        y0.c cVarN = y0.c.n(this, 1.0f, hVar);
        this.f2934g = cVarN;
        cVarN.M(1);
        cVarN.N(f11);
        hVar.q(cVarN);
        y0.c cVarN2 = y0.c.n(this, 1.0f, hVar2);
        this.f2935h = cVarN2;
        cVarN2.M(2);
        cVarN2.N(f11);
        hVar2.q(cVarN2);
        setFocusableInTouchMode(true);
        ViewCompat.q0(this, 1);
        ViewCompat.j0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.v(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(L);
            try {
                this.f2950w = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c1.c.DrawerLayout, i10, 0);
        try {
            int i11 = c1.c.DrawerLayout_elevation;
            if (typedArrayObtainStyledAttributes2.hasValue(i11)) {
                this.f2929b = typedArrayObtainStyledAttributes2.getDimension(i11, 0.0f);
            } else {
                this.f2929b = getResources().getDimension(c1.b.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.H = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f2950w = i10 != 0 ? ContextCompat.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f2963a;

        /* renamed from: b, reason: collision with root package name */
        public float f2964b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2965c;

        /* renamed from: d, reason: collision with root package name */
        public int f2966d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2963a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.M);
            this.f2963a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
            this.f2963a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f2963a = 0;
            this.f2963a = fVar.f2963a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2963a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2963a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f2954c;

        /* renamed from: d, reason: collision with root package name */
        public int f2955d;

        /* renamed from: e, reason: collision with root package name */
        public int f2956e;

        /* renamed from: f, reason: collision with root package name */
        public int f2957f;

        /* renamed from: g, reason: collision with root package name */
        public int f2958g;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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
            this.f2954c = 0;
            this.f2954c = parcel.readInt();
            this.f2955d = parcel.readInt();
            this.f2956e = parcel.readInt();
            this.f2957f = parcel.readInt();
            this.f2958g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2954c);
            parcel.writeInt(this.f2955d);
            parcel.writeInt(this.f2956e);
            parcel.writeInt(this.f2957f);
            parcel.writeInt(this.f2958g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f2954c = 0;
        }
    }
}
