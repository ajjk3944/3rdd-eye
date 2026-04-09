package com.bytedance.sdk.openadsdk.vk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.vk.emc.dg;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    private static volatile xq emc;

    private xq() {
    }

    public static void dg() {
        emc("disk_log", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.7
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j6 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jEmc = xq.emc(file2);
                        j6 += jEmc;
                        jSONObject.put(file2.getName(), jEmc);
                    }
                }
                if (j6 < 524288000) {
                    return null;
                }
                return dg.ypw().emc("disk_log").ypw(jSONObject.toString());
            }
        });
    }

    public static xq emc() {
        if (emc == null) {
            synchronized (xq.class) {
                try {
                    if (emc == null) {
                        emc = new xq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    private boolean xq(dg dgVar) {
        return dgVar == null;
    }

    public static void ypw(final rie rieVar) {
        if (tp.emc(rieVar) == null || TextUtils.isEmpty(rieVar.qlw())) {
            return;
        }
        emc("download_gecko_start", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.14
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", rieVar.xst());
                jSONObject.put("channel_name", rieVar.qlw());
                return dg.ypw().emc("download_gecko_start").emc(rieVar.blf()).ypw(jSONObject.toString());
            }
        });
    }

    public void xq() {
        emc("blind_mode_status", true, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.5
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() {
                return dg.ypw().emc("blind_mode_status");
            }
        });
    }

    public void ypw(final dg dgVar) {
        if (xq(dgVar)) {
            return;
        }
        dgVar.emc("show_backup_endcard");
        aa.bw().emc(new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.17
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() {
                return dgVar;
            }
        });
    }

    public static void emc(final rie rieVar) {
        if (rieVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        emc("bidding_receive", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.1
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (rieVar.blf() == 3) {
                    jSONObject.put("is_icon_only", rieVar.xmt() ? 1 : 0);
                }
                return dg.ypw().emc("bidding_receive").ypw(jSONObject.toString());
            }
        });
    }

    public static void ypw() {
        iyl.xq(new msw("showFailLog") { // from class: com.bytedance.sdk.openadsdk.vk.xq.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    xq.emc().emc("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    ul.xq("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public static void emc(rie rieVar, final long j6) {
        if (rieVar == null) {
            return;
        }
        emc("bidding_load", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.8
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j6);
                return dg.ypw().emc("bidding_load").ypw(jSONObject.toString());
            }
        });
    }

    public static void emc(final String str, final com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVar) {
        if (emcVar == null) {
            return;
        }
        emc(str, false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.13
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObjectXq = emcVar.xq();
                if (jSONObjectXq == null) {
                    jSONObjectXq = new JSONObject();
                }
                rie rieVarEmc = emcVar.emc();
                jSONObjectXq.put("req_id", rieVarEmc.lvs());
                com.bytedance.sdk.openadsdk.dg.bw.ypw.xq xqVarBw = emcVar.bw();
                if (xqVarBw != null) {
                    xqVarBw.emc(jSONObjectXq);
                }
                return dg.ypw().emc(str).emc(rieVarEmc.blf()).ypw(jSONObjectXq.toString());
            }
        });
    }

    public static void emc(final rie rieVar, final JSONObject jSONObject) {
        if (tp.emc(rieVar) == null || TextUtils.isEmpty(rieVar.qlw())) {
            return;
        }
        emc("download_gecko_end", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.15
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", rieVar.xst());
                jSONObject2.put("channel_name", rieVar.qlw());
                jSONObject2.put("data", jSONObject);
                return dg.ypw().emc("download_gecko_end").emc(rieVar.blf()).ypw(jSONObject2.toString());
            }
        });
    }

    public void emc(final dg dgVar) {
        if (xq(dgVar)) {
            return;
        }
        dgVar.emc("express_ad_render");
        aa.bw().emc(new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.16
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() {
                return dgVar;
            }
        });
    }

    public void emc(final long j6, final long j7) {
        final long j8 = j7 - j6;
        emc("general_label", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.2
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() {
                int i = !qh.ypw.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j6);
                    jSONObject.put("endtime", j7);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return dg.ypw().emc("general_label").msw(String.valueOf(j8)).ypw(jSONObject.toString());
            }
        });
    }

    public void emc(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        emc(str, false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.4
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() {
                return dg.ypw().emc(str).ypw(jSONObject.toString());
            }
        });
    }

    public void emc(final JSONObject jSONObject) {
        if (jSONObject == null) {
            ul.emc("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            ul.emc("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            ul.emc("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            emc("ad_revenue", true, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.6
                @Override // com.bytedance.sdk.openadsdk.vk.ypw
                public com.bytedance.sdk.openadsdk.vk.emc.xq emc() {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put("uuid", sup.xq(aa.emc()));
                        String strEmc = "";
                        try {
                            if (sup.emc(aa.emc()) != null) {
                                strEmc = sup.emc(aa.emc());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", strEmc);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return dg.ypw().emc("ad_revenue").ypw(jSONObject.toString());
                }
            });
        }
    }

    public static long emc(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jEmc = 0;
        for (File file2 : file.listFiles()) {
            jEmc += emc(file2);
        }
        return jEmc;
    }

    public static void emc(String str, boolean z6, ypw ypwVar) {
        emc(str, z6, 100, ypwVar);
    }

    public static void emc(String str, boolean z6, int i, ypw ypwVar) {
        try {
            int iEmc = gbl.xq().emc(str, i);
            if (!TextUtils.isEmpty(str) && iEmc != 0 && ypwVar != null) {
                boolean z7 = iEmc == 100;
                if (!z7) {
                    z7 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= iEmc;
                }
                if (z7) {
                    aa.bw().emc(ypwVar, z6);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void emc(long j6, long j7, final String str, final int i) {
        if (j6 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j8 = jElapsedRealtime - j6;
        final long j9 = jElapsedRealtime - j7;
        final long j10 = j7 - j6;
        emc("ad_show_cost_time", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.9
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j8);
                jSONObject.put("renderDuration", j9);
                jSONObject.put("showToRenderDuration", j10);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return dg.ypw().emc("ad_show_cost_time").ypw(jSONObject.toString());
            }
        });
    }

    public static void emc(int i, String str) {
        emc(i, str, 0, (String) null);
    }

    public static void emc(final int i, final String str, final int i3, final String str2) {
        emc("ipv6_req", false, new ypw<com.bytedance.sdk.openadsdk.vk.emc.xq>() { // from class: com.bytedance.sdk.openadsdk.vk.xq.10
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i6 = i;
                if (i6 == 1) {
                    str3 = "success";
                } else if (i6 == -1) {
                    jSONObject.put("error_code", i3);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return dg.ypw().emc("ipv6_req").ypw(jSONObject.toString());
            }
        });
    }

    public static void emc(final String str, final boolean z6) {
        emc("img_error_param", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.11
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z6 ? 1 : 0);
                    jSONObject.put("msg", str);
                } catch (Throwable unused) {
                }
                return dg.ypw().emc("img_error_param").ypw(jSONObject.toString());
            }
        });
    }

    public static void emc(final boolean z6) {
        emc("web_container_reuse", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.vk.xq.12
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_hit", z6 ? 1 : 0);
                return dg.ypw().emc("web_container_reuse").ypw(jSONObject.toString());
            }
        });
    }
}
