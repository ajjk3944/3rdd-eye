package fj;

import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import as.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p.l2;

/* loaded from: classes.dex */
public final class n implements s, r, q, p {
    public final ch.i B;
    public final b D;
    public final Executor E;
    public final q3.a F;
    public final l2 G;
    public final l2 H;
    public t I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public ServiceState N;
    public Long O;
    public SignalStrength P;
    public Long Q;
    public TelephonyDisplayInfo R;
    public Long S;
    public String T;
    public Long U;
    public final Object V;

    /* renamed from: a, reason: collision with root package name */
    public final df.c f8936a;

    /* renamed from: d, reason: collision with root package name */
    public final df.c f8937d;

    /* renamed from: g, reason: collision with root package name */
    public final TelephonyManager f8938g;

    /* renamed from: r, reason: collision with root package name */
    public final ch.f f8939r;

    /* renamed from: x, reason: collision with root package name */
    public final ag.b f8940x;

    /* renamed from: y, reason: collision with root package name */
    public final xj.j f8941y;

    public n(df.c cVar, df.c cVar2, TelephonyManager telephonyManager, ch.f fVar, ag.b bVar, xj.j jVar, ch.i iVar, b bVar2, Executor executor, q3.a aVar, l2 l2Var, l2 l2Var2) {
        br.l.e(cVar2, "phoneStateListenerFactory");
        this.f8936a = cVar;
        this.f8937d = cVar2;
        this.f8938g = telephonyManager;
        this.f8939r = fVar;
        this.f8940x = bVar;
        this.f8941y = jVar;
        this.B = iVar;
        this.D = bVar2;
        this.E = executor;
        this.F = aVar;
        this.G = l2Var;
        this.H = l2Var2;
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.V = new Object();
    }

    @Override // fj.q
    public final void a(List list) {
        ch.n.b("TelephonyPhoneStateRepo", "onCellsInfoChanged: " + list);
        TelephonyManager telephonyManager = this.f8938g;
        if (telephonyManager != null) {
            this.D.d(list, telephonyManager);
        }
        synchronized (this.K) {
            Iterator it = this.K.iterator();
            while (it.hasNext()) {
                ((q) it.next()).a(list);
            }
        }
    }

    public final void b(p pVar) {
        br.l.e(pVar, "listener");
        synchronized (this.J) {
            try {
                if (this.J.contains(pVar)) {
                    ch.n.g("TelephonyPhoneStateRepo", "addListener() CellLocationChangedListener already added = " + pVar);
                } else {
                    ch.n.b("TelephonyPhoneStateRepo", "addListener() adding CellLocationChangedListener = " + pVar);
                    this.J.add(pVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(s sVar) {
        br.l.e(sVar, "listener");
        synchronized (this.L) {
            try {
                if (this.L.contains(sVar)) {
                    ch.n.g("TelephonyPhoneStateRepo", "addListener() serviceStateChangedListener already added = " + sVar);
                } else {
                    ch.n.b("TelephonyPhoneStateRepo", "addListener() adding ServiceStateChangedListener = " + sVar);
                    this.L.add(sVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        if (!this.H.D()) {
            ch.n.b("TelephonyPhoneStateRepo", "Consent not given. Not registering listener events and callbacks");
        } else {
            this.G.G(new x(22, this));
        }
    }

    public final void e(s sVar) {
        br.l.e(sVar, "listener");
        synchronized (this.L) {
            this.L.remove(sVar);
        }
    }

    @Override // fj.p
    public final void onCellLocationChanged(CellLocation cellLocation) {
        ch.n.b("TelephonyPhoneStateRepo", "onCellLocationChanged() called with: location = " + cellLocation);
        Objects.toString(cellLocation);
        ch.n.a();
        synchronized (this.J) {
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                ((p) it.next()).onCellLocationChanged(cellLocation);
            }
        }
    }

    @Override // fj.r
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        ch.n.b("TelephonyPhoneStateRepo", "Display info changed: " + telephonyDisplayInfo);
        this.R = telephonyDisplayInfo;
        this.S = Long.valueOf(System.currentTimeMillis());
        synchronized (this.M) {
            Iterator it = this.M.iterator();
            while (it.hasNext()) {
                ((r) it.next()).onDisplayInfoChanged(telephonyDisplayInfo);
            }
        }
    }

    @Override // fj.s
    public final void onServiceStateChanged(ServiceState serviceState) {
        ch.n.b("TelephonyPhoneStateRepo", "Service state changed: " + serviceState + " for class " + this);
        this.N = serviceState;
        this.O = Long.valueOf(System.currentTimeMillis());
        synchronized (this.L) {
            Iterator it = this.L.iterator();
            while (it.hasNext()) {
                ((s) it.next()).onServiceStateChanged(serviceState);
            }
        }
    }
}
