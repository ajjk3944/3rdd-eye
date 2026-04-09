package com.bytedance.adsdk.vt.ouw.vt;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends ra<Integer> {
    public vt(List<com.bytedance.adsdk.vt.ra.ouw<Integer>> list) {
        super(list);
    }

    private int vt(com.bytedance.adsdk.vt.ra.ouw<Integer> ouwVar, float f10) {
        if (ouwVar.vt == null || ouwVar.f7205lh == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.yu == null) {
            return com.bytedance.adsdk.vt.le.vt.ouw(com.bytedance.adsdk.vt.le.ra.vt(f10, 0.0f, 1.0f), ouwVar.vt.intValue(), ouwVar.f7205lh.intValue());
        }
        ouwVar.pno.getClass();
        lh();
        ra();
        throw null;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        return Integer.valueOf(vt(ouwVar, f10));
    }

    public final int pno() {
        return vt(vt(), yu());
    }
}
