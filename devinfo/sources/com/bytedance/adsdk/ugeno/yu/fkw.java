package com.bytedance.adsdk.ugeno.yu;

import com.bytedance.adsdk.ugeno.yu.le;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements lh {
    @Override // com.bytedance.adsdk.ugeno.yu.lh
    public final List<vt> ouw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vt("update") { // from class: com.bytedance.adsdk.ugeno.yu.fkw.1
            @Override // com.bytedance.adsdk.ugeno.yu.vt
            public final com.bytedance.adsdk.ugeno.yu.vt.ouw ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
                return new com.bytedance.adsdk.ugeno.yu.vt.fkw(lhVar, str, ouwVar);
            }
        });
        arrayList.add(new vt("emit") { // from class: com.bytedance.adsdk.ugeno.yu.fkw.2
            @Override // com.bytedance.adsdk.ugeno.yu.vt
            public final com.bytedance.adsdk.ugeno.yu.vt.ouw ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
                return new com.bytedance.adsdk.ugeno.yu.vt.vt(lhVar, str, ouwVar);
            }
        });
        arrayList.add(new vt("startAnimate") { // from class: com.bytedance.adsdk.ugeno.yu.fkw.3
            @Override // com.bytedance.adsdk.ugeno.yu.vt
            public final com.bytedance.adsdk.ugeno.yu.vt.ouw ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
                return new com.bytedance.adsdk.ugeno.yu.vt.yu(lhVar, str, ouwVar);
            }
        });
        return arrayList;
    }
}
