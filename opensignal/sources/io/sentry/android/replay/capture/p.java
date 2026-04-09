package io.sentry.android.replay.capture;

import io.sentry.android.core.u0;
import io.sentry.android.replay.t;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.x5;
import io.sentry.y5;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class p extends c {

    /* renamed from: r, reason: collision with root package name */
    public final x5 f11899r;

    /* renamed from: s, reason: collision with root package name */
    public final b1 f11900s;

    /* renamed from: t, reason: collision with root package name */
    public final io.sentry.transport.f f11901t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x5 x5Var, b1 b1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService) {
        super(x5Var, b1Var, fVar, scheduledExecutorService);
        br.l.e(x5Var, "options");
        br.l.e(fVar, "dateProvider");
        br.l.e(scheduledExecutorService, "executor");
        this.f11899r = x5Var;
        this.f11900s = b1Var;
        this.f11901t = fVar;
    }

    @Override // io.sentry.android.replay.capture.m
    public final void b(t tVar) {
        n("onConfigurationChanged", new o(this, 0));
        l(tVar);
    }

    @Override // io.sentry.android.replay.capture.m
    public final m c() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.m
    public final void d(int i10, io.sentry.protocol.t tVar, y5 y5Var) {
        br.l.e(tVar, "replayId");
        super.d(i10, tVar, y5Var);
        b1 b1Var = this.f11900s;
        if (b1Var != null) {
            b1Var.r(new e(1, this));
        }
    }

    @Override // io.sentry.android.replay.capture.m
    public final void e(boolean z10, as.d dVar) {
        x5 x5Var = this.f11899r;
        if (x5Var.getSessionReplay().f12083l) {
            x5Var.getLogger().m(b5.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.f11867g.set(z10);
    }

    @Override // io.sentry.android.replay.capture.m
    public final void f(final b1.d dVar) {
        final t tVarJ = j();
        final long jD = this.f11901t.d();
        this.f11864d.submit(new io.sentry.android.replay.util.c(new Runnable() { // from class: io.sentry.android.replay.capture.n
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                p pVar = this.f11893a;
                io.sentry.android.replay.j jVar = pVar.f11868h;
                x5 x5Var = pVar.f11899r;
                if (jVar != null) {
                    dVar.w(jVar, Long.valueOf(jD));
                }
                Date date = (Date) pVar.j.a(c.f11860q[1], pVar);
                if (date == null) {
                    x5Var.getLogger().m(b5.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (pVar.f11867g.get()) {
                    x5Var.getLogger().m(b5.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                t tVar = tVarJ;
                if (tVar == null) {
                    x5Var.getLogger().m(b5.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                    return;
                }
                long jD2 = pVar.f11901t.d();
                if (jD2 - date.getTime() >= x5Var.getSessionReplay().f12081h) {
                    l lVarG = c.g(pVar, x5Var.getSessionReplay().f12081h, date, pVar.h(), pVar.i(), tVar.f11986b, tVar.f11985a, tVar.f11989e, tVar.f11990f);
                    if (lVarG instanceof j) {
                        j jVar2 = (j) lVarG;
                        j.a(jVar2, pVar.f11900s);
                        pVar.k(pVar.i() + 1);
                        pVar.m(jVar2.f11890a.Q);
                    }
                }
                if (jD2 - pVar.k.get() >= x5Var.getSessionReplay().f12082i) {
                    x5Var.getReplayController().stop();
                    x5Var.getLogger().m(b5.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        }, "SessionCaptureStrategy.add_frame"));
    }

    public final void n(String str, ar.k kVar) {
        t tVarJ = j();
        if (tVarJ == null) {
            this.f11899r.getLogger().m(b5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long jD = this.f11901t.d();
        Date date = (Date) this.j.a(c.f11860q[1], this);
        if (date == null) {
            return;
        }
        long time = jD - date.getTime();
        io.sentry.protocol.t tVarH = h();
        this.f11864d.submit(new io.sentry.android.replay.util.c(new d(this, time, date, tVarH, tVarJ, kVar), "SessionCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.m
    public final void pause() {
        n("pause", new o(this, 1));
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.m
    public final void stop() {
        io.sentry.android.replay.j jVar = this.f11868h;
        n("stop", new c7.b(this, 10, jVar != null ? jVar.h() : null));
        b1 b1Var = this.f11900s;
        if (b1Var != null) {
            b1Var.r(new u0(1));
        }
        super.stop();
    }
}
