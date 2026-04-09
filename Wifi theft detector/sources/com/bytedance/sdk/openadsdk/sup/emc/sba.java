package com.bytedance.sdk.openadsdk.sup.emc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.mxo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sba extends com.bytedance.sdk.component.emc.sba<JSONObject, JSONObject> {
    public static final HashSet<String> emc = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private rie ypw;

    public sba(rie rieVar) {
        this.ypw = rieVar;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, rie rieVar) {
        cfVar.emc(emc, new sba(rieVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) throws Exception {
        String strXit;
        rie rieVar = this.ypw;
        if (rieVar == null || (strXit = rieVar.xit()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    c10 = 0;
                    break;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String strOptString = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString) && mxo.emc().ypw(strXit, strOptString)) {
                    jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, mxo.emc().emc(strXit, strOptString));
                    jSONObject2.put("code", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
                break;
            case 1:
                mxo.emc().emc(strXit);
                jSONObject2.put("code", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                break;
            case 2:
                String strOptString2 = jSONObject.optString("key");
                String strOptString3 = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (strOptString2 != null) {
                    mxo.emc().emc(strXit, strOptString2, strOptString3);
                    jSONObject2.put("code", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
            case 3:
                String strOptString4 = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString4)) {
                    jSONObject2.put("code", mxo.emc().xq(strXit, strOptString4) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
        }
        return null;
    }
}
