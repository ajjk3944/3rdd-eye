package com.applovin.impl.sdk;

import C.V;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.C2145t;
import com.applovin.impl.f6;
import com.applovin.impl.g1;
import com.applovin.impl.l4;
import com.applovin.impl.n4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w4;
import com.applovin.impl.y1;
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
    private final k f21101a;

    /* renamed from: b, reason: collision with root package name */
    private final c f21102b;

    /* renamed from: c, reason: collision with root package name */
    private final List f21103c = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public d(k kVar) {
        this.f21101a = kVar;
        this.f21102b = new c(kVar);
    }

    private void e() {
        String str = (String) this.f21101a.p0().a(n4.f20558C);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            c.a aVarA = c.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f21101a);
            if (aVarA != null) {
                if (a(aVarA)) {
                    long jC = aVarA.c() - SystemClock.elapsedRealtime();
                    this.f21101a.g().d(y1.f21768K, CollectionUtils.map("details", "ttl = " + jC + "ms"));
                } else {
                    this.f21103c.add(0, aVarA);
                }
            }
        }
    }

    private void f() {
        this.f21101a.q0().a((w4) new f6(this.f21101a, "loadPersistedAdFilesQueueAndCleanupAsync", new V(this, 16)), r5.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f21103c) {
            try {
                Iterator it = this.f21103c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c.a) it.next()).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21101a.p0().b(n4.f20558C, new JSONArray((Collection) arrayList).toString());
    }

    public void g() {
        this.f21101a.q0().a((w4) new f6(this.f21101a, "resetManagerState", new C2.h(this, 20)), r5.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(c.a aVar) {
        if (aVar == null) {
            this.f21101a.O();
            if (o.a()) {
                this.f21101a.O().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f21103c.add(aVar);
        if (((Boolean) this.f21101a.a(l4.f19840U0)).booleanValue()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f21101a.p0().b(n4.f20558C);
        this.f21102b.a();
    }

    public void a(C2145t c2145t, a aVar) {
        if (aVar == null) {
            this.f21101a.O();
            if (o.a()) {
                this.f21101a.O().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            g1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (c2145t == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f21101a.g().a(y1.f21765H, c2145t, (AppLovinError) null);
        c.a aVarA = a(c2145t.g());
        this.f21102b.a(aVarA, new V6.j(this, aVar, aVarA, c2145t));
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    private void d(c.a aVar) {
        if (aVar != null && this.f21103c.remove(aVar)) {
            this.f21102b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f21101a.g().a(y1.f21761E, bVar);
        this.f21102b.b(bVar, new D7.c(this, 12));
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
    public /* synthetic */ void a(a aVar, c.a aVar2, C2145t c2145t, com.applovin.impl.sdk.ad.b bVar, String str) {
        if (bVar != null && !StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, c2145t, str);
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
        synchronized (this.f21103c) {
            try {
                Iterator it = this.f21103c.iterator();
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
                this.f21103c.remove(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private void a(a aVar, c.a aVar2, C2145t c2145t, String str) {
        if (aVar == null) {
            return;
        }
        this.f21101a.O();
        if (o.a()) {
            this.f21101a.O().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.f21102b.b(aVar2);
        this.f21101a.g().a(y1.f21767J, c2145t, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f21101a.O();
        if (o.a()) {
            this.f21101a.O().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.f21102b.b(aVar2);
        this.f21101a.g().a(y1.f21766I, bVar);
    }

    private boolean a(c.a aVar) {
        return ((Long) this.f21101a.a(l4.f19854W0)).longValue() + SystemClock.elapsedRealtime() >= aVar.c();
    }

    private void a() {
        synchronized (this.f21103c) {
            this.f21102b.a(new ArrayList(this.f21103c));
        }
    }
}
