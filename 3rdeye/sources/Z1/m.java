package Z1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class m extends f<X1.c> {

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f14005g;

    public m(Context context, e2.c cVar) {
        super(context, cVar);
        Object systemService = this.f13996b.getSystemService("connectivity");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f14005g = (ConnectivityManager) systemService;
    }

    @Override // Z1.h
    public final Object a() {
        return l.a(this.f14005g);
    }

    @Override // Z1.f
    public final IntentFilter e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // Z1.f
    public final void f(Intent intent) {
        if (kotlin.jvm.internal.l.b(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            androidx.work.m.e().a(l.f14004a, "Network broadcast received");
            b(l.a(this.f14005g));
        }
    }
}
