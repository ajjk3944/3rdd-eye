package mi;

import ak.d1;
import com.opensignal.sdk.data.traceroute.Traceroute;
import h9.r2;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Timer;
import ni.w0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v extends f {
    public final df.c P;
    public final Traceroute Q;
    public final r2 R;
    public final cj.a S;
    public final String T;
    public final String U;
    public final Timer V;
    public final JSONArray W;
    public String X;
    public String Y;
    public final i.g0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(df.c cVar, Traceroute traceroute, fh.f fVar, zh.a aVar, zh.e eVar, r2 r2Var, cj.a aVar2, xi.j jVar, io.sentry.hints.i iVar, String str) {
        super(iVar, fVar, cVar, aVar, eVar, jVar, str);
        br.l.e(str, "taskName");
        this.P = cVar;
        this.Q = traceroute;
        this.R = r2Var;
        this.S = aVar2;
        this.T = "TRACEROUTE";
        this.U = "TracerouteJob";
        this.V = new Timer();
        this.W = new JSONArray();
        this.Z = new i.g0(this);
    }

    @Override // vj.b
    public final String f() {
        return this.T;
    }

    @Override // mi.f, vj.b
    public final void k(String str, boolean z10, long j) {
        d1 d1Var;
        String str2;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        boolean zInit = this.Q.init(false);
        Timer timer = this.V;
        if (zInit) {
            long j7 = this.f23926y;
            r2 r2Var = this.R;
            String strI0 = r2Var.i0(j7);
            String strL0 = r2Var.l0(this.f23926y);
            if (strI0 == null || tt.l.D0(strI0) || strL0 == null || tt.l.D0(strL0)) {
                d1Var = null;
            } else {
                ch.n.b("TracerouteJob", "getTracerouteEndpointFromSharedJobData: endpoint = [" + strI0 + "], ipAddress = [" + strL0 + ']');
                d1Var = new d1(strI0, strL0, true);
            }
            if (d1Var == null) {
                List list = h().f529f.f455g.f467a;
                String str3 = "";
                if (list.isEmpty()) {
                    str2 = "";
                } else {
                    fr.a aVar = fr.d.f9050a;
                    str2 = (String) mq.o.G0(list);
                }
                if (!tt.l.D0(str2)) {
                    try {
                        String hostAddress = InetAddress.getByName(str2).getHostAddress();
                        if (hostAddress != null) {
                            str3 = hostAddress;
                        }
                    } catch (SecurityException e4) {
                        ch.n.c("TracerouteJob", u() + " getIpAddress() exception = " + e4);
                    } catch (UnknownHostException e10) {
                        ch.n.c("TracerouteJob", u() + " getIpAddress() exception = " + e10);
                    }
                }
                ch.n.b("TracerouteJob", "getRandomEndpointFromConfig: endpoint = [" + str2 + "], ipAddress = [" + str3 + ']');
                d1Var = new d1(str2, str3, false);
            }
            if (d1Var.f502a.length() > 0) {
                long j10 = h().f529f.f455g.f470d;
                long j11 = h().f529f.f455g.f471e;
                int i10 = h().f529f.f455g.f468b;
                int i11 = h().f529f.f455g.f469c;
                long j12 = (i10 * i11 * j11) + 1000;
                timer.schedule(new u(j12, this), j12);
                this.Q.start(this.Z, d1Var.f502a, d1Var.f503b, d1Var.f504c, i10, i11, j10, j11);
            }
        }
        super.j(j);
        timer.cancel();
        timer.purge();
        String strN = n();
        String str4 = this.X;
        String str5 = this.Y;
        long jG = g();
        long j13 = this.f23926y;
        String str6 = this.D;
        this.P.getClass();
        w0 w0Var = new w0(jG, j13, this.f23922d, this.T, str6, System.currentTimeMillis(), this.W, new JSONArray(strN), str4, str5);
        hk.h hVar = this.E;
        if (hVar != null) {
            hVar.d(this.T, w0Var);
        }
    }

    @Override // mi.f, vj.b
    public final void l(long j) {
        w("STOP", "Test interrupted before completion");
        this.Q.stop();
        super.l(j);
    }

    @Override // mi.f
    public final String o() {
        return this.U;
    }

    public final String u() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f23922d);
        sb2.append(':');
        return w.g.h(sb2, this.f23926y, ']');
    }

    public final void v(JSONObject jSONObject) {
        String strK = xu.d.K("ip", jSONObject);
        if (strK == null || strK.equals("*")) {
            return;
        }
        cj.a aVar = this.S;
        try {
            InetAddress byName = InetAddress.getByName(strK);
            if (!(byName instanceof Inet4Address) && !(byName instanceof Inet6Address)) {
                return;
            }
            if (!byName.isSiteLocalAddress() && !byName.isAnyLocalAddress() && !byName.isLinkLocalAddress()) {
                if (!byName.isLoopbackAddress()) {
                    return;
                }
            }
            jSONObject.put("ip", "x.x.x.x");
        } catch (SecurityException e4) {
            ch.n.e("TracerouteJob", e4);
            aVar.getClass();
            cj.a.G(e4);
        } catch (UnknownHostException e10) {
            ch.n.e("TracerouteJob", e10);
            aVar.getClass();
            cj.a.G(e10);
        }
    }

    public final void w(String str, String str2) {
        t(str, new fh.d[]{new fh.d(str2, "INFO")});
    }
}
