package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.l1;
import com.applovin.impl.r6;
import com.applovin.impl.r9;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f5462a;

    /* renamed from: b, reason: collision with root package name */
    private final c f5463b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5464c = DesugarCollections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public d(k kVar) {
        this.f5462a = kVar;
        this.f5463b = new c(kVar);
    }

    private void e() {
        String str = (String) this.f5462a.p0().a(z4.E);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            try {
                c.a aVarA = c.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f5462a);
                if (aVarA != null) {
                    if (a(aVarA)) {
                        long jC = aVarA.c() - SystemClock.elapsedRealtime();
                        this.f5462a.g().d(d2.Z, CollectionUtils.map("details", "ttl = " + jC + "ms"));
                    } else {
                        this.f5464c.add(0, aVarA);
                    }
                }
            } catch (Throwable th2) {
                this.f5462a.O();
                if (o.a()) {
                    this.f5462a.O().a("AdPersistenceManager", "Failed to deserialize persisted ad file path", th2);
                }
                this.f5462a.D().a("AdPersistenceManager", "deserializePersistedAdFilePath", th2);
            }
        }
    }

    private void f() {
        this.f5462a.q0().a((i5) new r6(this.f5462a, "loadPersistedAdFilesQueueAndCleanupAsync", new v(this, 0)), d6.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f5464c) {
            try {
                Iterator it = this.f5464c.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((c.a) it.next()).a());
                    } catch (Throwable th2) {
                        this.f5462a.O();
                        if (o.a()) {
                            this.f5462a.O().a("AdPersistenceManager", "Failed to serialize persisted ad file path", th2);
                        }
                        this.f5462a.D().a("AdPersistenceManager", "serializePersistedAdFilePath", th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f5462a.p0().b(z4.E, new JSONArray((Collection) arrayList).toString());
    }

    public void g() {
        this.f5462a.q0().a((i5) new r6(this.f5462a, "resetManagerState", new v(this, 1)), d6.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(c.a aVar) {
        if (aVar == null) {
            this.f5462a.O();
            if (o.a()) {
                this.f5462a.O().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f5464c.add(aVar);
        if (((Boolean) this.f5462a.a(x4.Y0)).booleanValue()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f5462a.p0().b(z4.E);
        this.f5463b.a();
    }

    public void a(com.applovin.impl.u uVar, a aVar) {
        if (aVar == null) {
            this.f5462a.O();
            if (o.a()) {
                this.f5462a.O().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            l1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (uVar == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f5462a.g().a(d2.W, uVar, (AppLovinError) null);
        c.a aVarA = a(uVar.g());
        this.f5463b.a(aVarA, new r9(this, aVar, aVarA, uVar));
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    private void d(c.a aVar) {
        if (aVar != null && this.f5464c.remove(aVar)) {
            this.f5463b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f5462a.g().a(d2.T, bVar);
        this.f5463b.b(bVar, new ca.b(2, this));
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
        synchronized (this.f5464c) {
            try {
                Iterator it = this.f5464c.iterator();
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
                this.f5464c.remove(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    private void a(a aVar, c.a aVar2, com.applovin.impl.u uVar, String str) {
        if (aVar == null) {
            return;
        }
        this.f5462a.O();
        if (o.a()) {
            this.f5462a.O().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.f5463b.b(aVar2);
        this.f5462a.g().a(d2.Y, uVar, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f5462a.O();
        if (o.a()) {
            this.f5462a.O().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.f5463b.b(aVar2);
        this.f5462a.g().a(d2.X, bVar);
    }

    private boolean a(c.a aVar) {
        return ((Long) this.f5462a.a(x4.f5987a1)).longValue() + SystemClock.elapsedRealtime() >= aVar.c();
    }

    private void a() {
        synchronized (this.f5464c) {
            this.f5463b.a(new ArrayList(this.f5464c));
        }
    }
}
