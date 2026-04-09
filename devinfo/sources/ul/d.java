package ul;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import je.u;
import km.y;
import nk.k;
import p.o1;
import sl.f;
import sl.g;
import sl.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f35542k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f35543l;

    /* renamed from: a, reason: collision with root package name */
    public final y f35544a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f35545b;

    /* renamed from: c, reason: collision with root package name */
    public int f35546c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35547d;

    /* renamed from: e, reason: collision with root package name */
    public long f35548e;

    /* renamed from: f, reason: collision with root package name */
    public int f35549f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f35550h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f35551i;
    public final o1 j;

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        k.d(logger, "getLogger(...)");
        f35542k = logger;
        String str = h.f33838b + " TaskRunner";
        k.e(str, "name");
        f35543l = new d(new y(new g(true, 0, str)));
    }

    public d(y yVar) {
        Logger logger = f35542k;
        k.e(logger, "logger");
        this.f35544a = yVar;
        this.f35545b = logger;
        this.f35546c = 10000;
        this.f35550h = new ArrayList();
        this.f35551i = new ArrayList();
        this.j = new o1(9, this);
    }

    public static final void a(d dVar, a aVar, long j, boolean z3) {
        TimeZone timeZone = h.f33837a;
        c cVar = aVar.f35532c;
        k.b(cVar);
        if (cVar.f35539d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z10 = cVar.f35541f;
        cVar.f35541f = false;
        cVar.f35539d = null;
        dVar.f35550h.remove(cVar);
        if (j != -1 && !z10 && !cVar.f35538c) {
            cVar.e(aVar, j, true);
        }
        if (cVar.f35540e.isEmpty()) {
            return;
        }
        dVar.f35551i.add(cVar);
        if (z3) {
            return;
        }
        dVar.e();
    }

    public final a b() {
        long j;
        a aVar;
        boolean z3;
        TimeZone timeZone = h.f33837a;
        while (true) {
            ArrayList arrayList = this.f35551i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i4 = 0;
            a aVar2 = null;
            while (true) {
                if (i4 >= size) {
                    j = jNanoTime;
                    aVar = null;
                    z3 = false;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                a aVar3 = (a) ((c) obj).f35540e.get(0);
                j = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar3.f35533d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z3 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.f35550h;
            if (aVar2 != null) {
                TimeZone timeZone2 = h.f33837a;
                aVar2.f35533d = -1L;
                c cVar = aVar2.f35532c;
                k.b(cVar);
                cVar.f35540e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f35539d = aVar2;
                arrayList2.add(cVar);
                if (z3 || (!this.f35547d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar2;
            }
            if (this.f35547d) {
                if (jMin >= this.f35548e - j) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f35547d = true;
            this.f35548e = j + jMin;
            try {
                try {
                    TimeZone timeZone3 = h.f33837a;
                    if (jMin > 0) {
                        long j8 = jMin / 1000000;
                        Long.signum(j8);
                        long j9 = jMin - (1000000 * j8);
                        if (j8 > 0 || jMin > 0) {
                            wait(j8, (int) j9);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = h.f33837a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.b();
                        if (cVar2.f35540e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f35547d = false;
            }
        }
    }

    public final void c(c cVar) {
        k.e(cVar, "taskQueue");
        TimeZone timeZone = h.f33837a;
        if (cVar.f35539d == null) {
            boolean zIsEmpty = cVar.f35540e.isEmpty();
            ArrayList arrayList = this.f35551i;
            if (zIsEmpty) {
                arrayList.remove(cVar);
            } else {
                byte[] bArr = f.f33832a;
                k.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        if (this.f35547d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i4;
        synchronized (this) {
            i4 = this.f35546c;
            this.f35546c = i4 + 1;
        }
        return new c(this, u.r(i4, "Q"));
    }

    public final void e() {
        TimeZone timeZone = h.f33837a;
        int i4 = this.f35549f;
        if (i4 > this.g) {
            return;
        }
        this.f35549f = i4 + 1;
        o1 o1Var = this.j;
        k.e(o1Var, "runnable");
        ((ThreadPoolExecutor) this.f35544a.f28522b).execute(o1Var);
    }
}
