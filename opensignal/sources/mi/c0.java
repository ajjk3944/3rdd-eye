package mi;

import ak.e1;
import ak.i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ni.x0;
import p.l2;

/* loaded from: classes.dex */
public final class c0 extends vj.b {
    public final bm.d F;
    public final l2 G;
    public final fk.a H;
    public final cj.a I;
    public final df.c J;
    public final a8.f K;
    public final ek.c L;
    public final al.b M;
    public final List N;
    public final String O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(bm.d dVar, l2 l2Var, fk.a aVar, cj.a aVar2, df.c cVar, a8.f fVar, ek.c cVar2, al.b bVar, List list, o oVar, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(aVar, "jobResultsUploader");
        br.l.e(list, "specificTasksToUpload");
        br.l.e(oVar, "uploadJobType");
        br.l.e(str, "taskName");
        this.F = dVar;
        this.G = l2Var;
        this.H = aVar;
        this.I = aVar2;
        this.J = cVar;
        this.K = fVar;
        this.L = cVar2;
        this.M = bVar;
        this.N = list;
        this.O = oVar.name();
    }

    @Override // vj.b
    public final String f() {
        return this.O;
    }

    @Override // vj.b
    public final void j(long j) {
        StringBuilder sb2 = new StringBuilder("[");
        c7.a.A(sb2, this.f23922d, ':', j);
        sb2.append("] onFinish");
        ch.n.b("UploadResultsJob", sb2.toString());
        this.H.f8971n.remove(Long.valueOf(j));
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
        List<String> listE;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        char c4 = ':';
        if (!this.K.f()) {
            StringBuilder sb2 = new StringBuilder("[");
            c7.a.A(sb2, this.f23922d, ':', j);
            sb2.append("] Another higher priority SDK is running. Skip uploading.");
            ch.n.b("UploadResultsJob", sb2.toString());
            m();
            return;
        }
        if (!this.G.D()) {
            StringBuilder sb3 = new StringBuilder("[");
            c7.a.A(sb3, this.f23922d, ':', j);
            sb3.append("] Data consent not given. Skip uploading.");
            ch.n.b("UploadResultsJob", sb3.toString());
            m();
            return;
        }
        al.b bVar = this.M;
        e1 e1VarG = bVar.g(0, 0);
        e1 e1Var = e1.CONNECTED;
        boolean z11 = true;
        if (e1VarG != e1Var && bVar.g(1, 1) != e1Var) {
            StringBuilder sb4 = new StringBuilder("[");
            c7.a.A(sb4, this.f23922d, ':', j);
            sb4.append("] Not connected to a network. Skip uploading.");
            ch.n.b("UploadResultsJob", sb4.toString());
            m();
            return;
        }
        ak.b bVarW = this.F.w();
        Objects.toString(bVarW);
        ch.n.a();
        if (bVarW == null) {
            StringBuilder sb5 = new StringBuilder("[");
            c7.a.A(sb5, this.f23922d, ':', j);
            sb5.append("] API secret is null");
            ch.n.c("UploadResultsJob", sb5.toString());
            cj.a aVar = this.I;
            StringBuilder sb6 = new StringBuilder("[");
            c7.a.A(sb6, this.f23922d, ':', j);
            sb6.append("] API secret is null");
            String string = sb6.toString();
            aVar.getClass();
            cj.a.F(string);
            return;
        }
        if (this.N.isEmpty()) {
            ek.c cVar = this.L;
            synchronized (cVar.f8192a) {
                listE = cVar.f8192a.e(cVar.f8193b);
            }
        } else {
            listE = this.N;
        }
        if (listE.isEmpty()) {
            j(j);
            return;
        }
        fk.a aVar2 = this.H;
        aVar2.getClass();
        aVar2.f8971n.put(Long.valueOf(j), this);
        fk.a aVar3 = this.H;
        String str2 = this.f23922d;
        ak.d dVar = h().f529f.f449a;
        aVar3.getClass();
        br.l.e(str2, "taskName");
        synchronized (aVar3.f8968i) {
            try {
                ch.n.b("JobResultsUploader", "Task " + j + " acquired lock in thread " + Thread.currentThread().getName());
                StringBuilder sb7 = new StringBuilder("Tasks to upload data for ");
                sb7.append(listE);
                ch.n.b("JobResultsUploader", sb7.toString());
                aVar3.f8967h.f20680g = aVar3;
                ch.n.b("JobResultsUploader", "Reset upload counters");
                aVar3.j = 0;
                aVar3.k = 0;
                aVar3.f8969l = 0;
                aVar3.f8972o = null;
                int i10 = dVar.f475d;
                for (String str3 : listE) {
                    ArrayList arrayListC = aVar3.c(str3);
                    boolean z12 = z11;
                    ch.n.b("JobResultsUploader", '[' + str2 + c4 + j + "] Total results for " + str3 + " - " + arrayListC.size());
                    ArrayList arrayListE = fk.a.e(i10, arrayListC);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append('[');
                    sb8.append(str2);
                    sb8.append(':');
                    sb8.append(j);
                    sb8.append("] Total chunks is ");
                    sb8.append(arrayListE.size());
                    ch.n.b("JobResultsUploader", sb8.toString());
                    Iterator it = arrayListE.iterator();
                    while (it.hasNext()) {
                        ArrayList arrayListA = aVar3.f8961b.a((List) it.next());
                        ch.n.b("JobResultsUploader", '[' + str2 + ':' + j + "] Total results to upload in chunk " + arrayListA.size());
                        for (i1 i1Var : (List) aVar3.f8963d.a(arrayListA)) {
                            aVar3.j++;
                            aVar3.f8972o = i1Var;
                            aVar3.f(bVarW, i1Var, dVar.f487r);
                        }
                    }
                    z11 = z12;
                    c4 = ':';
                }
                aVar3.f8967h.f20680g = null;
                dr.a aVarD = aVar3.d();
                aVar3.f8970m = aVarD;
                Objects.toString(aVarD);
                ch.n.a();
                if (aVar3.f8970m == null) {
                    return;
                }
                for (Map.Entry entry : aVar3.f8971n.entrySet()) {
                    br.l.b(entry);
                    Long l10 = (Long) entry.getKey();
                    c0 c0Var = (c0) entry.getValue();
                    if (aVar3.f8970m instanceof bk.i) {
                        br.l.b(l10);
                        long jLongValue = l10.longValue();
                        StringBuilder sb9 = new StringBuilder("[");
                        c7.a.A(sb9, c0Var.f23922d, ':', jLongValue);
                        sb9.append("] onSuccess");
                        ch.n.b("UploadResultsJob", sb9.toString());
                        c0Var.j(jLongValue);
                    } else {
                        br.l.b(l10);
                        long jLongValue2 = l10.longValue();
                        StringBuilder sb10 = new StringBuilder("[");
                        c7.a.A(sb10, c0Var.f23922d, ':', jLongValue2);
                        sb10.append("] onFailure");
                        ch.n.b("UploadResultsJob", sb10.toString());
                        c0Var.m();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vj.b
    public final void l(long j) {
        StringBuilder sb2 = new StringBuilder("[");
        c7.a.A(sb2, this.f23922d, ':', j);
        sb2.append("] stop");
        ch.n.b("UploadResultsJob", sb2.toString());
        this.H.f8971n.remove(Long.valueOf(j));
        super.l(j);
    }

    public final void m() {
        if (this.B) {
            j(this.f23926y);
            return;
        }
        long j = this.f23926y;
        this.H.f8971n.remove(Long.valueOf(j));
        hk.h hVar = this.E;
        if (hVar != null) {
            StringBuilder sb2 = new StringBuilder("[");
            c7.a.A(sb2, this.f23922d, ':', j);
            sb2.append("] Unknown error");
            hVar.e(this.O, sb2.toString());
        }
        super.i(j);
    }
}
