package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.lifecycle.o0;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f5675a;

    /* renamed from: b, reason: collision with root package name */
    private final o f5676b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5677c;

    /* renamed from: d, reason: collision with root package name */
    private final c f5678d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f5679e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final List f5680f;
    private final Set g;

    /* renamed from: h, reason: collision with root package name */
    private final List f5681h;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements AppLovinPostbackListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f5682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f5683b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f5682a = dVar;
            this.f5683b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i4) {
            o unused = b.this.f5676b;
            if (o.a()) {
                b.this.f5676b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f5682a + " with error code: " + i4 + "; will retry later...");
            }
            b.this.d(this.f5682a);
            t2.a(this.f5683b, str, i4);
            if (this.f5682a.c() == 1) {
                b.this.f5675a.D().a("dispatchPostback", str, i4, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f5682a);
            o unused = b.this.f5676b;
            if (o.a()) {
                b.this.f5676b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f5682a);
            }
            b.this.c();
            t2.a(this.f5683b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f5680f = arrayList;
        this.g = new HashSet();
        this.f5681h = new ArrayList();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f5675a = kVar;
        this.f5676b = kVar.O();
        int iIntValue = ((Integer) kVar.a(x4.J2)).intValue();
        this.f5677c = iIntValue;
        if (!((Boolean) kVar.a(x4.M2)).booleanValue()) {
            this.f5678d = null;
            return;
        }
        c cVar = new c(this, kVar);
        this.f5678d = cVar;
        arrayList.addAll(cVar.a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f5675a.q0().a((i5) this.f5678d, d6.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f5679e) {
            while (this.f5680f.size() > this.f5677c) {
                try {
                    this.f5680f.remove(0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f5680f.add(dVar);
        }
        if (o.a()) {
            this.f5676b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f5679e) {
            try {
                if (((Boolean) this.f5675a.a(x4.L2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f5681h.size());
                    arrayList.addAll(this.f5681h);
                } else {
                    arrayList.ensureCapacity(this.f5680f.size());
                    arrayList.addAll(this.f5680f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f5679e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f5679e) {
            try {
                ArrayList arrayList = new ArrayList(this.f5680f);
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    b((d) obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar, boolean z3) {
        a(dVar, z3, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z3, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f5676b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z3) {
                dVar.a();
            }
            a(new b5.e(this, dVar, appLovinPostbackListener, 16), n7.i(), dVar.m());
        }
    }

    public void b() {
        a((Runnable) new o0(13, this), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f5679e) {
            try {
                Iterator it = this.f5681h.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f5681h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f5679e) {
            this.f5680f.clear();
            this.f5681h.clear();
        }
        this.f5675a.q0().a((i5) this.f5678d, d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f5679e) {
            this.g.remove(dVar);
            this.f5681h.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (o.a()) {
            this.f5676b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f5675a.E0() && !dVar.m()) {
            if (o.a()) {
                this.f5676b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f5676b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f5679e) {
            try {
                if (this.g.contains(dVar)) {
                    if (o.a()) {
                        this.f5676b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f5675a.a(x4.I2);
                if (dVar.c() > num.intValue()) {
                    if (o.a()) {
                        this.f5676b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f5679e) {
                    this.g.add(dVar);
                }
                e eVarB = e.b(this.f5675a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (o.a()) {
                    this.f5676b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f5675a.g0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f5679e) {
            this.g.remove(dVar);
            this.f5680f.remove(dVar);
        }
        if (o.a()) {
            this.f5676b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z3, boolean z10) {
        if (z3) {
            this.f5675a.q0().a((i5) new r6(this.f5675a, z10, "runPostbackTask", runnable), d6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
