package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f42408a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f42409b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f42410c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f42411d;

    /* renamed from: e, reason: collision with root package name */
    private final g f42412e;

    public NetworkCore() {
        this(new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f42410c) {
                }
                this.f42411d = (d) this.f42408a.take();
                networkTask = this.f42411d.f42379a;
                Executor executor = networkTask.getExecutor();
                this.f42412e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f42410c) {
                    this.f42411d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f42410c) {
                        this.f42411d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f42410c) {
                        this.f42411d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        synchronized (this.f42409b) {
            try {
                d dVar = new d(networkTask);
                if (isRunning() && !this.f42408a.contains(dVar) && !dVar.equals(this.f42411d) && networkTask.onTaskAdded()) {
                    this.f42408a.offer(dVar);
                }
            } finally {
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f42410c) {
            try {
                ArrayList arrayList = new ArrayList(this.f42408a.size());
                this.f42408a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f42379a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(g gVar) {
        this.f42408a = new LinkedBlockingQueue();
        this.f42409b = new Object();
        this.f42410c = new Object();
        this.f42412e = gVar;
    }
}
