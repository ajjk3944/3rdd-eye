package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b1 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f1101a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f1102b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1103c;

    /* renamed from: d, reason: collision with root package name */
    public final t f1104d;

    /* renamed from: e, reason: collision with root package name */
    public final yb.i f1105e;

    public b1(Application application, a6.f fVar, Bundle bundle) {
        g1 g1Var;
        this.f1105e = fVar.g();
        this.f1104d = fVar.j();
        this.f1103c = bundle;
        this.f1101a = application;
        if (application != null) {
            if (g1.f1140d == null) {
                g1.f1140d = new g1(application);
            }
            g1Var = g1.f1140d;
            nk.k.b(g1Var);
        } else {
            g1Var = new g1(null);
        }
        this.f1102b = g1Var;
    }

    @Override // androidx.lifecycle.h1
    public final e1 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.h1
    public final e1 b(Class cls, h5.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f24880a;
        String str = (String) linkedHashMap.get(i1.f1150b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(y0.f1201a) == null || linkedHashMap.get(y0.f1202b) == null) {
            if (this.f1104d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(g1.f1141e);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? c1.a(cls, c1.f1116b) : c1.a(cls, c1.f1115a);
        return constructorA == null ? this.f1102b.b(cls, cVar) : (!zIsAssignableFrom || application == null) ? c1.b(cls, constructorA, y0.c(cVar)) : c1.b(cls, constructorA, application, y0.c(cVar));
    }

    @Override // androidx.lifecycle.h1
    public final e1 c(nk.e eVar, h5.c cVar) {
        return b(pk.a.h(eVar), cVar);
    }

    public final e1 d(Class cls, String str) throws NoSuchMethodException, SecurityException {
        t tVar = this.f1104d;
        if (tVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f1101a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? c1.a(cls, c1.f1116b) : c1.a(cls, c1.f1115a);
        if (constructorA == null) {
            if (application != null) {
                return this.f1102b.a(cls);
            }
            if (x0.f1199b == null) {
                x0.f1199b = new x0(1);
            }
            nk.k.b(x0.f1199b);
            return com.bumptech.glide.f.j(cls);
        }
        yb.i iVar = this.f1105e;
        nk.k.b(iVar);
        v0 v0VarB = y0.b(iVar.l(str), this.f1103c);
        w0 w0Var = new w0(str, v0VarB);
        w0Var.p(tVar, iVar);
        s sVar = ((c0) tVar).f1110d;
        if (sVar == s.f1181b || sVar.compareTo(s.f1183d) >= 0) {
            iVar.R();
        } else {
            tVar.a(new j(tVar, iVar));
        }
        e1 e1VarB = (!zIsAssignableFrom || application == null) ? c1.b(cls, constructorA, v0VarB) : c1.b(cls, constructorA, application, v0VarB);
        e1VarB.a("androidx.lifecycle.savedstate.vm.tag", w0Var);
        return e1VarB;
    }
}
