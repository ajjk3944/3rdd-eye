package mi;

import ak.l1;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.List;
import ni.g1;

/* loaded from: classes.dex */
public final class f0 extends vj.b {
    public final ch.f F;
    public final df.c G;
    public final WifiManager H;
    public final df.c I;
    public final ee.f J;
    public final String K;
    public g1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ch.f fVar, df.c cVar, WifiManager wifiManager, df.c cVar2, ee.f fVar2, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.F = fVar;
        this.G = cVar;
        this.H = wifiManager;
        this.I = cVar2;
        this.J = fVar2;
        this.K = "WIFI_INFORMATION_ELEMENTS";
    }

    @Override // vj.b
    public final String f() {
        return this.K;
    }

    @Override // vj.b
    public final void j(long j) {
        super.j(j);
        StringBuilder sbK = w.g.k(j, "onFinish() called with: taskId = ", ", taskName = ");
        sbK.append(this.f23922d);
        ch.n.b("WifiInformationElementsJob", sbK.toString());
        hk.h hVar = this.E;
        if (hVar != null) {
            g1 g1Var = this.L;
            if (g1Var != null) {
                hVar.d(this.K, g1Var);
            } else {
                br.l.l("wifiInformationElementsJobResult");
                throw null;
            }
        }
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) {
        List informationElements;
        String str2 = this.K;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        StringBuilder sbK = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
        String str3 = this.f23922d;
        w.g.q(sbK, str3, ", dataEndpoint = ", str, ", isManualExecution = ");
        sbK.append(z10);
        ch.n.b("WifiInformationElementsJob", sbK.toString());
        try {
            boolean zG = this.F.g();
            df.c cVar = this.G;
            if (!zG) {
                ch.n.b("WifiInformationElementsJob", "Device API below 31. Terminating job.");
                String str4 = this.f23922d;
                cVar.getClass();
                this.L = new g1(g(), j, System.currentTimeMillis(), str4, this.D, this.K, null);
                j(j);
                return;
            }
            l1 l1Var = h().f529f.f460n;
            WifiInfo connectionInfo = this.H.getConnectionInfo();
            List listQ0 = (connectionInfo == null || (informationElements = connectionInfo.getInformationElements()) == null) ? mq.w.f16945a : mq.o.Q0(informationElements);
            this.I.getClass();
            ArrayList arrayListH = df.c.h(listQ0, l1Var);
            this.J.getClass();
            String strS = ee.f.s(arrayListH);
            String str5 = this.f23922d;
            cVar.getClass();
            g1 g1Var = new g1(g(), j, System.currentTimeMillis(), str5, this.D, this.K, strS);
            this.L = g1Var;
            hk.h hVar = this.E;
            if (hVar != null) {
                hVar.f(str2, g1Var);
            }
            j(j);
        } catch (Exception e4) {
            ch.n.e("WifiInformationElementsJob", e4);
            hk.h hVar2 = this.E;
            if (hVar2 != null) {
                hVar2.e(str2, "[" + str3 + ':' + j + "] Unknown error");
            }
            super.i(j);
        }
    }
}
