package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v0;
import br.l;
import i.j;
import io.sentry.t;
import ir.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import o4.e0;
import o4.j0;
import o4.k;
import o4.l0;
import o4.m0;
import o4.n0;
import o4.p0;
import o4.s0;
import o4.t0;
import o4.v;
import o4.w0;
import o4.y0;
import o4.z0;
import u3.i0;
import u3.x;
import w.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final t f1460a;

    /* renamed from: b, reason: collision with root package name */
    public final js.e f1461b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1462c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1463d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1464e = -1;

    public e(t tVar, js.e eVar, b bVar) {
        this.f1460a = tVar;
        this.f1461b = eVar;
        this.f1462c = bVar;
    }

    public final void a() {
        boolean zK = d.K(3);
        b bVar = this.f1462c;
        if (zK) {
            Objects.toString(bVar);
        }
        Bundle bundle = bVar.f1411d;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        bVar.S.Q();
        bVar.f1407a = 3;
        bVar.f1410c0 = false;
        bVar.z(bundle2);
        if (!bVar.f1410c0) {
            throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onActivityCreated()"));
        }
        if (d.K(3)) {
            bVar.toString();
        }
        if (bVar.f1413e0 != null) {
            Bundle bundle3 = bVar.f1411d;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = bVar.f1415g;
            if (sparseArray != null) {
                bVar.f1413e0.restoreHierarchyState(sparseArray);
                bVar.f1415g = null;
            }
            bVar.f1410c0 = false;
            bVar.T(bundle4);
            if (!bVar.f1410c0) {
                throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onViewStateRestored()"));
            }
            if (bVar.f1413e0 != null) {
                bVar.f1424o0.b(m.ON_CREATE);
            }
        }
        bVar.f1411d = null;
        j0 j0Var = bVar.S;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.f18820g = false;
        j0Var.u(4);
        this.f1460a.n(bVar, false);
    }

    public final void b() {
        b bVar;
        View view;
        View view2;
        b bVar2 = this.f1462c;
        View view3 = bVar2.f1412d0;
        while (true) {
            bVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(n4.b.fragment_container_view_tag);
            b bVar3 = tag instanceof b ? (b) tag : null;
            if (bVar3 != null) {
                bVar = bVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        b bVar4 = bVar2.T;
        if (bVar != null && !bVar.equals(bVar4)) {
            int i10 = bVar2.V;
            p4.c cVar = p4.d.f20249a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(bVar2);
            sb2.append(" within the view of parent fragment ");
            sb2.append(bVar);
            sb2.append(" via container with ID ");
            p4.d.b(new p4.a(bVar2, h0.b.i(i10, " without using parent's childFragmentManager", sb2)));
            p4.d.a(bVar2).getClass();
            p4.b bVar5 = p4.b.PENALTY_LOG;
        }
        ArrayList arrayList = (ArrayList) this.f1461b.f13797d;
        ViewGroup viewGroup = bVar2.f1412d0;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(bVar2);
            int i11 = iIndexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        b bVar6 = (b) arrayList.get(iIndexOf);
                        if (bVar6.f1412d0 == viewGroup && (view = bVar6.f1413e0) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    b bVar7 = (b) arrayList.get(i11);
                    if (bVar7.f1412d0 == viewGroup && (view2 = bVar7.f1413e0) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        bVar2.f1412d0.addView(bVar2.f1413e0, iIndexOfChild);
    }

    public final void c() {
        boolean zK = d.K(3);
        b bVar = this.f1462c;
        if (zK) {
            Objects.toString(bVar);
        }
        b bVar2 = bVar.D;
        e eVar = null;
        js.e eVar2 = this.f1461b;
        if (bVar2 != null) {
            e eVar3 = (e) ((HashMap) eVar2.f13798g).get(bVar2.f1433y);
            if (eVar3 == null) {
                throw new IllegalStateException("Fragment " + bVar + " declared target fragment " + bVar.D + " that does not belong to this FragmentManager!");
            }
            bVar.E = bVar.D.f1433y;
            bVar.D = null;
            eVar = eVar3;
        } else {
            String str = bVar.E;
            if (str != null && (eVar = (e) ((HashMap) eVar2.f13798g).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(bVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(g.j(sb2, bVar.E, " that does not belong to this FragmentManager!"));
            }
        }
        if (eVar != null) {
            eVar.k();
        }
        d dVar = bVar.Q;
        bVar.R = dVar.f1456w;
        bVar.T = dVar.f1458y;
        t tVar = this.f1460a;
        tVar.u(bVar, false);
        ArrayList arrayList = bVar.f1430t0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((v) it.next()).a();
        }
        arrayList.clear();
        bVar.S.b(bVar.R, bVar.i(), bVar);
        bVar.f1407a = 0;
        bVar.f1410c0 = false;
        bVar.C(bVar.R.f18878r);
        if (!bVar.f1410c0) {
            throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onAttach()"));
        }
        Iterator it2 = bVar.Q.f1449p.iterator();
        while (it2.hasNext()) {
            ((m0) it2.next()).a();
        }
        j0 j0Var = bVar.S;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.f18820g = false;
        j0Var.u(0);
        tVar.p(bVar, false);
    }

    public final int d() {
        b bVar = this.f1462c;
        if (bVar.Q == null) {
            return bVar.f1407a;
        }
        int iMin = this.f1464e;
        int i10 = n0.f18823a[bVar.f1422m0.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        if (bVar.K) {
            if (bVar.L) {
                iMin = Math.max(this.f1464e, 2);
                View view = bVar.f1413e0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1464e < 4 ? Math.min(iMin, bVar.f1407a) : Math.min(iMin, 1);
            }
        }
        if (bVar.M && bVar.f1412d0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!bVar.H) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = bVar.f1412d0;
        if (viewGroup != null) {
            k kVarI = k.i(viewGroup, bVar.p());
            s0 s0VarF = kVarI.f(bVar);
            t0 t0Var = s0VarF != null ? s0VarF.f18851b : null;
            s0 s0VarG = kVarI.g(bVar);
            t0Var = s0VarG != null ? s0VarG.f18851b : null;
            int i11 = t0Var == null ? -1 : y0.f18887a[t0Var.ordinal()];
            if (i11 != -1 && i11 != 1) {
                t0Var = t0Var;
            }
        }
        if (t0Var == t0.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (t0Var == t0.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (bVar.I) {
            iMin = bVar.y() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (bVar.f1414f0 && bVar.f1407a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (bVar.J) {
            iMin = Math.max(iMin, 3);
        }
        if (d.K(2)) {
            Objects.toString(bVar);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zK = d.K(3);
        b bVar = this.f1462c;
        if (zK) {
            Objects.toString(bVar);
        }
        Bundle bundle2 = bVar.f1411d;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (bVar.f1420k0) {
            bVar.f1407a = 1;
            Bundle bundle4 = bVar.f1411d;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            bVar.S.X(bundle);
            j0 j0Var = bVar.S;
            j0Var.H = false;
            j0Var.I = false;
            j0Var.O.f18820g = false;
            j0Var.u(1);
            return;
        }
        t tVar = this.f1460a;
        tVar.v(bVar, false);
        bVar.S.Q();
        bVar.f1407a = 1;
        bVar.f1410c0 = false;
        bVar.f1423n0.V0(new l7.b(3, bVar));
        bVar.D(bundle3);
        bVar.f1420k0 = true;
        if (!bVar.f1410c0) {
            throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onCreate()"));
        }
        bVar.f1423n0.v1(m.ON_CREATE);
        tVar.q(bVar, false);
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        b bVar = this.f1462c;
        if (bVar.K) {
            return;
        }
        if (d.K(3)) {
            Objects.toString(bVar);
        }
        Bundle bundle = bVar.f1411d;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterJ = bVar.J(bundle2);
        bVar.f1419j0 = layoutInflaterJ;
        ViewGroup viewGroup = bVar.f1412d0;
        if (viewGroup == null) {
            int i10 = bVar.V;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException(h0.b.n("Cannot create fragment ", bVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) bVar.Q.f1457x.B(i10);
                if (viewGroup == null) {
                    if (!bVar.N && !bVar.M) {
                        try {
                            resourceName = bVar.q().getResourceName(bVar.V);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(bVar.V) + " (" + resourceName + ") for fragment " + bVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    p4.c cVar = p4.d.f20249a;
                    p4.d.b(new p4.a(bVar, "Attempting to add fragment " + bVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    p4.d.a(bVar).getClass();
                    p4.b bVar2 = p4.b.PENALTY_LOG;
                }
            }
        }
        bVar.f1412d0 = viewGroup;
        bVar.U(layoutInflaterJ, viewGroup, bundle2);
        if (bVar.f1413e0 != null) {
            if (d.K(3)) {
                Objects.toString(bVar);
            }
            bVar.f1413e0.setSaveFromParentEnabled(false);
            bVar.f1413e0.setTag(n4.b.fragment_container_view_tag, bVar);
            if (viewGroup != null) {
                b();
            }
            if (bVar.X) {
                bVar.f1413e0.setVisibility(8);
            }
            if (bVar.f1413e0.isAttachedToWindow()) {
                View view = bVar.f1413e0;
                WeakHashMap weakHashMap = i0.f23177a;
                x.c(view);
            } else {
                View view2 = bVar.f1413e0;
                view2.addOnAttachStateChangeListener(new g1.e(7, view2));
            }
            Bundle bundle3 = bVar.f1411d;
            bVar.S(bVar.f1413e0, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            bVar.S.u(2);
            this.f1460a.A(bVar, bVar.f1413e0, false);
            int visibility = bVar.f1413e0.getVisibility();
            bVar.k().j = bVar.f1413e0.getAlpha();
            if (bVar.f1412d0 != null && visibility == 0) {
                View viewFindFocus = bVar.f1413e0.findFocus();
                if (viewFindFocus != null) {
                    bVar.k().k = viewFindFocus;
                    if (d.K(2)) {
                        viewFindFocus.toString();
                        Objects.toString(bVar);
                    }
                }
                bVar.f1413e0.setAlpha(0.0f);
            }
        }
        bVar.f1407a = 2;
    }

    public final void g() {
        b bVarD;
        boolean zK = d.K(3);
        b bVar = this.f1462c;
        if (zK) {
            Objects.toString(bVar);
        }
        boolean zIsChangingConfigurations = true;
        boolean z10 = bVar.I && !bVar.y();
        js.e eVar = this.f1461b;
        if (z10) {
            eVar.p0(bVar.f1433y, null);
        }
        if (!z10) {
            l0 l0Var = (l0) eVar.f13800x;
            if (!((l0Var.f18815b.containsKey(bVar.f1433y) && l0Var.f18818e) ? l0Var.f18819f : true)) {
                String str = bVar.E;
                if (str != null && (bVarD = eVar.D(str)) != null && bVarD.Z) {
                    bVar.D = bVarD;
                }
                bVar.f1407a = 0;
                return;
            }
        }
        o4.x xVar = bVar.R;
        if (xVar != null) {
            zIsChangingConfigurations = ((l0) eVar.f13800x).f18819f;
        } else {
            j jVar = xVar.f18878r;
            if (jVar != null) {
                zIsChangingConfigurations = true ^ jVar.isChangingConfigurations();
            }
        }
        if (z10 || zIsChangingConfigurations) {
            l0 l0Var2 = (l0) eVar.f13800x;
            l0Var2.getClass();
            if (d.K(3)) {
                Objects.toString(bVar);
            }
            l0Var2.c(bVar.f1433y, false);
        }
        bVar.S.l();
        bVar.f1423n0.v1(m.ON_DESTROY);
        bVar.f1407a = 0;
        bVar.f1410c0 = false;
        bVar.f1420k0 = false;
        bVar.G();
        if (!bVar.f1410c0) {
            throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onDestroy()"));
        }
        this.f1460a.r(bVar, false);
        Iterator it = eVar.W().iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (eVar2 != null) {
                b bVar2 = eVar2.f1462c;
                if (bVar.f1433y.equals(bVar2.E)) {
                    bVar2.D = bVar;
                    bVar2.E = null;
                }
            }
        }
        String str2 = bVar.E;
        if (str2 != null) {
            bVar.D = eVar.D(str2);
        }
        eVar.g0(this);
    }

    public final void h() {
        View view;
        boolean zK = d.K(3);
        b bVar = this.f1462c;
        if (zK) {
            Objects.toString(bVar);
        }
        ViewGroup viewGroup = bVar.f1412d0;
        if (viewGroup != null && (view = bVar.f1413e0) != null) {
            viewGroup.removeView(view);
        }
        bVar.S.u(1);
        if (bVar.f1413e0 != null) {
            p0 p0Var = bVar.f1424o0;
            p0Var.c();
            if (p0Var.f18842r.f1528x.isAtLeast(n.CREATED)) {
                bVar.f1424o0.b(m.ON_DESTROY);
            }
        }
        bVar.f1407a = 1;
        bVar.f1410c0 = false;
        bVar.H();
        if (!bVar.f1410c0) {
            throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onDestroyView()"));
        }
        v0 v0VarD = bVar.d();
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
            j0Var.e(0).getClass();
            throw new ClassCastException();
        }
        bVar.O = false;
        this.f1460a.B(bVar, false);
        bVar.f1412d0 = null;
        bVar.f1413e0 = null;
        bVar.f1424o0 = null;
        bVar.f1425p0.j(null);
        bVar.L = false;
    }

    public final void i() {
        boolean zK = d.K(3);
        b bVar = this.f1462c;
        if (zK) {
            Objects.toString(bVar);
        }
        bVar.f1407a = -1;
        bVar.f1410c0 = false;
        bVar.I();
        bVar.f1419j0 = null;
        if (!bVar.f1410c0) {
            throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onDetach()"));
        }
        j0 j0Var = bVar.S;
        if (!j0Var.J) {
            j0Var.l();
            bVar.S = new j0();
        }
        this.f1460a.s(bVar, false);
        bVar.f1407a = -1;
        bVar.R = null;
        bVar.T = null;
        bVar.Q = null;
        if (!bVar.I || bVar.y()) {
            l0 l0Var = (l0) this.f1461b.f13800x;
            if (!((l0Var.f18815b.containsKey(bVar.f1433y) && l0Var.f18818e) ? l0Var.f18819f : true)) {
                return;
            }
        }
        if (d.K(3)) {
            Objects.toString(bVar);
        }
        bVar.v();
    }

    public final void j() {
        b bVar = this.f1462c;
        if (bVar.K && bVar.L && !bVar.O) {
            if (d.K(3)) {
                Objects.toString(bVar);
            }
            Bundle bundle = bVar.f1411d;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterJ = bVar.J(bundle2);
            bVar.f1419j0 = layoutInflaterJ;
            bVar.U(layoutInflaterJ, null, bundle2);
            View view = bVar.f1413e0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                bVar.f1413e0.setTag(n4.b.fragment_container_view_tag, bVar);
                if (bVar.X) {
                    bVar.f1413e0.setVisibility(8);
                }
                Bundle bundle3 = bVar.f1411d;
                bVar.S(bVar.f1413e0, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                bVar.S.u(2);
                this.f1460a.A(bVar, bVar.f1413e0, false);
                bVar.f1407a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        js.e eVar = this.f1461b;
        boolean z10 = this.f1463d;
        b bVar = this.f1462c;
        if (z10) {
            if (d.K(2)) {
                Objects.toString(bVar);
                return;
            }
            return;
        }
        try {
            this.f1463d = true;
            boolean z11 = false;
            while (true) {
                int iD = d();
                int i10 = bVar.f1407a;
                if (iD == i10) {
                    if (!z11 && i10 == -1 && bVar.I && !bVar.y()) {
                        if (d.K(3)) {
                            Objects.toString(bVar);
                        }
                        l0 l0Var = (l0) eVar.f13800x;
                        l0Var.getClass();
                        if (d.K(3)) {
                            Objects.toString(bVar);
                        }
                        l0Var.c(bVar.f1433y, true);
                        eVar.g0(this);
                        if (d.K(3)) {
                            Objects.toString(bVar);
                        }
                        bVar.v();
                    }
                    if (bVar.f1418i0) {
                        if (bVar.f1413e0 != null && (viewGroup = bVar.f1412d0) != null) {
                            k kVarI = k.i(viewGroup, bVar.p());
                            if (bVar.X) {
                                if (d.K(2)) {
                                    Objects.toString(bVar);
                                }
                                kVarI.d(w0.GONE, t0.NONE, this);
                            } else {
                                if (d.K(2)) {
                                    Objects.toString(bVar);
                                }
                                kVarI.d(w0.VISIBLE, t0.NONE, this);
                            }
                        }
                        d dVar = bVar.Q;
                        if (dVar != null && bVar.H && d.L(bVar)) {
                            dVar.G = true;
                        }
                        bVar.f1418i0 = false;
                        bVar.S.o();
                    }
                    this.f1463d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            bVar.f1407a = 1;
                            break;
                        case 2:
                            bVar.L = false;
                            bVar.f1407a = 2;
                            break;
                        case 3:
                            if (d.K(3)) {
                                Objects.toString(bVar);
                            }
                            if (bVar.f1413e0 != null && bVar.f1415g == null) {
                                o();
                            }
                            if (bVar.f1413e0 != null && (viewGroup2 = bVar.f1412d0) != null) {
                                k kVarI2 = k.i(viewGroup2, bVar.p());
                                if (d.K(2)) {
                                    Objects.toString(bVar);
                                }
                                kVarI2.d(w0.REMOVED, t0.REMOVING, this);
                            }
                            bVar.f1407a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            bVar.f1407a = 5;
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            l();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
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
                            if (bVar.f1413e0 != null && (viewGroup3 = bVar.f1412d0) != null) {
                                k kVarI3 = k.i(viewGroup3, bVar.p());
                                w0 w0VarFrom = w0.from(bVar.f1413e0.getVisibility());
                                l.e(w0VarFrom, "finalState");
                                if (d.K(2)) {
                                    Objects.toString(bVar);
                                }
                                kVarI3.d(w0VarFrom, t0.ADDING, this);
                            }
                            bVar.f1407a = 4;
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            p();
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            bVar.f1407a = 6;
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            n();
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th2) {
            this.f1463d = false;
            throw th2;
        }
    }

    public final void l() {
        boolean zK = d.K(3);
        b bVar = this.f1462c;
        if (zK) {
            Objects.toString(bVar);
        }
        bVar.S.u(5);
        if (bVar.f1413e0 != null) {
            bVar.f1424o0.b(m.ON_PAUSE);
        }
        bVar.f1423n0.v1(m.ON_PAUSE);
        bVar.f1407a = 6;
        bVar.f1410c0 = false;
        bVar.N();
        if (!bVar.f1410c0) {
            throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onPause()"));
        }
        this.f1460a.t(bVar, false);
    }

    public final void m(ClassLoader classLoader) {
        b bVar = this.f1462c;
        Bundle bundle = bVar.f1411d;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (bVar.f1411d.getBundle("savedInstanceState") == null) {
            bVar.f1411d.putBundle("savedInstanceState", new Bundle());
        }
        try {
            bVar.f1415g = bVar.f1411d.getSparseParcelableArray("viewState");
            bVar.f1427r = bVar.f1411d.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) bVar.f1411d.getParcelable("state");
            if (fragmentState != null) {
                bVar.E = fragmentState.I;
                bVar.F = fragmentState.J;
                Boolean bool = bVar.f1432x;
                if (bool != null) {
                    bVar.f1416g0 = bool.booleanValue();
                    bVar.f1432x = null;
                } else {
                    bVar.f1416g0 = fragmentState.K;
                }
            }
            if (bVar.f1416g0) {
                return;
            }
            bVar.f1414f0 = true;
        } catch (BadParcelableException e4) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + bVar, e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.d.K(r0)
            androidx.fragment.app.b r1 = r6.f1462c
            if (r0 == 0) goto Lc
            java.util.Objects.toString(r1)
        Lc:
            o4.u r0 = r1.f1417h0
            r2 = 0
            if (r0 != 0) goto L13
            r0 = r2
            goto L15
        L13:
            android.view.View r0 = r0.k
        L15:
            if (r0 == 0) goto L45
            android.view.View r3 = r1.f1413e0
            if (r0 != r3) goto L1c
            goto L26
        L1c:
            android.view.ViewParent r3 = r0.getParent()
        L20:
            if (r3 == 0) goto L45
            android.view.View r4 = r1.f1413e0
            if (r3 != r4) goto L40
        L26:
            r0.requestFocus()
            r3 = 2
            boolean r3 = androidx.fragment.app.d.K(r3)
            if (r3 == 0) goto L45
            r0.toString()
            java.util.Objects.toString(r1)
            android.view.View r0 = r1.f1413e0
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
            goto L45
        L40:
            android.view.ViewParent r3 = r3.getParent()
            goto L20
        L45:
            o4.u r0 = r1.k()
            r0.k = r2
            o4.j0 r0 = r1.S
            r0.Q()
            o4.j0 r0 = r1.S
            r3 = 1
            r0.A(r3)
            r0 = 7
            r1.f1407a = r0
            r3 = 0
            r1.f1410c0 = r3
            r1.O()
            boolean r4 = r1.f1410c0
            if (r4 == 0) goto L95
            androidx.lifecycle.x r4 = r1.f1423n0
            androidx.lifecycle.m r5 = androidx.lifecycle.m.ON_RESUME
            r4.v1(r5)
            android.view.View r4 = r1.f1413e0
            if (r4 == 0) goto L75
            o4.p0 r4 = r1.f1424o0
            androidx.lifecycle.x r4 = r4.f18842r
            r4.v1(r5)
        L75:
            o4.j0 r4 = r1.S
            r4.H = r3
            r4.I = r3
            o4.l0 r5 = r4.O
            r5.f18820g = r3
            r4.u(r0)
            io.sentry.t r0 = r6.f1460a
            r0.w(r1, r3)
            js.e r0 = r6.f1461b
            java.lang.String r3 = r1.f1433y
            r0.p0(r3, r2)
            r1.f1411d = r2
            r1.f1415g = r2
            r1.f1427r = r2
            return
        L95:
            o4.z0 r0 = new o4.z0
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r1 = h0.b.n(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.n():void");
    }

    public final void o() {
        b bVar = this.f1462c;
        if (bVar.f1413e0 == null) {
            return;
        }
        if (d.K(2)) {
            Objects.toString(bVar);
            Objects.toString(bVar.f1413e0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        bVar.f1413e0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            bVar.f1415g = sparseArray;
        }
        Bundle bundle = new Bundle();
        bVar.f1424o0.f18843x.K(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        bVar.f1427r = bundle;
    }

    public final void p() {
        boolean zK = d.K(3);
        b bVar = this.f1462c;
        if (zK) {
            Objects.toString(bVar);
        }
        bVar.S.Q();
        bVar.S.A(true);
        bVar.f1407a = 5;
        bVar.f1410c0 = false;
        bVar.Q();
        if (!bVar.f1410c0) {
            throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.x xVar = bVar.f1423n0;
        m mVar = m.ON_START;
        xVar.v1(mVar);
        if (bVar.f1413e0 != null) {
            bVar.f1424o0.f18842r.v1(mVar);
        }
        j0 j0Var = bVar.S;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.f18820g = false;
        j0Var.u(5);
        this.f1460a.y(bVar, false);
    }

    public final void q() {
        boolean zK = d.K(3);
        b bVar = this.f1462c;
        if (zK) {
            Objects.toString(bVar);
        }
        j0 j0Var = bVar.S;
        j0Var.I = true;
        j0Var.O.f18820g = true;
        j0Var.u(4);
        if (bVar.f1413e0 != null) {
            bVar.f1424o0.b(m.ON_STOP);
        }
        bVar.f1423n0.v1(m.ON_STOP);
        bVar.f1407a = 4;
        bVar.f1410c0 = false;
        bVar.R();
        if (!bVar.f1410c0) {
            throw new z0(h0.b.n("Fragment ", bVar, " did not call through to super.onStop()"));
        }
        this.f1460a.z(bVar, false);
    }

    public e(t tVar, js.e eVar, ClassLoader classLoader, e0 e0Var, Bundle bundle) {
        this.f1460a = tVar;
        this.f1461b = eVar;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        b bVarA = e0Var.a(fragmentState.f1399a);
        bVarA.f1433y = fragmentState.f1400d;
        bVarA.K = fragmentState.f1401g;
        bVarA.M = fragmentState.f1402r;
        bVarA.N = true;
        bVarA.U = fragmentState.f1403x;
        bVarA.V = fragmentState.f1404y;
        bVarA.W = fragmentState.B;
        bVarA.Z = fragmentState.D;
        bVarA.I = fragmentState.E;
        bVarA.Y = fragmentState.F;
        bVarA.X = fragmentState.G;
        bVarA.f1422m0 = n.values()[fragmentState.H];
        bVarA.E = fragmentState.I;
        bVarA.F = fragmentState.J;
        bVarA.f1416g0 = fragmentState.K;
        this.f1462c = bVarA;
        bVarA.f1411d = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        bVarA.a0(bundle2);
        if (d.K(2)) {
            Objects.toString(bVarA);
        }
    }

    public e(t tVar, js.e eVar, b bVar, Bundle bundle) {
        this.f1460a = tVar;
        this.f1461b = eVar;
        this.f1462c = bVar;
        bVar.f1415g = null;
        bVar.f1427r = null;
        bVar.P = 0;
        bVar.L = false;
        bVar.H = false;
        b bVar2 = bVar.D;
        bVar.E = bVar2 != null ? bVar2.f1433y : null;
        bVar.D = null;
        bVar.f1411d = bundle;
        bVar.B = bundle.getBundle("arguments");
    }
}
