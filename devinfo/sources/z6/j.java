package z6;

import a0.x0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends d {
    public final ConnectivityManager g;

    public j(Context context, x0 x0Var) {
        super(context, x0Var);
        Object systemService = this.f37961b.getSystemService("connectivity");
        nk.k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.g = (ConnectivityManager) systemService;
    }

    @Override // z6.f
    public final Object a() {
        return i.a(this.g);
    }

    @Override // z6.d
    public final IntentFilter e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // z6.d
    public final void f(Intent intent) {
        if (nk.k.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            v.e().a(i.f37967a, "Network broadcast received");
            b(i.a(this.g));
        }
    }
}
