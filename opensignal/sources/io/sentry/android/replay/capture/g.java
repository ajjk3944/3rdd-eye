package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.android.core.z;
import io.sentry.android.replay.t;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.v3;
import io.sentry.x5;
import io.sentry.y5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: r, reason: collision with root package name */
    public final x5 f11885r;

    /* renamed from: s, reason: collision with root package name */
    public final b1 f11886s;

    /* renamed from: t, reason: collision with root package name */
    public final io.sentry.transport.f f11887t;

    /* renamed from: u, reason: collision with root package name */
    public final io.sentry.util.h f11888u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f11889v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x5 x5Var, v3 v3Var, io.sentry.transport.d dVar, io.sentry.util.h hVar, io.sentry.android.replay.util.b bVar) {
        super(x5Var, v3Var, dVar, bVar);
        br.l.e(x5Var, "options");
        br.l.e(dVar, "dateProvider");
        br.l.e(hVar, "random");
        br.l.e(bVar, "executor");
        this.f11885r = x5Var;
        this.f11886s = v3Var;
        this.f11887t = dVar;
        this.f11888u = hVar;
        this.f11889v = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.m
    public final void a(MotionEvent motionEvent) {
        super.a(motionEvent);
        long jD = this.f11887t.d() - this.f11885r.getSessionReplay().f12080g;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.f11874p;
        br.l.e(concurrentLinkedDeque, "events");
        Iterator it = concurrentLinkedDeque.iterator();
        br.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).f12700d < jD) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.m
    public final void b(t tVar) throws InterruptedException {
        n("configuration_changed", new f(this, 0));
        l(tVar);
    }

    @Override // io.sentry.android.replay.capture.m
    public final m c() {
        boolean z10 = this.f11867g.get();
        x5 x5Var = this.f11885r;
        if (z10) {
            x5Var.getLogger().m(b5.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        p pVar = new p(x5Var, this.f11886s, this.f11887t, this.f11864d);
        pVar.l(j());
        pVar.d(i(), h(), y5.BUFFER);
        return pVar;
    }

    @Override // io.sentry.android.replay.capture.m
    public final void e(boolean z10, as.d dVar) throws InterruptedException {
        x5 x5Var = this.f11885r;
        Double d6 = x5Var.getSessionReplay().f12075b;
        io.sentry.util.h hVar = this.f11888u;
        br.l.e(hVar, "<this>");
        if (d6 == null || d6.doubleValue() < hVar.c()) {
            x5Var.getLogger().m(b5.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        b1 b1Var = this.f11886s;
        if (b1Var != null) {
            b1Var.r(new e(0, this));
        }
        if (!z10) {
            n("capture_replay", new c7.b(this, 9, dVar));
        } else {
            this.f11867g.set(true);
            x5Var.getLogger().m(b5.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.m
    public final void f(b1.d dVar) {
        this.f11864d.submit(new io.sentry.android.replay.util.c(new z(this, dVar, this.f11887t.d(), 1), "BufferCaptureStrategy.add_frame"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(java.lang.String r11, ar.k r12) throws java.lang.InterruptedException {
        /*
            r10 = this;
            io.sentry.android.replay.t r6 = r10.j()
            io.sentry.x5 r0 = r10.f11885r
            if (r6 != 0) goto L1b
            io.sentry.u0 r12 = r0.getLogger()
            io.sentry.b5 r0 = io.sentry.b5.DEBUG
            java.lang.String r1 = "Recorder config is not set, not creating segment for task: "
            java.lang.String r11 = r1.concat(r11)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r12.m(r0, r11, r1)
            return
        L1b:
            io.sentry.b6 r0 = r0.getSessionReplay()
            long r0 = r0.f12080g
            io.sentry.transport.f r2 = r10.f11887t
            long r2 = r2.d()
            io.sentry.android.replay.j r4 = r10.f11868h
            if (r4 == 0) goto L5e
            io.sentry.util.a r5 = r4.f11936y
            io.sentry.q r5 = r5.a()
            java.util.ArrayList r4 = r4.E     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = mq.o.t0(r4)     // Catch: java.lang.Throwable -> L43
            io.sentry.android.replay.k r4 = (io.sentry.android.replay.k) r4     // Catch: java.lang.Throwable -> L43
            r7 = 0
            if (r4 == 0) goto L46
            long r8 = r4.f11938b     // Catch: java.lang.Throwable -> L43
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r0 = move-exception
            r11 = r0
            goto L57
        L46:
            r4 = r7
        L47:
            vc.e.e(r5, r7)
            if (r4 == 0) goto L5e
            long r4 = r4.longValue()
            java.util.Date r4 = dr.a.r(r4)
            if (r4 != 0) goto L64
            goto L5e
        L57:
            throw r11     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            r12 = r0
            vc.e.e(r5, r11)
            throw r12
        L5e:
            long r0 = r2 - r0
            java.util.Date r4 = dr.a.r(r0)
        L64:
            br.l.b(r4)
            long r0 = r4.getTime()
            long r2 = r2 - r0
            io.sentry.protocol.t r5 = r10.h()
            io.sentry.android.replay.util.c r8 = new io.sentry.android.replay.util.c
            java.lang.String r0 = "BufferCaptureStrategy."
            java.lang.String r11 = r0.concat(r11)
            io.sentry.android.replay.capture.d r0 = new io.sentry.android.replay.capture.d
            r1 = r10
            r7 = r12
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.<init>(r0, r11)
            java.util.concurrent.ScheduledExecutorService r11 = r1.f11864d
            r11.submit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.g.n(java.lang.String, ar.k):void");
    }

    @Override // io.sentry.android.replay.capture.m
    public final void pause() throws InterruptedException {
        n("pause", new f(this, 1));
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.m
    public final void stop() {
        io.sentry.android.replay.j jVar = this.f11868h;
        this.f11864d.submit(new io.sentry.android.replay.util.c(new a5.o(jVar != null ? jVar.h() : null, 27, this), "BufferCaptureStrategy.stop"));
        super.stop();
    }
}
