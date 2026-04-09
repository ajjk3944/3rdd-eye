package mi;

import android.content.Context;
import android.os.Bundle;
import h9.r2;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class l extends f {
    public final Context P;
    public final gj.b Q;
    public final df.c R;
    public final r2 S;
    public hh.c T;
    public final String U;
    public final String V;
    public final CountDownLatch W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, gj.b bVar, df.c cVar, r2 r2Var, io.sentry.hints.i iVar, fh.f fVar, zh.a aVar, zh.e eVar, xi.j jVar, String str) {
        super(iVar, fVar, cVar, aVar, eVar, jVar, str);
        br.l.e(str, "taskName");
        this.P = context;
        this.Q = bVar;
        this.R = cVar;
        this.S = r2Var;
        this.U = "THROUGHPUT_ICMP_TRACEROUTE";
        this.V = "IcmpTracerouteJob";
        this.W = new CountDownLatch(1);
    }

    @Override // vj.b
    public final String f() {
        return this.U;
    }

    @Override // mi.f, vj.b
    public final void k(String str, boolean z10, long j) throws Throwable {
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        StringBuilder sbK = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
        String str2 = this.f23922d;
        w.g.q(sbK, str2, ", dataEndpoint = ", str, ", isManualExecution = ");
        sbK.append(z10);
        ch.n.b("IcmpTracerouteJob", sbK.toString());
        ak.x xVar = h().f529f.k;
        this.T = new hh.c(Integer.valueOf(yh.m.NOT_PERFORMED.getValue()), null, null, null, null, null, null, null);
        r2 r2Var = this.S;
        String strI0 = r2Var.i0(j);
        String strL0 = r2Var.l0(j);
        CountDownLatch countDownLatch = this.W;
        if (strI0 == null || strI0.length() == 0 || strL0 == null || strL0.length() == 0) {
            ch.n.c("IcmpTracerouteJob", "Server URL or IP address is null or empty");
            super.i(j);
            ch.n.b("IcmpTracerouteJob", "onError called with: taskId = " + j + ", taskName = " + str2);
            countDownLatch.countDown();
            return;
        }
        this.Q.getClass();
        Context context = this.P;
        br.l.e(context, "context");
        ch.n.b("IcmpTracerouteTest", "start called");
        ch.n.b("IcmpTracerouteJob", "onTestStarted() called");
        kc.f.f14288d = context;
        Bundle bundleE = yh.i.e(xVar, strL0, strI0, this);
        int i10 = bundleE.getInt("ttqos_9", yh.m.COMPLETED.getValue());
        String string = bundleE.getString("ttqos_8", null);
        hh.c cVar = new hh.c(Integer.valueOf(i10), string != null ? new JSONArray(string).toString() : null, bundleE.containsKey("ttqos_7") ? Integer.valueOf(bundleE.getInt("ttqos_7")) : null, Integer.valueOf(xVar.f767i), Integer.valueOf(xVar.f769m), Integer.valueOf(xVar.k), Integer.valueOf(xVar.j), Integer.valueOf(xVar.f770n));
        ch.n.b("IcmpTracerouteJob", "onTestComplete() called");
        this.T = cVar;
        countDownLatch.countDown();
        countDownLatch.await();
        hk.h hVar = this.E;
        String str3 = this.U;
        if (hVar != null) {
            hh.c cVar2 = this.T;
            if (cVar2 == null) {
                br.l.l("icmpTracerouteTestResult");
                throw null;
            }
            hVar.f(str3, u(cVar2, n()));
        }
        super.j(j);
        ch.n.b("IcmpTracerouteJob", "onFinish() called with: taskId = " + j + ", taskName = " + str2);
        hh.c cVar3 = this.T;
        if (cVar3 == null) {
            br.l.l("icmpTracerouteTestResult");
            throw null;
        }
        ni.x xVarU = u(cVar3, n());
        hk.h hVar2 = this.E;
        if (hVar2 != null) {
            hVar2.d(str3, xVarU);
        }
    }

    @Override // mi.f
    public final String o() {
        return this.V;
    }

    public final ni.x u(hh.c cVar, String str) {
        br.l.e(cVar, "result");
        cVar.toString();
        ch.n.a();
        long jG = g();
        long j = this.f23926y;
        this.R.getClass();
        return new ni.x(jG, j, this.f23922d, System.currentTimeMillis(), this.D, this.U, this.M ? Integer.valueOf(yh.m.CONNECTION_CHANGED.getValue()) : cVar.f10781a, cVar.f10782b, cVar.f10783c, str, cVar.f10784d, cVar.f10785e, cVar.f10786f, cVar.f10787g, cVar.f10788h);
    }
}
