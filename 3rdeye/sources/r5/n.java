package r5;

import W.X;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import b2.C1833n;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import g5.InterfaceC4392b;
import io.appmetrica.analytics.impl.Oo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import s5.C5576b;
import s5.C5577c;
import s5.C5578d;
import t5.C5608a;
import u5.InterfaceC5635a;

/* compiled from: RemoteConfigComponent.java */
@KeepForSdk
/* loaded from: classes2.dex */
public final class n implements InterfaceC5635a {

    /* renamed from: j, reason: collision with root package name */
    public static final Clock f45705j = DefaultClock.getInstance();

    /* renamed from: k, reason: collision with root package name */
    public static final Random f45706k = new Random();

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f45707l = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f45708a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f45709b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f45710c;

    /* renamed from: d, reason: collision with root package name */
    public final B4.e f45711d;

    /* renamed from: e, reason: collision with root package name */
    public final h5.c f45712e;

    /* renamed from: f, reason: collision with root package name */
    public final C4.c f45713f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4392b<F4.a> f45714g;

    /* renamed from: h, reason: collision with root package name */
    public final String f45715h;
    public final HashMap i;

    /* compiled from: RemoteConfigComponent.java */
    public static class a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicReference<a> f45716a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z10) {
            Clock clock = n.f45705j;
            synchronized (n.class) {
                Iterator it = n.f45707l.values().iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c(z10);
                }
            }
        }
    }

    public n() {
        throw null;
    }

    public n(Context context, @H4.b ScheduledExecutorService scheduledExecutorService, B4.e eVar, h5.c cVar, C4.c cVar2, InterfaceC4392b<F4.a> interfaceC4392b) {
        this.f45708a = new HashMap();
        this.i = new HashMap();
        this.f45709b = context;
        this.f45710c = scheduledExecutorService;
        this.f45711d = eVar;
        this.f45712e = cVar;
        this.f45713f = cVar2;
        this.f45714g = interfaceC4392b;
        eVar.a();
        this.f45715h = eVar.f489c.f504b;
        AtomicReference<a> atomicReference = a.f45716a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference<a> atomicReference2 = a.f45716a;
        if (atomicReference2.get() == null) {
            a aVar = new a();
            while (true) {
                if (atomicReference2.compareAndSet(null, aVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(aVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new l(this, 0));
    }

    @Override // u5.InterfaceC5635a
    public final void a(v5.f fVar) {
        t5.b bVar = b().f45698j;
        bVar.f46429d.add(fVar);
        Task<com.google.firebase.remoteconfig.internal.b> taskB = bVar.f46426a.b();
        taskB.addOnSuccessListener(bVar.f46428c, new X(bVar, taskB, fVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [r5.m] */
    @KeepForSdk
    public final synchronized e b() throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            C5576b c5576bD = d("fetch");
            C5576b c5576bD2 = d("activate");
            C5576b c5576bD3 = d("defaults");
            com.google.firebase.remoteconfig.internal.d dVar = new com.google.firebase.remoteconfig.internal.d(this.f45709b.getSharedPreferences("frc_" + this.f45715h + "_firebase_settings", 0));
            C5577c c5577c = new C5577c(this.f45710c, c5576bD2, c5576bD3);
            B4.e eVar = this.f45711d;
            InterfaceC4392b<F4.a> interfaceC4392b = this.f45714g;
            eVar.a();
            final K4.b bVar = eVar.f488b.equals("[DEFAULT]") ? new K4.b(interfaceC4392b) : null;
            if (bVar != null) {
                c5577c.a(new BiConsumer() { // from class: r5.m
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        JSONObject jSONObjectOptJSONObject;
                        K4.b bVar2 = bVar;
                        String str = (String) obj;
                        com.google.firebase.remoteconfig.internal.b bVar3 = (com.google.firebase.remoteconfig.internal.b) obj2;
                        F4.a aVar = (F4.a) ((InterfaceC4392b) bVar2.f3143c).get();
                        if (aVar == null) {
                            return;
                        }
                        JSONObject jSONObject = bVar3.f23302e;
                        if (jSONObject.length() < 1) {
                            return;
                        }
                        JSONObject jSONObject2 = bVar3.f23299b;
                        if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                            if (strOptString.isEmpty()) {
                                return;
                            }
                            synchronized (((Map) bVar2.f3144d)) {
                                try {
                                    if (strOptString.equals(((Map) bVar2.f3144d).get(str))) {
                                        return;
                                    }
                                    ((Map) bVar2.f3144d).put(str, strOptString);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("arm_key", str);
                                    bundle.putString("arm_value", jSONObject2.optString(str));
                                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                    aVar.d("fp", "personalization_assignment", bundle);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("_fpid", strOptString);
                                    aVar.d("fp", "_fpc", bundle2);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                });
            }
            C5608a c5608a = new C5608a();
            c5608a.f46424a = c5576bD2;
            c5608a.f46425b = c5576bD3;
            t5.b bVar2 = new t5.b();
            bVar2.f46429d = Collections.newSetFromMap(new ConcurrentHashMap());
            bVar2.f46426a = c5576bD2;
            bVar2.f46427b = c5608a;
            Executor executor = this.f45710c;
            bVar2.f46428c = executor;
            return c(this.f45711d, this.f45712e, this.f45713f, executor, c5576bD, c5576bD2, c5576bD3, e(c5576bD, dVar), c5577c, dVar, bVar2);
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized e c(B4.e eVar, h5.c cVar, C4.c cVar2, Executor executor, C5576b c5576b, C5576b c5576b2, C5576b c5576b3, com.google.firebase.remoteconfig.internal.c cVar3, C5577c c5577c, com.google.firebase.remoteconfig.internal.d dVar, t5.b bVar) {
        try {
            if (!this.f45708a.containsKey("firebase")) {
                eVar.a();
                e eVar2 = new e(cVar, eVar.f488b.equals("[DEFAULT]") ? cVar2 : null, executor, c5576b, c5576b2, c5576b3, cVar3, c5577c, dVar, f(eVar, cVar, cVar3, c5576b2, this.f45709b, dVar), bVar);
                c5576b2.b();
                c5576b3.b();
                c5576b.b();
                this.f45708a.put("firebase", eVar2);
                f45707l.put("firebase", eVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (e) this.f45708a.get("firebase");
    }

    public final C5576b d(String str) {
        C5578d c5578d;
        String strH = Oo.h("frc_", this.f45715h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f45710c;
        Context context = this.f45709b;
        HashMap map = C5578d.f46080c;
        synchronized (C5578d.class) {
            try {
                HashMap map2 = C5578d.f46080c;
                if (!map2.containsKey(strH)) {
                    map2.put(strH, new C5578d(context, strH));
                }
                c5578d = (C5578d) map2.get(strH);
            } catch (Throwable th) {
                throw th;
            }
        }
        return C5576b.d(scheduledExecutorService, c5578d);
    }

    public final synchronized com.google.firebase.remoteconfig.internal.c e(C5576b c5576b, com.google.firebase.remoteconfig.internal.d dVar) {
        h5.c cVar;
        InterfaceC4392b mVar;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str;
        B4.e eVar;
        try {
            cVar = this.f45712e;
            B4.e eVar2 = this.f45711d;
            eVar2.a();
            mVar = eVar2.f488b.equals("[DEFAULT]") ? this.f45714g : new J4.m(1);
            scheduledExecutorService = this.f45710c;
            clock = f45705j;
            random = f45706k;
            B4.e eVar3 = this.f45711d;
            eVar3.a();
            str = eVar3.f489c.f503a;
            eVar = this.f45711d;
            eVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.c(cVar, mVar, scheduledExecutorService, clock, random, c5576b, new ConfigFetchHttpClient(this.f45709b, eVar.f489c.f504b, str, dVar.f23326a.getLong("fetch_timeout_in_seconds", 60L), dVar.f23326a.getLong("fetch_timeout_in_seconds", 60L)), dVar, this.i);
    }

    public final synchronized C1833n f(B4.e eVar, h5.c cVar, com.google.firebase.remoteconfig.internal.c cVar2, C5576b c5576b, Context context, com.google.firebase.remoteconfig.internal.d dVar) {
        return new C1833n(eVar, cVar, cVar2, c5576b, context, dVar, this.f45710c);
    }
}
