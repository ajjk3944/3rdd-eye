package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: i, reason: collision with root package name */
    public static final Executor f5297i = new da(0);
    public static final Executor j = new da(1);

    /* renamed from: b, reason: collision with root package name */
    private final String f5299b;
    private volatile Object g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Object f5304h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f5298a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f5300c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f5301d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f5302e = false;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f5303f = false;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a(Object obj);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface b {
        void a(boolean z3, Object obj, Object obj2);
    }

    public s4(String str) {
        this.f5299b = str;
    }

    public static s4 a(String str, Object obj) {
        return new s4(str).b(obj);
    }

    public String toString() {
        String str;
        if (!this.f5301d) {
            str = "Waiting";
        } else if (this.f5302e) {
            str = "Success -> " + this.g;
        } else {
            str = "Failed -> " + this.f5304h;
        }
        return "Promise(" + c() + ": " + str + ")";
    }

    public s4 a(Object obj) {
        a(false, (Object) null, obj, false);
        return this;
    }

    public s4 b(Object obj) {
        a(true, obj, (Object) null, false);
        return this;
    }

    public s4 c(Object obj) {
        a(false, (Object) null, obj, true);
        return this;
    }

    public boolean d() {
        return this.f5301d;
    }

    public boolean e() {
        return this.f5301d && !this.f5302e;
    }

    public void a(Executor executor, Runnable runnable) {
        a(executor, new x8(3, runnable));
    }

    public Object b() {
        l1.a(e());
        return this.f5304h;
    }

    public String c() {
        String str = this.f5299b;
        return str != null ? str : super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z3, Object obj, Object obj2) {
        if (z3) {
            runnable.run();
        }
    }

    private Runnable c(Executor executor, b bVar) {
        return new b5.e(this, executor, bVar, 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, b bVar) {
        try {
            executor.execute(new w8(17, this, bVar));
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void a(Executor executor, a aVar) {
        a(executor, new x8(2, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z3, Object obj, Object obj2) {
        if (z3) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.f5298a) {
            try {
                if (!this.f5301d) {
                    this.f5300c.add(runnableC);
                } else {
                    runnableC.run();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a() {
        return this.f5301d && this.f5303f;
    }

    private void a(boolean z3, Object obj, Object obj2, boolean z10) {
        synchronized (this.f5298a) {
            try {
                if (this.f5301d) {
                    return;
                }
                this.g = obj;
                this.f5304h = obj2;
                this.f5302e = z3;
                this.f5303f = z10;
                this.f5301d = true;
                Iterator it = this.f5300c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f5300c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f5302e, this.g, this.f5304h);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    private void a(Throwable th2) {
        l1.a(th2);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            kVar.D().a("Promise", "PromiseCallback: " + c(), th2);
        }
    }
}
