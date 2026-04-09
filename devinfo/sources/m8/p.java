package m8;

import android.net.ConnectivityManager;
import android.util.Log;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.ads.se;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f28969a;

    /* renamed from: b, reason: collision with root package name */
    public final n f28970b;

    /* renamed from: c, reason: collision with root package name */
    public final hp f28971c;

    /* renamed from: d, reason: collision with root package name */
    public final se f28972d = new se(5, this);

    public p(hp hpVar, n nVar) {
        this.f28971c = hpVar;
        this.f28970b = nVar;
    }

    @Override // m8.o
    public final boolean a() {
        hp hpVar = this.f28971c;
        this.f28969a = ((ConnectivityManager) hpVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) hpVar.get()).registerDefaultNetworkCallback(this.f28972d);
            return true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e2);
            }
            return false;
        }
    }

    @Override // m8.o
    public final void b() {
        ((ConnectivityManager) this.f28971c.get()).unregisterNetworkCallback(this.f28972d);
    }
}
