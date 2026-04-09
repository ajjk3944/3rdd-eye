package com.applovin.impl;

import android.content.Context;
import android.provider.Settings;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2119g {
    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.k kVar) {
        String strB = AbstractC2113d.b(appLovinFullscreenActivity);
        String strA = AbstractC2113d.a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z10 = false;
        boolean z11 = StringUtils.isValidString(strB) && !strB.equals(packageName);
        if (StringUtils.isValidString(strA) && !strA.equals(packageName)) {
            z10 = true;
        }
        if (z11 || z10) {
            Map mapA = a2.a((AppLovinAdImpl) bVar);
            mapA.put("activity_task_affinity_mismatch", String.valueOf(z11));
            mapA.put("base_activity_task_affinity_mismatch", String.valueOf(z10));
            kVar.E().a(y1.f21804l0, "taskAffinityMismatch", mapA);
        }
    }

    public static void a(com.applovin.impl.adview.b bVar, com.applovin.impl.sdk.k kVar) {
        if (bVar == null) {
            return;
        }
        boolean zA = r.a(bVar);
        boolean zA2 = a(bVar.getContext());
        if (zA2 || zA) {
            Map mapA = a2.a((AppLovinAdImpl) bVar.getCurrentAd());
            mapA.put("can_draw_overlays", String.valueOf(zA2));
            mapA.put("is_ad_view_overlaid", String.valueOf(zA));
            kVar.E().a(y1.f21804l0, "overlayViolation", mapA);
        }
    }

    private static boolean a(Context context) {
        if (AbstractC2128k0.e()) {
            return Settings.canDrawOverlays(context);
        }
        return AbstractC2128k0.a("android.permission.SYSTEM_ALERT_WINDOW", context);
    }
}
