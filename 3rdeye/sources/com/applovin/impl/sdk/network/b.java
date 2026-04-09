package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.a7;
import com.applovin.impl.f6;
import com.applovin.impl.l2;
import com.applovin.impl.l4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w4;
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
    private final k f21361a;

    /* renamed from: b, reason: collision with root package name */
    private final o f21362b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21363c;

    /* renamed from: d, reason: collision with root package name */
    private final c f21364d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f21365e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final List f21366f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f21367g;

    /* renamed from: h, reason: collision with root package name */
    private final List f21368h;

    public class a implements AppLovinPostbackListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f21369a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f21370b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f21369a = dVar;
            this.f21370b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            o unused = b.this.f21362b;
            if (o.a()) {
                b.this.f21362b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f21369a + " with error code: " + i + "; will retry later...");
            }
            b.this.d(this.f21369a);
            l2.a(this.f21370b, str, i);
            if (this.f21369a.c() == 1) {
                b.this.f21361a.E().a("dispatchPostback", str, i, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f21369a);
            o unused = b.this.f21362b;
            if (o.a()) {
                b.this.f21362b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f21369a);
            }
            b.this.c();
            l2.a(this.f21370b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f21366f = arrayList;
        this.f21367g = new HashSet();
        this.f21368h = new ArrayList();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f21361a = kVar;
        this.f21362b = kVar.O();
        int iIntValue = ((Integer) kVar.a(l4.f19720D2)).intValue();
        this.f21363c = iIntValue;
        if (!((Boolean) kVar.a(l4.f19743G2)).booleanValue()) {
            this.f21364d = null;
            return;
        }
        c cVar = new c(this, kVar);
        this.f21364d = cVar;
        arrayList.addAll(cVar.a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f21361a.q0().a((w4) this.f21364d, r5.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f21365e) {
            while (this.f21366f.size() > this.f21363c) {
                try {
                    this.f21366f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f21366f.add(dVar);
        }
        if (o.a()) {
            this.f21362b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f21365e) {
            try {
                if (((Boolean) this.f21361a.a(l4.f19735F2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f21368h.size());
                    arrayList.addAll(this.f21368h);
                } else {
                    arrayList.ensureCapacity(this.f21366f.size());
                    arrayList.addAll(this.f21366f);
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
        synchronized (this.f21365e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f21365e) {
            try {
                Iterator it = new ArrayList(this.f21366f).iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z10, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f21362b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                dVar.a();
            }
            a(new Z.e(this, dVar, appLovinPostbackListener, 4), a7.h(), dVar.m());
        }
    }

    public void b() {
        a((Runnable) new C8.a(this, 9), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f21365e) {
            try {
                Iterator it = this.f21368h.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f21368h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f21365e) {
            this.f21366f.clear();
            this.f21368h.clear();
        }
        this.f21361a.q0().a((w4) this.f21364d, r5.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f21365e) {
            this.f21367g.remove(dVar);
            this.f21368h.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (o.a()) {
            this.f21362b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f21361a.E0() && !dVar.m()) {
            if (o.a()) {
                this.f21362b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f21362b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f21365e) {
            try {
                if (this.f21367g.contains(dVar)) {
                    if (o.a()) {
                        this.f21362b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f21361a.a(l4.f19712C2);
                if (dVar.c() > num.intValue()) {
                    if (o.a()) {
                        this.f21362b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f21365e) {
                    this.f21367g.add(dVar);
                }
                e eVarB = e.b(this.f21361a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (o.a()) {
                    this.f21362b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f21361a.f0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f21365e) {
            this.f21367g.remove(dVar);
            this.f21366f.remove(dVar);
        }
        if (o.a()) {
            this.f21362b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f21361a.q0().a((w4) new f6(this.f21361a, z11, "runPostbackTask", runnable), r5.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
