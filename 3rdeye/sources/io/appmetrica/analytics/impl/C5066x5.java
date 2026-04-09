package io.appmetrica.analytics.impl;

import android.content.Context;
import c9.C2092m;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5066x5 {

    /* renamed from: a, reason: collision with root package name */
    public final C5016v5 f42031a;

    /* renamed from: b, reason: collision with root package name */
    public final C5041w5 f42032b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f42033c;

    /* renamed from: d, reason: collision with root package name */
    public final C4759l5 f42034d;

    /* renamed from: e, reason: collision with root package name */
    public final J4 f42035e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC4889q5 f42036f;

    /* renamed from: g, reason: collision with root package name */
    protected final C4544cm f42037g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4952sh f42038h;
    public final X8 i;

    /* renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f42039j;

    /* renamed from: k, reason: collision with root package name */
    public final Yb f42040k;

    /* renamed from: l, reason: collision with root package name */
    public final K9 f42041l;

    /* renamed from: m, reason: collision with root package name */
    public final int f42042m;

    public C5066x5(Context context, C4759l5 c4759l5, J4 j4, AbstractC4889q5 abstractC4889q5, C4544cm c4544cm, InterfaceC4952sh interfaceC4952sh, ICommonExecutor iCommonExecutor, int i, Yb yb, K9 k92) {
        this(context, c4759l5, j4, abstractC4889q5, c4544cm, interfaceC4952sh, iCommonExecutor, new X8(), i, new C5016v5(j4.f39669a), new C5041w5(context, c4759l5), yb, k92);
    }

    public static C4867p9 c(C4940s5 c4940s5) {
        return new C4867p9(c4940s5);
    }

    public final C4531c9 a() {
        Context context = this.f42033c;
        C4759l5 c4759l5 = this.f42034d;
        return new C4531c9(new C4660h9(context, c4759l5), this.f42042m);
    }

    public final C4555d7 b(C4940s5 c4940s5) {
        return new C4555d7(c4940s5, C4916r7.a(this.f42033c).c(this.f42034d), new Z6(c4940s5.c()), new C5093y7());
    }

    public final C5016v5 d() {
        return this.f42031a;
    }

    public final C5041w5 e() {
        return this.f42032b;
    }

    public final C4933ro f() {
        C4933ro c4933ro;
        vo c4996ua;
        uo uoVarB = Ga.f39501F.B();
        C4759l5 c4759l5 = this.f42034d;
        synchronized (uoVarB) {
            try {
                String strValueOf = String.valueOf(c4759l5);
                LinkedHashMap linkedHashMap = uoVarB.f41822b;
                Object c4933ro2 = linkedHashMap.get(strValueOf);
                if (c4933ro2 == null) {
                    Cif cif = new Cif(C4916r7.a(uoVarB.f41821a).b(c4759l5));
                    if (c4759l5.d()) {
                        String str = "appmetrica_vital_" + c4759l5.f41171b + ".dat";
                        c4996ua = new C5116z5(C2092m.W(new b9.l(str, new C4996ua(uoVarB.f41821a, str)), new b9.l("appmetrica_vital_main.dat", new C4996ua(uoVarB.f41821a, "appmetrica_vital_main.dat"))));
                    } else {
                        c4996ua = new C4996ua(uoVarB.f41821a, "appmetrica_vital_" + c4759l5.f41171b + ".dat");
                    }
                    c4933ro2 = new C4933ro(cif, c4996ua, strValueOf);
                    linkedHashMap.put(strValueOf, c4933ro2);
                }
                c4933ro = (C4933ro) c4933ro2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4933ro;
    }

    public C5066x5(Context context, C4759l5 c4759l5, J4 j4, AbstractC4889q5 abstractC4889q5, C4544cm c4544cm, InterfaceC4952sh interfaceC4952sh, ICommonExecutor iCommonExecutor, X8 x82, int i, C5016v5 c5016v5, C5041w5 c5041w5, Yb yb, K9 k92) {
        this.f42033c = context;
        this.f42034d = c4759l5;
        this.f42035e = j4;
        this.f42036f = abstractC4889q5;
        this.f42037g = c4544cm;
        this.f42038h = interfaceC4952sh;
        this.f42039j = iCommonExecutor;
        this.i = x82;
        this.f42042m = i;
        this.f42031a = c5016v5;
        this.f42032b = c5041w5;
        this.f42040k = yb;
        this.f42041l = k92;
    }

    public final Hk c() {
        return new Hk(this.f42033c, this.f42034d);
    }

    public final Fi d(C4940s5 c4940s5) {
        Fi fi = new Fi(c4940s5, this.f42036f.a(), this.f42039j);
        Yb yb = this.f42040k;
        synchronized (yb) {
            yb.f40416c.add(fi);
        }
        return fi;
    }

    public final C4513bh a(C4940s5 c4940s5) {
        return new C4513bh(new C4978th(c4940s5, this.f42038h, new Y3()), this.f42037g, new C4901qh(this.f42035e));
    }

    public static Pk a(C4940s5 c4940s5, C4933ro c4933ro, C4914r5 c4914r5) {
        Ok ok = new Ok(c4933ro);
        return new Pk(c4940s5, ok, c4914r5, new Aa(c4940s5, ok, new Sk(c4940s5.g(), Aa.f39095g), AbstractC4962t1.a(), new SystemTimeProvider()), new L2(c4940s5, ok, new Sk(c4940s5.g(), L2.f39740g), AbstractC4962t1.a(), new SystemTimeProvider()));
    }

    public static C4811n5 b() {
        return new C4811n5();
    }

    public final C9 a(Cif cif, C4933ro c4933ro, Pk pk, C4555d7 c4555d7, C4651h0 c4651h0, Hk hk, Fi fi) {
        return new C9(cif, c4933ro, pk, c4555d7, c4651h0, this.i, hk, this.f42042m, new C4991u5(fi), new C4711j9(c4933ro, new C4737k9(c4933ro)), new SystemTimeProvider());
    }

    public static Di a(C4940s5 c4940s5, C4867p9 c4867p9) {
        return new Di(c4867p9, c4940s5);
    }

    public I9 a(N9 n9, C4555d7 c4555d7, C4513bh c4513bh, J4 j4, C4759l5 c4759l5, Cif cif) {
        return this.f42041l.a(n9, c4555d7, c4513bh, j4, c4759l5, cif).a();
    }

    public final I3 a(Cif cif) {
        Context context = this.f42033c;
        return new I3(context, cif, context.getPackageName(), new SafePackageManager());
    }
}
