package androidx.lifecycle;

import D1.c;
import androidx.lifecycle.AbstractC1781n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: LegacySavedStateHandleController.kt */
/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1778k {

    /* compiled from: LegacySavedStateHandleController.kt */
    /* renamed from: androidx.lifecycle.k$a */
    public static final class a implements c.a {
        @Override // D1.c.a
        public final void a(D1.e eVar) {
            if (!(eVar instanceof j0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            i0 viewModelStore = ((j0) eVar).getViewModelStore();
            D1.c savedStateRegistry = eVar.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f16160a;
            Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                kotlin.jvm.internal.l.f(key, "key");
                b0 b0Var = (b0) linkedHashMap.get(key);
                kotlin.jvm.internal.l.c(b0Var);
                C1778k.a(b0Var, savedStateRegistry, eVar.getLifecycle());
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    public static final void a(b0 b0Var, D1.c registry, AbstractC1781n lifecycle) {
        kotlin.jvm.internal.l.f(registry, "registry");
        kotlin.jvm.internal.l.f(lifecycle, "lifecycle");
        T t10 = (T) b0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (t10 == null || t10.f16100d) {
            return;
        }
        t10.a(registry, lifecycle);
        AbstractC1781n.b currentState = lifecycle.getCurrentState();
        if (currentState == AbstractC1781n.b.INITIALIZED || currentState.isAtLeast(AbstractC1781n.b.STARTED)) {
            registry.d();
        } else {
            lifecycle.addObserver(new C1779l(registry, lifecycle));
        }
    }
}
