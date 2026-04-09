package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.a3;
import io.sentry.b5;
import io.sentry.e1;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public final File f11738b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11739c;

    /* renamed from: f, reason: collision with root package name */
    public String f11742f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.q f11743g;

    /* renamed from: l, reason: collision with root package name */
    public final e1 f11746l;

    /* renamed from: m, reason: collision with root package name */
    public final io.sentry.u0 f11747m;

    /* renamed from: a, reason: collision with root package name */
    public long f11737a = 0;

    /* renamed from: d, reason: collision with root package name */
    public Future f11740d = null;

    /* renamed from: e, reason: collision with root package name */
    public File f11741e = null;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f11744h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f11745i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public final HashMap k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f11748n = false;

    /* renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f11749o = new io.sentry.util.a();

    public q(String str, int i10, io.sentry.android.core.internal.util.q qVar, e1 e1Var, io.sentry.u0 u0Var) {
        ir.f0.T(str, "TracesFilesDirPath is required");
        this.f11738b = new File(str);
        this.f11739c = i10;
        ir.f0.T(u0Var, "Logger is required");
        this.f11747m = u0Var;
        this.f11746l = e1Var;
        ir.f0.T(qVar, "SentryFrameMetricsCollector is required");
        this.f11743g = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0006, B:5:0x000c, B:11:0x0022, B:16:0x0030, B:18:0x0043, B:21:0x0052, B:24:0x005c, B:25:0x006a, B:27:0x0072, B:28:0x0080, B:30:0x0088, B:31:0x0098, B:33:0x009f, B:34:0x00a5, B:39:0x00b5, B:40:0x00b7, B:14:0x0026, B:10:0x001f), top: B:50:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: all -> 0x001b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0006, B:5:0x000c, B:11:0x0022, B:16:0x0030, B:18:0x0043, B:21:0x0052, B:24:0x005c, B:25:0x006a, B:27:0x0072, B:28:0x0080, B:30:0x0088, B:31:0x0098, B:33:0x009f, B:34:0x00a5, B:39:0x00b5, B:40:0x00b7, B:14:0x0026, B:10:0x001f), top: B:50:0x0006, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final d5.y0 a(java.util.List r14, boolean r15) {
        /*
            r13 = this;
            io.sentry.util.a r0 = r13.f11749o
            io.sentry.q r1 = r0.a()
            boolean r0 = r13.f11748n     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L1f
            io.sentry.u0 r14 = r13.f11747m     // Catch: java.lang.Throwable -> L1b
            io.sentry.b5 r15 = io.sentry.b5.WARNING     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "Profiler not running"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b
            r14.m(r15, r0, r3)     // Catch: java.lang.Throwable -> L1b
            r1.close()
            return r2
        L1b:
            r0 = move-exception
            r14 = r0
            goto Lb8
        L1f:
            android.os.Debug.stopMethodTracing()     // Catch: java.lang.Throwable -> L25
        L22:
            r13.f11748n = r3     // Catch: java.lang.Throwable -> L1b
            goto L30
        L25:
            r0 = move-exception
            io.sentry.u0 r4 = r13.f11747m     // Catch: java.lang.Throwable -> Lb3
            io.sentry.b5 r5 = io.sentry.b5.ERROR     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "Error while stopping profiling: "
            r4.g(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb3
            goto L22
        L30:
            io.sentry.android.core.internal.util.q r0 = r13.f11743g     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = r13.f11742f     // Catch: java.lang.Throwable -> L1b
            r0.a(r4)     // Catch: java.lang.Throwable -> L1b
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L1b
            long r8 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> L1b
            java.io.File r0 = r13.f11741e     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L52
            io.sentry.u0 r14 = r13.f11747m     // Catch: java.lang.Throwable -> L1b
            io.sentry.b5 r15 = io.sentry.b5.ERROR     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "Trace file does not exists"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b
            r14.m(r15, r0, r3)     // Catch: java.lang.Throwable -> L1b
            r1.close()
            return r2
        L52:
            java.util.ArrayDeque r0 = r13.f11745i     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "nanosecond"
            if (r0 != 0) goto L6a
            java.util.HashMap r0 = r13.k     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "slow_frame_renders"
            io.sentry.profilemeasurements.a r5 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayDeque r10 = r13.f11745i     // Catch: java.lang.Throwable -> L1b
            r5.<init>(r3, r10)     // Catch: java.lang.Throwable -> L1b
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L1b
        L6a:
            java.util.ArrayDeque r0 = r13.j     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L80
            java.util.HashMap r0 = r13.k     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "frozen_frame_renders"
            io.sentry.profilemeasurements.a r5 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayDeque r10 = r13.j     // Catch: java.lang.Throwable -> L1b
            r5.<init>(r3, r10)     // Catch: java.lang.Throwable -> L1b
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L1b
        L80:
            java.util.ArrayDeque r0 = r13.f11744h     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L98
            java.util.HashMap r0 = r13.k     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "screen_frame_rates"
            io.sentry.profilemeasurements.a r4 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = "hz"
            java.util.ArrayDeque r10 = r13.f11744h     // Catch: java.lang.Throwable -> L1b
            r4.<init>(r5, r10)     // Catch: java.lang.Throwable -> L1b
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L1b
        L98:
            r13.b(r14)     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.Future r14 = r13.f11740d     // Catch: java.lang.Throwable -> L1b
            if (r14 == 0) goto La5
            r0 = 1
            r14.cancel(r0)     // Catch: java.lang.Throwable -> L1b
            r13.f11740d = r2     // Catch: java.lang.Throwable -> L1b
        La5:
            d5.y0 r5 = new d5.y0     // Catch: java.lang.Throwable -> L1b
            java.io.File r11 = r13.f11741e     // Catch: java.lang.Throwable -> L1b
            java.util.HashMap r12 = r13.k     // Catch: java.lang.Throwable -> L1b
            r10 = r15
            r5.<init>(r6, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L1b
            r1.close()
            return r5
        Lb3:
            r0 = move-exception
            r14 = r0
            r13.f11748n = r3     // Catch: java.lang.Throwable -> L1b
            throw r14     // Catch: java.lang.Throwable -> L1b
        Lb8:
            r1.close()     // Catch: java.lang.Throwable -> Lbc
            goto Lc1
        Lbc:
            r0 = move-exception
            r15 = r0
            r14.addSuppressed(r15)
        Lc1:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.q.a(java.util.List, boolean):d5.y0");
    }

    public final void b(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f11737a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a3 a3Var = (a3) it.next();
                        long j = a3Var.f11464d;
                        long j7 = j + jElapsedRealtimeNanos;
                        Double d6 = a3Var.f11461a;
                        Long l10 = a3Var.f11462b;
                        Long l11 = a3Var.f11463c;
                        if (d6 != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j7), d6, j));
                        }
                        if (l10 != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j7), l10, j));
                        }
                        if (l11 != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j7), l11, j));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public final p c() {
        String strR;
        io.sentry.q qVarA = this.f11749o.a();
        try {
            int i10 = this.f11739c;
            if (i10 == 0) {
                this.f11747m.m(b5.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i10));
                qVarA.close();
                return null;
            }
            if (this.f11748n) {
                this.f11747m.m(b5.WARNING, "Profiling has already started...", new Object[0]);
                qVarA.close();
                return null;
            }
            this.f11741e = new File(this.f11738b, io.sentry.config.a.R().concat(".trace"));
            this.k.clear();
            this.f11744h.clear();
            this.f11745i.clear();
            this.j.clear();
            io.sentry.android.core.internal.util.q qVar = this.f11743g;
            o oVar = new o(this);
            if (qVar.B) {
                strR = io.sentry.config.a.R();
                qVar.f11688y.put(strR, oVar);
                qVar.b();
            } else {
                strR = null;
            }
            this.f11742f = strR;
            try {
                e1 e1Var = this.f11746l;
                if (e1Var != null) {
                    this.f11740d = e1Var.q(new androidx.lifecycle.f0(20, this), 30000L);
                }
            } catch (RejectedExecutionException e4) {
                this.f11747m.g(b5.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e4);
            }
            this.f11737a = SystemClock.elapsedRealtimeNanos();
            Date dateQ = dr.a.q();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f11741e.getPath(), 3000000, this.f11739c);
                this.f11748n = true;
                p pVar = new p(this.f11737a, elapsedCpuTime, dateQ);
                qVarA.close();
                return pVar;
            } catch (Throwable th2) {
                a(null, false);
                this.f11747m.g(b5.ERROR, "Unable to start a profile: ", th2);
                this.f11748n = false;
                qVarA.close();
                return null;
            }
        } finally {
        }
    }
}
