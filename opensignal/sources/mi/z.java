package mi;

import ak.f1;
import ak.g1;
import ak.h1;
import android.content.Context;
import h7.h0;
import h9.r2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ni.a1;
import ni.b1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z extends f implements mh.a {
    public final gj.b P;
    public final df.c Q;
    public final cj.a R;
    public final r2 S;
    public final jk.c T;
    public final sm.f U;
    public final x V;
    public g1 W;
    public f1 X;
    public sm.m Y;
    public final String Z;

    /* renamed from: a0, reason: collision with root package name */
    public final String f16824a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f16825b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f16826c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ArrayList f16827d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ArrayList f16828e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ArrayList f16829f0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashMap f16830g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashMap f16831h0;

    /* renamed from: i0, reason: collision with root package name */
    public final LinkedHashMap f16832i0;

    /* renamed from: j0, reason: collision with root package name */
    public b1 f16833j0;

    /* renamed from: k0, reason: collision with root package name */
    public final h0 f16834k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, gj.b bVar, df.c cVar, cj.a aVar, r2 r2Var, jk.c cVar2, sm.f fVar, x xVar, zh.e eVar, fh.f fVar2, zh.a aVar2, xi.j jVar, io.sentry.hints.i iVar, String str) {
        super(iVar, fVar2, cVar, aVar2, eVar, jVar, TimeUnit.MICROSECONDS, str);
        br.l.e(cVar2, "packetValidator");
        br.l.e(xVar, "udpConfigSelector");
        br.l.e(str, "taskName");
        this.P = bVar;
        this.Q = cVar;
        this.R = aVar;
        this.S = r2Var;
        this.T = cVar2;
        this.U = fVar;
        this.V = xVar;
        this.Z = "UDP_VERIFICATION";
        this.f16824a0 = "UdpVerificationJob";
        this.f16827d0 = new ArrayList();
        this.f16828e0 = new ArrayList();
        this.f16829f0 = new ArrayList();
        this.f16830g0 = new LinkedHashMap();
        this.f16831h0 = new LinkedHashMap();
        this.f16832i0 = new LinkedHashMap();
        this.f16834k0 = new h0(this);
    }

    public static final a1 u(z zVar, boolean z10, mh.c cVar) {
        long jG = zVar.g();
        long j = zVar.f23926y;
        String str = zVar.Z;
        String str2 = zVar.f23922d;
        String str3 = zVar.D;
        zVar.Q.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = cVar.f16711b;
        int i11 = cVar.f16712c;
        int i12 = cVar.f16713d;
        int i13 = cVar.f16714e;
        long j7 = cVar.f16715f;
        long j10 = cVar.f16716g;
        long j11 = cVar.f16717h;
        byte[] bArr = cVar.f16718i;
        g1 g1Var = zVar.W;
        if (g1Var == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        String str4 = g1Var.f539i;
        String str5 = g1Var.f538h;
        br.l.b(bArr);
        return new a1(jG, j, str2, str, str3, jCurrentTimeMillis, z10, i10, i11, i12, i13, j7, j10, j11, bArr, str4, str5);
    }

    @Override // mh.a
    public final void c(Exception exc) {
        ch.n.e("UdpVerificationJob", exc);
        this.R.getClass();
        cj.a.E(exc, "UdpVerificationJob: onUnknownError()");
    }

    @Override // vj.b
    public final String f() {
        return this.Z;
    }

    @Override // mi.f, vj.b
    public final void k(String str, boolean z10, long j) throws JSONException, InterruptedException, IOException {
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        ak.c0 c0Var = h().f529f;
        this.X = c0Var.f451c;
        h1 h1Var = c0Var.f452d;
        int i10 = h1Var.f543a;
        this.U.getClass();
        this.Y = i10 == 1 ? new sm.m() : new sm.m();
        f1 f1Var = this.X;
        if (f1Var == null) {
            br.l.l("udpConfig");
            throw null;
        }
        List list = f1Var.f520a;
        boolean z11 = f1Var.f521b;
        int i11 = f1Var.f522c;
        w wVarA = this.V.a(list.size(), j);
        int i12 = wVarA.f16820a;
        String str2 = wVarA.f16821b;
        g1 g1Var = (g1) list.get(i12);
        ch.n.b("UdpVerificationJob", "Using UDP config at index: " + i12 + " -> " + g1Var);
        this.W = g1.a(g1Var, h1Var.f544b, h1Var.f545c, 8107);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("echo_factor", 1);
        g1 g1Var2 = this.W;
        if (g1Var2 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("local_port", g1Var2.f532b);
        g1 g1Var3 = this.W;
        if (g1Var3 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("number_packets_to_send", g1Var3.f533c);
        g1 g1Var4 = this.W;
        if (g1Var4 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("packet_header_size_bytes", g1Var4.f534d);
        g1 g1Var5 = this.W;
        if (g1Var5 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("remote_port", g1Var5.f536f);
        g1 g1Var6 = this.W;
        if (g1Var6 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("target_send_rate_kbps", g1Var6.f537g);
        g1 g1Var7 = this.W;
        if (g1Var7 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("test_name", g1Var7.f538h);
        g1 g1Var8 = this.W;
        if (g1Var8 == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        jSONObject.put("url", g1Var8.f539i);
        jSONObject.put("test_completion_method", i11);
        jSONObject.put("version", i10);
        jSONObject.put("packet_sending_offset_enabled", z11);
        jSONObject.put("payload_length_bytes", 128);
        mh.b bVar = new mh.b(jSONObject);
        gj.b bVar2 = this.P;
        mh.l lVar = new mh.l(bVar, bVar2.f9598h, bVar2.f9599i, bVar2.k, str2, true);
        lVar.f16763m = this;
        lVar.f16755c = this.f16834k0;
        lVar.f16768r = this;
        lVar.a();
        b1 b1Var = this.f16833j0;
        String str3 = this.Z;
        if (b1Var == null) {
            hk.h hVar = this.E;
            if (hVar != null) {
                hVar.e(str3, "unknown");
            }
            super.i(j);
            return;
        }
        super.j(j);
        b1 b1Var2 = this.f16833j0;
        b1 b1VarI = b1Var2 != null ? b1.i(b1Var2, 0L, n(), 261119) : null;
        this.f16833j0 = b1VarI;
        hk.h hVar2 = this.E;
        if (hVar2 != null) {
            hVar2.d(str3, b1VarI);
        }
    }

    @Override // mi.f
    public final String o() {
        return this.f16824a0;
    }
}
