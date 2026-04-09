package Z1;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class k extends h<X1.c> {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f14002f;

    /* renamed from: g, reason: collision with root package name */
    public final j f14003g;

    public k(Context context, e2.c cVar) {
        super(context, cVar);
        Object systemService = this.f13996b.getSystemService("connectivity");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f14002f = (ConnectivityManager) systemService;
        this.f14003g = new j(this);
    }

    @Override // Z1.h
    public final X1.c a() {
        return l.a(this.f14002f);
    }

    @Override // Z1.h
    public final void c() {
        try {
            androidx.work.m.e().a(l.f14004a, "Registering network callback");
            c2.n.a(this.f14002f, this.f14003g);
        } catch (IllegalArgumentException e4) {
            androidx.work.m.e().d(l.f14004a, "Received exception while registering network callback", e4);
        } catch (SecurityException e10) {
            androidx.work.m.e().d(l.f14004a, "Received exception while registering network callback", e10);
        }
    }

    @Override // Z1.h
    public final void d() {
        try {
            androidx.work.m.e().a(l.f14004a, "Unregistering network callback");
            c2.l.c(this.f14002f, this.f14003g);
        } catch (IllegalArgumentException e4) {
            androidx.work.m.e().d(l.f14004a, "Received exception while unregistering network callback", e4);
        } catch (SecurityException e10) {
            androidx.work.m.e().d(l.f14004a, "Received exception while unregistering network callback", e10);
        }
    }
}
