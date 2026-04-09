package mi;

import ak.f1;
import ak.g1;
import android.content.Context;
import h7.r1;
import h9.r2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ni.y0;
import ni.z0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y extends f implements mh.a {
    public final gj.b P;
    public final df.c Q;
    public final cj.a R;
    public final r2 S;
    public final x T;
    public final jk.c U;
    public g1 V;
    public final String W;
    public final String X;
    public z0 Y;
    public final ArrayList Z;

    /* renamed from: a0, reason: collision with root package name */
    public final r1 f16823a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, gj.b bVar, df.c cVar, cj.a aVar, r2 r2Var, x xVar, jk.c cVar2, zh.e eVar, fh.f fVar, zh.a aVar2, xi.j jVar, io.sentry.hints.i iVar, String str) {
        super(iVar, fVar, cVar, aVar2, eVar, jVar, TimeUnit.MICROSECONDS, str);
        br.l.e(xVar, "udpConfigSelector");
        br.l.e(cVar2, "packetValidator");
        br.l.e(str, "taskName");
        this.P = bVar;
        this.Q = cVar;
        this.R = aVar;
        this.S = r2Var;
        this.T = xVar;
        this.U = cVar2;
        this.W = "UDP";
        this.X = "UdpJob";
        this.Z = new ArrayList();
        this.f16823a0 = new r1(22, this);
    }

    public static final y0 u(y yVar, boolean z10, mh.c cVar) {
        long jG = yVar.g();
        long j = yVar.f23926y;
        String str = yVar.W;
        String str2 = yVar.f23922d;
        String str3 = yVar.D;
        yVar.Q.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = cVar.f16711b;
        int i11 = cVar.f16712c;
        int i12 = cVar.f16713d;
        int i13 = cVar.f16714e;
        long j7 = cVar.f16715f;
        long j10 = cVar.f16716g;
        long j11 = cVar.f16717h;
        byte[] bArr = cVar.f16718i;
        g1 g1Var = yVar.V;
        if (g1Var == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        String str4 = g1Var.f539i;
        String str5 = g1Var.f538h;
        br.l.b(bArr);
        return new y0(jG, j, str2, str, str3, jCurrentTimeMillis, z10, i10, i11, i12, i13, j7, j10, j11, bArr, str4, str5);
    }

    @Override // mh.a
    public final void c(Exception exc) {
        ch.n.e("UdpJob", exc);
        this.R.getClass();
        cj.a.E(exc, "UdpJob: onUnknownError()");
    }

    @Override // vj.b
    public final String f() {
        return this.W;
    }

    @Override // mi.f, vj.b
    public final void k(String str, boolean z10, long j) throws JSONException, InterruptedException, IOException {
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        f1 f1Var = h().f529f.f451c;
        List list = f1Var.f520a;
        boolean z11 = f1Var.f521b;
        int i10 = f1Var.f522c;
        boolean z12 = f1Var.f523d;
        w wVarA = this.T.a(list.size(), j);
        int i11 = wVarA.f16820a;
        String str2 = wVarA.f16821b;
        this.V = (g1) list.get(i11);
        StringBuilder sbU = h0.b.u("Using UDP config item at index: ", i11, " -> ");
        g1 g1Var = this.V;
        if (g1Var == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        sbU.append(g1Var);
        ch.n.b("UdpJob", sbU.toString());
        JSONObject jSONObject = new JSONObject();
        g1 g1Var2 = this.V;
        if (g1Var2 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("echo_factor", g1Var2.f531a);
        g1 g1Var3 = this.V;
        if (g1Var3 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("local_port", g1Var3.f532b);
        g1 g1Var4 = this.V;
        if (g1Var4 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("number_packets_to_send", g1Var4.f533c);
        g1 g1Var5 = this.V;
        if (g1Var5 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("packet_header_size_bytes", g1Var5.f534d);
        g1 g1Var6 = this.V;
        if (g1Var6 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("payload_length_bytes", g1Var6.f535e);
        g1 g1Var7 = this.V;
        if (g1Var7 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("remote_port", g1Var7.f536f);
        g1 g1Var8 = this.V;
        if (g1Var8 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("target_send_rate_kbps", g1Var8.f537g);
        g1 g1Var9 = this.V;
        if (g1Var9 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("test_name", g1Var9.f538h);
        g1 g1Var10 = this.V;
        if (g1Var10 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("url", g1Var10.f539i);
        jSONObject.put("test_completion_method", i10);
        jSONObject.put("version", 1);
        jSONObject.put("packet_sending_offset_enabled", z11);
        jSONObject.put("create_packets_before_test", z12);
        g1 g1Var11 = this.V;
        if (g1Var11 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("verification_version", g1Var11.j);
        g1 g1Var12 = this.V;
        if (g1Var12 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("verification_packet_encryption", g1Var12.k);
        g1 g1Var13 = this.V;
        if (g1Var13 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("verification_packets_to_send", g1Var13.f540l);
        g1 g1Var14 = this.V;
        if (g1Var14 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("verification_packets_spacing", g1Var14.f541m);
        mh.b bVar = new mh.b(jSONObject);
        gj.b bVar2 = this.P;
        mh.l lVar = new mh.l(bVar, bVar2.f9598h, bVar2.f9599i, bVar2.k, str2, false);
        lVar.f16763m = this;
        lVar.f16755c = this.f16823a0;
        lVar.f16768r = this;
        lVar.a();
        z0 z0Var = this.Y;
        String str3 = this.W;
        if (z0Var == null) {
            hk.h hVar = this.E;
            if (hVar != null) {
                hVar.e(str3, "unknown");
            }
            super.i(j);
            return;
        }
        super.j(j);
        z0 z0Var2 = this.Y;
        z0 z0VarI = z0Var2 != null ? z0.i(z0Var2, 0L, n(), 1966079) : null;
        this.Y = z0VarI;
        hk.h hVar2 = this.E;
        if (hVar2 != null) {
            hVar2.d(str3, z0VarI);
        }
    }

    @Override // mi.f
    public final String o() {
        return this.X;
    }
}
