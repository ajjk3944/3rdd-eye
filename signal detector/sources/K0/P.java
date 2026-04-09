package k0;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.a0;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import h.AbstractActivityC2349g;
import h0.C2351a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import l0.AbstractC2632d;
import l0.C2629a;
import l0.C2631c;
import l0.C2633e;
import n0.C2679a;
import o4.AbstractC2763b;
import p0.C2769a;
import u.C2941j;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final C2351a f21556a;

    /* renamed from: b, reason: collision with root package name */
    public final c1.g f21557b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC2617v f21558c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21559d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f21560e = -1;

    public P(C2351a c2351a, c1.g gVar, AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        this.f21556a = c2351a;
        this.f21557b = gVar;
        this.f21558c = abstractComponentCallbacksC2617v;
    }

    public final void a() {
        boolean zH = K.H(3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (zH) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC2617v);
        }
        Bundle bundle = abstractComponentCallbacksC2617v.f21705b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC2617v.f21686I.O();
        abstractComponentCallbacksC2617v.f21703a = 3;
        abstractComponentCallbacksC2617v.f21694R = false;
        abstractComponentCallbacksC2617v.y();
        if (!abstractComponentCallbacksC2617v.f21694R) {
            throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onActivityCreated()"));
        }
        if (K.H(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC2617v);
        }
        if (abstractComponentCallbacksC2617v.f21696T != null) {
            Bundle bundle2 = abstractComponentCallbacksC2617v.f21705b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC2617v.f21706c;
            if (sparseArray != null) {
                abstractComponentCallbacksC2617v.f21696T.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC2617v.f21706c = null;
            }
            abstractComponentCallbacksC2617v.f21694R = false;
            abstractComponentCallbacksC2617v.N(bundle3);
            if (!abstractComponentCallbacksC2617v.f21694R) {
                throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onViewStateRestored()"));
            }
            if (abstractComponentCallbacksC2617v.f21696T != null) {
                abstractComponentCallbacksC2617v.f21707c0.a(EnumC0291m.ON_CREATE);
            }
        }
        abstractComponentCallbacksC2617v.f21705b = null;
        K k6 = abstractComponentCallbacksC2617v.f21686I;
        k6.f21495F = false;
        k6.f21496G = false;
        k6.M.f21542g = false;
        k6.t(4);
        this.f21556a.h(false);
    }

    public final void b() {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v;
        View view;
        View view2;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = this.f21558c;
        View view3 = abstractComponentCallbacksC2617v2.f21695S;
        while (true) {
            abstractComponentCallbacksC2617v = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v3 = tag instanceof AbstractComponentCallbacksC2617v ? (AbstractComponentCallbacksC2617v) tag : null;
            if (abstractComponentCallbacksC2617v3 != null) {
                abstractComponentCallbacksC2617v = abstractComponentCallbacksC2617v3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v4 = abstractComponentCallbacksC2617v2.f21687J;
        if (abstractComponentCallbacksC2617v != null && !abstractComponentCallbacksC2617v.equals(abstractComponentCallbacksC2617v4)) {
            int i = abstractComponentCallbacksC2617v2.f21689L;
            C2631c c2631c = AbstractC2632d.f21809a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC2617v2);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC2617v);
            sb.append(" via container with ID ");
            AbstractC2632d.b(new C2629a(abstractComponentCallbacksC2617v2, AbstractC2763b.d(i, " without using parent's childFragmentManager", sb)));
            AbstractC2632d.a(abstractComponentCallbacksC2617v2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.f21557b.f5896b;
        ViewGroup viewGroup = abstractComponentCallbacksC2617v2.f21695S;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC2617v2);
            int i3 = iIndexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v5 = (AbstractComponentCallbacksC2617v) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC2617v5.f21695S == viewGroup && (view = abstractComponentCallbacksC2617v5.f21696T) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v6 = (AbstractComponentCallbacksC2617v) arrayList.get(i3);
                    if (abstractComponentCallbacksC2617v6.f21695S == viewGroup && (view2 = abstractComponentCallbacksC2617v6.f21696T) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        abstractComponentCallbacksC2617v2.f21695S.addView(abstractComponentCallbacksC2617v2.f21696T, iIndexOfChild);
    }

    public final void c() {
        boolean zH = K.H(3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (zH) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC2617v);
        }
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = abstractComponentCallbacksC2617v.f21714g;
        P p6 = null;
        c1.g gVar = this.f21557b;
        if (abstractComponentCallbacksC2617v2 != null) {
            P p7 = (P) ((HashMap) gVar.f5897c).get(abstractComponentCallbacksC2617v2.f21710e);
            if (p7 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC2617v + " declared target fragment " + abstractComponentCallbacksC2617v.f21714g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC2617v.f21716h = abstractComponentCallbacksC2617v.f21714g.f21710e;
            abstractComponentCallbacksC2617v.f21714g = null;
            p6 = p7;
        } else {
            String str = abstractComponentCallbacksC2617v.f21716h;
            if (str != null && (p6 = (P) ((HashMap) gVar.f5897c).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC2617v);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(A.f.p(sb, abstractComponentCallbacksC2617v.f21716h, " that does not belong to this FragmentManager!"));
            }
        }
        if (p6 != null) {
            p6.k();
        }
        K k6 = abstractComponentCallbacksC2617v.f21684G;
        abstractComponentCallbacksC2617v.f21685H = k6.f21522u;
        abstractComponentCallbacksC2617v.f21687J = k6.f21524w;
        C2351a c2351a = this.f21556a;
        c2351a.r(false);
        ArrayList arrayList = abstractComponentCallbacksC2617v.f21717h0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC2615t) obj).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC2617v.f21686I.b(abstractComponentCallbacksC2617v.f21685H, abstractComponentCallbacksC2617v.a(), abstractComponentCallbacksC2617v);
        abstractComponentCallbacksC2617v.f21703a = 0;
        abstractComponentCallbacksC2617v.f21694R = false;
        abstractComponentCallbacksC2617v.A(abstractComponentCallbacksC2617v.f21685H.f21726j);
        if (!abstractComponentCallbacksC2617v.f21694R) {
            throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onAttach()"));
        }
        K k7 = abstractComponentCallbacksC2617v.f21684G;
        Iterator it = k7.f21515n.iterator();
        while (it.hasNext()) {
            ((N) it.next()).a(k7, abstractComponentCallbacksC2617v);
        }
        K k8 = abstractComponentCallbacksC2617v.f21686I;
        k8.f21495F = false;
        k8.f21496G = false;
        k8.M.f21542g = false;
        k8.t(0);
        c2351a.k(false);
    }

    public final int d() {
        int i;
        Object obj;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (abstractComponentCallbacksC2617v.f21684G == null) {
            return abstractComponentCallbacksC2617v.f21703a;
        }
        int iMin = this.f21560e;
        int iOrdinal = abstractComponentCallbacksC2617v.f21704a0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC2617v.f21723n) {
            if (abstractComponentCallbacksC2617v.f21680C) {
                iMin = Math.max(this.f21560e, 2);
                View view = abstractComponentCallbacksC2617v.f21696T;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f21560e < 4 ? Math.min(iMin, abstractComponentCallbacksC2617v.f21703a) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC2617v.f21720k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2617v.f21695S;
        if (viewGroup != null) {
            C2605i c2605iF = C2605i.f(viewGroup, abstractComponentCallbacksC2617v.p());
            c2605iF.getClass();
            U uD = c2605iF.d(abstractComponentCallbacksC2617v);
            int i3 = uD != null ? uD.f21578b : 0;
            ArrayList arrayList = c2605iF.f21638c;
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i6);
                i6++;
                U u6 = (U) obj;
                if (q5.i.a(u6.f21579c, abstractComponentCallbacksC2617v) && !u6.f21582f) {
                    break;
                }
            }
            U u7 = (U) obj;
            i = u7 != null ? u7.f21578b : 0;
            int i7 = i3 == 0 ? -1 : V.f21585a[AbstractC2984e.c(i3)];
            if (i7 != -1 && i7 != 1) {
                i = i3;
            }
        } else {
            i = 0;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC2617v.f21721l) {
            iMin = abstractComponentCallbacksC2617v.x() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC2617v.f21697U && abstractComponentCallbacksC2617v.f21703a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (K.H(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC2617v);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zH = K.H(3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (zH) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC2617v);
        }
        Bundle bundle2 = abstractComponentCallbacksC2617v.f21705b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC2617v.f21701Y) {
            abstractComponentCallbacksC2617v.f21703a = 1;
            Bundle bundle4 = abstractComponentCallbacksC2617v.f21705b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC2617v.f21686I.U(bundle);
            K k6 = abstractComponentCallbacksC2617v.f21686I;
            k6.f21495F = false;
            k6.f21496G = false;
            k6.M.f21542g = false;
            k6.t(1);
            return;
        }
        C2351a c2351a = this.f21556a;
        c2351a.s(false);
        abstractComponentCallbacksC2617v.f21686I.O();
        abstractComponentCallbacksC2617v.f21703a = 1;
        abstractComponentCallbacksC2617v.f21694R = false;
        abstractComponentCallbacksC2617v.b0.a(new F0.b(5, abstractComponentCallbacksC2617v));
        abstractComponentCallbacksC2617v.B(bundle3);
        abstractComponentCallbacksC2617v.f21701Y = true;
        if (!abstractComponentCallbacksC2617v.f21694R) {
            throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onCreate()"));
        }
        abstractComponentCallbacksC2617v.b0.d(EnumC0291m.ON_CREATE);
        c2351a.l(false);
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (abstractComponentCallbacksC2617v.f21723n) {
            return;
        }
        if (K.H(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2617v);
        }
        Bundle bundle = abstractComponentCallbacksC2617v.f21705b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterF = abstractComponentCallbacksC2617v.F(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC2617v.f21695S;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC2617v.f21689L;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(AbstractC1135f5.m("Cannot create fragment ", abstractComponentCallbacksC2617v, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC2617v.f21684G.f21523v.u(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC2617v.f21681D) {
                        try {
                            resourceName = abstractComponentCallbacksC2617v.q().getResourceName(abstractComponentCallbacksC2617v.f21689L);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC2617v.f21689L) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC2617v);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C2631c c2631c = AbstractC2632d.f21809a;
                    AbstractC2632d.b(new C2633e(abstractComponentCallbacksC2617v, viewGroup, 1));
                    AbstractC2632d.a(abstractComponentCallbacksC2617v).getClass();
                }
            }
        }
        abstractComponentCallbacksC2617v.f21695S = viewGroup;
        abstractComponentCallbacksC2617v.O(layoutInflaterF, viewGroup, bundle2);
        if (abstractComponentCallbacksC2617v.f21696T != null) {
            if (K.H(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC2617v);
            }
            abstractComponentCallbacksC2617v.f21696T.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC2617v.f21696T.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC2617v);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC2617v.f21690N) {
                abstractComponentCallbacksC2617v.f21696T.setVisibility(8);
            }
            View view = abstractComponentCallbacksC2617v.f21696T;
            WeakHashMap weakHashMap = R.O.f3270a;
            if (view.isAttachedToWindow()) {
                R.D.c(abstractComponentCallbacksC2617v.f21696T);
            } else {
                View view2 = abstractComponentCallbacksC2617v.f21696T;
                view2.addOnAttachStateChangeListener(new M3.n(3, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC2617v.f21705b;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC2617v.M(abstractComponentCallbacksC2617v.f21696T);
            abstractComponentCallbacksC2617v.f21686I.t(2);
            this.f21556a.x(abstractComponentCallbacksC2617v, abstractComponentCallbacksC2617v.f21696T, false);
            int visibility = abstractComponentCallbacksC2617v.f21696T.getVisibility();
            abstractComponentCallbacksC2617v.g().f21676j = abstractComponentCallbacksC2617v.f21696T.getAlpha();
            if (abstractComponentCallbacksC2617v.f21695S != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC2617v.f21696T.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC2617v.g().f21677k = viewFindFocus;
                    if (K.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC2617v);
                    }
                }
                abstractComponentCallbacksC2617v.f21696T.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC2617v.f21703a = 2;
    }

    public final void g() {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vM;
        boolean zH = K.H(3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (zH) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC2617v);
        }
        boolean zIsChangingConfigurations = true;
        int i = 0;
        boolean z6 = abstractComponentCallbacksC2617v.f21721l && !abstractComponentCallbacksC2617v.x();
        c1.g gVar = this.f21557b;
        if (z6 && !abstractComponentCallbacksC2617v.f21722m) {
            gVar.F(abstractComponentCallbacksC2617v.f21710e, null);
        }
        if (!z6) {
            M m6 = (M) gVar.f5899e;
            if (!((m6.f21537b.containsKey(abstractComponentCallbacksC2617v.f21710e) && m6.f21540e) ? m6.f21541f : true)) {
                String str = abstractComponentCallbacksC2617v.f21716h;
                if (str != null && (abstractComponentCallbacksC2617vM = gVar.m(str)) != null && abstractComponentCallbacksC2617vM.f21692P) {
                    abstractComponentCallbacksC2617v.f21714g = abstractComponentCallbacksC2617vM;
                }
                abstractComponentCallbacksC2617v.f21703a = 0;
                return;
            }
        }
        x xVar = abstractComponentCallbacksC2617v.f21685H;
        if (xVar != null) {
            zIsChangingConfigurations = ((M) gVar.f5899e).f21541f;
        } else {
            AbstractActivityC2349g abstractActivityC2349g = xVar.f21726j;
            if (A.f.y(abstractActivityC2349g)) {
                zIsChangingConfigurations = true ^ abstractActivityC2349g.isChangingConfigurations();
            }
        }
        if ((z6 && !abstractComponentCallbacksC2617v.f21722m) || zIsChangingConfigurations) {
            ((M) gVar.f5899e).e(abstractComponentCallbacksC2617v);
        }
        abstractComponentCallbacksC2617v.f21686I.k();
        abstractComponentCallbacksC2617v.b0.d(EnumC0291m.ON_DESTROY);
        abstractComponentCallbacksC2617v.f21703a = 0;
        abstractComponentCallbacksC2617v.f21694R = false;
        abstractComponentCallbacksC2617v.f21701Y = false;
        abstractComponentCallbacksC2617v.f21694R = true;
        if (!abstractComponentCallbacksC2617v.f21694R) {
            throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onDestroy()"));
        }
        this.f21556a.o(false);
        ArrayList arrayListQ = gVar.q();
        int size = arrayListQ.size();
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            P p6 = (P) obj;
            if (p6 != null) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = p6.f21558c;
                if (abstractComponentCallbacksC2617v.f21710e.equals(abstractComponentCallbacksC2617v2.f21716h)) {
                    abstractComponentCallbacksC2617v2.f21714g = abstractComponentCallbacksC2617v;
                    abstractComponentCallbacksC2617v2.f21716h = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC2617v.f21716h;
        if (str2 != null) {
            abstractComponentCallbacksC2617v.f21714g = gVar.m(str2);
        }
        gVar.x(this);
    }

    public final void h() {
        View view;
        boolean zH = K.H(3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (zH) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC2617v);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2617v.f21695S;
        if (viewGroup != null && (view = abstractComponentCallbacksC2617v.f21696T) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC2617v.f21686I.t(1);
        if (abstractComponentCallbacksC2617v.f21696T != null) {
            S s5 = abstractComponentCallbacksC2617v.f21707c0;
            s5.b();
            if (s5.f21572d.f5259d.compareTo(EnumC0292n.f5245c) >= 0) {
                abstractComponentCallbacksC2617v.f21707c0.a(EnumC0291m.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC2617v.f21703a = 1;
        abstractComponentCallbacksC2617v.f21694R = false;
        abstractComponentCallbacksC2617v.D();
        if (!abstractComponentCallbacksC2617v.f21694R) {
            throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onDestroyView()"));
        }
        a0 a0VarD = abstractComponentCallbacksC2617v.d();
        q5.i.e(a0VarD, "store");
        C2679a c2679a = C2679a.f22142b;
        q5.i.e(c2679a, "defaultCreationExtras");
        V2.e eVar = new V2.e(a0VarD, C2769a.f22733c, c2679a);
        q5.d dVarA = q5.p.a(C2769a.class);
        String strS = com.bumptech.glide.d.s(dVarA);
        if (strS == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        C2941j c2941j = ((C2769a) eVar.q(dVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS))).f22734b;
        if (c2941j.g() > 0) {
            c2941j.h(0).getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC2617v.f21682E = false;
        this.f21556a.y(false);
        abstractComponentCallbacksC2617v.f21695S = null;
        abstractComponentCallbacksC2617v.f21696T = null;
        abstractComponentCallbacksC2617v.f21707c0 = null;
        abstractComponentCallbacksC2617v.f21709d0.j(null);
        abstractComponentCallbacksC2617v.f21680C = false;
    }

    public final void i() {
        boolean zH = K.H(3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (zH) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC2617v);
        }
        abstractComponentCallbacksC2617v.f21703a = -1;
        abstractComponentCallbacksC2617v.f21694R = false;
        abstractComponentCallbacksC2617v.E();
        if (!abstractComponentCallbacksC2617v.f21694R) {
            throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onDetach()"));
        }
        K k6 = abstractComponentCallbacksC2617v.f21686I;
        if (!k6.f21497H) {
            k6.k();
            abstractComponentCallbacksC2617v.f21686I = new K();
        }
        this.f21556a.p(false);
        abstractComponentCallbacksC2617v.f21703a = -1;
        abstractComponentCallbacksC2617v.f21685H = null;
        abstractComponentCallbacksC2617v.f21687J = null;
        abstractComponentCallbacksC2617v.f21684G = null;
        if (!abstractComponentCallbacksC2617v.f21721l || abstractComponentCallbacksC2617v.x()) {
            M m6 = (M) this.f21557b.f5899e;
            if (!((m6.f21537b.containsKey(abstractComponentCallbacksC2617v.f21710e) && m6.f21540e) ? m6.f21541f : true)) {
                return;
            }
        }
        if (K.H(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC2617v);
        }
        abstractComponentCallbacksC2617v.u();
    }

    public final void j() {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (abstractComponentCallbacksC2617v.f21723n && abstractComponentCallbacksC2617v.f21680C && !abstractComponentCallbacksC2617v.f21682E) {
            if (K.H(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2617v);
            }
            Bundle bundle = abstractComponentCallbacksC2617v.f21705b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC2617v.O(abstractComponentCallbacksC2617v.F(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC2617v.f21696T;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC2617v.f21696T.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC2617v);
                if (abstractComponentCallbacksC2617v.f21690N) {
                    abstractComponentCallbacksC2617v.f21696T.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC2617v.f21705b;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC2617v.M(abstractComponentCallbacksC2617v.f21696T);
                abstractComponentCallbacksC2617v.f21686I.t(2);
                this.f21556a.x(abstractComponentCallbacksC2617v, abstractComponentCallbacksC2617v.f21696T, false);
                abstractComponentCallbacksC2617v.f21703a = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0166, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.P.k():void");
    }

    public final void l() {
        boolean zH = K.H(3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (zH) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC2617v);
        }
        abstractComponentCallbacksC2617v.f21686I.t(5);
        if (abstractComponentCallbacksC2617v.f21696T != null) {
            abstractComponentCallbacksC2617v.f21707c0.a(EnumC0291m.ON_PAUSE);
        }
        abstractComponentCallbacksC2617v.b0.d(EnumC0291m.ON_PAUSE);
        abstractComponentCallbacksC2617v.f21703a = 6;
        abstractComponentCallbacksC2617v.f21694R = false;
        abstractComponentCallbacksC2617v.H();
        if (!abstractComponentCallbacksC2617v.f21694R) {
            throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onPause()"));
        }
        this.f21556a.q(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        Bundle bundle = abstractComponentCallbacksC2617v.f21705b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC2617v.f21705b.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC2617v.f21705b.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC2617v.f21706c = abstractComponentCallbacksC2617v.f21705b.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC2617v.f21708d = abstractComponentCallbacksC2617v.f21705b.getBundle("viewRegistryState");
        O o5 = (O) abstractComponentCallbacksC2617v.f21705b.getParcelable("state");
        if (o5 != null) {
            abstractComponentCallbacksC2617v.f21716h = o5.f21553l;
            abstractComponentCallbacksC2617v.i = o5.f21554m;
            abstractComponentCallbacksC2617v.f21698V = o5.f21555n;
        }
        if (abstractComponentCallbacksC2617v.f21698V) {
            return;
        }
        abstractComponentCallbacksC2617v.f21697U = true;
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
            boolean r0 = k0.K.H(r0)
            java.lang.String r1 = "FragmentManager"
            k0.v r2 = r7.f21558c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            k0.s r0 = r2.f21699W
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f21677k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.f21696T
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.f21696T
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = k0.K.H(r5)
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
            android.view.View r0 = r2.f21696T
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            k0.s r0 = r2.g()
            r0.f21677k = r3
            k0.K r0 = r2.f21686I
            r0.O()
            k0.K r0 = r2.f21686I
            r1 = 1
            r0.x(r1)
            r0 = 7
            r2.f21703a = r0
            r1 = 0
            r2.f21694R = r1
            r2.I()
            boolean r4 = r2.f21694R
            if (r4 == 0) goto Lcd
            androidx.lifecycle.w r4 = r2.b0
            androidx.lifecycle.m r5 = androidx.lifecycle.EnumC0291m.ON_RESUME
            r4.d(r5)
            android.view.View r4 = r2.f21696T
            if (r4 == 0) goto Lad
            k0.S r4 = r2.f21707c0
            androidx.lifecycle.w r4 = r4.f21572d
            r4.d(r5)
        Lad:
            k0.K r4 = r2.f21686I
            r4.f21495F = r1
            r4.f21496G = r1
            k0.M r5 = r4.M
            r5.f21542g = r1
            r4.t(r0)
            h0.a r0 = r7.f21556a
            r0.t(r1)
            c1.g r0 = r7.f21557b
            java.lang.String r1 = r2.f21710e
            r0.F(r1, r3)
            r2.f21705b = r3
            r2.f21706c = r3
            r2.f21708d = r3
            return
        Lcd:
            k0.W r0 = new k0.W
            java.lang.String r1 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r1 = com.google.android.gms.internal.ads.AbstractC1135f5.m(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.P.n():void");
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (abstractComponentCallbacksC2617v.f21703a == -1 && (bundle = abstractComponentCallbacksC2617v.f21705b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new O(abstractComponentCallbacksC2617v));
        if (abstractComponentCallbacksC2617v.f21703a > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC2617v.J(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f21556a.u(false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC2617v.f21713f0.f(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleV = abstractComponentCallbacksC2617v.f21686I.V();
            if (!bundleV.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleV);
            }
            if (abstractComponentCallbacksC2617v.f21696T != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC2617v.f21706c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC2617v.f21708d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC2617v.f21712f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (abstractComponentCallbacksC2617v.f21696T == null) {
            return;
        }
        if (K.H(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC2617v + " with view " + abstractComponentCallbacksC2617v.f21696T);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC2617v.f21696T.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC2617v.f21706c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC2617v.f21707c0.f21573e.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC2617v.f21708d = bundle;
    }

    public final void q() {
        boolean zH = K.H(3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (zH) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC2617v);
        }
        abstractComponentCallbacksC2617v.f21686I.O();
        abstractComponentCallbacksC2617v.f21686I.x(true);
        abstractComponentCallbacksC2617v.f21703a = 5;
        abstractComponentCallbacksC2617v.f21694R = false;
        abstractComponentCallbacksC2617v.K();
        if (!abstractComponentCallbacksC2617v.f21694R) {
            throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onStart()"));
        }
        C0300w c0300w = abstractComponentCallbacksC2617v.b0;
        EnumC0291m enumC0291m = EnumC0291m.ON_START;
        c0300w.d(enumC0291m);
        if (abstractComponentCallbacksC2617v.f21696T != null) {
            abstractComponentCallbacksC2617v.f21707c0.f21572d.d(enumC0291m);
        }
        K k6 = abstractComponentCallbacksC2617v.f21686I;
        k6.f21495F = false;
        k6.f21496G = false;
        k6.M.f21542g = false;
        k6.t(5);
        this.f21556a.v(false);
    }

    public final void r() {
        boolean zH = K.H(3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21558c;
        if (zH) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC2617v);
        }
        K k6 = abstractComponentCallbacksC2617v.f21686I;
        k6.f21496G = true;
        k6.M.f21542g = true;
        k6.t(4);
        if (abstractComponentCallbacksC2617v.f21696T != null) {
            abstractComponentCallbacksC2617v.f21707c0.a(EnumC0291m.ON_STOP);
        }
        abstractComponentCallbacksC2617v.b0.d(EnumC0291m.ON_STOP);
        abstractComponentCallbacksC2617v.f21703a = 4;
        abstractComponentCallbacksC2617v.f21694R = false;
        abstractComponentCallbacksC2617v.L();
        if (!abstractComponentCallbacksC2617v.f21694R) {
            throw new W(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " did not call through to super.onStop()"));
        }
        this.f21556a.w(false);
    }

    public P(C2351a c2351a, c1.g gVar, ClassLoader classLoader, E e6, Bundle bundle) {
        this.f21556a = c2351a;
        this.f21557b = gVar;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vA = ((O) bundle.getParcelable("state")).a(e6);
        this.f21558c = abstractComponentCallbacksC2617vA;
        abstractComponentCallbacksC2617vA.f21705b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC2617vA.U(bundle2);
        if (K.H(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC2617vA);
        }
    }

    public P(C2351a c2351a, c1.g gVar, AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, Bundle bundle) {
        this.f21556a = c2351a;
        this.f21557b = gVar;
        this.f21558c = abstractComponentCallbacksC2617v;
        abstractComponentCallbacksC2617v.f21706c = null;
        abstractComponentCallbacksC2617v.f21708d = null;
        abstractComponentCallbacksC2617v.f21683F = 0;
        abstractComponentCallbacksC2617v.f21680C = false;
        abstractComponentCallbacksC2617v.f21720k = false;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = abstractComponentCallbacksC2617v.f21714g;
        abstractComponentCallbacksC2617v.f21716h = abstractComponentCallbacksC2617v2 != null ? abstractComponentCallbacksC2617v2.f21710e : null;
        abstractComponentCallbacksC2617v.f21714g = null;
        abstractComponentCallbacksC2617v.f21705b = bundle;
        abstractComponentCallbacksC2617v.f21712f = bundle.getBundle("arguments");
    }
}
