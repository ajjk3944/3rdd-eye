package io.sentry.transport;

import i.g0;
import io.sentry.b5;
import io.sentry.h0;
import io.sentry.j0;
import io.sentry.k4;
import io.sentry.l4;
import io.sentry.m4;
import io.sentry.r4;
import io.sentry.t;
import io.sentry.u0;
import io.sentry.u6;
import io.sentry.v;
import io.sentry.x5;
import ir.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c implements g {
    public volatile b B;

    /* renamed from: a, reason: collision with root package name */
    public final n f12753a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.cache.c f12754d;

    /* renamed from: g, reason: collision with root package name */
    public final x5 f12755g;

    /* renamed from: r, reason: collision with root package name */
    public final p f12756r;

    /* renamed from: x, reason: collision with root package name */
    public final h f12757x;

    /* renamed from: y, reason: collision with root package name */
    public final e f12758y;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public c(x5 x5Var, p pVar, h hVar, t tVar) {
        int maxQueueSize = x5Var.getMaxQueueSize();
        final io.sentry.cache.c envelopeDiskCache = x5Var.getEnvelopeDiskCache();
        final u0 logger = x5Var.getLogger();
        l4 dateProvider = x5Var.getDateProvider();
        n nVar = new n(maxQueueSize, new j0(4), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    h0 h0Var = bVar.f12749d;
                    if (!dr.a.B(h0Var, io.sentry.hints.d.class)) {
                        envelopeDiskCache.R(bVar.f12748a, h0Var);
                    }
                    Object objY = dr.a.y(h0Var);
                    if (io.sentry.hints.j.class.isInstance(dr.a.y(h0Var)) && objY != null) {
                        ((io.sentry.hints.j) objY).b(false);
                    }
                    Object objY2 = dr.a.y(h0Var);
                    if (io.sentry.hints.g.class.isInstance(dr.a.y(h0Var)) && objY2 != null) {
                        ((io.sentry.hints.g) objY2).c(true);
                    }
                    logger.m(b5.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        e eVar = new e(x5Var, tVar, pVar);
        this.B = null;
        this.f12753a = nVar;
        io.sentry.cache.c envelopeDiskCache2 = x5Var.getEnvelopeDiskCache();
        f0.T(envelopeDiskCache2, "envelopeCache is required");
        this.f12754d = envelopeDiskCache2;
        this.f12755g = x5Var;
        this.f12756r = pVar;
        f0.T(hVar, "transportGate is required");
        this.f12757x = hVar;
        this.f12758y = eVar;
    }

    @Override // io.sentry.transport.g
    public final void a(boolean z10) {
        this.f12756r.close();
        this.f12753a.shutdown();
        this.f12755g.getLogger().m(b5.DEBUG, "Shutting down", new Object[0]);
        if (z10) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f12755g.getFlushTimeoutMillis();
            if (this.f12753a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f12755g.getLogger().m(b5.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f12753a.shutdownNow();
            if (this.B != null) {
                this.f12753a.getRejectedExecutionHandler().rejectedExecution(this.B, this.f12753a);
            }
        } catch (InterruptedException unused) {
            this.f12755g.getLogger().m(b5.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final void c(long j) throws InterruptedException {
        n nVar = this.f12753a;
        nVar.getClass();
        try {
            g0 g0Var = nVar.f12774x;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            g0Var.getClass();
            ((q) g0Var.f11051a).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e4) {
            nVar.f12772g.g(b5.ERROR, "Failed to wait till idle", e4);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(false);
    }

    @Override // io.sentry.transport.g
    public final p d() {
        return this.f12756r;
    }

    @Override // io.sentry.transport.g
    public final boolean e() {
        boolean z10;
        p pVar = this.f12756r;
        pVar.getClass();
        ((d) pVar.f12776d).getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) pVar.f12778r;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((io.sentry.m) it.next());
            if (date2 != null && !date.after(date2)) {
                z10 = true;
                break;
            }
        }
        n nVar = this.f12753a;
        k4 k4Var = nVar.f12771d;
        return (z10 || (k4Var != null && (nVar.f12773r.a().b(k4Var) > 2000000000L ? 1 : (nVar.f12773r.a().b(k4Var) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.g
    public final void v(i4.b bVar, h0 h0Var) {
        io.sentry.cache.c cVar;
        boolean z10;
        i4.b bVarM;
        List listSingletonList;
        Iterable<r4> iterable = (Iterable) bVar.f11197d;
        boolean zB = dr.a.B(h0Var, io.sentry.hints.d.class);
        x5 x5Var = this.f12755g;
        io.sentry.cache.c cVar2 = this.f12754d;
        if (zB) {
            x5Var.getLogger().m(b5.DEBUG, "Captured Envelope is already cached", new Object[0]);
            cVar = i.f12765a;
            z10 = true;
        } else {
            cVar = cVar2;
            z10 = false;
        }
        p pVar = this.f12756r;
        x5 x5Var2 = (x5) pVar.f12777g;
        ArrayList arrayList = null;
        for (r4 r4Var : iterable) {
            String itemType = r4Var.f12690a.f12734x.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    listSingletonList = Collections.singletonList(io.sentry.m.Attachment);
                    break;
                case "replay_video":
                    listSingletonList = Collections.singletonList(io.sentry.m.Replay);
                    break;
                case "profile_chunk":
                    listSingletonList = Arrays.asList(io.sentry.m.ProfileChunkUi, io.sentry.m.ProfileChunk);
                    break;
                case "profile":
                    listSingletonList = Collections.singletonList(io.sentry.m.Profile);
                    break;
                case "feedback":
                    listSingletonList = Collections.singletonList(io.sentry.m.Feedback);
                    break;
                case "log":
                    listSingletonList = Collections.singletonList(io.sentry.m.LogItem);
                    break;
                case "event":
                    listSingletonList = Collections.singletonList(io.sentry.m.Error);
                    break;
                case "check_in":
                    listSingletonList = Collections.singletonList(io.sentry.m.Monitor);
                    break;
                case "session":
                    listSingletonList = Collections.singletonList(io.sentry.m.Session);
                    break;
                case "transaction":
                    listSingletonList = Collections.singletonList(io.sentry.m.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(io.sentry.m.Unknown);
                    break;
            }
            Iterator it = listSingletonList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (pVar.f((io.sentry.m) it.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(r4Var);
                    x5Var2.getClientReportRecorder().w(io.sentry.clientreport.d.RATELIMIT_BACKOFF, r4Var);
                }
            }
        }
        if (arrayList != null) {
            x5Var2.getLogger().m(b5.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (r4 r4Var2 : iterable) {
                if (!arrayList.contains(r4Var2)) {
                    arrayList2.add(r4Var2);
                }
            }
            if (arrayList2.isEmpty()) {
                x5Var2.getLogger().m(b5.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                Object objY = dr.a.y(h0Var);
                if (io.sentry.hints.j.class.isInstance(dr.a.y(h0Var)) && objY != null) {
                    ((io.sentry.hints.j) objY).b(false);
                }
                Object objY2 = dr.a.y(h0Var);
                if (io.sentry.hints.g.class.isInstance(dr.a.y(h0Var)) && objY2 != null) {
                    ((io.sentry.hints.g) objY2).c(false);
                }
                Object objY3 = dr.a.y(h0Var);
                if (io.sentry.hints.c.class.isInstance(dr.a.y(h0Var)) && objY3 != null) {
                    ((io.sentry.hints.c) objY3).f12313a.countDown();
                    x5Var2.getLogger().m(b5.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                bVarM = null;
            } else {
                bVarM = new i4.b((m4) bVar.f11196a, (List) arrayList2);
            }
        } else {
            bVarM = bVar;
        }
        if (bVarM == null) {
            if (z10) {
                cVar2.q(bVar);
                return;
            }
            return;
        }
        if (u6.class.isInstance(dr.a.y(h0Var))) {
            bVarM = x5Var.getClientReportRecorder().m(bVarM);
        }
        Future futureSubmit = this.f12753a.submit(new b(this, bVarM, h0Var, cVar));
        if (futureSubmit != null && futureSubmit.isCancelled()) {
            x5Var.getClientReportRecorder().q(io.sentry.clientreport.d.QUEUE_OVERFLOW, bVarM);
            return;
        }
        Object objY4 = dr.a.y(h0Var);
        if (!v.class.isInstance(dr.a.y(h0Var)) || objY4 == null) {
            return;
        }
        v vVar = (v) objY4;
        vVar.B.add(vVar.f12828y);
        x5Var.getLogger().m(b5.DEBUG, "Envelope enqueued", new Object[0]);
    }
}
