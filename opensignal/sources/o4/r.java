package o4;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.b4;

/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.b f18846a;

    public r(androidx.fragment.app.b bVar) {
        this.f18846a = bVar;
    }

    @Override // o4.v
    public final void a() {
        androidx.fragment.app.b bVar = this.f18846a;
        bVar.f1426q0.J();
        androidx.lifecycle.o0.b(bVar);
        Bundle bundle = bVar.f1411d;
        Bundle bundleF = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("registryState") : null;
        n7.b bVar2 = (n7.b) bVar.f1426q0.f11196a;
        l7.e eVar = bVar2.f17388a;
        if (!bVar2.f17392e) {
            bVar2.a();
        }
        if (eVar.h().e1().isAtLeast(androidx.lifecycle.n.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.h().e1()).toString());
        }
        if (bVar2.f17394g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleF = b4.F("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
        bVar2.f17393f = bundleF;
        bVar2.f17394g = true;
    }
}
