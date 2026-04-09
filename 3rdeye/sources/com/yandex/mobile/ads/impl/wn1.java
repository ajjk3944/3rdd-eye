package com.yandex.mobile.ads.impl;

import N7.G8;
import b9.C1992A;
import com.yandex.mobile.ads.impl.lh1;
import com.yandex.mobile.ads.impl.tn1;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class wn1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f35027a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35028b;

    /* renamed from: c, reason: collision with root package name */
    private final y32 f35029c;

    /* renamed from: d, reason: collision with root package name */
    private final vn1 f35030d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue<un1> f35031e;

    public wn1(z32 taskRunner, TimeUnit timeUnit) {
        kotlin.jvm.internal.l.f(taskRunner, "taskRunner");
        kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
        this.f35027a = 5;
        this.f35028b = timeUnit.toNanos(5L);
        this.f35029c = taskRunner.e();
        this.f35030d = new vn1(this, G8.s(t82.f33486g, " ConnectionPool"));
        this.f35031e = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.yandex.mobile.ads.impl.ta r4, com.yandex.mobile.ads.impl.tn1 r5, java.util.List<com.yandex.mobile.ads.impl.ps1> r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.l.f(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.l.f(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<com.yandex.mobile.ads.impl.un1> r0 = r3.f35031e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.un1 r1 = (com.yandex.mobile.ads.impl.un1) r1
            kotlin.jvm.internal.l.c(r1)
            monitor-enter(r1)
            if (r7 == 0) goto L2b
            boolean r2 = r1.h()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L37
            goto L2b
        L29:
            r4 = move-exception
            goto L3b
        L2b:
            boolean r2 = r1.a(r4, r6)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L37
            r5.a(r1)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            r4 = 1
            return r4
        L37:
            b9.A r2 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            goto L10
        L3b:
            monitor-exit(r1)
            throw r4
        L3d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wn1.a(com.yandex.mobile.ads.impl.ta, com.yandex.mobile.ads.impl.tn1, java.util.List, boolean):boolean");
    }

    public final void b(un1 connection) {
        kotlin.jvm.internal.l.f(connection, "connection");
        if (!t82.f33485f || Thread.holdsLock(connection)) {
            this.f35031e.add(connection);
            this.f35029c.a(this.f35030d, 0L);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final long a(long j4) throws IOException {
        Iterator<un1> it = this.f35031e.iterator();
        int i = 0;
        long j10 = Long.MIN_VALUE;
        un1 un1Var = null;
        int i10 = 0;
        while (it.hasNext()) {
            un1 next = it.next();
            kotlin.jvm.internal.l.c(next);
            synchronized (next) {
                if (a(next, j4) > 0) {
                    i10++;
                } else {
                    i++;
                    long jC = j4 - next.c();
                    if (jC > j10) {
                        un1Var = next;
                        j10 = jC;
                    }
                    C1992A c1992a = C1992A.f18074a;
                }
            }
        }
        long j11 = this.f35028b;
        if (j10 < j11 && i <= this.f35027a) {
            if (i > 0) {
                return j11 - j10;
            }
            if (i10 > 0) {
                return j11;
            }
            return -1L;
        }
        kotlin.jvm.internal.l.c(un1Var);
        synchronized (un1Var) {
            if (!un1Var.b().isEmpty()) {
                return 0L;
            }
            if (un1Var.c() + j10 != j4) {
                return 0L;
            }
            un1Var.l();
            this.f35031e.remove(un1Var);
            t82.a(un1Var.m());
            if (this.f35031e.isEmpty()) {
                this.f35029c.a();
            }
            return 0L;
        }
    }

    public final boolean a(un1 connection) {
        kotlin.jvm.internal.l.f(connection, "connection");
        if (t82.f33485f && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.d() && this.f35027a != 0) {
            this.f35029c.a(this.f35030d, 0L);
            return false;
        }
        connection.l();
        this.f35031e.remove(connection);
        if (!this.f35031e.isEmpty()) {
            return true;
        }
        this.f35029c.a();
        return true;
    }

    private final int a(un1 un1Var, long j4) {
        if (t82.f33485f && !Thread.holdsLock(un1Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + un1Var);
        }
        ArrayList arrayListB = un1Var.b();
        int i = 0;
        while (i < arrayListB.size()) {
            Reference reference = (Reference) arrayListB.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + un1Var.k().a().k() + " was leaked. Did you forget to close a response body?";
                int i10 = lh1.f30001c;
                lh1.a.a().a(((tn1.b) reference).a(), str);
                arrayListB.remove(i);
                un1Var.l();
                if (arrayListB.isEmpty()) {
                    un1Var.a(j4 - this.f35028b);
                    return 0;
                }
            }
        }
        return arrayListB.size();
    }
}
