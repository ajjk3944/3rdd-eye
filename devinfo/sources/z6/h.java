package z6;

import a0.x0;
import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.internal.ads.se;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f37966f;
    public final se g;

    public h(Context context, x0 x0Var) {
        super(context, x0Var);
        Object systemService = this.f37961b.getSystemService("connectivity");
        nk.k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f37966f = (ConnectivityManager) systemService;
        this.g = new se(7, this);
    }

    @Override // z6.f
    public final Object a() {
        return i.a(this.f37966f);
    }

    @Override // z6.f
    public final void c() {
        try {
            v.e().a(i.f37967a, "Registering network callback");
            c7.f.a(this.f37966f, this.g);
        } catch (IllegalArgumentException e2) {
            v.e().d(i.f37967a, "Received exception while registering network callback", e2);
        } catch (SecurityException e10) {
            v.e().d(i.f37967a, "Received exception while registering network callback", e10);
        }
    }

    @Override // z6.f
    public final void d() {
        try {
            v.e().a(i.f37967a, "Unregistering network callback");
            this.f37966f.unregisterNetworkCallback(this.g);
        } catch (IllegalArgumentException e2) {
            v.e().d(i.f37967a, "Received exception while unregistering network callback", e2);
        } catch (SecurityException e10) {
            v.e().d(i.f37967a, "Received exception while unregistering network callback", e10);
        }
    }
}
