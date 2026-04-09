package com.bytedance.sdk.openadsdk.core.zz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sup {
    private static String emc;
    private static String ypw;

    public static void emc() {
        com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().emc(new com.bytedance.sdk.component.adexpress.emc.emc.ypw() { // from class: com.bytedance.sdk.openadsdk.core.zz.sup.1
            @Override // com.bytedance.sdk.component.adexpress.emc.emc.ypw
            public int emc(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.ypw
            public Cursor emc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.xq(com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.ypw
            public int emc(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.ypw
            public void emc(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().emc(new com.bytedance.sdk.component.adexpress.emc.emc.xq() { // from class: com.bytedance.sdk.openadsdk.core.zz.sup.2

            /* renamed from: com.bytedance.sdk.openadsdk.core.zz.sup$2$1, reason: invalid class name */
            public class AnonymousClass1 implements Runnable {
                final /* synthetic */ MessageQueue[] emc;
                final /* synthetic */ int xq;
                final /* synthetic */ int ypw;

                public AnonymousClass1(MessageQueue[] messageQueueArr, int i, int i3) {
                    this.emc = messageQueueArr;
                    this.ypw = i;
                    this.xq = i3;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.emc[0] = Looper.myQueue();
                    emc(this.emc[0], this.ypw, this.xq);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public int aa() {
                return com.bytedance.sdk.openadsdk.sra.emc.emc("gaussian_blur_type", 0);
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public com.bytedance.sdk.component.adexpress.emc.xq.emc bw() {
                return com.bytedance.sdk.openadsdk.core.aa.xq().emc();
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public int cf() {
                return vw.xq(com.bytedance.sdk.openadsdk.core.aa.emc());
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public void dg() {
                int iNw = com.bytedance.sdk.openadsdk.core.aa.dg().nw();
                int iWbn = com.bytedance.sdk.openadsdk.core.aa.dg().wbn();
                if (iNw == 0 && iWbn == 0) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.bw.bw.emc().emc(iNw);
                com.bytedance.sdk.component.adexpress.bw.bw.emc().ypw(iWbn);
                int iYcc = com.bytedance.sdk.openadsdk.sra.emc.ycc();
                int iBw = com.bytedance.sdk.openadsdk.sra.emc.bw();
                if (iYcc == 0 && iBw == 0) {
                    return;
                }
                emc(com.bytedance.sdk.openadsdk.core.qh.xq().getLooper().getQueue(), iBw, iYcc);
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public int gbl() {
                return com.bytedance.sdk.openadsdk.core.aa.dg().wbn();
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public String msw() {
                return com.bytedance.sdk.openadsdk.core.zz.ypw().dg();
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public ExecutorService qh() {
                return iyl.ru();
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public int ru() {
                return com.bytedance.sdk.openadsdk.core.aa.dg().nw();
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public int sup() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public ExecutorService sz() {
                return iyl.bw();
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public com.bytedance.sdk.component.uym.ypw.ypw uym() {
                com.bytedance.sdk.component.uym.ypw.ypw ypwVarXq = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().xq();
                ypwVarXq.emc(8);
                ypwVarXq.emc("express_get");
                return ypwVarXq;
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public int vk() {
                return vw.bw(com.bytedance.sdk.openadsdk.core.aa.emc());
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public Handler xq() {
                return com.bytedance.sdk.openadsdk.core.qh.xq();
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public com.bytedance.sdk.component.uym.ypw.emc ycc() {
                com.bytedance.sdk.component.uym.ypw.emc emcVarDg = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().dg();
                emcVarDg.emc(8);
                emcVarDg.emc("express_down");
                return emcVarDg;
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public int zz() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public Context ypw() {
                return com.bytedance.sdk.openadsdk.core.aa.emc();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void ypw(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.zz.sup.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.emc.ypw(i, false, messageQueue).ypw();
                        return false;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.adexpress.emc.emc.xq
            public int emc() {
                if (com.bytedance.sdk.openadsdk.core.aa.dg() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.aa.dg().ycc();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void emc(final MessageQueue messageQueue, final int i, final int i3) {
                if (messageQueue != null) {
                    final int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.sup.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ypw(messageQueue, i);
                            emc(messageQueue, i3);
                        }
                    };
                    if (iEmc > 0) {
                        com.bytedance.sdk.openadsdk.core.qh.xq().postDelayed(runnable, iEmc);
                    } else {
                        runnable.run();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void emc(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.zz.sup.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.emc.ypw(i, true, messageQueue).ypw();
                        return false;
                    }
                });
            }
        });
        com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().emc(new com.bytedance.sdk.component.adexpress.emc.emc.dg() { // from class: com.bytedance.sdk.openadsdk.core.zz.sup.3
            @Override // com.bytedance.sdk.component.adexpress.emc.emc.dg
            public void emc(int i) {
                com.bytedance.sdk.openadsdk.vk.xq.emc().emc(com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().ypw(i).ycc(com.bytedance.sdk.openadsdk.core.msw.emc(i)));
            }
        });
        com.bytedance.sdk.component.zz.emc.emc.emc().emc(new com.bytedance.sdk.component.zz.emc.ypw() { // from class: com.bytedance.sdk.openadsdk.core.zz.sup.4
            @Override // com.bytedance.sdk.component.zz.emc.ypw
            public void emc(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.dg.xq.xq(com.bytedance.sdk.openadsdk.utils.ypw.xq(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.zz.emc.ypw
            public void emc(com.bytedance.sdk.component.zz.ypw.emc emcVar, String str, String str2, JSONObject jSONObject, long j6) {
                com.bytedance.sdk.openadsdk.core.model.rie rieVar = new com.bytedance.sdk.openadsdk.core.model.rie();
                rieVar.sf(emcVar.emc());
                rieVar.db(emcVar.ypw());
                rieVar.rie(emcVar.xq());
                rieVar.hxp(emcVar.dg());
                com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, str, str2, jSONObject, j6);
            }

            @Override // com.bytedance.sdk.component.zz.emc.ypw
            public void emc(com.bytedance.sdk.component.zz.ypw.emc emcVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (emcVar != null) {
                    com.bytedance.sdk.openadsdk.core.model.rie rieVar = new com.bytedance.sdk.openadsdk.core.model.rie();
                    rieVar.sf(emcVar.emc());
                    rieVar.db(emcVar.ypw());
                    rieVar.rie(emcVar.xq());
                    rieVar.hxp(emcVar.dg());
                    com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.core.zz.sup.4.1
                        @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                        public JSONObject emc() {
                            return jSONObject;
                        }

                        @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                        public JSONObject xq() {
                            return jSONObject2;
                        }
                    });
                }
            }
        });
    }

    public static String xq() {
        Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> mapEmc;
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar;
        String strXq;
        if (ypw == null) {
            ypw = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarYpw = com.bytedance.sdk.component.adexpress.emc.ypw.msw.ypw();
        if (emcVarYpw != null && (mapEmc = emcVarYpw.emc()) != null && (emcVar = mapEmc.get("v3")) != null && (strXq = emcVar.xq()) != null && !strXq.equals(ypw)) {
            ypw = strXq;
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_sp", "js_render_v3_ver", strXq);
        }
        return ypw;
    }

    public static String ypw() {
        String strXq;
        if (emc == null) {
            emc = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarYpw = com.bytedance.sdk.component.adexpress.emc.ypw.msw.ypw();
        if (emcVarYpw != null && (strXq = emcVarYpw.xq()) != null && !strXq.equals(emc)) {
            emc = strXq;
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_sp", "js_render_ver", strXq);
        }
        return emc;
    }
}
