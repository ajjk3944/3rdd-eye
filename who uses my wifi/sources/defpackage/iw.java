package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class iw implements ComponentCallbacks, View.OnCreateContextMenuListener, b60, r61, k00, at0 {
    public static final Object Y = new Object();
    public int A;
    public int B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public ViewGroup I;
    public View J;
    public boolean K;
    public hw M;
    public boolean N;
    public LayoutInflater O;
    public boolean P;
    public String Q;
    public d60 S;
    public jx T;
    public gw3 V;
    public final ArrayList W;
    public final fw X;
    public Bundle g;
    public SparseArray h;
    public Bundle i;
    public Bundle k;
    public iw l;
    public int n;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public xw w;
    public kw x;
    public iw z;
    public int f = -1;
    public String j = UUID.randomUUID().toString();
    public String m = null;
    public Boolean o = null;
    public xw y = new xw();
    public final boolean G = true;
    public boolean L = true;
    public u50 R = u50.j;
    public final nf0 U = new nf0();

    public iw() {
        new AtomicInteger();
        this.W = new ArrayList();
        this.X = new fw(this);
        n();
    }

    public void A() {
        this.H = true;
    }

    public void B() {
        this.H = true;
    }

    public void D(Bundle bundle) {
        this.H = true;
    }

    public void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.y.L();
        this.u = true;
        this.T = new jx(this, d());
        View viewV = v(layoutInflater, viewGroup);
        this.J = viewV;
        if (viewV == null) {
            if (this.T.h != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.T = null;
            return;
        }
        this.T.f();
        View view = this.J;
        jx jxVar = this.T;
        i30.m(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, jxVar);
        View view2 = this.J;
        jx jxVar2 = this.T;
        i30.m(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, jxVar2);
        View view3 = this.J;
        jx jxVar3 = this.T;
        i30.m(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, jxVar3);
        this.U.d(this.T);
    }

    public final i5 F() {
        i5 i5VarG = g();
        if (i5VarG != null) {
            return i5VarG;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context G() {
        Context contextI = i();
        if (contextI != null) {
            return contextI;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View H() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void I(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.y.R(parcelable);
        xw xwVar = this.y;
        xwVar.E = false;
        xwVar.F = false;
        xwVar.L.g = false;
        xwVar.t(1);
    }

    public final void J(int i, int i2, int i3, int i4) {
        if (this.M == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().b = i;
        f().c = i2;
        f().d = i3;
        f().e = i4;
    }

    public final void K(Bundle bundle) {
        xw xwVar = this.w;
        if (xwVar != null && (xwVar.E || xwVar.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.k = bundle;
    }

    public final void L(bm0 bm0Var) {
        if (bm0Var != null) {
            fx fxVar = gx.a;
            gx.b(new yy(this, "Attempting to set target fragment " + bm0Var + " with request code 0 for fragment " + this));
            gx.a(this).getClass();
        }
        xw xwVar = this.w;
        xw xwVar2 = bm0Var != null ? bm0Var.w : null;
        if (xwVar != null && xwVar2 != null && xwVar != xwVar2) {
            throw new IllegalArgumentException("Fragment " + bm0Var + " must share the same FragmentManager to be set as a target fragment");
        }
        for (iw iwVarM = bm0Var; iwVarM != null; iwVarM = iwVarM.m(false)) {
            if (super.equals(this)) {
                throw new IllegalArgumentException("Setting " + bm0Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (bm0Var == null) {
            this.m = null;
            this.l = null;
        } else if (this.w == null || bm0Var.w == null) {
            this.m = null;
            this.l = bm0Var;
        } else {
            this.m = bm0Var.j;
            this.l = null;
        }
        this.n = 0;
    }

    public final void M(Intent intent) {
        kw kwVar = this.x;
        if (kwVar != null) {
            kwVar.x.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // defpackage.at0
    public final vq2 a() {
        return (vq2) this.V.h;
    }

    public i30 b() {
        return new gw(this);
    }

    @Override // defpackage.k00
    public final mf0 c() {
        Application application;
        Context applicationContext = G().getApplicationContext();
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
        if (application == null && xw.F(3)) {
            Objects.toString(G().getApplicationContext());
        }
        mf0 mf0Var = new mf0(0);
        LinkedHashMap linkedHashMap = mf0Var.a;
        if (application != null) {
            linkedHashMap.put(o61.l, application);
        }
        linkedHashMap.put(g82.g, this);
        linkedHashMap.put(g82.h, this);
        Bundle bundle = this.k;
        if (bundle != null) {
            linkedHashMap.put(g82.i, bundle);
        }
        return mf0Var;
    }

    @Override // defpackage.r61
    public final q61 d() {
        if (this.w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (j() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.w.L.d;
        q61 q61Var = (q61) map.get(this.j);
        if (q61Var != null) {
            return q61Var;
        }
        q61 q61Var2 = new q61();
        map.put(this.j, q61Var2);
        return q61Var2;
    }

    @Override // defpackage.b60
    public final d60 e() {
        return this.S;
    }

    public final hw f() {
        if (this.M == null) {
            hw hwVar = new hw();
            Object obj = Y;
            hwVar.g = obj;
            hwVar.h = obj;
            hwVar.i = obj;
            hwVar.j = 1.0f;
            hwVar.k = null;
            this.M = hwVar;
        }
        return this.M;
    }

    public final i5 g() {
        kw kwVar = this.x;
        if (kwVar == null) {
            return null;
        }
        return kwVar.w;
    }

    public final xw h() {
        if (this.x != null) {
            return this.y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context i() {
        kw kwVar = this.x;
        if (kwVar == null) {
            return null;
        }
        return kwVar.x;
    }

    public final int j() {
        u50 u50Var = this.R;
        return (u50Var == u50.g || this.z == null) ? u50Var.ordinal() : Math.min(u50Var.ordinal(), this.z.j());
    }

    public final xw k() {
        xw xwVar = this.w;
        if (xwVar != null) {
            return xwVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Resources l() {
        return G().getResources();
    }

    public final iw m(boolean z) {
        String str;
        if (z) {
            fx fxVar = gx.a;
            gx.b(new yy(this, "Attempting to get target fragment from fragment " + this));
            gx.a(this).getClass();
        }
        iw iwVar = this.l;
        if (iwVar != null) {
            return iwVar;
        }
        xw xwVar = this.w;
        if (xwVar == null || (str = this.m) == null) {
            return null;
        }
        return xwVar.c.i(str);
    }

    public final void n() {
        this.S = new d60(this);
        this.V = new gw3(new zs0(this, new ga0(2, this)));
        ArrayList arrayList = this.W;
        fw fwVar = this.X;
        if (arrayList.contains(fwVar)) {
            return;
        }
        if (this.f < 0) {
            arrayList.add(fwVar);
            return;
        }
        iw iwVar = fwVar.a;
        iwVar.V.x();
        g82.g(iwVar);
    }

    public final void o() {
        n();
        this.Q = this.j;
        this.j = UUID.randomUUID().toString();
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.v = 0;
        this.w = null;
        this.y = new xw();
        this.x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        F().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H = true;
    }

    public final boolean p() {
        if (this.D) {
            return true;
        }
        xw xwVar = this.w;
        if (xwVar != null) {
            iw iwVar = this.z;
            xwVar.getClass();
            if (iwVar == null ? false : iwVar.p()) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        return this.v > 0;
    }

    public void r() {
        this.H = true;
    }

    public void s(int i, int i2, Intent intent) {
        if (xw.F(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void t(Context context) {
        this.H = true;
        kw kwVar = this.x;
        if ((kwVar == null ? null : kwVar.w) != null) {
            this.H = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.j);
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" tag=");
            sb.append(this.C);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Bundle bundle) {
        this.H = true;
        I(bundle);
        xw xwVar = this.y;
        if (xwVar.s >= 1) {
            return;
        }
        xwVar.E = false;
        xwVar.F = false;
        xwVar.L.g = false;
        xwVar.t(1);
    }

    public View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void w() {
        this.H = true;
    }

    public void x() {
        this.H = true;
    }

    public LayoutInflater y(Bundle bundle) {
        kw kwVar = this.x;
        if (kwVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        i5 i5Var = kwVar.A;
        LayoutInflater layoutInflaterCloneInContext = i5Var.getLayoutInflater().cloneInContext(i5Var);
        layoutInflaterCloneInContext.setFactory2(this.y.f);
        return layoutInflaterCloneInContext;
    }

    public abstract void z(Bundle bundle);

    public void C(View view, Bundle bundle) {
    }
}
