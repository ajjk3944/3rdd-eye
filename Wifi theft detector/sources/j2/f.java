package j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.k;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: j, reason: collision with root package name */
    public static final String f21729j = k.f("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f21730g;

    /* renamed from: h, reason: collision with root package name */
    public b f21731h;

    /* renamed from: i, reason: collision with root package name */
    public a f21732i;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            k.c().a(f.f21729j, "Network broadcast received", new Throwable[0]);
            f fVar = f.this;
            fVar.d(fVar.g());
        }
    }

    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            k.c().a(f.f21729j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            f fVar = f.this;
            fVar.d(fVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            k.c().a(f.f21729j, "Network connection lost", new Throwable[0]);
            f fVar = f.this;
            fVar.d(fVar.g());
        }
    }

    public f(Context context, o2.a aVar) {
        super(context, aVar);
        this.f21730g = (ConnectivityManager) this.f21723b.getSystemService("connectivity");
        if (j()) {
            this.f21731h = new b();
        } else {
            this.f21732i = new a();
        }
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // j2.d
    public void e() {
        if (!j()) {
            k.c().a(f21729j, "Registering broadcast receiver", new Throwable[0]);
            this.f21723b.registerReceiver(this.f21732i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            k.c().a(f21729j, "Registering network callback", new Throwable[0]);
            this.f21730g.registerDefaultNetworkCallback(this.f21731h);
        } catch (IllegalArgumentException | SecurityException e10) {
            k.c().b(f21729j, "Received exception while registering network callback", e10);
        }
    }

    @Override // j2.d
    public void f() {
        if (!j()) {
            k.c().a(f21729j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f21723b.unregisterReceiver(this.f21732i);
            return;
        }
        try {
            k.c().a(f21729j, "Unregistering network callback", new Throwable[0]);
            this.f21730g.unregisterNetworkCallback(this.f21731h);
        } catch (IllegalArgumentException | SecurityException e10) {
            k.c().b(f21729j, "Received exception while unregistering network callback", e10);
        }
    }

    public h2.b g() {
        NetworkInfo activeNetworkInfo = this.f21730g.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zI = i();
        boolean zA = ConnectivityManagerCompat.a(this.f21730g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new h2.b(z11, zI, zA, z10);
    }

    @Override // j2.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public h2.b b() {
        return g();
    }

    public boolean i() {
        try {
            NetworkCapabilities networkCapabilities = this.f21730g.getNetworkCapabilities(this.f21730g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e10) {
            k.c().b(f21729j, "Unable to validate active network", e10);
            return false;
        }
    }
}
