package com.applovin.shadow.okhttp3.internal.connection;

import a0.g;
import com.applovin.shadow.okhttp3.ConnectionPool;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.concurrent.Task;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskQueue;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.connection.RealCall;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import d.h;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import nk.f;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class RealConnectionPool {
    public static final Companion Companion = new Companion(null);
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
            k.e(connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.applovin.shadow.okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i4, long j, TimeUnit timeUnit) {
        k.e(taskRunner, "taskRunner");
        k.e(timeUnit, "timeUnit");
        this.maxIdleConnections = i4;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        this.cleanupQueue = taskRunner.newQueue();
        final String strW = h.w(new StringBuilder(), Util.okHttpName, " ConnectionPool");
        this.cleanupTask = new Task(strW) { // from class: com.applovin.shadow.okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                return this.this$0.cleanup(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
        if (j <= 0) {
            throw new IllegalArgumentException(g.j(j, "keepAliveDuration <= 0: ").toString());
        }
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        int i4 = 0;
        while (i4 < calls.size()) {
            Reference<RealCall> reference = calls.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                Platform.Companion.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i4);
                realConnection.setNoNewExchanges(true);
                if (calls.isEmpty()) {
                    realConnection.setIdleAtNs$okhttp(j - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean callAcquirePooledConnection(com.applovin.shadow.okhttp3.Address r4, com.applovin.shadow.okhttp3.internal.connection.RealCall r5, java.util.List<com.applovin.shadow.okhttp3.Route> r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            nk.k.e(r4, r0)
            java.lang.String r0 = "call"
            nk.k.e(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<com.applovin.shadow.okhttp3.internal.connection.RealConnection> r0 = r3.connections
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            com.applovin.shadow.okhttp3.internal.connection.RealConnection r1 = (com.applovin.shadow.okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            nk.k.d(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            goto L2d
        L2b:
            r4 = move-exception
            goto L3b
        L2d:
            boolean r2 = r1.isEligible$okhttp(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            r5.acquireConnectionNoEvents(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L39:
            monitor-exit(r1)
            goto L10
        L3b:
            monitor-exit(r1)
            throw r4
        L3d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.connection.RealConnectionPool.callAcquirePooledConnection(com.applovin.shadow.okhttp3.Address, com.applovin.shadow.okhttp3.internal.connection.RealCall, java.util.List, boolean):boolean");
    }

    public final long cleanup(long j) throws IOException {
        Iterator<RealConnection> it = this.connections.iterator();
        int i4 = 0;
        long j8 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i10 = 0;
        while (it.hasNext()) {
            RealConnection next = it.next();
            k.d(next, "connection");
            synchronized (next) {
                if (pruneAndGetAllocationCount(next, j) > 0) {
                    i10++;
                } else {
                    i4++;
                    long idleAtNs$okhttp = j - next.getIdleAtNs$okhttp();
                    if (idleAtNs$okhttp > j8) {
                        realConnection = next;
                        j8 = idleAtNs$okhttp;
                    }
                }
            }
        }
        long j9 = this.keepAliveDurationNs;
        if (j8 < j9 && i4 <= this.maxIdleConnections) {
            if (i4 > 0) {
                return j9 - j8;
            }
            if (i10 > 0) {
                return j9;
            }
            return -1L;
        }
        k.b(realConnection);
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs$okhttp() + j8 != j) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
        k.e(realConnection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        if (!realConnection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        realConnection.setNoNewExchanges(true);
        this.connections.remove(realConnection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket;
        Iterator<RealConnection> it = this.connections.iterator();
        k.d(it, "connections.iterator()");
        while (it.hasNext()) {
            RealConnection next = it.next();
            k.d(next, "connection");
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    socket = next.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Util.closeQuietly(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i4 = 0;
        if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (RealConnection realConnection : concurrentLinkedQueue) {
            k.d(realConnection, "it");
            synchronized (realConnection) {
                zIsEmpty = realConnection.getCalls().isEmpty();
            }
            if (zIsEmpty && (i4 = i4 + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i4;
    }

    public final void put(RealConnection realConnection) {
        k.e(realConnection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnection)) {
            this.connections.add(realConnection);
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
    }
}
