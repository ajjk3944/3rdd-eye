package W;

import G.c;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Recording.java */
/* loaded from: classes.dex */
public final class M implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f13169b;

    /* renamed from: c, reason: collision with root package name */
    public final F f13170c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13171d;

    /* renamed from: e, reason: collision with root package name */
    public final C1631t f13172e;

    /* renamed from: f, reason: collision with root package name */
    public final G.c f13173f;

    public M(F f10, long j4, C1631t c1631t, boolean z10) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f13169b = atomicBoolean;
        G.c cVar = Build.VERSION.SDK_INT >= 30 ? new G.c(new c.a()) : new G.c(new c.C0031c());
        this.f13173f = cVar;
        this.f13170c = f10;
        this.f13171d = j4;
        this.f13172e = c1631t;
        if (z10) {
            atomicBoolean.set(true);
        } else {
            cVar.f1799a.a("stop");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.RuntimeException r11, int r12) {
        /*
            r10 = this;
            G.c r0 = r10.f13173f
            G.c$b r0 = r0.f1799a
            r0.close()
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f13169b
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L12
            goto La4
        L12:
            W.F r2 = r10.f13170c
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            java.lang.Object r8 = r2.f13116g
            monitor-enter(r8)
            W.k r1 = r2.f13121m     // Catch: java.lang.Throwable -> L3e
            boolean r1 = W.F.o(r10, r1)     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L42
            W.k r1 = r2.f13120l     // Catch: java.lang.Throwable -> L3e
            boolean r1 = W.F.o(r10, r1)     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L42
            java.lang.String r11 = "Recorder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            W.t r0 = r10.f13172e     // Catch: java.lang.Throwable -> L3e
            r12.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L3e
            C.S.a(r11, r12)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r0 = move-exception
            r11 = r0
            goto Lad
        L42:
            W.F$j r0 = r2.i     // Catch: java.lang.Throwable -> L3e
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L3e
            r9 = 0
            switch(r0) {
                case 0: goto La5;
                case 1: goto L77;
                case 2: goto L77;
                case 3: goto La5;
                case 4: goto L59;
                case 5: goto L59;
                case 6: goto L4f;
                case 7: goto L4f;
                default: goto L4c;
            }     // Catch: java.lang.Throwable -> L3e
        L4c:
            r7 = r11
            r6 = r12
            goto L8a
        L4f:
            W.k r0 = r2.f13120l     // Catch: java.lang.Throwable -> L3e
            boolean r0 = W.F.o(r10, r0)     // Catch: java.lang.Throwable -> L3e
            A2.l.q(r9, r0)     // Catch: java.lang.Throwable -> L3e
            goto L4c
        L59:
            W.F$j r0 = W.F.j.STOPPING     // Catch: java.lang.Throwable -> L3e
            r2.B(r0)     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L3e
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L3e
            long r4 = r0.toMicros(r3)     // Catch: java.lang.Throwable -> L3e
            W.k r3 = r2.f13120l     // Catch: java.lang.Throwable -> L3e
            H.g r0 = r2.f13113d     // Catch: java.lang.Throwable -> L3e
            W.C r1 = new W.C     // Catch: java.lang.Throwable -> L3e
            r7 = r11
            r6 = r12
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            r0.execute(r1)     // Catch: java.lang.Throwable -> L3e
            goto L8a
        L77:
            r7 = r11
            r6 = r12
            W.k r11 = r2.f13121m     // Catch: java.lang.Throwable -> L3e
            boolean r11 = W.F.o(r10, r11)     // Catch: java.lang.Throwable -> L3e
            A2.l.q(r9, r11)     // Catch: java.lang.Throwable -> L3e
            W.k r11 = r2.f13121m     // Catch: java.lang.Throwable -> L3e
            r2.f13121m = r9     // Catch: java.lang.Throwable -> L3e
            r2.w()     // Catch: java.lang.Throwable -> L3e
            r9 = r11
        L8a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto La4
            r11 = 10
            if (r6 != r11) goto L98
            java.lang.String r11 = "Recorder"
            java.lang.String r12 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            C.S.b(r11, r12)
        L98:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Recording was stopped before any data could be produced."
            r11.<init>(r12, r7)
            r11 = 8
            r2.i(r9, r11)
        La4:
            return
        La5:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r12 = "Calling stop() while idling or initializing is invalid."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3e
            throw r11     // Catch: java.lang.Throwable -> L3e
        Lad:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: W.M.a(java.lang.RuntimeException, int):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(null, 0);
    }

    public final void finalize() throws Throwable {
        try {
            this.f13173f.f1799a.b();
            a(new RuntimeException("Recording stopped due to being garbage collected."), 10);
        } finally {
            super.finalize();
        }
    }
}
