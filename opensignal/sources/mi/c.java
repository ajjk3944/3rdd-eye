package mi;

import android.os.Build;
import android.telephony.TelephonyManager;
import h9.r2;
import java.util.ArrayList;
import org.json.JSONObject;
import p.l2;

/* loaded from: classes.dex */
public final class c extends vj.b {
    public final ch.i F;
    public final ch.f G;
    public final int H;
    public final String I;
    public final df.c J;
    public final dj.g K;
    public final ag.b L;
    public final b9.c M;
    public final r2 N;
    public final oh.p O;
    public final bm.e P;
    public final xi.j Q;
    public final l2 R;
    public final js.e S;
    public ni.h T;
    public final String U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ch.i iVar, ch.f fVar, int i10, df.c cVar, dj.g gVar, ag.b bVar, b9.c cVar2, r2 r2Var, oh.p pVar, bm.e eVar, xi.j jVar, l2 l2Var, js.e eVar2, io.sentry.hints.i iVar2, String str) {
        super(iVar2, str);
        br.l.e(str, "taskName");
        this.F = iVar;
        this.G = fVar;
        this.H = i10;
        this.I = "92.0.0";
        this.J = cVar;
        this.K = gVar;
        this.L = bVar;
        this.M = cVar2;
        this.N = r2Var;
        this.O = pVar;
        this.P = eVar;
        this.Q = jVar;
        this.R = l2Var;
        this.S = eVar2;
        this.U = "DAILY";
    }

    @Override // vj.b
    public final String f() {
        return this.U;
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) throws Throwable {
        String string;
        boolean z11;
        Throwable th2;
        String strN;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        this.J.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        fj.g gVarB = this.K.b();
        long jG = g();
        long j7 = this.f23926y;
        String str2 = this.D;
        ch.i iVar = this.F;
        long jA = iVar.a();
        ch.f fVar = this.G;
        fVar.getClass();
        String str3 = Build.VERSION.RELEASE;
        br.l.d(str3, "RELEASE");
        int i10 = fVar.f3941a;
        Integer num = fVar.f3942b;
        long jA2 = iVar.a();
        String str4 = h().f528e;
        int i11 = h().f525b;
        int i12 = h().f526c;
        String str5 = h().f527d;
        TelephonyManager telephonyManager = gVarB.f8914c;
        boolean zIsNetworkRoaming = telephonyManager != null ? telephonyManager.isNetworkRoaming() : false;
        ag.b bVar = this.L;
        boolean zI = bVar.i("android.permission.READ_PHONE_STATE");
        boolean zI2 = bVar.i("android.permission.READ_BASIC_PHONE_STATE");
        boolean zI3 = bVar.i("android.permission.ACCESS_COARSE_LOCATION");
        boolean zI4 = bVar.i("android.permission.ACCESS_FINE_LOCATION");
        boolean zI5 = bVar.i("android.permission.ACCESS_BACKGROUND_LOCATION");
        boolean zI6 = bVar.i("android.permission.ACCESS_WIFI_STATE");
        boolean zI7 = bVar.i("android.permission.ACCESS_NETWORK_STATE");
        boolean zI8 = bVar.i("android.permission.RECEIVE_BOOT_COMPLETED");
        boolean zI9 = bVar.i("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        oh.p pVar = this.O;
        pVar.getClass();
        String strA = oh.p.A();
        ej.b bVar2 = ej.b.EXOPLAYER_DASH;
        this.M.getClass();
        boolean zL = b9.c.l(bVar2);
        String strW = pVar.w();
        boolean zL2 = b9.c.l(ej.b.EXOPLAYER_HLS_MEDIA_SOURCE);
        String strX = pVar.x();
        String str6 = iVar.f3953h;
        Integer num2 = iVar.f3954i;
        Integer numF0 = this.N.f0();
        bm.e eVar = this.P;
        mj.e eVar2 = ((ak.g) ((q3.a) eVar.f2831g).f20680g).f529f.f459m;
        long j10 = eVar2.f16852b;
        long j11 = eVar2.f16851a;
        if (j10 <= 0 || j11 <= 0) {
            string = null;
        } else {
            ArrayList arrayListB = ((ek.c) eVar.f2830d).b();
            JSONObject jSONObjectE = z.b.e(((ak.g) ((q3.a) eVar.f2831g).f20680g).f529f.f459m);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_data_usage_limits", jSONObjectE);
            mj.b bVar3 = mj.b.FOREGROUND;
            jSONObject.put("fg_cell_total_kb", bm.e.k(eVar, arrayListB, j10, bVar3, null, 24));
            mj.b bVar4 = mj.b.BACKGROUND;
            jSONObject.put("bg_cell_total_kb", bm.e.k(eVar, arrayListB, j10, bVar4, null, 24));
            jSONObject.put("fg_cell_limited_tasks_kb", bm.e.k(eVar, arrayListB, j10, bVar3, null, 8));
            jSONObject.put("bg_cell_limited_tasks_kb", bm.e.k(eVar, arrayListB, j10, bVar4, null, 8));
            string = jSONObject.toString();
        }
        ak.s sVar = this.Q.L;
        String strM = gVarB.m();
        Integer numValueOf = (!gVarB.f8912a.d() || telephonyManager == null) ? null : Integer.valueOf(telephonyManager.getSimCarrierId());
        this.R.getClass();
        String strE = l2.E();
        boolean zL3 = b9.c.l(ej.c.MEDIA3_DASH);
        boolean zL4 = b9.c.l(ej.c.MEDIA3_HLS);
        if (h().f529f.f449a.f473b) {
            z11 = zL3;
            th2 = null;
            strN = ((om.f) this.S.f13800x).n("last_public_ips", null);
        } else {
            z11 = zL3;
            th2 = null;
            strN = null;
        }
        ni.h hVar = new ni.h(jG, j7, this.f23922d, this.U, str2, jCurrentTimeMillis, jA, this.I, this.H, str3, i10, num, jA2, str4, i11, i12, str5, zIsNetworkRoaming, zI, zI2, zI4, zI3, zI5, zI6, zI7, zI8, zI9, strA, Boolean.valueOf(zL), strW, Boolean.valueOf(zL2), strX, str6, num2, numF0, string, sVar, strM, numValueOf, strE, Boolean.valueOf(z11), Boolean.valueOf(zL4), strN);
        this.T = hVar;
        hk.h hVar2 = this.E;
        String str7 = this.U;
        if (hVar2 != null) {
            hVar2.f(str7, hVar);
        }
        super.j(j);
        hk.h hVar3 = this.E;
        if (hVar3 != null) {
            ni.h hVar4 = this.T;
            if (hVar4 != null) {
                hVar3.d(str7, hVar4);
            } else {
                br.l.l("dailyResult");
                throw th2;
            }
        }
    }
}
