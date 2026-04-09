package io.sentry.android.replay.capture;

import br.x;
import br.y;
import es.b0;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.protocol.t;
import io.sentry.x5;
import io.sentry.y5;
import ir.v;
import java.util.Date;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import lq.q;

/* loaded from: classes.dex */
public abstract class c implements m {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ v[] f11860q;

    /* renamed from: a, reason: collision with root package name */
    public final x5 f11861a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f11862b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.transport.f f11863c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f11864d;

    /* renamed from: e, reason: collision with root package name */
    public final q f11865e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.android.replay.gestures.c f11866f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f11867g;

    /* renamed from: h, reason: collision with root package name */
    public io.sentry.android.replay.j f11868h;

    /* renamed from: i, reason: collision with root package name */
    public final b f11869i;
    public final b j;
    public final AtomicLong k;

    /* renamed from: l, reason: collision with root package name */
    public final b f11870l;

    /* renamed from: m, reason: collision with root package name */
    public final b f11871m;

    /* renamed from: n, reason: collision with root package name */
    public final b f11872n;

    /* renamed from: o, reason: collision with root package name */
    public final b f11873o;

    /* renamed from: p, reason: collision with root package name */
    public final ConcurrentLinkedDeque f11874p;

    static {
        br.o oVar = new br.o(c.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0);
        y yVar = x.f2918a;
        f11860q = new v[]{yVar.d(oVar), c7.a.i(c.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0, yVar), c7.a.i(c.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0, yVar), c7.a.i(c.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0, yVar), c7.a.i(c.class, "currentSegment", "getCurrentSegment()I", 0, yVar), c7.a.i(c.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0, yVar)};
    }

    public c(x5 x5Var, b1 b1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService) {
        br.l.e(x5Var, "options");
        br.l.e(fVar, "dateProvider");
        br.l.e(scheduledExecutorService, "replayExecutor");
        this.f11861a = x5Var;
        this.f11862b = b1Var;
        this.f11863c = fVar;
        this.f11864d = scheduledExecutorService;
        this.f11865e = kc.f.F(new ht.g(5, this));
        this.f11866f = new io.sentry.android.replay.gestures.c(fVar);
        this.f11867g = new AtomicBoolean(false);
        this.f11869i = new b(this, this, 3);
        this.j = new b(this, this, 4);
        this.k = new AtomicLong();
        this.f11870l = new b(this, this, 5);
        this.f11871m = new b(t.f12636d, this, this);
        this.f11872n = new b(this, this, 1);
        this.f11873o = new b(this, this, 2);
        this.f11874p = new ConcurrentLinkedDeque();
    }

    public static l g(c cVar, long j, Date date, t tVar, int i10, int i11, int i12, int i13, int i14) {
        b bVar = cVar.f11873o;
        v[] vVarArr = f11860q;
        y5 y5Var = (y5) bVar.a(vVarArr[5], cVar);
        io.sentry.android.replay.j jVar = cVar.f11868h;
        String str = (String) cVar.f11870l.a(vVarArr[2], cVar);
        ConcurrentLinkedDeque concurrentLinkedDeque = cVar.f11874p;
        br.l.e(tVar, "replayId");
        br.l.e(y5Var, "replayType");
        br.l.e(concurrentLinkedDeque, "events");
        return i.a(cVar.f11862b, cVar.f11861a, j, date, tVar, i10, i11, i12, y5Var, jVar, i13, i14, str, null, concurrentLinkedDeque);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019c  */
    @Override // io.sentry.android.replay.capture.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.c.a(android.view.MotionEvent):void");
    }

    @Override // io.sentry.android.replay.capture.m
    public void d(int i10, t tVar, y5 y5Var) {
        br.l.e(tVar, "replayId");
        this.f11868h = new io.sentry.android.replay.j(this.f11861a, tVar);
        v[] vVarArr = f11860q;
        v vVar = vVarArr[3];
        b bVar = this.f11871m;
        bVar.getClass();
        br.l.e(vVar, "property");
        Object andSet = bVar.f11857b.getAndSet(tVar);
        if (!br.l.a(andSet, tVar)) {
            a aVar = new a(andSet, tVar, bVar.f11859d, 0);
            c cVar = bVar.f11858c;
            x5 x5Var = cVar.f11861a;
            if (x5Var.getThreadChecker().c()) {
                ((ScheduledExecutorService) cVar.f11865e.getValue()).submit(new io.sentry.android.replay.util.c(new b4.e(12, aVar), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    aVar.c();
                } catch (Throwable th2) {
                    x5Var.getLogger().g(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        k(i10);
        if (y5Var == null) {
            y5Var = this instanceof p ? y5.SESSION : y5.BUFFER;
        }
        br.l.e(y5Var, "<set-?>");
        v vVar2 = vVarArr[5];
        b bVar2 = this.f11873o;
        bVar2.getClass();
        br.l.e(vVar2, "property");
        Object andSet2 = bVar2.f11857b.getAndSet(y5Var);
        if (!br.l.a(andSet2, y5Var)) {
            b0 b0Var = new b0(andSet2, y5Var, bVar2.f11859d, 3);
            c cVar2 = bVar2.f11858c;
            x5 x5Var2 = cVar2.f11861a;
            if (x5Var2.getThreadChecker().c()) {
                ((ScheduledExecutorService) cVar2.f11865e.getValue()).submit(new io.sentry.android.replay.util.c(new b4.e(14, b0Var), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    b0Var.c();
                } catch (Throwable th3) {
                    x5Var2.getLogger().g(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th3);
                }
            }
        }
        m(dr.a.q());
        this.k.set(this.f11863c.d());
    }

    public final t h() {
        return (t) this.f11871m.a(f11860q[3], this);
    }

    public final int i() {
        return ((Number) this.f11872n.a(f11860q[4], this)).intValue();
    }

    public final io.sentry.android.replay.t j() {
        return (io.sentry.android.replay.t) this.f11869i.a(f11860q[0], this);
    }

    public final void k(int i10) {
        v vVar = f11860q[4];
        Integer numValueOf = Integer.valueOf(i10);
        b bVar = this.f11872n;
        bVar.getClass();
        br.l.e(vVar, "property");
        Object andSet = bVar.f11857b.getAndSet(numValueOf);
        if (br.l.a(andSet, numValueOf)) {
            return;
        }
        b0 b0Var = new b0(andSet, numValueOf, bVar.f11859d, 2);
        c cVar = bVar.f11858c;
        x5 x5Var = cVar.f11861a;
        if (x5Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.f11865e.getValue()).submit(new io.sentry.android.replay.util.c(new b4.e(13, b0Var), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            b0Var.c();
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
        }
    }

    public final void l(io.sentry.android.replay.t tVar) {
        v vVar = f11860q[0];
        b bVar = this.f11869i;
        bVar.getClass();
        br.l.e(vVar, "property");
        Object andSet = bVar.f11857b.getAndSet(tVar);
        if (br.l.a(andSet, tVar)) {
            return;
        }
        a aVar = new a(andSet, tVar, bVar.f11859d, 1);
        c cVar = bVar.f11858c;
        x5 x5Var = cVar.f11861a;
        if (x5Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.f11865e.getValue()).submit(new io.sentry.android.replay.util.c(new b4.e(15, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.c();
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
        }
    }

    public final void m(Date date) {
        v vVar = f11860q[1];
        b bVar = this.j;
        bVar.getClass();
        br.l.e(vVar, "property");
        Object andSet = bVar.f11857b.getAndSet(date);
        if (br.l.a(andSet, date)) {
            return;
        }
        a aVar = new a(andSet, date, bVar.f11859d, 2);
        c cVar = bVar.f11858c;
        x5 x5Var = cVar.f11861a;
        if (x5Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.f11865e.getValue()).submit(new io.sentry.android.replay.util.c(new b4.e(16, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.c();
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
        }
    }

    @Override // io.sentry.android.replay.capture.m
    public void stop() {
        io.sentry.android.replay.j jVar = this.f11868h;
        if (jVar != null) {
            jVar.close();
        }
        this.k.set(0L);
        m(null);
        t tVar = t.f12636d;
        br.l.d(tVar, "EMPTY_ID");
        v vVar = f11860q[3];
        b bVar = this.f11871m;
        bVar.getClass();
        br.l.e(vVar, "property");
        Object andSet = bVar.f11857b.getAndSet(tVar);
        if (br.l.a(andSet, tVar)) {
            return;
        }
        a aVar = new a(andSet, tVar, bVar.f11859d, 0);
        c cVar = bVar.f11858c;
        x5 x5Var = cVar.f11861a;
        if (x5Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.f11865e.getValue()).submit(new io.sentry.android.replay.util.c(new b4.e(12, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.c();
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
        }
    }
}
