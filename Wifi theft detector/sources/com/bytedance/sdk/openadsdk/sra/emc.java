package com.bytedance.sdk.openadsdk.sra;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.msw;
import com.bytedance.sdk.component.utils.sb;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.hxp;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.rie;
import com.bytedance.sdk.openadsdk.core.ru.ypw;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.core.settings.zz;
import com.bytedance.sdk.openadsdk.rie.dg;
import com.bytedance.sdk.openadsdk.rie.xq;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.sra;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    public static final ConcurrentHashMap<String, Object> emc = new ConcurrentHashMap<>();
    private static volatile xq xq;
    public static String ypw;

    public static int bw() {
        if (ypw()) {
            return emc("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static boolean dg() {
        return ypw() && emc("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    public static xq emc(final Context context, final String str) {
        if (xq == null) {
            synchronized (emc.class) {
                try {
                    if (xq == null) {
                        try {
                            xq xqVar = new xq(new dg() { // from class: com.bytedance.sdk.openadsdk.sra.emc.1
                                @Override // com.bytedance.sdk.openadsdk.rie.dg
                                public String bw() {
                                    String strEmc = tp.emc("/api/ad/union/sdk/strategies/adn", false, true);
                                    emc.ypw = strEmc;
                                    return strEmc;
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.dg
                                public Handler dg() {
                                    return qh.ypw();
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.dg
                                public ExecutorService emc() {
                                    return iyl.bw();
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.dg
                                public Map<String, String> uym() throws JSONException {
                                    HashMap map = new HashMap();
                                    map.put(Command.HTTP_HEADER_USER_AGENT, tp.dg());
                                    String strYpw = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!strYpw.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", strYpw);
                                        } catch (JSONException unused) {
                                        }
                                        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new hxp(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                        if (jSONObjectEncryptType4 != null) {
                                            map.put("transfer-param", jSONObjectEncryptType4.optString(PglCryptUtils.KEY_MESSAGE));
                                            if (jSONObjectEncryptType4.optInt("cypher") == 4) {
                                                map.put("cypher", "4");
                                            } else {
                                                map.put("cypher", "3");
                                            }
                                        }
                                    }
                                    try {
                                        map.put("x-pangle-target-idc", gbl.xq().nx());
                                    } catch (Throwable unused2) {
                                    }
                                    return map;
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.dg
                                public String xq() {
                                    return "pag_adn_strategy_center";
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.dg
                                public JSONObject ycc() {
                                    try {
                                        JSONObject jSONObjectEmc = zz.emc(sb.emc(aa.emc(), 0L));
                                        if (!jSONObjectEmc.has(MBridgeConstans.APP_ID)) {
                                            if (!TextUtils.isEmpty(str)) {
                                                jSONObjectEmc.put(MBridgeConstans.APP_ID, str);
                                            } else {
                                                if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.zz.ypw().dg())) {
                                                    return null;
                                                }
                                                jSONObjectEmc.put(MBridgeConstans.APP_ID, com.bytedance.sdk.openadsdk.core.zz.ypw().dg());
                                            }
                                        }
                                        return rie.emc(PangleEncryptConstant.CryptDataScene.STRATEGY, jSONObjectEmc);
                                    } catch (Throwable th) {
                                        ul.xq("StrategyUtils", th.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.dg
                                public Context ypw() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : aa.emc();
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.dg
                                public JSONObject emc(JSONObject jSONObject) {
                                    String strEmc = rie.emc(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                    if (!TextUtils.isEmpty(strEmc)) {
                                        try {
                                            return new JSONObject(strEmc);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    return jSONObject;
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.dg
                                public HandlerThread emc(String str2, int i10) {
                                    return msw.emc(str2, i10);
                                }
                            });
                            xq = xqVar;
                            xqVar.emc(new com.bytedance.sdk.openadsdk.rie.emc() { // from class: com.bytedance.sdk.openadsdk.sra.emc.2
                                @Override // com.bytedance.sdk.openadsdk.rie.emc
                                public void emc() {
                                    com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.sra.emc.2.1
                                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                                            emcVar.ypw("strategy_fetch");
                                            return emcVar;
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.emc
                                public void ypw() {
                                    com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.sra.emc.2.2
                                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                                            emcVar.ypw("strategy_fetch");
                                            return emcVar;
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.ycc.emc.emc().ypw();
                                    com.bytedance.sdk.openadsdk.ylm.emc.xq.emc().ypw();
                                    sra.ypw();
                                    HashMap map = new HashMap();
                                    String strEmc = emc.emc(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(strEmc)) {
                                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strEmc);
                                    }
                                    ypw.ypw().emc(map);
                                }

                                @Override // com.bytedance.sdk.openadsdk.rie.emc
                                public void emc(int i10, String str2) {
                                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.sra.emc.2.3
                                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                                            emcVar.ypw("strategy_fetch");
                                            return emcVar;
                                        }
                                    });
                                    sra.emc(emc.ypw);
                                }
                            });
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return xq;
    }

    private static xq gbl() {
        return emc(aa.emc(), com.bytedance.sdk.openadsdk.core.zz.ypw().dg());
    }

    public static boolean msw() {
        return emc("no_call_close", 0) == 1;
    }

    public static boolean ru() {
        return emc("iv_rv_top_bar_listen_new", 0) == 1;
    }

    public static boolean uym() {
        return emc("jsb_opt_enable", 0) == 1;
    }

    public static boolean xq() {
        return ypw() && emc("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static int ycc() {
        if (ypw()) {
            return emc("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    public static boolean ypw() {
        return emc("ad_load_and_render_opt", "enable", 0) == 1;
    }

    public static boolean zz() {
        return emc("iv_rv_listen_new_arch", 0) == 1;
    }

    public static int emc(String str, int i10) {
        xq xqVarGbl = gbl();
        return xqVarGbl != null ? xqVarGbl.emc(str, i10) : i10;
    }

    public static boolean emc(String str, boolean z10) {
        xq xqVarGbl = gbl();
        return xqVarGbl != null ? xqVarGbl.emc(str, z10) : z10;
    }

    public static String emc(String str, String str2) {
        xq xqVarGbl = gbl();
        return xqVarGbl != null ? xqVarGbl.emc(str, str2) : str2;
    }

    public static int emc(String str, String str2, int i10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = emc;
            Object obj = concurrentHashMap.get(str3);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strEmc = gbl().emc(str, "");
                if (!TextUtils.isEmpty(strEmc)) {
                    int iOptInt = new JSONObject(strEmc).optInt(str2, i10);
                    concurrentHashMap.put(str3, Integer.valueOf(iOptInt));
                    return iOptInt;
                }
            } catch (Throwable th) {
                ul.xq("StrategyUtils", th.getMessage());
            }
        }
        return i10;
    }

    public static String emc(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str4 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = emc;
            Object obj = concurrentHashMap.get(str4);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strEmc = gbl().emc(str, "");
                if (!TextUtils.isEmpty(strEmc)) {
                    String strOptString = new JSONObject(strEmc).optString(str2, str3);
                    concurrentHashMap.put(str4, strOptString);
                    return strOptString;
                }
            } catch (Throwable th) {
                ul.xq("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    public static void emc() {
        xq xqVarGbl = gbl();
        if (xqVarGbl != null) {
            xqVarGbl.emc();
        }
    }
}
