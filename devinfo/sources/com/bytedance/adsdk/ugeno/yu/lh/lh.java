package com.bytedance.adsdk.ugeno.yu.lh;

import android.content.res.Resources;
import com.bytedance.adsdk.ugeno.yu.le;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends com.bytedance.adsdk.ugeno.yu.vt.ouw {
    public lh(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt;
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.f7012lh;
        if (lhVar == null || (lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(lhVar)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarLe = lhVarVt.le("SwiperView");
        if (lhVarLe instanceof com.bytedance.adsdk.ugeno.vt) {
            ((com.bytedance.adsdk.ugeno.le.vt) ((com.bytedance.adsdk.ugeno.vt) lhVarLe).fkw).cf(((com.bytedance.adsdk.ugeno.le.vt) r0.fkw).getCurrentItem() - 1);
        }
    }
}
