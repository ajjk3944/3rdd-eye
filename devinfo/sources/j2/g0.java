package j2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n2.d f27143a;

    public g0(n2.d dVar) {
        this.f27143a = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        n2.d dVar = this.f27143a;
        synchronized (dVar) {
            dVar.f29565a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        n2.d dVar = this.f27143a;
        synchronized (dVar) {
            dVar.f29565a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        n2.d dVar = this.f27143a;
        synchronized (dVar) {
            dVar.f29565a.c();
        }
    }
}
