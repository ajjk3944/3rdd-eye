package mi;

import ak.l1;
import android.net.wifi.ScanResult;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ni.h1;
import ni.i1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class g0 extends vj.b {
    public final df.c F;
    public final xi.u G;
    public final ag.b H;
    public final ch.f I;
    public final ch.i J;
    public final String K;
    public final int L;
    public final xi.j M;
    public final xi.v N;
    public final df.c O;
    public final ee.f P;
    public final String Q;
    public h1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(df.c cVar, xi.u uVar, ag.b bVar, ch.f fVar, ch.i iVar, int i10, io.sentry.hints.i iVar2, xi.j jVar, xi.v vVar, df.c cVar2, ee.f fVar2, String str) {
        super(iVar2, str);
        br.l.e(vVar, "wifiScanInfoRepository");
        br.l.e(str, "taskName");
        this.F = cVar;
        this.G = uVar;
        this.H = bVar;
        this.I = fVar;
        this.J = iVar;
        this.K = "92.0.0";
        this.L = i10;
        this.M = jVar;
        this.N = vVar;
        this.O = cVar2;
        this.P = fVar2;
        this.Q = "WIFI_SCAN";
    }

    @Override // vj.b
    public final String f() {
        return this.Q;
    }

    @Override // vj.b
    public final void i(long j) {
        hk.h hVar = this.E;
        if (hVar != null) {
            StringBuilder sb2 = new StringBuilder("[");
            c7.a.A(sb2, this.f23922d, ':', j);
            sb2.append("] Unknown error");
            hVar.e(this.Q, sb2.toString());
        }
        super.i(j);
    }

    @Override // vj.b
    public final void j(long j) {
        super.j(j);
        StringBuilder sbK = w.g.k(j, "onFinish() called with: taskId = ", ", taskName = ");
        sbK.append(this.f23922d);
        ch.n.b("WiFiScanResultsAvailableJob", sbK.toString());
        hk.h hVar = this.E;
        if (hVar != null) {
            h1 h1Var = this.R;
            if (h1Var != null) {
                hVar.d(this.Q, h1Var);
            } else {
                br.l.l("wifiScanResult");
                throw null;
            }
        }
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) {
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        StringBuilder sbK = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
        w.g.q(sbK, this.f23922d, ", dataEndpoint = ", str, ", isManualExecution = ");
        sbK.append(z10);
        ch.n.b("WiFiScanResultsAvailableJob", sbK.toString());
        this.F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        xi.v vVar = this.N;
        if (jCurrentTimeMillis - vVar.f25372b < 10000) {
            i(j);
            return;
        }
        vVar.f25372b = jCurrentTimeMillis;
        ak.u uVar = this.G.G;
        ag.b bVar = this.H;
        int i10 = bVar.f345d;
        if (!bVar.i("android.permission.ACCESS_WIFI_STATE") || (((i10 < 29 || !bVar.i("android.permission.ACCESS_FINE_LOCATION")) && ((i10 > 28 || !bVar.i("android.permission.ACCESS_FINE_LOCATION")) && !bVar.i("android.permission.ACCESS_COARSE_LOCATION"))) || !uVar.c())) {
            i(j);
            return;
        }
        l1 l1Var = h().f529f.f460n;
        long j7 = l1Var.f612b;
        double d6 = uVar.f721a;
        double d10 = uVar.f722b;
        if (d6 == vVar.f25374d && d10 == vVar.f25375e) {
            long j10 = vVar.f25373c;
            if (j10 == -1 || jCurrentTimeMillis - j10 < j7) {
                i(j);
                return;
            }
        }
        vVar.f25374d = d6;
        vVar.f25375e = d10;
        vVar.f25373c = vVar.f25372b;
        try {
            List<ScanResult> scanResults = vVar.f25371a.getScanResults();
            br.l.d(scanResults, "getScanResults(...)");
            boolean zIsEmpty = scanResults.isEmpty();
            String str2 = this.Q;
            if (zIsEmpty) {
                ch.n.b("WiFiScanResultsAvailableJob", "Empty scan results, returning ...");
                hk.h hVar = this.E;
                if (hVar != null) {
                    hVar.e(str2, "Empty scan results");
                    return;
                }
                return;
            }
            mq.o.M0(scanResults, new dv.h(13));
            int i11 = l1Var.f611a;
            int size = scanResults.size();
            if (i11 <= -1 || i11 >= size) {
                i11 = size;
            }
            h1 h1VarM = m(j, this.f23922d, System.currentTimeMillis(), scanResults.subList(0, i11), l1Var, this.M.L);
            this.R = h1VarM;
            h1VarM.toString();
            ch.n.a();
            hk.h hVar2 = this.E;
            if (hVar2 != null) {
                h1 h1Var = this.R;
                if (h1Var == null) {
                    br.l.l("wifiScanResult");
                    throw null;
                }
                hVar2.f(str2, h1Var);
            }
            j(j);
        } catch (Exception e4) {
            ch.n.e("WiFiScanResultsAvailableJob", e4);
            i(j);
        }
    }

    public final h1 m(long j, String str, long j7, List list, l1 l1Var, ak.s sVar) throws JSONException {
        String strS;
        ak.s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            ch.f fVar = this.I;
            Integer numValueOf = fVar.a() ? Integer.valueOf(scanResult.channelWidth) : null;
            Integer numValueOf2 = fVar.f() ? Integer.valueOf(scanResult.getWifiStandard()) : null;
            long jG = g();
            String str2 = this.D;
            ch.i iVar = this.J;
            String strValueOf = String.valueOf(iVar.a());
            String str3 = Build.VERSION.RELEASE;
            br.l.d(str3, "RELEASE");
            int i10 = fVar.f3941a;
            Integer num = fVar.f3942b;
            long jA = iVar.a();
            String str4 = h().f528e;
            int i11 = h().f525b;
            int i12 = h().f526c;
            Iterator it2 = it;
            String str5 = h().f527d;
            String str6 = sVar2 != null ? sVar2.f656a : null;
            Long l10 = sVar2 != null ? sVar2.f659d : null;
            String str7 = scanResult.BSSID;
            String str8 = scanResult.SSID;
            int i13 = scanResult.level;
            int i14 = scanResult.frequency;
            String str9 = scanResult.capabilities;
            if (l1Var.f613c && fVar.f()) {
                List informationElements = scanResult.getInformationElements();
                br.l.d(informationElements, "getInformationElements(...)");
                this.O.getClass();
                ArrayList arrayListH = df.c.h(informationElements, l1Var);
                this.P.getClass();
                strS = ee.f.s(arrayListH);
            } else {
                strS = null;
            }
            ak.u uVar = this.G.G;
            ni.c0 c0VarX = !uVar.c() ? null : ir.f0.x(this.F, uVar, h().f529f.f450b);
            br.l.b(str7);
            br.l.b(str8);
            br.l.b(str9);
            arrayList.add(new i1(jG, j, str, this.Q, str2, j7, strValueOf, this.K, this.L, str3, i10, num, jA, str4, i11, i12, str5, str6, l10, str7, str8, i13, i14, str9, numValueOf, numValueOf2, strS, c0VarX));
            sVar2 = sVar;
            it = it2;
        }
        return new h1(g(), j, str, this.Q, this.D, j7, arrayList);
    }
}
