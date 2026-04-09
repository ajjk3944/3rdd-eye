package b5;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;
import com.google.android.gms.internal.measurement.d5;
import com.liuzh.deviceinfo.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class z implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.a0, k1, androidx.lifecycle.n, a6.f, f.c {
    public static final Object Y = new Object();
    public String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean F;
    public ViewGroup G;
    public View H;
    public boolean I;
    public x K;
    public boolean L;
    public LayoutInflater M;
    public boolean N;
    public String O;
    public androidx.lifecycle.s P;
    public androidx.lifecycle.c0 Q;
    public d1 R;
    public final androidx.lifecycle.l0 S;
    public androidx.lifecycle.b1 T;
    public y4.a U;
    public final AtomicInteger V;
    public final ArrayList W;
    public final u X;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1930b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1931c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1932d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f1933e;
    public Bundle g;

    /* renamed from: h, reason: collision with root package name */
    public z f1935h;
    public int j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1938l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1939m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1940n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1941o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1942p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1943q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1944r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1945s;

    /* renamed from: t, reason: collision with root package name */
    public int f1946t;

    /* renamed from: u, reason: collision with root package name */
    public u0 f1947u;

    /* renamed from: v, reason: collision with root package name */
    public d0 f1948v;

    /* renamed from: x, reason: collision with root package name */
    public z f1950x;

    /* renamed from: y, reason: collision with root package name */
    public int f1951y;

    /* renamed from: z, reason: collision with root package name */
    public int f1952z;

    /* renamed from: a, reason: collision with root package name */
    public int f1929a = -1;

    /* renamed from: f, reason: collision with root package name */
    public String f1934f = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    public String f1936i = null;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f1937k = null;

    /* renamed from: w, reason: collision with root package name */
    public u0 f1949w = new u0();
    public boolean E = true;
    public boolean J = true;

    public z() {
        new o(1, this);
        this.P = androidx.lifecycle.s.f1184e;
        this.S = new androidx.lifecycle.l0();
        this.V = new AtomicInteger();
        this.W = new ArrayList();
        this.X = new u(this);
        w();
    }

    public final boolean A() {
        return this.f1946t > 0;
    }

    public final boolean B() {
        u0 u0Var = this.f1947u;
        if (u0Var == null) {
            return false;
        }
        return u0Var.P();
    }

    public void C() {
        this.F = true;
    }

    public void D(int i4, int i10, Intent intent) {
        if (u0.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void E(Context context) {
        this.F = true;
        d0 d0Var = this.f1948v;
        if ((d0Var == null ? null : d0Var.f1765a) != null) {
            this.F = true;
        }
    }

    public void F(Bundle bundle) {
        Bundle bundle2;
        this.F = true;
        Bundle bundle3 = this.f1930b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f1949w.X(bundle2);
            u0 u0Var = this.f1949w;
            u0Var.I = false;
            u0Var.J = false;
            u0Var.P.g = false;
            u0Var.u(1);
        }
        u0 u0Var2 = this.f1949w;
        if (u0Var2.f1897w >= 1) {
            return;
        }
        u0Var2.I = false;
        u0Var2.J = false;
        u0Var2.P.g = false;
        u0Var2.u(1);
    }

    public View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void H() {
        this.F = true;
    }

    public void I() {
        this.F = true;
    }

    public void J() {
        this.F = true;
    }

    public LayoutInflater K(Bundle bundle) {
        d0 d0Var = this.f1948v;
        if (d0Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        i.g gVar = d0Var.f1769e;
        LayoutInflater layoutInflaterCloneInContext = gVar.getLayoutInflater().cloneInContext(gVar);
        layoutInflaterCloneInContext.setFactory2(this.f1949w.f1882f);
        return layoutInflaterCloneInContext;
    }

    public void L() {
        this.F = true;
    }

    public void N() {
        this.F = true;
    }

    public void P() {
        this.F = true;
    }

    public void Q() {
        this.F = true;
    }

    public void S(Bundle bundle) {
        this.F = true;
    }

    public void T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1949w.R();
        this.f1945s = true;
        this.R = new d1(this, e(), new androidx.lifecycle.o0(1, this));
        View viewG = G(layoutInflater, viewGroup);
        this.H = viewG;
        if (viewG == null) {
            if (this.R.f1774e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.R = null;
            return;
        }
        this.R.d();
        if (u0.K(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.H + " for Fragment " + this);
        }
        androidx.lifecycle.y0.h(this.H, this.R);
        View view = this.H;
        d1 d1Var = this.R;
        nk.k.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, d1Var);
        d5.u(this.H, this.R);
        this.S.j(this.R);
    }

    public final i.g U() {
        i.g gVarN = n();
        if (gVarN != null) {
            return gVarN;
        }
        throw new IllegalStateException(a0.g.m("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle V() {
        Bundle bundle = this.g;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a0.g.m("Fragment ", this, " does not have any arguments."));
    }

    public final Context W() {
        Context contextP = p();
        if (contextP != null) {
            return contextP;
        }
        throw new IllegalStateException(a0.g.m("Fragment ", this, " not attached to a context."));
    }

    public final View X() {
        View view = this.H;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a0.g.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void Y(int i4, int i10, int i11, int i12) {
        if (this.K == null && i4 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        m().f1921b = i4;
        m().f1922c = i10;
        m().f1923d = i11;
        m().f1924e = i12;
    }

    public final void Z(Bundle bundle) {
        if (this.f1947u != null && B()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.g = bundle;
    }

    public final void a0(boolean z3) {
        c5.b bVar = c5.c.f2759a;
        c5.c.b(new c5.a(this, "Attempting to set user visible hint to " + z3 + " for fragment " + this));
        c5.c.a(this).getClass();
        boolean z10 = false;
        if (!this.J && z3 && this.f1929a < 5 && this.f1947u != null && y() && this.N) {
            u0 u0Var = this.f1947u;
            b1 b1VarG = u0Var.g(this);
            z zVar = b1VarG.f1747c;
            if (zVar.I) {
                if (u0Var.f1878b) {
                    u0Var.L = true;
                } else {
                    zVar.I = false;
                    b1VarG.k();
                }
            }
        }
        this.J = z3;
        if (this.f1929a < 5 && !z3) {
            z10 = true;
        }
        this.I = z10;
        if (this.f1930b != null) {
            this.f1933e = Boolean.valueOf(z3);
        }
    }

    @Override // androidx.lifecycle.n
    public final androidx.lifecycle.h1 b() {
        Application application;
        if (this.f1947u == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.T == null) {
            Context applicationContext = W().getApplicationContext();
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
            if (application == null && u0.K(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + W().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.T = new androidx.lifecycle.b1(application, this, this.g);
        }
        return this.T;
    }

    public final void b0(Intent intent) {
        d0 d0Var = this.f1948v;
        if (d0Var == null) {
            throw new IllegalStateException(a0.g.m("Fragment ", this, " not attached to Activity"));
        }
        nk.k.e(intent, "intent");
        d0Var.f1766b.startActivity(intent, null);
    }

    @Override // androidx.lifecycle.n
    public final h5.c c() {
        Application application;
        Context applicationContext = W().getApplicationContext();
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
        if (application == null && u0.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + W().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        h5.c cVar = new h5.c(0);
        LinkedHashMap linkedHashMap = cVar.f24880a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.g1.f1141e, application);
        }
        linkedHashMap.put(androidx.lifecycle.y0.f1201a, this);
        linkedHashMap.put(androidx.lifecycle.y0.f1202b, this);
        Bundle bundle = this.g;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.y0.f1203c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.k1
    public final j1 e() {
        if (this.f1947u == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (r() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f1947u.P.f1917d;
        j1 j1Var = (j1) map.get(this.f1934f);
        if (j1Var != null) {
            return j1Var;
        }
        j1 j1Var2 = new j1();
        map.put(this.f1934f, j1Var2);
        return j1Var2;
    }

    public Activity f() {
        return n();
    }

    @Override // a6.f
    public final yb.i g() {
        return (yb.i) this.U.f37324b;
    }

    @Override // f.c
    public final f.d h(ci.b bVar, f.b bVar2) {
        p6.i iVar = new p6.i(this);
        if (this.f1929a > 1) {
            throw new IllegalStateException(a0.g.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        w wVar = new w(this, iVar, atomicReference, bVar, bVar2);
        if (this.f1929a >= 0) {
            wVar.a();
        } else {
            this.W.add(wVar);
        }
        return new t(atomicReference);
    }

    @Override // androidx.lifecycle.a0
    public final androidx.lifecycle.c0 j() {
        return this.Q;
    }

    public com.bumptech.glide.e k() {
        return new v(this);
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1951y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1952z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1929a);
        printWriter.print(" mWho=");
        printWriter.print(this.f1934f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1946t);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1938l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1939m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1941o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1942p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.f1947u != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1947u);
        }
        if (this.f1948v != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1948v);
        }
        if (this.f1950x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1950x);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.f1930b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1930b);
        }
        if (this.f1931c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1931c);
        }
        if (this.f1932d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1932d);
        }
        z zVarV = this.f1935h;
        if (zVarV == null) {
            u0 u0Var = this.f1947u;
            zVarV = (u0Var == null || (str2 = this.f1936i) == null) ? null : u0Var.f1879c.v(str2);
        }
        if (zVarV != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(zVarV);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        x xVar = this.K;
        printWriter.println(xVar == null ? false : xVar.f1920a);
        x xVar2 = this.K;
        if ((xVar2 == null ? 0 : xVar2.f1921b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            x xVar3 = this.K;
            printWriter.println(xVar3 == null ? 0 : xVar3.f1921b);
        }
        x xVar4 = this.K;
        if ((xVar4 == null ? 0 : xVar4.f1922c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            x xVar5 = this.K;
            printWriter.println(xVar5 == null ? 0 : xVar5.f1922c);
        }
        x xVar6 = this.K;
        if ((xVar6 == null ? 0 : xVar6.f1923d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            x xVar7 = this.K;
            printWriter.println(xVar7 == null ? 0 : xVar7.f1923d);
        }
        x xVar8 = this.K;
        if ((xVar8 == null ? 0 : xVar8.f1924e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            x xVar9 = this.K;
            printWriter.println(xVar9 != null ? xVar9.f1924e : 0);
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
        if (p() != null) {
            yb.i.E(this).B(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f1949w + ":");
        this.f1949w.v(d.h.s(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final x m() {
        if (this.K == null) {
            x xVar = new x();
            Object obj = Y;
            xVar.g = obj;
            xVar.f1926h = obj;
            xVar.f1927i = obj;
            xVar.j = 1.0f;
            xVar.f1928k = null;
            this.K = xVar;
        }
        return this.K;
    }

    public final i.g n() {
        d0 d0Var = this.f1948v;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f1765a;
    }

    public final u0 o() {
        if (this.f1948v != null) {
            return this.f1949w;
        }
        throw new IllegalStateException(a0.g.m("Fragment ", this, " has not been attached yet."));
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        U().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.F = true;
    }

    public final Context p() {
        d0 d0Var = this.f1948v;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f1766b;
    }

    public final LayoutInflater q() {
        LayoutInflater layoutInflater = this.M;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterK = K(null);
        this.M = layoutInflaterK;
        return layoutInflaterK;
    }

    public final int r() {
        androidx.lifecycle.s sVar = this.P;
        return (sVar == androidx.lifecycle.s.f1181b || this.f1950x == null) ? sVar.ordinal() : Math.min(sVar.ordinal(), this.f1950x.r());
    }

    public final u0 s() {
        u0 u0Var = this.f1947u;
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException(a0.g.m("Fragment ", this, " not associated with a fragment manager."));
    }

    public final void startActivityForResult(Intent intent, int i4) {
        if (this.f1948v == null) {
            throw new IllegalStateException(a0.g.m("Fragment ", this, " not attached to Activity"));
        }
        u0 u0VarS = s();
        if (u0VarS.D != null) {
            u0VarS.G.addLast(new p0(this.f1934f, i4));
            u0VarS.D.a(intent);
        } else {
            d0 d0Var = u0VarS.f1898x;
            d0Var.getClass();
            nk.k.e(intent, "intent");
            if (i4 != -1) {
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
            d0Var.f1766b.startActivity(intent, null);
        }
    }

    public final Resources t() {
        return W().getResources();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f1934f);
        if (this.f1951y != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f1951y));
        }
        if (this.A != null) {
            sb2.append(" tag=");
            sb2.append(this.A);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final String u(int i4) {
        return t().getString(i4);
    }

    public final d1 v() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            return d1Var;
        }
        throw new IllegalStateException(a0.g.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void w() {
        this.Q = new androidx.lifecycle.c0(this, true);
        this.U = new y4.a(new c6.a(this, new a6.e(0, this)));
        this.T = null;
        ArrayList arrayList = this.W;
        u uVar = this.X;
        if (arrayList.contains(uVar)) {
            return;
        }
        if (this.f1929a >= 0) {
            uVar.a();
        } else {
            arrayList.add(uVar);
        }
    }

    public final void x() {
        w();
        this.O = this.f1934f;
        this.f1934f = UUID.randomUUID().toString();
        this.f1938l = false;
        this.f1939m = false;
        this.f1941o = false;
        this.f1942p = false;
        this.f1944r = false;
        this.f1946t = 0;
        this.f1947u = null;
        this.f1949w = new u0();
        this.f1948v = null;
        this.f1951y = 0;
        this.f1952z = 0;
        this.A = null;
        this.B = false;
        this.C = false;
    }

    public final boolean y() {
        return this.f1948v != null && this.f1938l;
    }

    public final boolean z() {
        if (this.B) {
            return true;
        }
        u0 u0Var = this.f1947u;
        if (u0Var != null) {
            z zVar = this.f1950x;
            u0Var.getClass();
            if (zVar == null ? false : zVar.z()) {
                return true;
            }
        }
        return false;
    }

    public void O(Bundle bundle) {
    }

    public void R(View view, Bundle bundle) {
    }

    public void M(int i4, String[] strArr, int[] iArr) {
    }
}
