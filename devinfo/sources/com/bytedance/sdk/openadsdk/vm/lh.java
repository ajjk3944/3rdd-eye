package com.bytedance.sdk.openadsdk.vm;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.pno;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh {

    /* renamed from: lh, reason: collision with root package name */
    private static volatile HandlerThread f8746lh = pno.ouw("pag__bus_monitor", 0);
    private static volatile ouw ouw;
    private static Boolean vt;
    private static volatile Handler yu;

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler fkw() {
        if (f8746lh == null || !f8746lh.isAlive()) {
            synchronized (jg.class) {
                try {
                    if (f8746lh == null || !f8746lh.isAlive()) {
                        f8746lh = pno.ouw("csj_init_handle", -1);
                        yu = new Handler(f8746lh.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (yu == null) {
            synchronized (jg.class) {
                try {
                    if (yu == null) {
                        yu = new Handler(f8746lh.getLooper());
                    }
                } finally {
                }
            }
        }
        return yu;
    }

    public static void vt(yu yuVar) {
        ouw().ouw(new fkw(yuVar, 0, 1, 0));
    }

    public static void lh(yu yuVar) {
        ouw().ouw(new fkw(yuVar, 0, 0, 1));
    }

    public static ouw ouw() {
        if (ouw == null) {
            synchronized (lh.class) {
                try {
                    if (ouw == null) {
                        ouw = ouw.ouw(new vt() { // from class: com.bytedance.sdk.openadsdk.vm.lh.1
                            @Override // com.bytedance.sdk.openadsdk.vm.vt
                            public final Context getContext() {
                                return zih.ouw();
                            }

                            @Override // com.bytedance.sdk.openadsdk.vm.vt
                            public final Handler getHandler() {
                                return lh.fkw();
                            }

                            @Override // com.bytedance.sdk.openadsdk.vm.vt
                            public final int getOnceLogCount() {
                                int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("bus_monitor_config", "once_count", 10);
                                if (iOuw > 100 || iOuw < 5) {
                                    return 10;
                                }
                                return iOuw;
                            }

                            @Override // com.bytedance.sdk.openadsdk.vm.vt
                            public final int getOnceLogInterval() {
                                int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("bus_monitor_config", "once_interval", 10000);
                                if (iOuw < 10000) {
                                    return 10000;
                                }
                                return iOuw;
                            }

                            @Override // com.bytedance.sdk.openadsdk.vm.vt
                            public final HandlerThread getSafeHandlerThread(String str, int i4) {
                                return pno.ouw(str, i4);
                            }

                            @Override // com.bytedance.sdk.openadsdk.vm.vt
                            public final int getUploadIntervalTime() {
                                int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("bus_monitor_config", "interval", 86400000);
                                if (iOuw < 3600000) {
                                    return 86400000;
                                }
                                return iOuw;
                            }

                            @Override // com.bytedance.sdk.openadsdk.vm.vt
                            public final boolean isMonitorOpen() {
                                if (lh.vt != null) {
                                    return lh.vt.booleanValue();
                                }
                                Boolean unused = lh.vt = Boolean.valueOf(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("bus_monitor_config", "enable", 1) == 1);
                                return lh.vt.booleanValue();
                            }

                            @Override // com.bytedance.sdk.openadsdk.vm.vt
                            public final void onMonitorUpload(List<com.bytedance.sdk.openadsdk.vm.vt.ouw> list) {
                                if (list == null || list.isEmpty()) {
                                    return;
                                }
                                for (final com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar : list) {
                                    com.bytedance.sdk.openadsdk.rn.lh.ouw();
                                    com.bytedance.sdk.openadsdk.rn.lh.ouw("bus_monitor", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.vm.lh.1.1
                                        @Override // com.bytedance.sdk.openadsdk.rn.vt
                                        public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", ouwVar.vt);
                                                jSONObject.put("scene", ouwVar.f8751lh);
                                                jSONObject.put("start_count", ouwVar.yu);
                                                jSONObject.put("success_count", ouwVar.fkw);
                                                jSONObject.put("fail_count", ouwVar.f8750le);
                                                jSONObject.put("rit", ouwVar.ra);
                                                jSONObject.put("tag", ouwVar.pno);
                                                jSONObject.put("label", ouwVar.bly);
                                                jSONObject.put("mediation", ouwVar.f8749cf);
                                                jSONObject.put("is_init", ouwVar.ryl);
                                                jSONObject.put("extra", ouwVar.mwh);
                                                jSONObject.put("date_device", ouwVar.tlj);
                                                String string = jSONObject.toString();
                                                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                                                yuVar.ouw = "bus_monitor";
                                                yuVar.bly = string;
                                                ko.vt("BusMonitorUtils", "logStr = ", string);
                                                return yuVar;
                                            } catch (Exception e2) {
                                                qbp.ouw("BusMonitorUtils", "onMonitorUpload: ", e2);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    public static void vt() {
        ouw().ouw(true);
    }

    public static void ouw(yu yuVar) {
        ouw().ouw(new fkw(yuVar, 1, 0, 0));
    }
}
