package mi;

import ak.i0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s extends vj.b {
    public final js.e F;
    public final df.c G;
    public final al.b H;
    public final bm.d I;
    public String J;
    public long K;
    public final String L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(js.e eVar, df.c cVar, al.b bVar, bm.d dVar, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.F = eVar;
        this.G = cVar;
        this.H = bVar;
        this.I = dVar;
        this.L = "PUBLIC_IP";
    }

    @Override // vj.b
    public final String f() {
        return this.L;
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) throws JSONException {
        JSONObject jSONObject;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        this.G.getClass();
        this.K = System.currentTimeMillis();
        boolean z11 = h().f529f.f449a.f473b;
        js.e eVar = this.F;
        if (z11) {
            String strB0 = eVar.b0();
            om.f fVar = (om.f) eVar.f13800x;
            this.J = strB0;
            ch.n.a();
            String str2 = this.J;
            long j7 = this.K;
            int iE = this.H.e();
            Boolean boolI = this.I.I(21, 15);
            i0 i0Var = new i0(iE, str2, j7, boolI);
            if (iE > -1 && str2 != null && !tt.l.D0(str2) && j7 > -1) {
                ch.n.b("ResolvePublicIpJob", "Storing IP in repository");
                fVar.u("last_public_ip", str2);
                fVar.t(j7, "last_public_ip_time");
                String strN = fVar.n("last_public_ips", null);
                JSONObject jSONObject2 = new JSONObject();
                if (strN != null && !strN.isEmpty()) {
                    try {
                        jSONObject2 = new JSONObject(strN);
                    } catch (JSONException unused) {
                    }
                }
                try {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.putOpt("network_connection_type", Integer.valueOf(iE));
                        jSONObject3.putOpt("public_ip", str2);
                        jSONObject3.putOpt("time", Long.valueOf(j7));
                        jSONObject3.putOpt("nc_is_not_vpn", boolI);
                        jSONObject = jSONObject3;
                    } catch (JSONException e4) {
                        ch.n.e("PublicIpUtils", e4);
                        jSONObject = null;
                    }
                    jSONObject2.putOpt(String.valueOf(iE), jSONObject);
                } catch (JSONException e10) {
                    ch.n.e("PublicIpUtils", e10);
                }
                fVar.u("last_public_ips", jSONObject2.toString().toString());
                if (!tt.l.D0(str2)) {
                    ch.n.b("DeviceIpRepository", "Notifying public IP resolved: " + i0Var);
                    Iterator it = ((CopyOnWriteArraySet) eVar.f13797d).iterator();
                    while (it.hasNext()) {
                        uj.a aVar = (uj.a) it.next();
                        aVar.getClass();
                        ch.n.b("IpWatcher", "Public IP resolved: " + i0Var);
                        aVar.f23572e.execute(new s9.c(aVar, 2, i0Var));
                    }
                }
            }
        } else {
            ch.n.b("ResolvePublicIpJob", "IP collection is disabled. Not running.");
            om.f fVar2 = (om.f) eVar.f13800x;
            fVar2.d("last_public_ip");
            fVar2.d("last_public_ip_time");
            fVar2.d("last_public_ips");
        }
        super.j(j);
        ni.g0 g0Var = new ni.g0(g(), this.f23926y, this.K, this.f23922d, this.L, this.D, this.J);
        ch.n.b("ResolvePublicIpJob", "onFinish");
        g0Var.toString();
        ch.n.a();
        hk.h hVar = this.E;
        if (hVar != null) {
            hVar.d(this.L, g0Var);
        }
    }
}
