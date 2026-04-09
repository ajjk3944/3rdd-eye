package mi;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class i extends vj.b {
    public final gj.b F;
    public final df.c G;
    public final String H;
    public kg.r I;
    public volatile ni.u J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gj.b bVar, df.c cVar, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.F = bVar;
        this.G = cVar;
        this.H = "HTTP_HEAD_LATENCY";
    }

    @Override // vj.b
    public final String f() {
        return this.H;
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) throws Throwable {
        Throwable th2;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        StringBuilder sbK = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
        sbK.append(this.f23922d);
        sbK.append(", isManualExecution = ");
        sbK.append(z10);
        ch.n.b("HttpHeadLatencyJob", sbK.toString());
        Objects.toString(h().f529f.f464r.f734a);
        ch.n.a();
        ak.v vVar = h().f529f.f464r;
        long jG = g();
        String str2 = this.f23922d;
        this.G.getClass();
        this.J = new ni.u(jG, j, str2, this.H, str, System.currentTimeMillis(), new ArrayList());
        gj.b bVar = this.F;
        kg.r rVar = new kg.r(bVar.f9599i, bVar.f9598h, bVar.k);
        this.I = rVar;
        rVar.f14398r = this;
        List<ak.w> list = vVar.f734a;
        br.l.e(list, "endpointList");
        StringBuilder sb2 = new StringBuilder("start() called with: endpointList = ");
        ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ak.w) it.next()).f753c);
        }
        sb2.append(arrayList);
        ch.n.b("HttpHeadLatencyTest", sb2.toString());
        if (((i) rVar.f14398r) != null) {
            ch.n.b("HttpHeadLatencyJob", "onTestStarted()");
        }
        for (ak.w wVar : list) {
            ch.n.b("HttpHeadLatencyTest", "start test for: endpoint = ".concat(wVar.f753c));
            br.w wVar2 = new br.w();
            wVar2.f2917a = new fh.g(wVar.f753c, wVar.f751a, Long.valueOf(wVar.f752b), Long.valueOf(wVar.f755e));
            long j7 = wVar.f755e;
            Thread threadNewThread = ((ThreadFactory) rVar.f14396d).newThread(new ch.a(wVar2, rVar, wVar, 5));
            br.l.d(threadNewThread, "newThread(...)");
            ch.n.b("HttpHeadLatencyTest", "Test started for : ".concat(wVar.f753c));
            ch.n.b("TimeoutHelper", "execute() called");
            threadNewThread.start();
            boolean z11 = false;
            try {
                threadNewThread.join(j7);
                if (threadNewThread.isAlive()) {
                    threadNewThread.interrupt();
                } else {
                    z11 = true;
                }
            } catch (InterruptedException e4) {
                ch.n.d("TimeoutHelper", e4.getLocalizedMessage(), e4);
            }
            ch.n.b("TimeoutHelper", "execute() returned: " + z11);
            if (!z11) {
                wVar2.f2917a = fh.g.a((fh.g) wVar2.f2917a, null, -1, -1L, "Test terminated due to timeout exceeded.", 199);
            }
            ch.n.b("HttpHeadLatencyTest", "Test result received: " + wVar2.f2917a);
            ((ArrayList) rVar.f14397g).add(wVar2.f2917a);
            i iVar = (i) rVar.f14398r;
            if (iVar != null) {
                fh.g gVar = (fh.g) wVar2.f2917a;
                br.l.e(gVar, "testResult");
                StringBuilder sb3 = new StringBuilder("onTestProgress() called with: result = ");
                ni.u uVar = iVar.J;
                if (uVar == null) {
                    br.l.l("result");
                    throw null;
                }
                sb3.append(uVar);
                ch.n.b("HttpHeadLatencyJob", sb3.toString());
                hk.h hVar = iVar.E;
                if (hVar != null) {
                    String str3 = iVar.H;
                    ni.u uVar2 = iVar.J;
                    if (uVar2 == null) {
                        br.l.l("result");
                        throw null;
                    }
                    hVar.f(str3, ni.u.i(uVar2, 0L, e5.e(gVar), 63));
                } else {
                    continue;
                }
            }
        }
        ch.n.b("HttpHeadLatencyTest", "Test completed");
        i iVar2 = (i) rVar.f14398r;
        if (iVar2 != null) {
            ArrayList arrayList2 = (ArrayList) rVar.f14397g;
            br.l.e(arrayList2, "testResult");
            ch.n.b("HttpHeadLatencyJob", "onTestComplete() called");
            ni.u uVar3 = iVar2.J;
            if (uVar3 == null) {
                br.l.l("result");
                throw null;
            }
            uVar3.toString();
            ch.n.a();
            ni.u uVar4 = iVar2.J;
            if (uVar4 == null) {
                br.l.l("result");
                throw null;
            }
            uVar4.f18200g.addAll(arrayList2);
            kg.r rVar2 = iVar2.I;
            th2 = null;
            if (rVar2 == null) {
                br.l.l("latencyTest");
                throw null;
            }
            rVar2.f14398r = null;
        } else {
            th2 = null;
        }
        hk.h hVar2 = this.E;
        if (hVar2 != null) {
            String str4 = this.H;
            ni.u uVar5 = this.J;
            if (uVar5 == null) {
                br.l.l("result");
                throw th2;
            }
            hVar2.f(str4, uVar5);
        }
        ch.n.b("HttpHeadLatencyJob", "onFinish");
        super.j(j);
        hk.h hVar3 = this.E;
        if (hVar3 != null) {
            String str5 = this.H;
            ni.u uVar6 = this.J;
            if (uVar6 == null) {
                br.l.l("result");
                throw null;
            }
            hVar3.d(str5, uVar6);
        }
    }
}
