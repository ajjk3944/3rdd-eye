package com.bytedance.adsdk.ugeno.dg;

import com.bytedance.adsdk.ugeno.dg.ycc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bw implements xq {
    @Override // com.bytedance.adsdk.ugeno.dg.xq
    public List<ypw> emc() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ypw("update") { // from class: com.bytedance.adsdk.ugeno.dg.bw.1
            @Override // com.bytedance.adsdk.ugeno.dg.ypw
            public com.bytedance.adsdk.ugeno.dg.ypw.emc emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
                return new com.bytedance.adsdk.ugeno.dg.ypw.bw(xqVar, str, emcVar);
            }
        });
        arrayList.add(new ypw("emit") { // from class: com.bytedance.adsdk.ugeno.dg.bw.2
            @Override // com.bytedance.adsdk.ugeno.dg.ypw
            public com.bytedance.adsdk.ugeno.dg.ypw.emc emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
                return new com.bytedance.adsdk.ugeno.dg.ypw.ypw(xqVar, str, emcVar);
            }
        });
        arrayList.add(new ypw("startAnimate") { // from class: com.bytedance.adsdk.ugeno.dg.bw.3
            @Override // com.bytedance.adsdk.ugeno.dg.ypw
            public com.bytedance.adsdk.ugeno.dg.ypw.emc emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
                return new com.bytedance.adsdk.ugeno.dg.ypw.dg(xqVar, str, emcVar);
            }
        });
        return arrayList;
    }
}
