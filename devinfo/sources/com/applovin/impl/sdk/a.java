package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.t1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: e, reason: collision with root package name */
    private static final long f5395e = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final k f5396a;

    /* renamed from: b, reason: collision with root package name */
    private final o f5397b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f5398c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f5399d = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0018a {
        void onAdExpired(t1 t1Var);
    }

    public a(k kVar) {
        this.f5396a = kVar;
        this.f5397b = kVar.O();
    }

    private b b(t1 t1Var) {
        synchronized (this.f5399d) {
            try {
                if (t1Var == null) {
                    return null;
                }
                Iterator it = this.f5398c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (t1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(t1 t1Var, InterfaceC0018a interfaceC0018a) {
        synchronized (this.f5399d) {
            try {
                if (b(t1Var) != null) {
                    if (o.a()) {
                        this.f5397b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + t1Var);
                    }
                    return true;
                }
                if (t1Var.getTimeToLiveMillis() <= f5395e) {
                    if (o.a()) {
                        this.f5397b.a("AdExpirationManager", "Ad has already expired: " + t1Var);
                    }
                    t1Var.setExpired();
                    return false;
                }
                if (o.a()) {
                    this.f5397b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(t1Var.getTimeToLiveMillis()) + " seconds from now for " + t1Var + "...");
                }
                if (this.f5398c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f5398c.add(b.a(t1Var, interfaceC0018a, this.f5396a));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.f5399d) {
            try {
                Iterator it = this.f5398c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    t1 t1VarB = bVar.b();
                    if (t1VarB == null) {
                        hashSet.add(bVar);
                    } else {
                        long timeToLiveMillis = t1VarB.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (o.a()) {
                                this.f5397b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + t1VarB);
                            }
                            hashSet.add(bVar);
                        } else {
                            if (o.a()) {
                                this.f5397b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + t1VarB);
                            }
                            bVar.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(t1 t1Var) {
        synchronized (this.f5399d) {
            try {
                b bVarB = b(t1Var);
                if (bVarB != null) {
                    if (o.a()) {
                        this.f5397b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + t1Var);
                    }
                    bVarB.a();
                    a(bVarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.f5399d) {
            try {
                this.f5398c.remove(bVar);
                if (this.f5398c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        synchronized (this.f5399d) {
            try {
                Iterator it = this.f5398c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
