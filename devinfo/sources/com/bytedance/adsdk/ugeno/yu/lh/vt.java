package com.bytedance.adsdk.ugeno.yu.lh;

import android.content.res.Resources;
import com.bytedance.adsdk.ugeno.yu.le;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends com.bytedance.adsdk.ugeno.yu.vt.ouw {
    public vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() throws Resources.NotFoundException {
        if (this.f7012lh == null) {
            return;
        }
        int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.f7011le.get("position"), 0);
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.f7012lh);
        if (lhVarVt == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarLe = lhVarVt.le("SwiperView");
        if (lhVarLe instanceof com.bytedance.adsdk.ugeno.vt) {
            com.bytedance.adsdk.ugeno.vt vtVar = (com.bytedance.adsdk.ugeno.vt) lhVarLe;
            if (((com.bytedance.adsdk.ugeno.le.vt) vtVar.fkw).getCurrentItem() != iOuw) {
                ((com.bytedance.adsdk.ugeno.le.vt) vtVar.fkw).cf(iOuw);
            }
        }
    }
}
