package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ra0 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                i30.m(network, "network");
                super.onAvailable(network);
                MainActivity mainActivity = (MainActivity) this.b;
                int[] iArr = MainActivity.d0;
                synchronized (mainActivity) {
                    new Thread(new la0(mainActivity, 6)).start();
                }
                return;
            case 1:
            case 2:
            default:
                super.onAvailable(network);
                return;
            case 3:
                ((gd2) this.b).p.set(true);
                return;
            case 4:
                ((gb3) this.b).a(true);
                return;
            case 5:
                ((nb3) this.b).b(true);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 1:
                h80 h80VarD = h80.d();
                String str = zg0.i;
                Objects.toString(networkCapabilities);
                h80VarD.a(new Throwable[0]);
                zg0 zg0Var = (zg0) this.b;
                zg0Var.c(zg0Var.f());
                return;
            case 2:
                synchronized (zs1.class) {
                    ((zs1) this.b).g = networkCapabilities;
                }
                return;
            case 6:
                ak3 ak3Var = (ak3) this.b;
                synchronized (ak3Var) {
                    ak3Var.c = networkCapabilities;
                }
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.a) {
            case 0:
                i30.m(network, "network");
                i30.m(linkProperties, "linkProperties");
                super.onLinkPropertiesChanged(network, linkProperties);
                MainActivity mainActivity = (MainActivity) this.b;
                mainActivity.V.clear();
                mainActivity.V.addAll(linkProperties.getLinkAddresses());
                ConnectivityManager connectivityManager = mainActivity.F;
                if (connectivityManager == null) {
                    i30.S("conMgr");
                    throw null;
                }
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        MainActivity.x(mainActivity, 1);
                        return;
                    } else if (networkCapabilities.hasTransport(0)) {
                        MainActivity.x(mainActivity, 0);
                        return;
                    } else {
                        if (networkCapabilities.hasTransport(2)) {
                            MainActivity.x(mainActivity, 2);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        boolean z = false;
        switch (this.a) {
            case 0:
                i30.m(network, "network");
                super.onLost(network);
                MainActivity mainActivity = (MainActivity) this.b;
                ConnectivityManager connectivityManager = mainActivity.F;
                if (connectivityManager == null) {
                    i30.S("conMgr");
                    throw null;
                }
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                int i = 1;
                if (networkCapabilities == null || !(networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2))) {
                    mainActivity.A();
                    mainActivity.runOnUiThread(new na0(z, mainActivity, i));
                    return;
                }
                return;
            case 1:
                h80 h80VarD = h80.d();
                String str = zg0.i;
                h80VarD.a(new Throwable[0]);
                zg0 zg0Var = (zg0) this.b;
                zg0Var.c(zg0Var.f());
                return;
            case 2:
                synchronized (zs1.class) {
                    ((zs1) this.b).g = null;
                }
                return;
            case 3:
                ((gd2) this.b).p.set(false);
                return;
            case 4:
                ((gb3) this.b).a(false);
                return;
            case 5:
                ((nb3) this.b).b(false);
                return;
            default:
                ak3 ak3Var = (ak3) this.b;
                synchronized (ak3Var) {
                    ak3Var.c = null;
                }
                return;
        }
    }

    public ra0(gd2 gd2Var) {
        this.a = 3;
        Objects.requireNonNull(gd2Var);
        this.b = gd2Var;
    }

    public ra0(gb3 gb3Var) {
        this.a = 4;
        Objects.requireNonNull(gb3Var);
        this.b = gb3Var;
    }

    public ra0(nb3 nb3Var) {
        this.a = 5;
        Objects.requireNonNull(nb3Var);
        this.b = nb3Var;
    }
}
