package ni;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class o extends vj.b {
    public final al.b F;
    public final cj.a G;
    public final fj.o H;
    public final bm.e I;
    public final df.c J;
    public final bm.d K;
    public p L;
    public final String M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(al.b bVar, cj.a aVar, fj.o oVar, bm.e eVar, df.c cVar, bm.d dVar, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.F = bVar;
        this.G = aVar;
        this.H = oVar;
        this.I = eVar;
        this.J = cVar;
        this.K = dVar;
        this.M = "END_CORE";
    }

    @Override // vj.b
    public final String f() {
        return this.M;
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) throws JSONException {
        Map mapQ;
        String strA;
        NetworkInfo.State state;
        NetworkCapabilities networkCapabilitiesG;
        o oVar = this;
        long j7 = j;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        String str2 = ", taskName = ";
        StringBuilder sbK = w.g.k(j7, "start() called with: taskId = ", ", taskName = ");
        String str3 = oVar.f23922d;
        w.g.q(sbK, str3, ", dataEndpoint = ", str, ", isManualExecution = ");
        sbK.append(z10);
        Object[] objArr = {sbK.toString()};
        String str4 = "EndCoreJob";
        ch.n.b("EndCoreJob", objArr);
        oVar.J.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        br.l.e(str3, "taskName");
        ArrayList arrayList = new ArrayList();
        boolean z11 = oVar.h().f529f.f449a.f494y;
        cj.a aVar = oVar.G;
        if (z11) {
            mapQ = aVar.v();
        } else {
            int iX = ((bk.k) aVar.f3976r).x();
            TelephonyManager telephonyManager = (TelephonyManager) aVar.v().get(Integer.valueOf(iX));
            mapQ = telephonyManager != null ? mq.b0.Q(new lq.l(Integer.valueOf(iX), telephonyManager)) : mq.x.f16946a;
        }
        Iterator it = mapQ.entrySet().iterator();
        while (it.hasNext()) {
            fj.n nVarE = oVar.H.e(((Number) ((Map.Entry) it.next()).getKey()).intValue());
            if (nVarE != null) {
                bm.e eVar = oVar.I;
                strA = new ci.a((kg.r) eVar.f2830d, (ch.f) eVar.f2831g, nVarE).a(oVar.h().f529f.f449a);
            } else {
                strA = "";
            }
            String str5 = str4;
            String str6 = str2;
            long jG = oVar.g();
            String str7 = str3;
            String str8 = oVar.D;
            al.b bVar = oVar.F;
            Boolean boolJ = bVar.j();
            bm.d dVar = oVar.K;
            String str9 = strA;
            String strReplaceAll = (!((ch.f) dVar.f2828r).g() || (networkCapabilitiesG = dVar.G()) == null) ? null : Arrays.toString(networkCapabilitiesG.getCapabilities()).replaceAll(" ", "");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) bVar.f812d).getActiveNetworkInfo();
            Integer numValueOf = (activeNetworkInfo == null || (state = activeNetworkInfo.getState()) == null) ? null : Integer.valueOf(state.ordinal());
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new q(jG, j7, str7, oVar.M, str8, jCurrentTimeMillis, strReplaceAll, str9, boolJ, numValueOf, bVar.f()));
            j7 = j;
            arrayList = arrayList2;
            str3 = str7;
            str4 = str5;
            str2 = str6;
            oVar = this;
        }
        String str10 = str4;
        String str11 = str2;
        String str12 = str3;
        p pVar = new p(g(), j, str12, this.M, this.D, jCurrentTimeMillis, arrayList);
        this.L = pVar;
        hk.h hVar = this.E;
        String str13 = this.M;
        if (hVar != null) {
            hVar.f(str13, pVar);
        }
        super.j(j);
        ch.n.b(str10, "onFinish() called with: taskId = " + j + str11 + str12);
        hk.h hVar2 = this.E;
        if (hVar2 != null) {
            p pVar2 = this.L;
            if (pVar2 != null) {
                hVar2.d(str13, pVar2);
            } else {
                br.l.l("endCoreResult");
                throw null;
            }
        }
    }
}
