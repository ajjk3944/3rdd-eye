package te;

import al.p;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.lifecycle.u;
import com.google.android.gms.internal.ads.v81;
import dh.e;
import java.util.LinkedHashSet;
import java.util.List;
import m1.g;
import nk.k;
import nk.o;
import nk.v;
import p4.c0;
import p4.d0;
import p4.z;
import r4.d;
import s4.h;
import xk.g0;
import xk.m1;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ tk.c[] f34554e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f34555a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34556b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal f34557c;

    /* renamed from: d, reason: collision with root package name */
    public final t4.c f34558d;

    static {
        o oVar = new o(nk.b.f29970a, c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        v.f29987a.getClass();
        f34554e = new tk.c[]{oVar};
    }

    public c(Context context, String str) {
        t4.c cVar;
        k.e(context, "context");
        k.e(str, "name");
        this.f34555a = context;
        this.f34556b = str;
        this.f34557c = new ThreadLocal();
        final int i4 = 0;
        g gVar = new g(new mk.c(this) { // from class: te.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f34550b;

            {
                this.f34550b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        p4.b bVar = (p4.b) obj;
                        k.e(bVar, "ex");
                        Log.w(v.a(c.class).c(), "CorruptionException in " + this.f34550b.f34556b + " DataStore running in process " + Process.myPid(), bVar);
                        return new t4.b(true);
                    default:
                        Context context2 = (Context) obj;
                        k.e(context2, "it");
                        String str2 = this.f34550b.f34556b;
                        LinkedHashSet linkedHashSet = h.f33468a;
                        k.e(str2, "sharedPreferencesName");
                        k.e(linkedHashSet, "keysToMigrate");
                        return cm.g.s(new r4.c(context2, str2, d.f32806a, new u(linkedHashSet, (ck.c) null, 10), new e(3, null)));
                }
            }
        });
        final int i10 = 1;
        mk.c cVar2 = new mk.c(this) { // from class: te.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f34550b;

            {
                this.f34550b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        p4.b bVar = (p4.b) obj;
                        k.e(bVar, "ex");
                        Log.w(v.a(c.class).c(), "CorruptionException in " + this.f34550b.f34556b + " DataStore running in process " + Process.myPid(), bVar);
                        return new t4.b(true);
                    default:
                        Context context2 = (Context) obj;
                        k.e(context2, "it");
                        String str2 = this.f34550b.f34556b;
                        LinkedHashSet linkedHashSet = h.f33468a;
                        k.e(str2, "sharedPreferencesName");
                        k.e(linkedHashSet, "keysToMigrate");
                        return cm.g.s(new r4.c(context2, str2, d.f32806a, new u(linkedHashSet, (ck.c) null, 10), new e(3, null)));
                }
            }
        };
        el.e eVar = g0.f37189a;
        el.d dVar = el.d.f23561c;
        m1 m1VarD = x.d();
        dVar.getClass();
        cl.d dVarB = x.b(wd.b.O(dVar, m1VarD));
        v81 v81Var = new v81(str, gVar, cVar2, dVarB);
        k.e(f34554e[0], "property");
        t4.c cVar3 = (t4.c) v81Var.f17561c;
        if (cVar3 == null) {
            synchronized (v81Var.f17562d) {
                try {
                    if (((t4.c) v81Var.f17561c) == null) {
                        Context applicationContext = context.getApplicationContext();
                        k.d(applicationContext, "applicationContext");
                        List list = (List) cVar2.invoke(applicationContext);
                        c2.c cVar4 = new c2.c(18, applicationContext, v81Var);
                        v81Var.f17561c = new t4.c(new t4.c(new z(new d0(t4.g.f34170a, c0.f31176a, new b2.b(26, cVar4)), cm.g.s(new p(list, (ck.c) null, 26)), gVar, dVarB)));
                    }
                    cVar = (t4.c) v81Var.f17561c;
                    k.b(cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            cVar3 = cVar;
        }
        this.f34558d = cVar3;
    }

    public final void a(mk.c cVar) {
    }
}
