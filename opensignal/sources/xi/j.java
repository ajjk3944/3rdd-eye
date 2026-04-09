package xi;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import h9.r2;
import ir.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import ni.c0;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class j implements ek.g, ek.h, fj.p, fj.s {
    public final dj.g B;
    public final r2 D;
    public final df.c E;
    public final u F;
    public final q3.a G;
    public final xr.a H;
    public final ThreadFactory I;
    public final yi.e J;
    public final Object K;
    public ak.s L;
    public zh.b M;
    public final ConcurrentHashMap N;
    public final ConcurrentHashMap O;
    public final ArrayList P;
    public fj.n Q;
    public boolean R;

    /* renamed from: a, reason: collision with root package name */
    public final om.f f25338a;

    /* renamed from: d, reason: collision with root package name */
    public final xj.i f25339d;

    /* renamed from: g, reason: collision with root package name */
    public final bk.c f25340g;

    /* renamed from: r, reason: collision with root package name */
    public final ee.f f25341r;

    /* renamed from: x, reason: collision with root package name */
    public final al.b f25342x;

    /* renamed from: y, reason: collision with root package name */
    public final fj.b f25343y;

    public j(om.f fVar, gi.c cVar, bk.c cVar2, ee.f fVar2, al.b bVar, fj.b bVar2, dj.g gVar, r2 r2Var, df.c cVar3, u uVar, q3.a aVar, xr.a aVar2, ThreadFactory threadFactory, yi.e eVar) {
        ConcurrentHashMap concurrentHashMap;
        br.l.e(cVar, "deviceConnectionListJsonMapper");
        br.l.e(fVar2, "connectionChecker");
        this.f25338a = fVar;
        this.f25339d = cVar;
        this.f25340g = cVar2;
        this.f25341r = fVar2;
        this.f25342x = bVar;
        this.f25343y = bVar2;
        this.B = gVar;
        this.D = r2Var;
        this.E = cVar3;
        this.F = uVar;
        this.G = aVar;
        this.H = aVar2;
        this.I = threadFactory;
        this.J = eVar;
        this.K = new Object();
        this.P = new ArrayList();
        String strN = fVar.n("device_connection_list", "[]");
        if (strN != null) {
            try {
                if (tt.l.D0(strN)) {
                    concurrentHashMap = new ConcurrentHashMap();
                } else {
                    ArrayList<ak.s> arrayList = (ArrayList) cVar.g(new JSONArray(strN));
                    concurrentHashMap = new ConcurrentHashMap();
                    for (ak.s sVar : arrayList) {
                        concurrentHashMap.put(sVar.f656a, sVar);
                    }
                }
            } catch (JSONException unused) {
                this.f25338a.d("device_connection_list");
                concurrentHashMap = new ConcurrentHashMap();
            }
        } else {
            concurrentHashMap = new ConcurrentHashMap();
        }
        this.N = concurrentHashMap;
        this.O = new ConcurrentHashMap();
    }

    @Override // ek.h
    public final void K(Network network) {
        ch.n.b("DeviceConnectionRepository", "onNetworkChanged() called with: network = " + network + " called from thread " + Thread.currentThread().getId());
        c();
    }

    public final void a(ek.a aVar) {
        br.l.e(aVar, "listener");
        synchronized (this.P) {
            if (!this.P.contains(aVar)) {
                this.P.add(aVar);
            }
        }
    }

    public final void b() {
        synchronized (this.K) {
            try {
                ch.n.b("DeviceConnectionRepository", "checkConnectivityState() called from thread " + Thread.currentThread().getId());
                long jCurrentTimeMillis = System.currentTimeMillis();
                fj.g gVarB = this.B.b();
                int iE = this.f25342x.e();
                if (!br.l.a(this.f25342x.j(), Boolean.TRUE)) {
                    iE = -1;
                }
                int iL = gVarB.l();
                TelephonyManager telephonyManager = gVarB.f8914c;
                boolean zIsNetworkRoaming = telephonyManager != null ? telephonyManager.isNetworkRoaming() : false;
                ak.u uVar = this.F.G;
                Integer numValueOf = Integer.valueOf(iE);
                Integer numValueOf2 = Integer.valueOf(iL);
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                ak.f fVarB = this.f25343y.b(gVarB.f8914c);
                WifiInfo wifiInfoZ0 = this.D.z0();
                String bssid = wifiInfoZ0 != null ? wifiInfoZ0.getBSSID() : null;
                c0 c0VarX = f0.x(this.E, uVar, ((ak.g) this.G.f20680g).f529f.f450b);
                TelephonyManager telephonyManager2 = gVarB.f8914c;
                String simOperator = telephonyManager2 != null ? telephonyManager2.getSimOperator() : null;
                TelephonyManager telephonyManager3 = gVarB.f8914c;
                String simOperatorName = telephonyManager3 != null ? telephonyManager3.getSimOperatorName() : null;
                zh.b bVar = this.M;
                Integer num = bVar != null ? bVar.f27411c : null;
                Long lValueOf2 = Long.valueOf(this.J.d());
                yi.e eVar = this.J;
                yi.b bVar2 = yi.b.WIFI;
                yi.a aVar = yi.a.TX;
                yi.c cVar = yi.c.BYTES;
                Long lB = eVar.b(bVar2, aVar, cVar);
                yi.e eVar2 = this.J;
                yi.b bVar3 = yi.b.CELL;
                Long lB2 = eVar2.b(bVar3, aVar, cVar);
                Long lValueOf3 = Long.valueOf(this.J.c());
                yi.e eVar3 = this.J;
                yi.a aVar2 = yi.a.RX;
                ak.s sVar = new ak.s(null, numValueOf, numValueOf2, lValueOf, null, fVarB, bssid, zIsNetworkRoaming, c0VarX, simOperator, simOperatorName, num, null, lValueOf2, lB, lB2, lValueOf3, eVar3.b(bVar2, aVar2, cVar), this.J.b(bVar3, aVar2, cVar), 4113);
                ak.s sVar2 = this.L;
                ch.n.b("DeviceConnectionRepository", "checkConnectivityState() called with " + sVar2);
                ch.n.b("DeviceConnectionRepository", "checkConnectivityState() new Connection " + sVar);
                ee.f fVar = this.f25341r;
                boolean z10 = ((ak.g) this.G.f20680g).f529f.f449a.f484o;
                fVar.getClass();
                if (ee.f.v(sVar2, sVar, z10)) {
                    ConcurrentHashMap concurrentHashMap = this.N;
                    ch.n.b("DeviceConnectionRepository", c7.a.m(jCurrentTimeMillis, "updateLastConnectionEndTime() called with: time = "));
                    ak.s sVar3 = this.L;
                    if (sVar3 != null) {
                        ak.s sVar4 = (ak.s) concurrentHashMap.get(sVar3.f656a);
                        ak.s sVarA = sVar4 != null ? ak.s.a(sVar4, Long.valueOf(jCurrentTimeMillis), null, 524271) : null;
                        if (sVarA != null) {
                            concurrentHashMap.put(sVarA.f656a, sVarA);
                        }
                    }
                    ch.n.b("DeviceConnectionRepository", "addConnection() called");
                    sVar.toString();
                    ch.n.a();
                    this.L = sVar;
                    this.N.put(sVar.f656a, sVar);
                    d();
                    synchronized (this.P) {
                        Iterator it = this.P.iterator();
                        while (it.hasNext()) {
                            ((ek.a) it.next()).M0(sVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        this.I.newThread(new j4.o(21, this)).start();
    }

    public final void d() {
        String string = ((JSONArray) this.f25339d.a(new ArrayList(this.N.values()))).toString();
        br.l.d(string, "toString(...)");
        this.f25338a.u("device_connection_list", string);
    }

    @Override // ek.g
    public final void k0(Network network, NetworkCapabilities networkCapabilities) {
        ch.n.b("DeviceConnectionRepository", "onNetworkCapabilityChanged() called with: network = " + network + ", networkCapabilities = " + networkCapabilities + " called from thread " + Thread.currentThread().getId());
        c();
    }

    @Override // fj.p
    public final void onCellLocationChanged(CellLocation cellLocation) {
        ch.n.b("DeviceConnectionRepository", "onCellLocationChanged() called from thread " + Thread.currentThread().getId());
        Objects.toString(cellLocation);
        ch.n.a();
        c();
    }

    @Override // fj.s
    public final void onServiceStateChanged(ServiceState serviceState) {
        ch.n.b("DeviceConnectionRepository", "onServiceStateChanged called from thread " + Thread.currentThread().getId());
        serviceState.toString();
        ch.n.a();
        this.M = ((ak.g) this.G.f20680g).f529f.f449a.f484o ? this.H.c(serviceState) : null;
        c();
    }
}
