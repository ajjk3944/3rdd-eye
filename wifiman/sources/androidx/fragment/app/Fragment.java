package androidx.fragment.app;

import F1.AbstractC2775u;
import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.AbstractC4020s;
import androidx.lifecycle.C4018p;
import androidx.lifecycle.C4022u;
import androidx.lifecycle.InterfaceC4011i;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import b2.AbstractC4056a;
import b2.C4057b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import q2.AbstractC7419g;
import q2.C7416d;
import q2.C7417e;
import q2.InterfaceC7418f;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC4017o, S, InterfaceC4011i, InterfaceC7418f {

    /* renamed from: s1, reason: collision with root package name */
    static final Object f31221s1 = new Object();

    /* renamed from: A, reason: collision with root package name */
    boolean f31222A;

    /* renamed from: B, reason: collision with root package name */
    boolean f31223B;

    /* renamed from: C, reason: collision with root package name */
    boolean f31224C;

    /* renamed from: D, reason: collision with root package name */
    boolean f31225D;

    /* renamed from: E, reason: collision with root package name */
    boolean f31226E;

    /* renamed from: G, reason: collision with root package name */
    private boolean f31228G;

    /* renamed from: H, reason: collision with root package name */
    ViewGroup f31229H;

    /* renamed from: I, reason: collision with root package name */
    View f31230I;

    /* renamed from: J, reason: collision with root package name */
    boolean f31231J;

    /* renamed from: X, reason: collision with root package name */
    g f31233X;

    /* renamed from: Z, reason: collision with root package name */
    boolean f31235Z;

    /* renamed from: b, reason: collision with root package name */
    Bundle f31237b;

    /* renamed from: c, reason: collision with root package name */
    SparseArray f31238c;

    /* renamed from: d, reason: collision with root package name */
    Bundle f31239d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f31240e;

    /* renamed from: f1, reason: collision with root package name */
    LayoutInflater f31242f1;

    /* renamed from: g, reason: collision with root package name */
    Bundle f31243g;

    /* renamed from: g1, reason: collision with root package name */
    boolean f31244g1;

    /* renamed from: h, reason: collision with root package name */
    Fragment f31245h;

    /* renamed from: h1, reason: collision with root package name */
    public String f31246h1;

    /* renamed from: j, reason: collision with root package name */
    int f31249j;

    /* renamed from: j1, reason: collision with root package name */
    C4018p f31250j1;

    /* renamed from: k1, reason: collision with root package name */
    I f31252k1;

    /* renamed from: l, reason: collision with root package name */
    boolean f31253l;

    /* renamed from: m, reason: collision with root package name */
    boolean f31255m;

    /* renamed from: m1, reason: collision with root package name */
    P.c f31256m1;

    /* renamed from: n, reason: collision with root package name */
    boolean f31257n;

    /* renamed from: n1, reason: collision with root package name */
    C7417e f31258n1;

    /* renamed from: o, reason: collision with root package name */
    boolean f31259o;

    /* renamed from: o1, reason: collision with root package name */
    private int f31260o1;

    /* renamed from: p, reason: collision with root package name */
    boolean f31261p;

    /* renamed from: q, reason: collision with root package name */
    boolean f31263q;

    /* renamed from: r, reason: collision with root package name */
    boolean f31265r;

    /* renamed from: s, reason: collision with root package name */
    int f31267s;

    /* renamed from: t, reason: collision with root package name */
    w f31268t;

    /* renamed from: u, reason: collision with root package name */
    o f31269u;

    /* renamed from: w, reason: collision with root package name */
    Fragment f31271w;

    /* renamed from: x, reason: collision with root package name */
    int f31272x;

    /* renamed from: y, reason: collision with root package name */
    int f31273y;

    /* renamed from: z, reason: collision with root package name */
    String f31274z;

    /* renamed from: a, reason: collision with root package name */
    int f31236a = -1;

    /* renamed from: f, reason: collision with root package name */
    String f31241f = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    String f31247i = null;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f31251k = null;

    /* renamed from: v, reason: collision with root package name */
    w f31270v = new x();

    /* renamed from: F, reason: collision with root package name */
    boolean f31227F = true;

    /* renamed from: N, reason: collision with root package name */
    boolean f31232N = true;

    /* renamed from: Y, reason: collision with root package name */
    Runnable f31234Y = new a();

    /* renamed from: i1, reason: collision with root package name */
    AbstractC4013k.b f31248i1 = AbstractC4013k.b.RESUMED;

    /* renamed from: l1, reason: collision with root package name */
    C4022u f31254l1 = new C4022u();

    /* renamed from: p1, reason: collision with root package name */
    private final AtomicInteger f31262p1 = new AtomicInteger();

    /* renamed from: q1, reason: collision with root package name */
    private final ArrayList f31264q1 = new ArrayList();

    /* renamed from: r1, reason: collision with root package name */
    private final i f31266r1 = new b();

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.C1();
        }
    }

    class b extends i {
        b() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.i
        void a() {
            Fragment.this.f31258n1.c();
            androidx.lifecycle.H.c(Fragment.this);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.e(false);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K f31278a;

        d(K k10) {
            this.f31278a = k10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31278a.g();
        }
    }

    class e extends AbstractC4001l {
        e() {
        }

        @Override // androidx.fragment.app.AbstractC4001l
        public View d(int i10) {
            View view = Fragment.this.f31230I;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC4001l
        public boolean e() {
            return Fragment.this.f31230I != null;
        }
    }

    class f implements InterfaceC4015m {
        f() {
        }

        @Override // androidx.lifecycle.InterfaceC4015m
        public void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
            View view;
            if (aVar != AbstractC4013k.a.ON_STOP || (view = Fragment.this.f31230I) == null) {
                return;
            }
            h.a(view);
        }
    }

    static class g {

        /* renamed from: a, reason: collision with root package name */
        View f31282a;

        /* renamed from: b, reason: collision with root package name */
        boolean f31283b;

        /* renamed from: c, reason: collision with root package name */
        int f31284c;

        /* renamed from: d, reason: collision with root package name */
        int f31285d;

        /* renamed from: e, reason: collision with root package name */
        int f31286e;

        /* renamed from: f, reason: collision with root package name */
        int f31287f;

        /* renamed from: g, reason: collision with root package name */
        int f31288g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList f31289h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList f31290i;

        /* renamed from: j, reason: collision with root package name */
        Object f31291j = null;

        /* renamed from: k, reason: collision with root package name */
        Object f31292k;

        /* renamed from: l, reason: collision with root package name */
        Object f31293l;

        /* renamed from: m, reason: collision with root package name */
        Object f31294m;

        /* renamed from: n, reason: collision with root package name */
        Object f31295n;

        /* renamed from: o, reason: collision with root package name */
        Object f31296o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f31297p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f31298q;

        /* renamed from: r, reason: collision with root package name */
        float f31299r;

        /* renamed from: s, reason: collision with root package name */
        View f31300s;

        /* renamed from: t, reason: collision with root package name */
        boolean f31301t;

        g() {
            Object obj = Fragment.f31221s1;
            this.f31292k = obj;
            this.f31293l = null;
            this.f31294m = obj;
            this.f31295n = null;
            this.f31296o = obj;
            this.f31299r = 1.0f;
            this.f31300s = null;
        }
    }

    static class h {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    private static abstract class i {
        private i() {
        }

        abstract void a();

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    public Fragment() {
        X();
    }

    private int D() {
        AbstractC4013k.b bVar = this.f31248i1;
        return (bVar == AbstractC4013k.b.INITIALIZED || this.f31271w == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f31271w.D());
    }

    private Fragment U(boolean z10) {
        String str;
        if (z10) {
            V1.b.h(this);
        }
        Fragment fragment = this.f31245h;
        if (fragment != null) {
            return fragment;
        }
        w wVar = this.f31268t;
        if (wVar == null || (str = this.f31247i) == null) {
            return null;
        }
        return wVar.c0(str);
    }

    private void X() {
        this.f31250j1 = new C4018p(this);
        this.f31258n1 = C7417e.a(this);
        this.f31256m1 = null;
        if (this.f31264q1.contains(this.f31266r1)) {
            return;
        }
        n1(this.f31266r1);
    }

    public static Fragment Z(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) n.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.v1(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e10) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (java.lang.InstantiationException e11) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private g j() {
        if (this.f31233X == null) {
            this.f31233X = new g();
        }
        return this.f31233X;
    }

    private void n1(i iVar) {
        if (this.f31236a >= 0) {
            iVar.a();
        } else {
            this.f31264q1.add(iVar);
        }
    }

    private void s1() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f31230I != null) {
            t1(this.f31237b);
        }
        this.f31237b = null;
    }

    View A() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        return gVar.f31300s;
    }

    public void A0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f31228G = true;
        o oVar = this.f31269u;
        Activity activityF = oVar == null ? null : oVar.f();
        if (activityF != null) {
            this.f31228G = false;
            z0(activityF, attributeSet, bundle);
        }
    }

    void A1(ArrayList arrayList, ArrayList arrayList2) {
        j();
        g gVar = this.f31233X;
        gVar.f31289h = arrayList;
        gVar.f31290i = arrayList2;
    }

    public final Object B() {
        o oVar = this.f31269u;
        if (oVar == null) {
            return null;
        }
        return oVar.k();
    }

    public void B0(boolean z10) {
    }

    public void B1(Intent intent, int i10, Bundle bundle) {
        if (this.f31269u != null) {
            G().R0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public LayoutInflater C(Bundle bundle) {
        o oVar = this.f31269u;
        if (oVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterM = oVar.m();
        AbstractC2775u.a(layoutInflaterM, this.f31270v.s0());
        return layoutInflaterM;
    }

    public boolean C0(MenuItem menuItem) {
        return false;
    }

    public void C1() {
        if (this.f31233X == null || !j().f31301t) {
            return;
        }
        if (this.f31269u == null) {
            j().f31301t = false;
        } else if (Looper.myLooper() != this.f31269u.h().getLooper()) {
            this.f31269u.h().postAtFrontOfQueue(new c());
        } else {
            e(true);
        }
    }

    public void D0(Menu menu) {
    }

    int E() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f31288g;
    }

    public void E0() {
        this.f31228G = true;
    }

    public final Fragment F() {
        return this.f31271w;
    }

    public void F0(boolean z10) {
    }

    public final w G() {
        w wVar = this.f31268t;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void G0(Menu menu) {
    }

    boolean H() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return false;
        }
        return gVar.f31283b;
    }

    public void H0(boolean z10) {
    }

    int I() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f31286e;
    }

    public void I0(int i10, String[] strArr, int[] iArr) {
    }

    int J() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f31287f;
    }

    public void J0() {
        this.f31228G = true;
    }

    float K() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f31299r;
    }

    public void K0(Bundle bundle) {
    }

    public Object L() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f31294m;
        return obj == f31221s1 ? y() : obj;
    }

    public void L0() {
        this.f31228G = true;
    }

    public final Resources M() {
        return p1().getResources();
    }

    public void M0() {
        this.f31228G = true;
    }

    public Object N() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f31292k;
        return obj == f31221s1 ? v() : obj;
    }

    public void N0(View view, Bundle bundle) {
    }

    @Override // androidx.lifecycle.InterfaceC4017o
    public AbstractC4013k O() {
        return this.f31250j1;
    }

    public void O0(Bundle bundle) {
        this.f31228G = true;
    }

    public Object P() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        return gVar.f31295n;
    }

    void P0(Bundle bundle) {
        this.f31270v.T0();
        this.f31236a = 3;
        this.f31228G = false;
        i0(bundle);
        if (this.f31228G) {
            s1();
            this.f31270v.v();
        } else {
            throw new M("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public Object Q() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f31296o;
        return obj == f31221s1 ? P() : obj;
    }

    void Q0() {
        Iterator it = this.f31264q1.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
        this.f31264q1.clear();
        this.f31270v.k(this.f31269u, f(), this);
        this.f31236a = 0;
        this.f31228G = false;
        l0(this.f31269u.g());
        if (this.f31228G) {
            this.f31268t.F(this);
            this.f31270v.w();
        } else {
            throw new M("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    ArrayList R() {
        ArrayList arrayList;
        g gVar = this.f31233X;
        return (gVar == null || (arrayList = gVar.f31289h) == null) ? new ArrayList() : arrayList;
    }

    void R0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    ArrayList S() {
        ArrayList arrayList;
        g gVar = this.f31233X;
        return (gVar == null || (arrayList = gVar.f31290i) == null) ? new ArrayList() : arrayList;
    }

    boolean S0(MenuItem menuItem) {
        if (this.f31222A) {
            return false;
        }
        if (n0(menuItem)) {
            return true;
        }
        return this.f31270v.y(menuItem);
    }

    public final String T(int i10) {
        return M().getString(i10);
    }

    void T0(Bundle bundle) {
        this.f31270v.T0();
        this.f31236a = 1;
        this.f31228G = false;
        this.f31250j1.a(new f());
        this.f31258n1.d(bundle);
        o0(bundle);
        this.f31244g1 = true;
        if (this.f31228G) {
            this.f31250j1.h(AbstractC4013k.a.ON_CREATE);
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean U0(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.f31222A) {
            return false;
        }
        if (this.f31226E && this.f31227F) {
            r0(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.f31270v.A(menu, menuInflater);
    }

    public View V() {
        return this.f31230I;
    }

    void V0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f31270v.T0();
        this.f31265r = true;
        this.f31252k1 = new I(this, o());
        View viewS0 = s0(layoutInflater, viewGroup, bundle);
        this.f31230I = viewS0;
        if (viewS0 == null) {
            if (this.f31252k1.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f31252k1 = null;
        } else {
            this.f31252k1.c();
            T.b(this.f31230I, this.f31252k1);
            U.b(this.f31230I, this.f31252k1);
            AbstractC7419g.b(this.f31230I, this.f31252k1);
            this.f31254l1.n(this.f31252k1);
        }
    }

    public AbstractC4020s W() {
        return this.f31254l1;
    }

    void W0() {
        this.f31270v.B();
        this.f31250j1.h(AbstractC4013k.a.ON_DESTROY);
        this.f31236a = 0;
        this.f31228G = false;
        this.f31244g1 = false;
        t0();
        if (this.f31228G) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void X0() {
        this.f31270v.C();
        if (this.f31230I != null && this.f31252k1.O().b().isAtLeast(AbstractC4013k.b.CREATED)) {
            this.f31252k1.a(AbstractC4013k.a.ON_DESTROY);
        }
        this.f31236a = 1;
        this.f31228G = false;
        v0();
        if (this.f31228G) {
            androidx.loader.app.a.c(this).e();
            this.f31265r = false;
        } else {
            throw new M("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void Y() {
        X();
        this.f31246h1 = this.f31241f;
        this.f31241f = UUID.randomUUID().toString();
        this.f31253l = false;
        this.f31255m = false;
        this.f31259o = false;
        this.f31261p = false;
        this.f31263q = false;
        this.f31267s = 0;
        this.f31268t = null;
        this.f31270v = new x();
        this.f31269u = null;
        this.f31272x = 0;
        this.f31273y = 0;
        this.f31274z = null;
        this.f31222A = false;
        this.f31223B = false;
    }

    void Y0() {
        this.f31236a = -1;
        this.f31228G = false;
        w0();
        this.f31242f1 = null;
        if (this.f31228G) {
            if (this.f31270v.D0()) {
                return;
            }
            this.f31270v.B();
            this.f31270v = new x();
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater Z0(Bundle bundle) {
        LayoutInflater layoutInflaterX0 = x0(bundle);
        this.f31242f1 = layoutInflaterX0;
        return layoutInflaterX0;
    }

    public final boolean a0() {
        return this.f31269u != null && this.f31253l;
    }

    void a1() {
        onLowMemory();
    }

    public final boolean b0() {
        w wVar;
        return this.f31222A || ((wVar = this.f31268t) != null && wVar.H0(this.f31271w));
    }

    void b1(boolean z10) {
        B0(z10);
    }

    final boolean c0() {
        return this.f31267s > 0;
    }

    boolean c1(MenuItem menuItem) {
        if (this.f31222A) {
            return false;
        }
        if (this.f31226E && this.f31227F && C0(menuItem)) {
            return true;
        }
        return this.f31270v.H(menuItem);
    }

    public final boolean d0() {
        w wVar;
        return this.f31227F && ((wVar = this.f31268t) == null || wVar.I0(this.f31271w));
    }

    void d1(Menu menu) {
        if (this.f31222A) {
            return;
        }
        if (this.f31226E && this.f31227F) {
            D0(menu);
        }
        this.f31270v.I(menu);
    }

    void e(boolean z10) {
        ViewGroup viewGroup;
        w wVar;
        g gVar = this.f31233X;
        if (gVar != null) {
            gVar.f31301t = false;
        }
        if (this.f31230I == null || (viewGroup = this.f31229H) == null || (wVar = this.f31268t) == null) {
            return;
        }
        K kN = K.n(viewGroup, wVar);
        kN.p();
        if (z10) {
            this.f31269u.h().post(new d(kN));
        } else {
            kN.g();
        }
    }

    boolean e0() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return false;
        }
        return gVar.f31301t;
    }

    void e1() {
        this.f31270v.K();
        if (this.f31230I != null) {
            this.f31252k1.a(AbstractC4013k.a.ON_PAUSE);
        }
        this.f31250j1.h(AbstractC4013k.a.ON_PAUSE);
        this.f31236a = 6;
        this.f31228G = false;
        E0();
        if (this.f31228G) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    AbstractC4001l f() {
        return new e();
    }

    public final boolean f0() {
        return this.f31255m;
    }

    void f1(boolean z10) {
        F0(z10);
    }

    @Override // androidx.lifecycle.InterfaceC4011i
    public P.c g() {
        Application application;
        if (this.f31268t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f31256m1 == null) {
            Context applicationContext = p1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && w.E0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + p1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f31256m1 = new androidx.lifecycle.K(application, this, q());
        }
        return this.f31256m1;
    }

    public final boolean g0() {
        w wVar = this.f31268t;
        if (wVar == null) {
            return false;
        }
        return wVar.L0();
    }

    boolean g1(Menu menu) {
        boolean z10 = false;
        if (this.f31222A) {
            return false;
        }
        if (this.f31226E && this.f31227F) {
            G0(menu);
            z10 = true;
        }
        return z10 | this.f31270v.M(menu);
    }

    @Override // androidx.lifecycle.InterfaceC4011i
    public AbstractC4056a h() {
        Application application;
        Context applicationContext = p1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && w.E0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + p1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C4057b c4057b = new C4057b();
        if (application != null) {
            c4057b.c(P.a.f31628h, application);
        }
        c4057b.c(androidx.lifecycle.H.f31605a, this);
        c4057b.c(androidx.lifecycle.H.f31606b, this);
        if (q() != null) {
            c4057b.c(androidx.lifecycle.H.f31607c, q());
        }
        return c4057b;
    }

    void h0() {
        this.f31270v.T0();
    }

    void h1() {
        boolean zJ0 = this.f31268t.J0(this);
        Boolean bool = this.f31251k;
        if (bool == null || bool.booleanValue() != zJ0) {
            this.f31251k = Boolean.valueOf(zJ0);
            H0(zJ0);
            this.f31270v.N();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f31272x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f31273y));
        printWriter.print(" mTag=");
        printWriter.println(this.f31274z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f31236a);
        printWriter.print(" mWho=");
        printWriter.print(this.f31241f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f31267s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f31253l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f31255m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f31259o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f31261p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f31222A);
        printWriter.print(" mDetached=");
        printWriter.print(this.f31223B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f31227F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f31226E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f31224C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f31232N);
        if (this.f31268t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f31268t);
        }
        if (this.f31269u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f31269u);
        }
        if (this.f31271w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f31271w);
        }
        if (this.f31243g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f31243g);
        }
        if (this.f31237b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f31237b);
        }
        if (this.f31238c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f31238c);
        }
        if (this.f31239d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f31239d);
        }
        Fragment fragmentU = U(false);
        if (fragmentU != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentU);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f31249j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(H());
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(u());
        }
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(x());
        }
        if (I() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(I());
        }
        if (J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(J());
        }
        if (this.f31229H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f31229H);
        }
        if (this.f31230I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f31230I);
        }
        if (p() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(p());
        }
        if (s() != null) {
            androidx.loader.app.a.c(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f31270v + ":");
        this.f31270v.U(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void i0(Bundle bundle) {
        this.f31228G = true;
    }

    void i1() {
        this.f31270v.T0();
        this.f31270v.Y(true);
        this.f31236a = 7;
        this.f31228G = false;
        J0();
        if (!this.f31228G) {
            throw new M("Fragment " + this + " did not call through to super.onResume()");
        }
        C4018p c4018p = this.f31250j1;
        AbstractC4013k.a aVar = AbstractC4013k.a.ON_RESUME;
        c4018p.h(aVar);
        if (this.f31230I != null) {
            this.f31252k1.a(aVar);
        }
        this.f31270v.O();
    }

    public void j0(int i10, int i11, Intent intent) {
        if (w.E0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    void j1(Bundle bundle) {
        K0(bundle);
        this.f31258n1.e(bundle);
        Bundle bundleG1 = this.f31270v.M0();
        if (bundleG1 != null) {
            bundle.putParcelable("android:support:fragments", bundleG1);
        }
    }

    Fragment k(String str) {
        return str.equals(this.f31241f) ? this : this.f31270v.g0(str);
    }

    public void k0(Activity activity) {
        this.f31228G = true;
    }

    void k1() {
        this.f31270v.T0();
        this.f31270v.Y(true);
        this.f31236a = 5;
        this.f31228G = false;
        L0();
        if (!this.f31228G) {
            throw new M("Fragment " + this + " did not call through to super.onStart()");
        }
        C4018p c4018p = this.f31250j1;
        AbstractC4013k.a aVar = AbstractC4013k.a.ON_START;
        c4018p.h(aVar);
        if (this.f31230I != null) {
            this.f31252k1.a(aVar);
        }
        this.f31270v.P();
    }

    public final AbstractActivityC3999j l() {
        o oVar = this.f31269u;
        if (oVar == null) {
            return null;
        }
        return (AbstractActivityC3999j) oVar.f();
    }

    public void l0(Context context) {
        this.f31228G = true;
        o oVar = this.f31269u;
        Activity activityF = oVar == null ? null : oVar.f();
        if (activityF != null) {
            this.f31228G = false;
            k0(activityF);
        }
    }

    void l1() {
        this.f31270v.R();
        if (this.f31230I != null) {
            this.f31252k1.a(AbstractC4013k.a.ON_STOP);
        }
        this.f31250j1.h(AbstractC4013k.a.ON_STOP);
        this.f31236a = 4;
        this.f31228G = false;
        M0();
        if (this.f31228G) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onStop()");
    }

    public boolean m() {
        Boolean bool;
        g gVar = this.f31233X;
        if (gVar == null || (bool = gVar.f31298q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void m0(Fragment fragment) {
    }

    void m1() {
        N0(this.f31230I, this.f31237b);
        this.f31270v.S();
    }

    public boolean n() {
        Boolean bool;
        g gVar = this.f31233X;
        if (gVar == null || (bool = gVar.f31297p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean n0(MenuItem menuItem) {
        return false;
    }

    @Override // androidx.lifecycle.S
    public Q o() {
        if (this.f31268t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (D() != AbstractC4013k.b.INITIALIZED.ordinal()) {
            return this.f31268t.z0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public void o0(Bundle bundle) {
        this.f31228G = true;
        r1(bundle);
        if (this.f31270v.K0(1)) {
            return;
        }
        this.f31270v.z();
    }

    public final AbstractActivityC3999j o1() {
        AbstractActivityC3999j abstractActivityC3999jL = l();
        if (abstractActivityC3999jL != null) {
            return abstractActivityC3999jL;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f31228G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        o1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f31228G = true;
    }

    View p() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        return gVar.f31282a;
    }

    public Animation p0(int i10, boolean z10, int i11) {
        return null;
    }

    public final Context p1() {
        Context contextS = s();
        if (contextS != null) {
            return contextS;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final Bundle q() {
        return this.f31243g;
    }

    public Animator q0(int i10, boolean z10, int i11) {
        return null;
    }

    public final View q1() {
        View viewV = V();
        if (viewV != null) {
            return viewV;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final w r() {
        if (this.f31269u != null) {
            return this.f31270v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void r0(Menu menu, MenuInflater menuInflater) {
    }

    void r1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f31270v.e1(parcelable);
        this.f31270v.z();
    }

    public Context s() {
        o oVar = this.f31269u;
        if (oVar == null) {
            return null;
        }
        return oVar.g();
    }

    public View s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f31260o1;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void startActivityForResult(Intent intent, int i10) {
        B1(intent, i10, null);
    }

    @Override // q2.InterfaceC7418f
    public final C7416d t() {
        return this.f31258n1.b();
    }

    public void t0() {
        this.f31228G = true;
    }

    final void t1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f31238c;
        if (sparseArray != null) {
            this.f31230I.restoreHierarchyState(sparseArray);
            this.f31238c = null;
        }
        if (this.f31230I != null) {
            this.f31252k1.e(this.f31239d);
            this.f31239d = null;
        }
        this.f31228G = false;
        O0(bundle);
        if (this.f31228G) {
            if (this.f31230I != null) {
                this.f31252k1.a(AbstractC4013k.a.ON_CREATE);
            }
        } else {
            throw new M("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f31241f);
        if (this.f31272x != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f31272x));
        }
        if (this.f31274z != null) {
            sb2.append(" tag=");
            sb2.append(this.f31274z);
        }
        sb2.append(")");
        return sb2.toString();
    }

    int u() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f31284c;
    }

    public void u0() {
    }

    void u1(int i10, int i11, int i12, int i13) {
        if (this.f31233X == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        j().f31284c = i10;
        j().f31285d = i11;
        j().f31286e = i12;
        j().f31287f = i13;
    }

    public Object v() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        return gVar.f31291j;
    }

    public void v0() {
        this.f31228G = true;
    }

    public void v1(Bundle bundle) {
        if (this.f31268t != null && g0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f31243g = bundle;
    }

    s1.t w() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public void w0() {
        this.f31228G = true;
    }

    void w1(View view) {
        j().f31300s = view;
    }

    int x() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f31285d;
    }

    public LayoutInflater x0(Bundle bundle) {
        return C(bundle);
    }

    void x1(int i10) {
        if (this.f31233X == null && i10 == 0) {
            return;
        }
        j();
        this.f31233X.f31288g = i10;
    }

    public Object y() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        return gVar.f31293l;
    }

    public void y0(boolean z10) {
    }

    void y1(boolean z10) {
        if (this.f31233X == null) {
            return;
        }
        j().f31283b = z10;
    }

    s1.t z() {
        g gVar = this.f31233X;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public void z0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f31228G = true;
    }

    void z1(float f10) {
        j().f31299r = f10;
    }
}
