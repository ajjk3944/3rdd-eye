package X9;

import I.o;
import b9.C1992A;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;

/* compiled from: TaskRunner.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final d f13679h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final a f13680a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13682c;

    /* renamed from: d, reason: collision with root package name */
    public long f13683d;

    /* renamed from: b, reason: collision with root package name */
    public int f13681b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13684e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f13685f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final o f13686g = new o(this, 1);

    /* compiled from: TaskRunner.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f13687a;

        public a(V9.a aVar) {
            this.f13687a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        }

        public final void a(o runnable) {
            l.f(runnable, "runnable");
            this.f13687a.execute(runnable);
        }
    }

    static {
        String name = V9.b.f13059g + " TaskRunner";
        l.f(name, "name");
        f13679h = new d(new a(new V9.a(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        l.e(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(a aVar) {
        this.f13680a = aVar;
    }

    public static final void a(d dVar, X9.a aVar) {
        dVar.getClass();
        byte[] bArr = V9.b.f13053a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f13668a);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
                C1992A c1992a = C1992A.f18074a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                C1992A c1992a2 = C1992A.f18074a;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(X9.a aVar, long j4) {
        byte[] bArr = V9.b.f13053a;
        c cVar = aVar.f13670c;
        l.c(cVar);
        if (cVar.f13676d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z10 = cVar.f13678f;
        cVar.f13678f = false;
        cVar.f13676d = null;
        this.f13684e.remove(cVar);
        if (j4 != -1 && !z10 && !cVar.f13675c) {
            cVar.e(aVar, j4, true);
        }
        if (cVar.f13677e.isEmpty()) {
            return;
        }
        this.f13685f.add(cVar);
    }

    public final X9.a c() {
        long j4;
        X9.a aVar;
        boolean z10;
        byte[] bArr = V9.b.f13053a;
        while (true) {
            ArrayList arrayList = this.f13685f;
            if (arrayList.isEmpty()) {
                return null;
            }
            a aVar2 = this.f13680a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            X9.a aVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    j4 = jNanoTime;
                    aVar = null;
                    z10 = false;
                    break;
                }
                X9.a aVar4 = (X9.a) ((c) it.next()).f13677e.get(0);
                j4 = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar4.f13671d - j4);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar3 != null) {
                        z10 = true;
                        break;
                    }
                    aVar3 = aVar4;
                }
                jNanoTime = j4;
            }
            ArrayList arrayList2 = this.f13684e;
            if (aVar3 != null) {
                byte[] bArr2 = V9.b.f13053a;
                aVar3.f13671d = -1L;
                c cVar = aVar3.f13670c;
                l.c(cVar);
                cVar.f13677e.remove(aVar3);
                arrayList.remove(cVar);
                cVar.f13676d = aVar3;
                arrayList2.add(cVar);
                if (z10 || (!this.f13682c && !arrayList.isEmpty())) {
                    aVar2.a(this.f13686g);
                }
                return aVar3;
            }
            if (this.f13682c) {
                if (jMin >= this.f13683d - j4) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f13682c = true;
            this.f13683d = j4 + jMin;
            try {
                try {
                    long j10 = jMin / 1000000;
                    Long.signum(j10);
                    long j11 = jMin - (1000000 * j10);
                    if (j10 > 0 || jMin > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f13677e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f13682c = false;
            }
        }
    }

    public final void d(c taskQueue) {
        l.f(taskQueue, "taskQueue");
        byte[] bArr = V9.b.f13053a;
        if (taskQueue.f13676d == null) {
            boolean zIsEmpty = taskQueue.f13677e.isEmpty();
            ArrayList arrayList = this.f13685f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                l.f(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z10 = this.f13682c;
        a aVar = this.f13680a;
        if (z10) {
            notify();
        } else {
            aVar.a(this.f13686g);
        }
    }

    public final c e() {
        int i10;
        synchronized (this) {
            i10 = this.f13681b;
            this.f13681b = i10 + 1;
        }
        return new c(this, C4356c.h(i10, "Q"));
    }
}
