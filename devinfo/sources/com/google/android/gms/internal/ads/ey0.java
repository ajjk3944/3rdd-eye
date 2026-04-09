package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ey0 implements dy0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f10917a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f10918b = new PriorityQueue();

    public ey0(Executor executor) {
        this.f10917a = executor;
    }

    @Override // com.google.android.gms.internal.ads.dy0
    public final void a() {
        PriorityQueue priorityQueue = this.f10918b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (fy0 fy0Var = (fy0) priorityQueue.peek(); fy0Var != null && fy0Var.f11290b <= jCurrentTimeMillis; fy0Var = (fy0) priorityQueue.peek()) {
                    priorityQueue2.add(fy0Var);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f10917a.execute(((fy0) it.next()).f11289a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dy0
    public final void b(Runnable runnable, long j) {
        if (j <= 0) {
            this.f10917a.execute(runnable);
            return;
        }
        fy0 fy0Var = new fy0(runnable, System.currentTimeMillis() + j);
        PriorityQueue priorityQueue = this.f10918b;
        synchronized (priorityQueue) {
            priorityQueue.add(fy0Var);
        }
    }
}
