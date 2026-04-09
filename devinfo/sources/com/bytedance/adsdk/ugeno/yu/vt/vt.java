package com.bytedance.adsdk.ugeno.yu.vt;

import com.bytedance.adsdk.ugeno.yu.le;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends ouw {
    private List<com.bytedance.adsdk.ugeno.yu.ouw.yu> bly;

    public vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
        this.bly = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        com.bytedance.adsdk.ugeno.yu.ouw.lh lhVarOuw;
        Map<String, String> map = this.f7011le;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f7011le.get("name");
        com.bytedance.adsdk.ugeno.yu.ouw.ouw ouwVar = this.f7012lh.lgp;
        if (ouwVar == null || (lhVarOuw = ouwVar.ouw(str)) == null) {
            return;
        }
        lhVarOuw.ouw();
    }
}
