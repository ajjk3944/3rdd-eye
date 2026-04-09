package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.sb;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gbl {
    private static final AtomicInteger emc = new AtomicInteger(0);
    private static final AtomicBoolean ypw = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void dg() {
        if (emc.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.iyl.emc().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbl.2
                @Override // java.lang.Runnable
                public void run() {
                    gbl.ypw(sup.emc(aa.emc()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xq() {
        emc.set(0);
    }

    public static void ypw(final String str) {
        com.bytedance.sdk.openadsdk.utils.iyl.xq(new com.bytedance.sdk.component.msw.msw("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.gbl.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                final String strYzg = com.bytedance.sdk.openadsdk.utils.tp.yzg();
                com.bytedance.sdk.openadsdk.vk.xq.emc(0, strYzg);
                com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.gbl.1.1
                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                        com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                        emcVar.ypw("ipv6");
                        return emcVar;
                    }
                });
                if (TextUtils.isEmpty(strYzg)) {
                    com.bytedance.sdk.openadsdk.vk.xq.emc(-1, strYzg, -1, "url is null");
                    com.bytedance.sdk.openadsdk.vk.emc.bw.emc("ipv6", "", -2, "url is null");
                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.gbl.1.2
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                            emcVar.ypw("ipv6");
                            return emcVar;
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.uym.ypw.dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
                try {
                    dgVarYpw.ypw(strYzg);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.sb.emc(aa.emc(), 0L));
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("device_id", Long.parseLong(str));
                    }
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.dg.emc.emc.emc().ypw());
                    JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new hxp(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                    if (jSONObjectEncryptType4 == null || jSONObjectEncryptType4.optInt("cypher") != 4) {
                        ee.ypw(false);
                    } else {
                        ee.ypw(true);
                        dgVarYpw.ypw("x-pgli18n", "4");
                        dgVarYpw.ypw(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/json; charset=utf-8");
                    }
                    if (gbl.ypw(jSONObjectEncryptType4)) {
                        jSONObject = jSONObjectEncryptType4;
                    }
                    dgVarYpw.ypw(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/json; charset=utf-8");
                    dgVarYpw.ypw(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.tp.dg());
                    dgVarYpw.emc(jSONObject);
                    dgVarYpw.emc(6);
                    dgVarYpw.emc("send_i_p_v6");
                    dgVarYpw.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.gbl.1.3
                        @Override // com.bytedance.sdk.component.uym.emc.emc
                        public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                            if (ypwVar.ycc()) {
                                gbl.ypw(ypwVar.dg(), strYzg);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.vk.xq.emc(-1, strYzg, ypwVar.emc(), ypwVar.ypw());
                            com.bytedance.sdk.openadsdk.vk.emc.bw.emc("ipv6", strYzg, ypwVar.emc(), ypwVar.ypw());
                            com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.gbl.1.3.1
                                @Override // com.bytedance.sdk.openadsdk.sba.dg
                                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                                    emcVar.ypw("ipv6");
                                    return emcVar;
                                }
                            });
                            gbl.dg();
                        }

                        @Override // com.bytedance.sdk.component.uym.emc.emc
                        public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.vk.xq.emc(-1, strYzg, 1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.vk.emc.bw.emc("ipv6", strYzg, -1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.gbl.1.3.2
                                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                        com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                                        emcVar.ypw("ipv6");
                                        return emcVar;
                                    }
                                });
                            }
                            gbl.dg();
                        }
                    });
                } catch (Exception e10) {
                    com.bytedance.sdk.openadsdk.vk.xq.emc(-1, strYzg, -2, e10.getMessage());
                    com.bytedance.sdk.openadsdk.vk.emc.bw.emc("ipv6", strYzg, -3, e10.getMessage());
                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.gbl.1.4
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                            emcVar.ypw("ipv6");
                            return emcVar;
                        }
                    });
                    com.bytedance.sdk.component.utils.ul.xq("build ipv6 request failed:" + e10.getMessage(), new Object[0]);
                }
            }
        });
    }

    public static class emc implements sb.emc {
        private static final AtomicBoolean emc = new AtomicBoolean(false);
        private static volatile long ypw = -1;

        private emc() {
        }

        public static void emc() {
            if (emc.compareAndSet(false, true)) {
                ypw = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.sb.emc(new emc(), aa.emc());
            }
        }

        public void ypw() {
            com.bytedance.sdk.component.utils.sb.emc(this);
        }

        @Override // com.bytedance.sdk.component.utils.sb.emc
        public void emc(Context context, Intent intent, boolean z10, int i10) {
            if (System.currentTimeMillis() - ypw >= 2000 && i10 != 0) {
                gbl.xq();
                gbl.ypw(sup.emc(aa.emc()));
                ypw();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ypw(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.gbl.ypw(java.lang.String, java.lang.String):void");
    }

    public static void emc(String str) {
        AtomicBoolean atomicBoolean = ypw;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.sba.msw(aa.emc())) {
                atomicBoolean.set(false);
            } else {
                emc.emc();
                ypw(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ypw(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }
}
