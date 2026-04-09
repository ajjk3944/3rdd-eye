package mi;

import android.os.SystemClock;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class f extends vj.b {
    public final fh.f F;
    public final df.c G;
    public final zh.a H;
    public final zh.e I;
    public final xi.j J;
    public final TimeUnit K;
    public long L;
    public boolean M;
    public boolean N;
    public final e O;

    public /* synthetic */ f(io.sentry.hints.i iVar, fh.f fVar, df.c cVar, zh.a aVar, zh.e eVar, xi.j jVar, String str) {
        this(iVar, fVar, cVar, aVar, eVar, jVar, TimeUnit.MILLISECONDS, str);
    }

    @Override // vj.b
    public void i(long j) {
        String strO = o();
        StringBuilder sbK = w.g.k(j, "onError() called with: taskId = ", ", taskName = ");
        sbK.append(this.f23922d);
        ch.n.b(strO, sbK.toString());
        super.i(j);
        t("JOB_ERROR", new fh.d[0]);
    }

    @Override // vj.b
    public void j(long j) {
        String strO = o();
        StringBuilder sbK = w.g.k(j, "onFinish() called with: taskId = ", ", taskName = ");
        sbK.append(this.f23922d);
        ch.n.b(strO, sbK.toString());
        super.j(j);
        t("JOB_FINISH", new fh.d[0]);
        xi.j jVar = this.J;
        e eVar = this.O;
        jVar.getClass();
        br.l.e(eVar, "listener");
        synchronized (jVar.P) {
            jVar.P.remove(eVar);
        }
        zh.a aVar = this.H;
        aVar.a();
        aVar.b(null);
        zh.e eVar2 = this.I;
        eVar2.c();
        eVar2.f27415g = null;
    }

    @Override // vj.b
    public void k(String str, boolean z10, long j) {
        br.l.e(str, "dataEndpoint");
        String strO = o();
        StringBuilder sbK = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
        w.g.q(sbK, this.f23922d, ", dataEndpoint = ", str, ", isManualExecution = ");
        sbK.append(z10);
        ch.n.b(strO, sbK.toString());
        super.k(str, z10, j);
        fh.f fVar = this.F;
        synchronized (fVar.f8871a) {
            fVar.f8871a.clear();
        }
        this.G.getClass();
        this.L = SystemClock.elapsedRealtimeNanos();
        this.G.getClass();
        t("JOB_START", new fh.d[]{new fh.d(Long.valueOf(System.currentTimeMillis()), "ABSOLUTE_TIME")});
        ak.s sVar = this.J.L;
        if (sVar != null) {
            s("CONNECTION_DETECTED", sVar);
        }
        this.J.a(this.O);
        zh.a aVar = this.H;
        aVar.a();
        aVar.f27407f = h().f529f.f449a.f490u;
        aVar.f27408g = h().f529f.f449a.f491v;
        aVar.b(new hk.g(this, this.F, 1));
        aVar.c();
        this.I.c();
        zh.e eVar = this.I;
        eVar.f27415g = new io.sentry.t((Object) this, (Object) this.F, false);
        ch.n.b("ServiceStateDetector", "start() called");
        fj.n nVar = eVar.f27416r;
        if (nVar != null) {
            ServiceState serviceState = nVar.N;
            if (serviceState != null) {
                eVar.a(eVar.f27417x.c(serviceState));
            }
            TelephonyDisplayInfo telephonyDisplayInfo = eVar.f27416r.R;
            if (telephonyDisplayInfo != null) {
                eVar.b(telephonyDisplayInfo);
            }
        }
        fj.n nVar2 = eVar.f27416r;
        if (nVar2 != null) {
            nVar2.c(eVar);
            fj.n nVar3 = eVar.f27416r;
            nVar3.getClass();
            synchronized (nVar3.M) {
                try {
                    if (nVar3.M.contains(eVar)) {
                        ch.n.g("TelephonyPhoneStateRepo", "addListener() displayInfoChangedListeners already added = " + eVar);
                    } else {
                        ch.n.b("TelephonyPhoneStateRepo", "addListener() adding displayInfoChangedListeners = " + eVar);
                        nVar3.M.add(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // vj.b
    public void l(long j) {
        String strO = o();
        StringBuilder sbK = w.g.k(j, "stop() called with: taskId = ", ", taskName = ");
        sbK.append(this.f23922d);
        ch.n.b(strO, sbK.toString());
        super.l(j);
        t("JOB_STOP", new fh.d[0]);
    }

    public final long m() {
        this.G.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j = this.L;
        long j7 = jElapsedRealtimeNanos - j;
        if (j7 < 0 || j <= 0) {
            return -1L;
        }
        return this.K.convert(j7, TimeUnit.NANOSECONDS);
    }

    public final String n() {
        String strA;
        fh.f fVar = this.F;
        synchronized (fVar.f8871a) {
            strA = fh.e.a(fVar.f8871a);
        }
        br.l.d(strA, "toJson(...)");
        return strA;
    }

    public abstract String o();

    public final void p(OutOfMemoryError outOfMemoryError, fh.d[] dVarArr) {
        String strO = o();
        StringBuilder sb2 = new StringBuilder("onNewError() called with: error = ");
        sb2.append(outOfMemoryError);
        sb2.append(", extras = ");
        String string = Arrays.toString(dVarArr);
        br.l.d(string, "toString(...)");
        sb2.append(string);
        ch.n.b(strO, sb2.toString());
        this.F.i(outOfMemoryError, dVarArr, m());
    }

    public final void q(String str, fh.d[] dVarArr) {
        br.l.e(str, "eventName");
        String strO = o();
        StringBuilder sbU = c7.a.u("onNewEvent() called with: eventName = ", str, ", extras = ");
        String string = Arrays.toString(dVarArr);
        br.l.d(string, "toString(...)");
        sbU.append(string);
        ch.n.b(strO, sbU.toString());
        t(str, dVarArr);
    }

    public final void r(Exception exc, fh.d[] dVarArr) {
        String strO = o();
        StringBuilder sb2 = new StringBuilder("onNewException() called with: exception = ");
        sb2.append(exc);
        sb2.append(", extras = ");
        String string = Arrays.toString(dVarArr);
        br.l.d(string, "toString(...)");
        sb2.append(string);
        ch.n.b(strO, sb2.toString());
        this.F.i(exc, dVarArr, m());
    }

    public final void s(String str, ak.s sVar) {
        br.l.e(sVar, "connection");
        this.F.h(new fh.e(str, new fh.d[]{new fh.d(sVar.f656a, "ID"), new fh.d(sVar.f659d, "START_TIME")}, m(), 0));
    }

    public final void t(String str, fh.d[] dVarArr) {
        br.l.e(str, "eventName");
        long jM = m();
        fh.f fVar = this.F;
        fVar.getClass();
        fVar.h(new fh.e(str, dVarArr, jM, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(io.sentry.hints.i iVar, fh.f fVar, df.c cVar, zh.a aVar, zh.e eVar, xi.j jVar, TimeUnit timeUnit, String str) {
        super(iVar, str);
        br.l.e(iVar, "jobIdFactory");
        br.l.e(fVar, "eventRecorder");
        br.l.e(cVar, "dateTimeRepository");
        br.l.e(aVar, "continuousNetworkDetector");
        br.l.e(eVar, "serviceStateDetector");
        br.l.e(jVar, "connectionRepository");
        br.l.e(timeUnit, "timeUnit");
        br.l.e(str, "taskName");
        this.F = fVar;
        this.G = cVar;
        this.H = aVar;
        this.I = eVar;
        this.J = jVar;
        this.K = timeUnit;
        this.O = new e(this);
    }
}
