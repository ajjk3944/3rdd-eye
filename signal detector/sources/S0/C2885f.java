package s0;

import C0.y;
import C5.o;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.D;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import c5.C0407d;
import d5.AbstractC2282j;
import d5.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import k0.AbstractComponentCallbacksC2617v;
import k0.C2597a;
import k0.E;
import k0.I;
import k0.J;
import k0.N;
import n0.C2679a;
import n0.C2681c;
import q0.B;
import q0.C2794g;
import q0.C2796i;
import q0.K;
import q0.L;
import q0.v;
import q5.p;

@K("fragment")
/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2885f extends L {

    /* renamed from: c, reason: collision with root package name */
    public final Context f23411c;

    /* renamed from: d, reason: collision with root package name */
    public final k0.K f23412d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23413e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f23414f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public final F0.c f23415g = new F0.c(2, this);

    /* renamed from: h, reason: collision with root package name */
    public final H5.g f23416h = new H5.g(3, this);

    /* renamed from: s0.f$a */
    public static final class a extends X {

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f23417b;

        @Override // androidx.lifecycle.X
        public final void d() {
            WeakReference weakReference = this.f23417b;
            if (weakReference == null) {
                q5.i.g("completeTransition");
                throw null;
            }
            p5.a aVar = (p5.a) weakReference.get();
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public C2885f(Context context, k0.K k6, int i) {
        this.f23411c = context;
        this.f23412d = k6;
        this.f23413e = i;
    }

    public static void k(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, C2794g c2794g, C2796i c2796i) {
        q5.i.e(abstractComponentCallbacksC2617v, "fragment");
        a0 a0VarD = abstractComponentCallbacksC2617v.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        q5.d dVarA = p.a(a.class);
        if (linkedHashMap.containsKey(dVarA)) {
            throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + com.bumptech.glide.d.s(dVarA) + '.').toString());
        }
        linkedHashMap.put(dVarA, new n0.e(dVarA));
        Collection collectionValues = linkedHashMap.values();
        q5.i.e(collectionValues, "initializers");
        n0.e[] eVarArr = (n0.e[]) collectionValues.toArray(new n0.e[0]);
        C2681c c2681c = new C2681c((n0.e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        C2679a c2679a = C2679a.f22142b;
        q5.i.e(c2679a, "defaultCreationExtras");
        V2.e eVar = new V2.e(a0VarD, c2681c, c2679a);
        q5.d dVarA2 = p.a(a.class);
        String strS = com.bumptech.glide.d.s(dVarA2);
        if (strS == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        ((a) eVar.q(dVarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS))).f23417b = new WeakReference(new y(c2794g, c2796i));
    }

    @Override // q0.L
    public final v a() {
        return new C2886g(this);
    }

    @Override // q0.L
    public final void d(List list, B b5) {
        k0.K k6 = this.f23412d;
        if (k6.M()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2794g c2794g = (C2794g) it.next();
            boolean zIsEmpty = ((List) ((o) b().f22982e.f73b).I()).isEmpty();
            if (b5 == null || zIsEmpty || !b5.f22909b || !this.f23414f.remove(c2794g.f22969f)) {
                C2597a c2597aL = l(c2794g, b5);
                if (!zIsEmpty) {
                    String str = c2794g.f22969f;
                    if (!c2597aL.f21593h) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    c2597aL.f21592g = true;
                    c2597aL.i = str;
                }
                c2597aL.d(false);
                b().h(c2794g);
            } else {
                k6.v(new J(k6, c2794g.f22969f, 0), false);
                b().h(c2794g);
            }
        }
    }

    @Override // q0.L
    public final void e(final C2796i c2796i) {
        this.f22938a = c2796i;
        this.f22939b = true;
        N n6 = new N() { // from class: s0.e
            @Override // k0.N
            public final void a(k0.K k6, AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
                Object objPrevious;
                q5.i.e(k6, "<anonymous parameter 0>");
                q5.i.e(abstractComponentCallbacksC2617v, "fragment");
                C2796i c2796i2 = c2796i;
                List list = (List) ((o) c2796i2.f22982e.f73b).I();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (q5.i.a(((C2794g) objPrevious).f22969f, abstractComponentCallbacksC2617v.M)) {
                            break;
                        }
                    }
                }
                C2794g c2794g = (C2794g) objPrevious;
                if (c2794g != null) {
                    D d6 = abstractComponentCallbacksC2617v.f21709d0;
                    C2885f c2885f = this;
                    d6.e(abstractComponentCallbacksC2617v, new N4.b(new C2887h(c2885f, abstractComponentCallbacksC2617v, c2794g), 8));
                    abstractComponentCallbacksC2617v.b0.a(c2885f.f23415g);
                    C2885f.k(abstractComponentCallbacksC2617v, c2794g, c2796i2);
                }
            }
        };
        k0.K k6 = this.f23412d;
        k6.f21515n.add(n6);
        C2888i c2888i = new C2888i(c2796i, this);
        if (k6.f21513l == null) {
            k6.f21513l = new ArrayList();
        }
        k6.f21513l.add(c2888i);
    }

    @Override // q0.L
    public final void f(C2794g c2794g) {
        String str = c2794g.f22969f;
        k0.K k6 = this.f23412d;
        if (k6.M()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C2597a c2597aL = l(c2794g, null);
        if (((List) ((o) b().f22982e.f73b).I()).size() > 1) {
            k6.v(new I(k6, str, -1), false);
            if (!c2597aL.f21593h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            c2597aL.f21592g = true;
            c2597aL.i = str;
        }
        c2597aL.d(false);
        b().c(c2794g);
    }

    @Override // q0.L
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f23414f;
            linkedHashSet.clear();
            d5.p.R(stringArrayList, linkedHashSet);
        }
    }

    @Override // q0.L
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f23414f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return I5.b.c(new C0407d("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // q0.L
    public final void i(C2794g c2794g, boolean z6) {
        q5.i.e(c2794g, "popUpTo");
        k0.K k6 = this.f23412d;
        if (k6.M()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((o) b().f22982e.f73b).I();
        List listSubList = list.subList(list.indexOf(c2794g), list.size());
        if (z6) {
            C2794g c2794g2 = (C2794g) AbstractC2282j.T(list);
            for (C2794g c2794g3 : AbstractC2282j.f0(listSubList)) {
                if (q5.i.a(c2794g3, c2794g2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c2794g3);
                } else {
                    k6.v(new J(k6, c2794g3.f22969f, 1), false);
                    this.f23414f.add(c2794g3.f22969f);
                }
            }
        } else {
            k6.v(new I(k6, c2794g.f22969f, -1), false);
        }
        b().f(c2794g, z6);
    }

    public final C2597a l(C2794g c2794g, B b5) {
        v vVar = c2794g.f22965b;
        q5.i.c(vVar, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleA = c2794g.a();
        String str = ((C2886g) vVar).f23418k;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f23411c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        k0.K k6 = this.f23412d;
        E E6 = k6.E();
        context.getClassLoader();
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vA = E6.a(str);
        q5.i.d(abstractComponentCallbacksC2617vA, "fragmentManager.fragment…t.classLoader, className)");
        abstractComponentCallbacksC2617vA.U(bundleA);
        C2597a c2597a = new C2597a(k6);
        int i = b5 != null ? b5.f22913f : -1;
        int i3 = b5 != null ? b5.f22914g : -1;
        int i6 = b5 != null ? b5.f22915h : -1;
        int i7 = b5 != null ? b5.i : -1;
        if (i != -1 || i3 != -1 || i6 != -1 || i7 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            if (i6 == -1) {
                i6 = 0;
            }
            int i8 = i7 != -1 ? i7 : 0;
            c2597a.f21587b = i;
            c2597a.f21588c = i3;
            c2597a.f21589d = i6;
            c2597a.f21590e = i8;
        }
        String str2 = c2794g.f22969f;
        int i9 = this.f23413e;
        if (i9 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c2597a.f(i9, abstractComponentCallbacksC2617vA, str2, 2);
        c2597a.j(abstractComponentCallbacksC2617vA);
        c2597a.f21600p = true;
        return c2597a;
    }

    public final Set m() {
        LinkedHashSet linkedHashSet;
        Set setL0;
        Set set = (Set) ((o) b().f22983f.f73b).I();
        Set setL02 = AbstractC2282j.l0((Iterable) ((o) b().f22982e.f73b).I());
        q5.i.e(set, "<this>");
        if (setL02.isEmpty()) {
            setL0 = AbstractC2282j.l0(set);
        } else {
            if (setL02 instanceof Set) {
                linkedHashSet = new LinkedHashSet();
                for (Object obj : set) {
                    if (!setL02.contains(obj)) {
                        linkedHashSet.add(obj);
                    }
                }
            } else {
                linkedHashSet = new LinkedHashSet(set);
                linkedHashSet.removeAll(setL02);
            }
            setL0 = linkedHashSet;
        }
        ArrayList arrayList = new ArrayList(l.P(setL0));
        Iterator it = setL0.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2794g) it.next()).f22969f);
        }
        return AbstractC2282j.l0(arrayList);
    }
}
