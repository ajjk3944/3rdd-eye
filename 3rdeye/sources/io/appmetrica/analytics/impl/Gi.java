package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class Gi {

    /* renamed from: a, reason: collision with root package name */
    public final C4475a5 f39538a;

    /* renamed from: b, reason: collision with root package name */
    public final Mn f39539b;

    /* renamed from: c, reason: collision with root package name */
    public final Ii f39540c;

    /* renamed from: d, reason: collision with root package name */
    public final C4780m0 f39541d;

    /* renamed from: e, reason: collision with root package name */
    public Ml f39542e;

    /* renamed from: f, reason: collision with root package name */
    public final C4619fk f39543f;

    public Gi(C4780m0 c4780m0, Mn mn, C4475a5 c4475a5, C4619fk c4619fk) {
        this(c4780m0, mn, c4475a5, c4619fk, new Ii(c4780m0, c4619fk));
    }

    public final void a(Gh gh) {
        Qh qh = gh.f39537e;
        Ml ml = this.f39542e;
        if (ml != null) {
            qh.f40684b.setUuid(((Ll) ml).g());
        } else {
            qh.getClass();
        }
        this.f39540c.a(gh);
    }

    public final void b(String str) {
        Nf nf = this.f39538a.f40683a;
        synchronized (nf) {
            nf.f39902a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Gi(C4780m0 c4780m0, Mn mn, C4475a5 c4475a5, C4619fk c4619fk, Ii ii) {
        this.f39541d = c4780m0;
        this.f39538a = c4475a5;
        this.f39539b = mn;
        this.f39543f = c4619fk;
        this.f39540c = ii;
    }

    public final void a(Ll ll) {
        this.f39542e = ll;
        this.f39538a.f40684b.setUuid(ll.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (AbstractC4623fo.a(bool)) {
            this.f39538a.f40684b.setLocationTracking(bool.booleanValue());
        }
        if (AbstractC4623fo.a(bool2)) {
            this.f39538a.f40684b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (AbstractC4623fo.a(bool3)) {
            this.f39538a.f40684b.setAdvIdentifiersTracking(bool3.booleanValue());
        }
        C4683i6 c4683i6A = C4683i6.a();
        C4475a5 c4475a5 = this.f39538a;
        a(a(c4683i6A, c4475a5), c4475a5, 1, null);
    }

    public final void a(C4683i6 c4683i6, Qh qh, int i, Map map) {
        String str;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        this.f39541d.b();
        if (!AbstractC4623fo.a(map)) {
            c4683i6.setValue(AbstractC5122zb.b(map));
            a(c4683i6, qh);
        }
        Nf nf = new Nf(qh.f40683a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(qh.f40684b);
        T8 t82 = qh.f40018c;
        synchronized (qh) {
            str = qh.f40021f;
        }
        a(new Gh(c4683i6, false, i, null, new Qh(nf, counterConfiguration, t82, str)));
    }

    public static C4683i6 a(C4683i6 c4683i6, Qh qh) {
        if (O9.f39923a.contains(Integer.valueOf(c4683i6.f41047d))) {
            c4683i6.f41046c = qh.d();
        }
        return c4683i6;
    }

    public final void a(List list) {
        Nf nf = this.f39538a.f40683a;
        synchronized (nf) {
            nf.f39902a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC4623fo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap map) {
        Nf nf = this.f39538a.f40683a;
        synchronized (nf) {
            nf.f39902a.put("PROCESS_CFG_CLIDS", AbstractC5122zb.b(map));
        }
    }

    public final void a(String str) {
        Nf nf = this.f39538a.f40683a;
        synchronized (nf) {
            nf.f39902a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final Gh a(Kn kn, Qh qh) {
        String str;
        String str2;
        this.f39541d.b();
        Mn mn = this.f39539b;
        mn.getClass();
        An an = kn.f39725a;
        if (an == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(an.f39126a, "");
        }
        byte[] bArrFromModel = mn.f39880a.fromModel(kn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(qh.f40684b.getApiKey());
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(bArrFromModel, str, 5891, orCreatePublicLogger);
        c4681i4.f41046c = qh.d();
        HashMap map = c4681i4.f41035q;
        Nf nf = new Nf(qh.f40683a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(qh.f40684b);
        T8 t82 = qh.f40018c;
        synchronized (qh) {
            str2 = qh.f40021f;
        }
        return new Gh(c4681i4, true, 1, map, new Qh(nf, counterConfiguration, t82, str2));
    }
}
