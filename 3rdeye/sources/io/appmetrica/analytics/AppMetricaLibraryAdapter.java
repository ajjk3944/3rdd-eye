package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.A0;
import io.appmetrica.analytics.impl.C5065x4;
import io.appmetrica.analytics.impl.Ub;
import io.appmetrica.analytics.impl.Vb;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes3.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static A0 f38740a = new A0();

    public static void activate(Context context) {
        A0 a02 = f38740a;
        if (!a02.f39072a.f40232a.a(context).f41158a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Vb vb = a02.f39073b;
        Context applicationContext = context.getApplicationContext();
        vb.getClass();
        C5065x4.l().f42018g.a(applicationContext);
        C5065x4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(String str, String str2, String str3) {
        f38740a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        A0 a02 = f38740a;
        if (a02.f39072a.f40234c.a((Void) null).f41158a) {
            a02.f39073b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z10);
        }
    }

    public static void setProxy(A0 a02) {
        f38740a = a02;
    }

    public static void activate(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        A0 a02 = f38740a;
        Ub ub = a02.f39072a;
        if (ub.f40232a.a(context).f41158a && ub.f40233b.a(appMetricaLibraryAdapterConfig).f41158a) {
            Vb vb = a02.f39073b;
            Context applicationContext = context.getApplicationContext();
            vb.getClass();
            C5065x4.l().f42018g.a(applicationContext);
            C5065x4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
