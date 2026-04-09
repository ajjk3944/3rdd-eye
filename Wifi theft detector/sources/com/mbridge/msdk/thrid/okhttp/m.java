package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f18012h = true;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private Runnable f18015c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private ExecutorService f18016d;

    /* renamed from: a, reason: collision with root package name */
    private int f18013a = 64;

    /* renamed from: b, reason: collision with root package name */
    private int f18014b = 5;

    /* renamed from: e, reason: collision with root package name */
    private final Deque<x.b> f18017e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private final Deque<x.b> f18018f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final Deque<x> f18019g = new ArrayDeque();

    public m(ExecutorService executorService) {
        this.f18016d = executorService;
    }

    private int c(x.b bVar) {
        int i10 = 0;
        for (x.b bVar2 : this.f18018f) {
            if (!bVar2.c().f18123f && bVar2.d().equals(bVar.d())) {
                i10++;
            }
        }
        return i10;
    }

    public synchronized ExecutorService a() {
        try {
            if (this.f18016d == null) {
                this.f18016d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18016d;
    }

    public void b(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f18014b = i10;
            }
            b();
        } else {
            throw new IllegalArgumentException("max < 1: " + i10);
        }
    }

    public synchronized int c() {
        return this.f18018f.size() + this.f18019g.size();
    }

    public void a(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f18013a = i10;
            }
            b();
        } else {
            throw new IllegalArgumentException("max < 1: " + i10);
        }
    }

    private boolean b() {
        int i10;
        boolean z10;
        if (!f18012h && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<x.b> it = this.f18017e.iterator();
                while (it.hasNext()) {
                    x.b next = it.next();
                    if (this.f18018f.size() >= this.f18013a) {
                        break;
                    }
                    if (c(next) < this.f18014b) {
                        it.remove();
                        arrayList.add(next);
                        this.f18018f.add(next);
                    }
                }
                z10 = c() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((x.b) arrayList.get(i10)).a(a());
        }
        return z10;
    }

    public m() {
    }

    public void a(x.b bVar) {
        synchronized (this) {
            this.f18017e.add(bVar);
        }
        b();
    }

    public synchronized void a(x xVar) {
        this.f18019g.add(xVar);
    }

    private <T> void a(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f18015c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void b(x.b bVar) {
        a(this.f18018f, bVar);
    }

    public void b(x xVar) {
        a(this.f18019g, xVar);
    }
}
