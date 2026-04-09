package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.tn1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class n10 {

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f30733a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<tn1.a> f30734b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<tn1.a> f30735c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<tn1> f30736d = new ArrayDeque<>();

    public final void a(tn1.a call) {
        tn1.a next;
        kotlin.jvm.internal.l.f(call, "call");
        synchronized (this) {
            try {
                this.f30734b.add(call);
                if (!call.a().f()) {
                    String strC = call.c();
                    Iterator<tn1.a> it = this.f30735c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<tn1.a> it2 = this.f30734b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it2.next();
                                    if (kotlin.jvm.internal.l.b(next.c(), strC)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            next = it.next();
                            if (kotlin.jvm.internal.l.b(next.c(), strC)) {
                                break;
                            }
                        }
                    }
                    if (next != null) {
                        call.a(next);
                    }
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        b();
    }

    public final void b(tn1.a call) {
        kotlin.jvm.internal.l.f(call, "call");
        call.b().decrementAndGet();
        a(this.f30735c, call);
    }

    public final synchronized int c() {
        return this.f30736d.size() + this.f30735c.size();
    }

    public final void b(tn1 call) {
        kotlin.jvm.internal.l.f(call, "call");
        a(this.f30736d, call);
    }

    private final void b() {
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<tn1.a> it = this.f30734b.iterator();
                kotlin.jvm.internal.l.e(it, "iterator(...)");
                while (it.hasNext()) {
                    tn1.a next = it.next();
                    if (this.f30735c.size() >= 64) {
                        break;
                    }
                    if (next.b().get() < 5) {
                        it.remove();
                        next.b().incrementAndGet();
                        arrayList.add(next);
                        this.f30735c.add(next);
                    }
                }
                c();
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((tn1.a) arrayList.get(i)).a(a());
        }
    }

    public final synchronized void a(tn1 call) {
        kotlin.jvm.internal.l.f(call, "call");
        this.f30736d.add(call);
    }

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f30733a == null) {
                this.f30733a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), t82.a(t82.f33486g + " Dispatcher", false));
            }
            threadPoolExecutor = this.f30733a;
            kotlin.jvm.internal.l.c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    private final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                C1992A c1992a = C1992A.f18074a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }
}
