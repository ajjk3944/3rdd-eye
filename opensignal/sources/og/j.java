package og;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.measurement.e5;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import hf.n;
import io.sentry.t;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import pg.k;
import pg.m;

/* loaded from: classes.dex */
public final class j implements rg.a {
    public static final Random j = new Random();
    public static final HashMap k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f19441b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f19442c;

    /* renamed from: d, reason: collision with root package name */
    public final se.f f19443d;

    /* renamed from: e, reason: collision with root package name */
    public final fg.e f19444e;

    /* renamed from: f, reason: collision with root package name */
    public final te.c f19445f;

    /* renamed from: g, reason: collision with root package name */
    public final eg.b f19446g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19447h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19440a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f19448i = new HashMap();

    public j(Context context, ScheduledExecutorService scheduledExecutorService, se.f fVar, fg.e eVar, te.c cVar, eg.b bVar) {
        this.f19441b = context;
        this.f19442c = scheduledExecutorService;
        this.f19443d = fVar;
        this.f19444e = eVar;
        this.f19445f = cVar;
        this.f19446g = bVar;
        fVar.a();
        this.f19447h = fVar.f22009c.f22022b;
        AtomicReference atomicReference = i.f19439a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = i.f19439a;
        if (atomicReference2.get() == null) {
            i iVar = new i();
            while (true) {
                if (atomicReference2.compareAndSet(null, iVar)) {
                    bc.c.b(application);
                    bc.c.f2581x.a(iVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        e5.n(scheduledExecutorService, new n(2, this));
    }

    public final synchronized b a() {
        try {
            try {
                pg.c cVarC = c("fetch");
                pg.c cVarC2 = c("activate");
                pg.c cVarC3 = c("defaults");
                m mVar = new m(this.f19441b.getSharedPreferences("frc_" + this.f19447h + "_firebase_settings", 0));
                pg.i iVar = new pg.i(this.f19442c, cVarC2, cVarC3);
                se.f fVar = this.f19443d;
                eg.b bVar = this.f19446g;
                fVar.a();
                om.f fVar2 = fVar.f22008b.equals("[DEFAULT]") ? new om.f(bVar) : null;
                if (fVar2 != null) {
                    h hVar = new h(fVar2);
                    synchronized (iVar.f20524a) {
                        iVar.f20524a.add(hVar);
                    }
                }
                q3.a aVar = new q3.a();
                aVar.f20679d = cVarC2;
                aVar.f20680g = cVarC3;
                ScheduledExecutorService scheduledExecutorService = this.f19442c;
                js.e eVar = new js.e(10, false);
                eVar.f13797d = Collections.newSetFromMap(new ConcurrentHashMap());
                eVar.f13798g = cVarC2;
                eVar.f13799r = aVar;
                eVar.f13800x = scheduledExecutorService;
                return b(this.f19443d, this.f19444e, this.f19445f, this.f19442c, cVarC, cVarC2, cVarC3, d(cVarC, mVar), iVar, mVar, eVar);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized b b(se.f fVar, fg.e eVar, te.c cVar, Executor executor, pg.c cVar2, pg.c cVar3, pg.c cVar4, pg.h hVar, pg.i iVar, m mVar, js.e eVar2) {
        if (!this.f19440a.containsKey("firebase")) {
            Context context = this.f19441b;
            fVar.a();
            te.c cVar5 = fVar.f22008b.equals("[DEFAULT]") ? cVar : null;
            Context context2 = this.f19441b;
            synchronized (this) {
                ScheduledExecutorService scheduledExecutorService = this.f19442c;
                t tVar = new t();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                tVar.f12736a = linkedHashSet;
                tVar.f12737d = new k(fVar, eVar, hVar, cVar3, context2, linkedHashSet, mVar, scheduledExecutorService);
                b bVar = new b(context, cVar5, executor, cVar2, cVar3, cVar4, hVar, iVar, mVar, tVar, eVar2);
                cVar3.b();
                cVar4.b();
                cVar2.b();
                this.f19440a.put("firebase", bVar);
                k.put("firebase", bVar);
            }
        }
        return (b) this.f19440a.get("firebase");
    }

    public final pg.c c(String str) {
        pg.n nVar;
        pg.c cVar;
        String str2 = "frc_" + this.f19447h + "_firebase_" + str + ".json";
        ScheduledExecutorService scheduledExecutorService = this.f19442c;
        Context context = this.f19441b;
        HashMap map = pg.n.f20554c;
        synchronized (pg.n.class) {
            try {
                HashMap map2 = pg.n.f20554c;
                if (!map2.containsKey(str2)) {
                    map2.put(str2, new pg.n(context, str2));
                }
                nVar = (pg.n) map2.get(str2);
            } finally {
            }
        }
        HashMap map3 = pg.c.f20492d;
        synchronized (pg.c.class) {
            try {
                String str3 = nVar.f20556b;
                HashMap map4 = pg.c.f20492d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new pg.c(scheduledExecutorService, nVar));
                }
                cVar = (pg.c) map4.get(str3);
            } finally {
            }
        }
        return cVar;
    }

    public final synchronized pg.h d(pg.c cVar, m mVar) {
        fg.e eVar;
        eg.b gVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        se.f fVar;
        try {
            eVar = this.f19444e;
            se.f fVar2 = this.f19443d;
            fVar2.a();
            gVar = fVar2.f22008b.equals("[DEFAULT]") ? this.f19446g : new bf.g(7);
            scheduledExecutorService = this.f19442c;
            random = j;
            se.f fVar3 = this.f19443d;
            fVar3.a();
            str = fVar3.f22009c.f22021a;
            fVar = this.f19443d;
            fVar.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return new pg.h(eVar, gVar, scheduledExecutorService, random, cVar, new ConfigFetchHttpClient(this.f19441b, fVar.f22009c.f22022b, str, mVar.f20550a.getLong("fetch_timeout_in_seconds", 60L), mVar.f20550a.getLong("fetch_timeout_in_seconds", 60L)), mVar, this.f19448i);
    }
}
