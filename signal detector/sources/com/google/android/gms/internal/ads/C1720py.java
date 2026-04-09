package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.py, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1720py implements InterfaceC1666oy {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f16260a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f16261b = new PriorityQueue();

    public C1720py(Executor executor) {
        this.f16260a = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1666oy
    public final void a(Runnable runnable, long j6) {
        if (j6 <= 0) {
            this.f16260a.execute(runnable);
            return;
        }
        C1774qy c1774qy = new C1774qy(runnable, System.currentTimeMillis() + j6);
        PriorityQueue priorityQueue = this.f16261b;
        synchronized (priorityQueue) {
            priorityQueue.add(c1774qy);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1666oy
    public final void c() {
        PriorityQueue priorityQueue = this.f16261b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (C1774qy c1774qy = (C1774qy) priorityQueue.peek(); c1774qy != null && c1774qy.f16428b <= jCurrentTimeMillis; c1774qy = (C1774qy) priorityQueue.peek()) {
                    priorityQueue2.add(c1774qy);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f16260a.execute(((C1774qy) it.next()).f16427a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
