package com.bytedance.sdk.openadsdk.core.zz.emc;

import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.c;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.gbl.uym.xq;
import com.bytedance.sdk.openadsdk.core.model.cuf;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sba;
import com.bytedance.sdk.openadsdk.core.model.yzg;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.core.zz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    public static String emc = "https://pag_open_icon_id/appicon.png";
    private static String ypw = "";

    public static String emc() {
        return ypw;
    }

    public static boolean xq() {
        return true;
    }

    public static JSONObject ypw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", sup.ypw());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            rtt.ypw(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e6) {
            ul.xq("TemplateUtils", e6.getMessage());
            return jSONObject;
        }
    }

    public static JSONObject emc(float f2, float f5, boolean z6, rie rieVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f2);
            jSONObject2.put("height", f5);
            if (z6) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", emc(false, rieVar));
            jSONObject.put("template_Plugin", ypw(rieVar.zhk()));
            jSONObject.put("diff_template_Plugin", emc(rieVar.zhk()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject xq(rie rieVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            rtt.emc(jSONObject, rieVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String ypw(rie.emc emcVar) {
        com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVarXq;
        if (emcVar != null) {
            String strUym = emcVar.uym();
            return (!TextUtils.isEmpty(strUym) || (ypwVarXq = com.bytedance.sdk.component.adexpress.emc.ypw.ypw.xq(emcVar.dg())) == null) ? strUym : ypwVarXq.bw();
        }
        return "";
    }

    public static JSONObject emc(rie rieVar) {
        return emc(rieVar, false, (JSONObject) null);
    }

    public static JSONObject emc(rie rieVar, boolean z6, JSONObject jSONObject) {
        JSONObject jSONObjectEmc = null;
        if (rieVar == null) {
            return null;
        }
        try {
            jSONObjectEmc = emc(rieVar, false, z6);
            if (jSONObjectEmc == null) {
                jSONObjectEmc = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            rtt.ypw(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObjectEmc.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectEmc.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectYpw = rtt.ypw(rieVar);
            jSONObjectYpw.put("language", sup.ypw());
            jSONObjectEmc.put("xSetting", jSONObjectYpw);
            return jSONObjectEmc;
        } catch (Throwable th) {
            th.getMessage();
            return jSONObjectEmc;
        }
    }

    public static Map<String, String> ypw(rie rieVar) {
        HashMap map = null;
        if (rieVar == null) {
            return null;
        }
        List<sba> listRr = rieVar.rr();
        if (listRr != null && listRr.size() > 0) {
            map = new HashMap();
            for (sba sbaVar : listRr) {
                if (sbaVar != null) {
                    map.put(sbaVar.emc(), sbaVar.uym());
                }
            }
            sba sbaVarYa = rieVar.ya();
            if (sbaVarYa != null) {
                map.put(sbaVarYa.emc(), sbaVarYa.uym());
            }
        }
        return map;
    }

    private static JSONObject emc(rie rieVar, boolean z6, boolean z7) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (rieVar != null) {
            try {
                String strUz = rieVar.uz();
                if (strUz != null) {
                    JSONObject jSONObject2 = new JSONObject(strUz);
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("creatives");
                    if (!z6 && !z7) {
                        jSONObject = new JSONObject();
                    } else {
                        JSONObject jSONObject3 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= rieVar.xq() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(rieVar.xq())) == null) ? null : new JSONObject(jSONObjectOptJSONObject.toString());
                        if (jSONObject3 == null) {
                            return null;
                        }
                        jSONObject = jSONObject3;
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th) {
                ul.emc("TemplateUtils", "filterTemplateInfo", th);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject emc(float f2, float f5, boolean z6, rie rieVar, String str, xq xqVar) throws JSONException {
        ypw = "";
        if (rieVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectEmc = emc(f2, f5, z6, rieVar, str);
            if (xqVar != null) {
                xqVar.emc("adv3");
            }
            cuf cufVarKv = rieVar.kv();
            if (cufVarKv != null) {
                String strDg = cufVarKv.dg();
                if (!TextUtils.isEmpty(strDg)) {
                    jSONObjectEmc.put("xTemplate", new JSONObject(strDg));
                    ypw = "getTemplate success by local data";
                    if (xqVar != null) {
                        xqVar.ypw("local");
                        return jSONObjectEmc;
                    }
                } else {
                    String strEmc = com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc("adv3", cufVarKv.emc(), cufVarKv.ypw());
                    if (!TextUtils.isEmpty(strEmc)) {
                        jSONObjectEmc.put("xTemplate", new JSONObject(strEmc));
                        ypw = "getTemplate success by db data";
                        if (xqVar != null) {
                            xqVar.ypw("local");
                            return jSONObjectEmc;
                        }
                    } else {
                        String str2 = "local db data is null id is " + cufVarKv.emc() + " md5 is " + cufVarKv.ypw();
                        ypw = str2;
                        if (xqVar != null) {
                            xqVar.emc(3, str2, "net");
                        }
                    }
                }
            }
            return jSONObjectEmc;
        } catch (Exception e6) {
            String str3 = "load template exception " + e6.getMessage();
            ypw = str3;
            if (xqVar != null) {
                xqVar.emc(3, str3, "net");
            }
            return null;
        }
    }

    public static JSONObject emc(float f2, float f5, boolean z6, rie rieVar, String str) {
        if (rieVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectEmc = emc(rieVar, true, true);
            if (jSONObjectEmc == null) {
                return null;
            }
            try {
                emc(jSONObjectEmc, rieVar, str);
                JSONObject jSONObjectYpw = rtt.ypw(rieVar);
                jSONObjectYpw.put("language", sup.ypw());
                jSONObjectEmc.put("xSetting", jSONObjectYpw);
                jSONObjectEmc.put("xAdInfo", emc(str, xq(rieVar), rieVar));
                JSONObject jSONObject = new JSONObject();
                rtt.ypw(jSONObject);
                jSONObject.put("platform", "android");
                jSONObjectEmc.put("xAppInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", f2);
                jSONObject2.put("height", f5);
                if (z6) {
                    jSONObject2.put("isLandscape", true);
                }
                jSONObjectEmc.put("xSize", jSONObject2);
                return jSONObjectEmc;
            } catch (Throwable unused) {
                return jSONObjectEmc;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void emc(JSONObject jSONObject, rie rieVar, String str) throws JSONException {
        c cVarIat;
        if (rieVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            if (!jSONObject.has("video") || (cVarIat = rieVar.iat()) == null) {
                return;
            }
            JSONObject jSONObjectC = cVarIat.c();
            if ("open_ad".equals(str)) {
                jSONObjectC.put("video_duration", aa.dg().rie(String.valueOf(rieVar.tx())));
            } else {
                jSONObjectC.put("video_duration", cVarIat.f6583d * cVarIat.f6596r);
            }
            jSONObject.put("video", jSONObjectC);
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    private static JSONObject emc(String str, JSONObject jSONObject, rie rieVar) throws JSONException {
        if (rieVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", zz.ypw().msw());
                    int iZz = zz.ypw().zz();
                    if (iZz != 0) {
                        int iEj = rieVar.ej();
                        if (9 == iEj) {
                            jSONObject2.put("app_icon", emc);
                        } else if (10 == iEj) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(iZz)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject emc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String emc(rie.emc emcVar) {
        if (emcVar != null) {
            return emcVar.msw();
        }
        return "";
    }

    public static JSONObject emc(boolean z6, rie rieVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", rieVar.xxo());
            if (rieVar.ya() != null) {
                if (rieVar.ya() != null && !TextUtils.isEmpty(rieVar.ya().emc())) {
                    jSONObject.put("icon", rieVar.ya().emc());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (rieVar.rr() != null) {
                for (int i = 0; i < rieVar.rr().size(); i++) {
                    sba sbaVar = rieVar.rr().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", sbaVar.xq());
                    jSONObject2.put("width", sbaVar.ypw());
                    jSONObject2.put("url", sbaVar.emc());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", rieVar.in());
            jSONObject.put("interaction_type", rieVar.sx());
            jSONObject.put("interaction_method", rieVar.nw());
            jSONObject.put("is_compliance_template", xq());
            jSONObject.put("title", rieVar.xou());
            jSONObject.put("description", rieVar.vyk());
            jSONObject.put("source", rieVar.hs());
            JSONObject jSONObject3 = new JSONObject();
            yzg yzgVarDb = rieVar.db();
            if (yzgVarDb == null) {
                yzgVarDb = new yzg();
            }
            jSONObject3.put("ceiling_time", yzgVarDb.dg());
            jSONObject3.put("ceiling_ratio", yzgVarDb.bw());
            jSONObject3.put("expand_ratio", yzgVarDb.ycc());
            jSONObject.put("interaction_params", jSONObject3);
            if (rieVar.mjd() != null) {
                jSONObject.put("comment_num", rieVar.mjd().bw());
                jSONObject.put("score", rieVar.mjd().dg());
                jSONObject.put("app_size", rieVar.mjd().ycc());
                jSONObject.put("app", rieVar.mjd().msw());
            }
            c cVarIat = rieVar.iat();
            if (cVarIat != null) {
                JSONObject jSONObjectC = cVarIat.c();
                jSONObjectC.put("video_duration", cVarIat.f6583d * cVarIat.f6596r);
                jSONObject.put("video", jSONObjectC);
            }
            if (rieVar.zhk() != null) {
                jSONObject.put("dynamic_creative", rieVar.zhk().zz());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String emc(rie rieVar, String str) {
        List<sba> listRr;
        if (rieVar != null && (listRr = rieVar.rr()) != null && listRr.size() > 0) {
            for (sba sbaVar : listRr) {
                if (sbaVar != null && TextUtils.equals(str, sbaVar.emc())) {
                    return sbaVar.uym();
                }
            }
        }
        return null;
    }
}
