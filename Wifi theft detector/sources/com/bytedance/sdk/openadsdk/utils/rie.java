package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import java.util.HashMap;

/* loaded from: classes.dex */
public class rie {
    private static com.bytedance.sdk.openadsdk.vk.emc.ypw emc(String str, int i10, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVar = new com.bytedance.sdk.openadsdk.vk.emc.ypw();
        ypwVar.emc(str);
        ypwVar.emc(rieVar);
        ypwVar.ypw(tp.emc(rieVar));
        ypwVar.emc(i10);
        ypwVar.emc(false);
        ypwVar.ypw(rieVar.sx());
        return ypwVar;
    }

    public static boolean ypw(Context context, String str, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str2) {
        if (!(context instanceof Activity)) {
            Activity activityYpw = com.bytedance.sdk.openadsdk.core.cf.emc().bw().ypw();
            if (activityYpw != null && emc(activityYpw)) {
                context = activityYpw;
            }
        } else if (!emc((Activity) context)) {
            context = null;
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.aa.emc();
        }
        Context context2 = context;
        if (context2 == null || !emc(str)) {
            return false;
        }
        new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        HashMap map = new HashMap();
        map.put("deeplink_url", str);
        map.put("jsb_deeplink", 1);
        return com.bytedance.sdk.openadsdk.ul.emc.emc.emc.emc(context2, str, rieVar, tp.ypw(rieVar), map, true);
    }

    public static boolean emc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str2) {
        if (context instanceof Activity) {
            if (!emc((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityYpw = com.bytedance.sdk.openadsdk.core.cf.emc().bw().ypw();
            if (activityYpw != null && emc(activityYpw)) {
                context = activityYpw;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.aa.emc();
        }
        if (context == null) {
            return false;
        }
        String strEmc = tp.emc(rieVar);
        if (!com.bytedance.sdk.component.utils.sba.emc(str)) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(emc(str2, 5, rieVar));
            return false;
        }
        String strYpw = com.bytedance.sdk.openadsdk.core.model.rie.ypw(context, rieVar);
        if (!TextUtils.isEmpty(strYpw)) {
            try {
                CustomTabsIntent.d dVar = new CustomTabsIntent.d();
                dVar.p(false);
                dVar.m(2);
                try {
                    CustomTabsIntent customTabsIntentA = dVar.a();
                    if (!(context instanceof Activity)) {
                        customTabsIntentA.f1427a.addFlags(268435456);
                    }
                    com.bytedance.sdk.openadsdk.core.emc.emc.emc(context, strYpw, customTabsIntentA, Uri.parse(str));
                    if (context instanceof TTBaseActivity) {
                        ((TTBaseActivity) context).xq(true);
                    }
                    com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVarEmc = emc(str2, 100, rieVar);
                    ypwVarEmc.emc(true);
                    ypwVarEmc.ypw(8);
                    com.bytedance.sdk.openadsdk.dg.xq.emc(ypwVarEmc);
                } catch (Throwable th) {
                    String message = th.getMessage();
                    com.bytedance.sdk.component.utils.ul.xq("OpenUtils", message);
                    com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVarEmc2 = emc(str2, 13, rieVar);
                    ypwVarEmc2.xq(message);
                    com.bytedance.sdk.openadsdk.dg.xq.emc(ypwVarEmc2);
                    emc(context, str, rieVar, str2, strEmc);
                }
                return true;
            } catch (Throwable th2) {
                String message2 = th2.getMessage();
                com.bytedance.sdk.component.utils.ul.xq("OpenUtils", message2);
                com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVarEmc3 = emc(str2, 12, rieVar);
                ypwVarEmc3.xq(message2);
                com.bytedance.sdk.openadsdk.dg.xq.emc(ypwVarEmc3);
                return emc(context, str, rieVar, str2, strEmc);
            }
        }
        return emc(context, str, rieVar, str2, strEmc);
    }

    private static boolean emc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVarEmc = emc(str2, 100, rieVar);
                ypwVarEmc.emc(true);
                ypwVarEmc.ypw(2);
                com.bytedance.sdk.openadsdk.dg.xq.emc(ypwVarEmc);
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVarEmc2 = emc(str2, 7, rieVar);
                ypwVarEmc2.xq(message);
                ypwVarEmc2.ypw(2);
                com.bytedance.sdk.openadsdk.dg.xq.emc(ypwVarEmc2);
                return false;
            }
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVarEmc3 = emc(str2, 6, rieVar);
            ypwVarEmc3.xq(message2);
            ypwVarEmc3.ypw(2);
            com.bytedance.sdk.openadsdk.dg.xq.emc(ypwVarEmc3);
            return false;
        }
    }

    public static boolean emc(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean emc(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
