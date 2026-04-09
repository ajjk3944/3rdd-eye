package ru;

import br.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import oh.p;
import pb.l0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final c f21810h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f21811i;

    /* renamed from: a, reason: collision with root package name */
    public final p f21812a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21814c;

    /* renamed from: d, reason: collision with root package name */
    public long f21815d;

    /* renamed from: b, reason: collision with root package name */
    public int f21813b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f21816e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f21817f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final l0 f21818g = new l0(5, this);

    static {
        String str = pu.b.f20651g + " TaskRunner";
        l.e(str, "name");
        f21810h = new c(new p(new pu.a(str, true)));
        Logger logger = Logger.getLogger(c.class.getName());
        l.d(logger, "getLogger(TaskRunner::class.java.name)");
        f21811i = logger;
    }

    public c(p pVar) {
        this.f21812a = pVar;
    }

    public static final void a(c cVar, a aVar) {
        byte[] bArr = pu.b.f20645a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f21800a);
        try {
            long jA = aVar.a();
            synchronized (cVar) {
                cVar.b(aVar, jA);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (cVar) {
                cVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void b(a aVar, long j) {
        byte[] bArr = pu.b.f20645a;
        b bVar = aVar.f21802c;
        l.b(bVar);
        if (bVar.f21807d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z10 = bVar.f21809f;
        bVar.f21809f = false;
        bVar.f21807d = null;
        this.f21816e.remove(bVar);
        if (j != -1 && !z10 && !bVar.f21806c) {
            bVar.e(aVar, j, true);
        }
        if (bVar.f21808e.isEmpty()) {
            return;
        }
        this.f21817f.add(bVar);
    }

    public final a c() {
        boolean z10;
        byte[] bArr = pu.b.f20645a;
        while (true) {
            ArrayList arrayList = this.f21817f;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                a aVar2 = (a) ((b) it.next()).f21808e.get(0);
                long jMax = Math.max(0L, aVar2.f21803d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f21816e;
            if (aVar != null) {
                byte[] bArr2 = pu.b.f20645a;
                aVar.f21803d = -1L;
                b bVar = aVar.f21802c;
                l.b(bVar);
                bVar.f21808e.remove(aVar);
                arrayList.remove(bVar);
                bVar.f21807d = aVar;
                arrayList2.add(bVar);
                if (z10 || (!this.f21814c && !arrayList.isEmpty())) {
                    l0 l0Var = this.f21818g;
                    l.e(l0Var, "runnable");
                    ((ThreadPoolExecutor) this.f21812a.f19481d).execute(l0Var);
                }
                return aVar;
            }
            if (!this.f21814c) {
                this.f21814c = true;
                this.f21815d = jNanoTime + jMin;
                try {
                    try {
                        long j = jMin / 1000000;
                        long j7 = jMin - (1000000 * j);
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) j7);
                        }
                    } catch (InterruptedException unused) {
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((b) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            b bVar2 = (b) arrayList.get(size2);
                            bVar2.b();
                            if (bVar2.f21808e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f21814c = false;
                }
            } else if (jMin < this.f21815d - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void d(b bVar) {
        l.e(bVar, "taskQueue");
        byte[] bArr = pu.b.f20645a;
        if (bVar.f21807d == null) {
            boolean zIsEmpty = bVar.f21808e.isEmpty();
            ArrayList arrayList = this.f21817f;
            if (zIsEmpty) {
                arrayList.remove(bVar);
            } else {
                l.e(arrayList, "<this>");
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            }
        }
        if (this.f21814c) {
            notify();
            return;
        }
        l0 l0Var = this.f21818g;
        l.e(l0Var, "runnable");
        ((ThreadPoolExecutor) this.f21812a.f19481d).execute(l0Var);
    }

    public final b e() {
        int i10;
        synchronized (this) {
            i10 = this.f21813b;
            this.f21813b = i10 + 1;
        }
        return new b(this, h0.b.h(i10, "Q"));
    }
}
