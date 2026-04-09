package com.applovin.impl.sdk;

import com.applovin.impl.C2145t;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final k f21104a;

    /* renamed from: b, reason: collision with root package name */
    private final o f21105b;

    /* renamed from: d, reason: collision with root package name */
    private final Map f21107d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f21108e = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f21106c = new Object();

    public e(k kVar) {
        this.f21104a = kVar;
        this.f21105b = kVar.O();
        for (C2145t c2145t : C2145t.a()) {
            this.f21107d.put(c2145t, new q());
            this.f21108e.put(c2145t, new q());
        }
    }

    private q c(C2145t c2145t) {
        synchronized (this.f21106c) {
            try {
                q qVarB = b(c2145t);
                if (qVarB.b() > 0) {
                    return qVarB;
                }
                return d(c2145t);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private q d(C2145t c2145t) {
        q qVar;
        synchronized (this.f21106c) {
            try {
                qVar = (q) this.f21107d.get(c2145t);
                if (qVar == null) {
                    qVar = new q();
                    this.f21107d.put(c2145t, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f21106c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (o.a()) {
                    this.f21105b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f21106c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(C2145t c2145t) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f21106c) {
            try {
                q qVarD = d(c2145t);
                if (qVarD.b() > 0) {
                    b(c2145t).a(qVarD.a());
                    cVar = new com.applovin.impl.sdk.ad.c(c2145t, this.f21104a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            if (o.a()) {
                this.f21105b.a("AdPreloadManager", "Retrieved ad of zone " + c2145t + "...");
                return cVar;
            }
        } else if (o.a()) {
            this.f21105b.a("AdPreloadManager", "Unable to retrieve ad of zone " + c2145t + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(C2145t c2145t) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f21106c) {
            appLovinAdImplD = c(c2145t).d();
        }
        return appLovinAdImplD;
    }

    private q b(C2145t c2145t) {
        q qVar;
        synchronized (this.f21106c) {
            try {
                qVar = (q) this.f21108e.get(c2145t);
                if (qVar == null) {
                    qVar = new q();
                    this.f21108e.put(c2145t, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public AppLovinAdImpl a(C2145t c2145t) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f21106c) {
            appLovinAdImplA = c(c2145t).a();
        }
        return appLovinAdImplA;
    }
}
