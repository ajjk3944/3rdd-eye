package com.bytedance.adsdk.ypw.emc.ypw;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class ru extends uym<PointF> {
    private final float[] bw;
    private final PointF dg;
    private zz uym;
    private final PathMeasure ycc;

    public ru(List<? extends com.bytedance.adsdk.ypw.uym.emc<PointF>> list) {
        super(list);
        this.dg = new PointF();
        this.bw = new float[2];
        this.ycc = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public PointF emc(com.bytedance.adsdk.ypw.uym.emc<PointF> emcVar, float f2) {
        zz zzVar = (zz) emcVar;
        Path pathYpw = zzVar.ypw();
        if (pathYpw == null) {
            return emcVar.emc;
        }
        if (this.xq != null) {
            zzVar.uym.getClass();
            dg();
            msw();
            throw null;
        }
        if (this.uym != zzVar) {
            this.ycc.setPath(pathYpw, false);
            this.uym = zzVar;
        }
        PathMeasure pathMeasure = this.ycc;
        pathMeasure.getPosTan(pathMeasure.getLength() * f2, this.bw, null);
        PointF pointF = this.dg;
        float[] fArr = this.bw;
        pointF.set(fArr[0], fArr[1]);
        return this.dg;
    }
}
