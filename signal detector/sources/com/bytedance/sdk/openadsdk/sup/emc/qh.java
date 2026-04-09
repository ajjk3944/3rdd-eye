package com.bytedance.sdk.openadsdk.sup.emc;

import com.bytedance.sdk.component.emc.xq;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qh extends com.bytedance.sdk.component.emc.xq<JSONObject, JSONObject> {
    private HashSet<Integer> dg = new HashSet<>();
    private WeakReference<rtt> emc;
    private long xq;
    private rie ypw;

    public qh(rtt rttVar, rie rieVar) {
        this.emc = new WeakReference<>(rttVar);
        this.ypw = rieVar;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, final rtt rttVar, final rie rieVar) {
        cfVar.emc("requestDelayCallback", new xq.ypw() { // from class: com.bytedance.sdk.openadsdk.sup.emc.qh.1
            @Override // com.bytedance.sdk.component.emc.xq.ypw
            public com.bytedance.sdk.component.emc.xq emc() {
                return new qh(rttVar, rieVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.emc.xq
    public void emc(JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) {
        rtt rttVar = this.emc.get();
        if (rttVar != null && jSONObject != null) {
            rttVar.emc(new com.bytedance.sdk.openadsdk.sz.ypw() { // from class: com.bytedance.sdk.openadsdk.sup.emc.qh.2
                @Override // com.bytedance.sdk.openadsdk.sz.ypw
                public void emc(int i) {
                    qh.this.dg.add(Integer.valueOf(i));
                    if (qh.this.dg.size() >= qh.this.xq) {
                        try {
                            qh.this.emc((qh) new JSONObject());
                            qh.this.dg.clear();
                        } catch (Exception e6) {
                            e6.getMessage();
                        }
                    }
                }
            });
            if (jSONObject.optInt("delay", -1) < 0) {
                return;
            }
            this.xq = r2 / TTAdConstant.STYLE_SIZE_RADIO_1_1;
            return;
        }
        xq();
    }
}
