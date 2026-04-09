package iq;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import br.a0;
import br.l;
import kg.r;

/* loaded from: classes.dex */
public final class c implements ComponentCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12923a;

    public c(r rVar) {
        this.f12923a = rVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        l.e(configuration, "newConfig");
        vn.b bVar = configuration.orientation == 2 ? vn.b.LANDSCAPE : vn.b.PORTRAIT;
        r rVar = this.f12923a;
        if (bVar == ((vn.b) rVar.f14398r)) {
            return;
        }
        ((sm.f) ((no.b) rVar.f14396d)).M("screen orientation changed to: " + bVar);
        ((a0) rVar.f14397g).g(bVar);
        rVar.f14398r = bVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
