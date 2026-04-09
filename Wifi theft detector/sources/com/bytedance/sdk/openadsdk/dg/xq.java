package com.bytedance.sdk.openadsdk.dg;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sb;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import com.bytedance.sdk.openadsdk.dg.emc;
import com.bytedance.sdk.openadsdk.dg.ypw;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.mxo;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    public static void bw(rie rieVar, final com.bytedance.sdk.openadsdk.vk.emc.emc emcVar, final String str) {
        emc(System.currentTimeMillis(), rieVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.30
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                try {
                    com.bytedance.sdk.openadsdk.vk.emc.emc emcVar2 = emcVar;
                    if (emcVar2 == null || emcVar2.emc() == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", emcVar.emc());
                    jSONObject.put("hit_extra", emcVar.ypw());
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", emcVar.xq());
                    jSONObject.put("current_url_index", emcVar.dg());
                    jSONObject.put("arbi_start_x", emcVar.bw());
                    jSONObject.put("arbi_start_y", emcVar.ycc());
                    jSONObject.put("click_duration", emcVar.uym());
                    jSONObject.put("is_trigger_jump", emcVar.msw());
                    jSONObject.put("click_type", String.valueOf(emcVar.yzg()));
                } catch (Throwable th) {
                    ul.xq("TTAD.AdEvent", "onWebBehaviorClick", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void dg(final rie rieVar, final String str, final int i10) {
        emc(System.currentTimeMillis(), rieVar, str, "material_status", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.13
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i10);
                    jSONObject.put("image_mode", rieVar.in());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void xq(rie rieVar, String str, final long j10) {
        emc(System.currentTimeMillis(), rieVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.6
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable th) {
                    ul.xq("TTAD.AdEvent", th.getMessage());
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    public static void ycc(rie rieVar, String str, final JSONObject jSONObject) {
        emc(System.currentTimeMillis(), rieVar, str, "click_playable_button", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.47
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                return jSONObject;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject ypw(rie rieVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (dr.ypw(rieVar) && rieVar.yo()) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th) {
                ul.xq(th.getMessage(), new Object[0]);
            }
        }
        emc(jSONObject);
        return jSONObject;
    }

    public static void bw(rie rieVar, String str, final JSONObject jSONObject) {
        emc(System.currentTimeMillis(), rieVar, str, "click_next_ad_button", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.46
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                return jSONObject;
            }
        });
    }

    public static void dg(rie rieVar, final com.bytedance.sdk.openadsdk.vk.emc.emc emcVar, final String str) {
        emc(System.currentTimeMillis(), rieVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.29
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", emcVar.xq());
                    jSONObject.put("current_url_index", emcVar.dg());
                    jSONObject.put("trigger_scroll_x", emcVar.zz());
                    jSONObject.put("trigger_scroll_y", emcVar.ru());
                    jSONObject.put("arbi_offset_y", emcVar.gbl());
                    jSONObject.put("scroll_type", emcVar.sup());
                    jSONObject.put("scroll_duration", emcVar.sz());
                } catch (Throwable th) {
                    ul.xq("TTAD.AdEvent", "onWebBehaviorScroll", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    @WorkerThread
    public static void emc() throws ClassNotFoundException {
        try {
            Class.forName(xq.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void xq(rie rieVar, String str, final int i10) {
        emc(System.currentTimeMillis(), rieVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.8
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.gbl.xq().hxp());
                    return jSONObject;
                } catch (Throwable th) {
                    ul.xq(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static class emc {
        public static void emc(String str, final JSONObject jSONObject, rie rieVar) {
            String strEmc = tp.emc(rieVar);
            if (strEmc == null) {
                return;
            }
            xq.emc(System.currentTimeMillis(), rieVar, strEmc + "_landingpage", str, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.emc.1
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject xq() {
                    return jSONObject;
                }
            });
        }

        public static void emc(final int i10, final int i11, rie rieVar) {
            String strEmc = tp.emc(rieVar);
            if (strEmc == null) {
                return;
            }
            xq.emc(System.currentTimeMillis(), rieVar, strEmc + "_landingpage", "local_res_hit_rate", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.emc.2
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject xq() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i11);
                        jSONObject.put("hit_times", i10);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        public static void emc(final long j10, final rie rieVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            xq.emc(System.currentTimeMillis(), rieVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.emc.3
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject emc() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(rie.ypw, rieVar.oug() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject xq() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(iLoader, str2);
                        jSONObject.put("url", rieVar.xst());
                        jSONObject.put("channel_name", rieVar.qlw());
                        jSONObject.put("interceptor_status", (TextUtils.isEmpty(rieVar.qlw()) || iEmc <= 0) ? 0 : 1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", iEmc);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject ypw() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", j10);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        public static void emc(final int i10, final int i11, final int i12, final int i13, final rie rieVar, String str, final int i14) {
            if (str == null || TextUtils.isEmpty(rieVar.qlw())) {
                return;
            }
            xq.emc(System.currentTimeMillis(), rieVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.emc.4
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject xq() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", rieVar.xst());
                        jSONObject.put("channel_name", rieVar.qlw());
                        jSONObject.put("preload_status", i10 <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i14);
                        jSONObject.put("preload_h5_type", rieVar.tp());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i10);
                        jSONObject2.put("failResourceCount", i11);
                        jSONObject2.put("successCount", i12);
                        jSONObject2.put("failCount", i13);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void dg(rie rieVar, String str, final JSONObject jSONObject) {
        emc(System.currentTimeMillis(), rieVar, str, "show_next_ad_hint", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.45
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                return jSONObject;
            }
        });
    }

    public static void emc(rie rieVar, String str, final int i10) {
        emc(System.currentTimeMillis(), rieVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.1
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i10));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void xq(final rie rieVar, String str) {
        if (rieVar == null || !rie.xq(rieVar) || rieVar.iyl() == null) {
            return;
        }
        emc(System.currentTimeMillis(), rieVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.25
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", rieVar.iyl().xq());
                    jSONObject.putOpt("id", rieVar.iyl().emc());
                    jSONObject.putOpt("md5", rieVar.iyl().ypw());
                    if (rieVar.iat() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(rieVar.iat().f()));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void emc(final rie rieVar, String str) {
        emc(System.currentTimeMillis(), rieVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.12
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (rie.xq(rieVar)) {
                        if (rieVar.iyl() != null) {
                            jSONObject.putOpt("url", rieVar.iyl().xq());
                            jSONObject.putOpt("id", rieVar.iyl().emc());
                            jSONObject.putOpt("md5", rieVar.iyl().ypw());
                        }
                        if (rieVar.iat() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", rieVar.iat().v());
                        jSONObject.putOpt("style_id", rieVar.rtt());
                        if (rieVar.iat() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e10) {
                    ul.xq(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void emc(final rie rieVar, String str, final long j10) {
        emc(System.currentTimeMillis(), rieVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.22
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (rie.xq(rieVar)) {
                        if (rieVar.iyl() != null) {
                            jSONObject.putOpt("url", rieVar.iyl().xq());
                            jSONObject.putOpt("id", rieVar.iyl().emc());
                            jSONObject.putOpt("md5", rieVar.iyl().ypw());
                        }
                        if (rieVar.iat() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", rieVar.iat().v());
                        jSONObject.putOpt("style_id", rieVar.rtt());
                        if (rieVar.iat() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e10) {
                    ul.xq(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void xq(rie rieVar, final com.bytedance.sdk.openadsdk.vk.emc.emc emcVar, final String str) {
        emc(System.currentTimeMillis(), rieVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.28
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", emcVar.xq());
                    jSONObject.put("current_url_index", emcVar.dg());
                    jSONObject.put("arbi_stay_duration", emcVar.qh());
                    jSONObject.put("browsing_percentage", emcVar.cf());
                    jSONObject.put("out_focus_scene", emcVar.vk());
                } catch (Throwable th) {
                    ul.xq("TTAD.AdEvent", "onWebBehaviorStay", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void emc(final rie rieVar, String str, final long j10, final int i10, final String str2, final String str3) {
        emc(System.currentTimeMillis(), rieVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.32
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (rie.xq(rieVar)) {
                        if (rieVar.iyl() != null) {
                            jSONObject.putOpt("url", rieVar.iyl().xq());
                            jSONObject.putOpt("id", rieVar.iyl().emc());
                            jSONObject.putOpt("md5", rieVar.iyl().ypw());
                        }
                        if (rieVar.iat() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", rieVar.iat().v());
                        jSONObject.putOpt("style_id", rieVar.rtt());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (rieVar.iat() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_msg", str2);
                    return jSONObject;
                } catch (Exception e10) {
                    ul.xq(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void xq(rie rieVar, String str, String str2, final JSONObject jSONObject) {
        if (rieVar == null || jSONObject == null) {
            return;
        }
        emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.35
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                return jSONObject;
            }
        });
    }

    public static void ypw(rie rieVar, String str, final long j10) {
        if (rieVar != null && j10 > 0 && j10 < 200000) {
            emc(System.currentTimeMillis(), rieVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.3
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject xq() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void emc(final rie rieVar, String str, final long j10, final int i10, final int i11) {
        emc(System.currentTimeMillis(), rieVar, str, "load", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.43
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(rieVar.nw()));
                    jSONObject.put("first_page", i11);
                    jSONObject.put("preload_h5_type", rieVar.tp());
                    int i12 = i10;
                    if (i12 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i12));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", Math.min(j10, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void xq(rie rieVar, String str, JSONObject jSONObject) {
        if (rieVar == null) {
            return;
        }
        emc(rieVar, str, -1L, jSONObject, (JSONObject) null);
    }

    public static void ypw(rie rieVar, String str, final int i10) {
        emc(System.currentTimeMillis(), rieVar, str, "check_meta", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.7
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.gbl.xq().hxp());
                    return jSONObject;
                } catch (Throwable th) {
                    ul.xq(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void emc(String str, rie rieVar, String str2, final Map<String, Object> map) {
        emc(System.currentTimeMillis(), rieVar, str2, str, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.48
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                try {
                    if (map == null) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static void ypw(final rie rieVar, String str) {
        emc(System.currentTimeMillis(), rieVar, str, "picture_click", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.14
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", rieVar.mfx());
                    jSONObject.put("interaction_method", rieVar.nw());
                    return jSONObject;
                } catch (Throwable th) {
                    ul.xq(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    @DungeonFlag
    public static void emc(rie rieVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        emc(rieVar, "show", str, jSONObject, jSONObject2);
    }

    public static void ypw(rie rieVar, String str, String str2, final JSONObject jSONObject) {
        emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.18
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    private static void emc(final rie rieVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (rieVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (rieVar.yz() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            rieVar.msw(true);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        emc(new com.bytedance.sdk.component.msw.msw("onShow") { // from class: com.bytedance.sdk.openadsdk.dg.xq.49
            @Override // java.lang.Runnable
            public void run() {
                final String strEmc;
                if (com.bytedance.sdk.openadsdk.core.aa.dg().ul()) {
                    strEmc = com.bytedance.sdk.openadsdk.core.ru.emc.emc.emc((Application) com.bytedance.sdk.openadsdk.core.aa.emc()).emc(str2, DeviceUtils.emc(), rieVar.tx());
                } else {
                    strEmc = "none";
                }
                xq.emc(jCurrentTimeMillis, rieVar, str2, str, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.49.1
                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject emc() {
                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                        JSONObject jSONObject3 = jSONObject2;
                        return jSONObject3 == null ? xq.ypw(rieVar, new JSONObject()) : xq.ypw(rieVar, jSONObject3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject xq() {
                        try {
                            AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                jSONObject3.put("interaction_method", rieVar.nw());
                                AnonymousClass49 anonymousClass492 = AnonymousClass49.this;
                                jSONObject.put("real_interaction_method", rieVar.fu());
                                jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.aa.dg().sz(String.valueOf(rieVar.tx())));
                                jSONObject.put("au_show", strEmc);
                                return jSONObject;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", rieVar.nw());
                            jSONObject4.put("real_interaction_method", rieVar.fu());
                            jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.aa.dg().sz(String.valueOf(rieVar.tx())));
                            jSONObject4.put("au_show", strEmc);
                            return jSONObject4;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject ypw() throws JSONException {
                        Object obj;
                        try {
                            sb.ypw(rieVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", rieVar.wdp());
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - rieVar.ipz()).floatValue();
                                if (fFloatValue <= 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                                long jElapsedRealtime = SystemClock.elapsedRealtime() - rieVar.zz();
                                if (jElapsedRealtime > 0) {
                                    jSONObject3.put("duration", jElapsedRealtime);
                                }
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(rieVar.nx()));
                                String strVum = rieVar.vum();
                                if (!TextUtils.isEmpty(strVum) && !TextUtils.isEmpty(strVum)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(strVum) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        ul.xq("TTAD.AdEvent", th.getMessage());
                                    }
                                }
                                if (rieVar.zek() == null) {
                                    return jSONObject3;
                                }
                                try {
                                    Object obj2 = rieVar.zek().get(TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = rieVar.zek().get("price")) == null) {
                                        return jSONObject3;
                                    }
                                    jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject3;
                                } catch (Throwable th2) {
                                    ul.emc("TTAD.AdEvent", "client bidding price error: ", th2);
                                    return jSONObject3;
                                }
                            } catch (Exception unused) {
                                return jSONObject3;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                });
                if ("show".equals(str)) {
                    if (!rieVar.jnq()) {
                        if (rieVar.tze()) {
                            com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(rieVar.cwv(), new xq.ypw("show_urls", rieVar));
                        } else {
                            xq.emc(rieVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int iOptInt = jSONObject3.optInt("dynamic_show_type");
                        if (rieVar.xxg() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            com.bytedance.sdk.component.utils.zz.emc().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.xq.49.2
                                @Override // java.lang.Runnable
                                public void run() throws JSONException {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                                        xq.ypw(rieVar, str2, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject4);
                                    } catch (Exception unused) {
                                        ul.xq("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.gbl.xq().pxj());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.ru.xq.emc(rieVar, strEmc);
                }
            }
        });
    }

    public static void ypw(final long j10, final rie rieVar, String str, final String str2) {
        emc(System.currentTimeMillis(), rieVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.24
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (rie.xq(rieVar)) {
                        if (rieVar.iyl() != null) {
                            jSONObject.putOpt("url", rieVar.iyl().xq());
                            jSONObject.putOpt("id", rieVar.iyl().emc());
                            jSONObject.putOpt("md5", rieVar.iyl().ypw());
                        }
                        jSONObject.putOpt("from", str2);
                        if (rieVar.iat() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.put("url", rieVar.iat().v());
                        jSONObject.put("style_id", rieVar.rtt());
                        if (rieVar.iat() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e10) {
                    ul.xq(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                    return jSONObject;
                } catch (Exception e10) {
                    ul.xq(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void ypw(rie rieVar, final com.bytedance.sdk.openadsdk.vk.emc.emc emcVar, final String str) {
        emc(System.currentTimeMillis(), rieVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.27
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", emcVar.xq());
                    jSONObject.put("current_url_index", emcVar.dg());
                    jSONObject.put("arbi_load_duration", emcVar.sba());
                } catch (Throwable th) {
                    ul.xq("TTAD.AdEvent", "onWebBehaviorLoad", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void ypw(rie rieVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        if (rieVar == null || jSONObject == null) {
            return;
        }
        emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.34
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void ypw(rie rieVar, String str, final JSONObject jSONObject) {
        emc(System.currentTimeMillis(), rieVar, str, ypw.ycc, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.37
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                return jSONObject;
            }
        });
    }

    public static void ypw(rie rieVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        emc(rieVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    private static void emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectEmc = msw.emc();
            if (jSONObjectEmc != null) {
                Iterator<String> itKeys = jSONObjectEmc.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectEmc.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void ypw(rie rieVar, String str, int i10, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, i10);
        } catch (JSONException unused) {
        }
        ypw(rieVar, str, "download_app_ad_track", jSONObject);
    }

    public static void emc(rie rieVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.sup.emc(com.bytedance.sdk.openadsdk.core.aa.emc()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(com.bytedance.sdk.openadsdk.ee.emc.emc(rieVar.cwv(), true), 1, rieVar.ye());
    }

    @DungeonFlag
    public static void emc(final String str, final rie rieVar, final String str2, final uym uymVar) {
        if (rieVar == null || uymVar == null || !uymVar.emc()) {
            return;
        }
        emc(System.currentTimeMillis(), rieVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.50
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                try {
                    uym uymVar2 = uymVar;
                    if (uymVar2 == null || uymVar2.ypw() == null) {
                        return null;
                    }
                    JSONObject jSONObjectYpw = uymVar.ypw();
                    if (str2.equals("open_ad")) {
                        jSONObjectYpw.put("is_icon_only", rieVar.xmt() ? 1 : 0);
                    }
                    return jSONObjectYpw;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void emc(final rie rieVar, final String str, final mxo mxoVar) {
        if (rieVar == null) {
            return;
        }
        final long jDg = mxoVar.dg();
        emc(System.currentTimeMillis(), rieVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.2
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jDg);
                    jSONObject.put("click_time", mxoVar.emc);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", rieVar.xmt() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void emc(rie rieVar, final String str, final int i10, final String str2, final long j10, final boolean z10, final int i11, final long j11) {
        emc(System.currentTimeMillis(), rieVar, str, ypw.dg, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.4
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j10);
                    jSONObject.put("arbi_trigger_start", z10);
                    jSONObject.put("arbi_convert_count", i11);
                    jSONObject.put("loading_start_timestamp", j11);
                } catch (Throwable th) {
                    ul.xq(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void emc(rie rieVar, String str, final long j10, final boolean z10) {
        emc(System.currentTimeMillis(), rieVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.5
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z10 ? 1 : 2);
                    return jSONObject;
                } catch (Throwable th) {
                    ul.xq(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                    return jSONObject;
                } catch (Throwable th) {
                    ul.xq(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void emc(rie rieVar, String str, final int i10, final String str2, final int i11) {
        emc(System.currentTimeMillis(), rieVar, str, ypw.emc, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.9
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i11);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void emc(rie rieVar, final String str, final int i10, final String str2, final float f10) {
        emc(System.currentTimeMillis(), rieVar, str, ypw.ypw, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.10
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f10);
                } catch (Throwable th) {
                    ul.xq(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void emc(rie rieVar, final String str, final int i10, final String str2, final String str3, final int i11) {
        emc(System.currentTimeMillis(), rieVar, str, ypw.xq, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.11
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i11);
                } catch (Throwable th) {
                    ul.xq(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void emc(final String str, final rie rieVar, final com.bytedance.sdk.openadsdk.core.model.sup supVar, final String str2, final boolean z10, final Map<String, Object> map, final int i10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        emc(new com.bytedance.sdk.component.msw.msw("onClick") { // from class: com.bytedance.sdk.openadsdk.dg.xq.15
            @Override // java.lang.Runnable
            public void run() {
                rie rieVar2 = rieVar;
                if (rieVar2 == null) {
                    return;
                }
                xq.emc(jCurrentTimeMillis, rieVar2, str2, str, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.15.1
                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject ypw() throws JSONException {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.sup supVar2 = supVar;
                            if (supVar2 != null) {
                                JSONObject jSONObjectEmc = supVar2.emc();
                                jSONObjectEmc.put("is_valid", z10);
                                int i11 = i10;
                                if (i11 > 0 && i11 <= 2) {
                                    jSONObjectEmc.put("user_behavior_type", i11);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey("duration")) {
                                        jSONObject.put("duration", map.get("duration"));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!"duration".equals(entry.getKey())) {
                                            jSONObjectEmc.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectEmc.put("interaction_method", rieVar.nw());
                                if (str2.equals("open_ad")) {
                                    jSONObjectEmc.put("is_icon_only", rieVar.xmt() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectEmc.toString());
                            }
                            jSONObject.putOpt("log_extra", rieVar.wdp());
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - rieVar.ipz()).floatValue();
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(rieVar.nx()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.sup.emc(com.bytedance.sdk.openadsdk.core.aa.emc())) && CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(com.bytedance.sdk.openadsdk.ee.emc.emc(rieVar.ff(), true), 2, rieVar.ye());
                }
                if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    sb.xq(rieVar);
                }
            }
        });
    }

    public static void emc(rie rieVar, String str, String str2, final JSONObject jSONObject) {
        emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.16
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() throws JSONException {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!jSONObject.has("duration")) {
                        return jSONObject2;
                    }
                    jSONObject2.put("duration", jSONObject.get("duration"));
                    return jSONObject2;
                } catch (Exception e10) {
                    ul.xq("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }
        });
        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str2)) {
            sb.xq(rieVar);
        }
    }

    public static void emc(rie rieVar, String str, final String str2, final long j10, final int i10, JSONObject jSONObject, final uym uymVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.17
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                uym uymVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (uymVar2 = uymVar) != null) {
                        uymVar2.emc(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("duration", j10);
                    jSONObject3.put("percent", i10);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void emc(rie rieVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.19
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j10);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void emc(final rie rieVar, String str, String str2, final Map<String, Object> map) {
        emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.20
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", rieVar.aod());
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get("duration");
                        if (obj instanceof Long) {
                            jSONObject.put("duration", obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void emc(long j10, rie rieVar, String str, String str2) {
        emc(j10, rieVar, str, str2, (com.bytedance.sdk.openadsdk.vk.xq.ypw) null);
    }

    @DungeonFlag
    public static void emc(final long j10, final rie rieVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.vk.xq.ypw ypwVar) {
        if (rieVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || emc(rieVar.wad(), str2)) {
            return;
        }
        emc(new com.bytedance.sdk.component.msw.msw(str2) { // from class: com.bytedance.sdk.openadsdk.dg.xq.21
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.vk.xq.ypw ypwVar2 = ypwVar;
                    if (ypwVar2 != null) {
                        jSONObject = ypwVar2.ypw();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    com.bytedance.sdk.openadsdk.vk.xq.ypw ypwVar3 = ypwVar;
                    if (ypwVar3 != null) {
                        JSONObject jSONObjectEmc = ypwVar3.emc();
                        JSONObject jSONObjectXq = ypwVar.xq();
                        if (jSONObjectEmc != null) {
                            if (jSONObjectXq == null) {
                                jSONObjectXq = new JSONObject();
                            }
                            jSONObjectXq.put("pag_json_data", jSONObjectEmc.toString());
                            jSONObject.put("ad_extra_data", jSONObjectXq.toString());
                        } else if (jSONObjectXq != null) {
                            jSONObject.put("ad_extra_data", jSONObjectXq.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", rieVar.wdp());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(rieVar.nx()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new emc.C0170emc(j10, rieVar).ypw(str).xq(str2).bw(rieVar.ye()).msw(rieVar.wa()).emc(rieVar.rlt()).emc(jSONObject).uym(rieVar.lvs()).emc((com.bytedance.sdk.openadsdk.dg.ypw.emc) null);
            }
        });
    }

    public static void emc(rie rieVar, String str, final String str2, final int i10) {
        emc(System.currentTimeMillis(), rieVar, str, "playable_track", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.23
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", i10);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void emc(rie rieVar, final com.bytedance.sdk.openadsdk.vk.emc.emc emcVar, final String str) {
        emc(System.currentTimeMillis(), rieVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.26
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", emcVar.xq());
                    jSONObject.put("keyword", emcVar.aa());
                } catch (Throwable th) {
                    ul.xq("TTAD.AdEvent", "onWebBehaviorKeyword", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void emc(final long j10, final rie rieVar, String str) {
        if (rieVar == null || !rie.xq(rieVar) || rieVar.iyl() == null) {
            return;
        }
        emc(System.currentTimeMillis(), rieVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.31
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", rieVar.iyl().xq());
                    jSONObject.putOpt("id", rieVar.iyl().emc());
                    jSONObject.putOpt("md5", rieVar.iyl().ypw());
                    if (rieVar.iat() == null) {
                        return jSONObject;
                    }
                    jSONObject.putOpt("render_type", Integer.valueOf(rieVar.iat().f()));
                    return jSONObject;
                } catch (Exception e10) {
                    ul.xq(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                    return jSONObject;
                } catch (Exception e10) {
                    ul.xq(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void emc(rie rieVar, String str, String str2, final long j10, final JSONObject jSONObject) {
        if (rieVar == null || jSONObject == null) {
            return;
        }
        emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.33
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j10);
                    return jSONObject2;
                } catch (Exception e10) {
                    ul.xq("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }
        });
    }

    public static void emc(rie rieVar, String str, final JSONObject jSONObject) {
        emc(System.currentTimeMillis(), rieVar, str, ypw.bw, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.36
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                return jSONObject;
            }
        });
    }

    public static void emc(String str, long j10) {
        com.bytedance.sdk.openadsdk.core.msw.xq.emc(str, j10);
    }

    @DungeonFlag
    public static void emc(final rie rieVar, final String str, final String str2, final String str3, final long j10, final long j11, final JSONObject jSONObject, final boolean z10) {
        if (rieVar == null || emc(rieVar.wad(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        emc(new com.bytedance.sdk.component.msw.msw("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.dg.xq.38
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONArray jSONArrayOptJSONArray;
                String strRlt = rieVar.rlt();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            jSONObject2.put("device", DeviceUtils.uym(com.bytedance.sdk.openadsdk.core.aa.emc()).toString());
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            if (z10) {
                                jSONObject2.put("click_scence", 1);
                            } else if (dr.ypw(rieVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (rieVar.yo()) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (rieVar.wf()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        if (com.bytedance.sdk.openadsdk.qh.emc.xq(rieVar)) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONObjectOptJSONObject2 = new JSONObject();
                            }
                            jSONObjectOptJSONObject2.put("is_lp_pre_render", rieVar.ckv() ? 1 : 0);
                            jSONObject2.put("pag_json_data", jSONObjectOptJSONObject2.toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z10 && iOptInt == 2) {
                            strRlt = jSONObject2.optString("app_log_url");
                        }
                        int i10 = 0;
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            sb.xq(rieVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - rie.ypw(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.sup.emc(com.bytedance.sdk.openadsdk.core.aa.emc()))) {
                                if (z10 && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i10 < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i10));
                                            i10++;
                                        }
                                        com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(com.bytedance.sdk.openadsdk.ee.emc.emc(arrayList, true), 2, String.valueOf(j10));
                                    }
                                } else {
                                    rie rieVar2 = rieVar;
                                    if (rieVar2 != null) {
                                        com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(com.bytedance.sdk.openadsdk.ee.emc.emc(rieVar2.ff(), true), 2, rieVar.ye());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.sup.emc(com.bytedance.sdk.openadsdk.core.aa.emc())) && z10 && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i10 < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i10));
                                i10++;
                            }
                            com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(com.bytedance.sdk.openadsdk.ee.emc.emc(arrayList2, true), 1, String.valueOf(j10));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new emc.C0170emc(jCurrentTimeMillis, rieVar).dg(str).ypw(str2).xq(str3).bw(String.valueOf(j10)).ycc(String.valueOf(j11)).emc(strRlt).emc(jSONObject).msw(rieVar.wa()).uym(rieVar.lvs()).emc((com.bytedance.sdk.openadsdk.dg.ypw.emc) null);
            }
        });
    }

    public static void emc(final rie rieVar, String str, final long j10, final JSONObject jSONObject, final JSONObject jSONObject2) {
        emc(System.currentTimeMillis(), rieVar, "open_ad", str, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.39
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() throws JSONException {
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                try {
                    rie rieVar2 = rieVar;
                    if (rieVar2 != null) {
                        int iRu = rieVar2.ru();
                        jSONObject3.putOpt("start_type", Integer.valueOf(iRu == 1 ? 1 : 2));
                        jSONObject3.putOpt("load_index", Integer.valueOf(iRu));
                        if (iRu == 1) {
                            jSONObject3.putOpt("init_to_ad_load_time", Long.valueOf(SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.core.qh.dg));
                        }
                    }
                    jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.uym.emc.dg()));
                    jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.uym.emc.ypw()));
                    return jSONObject3;
                } catch (Exception e10) {
                    e10.getMessage();
                    return jSONObject3;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                try {
                    JSONObject jSONObject3 = jSONObject;
                    return jSONObject3 != null ? jSONObject3 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() throws JSONException {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    long j11 = j10;
                    if (j11 == -1) {
                        return jSONObject3;
                    }
                    jSONObject3.put("duration", j11);
                    return jSONObject3;
                } catch (Exception e10) {
                    ul.xq("TTAD.AdEvent", e10.getMessage());
                    return jSONObject3;
                }
            }
        });
    }

    public static void emc(final com.bytedance.sdk.component.msw.msw mswVar) {
        if (mswVar == null) {
            return;
        }
        if (iyl.ycc()) {
            com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.xq.40
                @Override // java.lang.Runnable
                public void run() {
                    iyl.ypw(mswVar, 10);
                }
            });
        } else if (!iyl.uym()) {
            iyl.ypw(mswVar, 10);
        } else {
            mswVar.run();
        }
    }

    public static void emc(final com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVar) {
        if (ypwVar == null || ypwVar.ypw() == null) {
            return;
        }
        final rie rieVarYpw = ypwVar.ypw();
        final int iSx = rieVarYpw.sx();
        if (iSx == 2 || iSx == 8 || (tp.dg(rieVarYpw) && ypw.emc.dg.equals(ypwVar.emc()))) {
            emc(System.currentTimeMillis(), rieVarYpw, ypwVar.xq(), "open_browser", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.41
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject xq() {
                    JSONArray jSONArrayOptJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iDg = ypwVar.dg();
                        jSONObject.put("count", tp.ru(com.bytedance.sdk.openadsdk.core.aa.emc()));
                        jSONObject.put("interceptor", iDg);
                        jSONObject.put("success", ypwVar.bw());
                        jSONObject.put("link", ypwVar.emc());
                        jSONObject.put("interaction_type", iSx);
                        jSONObject.put("real_interaction_type", ypwVar.uym());
                        if (ypwVar.dg() == 9) {
                            jSONObject.put("is_act_signals_api_available", ypwVar.msw());
                            jSONObject.put("is_act_signals_callback", ypwVar.zz());
                        }
                        if (!TextUtils.isEmpty(ypwVar.ycc())) {
                            jSONObject.put("exception_msg", ypwVar.ycc());
                        }
                        if (iDg == 2 || iDg == 5) {
                            String strUz = rieVarYpw.uz();
                            if (!TextUtils.isEmpty(strUz) && (jSONArrayOptJSONArray = new JSONObject(strUz).optJSONArray("creatives")) != null && jSONArrayOptJSONArray.length() > 0) {
                                jSONObject.put("meta", jSONArrayOptJSONArray.optJSONObject(rieVarYpw.xq()));
                            }
                        }
                        return jSONObject;
                    } catch (Throwable th) {
                        ul.xq("TTAD.AdEvent", th.getMessage());
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void emc(JSONObject jSONObject, int i10, int i11) throws JSONException {
        try {
            jSONObject.put("skip_show_time", i10);
            jSONObject.put("skip_time", i11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i11 - (i10 * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public static void emc(rie rieVar, String str, int i10, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, i10);
        } catch (JSONException unused) {
        }
        ypw(rieVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void emc(rie rieVar, String str, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final int i10, final Map<String, Object> map) {
        emc(System.currentTimeMillis(), rieVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.42
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z10);
                    jSONObject.put("force", z11);
                    jSONObject.put("isFromLandingPage", z12);
                    jSONObject.put("finishing", z13);
                    jSONObject.put("from", i10);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void emc(final rie rieVar, final boolean z10, String str, final String str2, final long j10, final String str3, final String str4, final int i10, final String str5) {
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        emc(System.currentTimeMillis(), rieVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.xq.44
            /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0009, B:27:0x0050, B:29:0x0058, B:41:0x00cb, B:43:0x00ea, B:30:0x006e, B:32:0x0076, B:33:0x008c, B:35:0x0090, B:37:0x0098, B:38:0x00ae, B:40:0x00b6, B:10:0x0020, B:15:0x002d, B:18:0x0037), top: B:49:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0009, B:27:0x0050, B:29:0x0058, B:41:0x00cb, B:43:0x00ea, B:30:0x006e, B:32:0x0076, B:33:0x008c, B:35:0x0090, B:37:0x0098, B:38:0x00ae, B:40:0x00b6, B:10:0x0020, B:15:0x002d, B:18:0x0037), top: B:49:0x0009 }] */
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public org.json.JSONObject xq() {
                /*
                    Method dump skipped, instructions count: 272
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dg.xq.AnonymousClass44.xq():org.json.JSONObject");
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static boolean emc(int i10, String str) {
        int iYpw;
        try {
            Set<String> setQhy = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().qhy();
            if ((i10 == 1 && setQhy != null && setQhy.contains(str)) || (iYpw = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().ypw(str)) == 0) {
                return true;
            }
            if (iYpw != 100) {
                if (((int) ((Math.random() * 100.0d) + 1.0d)) > iYpw) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            ul.xq("TTAD.AdEvent", th.getMessage());
            return false;
        }
    }

    public static JSONObject emc(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i10);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
