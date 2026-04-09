package com.bytedance.adsdk.ugeno.dg;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class emc implements msw {
    @Override // com.bytedance.adsdk.ugeno.dg.msw
    public List<uym> emc() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new uym("slide") { // from class: com.bytedance.adsdk.ugeno.dg.emc.1
            @Override // com.bytedance.adsdk.ugeno.dg.uym
            public com.bytedance.adsdk.ugeno.dg.dg.xq emc(Context context) {
                return new com.bytedance.adsdk.ugeno.dg.dg.bw(context);
            }
        });
        arrayList.add(new uym("tap") { // from class: com.bytedance.adsdk.ugeno.dg.emc.2
            @Override // com.bytedance.adsdk.ugeno.dg.uym
            public com.bytedance.adsdk.ugeno.dg.dg.xq emc(Context context) {
                return new com.bytedance.adsdk.ugeno.dg.dg.zz(context);
            }
        });
        arrayList.add(new uym("timer") { // from class: com.bytedance.adsdk.ugeno.dg.emc.3
            @Override // com.bytedance.adsdk.ugeno.dg.uym
            public com.bytedance.adsdk.ugeno.dg.dg.xq emc(Context context) {
                return new com.bytedance.adsdk.ugeno.dg.dg.ru(context);
            }
        });
        arrayList.add(new uym("touchStart") { // from class: com.bytedance.adsdk.ugeno.dg.emc.4
            @Override // com.bytedance.adsdk.ugeno.dg.uym
            public com.bytedance.adsdk.ugeno.dg.dg.xq emc(Context context) {
                return new com.bytedance.adsdk.ugeno.dg.dg.sup(context);
            }
        });
        arrayList.add(new uym("touchEnd") { // from class: com.bytedance.adsdk.ugeno.dg.emc.5
            @Override // com.bytedance.adsdk.ugeno.dg.uym
            public com.bytedance.adsdk.ugeno.dg.dg.xq emc(Context context) {
                return new com.bytedance.adsdk.ugeno.dg.dg.gbl(context);
            }
        });
        arrayList.add(new uym("animateState") { // from class: com.bytedance.adsdk.ugeno.dg.emc.6
            @Override // com.bytedance.adsdk.ugeno.dg.uym
            public com.bytedance.adsdk.ugeno.dg.dg.xq emc(Context context) {
                return new com.bytedance.adsdk.ugeno.dg.dg.ypw(context);
            }
        });
        return arrayList;
    }
}
