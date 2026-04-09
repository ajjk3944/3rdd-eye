package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.f0;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class b0 extends f0.d implements f0.b {

    /* renamed from: a, reason: collision with root package name */
    public Application f3492a;

    /* renamed from: b, reason: collision with root package name */
    public final f0.b f3493b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3494c;

    /* renamed from: d, reason: collision with root package name */
    public Lifecycle f3495d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.savedstate.a f3496e;

    public b0(Application application, t1.d owner, Bundle bundle) {
        kotlin.jvm.internal.p.e(owner, "owner");
        this.f3496e = owner.getSavedStateRegistry();
        this.f3495d = owner.getLifecycle();
        this.f3494c = bundle;
        this.f3492a = application;
        this.f3493b = application != null ? f0.a.f3511e.a(application) : new f0.a();
    }

    @Override // androidx.lifecycle.f0.b
    public e0 a(Class modelClass) {
        kotlin.jvm.internal.p.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.f0.b
    public e0 b(Class modelClass, k1.a extras) {
        kotlin.jvm.internal.p.e(modelClass, "modelClass");
        kotlin.jvm.internal.p.e(extras, "extras");
        String str = (String) extras.a(f0.c.f3518c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(SavedStateHandleSupport.f3472a) == null || extras.a(SavedStateHandleSupport.f3473b) == null) {
            if (this.f3495d != null) {
                return d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(f0.a.f3513g);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? c0.c(modelClass, c0.f3498b) : c0.c(modelClass, c0.f3497a);
        return constructorC == null ? this.f3493b.b(modelClass, extras) : (!zIsAssignableFrom || application == null) ? c0.d(modelClass, constructorC, SavedStateHandleSupport.a(extras)) : c0.d(modelClass, constructorC, application, SavedStateHandleSupport.a(extras));
    }

    @Override // androidx.lifecycle.f0.d
    public void c(e0 viewModel) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.p.e(viewModel, "viewModel");
        if (this.f3495d != null) {
            androidx.savedstate.a aVar = this.f3496e;
            kotlin.jvm.internal.p.b(aVar);
            Lifecycle lifecycle = this.f3495d;
            kotlin.jvm.internal.p.b(lifecycle);
            LegacySavedStateHandleController.a(viewModel, aVar, lifecycle);
        }
    }

    public final e0 d(String key, Class modelClass) throws NoSuchMethodException, SecurityException, IOException {
        e0 e0VarD;
        Application application;
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(modelClass, "modelClass");
        Lifecycle lifecycle = this.f3495d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f3492a == null) ? c0.c(modelClass, c0.f3498b) : c0.c(modelClass, c0.f3497a);
        if (constructorC == null) {
            return this.f3492a != null ? this.f3493b.a(modelClass) : f0.c.f3516a.a().a(modelClass);
        }
        androidx.savedstate.a aVar = this.f3496e;
        kotlin.jvm.internal.p.b(aVar);
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(aVar, lifecycle, key, this.f3494c);
        if (!zIsAssignableFrom || (application = this.f3492a) == null) {
            e0VarD = c0.d(modelClass, constructorC, savedStateHandleControllerB.getHandle());
        } else {
            kotlin.jvm.internal.p.b(application);
            e0VarD = c0.d(modelClass, constructorC, application, savedStateHandleControllerB.getHandle());
        }
        e0VarD.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return e0VarD;
    }
}
