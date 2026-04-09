package b5;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final yb.i f1745a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.x0 f1746b;

    /* renamed from: c, reason: collision with root package name */
    public final z f1747c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1748d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1749e = -1;

    public b1(yb.i iVar, a0.x0 x0Var, z zVar) {
        this.f1745a = iVar;
        this.f1746b = x0Var;
        this.f1747c = zVar;
    }

    public final void a() {
        boolean zK = u0.K(3);
        z zVar = this.f1747c;
        if (zK) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + zVar);
        }
        Bundle bundle = zVar.f1930b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        zVar.f1949w.R();
        zVar.f1929a = 3;
        zVar.F = false;
        zVar.C();
        if (!zVar.F) {
            throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onActivityCreated()"));
        }
        if (u0.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + zVar);
        }
        if (zVar.H != null) {
            Bundle bundle2 = zVar.f1930b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = zVar.f1931c;
            if (sparseArray != null) {
                zVar.H.restoreHierarchyState(sparseArray);
                zVar.f1931c = null;
            }
            zVar.F = false;
            zVar.S(bundle3);
            if (!zVar.F) {
                throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onViewStateRestored()"));
            }
            if (zVar.H != null) {
                zVar.R.a(androidx.lifecycle.r.ON_CREATE);
            }
        }
        zVar.f1930b = null;
        u0 u0Var = zVar.f1949w;
        u0Var.I = false;
        u0Var.J = false;
        u0Var.P.g = false;
        u0Var.u(4);
        this.f1745a.n(zVar, false);
    }

    public final void b() {
        z zVar;
        View view;
        View view2;
        z zVar2 = this.f1747c;
        View view3 = zVar2.G;
        while (true) {
            zVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            z zVar3 = tag instanceof z ? (z) tag : null;
            if (zVar3 != null) {
                zVar = zVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        z zVar4 = zVar2.f1950x;
        if (zVar != null && !zVar.equals(zVar4)) {
            int i4 = zVar2.f1952z;
            c5.b bVar = c5.c.f2759a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(zVar2);
            sb2.append(" within the view of parent fragment ");
            sb2.append(zVar);
            sb2.append(" via container with ID ");
            c5.c.b(new c5.a(zVar2, r5.c.j(i4, " without using parent's childFragmentManager", sb2)));
            c5.c.a(zVar2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.f1746b.f148e;
        ViewGroup viewGroup = zVar2.G;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(zVar2);
            int i10 = iIndexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        z zVar5 = (z) arrayList.get(iIndexOf);
                        if (zVar5.G == viewGroup && (view = zVar5.H) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    z zVar6 = (z) arrayList.get(i10);
                    if (zVar6.G == viewGroup && (view2 = zVar6.H) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        zVar2.G.addView(zVar2.H, iIndexOfChild);
    }

    public final void c() {
        boolean zK = u0.K(3);
        z zVar = this.f1747c;
        if (zK) {
            Log.d("FragmentManager", "moveto ATTACHED: " + zVar);
        }
        z zVar2 = zVar.f1935h;
        b1 b1Var = null;
        a0.x0 x0Var = this.f1746b;
        if (zVar2 != null) {
            b1 b1Var2 = (b1) ((HashMap) x0Var.f145b).get(zVar2.f1934f);
            if (b1Var2 == null) {
                throw new IllegalStateException("Fragment " + zVar + " declared target fragment " + zVar.f1935h + " that does not belong to this FragmentManager!");
            }
            zVar.f1936i = zVar.f1935h.f1934f;
            zVar.f1935h = null;
            b1Var = b1Var2;
        } else {
            String str = zVar.f1936i;
            if (str != null && (b1Var = (b1) ((HashMap) x0Var.f145b).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(zVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(d.h.w(sb2, zVar.f1936i, " that does not belong to this FragmentManager!"));
            }
        }
        if (b1Var != null) {
            b1Var.k();
        }
        u0 u0Var = zVar.f1947u;
        zVar.f1948v = u0Var.f1898x;
        zVar.f1950x = u0Var.f1900z;
        yb.i iVar = this.f1745a;
        iVar.t(zVar, false);
        ArrayList arrayList = zVar.W;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((y) obj).a();
        }
        arrayList.clear();
        zVar.f1949w.b(zVar.f1948v, zVar.k(), zVar);
        zVar.f1929a = 0;
        zVar.F = false;
        zVar.E(zVar.f1948v.f1766b);
        if (!zVar.F) {
            throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onAttach()"));
        }
        Iterator it = zVar.f1947u.f1891q.iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b();
        }
        u0 u0Var2 = zVar.f1949w;
        u0Var2.I = false;
        u0Var2.J = false;
        u0Var2.P.g = false;
        u0Var2.u(0);
        iVar.o(zVar, false);
    }

    public final int d() {
        z zVar = this.f1747c;
        if (zVar.f1947u == null) {
            return zVar.f1929a;
        }
        int iMin = this.f1749e;
        int iOrdinal = zVar.P.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (zVar.f1941o) {
            if (zVar.f1942p) {
                iMin = Math.max(this.f1749e, 2);
                View view = zVar.H;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1749e < 4 ? Math.min(iMin, zVar.f1929a) : Math.min(iMin, 1);
            }
        }
        if (zVar.f1943q && zVar.G == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!zVar.f1938l) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = zVar.G;
        if (viewGroup != null) {
            n nVarI = n.i(viewGroup, zVar.s());
            g1 g1VarF = nVarI.f(zVar);
            int i4 = g1VarF != null ? g1VarF.f1800b : 0;
            g1 g1VarG = nVarI.g(zVar);
            i = g1VarG != null ? g1VarG.f1800b : 0;
            int i10 = i4 == 0 ? -1 : h1.f1814a[i3.e.c(i4)];
            if (i10 != -1 && i10 != 1) {
                i = i4;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (zVar.f1939m) {
            iMin = zVar.A() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (zVar.I && zVar.f1929a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (zVar.f1940n) {
            iMin = Math.max(iMin, 3);
        }
        if (u0.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + zVar);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zK = u0.K(3);
        z zVar = this.f1747c;
        if (zK) {
            Log.d("FragmentManager", "moveto CREATED: " + zVar);
        }
        Bundle bundle2 = zVar.f1930b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (zVar.N) {
            zVar.f1929a = 1;
            Bundle bundle4 = zVar.f1930b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            zVar.f1949w.X(bundle);
            u0 u0Var = zVar.f1949w;
            u0Var.I = false;
            u0Var.J = false;
            u0Var.P.g = false;
            u0Var.u(1);
            return;
        }
        yb.i iVar = this.f1745a;
        iVar.u(zVar, false);
        zVar.f1949w.R();
        zVar.f1929a = 1;
        zVar.F = false;
        zVar.Q.a(new a6.b(zVar, 1));
        zVar.F(bundle3);
        zVar.N = true;
        if (!zVar.F) {
            throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onCreate()"));
        }
        zVar.Q.e(androidx.lifecycle.r.ON_CREATE);
        iVar.p(zVar, false);
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        z zVar = this.f1747c;
        if (zVar.f1941o) {
            return;
        }
        if (u0.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + zVar);
        }
        Bundle bundle = zVar.f1930b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterK = zVar.K(bundle2);
        zVar.M = layoutInflaterK;
        ViewGroup viewGroup = zVar.G;
        if (viewGroup == null) {
            int i4 = zVar.f1952z;
            if (i4 == 0) {
                viewGroup = null;
            } else {
                if (i4 == -1) {
                    throw new IllegalArgumentException(a0.g.m("Cannot create fragment ", zVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) zVar.f1947u.f1899y.I(i4);
                if (viewGroup == null) {
                    if (!zVar.f1944r && !zVar.f1943q) {
                        try {
                            resourceName = zVar.t().getResourceName(zVar.f1952z);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = AppLovinMediationProvider.UNKNOWN;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(zVar.f1952z) + " (" + resourceName + ") for fragment " + zVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    c5.b bVar = c5.c.f2759a;
                    c5.c.b(new c5.d(zVar, viewGroup, 1));
                    c5.c.a(zVar).getClass();
                }
            }
        }
        zVar.G = viewGroup;
        zVar.T(layoutInflaterK, viewGroup, bundle2);
        if (zVar.H != null) {
            if (u0.K(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + zVar);
            }
            int i10 = 0;
            zVar.H.setSaveFromParentEnabled(false);
            zVar.H.setTag(R.id.fragment_container_view_tag, zVar);
            if (viewGroup != null) {
                b();
            }
            if (zVar.B) {
                zVar.H.setVisibility(8);
            }
            if (zVar.H.isAttachedToWindow()) {
                View view = zVar.H;
                WeakHashMap weakHashMap = e4.v0.f22405a;
                e4.k0.c(view);
            } else {
                View view2 = zVar.H;
                view2.addOnAttachStateChangeListener(new a1(i10, view2));
            }
            Bundle bundle3 = zVar.f1930b;
            zVar.R(zVar.H, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            zVar.f1949w.u(2);
            this.f1745a.z(zVar, zVar.H, false);
            int visibility = zVar.H.getVisibility();
            zVar.m().j = zVar.H.getAlpha();
            if (zVar.G != null && visibility == 0) {
                View viewFindFocus = zVar.H.findFocus();
                if (viewFindFocus != null) {
                    zVar.m().f1928k = viewFindFocus;
                    if (u0.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + zVar);
                    }
                }
                zVar.H.setAlpha(0.0f);
            }
        }
        zVar.f1929a = 2;
    }

    public final void g() {
        z zVarV;
        boolean zK = u0.K(3);
        z zVar = this.f1747c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATED: " + zVar);
        }
        boolean zIsChangingConfigurations = true;
        int i4 = 0;
        boolean z3 = zVar.f1939m && !zVar.A();
        a0.x0 x0Var = this.f1746b;
        if (z3) {
            x0Var.K(null, zVar.f1934f);
        }
        if (!z3) {
            w0 w0Var = (w0) x0Var.f147d;
            if (!((w0Var.f1915b.containsKey(zVar.f1934f) && w0Var.f1918e) ? w0Var.f1919f : true)) {
                String str = zVar.f1936i;
                if (str != null && (zVarV = x0Var.v(str)) != null && zVarV.D) {
                    zVar.f1935h = zVarV;
                }
                zVar.f1929a = 0;
                return;
            }
        }
        d0 d0Var = zVar.f1948v;
        if (d0Var != null) {
            zIsChangingConfigurations = ((w0) x0Var.f147d).f1919f;
        } else {
            i.g gVar = d0Var.f1766b;
            if (a0.g.C(gVar)) {
                zIsChangingConfigurations = true ^ gVar.isChangingConfigurations();
            }
        }
        if (z3 || zIsChangingConfigurations) {
            ((w0) x0Var.f147d).e(zVar, false);
        }
        zVar.f1949w.l();
        zVar.Q.e(androidx.lifecycle.r.ON_DESTROY);
        zVar.f1929a = 0;
        zVar.F = false;
        zVar.N = false;
        zVar.H();
        if (!zVar.F) {
            throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onDestroy()"));
        }
        this.f1745a.q(zVar, false);
        ArrayList arrayListZ = x0Var.z();
        int size = arrayListZ.size();
        while (i4 < size) {
            Object obj = arrayListZ.get(i4);
            i4++;
            b1 b1Var = (b1) obj;
            if (b1Var != null) {
                z zVar2 = b1Var.f1747c;
                if (zVar.f1934f.equals(zVar2.f1936i)) {
                    zVar2.f1935h = zVar;
                    zVar2.f1936i = null;
                }
            }
        }
        String str2 = zVar.f1936i;
        if (str2 != null) {
            zVar.f1935h = x0Var.v(str2);
        }
        x0Var.F(this);
    }

    public final void h() {
        View view;
        boolean zK = u0.K(3);
        z zVar = this.f1747c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + zVar);
        }
        ViewGroup viewGroup = zVar.G;
        if (viewGroup != null && (view = zVar.H) != null) {
            viewGroup.removeView(view);
        }
        zVar.f1949w.u(1);
        if (zVar.H != null) {
            d1 d1Var = zVar.R;
            d1Var.d();
            if (d1Var.f1774e.f1110d.compareTo(androidx.lifecycle.s.f1182c) >= 0) {
                zVar.R.a(androidx.lifecycle.r.ON_DESTROY);
            }
        }
        zVar.f1929a = 1;
        zVar.F = false;
        zVar.I();
        if (!zVar.F) {
            throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onDestroyView()"));
        }
        x.o0 o0Var = ((j5.a) yb.i.E(zVar).f37517c).f27397b;
        if (o0Var.f36927c > 0) {
            o0Var.f(0).getClass();
            throw new ClassCastException();
        }
        zVar.f1945s = false;
        this.f1745a.A(zVar, false);
        zVar.G = null;
        zVar.H = null;
        zVar.R = null;
        zVar.S.j(null);
        zVar.f1942p = false;
    }

    public final void i() {
        boolean zK = u0.K(3);
        z zVar = this.f1747c;
        if (zK) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + zVar);
        }
        zVar.f1929a = -1;
        zVar.F = false;
        zVar.J();
        zVar.M = null;
        if (!zVar.F) {
            throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onDetach()"));
        }
        u0 u0Var = zVar.f1949w;
        if (!u0Var.K) {
            u0Var.l();
            zVar.f1949w = new u0();
        }
        this.f1745a.r(zVar, false);
        zVar.f1929a = -1;
        zVar.f1948v = null;
        zVar.f1950x = null;
        zVar.f1947u = null;
        if (!zVar.f1939m || zVar.A()) {
            w0 w0Var = (w0) this.f1746b.f147d;
            if (!((w0Var.f1915b.containsKey(zVar.f1934f) && w0Var.f1918e) ? w0Var.f1919f : true)) {
                return;
            }
        }
        if (u0.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + zVar);
        }
        zVar.x();
    }

    public final void j() {
        z zVar = this.f1747c;
        if (zVar.f1941o && zVar.f1942p && !zVar.f1945s) {
            if (u0.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + zVar);
            }
            Bundle bundle = zVar.f1930b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterK = zVar.K(bundle2);
            zVar.M = layoutInflaterK;
            zVar.T(layoutInflaterK, null, bundle2);
            View view = zVar.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                zVar.H.setTag(R.id.fragment_container_view_tag, zVar);
                if (zVar.B) {
                    zVar.H.setVisibility(8);
                }
                Bundle bundle3 = zVar.f1930b;
                zVar.R(zVar.H, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                zVar.f1949w.u(2);
                this.f1745a.z(zVar, zVar.H, false);
                zVar.f1929a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        a0.x0 x0Var = this.f1746b;
        boolean z3 = this.f1748d;
        z zVar = this.f1747c;
        if (z3) {
            if (u0.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + zVar);
                return;
            }
            return;
        }
        try {
            this.f1748d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                int i4 = zVar.f1929a;
                int i10 = 3;
                if (iD == i4) {
                    if (!z10 && i4 == -1 && zVar.f1939m && !zVar.A()) {
                        if (u0.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + zVar);
                        }
                        ((w0) x0Var.f147d).e(zVar, true);
                        x0Var.F(this);
                        if (u0.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + zVar);
                        }
                        zVar.x();
                    }
                    if (zVar.L) {
                        if (zVar.H != null && (viewGroup = zVar.G) != null) {
                            n nVarI = n.i(viewGroup, zVar.s());
                            if (zVar.B) {
                                if (u0.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + zVar);
                                }
                                nVarI.d(3, 1, this);
                            } else {
                                if (u0.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + zVar);
                                }
                                nVarI.d(2, 1, this);
                            }
                        }
                        u0 u0Var = zVar.f1947u;
                        if (u0Var != null && zVar.f1938l && u0.L(zVar)) {
                            u0Var.H = true;
                        }
                        zVar.L = false;
                        zVar.f1949w.o();
                    }
                    this.f1748d = false;
                    return;
                }
                if (iD <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            zVar.f1929a = 1;
                            break;
                        case 2:
                            zVar.f1942p = false;
                            zVar.f1929a = 2;
                            break;
                        case 3:
                            if (u0.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + zVar);
                            }
                            if (zVar.H != null && zVar.f1931c == null) {
                                o();
                            }
                            if (zVar.H != null && (viewGroup2 = zVar.G) != null) {
                                n nVarI2 = n.i(viewGroup2, zVar.s());
                                if (u0.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + zVar);
                                }
                                nVarI2.d(1, 3, this);
                            }
                            zVar.f1929a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            zVar.f1929a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (zVar.H != null && (viewGroup3 = zVar.G) != null) {
                                n nVarI3 = n.i(viewGroup3, zVar.s());
                                int visibility = zVar.H.getVisibility();
                                if (visibility == 0) {
                                    i10 = 2;
                                } else if (visibility == 4) {
                                    i10 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                je.u.y(i10, "finalState");
                                if (u0.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + zVar);
                                }
                                nVarI3.d(i10, 2, this);
                            }
                            zVar.f1929a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            zVar.f1929a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f1748d = false;
            throw th2;
        }
    }

    public final void l() {
        boolean zK = u0.K(3);
        z zVar = this.f1747c;
        if (zK) {
            Log.d("FragmentManager", "movefrom RESUMED: " + zVar);
        }
        zVar.f1949w.u(5);
        if (zVar.H != null) {
            zVar.R.a(androidx.lifecycle.r.ON_PAUSE);
        }
        zVar.Q.e(androidx.lifecycle.r.ON_PAUSE);
        zVar.f1929a = 6;
        zVar.F = false;
        zVar.L();
        if (!zVar.F) {
            throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onPause()"));
        }
        this.f1745a.s(zVar, false);
    }

    public final void m(ClassLoader classLoader) {
        z zVar = this.f1747c;
        Bundle bundle = zVar.f1930b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (zVar.f1930b.getBundle("savedInstanceState") == null) {
            zVar.f1930b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            zVar.f1931c = zVar.f1930b.getSparseParcelableArray("viewState");
            zVar.f1932d = zVar.f1930b.getBundle("viewRegistryState");
            z0 z0Var = (z0) zVar.f1930b.getParcelable("state");
            if (z0Var != null) {
                zVar.f1936i = z0Var.f1963m;
                zVar.j = z0Var.f1964n;
                Boolean bool = zVar.f1933e;
                if (bool != null) {
                    zVar.J = bool.booleanValue();
                    zVar.f1933e = null;
                } else {
                    zVar.J = z0Var.f1965o;
                }
            }
            if (zVar.J) {
                return;
            }
            zVar.I = true;
        } catch (BadParcelableException e2) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + zVar, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = b5.u0.K(r0)
            java.lang.String r1 = "FragmentManager"
            b5.z r2 = r7.f1747c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            b5.x r0 = r2.K
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f1928k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.H
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.H
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = b5.u0.K(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.H
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            b5.x r0 = r2.m()
            r0.f1928k = r3
            b5.u0 r0 = r2.f1949w
            r0.R()
            b5.u0 r0 = r2.f1949w
            r1 = 1
            r0.z(r1)
            r0 = 7
            r2.f1929a = r0
            r1 = 0
            r2.F = r1
            r2.N()
            boolean r4 = r2.F
            if (r4 == 0) goto Lcd
            androidx.lifecycle.c0 r4 = r2.Q
            androidx.lifecycle.r r5 = androidx.lifecycle.r.ON_RESUME
            r4.e(r5)
            android.view.View r4 = r2.H
            if (r4 == 0) goto Lad
            b5.d1 r4 = r2.R
            androidx.lifecycle.c0 r4 = r4.f1774e
            r4.e(r5)
        Lad:
            b5.u0 r4 = r2.f1949w
            r4.I = r1
            r4.J = r1
            b5.w0 r5 = r4.P
            r5.g = r1
            r4.u(r0)
            yb.i r0 = r7.f1745a
            r0.v(r2, r1)
            a0.x0 r0 = r7.f1746b
            java.lang.String r1 = r2.f1934f
            r0.K(r3, r1)
            r2.f1930b = r3
            r2.f1931c = r3
            r2.f1932d = r3
            return
        Lcd:
            b5.i1 r0 = new b5.i1
            java.lang.String r1 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r1 = a0.g.m(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.b1.n():void");
    }

    public final void o() {
        z zVar = this.f1747c;
        if (zVar.H == null) {
            return;
        }
        if (u0.K(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + zVar + " with view " + zVar.H);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        zVar.H.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            zVar.f1931c = sparseArray;
        }
        Bundle bundle = new Bundle();
        zVar.R.f1775f.r(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        zVar.f1932d = bundle;
    }

    public final void p() {
        boolean zK = u0.K(3);
        z zVar = this.f1747c;
        if (zK) {
            Log.d("FragmentManager", "moveto STARTED: " + zVar);
        }
        zVar.f1949w.R();
        zVar.f1949w.z(true);
        zVar.f1929a = 5;
        zVar.F = false;
        zVar.P();
        if (!zVar.F) {
            throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.c0 c0Var = zVar.Q;
        androidx.lifecycle.r rVar = androidx.lifecycle.r.ON_START;
        c0Var.e(rVar);
        if (zVar.H != null) {
            zVar.R.f1774e.e(rVar);
        }
        u0 u0Var = zVar.f1949w;
        u0Var.I = false;
        u0Var.J = false;
        u0Var.P.g = false;
        u0Var.u(5);
        this.f1745a.x(zVar, false);
    }

    public final void q() {
        boolean zK = u0.K(3);
        z zVar = this.f1747c;
        if (zK) {
            Log.d("FragmentManager", "movefrom STARTED: " + zVar);
        }
        u0 u0Var = zVar.f1949w;
        u0Var.J = true;
        u0Var.P.g = true;
        u0Var.u(4);
        if (zVar.H != null) {
            zVar.R.a(androidx.lifecycle.r.ON_STOP);
        }
        zVar.Q.e(androidx.lifecycle.r.ON_STOP);
        zVar.f1929a = 4;
        zVar.F = false;
        zVar.Q();
        if (!zVar.F) {
            throw new i1(a0.g.m("Fragment ", zVar, " did not call through to super.onStop()"));
        }
        this.f1745a.y(zVar, false);
    }

    public b1(yb.i iVar, a0.x0 x0Var, ClassLoader classLoader, k0 k0Var, Bundle bundle) {
        this.f1745a = iVar;
        this.f1746b = x0Var;
        z0 z0Var = (z0) bundle.getParcelable("state");
        z zVarA = k0Var.a(z0Var.f1953a);
        zVarA.f1934f = z0Var.f1954b;
        zVarA.f1941o = z0Var.f1955c;
        zVarA.f1943q = z0Var.f1956d;
        zVarA.f1944r = true;
        zVarA.f1951y = z0Var.f1957e;
        zVarA.f1952z = z0Var.f1958f;
        zVarA.A = z0Var.g;
        zVarA.D = z0Var.f1959h;
        zVarA.f1939m = z0Var.f1960i;
        zVarA.C = z0Var.j;
        zVarA.B = z0Var.f1961k;
        zVarA.P = androidx.lifecycle.s.values()[z0Var.f1962l];
        zVarA.f1936i = z0Var.f1963m;
        zVarA.j = z0Var.f1964n;
        zVarA.J = z0Var.f1965o;
        this.f1747c = zVarA;
        zVarA.f1930b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        zVarA.Z(bundle2);
        if (u0.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + zVarA);
        }
    }

    public b1(yb.i iVar, a0.x0 x0Var, z zVar, Bundle bundle) {
        this.f1745a = iVar;
        this.f1746b = x0Var;
        this.f1747c = zVar;
        zVar.f1931c = null;
        zVar.f1932d = null;
        zVar.f1946t = 0;
        zVar.f1942p = false;
        zVar.f1938l = false;
        z zVar2 = zVar.f1935h;
        zVar.f1936i = zVar2 != null ? zVar2.f1934f : null;
        zVar.f1935h = null;
        zVar.f1930b = bundle;
        zVar.g = bundle.getBundle("arguments");
    }
}
