package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.hxp;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.multipro.dg.dg;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ApmHelper {
    private static ypw bw = null;
    private static boolean dg = false;
    private static volatile boolean emc = false;
    private static String xq;
    private static emc ycc;
    private static final AtomicBoolean ypw = new AtomicBoolean(false);

    public static class emc {
        public final String emc;
        public final Throwable xq;
        public final String ypw;

        public emc(String str, String str2, Throwable th) {
            this.emc = str;
            this.ypw = str2;
            this.xq = th;
        }
    }

    public interface ypw {
        void emc(String str, String str2, Throwable th);
    }

    @NonNull
    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().ypw());
            jSONObject.put("ipv6", dg.ypw("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put(TtmlNode.TAG_REGION, aa.dg().pxa());
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new hxp(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
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
        if (ypw.compareAndSet(false, true) && !emc) {
            iyl.emc(new msw("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.emc) {
                        gbl gblVarDg = aa.dg();
                        boolean unused = ApmHelper.dg = gblVarDg.rgy();
                        String strSba = tp.sba();
                        if (ApmHelper.dg && !TextUtils.isEmpty(strSba)) {
                            String unused2 = ApmHelper.xq = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strEmc = sup.emc(context);
                            try {
                                Npth.setCrashWaitTime(com.bytedance.sdk.openadsdk.sra.emc.emc("apm_crash_wait_time", 10000));
                                Npth.enableLoopMonitor(false);
                                Npth.enableAnrInfo(false);
                                Npth.enableNativeDump(false);
                                Npth.enableActivityDump(false);
                                Npth.enableMessageDump(false);
                                MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.CustomRequestHeader
                                    public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                        httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                        httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                        httpURLConnection.setRequestProperty("x-pangle-target-idc", aa.dg().nx());
                                    }
                                });
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7852L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.apm.insight.AttachUserData
                                    @Nullable
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapMsw = ApmHelper.msw();
                                        if (mapMsw.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapMsw.get("render_type"));
                                            return mapMsw;
                                        }
                                        monitorCrashInitSDK.addTags("render_type", "-2");
                                        return mapMsw;
                                    }
                                });
                                if (gblVarDg.wd()) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strEmc);
                                monitorCrashInitSDK.setReportUrl(strSba);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.xq);
                                monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                ypw unused3 = ApmHelper.bw = new ypw() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.ypw
                                    public void emc(String str, String str2, Throwable th) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th);
                                    }
                                };
                                boolean unused4 = ApmHelper.emc = true;
                                ApmHelper.xq(strEmc, strSba);
                                emc emcVar = ApmHelper.ycc;
                                emc unused5 = ApmHelper.ycc = null;
                                if (emcVar != null) {
                                    ApmHelper.bw.emc(emcVar.emc, emcVar.ypw, emcVar.xq);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.emc = false;
                            }
                        }
                    }
                    ApmHelper.ypw.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return emc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> msw() {
        HashMap map = new HashMap();
        rie rieVarXq = com.bytedance.sdk.openadsdk.utils.ypw.xq();
        if (rieVarXq != null) {
            map.put("adType", String.valueOf(rieVarXq.blf()));
            map.put("aid", String.valueOf(rieVarXq.efd()));
            map.put(BidResponsedEx.KEY_CID, rieVarXq.ye());
            map.put("reqId", rieVarXq.lvs());
            map.put("rit", rieVarXq.lt("-1"));
            int iEj = rieVarXq.ej();
            if (rieVarXq.yid() != 2) {
                iEj = -1;
            }
            map.put("render_type", String.valueOf(iEj));
        }
        return map;
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        ypw ypwVar = bw;
        if (ypwVar != null) {
            ypwVar.emc(str, str2, th);
        } else {
            ycc = new emc(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() throws JSONException {
        if (dg) {
            ypw(sup.emc(aa.emc()), tp.sba());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xq(String str, String str2) throws JSONException {
        ypw(str, str2);
    }

    private static void ypw(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        aa.xq().emc(ypw(str), "https://" + str2 + "/monitor/collect/c/session?version_code=7852&device_platform=android&aid=10000001");
    }

    private static JSONObject ypw(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", xq);
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
        } catch (JSONException e10) {
            ul.xq("ApmHelper", e10.getMessage());
            return jSONObject;
        }
    }
}
