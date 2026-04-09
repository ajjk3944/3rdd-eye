package com.bytedance.sdk.openadsdk.ee.ypw;

import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg {
    public static void emc(final rie rieVar, final emc emcVar, final bw.emc emcVar2) {
        rieVar.pia();
        iyl.xq(new com.bytedance.sdk.component.msw.msw("mrc_report") { // from class: com.bytedance.sdk.openadsdk.ee.ypw.dg.1
            @Override // java.lang.Runnable
            public void run() {
                if (rieVar.jnq()) {
                    if (rieVar.tze()) {
                        com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(rieVar.cwv(), new xq.ypw("show_urls", rieVar));
                    } else {
                        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar);
                    }
                }
                String strEmc = tp.emc(rieVar);
                final JSONObject jSONObject = new JSONObject();
                emc emcVar3 = emcVar;
                JSONObject jSONObjectEmc = null;
                if (emcVar3 != null) {
                    try {
                        jSONObject.put("root_view", emc.emc(emcVar3));
                        bw.emc emcVar4 = emcVar2;
                        if (emcVar4 != null) {
                            int i10 = emcVar4.emc;
                            if (i10 != -1) {
                                jSONObject.put("dynamic_show_type", i10);
                            }
                            int i11 = emcVar2.ypw;
                            if (i11 != -1) {
                                jSONObjectEmc = com.bytedance.sdk.openadsdk.dg.xq.emc(i11 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                final JSONObject jSONObject2 = jSONObjectEmc;
                com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, strEmc, "mrc_show", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.ee.ypw.dg.1.1
                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject emc() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject xq() {
                        return jSONObject;
                    }
                });
            }
        });
    }
}
