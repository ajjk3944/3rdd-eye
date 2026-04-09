package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.connection.g;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f17615g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp ConnectionPool", true));

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f17616h = true;

    /* renamed from: a, reason: collision with root package name */
    private final int f17617a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17618b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f17619c;

    /* renamed from: d, reason: collision with root package name */
    private final Deque<com.mbridge.msdk.thrid.okhttp.internal.connection.c> f17620d;

    /* renamed from: e, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.d f17621e;

    /* renamed from: f, reason: collision with root package name */
    boolean f17622f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            while (true) {
                long jA = i.this.a(System.nanoTime());
                if (jA == -1) {
                    return;
                }
                if (jA > 0) {
                    long j10 = jA / 1000000;
                    long j11 = jA - (1000000 * j10);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j10, (int) j11);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    @Nullable
    public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
        if (!f17616h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f17620d) {
            if (cVar.a(aVar, c0Var)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    public void b(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f17616h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f17622f) {
            this.f17622f = true;
            f17615g.execute(this.f17619c);
        }
        this.f17620d.add(cVar);
    }

    public i(int i10, long j10, TimeUnit timeUnit) {
        this.f17619c = new a();
        this.f17620d = new ArrayDeque();
        this.f17621e = new com.mbridge.msdk.thrid.okhttp.internal.connection.d();
        this.f17617a = i10;
        this.f17618b = timeUnit.toNanos(j10);
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
    }

    @Nullable
    public Socket a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
        if (!f17616h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f17620d) {
            if (cVar.a(aVar, null) && cVar.f() && cVar != gVar.c()) {
                return gVar.b(cVar);
            }
        }
        return null;
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f17616h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!cVar.f17675k && this.f17617a != 0) {
            notifyAll();
            return false;
        }
        this.f17620d.remove(cVar);
        return true;
    }

    public long a(long j10) throws IOException {
        synchronized (this) {
            try {
                com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = null;
                long j11 = Long.MIN_VALUE;
                int i10 = 0;
                int i11 = 0;
                for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2 : this.f17620d) {
                    if (a(cVar2, j10) > 0) {
                        i11++;
                    } else {
                        i10++;
                        long j12 = j10 - cVar2.f17679o;
                        if (j12 > j11) {
                            cVar = cVar2;
                            j11 = j12;
                        }
                    }
                }
                long j13 = this.f17618b;
                if (j11 < j13 && i10 <= this.f17617a) {
                    if (i10 > 0) {
                        return j13 - j11;
                    }
                    if (i11 > 0) {
                        return j13;
                    }
                    this.f17622f = false;
                    return -1L;
                }
                this.f17620d.remove(cVar);
                com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.g());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar, long j10) {
        List<Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> list = cVar.f17678n;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("A connection to " + cVar.c().a().k() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f17708a);
                list.remove(i10);
                cVar.f17675k = true;
                if (list.isEmpty()) {
                    cVar.f17679o = j10 - this.f17618b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
