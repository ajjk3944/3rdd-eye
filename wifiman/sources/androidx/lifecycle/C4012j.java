package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC4013k;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import q2.C7416d;
import q2.InterfaceC7418f;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4012j {

    /* renamed from: a, reason: collision with root package name */
    public static final C4012j f31654a = new C4012j();

    /* renamed from: androidx.lifecycle.j$a */
    public static final class a implements C7416d.a {
        @Override // q2.C7416d.a
        public void a(InterfaceC7418f owner) throws NoSuchMethodException, SecurityException {
            AbstractC6492s.i(owner, "owner");
            if (!(owner instanceof S)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            Q qO = ((S) owner).o();
            C7416d c7416dT = owner.t();
            Iterator it = qO.c().iterator();
            while (it.hasNext()) {
                N nB = qO.b((String) it.next());
                AbstractC6492s.f(nB);
                C4012j.a(nB, c7416dT, owner.O());
            }
            if (qO.c().isEmpty()) {
                return;
            }
            c7416dT.i(a.class);
        }
    }

    /* renamed from: androidx.lifecycle.j$b */
    public static final class b implements InterfaceC4015m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4013k f31655a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7416d f31656b;

        b(AbstractC4013k abstractC4013k, C7416d c7416d) {
            this.f31655a = abstractC4013k;
            this.f31656b = c7416d;
        }

        @Override // androidx.lifecycle.InterfaceC4015m
        public void j(InterfaceC4017o source, AbstractC4013k.a event) throws NoSuchMethodException, SecurityException {
            AbstractC6492s.i(source, "source");
            AbstractC6492s.i(event, "event");
            if (event == AbstractC4013k.a.ON_START) {
                this.f31655a.c(this);
                this.f31656b.i(a.class);
            }
        }
    }

    private C4012j() {
    }

    public static final void a(N viewModel, C7416d registry, AbstractC4013k lifecycle) {
        AbstractC6492s.i(viewModel, "viewModel");
        AbstractC6492s.i(registry, "registry");
        AbstractC6492s.i(lifecycle, "lifecycle");
        G g10 = (G) viewModel.V("androidx.lifecycle.savedstate.vm.tag");
        if (g10 == null || g10.v()) {
            return;
        }
        g10.a(registry, lifecycle);
        f31654a.c(registry, lifecycle);
    }

    public static final G b(C7416d registry, AbstractC4013k lifecycle, String str, Bundle bundle) {
        AbstractC6492s.i(registry, "registry");
        AbstractC6492s.i(lifecycle, "lifecycle");
        AbstractC6492s.f(str);
        G g10 = new G(str, E.f31594f.a(registry.b(str), bundle));
        g10.a(registry, lifecycle);
        f31654a.c(registry, lifecycle);
        return g10;
    }

    private final void c(C7416d c7416d, AbstractC4013k abstractC4013k) throws NoSuchMethodException, SecurityException {
        AbstractC4013k.b bVarB = abstractC4013k.b();
        if (bVarB == AbstractC4013k.b.INITIALIZED || bVarB.isAtLeast(AbstractC4013k.b.STARTED)) {
            c7416d.i(a.class);
        } else {
            abstractC4013k.a(new b(abstractC4013k, c7416d));
        }
    }
}
