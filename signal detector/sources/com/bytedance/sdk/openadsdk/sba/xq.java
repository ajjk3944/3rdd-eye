package com.bytedance.sdk.openadsdk.sba;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.qh;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    private static volatile Handler dg;
    private static volatile emc emc;
    private static volatile HandlerThread xq = msw.emc("pag__bus_monitor", 0);
    private static Boolean ypw;

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler bw() {
        if (xq == null || !xq.isAlive()) {
            synchronized (qh.class) {
                try {
                    if (xq == null || !xq.isAlive()) {
                        xq = msw.emc("csj_init_handle", -1);
                        dg = new Handler(xq.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (dg == null) {
            synchronized (qh.class) {
                try {
                    if (dg == null) {
                        dg = new Handler(xq.getLooper());
                    }
                } finally {
                }
            }
        }
        return dg;
    }

    public static void ypw(dg dgVar) {
        emc().emc(new bw(dgVar, 0, 1, 0));
    }

    public static emc emc() {
        if (emc == null) {
            synchronized (xq.class) {
                try {
                    if (emc == null) {
                        emc = emc.emc(new ypw() { // from class: com.bytedance.sdk.openadsdk.sba.xq.1
                            @Override // com.bytedance.sdk.openadsdk.sba.ypw
                            public Context getContext() {
                                return aa.emc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.sba.ypw
                            public Handler getHandler() {
                                return xq.bw();
                            }

                            @Override // com.bytedance.sdk.openadsdk.sba.ypw
                            public int getOnceLogCount() {
                                int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("bus_monitor_config", "once_count", 10);
                                if (iEmc > 100 || iEmc < 5) {
                                    return 10;
                                }
                                return iEmc;
                            }

                            @Override // com.bytedance.sdk.openadsdk.sba.ypw
                            public int getOnceLogInterval() {
                                int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("bus_monitor_config", "once_interval", 10000);
                                if (iEmc < 10000) {
                                    return 10000;
                                }
                                return iEmc;
                            }

                            @Override // com.bytedance.sdk.openadsdk.sba.ypw
                            public HandlerThread getSafeHandlerThread(String str, int i) {
                                return msw.emc(str, i);
                            }

                            @Override // com.bytedance.sdk.openadsdk.sba.ypw
                            public int getUploadIntervalTime() {
                                int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("bus_monitor_config", "interval", 86400000);
                                if (iEmc < 3600000) {
                                    return 86400000;
                                }
                                return iEmc;
                            }

                            @Override // com.bytedance.sdk.openadsdk.sba.ypw
                            public boolean isMonitorOpen() {
                                if (xq.ypw != null) {
                                    return xq.ypw.booleanValue();
                                }
                                Boolean unused = xq.ypw = Boolean.valueOf(com.bytedance.sdk.openadsdk.sra.emc.emc("bus_monitor_config", "enable", 1) == 1);
                                return xq.ypw.booleanValue();
                            }

                            @Override // com.bytedance.sdk.openadsdk.sba.ypw
                            public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.sba.ypw.emc> list) {
                                if (list == null || list.isEmpty()) {
                                    return;
                                }
                                for (final com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar : list) {
                                    com.bytedance.sdk.openadsdk.vk.xq.emc();
                                    com.bytedance.sdk.openadsdk.vk.xq.emc("bus_monitor", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.sba.xq.1.1
                                        @Override // com.bytedance.sdk.openadsdk.vk.ypw
                                        public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", emcVar.ypw());
                                                jSONObject.put("scene", emcVar.xq());
                                                jSONObject.put("start_count", emcVar.dg());
                                                jSONObject.put("success_count", emcVar.bw());
                                                jSONObject.put("fail_count", emcVar.ycc());
                                                jSONObject.put("rit", emcVar.uym());
                                                jSONObject.put("tag", emcVar.msw());
                                                jSONObject.put("label", emcVar.zz());
                                                jSONObject.put("mediation", emcVar.gbl());
                                                jSONObject.put("is_init", emcVar.sup());
                                                jSONObject.put("extra", emcVar.sz());
                                                jSONObject.put("date_device", emcVar.ru());
                                                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("bus_monitor").ypw(jSONObject.toString());
                                            } catch (Exception e6) {
                                                ul.emc("BusMonitorUtils", "onMonitorUpload: ", e6);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public static void xq(dg dgVar) {
        emc().emc(new bw(dgVar, 0, 0, 1));
    }

    public static void ypw() {
        emc().emc(true);
    }

    public static void emc(dg dgVar) {
        emc().emc(new bw(dgVar, 1, 0, 0));
    }
}
