package com.bytedance.sdk.openadsdk.core.cf;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    private static String ouw = "";

    private static JSONArray lh(vpp vppVar) {
        try {
            vpp.ouw ouwVar = vppVar.xn;
            if (ouwVar == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(ouwVar.ra);
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
            jSONObject2.put("button_text", vppVar.vpp());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i4);
                        jSONObject3.put("button_text", vppVar.vpp());
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

    public static boolean ouw(int i4) {
        return i4 == 10 || i4 == 9;
    }

    public static boolean vt(vpp vppVar) {
        return vppVar != null && vppVar.kfa == 10;
    }

    public static String ouw() {
        return ouw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject ouw(vpp vppVar, com.bytedance.sdk.openadsdk.core.cf.ra.lh lhVar) {
        lhVar.ouw("ad");
        String strOuw = "";
        ouw = "";
        JSONObject jSONObject = null;
        try {
            vpp.ouw ouwVar = vppVar.xn;
            if (ouwVar != 0) {
                strOuw = ouwVar.f8318jg;
                if (TextUtils.isEmpty(strOuw) && !TextUtils.isEmpty(ouwVar.mwh) && !TextUtils.isEmpty(ouwVar.ouw)) {
                    strOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw("ad", ouwVar.ouw, ouwVar.mwh);
                }
            }
            try {
                if (!TextUtils.isEmpty(strOuw)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(strOuw);
                        try {
                            ouw = "getTemplate success";
                            lhVar.vt("local");
                            return jSONObject2;
                        } catch (JSONException unused) {
                            String strConcat = "parse json exception data is ".concat(String.valueOf(strOuw));
                            ouw = strConcat;
                            lhVar.ouw(2, strConcat, "local");
                            return null;
                        }
                    } catch (JSONException unused2) {
                    }
                } else {
                    String str = "local data is null id is " + ouwVar.ouw + " md5 is " + ouwVar.mwh;
                    ouw = str;
                    lhVar.ouw(3, str, "net");
                    return null;
                }
            } catch (Throwable th2) {
                jSONObject = ouwVar;
                th = th2;
                String str2 = "get template error " + th.getMessage();
                ouw = str2;
                lhVar.ouw(2, str2, "local");
                return jSONObject;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static JSONObject ouw(vpp vppVar, String str) throws JSONException {
        JSONObject jSONObjectOuw = vppVar.ouw(true);
        try {
            jSONObjectOuw.put("show_dislike", vppVar.ksc());
            jSONObjectOuw.put("language", ryl.vt());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strPno = bly.ouw().pno();
                int iBly = bly.ouw().bly();
                jSONObject.put("app_name", strPno);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iBly)));
                jSONObjectOuw.put("open_app_info", jSONObject);
            }
            jSONObjectOuw.put("os", "Android");
            JSONArray jSONArrayLh = lh(vppVar);
            if (jSONArrayLh != null) {
                jSONObjectOuw.put("dpa_data", jSONArrayLh);
            }
            return jSONObjectOuw;
        } catch (Throwable th2) {
            qbp.yu("UgenUtils", "parseUGenDataInfo exception", th2.getMessage());
            return jSONObjectOuw;
        }
    }

    public static boolean ouw(vpp vppVar) {
        return vppVar != null && vppVar.kfa == 7;
    }
}
