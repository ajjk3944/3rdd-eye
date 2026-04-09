package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.ex;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.yu.yu;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.pgl.ssdk.ces.out.PglSSConfig;
import d.h;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ApmHelper {
    private static vt fkw = null;

    /* renamed from: le, reason: collision with root package name */
    private static ouw f7685le = null;

    /* renamed from: lh, reason: collision with root package name */
    private static String f7686lh = null;
    private static volatile boolean ouw = false;
    private static final AtomicBoolean vt = new AtomicBoolean(false);
    private static boolean yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        public final Throwable f7687lh;
        public final String ouw;
        public final String vt;

        public ouw(String str, String str2, Throwable th2) {
            this.ouw = str;
            this.vt = str2;
            this.f7687lh = th2;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw(String str, String str2, Throwable th2);
    }

    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            jSONObject.put("ipv6", yu.vt("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", zih.yu().zin());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new ex(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "3";
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (vt.compareAndSet(false, true) && !ouw) {
            bs.ouw(new pno("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!ApmHelper.ouw) {
                        cf cfVarYu = zih.yu();
                        int iOuw = cfVarYu.ra.ouw("perf_con_apm", 100);
                        boolean unused = ApmHelper.yu = iOuw != 0 && (iOuw < 0 || iOuw >= 100 || iOuw > ((int) (Math.random() * 100.0d)));
                        String strQbp = uoy.qbp();
                        if (ApmHelper.yu && !TextUtils.isEmpty(strQbp)) {
                            String unused2 = ApmHelper.f7686lh = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strOuw = ryl.ouw(context);
                            try {
                                Npth.setCrashWaitTime(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("apm_crash_wait_time", 10000));
                                Npth.enableLoopMonitor(false);
                                Npth.enableAnrInfo(false);
                                Npth.enableNativeDump(false);
                                Npth.enableActivityDump(false);
                                Npth.enableMessageDump(false);
                                MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.CustomRequestHeader
                                    public final void addRequestHeader(HttpURLConnection httpURLConnection) {
                                        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                        httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                        httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                        httpURLConnection.setRequestProperty("x-pangle-target-idc", zih.yu().lso());
                                    }
                                });
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7808L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.apm.insight.AttachUserData
                                    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapLh = ApmHelper.lh();
                                        if (mapLh.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapLh.get("render_type"));
                                            return mapLh;
                                        }
                                        monitorCrashInitSDK.addTags("render_type", "-2");
                                        return mapLh;
                                    }
                                });
                                if (cfVarYu.pno.ouw("perf_con_apm_native", Integer.MAX_VALUE) == 1) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strOuw);
                                monitorCrashInitSDK.setReportUrl(strQbp);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.f7686lh);
                                monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                vt unused3 = ApmHelper.fkw = new vt() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.vt
                                    public final void ouw(String str, String str2, Throwable th2) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th2);
                                    }
                                };
                                boolean unused4 = ApmHelper.ouw = true;
                                ApmHelper.vt(strOuw, strQbp);
                                ouw ouwVar = ApmHelper.f7685le;
                                ouw unused5 = ApmHelper.f7685le = null;
                                if (ouwVar != null) {
                                    ApmHelper.fkw.ouw(ouwVar.ouw, ouwVar.vt, ouwVar.f7687lh);
                                }
                            } catch (Throwable unused6) {
                                ko.yu("ApmHelper", "init Apm fail or not include Apm module");
                                boolean unused7 = ApmHelper.ouw = false;
                            }
                        }
                    }
                    ApmHelper.vt.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return ouw;
    }

    public static /* synthetic */ Map lh() {
        HashMap map = new HashMap();
        vpp vppVarVt = com.bytedance.sdk.openadsdk.utils.vt.vt();
        if (vppVarVt != null) {
            map.put("adType", String.valueOf(vppVarVt.lna));
            if (vppVarVt.zu < 0) {
                JSONObject jSONObjectFak = vppVarVt.fak();
                if (jSONObjectFak != null) {
                    vppVarVt.zu = jSONObjectFak.optLong("ad_id", 0L);
                } else {
                    vppVarVt.zu = 0L;
                }
            }
            map.put("aid", String.valueOf(vppVarVt.zu));
            map.put("cid", vppVarVt.pv);
            map.put("reqId", vppVarVt.ux());
            map.put("rit", vppVarVt.yu("-1"));
            int i4 = vppVarVt.kfa;
            if (vppVarVt.rn() != 2) {
                i4 = -1;
            }
            map.put("render_type", String.valueOf(i4));
        }
        return map;
    }

    public static void reportCustomError(String str, String str2, Throwable th2) {
        vt vtVar = fkw;
        if (vtVar != null) {
            vtVar.ouw(str, str2, th2);
        } else {
            f7685le = new ouw(str, str2, th2);
        }
    }

    public static void reportPvFromBackGround() throws JSONException {
        if (yu) {
            vt(ryl.ouw(zih.ouw()), uoy.qbp());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strT = h.t("https://", str2, "/monitor/collect/c/session?version_code=7808&device_platform=android&aid=10000001");
        zih.lh().vt(vt(str), strT);
    }

    private static JSONObject vt(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", f7686lh);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            qbp.lh("ApmHelper", e2.getMessage());
            return jSONObject;
        }
    }
}
