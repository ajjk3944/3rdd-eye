package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.liuzh.deviceinfo.R;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final b7.h f1202b;

    /* renamed from: c, reason: collision with root package name */
    public static final bf.f f1203c;

    /* renamed from: a, reason: collision with root package name */
    public static final ed.f f1201a = new ed.f(3);

    /* renamed from: d, reason: collision with root package name */
    public static final ec.z f1204d = new ec.z(29);

    static {
        int i4 = 4;
        f1202b = new b7.h(i4);
        f1203c = new bf.f(i4);
    }

    public static final void a(e1 e1Var, yb.i iVar, t tVar) throws NoSuchMethodException, SecurityException {
        nk.k.e(iVar, "registry");
        nk.k.e(tVar, "lifecycle");
        w0 w0Var = (w0) e1Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (w0Var == null || w0Var.f1197c) {
            return;
        }
        w0Var.p(tVar, iVar);
        s sVar = ((c0) tVar).f1110d;
        if (sVar == s.f1181b || sVar.compareTo(s.f1183d) >= 0) {
            iVar.R();
        } else {
            tVar.a(new j(tVar, iVar));
        }
    }

    public static v0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            v0 v0Var = new v0();
            new LinkedHashMap();
            v0Var.f1194a = new f1(zj.t.f38318a);
            return v0Var;
        }
        ClassLoader classLoader = v0.class.getClassLoader();
        nk.k.b(classLoader);
        bundle.setClassLoader(classLoader);
        ak.g gVar = new ak.g(bundle.size());
        for (String str : bundle.keySet()) {
            nk.k.b(str);
            gVar.put(str, bundle.get(str));
        }
        ak.g gVarB = gVar.b();
        v0 v0Var2 = new v0();
        new LinkedHashMap();
        v0Var2.f1194a = new f1(gVarB);
        return v0Var2;
    }

    public static final v0 c(h5.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f24880a;
        a6.f fVar = (a6.f) linkedHashMap.get(f1201a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        k1 k1Var = (k1) linkedHashMap.get(f1202b);
        if (k1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f1203c);
        String str = (String) linkedHashMap.get(i1.f1150b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        a6.d dVarH = fVar.g().H();
        Bundle bundle2 = null;
        z0 z0Var = dVarH instanceof z0 ? (z0) dVarH : null;
        if (z0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = f(k1Var).f1096b;
        v0 v0Var = (v0) linkedHashMap2.get(str);
        if (v0Var != null) {
            return v0Var;
        }
        z0Var.b();
        Bundle bundle3 = z0Var.f1207c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = com.bumptech.glide.d.d((yj.i[]) Arrays.copyOf(new yj.i[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                z0Var.f1207c = null;
            }
            bundle2 = bundle4;
        }
        v0 v0VarB = b(bundle2, bundle);
        linkedHashMap2.put(str, v0VarB);
        return v0VarB;
    }

    public static final void d(a6.f fVar) {
        s sVar = fVar.j().f1110d;
        if (sVar != s.f1181b && sVar != s.f1182c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.g().H() == null) {
            z0 z0Var = new z0(fVar.g(), (k1) fVar);
            fVar.g().P("androidx.lifecycle.internal.SavedStateHandlesProvider", z0Var);
            fVar.j().a(new e(1, z0Var));
        }
    }

    public static final a0 e(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            a0 a0Var = tag instanceof a0 ? (a0) tag : null;
            if (a0Var != null) {
                return a0Var;
            }
            Object objD = com.bumptech.glide.e.D(view);
            view = objD instanceof View ? (View) objD : null;
        }
        return null;
    }

    public static final a1 f(k1 k1Var) {
        x0 x0Var = new x0(0);
        h5.b bVarC = k1Var instanceof n ? ((n) k1Var).c() : h5.a.f24879b;
        nk.k.e(bVarC, "extras");
        j1 j1VarE = k1Var.e();
        nk.k.e(j1VarE, "store");
        return (a1) new a0.x0(j1VarE, x0Var, bVarC).D(nk.v.a(a1.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final i5.a g(e1 e1Var) {
        i5.a aVar;
        nk.k.e(e1Var, "<this>");
        synchronized (f1204d) {
            aVar = (i5.a) e1Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                ck.h hVar = ck.i.f2898a;
                try {
                    el.e eVar = xk.g0.f37189a;
                    hVar = cl.o.f2935a.f37658f;
                } catch (IllegalStateException | yj.h unused) {
                }
                i5.a aVar2 = new i5.a(hVar.y(xk.x.d()));
                e1Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final void h(View view, a0 a0Var) {
        nk.k.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, a0Var);
    }
}
