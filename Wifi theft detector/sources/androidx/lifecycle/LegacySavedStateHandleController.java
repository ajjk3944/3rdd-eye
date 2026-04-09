package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a, reason: collision with root package name */
    public static final LegacySavedStateHandleController f3423a = new LegacySavedStateHandleController();

    public static final class a implements a.InterfaceC0046a {
        @Override // androidx.savedstate.a.InterfaceC0046a
        public void a(t1.d owner) throws NoSuchMethodException, SecurityException {
            kotlin.jvm.internal.p.e(owner, "owner");
            if (!(owner instanceof j0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            i0 viewModelStore = ((j0) owner).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                e0 e0VarB = viewModelStore.b((String) it.next());
                kotlin.jvm.internal.p.b(e0VarB);
                LegacySavedStateHandleController.a(e0VarB, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    public static final void a(e0 viewModel, androidx.savedstate.a registry, Lifecycle lifecycle) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.p.e(viewModel, "viewModel");
        kotlin.jvm.internal.p.e(registry, "registry");
        kotlin.jvm.internal.p.e(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.getIsAttached()) {
            return;
        }
        savedStateHandleController.g(registry, lifecycle);
        f3423a.c(registry, lifecycle);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a registry, Lifecycle lifecycle, String str, Bundle bundle) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.p.e(registry, "registry");
        kotlin.jvm.internal.p.e(lifecycle, "lifecycle");
        kotlin.jvm.internal.p.b(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, z.f3553f.a(registry.b(str), bundle));
        savedStateHandleController.g(registry, lifecycle);
        f3423a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    public final void c(final androidx.savedstate.a aVar, final Lifecycle lifecycle) throws NoSuchMethodException, SecurityException {
        Lifecycle.State stateB = lifecycle.b();
        if (stateB == Lifecycle.State.INITIALIZED || stateB.f(Lifecycle.State.STARTED)) {
            aVar.i(a.class);
        } else {
            lifecycle.a(new j() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.j
                public void onStateChanged(n source, Lifecycle.Event event) throws NoSuchMethodException, SecurityException {
                    kotlin.jvm.internal.p.e(source, "source");
                    kotlin.jvm.internal.p.e(event, "event");
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.d(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
