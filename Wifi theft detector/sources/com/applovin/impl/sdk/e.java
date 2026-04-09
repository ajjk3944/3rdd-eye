package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final k f7743a;

    /* renamed from: b, reason: collision with root package name */
    private final o f7744b;

    /* renamed from: d, reason: collision with root package name */
    private final Map f7746d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f7747e = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f7745c = new Object();

    public e(k kVar) {
        this.f7743a = kVar;
        this.f7744b = kVar.O();
        for (com.applovin.impl.u uVar : com.applovin.impl.u.a()) {
            this.f7746d.put(uVar, new q());
            this.f7747e.put(uVar, new q());
        }
    }

    private q c(com.applovin.impl.u uVar) {
        synchronized (this.f7745c) {
            try {
                q qVarB = b(uVar);
                if (qVarB.b() > 0) {
                    return qVarB;
                }
                return d(uVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private q d(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f7745c) {
            try {
                qVar = (q) this.f7746d.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.f7746d.put(uVar, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f7745c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (o.a()) {
                    this.f7744b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f7745c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(com.applovin.impl.u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f7745c) {
            try {
                q qVarD = d(uVar);
                if (qVarD.b() > 0) {
                    b(uVar).a(qVarD.a());
                    cVar = new com.applovin.impl.sdk.ad.c(uVar, this.f7743a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            if (o.a()) {
                this.f7744b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + "...");
                return cVar;
            }
        } else if (o.a()) {
            this.f7744b.a("AdPreloadManager", "Unable to retrieve ad of zone " + uVar + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f7745c) {
            appLovinAdImplD = c(uVar).d();
        }
        return appLovinAdImplD;
    }

    private q b(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f7745c) {
            try {
                qVar = (q) this.f7747e.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.f7747e.put(uVar, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f7745c) {
            appLovinAdImplA = c(uVar).a();
        }
        return appLovinAdImplA;
    }
}
