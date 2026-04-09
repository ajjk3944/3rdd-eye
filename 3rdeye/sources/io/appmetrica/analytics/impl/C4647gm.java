package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4647gm {

    /* renamed from: A, reason: collision with root package name */
    public final Am f40950A;

    /* renamed from: B, reason: collision with root package name */
    public final Map f40951B;

    /* renamed from: C, reason: collision with root package name */
    public final U9 f40952C;

    /* renamed from: a, reason: collision with root package name */
    public final String f40953a;

    /* renamed from: b, reason: collision with root package name */
    public final List f40954b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40955c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40956d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40957e;

    /* renamed from: f, reason: collision with root package name */
    public final List f40958f;

    /* renamed from: g, reason: collision with root package name */
    public final List f40959g;

    /* renamed from: h, reason: collision with root package name */
    public final List f40960h;
    public final Map i;

    /* renamed from: j, reason: collision with root package name */
    public final String f40961j;

    /* renamed from: k, reason: collision with root package name */
    public final String f40962k;

    /* renamed from: l, reason: collision with root package name */
    public final String f40963l;

    /* renamed from: m, reason: collision with root package name */
    public final G4 f40964m;

    /* renamed from: n, reason: collision with root package name */
    public final long f40965n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f40966o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f40967p;

    /* renamed from: q, reason: collision with root package name */
    public final String f40968q;

    /* renamed from: r, reason: collision with root package name */
    public final Em f40969r;

    /* renamed from: s, reason: collision with root package name */
    public final Je f40970s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f40971t;

    /* renamed from: u, reason: collision with root package name */
    public final long f40972u;

    /* renamed from: v, reason: collision with root package name */
    public final long f40973v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f40974w;

    /* renamed from: x, reason: collision with root package name */
    public final BillingConfig f40975x;

    /* renamed from: y, reason: collision with root package name */
    public final C5114z3 f40976y;

    /* renamed from: z, reason: collision with root package name */
    public final C4911r2 f40977z;

    public C4647gm(C4621fm c4621fm) {
        this.f40953a = c4621fm.f40877a;
        List list = c4621fm.f40878b;
        this.f40954b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f40955c = c4621fm.f40879c;
        this.f40956d = c4621fm.f40880d;
        this.f40957e = c4621fm.f40881e;
        List list2 = c4621fm.f40882f;
        this.f40958f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c4621fm.f40883g;
        this.f40959g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c4621fm.f40884h;
        this.f40960h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map = c4621fm.i;
        this.i = map != null ? CollectionUtils.unmodifiableMapCopy(map) : null;
        this.f40961j = c4621fm.f40885j;
        this.f40962k = c4621fm.f40886k;
        this.f40964m = c4621fm.f40888m;
        this.f40970s = c4621fm.f40889n;
        this.f40965n = c4621fm.f40890o;
        this.f40966o = c4621fm.f40891p;
        this.f40963l = c4621fm.f40887l;
        this.f40967p = c4621fm.f40892q;
        this.f40968q = c4621fm.f40893r;
        this.f40969r = c4621fm.f40894s;
        this.f40972u = c4621fm.f40895t;
        this.f40973v = c4621fm.f40896u;
        this.f40974w = c4621fm.f40897v;
        RetryPolicyConfig retryPolicyConfig = c4621fm.f40898w;
        if (retryPolicyConfig == null) {
            C5008um c5008um = new C5008um();
            this.f40971t = new RetryPolicyConfig(c5008um.f41817w, c5008um.f41818x);
        } else {
            this.f40971t = retryPolicyConfig;
        }
        this.f40975x = c4621fm.f40899x;
        this.f40976y = c4621fm.f40900y;
        this.f40977z = c4621fm.f40901z;
        this.f40950A = c4621fm.f40874A == null ? new Am(Z7.f40464b.f41650a) : c4621fm.f40874A;
        this.f40951B = c4621fm.f40875B == null ? Collections.EMPTY_MAP : c4621fm.f40875B;
        this.f40952C = c4621fm.f40876C;
    }

    public final C4621fm a(G4 g42) {
        C4621fm c4621fm = new C4621fm(g42);
        c4621fm.f40877a = this.f40953a;
        c4621fm.f40882f = this.f40958f;
        c4621fm.f40883g = this.f40959g;
        c4621fm.f40885j = this.f40961j;
        c4621fm.f40878b = this.f40954b;
        c4621fm.f40879c = this.f40955c;
        c4621fm.f40880d = this.f40956d;
        c4621fm.f40881e = this.f40957e;
        c4621fm.f40884h = this.f40960h;
        c4621fm.i = this.i;
        c4621fm.f40886k = this.f40962k;
        c4621fm.f40887l = this.f40963l;
        c4621fm.f40892q = this.f40967p;
        c4621fm.f40890o = this.f40965n;
        c4621fm.f40891p = this.f40966o;
        c4621fm.f40893r = this.f40968q;
        c4621fm.f40889n = this.f40970s;
        c4621fm.f40895t = this.f40972u;
        c4621fm.f40896u = this.f40973v;
        c4621fm.f40894s = this.f40969r;
        c4621fm.f40897v = this.f40974w;
        c4621fm.f40898w = this.f40971t;
        c4621fm.f40900y = this.f40976y;
        c4621fm.f40899x = this.f40975x;
        c4621fm.f40901z = this.f40977z;
        c4621fm.f40874A = this.f40950A;
        c4621fm.f40875B = this.f40951B;
        c4621fm.f40876C = this.f40952C;
        return c4621fm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f40953a + "', reportUrls=" + this.f40954b + ", getAdUrl='" + this.f40955c + "', reportAdUrl='" + this.f40956d + "', certificateUrl='" + this.f40957e + "', hostUrlsFromStartup=" + this.f40958f + ", hostUrlsFromClient=" + this.f40959g + ", diagnosticUrls=" + this.f40960h + ", customSdkHosts=" + this.i + ", encodedClidsFromResponse='" + this.f40961j + "', lastClientClidsForStartupRequest='" + this.f40962k + "', lastChosenForRequestClids='" + this.f40963l + "', collectingFlags=" + this.f40964m + ", obtainTime=" + this.f40965n + ", hadFirstStartup=" + this.f40966o + ", startupDidNotOverrideClids=" + this.f40967p + ", countryInit='" + this.f40968q + "', statSending=" + this.f40969r + ", permissionsCollectingConfig=" + this.f40970s + ", retryPolicyConfig=" + this.f40971t + ", obtainServerTime=" + this.f40972u + ", firstStartupServerTime=" + this.f40973v + ", outdated=" + this.f40974w + ", autoInappCollectingConfig=" + this.f40975x + ", cacheControl=" + this.f40976y + ", attributionConfig=" + this.f40977z + ", startupUpdateConfig=" + this.f40950A + ", modulesRemoteConfigs=" + this.f40951B + ", externalAttributionConfig=" + this.f40952C + '}';
    }
}
