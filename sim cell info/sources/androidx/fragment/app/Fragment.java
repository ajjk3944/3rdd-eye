package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.d;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.g, androidx.lifecycle.s, androidx.savedstate.b {
    static final Object Y = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean F;
    ViewGroup G;
    View H;
    View I;
    boolean J;
    d L;
    boolean N;
    boolean O;
    float P;
    LayoutInflater Q;
    boolean R;
    androidx.lifecycle.h T;
    r U;
    androidx.savedstate.a W;
    private int X;

    /* renamed from: c, reason: collision with root package name */
    Bundle f1531c;

    /* renamed from: d, reason: collision with root package name */
    SparseArray<Parcelable> f1532d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f1533e;

    /* renamed from: g, reason: collision with root package name */
    Bundle f1535g;

    /* renamed from: h, reason: collision with root package name */
    Fragment f1536h;

    /* renamed from: j, reason: collision with root package name */
    int f1538j;

    /* renamed from: l, reason: collision with root package name */
    boolean f1540l;

    /* renamed from: m, reason: collision with root package name */
    boolean f1541m;

    /* renamed from: n, reason: collision with root package name */
    boolean f1542n;

    /* renamed from: o, reason: collision with root package name */
    boolean f1543o;

    /* renamed from: p, reason: collision with root package name */
    boolean f1544p;

    /* renamed from: q, reason: collision with root package name */
    boolean f1545q;

    /* renamed from: r, reason: collision with root package name */
    int f1546r;

    /* renamed from: s, reason: collision with root package name */
    i f1547s;

    /* renamed from: t, reason: collision with root package name */
    g f1548t;

    /* renamed from: v, reason: collision with root package name */
    Fragment f1550v;

    /* renamed from: w, reason: collision with root package name */
    int f1551w;

    /* renamed from: x, reason: collision with root package name */
    int f1552x;

    /* renamed from: y, reason: collision with root package name */
    String f1553y;

    /* renamed from: z, reason: collision with root package name */
    boolean f1554z;

    /* renamed from: b, reason: collision with root package name */
    int f1530b = 0;

    /* renamed from: f, reason: collision with root package name */
    String f1534f = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    String f1537i = null;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f1539k = null;

    /* renamed from: u, reason: collision with root package name */
    i f1549u = new i();
    boolean E = true;
    boolean K = true;
    Runnable M = new a();
    d.b S = d.b.RESUMED;
    androidx.lifecycle.l<androidx.lifecycle.g> V = new androidx.lifecycle.l<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.n1();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.b();
        }
    }

    class c extends androidx.fragment.app.d {
        c() {
        }

        @Override // androidx.fragment.app.d
        public View f(int i2) {
            View view = Fragment.this.H;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.d
        public boolean g() {
            return Fragment.this.H != null;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        View f1559a;

        /* renamed from: b, reason: collision with root package name */
        Animator f1560b;

        /* renamed from: c, reason: collision with root package name */
        int f1561c;

        /* renamed from: d, reason: collision with root package name */
        int f1562d;

        /* renamed from: e, reason: collision with root package name */
        int f1563e;

        /* renamed from: f, reason: collision with root package name */
        int f1564f;

        /* renamed from: g, reason: collision with root package name */
        Object f1565g = null;

        /* renamed from: h, reason: collision with root package name */
        Object f1566h;

        /* renamed from: i, reason: collision with root package name */
        Object f1567i;

        /* renamed from: j, reason: collision with root package name */
        Object f1568j;

        /* renamed from: k, reason: collision with root package name */
        Object f1569k;

        /* renamed from: l, reason: collision with root package name */
        Object f1570l;

        /* renamed from: m, reason: collision with root package name */
        Boolean f1571m;

        /* renamed from: n, reason: collision with root package name */
        Boolean f1572n;

        /* renamed from: o, reason: collision with root package name */
        q.f f1573o;

        /* renamed from: p, reason: collision with root package name */
        q.f f1574p;

        /* renamed from: q, reason: collision with root package name */
        boolean f1575q;

        /* renamed from: r, reason: collision with root package name */
        f f1576r;

        /* renamed from: s, reason: collision with root package name */
        boolean f1577s;

        d() {
            Object obj = Fragment.Y;
            this.f1566h = obj;
            this.f1567i = null;
            this.f1568j = obj;
            this.f1569k = null;
            this.f1570l = obj;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public Fragment() {
        K();
    }

    private void K() {
        this.T = new androidx.lifecycle.h(this);
        this.W = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.T.a(new androidx.lifecycle.e() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.e
                public void g(androidx.lifecycle.g gVar, d.a aVar) {
                    View view;
                    if (aVar != d.a.ON_STOP || (view = Fragment.this.H) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    public static Fragment M(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = androidx.fragment.app.f.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.f1(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private d g() {
        if (this.L == null) {
            this.L = new d();
        }
        return this.L;
    }

    public final Fragment A() {
        return this.f1550v;
    }

    public void A0(Bundle bundle) {
        this.F = true;
    }

    public Object B() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1568j;
        return obj == Y ? s() : obj;
    }

    void B0(Bundle bundle) {
        this.f1549u.P0();
        this.f1530b = 2;
        this.F = false;
        U(bundle);
        if (this.F) {
            this.f1549u.v();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final Resources C() {
        return Z0().getResources();
    }

    void C0() {
        this.f1549u.m(this.f1548t, new c(), this);
        this.F = false;
        X(this.f1548t.i());
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onAttach()");
    }

    public final boolean D() {
        return this.B;
    }

    void D0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f1549u.w(configuration);
    }

    public Object E() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1566h;
        return obj == Y ? q() : obj;
    }

    boolean E0(MenuItem menuItem) {
        if (this.f1554z) {
            return false;
        }
        return Z(menuItem) || this.f1549u.x(menuItem);
    }

    public Object F() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f1569k;
    }

    void F0(Bundle bundle) {
        this.f1549u.P0();
        this.f1530b = 1;
        this.F = false;
        this.W.c(bundle);
        a0(bundle);
        this.R = true;
        if (this.F) {
            this.T.i(d.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object G() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1570l;
        return obj == Y ? F() : obj;
    }

    boolean G0(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.f1554z) {
            return false;
        }
        if (this.D && this.E) {
            z2 = true;
            d0(menu, menuInflater);
        }
        return z2 | this.f1549u.z(menu, menuInflater);
    }

    int H() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1561c;
    }

    void H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1549u.P0();
        this.f1545q = true;
        this.U = new r();
        View viewE0 = e0(layoutInflater, viewGroup, bundle);
        this.H = viewE0;
        if (viewE0 != null) {
            this.U.e();
            this.V.g(this.U);
        } else {
            if (this.U.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.U = null;
        }
    }

    public final Fragment I() {
        String str;
        Fragment fragment = this.f1536h;
        if (fragment != null) {
            return fragment;
        }
        i iVar = this.f1547s;
        if (iVar == null || (str = this.f1537i) == null) {
            return null;
        }
        return iVar.f1620h.get(str);
    }

    void I0() {
        this.f1549u.A();
        this.T.i(d.a.ON_DESTROY);
        this.f1530b = 0;
        this.F = false;
        this.R = false;
        f0();
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public View J() {
        return this.H;
    }

    void J0() {
        this.f1549u.B();
        if (this.H != null) {
            this.U.b(d.a.ON_DESTROY);
        }
        this.f1530b = 1;
        this.F = false;
        h0();
        if (this.F) {
            androidx.loader.app.a.b(this).c();
            this.f1545q = false;
        } else {
            throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void K0() {
        this.F = false;
        i0();
        this.Q = null;
        if (this.F) {
            if (this.f1549u.A0()) {
                return;
            }
            this.f1549u.A();
            this.f1549u = new i();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDetach()");
    }

    void L() {
        K();
        this.f1534f = UUID.randomUUID().toString();
        this.f1540l = false;
        this.f1541m = false;
        this.f1542n = false;
        this.f1543o = false;
        this.f1544p = false;
        this.f1546r = 0;
        this.f1547s = null;
        this.f1549u = new i();
        this.f1548t = null;
        this.f1551w = 0;
        this.f1552x = 0;
        this.f1553y = null;
        this.f1554z = false;
        this.A = false;
    }

    LayoutInflater L0(Bundle bundle) {
        LayoutInflater layoutInflaterJ0 = j0(bundle);
        this.Q = layoutInflaterJ0;
        return layoutInflaterJ0;
    }

    void M0() {
        onLowMemory();
        this.f1549u.C();
    }

    public final boolean N() {
        return this.f1548t != null && this.f1540l;
    }

    void N0(boolean z2) {
        n0(z2);
        this.f1549u.D(z2);
    }

    public final boolean O() {
        return this.f1554z;
    }

    boolean O0(MenuItem menuItem) {
        if (this.f1554z) {
            return false;
        }
        return (this.D && this.E && o0(menuItem)) || this.f1549u.S(menuItem);
    }

    boolean P() {
        d dVar = this.L;
        if (dVar == null) {
            return false;
        }
        return dVar.f1577s;
    }

    void P0(Menu menu) {
        if (this.f1554z) {
            return;
        }
        if (this.D && this.E) {
            p0(menu);
        }
        this.f1549u.T(menu);
    }

    final boolean Q() {
        return this.f1546r > 0;
    }

    void Q0() {
        this.f1549u.V();
        if (this.H != null) {
            this.U.b(d.a.ON_PAUSE);
        }
        this.T.i(d.a.ON_PAUSE);
        this.f1530b = 3;
        this.F = false;
        q0();
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onPause()");
    }

    boolean R() {
        d dVar = this.L;
        if (dVar == null) {
            return false;
        }
        return dVar.f1575q;
    }

    void R0(boolean z2) {
        r0(z2);
        this.f1549u.W(z2);
    }

    public final boolean S() {
        i iVar = this.f1547s;
        if (iVar == null) {
            return false;
        }
        return iVar.E0();
    }

    boolean S0(Menu menu) {
        boolean z2 = false;
        if (this.f1554z) {
            return false;
        }
        if (this.D && this.E) {
            z2 = true;
            s0(menu);
        }
        return z2 | this.f1549u.X(menu);
    }

    void T() {
        this.f1549u.P0();
    }

    void T0() {
        boolean zC0 = this.f1547s.C0(this);
        Boolean bool = this.f1539k;
        if (bool == null || bool.booleanValue() != zC0) {
            this.f1539k = Boolean.valueOf(zC0);
            t0(zC0);
            this.f1549u.Y();
        }
    }

    public void U(Bundle bundle) {
        this.F = true;
    }

    void U0() {
        this.f1549u.P0();
        this.f1549u.h0();
        this.f1530b = 4;
        this.F = false;
        v0();
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.h hVar = this.T;
        d.a aVar = d.a.ON_RESUME;
        hVar.i(aVar);
        if (this.H != null) {
            this.U.b(aVar);
        }
        this.f1549u.Z();
        this.f1549u.h0();
    }

    public void V(int i2, int i3, Intent intent) {
    }

    void V0(Bundle bundle) {
        w0(bundle);
        this.W.d(bundle);
        Parcelable parcelableB1 = this.f1549u.b1();
        if (parcelableB1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableB1);
        }
    }

    @Deprecated
    public void W(Activity activity) {
        this.F = true;
    }

    void W0() {
        this.f1549u.P0();
        this.f1549u.h0();
        this.f1530b = 3;
        this.F = false;
        x0();
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.h hVar = this.T;
        d.a aVar = d.a.ON_START;
        hVar.i(aVar);
        if (this.H != null) {
            this.U.b(aVar);
        }
        this.f1549u.a0();
    }

    public void X(Context context) {
        this.F = true;
        g gVar = this.f1548t;
        Activity activityH = gVar == null ? null : gVar.h();
        if (activityH != null) {
            this.F = false;
            W(activityH);
        }
    }

    void X0() {
        this.f1549u.c0();
        if (this.H != null) {
            this.U.b(d.a.ON_STOP);
        }
        this.T.i(d.a.ON_STOP);
        this.f1530b = 2;
        this.F = false;
        y0();
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStop()");
    }

    public void Y(Fragment fragment) {
    }

    public final androidx.fragment.app.c Y0() {
        androidx.fragment.app.c cVarI = i();
        if (cVarI != null) {
            return cVarI;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean Z(MenuItem menuItem) {
        return false;
    }

    public final Context Z0() {
        Context contextP = p();
        if (contextP != null) {
            return contextP;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.T;
    }

    public void a0(Bundle bundle) {
        this.F = true;
        b1(bundle);
        if (this.f1549u.D0(1)) {
            return;
        }
        this.f1549u.y();
    }

    public final View a1() {
        View viewJ = J();
        if (viewJ != null) {
            return viewJ;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void b() {
        d dVar = this.L;
        f fVar = null;
        if (dVar != null) {
            dVar.f1575q = false;
            f fVar2 = dVar.f1576r;
            dVar.f1576r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public Animation b0(int i2, boolean z2, int i3) {
        return null;
    }

    void b1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f1549u.Z0(parcelable);
        this.f1549u.y();
    }

    public Animator c0(int i2, boolean z2, int i3) {
        return null;
    }

    final void c1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1532d;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.f1532d = null;
        }
        this.F = false;
        A0(bundle);
        if (this.F) {
            if (this.H != null) {
                this.U.b(d.a.ON_CREATE);
            }
        } else {
            throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry d() {
        return this.W.b();
    }

    public void d0(Menu menu, MenuInflater menuInflater) {
    }

    void d1(View view) {
        g().f1559a = view;
    }

    @Override // androidx.lifecycle.s
    public androidx.lifecycle.r e() {
        i iVar = this.f1547s;
        if (iVar != null) {
            return iVar.x0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public View e0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.X;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    void e1(Animator animator) {
        g().f1560b = animator;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1551w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1552x));
        printWriter.print(" mTag=");
        printWriter.println(this.f1553y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1530b);
        printWriter.print(" mWho=");
        printWriter.print(this.f1534f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1546r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1540l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1541m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1542n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1543o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1554z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.f1547s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1547s);
        }
        if (this.f1548t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1548t);
        }
        if (this.f1550v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1550v);
        }
        if (this.f1535g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1535g);
        }
        if (this.f1531c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1531c);
        }
        if (this.f1532d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1532d);
        }
        Fragment fragmentI = I();
        if (fragmentI != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentI);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1538j);
        }
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(x());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.H);
        }
        if (l() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(l());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(H());
        }
        if (p() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f1549u + ":");
        this.f1549u.b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void f0() {
        this.F = true;
    }

    public void f1(Bundle bundle) {
        if (this.f1547s != null && S()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1535g = bundle;
    }

    public void g0() {
    }

    void g1(boolean z2) {
        g().f1577s = z2;
    }

    Fragment h(String str) {
        return str.equals(this.f1534f) ? this : this.f1549u.n0(str);
    }

    public void h0() {
        this.F = true;
    }

    public void h1(boolean z2) {
        if (this.E != z2) {
            this.E = z2;
            if (this.D && N() && !O()) {
                this.f1548t.r();
            }
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final androidx.fragment.app.c i() {
        g gVar = this.f1548t;
        if (gVar == null) {
            return null;
        }
        return (androidx.fragment.app.c) gVar.h();
    }

    public void i0() {
        this.F = true;
    }

    void i1(int i2) {
        if (this.L == null && i2 == 0) {
            return;
        }
        g().f1562d = i2;
    }

    public boolean j() {
        Boolean bool;
        d dVar = this.L;
        if (dVar == null || (bool = dVar.f1572n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public LayoutInflater j0(Bundle bundle) {
        return w(bundle);
    }

    void j1(int i2, int i3) {
        if (this.L == null && i2 == 0 && i3 == 0) {
            return;
        }
        g();
        d dVar = this.L;
        dVar.f1563e = i2;
        dVar.f1564f = i3;
    }

    public boolean k() {
        Boolean bool;
        d dVar = this.L;
        if (dVar == null || (bool = dVar.f1571m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void k0(boolean z2) {
    }

    void k1(f fVar) {
        g();
        d dVar = this.L;
        f fVar2 = dVar.f1576r;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.f1575q) {
            dVar.f1576r = fVar;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    View l() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f1559a;
    }

    @Deprecated
    public void l0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    void l1(int i2) {
        g().f1561c = i2;
    }

    Animator m() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f1560b;
    }

    public void m0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        g gVar = this.f1548t;
        Activity activityH = gVar == null ? null : gVar.h();
        if (activityH != null) {
            this.F = false;
            l0(activityH, attributeSet, bundle);
        }
    }

    @Deprecated
    public void m1(boolean z2) {
        if (!this.K && z2 && this.f1530b < 3 && this.f1547s != null && N() && this.R) {
            this.f1547s.Q0(this);
        }
        this.K = z2;
        this.J = this.f1530b < 3 && !z2;
        if (this.f1531c != null) {
            this.f1533e = Boolean.valueOf(z2);
        }
    }

    public final Bundle n() {
        return this.f1535g;
    }

    public void n0(boolean z2) {
    }

    public void n1() {
        i iVar = this.f1547s;
        if (iVar == null || iVar.f1630r == null) {
            g().f1575q = false;
        } else if (Looper.myLooper() != this.f1547s.f1630r.j().getLooper()) {
            this.f1547s.f1630r.j().postAtFrontOfQueue(new b());
        } else {
            b();
        }
    }

    public final h o() {
        if (this.f1548t != null) {
            return this.f1549u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public boolean o0(MenuItem menuItem) {
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Y0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    public Context p() {
        g gVar = this.f1548t;
        if (gVar == null) {
            return null;
        }
        return gVar.i();
    }

    public void p0(Menu menu) {
    }

    public Object q() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f1565g;
    }

    public void q0() {
        this.F = true;
    }

    q.f r() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f1573o;
    }

    public void r0(boolean z2) {
    }

    public Object s() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f1567i;
    }

    public void s0(Menu menu) {
    }

    q.f t() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f1574p;
    }

    public void t0(boolean z2) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        z.a.a(this, sb);
        sb.append(" (");
        sb.append(this.f1534f);
        sb.append(")");
        if (this.f1551w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1551w));
        }
        if (this.f1553y != null) {
            sb.append(" ");
            sb.append(this.f1553y);
        }
        sb.append('}');
        return sb.toString();
    }

    public final h u() {
        return this.f1547s;
    }

    public void u0(int i2, String[] strArr, int[] iArr) {
    }

    public final Object v() {
        g gVar = this.f1548t;
        if (gVar == null) {
            return null;
        }
        return gVar.m();
    }

    public void v0() {
        this.F = true;
    }

    @Deprecated
    public LayoutInflater w(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        g gVar = this.f1548t;
        if (gVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterN = gVar.n();
        a0.f.b(layoutInflaterN, this.f1549u.v0());
        return layoutInflaterN;
    }

    public void w0(Bundle bundle) {
    }

    int x() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1562d;
    }

    public void x0() {
        this.F = true;
    }

    int y() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1563e;
    }

    public void y0() {
        this.F = true;
    }

    int z() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1564f;
    }

    public void z0(View view, Bundle bundle) {
    }
}
