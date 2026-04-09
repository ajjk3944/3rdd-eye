package k0;

import a.AbstractC0241a;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.InterfaceC0287i;
import androidx.lifecycle.InterfaceC0298u;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import e.AbstractC2286c;
import e.InterfaceC2285b;
import h.AbstractActivityC2349g;
import h0.C2352b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC2617v implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0298u, b0, InterfaceC0287i, F0.g {

    /* renamed from: j0, reason: collision with root package name */
    public static final Object f21679j0 = new Object();

    /* renamed from: C, reason: collision with root package name */
    public boolean f21680C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f21681D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21682E;

    /* renamed from: F, reason: collision with root package name */
    public int f21683F;

    /* renamed from: G, reason: collision with root package name */
    public K f21684G;

    /* renamed from: H, reason: collision with root package name */
    public x f21685H;

    /* renamed from: J, reason: collision with root package name */
    public AbstractComponentCallbacksC2617v f21687J;

    /* renamed from: K, reason: collision with root package name */
    public int f21688K;

    /* renamed from: L, reason: collision with root package name */
    public int f21689L;
    public String M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f21690N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f21691O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f21692P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f21694R;

    /* renamed from: S, reason: collision with root package name */
    public ViewGroup f21695S;

    /* renamed from: T, reason: collision with root package name */
    public View f21696T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f21697U;

    /* renamed from: W, reason: collision with root package name */
    public C2614s f21699W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f21700X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f21701Y;

    /* renamed from: Z, reason: collision with root package name */
    public String f21702Z;

    /* renamed from: a0, reason: collision with root package name */
    public EnumC0292n f21704a0;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f21705b;
    public C0300w b0;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f21706c;

    /* renamed from: c0, reason: collision with root package name */
    public S f21707c0;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f21708d;

    /* renamed from: d0, reason: collision with root package name */
    public final androidx.lifecycle.D f21709d0;

    /* renamed from: e0, reason: collision with root package name */
    public androidx.lifecycle.U f21711e0;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f21712f;

    /* renamed from: f0, reason: collision with root package name */
    public A1.w f21713f0;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC2617v f21714g;

    /* renamed from: g0, reason: collision with root package name */
    public final AtomicInteger f21715g0;

    /* renamed from: h0, reason: collision with root package name */
    public final ArrayList f21717h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public final C2612p f21718i0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21720k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21721l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21722m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21723n;

    /* renamed from: a, reason: collision with root package name */
    public int f21703a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f21710e = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public String f21716h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f21719j = null;

    /* renamed from: I, reason: collision with root package name */
    public K f21686I = new K();

    /* renamed from: Q, reason: collision with root package name */
    public boolean f21693Q = true;

    /* renamed from: V, reason: collision with root package name */
    public boolean f21698V = true;

    public AbstractComponentCallbacksC2617v() {
        new C0.k(26, this);
        this.f21704a0 = EnumC0292n.f5247e;
        this.f21709d0 = new androidx.lifecycle.D();
        this.f21715g0 = new AtomicInteger();
        this.f21717h0 = new ArrayList();
        this.f21718i0 = new C2612p(this);
        t();
    }

    public void A(Context context) {
        this.f21694R = true;
        x xVar = this.f21685H;
        if ((xVar == null ? null : xVar.i) != null) {
            this.f21694R = true;
        }
    }

    public void B(Bundle bundle) {
        Bundle bundle2;
        this.f21694R = true;
        Bundle bundle3 = this.f21705b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f21686I.U(bundle2);
            K k6 = this.f21686I;
            k6.f21495F = false;
            k6.f21496G = false;
            k6.M.f21542g = false;
            k6.t(1);
        }
        K k7 = this.f21686I;
        if (k7.f21521t >= 1) {
            return;
        }
        k7.f21495F = false;
        k7.f21496G = false;
        k7.M.f21542g = false;
        k7.t(1);
    }

    public View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void D() {
        this.f21694R = true;
    }

    public void E() {
        this.f21694R = true;
    }

    public LayoutInflater F(Bundle bundle) {
        x xVar = this.f21685H;
        if (xVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC2349g abstractActivityC2349g = xVar.f21729m;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC2349g.getLayoutInflater().cloneInContext(abstractActivityC2349g);
        layoutInflaterCloneInContext.setFactory2(this.f21686I.f21508f);
        return layoutInflaterCloneInContext;
    }

    public void G(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f21694R = true;
        x xVar = this.f21685H;
        if ((xVar == null ? null : xVar.i) != null) {
            this.f21694R = true;
        }
    }

    public void H() {
        this.f21694R = true;
    }

    public void I() {
        this.f21694R = true;
    }

    public void K() {
        this.f21694R = true;
    }

    public void L() {
        this.f21694R = true;
    }

    public void N(Bundle bundle) {
        this.f21694R = true;
    }

    public void O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21686I.O();
        this.f21682E = true;
        this.f21707c0 = new S(this, d(), new A3.z(15, this));
        View viewC = C(layoutInflater, viewGroup);
        this.f21696T = viewC;
        if (viewC == null) {
            if (this.f21707c0.f21572d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f21707c0 = null;
            return;
        }
        this.f21707c0.b();
        if (K.H(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f21696T + " for Fragment " + this);
        }
        androidx.lifecycle.Q.i(this.f21696T, this.f21707c0);
        View view = this.f21696T;
        S s5 = this.f21707c0;
        q5.i.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, s5);
        AbstractC0241a.o(this.f21696T, this.f21707c0);
        this.f21709d0.j(this.f21707c0);
    }

    public final AbstractC2286c P(R2.a aVar, InterfaceC2285b interfaceC2285b) {
        C2352b c2352b = new C2352b(3, this);
        if (this.f21703a > 1) {
            throw new IllegalStateException(AbstractC1135f5.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        r rVar = new r(this, c2352b, atomicReference, aVar, interfaceC2285b);
        if (this.f21703a >= 0) {
            rVar.a();
        } else {
            this.f21717h0.add(rVar);
        }
        return new C2611o(atomicReference);
    }

    public final AbstractActivityC2349g Q() {
        AbstractActivityC2349g abstractActivityC2349gK = k();
        if (abstractActivityC2349gK != null) {
            return abstractActivityC2349gK;
        }
        throw new IllegalStateException(AbstractC1135f5.m("Fragment ", this, " not attached to an activity."));
    }

    public final Context R() {
        Context contextM = m();
        if (contextM != null) {
            return contextM;
        }
        throw new IllegalStateException(AbstractC1135f5.m("Fragment ", this, " not attached to a context."));
    }

    public final View S() {
        View view = this.f21696T;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC1135f5.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void T(int i, int i3, int i6, int i7) {
        if (this.f21699W == null && i == 0 && i3 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        g().f21669b = i;
        g().f21670c = i3;
        g().f21671d = i6;
        g().f21672e = i7;
    }

    public final void U(Bundle bundle) {
        K k6 = this.f21684G;
        if (k6 != null) {
            if (k6 == null ? false : k6.M()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f21712f = bundle;
    }

    public final boolean V(String str) {
        x xVar = this.f21685H;
        if (xVar != null) {
            return G.c.h(xVar.f21729m, str);
        }
        return false;
    }

    public final void W(Intent intent) {
        x xVar = this.f21685H;
        if (xVar == null) {
            throw new IllegalStateException(AbstractC1135f5.m("Fragment ", this, " not attached to Activity"));
        }
        xVar.f21726j.startActivity(intent, null);
    }

    public I5.b a() {
        return new C2613q(this);
    }

    @Override // androidx.lifecycle.InterfaceC0287i
    public final n0.d c() {
        Application application;
        Context applicationContext = R().getApplicationContext();
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
        if (application == null && K.H(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + R().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        n0.d dVar = new n0.d(0);
        LinkedHashMap linkedHashMap = dVar.f22143a;
        if (application != null) {
            linkedHashMap.put(Y.f5231e, application);
        }
        linkedHashMap.put(androidx.lifecycle.Q.f5209a, this);
        linkedHashMap.put(androidx.lifecycle.Q.f5210b, this);
        Bundle bundle = this.f21712f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.Q.f5211c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.b0
    public final a0 d() {
        if (this.f21684G == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (o() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f21684G.M.f21539d;
        a0 a0Var = (a0) map.get(this.f21710e);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0();
        map.put(this.f21710e, a0Var2);
        return a0Var2;
    }

    @Override // F0.g
    public final F0.f f() {
        return (F0.f) this.f21713f0.f139b;
    }

    public final C2614s g() {
        if (this.f21699W == null) {
            C2614s c2614s = new C2614s();
            Object obj = f21679j0;
            c2614s.f21674g = obj;
            c2614s.f21675h = obj;
            c2614s.i = obj;
            c2614s.f21676j = 1.0f;
            c2614s.f21677k = null;
            this.f21699W = c2614s;
        }
        return this.f21699W;
    }

    @Override // androidx.lifecycle.InterfaceC0298u
    public final C0300w j() {
        return this.b0;
    }

    public final AbstractActivityC2349g k() {
        x xVar = this.f21685H;
        if (xVar == null) {
            return null;
        }
        return xVar.i;
    }

    public final K l() {
        if (this.f21685H != null) {
            return this.f21686I;
        }
        throw new IllegalStateException(AbstractC1135f5.m("Fragment ", this, " has not been attached yet."));
    }

    public final Context m() {
        x xVar = this.f21685H;
        if (xVar == null) {
            return null;
        }
        return xVar.f21726j;
    }

    public final Z n() {
        Application application;
        if (this.f21684G == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f21711e0 == null) {
            Context applicationContext = R().getApplicationContext();
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
            if (application == null && K.H(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + R().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f21711e0 = new androidx.lifecycle.U(application, this, this.f21712f);
        }
        return this.f21711e0;
    }

    public final int o() {
        EnumC0292n enumC0292n = this.f21704a0;
        return (enumC0292n == EnumC0292n.f5244b || this.f21687J == null) ? enumC0292n.ordinal() : Math.min(enumC0292n.ordinal(), this.f21687J.o());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f21694R = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Q().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f21694R = true;
    }

    public final K p() {
        K k6 = this.f21684G;
        if (k6 != null) {
            return k6;
        }
        throw new IllegalStateException(AbstractC1135f5.m("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources q() {
        return R().getResources();
    }

    public final String r(int i) {
        return q().getString(i);
    }

    public final S s() {
        S s5 = this.f21707c0;
        if (s5 != null) {
            return s5;
        }
        throw new IllegalStateException(AbstractC1135f5.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void t() {
        this.b0 = new C0300w(this);
        this.f21713f0 = new A1.w(this);
        this.f21711e0 = null;
        ArrayList arrayList = this.f21717h0;
        C2612p c2612p = this.f21718i0;
        if (arrayList.contains(c2612p)) {
            return;
        }
        if (this.f21703a >= 0) {
            c2612p.a();
        } else {
            arrayList.add(c2612p);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f21710e);
        if (this.f21688K != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f21688K));
        }
        if (this.M != null) {
            sb.append(" tag=");
            sb.append(this.M);
        }
        sb.append(")");
        return sb.toString();
    }

    public final void u() {
        t();
        this.f21702Z = this.f21710e;
        this.f21710e = UUID.randomUUID().toString();
        this.f21720k = false;
        this.f21721l = false;
        this.f21723n = false;
        this.f21680C = false;
        this.f21681D = false;
        this.f21683F = 0;
        this.f21684G = null;
        this.f21686I = new K();
        this.f21685H = null;
        this.f21688K = 0;
        this.f21689L = 0;
        this.M = null;
        this.f21690N = false;
        this.f21691O = false;
    }

    public final boolean v() {
        return this.f21685H != null && this.f21720k;
    }

    public final boolean w() {
        if (this.f21690N) {
            return true;
        }
        K k6 = this.f21684G;
        if (k6 != null) {
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21687J;
            k6.getClass();
            if (abstractComponentCallbacksC2617v == null ? false : abstractComponentCallbacksC2617v.w()) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        return this.f21683F > 0;
    }

    public void y() {
        this.f21694R = true;
    }

    public void z(int i, int i3, Intent intent) {
        if (K.H(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void J(Bundle bundle) {
    }

    public void M(View view) {
    }
}
