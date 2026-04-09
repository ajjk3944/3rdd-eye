package mi;

import com.google.android.gms.internal.measurement.e5;
import h9.r2;
import java.util.HashMap;
import ni.h0;

/* loaded from: classes.dex */
public final class h extends vj.b {
    public final /* synthetic */ int F = 0;
    public final df.c G;
    public final String H;
    public final Object I;
    public final Object J;
    public Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(io.sentry.hints.i iVar, r2 r2Var, df.c cVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.I = iVar;
        this.J = r2Var;
        this.G = cVar;
        this.H = "SCHEDULER_INFO";
    }

    @Override // vj.b
    public final String f() {
        switch (this.F) {
        }
        return this.H;
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) {
        String str2;
        switch (this.F) {
            case 0:
                String str3 = this.H;
                String str4 = this.f23922d;
                br.l.e(str, "dataEndpoint");
                super.k(str, z10, j);
                if (((xi.u) this.I).G.d(this.G, h().f529f.f450b)) {
                    ch.n.b("FreshLocationOrKnownWifiIpJob", "[" + str4 + ':' + j + "] finished with success as hasRecentLocation.");
                    super.j(j);
                    hk.h hVar = this.E;
                    if (hVar != null) {
                        hVar.d(str3, null);
                        return;
                    }
                    return;
                }
                String strB0 = ((js.e) this.J).b0();
                if (strB0 != null) {
                    ek.c cVar = (ek.c) this.K;
                    cVar.getClass();
                    rj.a aVar = (rj.a) mq.o.t0(cVar.f8192a.j(cVar.f8193b, e5.H("ip_address"), e5.H(strB0)));
                    ak.z zVar = aVar != null ? (ak.z) cVar.f8194c.a(aVar) : null;
                    ch.n.b("FreshLocationOrKnownWifiIpJob", "[" + str4 + ':' + this.f23926y + "] Found a known Wifi IP in cache: " + zVar);
                    if (zVar != null) {
                        ch.n.b("FreshLocationOrKnownWifiIpJob", "[" + str4 + ':' + j + "] finished using cached Wifi Ip and location.");
                        super.j(j);
                        hk.h hVar2 = this.E;
                        if (hVar2 != null) {
                            hVar2.d(str3, null);
                            return;
                        }
                        return;
                    }
                }
                ch.n.b("FreshLocationOrKnownWifiIpJob", "[" + str4 + ':' + j + "] Does not have a recent location nor a known recent public WIFI ip");
                super.i(j);
                hk.h hVar3 = this.E;
                if (hVar3 != null) {
                    hVar3.e(str3, "[" + str4 + ':' + j + "] Does not have a recent location and recent public ip");
                    return;
                }
                return;
            default:
                br.l.e(str, "dataEndpoint");
                super.k(str, z10, j);
                StringBuilder sbK = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
                w.g.q(sbK, this.f23922d, ", dataEndpoint = ", str, ", isManualExecution = ");
                sbK.append(z10);
                ch.n.b("SchedulerInfoJob", sbK.toString());
                ((io.sentry.hints.i) this.I).getClass();
                long jAbs = Math.abs(fr.d.f9050a.d().nextLong());
                String str5 = this.f23922d;
                String str6 = this.H;
                this.G.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                r2 r2Var = (r2) this.J;
                synchronized (((HashMap) r2Var.f10473r)) {
                    String str7 = (String) ((HashMap) r2Var.f10473r).get(Long.valueOf(j));
                    if (str7 == null) {
                        str7 = "";
                    }
                    str2 = str7;
                }
                this.K = new h0(jAbs, j, jCurrentTimeMillis, str5, str6, str, str2);
                super.j(j);
                hk.h hVar4 = this.E;
                if (hVar4 != null) {
                    hVar4.d(this.H, (h0) this.K);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(df.c cVar, xi.u uVar, js.e eVar, ek.c cVar2, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.G = cVar;
        this.I = uVar;
        this.J = eVar;
        this.K = cVar2;
        this.H = "FRESH_LOCATION_OR_KNOWN_WIFI_IP";
    }
}
