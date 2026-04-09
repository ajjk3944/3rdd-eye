package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.n7;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class n {

    /* renamed from: l, reason: collision with root package name */
    private static final a f7906l = new a();

    /* renamed from: a, reason: collision with root package name */
    private final k f7907a;

    /* renamed from: c, reason: collision with root package name */
    private long f7909c;

    /* renamed from: d, reason: collision with root package name */
    private Long f7910d;

    /* renamed from: e, reason: collision with root package name */
    private long f7911e;

    /* renamed from: h, reason: collision with root package name */
    private long f7914h;

    /* renamed from: i, reason: collision with root package name */
    private Object f7915i;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f7908b = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    private final Object f7912f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f7913g = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    private final Map f7916j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Object f7917k = new Object();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f7918a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f7919b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f7918a;
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
            return ((((int) (jB ^ (jB >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f7919b;
            aVar.f7919b = i10 + 1;
            return i10;
        }

        public int a() {
            return this.f7919b;
        }
    }

    public n(k kVar) {
        this.f7907a = kVar;
    }

    public Long c() {
        return this.f7910d;
    }

    public boolean d() {
        return this.f7908b.get();
    }

    public boolean e() {
        return this.f7913g.get();
    }

    public void a(boolean z10) {
        synchronized (this.f7912f) {
            try {
                this.f7913g.set(z10);
                if (z10) {
                    this.f7914h = System.currentTimeMillis();
                    this.f7907a.O();
                    if (o.a()) {
                        this.f7907a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f7914h);
                    }
                    ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) k.o().getSystemService("activity"));
                    if (memoryInfoA != null) {
                        this.f7911e = memoryInfoA.availMem;
                    }
                    final Long l10 = (Long) this.f7907a.a(x4.J1);
                    if (l10.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.p2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f8072a.a(l10);
                            }
                        }, l10.longValue());
                    }
                } else {
                    this.f7914h = 0L;
                    this.f7907a.O();
                    if (o.a()) {
                        this.f7907a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        return this.f7909c;
    }

    public void c(String str) {
        synchronized (this.f7917k) {
            try {
                a aVar = (a) this.f7916j.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f7916j.put(str, aVar);
                }
                aVar.f7918a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        if (!w3.a(obj) && this.f7908b.compareAndSet(true, false)) {
            this.f7915i = null;
            this.f7907a.O();
            if (o.a()) {
                this.f7907a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f7917k) {
            aVar = (a) this.f7916j.get(str);
            if (aVar == null) {
                aVar = f7906l;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (e() && System.currentTimeMillis() - this.f7914h >= l10.longValue()) {
            this.f7907a.O();
            if (o.a()) {
                this.f7907a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f7913g.set(false);
        }
    }

    public Object a() {
        return this.f7915i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(final java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = com.applovin.impl.w3.a(r8)
            if (r0 == 0) goto L8
            goto L8f
        L8:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f7908b
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L8f
            r7.f7915i = r8
            long r0 = java.lang.System.currentTimeMillis()
            r7.f7909c = r0
            com.applovin.impl.sdk.k r0 = r7.f7907a
            r0.O()
            boolean r0 = com.applovin.impl.sdk.o.a()
            if (r0 == 0) goto L43
            com.applovin.impl.sdk.k r0 = r7.f7907a
            com.applovin.impl.sdk.o r0 = r0.O()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting fullscreen ad displayed: "
            r1.append(r2)
            long r2 = r7.f7909c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FullScreenAdTracker"
            r0.a(r2, r1)
        L43:
            android.content.Context r0 = com.applovin.impl.sdk.k.o()
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.app.ActivityManager$MemoryInfo r0 = com.applovin.impl.n7.a(r0)
            r1 = 0
            if (r0 == 0) goto L69
            long r3 = r7.f7911e
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L69
            long r5 = r0.availMem
            long r3 = r3 - r5
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r7.f7910d = r0
            r7.f7911e = r1
            goto L6c
        L69:
            r0 = 0
            r7.f7910d = r0
        L6c:
            java.lang.String r0 = "com.applovin.fullscreen_ad_displayed"
            com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastWithAdObject(r0, r8)
            com.applovin.impl.sdk.k r0 = r7.f7907a
            com.applovin.impl.x4 r3 = com.applovin.impl.x4.K1
            java.lang.Object r0 = r0.a(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L8f
            com.applovin.impl.sdk.q2 r1 = new com.applovin.impl.sdk.q2
            r1.<init>()
            long r2 = r0.longValue()
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r1, r2)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.a(java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f7908b.get() && System.currentTimeMillis() - this.f7909c >= l10.longValue()) {
            this.f7907a.O();
            if (o.a()) {
                this.f7907a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f7917k) {
            this.f7916j.remove(str);
        }
    }
}
