package com.bytedance.sdk.openadsdk.vk.emc;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.vk.emc.dg;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg<T extends dg> implements xq {
    private String emc;
    private String gbl;
    private String ru;
    private String sup;
    private String sz;
    private String uym;
    private String xq;
    private String ypw;
    private String zz;
    private final String dg = BuildConfig.VERSION_NAME;
    private long bw = System.currentTimeMillis() / 1000;
    private int ycc = 0;
    private int msw = 0;

    private dg() {
        try {
            this.sz = db.emc();
        } catch (Throwable unused) {
            this.sz = com.unity3d.ads.BuildConfig.FLAVOR;
        }
    }

    private JSONObject cf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, tp.ycc());
            jSONObject.put("ua", tp.dg());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private T vk() {
        return this;
    }

    public static dg<dg> ypw() {
        return new dg<>();
    }

    public String bw() {
        return this.ypw;
    }

    public String dg() {
        return this.gbl;
    }

    @Override // com.bytedance.sdk.openadsdk.vk.emc.xq
    public JSONObject emc() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", uym());
            jSONObject2.put("app_version", tp.msw());
            jSONObject2.put(CampaignEx.JSON_KEY_TIMESTAMP, msw());
            jSONObject2.put("conn_type", sba.ypw(aa.emc()));
            jSONObject2.put("appid", TextUtils.isEmpty(zz.ypw().dg()) ? "" : zz.ypw().dg());
            jSONObject2.put("device_info", cf());
            if (!TextUtils.isEmpty(xq())) {
                jSONObject2.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, xq());
            }
            jSONObject2.put("error_code", gbl());
            if (!TextUtils.isEmpty(sup())) {
                jSONObject2.put("error_msg", sup());
            }
            if (!TextUtils.isEmpty(bw())) {
                jSONObject2.put("rit", bw());
            }
            if (!TextUtils.isEmpty(ycc())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, ycc());
            }
            if (zz() > 0) {
                jSONObject2.put("adtype", zz());
            }
            if (!TextUtils.isEmpty(ru())) {
                jSONObject2.put("req_id", ru());
            }
            if (!TextUtils.isEmpty(sz())) {
                jSONObject2.put("extra", sz());
            }
            String strDg = dg();
            if (TextUtils.isEmpty(strDg)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strDg);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.sz + "-" + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strDg)) {
                jSONObject2.put("event_extra", strDg);
            }
            if (!TextUtils.isEmpty(qh())) {
                jSONObject2.put("duration", qh());
            }
        } catch (Throwable th) {
            ul.xq("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    public int gbl() {
        return this.msw;
    }

    public long msw() {
        return this.bw;
    }

    public String qh() {
        return this.sup;
    }

    public String ru() {
        return this.uym;
    }

    public String sup() {
        return this.zz;
    }

    public String sz() {
        return this.ru;
    }

    public String uym() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public String xq() {
        return this.emc;
    }

    public String ycc() {
        return this.xq;
    }

    public int zz() {
        return this.ycc;
    }

    public T bw(String str) {
        this.uym = str;
        return (T) vk();
    }

    public T dg(String str) {
        this.xq = str;
        return (T) vk();
    }

    public T msw(String str) {
        this.sup = str;
        return (T) vk();
    }

    public T uym(String str) {
        this.ru = str;
        return (T) vk();
    }

    public T xq(String str) {
        this.ypw = str;
        return (T) vk();
    }

    public T ycc(String str) {
        this.zz = str;
        return (T) vk();
    }

    public T ypw(String str) {
        this.gbl = str;
        return (T) vk();
    }

    public T ypw(int i10) {
        this.msw = i10;
        return (T) vk();
    }

    public T emc(String str) {
        this.emc = str;
        return (T) vk();
    }

    public T emc(int i10) {
        this.ycc = i10;
        return (T) vk();
    }
}
