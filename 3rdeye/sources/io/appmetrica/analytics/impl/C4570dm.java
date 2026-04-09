package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4570dm implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Ke f40757a = new Ke();

    /* renamed from: b, reason: collision with root package name */
    public final C5096ya f40758b = new C5096ya();

    /* renamed from: c, reason: collision with root package name */
    public final Fm f40759c = new Fm();

    /* renamed from: d, reason: collision with root package name */
    public final C4988u2 f40760d = new C4988u2();

    /* renamed from: e, reason: collision with root package name */
    public final B3 f40761e = new B3();

    /* renamed from: f, reason: collision with root package name */
    public final C4937s2 f40762f = new C4937s2();

    /* renamed from: g, reason: collision with root package name */
    public final O6 f40763g = new O6();

    /* renamed from: h, reason: collision with root package name */
    public final Bm f40764h = new Bm();
    public final Dd i = new Dd();

    /* renamed from: j, reason: collision with root package name */
    public final V9 f40765j = new V9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5008um fromModel(C4647gm c4647gm) {
        C5008um c5008um = new C5008um();
        c5008um.f41813s = c4647gm.f40972u;
        c5008um.f41814t = c4647gm.f40973v;
        String str = c4647gm.f40953a;
        if (str != null) {
            c5008um.f41796a = str;
        }
        List list = c4647gm.f40958f;
        if (list != null) {
            c5008um.f41801f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c4647gm.f40959g;
        if (list2 != null) {
            c5008um.f41802g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c4647gm.f40954b;
        if (list3 != null) {
            c5008um.f41798c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c4647gm.f40960h;
        if (list4 != null) {
            c5008um.f41809o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c4647gm.i;
        if (map != null) {
            c5008um.f41803h = this.f40763g.fromModel(map);
        }
        Je je = c4647gm.f40970s;
        if (je != null) {
            c5008um.f41816v = this.f40757a.fromModel(je);
        }
        String str2 = c4647gm.f40961j;
        if (str2 != null) {
            c5008um.f41804j = str2;
        }
        String str3 = c4647gm.f40955c;
        if (str3 != null) {
            c5008um.f41799d = str3;
        }
        String str4 = c4647gm.f40956d;
        if (str4 != null) {
            c5008um.f41800e = str4;
        }
        String str5 = c4647gm.f40957e;
        if (str5 != null) {
            c5008um.f41812r = str5;
        }
        c5008um.i = this.f40758b.fromModel(c4647gm.f40964m);
        String str6 = c4647gm.f40962k;
        if (str6 != null) {
            c5008um.f41805k = str6;
        }
        String str7 = c4647gm.f40963l;
        if (str7 != null) {
            c5008um.f41806l = str7;
        }
        c5008um.f41807m = c4647gm.f40967p;
        c5008um.f41797b = c4647gm.f40965n;
        c5008um.f41811q = c4647gm.f40966o;
        RetryPolicyConfig retryPolicyConfig = c4647gm.f40971t;
        c5008um.f41817w = retryPolicyConfig.maxIntervalSeconds;
        c5008um.f41818x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c4647gm.f40968q;
        if (str8 != null) {
            c5008um.f41808n = str8;
        }
        Em em = c4647gm.f40969r;
        if (em != null) {
            this.f40759c.getClass();
            C4983tm c4983tm = new C4983tm();
            c4983tm.f41700a = em.f39385a;
            c5008um.f41810p = c4983tm;
        }
        c5008um.f41815u = c4647gm.f40974w;
        BillingConfig billingConfig = c4647gm.f40975x;
        if (billingConfig != null) {
            c5008um.f41820z = this.f40760d.fromModel(billingConfig);
        }
        C5114z3 c5114z3 = c4647gm.f40976y;
        if (c5114z3 != null) {
            this.f40761e.getClass();
            C4802mm c4802mm = new C4802mm();
            c4802mm.f41272a = c5114z3.f42161a;
            c5008um.f41819y = c4802mm;
        }
        C4911r2 c4911r2 = c4647gm.f40977z;
        if (c4911r2 != null) {
            c5008um.f41792A = this.f40762f.fromModel(c4911r2);
        }
        c5008um.f41793B = this.f40764h.fromModel(c4647gm.f40950A);
        c5008um.f41794C = this.i.fromModel(c4647gm.f40951B);
        c5008um.f41795D = this.f40765j.fromModel(c4647gm.f40952C);
        return c5008um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4647gm toModel(C5008um c5008um) {
        C4621fm c4621fm = new C4621fm(this.f40758b.toModel(c5008um.i));
        c4621fm.f40877a = c5008um.f41796a;
        c4621fm.f40885j = c5008um.f41804j;
        c4621fm.f40879c = c5008um.f41799d;
        c4621fm.f40878b = Arrays.asList(c5008um.f41798c);
        c4621fm.f40883g = Arrays.asList(c5008um.f41802g);
        c4621fm.f40882f = Arrays.asList(c5008um.f41801f);
        c4621fm.f40880d = c5008um.f41800e;
        c4621fm.f40881e = c5008um.f41812r;
        c4621fm.f40884h = Arrays.asList(c5008um.f41809o);
        c4621fm.f40886k = c5008um.f41805k;
        c4621fm.f40887l = c5008um.f41806l;
        c4621fm.f40892q = c5008um.f41807m;
        c4621fm.f40890o = c5008um.f41797b;
        c4621fm.f40891p = c5008um.f41811q;
        c4621fm.f40895t = c5008um.f41813s;
        c4621fm.f40896u = c5008um.f41814t;
        c4621fm.f40893r = c5008um.f41808n;
        c4621fm.f40897v = c5008um.f41815u;
        c4621fm.f40898w = new RetryPolicyConfig(c5008um.f41817w, c5008um.f41818x);
        c4621fm.i = this.f40763g.toModel(c5008um.f41803h);
        C4931rm c4931rm = c5008um.f41816v;
        if (c4931rm != null) {
            this.f40757a.getClass();
            c4621fm.f40889n = new Je(c4931rm.f41591a, c4931rm.f41592b);
        }
        C4983tm c4983tm = c5008um.f41810p;
        if (c4983tm != null) {
            this.f40759c.getClass();
            c4621fm.f40894s = new Em(c4983tm.f41700a);
        }
        C4776lm c4776lm = c5008um.f41820z;
        if (c4776lm != null) {
            this.f40760d.getClass();
            c4621fm.f40899x = new BillingConfig(c4776lm.f41215a, c4776lm.f41216b);
        }
        C4802mm c4802mm = c5008um.f41819y;
        if (c4802mm != null) {
            this.f40761e.getClass();
            c4621fm.f40900y = new C5114z3(c4802mm.f41272a);
        }
        C4750km c4750km = c5008um.f41792A;
        if (c4750km != null) {
            c4621fm.f40901z = this.f40762f.toModel(c4750km);
        }
        C4957sm c4957sm = c5008um.f41793B;
        if (c4957sm != null) {
            this.f40764h.getClass();
            c4621fm.f40874A = new Am(c4957sm.f41650a);
        }
        c4621fm.f40875B = this.i.toModel(c5008um.f41794C);
        C4854om c4854om = c5008um.f41795D;
        if (c4854om != null) {
            this.f40765j.getClass();
            c4621fm.f40876C = new U9(c4854om.f41395a);
        }
        return new C4647gm(c4621fm);
    }
}
