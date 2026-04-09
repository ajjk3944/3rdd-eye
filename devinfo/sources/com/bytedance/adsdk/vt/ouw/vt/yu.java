package com.bytedance.adsdk.vt.ouw.vt;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends ra<Float> {
    public yu(List<com.bytedance.adsdk.vt.ra.ouw<Float>> list) {
        super(list);
    }

    private float vt(com.bytedance.adsdk.vt.ra.ouw<Float> ouwVar, float f10) {
        Float f11 = ouwVar.vt;
        if (f11 == null || ouwVar.f7205lh == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.yu != null) {
            ouwVar.pno.getClass();
            lh();
            ra();
            throw null;
        }
        if (ouwVar.bly == -3987645.8f) {
            ouwVar.bly = f11.floatValue();
        }
        float f12 = ouwVar.bly;
        if (ouwVar.tlj == -3987645.8f) {
            ouwVar.tlj = ouwVar.f7205lh.floatValue();
        }
        return com.bytedance.adsdk.vt.le.ra.ouw(f12, ouwVar.tlj, f10);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        return Float.valueOf(vt(ouwVar, f10));
    }

    public final float pno() {
        return vt(vt(), yu());
    }
}
