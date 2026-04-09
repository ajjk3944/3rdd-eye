package com.bytedance.sdk.openadsdk.core.ru;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.bw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    private static boolean emc = false;

    public static int bw() {
        if (aa.dg().ffd()) {
            return ypw.ypw().uym();
        }
        return 6;
    }

    public static long dg() {
        if (aa.dg().ffd()) {
            return ypw.ypw().ycc();
        }
        return 0L;
    }

    public static void emc() {
        if (!emc && aa.dg().ffd()) {
            ypw.ypw();
            emc = ypw.ypw().xq();
        }
    }

    public static String xq() {
        return aa.dg().ffd() ? ypw.ypw().bw() : "";
    }

    public static String ycc() {
        if (aa.dg().ffd()) {
            return ypw.ypw().dg();
        }
        return null;
    }

    public static void ypw(String str) {
        if (TextUtils.isEmpty(str) || !aa.dg().ffd()) {
            return;
        }
        ypw.ypw().ypw(str);
    }

    public static void ypw() {
        if (aa.dg().ffd()) {
            ypw.ypw().emc();
        }
    }

    public static void emc(String str) {
        if (aa.dg().ffd()) {
            ypw.ypw().emc(str);
        }
    }

    public static void emc(rie rieVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (aa.dg().ffd()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (rieVar != null) {
                String strLvs = rieVar.lvs();
                String strOptString = "-1";
                if (!TextUtils.isEmpty(strLvs)) {
                    map.put("request_id", strLvs);
                } else {
                    map.put("request_id", "-1");
                }
                try {
                    long j10 = -1;
                    if (rieVar.ldy() != null) {
                        jOptLong = rieVar.ldy().optLong("ad_id", -1L);
                        jOptLong2 = rieVar.ldy().optLong("rit", -1L);
                        jOptLong3 = rieVar.ldy().optLong("ad_slot_type", -1L);
                        strOptString = rieVar.ldy().optString("ad_type", "-1");
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> mapZek = rieVar.zek();
                    if (mapZek != null && (obj = mapZek.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j10 = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j10));
                    ypw.ypw().emc("AdShow", map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> emc(String str, String str2) {
        if (aa.dg().ffd()) {
            return ypw.ypw().emc(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void emc(MotionEvent motionEvent) {
        if (aa.dg().ffd()) {
            ypw.ypw().emc(motionEvent);
        }
    }

    public static void emc(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        try {
            if (aa.dg().ffd()) {
                emc();
                if (bw() == 0) {
                    jSONObject.put("sec_did", ypw.ypw().dg());
                    String strEmc = bw.emc(jSONObject.toString());
                    Map<String, String> mapEmc = ypw.ypw().emc("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strEmc != null ? strEmc.getBytes() : new byte[0]);
                    if (mapEmc != null && mapEmc.size() > 0) {
                        for (String str : mapEmc.keySet()) {
                            jSONObject.put(str, mapEmc.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strEmc);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", ypw.ypw().ycc());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(bw()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            ul.xq("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
