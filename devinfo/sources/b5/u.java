package b5;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f1876a;

    public u(z zVar) {
        this.f1876a = zVar;
    }

    @Override // b5.y
    public final void a() {
        z zVar = this.f1876a;
        zVar.U.n();
        androidx.lifecycle.y0.d(zVar);
        Bundle bundle = zVar.f1930b;
        zVar.U.q(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
