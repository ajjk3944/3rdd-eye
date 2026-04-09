package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.sb;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.lt;
import com.bytedance.sdk.openadsdk.core.rie;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dr;
import com.bytedance.sdk.openadsdk.utils.sra;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import u2.e;

/* loaded from: classes.dex */
public class zz extends com.bytedance.sdk.component.msw.msw {
    private final emc emc;
    private final Set<bw> xq;
    private final msw ypw;

    public interface emc {
        void emc(boolean z10);
    }

    public zz(emc emcVar, msw mswVar, bw... bwVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.xq = hashSet;
        this.emc = emcVar;
        this.ypw = mswVar;
        hashSet.addAll(Arrays.asList(bwVarArr));
    }

    private JSONObject ypw(JSONObject jSONObject) {
        return rie.emc(PangleEncryptConstant.CryptDataScene.SETTINGS, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iEmc = sb.emc(aa.emc(), 0L);
        if (iEmc == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.emc.emc(false);
            return;
        }
        JSONObject jSONObjectEmc = emc(iEmc);
        com.bytedance.sdk.component.uym.ypw.dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
        try {
            dgVarYpw.ypw(com.bytedance.sdk.openadsdk.zz.dg.emc(dgVarYpw, tp.emc("/api/ad/union/sdk/settings/", false, true)));
            dgVarYpw.ypw(Command.HTTP_HEADER_USER_AGENT, tp.dg());
        } catch (Exception unused) {
        }
        String string = ypw(jSONObjectEmc).toString();
        if (aa.dg().ndl() && lt.emc().dg() == 1) {
            tp.emc("Pangle_Debug_Mode", string, aa.emc());
        }
        dgVarYpw.emc(string, aa.dg().sba());
        dgVarYpw.emc(6);
        dgVarYpw.emc("setting");
        com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.settings.zz.1
            @Override // com.bytedance.sdk.openadsdk.sba.dg
            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                emcVar.ypw("settings_fetch");
                return emcVar;
            }
        });
        dgVarYpw.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.settings.zz.2
            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                JSONObject jSONObject;
                int iEmc2 = ypwVar.emc();
                String strDg = ypwVar.dg();
                if (aa.dg().ndl() && lt.emc().dg() == 1) {
                    tp.emc("Pangle_Debug_Mode", strDg, aa.emc());
                }
                if (!ypwVar.ycc() || TextUtils.isEmpty(strDg)) {
                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.settings.zz.2.2
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                            emcVar.ypw("settings_fetch");
                            return emcVar;
                        }
                    });
                    if (xqVar != null) {
                        sra.emc(xqVar.dg());
                    }
                } else {
                    try {
                        jSONObject = new JSONObject(strDg);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        String strEmc = rie.emc(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (!TextUtils.isEmpty(strEmc)) {
                            try {
                                jSONObject = new JSONObject(strEmc);
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            zz.this.emc(strEmc, ypwVar.xq());
                        } catch (Throwable unused4) {
                        }
                        try {
                            zz.this.emc(jSONObject);
                            aa.dg().emc(System.currentTimeMillis());
                            com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.settings.zz.2.1
                                @Override // com.bytedance.sdk.openadsdk.sba.dg
                                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                                    emcVar.ypw("settings_fetch");
                                    return emcVar;
                                }
                            });
                            sra.ypw();
                        } catch (Throwable unused5) {
                        }
                        zz.this.emc.emc(true);
                        return;
                    }
                }
                if (!ypwVar.ycc()) {
                    com.bytedance.sdk.openadsdk.vk.emc.bw.emc("settings_fetch", xqVar.dg(), iEmc2, ypwVar.ypw());
                }
                zz.this.emc.emc(false);
            }

            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                zz.this.emc.emc(false);
                com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.settings.zz.2.3
                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                        com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                        emcVar.ypw("settings_fetch");
                        return emcVar;
                    }
                });
                if (xqVar != null) {
                    sra.emc(xqVar.dg());
                    com.bytedance.sdk.openadsdk.vk.emc.bw.emc("settings_fetch", xqVar.dg(), -1, iOException != null ? iOException.getMessage() : null);
                }
            }
        });
        com.bytedance.sdk.openadsdk.core.gbl.ypw(sup.emc(aa.emc()));
        DeviceUtils.sup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(String str, Map<String, String> map) {
        int i10 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        map2.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str2 = (String) map2.get("active-control");
                if (str2 != null) {
                    int i11 = Integer.parseInt(str2);
                    String str3 = (String) map2.get(CampaignEx.JSON_KEY_ST_TS);
                    if (str3 != null) {
                        long j10 = Long.parseLong(str3);
                        String str4 = (String) map2.get("pst");
                        String strA = e.a(str + i11 + j10);
                        if (strA != null) {
                            if (strA.equalsIgnoreCase(str4)) {
                                i10 = i11;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        uym.emc(i10);
    }

    public static JSONObject emc(int i10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            gbl gblVarDg = aa.dg();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", tp.rie());
            com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(jSONObject);
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.zz.ypw().ru());
            jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.zz.ypw().gbl());
            if (gblVarDg.sb("mcc")) {
                jSONObject.put("mcc", dr.ypw());
            }
            Context contextEmc = aa.emc();
            jSONObject.put("conn_type", tp.uym(i10));
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", sup.ypw());
            jSONObject.put("time_zone", tp.db());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, tp.ycc());
            jSONObject.put("position", tp.emc() ? 1 : 2);
            jSONObject.put("app_version", tp.msw());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", sup.xq(contextEmc));
            String strDg = com.bytedance.sdk.openadsdk.core.zz.ypw().dg();
            if (strDg != null) {
                jSONObject.put(MBridgeConstans.APP_ID, strDg);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put(CampaignEx.JSON_KEY_ST_TS, jCurrentTimeMillis);
            String strConcat = "";
            if (strDg != null) {
                strConcat = strDg.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.bw.emc(strConcat));
            jSONObject.put("tcstring", gbl.ypw(contextEmc));
            jSONObject.put("tcf_gdpr", gbl.emc(contextEmc));
            jSONObject.put("lmt", DeviceUtils.xq());
            jSONObject.put("locale_language", DeviceUtils.dg());
            jSONObject.put("channel", "main");
            JSONObject jSONObjectUym = gblVarDg.uym();
            if (jSONObjectUym != null) {
                jSONObject.put("digest", jSONObjectUym);
            }
            jSONObject.put("data_time", gblVarDg.msw());
            jSONObject.put("app_set_id_scope", dg.ypw());
            jSONObject.put("app_set_id", dg.xq());
            jSONObject.put("installed_source", dg.dg());
            if (gblVarDg.sb("gaid")) {
                jSONObject.put("did", sup.emc(aa.emc()));
            }
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().ypw());
            String strUym = com.bytedance.sdk.openadsdk.core.zz.ypw().uym();
            if (!TextUtils.isEmpty(strUym)) {
                jSONObject.put("mediation", strUym);
            }
            jSONObject.put("device", DeviceUtils.emc(contextEmc, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.zz.ypw().hxp());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean emc(@NonNull JSONObject jSONObject) {
        this.ypw.emc(jSONObject);
        for (bw bwVar : this.xq) {
            if (bwVar != null) {
                bwVar.emc(jSONObject);
            }
        }
        return this.ypw.xq;
    }

    public static boolean emc() {
        return BinderPoolService.emc;
    }
}
