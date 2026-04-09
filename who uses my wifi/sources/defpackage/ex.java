package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ex {
    public final l92 a;
    public final p21 b;
    public final iw c;
    public boolean d = false;
    public int e = -1;

    public ex(l92 l92Var, p21 p21Var, iw iwVar) {
        this.a = l92Var;
        this.b = p21Var;
        this.c = iwVar;
    }

    public final void a() {
        boolean zF = xw.F(3);
        iw iwVar = this.c;
        if (zF) {
            Objects.toString(iwVar);
        }
        Bundle bundle = iwVar.g;
        iwVar.y.L();
        iwVar.f = 3;
        iwVar.H = false;
        iwVar.r();
        if (!iwVar.H) {
            throw new bz0("Fragment " + iwVar + " did not call through to super.onActivityCreated()");
        }
        if (xw.F(3)) {
            iwVar.toString();
        }
        View view = iwVar.J;
        if (view != null) {
            Bundle bundle2 = iwVar.g;
            SparseArray<Parcelable> sparseArray = iwVar.h;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                iwVar.h = null;
            }
            if (iwVar.J != null) {
                jx jxVar = iwVar.T;
                Bundle bundle3 = iwVar.i;
                zs0 zs0Var = (zs0) jxVar.i.g;
                at0 at0Var = zs0Var.a;
                if (!zs0Var.e) {
                    zs0Var.a();
                }
                if (at0Var.e().c.compareTo(u50.i) >= 0) {
                    throw new IllegalStateException(("performRestore cannot be called when owner is " + at0Var.e().c).toString());
                }
                if (zs0Var.g) {
                    throw new IllegalStateException("SavedStateRegistry was already restored.");
                }
                zs0Var.f = (bundle3 == null || !bundle3.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) ? null : m54.n(bundle3, "androidx.lifecycle.BundlableSavedStateRegistry.key");
                zs0Var.g = true;
                iwVar.i = null;
            }
            iwVar.H = false;
            iwVar.D(bundle2);
            if (!iwVar.H) {
                throw new bz0("Fragment " + iwVar + " did not call through to super.onViewStateRestored()");
            }
            if (iwVar.J != null) {
                iwVar.T.b(t50.ON_CREATE);
            }
        }
        iwVar.g = null;
        xw xwVar = iwVar.y;
        xwVar.E = false;
        xwVar.F = false;
        xwVar.L.g = false;
        xwVar.t(4);
        this.a.g(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.b.f;
        iw iwVar = this.c;
        ViewGroup viewGroup = iwVar.I;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(iwVar);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        iw iwVar2 = (iw) arrayList.get(iIndexOf);
                        if (iwVar2.I == viewGroup && (view = iwVar2.J) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    iw iwVar3 = (iw) arrayList.get(i);
                    if (iwVar3.I == viewGroup && (view2 = iwVar3.J) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        iwVar.I.addView(iwVar.J, iIndexOfChild);
    }

    public final void c() {
        boolean zF = xw.F(3);
        iw iwVar = this.c;
        if (zF) {
            Objects.toString(iwVar);
        }
        iw iwVar2 = iwVar.l;
        ex exVar = null;
        p21 p21Var = this.b;
        if (iwVar2 != null) {
            ex exVar2 = (ex) ((HashMap) p21Var.g).get(iwVar2.j);
            if (exVar2 == null) {
                throw new IllegalStateException("Fragment " + iwVar + " declared target fragment " + iwVar.l + " that does not belong to this FragmentManager!");
            }
            iwVar.m = iwVar.l.j;
            iwVar.l = null;
            exVar = exVar2;
        } else {
            String str = iwVar.m;
            if (str != null && (exVar = (ex) ((HashMap) p21Var.g).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(iwVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(ex0.k(sb, iwVar.m, " that does not belong to this FragmentManager!"));
            }
        }
        if (exVar != null) {
            exVar.k();
        }
        xw xwVar = iwVar.w;
        iwVar.x = xwVar.t;
        iwVar.z = xwVar.v;
        l92 l92Var = this.a;
        l92Var.n(false);
        ArrayList arrayList = iwVar.W;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iw iwVar3 = ((fw) obj).a;
            iwVar3.V.x();
            g82.g(iwVar3);
        }
        arrayList.clear();
        iwVar.y.b(iwVar.x, iwVar.b(), iwVar);
        iwVar.f = 0;
        iwVar.H = false;
        iwVar.t(iwVar.x.x);
        if (!iwVar.H) {
            throw new bz0("Fragment " + iwVar + " did not call through to super.onAttach()");
        }
        Iterator it = iwVar.w.m.iterator();
        while (it.hasNext()) {
            ((bx) it.next()).b();
        }
        xw xwVar2 = iwVar.y;
        xwVar2.E = false;
        xwVar2.F = false;
        xwVar2.L.g = false;
        xwVar2.t(0);
        l92Var.h(false);
    }

    public final int d() {
        lx0 lx0Var;
        iw iwVar = this.c;
        if (iwVar.w == null) {
            return iwVar.f;
        }
        int iMin = this.e;
        int iOrdinal = iwVar.R.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (iwVar.r) {
            if (iwVar.s) {
                iMin = Math.max(this.e, 2);
                View view = iwVar.J;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, iwVar.f) : Math.min(iMin, 1);
            }
        }
        if (!iwVar.p) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = iwVar.I;
        if (viewGroup != null) {
            tn tnVarF = tn.f(viewGroup, iwVar.k().E());
            lx0 lx0VarD = tnVarF.d(iwVar);
            int i2 = lx0VarD != null ? lx0VarD.b : 0;
            ArrayList arrayList = tnVarF.c;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    lx0Var = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                lx0Var = (lx0) obj;
                if (lx0Var.c.equals(iwVar) && !lx0Var.f) {
                    break;
                }
            }
            i = (lx0Var == null || !(i2 == 0 || i2 == 1)) ? i2 : lx0Var.b;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (iwVar.q) {
            iMin = iwVar.q() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (iwVar.K && iwVar.f < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (xw.F(2)) {
            Objects.toString(iwVar);
        }
        return iMin;
    }

    public final void e() {
        boolean zF = xw.F(3);
        iw iwVar = this.c;
        if (zF) {
            Objects.toString(iwVar);
        }
        if (iwVar.P) {
            iwVar.I(iwVar.g);
            iwVar.f = 1;
            return;
        }
        l92 l92Var = this.a;
        l92Var.o(false);
        Bundle bundle = iwVar.g;
        iwVar.y.L();
        iwVar.f = 1;
        iwVar.H = false;
        iwVar.S.a(new un0(3, iwVar));
        zs0 zs0Var = (zs0) iwVar.V.g;
        at0 at0Var = zs0Var.a;
        if (!zs0Var.e) {
            zs0Var.a();
        }
        if (at0Var.e().c.compareTo(u50.i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + at0Var.e().c).toString());
        }
        if (zs0Var.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleN = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleN = m54.n(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        zs0Var.f = bundleN;
        zs0Var.g = true;
        iwVar.u(bundle);
        iwVar.P = true;
        if (iwVar.H) {
            iwVar.S.d(t50.ON_CREATE);
            l92Var.i(false);
        } else {
            throw new bz0("Fragment " + iwVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        iw iwVar = this.c;
        if (iwVar.r) {
            return;
        }
        if (xw.F(3)) {
            Objects.toString(iwVar);
        }
        LayoutInflater layoutInflaterY = iwVar.y(iwVar.g);
        iwVar.O = layoutInflaterY;
        ViewGroup viewGroup = iwVar.I;
        if (viewGroup == null) {
            int i = iwVar.B;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + iwVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) iwVar.w.u.K(i);
                if (viewGroup == null) {
                    if (!iwVar.t) {
                        try {
                            resourceName = iwVar.l().getResourceName(iwVar.B);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(iwVar.B) + " (" + resourceName + ") for fragment " + iwVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    fx fxVar = gx.a;
                    gx.b(new hx(iwVar, viewGroup, 1));
                    gx.a(iwVar).getClass();
                }
            }
        }
        iwVar.I = viewGroup;
        iwVar.E(layoutInflaterY, viewGroup, iwVar.g);
        View view = iwVar.J;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            iwVar.J.setTag(R.id.fragment_container_view_tag, iwVar);
            if (viewGroup != null) {
                b();
            }
            if (iwVar.D) {
                iwVar.J.setVisibility(8);
            }
            View view2 = iwVar.J;
            WeakHashMap weakHashMap = e61.a;
            if (view2.isAttachedToWindow()) {
                r51.c(iwVar.J);
            } else {
                View view3 = iwVar.J;
                view3.addOnAttachStateChangeListener(new ud(2, view3));
            }
            iwVar.C(iwVar.J, iwVar.g);
            iwVar.y.t(2);
            this.a.t(false);
            int visibility = iwVar.J.getVisibility();
            iwVar.f().j = iwVar.J.getAlpha();
            if (iwVar.I != null && visibility == 0) {
                View viewFindFocus = iwVar.J.findFocus();
                if (viewFindFocus != null) {
                    iwVar.f().k = viewFindFocus;
                    if (xw.F(2)) {
                        viewFindFocus.toString();
                        Objects.toString(iwVar);
                    }
                }
                iwVar.J.setAlpha(0.0f);
            }
        }
        iwVar.f = 2;
    }

    public final void g() {
        iw iwVarI;
        boolean zF = xw.F(3);
        iw iwVar = this.c;
        if (zF) {
            Objects.toString(iwVar);
        }
        boolean zIsChangingConfigurations = true;
        int i = 0;
        boolean z = iwVar.q && !iwVar.q();
        p21 p21Var = this.b;
        if (z) {
        }
        if (!z) {
            ax axVar = (ax) p21Var.i;
            if (!((axVar.b.containsKey(iwVar.j) && axVar.e) ? axVar.f : true)) {
                String str = iwVar.m;
                if (str != null && (iwVarI = p21Var.i(str)) != null && iwVarI.F) {
                    iwVar.l = iwVarI;
                }
                iwVar.f = 0;
                return;
            }
        }
        kw kwVar = iwVar.x;
        if (kwVar != null) {
            zIsChangingConfigurations = ((ax) p21Var.i).f;
        } else {
            i5 i5Var = kwVar.x;
            if (i5Var != null) {
                zIsChangingConfigurations = true ^ i5Var.isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            ax axVar2 = (ax) p21Var.i;
            axVar2.getClass();
            if (xw.F(3)) {
                Objects.toString(iwVar);
            }
            axVar2.c(iwVar.j);
        }
        iwVar.y.k();
        iwVar.S.d(t50.ON_DESTROY);
        iwVar.f = 0;
        iwVar.H = false;
        iwVar.P = false;
        iwVar.H = true;
        if (!iwVar.H) {
            throw new bz0("Fragment " + iwVar + " did not call through to super.onDestroy()");
        }
        this.a.j(false);
        ArrayList arrayListL = p21Var.l();
        int size = arrayListL.size();
        while (i < size) {
            Object obj = arrayListL.get(i);
            i++;
            ex exVar = (ex) obj;
            if (exVar != null) {
                iw iwVar2 = exVar.c;
                if (iwVar.j.equals(iwVar2.m)) {
                    iwVar2.l = iwVar;
                    iwVar2.m = null;
                }
            }
        }
        String str2 = iwVar.m;
        if (str2 != null) {
            iwVar.l = p21Var.i(str2);
        }
        p21Var.u(this);
    }

    public final void h() {
        View view;
        boolean zF = xw.F(3);
        iw iwVar = this.c;
        if (zF) {
            Objects.toString(iwVar);
        }
        ViewGroup viewGroup = iwVar.I;
        if (viewGroup != null && (view = iwVar.J) != null) {
            viewGroup.removeView(view);
        }
        iwVar.y.t(1);
        if (iwVar.J != null && iwVar.T.e().c.compareTo(u50.h) >= 0) {
            iwVar.T.b(t50.ON_DESTROY);
        }
        iwVar.f = 1;
        iwVar.H = false;
        iwVar.w();
        if (!iwVar.H) {
            throw new bz0("Fragment " + iwVar + " did not call through to super.onDestroyView()");
        }
        jx0 jx0Var = ((v70) new ug0(iwVar.d(), v70.c).t(v70.class)).b;
        if (jx0Var.h > 0) {
            jx0Var.g[0].getClass();
            throw new ClassCastException();
        }
        iwVar.u = false;
        this.a.u(false);
        iwVar.I = null;
        iwVar.J = null;
        iwVar.T = null;
        iwVar.U.d(null);
        iwVar.s = false;
    }

    public final void i() {
        boolean zF = xw.F(3);
        iw iwVar = this.c;
        if (zF) {
            Objects.toString(iwVar);
        }
        iwVar.f = -1;
        iwVar.H = false;
        iwVar.x();
        iwVar.O = null;
        if (!iwVar.H) {
            throw new bz0("Fragment " + iwVar + " did not call through to super.onDetach()");
        }
        xw xwVar = iwVar.y;
        if (!xwVar.G) {
            xwVar.k();
            iwVar.y = new xw();
        }
        this.a.k(false);
        iwVar.f = -1;
        iwVar.x = null;
        iwVar.z = null;
        iwVar.w = null;
        if (!iwVar.q || iwVar.q()) {
            ax axVar = (ax) this.b.i;
            if (!((axVar.b.containsKey(iwVar.j) && axVar.e) ? axVar.f : true)) {
                return;
            }
        }
        if (xw.F(3)) {
            Objects.toString(iwVar);
        }
        iwVar.o();
    }

    public final void j() {
        iw iwVar = this.c;
        if (iwVar.r && iwVar.s && !iwVar.u) {
            if (xw.F(3)) {
                Objects.toString(iwVar);
            }
            LayoutInflater layoutInflaterY = iwVar.y(iwVar.g);
            iwVar.O = layoutInflaterY;
            iwVar.E(layoutInflaterY, null, iwVar.g);
            View view = iwVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                iwVar.J.setTag(R.id.fragment_container_view_tag, iwVar);
                if (iwVar.D) {
                    iwVar.J.setVisibility(8);
                }
                iwVar.C(iwVar.J, iwVar.g);
                iwVar.y.t(2);
                this.a.t(false);
                iwVar.f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        p21 p21Var = this.b;
        boolean z = this.d;
        iw iwVar = this.c;
        if (z) {
            if (xw.F(2)) {
                Objects.toString(iwVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = iwVar.f;
                if (iD == i) {
                    if (!z2 && i == -1 && iwVar.q && !iwVar.q()) {
                        if (xw.F(3)) {
                            Objects.toString(iwVar);
                        }
                        ax axVar = (ax) p21Var.i;
                        axVar.getClass();
                        if (xw.F(3)) {
                            Objects.toString(iwVar);
                        }
                        axVar.c(iwVar.j);
                        p21Var.u(this);
                        if (xw.F(3)) {
                            Objects.toString(iwVar);
                        }
                        iwVar.o();
                    }
                    if (iwVar.N) {
                        if (iwVar.J != null && (viewGroup = iwVar.I) != null) {
                            tn tnVarF = tn.f(viewGroup, iwVar.k().E());
                            if (iwVar.D) {
                                if (xw.F(2)) {
                                    Objects.toString(iwVar);
                                }
                                tnVarF.a(3, 1, this);
                            } else {
                                if (xw.F(2)) {
                                    Objects.toString(iwVar);
                                }
                                tnVarF.a(2, 1, this);
                            }
                        }
                        xw xwVar = iwVar.w;
                        if (xwVar != null && iwVar.p && xw.G(iwVar)) {
                            xwVar.D = true;
                        }
                        iwVar.N = false;
                        iwVar.y.n();
                    }
                    this.d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            iwVar.f = 1;
                            break;
                        case 2:
                            iwVar.s = false;
                            iwVar.f = 2;
                            break;
                        case 3:
                            if (xw.F(3)) {
                                Objects.toString(iwVar);
                            }
                            if (iwVar.J != null && iwVar.h == null) {
                                o();
                            }
                            if (iwVar.J != null && (viewGroup2 = iwVar.I) != null) {
                                tn tnVarF2 = tn.f(viewGroup2, iwVar.k().E());
                                if (xw.F(2)) {
                                    Objects.toString(iwVar);
                                }
                                tnVarF2.a(1, 3, this);
                            }
                            iwVar.f = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            iwVar.f = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
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
                            if (iwVar.J != null && (viewGroup3 = iwVar.I) != null) {
                                tn tnVarF3 = tn.f(viewGroup3, iwVar.k().E());
                                int iB = ex0.b(iwVar.J.getVisibility());
                                if (xw.F(2)) {
                                    Objects.toString(iwVar);
                                }
                                tnVarF3.a(iB, 2, this);
                            }
                            iwVar.f = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            iwVar.f = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zF = xw.F(3);
        iw iwVar = this.c;
        if (zF) {
            Objects.toString(iwVar);
        }
        iwVar.y.t(5);
        if (iwVar.J != null) {
            iwVar.T.b(t50.ON_PAUSE);
        }
        iwVar.S.d(t50.ON_PAUSE);
        iwVar.f = 6;
        iwVar.H = true;
        this.a.m(false);
    }

    public final void m(ClassLoader classLoader) {
        iw iwVar = this.c;
        Bundle bundle = iwVar.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        iwVar.h = iwVar.g.getSparseParcelableArray("android:view_state");
        iwVar.i = iwVar.g.getBundle("android:view_registry_state");
        String string = iwVar.g.getString("android:target_state");
        iwVar.m = string;
        if (string != null) {
            iwVar.n = iwVar.g.getInt("android:target_req_state", 0);
        }
        boolean z = iwVar.g.getBoolean("android:user_visible_hint", true);
        iwVar.L = z;
        if (z) {
            return;
        }
        iwVar.K = true;
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
            boolean r0 = defpackage.xw.F(r0)
            iw r1 = r6.c
            if (r0 == 0) goto Lc
            java.util.Objects.toString(r1)
        Lc:
            hw r0 = r1.M
            r2 = 0
            if (r0 != 0) goto L13
            r0 = r2
            goto L15
        L13:
            android.view.View r0 = r0.k
        L15:
            if (r0 == 0) goto L45
            android.view.View r3 = r1.J
            if (r0 != r3) goto L1c
            goto L26
        L1c:
            android.view.ViewParent r3 = r0.getParent()
        L20:
            if (r3 == 0) goto L45
            android.view.View r4 = r1.J
            if (r3 != r4) goto L40
        L26:
            r0.requestFocus()
            r3 = 2
            boolean r3 = defpackage.xw.F(r3)
            if (r3 == 0) goto L45
            r0.toString()
            java.util.Objects.toString(r1)
            android.view.View r0 = r1.J
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
            goto L45
        L40:
            android.view.ViewParent r3 = r3.getParent()
            goto L20
        L45:
            hw r0 = r1.f()
            r0.k = r2
            xw r0 = r1.y
            r0.L()
            xw r0 = r1.y
            r3 = 1
            r0.y(r3)
            r0 = 7
            r1.f = r0
            r3 = 0
            r1.H = r3
            r4 = 1
            r1.H = r4
            boolean r4 = r1.H
            if (r4 == 0) goto L8e
            d60 r4 = r1.S
            t50 r5 = defpackage.t50.ON_RESUME
            r4.d(r5)
            android.view.View r4 = r1.J
            if (r4 == 0) goto L75
            jx r4 = r1.T
            d60 r4 = r4.h
            r4.d(r5)
        L75:
            xw r4 = r1.y
            r4.E = r3
            r4.F = r3
            ax r5 = r4.L
            r5.g = r3
            r4.t(r0)
            l92 r0 = r6.a
            r0.p(r3)
            r1.g = r2
            r1.h = r2
            r1.i = r2
            return
        L8e:
            bz0 r0 = new bz0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onResume()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex.n():void");
    }

    public final void o() {
        iw iwVar = this.c;
        if (iwVar.J == null) {
            return;
        }
        if (xw.F(2)) {
            Objects.toString(iwVar);
            Objects.toString(iwVar.J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        iwVar.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            iwVar.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        iwVar.T.i.y(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        iwVar.i = bundle;
    }

    public final void p() {
        boolean zF = xw.F(3);
        iw iwVar = this.c;
        if (zF) {
            Objects.toString(iwVar);
        }
        iwVar.y.L();
        iwVar.y.y(true);
        iwVar.f = 5;
        iwVar.H = false;
        iwVar.A();
        if (!iwVar.H) {
            throw new bz0("Fragment " + iwVar + " did not call through to super.onStart()");
        }
        d60 d60Var = iwVar.S;
        t50 t50Var = t50.ON_START;
        d60Var.d(t50Var);
        if (iwVar.J != null) {
            iwVar.T.h.d(t50Var);
        }
        xw xwVar = iwVar.y;
        xwVar.E = false;
        xwVar.F = false;
        xwVar.L.g = false;
        xwVar.t(5);
        this.a.r(false);
    }

    public final void q() {
        boolean zF = xw.F(3);
        iw iwVar = this.c;
        if (zF) {
            Objects.toString(iwVar);
        }
        xw xwVar = iwVar.y;
        xwVar.F = true;
        xwVar.L.g = true;
        xwVar.t(4);
        if (iwVar.J != null) {
            iwVar.T.b(t50.ON_STOP);
        }
        iwVar.S.d(t50.ON_STOP);
        iwVar.f = 4;
        iwVar.H = false;
        iwVar.B();
        if (iwVar.H) {
            this.a.s(false);
            return;
        }
        throw new bz0("Fragment " + iwVar + " did not call through to super.onStop()");
    }

    public ex(l92 l92Var, p21 p21Var, ClassLoader classLoader, sw swVar, dx dxVar) {
        this.a = l92Var;
        this.b = p21Var;
        iw iwVarA = swVar.a(dxVar.f);
        Bundle bundle = dxVar.o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        iwVarA.K(bundle);
        iwVarA.j = dxVar.g;
        iwVarA.r = dxVar.h;
        iwVarA.t = true;
        iwVarA.A = dxVar.i;
        iwVarA.B = dxVar.j;
        iwVarA.C = dxVar.k;
        iwVarA.F = dxVar.l;
        iwVarA.q = dxVar.m;
        iwVarA.E = dxVar.n;
        iwVarA.D = dxVar.p;
        iwVarA.R = u50.values()[dxVar.q];
        Bundle bundle2 = dxVar.r;
        if (bundle2 != null) {
            iwVarA.g = bundle2;
        } else {
            iwVarA.g = new Bundle();
        }
        this.c = iwVarA;
        if (xw.F(2)) {
            Objects.toString(iwVarA);
        }
    }

    public ex(l92 l92Var, p21 p21Var, iw iwVar, dx dxVar) {
        this.a = l92Var;
        this.b = p21Var;
        this.c = iwVar;
        iwVar.h = null;
        iwVar.i = null;
        iwVar.v = 0;
        iwVar.s = false;
        iwVar.p = false;
        iw iwVar2 = iwVar.l;
        iwVar.m = iwVar2 != null ? iwVar2.j : null;
        iwVar.l = null;
        Bundle bundle = dxVar.r;
        if (bundle != null) {
            iwVar.g = bundle;
        } else {
            iwVar.g = new Bundle();
        }
    }
}
