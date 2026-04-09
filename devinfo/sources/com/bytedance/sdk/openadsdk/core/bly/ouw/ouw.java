package com.bytedance.sdk.openadsdk.core.bly.ouw;

import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.adexpress.ouw.lh.vt;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.cf.ra.lh;
import com.bytedance.sdk.openadsdk.core.model.le;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.model.zih;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static String ouw = "https://pag_open_icon_id/appicon.png";
    private static String vt = "";

    private static JSONObject lh(vpp vppVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            bs.ouw(jSONObject, vppVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static String ouw() {
        return vt;
    }

    public static JSONObject vt() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", ryl.vt());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            bs.ouw(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e2) {
            qbp.lh("TemplateUtils", e2.getMessage());
            return jSONObject;
        }
    }

    private static JSONObject yu(vpp vppVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", vppVar.vpp());
            zih zihVar = vppVar.fak;
            if (zihVar != null) {
                if (zihVar == null || TextUtils.isEmpty(zihVar.ouw)) {
                    jSONObject.put("icon", "");
                } else {
                    jSONObject.put("icon", vppVar.fak.ouw);
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (vppVar.tc != null) {
                for (int i4 = 0; i4 < vppVar.tc.size(); i4++) {
                    zih zihVar2 = vppVar.tc.get(i4);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", zihVar2.f8323lh);
                    jSONObject2.put("width", zihVar2.vt);
                    jSONObject2.put("url", zihVar2.ouw);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", vppVar.ucs);
            jSONObject.put("interaction_type", vppVar.f8305pd);
            jSONObject.put("interaction_method", vppVar.bs);
            jSONObject.put("is_compliance_template", true);
            jSONObject.put("title", vppVar.fqk);
            jSONObject.put("description", vppVar.hun);
            jSONObject.put("source", vppVar.f8315vh);
            JSONObject jSONObject3 = new JSONObject();
            vm vmVar = vppVar.f8301mb;
            if (vmVar == null) {
                vmVar = new vm();
            }
            jSONObject3.put("ceiling_time", vmVar.f8287lh);
            jSONObject3.put("ceiling_ratio", vmVar.yu);
            jSONObject3.put("expand_ratio", vmVar.fkw);
            jSONObject.put("interaction_params", jSONObject3);
            le leVar = vppVar.wp;
            if (leVar != null) {
                jSONObject.put("comment_num", leVar.f8243le);
                jSONObject.put("score", vppVar.wp.fkw);
                jSONObject.put("app_size", vppVar.wp.ra);
                jSONObject.put("app", vppVar.wp.ouw());
            }
            c cVar = vppVar.f8309sd;
            if (cVar != null) {
                JSONObject jSONObjectA = cVar.a();
                jSONObjectA.put("video_duration", cVar.f6576d * cVar.f6588r);
                jSONObject.put("video", jSONObjectA);
            }
            vpp.ouw ouwVar = vppVar.xn;
            if (ouwVar != null) {
                jSONObject.put("dynamic_creative", ouwVar.ra);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject ouw(float f10, float f11, boolean z3, vpp vppVar) throws JSONException {
        String str;
        vt vtVarLh;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z3) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", yu(vppVar));
            vpp.ouw ouwVar = vppVar.xn;
            if (ouwVar != null) {
                str = ouwVar.yu;
                if (TextUtils.isEmpty(str) && (vtVarLh = com.bytedance.sdk.component.adexpress.ouw.vt.vt.lh(ouwVar.ouw)) != null) {
                    str = vtVarLh.fkw;
                }
            } else {
                str = "";
            }
            jSONObject.put("template_Plugin", str);
            vpp.ouw ouwVar2 = vppVar.xn;
            jSONObject.put("diff_template_Plugin", ouwVar2 != null ? ouwVar2.fkw : "");
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, String> vt(vpp vppVar) {
        HashMap map = null;
        if (vppVar == null) {
            return null;
        }
        List<zih> list = vppVar.tc;
        if (list != null && list.size() > 0) {
            map = new HashMap();
            for (zih zihVar : list) {
                if (zihVar != null) {
                    map.put(zihVar.ouw, zihVar.f8322le);
                }
            }
            zih zihVar2 = vppVar.fak;
            if (zihVar2 != null) {
                map.put(zihVar2.ouw, zihVar2.f8322le);
            }
        }
        return map;
    }

    public static JSONObject ouw(vpp vppVar) {
        return ouw(vppVar, false, (JSONObject) null);
    }

    public static JSONObject ouw(vpp vppVar, boolean z3, JSONObject jSONObject) {
        JSONObject jSONObjectOuw = null;
        if (vppVar == null) {
            return null;
        }
        try {
            jSONObjectOuw = ouw(vppVar, false, z3);
            if (jSONObjectOuw == null) {
                jSONObjectOuw = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            bs.ouw(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObjectOuw.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectOuw.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectVt = bs.vt(vppVar);
            jSONObjectVt.put("language", ryl.vt());
            jSONObjectOuw.put("xSetting", jSONObjectVt);
            return jSONObjectOuw;
        } catch (Throwable th2) {
            ko.yu("TemplateUtils", "getDataInOtherScene", th2.getMessage());
            return jSONObjectOuw;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject ouw(com.bytedance.sdk.openadsdk.core.model.vpp r4, boolean r5, boolean r6) {
        /*
            java.lang.String r0 = "creatives"
            r1 = 0
            if (r4 != 0) goto L6
            goto L5a
        L6:
            java.lang.String r2 = r4.bo     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L5a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            org.json.JSONArray r2 = r3.optJSONArray(r0)     // Catch: java.lang.Throwable -> L1f
            if (r5 != 0) goto L21
            if (r6 == 0) goto L18
            goto L21
        L18:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1f
            r4.<init>()     // Catch: java.lang.Throwable -> L1f
            r1 = r4
            goto L40
        L1f:
            r4 = move-exception
            goto L5b
        L21:
            if (r2 == 0) goto L3b
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L1f
            int r4 = r4.jqy     // Catch: java.lang.Throwable -> L1f
            if (r5 <= r4) goto L3b
            org.json.JSONObject r4 = r2.optJSONObject(r4)     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto L3b
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            goto L3c
        L3b:
            r5 = r1
        L3c:
            if (r5 != 0) goto L3f
            return r1
        L3f:
            r1 = r5
        L40:
            if (r2 == 0) goto L52
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L1f
            r5 = 1
            if (r4 <= r5) goto L52
            r4 = 0
            r2.remove(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "xRestCreatives"
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L1f
        L52:
            r3.remove(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "xRestResponse"
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L1f
        L5a:
            return r1
        L5b:
            java.lang.String r5 = "TemplateUtils"
            java.lang.String r6 = "filterTemplateInfo"
            com.bytedance.sdk.component.utils.qbp.ouw(r5, r6, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(com.bytedance.sdk.openadsdk.core.model.vpp, boolean, boolean):org.json.JSONObject");
    }

    public static JSONObject ouw(float f10, float f11, boolean z3, vpp vppVar, String str, lh lhVar) throws JSONException {
        vt = "";
        if (vppVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectOuw = ouw(f10, f11, z3, vppVar, str);
            if (lhVar != null) {
                lhVar.ouw("adv3");
            }
            pd pdVar = vppVar.lht;
            if (pdVar != null) {
                String str2 = pdVar.yu;
                if (!TextUtils.isEmpty(str2)) {
                    jSONObjectOuw.put("xTemplate", new JSONObject(str2));
                    vt = "getTemplate success by local data";
                    if (lhVar != null) {
                        lhVar.vt("local");
                        return jSONObjectOuw;
                    }
                } else {
                    String strOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw("adv3", pdVar.ouw, pdVar.vt);
                    if (!TextUtils.isEmpty(strOuw)) {
                        jSONObjectOuw.put("xTemplate", new JSONObject(strOuw));
                        vt = "getTemplate success by db data";
                        if (lhVar != null) {
                            lhVar.vt("local");
                            return jSONObjectOuw;
                        }
                    } else {
                        String str3 = "local db data is null id is " + pdVar.ouw + " md5 is " + pdVar.vt;
                        vt = str3;
                        if (lhVar != null) {
                            lhVar.ouw(3, str3, "net");
                        }
                    }
                }
            }
            return jSONObjectOuw;
        } catch (Exception e2) {
            String str4 = "load template exception " + e2.getMessage();
            vt = str4;
            if (lhVar != null) {
                lhVar.ouw(3, str4, "net");
            }
            return null;
        }
    }

    public static JSONObject ouw(float f10, float f11, boolean z3, vpp vppVar, String str) {
        c cVar;
        JSONObject jSONObject = null;
        if (vppVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectOuw = ouw(vppVar, true, true);
            if (jSONObjectOuw == null) {
                return null;
            }
            try {
                try {
                    if (jSONObjectOuw.has("h265_video")) {
                        jSONObjectOuw.remove("h265_video");
                    }
                    if (jSONObjectOuw.has("video") && (cVar = vppVar.f8309sd) != null) {
                        JSONObject jSONObjectA = cVar.a();
                        if ("open_ad".equals(str)) {
                            com.bytedance.sdk.openadsdk.core.zih.yu();
                            jSONObjectA.put("video_duration", cf.vm(String.valueOf(vppVar.fqk())));
                        } else {
                            jSONObjectA.put("video_duration", cVar.f6576d * cVar.f6588r);
                        }
                        jSONObjectOuw.put("video", jSONObjectA);
                    }
                } catch (Exception e2) {
                    ko.vt("TemplateUtils", e2.getMessage());
                }
                JSONObject jSONObjectVt = bs.vt(vppVar);
                jSONObjectVt.put("language", ryl.vt());
                jSONObjectOuw.put("xSetting", jSONObjectVt);
                jSONObjectOuw.put("xAdInfo", ouw(str, lh(vppVar), vppVar));
                JSONObject jSONObject2 = new JSONObject();
                bs.ouw(jSONObject2);
                jSONObject2.put("platform", "android");
                jSONObjectOuw.put("xAppInfo", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", f10);
                jSONObject3.put("height", f11);
                if (z3) {
                    jSONObject3.put("isLandscape", true);
                }
                jSONObjectOuw.put("xSize", jSONObject3);
                return jSONObjectOuw;
            } catch (Throwable unused) {
                jSONObject = jSONObjectOuw;
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
    }

    private static JSONObject ouw(String str, JSONObject jSONObject, vpp vppVar) throws JSONException {
        if (vppVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", bly.ouw().pno());
                    int iBly = bly.ouw().bly();
                    if (iBly != 0) {
                        int i4 = vppVar.kfa;
                        if (9 == i4) {
                            jSONObject2.put("app_icon", ouw);
                        } else if (10 == i4) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(iBly)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject ouw(JSONObject jSONObject, JSONObject jSONObject2) {
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
                for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i4);
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

    public static String ouw(vpp vppVar, String str) {
        List<zih> list;
        if (vppVar != null && (list = vppVar.tc) != null && list.size() > 0) {
            for (zih zihVar : list) {
                if (zihVar != null && TextUtils.equals(str, zihVar.ouw)) {
                    return zihVar.f8322le;
                }
            }
        }
        return null;
    }
}
