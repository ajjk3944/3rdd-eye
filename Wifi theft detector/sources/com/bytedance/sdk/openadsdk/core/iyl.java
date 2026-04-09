package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ypw;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.dg.ypw;
import com.bytedance.sdk.openadsdk.multipro.ypw.emc;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class iyl {
    private static boolean emc = false;

    public static void emc(boolean z10) {
        emc = z10;
    }

    private static com.bytedance.sdk.openadsdk.vk.emc.ypw emc(int i10, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVar = new com.bytedance.sdk.openadsdk.vk.emc.ypw();
        ypwVar.emc(ypw.emc.emc);
        ypwVar.emc(rieVar);
        ypwVar.ypw(com.bytedance.sdk.openadsdk.utils.tp.emc(rieVar));
        ypwVar.emc(i10);
        ypwVar.emc(false);
        ypwVar.ypw(rieVar.sx());
        return ypwVar;
    }

    public static boolean emc(Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i10, @Nullable PAGNativeAd pAGNativeAd, @Nullable com.bytedance.sdk.openadsdk.core.dg.emc emcVar, String str, @Nullable com.bytedance.sdk.openadsdk.ul.emc.emc.xq xqVar, boolean z10, int i11) {
        String strEmc;
        com.bytedance.sdk.openadsdk.dg.xq.emc(emc(-1, rieVar));
        if (context != null && rieVar != null && i10 != -1) {
            com.bytedance.sdk.openadsdk.core.model.sz szVarKda = rieVar.kda();
            HashMap map = new HashMap();
            if (rieVar.aod() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(i11 >= 11));
            }
            if (i11 != 0 && rieVar.ak()) {
                map.put("dsp_click_type", Integer.valueOf(i11));
            }
            if (szVarKda != null && !TextUtils.isEmpty(szVarKda.emc())) {
                if (emc(context, rieVar, i10, str, z10, map)) {
                    com.bytedance.sdk.openadsdk.dg.xq.emc(emc(2, rieVar));
                    com.bytedance.sdk.openadsdk.utils.bw.emc(rieVar);
                    return true;
                }
                if (szVarKda.xq() != 2 || rieVar.in() == 5 || rieVar.in() == 15) {
                    if (szVarKda.xq() == 1 && !TextUtils.isEmpty(szVarKda.ypw())) {
                        strEmc = szVarKda.ypw();
                    } else {
                        strEmc = emc(rieVar);
                    }
                } else if (xqVar != null) {
                    if (!xqVar.dg(rieVar)) {
                        if (xqVar.xq(rieVar)) {
                            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str, "open_fallback_url", map);
                            com.bytedance.sdk.openadsdk.dg.xq.emc(emc(3, rieVar));
                            com.bytedance.sdk.openadsdk.utils.bw.emc(rieVar);
                            return true;
                        }
                        strEmc = emc(szVarKda, rieVar);
                        com.bytedance.sdk.openadsdk.dg.xq.emc(emc(3, rieVar));
                    } else {
                        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.dg.xq.emc(emc(3, rieVar));
                        com.bytedance.sdk.openadsdk.utils.bw.emc(rieVar);
                        return true;
                    }
                } else {
                    strEmc = emc(szVarKda, rieVar);
                }
                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str, "open_fallback_url", map);
            } else {
                strEmc = emc(rieVar);
            }
            String str2 = strEmc;
            if (rieVar.aod() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.dg.xq.emc(emc(4, rieVar));
                boolean zEmc = com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.emc(context, str2, strSubstring, str, rieVar);
                if (zEmc) {
                    com.bytedance.sdk.openadsdk.utils.bw.emc(rieVar);
                }
                return zEmc;
            }
            boolean zEmc2 = emc(context, rieVar, i10, pAGNativeAd, emcVar, str, z10, str2);
            if (zEmc2) {
                com.bytedance.sdk.openadsdk.utils.bw.emc(rieVar);
            }
            return zEmc2;
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(emc(1, rieVar));
        return false;
    }

    private static String emc(com.bytedance.sdk.openadsdk.core.model.sz szVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (!TextUtils.isEmpty(szVar.ypw())) {
            return szVar.ypw();
        }
        return emc(rieVar);
    }

    private static String emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar.ak() && rieVar.qio() != null) {
            return rieVar.qio().zz();
        }
        return rieVar.xst();
    }

    public static boolean emc(Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i10, String str, boolean z10, Map<String, Object> map) throws JSONException {
        if (rieVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.sz szVarKda = rieVar.kda();
        if (szVarKda != null && !TextUtils.isEmpty(szVarKda.emc())) {
            if (map == null) {
                map = new HashMap<>();
            }
            return com.bytedance.sdk.openadsdk.ul.emc.emc.emc.emc(context, szVarKda.emc(), rieVar, i10, map, z10);
        }
        dg.emc(rieVar, str, szVarKda == null ? -1 : -2, szVarKda != null ? szVarKda.dg() : null);
        return false;
    }

    public static boolean emc(Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.dg.emc emcVar, String str, boolean z10, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.dr.ypw(rieVar)) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(emc(5, rieVar));
            return false;
        }
        int iSx = rieVar.sx();
        if (iSx != 2 && iSx != 8) {
            com.bytedance.sdk.component.utils.ypw.emc(context, emc(context, str2, rieVar, i10, pAGNativeAd, emcVar, str, z10), null);
            emc = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.rie.emc(context, str2, rieVar, ypw.emc.emc);
    }

    public static void emc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i10, String str2, boolean z10) {
        com.bytedance.sdk.component.utils.ypw.emc(context, emc(context, str, rieVar, i10, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.dg.emc) null, str2, z10), null);
    }

    public static void emc(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i10, final String str2, boolean z10, yzg yzgVar) {
        com.bytedance.sdk.component.utils.ypw.emc(context, emc(context, str, rieVar, i10, null, null, str2, z10, true, yzgVar), new ypw.InterfaceC0122ypw() { // from class: com.bytedance.sdk.openadsdk.core.iyl.1
            @Override // com.bytedance.sdk.component.utils.ypw.InterfaceC0122ypw
            public void emc() throws JSONException {
                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.ypw.InterfaceC0122ypw
            public void emc(Throwable th) throws JSONException {
                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str2, -2, (JSONObject) null);
            }
        });
    }

    private static Intent emc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i10, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.dg.emc emcVar, String str2, boolean z10) {
        return emc(context, str, rieVar, i10, pAGNativeAd, emcVar, str2, z10, false, null);
    }

    public static boolean emc(Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, int i10, int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i11);
            com.bytedance.sdk.openadsdk.dg.xq.ycc(rieVar, str, jSONObject);
            Intent intentEmc = emc(context, rieVar, str, i10);
            if (intentEmc == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.ypw.emc(context, intentEmc, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent emc(Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, int i10) {
        if (context == null || rieVar == null || !com.bytedance.sdk.openadsdk.core.model.dr.ypw(rieVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String strGbl = com.bytedance.sdk.openadsdk.core.model.dr.gbl(rieVar);
        if (!TextUtils.isEmpty(strGbl)) {
            if (strGbl.contains("?")) {
                strGbl = strGbl + "&orientation=portrait";
            } else {
                strGbl = strGbl + "?orientation=portrait";
            }
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            intent.putExtra("url", strGbl);
            intent.putExtra("event_tag", str);
            intent.putExtra("source", i10);
            intent.putExtra("gecko_id", rieVar.qlw());
            intent.putExtra("web_title", rieVar.xou());
            intent.putExtra("adid", rieVar.ye());
            intent.putExtra("log_extra", rieVar.wdp());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, rieVar.uie().toString());
            return intent;
        }
        rieVar.bw(strGbl);
        rieVar.ycc(str);
        rieVar.dg(i10);
        intent.putExtra("meta_index", sf.emc().emc(rieVar));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent emc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i10, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.dg.emc emcVar, String str2, boolean z10, boolean z11, yzg yzgVar) {
        Intent intent;
        if (!z11 && com.bytedance.sdk.openadsdk.core.model.dr.ypw(rieVar) && (pAGNativeAd != 0 || emcVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zEmc = emc(rieVar, z10);
            intent.putExtra("ad_pending_download", zEmc);
            String strGbl = com.bytedance.sdk.openadsdk.core.model.dr.gbl(rieVar);
            if (!TextUtils.isEmpty(strGbl)) {
                if (strGbl.contains("?")) {
                    str = strGbl + "&orientation=portrait";
                } else {
                    str = strGbl + "?orientation=portrait";
                }
            }
            rieVar.ypw(zEmc);
        } else if (!z11 && rieVar.sx() == 3 && ((rieVar.fu() == 2 || (rieVar.fu() == 1 && emc)) && !rieVar.ec())) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            intent.putExtra("url", str);
            intent.putExtra("event_tag", str2);
            intent.putExtra("source", i10);
            intent.putExtra("gecko_id", rieVar.qlw());
            if (!z11 || yzgVar == null) {
                intent.putExtra("web_title", rieVar.xou());
            } else {
                intent.putExtra("web_title", yzgVar.ypw());
                intent.putExtra("only_loading", yzgVar.emc());
            }
            intent.putExtra("adid", rieVar.ye());
            intent.putExtra("log_extra", rieVar.wdp());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, rieVar.uie().toString());
        } else {
            if (z11 && yzgVar != null) {
                rieVar.ul(yzgVar.ypw());
                rieVar.emc(yzgVar.emc());
            }
            rieVar.bw(str);
            rieVar.ycc(str2);
            rieVar.dg(i10);
            intent.putExtra("meta_index", sf.emc().emc(rieVar));
        }
        if (rieVar.in() == 5 || rieVar.in() == 15 || rieVar.in() == 50) {
            com.bytedance.sdk.openadsdk.multipro.ypw.emc emcVarXq = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof emc.InterfaceC0179emc) {
                    emcVarXq = ((emc.InterfaceC0179emc) pAGNativeAd).ycc();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.emc.ypw.emc.ypw) {
                    emcVarXq = ((com.bytedance.sdk.openadsdk.emc.ypw.emc.ypw) pAGNativeAd).ypw();
                }
                if (emcVarXq != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, emcVarXq.emc().toString());
                }
            }
            if (emcVar != null && emcVar.ypw() && (emcVarXq = emcVar.xq()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, emcVarXq.emc().toString());
            }
            if (emcVarXq != null) {
                intent.putExtra("video_is_auto_play", emcVarXq.dg);
                if (com.bytedance.sdk.component.utils.cf.dg()) {
                    emcVarXq.emc().toString();
                }
            }
        }
        return intent;
    }

    private static boolean emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, boolean z10) {
        if (z10 && rieVar != null && rieVar.sx() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.dr.ypw(rieVar);
        }
        return false;
    }
}
