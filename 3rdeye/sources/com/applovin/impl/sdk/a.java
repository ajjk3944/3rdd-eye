package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.o1;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: e, reason: collision with root package name */
    private static final long f21031e = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final k f21032a;

    /* renamed from: b, reason: collision with root package name */
    private final o f21033b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f21034c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f21035d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0316a {
        void onAdExpired(o1 o1Var);
    }

    public a(k kVar) {
        this.f21032a = kVar;
        this.f21033b = kVar.O();
    }

    private b b(o1 o1Var) {
        synchronized (this.f21035d) {
            try {
                if (o1Var == null) {
                    return null;
                }
                Iterator it = this.f21034c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (o1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(o1 o1Var, InterfaceC0316a interfaceC0316a) {
        synchronized (this.f21035d) {
            try {
                if (b(o1Var) != null) {
                    if (o.a()) {
                        this.f21033b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + o1Var);
                    }
                    return true;
                }
                if (o1Var.getTimeToLiveMillis() <= f21031e) {
                    if (o.a()) {
                        this.f21033b.a("AdExpirationManager", "Ad has already expired: " + o1Var);
                    }
                    o1Var.setExpired();
                    return false;
                }
                if (o.a()) {
                    this.f21033b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(o1Var.getTimeToLiveMillis()) + " seconds from now for " + o1Var + "...");
                }
                if (this.f21034c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f21034c.add(b.a(o1Var, interfaceC0316a, this.f21032a));
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
        synchronized (this.f21035d) {
            try {
                Iterator it = this.f21034c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    o1 o1VarB = bVar.b();
                    if (o1VarB == null) {
                        hashSet.add(bVar);
                    } else {
                        long timeToLiveMillis = o1VarB.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (o.a()) {
                                this.f21033b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + o1VarB);
                            }
                            hashSet.add(bVar);
                        } else {
                            if (o.a()) {
                                this.f21033b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + o1VarB);
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

    public void a(o1 o1Var) {
        synchronized (this.f21035d) {
            try {
                b bVarB = b(o1Var);
                if (bVarB != null) {
                    if (o.a()) {
                        this.f21033b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + o1Var);
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
        synchronized (this.f21035d) {
            try {
                this.f21034c.remove(bVar);
                if (this.f21034c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        synchronized (this.f21035d) {
            try {
                Iterator it = this.f21034c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
