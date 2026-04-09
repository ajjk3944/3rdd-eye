package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ex {

    /* renamed from: cf, reason: collision with root package name */
    public JSONObject f8219cf;
    public int fkw;
    public pd ko;

    /* renamed from: le, reason: collision with root package name */
    public int f8221le;

    /* renamed from: lh, reason: collision with root package name */
    public int f8222lh;
    public int mwh;
    public int ouw;
    public String pno;
    public vt rn;
    public int ryl;
    public boolean tlj;
    public int yu;
    private JSONObject zih;
    public int vt = 10;
    public int ra = 1;
    public ouw bly = new ouw();

    /* renamed from: jg, reason: collision with root package name */
    public int f8220jg = 1;
    private String vm = "Next Ad";

    /* renamed from: th, reason: collision with root package name */
    private String f8223th = "Next ad in %1$ds";

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public int fkw;

        /* renamed from: lh, reason: collision with root package name */
        public int f8224lh;
        public int ouw;
        public int vt;
        public int yu;

        public final JSONObject ouw() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("padding_left", this.ouw);
                jSONObject.put("padding_right", this.vt);
                jSONObject.put("padding_top", this.f8224lh);
                jSONObject.put("padding_bottom", this.yu);
                jSONObject.put("card_spacing", this.fkw);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {
        public float fkw;

        /* renamed from: lh, reason: collision with root package name */
        public String f8225lh;
        public int ouw;
        public String vt;
        public float yu;
    }

    public static ex ouw(String str) {
        ex exVar = new ex();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                exVar.ouw = jSONObject.optInt("auto_switch");
                exVar.vt = jSONObject.optInt("playable_preload_count");
                exVar.f8222lh = jSONObject.optInt("disable_on_interaction");
                exVar.yu = jSONObject.optInt("ceiling_type");
                exVar.fkw = jSONObject.optInt("can_loop");
                exVar.f8221le = jSONObject.optInt("multi_skip_time", -1);
                exVar.ra = jSONObject.optInt("load_more_strategy");
                exVar.f8220jg = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                exVar.zih = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    pd pdVarOuw = pd.ouw(jSONObjectOptJSONObject);
                    exVar.ko = pdVarOuw;
                    if (pdVarOuw != null && !TextUtils.isEmpty(pdVarOuw.f8255lh)) {
                        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.cf.pno.ouw();
                        pd pdVar = exVar.ko;
                        ouwVar.ouw = pdVar.ouw;
                        ouwVar.vt = pdVar.vt;
                        ouwVar.f8158lh = pdVar.f8255lh;
                        ouwVar.yu = pdVar.yu;
                        com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVar, "guide");
                    }
                    int iOptInt = exVar.zih.optInt("delay_show_time", 5);
                    exVar.ryl = iOptInt;
                    if (iOptInt < 0) {
                        exVar.ryl = 5;
                    }
                    int iOptInt2 = exVar.zih.optInt("dismiss_after_idle_time", 3);
                    exVar.mwh = iOptInt2;
                    if (iOptInt2 <= 0) {
                        exVar.mwh = 3;
                    }
                }
                exVar.pno = jSONObject.optString("agg_endcard_url");
                exVar.tlj = jSONObject.optBoolean("has_more");
                exVar.f8219cf = jSONObject.optJSONObject("session_params");
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("layout_config");
                ouw ouwVar2 = new ouw();
                if (jSONObjectOptJSONObject2 != null) {
                    ouwVar2.ouw = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_left", 0));
                    ouwVar2.vt = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_right", 0));
                    ouwVar2.f8224lh = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_top", 0));
                    ouwVar2.yu = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_bottom", 0));
                    ouwVar2.fkw = Math.max(0, jSONObjectOptJSONObject2.optInt("card_spacing", 0));
                }
                exVar.bly = ouwVar2;
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("progress_config");
                vt vtVar = new vt();
                if (jSONObjectOptJSONObject3 != null) {
                    vtVar.ouw = jSONObjectOptJSONObject3.optInt("progress_type", 0);
                    vtVar.vt = jSONObjectOptJSONObject3.optString("progress_color");
                    vtVar.f8225lh = jSONObjectOptJSONObject3.optString("progress_background_color");
                    vtVar.yu = jSONObjectOptJSONObject3.optInt("progress_size", 0);
                    vtVar.fkw = jSONObjectOptJSONObject3.optInt("bar_radius", 0);
                }
                exVar.rn = vtVar;
            } catch (JSONException unused) {
            }
        }
        return exVar;
    }

    public final JSONObject vt() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auto_switch", this.ouw);
            jSONObject.put("playable_preload_count", this.vt);
            jSONObject.put("disable_on_interaction", this.f8222lh);
            jSONObject.put("ceiling_type", this.yu);
            jSONObject.put("can_loop", this.fkw);
            jSONObject.put("multi_skip_time", this.f8221le);
            jSONObject.put("load_more_strategy", this.ra);
            jSONObject.put("report_show_by_percent", this.f8220jg);
            jSONObject.put("gesture_tpl_info", this.zih);
            jSONObject.put("agg_endcard_url", this.pno);
            jSONObject.put("layoutConfig", this.bly.ouw());
            jSONObject.put("has_more", this.tlj);
            jSONObject.put("session_params", this.f8219cf);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final JSONObject ouw() {
        pd pdVar = this.ko;
        if (pdVar == null) {
            return null;
        }
        try {
            String str = pdVar.yu;
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str);
            }
            com.bytedance.sdk.openadsdk.core.cf.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw();
            pd pdVar2 = this.ko;
            String strOuw = vtVarOuw.ouw("guide", pdVar2.ouw, pdVar2.vt);
            if (TextUtils.isEmpty(strOuw)) {
                return null;
            }
            return new JSONObject(strOuw);
        } catch (JSONException unused) {
            return null;
        }
    }
}
