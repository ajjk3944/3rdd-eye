package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends ra<PointF> {
    private final PointF fkw;

    /* renamed from: le, reason: collision with root package name */
    private final float[] f7189le;
    private bly pno;
    private final PathMeasure ra;

    public tlj(List<? extends com.bytedance.adsdk.vt.ra.ouw<PointF>> list) {
        super(list);
        this.fkw = new PointF();
        this.f7189le = new float[2];
        this.ra = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        bly blyVar = (bly) ouwVar;
        Path path = blyVar.ouw;
        if (path == null) {
            return (PointF) ouwVar.vt;
        }
        if (this.yu != null) {
            blyVar.pno.getClass();
            lh();
            ra();
            throw null;
        }
        if (this.pno != blyVar) {
            this.ra.setPath(path, false);
            this.pno = blyVar;
        }
        PathMeasure pathMeasure = this.ra;
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.f7189le, null);
        PointF pointF = this.fkw;
        float[] fArr = this.f7189le;
        pointF.set(fArr[0], fArr[1]);
        return this.fkw;
    }
}
