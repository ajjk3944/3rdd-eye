package com.bytedance.adsdk.vt.lh.ouw;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements mwh<PointF, PointF> {
    private final List<com.bytedance.adsdk.vt.ra.ouw<PointF>> ouw;

    public fkw(List<com.bytedance.adsdk.vt.ra.ouw<PointF>> list) {
        this.ouw = list;
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public final List<com.bytedance.adsdk.vt.ra.ouw<PointF>> lh() {
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouw() {
        return this.ouw.get(0).yu() ? new com.bytedance.adsdk.vt.ouw.vt.cf(this.ouw) : new com.bytedance.adsdk.vt.ouw.vt.tlj(this.ouw);
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public final boolean vt() {
        return this.ouw.size() == 1 && this.ouw.get(0).yu();
    }
}
