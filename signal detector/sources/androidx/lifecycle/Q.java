package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.apm.insight.R;
import h5.C2369c;
import h5.C2371e;
import h5.C2376j;
import h5.InterfaceC2372f;
import h5.InterfaceC2375i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import n0.AbstractC2680b;
import n0.C2679a;
import o0.C2752a;
import z5.AbstractC3046w;
import z5.h0;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final S4.r f5209a = new S4.r(16);

    /* renamed from: b, reason: collision with root package name */
    public static final S4.r f5210b = new S4.r(17);

    /* renamed from: c, reason: collision with root package name */
    public static final S4.r f5211c = new S4.r(15);

    /* renamed from: d, reason: collision with root package name */
    public static final o0.c f5212d = new o0.c();

    public static final void a(X x6, F0.f fVar, C0300w c0300w) {
        q5.i.e(fVar, "registry");
        q5.i.e(c0300w, "lifecycle");
        O o5 = (O) x6.c("androidx.lifecycle.savedstate.vm.tag");
        if (o5 == null || o5.f5206c) {
            return;
        }
        o5.h(fVar, c0300w);
        j(fVar, c0300w);
    }

    public static final O b(F0.f fVar, C0300w c0300w, String str, Bundle bundle) {
        q5.i.e(fVar, "registry");
        q5.i.e(c0300w, "lifecycle");
        Bundle bundleC = fVar.c(str);
        Class[] clsArr = N.f5198f;
        O o5 = new O(str, c(bundleC, bundle));
        o5.h(fVar, c0300w);
        j(fVar, c0300w);
        return o5;
    }

    public static N c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new N();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                q5.i.d(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new N(map);
        }
        ClassLoader classLoader = N.class.getClassLoader();
        q5.i.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            q5.i.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new N(linkedHashMap);
    }

    public static final N d(n0.d dVar) {
        LinkedHashMap linkedHashMap = dVar.f22143a;
        F0.g gVar = (F0.g) linkedHashMap.get(f5209a);
        if (gVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        b0 b0Var = (b0) linkedHashMap.get(f5210b);
        if (b0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f5211c);
        String str = (String) linkedHashMap.get(o0.c.f22669a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        F0.e eVarD = gVar.f().d();
        S s5 = eVarD instanceof S ? (S) eVarD : null;
        if (s5 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = g(b0Var).f5217b;
        N n6 = (N) linkedHashMap2.get(str);
        if (n6 != null) {
            return n6;
        }
        Class[] clsArr = N.f5198f;
        s5.b();
        Bundle bundle2 = s5.f5215c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = s5.f5215c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = s5.f5215c;
        if (bundle5 != null && bundle5.isEmpty()) {
            s5.f5215c = null;
        }
        N nC = c(bundle3, bundle);
        linkedHashMap2.put(str, nC);
        return nC;
    }

    public static final void e(F0.g gVar) {
        EnumC0292n enumC0292n = gVar.j().f5259d;
        if (enumC0292n != EnumC0292n.f5244b && enumC0292n != EnumC0292n.f5245c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gVar.f().d() == null) {
            S s5 = new S(gVar.f(), (b0) gVar);
            gVar.f().f("androidx.lifecycle.internal.SavedStateHandlesProvider", s5);
            gVar.j().a(new F0.b(3, s5));
        }
    }

    public static final C0294p f(InterfaceC0298u interfaceC0298u) {
        C2369c c2369c;
        q5.i.e(interfaceC0298u, "<this>");
        C0300w c0300wJ = interfaceC0298u.j();
        q5.i.e(c0300wJ, "<this>");
        AtomicReference atomicReference = c0300wJ.f5256a;
        while (true) {
            C0294p c0294p = (C0294p) atomicReference.get();
            if (c0294p != null) {
                return c0294p;
            }
            InterfaceC2375i h0Var = new h0();
            G5.e eVar = z5.D.f24485a;
            A5.d dVar = E5.o.f1409a.f516e;
            q5.i.e(dVar, "context");
            C2376j c2376j = C2376j.f20486a;
            if (dVar != c2376j) {
                InterfaceC2375i interfaceC2375iN = h0Var.n(dVar.getKey());
                if (interfaceC2375iN == c2376j) {
                    h0Var = dVar;
                } else {
                    C2371e c2371e = C2371e.f20485a;
                    InterfaceC2372f interfaceC2372f = (InterfaceC2372f) interfaceC2375iN.h(c2371e);
                    if (interfaceC2372f == null) {
                        c2369c = new C2369c(interfaceC2375iN, dVar);
                    } else {
                        InterfaceC2375i interfaceC2375iN2 = interfaceC2375iN.n(c2371e);
                        if (interfaceC2375iN2 == c2376j) {
                            h0Var = new C2369c(dVar, interfaceC2372f);
                        } else {
                            c2369c = new C2369c(new C2369c(interfaceC2375iN2, dVar), interfaceC2372f);
                        }
                    }
                    h0Var = c2369c;
                }
            }
            C0294p c0294p2 = new C0294p(c0300wJ, h0Var);
            while (!atomicReference.compareAndSet(null, c0294p2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            G5.e eVar2 = z5.D.f24485a;
            AbstractC3046w.l(c0294p2, E5.o.f1409a.f516e, new C0293o(c0294p2, null), 2);
            return c0294p2;
        }
    }

    public static final T g(b0 b0Var) {
        P p6 = new P(0);
        a0 a0VarD = b0Var.d();
        AbstractC2680b abstractC2680bC = b0Var instanceof InterfaceC0287i ? ((InterfaceC0287i) b0Var).c() : C2679a.f22142b;
        q5.i.e(a0VarD, "store");
        q5.i.e(abstractC2680bC, "defaultCreationExtras");
        return (T) new V2.e(a0VarD, p6, abstractC2680bC).q(q5.p.a(T.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final C2752a h(X x6) {
        C2752a c2752a;
        InterfaceC2375i interfaceC2375i;
        q5.i.e(x6, "<this>");
        synchronized (f5212d) {
            c2752a = (C2752a) x6.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c2752a == null) {
                try {
                    G5.e eVar = z5.D.f24485a;
                    interfaceC2375i = E5.o.f1409a.f516e;
                } catch (IllegalStateException unused) {
                    interfaceC2375i = C2376j.f20486a;
                }
                C2752a c2752a2 = new C2752a(interfaceC2375i.m(new h0()));
                x6.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c2752a2);
                c2752a = c2752a2;
            }
        }
        return c2752a;
    }

    public static final void i(View view, InterfaceC0298u interfaceC0298u) {
        q5.i.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0298u);
    }

    public static void j(F0.f fVar, C0300w c0300w) throws NoSuchMethodException, SecurityException {
        EnumC0292n enumC0292n = c0300w.f5259d;
        if (enumC0292n == EnumC0292n.f5244b || enumC0292n.compareTo(EnumC0292n.f5246d) >= 0) {
            fVar.g();
        } else {
            c0300w.a(new R0.b(c0300w, 3, fVar));
        }
    }
}
