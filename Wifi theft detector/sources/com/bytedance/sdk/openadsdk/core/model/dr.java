package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dr {

    /* renamed from: aa, reason: collision with root package name */
    private String f9290aa;
    private String bw;
    private int cf;
    private int dg;
    private int emc;
    private int gbl;
    private int msw;
    private int qh;
    private boolean ru;
    private String sba;
    private int sup;
    private int sz;
    private int uym;
    private String vk;
    private boolean xq;
    private String ycc;
    private int ypw;
    private int zz;

    public dr(JSONObject jSONObject) {
        this.sup = 5;
        this.sz = 5;
        this.qh = 10;
        this.cf = 20;
        this.vk = "Next Ad";
        this.f9290aa = "Next ad in %1$ds";
        this.sba = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.xq = jSONObject.optBoolean("is_playable");
        this.dg = jSONObject.optInt("playable_type", 0);
        this.bw = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.ycc = jSONObjectOptJSONObject.optString("playable_url", "");
            this.uym = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.ypw = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.emc = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iEmc = emc(this.dg);
            this.msw = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iEmc);
            this.zz = jSONObjectOptJSONObject.optInt("playable_js_timeout", iEmc);
            this.ru = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.sup = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.sz = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.qh = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.cf = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.f9290aa = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.vk = jSONObjectOptJSONObject.optString("next_ad_text");
            this.sba = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.gbl = iOptInt;
            if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                return;
            }
            this.gbl = 0;
        }
    }

    public static long aa(rie rieVar) {
        return Math.max(sba(rieVar), yzg(rieVar));
    }

    public static int cf(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return 0;
        }
        return drVarSf.uym;
    }

    public static int db(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return 0;
        }
        return drVarSf.xq();
    }

    private static int dr(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return 0;
        }
        return drVarSf.dg;
    }

    public static int ee(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return 0;
        }
        return drVarSf.ypw();
    }

    private static int emc(int i10) {
        return i10 == 1 ? 10 : 5;
    }

    public static String gbl(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return null;
        }
        return drVarSf.ycc;
    }

    public static String hxp(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return null;
        }
        return drVarSf.ycc();
    }

    public static boolean msw(rie rieVar) {
        dr drVarCn = rieVar.cn();
        return drVarCn != null && rieVar.yo() && drVarCn.xq && drVarCn.ypw == 1;
    }

    public static boolean qh(rie rieVar) {
        b bVarIat = rieVar.iat();
        return bVarIat != null && bVarIat.x() == 1;
    }

    public static String rie(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return null;
        }
        return drVarSf.uym();
    }

    public static String ru(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return null;
        }
        return drVarSf.bw;
    }

    public static int sb(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return 0;
        }
        return drVarSf.dg();
    }

    public static long sba(rie rieVar) {
        if (sf(rieVar) == null) {
            return 5L;
        }
        return r2.msw();
    }

    private static dr sf(rie rieVar) {
        if (rieVar == null) {
            return null;
        }
        return rieVar.cn();
    }

    public static String sra(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return null;
        }
        return drVarSf.bw();
    }

    public static String sup(rie rieVar) {
        if (rieVar == null) {
            return null;
        }
        dr drVarCn = rieVar.cn();
        if (drVarCn != null && drVarCn.xq) {
            String str = drVarCn.ycc;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (rieVar.fu() == 20) {
            return rieVar.xst();
        }
        if (rieVar.iat() != null) {
            return rieVar.iat().v();
        }
        return null;
    }

    public static boolean sz(rie rieVar) {
        return true;
    }

    public static boolean ul(rie rieVar) {
        dr drVarSf = sf(rieVar);
        return drVarSf != null && drVarSf.ru();
    }

    public static boolean vk(rie rieVar) {
        return false;
    }

    public static int ylm(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return 0;
        }
        return drVarSf.emc();
    }

    public static long yzg(rie rieVar) {
        if (sf(rieVar) == null) {
            return 5L;
        }
        return r2.zz();
    }

    public static int zz(rie rieVar) {
        dr drVarSf = sf(rieVar);
        if (drVarSf == null) {
            return 0;
        }
        return drVarSf.gbl;
    }

    public String bw() {
        return this.vk;
    }

    public int dg() {
        return this.cf;
    }

    public String uym() {
        return this.sba;
    }

    public int xq() {
        return this.qh;
    }

    public String ycc() {
        return this.f9290aa;
    }

    public int ypw() {
        return this.sz;
    }

    public static boolean bw(rie rieVar) {
        dr drVarSf = sf(rieVar);
        return drVarSf != null && rieVar.yo() && drVarSf.xq && !TextUtils.isEmpty(sup(rieVar));
    }

    public static boolean dg(rie rieVar) {
        return xq(rieVar) && !uym(rieVar);
    }

    public static boolean uym(rie rieVar) {
        dr drVarCn = rieVar.cn();
        return drVarCn != null && drVarCn.xq && drVarCn.ypw == 1;
    }

    public static boolean xq(rie rieVar) {
        return ypw(rieVar) && dr(rieVar) == 1;
    }

    public static boolean ycc(rie rieVar) {
        return bw(rieVar) && dr(rieVar) == 1;
    }

    public static boolean ypw(rie rieVar) {
        dr drVarSf = sf(rieVar);
        return (drVarSf == null || !drVarSf.xq || TextUtils.isEmpty(sup(rieVar))) ? false : true;
    }

    public int emc() {
        return this.sup;
    }

    public static int emc(rie rieVar) {
        int i10;
        dr drVarCn = rieVar.cn();
        if (drVarCn != null && (i10 = drVarCn.emc) >= 0 && i10 <= 100) {
            return i10;
        }
        return 0;
    }

    public boolean ru() {
        return this.ru;
    }

    public int zz() {
        return this.zz;
    }

    public int msw() {
        return this.msw;
    }

    public void emc(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.xq);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.xq("PlayableModel", e10.getMessage());
        }
        if (!TextUtils.isEmpty(this.ycc)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.ycc);
                jSONObject2.put("playable_orientation", this.uym);
                jSONObject2.put("new_style", this.ypw);
                jSONObject2.put("close_2_app", this.emc);
                jSONObject2.put("playable_webview_timeout", this.msw);
                jSONObject2.put("playable_js_timeout", this.zz);
                jSONObject2.put("playable_backup_enable", this.ru ? 1 : 0);
                jSONObject2.put("wait_tips_time", this.sup);
                jSONObject2.put("auto_to_next_time", this.sz);
                jSONObject2.put("next_ad_tips_show_time", this.qh);
                jSONObject2.put("max_show_time", this.cf);
                jSONObject2.put("next_ad_in_xs", this.f9290aa);
                jSONObject2.put("play_now_text", this.sba);
                jSONObject2.put("next_ad_text", this.vk);
                jSONObject2.put("countdown_show_type", this.gbl);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e11) {
                com.bytedance.sdk.component.utils.ul.xq("PlayableModel", e11.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.dg);
        } catch (JSONException e12) {
            com.bytedance.sdk.component.utils.ul.xq("PlayableModel", e12.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.bw);
        } catch (JSONException e13) {
            com.bytedance.sdk.component.utils.ul.xq("PlayableModel", e13.getMessage());
        }
    }
}
