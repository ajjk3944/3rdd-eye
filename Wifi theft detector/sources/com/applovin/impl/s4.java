package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: i, reason: collision with root package name */
    public static final Executor f7546i = new Executor() { // from class: com.applovin.impl.ge
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final Executor f7547j = new o1.m();

    /* renamed from: b, reason: collision with root package name */
    private final String f7549b;

    /* renamed from: g, reason: collision with root package name */
    private volatile Object f7554g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Object f7555h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f7548a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f7550c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f7551d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f7552e = false;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f7553f = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z10, Object obj, Object obj2);
    }

    public s4(String str) {
        this.f7549b = str;
    }

    public static s4 a(String str, Object obj) {
        return new s4(str).b(obj);
    }

    public String toString() {
        String str;
        if (!this.f7551d) {
            str = "Waiting";
        } else if (this.f7552e) {
            str = "Success -> " + this.f7554g;
        } else {
            str = "Failed -> " + this.f7555h;
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
        return this.f7551d;
    }

    public boolean e() {
        return this.f7551d && !this.f7552e;
    }

    public void a(Executor executor, final Runnable runnable) {
        a(executor, new b() { // from class: com.applovin.impl.fe
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                s4.a(runnable, z10, obj, obj2);
            }
        });
    }

    public Object b() {
        l1.a(e());
        return this.f7555h;
    }

    public String c() {
        String str = this.f7549b;
        return str != null ? str : super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z10, Object obj, Object obj2) {
        if (z10) {
            runnable.run();
        }
    }

    private Runnable c(final Executor executor, final b bVar) {
        return new Runnable() { // from class: com.applovin.impl.ee
            @Override // java.lang.Runnable
            public final void run() {
                this.f5966a.b(executor, bVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, final b bVar) {
        try {
            executor.execute(new Runnable() { // from class: com.applovin.impl.de
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5843a.a(bVar);
                }
            });
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, final a aVar) {
        a(executor, new b() { // from class: com.applovin.impl.ce
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                s4.a(aVar, z10, obj, obj2);
            }
        });
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
        synchronized (this.f7548a) {
            try {
                if (!this.f7551d) {
                    this.f7550c.add(runnableC);
                } else {
                    runnableC.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a() {
        return this.f7551d && this.f7553f;
    }

    private void a(boolean z10, Object obj, Object obj2, boolean z11) {
        synchronized (this.f7548a) {
            try {
                if (this.f7551d) {
                    return;
                }
                this.f7554g = obj;
                this.f7555h = obj2;
                this.f7552e = z10;
                this.f7553f = z11;
                this.f7551d = true;
                Iterator it = this.f7550c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f7550c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f7552e, this.f7554g, this.f7555h);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        l1.a(th);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            kVar.D().a("Promise", "PromiseCallback: " + c(), th);
        }
    }
}
