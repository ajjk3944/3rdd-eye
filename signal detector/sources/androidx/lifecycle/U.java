package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class U implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final Application f5218a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f5219b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f5220c;

    /* renamed from: d, reason: collision with root package name */
    public final C0300w f5221d;

    /* renamed from: e, reason: collision with root package name */
    public final F0.f f5222e;

    public U(Application application, F0.g gVar, Bundle bundle) {
        Y y3;
        this.f5222e = gVar.f();
        this.f5221d = gVar.j();
        this.f5220c = bundle;
        this.f5218a = application;
        if (application != null) {
            if (Y.f5230d == null) {
                Y.f5230d = new Y(application);
            }
            y3 = Y.f5230d;
            q5.i.b(y3);
        } else {
            y3 = new Y(null);
        }
        this.f5219b = y3;
    }

    @Override // androidx.lifecycle.Z
    public final X a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.Z
    public final /* synthetic */ X b(q5.d dVar, n0.d dVar2) {
        return A.f.a(this, dVar, dVar2);
    }

    @Override // androidx.lifecycle.Z
    public final X c(Class cls, n0.d dVar) {
        LinkedHashMap linkedHashMap = dVar.f22143a;
        String str = (String) linkedHashMap.get(o0.c.f22669a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(Q.f5209a) == null || linkedHashMap.get(Q.f5210b) == null) {
            if (this.f5221d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(Y.f5231e);
        boolean zIsAssignableFrom = AbstractC0279a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? V.a(cls, V.f5224b) : V.a(cls, V.f5223a);
        return constructorA == null ? this.f5219b.c(cls, dVar) : (!zIsAssignableFrom || application == null) ? V.b(cls, constructorA, Q.d(dVar)) : V.b(cls, constructorA, application, Q.d(dVar));
    }

    public final X d(Class cls, String str) {
        C0300w c0300w = this.f5221d;
        if (c0300w == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0279a.class.isAssignableFrom(cls);
        Application application = this.f5218a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? V.a(cls, V.f5224b) : V.a(cls, V.f5223a);
        if (constructorA == null) {
            if (application != null) {
                return this.f5219b.a(cls);
            }
            if (P.f5207b == null) {
                P.f5207b = new P(1);
            }
            q5.i.b(P.f5207b);
            return com.bumptech.glide.c.j(cls);
        }
        F0.f fVar = this.f5222e;
        q5.i.b(fVar);
        O oB = Q.b(fVar, c0300w, str, this.f5220c);
        N n6 = oB.f5205b;
        X xB = (!zIsAssignableFrom || application == null) ? V.b(cls, constructorA, n6) : V.b(cls, constructorA, application, n6);
        xB.a("androidx.lifecycle.savedstate.vm.tag", oB);
        return xB;
    }
}
