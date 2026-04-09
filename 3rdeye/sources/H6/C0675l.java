package H6;

import K1.m;
import K6.C0713c;
import K6.C0745n;
import K6.Q0;
import N7.C1130d0;
import N7.C1175g0;
import N7.C1217ic;
import N7.C1397vb;
import N7.Tb;
import N7.U3;
import N7.X9;
import N7.Z;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import b9.C1992A;
import b9.C2001h;
import c9.C2087h;
import c9.C2089j;
import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import c9.C2099t;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import h7.C4422c;
import i6.C4458a;
import i7.l;
import j6.C5195A;
import j6.q;
import j6.x.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.C5246y;
import m0.C5308a;
import m6.InterfaceC5331d;
import o6.C5425b;
import o6.C5426c;
import p9.InterfaceC5480a;
import q9.InterfaceC5499a;
import q9.InterfaceC5501c;
import r6.C5529f;
import t4.C5606d;
import x6.AbstractC5774f;
import x6.C5775g;
import x6.InterfaceC5769a;
import x9.C5786d;
import z6.C5865d;
import z6.C5866e;

/* compiled from: Div2View.kt */
@SuppressLint({"ViewConstructor"})
/* renamed from: H6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675l extends r7.g implements j6.y {

    /* renamed from: A, reason: collision with root package name */
    public final WeakHashMap<View, Z> f2157A;

    /* renamed from: B, reason: collision with root package name */
    public final WeakHashMap<View, C1130d0.a> f2158B;

    /* renamed from: C, reason: collision with root package name */
    public final a f2159C;

    /* renamed from: D, reason: collision with root package name */
    public C5426c f2160D;

    /* renamed from: E, reason: collision with root package name */
    public C5426c f2161E;

    /* renamed from: F, reason: collision with root package name */
    public p6.h f2162F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2163G;

    /* renamed from: H, reason: collision with root package name */
    public C0672i f2164H;

    /* renamed from: I, reason: collision with root package name */
    public A6.a f2165I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2166J;

    /* renamed from: K, reason: collision with root package name */
    public final Object f2167K;

    /* renamed from: L, reason: collision with root package name */
    public C6.m f2168L;

    /* renamed from: M, reason: collision with root package name */
    public C6.m f2169M;

    /* renamed from: N, reason: collision with root package name */
    public C6.m f2170N;

    /* renamed from: O, reason: collision with root package name */
    public C6.m f2171O;

    /* renamed from: P, reason: collision with root package name */
    public long f2172P;

    /* renamed from: Q, reason: collision with root package name */
    public j6.w f2173Q;

    /* renamed from: R, reason: collision with root package name */
    public T6.d f2174R;

    /* renamed from: S, reason: collision with root package name */
    public final C0681s f2175S;

    /* renamed from: T, reason: collision with root package name */
    public final Object f2176T;

    /* renamed from: U, reason: collision with root package name */
    public final T6.b f2177U;

    /* renamed from: V, reason: collision with root package name */
    public final LinkedHashMap f2178V;

    /* renamed from: W, reason: collision with root package name */
    public final LinkedHashMap f2179W;

    /* renamed from: a0, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f2180a0;

    /* renamed from: b0, reason: collision with root package name */
    public C4458a f2181b0;

    /* renamed from: c0, reason: collision with root package name */
    public C4458a f2182c0;

    /* renamed from: d0, reason: collision with root package name */
    public U3 f2183d0;

    /* renamed from: e0, reason: collision with root package name */
    public j6.h f2184e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f2185f0;

    /* renamed from: g0, reason: collision with root package name */
    public final String f2186g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f2187h0;

    /* renamed from: i0, reason: collision with root package name */
    public final I6.f f2188i0;

    /* renamed from: n, reason: collision with root package name */
    public final j6.e f2189n;

    /* renamed from: o, reason: collision with root package name */
    public final long f2190o;

    /* renamed from: p, reason: collision with root package name */
    public final Div2Component f2191p;

    /* renamed from: q, reason: collision with root package name */
    public final Div2ViewComponent f2192q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2193r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2194s;

    /* renamed from: t, reason: collision with root package name */
    public final E7.b f2195t;

    /* renamed from: u, reason: collision with root package name */
    public final S6.b f2196u;

    /* renamed from: v, reason: collision with root package name */
    public final C0674k f2197v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f2198w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f2199x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f2200y;

    /* renamed from: z, reason: collision with root package name */
    public final C5195A<InterfaceC5331d> f2201z;

    /* compiled from: Div2View.kt */
    /* renamed from: H6.l$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2202a;

        /* renamed from: b, reason: collision with root package name */
        public U3.a f2203b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2204c = true;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f2205d = new ArrayList();

        public a() {
        }

        public final void a() {
            long j4;
            U3.a aVar = this.f2203b;
            if (aVar == null) {
                return;
            }
            C0675l c0675l = C0675l.this;
            long stateId$div_release = c0675l.getStateId$div_release();
            long j10 = aVar.f6383b;
            if (j10 != stateId$div_release) {
                c0675l.K(j10, this.f2204c);
            } else if (c0675l.getChildCount() > 0) {
                try {
                    W6.c cVarK = c0675l.getViewComponent$div_release().k();
                    List<C5865d> listUnmodifiableList = this.f2205d;
                    kotlin.jvm.internal.l.f(listUnmodifiableList, "<this>");
                    if (!(listUnmodifiableList instanceof InterfaceC5499a) || (listUnmodifiableList instanceof InterfaceC5501c)) {
                        listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listUnmodifiableList));
                        kotlin.jvm.internal.l.e(listUnmodifiableList, "{\n        Collections.un…st(ArrayList(this))\n    }");
                    }
                    cVarK.a(aVar, listUnmodifiableList, c0675l.getExpressionResolver());
                } catch (z6.i e4) {
                    C5246y.d(c0675l, e4);
                    C5866e currentState = c0675l.getCurrentState();
                    if (currentState != null) {
                        currentState.f48466b.clear();
                    }
                    Q6.d dVarF = c0675l.getDiv2Component$div_release().f();
                    String str = c0675l.getDivTag().f38455a;
                    synchronized (dVarF.f11323a) {
                        U3 divData = c0675l.getDivData();
                        if (divData != null) {
                            List<U3.a> list = divData.f6376c;
                            if (list.isEmpty()) {
                                int i = U3.i;
                                j4 = -1;
                            } else {
                                j4 = list.get(0).f6383b;
                            }
                            C5866e currentState2 = c0675l.getCurrentState();
                            if (currentState2 != null) {
                                j4 = currentState2.f48465a;
                            }
                            c0675l.K(j4, true);
                        }
                    }
                }
            }
            this.f2203b = null;
            this.f2204c = true;
            this.f2205d.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(U3.a aVar, C5865d c5865d, boolean z10) {
            List listG = E.u.G(c5865d);
            U3.a aVar2 = this.f2203b;
            if (aVar2 != null && !kotlin.jvm.internal.l.b(aVar, aVar2)) {
                this.f2203b = null;
                this.f2204c = true;
                this.f2205d.clear();
            }
            this.f2203b = aVar;
            this.f2204c = this.f2204c && z10;
            List<C5865d> list = listG;
            C2095p.b0(list, this.f2205d);
            C0675l c0675l = C0675l.this;
            for (C5865d divStatePath : list) {
                A6.b bVarC = c0675l.getDiv2Component$div_release().C();
                String str = c0675l.getDivTag().f38455a;
                kotlin.jvm.internal.l.f(divStatePath, "divStatePath");
                String strC = divStatePath.c();
                List<b9.l<String, String>> list2 = divStatePath.f48459b;
                String str2 = list2.isEmpty() ? null : (String) ((b9.l) C2097r.v0(list2)).f18084c;
                if (strC != null && str2 != null) {
                    synchronized (((C5308a) bVarC.f42d)) {
                        ((Q6.d) bVarC.f41c).d(str, strC, str2);
                        if (!z10) {
                            Map states = (Map) ((E7.b) bVarC.f40b).f1475b;
                            kotlin.jvm.internal.l.e(states, "states");
                            states.put(new b9.l(str, strC), str2);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    }
                }
            }
            if (this.f2202a == 0) {
                a();
            }
        }
    }

    /* compiled from: Div2View.kt */
    /* renamed from: H6.l$b */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c f2207g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(0);
            this.f2207g = cVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            this.f2207g.invoke();
            return C1992A.f18074a;
        }
    }

    /* compiled from: Div2View.kt */
    /* renamed from: H6.l$c */
    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ U3.a f2209h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(U3.a aVar) {
            super(0);
            this.f2209h = aVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            C0675l c0675l = C0675l.this;
            p6.d dVarF = c0675l.getViewComponent$div_release().f();
            U3.a aVar = this.f2209h;
            Z z10 = aVar.f6382a;
            long j4 = aVar.f6383b;
            ArrayList arrayListX = C2092m.X(String.valueOf(j4));
            if (z10 instanceof Z.m) {
                X9 x92 = ((Z.m) z10).f7825c;
                kotlin.jvm.internal.l.f(x92, "<this>");
                String str = x92.f7730l;
                if (str == null && (str = x92.f7735q) == null) {
                    str = "";
                }
                arrayListX.add(str);
            }
            dVarF.b(z10, new C5865d(j4, C2099t.f18581b, arrayListX), c0675l);
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0675l(j6.e eVar, AttributeSet attributeSet, int i) {
        int i10 = 1;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        long jUptimeMillis = SystemClock.uptimeMillis();
        super(eVar, attributeSet, 0);
        this.f2189n = eVar;
        this.f2190o = jUptimeMillis;
        this.f2191p = getContext$div_release().getDiv2Component$div_release();
        Div2ViewComponent.Builder builderY = getDiv2Component$div_release().y();
        builderY.a(this);
        this.f2192q = builderY.build();
        this.f2193r = getDiv2Component$div_release().c();
        this.f2194s = getDiv2Component$div_release().r();
        this.f2195t = getViewComponent$div_release().h();
        this.f2196u = new S6.b();
        this.f2197v = getContext$div_release().getDiv2Component$div_release().j();
        this.f2198w = new ArrayList();
        this.f2199x = new ArrayList();
        this.f2200y = new ArrayList();
        this.f2201z = new C5195A<>();
        this.f2157A = new WeakHashMap<>();
        this.f2158B = new WeakHashMap<>();
        this.f2159C = new a();
        this.f2164H = new C0672i(this, A7.d.f103a, null);
        this.f2167K = new Object();
        int i11 = U3.i;
        this.f2172P = -1L;
        this.f2173Q = j6.w.f43063p8;
        this.f2175S = new C0681s(this);
        this.f2176T = C2001h.a(b9.i.NONE, new F7.l(this, i10));
        this.f2177U = getViewComponent$div_release().e();
        this.f2178V = new LinkedHashMap();
        this.f2179W = new LinkedHashMap();
        C4458a c4458a = C4458a.f38454b;
        this.f2181b0 = c4458a;
        this.f2182c0 = c4458a;
        this.f2185f0 = -1L;
        this.f2186g0 = getDiv2Component$div_release().i().f43034e.compareAndSet(true, false) ? j6.j.f43029g.compareAndSet(true, false) ? "Cold" : "Cool" : "Warm";
        this.f2187h0 = true;
        this.f2188i0 = new I6.f(this);
        AtomicBoolean atomicBoolean = j6.j.f43028f;
        this.f2185f0 = SystemClock.uptimeMillis();
        Q qW = getDiv2Component$div_release().w();
        InterfaceC1790x lifecycleOwner$div_release = getContext$div_release().getLifecycleOwner$div_release();
        if (lifecycleOwner$div_release != null) {
            qW.a(lifecycleOwner$div_release, this);
            return;
        }
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new S(this, this, qW));
            return;
        }
        k0 nextFunction = k0.f16161g;
        kotlin.jvm.internal.l.f(nextFunction, "nextFunction");
        InterfaceC1790x interfaceC1790x = (InterfaceC1790x) x9.l.G(x9.l.K(new x9.f(new C2089j(this, 5), nextFunction), l0.f16164g));
        if (interfaceC1790x != null) {
            qW.a(interfaceC1790x, this);
        } else {
            int i12 = C4422c.f38270a;
            C7.a aVar = C7.a.ERROR;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.m, p9.l] */
    public static C5786d C(U3 u32, Z z10, A7.d dVar) {
        Tb tbA;
        A7.b<Tb> bVar;
        C2087h c2087h = new C2087h();
        if (u32 == null || (bVar = u32.f6378e) == null || (tbA = bVar.a(dVar)) == null) {
            tbA = Tb.NONE;
        }
        c2087h.e(tbA);
        C6.c cVarB = C6.d.a(z10, dVar).b(new C0679p(c2087h, dVar));
        return x9.l.F(new C6.c(cVarB.f929a, cVarB.f930b, cVarB.f931c, new C0680q(c2087h, 0)), new E7.a(c2087h, 1));
    }

    private C5775g getDivVideoActionHandler() {
        return getDiv2Component$div_release().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    public e7.e getHistogramReporter() {
        return (e7.e) this.f2176T.getValue();
    }

    private B6.k getTooltipController() {
        return getDiv2Component$div_release().E();
    }

    public final U3.a A(U3 u32) {
        Object next;
        Iterator<T> it = u32.f6376c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((U3.a) next).f6383b == getStateId$div_release()) {
                break;
            }
        }
        U3.a aVar = (U3.a) next;
        return aVar == null ? (U3.a) C2097r.q0(u32.f6376c) : aVar;
    }

    public final void B(C1175g0 action, String str, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        getDiv2Component$div_release().k().a(this, dVar, action, str, getActionHandler());
    }

    public final void D(U3 u32) {
        try {
            if (getChildCount() == 0) {
                P(u32, getDataTag());
                return;
            }
            U3.a aVarA = A(u32);
            if (aVarA == null) {
                return;
            }
            long j4 = aVarA.f6383b;
            Z z10 = aVarA.f6382a;
            e7.e histogramReporter = getHistogramReporter();
            histogramReporter.getClass();
            histogramReporter.f37736h = Long.valueOf(SystemClock.uptimeMillis());
            Q6.c cVarB = getViewComponent$div_release().a().b(getDivData(), getDataTag());
            if (cVarB != null) {
                cVarB.f11320d.clear();
                cVarB.f11318b.clear();
                cVarB.b();
            }
            View rebind$lambda$57 = getChildAt(0);
            kotlin.jvm.internal.l.e(rebind$lambda$57, "rebind$lambda$57");
            C0713c.v(getExpressionResolver(), z10.d(), rebind$lambda$57);
            setDivData$div_release(u32);
            getDiv2Component$div_release().C().b(getDataTag(), j4, true);
            C0683u c0683uV = getDiv2Component$div_release().v();
            C0672i bindingContext$div_release = getBindingContext$div_release();
            ArrayList arrayListX = C2092m.X(String.valueOf(j4));
            if (z10 instanceof Z.m) {
                X9 x92 = ((Z.m) z10).f7825c;
                kotlin.jvm.internal.l.f(x92, "<this>");
                String str = x92.f7730l;
                if (str == null && (str = x92.f7735q) == null) {
                    str = "";
                }
                arrayListX.add(str);
            }
            c0683uV.b(bindingContext$div_release, rebind$lambda$57, z10, new C5865d(j4, C2099t.f18581b, arrayListX));
            requestLayout();
            p(u32);
            getHistogramReporter().d();
        } catch (Exception unused) {
            P(u32, getDataTag());
        }
    }

    public final void E() {
        long j4;
        if (this.f2185f0 < 0) {
            return;
        }
        j6.j jVarI = getDiv2Component$div_release().i();
        long j10 = this.f2185f0;
        g7.a aVarB = getDiv2Component$div_release().b();
        jVarI.getClass();
        String viewCreateCallType = this.f2186g0;
        kotlin.jvm.internal.l.f(viewCreateCallType, "viewCreateCallType");
        if (j10 < 0) {
            j4 = -1;
        } else {
            long j11 = j10 - this.f2190o;
            j4 = -1;
            g7.a.a(aVarB, "Div.View.Create", j11, null, viewCreateCallType, null, 20);
            if (jVarI.f43032c.compareAndSet(false, true)) {
                long j12 = jVarI.f43031b;
                if (j12 >= 0) {
                    g7.a.a(aVarB, "Div.Context.Create", j12 - jVarI.f43030a, null, jVarI.f43033d, null, 20);
                    jVarI.f43031b = -1L;
                }
            }
        }
        this.f2185f0 = j4;
    }

    public final void F(U3 u32, C4458a tag) {
        kotlin.jvm.internal.l.f(tag, "tag");
        U3 divData = getDivData();
        synchronized (this.f2167K) {
            try {
                this.f2196u.getClass();
                int i = C4422c.f38270a;
                if (u32 == null) {
                    return;
                }
                if (getDivData() == u32) {
                    return;
                }
                if (getInMiddleOfBind$div_release()) {
                    C5246y.d(this, new RuntimeException("New binding started when previous not ended!"));
                }
                setInMiddleOfBind$div_release(true);
                C5195A<InterfaceC5331d> c5195a = this.f2201z;
                c5195a.getClass();
                C5195A.a aVar = new C5195A.a();
                while (aVar.hasNext()) {
                    ((InterfaceC5331d) aVar.next()).b();
                }
                C6.m bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
                if (bindOnAttachRunnable$div_release != null) {
                    bindOnAttachRunnable$div_release.f953a = null;
                }
                getHistogramReporter().f37732d = true;
                U3 divData2 = getDivData();
                U3 u33 = divData2 == null ? divData : divData2;
                O(u32, tag);
                setDataTag$div_release(tag);
                for (U3.a aVar2 : u32.f6376c) {
                    j6.x xVarX = getDiv2Component$div_release().x();
                    Z z10 = aVar2.f6382a;
                    C0672i context = getBindingContext$div_release();
                    long j4 = aVar2.f6383b;
                    Z z11 = aVar2.f6382a;
                    ArrayList arrayListX = C2092m.X(String.valueOf(j4));
                    if (z11 instanceof Z.m) {
                        X9 x92 = ((Z.m) z11).f7825c;
                        kotlin.jvm.internal.l.f(x92, "<this>");
                        String str = x92.f7730l;
                        if (str == null && (str = x92.f7735q) == null) {
                            str = "";
                        }
                        arrayListX.add(str);
                    }
                    C5865d c5865d = new C5865d(j4, C2099t.f18581b, arrayListX);
                    j6.l lVar = j6.q.f43041e;
                    kotlin.jvm.internal.l.f(context, "context");
                    q.b bVar = new q.b(lVar);
                    xVarX.new a(bVar, lVar).f(context, z10, c5865d);
                    bVar.e();
                }
                boolean zE = I6.d.e(u33, u32, getStateId$div_release(), getOldExpressionResolver$div_release(), getExpressionResolver());
                if (u33 == null || I6.g.a(u32, getExpressionResolver())) {
                    P(u32, tag);
                } else if (zE || !this.f2194s || !(getView().getChildAt(0) instanceof ViewGroup) || !w(u32, u33)) {
                    if (zE) {
                        D(u32);
                    } else {
                        P(u32, tag);
                    }
                }
                getDiv2Component$div_release().v().a();
                E();
                this.f2161E = getExpressionsRuntime$div_release();
                setInMiddleOfBind$div_release(false);
                C5195A<InterfaceC5331d> c5195a2 = this.f2201z;
                c5195a2.getClass();
                C5195A.a aVar3 = new C5195A.a();
                while (aVar3.hasNext()) {
                    ((InterfaceC5331d) aVar3.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Z6.f G(String name, String value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        l.a aVar = i7.l.f38481a;
        A7.d expressionResolver = getExpressionResolver();
        aVar.getClass();
        return l.a.a(this, name, value, expressionResolver);
    }

    public final void H(String tooltipId) {
        kotlin.jvm.internal.l.f(tooltipId, "tooltipId");
        getTooltipController().e(tooltipId, getBindingContext$div_release(), false);
    }

    public final U3.a I(U3 u32) {
        long j4;
        Object next;
        C5866e currentState = getCurrentState();
        if (currentState != null) {
            j4 = currentState.f48465a;
        } else {
            kotlin.jvm.internal.l.f(u32, "<this>");
            List<U3.a> list = u32.f6376c;
            if (list.isEmpty()) {
                int i = U3.i;
                j4 = -1;
            } else {
                j4 = list.get(0).f6383b;
            }
        }
        Iterator<T> it = u32.f6376c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((U3.a) next).f6383b == j4) {
                break;
            }
        }
        return (U3.a) next;
    }

    public final void J(A2.l lVar) {
        synchronized (this.f2167K) {
            this.f2199x.add(lVar);
        }
    }

    public final void K(long j4, boolean z10) {
        synchronized (this.f2167K) {
            try {
                int i = U3.i;
                if (j4 != -1) {
                    C6.m bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
                    if (bindOnAttachRunnable$div_release != null) {
                        bindOnAttachRunnable$div_release.f953a = null;
                    }
                    z(j4, z10);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void L() {
        A7.d dVar;
        L lB = getDiv2Component$div_release().B();
        for (Map.Entry<View, Z> entry : this.f2157A.entrySet()) {
            View view = entry.getKey();
            Z div = entry.getValue();
            kotlin.jvm.internal.l.e(view, "view");
            C0672i c0672iK = C0713c.K(view);
            if (c0672iK != null && (dVar = c0672iK.f2147b) != null) {
                WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
                if (view.isAttachedToWindow()) {
                    kotlin.jvm.internal.l.e(div, "div");
                    L.j(lB, this, dVar, view, div);
                } else {
                    kotlin.jvm.internal.l.e(div, "div");
                    L.j(lB, this, dVar, null, div);
                }
            }
        }
    }

    public final void M(U3.a aVar) {
        L.j(getDiv2Component$div_release().B(), this, getExpressionResolver(), getView(), aVar.f6382a);
    }

    public final Z N(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        return this.f2157A.remove(view);
    }

    public final void O(U3 u32, C4458a c4458a) {
        p6.h runtimeStore$div_release;
        p6.h hVar;
        if (u32 == null) {
            return;
        }
        this.f2161E = getExpressionsRuntime$div_release();
        setExpressionsRuntime$div_release(getDiv2Component$div_release().t().b(c4458a, u32, this));
        C5426c expressionsRuntime$div_release = getExpressionsRuntime$div_release();
        if (expressionsRuntime$div_release != null && (hVar = expressionsRuntime$div_release.f44861e) != null) {
            C5195A<C5426c> c5195a = hVar.f45227g;
            c5195a.getClass();
            C5195A.a aVar = new C5195A.a();
            while (aVar.hasNext()) {
                ((C5426c) aVar.next()).b();
            }
        }
        if (!kotlin.jvm.internal.l.b(this.f2161E, getExpressionsRuntime$div_release()) && (runtimeStore$div_release = getRuntimeStore$div_release()) != null) {
            C5195A<C5426c> c5195a2 = runtimeStore$div_release.f45227g;
            c5195a2.getClass();
            C5195A.a aVar2 = new C5195A.a();
            while (aVar2.hasNext()) {
                C5529f c5529f = ((C5426c) aVar2.next()).f44859c;
                if (c5529f != null) {
                    c5529f.a();
                }
            }
        }
        C5426c expressionsRuntime$div_release2 = getExpressionsRuntime$div_release();
        setRuntimeStore$div_release(expressionsRuntime$div_release2 != null ? expressionsRuntime$div_release2.f44861e : null);
        C0672i bindingContext$div_release = getBindingContext$div_release();
        A7.d resolver = getExpressionResolver();
        p6.h runtimeStore$div_release2 = getRuntimeStore$div_release();
        bindingContext$div_release.getClass();
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (!kotlin.jvm.internal.l.b(bindingContext$div_release.f2147b, resolver)) {
            bindingContext$div_release = new C0672i(bindingContext$div_release.f2146a, resolver, runtimeStore$div_release2);
        }
        setBindingContext$div_release(bindingContext$div_release);
    }

    public final boolean P(U3 u32, C4458a c4458a) {
        long j4;
        View viewR;
        C0675l c0675l;
        U3 u33;
        boolean z10;
        int i = 1;
        U3 divData = getDivData();
        if (divData == null) {
            e7.e histogramReporter = getHistogramReporter();
            histogramReporter.getClass();
            histogramReporter.f37733e = Long.valueOf(SystemClock.uptimeMillis());
        } else {
            e7.e histogramReporter2 = getHistogramReporter();
            histogramReporter2.getClass();
            histogramReporter2.f37736h = Long.valueOf(SystemClock.uptimeMillis());
        }
        u(false);
        setDataTag$div_release(c4458a);
        setDivData$div_release(u32);
        U3.a aVarI = divData != null ? I(divData) : null;
        U3.a aVarI2 = I(u32);
        C5866e currentState = getCurrentState();
        if (currentState != null) {
            j4 = currentState.f48465a;
        } else {
            List<U3.a> list = u32.f6376c;
            if (list.isEmpty()) {
                int i10 = U3.i;
                j4 = -1;
            } else {
                j4 = list.get(0).f6383b;
            }
        }
        setStateId$div_release(j4);
        boolean z11 = this.f2193r;
        if (aVarI2 == null) {
            u33 = u32;
            z10 = false;
            c0675l = this;
        } else {
            if (divData == null) {
                getDiv2Component$div_release().C().b(getDataTag(), getStateId$div_release(), true);
                Z z12 = aVarI2.f6382a;
                long j10 = aVarI2.f6383b;
                ArrayList arrayListX = C2092m.X(String.valueOf(j10));
                if (z12 instanceof Z.m) {
                    X9 x92 = ((Z.m) z12).f7825c;
                    kotlin.jvm.internal.l.f(x92, "<this>");
                    String str = x92.f7730l;
                    if (str == null && (str = x92.f7735q) == null) {
                        str = "";
                    }
                    arrayListX.add(str);
                }
                C5865d c5865d = new C5865d(j10, C2099t.f18581b, arrayListX);
                viewR = this.f2197v.a(getBindingContext$div_release(), z12, c5865d);
                if (z11) {
                    setBindOnAttachRunnable$div_release(new C6.m(this, new C0677n(this, viewR, aVarI2, c5865d)));
                } else {
                    getDiv2Component$div_release().v().b(getBindingContext$div_release(), viewR, z12, c5865d);
                    if (isAttachedToWindow()) {
                        getDiv2Component$div_release().v().a();
                    } else {
                        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0676m(this, this));
                    }
                }
            } else {
                viewR = r(aVarI2, getStateId$div_release(), true);
            }
            if (aVarI != null) {
                x(aVarI);
            }
            M(aVarI2);
            boolean z13 = (divData != null && I6.g.a(divData, getOldExpressionResolver$div_release())) || I6.g.a(u32, getExpressionResolver());
            Z z14 = aVarI != null ? aVarI.f6382a : null;
            c0675l = this;
            u33 = u32;
            c0675l.m(divData, u33, z14, aVarI2, viewR, z13, false);
            z10 = true;
        }
        p(u33);
        if (divData != null) {
            getHistogramReporter().d();
            return z10;
        }
        if (!z11) {
            getHistogramReporter().b();
            return z10;
        }
        e7.e histogramReporter3 = getHistogramReporter();
        histogramReporter3.getClass();
        histogramReporter3.f37734f = Long.valueOf(SystemClock.uptimeMillis());
        c0675l.f2170N = new C6.m(this, new A6.h(this, 3));
        c0675l.f2171O = new C6.m(this, new C0678o(this, i));
        return z10;
    }

    @Override // j6.y
    public final void a(String tooltipId, boolean z10) {
        kotlin.jvm.internal.l.f(tooltipId, "tooltipId");
        getTooltipController().e(tooltipId, getBindingContext$div_release(), z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (this.f2187h0) {
            e7.e histogramReporter = getHistogramReporter();
            histogramReporter.getClass();
            histogramReporter.f37738k = Long.valueOf(SystemClock.uptimeMillis());
        }
        super.dispatchDraw(canvas);
        if (this.f2187h0) {
            getHistogramReporter().c();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        this.f2187h0 = false;
        e7.e histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.f37738k = Long.valueOf(SystemClock.uptimeMillis());
        super.draw(canvas);
        getHistogramReporter().c();
        this.f2187h0 = true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            C0713c.E(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.y
    public final void f(C5865d c5865d, boolean z10) {
        synchronized (this.f2167K) {
            try {
                U3 divData = getDivData();
                U3.a aVar = null;
                if (divData != null) {
                    Iterator<T> it = divData.f6376c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((U3.a) next).f6383b == c5865d.f48458a) {
                            aVar = next;
                            break;
                        }
                    }
                    aVar = aVar;
                }
                this.f2159C.b(aVar, c5865d, z10);
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public j6.h getActionHandler() {
        return this.f2184e0;
    }

    public C6.m getBindOnAttachRunnable$div_release() {
        return this.f2169M;
    }

    public C0672i getBindingContext$div_release() {
        return this.f2164H;
    }

    public ViewTreeObserver.OnPreDrawListener getClearVariablesListener$div_release() {
        return this.f2180a0;
    }

    public boolean getComplexRebindInProgress$div_release() {
        T6.d dVar = this.f2174R;
        if (dVar != null) {
            return dVar.f12314j;
        }
        return false;
    }

    public String getComponentName() {
        return getHistogramReporter().f37731c;
    }

    public j6.w getConfig() {
        j6.w config = this.f2173Q;
        kotlin.jvm.internal.l.e(config, "config");
        return config;
    }

    public j6.e getContext$div_release() {
        return this.f2189n;
    }

    public T6.e getCurrentRebindReusableList$div_release() {
        T6.d dVar;
        if (getComplexRebindInProgress$div_release() && (dVar = this.f2174R) != null) {
            return dVar.f12315k;
        }
        return null;
    }

    public C5865d getCurrentRootPath$div_release() {
        Object next;
        U3 divData = getDivData();
        if (divData != null) {
            Iterator<T> it = divData.f6376c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((U3.a) next).f6383b == getStateId$div_release()) {
                    break;
                }
            }
            U3.a aVar = (U3.a) next;
            if (aVar != null) {
                Z z10 = aVar.f6382a;
                long j4 = aVar.f6383b;
                ArrayList arrayListX = C2092m.X(String.valueOf(j4));
                if (z10 instanceof Z.m) {
                    X9 x92 = ((Z.m) z10).f7825c;
                    kotlin.jvm.internal.l.f(x92, "<this>");
                    String str = x92.f7730l;
                    if (str == null && (str = x92.f7735q) == null) {
                        str = "";
                    }
                    arrayListX.add(str);
                }
                return new C5865d(j4, C2099t.f18581b, arrayListX);
            }
        }
        return new C5865d(getStateId$div_release(), new ArrayList());
    }

    public C5866e getCurrentState() {
        U3 divData = getDivData();
        if (divData == null) {
            return null;
        }
        C5866e c5866eA = getDiv2Component$div_release().C().a(getDataTag());
        List<U3.a> list = divData.f6376c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        for (U3.a aVar : list) {
            if (c5866eA != null && aVar.f6383b == c5866eA.f48465a) {
                return c5866eA;
            }
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId$div_release();
    }

    public j6.k getCustomContainerChildFactory$div_release() {
        return getDiv2Component$div_release().u();
    }

    public C4458a getDataTag() {
        return this.f2181b0;
    }

    public Div2Component getDiv2Component$div_release() {
        return this.f2191p;
    }

    public U3 getDivData() {
        return this.f2183d0;
    }

    public C4458a getDivTag() {
        return getDataTag();
    }

    public A6.a getDivTimerEventDispatcher$div_release() {
        return this.f2165I;
    }

    public I6.f getDivTransitionHandler$div_release() {
        return this.f2188i0;
    }

    @Override // j6.y
    public A7.d getExpressionResolver() {
        C5425b c5425b;
        C5426c expressionsRuntime$div_release = getExpressionsRuntime$div_release();
        return (expressionsRuntime$div_release == null || (c5425b = expressionsRuntime$div_release.f44857a) == null) ? A7.d.f103a : c5425b;
    }

    public C5426c getExpressionsRuntime$div_release() {
        return this.f2160D;
    }

    public boolean getForceCanvasClipping() {
        return this.f2166J;
    }

    public boolean getInMiddleOfBind$div_release() {
        return this.f2163G;
    }

    public T6.b getInputFocusTracker$div_release() {
        return this.f2177U;
    }

    public Map<A7.d, Map<String, Integer>> getLayoutSizes$div_release() {
        return this.f2178V;
    }

    public String getLogId() {
        String str;
        U3 divData = getDivData();
        return (divData == null || (str = divData.f6375b) == null) ? "" : str;
    }

    public O6.G getMediaReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().i();
    }

    public A7.d getOldExpressionResolver$div_release() {
        C5425b c5425b;
        C5426c c5426c = this.f2161E;
        return (c5426c == null || (c5425b = c5426c.f44857a) == null) ? A7.d.f103a : c5425b;
    }

    public C4458a getPrevDataTag() {
        return this.f2182c0;
    }

    public O6.I getReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().g();
    }

    public p6.h getRuntimeStore$div_release() {
        return this.f2162F;
    }

    public long getStateId$div_release() {
        return this.f2172P;
    }

    public Map<U3, Q0> getVariablesHolders$div_release() {
        return this.f2179W;
    }

    public Div2ViewComponent getViewComponent$div_release() {
        return this.f2192q;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent$div_release().d().f11351c;
    }

    @Override // j6.y
    public final void i(String tooltipId) {
        kotlin.jvm.internal.l.f(tooltipId, "tooltipId");
        getTooltipController().d(this, tooltipId);
    }

    public final void l(w6.e loadReference, View targetView) {
        kotlin.jvm.internal.l.f(loadReference, "loadReference");
        kotlin.jvm.internal.l.f(targetView, "targetView");
        synchronized (this.f2167K) {
            this.f2198w.add(loadReference);
        }
    }

    public final void m(U3 u32, U3 u33, Z z10, U3.a aVar, View view, boolean z11, boolean z12) {
        Z z13 = aVar.f6382a;
        K1.n nVar = null;
        if (z11 && z10 != z13) {
            K1.n nVarA = getViewComponent$div_release().m().a(z10 != null ? C(u32, z10, getOldExpressionResolver$div_release()) : null, C(u33, z13, getExpressionResolver()), getOldExpressionResolver$div_release(), getExpressionResolver());
            if (nVarA.f3023C.size() != 0) {
                j6.n nVarD = getDiv2Component$div_release().D();
                nVarD.a(this, u33);
                nVarA.a(new r(nVarA, nVarD, this, u33));
                nVar = nVarA;
            }
        }
        if (nVar != null) {
            K1.h hVar = (K1.h) getTag(R.id.transition_current_scene);
            if (hVar != null) {
                hVar.f2974c = new B.b(this, 4);
            }
        } else {
            int i = 0;
            while (i < getChildCount()) {
                int i10 = i + 1;
                View childAt = getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                C5606d.I(getReleaseViewVisitor$div_release(), childAt);
                i = i10;
            }
            removeAllViews();
        }
        if (z12) {
            C0683u c0683uV = getDiv2Component$div_release().v();
            C0672i bindingContext$div_release = getBindingContext$div_release();
            long j4 = aVar.f6383b;
            ArrayList arrayListX = C2092m.X(String.valueOf(j4));
            if (z13 instanceof Z.m) {
                X9 x92 = ((Z.m) z13).f7825c;
                kotlin.jvm.internal.l.f(x92, "<this>");
                String str = x92.f7730l;
                if (str == null && (str = x92.f7735q) == null) {
                    str = "";
                }
                arrayListX.add(str);
            }
            c0683uV.b(bindingContext$div_release, view, z13, new C5865d(j4, C2099t.f18581b, arrayListX));
        }
        if (nVar == null) {
            addView(view);
            getViewComponent$div_release().d().a(this);
            return;
        }
        K1.m.b(this);
        K1.h hVar2 = new K1.h();
        hVar2.f2972a = this;
        hVar2.f2973b = view;
        I6.l lVar = new I6.l(this);
        addOnAttachStateChangeListener(lVar);
        nVar.a(new I6.m(nVar, this, lVar));
        ArrayList<ViewGroup> arrayList = K1.m.f3018c;
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
        K1.i iVarClone = nVar.clone();
        K1.m.d(this, iVarClone);
        View view2 = hVar2.f2973b;
        C0675l c0675l = hVar2.f2972a;
        c0675l.removeAllViews();
        c0675l.addView(view2);
        c0675l.setTag(R.id.transition_current_scene, hVar2);
        m.a aVar2 = new m.a();
        aVar2.f3019b = iVarClone;
        aVar2.f3020c = this;
        addOnAttachStateChangeListener(aVar2);
        getViewTreeObserver().addOnPreDrawListener(aVar2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.C0675l.n(java.lang.String, java.lang.String):void");
    }

    public final boolean o(String divId, String command, A7.d expressionResolver) {
        C1217ic c1217icA;
        kotlin.jvm.internal.l.f(divId, "divId");
        kotlin.jvm.internal.l.f(command, "command");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        C5775g divVideoActionHandler = getDivVideoActionHandler();
        divVideoActionHandler.getClass();
        U3 divData = getDivData();
        if (divData == null) {
            return false;
        }
        Iterator<T> it = divData.f6376c.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1217icA = null;
                break;
            }
            c1217icA = C5775g.a(((U3.a) it.next()).f6382a.d(), divId, expressionResolver);
            if (c1217icA != null) {
                break;
            }
        }
        if (c1217icA == null) {
            return false;
        }
        Set<Map.Entry<O6.D, C1217ic>> setEntrySet = divVideoActionHandler.f47789a.f47796a.entrySet();
        kotlin.jvm.internal.l.e(setEntrySet, "currentViews.entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (kotlin.jvm.internal.l.b(entry.getValue(), c1217icA) || kotlin.jvm.internal.l.b(((C1217ic) entry.getValue()).f8462t, c1217icA.f8462t)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC5774f playerView = ((O6.D) ((Map.Entry) it2.next()).getKey()).getPlayerView();
            InterfaceC5769a attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
            if (attachedPlayer != null) {
                arrayList2.add(attachedPlayer);
            }
        }
        if (((InterfaceC5769a) C2097r.q0(arrayList2)) == null) {
            return false;
        }
        return command.equals("start") || command.equals("pause");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6.m mVar = this.f2170N;
        if (mVar != null) {
            mVar.a();
        }
        C6.m mVar2 = this.f2168L;
        if (mVar2 != null) {
            mVar2.a();
        }
        C6.m bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
        if (bindOnAttachRunnable$div_release != null) {
            bindOnAttachRunnable$div_release.a();
        }
        C6.m mVar3 = this.f2171O;
        if (mVar3 != null) {
            mVar3.a();
        }
        A6.a divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
        A6.a divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.b(this);
        }
        LinkedHashMap linkedHashMap = getViewComponent$div_release().c().f2524b;
        Iterator it = new ArrayList(linkedHashMap.values()).iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        linkedHashMap.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r7.g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        List<U3.a> list;
        e7.e histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.f37737j = Long.valueOf(SystemClock.uptimeMillis());
        super.onLayout(z10, i, i10, i11, i12);
        U3 divData = getDivData();
        U3.a aVar = null;
        if (divData != null && (list = divData.f6376c) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((U3.a) next).f6383b == getStateId$div_release()) {
                    aVar = next;
                    break;
                }
            }
            aVar = aVar;
        }
        if (aVar != null) {
            M(aVar);
        }
        L();
        e7.e histogramReporter2 = getHistogramReporter();
        Long l5 = histogramReporter2.f37737j;
        if (l5 != null) {
            histogramReporter2.a().f37820d += SystemClock.uptimeMillis() - l5.longValue();
        }
    }

    @Override // r7.g, android.view.View
    public final void onMeasure(int i, int i10) {
        e7.e histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.i = Long.valueOf(SystemClock.uptimeMillis());
        super.onMeasure(i, i10);
        e7.e histogramReporter2 = getHistogramReporter();
        Long l5 = histogramReporter2.i;
        if (l5 != null) {
            histogramReporter2.a().f37819c += SystemClock.uptimeMillis() - l5.longValue();
        }
    }

    public final void p(U3 u32) {
        U3.a aVarI = I(u32);
        if (aVarI == null) {
            return;
        }
        c cVar = new c(aVarI);
        if (this.f2193r) {
            this.f2168L = new C6.m(this, new b(cVar));
        } else {
            cVar.invoke();
        }
    }

    public final void q(View view, Z div) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        this.f2157A.put(view, div);
    }

    public final View r(U3.a aVar, long j4, boolean z10) {
        getDiv2Component$div_release().C().b(getDataTag(), j4, z10);
        Z z11 = aVar.f6382a;
        C0672i context = getBindingContext$div_release();
        long j10 = aVar.f6383b;
        ArrayList arrayListX = C2092m.X(String.valueOf(j10));
        if (z11 instanceof Z.m) {
            X9 x92 = ((Z.m) z11).f7825c;
            kotlin.jvm.internal.l.f(x92, "<this>");
            String str = x92.f7730l;
            if (str == null && (str = x92.f7735q) == null) {
                str = "";
            }
            arrayListX.add(str);
        }
        C5865d c5865d = new C5865d(j10, C2099t.f18581b, arrayListX);
        C0674k c0674k = this.f2197v;
        c0674k.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        View viewA = c0674k.a(context, z11, c5865d);
        c0674k.f2155b.b(context, viewA, z11, c5865d);
        getDiv2Component$div_release().v().a();
        return viewA;
    }

    public final void s(InterfaceC5480a<C1992A> interfaceC5480a) {
        a aVar = this.f2159C;
        aVar.getClass();
        aVar.f2202a++;
        interfaceC5480a.invoke();
        int i = aVar.f2202a - 1;
        aVar.f2202a = i;
        if (i == 0) {
            aVar.a();
        }
    }

    public void setActionHandler(j6.h hVar) {
        this.f2184e0 = hVar;
    }

    public void setBindOnAttachRunnable$div_release(C6.m mVar) {
        this.f2169M = mVar;
    }

    public void setBindingContext$div_release(C0672i c0672i) {
        kotlin.jvm.internal.l.f(c0672i, "<set-?>");
        this.f2164H = c0672i;
    }

    public void setClearVariablesListener$div_release(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.f2180a0 = onPreDrawListener;
    }

    public void setComponentName(String str) {
        getHistogramReporter().f37731c = str;
    }

    public void setConfig(j6.w viewConfig) {
        kotlin.jvm.internal.l.f(viewConfig, "viewConfig");
        this.f2173Q = viewConfig;
    }

    public void setDataTag$div_release(C4458a value) {
        kotlin.jvm.internal.l.f(value, "value");
        setPrevDataTag$div_release(this.f2181b0);
        this.f2181b0 = value;
        this.f2195t.t(getDivData(), value);
    }

    public void setDivData$div_release(U3 u32) {
        A6.a divTimerEventDispatcher$div_release;
        LinkedHashSet linkedHashSet;
        LinkedHashMap linkedHashMap;
        this.f2183d0 = u32;
        O(getDivData(), getDataTag());
        U3 divData = getDivData();
        if (divData != null) {
            A6.b bVarM = getDiv2Component$div_release().m();
            C4458a dataTag = getDataTag();
            A7.d expressionResolver = getExpressionResolver();
            kotlin.jvm.internal.l.f(dataTag, "dataTag");
            kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
            A6.a aVar = null;
            List<C1397vb> list = divData.f6377d;
            if (list != null) {
                Q6.c cVarA = ((Q6.d) bVarM.f41c).a(divData, dataTag);
                Map controllers = (Map) bVarM.f42d;
                kotlin.jvm.internal.l.e(controllers, "controllers");
                String str = dataTag.f38455a;
                Object obj = controllers.get(str);
                C0745n c0745n = (C0745n) bVarM.f40b;
                Object obj2 = obj;
                if (obj == null) {
                    A6.a aVar2 = new A6.a(cVarA);
                    for (C1397vb c1397vb : list) {
                        A6.l lVar = new A6.l(c1397vb, c0745n, cVarA, expressionResolver);
                        String str2 = c1397vb.f9641c;
                        LinkedHashMap linkedHashMap2 = aVar2.f38b;
                        if (!linkedHashMap2.containsKey(str2)) {
                            linkedHashMap2.put(str2, lVar);
                        }
                    }
                    controllers.put(str, aVar2);
                    obj2 = aVar2;
                }
                A6.a aVar3 = (A6.a) obj2;
                List<C1397vb> list2 = list;
                Iterator<T> it = list2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashSet = aVar3.f39c;
                    linkedHashMap = aVar3.f38b;
                    if (!zHasNext) {
                        break;
                    }
                    C1397vb c1397vb2 = (C1397vb) it.next();
                    String str3 = c1397vb2.f9641c;
                    if ((linkedHashSet.contains(str3) ? (A6.l) linkedHashMap.get(str3) : null) == null) {
                        A6.l lVar2 = new A6.l(c1397vb2, c0745n, cVarA, expressionResolver);
                        String str4 = c1397vb2.f9641c;
                        if (!linkedHashMap.containsKey(str4)) {
                            linkedHashMap.put(str4, lVar2);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(C2092m.T(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C1397vb) it2.next()).f9641c);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!arrayList.contains(entry.getKey())) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                for (A6.l lVar3 : linkedHashMap3.values()) {
                    lVar3.f79e = null;
                    lVar3.f83j.h();
                    lVar3.i = true;
                }
                linkedHashSet.clear();
                linkedHashSet.addAll(arrayList);
                aVar = aVar3;
            }
            if (!kotlin.jvm.internal.l.b(getDivTimerEventDispatcher$div_release(), aVar) && (divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release()) != null) {
                divTimerEventDispatcher$div_release.b(this);
            }
            setDivTimerEventDispatcher$div_release(aVar);
            if (aVar != null) {
                aVar.a(this);
            }
        }
        this.f2195t.t(this.f2183d0, getDataTag());
    }

    public void setDivTimerEventDispatcher$div_release(A6.a aVar) {
        this.f2165I = aVar;
    }

    public void setExpressionsRuntime$div_release(C5426c c5426c) {
        this.f2160D = c5426c;
    }

    public void setForceCanvasClipping(boolean z10) {
        this.f2166J = z10;
    }

    public void setInMiddleOfBind$div_release(boolean z10) {
        this.f2163G = z10;
    }

    public void setPrevDataTag$div_release(C4458a c4458a) {
        kotlin.jvm.internal.l.f(c4458a, "<set-?>");
        this.f2182c0 = c4458a;
    }

    public void setRuntimeStore$div_release(p6.h hVar) {
        this.f2162F = hVar;
    }

    public void setStateId$div_release(long j4) {
        this.f2172P = j4;
    }

    public void setVisualErrorsEnabled(boolean z10) {
        Q6.k kVarD = getViewComponent$div_release().d();
        kVarD.f11351c = z10;
        kVarD.b();
    }

    public final void t() {
        synchronized (this.f2167K) {
            u(true);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void u(boolean z10) {
        T6.d dVar = this.f2174R;
        if (dVar != null) {
            dVar.b();
            C1992A c1992a = C1992A.f18074a;
            this.f2174R = null;
        }
        y();
        ArrayList arrayList = this.f2198w;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((w6.e) it.next()).cancel();
        }
        arrayList.clear();
        int i = 0;
        int i10 = 0;
        while (i10 < getChildCount()) {
            int i11 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C5606d.I(getMediaReleaseViewVisitor$div_release(), childAt);
            i10 = i11;
        }
        this.f2157A.clear();
        this.f2158B.clear();
        B6.k tooltipController = getTooltipController();
        tooltipController.getClass();
        tooltipController.b(this);
        v();
        this.f2200y.clear();
        if (z10) {
            while (i < getChildCount()) {
                int i12 = i + 1;
                View childAt2 = getChildAt(i);
                if (childAt2 == null) {
                    throw new IndexOutOfBoundsException();
                }
                C5606d.I(getReleaseViewVisitor$div_release(), childAt2);
                i = i12;
            }
            removeAllViews();
        }
        Q6.c cVarB = getViewComponent$div_release().a().b(getDivData(), getDataTag());
        if (cVarB != null) {
            cVarB.f11320d.clear();
            cVarB.f11318b.clear();
            cVarB.b();
        }
        setDivData$div_release(null);
        setDataTag$div_release(C4458a.f38454b);
    }

    public final void v() {
        synchronized (this.f2167K) {
            this.f2199x.clear();
            C1992A c1992a = C1992A.f18074a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(N7.U3 r10, N7.U3 r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.C0675l.w(N7.U3, N7.U3):boolean");
    }

    public final void x(U3.a aVar) {
        L.j(getDiv2Component$div_release().B(), this, getExpressionResolver(), null, aVar.f6382a);
    }

    public final void y() {
        U3.a aVar;
        A7.d dVar;
        Object next;
        U3 divData = getDivData();
        if (divData != null) {
            Iterator<T> it = divData.f6376c.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((U3.a) next).f6383b == getStateId$div_release()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            aVar = (U3.a) next;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            x(aVar);
        }
        L lB = getDiv2Component$div_release().B();
        for (Map.Entry<View, Z> entry : this.f2157A.entrySet()) {
            View view = entry.getKey();
            Z div = entry.getValue();
            kotlin.jvm.internal.l.e(view, "view");
            C0672i c0672iK = C0713c.K(view);
            if (c0672iK != null && (dVar = c0672iK.f2147b) != null) {
                kotlin.jvm.internal.l.e(div, "div");
                L.j(lB, this, dVar, null, div);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final void z(long j4, boolean z10) {
        Object next;
        U3.a next2;
        View rootView;
        setStateId$div_release(j4);
        C5866e currentState = getCurrentState();
        Long lValueOf = currentState != null ? Long.valueOf(currentState.f48465a) : null;
        U3 divData = getDivData();
        if (divData == null) {
            return;
        }
        List<U3.a> list = divData.f6376c;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long j10 = ((U3.a) next).f6383b;
            if (lValueOf != null && j10 == lValueOf.longValue()) {
                break;
            }
        }
        U3.a aVar = (U3.a) next;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = 0;
                break;
            } else {
                next2 = it2.next();
                if (((U3.a) next2).f6383b == j4) {
                    break;
                }
            }
        }
        U3.a aVar2 = next2;
        if (aVar2 == null) {
            return;
        }
        if (aVar != null) {
            x(aVar);
        }
        M(aVar2);
        boolean zB = I6.d.b(aVar != null ? aVar.f6382a : null, aVar2.f6382a, getExpressionResolver(), getExpressionResolver(), null);
        if (zB) {
            rootView = getView().getChildAt(0);
            getDiv2Component$div_release().C().b(getDataTag(), j4, z10);
            getDiv2Component$div_release().v().a();
            kotlin.jvm.internal.l.e(rootView, "rootView");
        } else {
            rootView = r(aVar2, j4, z10);
        }
        m(divData, divData, aVar != null ? aVar.f6382a : null, aVar2, rootView, I6.g.a(divData, getExpressionResolver()), zB);
    }

    @Override // j6.y
    public C0675l getView() {
        return this;
    }

    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    public static /* synthetic */ void getForceCanvasClipping$annotations() {
    }

    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }
}
