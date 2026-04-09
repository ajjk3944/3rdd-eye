package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sf {
    private String bw;
    private int dg;
    private String emc;
    private int gbl;
    private int msw;
    private String ru;
    private String uym;
    private int xq;
    private String ycc;
    private String ypw;
    private String zz;

    public String bw() {
        return this.ycc;
    }

    public String dg() {
        return this.bw;
    }

    public String emc() {
        return this.uym;
    }

    public JSONObject gbl() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.emc)) {
                jSONObject.put("market_dpl", this.emc);
            }
            if (!TextUtils.isEmpty(this.ypw)) {
                jSONObject.put("market_dpl_auto", this.ypw);
            }
            if (!TextUtils.isEmpty(this.bw)) {
                jSONObject.put("market_pkg", this.bw);
            }
            if (!TextUtils.isEmpty(this.uym)) {
                jSONObject.put("app_pkg", this.uym);
            }
            if (!TextUtils.isEmpty(this.ycc)) {
                jSONObject.put("regex", this.ycc);
            }
            jSONObject.put("exec_type", this.xq);
            jSONObject.put("oem_vendor_type", this.dg);
            jSONObject.put("overlay", this.msw);
            jSONObject.put("gp_card", this.gbl);
            if (!TextUtils.isEmpty(this.zz)) {
                jSONObject.put("caller_id", this.zz);
            }
            if (!TextUtils.isEmpty(this.ru)) {
                jSONObject.put("ext_map", this.ru);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("OemModel", th.getMessage());
            return null;
        }
    }

    public boolean msw() {
        return this.dg == 2;
    }

    public String ru() {
        return this.xq == 2 ? this.ypw : this.emc;
    }

    public void uym(String str) {
        this.ypw = str;
    }

    public String xq() {
        return this.zz;
    }

    public void ycc(String str) {
        this.emc = str;
    }

    public int ypw() {
        return this.msw;
    }

    public boolean zz() {
        return this.gbl == 1;
    }

    public void bw(String str) {
        this.ycc = str;
    }

    public void dg(String str) {
        this.bw = str;
    }

    public void emc(String str) {
        this.uym = str;
    }

    public boolean uym() {
        return this.dg == 1;
    }

    public void xq(String str) {
        this.ru = str;
    }

    public int ycc() {
        return this.dg;
    }

    public void ypw(int i10) {
        this.msw = i10;
    }

    public void dg(int i10) {
        this.dg = i10;
    }

    public void emc(int i10) {
        this.gbl = i10;
    }

    public void xq(int i10) {
        this.xq = i10;
    }

    public void ypw(String str) {
        this.zz = str;
    }

    public static sf emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        sf sfVar = new sf();
        try {
            sfVar.ycc(jSONObject.optString("market_dpl", ""));
            sfVar.uym(jSONObject.optString("market_dpl_auto", ""));
            sfVar.xq(jSONObject.optInt("exec_type", 0));
            sfVar.dg(jSONObject.optInt("oem_vendor_type", 0));
            sfVar.dg(jSONObject.optString("market_pkg", ""));
            sfVar.bw(jSONObject.optString("regex", ""));
            sfVar.ypw(jSONObject.optInt("overlay", 1));
            sfVar.ypw(jSONObject.optString("caller_id", ""));
            sfVar.xq(jSONObject.optString("ext_map", null));
            sfVar.emc(jSONObject.optInt("gp_card", 0));
            sfVar.emc(jSONObject.optString("app_pkg", ""));
            return sfVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("OemModel", th.getMessage());
            return sfVar;
        }
    }

    public void emc(Intent intent) {
        if (TextUtils.isEmpty(this.ru)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.ru);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
