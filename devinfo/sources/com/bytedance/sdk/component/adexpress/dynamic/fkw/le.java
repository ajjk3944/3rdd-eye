package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.fkw;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    private static HashMap<String, String> ra;
    private lh fkw;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.yu f7240le;

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.lh f7241lh;
    private JSONObject ouw;
    private JSONObject vt;
    private ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        boolean f7242lh;
        float ouw;
        float vt;
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        ra = map;
        map.put("subtitle", "description");
        ra.put("source", "source|app.app_name");
        ra.put("screenshot", "dynamic_creative.screenshot");
    }

    public le(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.ouw = jSONObject;
        this.vt = jSONObject2;
        this.f7241lh = new com.bytedance.sdk.component.adexpress.dynamic.yu.lh(jSONObject2);
        ouw ouwVar = new ouw();
        if (jSONObject3 != null) {
            ouwVar.ouw = (float) jSONObject3.optDouble("width");
            ouwVar.vt = (float) jSONObject3.optDouble("height");
            ouwVar.f7242lh = jSONObject3.optBoolean("isLandscape");
        }
        this.yu = ouwVar;
        this.f7240le = com.bytedance.sdk.component.adexpress.dynamic.yu.yu.ouw(jSONObject4);
    }

    public final com.bytedance.sdk.component.adexpress.dynamic.yu.pno ouw(double d10, int i4, double d11, String str, mwh mwhVar) throws JSONException, NumberFormatException {
        JSONObject jSONObject;
        int iMwh;
        com.bytedance.sdk.component.adexpress.dynamic.yu.lh lhVar = this.f7241lh;
        Iterator<String> itKeys = lhVar.vt.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = lhVar.vt.opt(next);
            int i10 = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i10 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    lhVar.ouw.put(next + "." + i10 + "." + next2, objOpt2);
                                }
                            }
                            i10++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObject2 = new JSONObject((String) objOpt);
                        Iterator<String> itKeys3 = jSONObject2.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObject2.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i11 = 0; i11 < ((JSONArray) objOpt3).length(); i11++) {
                                    lhVar.ouw.put(next + "." + next3 + "." + i11, ((JSONArray) objOpt3).opt(i11));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    lhVar.ouw.put(next + "." + next3 + "." + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                lhVar.ouw(next, next3, objOpt3);
                            } else {
                                lhVar.ouw.put(next + "." + next3, objOpt3);
                            }
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } else if (objOpt instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject3.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject3.opt(next5);
                    lhVar.ouw.put(next + "." + next5, objOpt5);
                }
            } else {
                lhVar.ouw.put(next, objOpt);
                if (objOpt instanceof String) {
                    lhVar.ouw.put(next, objOpt);
                }
            }
        }
        try {
            jSONObject = new JSONObject(this.f7240le.vt);
        } catch (JSONException e10) {
            e10.printStackTrace();
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVarOuw = ouw(yu.ouw(this.ouw, jSONObject), null);
        if (pnoVarOuw != null) {
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh != null) {
                iMwh = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.mwh();
            } else {
                Context contextOuw = com.bytedance.sdk.component.adexpress.yu.ouw();
                if (contextOuw == null) {
                    contextOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.vt();
                }
                iMwh = contextOuw.getResources().getDisplayMetrics().widthPixels;
            }
            int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), iMwh);
            ouw ouwVar = this.yu;
            float fMin = ouwVar.f7242lh ? ouwVar.ouw : Math.min(ouwVar.ouw, iVt);
            if (this.yu.vt == 0.0f) {
                pnoVarOuw.f7305le = fMin;
                pnoVarOuw.bly.f7280lh.rn = "auto";
                pnoVarOuw.ra = 0.0f;
            } else {
                pnoVarOuw.f7305le = fMin;
                Context contextOuw2 = com.bytedance.sdk.component.adexpress.yu.ouw();
                Context contextOuw3 = com.bytedance.sdk.component.adexpress.yu.ouw();
                if (contextOuw3 == null) {
                    contextOuw3 = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.vt();
                }
                ((WindowManager) contextOuw3.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
                int iVt2 = com.bytedance.sdk.component.adexpress.yu.ra.vt(contextOuw2, r5.heightPixels);
                ouw ouwVar2 = this.yu;
                pnoVarOuw.ra = ouwVar2.f7242lh ? ouwVar2.vt : Math.min(ouwVar2.vt, iVt2);
                pnoVarOuw.bly.f7280lh.rn = "fixed";
            }
        }
        fkw fkwVar = new fkw(d10, i4, d11, str, mwhVar);
        fkw.ouw ouwVar3 = new fkw.ouw();
        ouw ouwVar4 = this.yu;
        ouwVar3.ouw = ouwVar4.ouw;
        ouwVar3.vt = ouwVar4.vt;
        ouwVar3.f7239lh = 0.0f;
        fkwVar.f7238lh = ouwVar3;
        fkwVar.ouw(pnoVarOuw);
        fkwVar.ouw();
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar = fkwVar.ouw;
        if (vtVar.yu == 65536.0f) {
            return null;
        }
        return vtVar.f7311le;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.pno ouw(org.json.JSONObject r21, com.bytedance.sdk.component.adexpress.dynamic.yu.pno r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.fkw.le.ouw(org.json.JSONObject, com.bytedance.sdk.component.adexpress.dynamic.yu.pno):com.bytedance.sdk.component.adexpress.dynamic.yu.pno");
    }

    private String ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f7241lh.ouw.containsKey(str2)) {
                String strValueOf = String.valueOf(this.f7241lh.ouw(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String ouw() {
        Object objOuw;
        com.bytedance.sdk.component.adexpress.dynamic.yu.lh lhVar = this.f7241lh;
        return (lhVar == null || (objOuw = lhVar.ouw("adx_name")) == null) ? "" : String.valueOf(objOuw);
    }

    private void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar) {
        JSONObject jSONObject;
        if (leVar == null) {
            return;
        }
        String str = leVar.vm;
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            String strOuw = com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw());
            if ("zh".equals(strOuw)) {
                strOuw = "cn";
            }
            if (!TextUtils.isEmpty(strOuw) && (jSONObject = leVar.yiz) != null) {
                String strOptString = jSONObject.optString(strOuw);
                if (!TextUtils.isEmpty(strOptString)) {
                    str = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iIndexOf = str.indexOf("{{");
        int iIndexOf2 = str.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strOuw2 = ouw(str.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb2 = new StringBuilder(str.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strOuw2)) {
                sb2.append(strOuw2);
            }
            sb2.append(str.substring(iIndexOf2 + 2));
            leVar.vm = sb2.toString();
            return;
        }
        leVar.vm = str;
    }
}
