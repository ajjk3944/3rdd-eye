package com.bytedance.sdk.openadsdk.ul.emc.emc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.iyl;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.dg.qh;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    public static boolean emc(Context context, String str, rie rieVar, int i10, Map<String, Object> map, boolean z10) throws JSONException {
        Map<String, Object> map2 = map;
        String strEmc = tp.emc(rieVar);
        com.bytedance.sdk.openadsdk.core.dg.emc(rieVar, strEmc, 1, null);
        Intent intentEmc = emc(context, str, rieVar);
        if (TextUtils.isEmpty(str) || intentEmc == null) {
            com.bytedance.sdk.openadsdk.core.dg.emc(rieVar, strEmc, -2, rieVar.kda().dg());
            return false;
        }
        boolean zDg = tp.dg(context);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        Map<String, Object> map3 = map2;
        if (rieVar != null && rieVar.aod() == 0) {
            map3.put("auto_click", Boolean.valueOf(!rieVar.yzg()));
        }
        map3.put("can_query_install", Integer.valueOf(zDg ? 1 : 0));
        map3.put("url", str);
        if (zDg) {
            tp.ypw ypwVarEmc = tp.emc(context, intentEmc);
            if (ypwVarEmc.ypw <= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("intent", intentEmc.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.dg.emc(rieVar, strEmc, -3, jSONObject);
                return false;
            }
            try {
                emc(context, rieVar, map3);
                map3.put("matched_count", Integer.valueOf(ypwVarEmc.ypw));
                ComponentName componentName = ypwVarEmc.emc;
                if (componentName != null) {
                    intentEmc.setComponent(componentName);
                }
            } catch (Throwable th) {
                ul.xq("DeepLinkUtils", th.getMessage());
            }
        }
        if (aa.dg().ru()) {
            tp.emc(rieVar, strEmc);
        }
        try {
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, strEmc, "open_url_app", map3);
            context.startActivity(intentEmc);
            qh.emc().emc(map3).emc(rieVar, strEmc);
            com.bytedance.sdk.openadsdk.dg.xq.emc("dp_start_act_success", rieVar, strEmc, map3);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", th2.getMessage());
                jSONObject2.put("intent", intentEmc.toString());
                jSONObject2.put("can_query_install", zDg ? 1 : 0);
            } catch (Exception unused2) {
            }
            com.bytedance.sdk.openadsdk.core.dg.emc(rieVar, strEmc, -4, jSONObject2);
            if (zDg && !aa.dg().ru()) {
                iyl.emc(context, rieVar.xst(), rieVar, i10, strEmc, z10);
            }
            return false;
        }
    }

    private static Intent emc(Context context, String str, rie rieVar) {
        try {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (rieVar != null && rieVar.au() != null && !TextUtils.isEmpty(rieVar.au().dg())) {
                intent.setPackage(rieVar.au().dg());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th) {
            ul.xq("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    private static void emc(Context context, rie rieVar, Map<String, Object> map) {
        if (rieVar != null && rieVar.aod() == 0) {
            map.put("auto_click", Boolean.valueOf(!rieVar.yzg()));
        }
        map.put("can_query_install", Integer.valueOf(tp.dg(context) ? 1 : 0));
    }
}
