package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.n7;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class n {

    /* renamed from: l, reason: collision with root package name */
    private static final a f5598l = new a();

    /* renamed from: a, reason: collision with root package name */
    private final k f5599a;

    /* renamed from: c, reason: collision with root package name */
    private long f5601c;

    /* renamed from: d, reason: collision with root package name */
    private Long f5602d;

    /* renamed from: e, reason: collision with root package name */
    private long f5603e;

    /* renamed from: h, reason: collision with root package name */
    private long f5605h;

    /* renamed from: i, reason: collision with root package name */
    private Object f5606i;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f5600b = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    private final Object f5604f = new Object();
    private final AtomicBoolean g = new AtomicBoolean();
    private final Map j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Object f5607k = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f5608a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f5609b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f5608a;
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
            int i4 = aVar.f5609b;
            aVar.f5609b = i4 + 1;
            return i4;
        }

        public int a() {
            return this.f5609b;
        }
    }

    public n(k kVar) {
        this.f5599a = kVar;
    }

    public Long c() {
        return this.f5602d;
    }

    public boolean d() {
        return this.f5600b.get();
    }

    public boolean e() {
        return this.g.get();
    }

    public void a(boolean z3) {
        synchronized (this.f5604f) {
            try {
                this.g.set(z3);
                if (z3) {
                    this.f5605h = System.currentTimeMillis();
                    this.f5599a.O();
                    if (o.a()) {
                        this.f5599a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f5605h);
                    }
                    ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) k.o().getSystemService("activity"));
                    if (memoryInfoA != null) {
                        this.f5603e = memoryInfoA.availMem;
                    }
                    Long l10 = (Long) this.f5599a.a(x4.J1);
                    if (l10.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new t(5, this, l10), l10.longValue());
                    }
                } else {
                    this.f5605h = 0L;
                    this.f5599a.O();
                    if (o.a()) {
                        this.f5599a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long b() {
        return this.f5601c;
    }

    public void c(String str) {
        synchronized (this.f5607k) {
            try {
                a aVar = (a) this.j.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.j.put(str, aVar);
                }
                aVar.f5608a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Object obj) {
        if (!w3.a(obj) && this.f5600b.compareAndSet(true, false)) {
            this.f5606i = null;
            this.f5599a.O();
            if (o.a()) {
                this.f5599a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f5607k) {
            aVar = (a) this.j.get(str);
            if (aVar == null) {
                aVar = f5598l;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (e() && System.currentTimeMillis() - this.f5605h >= l10.longValue()) {
            this.f5599a.O();
            if (o.a()) {
                this.f5599a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.g.set(false);
        }
    }

    public Object a() {
        return this.f5606i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = com.applovin.impl.w3.a(r8)
            if (r0 == 0) goto L8
            goto L8d
        L8:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f5600b
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L8d
            r7.f5606i = r8
            long r0 = java.lang.System.currentTimeMillis()
            r7.f5601c = r0
            com.applovin.impl.sdk.k r0 = r7.f5599a
            r0.O()
            boolean r0 = com.applovin.impl.sdk.o.a()
            if (r0 == 0) goto L40
            com.applovin.impl.sdk.k r0 = r7.f5599a
            com.applovin.impl.sdk.o r0 = r0.O()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Setting fullscreen ad displayed: "
            r1.<init>(r2)
            long r2 = r7.f5601c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FullScreenAdTracker"
            r0.a(r2, r1)
        L40:
            android.content.Context r0 = com.applovin.impl.sdk.k.o()
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.app.ActivityManager$MemoryInfo r0 = com.applovin.impl.n7.a(r0)
            r1 = 0
            if (r0 == 0) goto L66
            long r3 = r7.f5603e
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L66
            long r5 = r0.availMem
            long r3 = r3 - r5
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r7.f5602d = r0
            r7.f5603e = r1
            goto L69
        L66:
            r0 = 0
            r7.f5602d = r0
        L69:
            java.lang.String r0 = "com.applovin.fullscreen_ad_displayed"
            com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastWithAdObject(r0, r8)
            com.applovin.impl.sdk.k r0 = r7.f5599a
            com.applovin.impl.x4 r3 = com.applovin.impl.x4.K1
            java.lang.Object r0 = r0.a(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L8d
            com.applovin.impl.sdk.r r1 = new com.applovin.impl.sdk.r
            r2 = 3
            r1.<init>(r7, r0, r8, r2)
            long r2 = r0.longValue()
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r1, r2)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.a(java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f5600b.get() && System.currentTimeMillis() - this.f5601c >= l10.longValue()) {
            this.f5599a.O();
            if (o.a()) {
                this.f5599a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f5607k) {
            this.j.remove(str);
        }
    }
}
