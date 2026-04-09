package com.bytedance.sdk.openadsdk.ul.emc.emc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.cf;
import com.bytedance.sdk.openadsdk.core.iyl;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sf;
import com.bytedance.sdk.openadsdk.core.model.sz;
import com.bytedance.sdk.openadsdk.core.model.ycc;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.bw;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw implements xq {
    protected String emc;
    private final WeakReference<Context> xq;
    protected int ypw;

    public ypw(Context context, String str) {
        this.xq = new WeakReference<>(context);
        this.emc = str;
        "====tag===".concat(String.valueOf(str));
        if (aa.emc() == null) {
            aa.ypw(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bw(rie rieVar) {
        if (ypw(rieVar)) {
            rieVar.bw(true);
            bw.emc(rieVar);
            return;
        }
        if (dg(rieVar)) {
            rieVar.bw(true);
            bw.emc(rieVar);
            return;
        }
        if (emc(rieVar, false)) {
            bw.emc(rieVar);
            return;
        }
        if (xq(rieVar)) {
            rieVar.bw(true);
            bw.emc(rieVar);
        } else {
            if (rieVar.mjd() != null || rieVar.xst() == null) {
                return;
            }
            iyl.emc(emc(), rieVar.xst(), rieVar, tp.emc(this.emc), this.emc, true);
            rieVar.bw(true);
            bw.emc(rieVar);
        }
    }

    private static boolean ypw() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.ul.emc.emc.xq
    public boolean dg(rie rieVar) {
        ycc yccVarMjd;
        if (rieVar == null || (yccVarMjd = rieVar.mjd()) == null || rieVar.fw() == 0) {
            return false;
        }
        String strXq = yccVarMjd.xq();
        if (TextUtils.isEmpty(strXq)) {
            return false;
        }
        return emc(rieVar, strXq, emc(), this.emc, new HashMap());
    }

    @Override // com.bytedance.sdk.openadsdk.ul.emc.emc.xq
    public boolean xq(rie rieVar) {
        ycc yccVarMjd;
        if (rieVar == null || (yccVarMjd = rieVar.mjd()) == null) {
            return false;
        }
        return emc(emc(), rieVar, yccVarMjd.emc(), yccVarMjd.xq());
    }

    public static boolean emc(Context context, String str, String str2, String str3, rie rieVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, str3, "store_open", (JSONObject) null);
                bw.emc(rieVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, C.DEFAULT_BUFFER_SEGMENT_SIZE).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, str3, "store_open", (JSONObject) null);
                        bw.emc(rieVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    public boolean ypw(rie rieVar) throws JSONException {
        com.bytedance.sdk.openadsdk.core.dg.emc(rieVar, this.emc, 1, null);
        sz szVarKda = rieVar.kda();
        if (szVarKda == null) {
            com.bytedance.sdk.openadsdk.core.dg.emc(rieVar, this.emc, -1, null);
            return false;
        }
        HashMap map = new HashMap();
        emc(rieVar, map);
        if (emc.emc(emc(), szVarKda.emc(), rieVar, tp.ypw(rieVar), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, this.emc, "open_fallback_url", map);
        return false;
    }

    public static boolean ypw(rie rieVar, Context context, boolean z10) {
        String strXq;
        IPBroadcastReceiver iPBroadcastReceiverEmc;
        if (rieVar != null && context != null) {
            try {
                sf sfVarAu = rieVar.au();
                if (sfVarAu != null && !TextUtils.isEmpty(sfVarAu.ru())) {
                    if (sfVarAu.zz() && emc(rieVar, context, z10)) {
                        return true;
                    }
                    if (sfVarAu.uym() || sfVarAu.msw()) {
                        if (rieVar.sba() == 1) {
                            strXq = sfVarAu.emc();
                        } else {
                            strXq = (rieVar.mjd() == null || TextUtils.isEmpty(rieVar.mjd().xq())) ? null : rieVar.mjd().xq();
                        }
                        if (!TextUtils.isEmpty(strXq) && (iPBroadcastReceiverEmc = IPBroadcastReceiver.emc(context, rieVar)) != null) {
                            iPBroadcastReceiverEmc.emc(strXq, rieVar);
                        }
                    }
                    final boolean zEmc = emc.emc(context, sfVarAu.ru(), rieVar, tp.ypw(rieVar), emc(rieVar, z10, sfVarAu), true);
                    com.bytedance.sdk.openadsdk.utils.iyl.ypw(new msw("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.4
                        @Override // java.lang.Runnable
                        public void run() throws JSONException {
                            if (zEmc) {
                                zz.emc("oem_store", "1");
                            } else {
                                zz.emc("oem_store", "-2");
                            }
                        }
                    });
                    return zEmc;
                }
            } catch (Throwable th) {
                ul.xq("GPDownLoader", th.getMessage());
            }
        }
        return false;
    }

    public static boolean emc(rie rieVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentEmc;
        if (rieVar != null && rieVar.fw() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentEmc = tp.emc(context, str)) == null) {
                return false;
            }
            intentEmc.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentEmc.addFlags(268435456);
            }
            context.startActivity(intentEmc);
            if (map == null) {
                map = new HashMap<>();
            }
            if (rieVar != null && rieVar.aod() == 0) {
                map.put("auto_click", Boolean.valueOf(!rieVar.yzg()));
            }
            map.put("can_query_install", Integer.valueOf(ypw() ? 1 : 0));
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.ul.emc.emc.xq
    public void emc(int i10) {
        this.ypw = i10;
    }

    public boolean emc(Context context, rie rieVar, String str, String str2) {
        return emc(context, str, str2, this.emc, rieVar);
    }

    public Context emc() {
        WeakReference<Context> weakReference = this.xq;
        return (weakReference == null || weakReference.get() == null) ? aa.emc() : this.xq.get();
    }

    @Override // com.bytedance.sdk.openadsdk.ul.emc.emc.xq
    public void emc(final rie rieVar) {
        if (emc() == null || rieVar == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.sra.emc.emc("gp_downloader_async", 0) == 1) {
            com.bytedance.sdk.openadsdk.utils.iyl.zz().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.1
                @Override // java.lang.Runnable
                public void run() {
                    ypw.this.bw(rieVar);
                }
            });
        } else {
            bw(rieVar);
        }
    }

    private void emc(rie rieVar, Map<String, Object> map) {
        if (rieVar != null && rieVar.aod() == 0) {
            map.put("auto_click", Boolean.valueOf(!rieVar.yzg()));
        }
        if (rieVar != null && rieVar.aod() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.ypw >= 11));
        }
        map.put("can_query_install", Integer.valueOf(ypw() ? 1 : 0));
    }

    public boolean emc(rie rieVar, boolean z10) {
        return ypw(rieVar, emc(), z10);
    }

    private static void emc(final JSONObject jSONObject, rie rieVar, String str, final int i10) {
        try {
            com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.2
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject emc() {
                    try {
                        jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean emc(rie rieVar, Context context, boolean z10) {
        if (rieVar != null && rieVar.au() != null && rieVar.au().zz() && !TextUtils.isEmpty(rieVar.au().ru()) && context != null) {
            try {
                sf sfVarAu = rieVar.au();
                String strEmc = tp.emc(rieVar);
                final JSONObject jSONObjectGbl = sfVarAu.gbl();
                jSONObjectGbl.put("from_web", z10 ? 1 : 0);
                jSONObjectGbl.put("is_w2a", rieVar.sba());
                com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, strEmc, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.3
                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject emc() {
                        try {
                            jSONObjectGbl.put(NotificationCompat.CATEGORY_STATUS, 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObjectGbl;
                    }
                });
                Intent intentEmc = emc(context, sfVarAu);
                if (intentEmc == null) {
                    emc(jSONObjectGbl, rieVar, strEmc, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!com.bytedance.sdk.openadsdk.utils.rie.emc((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityYpw = cf.emc().bw().ypw();
                    if (activityYpw != null && com.bytedance.sdk.openadsdk.utils.rie.emc(activityYpw)) {
                        context = activityYpw;
                    }
                }
                if (!(context instanceof Activity)) {
                    emc(jSONObjectGbl, rieVar, strEmc, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentEmc.resolveActivity(packageManager) != null) {
                    try {
                        ((Activity) context).startActivityForResult(intentEmc, 0);
                        emc(jSONObjectGbl, rieVar, strEmc, 1);
                        return true;
                    } catch (Throwable unused) {
                        emc(jSONObjectGbl, rieVar, strEmc, -3);
                        return false;
                    }
                }
                emc(jSONObjectGbl, rieVar, strEmc, -4);
                return false;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    private static Intent emc(Context context, sf sfVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strDg = sfVar.dg();
            if (!TextUtils.isEmpty(strDg)) {
                intent.setPackage(strDg);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(sfVar.ru()));
            boolean z10 = true;
            if (sfVar.ypw() != 1) {
                z10 = false;
            }
            intent.putExtra("overlay", z10);
            if (TextUtils.isEmpty(sfVar.xq())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", sfVar.xq());
            }
            sfVar.emc(intent);
            return intent;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    @NonNull
    private static Map<String, Object> emc(rie rieVar, boolean z10, sf sfVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", sfVar.ycc());
            jSONObject.put("from_web", z10 ? 1 : 0);
            jSONObject.put("is_w2a", rieVar.sba());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    public static boolean emc(String str, rie rieVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if ("market".equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!"http".equals(scheme) && !HttpRequest.DEFAULT_SCHEME.equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter("uri")) != null) {
                        return emc(queryParameter, rieVar);
                    }
                }
                return true;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    public static boolean emc(rie rieVar, String str) {
        if (rieVar == null || rieVar.au() == null) {
            return false;
        }
        String strBw = rieVar.au().bw();
        if (TextUtils.isEmpty(strBw)) {
            return false;
        }
        return Pattern.compile(strBw).matcher(str).matches();
    }
}
