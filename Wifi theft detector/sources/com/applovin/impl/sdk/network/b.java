package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f8008a;

    /* renamed from: b, reason: collision with root package name */
    private final o f8009b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8010c;

    /* renamed from: d, reason: collision with root package name */
    private final c f8011d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f8012e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final List f8013f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f8014g;

    /* renamed from: h, reason: collision with root package name */
    private final List f8015h;

    public class a implements AppLovinPostbackListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f8016a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f8017b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f8016a = dVar;
            this.f8017b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            o unused = b.this.f8009b;
            if (o.a()) {
                b.this.f8009b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f8016a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.f8016a);
            t2.a(this.f8017b, str, i10);
            if (this.f8016a.c() == 1) {
                b.this.f8008a.D().a("dispatchPostback", str, i10, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f8016a);
            o unused = b.this.f8009b;
            if (o.a()) {
                b.this.f8009b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f8016a);
            }
            b.this.c();
            t2.a(this.f8017b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f8013f = arrayList;
        this.f8014g = new HashSet();
        this.f8015h = new ArrayList();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8008a = kVar;
        this.f8009b = kVar.O();
        int iIntValue = ((Integer) kVar.a(x4.J2)).intValue();
        this.f8010c = iIntValue;
        if (!((Boolean) kVar.a(x4.M2)).booleanValue()) {
            this.f8011d = null;
            return;
        }
        c cVar = new c(this, kVar);
        this.f8011d = cVar;
        arrayList.addAll(cVar.a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f8008a.q0().a((i5) this.f8011d, d6.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f8012e) {
            while (this.f8013f.size() > this.f8010c) {
                try {
                    this.f8013f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f8013f.add(dVar);
        }
        if (o.a()) {
            this.f8009b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f8012e) {
            try {
                if (((Boolean) this.f8008a.a(x4.L2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f8015h.size());
                    arrayList.addAll(this.f8015h);
                } else {
                    arrayList.ensureCapacity(this.f8013f.size());
                    arrayList.addAll(this.f8013f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f8012e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f8012e) {
            try {
                ArrayList arrayList = new ArrayList(this.f8013f);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    b((d) obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(final d dVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f8009b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                dVar.a();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8053a.b(dVar, appLovinPostbackListener);
                }
            }, n7.i(), dVar.m());
        }
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f8056a.e();
            }
        }, true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f8012e) {
            try {
                Iterator it = this.f8015h.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f8015h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f8012e) {
            this.f8013f.clear();
            this.f8015h.clear();
        }
        this.f8008a.q0().a((i5) this.f8011d, d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f8012e) {
            this.f8014g.remove(dVar);
            this.f8015h.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (o.a()) {
            this.f8009b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f8008a.E0() && !dVar.m()) {
            if (o.a()) {
                this.f8009b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f8009b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f8012e) {
            try {
                if (this.f8014g.contains(dVar)) {
                    if (o.a()) {
                        this.f8009b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f8008a.a(x4.I2);
                if (dVar.c() > num.intValue()) {
                    if (o.a()) {
                        this.f8009b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f8012e) {
                    this.f8014g.add(dVar);
                }
                e eVarB = e.b(this.f8008a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (o.a()) {
                    this.f8009b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f8008a.g0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f8012e) {
            this.f8014g.remove(dVar);
            this.f8013f.remove(dVar);
        }
        if (o.a()) {
            this.f8009b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f8008a.q0().a((i5) new r6(this.f8008a, z11, "runPostbackTask", runnable), d6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
