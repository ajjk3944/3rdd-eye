package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import c9.C2092m;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ui, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5004ui implements InterfaceC4765lb {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41771a;

    /* renamed from: b, reason: collision with root package name */
    public final Nf f41772b;

    /* renamed from: c, reason: collision with root package name */
    public final Gi f41773c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f41774d;

    /* renamed from: e, reason: collision with root package name */
    public final Ll f41775e;

    /* renamed from: f, reason: collision with root package name */
    public final Lc f41776f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f41777g;

    /* renamed from: h, reason: collision with root package name */
    public final C5109yn f41778h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public Ac f41779j;

    /* renamed from: k, reason: collision with root package name */
    public E6 f41780k;

    public C5004ui(Context context, Nf nf, Gi gi, Handler handler, Ll ll) {
        this.f41771a = context;
        this.f41772b = nf;
        this.f41773c = gi;
        this.f41774d = handler;
        this.f41775e = ll;
        this.f41776f = new Lc(context, nf, gi, ll);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f41777g = linkedHashMap;
        this.f41778h = new C5109yn(new C5054wi(linkedHashMap));
        this.i = C2092m.W("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb, io.appmetrica.analytics.impl.InterfaceC4791mb
    public final InterfaceC4765lb a() {
        return this;
    }

    public final C5004ui b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized Ac a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z10) {
        Ac ac;
        try {
            ac = this.f41779j;
            if (ac == null) {
                this.f41778h.a(appMetricaConfig.apiKey);
                this.f41776f.a(appMetricaConfig, publicLogger);
                ac = new Ac(this.f41776f);
                ac.i = new Hb(this.f41774d, ac);
                Ll ll = this.f41775e;
                Qh qh = ac.f40267b;
                if (ll != null) {
                    qh.f40684b.setUuid(ll.g());
                } else {
                    qh.getClass();
                }
                ac.a(appMetricaConfig, z10);
                ac.k();
                this.f41773c.f39543f.f40869c = new C4979ti(ac);
                this.f41777g.put(appMetricaConfig.apiKey, ac);
                this.f41779j = ac;
            }
        } finally {
        }
        return ac;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized Ac b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z10) {
        Ac ac;
        try {
            ac = this.f41779j;
            if (ac != null) {
                this.f41776f.a(appMetricaConfig, publicLogger);
                ac.a(appMetricaConfig, z10);
                C5065x4.l().getClass();
                this.f41777g.put(appMetricaConfig.apiKey, ac);
            } else {
                this.f41778h.a(appMetricaConfig.apiKey);
                this.f41776f.a(appMetricaConfig, publicLogger);
                ac = new Ac(this.f41776f);
                ac.i = new Hb(this.f41774d, ac);
                Ll ll = this.f41775e;
                Qh qh = ac.f40267b;
                if (ll != null) {
                    qh.f40684b.setUuid(ll.g());
                } else {
                    qh.getClass();
                }
                ac.a(appMetricaConfig, z10);
                ac.k();
                this.f41773c.f39543f.f40869c = new C4979ti(ac);
                this.f41777g.put(appMetricaConfig.apiKey, ac);
                C5065x4.l().getClass();
                this.f41779j = ac;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ac;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.f41777g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    public final synchronized InterfaceC4739kb b(ReporterConfig reporterConfig) {
        InterfaceC4739kb interfaceC4739kb;
        try {
            InterfaceC4739kb interfaceC4739kb2 = (InterfaceC4739kb) this.f41777g.get(reporterConfig.apiKey);
            interfaceC4739kb = interfaceC4739kb2;
            if (interfaceC4739kb2 == null) {
                if (!this.i.contains(reporterConfig.apiKey)) {
                    this.f41775e.i();
                }
                Context context = this.f41771a;
                Rc rc = new Rc(context, this.f41772b, reporterConfig, this.f41773c, new C4609fa(context));
                rc.i = new Hb(this.f41774d, rc);
                Ll ll = this.f41775e;
                Qh qh = rc.f40267b;
                if (ll != null) {
                    qh.f40684b.setUuid(ll.g());
                } else {
                    qh.getClass();
                }
                rc.k();
                this.f41777g.put(reporterConfig.apiKey, rc);
                interfaceC4739kb = rc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC4739kb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    public final synchronized InterfaceC4817nb a(AppMetricaConfig appMetricaConfig) {
        E6 e62;
        try {
            e62 = this.f41780k;
            if (e62 != null) {
                e62.a(appMetricaConfig);
            } else {
                E6 e63 = new E6(new F6(this.f41772b, this.f41776f.f39773e, this.f41773c, appMetricaConfig));
                this.f41780k = e63;
                e62 = e63;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e62;
    }
}
