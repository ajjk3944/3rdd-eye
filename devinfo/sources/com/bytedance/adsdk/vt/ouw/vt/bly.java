package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends com.bytedance.adsdk.vt.ra.ouw<PointF> {
    private final com.bytedance.adsdk.vt.ra.ouw<PointF> ko;
    Path ouw;

    public bly(com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.ra.ouw<PointF> ouwVar) {
        super(raVar, ouwVar.vt, ouwVar.f7205lh, ouwVar.yu, ouwVar.fkw, ouwVar.f7204le, ouwVar.ra, ouwVar.pno);
        this.ko = ouwVar;
        ouw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ouw() {
        T t10;
        T t11;
        T t12 = this.f7205lh;
        boolean z3 = (t12 == 0 || (t11 = this.vt) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.vt;
        if (t13 == 0 || (t10 = this.f7205lh) == 0 || z3) {
            return;
        }
        com.bytedance.adsdk.vt.ra.ouw<PointF> ouwVar = this.ko;
        this.ouw = com.bytedance.adsdk.vt.le.pno.ouw((PointF) t13, (PointF) t10, ouwVar.mwh, ouwVar.f7203jg);
    }
}
