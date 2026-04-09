package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4916r7 {

    /* renamed from: t, reason: collision with root package name */
    public static volatile C4916r7 f41535t;

    /* renamed from: e, reason: collision with root package name */
    public final Context f41540e;

    /* renamed from: f, reason: collision with root package name */
    public C4891q7 f41541f;

    /* renamed from: g, reason: collision with root package name */
    public C4891q7 f41542g;

    /* renamed from: h, reason: collision with root package name */
    public C4835o3 f41543h;
    public C4861p3 i;

    /* renamed from: j, reason: collision with root package name */
    public C4835o3 f41544j;

    /* renamed from: k, reason: collision with root package name */
    public C4861p3 f41545k;

    /* renamed from: l, reason: collision with root package name */
    public Lb f41546l;

    /* renamed from: m, reason: collision with root package name */
    public Mb f41547m;

    /* renamed from: n, reason: collision with root package name */
    public C4803mn f41548n;

    /* renamed from: o, reason: collision with root package name */
    public C4829nn f41549o;

    /* renamed from: p, reason: collision with root package name */
    public Lb f41550p;

    /* renamed from: q, reason: collision with root package name */
    public Mb f41551q;

    /* renamed from: r, reason: collision with root package name */
    public C4947sc f41552r;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f41536a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f41537b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f41538c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final C4580e7 f41539d = P5.a();

    /* renamed from: s, reason: collision with root package name */
    public final C4968t7 f41553s = new C4968t7();

    public C4916r7(Context context) {
        this.f41540e = context;
    }

    public static C4916r7 a(Context context) {
        if (f41535t == null) {
            synchronized (C4916r7.class) {
                try {
                    if (f41535t == null) {
                        f41535t = new C4916r7(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f41535t;
    }

    public final synchronized InterfaceC4481ab b(C4759l5 c4759l5) {
        InterfaceC4481ab lb;
        String str = new C4527c5(c4759l5).f40610a;
        lb = (InterfaceC4481ab) this.f41537b.get(str);
        if (lb == null) {
            lb = new Lb(new C4827nl(c(c4759l5)));
            this.f41537b.put(str, lb);
        }
        return lb;
    }

    public final synchronized C4891q7 c(C4759l5 c4759l5) {
        C4891q7 c4891q7;
        try {
            C4527c5 c4527c5 = new C4527c5(c4759l5);
            c4891q7 = (C4891q7) this.f41536a.get(c4527c5.f40610a);
            if (c4891q7 == null) {
                Context context = this.f41540e;
                C4968t7 c4968t7 = this.f41553s;
                String strA = new C4942s7(c4968t7.f41671a, c4968t7.f41672b, false).a(context, c4527c5);
                C4580e7 c4580e7 = this.f41539d;
                c4580e7.getClass();
                String str = c4759l5.f41171b;
                if (str == null) {
                    str = "main";
                }
                String strConcat = "component-".concat(str);
                C4571dn c4571dn = c4580e7.f40795c;
                C4839o7 c4839o7 = c4580e7.f40793a;
                C4632g7 c4632g7 = c4839o7.f41360a;
                C4658h7 c4658h7 = c4839o7.f41361b;
                Ia ia2 = new Ia(false);
                ia2.a(112, new C4604f5());
                C4622fn c4622fn = new C4622fn(strConcat, c4580e7.f40794b.f39894a);
                c4571dn.getClass();
                c4891q7 = new C4891q7(context, strA, new C4596en(c4632g7, c4658h7, ia2, c4622fn), PublicLogger.getAnonymousInstance());
                this.f41536a.put(c4527c5.f40610a, c4891q7);
            }
        } finally {
        }
        return c4891q7;
    }

    public final synchronized InterfaceC4481ab d() {
        try {
            if (this.f41546l == null) {
                this.f41546l = new Lb(new C4827nl(h()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f41546l;
    }

    public final IBinaryDataHelper e() {
        if (this.f41544j == null) {
            if (this.f41542g == null) {
                Context context = this.f41540e;
                C4968t7 c4968t7 = this.f41553s;
                String strA = new C4942s7(c4968t7.f41671a, c4968t7.f41672b, false).a(context, new B2());
                C4580e7 c4580e7 = this.f41539d;
                c4580e7.getClass();
                HashMap map = new HashMap();
                map.put("binary_data", K5.f39711a);
                C4571dn c4571dn = c4580e7.f40795c;
                C4839o7 c4839o7 = c4580e7.f40793a;
                C4684i7 c4684i7 = c4839o7.f41366g;
                C4709j7 c4709j7 = c4839o7.f41367h;
                Ia ia2 = new Ia(false);
                C4622fn c4622fn = new C4622fn("auto_inapp", map);
                c4571dn.getClass();
                this.f41542g = new C4891q7(context, strA, new C4596en(c4684i7, c4709j7, ia2, c4622fn), PublicLogger.getAnonymousInstance());
            }
            this.f41544j = new C4835o3(new C4827nl(this.f41542g));
        }
        return this.f41544j;
    }

    public final InterfaceC4481ab f() {
        C4947sc c4947sc;
        if (this.f41550p == null) {
            synchronized (this) {
                try {
                    if (this.f41552r == null) {
                        C4968t7 c4968t7 = this.f41553s;
                        String strA = new C4942s7(c4968t7.f41671a, c4968t7.f41672b, true).a(this.f41540e, new C4706j4());
                        Context context = this.f41540e;
                        C4580e7 c4580e7 = this.f41539d;
                        c4580e7.getClass();
                        HashMap map = new HashMap();
                        map.put("preferences", M5.f39848a);
                        C4571dn c4571dn = c4580e7.f40795c;
                        C4839o7 c4839o7 = c4580e7.f40793a;
                        C4735k7 c4735k7 = c4839o7.f41362c;
                        C4761l7 c4761l7 = c4839o7.f41363d;
                        Ia ia2 = new Ia(false);
                        ia2.a(112, new C4732k4());
                        C4622fn c4622fn = new C4622fn("service database", map);
                        c4571dn.getClass();
                        this.f41552r = new C4947sc(context, strA, new C4919ra(strA), new C4596en(c4735k7, c4761l7, ia2, c4622fn));
                    }
                    c4947sc = this.f41552r;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f41550p = new Lb(c4947sc);
        }
        return this.f41550p;
    }

    public final IBinaryDataHelper g() {
        if (this.f41543h == null) {
            this.f41543h = new C4835o3(new C4827nl(h()));
        }
        return this.f41543h;
    }

    public final synchronized C4891q7 h() {
        try {
            if (this.f41541f == null) {
                Context context = this.f41540e;
                C4968t7 c4968t7 = this.f41553s;
                String strA = new C4942s7(c4968t7.f41671a, c4968t7.f41672b, true).a(context, new C4748kk());
                C4580e7 c4580e7 = this.f41539d;
                c4580e7.getClass();
                HashMap map = new HashMap();
                map.put("preferences", M5.f39848a);
                map.put("binary_data", K5.f39711a);
                map.put("temp_cache", AbstractC4881pn.f41441a);
                Iterator<ModuleServicesDatabase> it = Ga.f39501F.o().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        map.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C4571dn c4571dn = c4580e7.f40795c;
                C4839o7 c4839o7 = c4580e7.f40793a;
                C4787m7 c4787m7 = c4839o7.f41364e;
                C4813n7 c4813n7 = c4839o7.f41365f;
                Ia ia2 = new Ia(false);
                ia2.a(114, new C4774lk());
                Iterator<ModuleServicesDatabase> it2 = Ga.f39501F.o().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            ia2.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C4622fn c4622fn = new C4622fn("service database", map);
                c4571dn.getClass();
                this.f41541f = new C4891q7(context, strA, new C4596en(c4787m7, c4813n7, ia2, c4622fn), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f41541f;
    }

    public final synchronized IBinaryDataHelper a(C4759l5 c4759l5) {
        IBinaryDataHelper c4835o3;
        String str = new C4527c5(c4759l5).f40610a;
        c4835o3 = (IBinaryDataHelper) this.f41538c.get(str);
        if (c4835o3 == null) {
            c4835o3 = new C4835o3(new C4827nl(c(c4759l5)));
            this.f41538c.put(str, c4835o3);
        }
        return c4835o3;
    }

    public final synchronized InterfaceC4481ab b() {
        return f();
    }

    public final synchronized InterfaceC4481ab a() {
        try {
            if (this.f41551q == null) {
                this.f41551q = new Mb(f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f41551q;
    }

    public final synchronized InterfaceC4481ab c() {
        try {
            if (this.f41547m == null) {
                if (this.f41546l == null) {
                    this.f41546l = new Lb(new C4827nl(h()));
                }
                this.f41547m = new Mb(this.f41546l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f41547m;
    }
}
