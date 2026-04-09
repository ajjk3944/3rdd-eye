package uf;

import android.content.Context;
import android.os.Process;
import androidx.lifecycle.p;
import ar.k;
import br.c;
import br.l;
import br.r;
import br.x;
import com.google.android.gms.internal.measurement.e5;
import d4.c0;
import d4.f0;
import d4.g;
import d4.g0;
import du.e;
import du.f;
import h4.d;
import h4.h;
import io.sentry.android.core.e0;
import ir.v;
import java.util.LinkedHashSet;
import java.util.List;
import wt.d0;
import wt.i1;
import wt.w;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v[] f23549d = {x.f2918a.g(new r(c.f2901a, b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final String f23550a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f23551b;

    /* renamed from: c, reason: collision with root package name */
    public final g f23552c;

    public b(Context context, String str) {
        d dVar;
        l.e(context, "context");
        l.e(str, "name");
        this.f23550a = str;
        this.f23551b = new ThreadLocal();
        final int i10 = 0;
        a2.g gVar = new a2.g(new k(this) { // from class: uf.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f23548d;

            {
                this.f23548d = this;
            }

            @Override // ar.k
            public final Object a(Object obj) {
                switch (i10) {
                    case 0:
                        d4.b bVar = (d4.b) obj;
                        l.e(bVar, "ex");
                        e0.q(x.f2918a.b(b.class).p(), "CorruptionException in " + this.f23548d.f23550a + " DataStore running in process " + Process.myPid(), bVar);
                        return new h4.b(true);
                    default:
                        Context context2 = (Context) obj;
                        l.e(context2, "it");
                        String str2 = this.f23548d.f23550a;
                        LinkedHashSet linkedHashSet = g4.l.f9332a;
                        l.e(str2, "sharedPreferencesName");
                        l.e(linkedHashSet, "keysToMigrate");
                        return e5.H(new f4.c(context2, str2, f4.d.f8440a, new p(linkedHashSet, (pq.c) null, 3), new g4.k(3, null)));
                }
            }
        });
        final int i11 = 1;
        k kVar = new k(this) { // from class: uf.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f23548d;

            {
                this.f23548d = this;
            }

            @Override // ar.k
            public final Object a(Object obj) {
                switch (i11) {
                    case 0:
                        d4.b bVar = (d4.b) obj;
                        l.e(bVar, "ex");
                        e0.q(x.f2918a.b(b.class).p(), "CorruptionException in " + this.f23548d.f23550a + " DataStore running in process " + Process.myPid(), bVar);
                        return new h4.b(true);
                    default:
                        Context context2 = (Context) obj;
                        l.e(context2, "it");
                        String str2 = this.f23548d.f23550a;
                        LinkedHashSet linkedHashSet = g4.l.f9332a;
                        l.e(str2, "sharedPreferencesName");
                        l.e(linkedHashSet, "keysToMigrate");
                        return e5.H(new f4.c(context2, str2, f4.d.f8440a, new p(linkedHashSet, (pq.c) null, 3), new g4.k(3, null)));
                }
            }
        };
        f fVar = d0.f24610a;
        e eVar = e.f7570g;
        i1 i1VarC = w.c();
        eVar.getClass();
        bu.c cVarB = w.b(se.b.M(eVar, i1VarC));
        g4.a aVar = new g4.a(str, gVar, kVar, cVarB);
        l.e(f23549d[0], "property");
        d dVar2 = (d) aVar.f9327c;
        if (dVar2 == null) {
            synchronized (aVar.f9326b) {
                try {
                    if (((d) aVar.f9327c) == null) {
                        Context applicationContext = context.getApplicationContext();
                        l.d(applicationContext, "applicationContext");
                        List list = (List) kVar.a(applicationContext);
                        ah.d dVar3 = new ah.d(applicationContext, 21, aVar);
                        l.e(list, "migrations");
                        aVar.f9327c = new d(new d(new c0(new g0(h.f9897a, f0.f6804d, new as.x(28, dVar3)), e5.H(new a8.h(list, (pq.c) null, 5)), gVar, cVarB)));
                    }
                    dVar = (d) aVar.f9327c;
                    l.b(dVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar2 = dVar;
        }
        this.f23552c = dVar2;
    }

    public final void a(k kVar) {
    }
}
