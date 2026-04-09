package ul;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.t1;
import nk.k;
import sl.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f35536a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35537b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35538c;

    /* renamed from: d, reason: collision with root package name */
    public a f35539d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f35540e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35541f;

    public c(d dVar, String str) {
        k.e(str, "name");
        this.f35536a = dVar;
        this.f35537b = str;
        this.f35540e = new ArrayList();
    }

    public static void c(c cVar, String str, mk.a aVar) {
        cVar.getClass();
        k.e(str, "name");
        k.e(aVar, "block");
        cVar.d(new b(str, aVar), 0L);
    }

    public final void a() {
        d dVar = this.f35536a;
        TimeZone timeZone = h.f33837a;
        synchronized (dVar) {
            if (b()) {
                this.f35536a.c(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f35539d;
        if (aVar != null && aVar.f35531b) {
            this.f35541f = true;
        }
        ArrayList arrayList = this.f35540e;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f35531b) {
                Logger logger = this.f35536a.f35545b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    t1.b(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void d(a aVar, long j) {
        k.e(aVar, "task");
        synchronized (this.f35536a) {
            if (!this.f35538c) {
                if (e(aVar, j, false)) {
                    this.f35536a.c(this);
                }
            } else if (aVar.f35531b) {
                Logger logger = this.f35536a.f35545b;
                if (logger.isLoggable(Level.FINE)) {
                    t1.b(logger, aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f35536a.f35545b;
                if (logger2.isLoggable(Level.FINE)) {
                    t1.b(logger2, aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(ul.a r12, long r13, boolean r15) {
        /*
            r11 = this;
            ul.d r0 = r11.f35536a
            java.util.logging.Logger r0 = r0.f35545b
            java.lang.String r1 = "task"
            nk.k.e(r12, r1)
            ul.c r1 = r12.f35532c
            if (r1 != r11) goto Le
            goto L12
        Le:
            if (r1 != 0) goto L89
            r12.f35532c = r11
        L12:
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.f35540e
            int r6 = r5.indexOf(r12)
            r7 = -1
            r8 = 0
            if (r6 == r7) goto L39
            long r9 = r12.f35533d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L36
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L88
            java.lang.String r13 = "already scheduled"
            me.t1.b(r0, r12, r11, r13)
            return r8
        L36:
            r5.remove(r6)
        L39:
            r12.f35533d = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L5f
            if (r15 == 0) goto L51
            long r3 = r3 - r1
            java.lang.String r15 = me.t1.j(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L5c
        L51:
            long r3 = r3 - r1
            java.lang.String r15 = me.t1.j(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L5c:
            me.t1.b(r0, r12, r11, r15)
        L5f:
            int r15 = r5.size()
            r0 = r8
            r3 = r0
        L65:
            if (r3 >= r15) goto L7a
            java.lang.Object r4 = r5.get(r3)
            int r3 = r3 + 1
            ul.a r4 = (ul.a) r4
            long r9 = r4.f35533d
            long r9 = r9 - r1
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L77
            goto L7b
        L77:
            int r0 = r0 + 1
            goto L65
        L7a:
            r0 = r7
        L7b:
            if (r0 != r7) goto L81
            int r0 = r5.size()
        L81:
            r5.add(r0, r12)
            if (r0 != 0) goto L88
            r12 = 1
            return r12
        L88:
            return r8
        L89:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ul.c.e(ul.a, long, boolean):boolean");
    }

    public final void f() {
        d dVar = this.f35536a;
        TimeZone timeZone = h.f33837a;
        synchronized (dVar) {
            this.f35538c = true;
            if (b()) {
                this.f35536a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f35537b;
    }
}
