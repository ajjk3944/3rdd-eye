package fj;

import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final xj.j f8953a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8954b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8955c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8956d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8957e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8958f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f8959g = new ArrayList();

    public t(xj.j jVar) {
        this.f8953a = jVar;
    }

    public final void a(r rVar) {
        synchronized (this.f8956d) {
            if (!this.f8956d.contains(rVar)) {
                this.f8956d.add(rVar);
            }
        }
    }

    public final void b(n nVar) {
        synchronized (this.f8957e) {
            if (!this.f8957e.contains(nVar)) {
                this.f8957e.add(nVar);
            }
        }
    }

    public final void c(n nVar) {
        synchronized (this.f8955c) {
            if (!this.f8955c.contains(nVar)) {
                this.f8955c.add(nVar);
            }
        }
    }

    public final void d(List list) {
        ch.n.b("TelephonyPhoneStateUpdateReceiver", "onCellInfoChanged");
        ch.n.a();
        synchronized (this.f8958f) {
            Iterator it = this.f8958f.iterator();
            while (it.hasNext()) {
                ((q) it.next()).a(list);
            }
        }
    }

    public final void e(CellLocation cellLocation) {
        ch.n.b("TelephonyPhoneStateUpdateReceiver", "onCellLocationChanged() called");
        Objects.toString(cellLocation);
        ch.n.a();
        synchronized (this.f8959g) {
            Iterator it = this.f8959g.iterator();
            while (it.hasNext()) {
                ((p) it.next()).onCellLocationChanged(cellLocation);
            }
        }
    }

    public final void f(ServiceState serviceState) {
        ch.n.b("TelephonyPhoneStateUpdateReceiver", "onServiceStateChanged");
        ch.n.a();
        synchronized (this.f8954b) {
            Iterator it = this.f8954b.iterator();
            while (it.hasNext()) {
                ((s) it.next()).onServiceStateChanged(serviceState);
            }
        }
    }

    public final void g(SignalStrength signalStrength) {
        ch.n.b("TelephonyPhoneStateUpdateReceiver", "onSignalStrengthsChanged");
        ch.n.a();
        synchronized (this.f8955c) {
            Iterator it = this.f8955c.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                nVar.getClass();
                ch.n.b("TelephonyPhoneStateRepo", "Signal strengths changed: " + signalStrength);
                nVar.P = signalStrength;
                nVar.Q = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    public abstract void h();

    public abstract void i();

    public final void j() {
        i();
        synchronized (this.f8955c) {
            this.f8955c.clear();
        }
        synchronized (this.f8954b) {
            this.f8954b.clear();
        }
        synchronized (this.f8956d) {
            this.f8956d.clear();
        }
        synchronized (this.f8957e) {
            this.f8957e.clear();
        }
        synchronized (this.f8958f) {
            this.f8958f.clear();
        }
        synchronized (this.f8959g) {
            this.f8959g.clear();
        }
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        br.l.e(telephonyDisplayInfo, "telephonyDisplayInfo");
        ch.n.b("TelephonyPhoneStateUpdateReceiver", "onTelephonyDisplayInfo");
        ch.n.a();
        synchronized (this.f8956d) {
            Iterator it = this.f8956d.iterator();
            while (it.hasNext()) {
                ((r) it.next()).onDisplayInfoChanged(telephonyDisplayInfo);
            }
        }
    }

    public final void onPhysicalChannelConfigurationChanged(List<? extends Object> list) {
        br.l.e(list, "configs");
        ch.n.b("TelephonyPhoneStateUpdateReceiver", "onPhysicalChannelConfigurationChanged - " + list);
        String strB = this.f8953a.b(list);
        synchronized (this.f8957e) {
            for (n nVar : this.f8957e) {
                nVar.getClass();
                br.l.e(strB, "config");
                ch.n.b("TelephonyPhoneStateRepo", "Physical channel configuration changed: ".concat(strB));
                nVar.T = strB;
                nVar.f8936a.getClass();
                nVar.U = Long.valueOf(System.currentTimeMillis());
            }
        }
    }
}
