package y1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class k0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2.d f25726a;

    public k0(c2.d dVar) {
        this.f25726a = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        c2.d dVar = this.f25726a;
        synchronized (dVar) {
            dVar.f3135a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        c2.d dVar = this.f25726a;
        synchronized (dVar) {
            dVar.f3135a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        c2.d dVar = this.f25726a;
        synchronized (dVar) {
            dVar.f3135a.c();
        }
    }
}
