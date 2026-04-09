package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final k f5465a;

    /* renamed from: b, reason: collision with root package name */
    private final o f5466b;

    /* renamed from: d, reason: collision with root package name */
    private final Map f5468d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f5469e = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f5467c = new Object();

    public e(k kVar) {
        this.f5465a = kVar;
        this.f5466b = kVar.O();
        for (com.applovin.impl.u uVar : com.applovin.impl.u.a()) {
            this.f5468d.put(uVar, new q());
            this.f5469e.put(uVar, new q());
        }
    }

    private q c(com.applovin.impl.u uVar) {
        synchronized (this.f5467c) {
            try {
                q qVarB = b(uVar);
                if (qVarB.b() > 0) {
                    return qVarB;
                }
                return d(uVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private q d(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f5467c) {
            try {
                qVar = (q) this.f5468d.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.f5468d.put(uVar, qVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f5467c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (o.a()) {
                    this.f5466b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f5467c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(com.applovin.impl.u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f5467c) {
            try {
                q qVarD = d(uVar);
                if (qVarD.b() > 0) {
                    b(uVar).a(qVarD.a());
                    cVar = new com.applovin.impl.sdk.ad.c(uVar, this.f5465a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            if (o.a()) {
                this.f5466b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + "...");
                return cVar;
            }
        } else if (o.a()) {
            this.f5466b.a("AdPreloadManager", "Unable to retrieve ad of zone " + uVar + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f5467c) {
            appLovinAdImplD = c(uVar).d();
        }
        return appLovinAdImplD;
    }

    private q b(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f5467c) {
            try {
                qVar = (q) this.f5469e.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.f5469e.put(uVar, qVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f5467c) {
            appLovinAdImplA = c(uVar).a();
        }
        return appLovinAdImplA;
    }
}
