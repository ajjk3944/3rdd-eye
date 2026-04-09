package kg;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.f0;
import com.google.android.exoplayer2.w0;
import com.google.android.exoplayer2.x0;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.v9;
import com.google.android.gms.internal.measurement.w5;
import com.opensignal.sdk.data.task.NoOpJobService;
import h9.r2;
import io.sentry.b5;
import io.sentry.e1;
import io.sentry.j0;
import io.sentry.u4;
import io.sentry.v4;
import io.sentry.x5;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import rr.o0;
import u.i0;

/* loaded from: classes.dex */
public final class r implements a1.f, hk.d, ya.b0, ba.e, dt.g, e1, iq.b, js.q {

    /* renamed from: x, reason: collision with root package name */
    public static r f14393x;

    /* renamed from: y, reason: collision with root package name */
    public static r f14394y;

    /* renamed from: a, reason: collision with root package name */
    public Object f14395a;

    /* renamed from: d, reason: collision with root package name */
    public Object f14396d;

    /* renamed from: g, reason: collision with root package name */
    public Object f14397g;

    /* renamed from: r, reason: collision with root package name */
    public Object f14398r;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f14395a = obj;
        this.f14396d = obj2;
        this.f14397g = obj3;
        this.f14398r = obj4;
    }

    public static synchronized r h() {
        try {
            if (f14393x == null) {
                f14393x = new r(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f14393x;
    }

    public static r j() {
        if (f14394y == null) {
            f14394y = new r(19);
        }
        return f14394y;
    }

    public static HttpURLConnection k(ak.w wVar) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(wVar.f753c).openConnection();
        br.l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod("HEAD");
        httpURLConnection.setInstanceFollowRedirects(wVar.f754d);
        httpURLConnection.setConnectTimeout(wVar.f752b);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("connection", "close");
        return httpURLConnection;
    }

    public com.google.android.gms.internal.measurement.n A(com.google.android.gms.internal.measurement.n nVar) {
        return ((com.google.android.gms.internal.measurement.t) this.f14396d).c(this, nVar);
    }

    @Override // dt.g
    public dt.f B(qs.b bVar) {
        br.l.e(bVar, "classId");
        ls.j jVar = (ls.j) ((LinkedHashMap) this.f14398r).get(bVar);
        if (jVar == null) {
            return null;
        }
        i4.b bVar2 = (i4.b) this.f14395a;
        ms.a aVar = (ms.a) this.f14396d;
        ((dt.c0) this.f14397g).a(bVar);
        return new dt.f(bVar2, jVar, aVar, o0.f21696s);
    }

    public com.google.android.gms.internal.measurement.n C(r rVar, v3... v3VarArr) {
        com.google.android.gms.internal.measurement.n nVarW = com.google.android.gms.internal.measurement.n.f5129f;
        for (v3 v3Var : v3VarArr) {
            nVarW = ba.m.W(v3Var);
            a.a.S((r) this.f14397g);
            if ((nVarW instanceof com.google.android.gms.internal.measurement.o) || (nVarW instanceof com.google.android.gms.internal.measurement.m)) {
                nVarW = ((com.google.android.gms.internal.measurement.t) this.f14395a).c(rVar, nVarW);
            }
        }
        return nVarW;
    }

    public com.google.android.gms.internal.measurement.n D(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVarC = com.google.android.gms.internal.measurement.n.f5129f;
        Iterator itO = dVar.o();
        while (itO.hasNext()) {
            nVarC = ((com.google.android.gms.internal.measurement.t) this.f14396d).c(this, dVar.r(((Integer) itO.next()).intValue()));
            if (nVarC instanceof com.google.android.gms.internal.measurement.f) {
                break;
            }
        }
        return nVarC;
    }

    public r E() {
        return new r(this, (com.google.android.gms.internal.measurement.t) this.f14396d);
    }

    public boolean F(String str) {
        if (((HashMap) this.f14397g).containsKey(str)) {
            return true;
        }
        r rVar = (r) this.f14395a;
        if (rVar != null) {
            return rVar.F(str);
        }
        return false;
    }

    public void G(String str, com.google.android.gms.internal.measurement.n nVar) {
        r rVar;
        HashMap map = (HashMap) this.f14397g;
        if (!map.containsKey(str) && (rVar = (r) this.f14395a) != null && rVar.F(str)) {
            rVar.G(str, nVar);
        } else {
            if (((HashMap) this.f14398r).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                map.remove(str);
            } else {
                map.put(str, nVar);
            }
        }
    }

    public void H(String str, com.google.android.gms.internal.measurement.n nVar) {
        HashMap map = (HashMap) this.f14397g;
        if (((HashMap) this.f14398r).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    public com.google.android.gms.internal.measurement.n I(String str) {
        HashMap map = (HashMap) this.f14397g;
        if (map.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.n) map.get(str);
        }
        r rVar = (r) this.f14395a;
        if (rVar != null) {
            return rVar.I(str);
        }
        throw new IllegalArgumentException(w.g.f(str, " is not defined"));
    }

    @Override // js.q
    public js.o a(qs.b bVar, wr.a aVar) {
        return ((r2) ((io.sentry.t) this.f14397g).f12736a).E0(bVar, aVar, (ArrayList) this.f14396d);
    }

    public boolean b(ge.l lVar, int i10) {
        ge.e eVar = (ge.e) lVar.f9558a.get();
        if (eVar == null) {
            return false;
        }
        ((Handler) this.f14396d).removeCallbacksAndMessages(lVar);
        Handler handler = ge.h.f9535w;
        handler.sendMessage(handler.obtainMessage(1, i10, 0, eVar.f9525a));
        return true;
    }

    @Override // hk.d
    public void c(hk.h hVar) {
        br.l.e(hVar, "task");
        ((JobScheduler) this.f14396d).cancel(1122115566);
    }

    @Override // io.sentry.e1
    public void d(long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f14395a;
        io.sentry.q qVarA = ((io.sentry.util.a) this.f14396d).a();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.e1
    public void e() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f14395a;
        try {
            scheduledThreadPoolExecutor.submit(new f0(16, this));
        } catch (RejectedExecutionException e4) {
            x5 x5Var = (x5) this.f14398r;
            if (x5Var != null) {
                x5Var.getLogger().g(b5.WARNING, "Prewarm task rejected from " + scheduledThreadPoolExecutor, e4);
            }
        }
    }

    public void f(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((i0) this.f14396d).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                f(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(rq.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f14398r
            d4.c0 r0 = (d4.c0) r0
            boolean r1 = r7 instanceof d4.h
            if (r1 == 0) goto L17
            r1 = r7
            d4.h r1 = (d4.h) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.B = r2
            goto L1c
        L17:
            d4.h r1 = new d4.h
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f6813x
            qq.a r2 = qq.a.COROUTINE_SUSPENDED
            int r3 = r1.B
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            kg.r r0 = r1.f6812r
            lf.t1.G(r7)
            goto L64
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kg.r r0 = r1.f6812r
            lf.t1.G(r7)
            goto L74
        L3e:
            lf.t1.G(r7)
            java.lang.Object r7 = r6.f14397g
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            d4.n0 r7 = r0.h()
            d4.k r3 = new d4.k
            r5 = 0
            r3.<init>(r0, r6, r5)
            r1.f6812r = r6
            r1.B = r4
            java.lang.Object r7 = r7.c(r3, r1)
            if (r7 != r2) goto L63
            goto L72
        L63:
            r0 = r6
        L64:
            d4.c r7 = (d4.c) r7
            goto L76
        L67:
            r1.f6812r = r6
            r1.B = r5
            r7 = 0
            java.lang.Object r7 = d4.c0.g(r0, r7, r1)
            if (r7 != r2) goto L73
        L72:
            return r2
        L73:
            r0 = r6
        L74:
            d4.c r7 = (d4.c) r7
        L76:
            java.lang.Object r0 = r0.f14398r
            d4.c0 r0 = (d4.c0) r0
            a2.g r0 = r0.f6781h
            r0.k(r7)
            lq.b0 r7 = lq.b0.f15562a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.r.g(rq.c):java.lang.Object");
    }

    @Override // hk.d
    public void i(hk.h hVar) {
        ((JobScheduler) this.f14396d).cancel(1122115566);
    }

    @Override // io.sentry.e1
    public boolean isClosed() {
        io.sentry.q qVarA = ((io.sentry.util.a) this.f14396d).a();
        try {
            boolean zIsShutdown = ((ScheduledThreadPoolExecutor) this.f14395a).isShutdown();
            qVarA.close();
            return zIsShutdown;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public boolean l(Context context) {
        if (((Boolean) this.f14397g) == null) {
            this.f14397g = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f14396d).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.f14397g).booleanValue();
    }

    @Override // hk.d
    public void m(hk.h hVar, boolean z10) {
        JobScheduler jobScheduler = (JobScheduler) this.f14396d;
        ch.n.b("BaseJobSchedulerExecutionPipeline", c7.a.o(hVar, new StringBuilder(), " Start job scheduling"));
        ComponentName componentName = new ComponentName((Context) this.f14398r, (Class<?>) NoOpJobService.class);
        Bundle bundle = (Bundle) ((xj.i) this.f14397g).a(new si.a(hVar));
        long j = hVar.f10809f.f9622h;
        ch.l.f3962t5.A();
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        jobScheduler.cancel(1122115566);
        JobInfo.Builder builder = new JobInfo.Builder(1122115566, componentName);
        if (jCurrentTimeMillis > 0) {
            builder.setMinimumLatency(jCurrentTimeMillis);
        }
        builder.setOverrideDeadline(jCurrentTimeMillis + 3000);
        builder.setPersisted(false);
        if (((ch.f) this.f14395a).c()) {
            builder.setTransientExtras(bundle);
        }
        int iSchedule = jobScheduler.schedule(builder.build());
        ch.n.b("BaseJobSchedulerExecutionPipeline", hVar.c() + " scheduled with result : " + iSchedule);
        if (iSchedule == 0) {
            String strH = h0.b.h(iSchedule, "Error scheduling in base execution pipeline - ");
            ch.n.b("BaseJobSchedulerExecutionPipeline", strH);
            cj.a.F(strH);
        }
    }

    public boolean n(Context context) {
        if (((Boolean) this.f14396d) == null) {
            this.f14396d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f14396d).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.f14396d).booleanValue();
    }

    public boolean o(ge.e eVar) {
        ge.l lVar = (ge.l) this.f14397g;
        return (lVar == null || eVar == null || lVar.f9558a.get() != eVar) ? false : true;
    }

    @Override // ya.b0
    public void onDownstreamFormatChanged(int i10, ya.v vVar, ya.r rVar) {
        if (r(i10, vVar)) {
            ((ya.a0) this.f14396d).c(rVar);
        }
    }

    @Override // ya.b0
    public void onLoadCanceled(int i10, ya.v vVar, ya.m mVar, ya.r rVar) {
        if (r(i10, vVar)) {
            ((ya.a0) this.f14396d).e(mVar, rVar);
        }
    }

    @Override // ya.b0
    public void onLoadCompleted(int i10, ya.v vVar, ya.m mVar, ya.r rVar) {
        if (r(i10, vVar)) {
            ((ya.a0) this.f14396d).g(mVar, rVar);
        }
    }

    @Override // ya.b0
    public void onLoadError(int i10, ya.v vVar, ya.m mVar, ya.r rVar, IOException iOException, boolean z10) {
        if (r(i10, vVar)) {
            ((ya.a0) this.f14396d).j(mVar, rVar, iOException, z10);
        }
    }

    @Override // ya.b0
    public void onLoadStarted(int i10, ya.v vVar, ya.m mVar, ya.r rVar) {
        if (r(i10, vVar)) {
            ((ya.a0) this.f14396d).l(mVar, rVar);
        }
    }

    @Override // ya.b0
    public void onUpstreamDiscarded(int i10, ya.v vVar, ya.r rVar) {
        if (r(i10, vVar)) {
            ((ya.a0) this.f14396d).m(rVar);
        }
    }

    public boolean p(ft.u uVar) {
        if (((ft.u) this.f14396d).equals(uVar)) {
            return true;
        }
        r rVar = (r) this.f14395a;
        return rVar != null ? rVar.p(uVar) : false;
    }

    @Override // io.sentry.e1
    public Future q(Runnable runnable, long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f14395a;
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
        x5 x5Var = (x5) this.f14398r;
        if (x5Var != null) {
            x5Var.getLogger().m(b5.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new v4();
    }

    public boolean r(int i10, ya.v vVar) {
        x0 x0Var = (x0) this.f14398r;
        w0 w0Var = (w0) this.f14395a;
        ya.v vVarB = null;
        if (vVar != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= w0Var.f4771c.size()) {
                    break;
                }
                if (((ya.v) w0Var.f4771c.get(i11)).f26180d == vVar.f26180d) {
                    vVarB = vVar.b(Pair.create(w0Var.f4770b, vVar.f26177a));
                    break;
                }
                i11++;
            }
            if (vVarB == null) {
                return false;
            }
        }
        ya.v vVar2 = vVarB;
        int i12 = i10 + w0Var.f4772d;
        ya.a0 a0Var = (ya.a0) this.f14396d;
        if (a0Var.f26035a != i12 || !qb.v.a(a0Var.f26036b, vVar2)) {
            this.f14396d = new ya.a0(((ya.a0) x0Var.f4783g).f26037c, i12, vVar2, 0L);
        }
        ba.d dVar = (ba.d) this.f14397g;
        if (dVar.f2486a == i12 && qb.v.a(dVar.f2487b, vVar2)) {
            return true;
        }
        this.f14397g = new ba.d(((ba.d) x0Var.f4784h).f2488c, i12, vVar2);
        return true;
    }

    public void s(ge.e eVar) {
        synchronized (this.f14395a) {
            try {
                if (o(eVar)) {
                    ge.l lVar = (ge.l) this.f14397g;
                    if (!lVar.f9560c) {
                        lVar.f9560c = true;
                        ((Handler) this.f14396d).removeCallbacksAndMessages(lVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.e1
    public Future submit(Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f14395a;
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        x5 x5Var = (x5) this.f14398r;
        if (x5Var != null) {
            x5Var.getLogger().m(b5.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new v4();
    }

    public void t(ge.e eVar) {
        synchronized (this.f14395a) {
            try {
                if (o(eVar)) {
                    ge.l lVar = (ge.l) this.f14397g;
                    if (lVar.f9560c) {
                        lVar.f9560c = false;
                        v(lVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v7, types: [eu.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object u(rq.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof d4.y0
            if (r0 == 0) goto L13
            r0 = r9
            d4.y0 r0 = (d4.y0) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            d4.y0 r0 = new d4.y0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f6913y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 2
            r4 = 1
            lq.b0 r5 = lq.b0.f15562a
            r6 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            eu.a r1 = r0.f6912x
            kg.r r0 = r0.f6911r
            lf.t1.G(r9)     // Catch: java.lang.Throwable -> L31
            goto L92
        L31:
            r9 = move-exception
            goto La2
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            eu.a r2 = r0.f6912x
            kg.r r4 = r0.f6911r
            lf.t1.G(r9)
            r9 = r2
            goto L6c
        L45:
            lf.t1.G(r9)
            java.lang.Object r9 = r8.f14396d
            wt.m r9 = (wt.m) r9
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = wt.b1.f24604a
            java.lang.Object r9 = r2.get(r9)
            boolean r9 = r9 instanceof wt.p0
            if (r9 != 0) goto L5a
            return r5
        L5a:
            java.lang.Object r9 = r8.f14395a
            eu.d r9 = (eu.d) r9
            r0.f6911r = r8
            r0.f6912x = r9
            r0.D = r4
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L6b
            goto L8f
        L6b:
            r4 = r8
        L6c:
            java.lang.Object r2 = r4.f14396d     // Catch: java.lang.Throwable -> L9f
            wt.m r2 = (wt.m) r2     // Catch: java.lang.Throwable -> L9f
            r2.getClass()     // Catch: java.lang.Throwable -> L9f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = wt.b1.f24604a     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Throwable -> L9f
            boolean r2 = r2 instanceof wt.p0     // Catch: java.lang.Throwable -> L9f
            if (r2 != 0) goto L83
            eu.d r9 = (eu.d) r9
            r9.f(r6)
            return r5
        L83:
            r0.f6911r = r4     // Catch: java.lang.Throwable -> L9f
            r0.f6912x = r9     // Catch: java.lang.Throwable -> L9f
            r0.D = r3     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = r4.g(r0)     // Catch: java.lang.Throwable -> L9f
            if (r0 != r1) goto L90
        L8f:
            return r1
        L90:
            r1 = r9
            r0 = r4
        L92:
            java.lang.Object r9 = r0.f14396d     // Catch: java.lang.Throwable -> L31
            wt.m r9 = (wt.m) r9     // Catch: java.lang.Throwable -> L31
            r9.I(r5)     // Catch: java.lang.Throwable -> L31
            eu.d r1 = (eu.d) r1
            r1.f(r6)
            return r5
        L9f:
            r0 = move-exception
            r1 = r9
            r9 = r0
        La2:
            eu.d r1 = (eu.d) r1
            r1.f(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.r.u(rq.c):java.lang.Object");
    }

    public void v(ge.l lVar) {
        Handler handler = (Handler) this.f14396d;
        int i10 = lVar.f9559b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(lVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, lVar), i10);
    }

    public void w() {
        ge.l lVar = (ge.l) this.f14398r;
        if (lVar != null) {
            this.f14397g = lVar;
            this.f14398r = null;
            ge.e eVar = (ge.e) lVar.f9558a.get();
            if (eVar == null) {
                this.f14397g = null;
            } else {
                Handler handler = ge.h.f9535w;
                handler.sendMessage(handler.obtainMessage(0, eVar.f9525a));
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0097: MOVE (r8 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:152), block:B:8:0x0097 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fh.g x(fh.g r17, ak.w r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r1 = r18
            java.lang.String r2 = "Error testing endpoint = "
            r3 = r16
            java.lang.Object r0 = r3.f14395a
            r4 = r0
            io.sentry.internal.debugmeta.c r4 = (io.sentry.internal.debugmeta.c) r4
            java.lang.String r0 = "responseCode: "
            java.lang.String r5 = "End results in Milli Seconds: "
            java.lang.String r6 = "result"
            r7 = r17
            br.l.e(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "start() called with: endpoint = "
            r6.<init>(r8)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r14 = "HttpHeadLatencyTest"
            ch.n.b(r14, r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r8 = 0
            br.l.b(r6)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r4.b(r6)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.net.HttpURLConnection r15 = k(r1)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            long r9 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            long r9 = r8.convert(r9, r11)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r15.connect()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            long r12 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            long r11 = r8.convert(r12, r11)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            long r11 = r11 - r9
            long r10 = r8.toMillis(r11)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r8.append(r10)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            ch.n.b(r14, r5)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            int r9 = r15.getResponseCode()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r5.append(r9)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            ch.n.b(r14, r0)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.lang.String r0 = "Location"
            java.lang.String r8 = r15.getHeaderField(r0)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r12 = 0
            r13 = 229(0xe5, float:3.21E-43)
            fh.g r0 = fh.g.a(r7, r8, r9, r10, r12, r13)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r4.B(r6)
            r15.disconnect()
            return r0
        L96:
            r0 = move-exception
            r8 = r15
            goto Lc4
        L99:
            r0 = move-exception
            goto L9f
        L9b:
            r0 = move-exception
            goto Lc4
        L9d:
            r0 = move-exception
            r15 = r8
        L9f:
            java.lang.String r1 = r1.f753c     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L96
            ch.n.d(r14, r1, r0)     // Catch: java.lang.Throwable -> L96
            java.lang.String r12 = r0.getLocalizedMessage()     // Catch: java.lang.Throwable -> L96
            r13 = 223(0xdf, float:3.12E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r7 = r17
            fh.g r0 = fh.g.a(r7, r8, r9, r10, r12, r13)     // Catch: java.lang.Throwable -> L96
            br.l.b(r6)
            r4.B(r6)
            if (r15 == 0) goto Lc3
            r15.disconnect()
        Lc3:
            return r0
        Lc4:
            br.l.b(r6)
            r4.B(r6)
            if (r8 == 0) goto Lcf
            r8.disconnect()
        Lcf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.r.x(fh.g, ak.w):fh.g");
    }

    public void y() {
        ArrayList arrayList = (ArrayList) this.f14396d;
        if (arrayList.isEmpty()) {
            return;
        }
        ((HashMap) ((io.sentry.t) this.f14397g).f12737d).put((js.s) this.f14395a, arrayList);
    }

    public of.b z(int i10, qs.b bVar, wr.a aVar) {
        js.s sVar = new js.s(((js.s) this.f14395a).f13826a + '@' + i10);
        io.sentry.t tVar = (io.sentry.t) this.f14398r;
        HashMap map = (HashMap) tVar.f12737d;
        List arrayList = (List) map.get(sVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(sVar, arrayList);
        }
        return ((r2) tVar.f12736a).E0(bVar, aVar, arrayList);
    }

    public r(r rVar, com.google.android.gms.internal.measurement.t tVar) {
        this.f14397g = new HashMap();
        this.f14398r = new HashMap();
        this.f14395a = rVar;
        this.f14396d = tVar;
    }

    public r(Context context, no.b bVar) {
        vn.b bVar2;
        br.l.e(bVar, "logger");
        this.f14395a = context;
        this.f14396d = bVar;
        this.f14397g = new br.a0(2, false);
        if (context.getResources().getConfiguration().orientation == 2) {
            bVar2 = vn.b.LANDSCAPE;
        } else {
            bVar2 = vn.b.PORTRAIT;
        }
        this.f14398r = bVar2;
        context.registerComponentCallbacks(new iq.c(this));
    }

    public r(io.sentry.internal.debugmeta.c cVar, yh.c cVar2, ThreadFactory threadFactory) {
        this.f14395a = cVar;
        this.f14396d = threadFactory;
        this.f14397g = new ArrayList();
    }

    public r(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, x5 x5Var) {
        this.f14396d = new io.sentry.util.a();
        this.f14397g = new u4(0);
        this.f14395a = scheduledThreadPoolExecutor;
        this.f14398r = x5Var;
    }

    public r(x5 x5Var) {
        this(new ScheduledThreadPoolExecutor(1, new j0(1)), x5Var);
    }

    public r(Typeface typeface, k4.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f14398r = typeface;
        this.f14395a = bVar;
        this.f14397g = new j4.r(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i14 = iA + bVar.f14037a;
            i10 = ((ByteBuffer) bVar.f14040r).getInt(((ByteBuffer) bVar.f14040r).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f14396d = new char[i10 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i15 = iA2 + bVar.f14037a;
            i11 = ((ByteBuffer) bVar.f14040r).getInt(((ByteBuffer) bVar.f14040r).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            j4.u uVar = new j4.u(this, i16);
            k4.a aVarB = uVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f14040r).getInt(iA3 + aVarB.f14037a) : 0, (char[]) this.f14396d, i16 * 2);
            k4.a aVarB2 = uVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i17 = iA4 + aVarB2.f14037a;
                i12 = ((ByteBuffer) aVarB2.f14040r).getInt(((ByteBuffer) aVarB2.f14040r).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            se.b.k("invalid metadata codepoint length", i12 > 0);
            j4.r rVar = (j4.r) this.f14397g;
            k4.a aVarB3 = uVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i18 = iA5 + aVarB3.f14037a;
                i13 = ((ByteBuffer) aVarB3.f14040r).getInt(((ByteBuffer) aVarB3.f14040r).getInt(i18) + i18);
            } else {
                i13 = 0;
            }
            rVar.a(uVar, 0, i13 - 1);
        }
    }

    public r(io.sentry.t tVar, js.s sVar) {
        this.f14398r = tVar;
        this.f14397g = tVar;
        this.f14395a = sVar;
        this.f14396d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(int i10) {
        this(new ScheduledThreadPoolExecutor(1, new j0(1)), (x5) null);
        switch (i10) {
            case 9:
                com.google.android.gms.internal.measurement.t tVar = new com.google.android.gms.internal.measurement.t(0);
                this.f14395a = tVar;
                r rVar = new r((r) null, tVar);
                this.f14397g = rVar;
                this.f14396d = rVar.E();
                w5 w5Var = new w5(1);
                this.f14398r = w5Var;
                rVar.G("require", new v9(w5Var));
                ((HashMap) w5Var.f5247a).put("internal.platform", b1.f4916a);
                rVar.G("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
                break;
            case 14:
                this.f14395a = new t3.c(10);
                this.f14396d = new i0(0);
                this.f14397g = new ArrayList();
                this.f14398r = new HashSet();
                break;
            case 19:
                this.f14395a = new Object();
                this.f14396d = new Handler(Looper.getMainLooper(), new ge.k(0, this));
                break;
            case 23:
                break;
            default:
                this.f14395a = null;
                this.f14396d = null;
                this.f14397g = null;
                this.f14398r = new ArrayDeque();
                break;
        }
    }

    public r(io.sentry.android.core.y yVar) {
        this.f14395a = yVar;
        this.f14396d = null;
        this.f14397g = null;
        this.f14398r = null;
    }
}
