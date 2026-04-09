package com.bytedance.sdk.openadsdk.core.gbl;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.core.zz;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw {
    private static String emc = "";

    public static boolean emc(int i) {
        return i == 10 || i == 9;
    }

    private static JSONArray xq(rie rieVar) {
        try {
            rie.emc emcVarZhk = rieVar.zhk();
            if (emcVarZhk == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(emcVarZhk.zz());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt("discount", Double.valueOf(jSONObject.optDouble("discount", 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", rieVar.xxo());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                        jSONObject3.put("button_text", rieVar.xxo());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean ypw(rie rieVar) {
        return rieVar != null && rieVar.ej() == 10;
    }

    public static JSONObject emc(rie rieVar, String str) {
        JSONObject jSONObjectUie = rieVar.uie();
        try {
            jSONObjectUie.put("show_dislike", rieVar.lr());
            jSONObjectUie.put("language", sup.ypw());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strMsw = zz.ypw().msw();
                int iZz = zz.ypw().zz();
                jSONObject.put("app_name", strMsw);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iZz)));
                jSONObjectUie.put("open_app_info", jSONObject);
            }
            jSONObjectUie.put("os", "Android");
            JSONArray jSONArrayXq = xq(rieVar);
            if (jSONArrayXq != null) {
                jSONObjectUie.put("dpa_data", jSONArrayXq);
            }
            return jSONObjectUie;
        } catch (Throwable th) {
            ul.xq("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
            return jSONObjectUie;
        }
    }

    public static boolean emc(rie rieVar) {
        return rieVar != null && rieVar.ej() == 7;
    }

    public static String emc() {
        return emc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject emc(rie rieVar, com.bytedance.sdk.openadsdk.core.gbl.uym.xq xqVar) {
        xqVar.emc("ad");
        String strCf = "";
        emc = "";
        JSONObject jSONObject = 0;
        try {
            rie.emc emcVarZhk = rieVar.zhk();
            if (emcVarZhk != null) {
                strCf = emcVarZhk.cf();
                if (TextUtils.isEmpty(strCf) && !TextUtils.isEmpty(emcVarZhk.qh()) && !TextUtils.isEmpty(emcVarZhk.dg())) {
                    strCf = com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc("ad", emcVarZhk.dg(), emcVarZhk.qh());
                }
            }
            try {
                if (!TextUtils.isEmpty(strCf)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(strCf);
                        try {
                            emc = "getTemplate success";
                            xqVar.ypw("local");
                            return jSONObject2;
                        } catch (JSONException unused) {
                            String strConcat = "parse json exception data is ".concat(String.valueOf(strCf));
                            emc = strConcat;
                            xqVar.emc(2, strConcat, "local");
                            return null;
                        }
                    } catch (JSONException unused2) {
                    }
                } else {
                    String str = "local data is null id is " + emcVarZhk.dg() + " md5 is " + emcVarZhk.qh();
                    emc = str;
                    xqVar.emc(3, str, "net");
                    return null;
                }
            } catch (Throwable th) {
                jSONObject = emcVarZhk;
                th = th;
                String str2 = "get template error " + th.getMessage();
                emc = str2;
                xqVar.emc(2, str2, "local");
                return jSONObject;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
