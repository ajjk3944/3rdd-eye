package androidx.fragment.app;

import am.f;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.d0;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.o0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import br.l;
import com.google.android.gms.internal.measurement.i4;
import i.g0;
import i.j;
import ir.f0;
import j4.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o4.j0;
import o4.p0;
import o4.q;
import o4.r;
import o4.s;
import o4.t;
import o4.u;
import o4.x;
import w.g;

/* loaded from: classes.dex */
public abstract class b implements ComponentCallbacks, View.OnCreateContextMenuListener, v, w0, h, l7.e {

    /* renamed from: v0, reason: collision with root package name */
    public static final Object f1406v0 = new Object();
    public Bundle B;
    public b D;
    public int F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public d Q;
    public x R;
    public b T;
    public int U;
    public int V;
    public String W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1408a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1410c0;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1411d;

    /* renamed from: d0, reason: collision with root package name */
    public ViewGroup f1412d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f1413e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1414f0;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f1415g;

    /* renamed from: h0, reason: collision with root package name */
    public u f1417h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1418i0;

    /* renamed from: j0, reason: collision with root package name */
    public LayoutInflater f1419j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1420k0;

    /* renamed from: l0, reason: collision with root package name */
    public String f1421l0;

    /* renamed from: m0, reason: collision with root package name */
    public n f1422m0;

    /* renamed from: n0, reason: collision with root package name */
    public androidx.lifecycle.x f1423n0;

    /* renamed from: o0, reason: collision with root package name */
    public p0 f1424o0;

    /* renamed from: p0, reason: collision with root package name */
    public final d0 f1425p0;

    /* renamed from: q0, reason: collision with root package name */
    public i4.b f1426q0;

    /* renamed from: r, reason: collision with root package name */
    public Bundle f1427r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1428r0;

    /* renamed from: s0, reason: collision with root package name */
    public final AtomicInteger f1429s0;

    /* renamed from: t0, reason: collision with root package name */
    public final ArrayList f1430t0;

    /* renamed from: u0, reason: collision with root package name */
    public final r f1431u0;

    /* renamed from: x, reason: collision with root package name */
    public Boolean f1432x;

    /* renamed from: a, reason: collision with root package name */
    public int f1407a = -1;

    /* renamed from: y, reason: collision with root package name */
    public String f1433y = UUID.randomUUID().toString();
    public String E = null;
    public Boolean G = null;
    public j0 S = new j0();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1409b0 = true;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1416g0 = true;

    public b() {
        new b4.e(25, this);
        this.f1422m0 = n.RESUMED;
        this.f1425p0 = new d0();
        this.f1429s0 = new AtomicInteger();
        this.f1430t0 = new ArrayList();
        this.f1431u0 = new r(this);
        u();
    }

    public void A(int i10, int i11, Intent intent) {
        if (d.K(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void B(Activity activity) {
        this.f1410c0 = true;
    }

    public void C(Context context) {
        this.f1410c0 = true;
        x xVar = this.R;
        j jVar = xVar == null ? null : xVar.f18877g;
        if (jVar != null) {
            this.f1410c0 = false;
            B(jVar);
        }
    }

    public void D(Bundle bundle) {
        Bundle bundle2;
        this.f1410c0 = true;
        Bundle bundle3 = this.f1411d;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.S.X(bundle2);
            j0 j0Var = this.S;
            j0Var.H = false;
            j0Var.I = false;
            j0Var.O.f18820g = false;
            j0Var.u(1);
        }
        j0 j0Var2 = this.S;
        if (j0Var2.f1455v >= 1) {
            return;
        }
        j0Var2.H = false;
        j0Var2.I = false;
        j0Var2.O.f18820g = false;
        j0Var2.u(1);
    }

    public void E(Menu menu, MenuInflater menuInflater) {
    }

    public View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f1428r0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void G() {
        this.f1410c0 = true;
    }

    public void H() {
        this.f1410c0 = true;
    }

    public void I() {
        this.f1410c0 = true;
    }

    public LayoutInflater J(Bundle bundle) {
        x xVar = this.R;
        if (xVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        j jVar = xVar.B;
        LayoutInflater layoutInflaterCloneInContext = jVar.getLayoutInflater().cloneInContext(jVar);
        layoutInflaterCloneInContext.setFactory2(this.S.f1441f);
        return layoutInflaterCloneInContext;
    }

    public void K(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f1410c0 = true;
    }

    public final void L(AttributeSet attributeSet, Bundle bundle) {
        this.f1410c0 = true;
        x xVar = this.R;
        j jVar = xVar == null ? null : xVar.f18877g;
        if (jVar != null) {
            this.f1410c0 = false;
            K(jVar, attributeSet, bundle);
        }
    }

    public boolean M(MenuItem menuItem) {
        return false;
    }

    public void N() {
        this.f1410c0 = true;
    }

    public void O() {
        this.f1410c0 = true;
    }

    public void P(Bundle bundle) {
    }

    public void Q() {
        this.f1410c0 = true;
    }

    public void R() {
        this.f1410c0 = true;
    }

    public void S(View view, Bundle bundle) {
    }

    public void T(Bundle bundle) {
        this.f1410c0 = true;
    }

    public void U(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.S.Q();
        this.O = true;
        this.f1424o0 = new p0(this, d(), new o(10, this));
        View viewF = F(layoutInflater, viewGroup, bundle);
        this.f1413e0 = viewF;
        if (viewF == null) {
            if (this.f1424o0.f18842r != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1424o0 = null;
            return;
        }
        this.f1424o0.c();
        if (d.K(3)) {
            Objects.toString(this.f1413e0);
            toString();
        }
        o0.f(this.f1413e0, this.f1424o0);
        View view = this.f1413e0;
        p0 p0Var = this.f1424o0;
        l.e(view, "<this>");
        view.setTag(v4.d.view_tree_view_model_store_owner, p0Var);
        i4.C(this.f1413e0, this.f1424o0);
        this.f1425p0.j(this.f1424o0);
    }

    public final q V(g.b bVar, f.a aVar) {
        f fVar = (f) this;
        g0 g0Var = new g0(fVar);
        if (this.f1407a > 1) {
            throw new IllegalStateException(h0.b.n("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        t tVar = new t(fVar, g0Var, atomicReference, bVar, aVar);
        if (this.f1407a >= 0) {
            tVar.a();
        } else {
            this.f1430t0.add(tVar);
        }
        return new q(atomicReference);
    }

    public final j W() {
        j jVarL = l();
        if (jVarL != null) {
            return jVarL;
        }
        throw new IllegalStateException(h0.b.n("Fragment ", this, " not attached to an activity."));
    }

    public final Context X() {
        Context contextN = n();
        if (contextN != null) {
            return contextN;
        }
        throw new IllegalStateException(h0.b.n("Fragment ", this, " not attached to a context."));
    }

    public final View Y() {
        View view = this.f1413e0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(h0.b.n("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void Z(int i10, int i11, int i12, int i13) {
        if (this.f1417h0 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        k().f18866b = i10;
        k().f18867c = i11;
        k().f18868d = i12;
        k().f18869e = i13;
    }

    @Override // androidx.lifecycle.h
    public final v4.c a() {
        Application application;
        Context applicationContext = X().getApplicationContext();
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
        if (application == null && d.K(3)) {
            Objects.toString(X().getApplicationContext());
        }
        v4.c cVar = new v4.c();
        LinkedHashMap linkedHashMap = cVar.f23843a;
        if (application != null) {
            linkedHashMap.put(o0.f1508r, application);
        }
        linkedHashMap.put(o0.f1505a, this);
        linkedHashMap.put(o0.f1506d, this);
        Bundle bundle = this.B;
        if (bundle != null) {
            linkedHashMap.put(o0.f1507g, bundle);
        }
        return cVar;
    }

    public void a0(Bundle bundle) {
        d dVar = this.Q;
        if (dVar != null && (dVar.H || dVar.I)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.B = bundle;
    }

    public final void b0() {
        if (!this.f1408a0) {
            this.f1408a0 = true;
            if (!w() || x()) {
                return;
            }
            this.R.B.invalidateOptionsMenu();
        }
    }

    public final void c0(boolean z10) {
        if (this.f1409b0 != z10) {
            this.f1409b0 = z10;
            if (this.f1408a0 && w() && !x()) {
                this.R.B.invalidateOptionsMenu();
            }
        }
    }

    @Override // androidx.lifecycle.w0
    public final v0 d() {
        if (this.Q == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (o() == n.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.Q.O.f18817d;
        v0 v0Var = (v0) map.get(this.f1433y);
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0();
        map.put(this.f1433y, v0Var2);
        return v0Var2;
    }

    public final void d0(b bVar) {
        if (bVar != null) {
            p4.c cVar = p4.d.f20249a;
            p4.d.b(new p4.e(this, "Attempting to set target fragment " + bVar + " with request code 100 for fragment " + this));
            p4.d.a(this).getClass();
            p4.b bVar2 = p4.b.PENALTY_LOG;
        }
        d dVar = this.Q;
        d dVar2 = bVar != null ? bVar.Q : null;
        if (dVar != null && dVar2 != null && dVar != dVar2) {
            throw new IllegalArgumentException(h0.b.n("Fragment ", bVar, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (b bVarS = bVar; bVarS != null; bVarS = bVarS.s(false)) {
            if (super.equals(this)) {
                throw new IllegalArgumentException("Setting " + bVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (bVar == null) {
            this.E = null;
            this.D = null;
        } else if (this.Q == null || bVar.Q == null) {
            this.E = null;
            this.D = bVar;
        } else {
            this.E = bVar.f1433y;
            this.D = null;
        }
        this.F = 100;
    }

    public Activity e() {
        return l();
    }

    public final void e0(boolean z10) {
        p4.c cVar = p4.d.f20249a;
        p4.d.b(new p4.a(this, "Attempting to set user visible hint to " + z10 + " for fragment " + this));
        p4.d.a(this).getClass();
        p4.b bVar = p4.b.PENALTY_LOG;
        if (!this.f1416g0 && z10 && this.f1407a < 5 && this.Q != null && w() && this.f1420k0) {
            d dVar = this.Q;
            dVar.R(dVar.g(this));
        }
        this.f1416g0 = z10;
        this.f1414f0 = this.f1407a < 5 && !z10;
        if (this.f1411d != null) {
            this.f1432x = Boolean.valueOf(z10);
        }
    }

    @Override // l7.e
    public final io.sentry.t f() {
        return (io.sentry.t) this.f1426q0.f11197d;
    }

    public final void f0(Intent intent) {
        x xVar = this.R;
        if (xVar == null) {
            throw new IllegalStateException(h0.b.n("Fragment ", this, " not attached to Activity"));
        }
        xVar.f18878r.startActivity(intent, null);
    }

    public final void g(int i10, Intent intent) {
        if (this.R == null) {
            throw new IllegalStateException(h0.b.n("Fragment ", this, " not attached to Activity"));
        }
        d dVarP = p();
        if (dVarP.C != null) {
            String str = this.f1433y;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
            fragmentManager$LaunchedFragmentInfo.f1391a = str;
            fragmentManager$LaunchedFragmentInfo.f1392d = i10;
            dVarP.F.addLast(fragmentManager$LaunchedFragmentInfo);
            dVarP.C.a(intent);
            return;
        }
        x xVar = dVarP.f1456w;
        xVar.getClass();
        l.e(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        xVar.f18878r.startActivity(intent, null);
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.o h() {
        return this.f1423n0;
    }

    public ic.a i() {
        return new s(this);
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.U));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.V));
        printWriter.print(" mTag=");
        printWriter.println(this.W);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1407a);
        printWriter.print(" mWho=");
        printWriter.print(this.f1433y);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.P);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.H);
        printWriter.print(" mRemoving=");
        printWriter.print(this.I);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.K);
        printWriter.print(" mInLayout=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.X);
        printWriter.print(" mDetached=");
        printWriter.print(this.Y);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1409b0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1408a0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.Z);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1416g0);
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.Q);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.R);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.T);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.B);
        }
        if (this.f1411d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1411d);
        }
        if (this.f1415g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1415g);
        }
        if (this.f1427r != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1427r);
        }
        b bVarS = s(false);
        if (bVarS != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(bVarS);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.F);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        u uVar = this.f1417h0;
        printWriter.println(uVar == null ? false : uVar.f18865a);
        u uVar2 = this.f1417h0;
        if ((uVar2 == null ? 0 : uVar2.f18866b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            u uVar3 = this.f1417h0;
            printWriter.println(uVar3 == null ? 0 : uVar3.f18866b);
        }
        u uVar4 = this.f1417h0;
        if ((uVar4 == null ? 0 : uVar4.f18867c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            u uVar5 = this.f1417h0;
            printWriter.println(uVar5 == null ? 0 : uVar5.f18867c);
        }
        u uVar6 = this.f1417h0;
        if ((uVar6 == null ? 0 : uVar6.f18868d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            u uVar7 = this.f1417h0;
            printWriter.println(uVar7 == null ? 0 : uVar7.f18868d);
        }
        u uVar8 = this.f1417h0;
        if ((uVar8 == null ? 0 : uVar8.f18869e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            u uVar9 = this.f1417h0;
            printWriter.println(uVar9 == null ? 0 : uVar9.f18869e);
        }
        if (this.f1412d0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1412d0);
        }
        if (this.f1413e0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1413e0);
        }
        if (n() != null) {
            v0 v0VarD = d();
            l.e(v0VarD, "store");
            v4.a aVar = v4.a.f23842b;
            l.e(aVar, "defaultCreationExtras");
            js.e eVar = new js.e(v0VarD, x4.a.f25017c, aVar);
            ir.d dVarH = f0.H(x4.a.class);
            String strN = dVarH.n();
            if (strN == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            u.j0 j0Var = ((x4.a) eVar.d0(dVarH, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strN))).f25018b;
            if (j0Var.f23085g > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (j0Var.f23085g > 0) {
                    if (j0Var.e(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(j0Var.f23083a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.S + ":");
        this.S.w(g.f(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final u k() {
        if (this.f1417h0 == null) {
            u uVar = new u();
            Object obj = f1406v0;
            uVar.f18871g = obj;
            uVar.f18872h = obj;
            uVar.f18873i = obj;
            uVar.j = 1.0f;
            uVar.k = null;
            this.f1417h0 = uVar;
        }
        return this.f1417h0;
    }

    public final j l() {
        x xVar = this.R;
        if (xVar == null) {
            return null;
        }
        return xVar.f18877g;
    }

    public final d m() {
        if (this.R != null) {
            return this.S;
        }
        throw new IllegalStateException(h0.b.n("Fragment ", this, " has not been attached yet."));
    }

    public Context n() {
        x xVar = this.R;
        if (xVar == null) {
            return null;
        }
        return xVar.f18878r;
    }

    public final int o() {
        n nVar = this.f1422m0;
        return (nVar == n.INITIALIZED || this.T == null) ? nVar.ordinal() : Math.min(nVar.ordinal(), this.T.o());
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f1410c0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        W().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f1410c0 = true;
    }

    public final d p() {
        d dVar = this.Q;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException(h0.b.n("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources q() {
        return X().getResources();
    }

    public final String r(int i10) {
        return q().getString(i10);
    }

    public final b s(boolean z10) {
        String str;
        if (z10) {
            p4.c cVar = p4.d.f20249a;
            p4.d.b(new p4.e(this, "Attempting to get target fragment from fragment " + this));
            p4.d.a(this).getClass();
            p4.b bVar = p4.b.PENALTY_LOG;
        }
        b bVar2 = this.D;
        if (bVar2 != null) {
            return bVar2;
        }
        d dVar = this.Q;
        if (dVar == null || (str = this.E) == null) {
            return null;
        }
        return dVar.f1438c.D(str);
    }

    public final p0 t() {
        p0 p0Var = this.f1424o0;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException(h0.b.n("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f1433y);
        if (this.U != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.U));
        }
        if (this.W != null) {
            sb2.append(" tag=");
            sb2.append(this.W);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final void u() {
        this.f1423n0 = new androidx.lifecycle.x(this);
        this.f1426q0 = new i4.b(new n7.b(this, new androidx.lifecycle.p0(10, this)));
        ArrayList arrayList = this.f1430t0;
        r rVar = this.f1431u0;
        if (arrayList.contains(rVar)) {
            return;
        }
        if (this.f1407a >= 0) {
            rVar.a();
        } else {
            arrayList.add(rVar);
        }
    }

    public final void v() {
        u();
        this.f1421l0 = this.f1433y;
        this.f1433y = UUID.randomUUID().toString();
        this.H = false;
        this.I = false;
        this.K = false;
        this.L = false;
        this.N = false;
        this.P = 0;
        this.Q = null;
        this.S = new j0();
        this.R = null;
        this.U = 0;
        this.V = 0;
        this.W = null;
        this.X = false;
        this.Y = false;
    }

    public final boolean w() {
        return this.R != null && this.H;
    }

    public final boolean x() {
        if (this.X) {
            return true;
        }
        d dVar = this.Q;
        if (dVar != null) {
            b bVar = this.T;
            dVar.getClass();
            if (bVar == null ? false : bVar.x()) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        return this.P > 0;
    }

    public void z(Bundle bundle) {
        this.f1410c0 = true;
    }
}
