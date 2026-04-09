package com.applovin.impl;

import C.RunnableC0615b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import s1.ExecutorC5546b;

/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f19425h = new J();
    public static final Executor i = new ExecutorC5546b();

    /* renamed from: b, reason: collision with root package name */
    private final String f19427b;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f19431f;

    /* renamed from: g, reason: collision with root package name */
    private volatile Object f19432g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f19426a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f19428c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f19429d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f19430e = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z10, Object obj, Object obj2);
    }

    public g4(String str) {
        this.f19427b = str;
    }

    public String toString() {
        String str;
        if (!this.f19429d) {
            str = "Waiting";
        } else if (this.f19430e) {
            str = "Success -> " + this.f19431f;
        } else {
            str = "Failed -> " + this.f19432g;
        }
        return "Promise(" + b() + ": " + str + ")";
    }

    public static g4 a(String str, Object obj) {
        return new g4(str).b(obj);
    }

    public g4 b(Object obj) {
        a(true, obj, (Object) null);
        return this;
    }

    public boolean c() {
        return this.f19429d;
    }

    public boolean d() {
        return this.f19429d && !this.f19430e;
    }

    private Runnable c(Executor executor, b bVar) {
        return new N.d(this, executor, bVar, 3);
    }

    public g4 a(Object obj) {
        a(false, (Object) null, obj);
        return this;
    }

    public String b() {
        String str = this.f19427b;
        return str != null ? str : super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, b bVar) {
        try {
            executor.execute(new RunnableC0615b(13, this, bVar));
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, Runnable runnable) {
        a(executor, new B8.b(runnable, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z10, Object obj, Object obj2) {
        if (z10) {
            runnable.run();
        }
    }

    public void a(Executor executor, a aVar) {
        a(executor, new B.d(aVar, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z10, Object obj, Object obj2) {
        if (z10) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.f19426a) {
            try {
                if (!this.f19429d) {
                    this.f19428c.add(runnableC);
                } else {
                    runnableC.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object a() {
        g1.a(d());
        return this.f19432g;
    }

    private void a(boolean z10, Object obj, Object obj2) {
        synchronized (this.f19426a) {
            try {
                if (this.f19429d) {
                    return;
                }
                this.f19431f = obj;
                this.f19432g = obj2;
                this.f19430e = z10;
                this.f19429d = true;
                Iterator it = this.f19428c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f19428c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f19430e, this.f19431f, this.f19432g);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        g1.a(th);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f21161C0;
        if (kVar != null) {
            kVar.E().a("Promise", "PromiseCallback: " + b(), th);
        }
    }
}
