package mi;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends vj.b {
    public final df.c F;
    public final xi.j G;
    public final io.sentry.hints.i H;
    public final ch.i I;
    public final ch.f J;
    public final String K;
    public final int L;
    public final String M;
    public ArrayList N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(df.c cVar, xi.j jVar, io.sentry.hints.i iVar, ch.i iVar2, ch.f fVar, int i10, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.F = cVar;
        this.G = jVar;
        this.H = iVar;
        this.I = iVar2;
        this.J = fVar;
        this.K = "92.0.0";
        this.L = i10;
        this.M = "FLUSH_CONNECTION_INFO";
        this.N = new ArrayList();
    }

    @Override // vj.b
    public final String f() {
        return this.M;
    }

    @Override // vj.b
    public final void i(long j) {
        hk.h hVar = this.E;
        if (hVar != null) {
            StringBuilder sb2 = new StringBuilder("[");
            c7.a.A(sb2, this.f23922d, ':', j);
            sb2.append("] Unknown error");
            hVar.e(this.M, sb2.toString());
        }
        super.i(j);
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) {
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        xi.j jVar = this.G;
        Collection collectionValues = jVar.N.values();
        br.l.d(collectionValues, "<get-values>(...)");
        ArrayList arrayListR0 = mq.o.R0(mq.o.M0(mq.o.Q0(collectionValues), new dv.h(12)));
        if (!arrayListR0.isEmpty()) {
            arrayListR0.remove(0);
        }
        boolean zIsEmpty = arrayListR0.isEmpty();
        String str2 = this.f23922d;
        if (zIsEmpty) {
            ch.n.b("FlushConnectionInfoJob", "[" + str2 + ':' + j + "] No item found to flush.");
            i(j);
            return;
        }
        this.N = arrayListR0;
        ArrayList arrayList = new ArrayList(mq.p.a0(arrayListR0, 10));
        Iterator it = arrayListR0.iterator();
        while (it.hasNext()) {
            arrayList.add(((ak.s) it.next()).f656a);
        }
        if (arrayList.isEmpty()) {
            ch.n.g("FlushConnectionInfoJob", "[" + str2 + ':' + j + "] Error flushing connection info items: List of Ids is empty.");
            i(j);
            return;
        }
        ch.n.b("DeviceConnectionRepository", "Removing " + arrayList.size() + " rows...");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jVar.N.remove((String) it2.next());
        }
        jVar.d();
        hk.h hVar = this.E;
        if (hVar != null) {
            String str3 = this.f23922d;
            String str4 = this.M;
            hVar.f(str4, m(j, str3, str, str4));
        }
        ch.n.b("FlushConnectionInfoJob", "[" + str2 + ':' + j + "] onFinish");
        super.j(j);
        hk.h hVar2 = this.E;
        if (hVar2 != null) {
            String str5 = this.f23922d;
            String str6 = this.D;
            String str7 = this.M;
            hVar2.d(str7, m(j, str5, str6, str7));
        }
    }

    @Override // vj.b
    public final void l(long j) {
        StringBuilder sb2 = new StringBuilder("[");
        c7.a.A(sb2, this.f23922d, ':', j);
        sb2.append("] stop");
        ch.n.b("FlushConnectionInfoJob", sb2.toString());
        super.l(j);
    }

    public final ni.s m(long j, String str, String str2, String str3) {
        String str4 = str;
        br.l.e(str4, "taskName");
        String str5 = str2;
        br.l.e(str5, "dataEndpoint");
        String str6 = str3;
        br.l.e(str6, "jobType");
        this.H.getClass();
        long jAbs = Math.abs(fr.d.f9050a.d().nextLong());
        this.F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.N.iterator();
        while (it.hasNext()) {
            ak.s sVar = (ak.s) it.next();
            ch.i iVar = this.I;
            String strValueOf = String.valueOf(iVar.a());
            ch.f fVar = this.J;
            fVar.getClass();
            String str7 = Build.VERSION.RELEASE;
            br.l.d(str7, "RELEASE");
            long j7 = jAbs;
            jAbs = j7;
            arrayList.add(new ni.t(jAbs, j, str4, str6, str5, jCurrentTimeMillis, strValueOf, this.K, this.L, str7, fVar.f3941a, iVar.a(), h().f528e, h().f525b, h().f526c, h().f527d, sVar.f656a, sVar.f657b, sVar.f658c, sVar.f659d, sVar.f660e, sVar.f661f, sVar.f662g, sVar.f663h, sVar.f664i, sVar.j, sVar.k, sVar.f665l, sVar.f666m, fVar.f3942b));
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        return new ni.s(jAbs, j, str, str3, str2, jCurrentTimeMillis, arrayList);
    }
}
