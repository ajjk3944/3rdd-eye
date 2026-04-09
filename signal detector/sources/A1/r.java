package A1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import c1.C0401e;
import com.google.android.gms.internal.ads.C0538Hf;
import com.google.android.gms.internal.ads.C1517mA;
import com.google.android.gms.internal.ads.Cv;
import com.google.android.gms.internal.ads.Iv;
import com.google.android.gms.internal.ads.L6;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class r extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121b;

    public /* synthetic */ r(int i, Object obj) {
        this.f120a = i;
        this.f121b = obj;
    }

    private final void a(Network network, NetworkCapabilities networkCapabilities) {
        C1517mA c1517mA = (C1517mA) this.f121b;
        synchronized (c1517mA) {
            c1517mA.f15592c = networkCapabilities;
        }
    }

    private final void b(Network network) {
        synchronized (L6.class) {
            ((L6) this.f121b).f9620b = null;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f120a) {
            case 0:
                H1.p.f().post(new q(this, true, 0));
                break;
            case 1:
            case 2:
            default:
                super.onAvailable(network);
                break;
            case 3:
                ((C0538Hf) this.f121b).f8982p.set(true);
                break;
            case 4:
                ((Cv) this.f121b).a(true);
                break;
            case 5:
                ((Iv) this.f121b).b(true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f120a) {
            case 1:
                V0.m.f().a(C0401e.f5890j, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                C0401e c0401e = (C0401e) this.f121b;
                c0401e.c(c0401e.f());
                return;
            case 2:
                synchronized (L6.class) {
                    ((L6) this.f121b).f9620b = networkCapabilities;
                }
                return;
            case 6:
                a(network, networkCapabilities);
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f120a) {
            case 0:
                H1.p.f().post(new q(this, false, 0));
                return;
            case 1:
                V0.m.f().a(C0401e.f5890j, "Network connection lost", new Throwable[0]);
                C0401e c0401e = (C0401e) this.f121b;
                c0401e.c(c0401e.f());
                return;
            case 2:
                b(network);
                return;
            case 3:
                ((C0538Hf) this.f121b).f8982p.set(false);
                return;
            case 4:
                ((Cv) this.f121b).a(false);
                return;
            case 5:
                ((Iv) this.f121b).b(false);
                return;
            default:
                C1517mA c1517mA = (C1517mA) this.f121b;
                synchronized (c1517mA) {
                    c1517mA.f15592c = null;
                }
                return;
        }
    }

    public r(C0538Hf c0538Hf) {
        this.f120a = 3;
        Objects.requireNonNull(c0538Hf);
        this.f121b = c0538Hf;
    }

    public r(Cv cv) {
        this.f120a = 4;
        Objects.requireNonNull(cv);
        this.f121b = cv;
    }

    public r(Iv iv) {
        this.f120a = 5;
        Objects.requireNonNull(iv);
        this.f121b = iv;
    }
}
