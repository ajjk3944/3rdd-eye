package com.bytedance.sdk.openadsdk.gbl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ycc;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc implements xq {
    private final rie emc;
    private final Map<String, com.bytedance.sdk.openadsdk.ul.emc.emc.xq> xq = new HashMap();
    private final ypw ypw;

    private emc(ypw ypwVar, rie rieVar) {
        this.ypw = ypwVar;
        this.emc = rieVar;
    }

    public static emc emc(ypw ypwVar, rie rieVar) {
        return new emc(ypwVar, rieVar);
    }

    @Override // com.bytedance.sdk.openadsdk.gbl.xq
    public void emc() {
        this.xq.clear();
    }

    private rie emc(JSONObject jSONObject, String str) throws JSONException {
        String strEmc;
        if (jSONObject == null) {
            return null;
        }
        rie rieVar = new rie();
        rieVar.bw(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            rieVar.db(str);
        }
        if (this.emc != null) {
            String strEmc2 = rieVar.mjd() != null ? rieVar.mjd().emc() : null;
            if (TextUtils.isEmpty(strEmc2)) {
                return this.emc;
            }
            ycc yccVarMjd = this.emc.mjd();
            if (yccVarMjd != null && strEmc2.equals(yccVarMjd.emc())) {
                return this.emc;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (yccVarMjd != null) {
                try {
                    strEmc = yccVarMjd.emc();
                } catch (JSONException unused) {
                }
            } else {
                strEmc = "null";
            }
            jSONObject2.put("lu", strEmc);
            jSONObject2.put("ju", strEmc2);
            rie rieVar2 = this.emc;
            com.bytedance.sdk.openadsdk.core.dg.emc(rieVar2, tp.emc(rieVar2), -5, jSONObject2);
            if (yccVarMjd != null && strEmc2.contains("play.google.com/store") && !strEmc2.contains("referrer")) {
                rieVar.mjd().emc(yccVarMjd.emc());
            }
        }
        return rieVar;
    }

    @Override // com.bytedance.sdk.openadsdk.gbl.xq
    public void emc(Context context, JSONObject jSONObject, String str, int i, boolean z6) {
        JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        emc(context, emc(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i, z6);
    }

    private void emc(Context context, rie rieVar, JSONObject jSONObject, int i, boolean z6) {
        if (context == null || rieVar == null || rieVar.mjd() == null || jSONObject == null || this.ypw == null || this.xq.get(rieVar.mjd().emc()) != null) {
            return;
        }
        String strYpw = tp.ypw(i);
        if (TextUtils.isEmpty(strYpw)) {
            return;
        }
        this.xq.put(rieVar.mjd().emc(), emc(context, strYpw));
    }

    @Override // com.bytedance.sdk.openadsdk.gbl.xq
    public void emc(Context context, JSONObject jSONObject, String str) {
        if (context == null || this.emc == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(context, str).emc(this.emc);
    }

    @Override // com.bytedance.sdk.openadsdk.gbl.xq
    public void emc(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        emc(emc(jSONObjectOptJSONObject, (String) null), jSONObjectOptJSONObject);
    }

    private void emc(rie rieVar, JSONObject jSONObject) throws JSONException {
        if (this.ypw == null || rieVar == null || rieVar.mjd() == null) {
            return;
        }
        String strEmc = rieVar.mjd().emc();
        if (this.xq.containsKey(strEmc)) {
            this.xq.remove(strEmc);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.ypw.emc("app_ad_event", jSONObject2);
            } catch (JSONException e6) {
                ul.xq("JsAppAdDownloadManager", e6.getMessage());
            }
        }
    }

    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq emc(Context context, String str) {
        return com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(context, str);
    }
}
