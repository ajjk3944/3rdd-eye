package mi;

import android.content.Context;
import h9.r2;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class k extends f {
    public final Context P;
    public final gj.b Q;
    public final df.c R;
    public final r2 S;
    public final zh.c T;
    public hh.a U;
    public final String V;
    public final String W;
    public final CountDownLatch X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, gj.b bVar, df.c cVar, r2 r2Var, zh.c cVar2, io.sentry.hints.i iVar, fh.f fVar, zh.a aVar, zh.e eVar, xi.j jVar, String str) {
        super(iVar, fVar, cVar, aVar, eVar, jVar, str);
        br.l.e(cVar2, "serverUrlIpExtractor");
        br.l.e(str, "taskName");
        this.P = context;
        this.Q = bVar;
        this.R = cVar;
        this.S = r2Var;
        this.T = cVar2;
        this.V = "THROUGHPUT_ICMP_PING";
        this.W = "IcmpPingJob";
        this.X = new CountDownLatch(1);
    }

    @Override // vj.b
    public final String f() {
        return this.V;
    }

    @Override // mi.f, vj.b
    public final void k(String str, boolean z10, long j) throws Throwable {
        lq.l lVar;
        String strSubstring;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        StringBuilder sbK = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
        String str2 = this.f23922d;
        w.g.q(sbK, str2, ", dataEndpoint = ", str, ", isManualExecution = ");
        sbK.append(z10);
        ch.n.b("IcmpPingJob", sbK.toString());
        ak.x xVar = h().f529f.k;
        this.U = new hh.a(null, null, null, null, yh.m.NOT_PERFORMED.getValue(), null, null, null, null, null, null, null, null);
        gj.b bVar = this.Q;
        bVar.getClass();
        io.sentry.t tVar = bVar.f9601m;
        br.l.e(tVar, "handlerThreadFactory");
        Context context = this.P;
        br.l.e(context, "context");
        ch.n.b("IcmpPingTest", "start called");
        ch.n.b("IcmpPingJob", "onTestStarted() called");
        kc.f.f14288d = context;
        hk.k kVarC = yh.i.c(xVar, tVar, this);
        Integer num = (Integer) kVarC.f10836g;
        Integer num2 = (Integer) kVarC.f10837h;
        Integer num3 = (Integer) kVarC.f10838i;
        String str3 = (String) kVarC.f10841n;
        Integer num4 = (Integer) kVarC.k;
        String strN = kVarC.n();
        Double d6 = (Double) kVarC.f10830a;
        Double d10 = (Double) kVarC.f10831b;
        Double d11 = (Double) kVarC.f10832c;
        Double d12 = (Double) kVarC.f10833d;
        Integer numValueOf = d12 != null ? Integer.valueOf((int) d12.doubleValue()) : null;
        Double d13 = (Double) kVarC.f10834e;
        Integer numValueOf2 = d13 != null ? Integer.valueOf((int) d13.doubleValue()) : null;
        Double d14 = (Double) kVarC.f10835f;
        Integer num5 = (Integer) kVarC.j;
        br.l.b(num4);
        String str4 = null;
        hh.a aVar = new hh.a(num, num2, num3, str3, num4.intValue(), strN, d10, d6, d11, numValueOf, numValueOf2, d14, num5);
        ch.n.b("IcmpPingJob", "onTestComplete() called");
        this.U = aVar;
        CountDownLatch countDownLatch = this.X;
        countDownLatch.countDown();
        countDownLatch.await();
        hk.h hVar = this.E;
        String str5 = this.V;
        if (hVar != null) {
            hh.a aVar2 = this.U;
            if (aVar2 == null) {
                br.l.l("icmpPingTestResult");
                throw null;
            }
            hVar.f(str5, u(aVar2, n()));
        }
        super.j(j);
        ch.n.b("IcmpPingJob", "onFinish() called with: taskId = " + j + ", taskName = " + str2);
        hh.a aVar3 = this.U;
        if (aVar3 == null) {
            br.l.l("icmpPingTestResult");
            throw null;
        }
        ni.w wVarU = u(aVar3, n());
        hh.a aVar4 = this.U;
        if (aVar4 == null) {
            br.l.l("icmpPingTestResult");
            throw null;
        }
        String str6 = aVar4.f10756f;
        this.T.getClass();
        if (str6 == null || tt.l.D0(str6)) {
            lVar = new lq.l(null, null);
        } else {
            if (str6.length() >= 2 && tt.l.P0(str6, "[") && tt.l.v0(str6, "]")) {
                strSubstring = str6.substring(1, str6.length() - 1);
                br.l.d(strSubstring, "substring(...)");
            } else {
                strSubstring = str6;
            }
            List listN0 = tt.l.N0(strSubstring, new String[]{","}, 6);
            if (listN0.size() != 2) {
                ch.n.g("ServerUrlIpExtractor", "Malformed server string: ".concat(str6));
                lVar = new lq.l(null, null);
            } else {
                String string = tt.l.a1((String) listN0.get(0)).toString();
                String string2 = tt.l.a1((String) listN0.get(1)).toString();
                if (string.length() <= 0 || string.equals("-32768")) {
                    string = null;
                }
                if (string2.length() > 0 && !string2.equals("-32768")) {
                    str4 = string2;
                }
                lVar = new lq.l(string, str4);
            }
        }
        String str7 = (String) lVar.f15571a;
        String str8 = (String) lVar.f15572d;
        if (str7 != null && str8 != null) {
            r2 r2Var = this.S;
            r2Var.n1(j, str8);
            r2Var.m1(j, str7);
            ch.n.b("IcmpPingJob", h0.b.s(new StringBuilder("Ping test did run on Server URL: "), str7, ", Server IP: ", str8));
        }
        hk.h hVar2 = this.E;
        if (hVar2 != null) {
            hVar2.d(str5, wVarU);
        }
    }

    @Override // mi.f
    public final String o() {
        return this.W;
    }

    public final ni.w u(hh.a aVar, String str) {
        br.l.e(aVar, "result");
        aVar.toString();
        ch.n.a();
        long jG = g();
        long j = this.f23926y;
        this.R.getClass();
        return new ni.w(jG, j, this.f23922d, System.currentTimeMillis(), this.D, this.V, aVar.f10751a, aVar.f10752b, aVar.f10753c, aVar.f10754d, Integer.valueOf(this.M ? yh.m.CONNECTION_CHANGED.getValue() : aVar.f10755e), aVar.f10756f, aVar.f10757g, aVar.f10758h, aVar.f10759i, aVar.j, aVar.k, aVar.f10760l, aVar.f10761m, str);
    }
}
