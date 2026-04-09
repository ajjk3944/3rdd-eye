package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: e, reason: collision with root package name */
    private static final long f7652e = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final k f7653a;

    /* renamed from: b, reason: collision with root package name */
    private final o f7654b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f7655c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f7656d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0082a {
        void onAdExpired(com.applovin.impl.t1 t1Var);
    }

    public a(k kVar) {
        this.f7653a = kVar;
        this.f7654b = kVar.O();
    }

    private b b(com.applovin.impl.t1 t1Var) {
        synchronized (this.f7656d) {
            try {
                if (t1Var == null) {
                    return null;
                }
                Iterator it = this.f7655c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (t1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(com.applovin.impl.t1 t1Var, InterfaceC0082a interfaceC0082a) {
        synchronized (this.f7656d) {
            try {
                if (b(t1Var) != null) {
                    if (o.a()) {
                        this.f7654b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + t1Var);
                    }
                    return true;
                }
                if (t1Var.getTimeToLiveMillis() <= f7652e) {
                    if (o.a()) {
                        this.f7654b.a("AdExpirationManager", "Ad has already expired: " + t1Var);
                    }
                    t1Var.setExpired();
                    return false;
                }
                if (o.a()) {
                    this.f7654b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(t1Var.getTimeToLiveMillis()) + " seconds from now for " + t1Var + "...");
                }
                if (this.f7655c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f7655c.add(b.a(t1Var, interfaceC0082a, this.f7653a));
                return true;
            } catch (Throwable th) {
                throw th;
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
        synchronized (this.f7656d) {
            try {
                Iterator it = this.f7655c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    com.applovin.impl.t1 t1VarB = bVar.b();
                    if (t1VarB == null) {
                        hashSet.add(bVar);
                    } else {
                        long timeToLiveMillis = t1VarB.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (o.a()) {
                                this.f7654b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + t1VarB);
                            }
                            hashSet.add(bVar);
                        } else {
                            if (o.a()) {
                                this.f7654b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + t1VarB);
                            }
                            bVar.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(com.applovin.impl.t1 t1Var) {
        synchronized (this.f7656d) {
            try {
                b bVarB = b(t1Var);
                if (bVarB != null) {
                    if (o.a()) {
                        this.f7654b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + t1Var);
                    }
                    bVarB.a();
                    a(bVarB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.f7656d) {
            try {
                this.f7655c.remove(bVar);
                if (this.f7655c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        synchronized (this.f7656d) {
            try {
                Iterator it = this.f7655c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
