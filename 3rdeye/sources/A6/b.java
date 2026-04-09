package A6;

import K6.C0745n;
import android.os.Bundle;
import android.util.Log;
import b9.C1992A;
import i6.C4458a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import m0.C5308a;
import z6.C5866e;

/* compiled from: DivTimerEventDispatcherProvider.kt */
/* loaded from: classes.dex */
public final class b implements M4.b, M4.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f40b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f41c;

    /* renamed from: d, reason: collision with root package name */
    public Object f42d;

    public b(E7.b cache, Q6.d dVar) {
        kotlin.jvm.internal.l.f(cache, "cache");
        this.f40b = cache;
        this.f41c = dVar;
        this.f42d = new C5308a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5866e a(C4458a tag) {
        C5866e c5866e;
        kotlin.jvm.internal.l.f(tag, "tag");
        synchronized (((C5308a) this.f42d)) {
            try {
                c5866e = (C5866e) ((C5308a) this.f42d).get(tag);
                if (c5866e == null) {
                    String str = (String) ((Map) ((E7.b) this.f40b).f1476c).get(tag.f38455a);
                    c5866e = str != null ? new C5866e(Long.parseLong(str)) : null;
                    ((C5308a) this.f42d).put(tag, c5866e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5866e;
    }

    public void b(C4458a tag, long j4, boolean z10) {
        kotlin.jvm.internal.l.f(tag, "tag");
        if (C4458a.f38454b.equals(tag)) {
            return;
        }
        synchronized (((C5308a) this.f42d)) {
            try {
                C5866e c5866eA = a(tag);
                ((C5308a) this.f42d).put(tag, c5866eA == null ? new C5866e(j4) : new C5866e(j4, c5866eA.f48466b));
                Q6.d dVar = (Q6.d) this.f41c;
                String str = tag.f38455a;
                String stateId = String.valueOf(j4);
                kotlin.jvm.internal.l.f(stateId, "stateId");
                dVar.d(str, "/", stateId);
                if (!z10) {
                    E7.b bVar = (E7.b) this.f40b;
                    String str2 = tag.f38455a;
                    String state = String.valueOf(j4);
                    bVar.getClass();
                    kotlin.jvm.internal.l.f(state, "state");
                    Map rootStates = (Map) bVar.f1476c;
                    kotlin.jvm.internal.l.e(rootStates, "rootStates");
                    rootStates.put(str2, state);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M4.a
    public void d(Bundle bundle) {
        synchronized (this.f41c) {
            try {
                L4.e eVar = L4.e.f4061a;
                eVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f42d = new CountDownLatch(1);
                ((F3.f) this.f40b).d(bundle);
                eVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f42d).await(500, TimeUnit.MILLISECONDS)) {
                        eVar.c("App exception callback received from Analytics listener.");
                    } else {
                        eVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f42d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M4.b
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f42d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public b(C0745n c0745n, Q6.d dVar) {
        this.f40b = c0745n;
        this.f41c = dVar;
        this.f42d = Collections.synchronizedMap(new LinkedHashMap());
    }

    public b(F3.f fVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f41c = new Object();
        this.f40b = fVar;
    }
}
