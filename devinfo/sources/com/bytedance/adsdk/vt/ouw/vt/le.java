package com.bytedance.adsdk.vt.ouw.vt;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends ra<Integer> {
    public le(List<com.bytedance.adsdk.vt.ra.ouw<Integer>> list) {
        super(list);
    }

    private int vt(com.bytedance.adsdk.vt.ra.ouw<Integer> ouwVar, float f10) {
        Integer num = ouwVar.vt;
        if (num == null || ouwVar.f7205lh == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.yu != null) {
            ouwVar.pno.getClass();
            lh();
            ra();
            throw null;
        }
        if (ouwVar.f7202cf == 784923401) {
            ouwVar.f7202cf = num.intValue();
        }
        int i4 = ouwVar.f7202cf;
        if (ouwVar.ryl == 784923401) {
            ouwVar.ryl = ouwVar.f7205lh.intValue();
        }
        return com.bytedance.adsdk.vt.le.ra.ouw(i4, ouwVar.ryl, f10);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        return Integer.valueOf(vt(ouwVar, f10));
    }

    public final int pno() {
        return vt(vt(), yu());
    }
}
