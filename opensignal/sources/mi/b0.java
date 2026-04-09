package mi;

import ak.e1;
import android.content.Context;
import h9.r2;
import java.io.File;
import ni.x0;
import p.l2;

/* loaded from: classes.dex */
public final class b0 extends vj.b {
    public final Context F;
    public final bm.d G;
    public final l2 H;
    public final cj.a I;
    public final df.c J;
    public final a8.f K;
    public final al.b L;
    public final r2 M;
    public final qm.c N;
    public final String O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, bm.d dVar, l2 l2Var, cj.a aVar, df.c cVar, a8.f fVar, al.b bVar, r2 r2Var, qm.c cVar2, io.sentry.hints.i iVar, o oVar, String str) {
        super(iVar, str);
        br.l.e(r2Var, "urlConnectionZipUploader");
        br.l.e(cVar2, "mlvisFileGenerator");
        br.l.e(oVar, "uploadJobType");
        br.l.e(str, "taskName");
        this.F = context;
        this.G = dVar;
        this.H = l2Var;
        this.I = aVar;
        this.J = cVar;
        this.K = fVar;
        this.L = bVar;
        this.M = r2Var;
        this.N = cVar2;
        this.O = oVar.name();
    }

    @Override // vj.b
    public final String f() {
        return this.O;
    }

    @Override // vj.b
    public final void j(long j) {
        super.j(j);
        this.J.getClass();
        x0 x0Var = new x0(2, j, System.currentTimeMillis(), this.f23922d);
        hk.h hVar = this.E;
        if (hVar != null) {
            hVar.d(this.O, x0Var);
        }
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) {
        qm.c cVar = this.N;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        if (!this.K.f()) {
            j(j);
            return;
        }
        if (!this.H.D()) {
            j(j);
            return;
        }
        al.b bVar = this.L;
        e1 e1VarG = bVar.g(0, 0);
        e1 e1Var = e1.CONNECTED;
        if (e1VarG != e1Var && bVar.g(1, 1) != e1Var) {
            j(j);
            return;
        }
        ak.b bVarW = this.G.w();
        String str2 = this.f23922d;
        cj.a aVar = this.I;
        if (bVarW == null) {
            aVar.getClass();
            cj.a.F("[" + str2 + ':' + j + "] API secret is null");
            j(j);
            return;
        }
        if (!h().f529f.f463q.f496a) {
            j(j);
            return;
        }
        try {
            String str3 = this.F.getFilesDir().getAbsolutePath() + "/logs/";
            File file = new File(str3 + "mlvis-logs.json");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append("mlvis-");
            this.J.getClass();
            sb2.append(System.currentTimeMillis());
            sb2.append(".json");
            File file2 = new File(sb2.toString());
            cVar.x(file2, file);
            if (file2.exists()) {
                this.M.w1(file2);
            }
            if (file.exists()) {
                file.delete();
            }
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Exception e4) {
            aVar.getClass();
            cj.a.E(e4, "[" + str2 + ':' + j + "] failed");
        }
        j(j);
    }
}
