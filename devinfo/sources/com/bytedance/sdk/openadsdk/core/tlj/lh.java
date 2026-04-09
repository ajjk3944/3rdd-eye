package com.bytedance.sdk.openadsdk.core.tlj;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.fkw;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.tlj.vt;
import com.bytedance.sdk.openadsdk.core.zih;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private static boolean ouw = false;

    public static int fkw() {
        if (!zih.yu().jqy()) {
            return 6;
        }
        vt unused = vt.ouw.ouw;
        ouw ouwVar = vt.ouw;
        if (ouwVar == null) {
            return 1;
        }
        if (ouwVar.f8465lh) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public static String le() {
        if (!zih.yu().jqy()) {
            return null;
        }
        vt unused = vt.ouw.ouw;
        return vt.ouw();
    }

    public static String lh() {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            ouw ouwVar = vt.ouw;
            if (ouwVar != null && ouwVar.ouw()) {
                ouwVar.vt();
                PglSSManager pglSSManager = ouwVar.ouw;
                if (pglSSManager != null) {
                    return pglSSManager.getSofChara();
                }
            }
        }
        return "";
    }

    public static void ouw() {
        if (!ouw && zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            vt unused2 = vt.ouw.ouw;
            ouw ouwVar = vt.ouw;
            ouw = ouwVar == null ? false : ouwVar.vt;
        }
    }

    public static void vt(String str) {
        ouw ouwVar;
        if (TextUtils.isEmpty(str) || !zih.yu().jqy()) {
            return;
        }
        vt unused = vt.ouw.ouw;
        if (TextUtils.isEmpty(str) || (ouwVar = vt.ouw) == null || !ouwVar.ouw()) {
            return;
        }
        ouwVar.vt();
        PglSSManager pglSSManager = ouwVar.ouw;
        if (pglSSManager != null) {
            pglSSManager.setDeviceId(str);
        }
    }

    public static long yu() {
        if (!zih.yu().jqy()) {
            return 0L;
        }
        vt unused = vt.ouw.ouw;
        return vt.vt();
    }

    public static void ouw(String str) {
        ouw ouwVar;
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            if (TextUtils.isEmpty(str) || (ouwVar = vt.ouw) == null || !ouwVar.ouw()) {
                return;
            }
            ouwVar.vt();
            PglSSManager pglSSManager = ouwVar.ouw;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public static void vt() {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            final ouw ouwVar = vt.ouw;
            if (ouwVar == null || !ouwVar.ouw()) {
                return;
            }
            ouwVar.vt();
            if (ouwVar.ouw != null) {
                jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tlj.ouw.3
                    public AnonymousClass3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, zih.yu().pno.ouw("bus_con_check_clz", ""));
                            ouw.this.ouw.setCustomInfo(map);
                            ko.ouw("MSSdkImpl", "custom info is: ", map);
                        } catch (Throwable th2) {
                            qbp.yu("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public static void ouw(vpp vppVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (zih.yu().jqy()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (vppVar != null) {
                String strUx = vppVar.ux();
                String strOptString = "-1";
                if (!TextUtils.isEmpty(strUx)) {
                    map.put("request_id", strUx);
                } else {
                    map.put("request_id", "-1");
                }
                try {
                    long j = -1;
                    if (vppVar.fak() != null) {
                        jOptLong = vppVar.fak().optLong("ad_id", -1L);
                        jOptLong2 = vppVar.fak().optLong("rit", -1L);
                        jOptLong3 = vppVar.fak().optLong("ad_slot_type", -1L);
                        strOptString = vppVar.fak().optString("ad_type", "-1");
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> map2 = vppVar.npr;
                    if (map2 != null && (obj = map2.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j));
                    vt unused = vt.ouw.ouw;
                    ouw ouwVar = vt.ouw;
                    if (ouwVar == null || !ouwVar.ouw()) {
                        return;
                    }
                    ouwVar.vt();
                    PglSSManager pglSSManager = ouwVar.ouw;
                    if (pglSSManager != null) {
                        pglSSManager.reportNow(PglSSManager.REPORT_SCENE_ADSHOW, map);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static Map<String, String> ouw(String str, String str2) {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            return vt.ouw(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void ouw(MotionEvent motionEvent) {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            ouw ouwVar = vt.ouw;
            if (ouwVar == null || !ouwVar.vt) {
                return;
            }
            ouwVar.vt();
            PglSSManager pglSSManager = ouwVar.ouw;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public static void ouw(JSONObject jSONObject) throws JSONException {
        try {
            if (zih.yu().jqy()) {
                ouw();
                if (fkw() == 0) {
                    vt unused = vt.ouw.ouw;
                    jSONObject.put("sec_did", vt.ouw());
                    String strOuw = fkw.ouw(jSONObject.toString());
                    vt unused2 = vt.ouw.ouw;
                    Map<String, String> mapOuw = vt.ouw("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strOuw != null ? strOuw.getBytes() : new byte[0]);
                    if (mapOuw != null && mapOuw.size() > 0) {
                        for (String str : mapOuw.keySet()) {
                            jSONObject.put(str, mapOuw.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strOuw);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    vt unused3 = vt.ouw.ouw;
                    jSONObject.put("ec", vt.vt());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(fkw()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th2) {
            qbp.lh("SecSdkHelperUtil", th2.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused4) {
            }
        }
    }
}
