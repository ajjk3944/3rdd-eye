package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.PointF;
import java.util.List;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf extends ra<PointF> {
    private final PointF fkw;

    public cf(List<com.bytedance.adsdk.vt.ra.ouw<PointF>> list) {
        super(list);
        this.fkw = new PointF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    /* renamed from: vt, reason: merged with bridge method [inline-methods] */
    public PointF ouw(com.bytedance.adsdk.vt.ra.ouw<PointF> ouwVar, float f10, float f11) {
        PointF pointF;
        PointF pointF2 = ouwVar.vt;
        if (pointF2 == null || (pointF = ouwVar.f7205lh) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.yu != null) {
            ouwVar.pno.getClass();
            lh();
            ra();
            throw null;
        }
        PointF pointF5 = this.fkw;
        float f12 = pointF3.x;
        float fC = c.c(pointF4.x, f12, f10, f12);
        float f13 = pointF3.y;
        pointF5.set(fC, c.c(pointF4.y, f13, f11, f13));
        return this.fkw;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        return ouw(ouwVar, f10, f10);
    }
}
