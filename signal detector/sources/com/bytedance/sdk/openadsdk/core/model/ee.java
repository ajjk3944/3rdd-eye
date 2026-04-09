package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ee {
    private int bw;
    private int dg;
    private int emc;
    private boolean gbl;
    private int qh;
    private cuf sba;
    private JSONObject sup;
    private int sz;
    private JSONObject uym;
    private int xq;
    private int ycc;
    private ypw yzg;
    private String zz;
    private int ypw = 10;
    private int msw = 1;
    private emc ru = new emc();
    private int cf = 1;
    private String vk = "Next Ad";
    private String aa = "Next ad in %1$ds";

    public static ee emc(String str) {
        ee eeVar = new ee();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                eeVar.emc = jSONObject.optInt("auto_switch");
                eeVar.ypw = jSONObject.optInt("playable_preload_count");
                eeVar.xq = jSONObject.optInt("disable_on_interaction");
                eeVar.dg = jSONObject.optInt("ceiling_type");
                eeVar.bw = jSONObject.optInt("can_loop");
                eeVar.ycc = jSONObject.optInt("multi_skip_time", -1);
                eeVar.msw = jSONObject.optInt("load_more_strategy");
                eeVar.cf = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                eeVar.uym = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    cuf cufVarEmc = cuf.emc(jSONObjectOptJSONObject);
                    eeVar.sba = cufVarEmc;
                    if (cufVarEmc != null && !TextUtils.isEmpty(cufVarEmc.xq())) {
                        com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc(new com.bytedance.sdk.openadsdk.core.gbl.msw.emc().emc(eeVar.sba.emc()).ypw(eeVar.sba.ypw()).xq(eeVar.sba.xq()).dg(eeVar.sba.dg()), "guide");
                    }
                    int iOptInt = eeVar.uym.optInt("delay_show_time", 5);
                    eeVar.sz = iOptInt;
                    if (iOptInt < 0) {
                        eeVar.sz = 5;
                    }
                    int iOptInt2 = eeVar.uym.optInt("dismiss_after_idle_time", 3);
                    eeVar.qh = iOptInt2;
                    if (iOptInt2 <= 0) {
                        eeVar.qh = 3;
                    }
                }
                eeVar.zz = jSONObject.optString("agg_endcard_url");
                eeVar.gbl = jSONObject.optBoolean("has_more");
                eeVar.sup = jSONObject.optJSONObject("session_params");
                eeVar.ru = emc.emc(jSONObject.optJSONObject("layout_config"));
                eeVar.yzg = ypw.emc(jSONObject.optJSONObject("progress_config"));
            } catch (JSONException unused) {
            }
        }
        return eeVar;
    }

    public ypw aa() {
        return this.yzg;
    }

    public int bw() {
        return this.qh;
    }

    public boolean cf() {
        return this.emc == 1;
    }

    public int dg() {
        return this.sz;
    }

    public boolean gbl() {
        return this.dg == 1;
    }

    public int msw() {
        return this.msw;
    }

    public boolean qh() {
        return this.xq == 1;
    }

    public boolean ru() {
        return this.bw == 1;
    }

    public JSONObject sba() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auto_switch", this.emc);
            jSONObject.put("playable_preload_count", this.ypw);
            jSONObject.put("disable_on_interaction", this.xq);
            jSONObject.put("ceiling_type", this.dg);
            jSONObject.put("can_loop", this.bw);
            jSONObject.put("multi_skip_time", this.ycc);
            jSONObject.put("load_more_strategy", this.msw);
            jSONObject.put("report_show_by_percent", this.cf);
            jSONObject.put("gesture_tpl_info", this.uym);
            jSONObject.put("agg_endcard_url", this.zz);
            jSONObject.put("layoutConfig", this.ru.ycc());
            jSONObject.put("has_more", this.gbl);
            jSONObject.put("session_params", this.sup);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject sup() {
        return this.sup;
    }

    public boolean sz() {
        return this.gbl;
    }

    public String uym() {
        return this.zz;
    }

    public int vk() {
        return this.ypw;
    }

    public JSONObject xq() {
        cuf cufVar = this.sba;
        if (cufVar == null) {
            return null;
        }
        return cufVar.bw();
    }

    public emc ycc() {
        return this.ru;
    }

    public JSONObject ypw() {
        cuf cufVar = this.sba;
        if (cufVar == null) {
            return null;
        }
        try {
            String strDg = cufVar.dg();
            if (!TextUtils.isEmpty(strDg)) {
                return new JSONObject(strDg);
            }
            String strEmc = com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc("guide", this.sba.emc(), this.sba.ypw());
            if (TextUtils.isEmpty(strEmc)) {
                return null;
            }
            return new JSONObject(strEmc);
        } catch (JSONException unused) {
            return null;
        }
    }

    public int zz() {
        return this.ycc;
    }

    public static class emc {
        private int bw;
        private int dg;
        private int emc;
        private int xq;
        private int ypw;

        public static emc emc(JSONObject jSONObject) {
            emc emcVar = new emc();
            if (jSONObject == null) {
                return emcVar;
            }
            emcVar.emc = Math.max(0, jSONObject.optInt("padding_left", 0));
            emcVar.ypw = Math.max(0, jSONObject.optInt("padding_right", 0));
            emcVar.xq = Math.max(0, jSONObject.optInt("padding_top", 0));
            emcVar.dg = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            emcVar.bw = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return emcVar;
        }

        public int bw() {
            return this.bw;
        }

        public int dg() {
            return this.ypw;
        }

        public int xq() {
            return this.emc;
        }

        public JSONObject ycc() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("padding_left", this.emc);
                jSONObject.put("padding_right", this.ypw);
                jSONObject.put("padding_top", this.xq);
                jSONObject.put("padding_bottom", this.dg);
                jSONObject.put("card_spacing", this.bw);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public int ypw() {
            return this.xq;
        }

        public int emc() {
            return this.dg;
        }
    }

    public static class ypw {
        private float bw;
        private float dg;
        private int emc;
        private String xq;
        private String ypw;

        public static ypw emc(JSONObject jSONObject) {
            ypw ypwVar = new ypw();
            if (jSONObject == null) {
                return ypwVar;
            }
            ypwVar.emc = jSONObject.optInt("progress_type", 0);
            ypwVar.ypw = jSONObject.optString("progress_color");
            ypwVar.xq = jSONObject.optString("progress_background_color");
            ypwVar.dg = jSONObject.optInt("progress_size", 0);
            ypwVar.bw = jSONObject.optInt("bar_radius", 0);
            return ypwVar;
        }

        public float bw() {
            return this.bw;
        }

        public float dg() {
            return this.dg;
        }

        public String xq() {
            return this.xq;
        }

        public String ypw() {
            return this.ypw;
        }

        public int emc() {
            return this.emc;
        }
    }

    public boolean emc() {
        return this.cf == 1;
    }
}
