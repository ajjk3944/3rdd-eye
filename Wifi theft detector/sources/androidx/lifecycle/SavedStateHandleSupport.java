package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f0;
import androidx.savedstate.a;
import k1.a;

/* loaded from: classes.dex */
public abstract class SavedStateHandleSupport {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f3472a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f3473b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a.b f3474c = new a();

    public static final class a implements a.b {
    }

    public static final class b implements a.b {
    }

    public static final class c implements a.b {
    }

    public static final z a(k1.a aVar) {
        kotlin.jvm.internal.p.e(aVar, "<this>");
        t1.d dVar = (t1.d) aVar.a(f3472a);
        if (dVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        j0 j0Var = (j0) aVar.a(f3473b);
        if (j0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f3474c);
        String str = (String) aVar.a(f0.c.f3518c);
        if (str != null) {
            return b(dVar, j0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final z b(t1.d dVar, j0 j0Var, String str, Bundle bundle) {
        SavedStateHandlesProvider savedStateHandlesProviderD = d(dVar);
        a0 a0VarE = e(j0Var);
        z zVar = (z) a0VarE.f().get(str);
        if (zVar != null) {
            return zVar;
        }
        z zVarA = z.f3553f.a(savedStateHandlesProviderD.b(str), bundle);
        a0VarE.f().put(str, zVarA);
        return zVarA;
    }

    public static final void c(t1.d dVar) {
        kotlin.jvm.internal.p.e(dVar, "<this>");
        Lifecycle.State stateB = dVar.getLifecycle().b();
        if (stateB != Lifecycle.State.INITIALIZED && stateB != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(dVar.getSavedStateRegistry(), (j0) dVar);
            dVar.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            dVar.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesProvider d(t1.d dVar) {
        kotlin.jvm.internal.p.e(dVar, "<this>");
        a.c cVarC = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        SavedStateHandlesProvider savedStateHandlesProvider = cVarC instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) cVarC : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final a0 e(j0 j0Var) {
        kotlin.jvm.internal.p.e(j0Var, "<this>");
        k1.c cVar = new k1.c();
        cVar.a(kotlin.jvm.internal.t.b(a0.class), new l9.l() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1
            @Override // l9.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a0 invoke(k1.a initializer) {
                kotlin.jvm.internal.p.e(initializer, "$this$initializer");
                return new a0();
            }
        });
        return (a0) new f0(j0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", a0.class);
    }
}
