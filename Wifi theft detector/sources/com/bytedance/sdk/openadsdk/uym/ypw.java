package com.bytedance.sdk.openadsdk.uym;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.dg.xq;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.vk.xq;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private static final String[] emc = {"gecko16-normal-useast5.tiktokv.us"};

    public interface emc {
        void emc();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.uym.ypw$ypw, reason: collision with other inner class name */
    public static class C0186ypw {
        private static final ypw emc = new ypw();
    }

    private static String dg() {
        String[] strArrJp = aa.dg().jp();
        if (strArrJp == null) {
            strArrJp = emc;
        }
        String str = strArrJp[new SecureRandom().nextInt(strArrJp.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = emc;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public static void xq() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.uym.ypw.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return iyl.bw();
                }
            });
        } catch (Throwable th) {
            ul.emc("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }

    public ILoader ypw() {
        try {
            return GeckoHubImp.inst(aa.emc()).getGeckoResLoader();
        } catch (Throwable th) {
            ul.emc("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private ypw() {
        try {
            GeckoHubImp.inst(aa.emc());
        } catch (Throwable th) {
            ul.emc("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    public static ypw emc() {
        return C0186ypw.emc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(Map<String, rie> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<rie> it = map.values().iterator();
            while (it.hasNext()) {
                xq.emc(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            ul.emc("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void emc(Map<String, rie> map) {
        emc(map, (emc) null, false);
    }

    public void emc(final Map<String, rie> map, final emc emcVar, boolean z10) {
        try {
            String strEmc = sup.emc(aa.emc());
            if (TextUtils.isEmpty(strEmc)) {
                return;
            }
            for (rie rieVar : map.values()) {
                if (rieVar != null) {
                    if (!z10 && rieVar.ckv()) {
                        map.remove(rieVar.qlw());
                    } else {
                        xq.ypw(rieVar);
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(dg());
            GeckoHubImp.inst(aa.emc()).preload(strEmc, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.uym.ypw.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        rie rieVar2 = (rie) map.get(jSONObject.optString("channel"));
                        if (rieVar2 != null) {
                            xq.emc.emc(str, jSONObject, rieVar2);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        emc emcVar2 = emcVar;
                        if (emcVar2 != null) {
                            emcVar2.emc();
                        }
                        ypw.ypw(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.uym.emc());
        } catch (Throwable th) {
            ypw(map, null, th.toString());
            ul.emc("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    public void emc(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(aa.emc()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                ul.emc("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel emc(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(aa.emc()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            ul.emc("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int emc(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(aa.emc()).getResCount(iLoader, str);
        } catch (Throwable th) {
            ul.emc("GeckoHub", "getResCount error", th);
            return 0;
        }
    }
}
