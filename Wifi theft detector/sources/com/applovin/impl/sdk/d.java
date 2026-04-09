package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f7739a;

    /* renamed from: b, reason: collision with root package name */
    private final c f7740b;

    /* renamed from: c, reason: collision with root package name */
    private final List f7741c = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public d(k kVar) {
        this.f7739a = kVar;
        this.f7740b = new c(kVar);
    }

    private void e() {
        String str = (String) this.f7739a.p0().a(z4.E);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            try {
                c.a aVarA = c.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f7739a);
                if (aVarA != null) {
                    if (a(aVarA)) {
                        long jC = aVarA.c() - SystemClock.elapsedRealtime();
                        this.f7739a.g().d(com.applovin.impl.d2.Z, CollectionUtils.map("details", "ttl = " + jC + "ms"));
                    } else {
                        this.f7741c.add(0, aVarA);
                    }
                }
            } catch (Throwable th) {
                this.f7739a.O();
                if (o.a()) {
                    this.f7739a.O().a("AdPersistenceManager", "Failed to deserialize persisted ad file path", th);
                }
                this.f7739a.D().a("AdPersistenceManager", "deserializePersistedAdFilePath", th);
            }
        }
    }

    private void f() {
        this.f7739a.q0().a((i5) new r6(this.f7739a, "loadPersistedAdFilesQueueAndCleanupAsync", new Runnable() { // from class: com.applovin.impl.sdk.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7742a.c();
            }
        }), d6.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f7741c) {
            try {
                Iterator it = this.f7741c.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((c.a) it.next()).a());
                    } catch (Throwable th) {
                        this.f7739a.O();
                        if (o.a()) {
                            this.f7739a.O().a("AdPersistenceManager", "Failed to serialize persisted ad file path", th);
                        }
                        this.f7739a.D().a("AdPersistenceManager", "serializePersistedAdFilePath", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f7739a.p0().b(z4.E, new JSONArray((Collection) arrayList).toString());
    }

    public void g() {
        this.f7739a.q0().a((i5) new r6(this.f7739a, "resetManagerState", new Runnable() { // from class: com.applovin.impl.sdk.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7748a.d();
            }
        }), d6.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(c.a aVar) {
        if (aVar == null) {
            this.f7739a.O();
            if (o.a()) {
                this.f7739a.O().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f7741c.add(aVar);
        if (((Boolean) this.f7739a.a(x4.Y0)).booleanValue()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f7739a.p0().b(z4.E);
        this.f7740b.a();
    }

    public void a(final com.applovin.impl.u uVar, final a aVar) {
        if (aVar == null) {
            this.f7739a.O();
            if (o.a()) {
                this.f7739a.O().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            com.applovin.impl.l1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (uVar == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f7739a.g().a(com.applovin.impl.d2.W, uVar, (AppLovinError) null);
        final c.a aVarA = a(uVar.g());
        this.f7740b.a(aVarA, new c.InterfaceC0084c() { // from class: com.applovin.impl.sdk.c0
            @Override // com.applovin.impl.sdk.c.InterfaceC0084c
            public final void a(com.applovin.impl.sdk.ad.b bVar, String str) {
                this.f7735a.a(aVar, aVarA, uVar, bVar, str);
            }
        });
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    private void d(c.a aVar) {
        if (aVar != null && this.f7741c.remove(aVar)) {
            this.f7740b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f7739a.g().a(com.applovin.impl.d2.T, bVar);
        this.f7740b.b(bVar, new c.b() { // from class: com.applovin.impl.sdk.f0
            @Override // com.applovin.impl.sdk.c.b
            public final void a(c.a aVar) {
                this.f7756a.c(aVar);
            }
        });
    }

    private boolean b(c.a aVar) {
        long jB = aVar.b();
        return (jB == 0 || jB == k.n()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, c.a aVar2, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar, String str) {
        if (bVar != null && !StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, uVar, str);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        d(c.a.a(bVar));
    }

    private c.a a(AppLovinAdType appLovinAdType) {
        c.a aVar;
        synchronized (this.f7741c) {
            try {
                Iterator it = this.f7741c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (c.a) it.next();
                    if (aVar.f().equals(appLovinAdType) && !a(aVar) && b(aVar)) {
                        break;
                    }
                }
                this.f7741c.remove(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private void a(a aVar, c.a aVar2, com.applovin.impl.u uVar, String str) {
        if (aVar == null) {
            return;
        }
        this.f7739a.O();
        if (o.a()) {
            this.f7739a.O().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.f7740b.b(aVar2);
        this.f7739a.g().a(com.applovin.impl.d2.Y, uVar, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f7739a.O();
        if (o.a()) {
            this.f7739a.O().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.f7740b.b(aVar2);
        this.f7739a.g().a(com.applovin.impl.d2.X, bVar);
    }

    private boolean a(c.a aVar) {
        return SystemClock.elapsedRealtime() + ((Long) this.f7739a.a(x4.f8417a1)).longValue() >= aVar.c();
    }

    private void a() {
        synchronized (this.f7741c) {
            this.f7740b.a(new ArrayList(this.f7741c));
        }
    }
}
