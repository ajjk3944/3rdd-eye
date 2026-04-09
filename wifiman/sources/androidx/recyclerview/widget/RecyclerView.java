package androidx.recyclerview.widget;

import F1.C2736a;
import F1.W;
import F1.Z;
import G1.t;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import f.AbstractC5487d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l2.AbstractC6540a;
import l2.AbstractC6541b;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: N1, reason: collision with root package name */
    private static final int[] f31846N1 = {R.attr.nestedScrollingEnabled};

    /* renamed from: O1, reason: collision with root package name */
    static final boolean f31847O1 = false;

    /* renamed from: P1, reason: collision with root package name */
    static final boolean f31848P1 = true;

    /* renamed from: Q1, reason: collision with root package name */
    static final boolean f31849Q1 = true;

    /* renamed from: R1, reason: collision with root package name */
    static final boolean f31850R1 = true;

    /* renamed from: S1, reason: collision with root package name */
    private static final boolean f31851S1 = false;

    /* renamed from: T1, reason: collision with root package name */
    private static final boolean f31852T1 = false;

    /* renamed from: U1, reason: collision with root package name */
    private static final Class[] f31853U1;

    /* renamed from: V1, reason: collision with root package name */
    static final Interpolator f31854V1;

    /* renamed from: A, reason: collision with root package name */
    private final AccessibilityManager f31855A;

    /* renamed from: A1, reason: collision with root package name */
    boolean f31856A1;

    /* renamed from: B, reason: collision with root package name */
    private List f31857B;

    /* renamed from: B1, reason: collision with root package name */
    boolean f31858B1;

    /* renamed from: C, reason: collision with root package name */
    boolean f31859C;

    /* renamed from: C1, reason: collision with root package name */
    private l.a f31860C1;

    /* renamed from: D, reason: collision with root package name */
    boolean f31861D;

    /* renamed from: D1, reason: collision with root package name */
    boolean f31862D1;

    /* renamed from: E, reason: collision with root package name */
    private int f31863E;

    /* renamed from: E1, reason: collision with root package name */
    androidx.recyclerview.widget.l f31864E1;

    /* renamed from: F, reason: collision with root package name */
    private int f31865F;

    /* renamed from: F1, reason: collision with root package name */
    private final int[] f31866F1;

    /* renamed from: G, reason: collision with root package name */
    private k f31867G;

    /* renamed from: G1, reason: collision with root package name */
    private F1.B f31868G1;

    /* renamed from: H, reason: collision with root package name */
    private EdgeEffect f31869H;

    /* renamed from: H1, reason: collision with root package name */
    private final int[] f31870H1;

    /* renamed from: I, reason: collision with root package name */
    private EdgeEffect f31871I;

    /* renamed from: I1, reason: collision with root package name */
    private final int[] f31872I1;

    /* renamed from: J, reason: collision with root package name */
    private EdgeEffect f31873J;

    /* renamed from: J1, reason: collision with root package name */
    final int[] f31874J1;

    /* renamed from: K1, reason: collision with root package name */
    final List f31875K1;

    /* renamed from: L1, reason: collision with root package name */
    private Runnable f31876L1;

    /* renamed from: M1, reason: collision with root package name */
    private final q.b f31877M1;

    /* renamed from: N, reason: collision with root package name */
    private EdgeEffect f31878N;

    /* renamed from: a, reason: collision with root package name */
    private final w f31879a;

    /* renamed from: b, reason: collision with root package name */
    final u f31880b;

    /* renamed from: c, reason: collision with root package name */
    private x f31881c;

    /* renamed from: d, reason: collision with root package name */
    a f31882d;

    /* renamed from: e, reason: collision with root package name */
    b f31883e;

    /* renamed from: f, reason: collision with root package name */
    final androidx.recyclerview.widget.q f31884f;

    /* renamed from: f1, reason: collision with root package name */
    l f31885f1;

    /* renamed from: g, reason: collision with root package name */
    boolean f31886g;

    /* renamed from: g1, reason: collision with root package name */
    private int f31887g1;

    /* renamed from: h, reason: collision with root package name */
    final Runnable f31888h;

    /* renamed from: h1, reason: collision with root package name */
    private int f31889h1;

    /* renamed from: i, reason: collision with root package name */
    final Rect f31890i;

    /* renamed from: i1, reason: collision with root package name */
    private VelocityTracker f31891i1;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f31892j;

    /* renamed from: j1, reason: collision with root package name */
    private int f31893j1;

    /* renamed from: k, reason: collision with root package name */
    final RectF f31894k;

    /* renamed from: k1, reason: collision with root package name */
    private int f31895k1;

    /* renamed from: l, reason: collision with root package name */
    g f31896l;

    /* renamed from: l1, reason: collision with root package name */
    private int f31897l1;

    /* renamed from: m, reason: collision with root package name */
    o f31898m;

    /* renamed from: m1, reason: collision with root package name */
    private int f31899m1;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f31900n;

    /* renamed from: n1, reason: collision with root package name */
    private int f31901n1;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f31902o;

    /* renamed from: o1, reason: collision with root package name */
    private q f31903o1;

    /* renamed from: p, reason: collision with root package name */
    private r f31904p;

    /* renamed from: p1, reason: collision with root package name */
    private final int f31905p1;

    /* renamed from: q, reason: collision with root package name */
    boolean f31906q;

    /* renamed from: q1, reason: collision with root package name */
    private final int f31907q1;

    /* renamed from: r, reason: collision with root package name */
    boolean f31908r;

    /* renamed from: r1, reason: collision with root package name */
    private float f31909r1;

    /* renamed from: s, reason: collision with root package name */
    boolean f31910s;

    /* renamed from: s1, reason: collision with root package name */
    private float f31911s1;

    /* renamed from: t, reason: collision with root package name */
    boolean f31912t;

    /* renamed from: t1, reason: collision with root package name */
    private boolean f31913t1;

    /* renamed from: u, reason: collision with root package name */
    private int f31914u;

    /* renamed from: u1, reason: collision with root package name */
    final B f31915u1;

    /* renamed from: v, reason: collision with root package name */
    boolean f31916v;

    /* renamed from: v1, reason: collision with root package name */
    androidx.recyclerview.widget.e f31917v1;

    /* renamed from: w, reason: collision with root package name */
    boolean f31918w;

    /* renamed from: w1, reason: collision with root package name */
    e.b f31919w1;

    /* renamed from: x, reason: collision with root package name */
    private boolean f31920x;

    /* renamed from: x1, reason: collision with root package name */
    final z f31921x1;

    /* renamed from: y, reason: collision with root package name */
    private int f31922y;

    /* renamed from: y1, reason: collision with root package name */
    private s f31923y1;

    /* renamed from: z, reason: collision with root package name */
    boolean f31924z;

    /* renamed from: z1, reason: collision with root package name */
    private List f31925z1;

    public static abstract class A {
    }

    class B implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f31926a;

        /* renamed from: b, reason: collision with root package name */
        private int f31927b;

        /* renamed from: c, reason: collision with root package name */
        OverScroller f31928c;

        /* renamed from: d, reason: collision with root package name */
        Interpolator f31929d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f31930e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f31931f;

        B() {
            Interpolator interpolator = RecyclerView.f31854V1;
            this.f31929d = interpolator;
            this.f31930e = false;
            this.f31931f = false;
            this.f31928c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11, int i12, int i13) {
            int iRound;
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i12 * i12) + (i13 * i13));
            int iSqrt2 = (int) Math.sqrt((i10 * i10) + (i11 * i11));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i14 = width / 2;
            float f10 = width;
            float f11 = i14;
            float fB = f11 + (b(Math.min(1.0f, (iSqrt2 * 1.0f) / f10)) * f11);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fB / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f10) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        private float b(float f10) {
            return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            W.e0(RecyclerView.this, this);
        }

        public void c(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f31927b = 0;
            this.f31926a = 0;
            Interpolator interpolator = this.f31929d;
            Interpolator interpolator2 = RecyclerView.f31854V1;
            if (interpolator != interpolator2) {
                this.f31929d = interpolator2;
                this.f31928c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f31928c.fling(0, 0, i10, i11, PduHandle.NONE, MPv3.MAX_MESSAGE_ID, PduHandle.NONE, MPv3.MAX_MESSAGE_ID);
            e();
        }

        void e() {
            if (this.f31930e) {
                this.f31931f = true;
            } else {
                d();
            }
        }

        public void f(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11, 0, 0);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f31854V1;
            }
            if (this.f31929d != interpolator) {
                this.f31929d = interpolator;
                this.f31928c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f31927b = 0;
            this.f31926a = 0;
            RecyclerView.this.setScrollState(2);
            this.f31928c.startScroll(0, 0, i10, i11, i13);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f31928c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f31898m == null) {
                g();
                return;
            }
            this.f31931f = false;
            this.f31930e = true;
            recyclerView.u();
            OverScroller overScroller = this.f31928c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f31926a;
                int i13 = currY - this.f31927b;
                this.f31926a = currX;
                this.f31927b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f31874J1;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f31874J1;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f31896l != null) {
                    int[] iArr3 = recyclerView3.f31874J1;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.f1(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f31874J1;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    i12 -= i11;
                    i13 -= i10;
                    y yVar = recyclerView4.f31898m.f31976g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int iB = RecyclerView.this.f31921x1.b();
                        if (iB == 0) {
                            yVar.r();
                        } else if (yVar.f() >= iB) {
                            yVar.p(iB - 1);
                            yVar.j(i11, i10);
                        } else {
                            yVar.j(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.f31900n.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f31874J1;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i11, i10, i12, i13, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f31874J1;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.I(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                y yVar2 = RecyclerView.this.f31898m.f31976g;
                if ((yVar2 == null || !yVar2.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i16, currVelocity);
                    }
                    if (RecyclerView.f31850R1) {
                        RecyclerView.this.f31919w1.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f31917v1;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i11, i10);
                    }
                }
            }
            y yVar3 = RecyclerView.this.f31898m.f31976g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.f31930e = false;
            if (this.f31931f) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.s1(1);
            }
        }
    }

    public static abstract class C {

        /* renamed from: s, reason: collision with root package name */
        private static final List f31933s = Collections.emptyList();

        /* renamed from: a, reason: collision with root package name */
        public final View f31934a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference f31935b;

        /* renamed from: j, reason: collision with root package name */
        int f31943j;

        /* renamed from: r, reason: collision with root package name */
        RecyclerView f31951r;

        /* renamed from: c, reason: collision with root package name */
        int f31936c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f31937d = -1;

        /* renamed from: e, reason: collision with root package name */
        long f31938e = -1;

        /* renamed from: f, reason: collision with root package name */
        int f31939f = -1;

        /* renamed from: g, reason: collision with root package name */
        int f31940g = -1;

        /* renamed from: h, reason: collision with root package name */
        C f31941h = null;

        /* renamed from: i, reason: collision with root package name */
        C f31942i = null;

        /* renamed from: k, reason: collision with root package name */
        List f31944k = null;

        /* renamed from: l, reason: collision with root package name */
        List f31945l = null;

        /* renamed from: m, reason: collision with root package name */
        private int f31946m = 0;

        /* renamed from: n, reason: collision with root package name */
        u f31947n = null;

        /* renamed from: o, reason: collision with root package name */
        boolean f31948o = false;

        /* renamed from: p, reason: collision with root package name */
        private int f31949p = 0;

        /* renamed from: q, reason: collision with root package name */
        int f31950q = -1;

        public C(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f31934a = view;
        }

        private void g() {
            if (this.f31944k == null) {
                ArrayList arrayList = new ArrayList();
                this.f31944k = arrayList;
                this.f31945l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i10, boolean z10) {
            if (this.f31937d == -1) {
                this.f31937d = this.f31936c;
            }
            if (this.f31940g == -1) {
                this.f31940g = this.f31936c;
            }
            if (z10) {
                this.f31940g += i10;
            }
            this.f31936c += i10;
            if (this.f31934a.getLayoutParams() != null) {
                ((p) this.f31934a.getLayoutParams()).f31996c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int i10 = this.f31950q;
            if (i10 != -1) {
                this.f31949p = i10;
            } else {
                this.f31949p = W.x(this.f31934a);
            }
            recyclerView.i1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.i1(this, this.f31949p);
            this.f31949p = 0;
        }

        void D() {
            this.f31943j = 0;
            this.f31936c = -1;
            this.f31937d = -1;
            this.f31938e = -1L;
            this.f31940g = -1;
            this.f31946m = 0;
            this.f31941h = null;
            this.f31942i = null;
            d();
            this.f31949p = 0;
            this.f31950q = -1;
            RecyclerView.r(this);
        }

        void E() {
            if (this.f31937d == -1) {
                this.f31937d = this.f31936c;
            }
        }

        void F(int i10, int i11) {
            this.f31943j = (i10 & i11) | (this.f31943j & (~i11));
        }

        public final void G(boolean z10) {
            int i10 = this.f31946m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f31946m = i11;
            if (i11 < 0) {
                this.f31946m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i11 == 1) {
                this.f31943j |= 16;
            } else if (z10 && i11 == 0) {
                this.f31943j &= -17;
            }
        }

        void H(u uVar, boolean z10) {
            this.f31947n = uVar;
            this.f31948o = z10;
        }

        boolean I() {
            return (this.f31943j & 16) != 0;
        }

        boolean J() {
            return (this.f31943j & 128) != 0;
        }

        void K() {
            this.f31947n.J(this);
        }

        boolean L() {
            return (this.f31943j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f31943j) == 0) {
                g();
                this.f31944k.add(obj);
            }
        }

        void b(int i10) {
            this.f31943j = i10 | this.f31943j;
        }

        void c() {
            this.f31937d = -1;
            this.f31940g = -1;
        }

        void d() {
            List list = this.f31944k;
            if (list != null) {
                list.clear();
            }
            this.f31943j &= -1025;
        }

        void e() {
            this.f31943j &= -33;
        }

        void f() {
            this.f31943j &= -257;
        }

        boolean h() {
            return (this.f31943j & 16) == 0 && W.N(this.f31934a);
        }

        void i(int i10, int i11, boolean z10) {
            b(8);
            A(i11, z10);
            this.f31936c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f31951r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long k() {
            return this.f31938e;
        }

        public final int l() {
            return this.f31939f;
        }

        public final int m() {
            int i10 = this.f31940g;
            return i10 == -1 ? this.f31936c : i10;
        }

        public final int n() {
            return this.f31937d;
        }

        List o() {
            if ((this.f31943j & 1024) != 0) {
                return f31933s;
            }
            List list = this.f31944k;
            return (list == null || list.size() == 0) ? f31933s : this.f31945l;
        }

        boolean p(int i10) {
            return (i10 & this.f31943j) != 0;
        }

        boolean q() {
            return (this.f31943j & 512) != 0 || t();
        }

        boolean r() {
            return (this.f31934a.getParent() == null || this.f31934a.getParent() == this.f31951r) ? false : true;
        }

        boolean s() {
            return (this.f31943j & 1) != 0;
        }

        boolean t() {
            return (this.f31943j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f31936c + " id=" + this.f31938e + ", oldPos=" + this.f31937d + ", pLpos:" + this.f31940g);
            if (w()) {
                sb2.append(" scrap ");
                sb2.append(this.f31948o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb2.append(" invalid");
            }
            if (!s()) {
                sb2.append(" unbound");
            }
            if (z()) {
                sb2.append(" update");
            }
            if (v()) {
                sb2.append(" removed");
            }
            if (J()) {
                sb2.append(" ignored");
            }
            if (x()) {
                sb2.append(" tmpDetached");
            }
            if (!u()) {
                sb2.append(" not recyclable(" + this.f31946m + ")");
            }
            if (q()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f31934a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final boolean u() {
            return (this.f31943j & 16) == 0 && !W.N(this.f31934a);
        }

        boolean v() {
            return (this.f31943j & 8) != 0;
        }

        boolean w() {
            return this.f31947n != null;
        }

        boolean x() {
            return (this.f31943j & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        }

        boolean y() {
            return (this.f31943j & 2) != 0;
        }

        boolean z() {
            return (this.f31943j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC4023a implements Runnable {
        RunnableC4023a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f31912t || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f31906q) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f31918w) {
                recyclerView2.f31916v = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC4024b implements Runnable {
        RunnableC4024b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.f31885f1;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.f31862D1 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    static class InterpolatorC4025c implements Interpolator {
        InterpolatorC4025c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class d implements q.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.q.b
        public void a(C c10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f31898m.q1(c10.f31934a, recyclerView.f31880b);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void b(C c10, l.b bVar, l.b bVar2) {
            RecyclerView.this.l(c10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void c(C c10, l.b bVar, l.b bVar2) {
            RecyclerView.this.f31880b.J(c10);
            RecyclerView.this.n(c10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void d(C c10, l.b bVar, l.b bVar2) {
            c10.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f31859C) {
                if (recyclerView.f31885f1.b(c10, c10, bVar, bVar2)) {
                    RecyclerView.this.L0();
                }
            } else if (recyclerView.f31885f1.d(c10, bVar, bVar2)) {
                RecyclerView.this.L0();
            }
        }
    }

    class e implements b.InterfaceC1118b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public void b(View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 != null) {
                cF0.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public void d() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.z(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public C f(View view) {
            return RecyclerView.f0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public void g(int i10) {
            C cF0;
            View viewA = a(i10);
            if (viewA != null && (cF0 = RecyclerView.f0(viewA)) != null) {
                if (cF0.x() && !cF0.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + cF0 + RecyclerView.this.P());
                }
                cF0.b(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public void h(View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 != null) {
                cF0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public void i(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC1118b
        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 != null) {
                if (!cF0.x() && !cF0.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + cF0 + RecyclerView.this.P());
                }
                cF0.f();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    class f implements a.InterfaceC1117a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC1117a
        public void a(int i10, int i11) {
            RecyclerView.this.B0(i10, i11);
            RecyclerView.this.f31856A1 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC1117a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC1117a
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.v1(i10, i11, obj);
            RecyclerView.this.f31858B1 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC1117a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC1117a
        public C e(int i10) {
            C cZ = RecyclerView.this.Z(i10, true);
            if (cZ == null || RecyclerView.this.f31883e.n(cZ.f31934a)) {
                return null;
            }
            return cZ;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC1117a
        public void f(int i10, int i11) {
            RecyclerView.this.C0(i10, i11, false);
            RecyclerView.this.f31856A1 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC1117a
        public void g(int i10, int i11) {
            RecyclerView.this.A0(i10, i11);
            RecyclerView.this.f31856A1 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC1117a
        public void h(int i10, int i11) {
            RecyclerView.this.C0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f31856A1 = true;
            recyclerView.f31921x1.f32032d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f32110a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f31898m.V0(recyclerView, bVar.f32111b, bVar.f32113d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f31898m.Y0(recyclerView2, bVar.f32111b, bVar.f32113d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f31898m.a1(recyclerView3, bVar.f32111b, bVar.f32113d, bVar.f32112c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f31898m.X0(recyclerView4, bVar.f32111b, bVar.f32113d, 1);
            }
        }
    }

    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        private final h f31957a = new h();

        /* renamed from: b, reason: collision with root package name */
        private boolean f31958b = false;

        public final void a(C c10, int i10) {
            c10.f31936c = i10;
            if (g()) {
                c10.f31938e = d(i10);
            }
            c10.F(1, 519);
            A1.o.a("RV OnBindView");
            j(c10, i10, c10.o());
            c10.d();
            ViewGroup.LayoutParams layoutParams = c10.f31934a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f31996c = true;
            }
            A1.o.b();
        }

        public final C b(ViewGroup viewGroup, int i10) {
            try {
                A1.o.a("RV CreateView");
                C cK = k(viewGroup, i10);
                if (cK.f31934a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                cK.f31939f = i10;
                return cK;
            } finally {
                A1.o.b();
            }
        }

        public abstract int c();

        public long d(int i10) {
            return -1L;
        }

        public int e(int i10) {
            return 0;
        }

        public final boolean f() {
            return this.f31957a.a();
        }

        public final boolean g() {
            return this.f31958b;
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(C c10, int i10);

        public void j(C c10, int i10, List list) {
            i(c10, i10);
        }

        public abstract C k(ViewGroup viewGroup, int i10);

        public void l(RecyclerView recyclerView) {
        }

        public boolean m(C c10) {
            return false;
        }

        public void n(C c10) {
        }

        public void o(C c10) {
        }

        public void p(C c10) {
        }

        public void q(i iVar) {
            this.f31957a.registerObserver(iVar);
        }

        public void r(boolean z10) {
            if (f()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f31958b = z10;
        }

        public void s(i iVar) {
            this.f31957a.unregisterObserver(iVar);
        }
    }

    static class h extends Observable {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }
    }

    public static abstract class i {
    }

    public interface j {
    }

    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        private a f31959a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList f31960b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private long f31961c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f31962d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f31963e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f31964f = 250;

        interface a {
            void a(C c10);
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f31965a;

            /* renamed from: b, reason: collision with root package name */
            public int f31966b;

            /* renamed from: c, reason: collision with root package name */
            public int f31967c;

            /* renamed from: d, reason: collision with root package name */
            public int f31968d;

            public b a(C c10) {
                return b(c10, 0);
            }

            public b b(C c10, int i10) {
                View view = c10.f31934a;
                this.f31965a = view.getLeft();
                this.f31966b = view.getTop();
                this.f31967c = view.getRight();
                this.f31968d = view.getBottom();
                return this;
            }
        }

        static int e(C c10) {
            int i10 = c10.f31943j;
            int i11 = i10 & 14;
            if (c10.t()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i11;
            }
            int iN = c10.n();
            int iJ = c10.j();
            return (iN == -1 || iJ == -1 || iN == iJ) ? i11 : i11 | 2048;
        }

        public abstract boolean a(C c10, b bVar, b bVar2);

        public abstract boolean b(C c10, C c11, b bVar, b bVar2);

        public abstract boolean c(C c10, b bVar, b bVar2);

        public abstract boolean d(C c10, b bVar, b bVar2);

        public abstract boolean f(C c10);

        public boolean g(C c10, List list) {
            return f(c10);
        }

        public final void h(C c10) {
            r(c10);
            a aVar = this.f31959a;
            if (aVar != null) {
                aVar.a(c10);
            }
        }

        public final void i() {
            if (this.f31960b.size() <= 0) {
                this.f31960b.clear();
            } else {
                AbstractC5487d.a(this.f31960b.get(0));
                throw null;
            }
        }

        public abstract void j(C c10);

        public abstract void k();

        public long l() {
            return this.f31961c;
        }

        public long m() {
            return this.f31964f;
        }

        public long n() {
            return this.f31963e;
        }

        public long o() {
            return this.f31962d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(C c10) {
        }

        public b s(z zVar, C c10) {
            return q().a(c10);
        }

        public b t(z zVar, C c10, int i10, List list) {
            return q().a(c10);
        }

        public abstract void u();

        void v(a aVar) {
            this.f31959a = aVar;
        }
    }

    private class m implements l.a {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.a
        public void a(C c10) {
            c10.G(true);
            if (c10.f31941h != null && c10.f31942i == null) {
                c10.f31941h = null;
            }
            c10.f31942i = null;
            if (c10.I() || RecyclerView.this.U0(c10.f31934a) || !c10.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(c10.f31934a, false);
        }
    }

    public static abstract class n {
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f31970a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f31971b;

        /* renamed from: c, reason: collision with root package name */
        private final p.b f31972c;

        /* renamed from: d, reason: collision with root package name */
        private final p.b f31973d;

        /* renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.p f31974e;

        /* renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.p f31975f;

        /* renamed from: g, reason: collision with root package name */
        y f31976g;

        /* renamed from: h, reason: collision with root package name */
        boolean f31977h;

        /* renamed from: i, reason: collision with root package name */
        boolean f31978i;

        /* renamed from: j, reason: collision with root package name */
        boolean f31979j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f31980k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f31981l;

        /* renamed from: m, reason: collision with root package name */
        int f31982m;

        /* renamed from: n, reason: collision with root package name */
        boolean f31983n;

        /* renamed from: o, reason: collision with root package name */
        private int f31984o;

        /* renamed from: p, reason: collision with root package name */
        private int f31985p;

        /* renamed from: q, reason: collision with root package name */
        private int f31986q;

        /* renamed from: r, reason: collision with root package name */
        private int f31987r;

        class a implements p.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i10) {
                return o.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.V(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return o.this.i0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return o.this.s0() - o.this.j0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return o.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements p.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i10) {
                return o.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return o.this.k0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return o.this.b0() - o.this.h0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f31990a;

            /* renamed from: b, reason: collision with root package name */
            public int f31991b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f31992c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f31993d;
        }

        public o() {
            a aVar = new a();
            this.f31972c = aVar;
            b bVar = new b();
            this.f31973d = bVar;
            this.f31974e = new androidx.recyclerview.widget.p(aVar);
            this.f31975f = new androidx.recyclerview.widget.p(bVar);
            this.f31977h = false;
            this.f31978i = false;
            this.f31979j = false;
            this.f31980k = true;
            this.f31981l = true;
        }

        private static boolean A0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void D(int i10, View view) {
            this.f31970a.d(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.P(int, int, int, int, boolean):int");
        }

        private int[] Q(View view, Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iI0;
            int iMin = Math.min(0, i10);
            int i11 = top - iK0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iS0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void g(View view, int i10, boolean z10) {
            C cF0 = RecyclerView.f0(view);
            if (z10 || cF0.v()) {
                this.f31971b.f31884f.b(cF0);
            } else {
                this.f31971b.f31884f.p(cF0);
            }
            p pVar = (p) view.getLayoutParams();
            if (cF0.L() || cF0.w()) {
                if (cF0.w()) {
                    cF0.K();
                } else {
                    cF0.e();
                }
                this.f31970a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f31971b) {
                int iM = this.f31970a.m(view);
                if (i10 == -1) {
                    i10 = this.f31970a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f31971b.indexOfChild(view) + this.f31971b.P());
                }
                if (iM != i10) {
                    this.f31971b.f31898m.F0(iM, i10);
                }
            } else {
                this.f31970a.a(view, i10, false);
                pVar.f31996c = true;
                y yVar = this.f31976g;
                if (yVar != null && yVar.h()) {
                    this.f31976g.k(view);
                }
            }
            if (pVar.f31997d) {
                cF0.f31934a.invalidate();
                pVar.f31997d = false;
            }
        }

        public static d m0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l2.c.f52372f, i10, i11);
            dVar.f31990a = typedArrayObtainStyledAttributes.getInt(l2.c.f52373g, 1);
            dVar.f31991b = typedArrayObtainStyledAttributes.getInt(l2.c.f52383q, 1);
            dVar.f31992c = typedArrayObtainStyledAttributes.getBoolean(l2.c.f52382p, false);
            dVar.f31993d = typedArrayObtainStyledAttributes.getBoolean(l2.c.f52384r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private boolean x0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            Rect rect = this.f31971b.f31890i;
            U(focusedChild, rect);
            return rect.left - i10 < iS0 && rect.right - i10 > iI0 && rect.top - i11 < iB0 && rect.bottom - i11 > iK0;
        }

        private void z1(u uVar, int i10, View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0.J()) {
                return;
            }
            if (cF0.t() && !cF0.v() && !this.f31971b.f31896l.g()) {
                u1(i10);
                uVar.C(cF0);
            } else {
                C(i10);
                uVar.D(view);
                this.f31971b.f31884f.k(cF0);
            }
        }

        public abstract int A(z zVar);

        public abstract int A1(int i10, u uVar, z zVar);

        public void B(u uVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                z1(uVar, iO, N(iO));
            }
        }

        public boolean B0() {
            y yVar = this.f31976g;
            return yVar != null && yVar.h();
        }

        public abstract void B1(int i10);

        public void C(int i10) {
            D(i10, N(i10));
        }

        public boolean C0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f31974e.b(view, 24579) && this.f31975f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public abstract int C1(int i10, u uVar, z zVar);

        public void D0(View view, int i10, int i11, int i12, int i13) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f31995b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        void D1(RecyclerView recyclerView) {
            E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void E(RecyclerView recyclerView) {
            this.f31978i = true;
            K0(recyclerView);
        }

        public void E0(View view, int i10, int i11) {
            p pVar = (p) view.getLayoutParams();
            Rect rectJ0 = this.f31971b.j0(view);
            int i12 = i10 + rectJ0.left + rectJ0.right;
            int i13 = i11 + rectJ0.top + rectJ0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) pVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) pVar).height, q());
            if (J1(view, iP, iP2, pVar)) {
                view.measure(iP, iP2);
            }
        }

        void E1(int i10, int i11) {
            this.f31986q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f31984o = mode;
            if (mode == 0 && !RecyclerView.f31848P1) {
                this.f31986q = 0;
            }
            this.f31987r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f31985p = mode2;
            if (mode2 != 0 || RecyclerView.f31848P1) {
                return;
            }
            this.f31987r = 0;
        }

        void F(RecyclerView recyclerView, u uVar) {
            this.f31978i = false;
            M0(recyclerView, uVar);
        }

        public void F0(int i10, int i11) {
            View viewN = N(i10);
            if (viewN != null) {
                C(i10);
                i(viewN, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f31971b.toString());
            }
        }

        public void F1(int i10, int i11) {
            this.f31971b.setMeasuredDimension(i10, i11);
        }

        public View G(View view) {
            View viewR;
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView == null || (viewR = recyclerView.R(view)) == null || this.f31970a.n(viewR)) {
                return null;
            }
            return viewR;
        }

        public void G0(int i10) {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView != null) {
                recyclerView.y0(i10);
            }
        }

        public void G1(Rect rect, int i10, int i11) {
            F1(s(i10, rect.width() + i0() + j0(), g0()), s(i11, rect.height() + k0() + h0(), f0()));
        }

        public View H(int i10) {
            int iO = O();
            for (int i11 = 0; i11 < iO; i11++) {
                View viewN = N(i11);
                C cF0 = RecyclerView.f0(viewN);
                if (cF0 != null && cF0.m() == i10 && !cF0.J() && (this.f31971b.f31921x1.e() || !cF0.v())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i10) {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView != null) {
                recyclerView.z0(i10);
            }
        }

        void H1(int i10, int i11) {
            int iO = O();
            if (iO == 0) {
                this.f31971b.w(i10, i11);
                return;
            }
            int i12 = PduHandle.NONE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iO; i16++) {
                View viewN = N(i16);
                Rect rect = this.f31971b.f31890i;
                U(viewN, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f31971b.f31890i.set(i15, i13, i12, i14);
            G1(this.f31971b.f31890i, i10, i11);
        }

        public abstract p I();

        public void I0(g gVar, g gVar2) {
        }

        void I1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f31971b = null;
                this.f31970a = null;
                this.f31986q = 0;
                this.f31987r = 0;
            } else {
                this.f31971b = recyclerView;
                this.f31970a = recyclerView.f31883e;
                this.f31986q = recyclerView.getWidth();
                this.f31987r = recyclerView.getHeight();
            }
            this.f31984o = 1073741824;
            this.f31985p = 1073741824;
        }

        public p J(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public boolean J0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        boolean J1(View view, int i10, int i11, p pVar) {
            return (!view.isLayoutRequested() && this.f31980k && A0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && A0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public p K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void K0(RecyclerView recyclerView) {
        }

        boolean K1() {
            return false;
        }

        public int L() {
            return -1;
        }

        public void L0(RecyclerView recyclerView) {
        }

        boolean L1(View view, int i10, int i11, p pVar) {
            return (this.f31980k && A0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && A0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((p) view.getLayoutParams()).f31995b.bottom;
        }

        public void M0(RecyclerView recyclerView, u uVar) {
            L0(recyclerView);
        }

        public abstract void M1(RecyclerView recyclerView, z zVar, int i10);

        public View N(int i10) {
            androidx.recyclerview.widget.b bVar = this.f31970a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public abstract View N0(View view, int i10, u uVar, z zVar);

        public void N1(y yVar) {
            y yVar2 = this.f31976g;
            if (yVar2 != null && yVar != yVar2 && yVar2.h()) {
                this.f31976g.r();
            }
            this.f31976g = yVar;
            yVar.q(this.f31971b, this);
        }

        public int O() {
            androidx.recyclerview.widget.b bVar = this.f31970a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void O0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f31971b;
            P0(recyclerView.f31880b, recyclerView.f31921x1, accessibilityEvent);
        }

        void O1() {
            y yVar = this.f31976g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public void P0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f31971b.canScrollVertically(-1) && !this.f31971b.canScrollHorizontally(-1) && !this.f31971b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            g gVar = this.f31971b.f31896l;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.c());
            }
        }

        public boolean P1() {
            return false;
        }

        void Q0(G1.t tVar) {
            RecyclerView recyclerView = this.f31971b;
            R0(recyclerView.f31880b, recyclerView.f31921x1, tVar);
        }

        public boolean R() {
            RecyclerView recyclerView = this.f31971b;
            return recyclerView != null && recyclerView.f31886g;
        }

        public void R0(u uVar, z zVar, G1.t tVar) {
            if (this.f31971b.canScrollVertically(-1) || this.f31971b.canScrollHorizontally(-1)) {
                tVar.a(8192);
                tVar.H0(true);
            }
            if (this.f31971b.canScrollVertically(1) || this.f31971b.canScrollHorizontally(1)) {
                tVar.a(4096);
                tVar.H0(true);
            }
            tVar.i0(t.e.a(o0(uVar, zVar), S(uVar, zVar), z0(uVar, zVar), p0(uVar, zVar)));
        }

        public int S(u uVar, z zVar) {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView == null || recyclerView.f31896l == null || !p()) {
                return 1;
            }
            return this.f31971b.f31896l.c();
        }

        void S0(View view, G1.t tVar) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 == null || cF0.v() || this.f31970a.n(cF0.f31934a)) {
                return;
            }
            RecyclerView recyclerView = this.f31971b;
            T0(recyclerView.f31880b, recyclerView.f31921x1, view, tVar);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void T0(u uVar, z zVar, View view, G1.t tVar) {
            tVar.j0(t.f.a(q() ? l0(view) : 0, 1, p() ? l0(view) : 0, 1, false, false));
        }

        public void U(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        public View U0(View view, int i10) {
            return null;
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int W(View view) {
            Rect rect = ((p) view.getLayoutParams()).f31995b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(RecyclerView recyclerView) {
        }

        public int X(View view) {
            Rect rect = ((p) view.getLayoutParams()).f31995b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int a() {
            RecyclerView recyclerView = this.f31971b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f31970a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            Z0(recyclerView, i10, i11);
        }

        public int b0() {
            return this.f31987r;
        }

        public abstract void b1(u uVar, z zVar);

        public void c(View view) {
            d(view, -1);
        }

        public int c0() {
            return this.f31985p;
        }

        public void c1(z zVar) {
        }

        public void d(View view, int i10) {
            g(view, i10, true);
        }

        public int d0() {
            return W.z(this.f31971b);
        }

        public void d1(u uVar, z zVar, int i10, int i11) {
            this.f31971b.w(i10, i11);
        }

        public void e(View view) {
            f(view, -1);
        }

        public int e0(View view) {
            return ((p) view.getLayoutParams()).f31995b.left;
        }

        public boolean e1(RecyclerView recyclerView, View view, View view2) {
            return B0() || recyclerView.t0();
        }

        public void f(View view, int i10) {
            g(view, i10, false);
        }

        public int f0() {
            return W.A(this.f31971b);
        }

        public boolean f1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return e1(recyclerView, view, view2);
        }

        public int g0() {
            return W.B(this.f31971b);
        }

        public void g1(Parcelable parcelable) {
        }

        public void h(String str) {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int h0() {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable h1() {
            return null;
        }

        public void i(View view, int i10) {
            n(view, i10, (p) view.getLayoutParams());
        }

        public int i0() {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void i1(int i10) {
        }

        public int j0() {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void j1(y yVar) {
            if (this.f31976g == yVar) {
                this.f31976g = null;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean k1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f31971b;
            return l1(recyclerView.f31880b, recyclerView.f31921x1, i10, bundle);
        }

        public int l0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public boolean l1(u uVar, z zVar, int i10, Bundle bundle) {
            int iB0;
            int iS0;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                iB0 = recyclerView.canScrollVertically(1) ? (b0() - k0()) - h0() : 0;
                if (this.f31971b.canScrollHorizontally(1)) {
                    iS0 = (s0() - i0()) - j0();
                    i11 = iB0;
                    i12 = iS0;
                }
                i11 = iB0;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                iB0 = recyclerView.canScrollVertically(-1) ? -((b0() - k0()) - h0()) : 0;
                if (this.f31971b.canScrollHorizontally(-1)) {
                    iS0 = -((s0() - i0()) - j0());
                    i11 = iB0;
                    i12 = iS0;
                }
                i11 = iB0;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f31971b.n1(i12, i11, null, PduHandle.NONE, true);
            return true;
        }

        boolean m1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f31971b;
            return n1(recyclerView.f31880b, recyclerView.f31921x1, view, i10, bundle);
        }

        public void n(View view, int i10, p pVar) {
            C cF0 = RecyclerView.f0(view);
            if (cF0.v()) {
                this.f31971b.f31884f.b(cF0);
            } else {
                this.f31971b.f31884f.p(cF0);
            }
            this.f31970a.c(view, i10, pVar, cF0.v());
        }

        public int n0(View view) {
            return ((p) view.getLayoutParams()).f31995b.right;
        }

        public boolean n1(u uVar, z zVar, View view, int i10, Bundle bundle) {
            return false;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public int o0(u uVar, z zVar) {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView == null || recyclerView.f31896l == null || !q()) {
                return 1;
            }
            return this.f31971b.f31896l.c();
        }

        public void o1(u uVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.f0(N(iO)).J()) {
                    r1(iO, uVar);
                }
            }
        }

        public abstract boolean p();

        public int p0(u uVar, z zVar) {
            return 0;
        }

        void p1(u uVar) {
            int iJ = uVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = uVar.n(i10);
                C cF0 = RecyclerView.f0(viewN);
                if (!cF0.J()) {
                    cF0.G(false);
                    if (cF0.x()) {
                        this.f31971b.removeDetachedView(viewN, false);
                    }
                    l lVar = this.f31971b.f31885f1;
                    if (lVar != null) {
                        lVar.j(cF0);
                    }
                    cF0.G(true);
                    uVar.y(viewN);
                }
            }
            uVar.e();
            if (iJ > 0) {
                this.f31971b.invalidate();
            }
        }

        public abstract boolean q();

        public int q0(View view) {
            return ((p) view.getLayoutParams()).f31995b.top;
        }

        public void q1(View view, u uVar) {
            t1(view);
            uVar.B(view);
        }

        public boolean r(p pVar) {
            return pVar != null;
        }

        public void r0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((p) view.getLayoutParams()).f31995b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f31971b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f31971b.f31894k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(int i10, u uVar) {
            View viewN = N(i10);
            u1(i10);
            uVar.B(viewN);
        }

        public int s0() {
            return this.f31986q;
        }

        public boolean s1(Runnable runnable) {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void t(int i10, int i11, z zVar, c cVar) {
        }

        public int t0() {
            return this.f31984o;
        }

        public void t1(View view) {
            this.f31970a.p(view);
        }

        public void u(int i10, c cVar) {
        }

        boolean u0() {
            int iO = O();
            for (int i10 = 0; i10 < iO; i10++) {
                ViewGroup.LayoutParams layoutParams = N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int i10) {
            if (N(i10) != null) {
                this.f31970a.q(i10);
            }
        }

        public abstract int v(z zVar);

        public boolean v0() {
            return this.f31978i;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return w1(recyclerView, view, rect, z10, false);
        }

        public abstract int w(z zVar);

        public abstract boolean w0();

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrQ = Q(view, rect);
            int i10 = iArrQ[0];
            int i11 = iArrQ[1];
            if ((z11 && !x0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.k1(i10, i11);
            }
            return true;
        }

        public abstract int x(z zVar);

        public void x1() {
            RecyclerView recyclerView = this.f31971b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int y(z zVar);

        public final boolean y0() {
            return this.f31981l;
        }

        public void y1() {
            this.f31977h = true;
        }

        public abstract int z(z zVar);

        public boolean z0(u uVar, z zVar) {
            return false;
        }
    }

    public static abstract class q {
        public abstract boolean a(int i10, int i11);
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public abstract void b(RecyclerView recyclerView, int i10, int i11);
    }

    public static class t {

        /* renamed from: a, reason: collision with root package name */
        SparseArray f31998a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        private int f31999b = 0;

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList f32000a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            int f32001b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f32002c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f32003d = 0;

            a() {
            }
        }

        private a g(int i10) {
            a aVar = (a) this.f31998a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f31998a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f31999b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f31998a.size(); i10++) {
                ((a) this.f31998a.valueAt(i10)).f32000a.clear();
            }
        }

        void c() {
            this.f31999b--;
        }

        void d(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f32003d = j(aVarG.f32003d, j10);
        }

        void e(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f32002c = j(aVarG.f32002c, j10);
        }

        public C f(int i10) {
            a aVar = (a) this.f31998a.get(i10);
            if (aVar == null || aVar.f32000a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f32000a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((C) arrayList.get(size)).r()) {
                    return (C) arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z10) {
            if (gVar != null) {
                c();
            }
            if (!z10 && this.f31999b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(C c10) {
            int iL = c10.l();
            ArrayList arrayList = g(iL).f32000a;
            if (((a) this.f31998a.get(iL)).f32001b <= arrayList.size()) {
                return;
            }
            c10.D();
            arrayList.add(c10);
        }

        long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f32003d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f32002c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class u {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f32004a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f32005b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f32006c;

        /* renamed from: d, reason: collision with root package name */
        private final List f32007d;

        /* renamed from: e, reason: collision with root package name */
        private int f32008e;

        /* renamed from: f, reason: collision with root package name */
        int f32009f;

        /* renamed from: g, reason: collision with root package name */
        t f32010g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.f32004a = arrayList;
            this.f32005b = null;
            this.f32006c = new ArrayList();
            this.f32007d = Collections.unmodifiableList(arrayList);
            this.f32008e = 2;
            this.f32009f = 2;
        }

        private boolean H(C c10, int i10, int i11, long j10) {
            c10.f31951r = RecyclerView.this;
            int iL = c10.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f32010g.k(iL, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.f31896l.a(c10, i10);
            this.f32010g.d(c10.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(c10);
            if (!RecyclerView.this.f31921x1.e()) {
                return true;
            }
            c10.f31940g = i11;
            return true;
        }

        private void b(C c10) {
            if (RecyclerView.this.s0()) {
                View view = c10.f31934a;
                if (W.x(view) == 0) {
                    W.u0(view, 1);
                }
                androidx.recyclerview.widget.l lVar = RecyclerView.this.f31864E1;
                if (lVar == null) {
                    return;
                }
                C2736a c2736aN = lVar.n();
                if (c2736aN instanceof l.a) {
                    ((l.a) c2736aN).o(view);
                }
                W.m0(view, c2736aN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(C c10) {
            View view = c10.f31934a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i10) {
            a((C) this.f32006c.get(i10), true);
            this.f32006c.remove(i10);
        }

        public void B(View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (cF0.w()) {
                cF0.K();
            } else if (cF0.L()) {
                cF0.e();
            }
            C(cF0);
            if (RecyclerView.this.f31885f1 == null || cF0.u()) {
                return;
            }
            RecyclerView.this.f31885f1.j(cF0);
        }

        void C(C c10) {
            boolean z10;
            boolean z11 = true;
            if (c10.w() || c10.f31934a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(c10.w());
                sb2.append(" isAttached:");
                sb2.append(c10.f31934a.getParent() != null);
                sb2.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (c10.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c10 + RecyclerView.this.P());
            }
            if (c10.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean zH = c10.h();
            g gVar = RecyclerView.this.f31896l;
            if ((gVar != null && zH && gVar.m(c10)) || c10.u()) {
                if (this.f32009f <= 0 || c10.p(526)) {
                    z10 = false;
                } else {
                    int size = this.f32006c.size();
                    if (size >= this.f32009f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f31850R1 && size > 0 && !RecyclerView.this.f31919w1.d(c10.f31936c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f31919w1.d(((C) this.f32006c.get(i10)).f31936c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f32006c.add(size, c10);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(c10, true);
                }
                z = z10;
            } else {
                z11 = false;
            }
            RecyclerView.this.f31884f.q(c10);
            if (z || z11 || !zH) {
                return;
            }
            c10.f31951r = null;
        }

        void D(View view) {
            C cF0 = RecyclerView.f0(view);
            if (!cF0.p(12) && cF0.y() && !RecyclerView.this.p(cF0)) {
                if (this.f32005b == null) {
                    this.f32005b = new ArrayList();
                }
                cF0.H(this, true);
                this.f32005b.add(cF0);
                return;
            }
            if (!cF0.t() || cF0.v() || RecyclerView.this.f31896l.g()) {
                cF0.H(this, false);
                this.f32004a.add(cF0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            }
        }

        void E(t tVar) {
            t tVar2 = this.f32010g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.f32010g = tVar;
            if (tVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f32010g.a();
        }

        void F(A a10) {
        }

        public void G(int i10) {
            this.f32008e = i10;
            K();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f5 A[PHI: r1 r4
  0x00f5: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$C) = (r1v11 androidx.recyclerview.widget.RecyclerView$C), (r1v30 androidx.recyclerview.widget.RecyclerView$C) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d4 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01d7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.C I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 531
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$C");
        }

        void J(C c10) {
            if (c10.f31948o) {
                this.f32005b.remove(c10);
            } else {
                this.f32004a.remove(c10);
            }
            c10.f31947n = null;
            c10.f31948o = false;
            c10.e();
        }

        void K() {
            o oVar = RecyclerView.this.f31898m;
            this.f32009f = this.f32008e + (oVar != null ? oVar.f31982m : 0);
            for (int size = this.f32006c.size() - 1; size >= 0 && this.f32006c.size() > this.f32009f; size--) {
                A(size);
            }
        }

        boolean L(C c10) {
            if (c10.v()) {
                return RecyclerView.this.f31921x1.e();
            }
            int i10 = c10.f31936c;
            if (i10 >= 0 && i10 < RecyclerView.this.f31896l.c()) {
                if (RecyclerView.this.f31921x1.e() || RecyclerView.this.f31896l.e(c10.f31936c) == c10.l()) {
                    return !RecyclerView.this.f31896l.g() || c10.k() == RecyclerView.this.f31896l.d(c10.f31936c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c10 + RecyclerView.this.P());
        }

        void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f32006c.size() - 1; size >= 0; size--) {
                C c10 = (C) this.f32006c.get(size);
                if (c10 != null && (i12 = c10.f31936c) >= i10 && i12 < i13) {
                    c10.b(2);
                    A(size);
                }
            }
        }

        void a(C c10, boolean z10) {
            RecyclerView.r(c10);
            View view = c10.f31934a;
            androidx.recyclerview.widget.l lVar = RecyclerView.this.f31864E1;
            if (lVar != null) {
                C2736a c2736aN = lVar.n();
                W.m0(view, c2736aN instanceof l.a ? ((l.a) c2736aN).n(view) : null);
            }
            if (z10) {
                g(c10);
            }
            c10.f31951r = null;
            i().i(c10);
        }

        public void c() {
            this.f32004a.clear();
            z();
        }

        void d() {
            int size = this.f32006c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C) this.f32006c.get(i10)).c();
            }
            int size2 = this.f32004a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((C) this.f32004a.get(i11)).c();
            }
            ArrayList arrayList = this.f32005b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((C) this.f32005b.get(i12)).c();
                }
            }
        }

        void e() {
            this.f32004a.clear();
            ArrayList arrayList = this.f32005b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f31921x1.b()) {
                return !RecyclerView.this.f31921x1.e() ? i10 : RecyclerView.this.f31882d.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f31921x1.b() + RecyclerView.this.P());
        }

        void g(C c10) {
            RecyclerView.this.getClass();
            g gVar = RecyclerView.this.f31896l;
            if (gVar != null) {
                gVar.p(c10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f31921x1 != null) {
                recyclerView.f31884f.q(c10);
            }
        }

        C h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f32005b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    C c10 = (C) this.f32005b.get(i11);
                    if (!c10.L() && c10.m() == i10) {
                        c10.b(32);
                        return c10;
                    }
                }
                if (RecyclerView.this.f31896l.g() && (iM = RecyclerView.this.f31882d.m(i10)) > 0 && iM < RecyclerView.this.f31896l.c()) {
                    long jD = RecyclerView.this.f31896l.d(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        C c11 = (C) this.f32005b.get(i12);
                        if (!c11.L() && c11.k() == jD) {
                            c11.b(32);
                            return c11;
                        }
                    }
                }
            }
            return null;
        }

        t i() {
            if (this.f32010g == null) {
                this.f32010g = new t();
            }
            return this.f32010g;
        }

        int j() {
            return this.f32004a.size();
        }

        public List k() {
            return this.f32007d;
        }

        C l(long j10, int i10, boolean z10) {
            for (int size = this.f32004a.size() - 1; size >= 0; size--) {
                C c10 = (C) this.f32004a.get(size);
                if (c10.k() == j10 && !c10.L()) {
                    if (i10 == c10.l()) {
                        c10.b(32);
                        if (c10.v() && !RecyclerView.this.f31921x1.e()) {
                            c10.F(2, 14);
                        }
                        return c10;
                    }
                    if (!z10) {
                        this.f32004a.remove(size);
                        RecyclerView.this.removeDetachedView(c10.f31934a, false);
                        y(c10.f31934a);
                    }
                }
            }
            int size2 = this.f32006c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C c11 = (C) this.f32006c.get(size2);
                if (c11.k() == j10 && !c11.r()) {
                    if (i10 == c11.l()) {
                        if (!z10) {
                            this.f32006c.remove(size2);
                        }
                        return c11;
                    }
                    if (!z10) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        C m(int i10, boolean z10) {
            View viewE;
            int size = this.f32004a.size();
            for (int i11 = 0; i11 < size; i11++) {
                C c10 = (C) this.f32004a.get(i11);
                if (!c10.L() && c10.m() == i10 && !c10.t() && (RecyclerView.this.f31921x1.f32036h || !c10.v())) {
                    c10.b(32);
                    return c10;
                }
            }
            if (z10 || (viewE = RecyclerView.this.f31883e.e(i10)) == null) {
                int size2 = this.f32006c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    C c11 = (C) this.f32006c.get(i12);
                    if (!c11.t() && c11.m() == i10 && !c11.r()) {
                        if (!z10) {
                            this.f32006c.remove(i12);
                        }
                        return c11;
                    }
                }
                return null;
            }
            C cF0 = RecyclerView.f0(viewE);
            RecyclerView.this.f31883e.s(viewE);
            int iM = RecyclerView.this.f31883e.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f31883e.d(iM);
                D(viewE);
                cF0.b(8224);
                return cF0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + cF0 + RecyclerView.this.P());
        }

        View n(int i10) {
            return ((C) this.f32004a.get(i10)).f31934a;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return I(i10, z10, Long.MAX_VALUE).f31934a;
        }

        void s() {
            int size = this.f32006c.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) ((C) this.f32006c.get(i10)).f31934a.getLayoutParams();
                if (pVar != null) {
                    pVar.f31996c = true;
                }
            }
        }

        void t() {
            int size = this.f32006c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C c10 = (C) this.f32006c.get(i10);
                if (c10 != null) {
                    c10.b(6);
                    c10.a(null);
                }
            }
            g gVar = RecyclerView.this.f31896l;
            if (gVar == null || !gVar.g()) {
                z();
            }
        }

        void u(int i10, int i11) {
            int size = this.f32006c.size();
            for (int i12 = 0; i12 < size; i12++) {
                C c10 = (C) this.f32006c.get(i12);
                if (c10 != null && c10.f31936c >= i10) {
                    c10.A(i11, true);
                }
            }
        }

        void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f32006c.size();
            for (int i16 = 0; i16 < size; i16++) {
                C c10 = (C) this.f32006c.get(i16);
                if (c10 != null && (i15 = c10.f31936c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        c10.A(i11 - i10, false);
                    } else {
                        c10.A(i12, false);
                    }
                }
            }
        }

        void w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f32006c.size() - 1; size >= 0; size--) {
                C c10 = (C) this.f32006c.get(size);
                if (c10 != null) {
                    int i13 = c10.f31936c;
                    if (i13 >= i12) {
                        c10.A(-i11, z10);
                    } else if (i13 >= i10) {
                        c10.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z10) {
            c();
            i().h(gVar, gVar2, z10);
        }

        void y(View view) {
            C cF0 = RecyclerView.f0(view);
            cF0.f31947n = null;
            cF0.f31948o = false;
            cF0.e();
            C(cF0);
        }

        void z() {
            for (int size = this.f32006c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f32006c.clear();
            if (RecyclerView.f31850R1) {
                RecyclerView.this.f31919w1.b();
            }
        }
    }

    public interface v {
    }

    private class w extends i {
        w() {
        }
    }

    public static abstract class y {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f32015b;

        /* renamed from: c, reason: collision with root package name */
        private o f32016c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f32017d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f32018e;

        /* renamed from: f, reason: collision with root package name */
        private View f32019f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f32021h;

        /* renamed from: a, reason: collision with root package name */
        private int f32014a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f32020g = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f32022a;

            /* renamed from: b, reason: collision with root package name */
            private int f32023b;

            /* renamed from: c, reason: collision with root package name */
            private int f32024c;

            /* renamed from: d, reason: collision with root package name */
            private int f32025d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f32026e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f32027f;

            /* renamed from: g, reason: collision with root package name */
            private int f32028g;

            public a(int i10, int i11) {
                this(i10, i11, PduHandle.NONE, null);
            }

            private void e() {
                if (this.f32026e != null && this.f32024c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f32024c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f32025d >= 0;
            }

            public void b(int i10) {
                this.f32025d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f32025d;
                if (i10 >= 0) {
                    this.f32025d = -1;
                    recyclerView.v0(i10);
                    this.f32027f = false;
                } else {
                    if (!this.f32027f) {
                        this.f32028g = 0;
                        return;
                    }
                    e();
                    recyclerView.f31915u1.f(this.f32022a, this.f32023b, this.f32024c, this.f32026e);
                    int i11 = this.f32028g + 1;
                    this.f32028g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f32027f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f32022a = i10;
                this.f32023b = i11;
                this.f32024c = i12;
                this.f32026e = interpolator;
                this.f32027f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f32025d = -1;
                this.f32027f = false;
                this.f32028g = 0;
                this.f32022a = i10;
                this.f32023b = i11;
                this.f32024c = i12;
                this.f32026e = interpolator;
            }
        }

        public interface b {
            PointF b(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).b(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f32015b.f31898m.H(i10);
        }

        public int c() {
            return this.f32015b.f31898m.O();
        }

        public int d(View view) {
            return this.f32015b.d0(view);
        }

        public o e() {
            return this.f32016c;
        }

        public int f() {
            return this.f32014a;
        }

        public boolean g() {
            return this.f32017d;
        }

        public boolean h() {
            return this.f32018e;
        }

        protected void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f32015b;
            if (this.f32014a == -1 || recyclerView == null) {
                r();
            }
            if (this.f32017d && this.f32019f == null && this.f32016c != null && (pointFA = a(this.f32014a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.f1((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f32017d = false;
            View view = this.f32019f;
            if (view != null) {
                if (d(view) == this.f32014a) {
                    o(this.f32019f, recyclerView.f31921x1, this.f32020g);
                    this.f32020g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f32019f = null;
                }
            }
            if (this.f32018e) {
                l(i10, i11, recyclerView.f31921x1, this.f32020g);
                boolean zA = this.f32020g.a();
                this.f32020g.c(recyclerView);
                if (zA && this.f32018e) {
                    this.f32017d = true;
                    recyclerView.f31915u1.e();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f32019f = view;
            }
        }

        protected abstract void l(int i10, int i11, z zVar, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, z zVar, a aVar);

        public void p(int i10) {
            this.f32014a = i10;
        }

        void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f31915u1.g();
            if (this.f32021h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f32015b = recyclerView;
            this.f32016c = oVar;
            int i10 = this.f32014a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f31921x1.f32029a = i10;
            this.f32018e = true;
            this.f32017d = true;
            this.f32019f = b(f());
            m();
            this.f32015b.f31915u1.e();
            this.f32021h = true;
        }

        protected final void r() {
            if (this.f32018e) {
                this.f32018e = false;
                n();
                this.f32015b.f31921x1.f32029a = -1;
                this.f32019f = null;
                this.f32014a = -1;
                this.f32017d = false;
                this.f32016c.j1(this);
                this.f32016c = null;
                this.f32015b = null;
            }
        }
    }

    public static class z {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f32030b;

        /* renamed from: m, reason: collision with root package name */
        int f32041m;

        /* renamed from: n, reason: collision with root package name */
        long f32042n;

        /* renamed from: o, reason: collision with root package name */
        int f32043o;

        /* renamed from: p, reason: collision with root package name */
        int f32044p;

        /* renamed from: q, reason: collision with root package name */
        int f32045q;

        /* renamed from: a, reason: collision with root package name */
        int f32029a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f32031c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f32032d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f32033e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f32034f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f32035g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f32036h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f32037i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f32038j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f32039k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f32040l = false;

        void a(int i10) {
            if ((this.f32033e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f32033e));
        }

        public int b() {
            return this.f32036h ? this.f32031c - this.f32032d : this.f32034f;
        }

        public int c() {
            return this.f32029a;
        }

        public boolean d() {
            return this.f32029a != -1;
        }

        public boolean e() {
            return this.f32036h;
        }

        void f(g gVar) {
            this.f32033e = 1;
            this.f32034f = gVar.c();
            this.f32036h = false;
            this.f32037i = false;
            this.f32038j = false;
        }

        public boolean g() {
            return this.f32040l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f32029a + ", mData=" + this.f32030b + ", mItemCount=" + this.f32034f + ", mIsMeasuring=" + this.f32038j + ", mPreviousLayoutItemCount=" + this.f32031c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f32032d + ", mStructureChanged=" + this.f32035g + ", mInPreLayout=" + this.f32036h + ", mRunSimpleAnimations=" + this.f32039k + ", mRunPredictiveAnimations=" + this.f32040l + '}';
        }
    }

    static {
        Class cls = Integer.TYPE;
        f31853U1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f31854V1 = new InterpolatorC4025c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6540a.f52363a);
    }

    private void A() {
        int i10 = this.f31922y;
        this.f31922y = 0;
        if (i10 == 0 || !s0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        G1.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void C() {
        this.f31921x1.a(1);
        Q(this.f31921x1);
        this.f31921x1.f32038j = false;
        p1();
        this.f31884f.f();
        F0();
        N0();
        c1();
        z zVar = this.f31921x1;
        zVar.f32037i = zVar.f32039k && this.f31858B1;
        this.f31858B1 = false;
        this.f31856A1 = false;
        zVar.f32036h = zVar.f32040l;
        zVar.f32034f = this.f31896l.c();
        U(this.f31866F1);
        if (this.f31921x1.f32039k) {
            int iG = this.f31883e.g();
            for (int i10 = 0; i10 < iG; i10++) {
                C cF0 = f0(this.f31883e.f(i10));
                if (!cF0.J() && (!cF0.t() || this.f31896l.g())) {
                    this.f31884f.e(cF0, this.f31885f1.t(this.f31921x1, cF0, l.e(cF0), cF0.o()));
                    if (this.f31921x1.f32037i && cF0.y() && !cF0.v() && !cF0.J() && !cF0.t()) {
                        this.f31884f.c(c0(cF0), cF0);
                    }
                }
            }
        }
        if (this.f31921x1.f32040l) {
            d1();
            z zVar2 = this.f31921x1;
            boolean z10 = zVar2.f32035g;
            zVar2.f32035g = false;
            this.f31898m.b1(this.f31880b, zVar2);
            this.f31921x1.f32035g = z10;
            for (int i11 = 0; i11 < this.f31883e.g(); i11++) {
                C cF02 = f0(this.f31883e.f(i11));
                if (!cF02.J() && !this.f31884f.i(cF02)) {
                    int iE = l.e(cF02);
                    boolean zP = cF02.p(8192);
                    if (!zP) {
                        iE |= 4096;
                    }
                    l.b bVarT = this.f31885f1.t(this.f31921x1, cF02, iE, cF02.o());
                    if (zP) {
                        Q0(cF02, bVarT);
                    } else {
                        this.f31884f.a(cF02, bVarT);
                    }
                }
            }
            s();
        } else {
            s();
        }
        G0();
        r1(false);
        this.f31921x1.f32033e = 2;
    }

    private void D() {
        p1();
        F0();
        this.f31921x1.a(6);
        this.f31882d.j();
        this.f31921x1.f32034f = this.f31896l.c();
        z zVar = this.f31921x1;
        zVar.f32032d = 0;
        zVar.f32036h = false;
        this.f31898m.b1(this.f31880b, zVar);
        z zVar2 = this.f31921x1;
        zVar2.f32035g = false;
        this.f31881c = null;
        zVar2.f32039k = zVar2.f32039k && this.f31885f1 != null;
        zVar2.f32033e = 4;
        G0();
        r1(false);
    }

    private void E() {
        this.f31921x1.a(4);
        p1();
        F0();
        z zVar = this.f31921x1;
        zVar.f32033e = 1;
        if (zVar.f32039k) {
            for (int iG = this.f31883e.g() - 1; iG >= 0; iG--) {
                C cF0 = f0(this.f31883e.f(iG));
                if (!cF0.J()) {
                    long jC0 = c0(cF0);
                    l.b bVarS = this.f31885f1.s(this.f31921x1, cF0);
                    C cG = this.f31884f.g(jC0);
                    if (cG == null || cG.J()) {
                        this.f31884f.d(cF0, bVarS);
                    } else {
                        boolean zH = this.f31884f.h(cG);
                        boolean zH2 = this.f31884f.h(cF0);
                        if (zH && cG == cF0) {
                            this.f31884f.d(cF0, bVarS);
                        } else {
                            l.b bVarN = this.f31884f.n(cG);
                            this.f31884f.d(cF0, bVarS);
                            l.b bVarM = this.f31884f.m(cF0);
                            if (bVarN == null) {
                                k0(jC0, cF0, cG);
                            } else {
                                m(cG, cF0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.f31884f.o(this.f31877M1);
        }
        this.f31898m.p1(this.f31880b);
        z zVar2 = this.f31921x1;
        zVar2.f32031c = zVar2.f32034f;
        this.f31859C = false;
        this.f31861D = false;
        zVar2.f32039k = false;
        zVar2.f32040l = false;
        this.f31898m.f31977h = false;
        ArrayList arrayList = this.f31880b.f32005b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.f31898m;
        if (oVar.f31983n) {
            oVar.f31982m = 0;
            oVar.f31983n = false;
            this.f31880b.K();
        }
        this.f31898m.c1(this.f31921x1);
        G0();
        r1(false);
        this.f31884f.f();
        int[] iArr = this.f31866F1;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        R0();
        a1();
    }

    private void I0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f31889h1) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f31889h1 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f31897l1 = x10;
            this.f31893j1 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f31899m1 = y10;
            this.f31895k1 = y10;
        }
    }

    private boolean K(MotionEvent motionEvent) {
        r rVar = this.f31904p;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        rVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f31904p = null;
        }
        return true;
    }

    private boolean M0() {
        return this.f31885f1 != null && this.f31898m.P1();
    }

    private void N0() {
        boolean z10;
        if (this.f31859C) {
            this.f31882d.u();
            if (this.f31861D) {
                this.f31898m.W0(this);
            }
        }
        if (M0()) {
            this.f31882d.s();
        } else {
            this.f31882d.j();
        }
        boolean z11 = this.f31856A1 || this.f31858B1;
        this.f31921x1.f32039k = this.f31912t && this.f31885f1 != null && ((z10 = this.f31859C) || z11 || this.f31898m.f31977h) && (!z10 || this.f31896l.g());
        z zVar = this.f31921x1;
        zVar.f32040l = zVar.f32039k && z11 && !this.f31859C && M0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void P0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.M()
            android.widget.EdgeEffect r1 = r6.f31869H
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.d.c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.N()
            android.widget.EdgeEffect r1 = r6.f31873J
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.O()
            android.widget.EdgeEffect r9 = r6.f31871I
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.d.c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.L()
            android.widget.EdgeEffect r9 = r6.f31878N
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.d.c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            F1.W.d0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.P0(float, float, float, float):void");
    }

    private void R0() {
        View viewFindViewById;
        if (!this.f31913t1 || this.f31896l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f31852T1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f31883e.n(focusedChild)) {
                    return;
                }
            } else if (this.f31883e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewW = null;
        C cY = (this.f31921x1.f32042n == -1 || !this.f31896l.g()) ? null : Y(this.f31921x1.f32042n);
        if (cY != null && !this.f31883e.n(cY.f31934a) && cY.f31934a.hasFocusable()) {
            viewW = cY.f31934a;
        } else if (this.f31883e.g() > 0) {
            viewW = W();
        }
        if (viewW != null) {
            int i10 = this.f31921x1.f32043o;
            if (i10 != -1 && (viewFindViewById = viewW.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewW = viewFindViewById;
            }
            viewW.requestFocus();
        }
    }

    private void S0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f31869H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f31869H.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f31871I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f31871I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f31873J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f31873J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f31878N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f31878N.isFinished();
        }
        if (zIsFinished) {
            W.d0(this);
        }
    }

    private boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f31902o.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = (r) this.f31902o.get(i10);
            if (rVar.b(this, motionEvent) && action != 3) {
                this.f31904p = rVar;
                return true;
            }
        }
        return false;
    }

    private void U(int[] iArr) {
        int iG = this.f31883e.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = MPv3.MAX_MESSAGE_ID;
        int i11 = PduHandle.NONE;
        for (int i12 = 0; i12 < iG; i12++) {
            C cF0 = f0(this.f31883e.f(i12));
            if (!cF0.J()) {
                int iM = cF0.m();
                if (iM < i10) {
                    i10 = iM;
                }
                if (iM > i11) {
                    i11 = iM;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewV = V(viewGroup.getChildAt(i10));
            if (recyclerViewV != null) {
                return recyclerViewV;
            }
        }
        return null;
    }

    private View W() {
        C cX;
        z zVar = this.f31921x1;
        int i10 = zVar.f32041m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = zVar.b();
        for (int i11 = i10; i11 < iB; i11++) {
            C cX2 = X(i11);
            if (cX2 == null) {
                break;
            }
            if (cX2.f31934a.hasFocusable()) {
                return cX2.f31934a;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (cX = X(iMin)) == null) {
                return null;
            }
        } while (!cX.f31934a.hasFocusable());
        return cX.f31934a;
    }

    private void Z0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f31890i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f31996c) {
                Rect rect = pVar.f31995b;
                Rect rect2 = this.f31890i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f31890i);
            offsetRectIntoDescendantCoords(view, this.f31890i);
        }
        this.f31898m.w1(this, view, this.f31890i, !this.f31912t, view2 == null);
    }

    private void a1() {
        z zVar = this.f31921x1;
        zVar.f32042n = -1L;
        zVar.f32041m = -1;
        zVar.f32043o = -1;
    }

    private void b1() {
        VelocityTracker velocityTracker = this.f31891i1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        s1(0);
        S0();
    }

    private void c1() {
        View focusedChild = (this.f31913t1 && hasFocus() && this.f31896l != null) ? getFocusedChild() : null;
        C cS = focusedChild != null ? S(focusedChild) : null;
        if (cS == null) {
            a1();
            return;
        }
        this.f31921x1.f32042n = this.f31896l.g() ? cS.k() : -1L;
        this.f31921x1.f32041m = this.f31859C ? -1 : cS.v() ? cS.f31937d : cS.j();
        this.f31921x1.f32043o = h0(cS.f31934a);
    }

    static C f0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f31994a;
    }

    private void g(C c10) {
        View view = c10.f31934a;
        boolean z10 = view.getParent() == this;
        this.f31880b.J(e0(view));
        if (c10.x()) {
            this.f31883e.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f31883e.k(view);
        } else {
            this.f31883e.b(view, true);
        }
    }

    static void g0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f31995b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private F1.B getScrollingChildHelper() {
        if (this.f31868G1 == null) {
            this.f31868G1 = new F1.B(this);
        }
        return this.f31868G1;
    }

    private int h0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private void h1(g gVar, boolean z10, boolean z11) {
        g gVar2 = this.f31896l;
        if (gVar2 != null) {
            gVar2.s(this.f31879a);
            this.f31896l.l(this);
        }
        if (!z10 || z11) {
            T0();
        }
        this.f31882d.u();
        g gVar3 = this.f31896l;
        this.f31896l = gVar;
        if (gVar != null) {
            gVar.q(this.f31879a);
            gVar.h(this);
        }
        o oVar = this.f31898m;
        if (oVar != null) {
            oVar.I0(gVar3, this.f31896l);
        }
        this.f31880b.x(gVar3, this.f31896l, z10);
        this.f31921x1.f32035g = true;
    }

    private String i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void k0(long j10, C c10, C c11) {
        int iG = this.f31883e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            C cF0 = f0(this.f31883e.f(i10));
            if (cF0 != c10 && c0(cF0) == j10) {
                g gVar = this.f31896l;
                if (gVar == null || !gVar.g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + cF0 + " \n View Holder 2:" + c10 + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + cF0 + " \n View Holder 2:" + c10 + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c11 + " cannot be found but it is necessary for " + c10 + P());
    }

    private void m(C c10, C c11, l.b bVar, l.b bVar2, boolean z10, boolean z11) {
        c10.G(false);
        if (z10) {
            g(c10);
        }
        if (c10 != c11) {
            if (z11) {
                g(c11);
            }
            c10.f31941h = c11;
            g(c10);
            this.f31880b.J(c10);
            c11.G(false);
            c11.f31942i = c10;
        }
        if (this.f31885f1.b(c10, c11, bVar, bVar2)) {
            L0();
        }
    }

    private boolean m0() {
        int iG = this.f31883e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            C cF0 = f0(this.f31883e.f(i10));
            if (cF0 != null && !cF0.J() && cF0.y()) {
                return true;
            }
        }
        return false;
    }

    private void o0() {
        if (W.y(this) == 0) {
            W.w0(this, 8);
        }
    }

    private void p0() {
        this.f31883e = new b(new e());
    }

    private void q() {
        b1();
        setScrollState(0);
    }

    static void r(C c10) {
        WeakReference weakReference = c10.f31935b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c10.f31934a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c10.f31935b = null;
        }
    }

    private boolean u0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.f31890i.set(0, 0, view.getWidth(), view.getHeight());
        this.f31892j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f31890i);
        offsetDescendantRectToMyCoords(view2, this.f31892j);
        char c10 = 65535;
        int i12 = this.f31898m.d0() == 1 ? -1 : 1;
        Rect rect = this.f31890i;
        int i13 = rect.left;
        Rect rect2 = this.f31892j;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 <= 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 >= 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + P());
    }

    private void u1() {
        this.f31915u1.g();
        o oVar = this.f31898m;
        if (oVar != null) {
            oVar.O1();
        }
    }

    private void v(Context context, String str, AttributeSet attributeSet, int i10, int i11) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strI0 = i0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strI0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f31853U1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strI0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strI0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strI0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strI0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e16);
            }
        }
    }

    private boolean x(int i10, int i11) {
        U(this.f31866F1);
        int[] iArr = this.f31866F1;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    void A0(int i10, int i11) {
        int iJ = this.f31883e.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            C cF0 = f0(this.f31883e.i(i12));
            if (cF0 != null && !cF0.J() && cF0.f31936c >= i10) {
                cF0.A(i11, false);
                this.f31921x1.f32035g = true;
            }
        }
        this.f31880b.u(i10, i11);
        requestLayout();
    }

    void B() {
        if (this.f31896l == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f31898m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        z zVar = this.f31921x1;
        zVar.f32038j = false;
        if (zVar.f32033e == 1) {
            C();
            this.f31898m.D1(this);
            D();
        } else if (!this.f31882d.q() && this.f31898m.s0() == getWidth() && this.f31898m.b0() == getHeight()) {
            this.f31898m.D1(this);
        } else {
            this.f31898m.D1(this);
            D();
        }
        E();
    }

    void B0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f31883e.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            C cF0 = f0(this.f31883e.i(i16));
            if (cF0 != null && (i15 = cF0.f31936c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    cF0.A(i11 - i10, false);
                } else {
                    cF0.A(i14, false);
                }
                this.f31921x1.f32035g = true;
            }
        }
        this.f31880b.v(i10, i11);
        requestLayout();
    }

    void C0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f31883e.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            C cF0 = f0(this.f31883e.i(i13));
            if (cF0 != null && !cF0.J()) {
                int i14 = cF0.f31936c;
                if (i14 >= i12) {
                    cF0.A(-i11, z10);
                    this.f31921x1.f32035g = true;
                } else if (i14 >= i10) {
                    cF0.i(i10 - 1, -i11, z10);
                    this.f31921x1.f32035g = true;
                }
            }
        }
        this.f31880b.w(i10, i11, z10);
        requestLayout();
    }

    public void D0(View view) {
    }

    public void E0(View view) {
    }

    public boolean F(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    void F0() {
        this.f31863E++;
    }

    public final void G(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void G0() {
        H0(true);
    }

    void H(int i10) {
        o oVar = this.f31898m;
        if (oVar != null) {
            oVar.i1(i10);
        }
        J0(i10);
        s sVar = this.f31923y1;
        if (sVar != null) {
            sVar.a(this, i10);
        }
        List list = this.f31925z1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f31925z1.get(size)).a(this, i10);
            }
        }
    }

    void H0(boolean z10) {
        int i10 = this.f31863E - 1;
        this.f31863E = i10;
        if (i10 < 1) {
            this.f31863E = 0;
            if (z10) {
                A();
                J();
            }
        }
    }

    void I(int i10, int i11) {
        this.f31865F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        K0(i10, i11);
        s sVar = this.f31923y1;
        if (sVar != null) {
            sVar.b(this, i10, i11);
        }
        List list = this.f31925z1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f31925z1.get(size)).b(this, i10, i11);
            }
        }
        this.f31865F--;
    }

    void J() {
        int i10;
        for (int size = this.f31875K1.size() - 1; size >= 0; size--) {
            C c10 = (C) this.f31875K1.get(size);
            if (c10.f31934a.getParent() == this && !c10.J() && (i10 = c10.f31950q) != -1) {
                W.u0(c10.f31934a, i10);
                c10.f31950q = -1;
            }
        }
        this.f31875K1.clear();
    }

    public void J0(int i10) {
    }

    public void K0(int i10, int i11) {
    }

    void L() {
        if (this.f31878N != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f31867G.a(this, 3);
        this.f31878N = edgeEffectA;
        if (this.f31886g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void L0() {
        if (this.f31862D1 || !this.f31906q) {
            return;
        }
        W.e0(this, this.f31876L1);
        this.f31862D1 = true;
    }

    void M() {
        if (this.f31869H != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f31867G.a(this, 0);
        this.f31869H = edgeEffectA;
        if (this.f31886g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void N() {
        if (this.f31873J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f31867G.a(this, 2);
        this.f31873J = edgeEffectA;
        if (this.f31886g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void O() {
        if (this.f31871I != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f31867G.a(this, 1);
        this.f31871I = edgeEffectA;
        if (this.f31886g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void O0(boolean z10) {
        this.f31861D = z10 | this.f31861D;
        this.f31859C = true;
        x0();
    }

    String P() {
        return " " + super.toString() + ", adapter:" + this.f31896l + ", layout:" + this.f31898m + ", context:" + getContext();
    }

    final void Q(z zVar) {
        if (getScrollState() != 2) {
            zVar.f32044p = 0;
            zVar.f32045q = 0;
        } else {
            OverScroller overScroller = this.f31915u1.f31928c;
            zVar.f32044p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.f32045q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void Q0(C c10, l.b bVar) {
        c10.F(0, 8192);
        if (this.f31921x1.f32037i && c10.y() && !c10.v() && !c10.J()) {
            this.f31884f.c(c0(c10), c10);
        }
        this.f31884f.e(c10, bVar);
    }

    public View R(View view) {
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

    public C S(View view) {
        View viewR = R(view);
        if (viewR == null) {
            return null;
        }
        return e0(viewR);
    }

    void T0() {
        l lVar = this.f31885f1;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f31898m;
        if (oVar != null) {
            oVar.o1(this.f31880b);
            this.f31898m.p1(this.f31880b);
        }
        this.f31880b.c();
    }

    boolean U0(View view) {
        p1();
        boolean zR = this.f31883e.r(view);
        if (zR) {
            C cF0 = f0(view);
            this.f31880b.J(cF0);
            this.f31880b.C(cF0);
        }
        r1(!zR);
        return zR;
    }

    public void V0(n nVar) {
        o oVar = this.f31898m;
        if (oVar != null) {
            oVar.h("Cannot remove item decoration during a scroll  or layout");
        }
        this.f31900n.remove(nVar);
        if (this.f31900n.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public void W0(r rVar) {
        this.f31902o.remove(rVar);
        if (this.f31904p == rVar) {
            this.f31904p = null;
        }
    }

    public C X(int i10) {
        C c10 = null;
        if (this.f31859C) {
            return null;
        }
        int iJ = this.f31883e.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            C cF0 = f0(this.f31883e.i(i11));
            if (cF0 != null && !cF0.v() && b0(cF0) == i10) {
                if (!this.f31883e.n(cF0.f31934a)) {
                    return cF0;
                }
                c10 = cF0;
            }
        }
        return c10;
    }

    public void X0(s sVar) {
        List list = this.f31925z1;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public C Y(long j10) {
        g gVar = this.f31896l;
        C c10 = null;
        if (gVar != null && gVar.g()) {
            int iJ = this.f31883e.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                C cF0 = f0(this.f31883e.i(i10));
                if (cF0 != null && !cF0.v() && cF0.k() == j10) {
                    if (!this.f31883e.n(cF0.f31934a)) {
                        return cF0;
                    }
                    c10 = cF0;
                }
            }
        }
        return c10;
    }

    void Y0() {
        C c10;
        int iG = this.f31883e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f31883e.f(i10);
            C cE0 = e0(viewF);
            if (cE0 != null && (c10 = cE0.f31942i) != null) {
                View view = c10.f31934a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.C Z(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f31883e
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f31883e
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$C r3 = f0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f31936c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f31883e
            android.view.View r4 = r3.f31934a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Z(int, boolean):androidx.recyclerview.widget.RecyclerView$C");
    }

    void a(int i10, int i11) {
        if (i10 < 0) {
            M();
            if (this.f31869H.isFinished()) {
                this.f31869H.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            N();
            if (this.f31873J.isFinished()) {
                this.f31873J.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            O();
            if (this.f31871I.isFinished()) {
                this.f31871I.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            L();
            if (this.f31878N.isFinished()) {
                this.f31878N.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        W.d0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean a0(int i10, int i11) {
        o oVar = this.f31898m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f31918w) {
            return false;
        }
        int iP = oVar.p();
        boolean zQ = this.f31898m.q();
        if (iP == 0 || Math.abs(i10) < this.f31905p1) {
            i10 = 0;
        }
        if (!zQ || Math.abs(i11) < this.f31905p1) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = i10;
        float f11 = i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = iP != 0 || zQ;
            dispatchNestedFling(f10, f11, z10);
            q qVar = this.f31903o1;
            if (qVar != null && qVar.a(i10, i11)) {
                return true;
            }
            if (z10) {
                if (zQ) {
                    iP = (iP == true ? 1 : 0) | 2;
                }
                q1(iP, 1);
                int i12 = this.f31907q1;
                int iMax = Math.max(-i12, Math.min(i10, i12));
                int i13 = this.f31907q1;
                this.f31915u1.c(iMax, Math.max(-i13, Math.min(i11, i13)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        o oVar = this.f31898m;
        if (oVar == null || !oVar.J0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    int b0(C c10) {
        if (c10.p(524) || !c10.s()) {
            return -1;
        }
        return this.f31882d.e(c10.f31936c);
    }

    long c0(C c10) {
        return this.f31896l.g() ? c10.k() : c10.f31936c;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f31898m.r((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.f31898m;
        if (oVar != null && oVar.p()) {
            return this.f31898m.v(this.f31921x1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.f31898m;
        if (oVar != null && oVar.p()) {
            return this.f31898m.w(this.f31921x1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.f31898m;
        if (oVar != null && oVar.p()) {
            return this.f31898m.x(this.f31921x1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.f31898m;
        if (oVar != null && oVar.q()) {
            return this.f31898m.y(this.f31921x1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.f31898m;
        if (oVar != null && oVar.q()) {
            return this.f31898m.z(this.f31921x1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.f31898m;
        if (oVar != null && oVar.q()) {
            return this.f31898m.A(this.f31921x1);
        }
        return 0;
    }

    public int d0(View view) {
        C cF0 = f0(view);
        if (cF0 != null) {
            return cF0.m();
        }
        return -1;
    }

    void d1() {
        int iJ = this.f31883e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            C cF0 = f0(this.f31883e.i(i10));
            if (!cF0.J()) {
                cF0.E();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f31900n.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((n) this.f31900n.get(i10)).i(canvas, this, this.f31921x1);
        }
        EdgeEffect edgeEffect = this.f31869H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f31886g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f31869H;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f31871I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f31886g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f31871I;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f31873J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f31886g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f31873J;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f31878N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f31886g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f31878N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f31885f1 == null || this.f31900n.size() <= 0 || !this.f31885f1.p()) ? z10 : true) {
            W.d0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public C e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    boolean e1(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        u();
        if (this.f31896l != null) {
            int[] iArr = this.f31874J1;
            iArr[0] = 0;
            iArr[1] = 0;
            f1(i10, i11, iArr);
            int[] iArr2 = this.f31874J1;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i12 = i17;
            i13 = i16;
            i14 = i10 - i16;
            i15 = i11 - i17;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.f31900n.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f31874J1;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i13, i12, i14, i15, this.f31870H1, 0, iArr3);
        int[] iArr4 = this.f31874J1;
        int i18 = iArr4[0];
        int i19 = i14 - i18;
        int i20 = iArr4[1];
        int i21 = i15 - i20;
        boolean z10 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.f31897l1;
        int[] iArr5 = this.f31870H1;
        int i23 = iArr5[0];
        this.f31897l1 = i22 - i23;
        int i24 = this.f31899m1;
        int i25 = iArr5[1];
        this.f31899m1 = i24 - i25;
        int[] iArr6 = this.f31872I1;
        iArr6[0] = iArr6[0] + i23;
        iArr6[1] = iArr6[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !F1.A.a(motionEvent, 8194)) {
                P0(motionEvent.getX(), i19, motionEvent.getY(), i21);
            }
            t(i10, i11);
        }
        if (i13 != 0 || i12 != 0) {
            I(i13, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i12 == 0) ? false : true;
    }

    void f1(int i10, int i11, int[] iArr) {
        p1();
        F0();
        A1.o.a("RV Scroll");
        Q(this.f31921x1);
        int iA1 = i10 != 0 ? this.f31898m.A1(i10, this.f31880b, this.f31921x1) : 0;
        int iC1 = i11 != 0 ? this.f31898m.C1(i11, this.f31880b, this.f31921x1) : 0;
        A1.o.b();
        Y0();
        G0();
        r1(false);
        if (iArr != null) {
            iArr[0] = iA1;
            iArr[1] = iC1;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewN0;
        boolean z10;
        View viewU0 = this.f31898m.U0(view, i10);
        if (viewU0 != null) {
            return viewU0;
        }
        boolean z11 = (this.f31896l == null || this.f31898m == null || t0() || this.f31918w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f31898m.q()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f31851S1) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f31898m.p()) {
                int i12 = (this.f31898m.d0() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f31851S1) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                this.f31898m.N0(view, i10, this.f31880b, this.f31921x1);
                r1(false);
            }
            viewN0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                viewN0 = this.f31898m.N0(view, i10, this.f31880b, this.f31921x1);
                r1(false);
            } else {
                viewN0 = viewFindNextFocus;
            }
        }
        if (viewN0 == null || viewN0.hasFocusable()) {
            return u0(view, viewN0, i10) ? viewN0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        Z0(viewN0, null);
        return view;
    }

    public void g1(int i10) {
        if (this.f31918w) {
            return;
        }
        t1();
        o oVar = this.f31898m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.B1(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f31898m;
        if (oVar != null) {
            return oVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f31898m;
        if (oVar != null) {
            return oVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f31896l;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f31898m;
        return oVar != null ? oVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f31886g;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.f31864E1;
    }

    public k getEdgeEffectFactory() {
        return this.f31867G;
    }

    public l getItemAnimator() {
        return this.f31885f1;
    }

    public int getItemDecorationCount() {
        return this.f31900n.size();
    }

    public o getLayoutManager() {
        return this.f31898m;
    }

    public int getMaxFlingVelocity() {
        return this.f31907q1;
    }

    public int getMinFlingVelocity() {
        return this.f31905p1;
    }

    long getNanoTime() {
        if (f31850R1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return this.f31903o1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f31913t1;
    }

    public t getRecycledViewPool() {
        return this.f31880b.i();
    }

    public int getScrollState() {
        return this.f31887g1;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i10) {
        o oVar = this.f31898m;
        if (oVar != null) {
            oVar.h("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f31900n.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f31900n.add(nVar);
        } else {
            this.f31900n.add(i10, nVar);
        }
        w0();
        requestLayout();
    }

    boolean i1(C c10, int i10) {
        if (!t0()) {
            W.u0(c10.f31934a, i10);
            return true;
        }
        c10.f31950q = i10;
        this.f31875K1.add(c10);
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f31906q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f31918w;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(r rVar) {
        this.f31902o.add(rVar);
    }

    Rect j0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f31996c) {
            return pVar.f31995b;
        }
        if (this.f31921x1.e() && (pVar.b() || pVar.d())) {
            return pVar.f31995b;
        }
        Rect rect = pVar.f31995b;
        rect.set(0, 0, 0, 0);
        int size = this.f31900n.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f31890i.set(0, 0, 0, 0);
            ((n) this.f31900n.get(i10)).e(this.f31890i, view, this, this.f31921x1);
            int i11 = rect.left;
            Rect rect2 = this.f31890i;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f31996c = false;
        return rect;
    }

    boolean j1(AccessibilityEvent accessibilityEvent) {
        if (!t0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? G1.b.a(accessibilityEvent) : 0;
        this.f31922y |= iA != 0 ? iA : 0;
        return true;
    }

    public void k(s sVar) {
        if (this.f31925z1 == null) {
            this.f31925z1 = new ArrayList();
        }
        this.f31925z1.add(sVar);
    }

    public void k1(int i10, int i11) {
        l1(i10, i11, null);
    }

    void l(C c10, l.b bVar, l.b bVar2) {
        c10.G(false);
        if (this.f31885f1.a(c10, bVar, bVar2)) {
            L0();
        }
    }

    public boolean l0() {
        return !this.f31912t || this.f31859C || this.f31882d.p();
    }

    public void l1(int i10, int i11, Interpolator interpolator) {
        m1(i10, i11, interpolator, PduHandle.NONE);
    }

    public void m1(int i10, int i11, Interpolator interpolator, int i12) {
        n1(i10, i11, interpolator, i12, false);
    }

    void n(C c10, l.b bVar, l.b bVar2) {
        g(c10);
        c10.G(false);
        if (this.f31885f1.c(c10, bVar, bVar2)) {
            L0();
        }
    }

    void n0() {
        this.f31882d = new a(new f());
    }

    void n1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        o oVar = this.f31898m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f31918w) {
            return;
        }
        if (!oVar.p()) {
            i10 = 0;
        }
        if (!this.f31898m.q()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            q1(i13, 1);
        }
        this.f31915u1.f(i10, i11, i12, interpolator);
    }

    void o(String str) {
        if (t0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.f31865F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    public void o1(int i10) {
        if (this.f31918w) {
            return;
        }
        o oVar = this.f31898m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.M1(this, this.f31921x1, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f31863E = r0
            r1 = 1
            r5.f31906q = r1
            boolean r2 = r5.f31912t
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f31912t = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.f31898m
            if (r1 == 0) goto L1e
            r1.E(r5)
        L1e:
            r5.f31862D1 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f31850R1
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f32206e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f31917v1 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f31917v1 = r1
            android.view.Display r1 = F1.W.t(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f31917v1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f32210c = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f31917v1
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.f31885f1;
        if (lVar != null) {
            lVar.k();
        }
        t1();
        this.f31906q = false;
        o oVar = this.f31898m;
        if (oVar != null) {
            oVar.F(this, this.f31880b);
        }
        this.f31875K1.clear();
        removeCallbacks(this.f31876L1);
        this.f31884f.j();
        if (!f31850R1 || (eVar = this.f31917v1) == null) {
            return;
        }
        eVar.j(this);
        this.f31917v1 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f31900n.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n) this.f31900n.get(i10)).g(canvas, this, this.f31921x1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f31898m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f31918w
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f31898m
            boolean r0 = r0.q()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f31898m
            boolean r3 = r3.p()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f31898m
            boolean r3 = r3.q()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f31898m
            boolean r3 = r3.p()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f31909r1
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f31911s1
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.e1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f31918w) {
            return false;
        }
        this.f31904p = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.f31898m;
        if (oVar == null) {
            return false;
        }
        boolean zP = oVar.p();
        boolean zQ = this.f31898m.q();
        if (this.f31891i1 == null) {
            this.f31891i1 = VelocityTracker.obtain();
        }
        this.f31891i1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f31920x) {
                this.f31920x = false;
            }
            this.f31889h1 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f31897l1 = x10;
            this.f31893j1 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f31899m1 = y10;
            this.f31895k1 = y10;
            if (this.f31887g1 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                s1(1);
            }
            int[] iArr = this.f31872I1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zP;
            if (zQ) {
                i10 = (zP ? 1 : 0) | 2;
            }
            q1(i10, 0);
        } else if (actionMasked == 1) {
            this.f31891i1.clear();
            s1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f31889h1);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f31889h1 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f31887g1 != 1) {
                int i11 = x11 - this.f31893j1;
                int i12 = y11 - this.f31895k1;
                if (zP == 0 || Math.abs(i11) <= this.f31901n1) {
                    z10 = false;
                } else {
                    this.f31897l1 = x11;
                    z10 = true;
                }
                if (zQ && Math.abs(i12) > this.f31901n1) {
                    this.f31899m1 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.f31889h1 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f31897l1 = x12;
            this.f31893j1 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f31899m1 = y12;
            this.f31895k1 = y12;
        } else if (actionMasked == 6) {
            I0(motionEvent);
        }
        return this.f31887g1 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        A1.o.a("RV OnLayout");
        B();
        A1.o.b();
        this.f31912t = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        o oVar = this.f31898m;
        if (oVar == null) {
            w(i10, i11);
            return;
        }
        if (oVar.w0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f31898m.d1(this.f31880b, this.f31921x1, i10, i11);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f31896l == null) {
                return;
            }
            if (this.f31921x1.f32033e == 1) {
                C();
            }
            this.f31898m.E1(i10, i11);
            this.f31921x1.f32038j = true;
            D();
            this.f31898m.H1(i10, i11);
            if (this.f31898m.K1()) {
                this.f31898m.E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f31921x1.f32038j = true;
                D();
                this.f31898m.H1(i10, i11);
                return;
            }
            return;
        }
        if (this.f31908r) {
            this.f31898m.d1(this.f31880b, this.f31921x1, i10, i11);
            return;
        }
        if (this.f31924z) {
            p1();
            F0();
            N0();
            G0();
            z zVar = this.f31921x1;
            if (zVar.f32040l) {
                zVar.f32036h = true;
            } else {
                this.f31882d.j();
                this.f31921x1.f32036h = false;
            }
            this.f31924z = false;
            r1(false);
        } else if (this.f31921x1.f32040l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.f31896l;
        if (gVar != null) {
            this.f31921x1.f32034f = gVar.c();
        } else {
            this.f31921x1.f32034f = 0;
        }
        p1();
        this.f31898m.d1(this.f31880b, this.f31921x1, i10, i11);
        r1(false);
        this.f31921x1.f32036h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f31881c = xVar;
        super.onRestoreInstanceState(xVar.a());
        o oVar = this.f31898m;
        if (oVar == null || (parcelable2 = this.f31881c.f32013c) == null) {
            return;
        }
        oVar.g1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f31881c;
        if (xVar2 != null) {
            xVar.b(xVar2);
        } else {
            o oVar = this.f31898m;
            if (oVar != null) {
                xVar.f32013c = oVar.h1();
            } else {
                xVar.f32013c = null;
            }
        }
        return xVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r0
  0x00df: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    boolean p(C c10) {
        l lVar = this.f31885f1;
        return lVar == null || lVar.g(c10, c10.o());
    }

    void p1() {
        int i10 = this.f31914u + 1;
        this.f31914u = i10;
        if (i10 != 1 || this.f31918w) {
            return;
        }
        this.f31916v = false;
    }

    void q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC6541b.f52364a), resources.getDimensionPixelSize(AbstractC6541b.f52366c), resources.getDimensionPixelOffset(AbstractC6541b.f52365b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    public boolean q1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    void r0() {
        this.f31878N = null;
        this.f31871I = null;
        this.f31873J = null;
        this.f31869H = null;
    }

    void r1(boolean z10) {
        if (this.f31914u < 1) {
            this.f31914u = 1;
        }
        if (!z10 && !this.f31918w) {
            this.f31916v = false;
        }
        if (this.f31914u == 1) {
            if (z10 && this.f31916v && !this.f31918w && this.f31898m != null && this.f31896l != null) {
                B();
            }
            if (!this.f31918w) {
                this.f31916v = false;
            }
        }
        this.f31914u--;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        C cF0 = f0(view);
        if (cF0 != null) {
            if (cF0.x()) {
                cF0.f();
            } else if (!cF0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + cF0 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f31898m.f1(this, this.f31921x1, view, view2) && view2 != null) {
            Z0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f31898m.v1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f31902o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) this.f31902o.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f31914u != 0 || this.f31918w) {
            this.f31916v = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int iJ = this.f31883e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            C cF0 = f0(this.f31883e.i(i10));
            if (!cF0.J()) {
                cF0.c();
            }
        }
        this.f31880b.d();
    }

    boolean s0() {
        AccessibilityManager accessibilityManager = this.f31855A;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void s1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        o oVar = this.f31898m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f31918w) {
            return;
        }
        boolean zP = oVar.p();
        boolean zQ = this.f31898m.q();
        if (zP || zQ) {
            if (!zP) {
                i10 = 0;
            }
            if (!zQ) {
                i11 = 0;
            }
            e1(i10, i11, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (j1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l lVar) {
        this.f31864E1 = lVar;
        W.m0(this, lVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        h1(gVar, false, true);
        O0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f31886g) {
            r0();
        }
        this.f31886g = z10;
        super.setClipToPadding(z10);
        if (this.f31912t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        E1.h.g(kVar);
        this.f31867G = kVar;
        r0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f31908r = z10;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.f31885f1;
        if (lVar2 != null) {
            lVar2.k();
            this.f31885f1.v(null);
        }
        this.f31885f1 = lVar;
        if (lVar != null) {
            lVar.v(this.f31860C1);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f31880b.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.f31898m) {
            return;
        }
        t1();
        if (this.f31898m != null) {
            l lVar = this.f31885f1;
            if (lVar != null) {
                lVar.k();
            }
            this.f31898m.o1(this.f31880b);
            this.f31898m.p1(this.f31880b);
            this.f31880b.c();
            if (this.f31906q) {
                this.f31898m.F(this, this.f31880b);
            }
            this.f31898m.I1(null);
            this.f31898m = null;
        } else {
            this.f31880b.c();
        }
        this.f31883e.o();
        this.f31898m = oVar;
        if (oVar != null) {
            if (oVar.f31971b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f31971b.P());
            }
            oVar.I1(this);
            if (this.f31906q) {
                this.f31898m.E(this);
            }
        }
        this.f31880b.K();
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
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(q qVar) {
        this.f31903o1 = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f31923y1 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f31913t1 = z10;
    }

    public void setRecycledViewPool(t tVar) {
        this.f31880b.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
    }

    void setScrollState(int i10) {
        if (i10 == this.f31887g1) {
            return;
        }
        this.f31887g1 = i10;
        if (i10 != 2) {
            u1();
        }
        H(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f31901n1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f31901n1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(A a10) {
        this.f31880b.F(a10);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f31918w) {
            o("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f31918w = true;
                this.f31920x = true;
                t1();
                return;
            }
            this.f31918w = false;
            if (this.f31916v && this.f31898m != null && this.f31896l != null) {
                requestLayout();
            }
            this.f31916v = false;
        }
    }

    void t(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f31869H;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f31869H.onRelease();
            zIsFinished = this.f31869H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f31873J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f31873J.onRelease();
            zIsFinished |= this.f31873J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f31871I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f31871I.onRelease();
            zIsFinished |= this.f31871I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f31878N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f31878N.onRelease();
            zIsFinished |= this.f31878N.isFinished();
        }
        if (zIsFinished) {
            W.d0(this);
        }
    }

    public boolean t0() {
        return this.f31863E > 0;
    }

    public void t1() {
        setScrollState(0);
        u1();
    }

    void u() {
        if (!this.f31912t || this.f31859C) {
            A1.o.a("RV FullInvalidate");
            B();
            A1.o.b();
            return;
        }
        if (this.f31882d.p()) {
            if (!this.f31882d.o(4) || this.f31882d.o(11)) {
                if (this.f31882d.p()) {
                    A1.o.a("RV FullInvalidate");
                    B();
                    A1.o.b();
                    return;
                }
                return;
            }
            A1.o.a("RV PartialInvalidate");
            p1();
            F0();
            this.f31882d.s();
            if (!this.f31916v) {
                if (m0()) {
                    B();
                } else {
                    this.f31882d.i();
                }
            }
            r1(true);
            G0();
            A1.o.b();
        }
    }

    void v0(int i10) {
        if (this.f31898m == null) {
            return;
        }
        setScrollState(2);
        this.f31898m.B1(i10);
        awakenScrollBars();
    }

    void v1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f31883e.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f31883e.i(i14);
            C cF0 = f0(viewI);
            if (cF0 != null && !cF0.J() && (i12 = cF0.f31936c) >= i10 && i12 < i13) {
                cF0.b(2);
                cF0.a(obj);
                ((p) viewI.getLayoutParams()).f31996c = true;
            }
        }
        this.f31880b.M(i10, i11);
    }

    void w(int i10, int i11) {
        setMeasuredDimension(o.s(i10, getPaddingLeft() + getPaddingRight(), W.B(this)), o.s(i11, getPaddingTop() + getPaddingBottom(), W.A(this)));
    }

    void w0() {
        int iJ = this.f31883e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((p) this.f31883e.i(i10).getLayoutParams()).f31996c = true;
        }
        this.f31880b.s();
    }

    void x0() {
        int iJ = this.f31883e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            C cF0 = f0(this.f31883e.i(i10));
            if (cF0 != null && !cF0.J()) {
                cF0.b(6);
            }
        }
        w0();
        this.f31880b.t();
    }

    void y(View view) {
        int size;
        C cF0 = f0(view);
        D0(view);
        g gVar = this.f31896l;
        if (gVar != null && cF0 != null) {
            gVar.n(cF0);
        }
        if (this.f31857B == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC5487d.a(this.f31857B.get(size));
        throw null;
    }

    public void y0(int i10) {
        int iG = this.f31883e.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f31883e.f(i11).offsetLeftAndRight(i10);
        }
    }

    void z(View view) {
        int size;
        C cF0 = f0(view);
        E0(view);
        g gVar = this.f31896l;
        if (gVar != null && cF0 != null) {
            gVar.o(cF0);
        }
        if (this.f31857B == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC5487d.a(this.f31857B.get(size));
        throw null;
    }

    public void z0(int i10) {
        int iG = this.f31883e.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f31883e.f(i11).offsetTopAndBottom(i10);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i10);
        this.f31879a = new w();
        this.f31880b = new u();
        this.f31884f = new androidx.recyclerview.widget.q();
        this.f31888h = new RunnableC4023a();
        this.f31890i = new Rect();
        this.f31892j = new Rect();
        this.f31894k = new RectF();
        this.f31900n = new ArrayList();
        this.f31902o = new ArrayList();
        this.f31914u = 0;
        this.f31859C = false;
        this.f31861D = false;
        this.f31863E = 0;
        this.f31865F = 0;
        this.f31867G = new k();
        this.f31885f1 = new c();
        this.f31887g1 = 0;
        this.f31889h1 = -1;
        this.f31909r1 = Float.MIN_VALUE;
        this.f31911s1 = Float.MIN_VALUE;
        this.f31913t1 = true;
        this.f31915u1 = new B();
        this.f31919w1 = f31850R1 ? new e.b() : null;
        this.f31921x1 = new z();
        this.f31856A1 = false;
        this.f31858B1 = false;
        this.f31860C1 = new m();
        this.f31862D1 = false;
        this.f31866F1 = new int[2];
        this.f31870H1 = new int[2];
        this.f31872I1 = new int[2];
        this.f31874J1 = new int[2];
        this.f31875K1 = new ArrayList();
        this.f31876L1 = new RunnableC4024b();
        this.f31877M1 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f31901n1 = viewConfiguration.getScaledTouchSlop();
        this.f31909r1 = Z.e(viewConfiguration, context);
        this.f31911s1 = Z.h(viewConfiguration, context);
        this.f31905p1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f31907q1 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f31885f1.v(this.f31860C1);
        n0();
        p0();
        o0();
        if (W.x(this) == 0) {
            W.u0(this, 1);
        }
        this.f31855A = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        int[] iArr = l2.c.f52372f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(l2.c.f52381o);
        if (typedArrayObtainStyledAttributes.getInt(l2.c.f52375i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f31886g = typedArrayObtainStyledAttributes.getBoolean(l2.c.f52374h, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(l2.c.f52376j, false);
        this.f31910s = z10;
        if (z10) {
            q0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(l2.c.f52379m), typedArrayObtainStyledAttributes.getDrawable(l2.c.f52380n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(l2.c.f52377k), typedArrayObtainStyledAttributes.getDrawable(l2.c.f52378l));
        }
        typedArrayObtainStyledAttributes.recycle();
        v(context, string, attributeSet, i10, 0);
        int[] iArr2 = f31846N1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        }
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        C f31994a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f31995b;

        /* renamed from: c, reason: collision with root package name */
        boolean f31996c;

        /* renamed from: d, reason: collision with root package name */
        boolean f31997d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31995b = new Rect();
            this.f31996c = true;
            this.f31997d = false;
        }

        public int a() {
            return this.f31994a.m();
        }

        public boolean b() {
            return this.f31994a.y();
        }

        public boolean c() {
            return this.f31994a.v();
        }

        public boolean d() {
            return this.f31994a.t();
        }

        public p(int i10, int i11) {
            super(i10, i11);
            this.f31995b = new Rect();
            this.f31996c = true;
            this.f31997d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f31995b = new Rect();
            this.f31996c = true;
            this.f31997d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31995b = new Rect();
            this.f31996c = true;
            this.f31997d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f31995b = new Rect();
            this.f31996c = true;
            this.f31997d = false;
        }
    }

    public static class x extends L1.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        Parcelable f32013c;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public x[] newArray(int i10) {
                return new x[i10];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32013c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        void b(x xVar) {
            this.f32013c = xVar.f32013c;
        }

        @Override // L1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f32013c, 0);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f31898m;
        if (oVar != null) {
            return oVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }
}
