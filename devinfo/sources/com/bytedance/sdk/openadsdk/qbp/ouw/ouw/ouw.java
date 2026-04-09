package com.bytedance.sdk.openadsdk.qbp.ouw.ouw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.jae;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.jg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static boolean ouw(Context context, String str, vpp vppVar, Map<String, Object> map) throws JSONException {
        String strOuw = uoy.ouw(vppVar);
        com.bytedance.sdk.openadsdk.core.yu.ouw(vppVar, strOuw, 1, null);
        Intent intentOuw = ouw(context, str, vppVar);
        if (TextUtils.isEmpty(str) || intentOuw == null) {
            com.bytedance.sdk.openadsdk.core.yu.ouw(vppVar, strOuw, -2, vppVar.kn.ouw());
            return false;
        }
        uoy.od();
        if (map == null) {
            map = new HashMap<>();
        }
        if (vppVar != null && vppVar.cy == 0) {
            map.put("auto_click", Boolean.valueOf(!vppVar.mq));
        }
        map.put("can_query_install", 0);
        map.put("url", str);
        if (zih.yu().pno.ouw("if_both_open", 0) == 1) {
            uoy.ouw(vppVar, strOuw);
        }
        try {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, strOuw, "open_url_app", map);
            context.startActivity(intentOuw);
            jg.ouw().vt = map;
            jg jgVarOuw = jg.ouw();
            Message messageObtainMessage = jgVarOuw.ouw.obtainMessage();
            messageObtainMessage.what = 100;
            messageObtainMessage.obj = jg.ouw.ouw(vppVar, strOuw, jgVarOuw.vt);
            messageObtainMessage.sendToTarget();
            com.bytedance.sdk.openadsdk.yu.lh.ouw("dp_start_act_success", vppVar, strOuw, map);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", th2.getMessage());
                jSONObject.put("intent", intentOuw.toString());
                jSONObject.put("can_query_install", 0);
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.core.yu.ouw(vppVar, strOuw, -4, jSONObject);
            return false;
        }
    }

    private static Intent ouw(Context context, String str, vpp vppVar) {
        jae jaeVar;
        try {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (vppVar != null && (jaeVar = vppVar.oiz) != null && !TextUtils.isEmpty(jaeVar.vt)) {
                intent.setPackage(vppVar.oiz.vt);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th2) {
            qbp.lh("DeepLinkUtils", th2.getMessage());
            return null;
        }
    }
}
