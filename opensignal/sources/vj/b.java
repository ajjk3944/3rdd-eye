package vj;

import ak.g;
import ak.s;
import br.l;
import ch.n;
import hk.h;
import io.sentry.hints.i;
import xi.j;

/* loaded from: classes.dex */
public abstract class b {
    public boolean B;
    public String D;
    public h E;

    /* renamed from: a, reason: collision with root package name */
    public final i f23921a;

    /* renamed from: d, reason: collision with root package name */
    public final String f23922d;

    /* renamed from: g, reason: collision with root package name */
    public e f23923g;

    /* renamed from: r, reason: collision with root package name */
    public long f23924r;

    /* renamed from: x, reason: collision with root package name */
    public g f23925x;

    /* renamed from: y, reason: collision with root package name */
    public long f23926y;

    public b(i iVar, String str) {
        l.e(iVar, "jobIdFactory");
        l.e(str, "taskName");
        this.f23921a = iVar;
        this.f23922d = str;
        this.f23923g = e.READY;
        this.f23924r = -1L;
        this.f23926y = -1L;
        this.D = "";
    }

    public abstract String f();

    public final long g() {
        if (this.f23924r == -1) {
            this.f23921a.getClass();
            this.f23924r = Math.abs(fr.d.f9050a.d().nextLong());
        }
        return this.f23924r;
    }

    public final g h() {
        g gVar = this.f23925x;
        if (gVar != null) {
            return gVar;
        }
        l.l("taskConfig");
        throw null;
    }

    public void i(long j) {
        this.f23926y = j;
        this.f23923g = e.ERROR;
    }

    public void j(long j) {
        this.f23926y = j;
        this.f23923g = e.FINISHED;
    }

    public void k(String str, boolean z10, long j) {
        s sVar;
        l.e(str, "dataEndpoint");
        this.f23923g = e.STARTED;
        this.f23926y = j;
        this.D = str;
        this.B = z10;
        h hVar = this.E;
        if (hVar != null) {
            String strF = f();
            l.e(strF, "jobName");
            n.b("TaskKlass", hVar.c() + " onStart job " + strF);
            if (hVar.I) {
                hVar.G.h(new fh.e("JOB_STARTED", new fh.d[]{new fh.d(strF, "JOB_NAME")}, hVar.a(), 0));
            }
            j jVar = hVar.E;
            long j7 = hVar.f10804a;
            jVar.getClass();
            n.b("DeviceConnectionRepository", "recordTaskStarted() called with: taskId = " + j7);
            if (!((g) jVar.G.f20680g).f529f.f449a.f485p || (sVar = jVar.L) == null) {
                return;
            }
            jVar.O.put(Long.valueOf(j7), sVar.f656a);
        }
    }

    public void l(long j) {
        this.f23926y = j;
        this.f23923g = e.STOPPED;
        h hVar = this.E;
        if (hVar != null) {
            String strF = f();
            l.e(strF, "jobName");
            n.b("TaskKlass", hVar.c() + " Stop job for " + strF);
            if (hVar.I) {
                hVar.G.h(new fh.e("JOB_STOPPED", new fh.d[]{new fh.d(strF, "JOB_NAME")}, hVar.a(), 0));
            }
            if (strF.equals("SEND_RESULTS")) {
                hVar.h();
            }
        }
        this.E = null;
    }
}
