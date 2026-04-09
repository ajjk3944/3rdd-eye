package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.P;
import b2.AbstractC4056a;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.AbstractC6492s;
import q2.C7416d;
import q2.InterfaceC7418f;

/* loaded from: classes.dex */
public final class K extends P.e implements P.c {

    /* renamed from: b, reason: collision with root package name */
    private Application f31614b;

    /* renamed from: c, reason: collision with root package name */
    private final P.c f31615c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f31616d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC4013k f31617e;

    /* renamed from: f, reason: collision with root package name */
    private C7416d f31618f;

    public K(Application application, InterfaceC7418f owner, Bundle bundle) {
        AbstractC6492s.i(owner, "owner");
        this.f31618f = owner.t();
        this.f31617e = owner.O();
        this.f31616d = bundle;
        this.f31614b = application;
        this.f31615c = application != null ? P.a.f31626f.a(application) : new P.a();
    }

    @Override // androidx.lifecycle.P.c
    public N a(Class modelClass) {
        AbstractC6492s.i(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.P.c
    public N b(Class modelClass, AbstractC4056a extras) {
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(extras, "extras");
        String str = (String) extras.a(P.d.f31634d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(H.f31605a) == null || extras.a(H.f31606b) == null) {
            if (this.f31617e != null) {
                return e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(P.a.f31628h);
        boolean zIsAssignableFrom = AbstractC4004b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? L.c(modelClass, L.f31620b) : L.c(modelClass, L.f31619a);
        return constructorC == null ? this.f31615c.b(modelClass, extras) : (!zIsAssignableFrom || application == null) ? L.d(modelClass, constructorC, H.a(extras)) : L.d(modelClass, constructorC, application, H.a(extras));
    }

    @Override // androidx.lifecycle.P.e
    public void d(N viewModel) {
        AbstractC6492s.i(viewModel, "viewModel");
        if (this.f31617e != null) {
            C7416d c7416d = this.f31618f;
            AbstractC6492s.f(c7416d);
            AbstractC4013k abstractC4013k = this.f31617e;
            AbstractC6492s.f(abstractC4013k);
            C4012j.a(viewModel, c7416d, abstractC4013k);
        }
    }

    public final N e(String key, Class modelClass) throws Exception {
        N nD;
        Application application;
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC4013k abstractC4013k = this.f31617e;
        if (abstractC4013k == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC4004b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f31614b == null) ? L.c(modelClass, L.f31620b) : L.c(modelClass, L.f31619a);
        if (constructorC == null) {
            return this.f31614b != null ? this.f31615c.a(modelClass) : P.d.f31632b.a().a(modelClass);
        }
        C7416d c7416d = this.f31618f;
        AbstractC6492s.f(c7416d);
        G gB = C4012j.b(c7416d, abstractC4013k, key, this.f31616d);
        if (!zIsAssignableFrom || (application = this.f31614b) == null) {
            nD = L.d(modelClass, constructorC, gB.s());
        } else {
            AbstractC6492s.f(application);
            nD = L.d(modelClass, constructorC, application, gB.s());
        }
        nD.T("androidx.lifecycle.savedstate.vm.tag", gB);
        return nD;
    }
}
