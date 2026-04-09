package no;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import br.a0;
import br.l;
import f5.h;

/* loaded from: classes.dex */
public final class d extends ConnectivityManager.NetworkCallback implements c {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f18469a;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f18470d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18471g;

    public d(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.f18469a = new a0(2, false);
        this.f18470d = new Handler(Looper.getMainLooper());
        boolean z10 = false;
        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12)) {
            z10 = true;
        }
        this.f18471g = z10;
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(this);
        }
    }

    @Override // no.c
    public final boolean e() {
        return this.f18471g;
    }

    @Override // no.c
    public final a0 h() {
        return this.f18469a;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        l.e(network, "network");
        super.onAvailable(network);
        if (this.f18471g) {
            return;
        }
        this.f18471g = true;
        this.f18470d.post(new h(this, true, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        l.e(network, "network");
        super.onLost(network);
        if (this.f18471g) {
            this.f18471g = false;
            this.f18470d.post(new h(this, false, 1));
        }
    }
}
