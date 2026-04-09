package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* loaded from: classes3.dex */
public final class E6 implements InterfaceC4817nb {

    /* renamed from: a, reason: collision with root package name */
    public final F6 f39336a;

    /* renamed from: b, reason: collision with root package name */
    public final Qh f39337b;

    public E6(F6 f62) {
        this.f39336a = f62;
        this.f39337b = f62.a();
        C5065x4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4817nb
    public final void a(Kn kn) {
        Gi gi = this.f39336a.f39411a;
        Gh ghA = gi.a(kn, this.f39337b);
        Qh qh = ghA.f39537e;
        Ml ml = gi.f39542e;
        if (ml != null) {
            qh.f40684b.setUuid(((Ll) ml).g());
        } else {
            qh.getClass();
        }
        gi.f39540c.b(ghA);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + kn, new Object[0]);
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Qh qh = this.f39337b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (qh) {
                    T8 t82 = qh.f40018c;
                    t82.f40160b.b(t82.f40159a, key, value);
                }
            }
        }
    }
}
