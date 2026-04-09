package kf;

import a0.x0;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import f7.l;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import km.o;
import lf.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements nf.a {
    public static final Random j = new Random();

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f28273k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f28275b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f28276c;

    /* renamed from: d, reason: collision with root package name */
    public final wd.f f28277d;

    /* renamed from: e, reason: collision with root package name */
    public final df.d f28278e;

    /* renamed from: f, reason: collision with root package name */
    public final xd.c f28279f;
    public final cf.b g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28280h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f28274a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f28281i = new HashMap();

    public i(Context context, ScheduledExecutorService scheduledExecutorService, wd.f fVar, df.d dVar, xd.c cVar, cf.b bVar) {
        this.f28275b = context;
        this.f28276c = scheduledExecutorService;
        this.f28277d = fVar;
        this.f28278e = dVar;
        this.f28279f = cVar;
        this.g = bVar;
        fVar.a();
        this.f28280h = fVar.f36616c.f36628b;
        AtomicReference atomicReference = h.f28272a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = h.f28272a;
        if (atomicReference2.get() == null) {
            h hVar = new h();
            while (true) {
                if (atomicReference2.compareAndSet(null, hVar)) {
                    com.google.android.gms.common.api.internal.c.b(application);
                    com.google.android.gms.common.api.internal.c.f9073e.a(hVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new l(2, this));
    }

    public final synchronized b a() throws Throwable {
        o oVar;
        try {
            try {
                lf.b bVarC = c("fetch");
                lf.b bVarC2 = c("activate");
                lf.b bVarC3 = c("defaults");
                lf.l lVar = new lf.l(this.f28275b.getSharedPreferences("frc_" + this.f28280h + "_firebase_settings", 0));
                lf.h hVar = new lf.h(this.f28276c, bVarC2, bVarC3);
                wd.f fVar = this.f28277d;
                cf.b bVar = this.g;
                fVar.a();
                if (fVar.f36615b.equals("[DEFAULT]")) {
                    oVar = new o();
                    oVar.f28446b = a0.g.r();
                    oVar.f28445a = bVar;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    hVar.a(new g(oVar));
                }
                o oVar2 = new o();
                oVar2.f28445a = bVarC2;
                oVar2.f28446b = bVarC3;
                ScheduledExecutorService scheduledExecutorService = this.f28276c;
                x0 x0Var = new x0(22, false);
                x0Var.f147d = Collections.newSetFromMap(new ConcurrentHashMap());
                x0Var.f148e = bVarC2;
                x0Var.f145b = oVar2;
                x0Var.f146c = scheduledExecutorService;
                return b(this.f28277d, this.f28278e, this.f28279f, this.f28276c, bVarC, bVarC2, bVarC3, d(bVarC, lVar), hVar, lVar, x0Var);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized b b(wd.f fVar, df.d dVar, xd.c cVar, Executor executor, lf.b bVar, lf.b bVar2, lf.b bVar3, lf.g gVar, lf.h hVar, lf.l lVar, x0 x0Var) {
        try {
            if (!this.f28274a.containsKey("firebase")) {
                Context context = this.f28275b;
                fVar.a();
                b bVar4 = new b(context, fVar.f36615b.equals("[DEFAULT]") ? cVar : null, executor, bVar, bVar2, bVar3, gVar, hVar, e(fVar, dVar, gVar, bVar2, this.f28275b, lVar), x0Var);
                bVar2.b();
                bVar3.b();
                bVar.b();
                this.f28274a.put("firebase", bVar4);
                f28273k.put("firebase", bVar4);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (b) this.f28274a.get("firebase");
    }

    public final lf.b c(String str) {
        m mVar;
        String strN = a0.g.n("frc_", this.f28280h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f28276c;
        Context context = this.f28275b;
        HashMap map = m.f28801c;
        synchronized (m.class) {
            try {
                HashMap map2 = m.f28801c;
                if (!map2.containsKey(strN)) {
                    map2.put(strN, new m(context, strN));
                }
                mVar = (m) map2.get(strN);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lf.b.d(scheduledExecutorService, mVar);
    }

    public final synchronized lf.g d(lf.b bVar, lf.l lVar) {
        df.d dVar;
        cf.b eVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        wd.f fVar;
        try {
            dVar = this.f28278e;
            wd.f fVar2 = this.f28277d;
            fVar2.a();
            eVar = fVar2.f36615b.equals("[DEFAULT]") ? this.g : new de.e(6);
            scheduledExecutorService = this.f28276c;
            random = j;
            wd.f fVar3 = this.f28277d;
            fVar3.a();
            str = fVar3.f36616c.f36627a;
            fVar = this.f28277d;
            fVar.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return new lf.g(dVar, eVar, scheduledExecutorService, random, bVar, new ConfigFetchHttpClient(this.f28275b, fVar.f36616c.f36628b, str, lVar.f28797a.getLong("fetch_timeout_in_seconds", 60L), lVar.f28797a.getLong("fetch_timeout_in_seconds", 60L)), lVar, this.f28281i);
    }

    public final synchronized x0 e(wd.f fVar, df.d dVar, lf.g gVar, lf.b bVar, Context context, lf.l lVar) {
        return new x0(fVar, dVar, gVar, bVar, context, lVar, this.f28276c);
    }
}
