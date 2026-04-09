package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bt0 implements p61 {
    public final Application f;
    public final o61 g;
    public final Bundle h;
    public final d60 i;
    public final vq2 j;

    public bt0(Application application, at0 at0Var, Bundle bundle) {
        o61 o61Var;
        this.j = at0Var.a();
        this.i = at0Var.e();
        this.h = bundle;
        this.f = application;
        if (application != null) {
            if (o61.k == null) {
                o61.k = new o61(application);
            }
            o61Var = o61.k;
            i30.j(o61Var);
        } else {
            o61Var = new o61(null);
        }
        this.g = o61Var;
    }

    public final m61 a(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        d60 d60Var = this.i;
        if (d60Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = z3.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f == null) ? ct0.a(cls, ct0.b) : ct0.a(cls, ct0.a);
        if (constructorA == null) {
            if (this.f != null) {
                return this.g.b(cls);
            }
            if (us0.g == null) {
                us0.g = new us0();
            }
            i30.j(us0.g);
            return yb.i(cls);
        }
        vq2 vq2Var = this.j;
        i30.j(vq2Var);
        qs0 qs0VarF = wl2.f(vq2Var.e(str), this.h);
        rs0 rs0Var = new rs0(str, qs0VarF);
        rs0Var.c(vq2Var, d60Var);
        u50 u50Var = d60Var.c;
        if (u50Var == u50.g || u50Var.compareTo(u50.i) >= 0) {
            vq2Var.r();
        } else {
            d60Var.a(new nn(d60Var, vq2Var, 1));
        }
        m61 m61VarB = (!zIsAssignableFrom || (application = this.f) == null) ? ct0.b(cls, constructorA, qs0VarF) : ct0.b(cls, constructorA, application, qs0VarF);
        m61VarB.getClass();
        n61 n61Var = m61VarB.a;
        if (n61Var == null) {
            return m61VarB;
        }
        if (n61Var.d) {
            n61.a(rs0Var);
            return m61VarB;
        }
        synchronized (n61Var.a) {
            autoCloseable = (AutoCloseable) n61Var.b.put("androidx.lifecycle.savedstate.vm.tag", rs0Var);
        }
        n61.a(autoCloseable);
        return m61VarB;
    }

    @Override // defpackage.p61
    public final m61 b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.p61
    public final m61 h(Class cls, mf0 mf0Var) {
        LinkedHashMap linkedHashMap = mf0Var.a;
        String str = (String) linkedHashMap.get(ug0.h);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(g82.g) == null || linkedHashMap.get(g82.h) == null) {
            if (this.i != null) {
                return a(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(o61.l);
        boolean zIsAssignableFrom = z3.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? ct0.a(cls, ct0.b) : ct0.a(cls, ct0.a);
        return constructorA == null ? this.g.h(cls, mf0Var) : (!zIsAssignableFrom || application == null) ? ct0.b(cls, constructorA, g82.f(mf0Var)) : ct0.b(cls, constructorA, application, g82.f(mf0Var));
    }

    @Override // defpackage.p61
    public final m61 l(hf hfVar, mf0 mf0Var) {
        return h(m54.h(hfVar), mf0Var);
    }
}
