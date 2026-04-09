package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k {
    public static void a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar, Context context) {
    }

    public static JSONObject a(Context context, com.mbridge.msdk.setting.g gVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            String strP = m0.p();
            if (!TextUtils.isEmpty(strP)) {
                jSONObject.put("manufacturer", strP);
            }
            int iM = m0.m();
            if (iM != -1) {
                jSONObject.put("sdkint", iM);
            }
            String strX = m0.x(context);
            if (!TextUtils.isEmpty(strX)) {
                jSONObject.put("is24H", strX);
            }
            String strY = m0.y();
            if (!TextUtils.isEmpty(strY)) {
                jSONObject.put("totalram", strY);
            }
            String strY2 = m0.y(context);
            if (!TextUtils.isEmpty(strY2)) {
                jSONObject.put("totalmemory", strY2);
            }
            jSONObject.put("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
            jSONObject.put("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
        if (gVar.w0() == 1 && !TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.e()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            jSONObject.put("az_aid_info", com.mbridge.msdk.foundation.tools.g.e());
        }
        return jSONObject;
    }
}
