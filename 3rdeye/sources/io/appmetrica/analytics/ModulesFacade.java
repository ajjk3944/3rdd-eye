package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC5104yi;
import io.appmetrica.analytics.impl.Ad;
import io.appmetrica.analytics.impl.Bd;
import io.appmetrica.analytics.impl.C4961t0;
import io.appmetrica.analytics.impl.C4999ud;
import io.appmetrica.analytics.impl.C5049wd;
import io.appmetrica.analytics.impl.C5074xd;
import io.appmetrica.analytics.impl.C5099yd;
import io.appmetrica.analytics.impl.C5124zd;

/* loaded from: classes3.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static Bd f38763a = new Bd();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        Bd bd = f38763a;
        C4999ud c4999ud = bd.f39171b;
        c4999ud.f41762b.a(context);
        c4999ud.f41764d.a(str);
        bd.f39172c.f39577a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC5104yi.f42146a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        boolean z10;
        Bd bd = f38763a;
        bd.f39171b.getClass();
        bd.f39172c.getClass();
        bd.f39170a.getClass();
        synchronized (C4961t0.class) {
            z10 = C4961t0.f41658f;
        }
        return z10;
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        Bd bd = f38763a;
        bd.f39171b.f41761a.a(null);
        bd.f39172c.getClass();
        bd.f39173d.execute(new C5074xd(bd, moduleEvent));
    }

    public static void reportExternalAttribution(int i, String str) {
        Bd bd = f38763a;
        bd.f39171b.getClass();
        bd.f39172c.getClass();
        bd.f39173d.execute(new C5099yd(bd, i, str));
    }

    public static void sendEventsBuffer() {
        Bd bd = f38763a;
        bd.f39171b.getClass();
        bd.f39172c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        Bd bd = f38763a;
        bd.f39171b.getClass();
        bd.f39172c.getClass();
        bd.f39173d.execute(new C5124zd(bd, z10));
    }

    public static void setProxy(Bd bd) {
        f38763a = bd;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        Bd bd = f38763a;
        bd.f39171b.f41763c.a(str);
        bd.f39172c.getClass();
        bd.f39173d.execute(new Ad(bd, str, bArr));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        Bd bd = f38763a;
        boolean zBooleanValue = bool.booleanValue();
        bd.f39171b.getClass();
        bd.f39172c.getClass();
        bd.f39173d.execute(new C5049wd(bd, adRevenue, zBooleanValue));
    }
}
