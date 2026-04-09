package mi;

import android.os.SystemClock;
import ni.x0;

/* loaded from: classes.dex */
public final class r extends vj.b {
    public final /* synthetic */ int F = 1;
    public final df.c G;
    public final String H;
    public final Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ek.c cVar, df.c cVar2, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.I = cVar;
        this.G = cVar2;
        this.H = "TRIM_DATABASE_TABLES";
    }

    @Override // vj.b
    public final String f() {
        switch (this.F) {
        }
        return this.H;
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) throws InterruptedException {
        switch (this.F) {
            case 0:
                String str2 = this.H;
                df.c cVar = this.G;
                yi.e eVar = (yi.e) this.I;
                br.l.e(str, "dataEndpoint");
                super.k(str, z10, j);
                StringBuilder sb2 = new StringBuilder("Checking data transferred for task: ");
                String str3 = this.f23922d;
                sb2.append(str3);
                sb2.append(" with limits: ");
                sb2.append(m());
                ch.n.b("LowDataTransferJob", sb2.toString());
                if (m().f608a == 0 && m().f609b == 0) {
                    ch.n.b("LowDataTransferJob", "Success: data transfer is low enough");
                    super.j(j);
                    hk.h hVar = this.E;
                    if (hVar != null) {
                        hVar.d(str2, null);
                        return;
                    }
                    return;
                }
                cVar.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long jC = eVar.c();
                long jD = eVar.d();
                Thread.sleep(m().f610c);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                double d6 = (jElapsedRealtime2 - jElapsedRealtime) / 1000.0d;
                double dC = ((eVar.c() - jC) / 1000.0d) / d6;
                double d10 = ((eVar.d() - jD) / 1000.0d) / d6;
                ch.n.b("LowDataTransferJob", "Download speed: " + dC + ". Threshold: " + m().f608a);
                ch.n.b("LowDataTransferJob", "  Upload speed: " + d10 + ". Threshold: " + m().f609b);
                if ((m().f608a <= 0 || dC <= m().f608a) && (m().f609b <= 0 || d10 <= m().f609b)) {
                    ch.n.b("LowDataTransferJob", "Success: data transfer is low enough");
                    super.j(j);
                    hk.h hVar2 = this.E;
                    if (hVar2 != null) {
                        hVar2.d(str2, null);
                        return;
                    }
                    return;
                }
                ch.n.b("LowDataTransferJob", "Error: data transfer is too high");
                super.i(j);
                hk.h hVar3 = this.E;
                if (hVar3 != null) {
                    hVar3.e(str2, "[" + str3 + ':' + j + "] data transfer too high");
                    return;
                }
                return;
            default:
                br.l.e(str, "dataEndpoint");
                super.k(str, z10, j);
                long j7 = h().f529f.f449a.f479h;
                ek.c cVar2 = (ek.c) this.I;
                synchronized (cVar2.f8192a) {
                    ch.n.b("DatabaseJobResultRepository", "Trim database, ready to trim database and delete old items");
                    ch.n.b("DatabaseJobResultRepository", "Trim database, trimmed " + cVar2.f8192a.f(cVar2.f8193b, System.currentTimeMillis() - j7) + " items.");
                }
                super.j(j);
                String str4 = this.f23922d;
                this.G.getClass();
                x0 x0Var = new x0(0, j, System.currentTimeMillis(), str4);
                hk.h hVar4 = this.E;
                if (hVar4 != null) {
                    hVar4.d(this.H, x0Var);
                    return;
                }
                return;
        }
    }

    public ak.l m() {
        return h().f529f.f456h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yi.e eVar, df.c cVar, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.I = eVar;
        this.G = cVar;
        this.H = "LOW_DATA_TRANSFER";
    }
}
