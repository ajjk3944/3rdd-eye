package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class se extends ConnectivityManager.NetworkCallback {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15994c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15995a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15996b;

    public /* synthetic */ se(int i4, Object obj) {
        this.f15995a = i4;
        this.f15996b = obj;
    }

    private final void a(Network network, NetworkCapabilities networkCapabilities) {
        z11 z11Var = (z11) this.f15996b;
        synchronized (z11Var) {
            z11Var.f18962c = networkCapabilities;
        }
    }

    private final void b(Network network) {
        z11 z11Var = (z11) this.f15996b;
        synchronized (z11Var) {
            z11Var.f18962c = null;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f15995a) {
            case 1:
                ((zw) this.f15996b).f19206p.set(true);
                break;
            case 2:
                ((gt0) this.f15996b).b(true);
                break;
            case 3:
                ((mt0) this.f15996b).c(true);
                break;
            case 4:
            default:
                super.onAvailable(network);
                break;
            case 5:
                t8.m.f().post(new bi.a(6, this, true));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) throws Exception {
        switch (this.f15995a) {
            case 0:
                synchronized (te.class) {
                    ((te) this.f15996b).f16792a = networkCapabilities;
                }
                return;
            case 4:
                a(network, networkCapabilities);
                return;
            case 6:
                nk.k.e(network, "network");
                nk.k.e(networkCapabilities, "networkCapabilities");
                t6.v.e().a(x6.i.f36992a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((b7.b) this.f15996b).invoke(x6.a.f36977a);
                return;
            case 7:
                nk.k.e(network, "network");
                nk.k.e(networkCapabilities, "capabilities");
                t6.v.e().a(z6.i.f37967a, "Network capabilities changed: " + networkCapabilities);
                z6.h hVar = (z6.h) this.f15996b;
                hVar.b(Build.VERSION.SDK_INT >= 28 ? new x6.e(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : z6.i.a(hVar.f37966f));
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) throws Exception {
        switch (this.f15995a) {
            case 0:
                synchronized (te.class) {
                    ((te) this.f15996b).f16792a = null;
                }
                return;
            case 1:
                ((zw) this.f15996b).f19206p.set(false);
                return;
            case 2:
                ((gt0) this.f15996b).b(false);
                return;
            case 3:
                ((mt0) this.f15996b).c(false);
                return;
            case 4:
                b(network);
                return;
            case 5:
                t8.m.f().post(new bi.a(6, this, false));
                return;
            case 6:
                nk.k.e(network, "network");
                t6.v.e().a(x6.i.f36992a, "NetworkRequestConstraintController onLost callback");
                ((b7.b) this.f15996b).invoke(new x6.b(7));
                return;
            default:
                nk.k.e(network, "network");
                t6.v.e().a(z6.i.f37967a, "Network connection lost");
                z6.h hVar = (z6.h) this.f15996b;
                hVar.b(z6.i.a(hVar.f37966f));
                return;
        }
    }

    public se(zw zwVar) {
        this.f15995a = 1;
        Objects.requireNonNull(zwVar);
        this.f15996b = zwVar;
    }

    public se(gt0 gt0Var) {
        this.f15995a = 2;
        Objects.requireNonNull(gt0Var);
        this.f15996b = gt0Var;
    }

    public se(mt0 mt0Var) {
        this.f15995a = 3;
        Objects.requireNonNull(mt0Var);
        this.f15996b = mt0Var;
    }

    public se(b7.b bVar) {
        this.f15995a = 6;
        this.f15996b = bVar;
    }
}
