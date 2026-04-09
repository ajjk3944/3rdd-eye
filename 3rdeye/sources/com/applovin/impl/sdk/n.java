package com.applovin.impl.sdk;

import C.E;
import com.applovin.impl.l3;
import com.applovin.impl.l4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class n {

    /* renamed from: j, reason: collision with root package name */
    private static final a f21275j = new a();

    /* renamed from: a, reason: collision with root package name */
    private final k f21276a;

    /* renamed from: c, reason: collision with root package name */
    private long f21278c;

    /* renamed from: f, reason: collision with root package name */
    private long f21281f;

    /* renamed from: g, reason: collision with root package name */
    private Object f21282g;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f21277b = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Object f21279d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f21280e = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private final Map f21283h = new HashMap();
    private final Object i = new Object();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f21284a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f21285b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f21284a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long jB = b();
            return a() + ((((int) (jB ^ (jB >>> 32))) + 59) * 59);
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public static /* synthetic */ int a(a aVar) {
            int i = aVar.f21285b;
            aVar.f21285b = i + 1;
            return i;
        }

        public int a() {
            return this.f21285b;
        }
    }

    public n(k kVar) {
        this.f21276a = kVar;
    }

    public boolean c() {
        return this.f21277b.get();
    }

    public boolean d() {
        return this.f21280e.get();
    }

    public void a(boolean z10) {
        synchronized (this.f21279d) {
            try {
                this.f21280e.set(z10);
                if (z10) {
                    this.f21281f = System.currentTimeMillis();
                    this.f21276a.O();
                    if (o.a()) {
                        this.f21276a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f21281f);
                    }
                    Long l5 = (Long) this.f21276a.a(l4.f19750H1);
                    if (l5.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new E(11, this, l5), l5.longValue());
                    }
                } else {
                    this.f21281f = 0L;
                    this.f21276a.O();
                    if (o.a()) {
                        this.f21276a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        return this.f21278c;
    }

    public void c(String str) {
        synchronized (this.i) {
            try {
                a aVar = (a) this.f21283h.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f21283h.put(str, aVar);
                }
                aVar.f21284a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        if (!l3.a(obj) && this.f21277b.compareAndSet(true, false)) {
            this.f21282g = null;
            this.f21276a.O();
            if (o.a()) {
                this.f21276a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.i) {
            aVar = (a) this.f21283h.get(str);
            if (aVar == null) {
                aVar = f21275j;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l5) {
        if (d() && System.currentTimeMillis() - this.f21281f >= l5.longValue()) {
            this.f21276a.O();
            if (o.a()) {
                this.f21276a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f21280e.set(false);
        }
    }

    public Object a() {
        return this.f21282g;
    }

    public void a(Object obj) {
        if (!l3.a(obj) && this.f21277b.compareAndSet(false, true)) {
            this.f21282g = obj;
            this.f21278c = System.currentTimeMillis();
            this.f21276a.O();
            if (o.a()) {
                this.f21276a.O().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f21278c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            Long l5 = (Long) this.f21276a.a(l4.f19758I1);
            if (l5.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new J4.h(this, l5, obj, 12), l5.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l5, Object obj) {
        if (this.f21277b.get() && System.currentTimeMillis() - this.f21278c >= l5.longValue()) {
            this.f21276a.O();
            if (o.a()) {
                this.f21276a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.i) {
            this.f21283h.remove(str);
        }
    }
}
