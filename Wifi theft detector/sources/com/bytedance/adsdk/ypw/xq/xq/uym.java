package com.bytedance.adsdk.ypw.xq.xq;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.ypw.xq.ypw.vk;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class uym extends emc {
    private final ypw msw;
    private final com.bytedance.adsdk.ypw.emc.emc.dg uym;

    public uym(com.bytedance.adsdk.ypw.zz zzVar, bw bwVar, ypw ypwVar, com.bytedance.adsdk.ypw.uym uymVar) {
        super(zzVar, bwVar);
        this.msw = ypwVar;
        com.bytedance.adsdk.ypw.emc.emc.dg dgVar = new com.bytedance.adsdk.ypw.emc.emc.dg(zzVar, this, new vk("__container", bwVar.qh(), false), uymVar);
        this.uym = dgVar;
        List<com.bytedance.adsdk.ypw.emc.emc.xq> list = Collections.EMPTY_LIST;
        dgVar.emc(list, list);
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc, com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        super.emc(rectF, matrix, z10);
        this.uym.emc(rectF, this.emc, z10);
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc
    public com.bytedance.adsdk.ypw.bw.ru gbl() {
        com.bytedance.adsdk.ypw.bw.ru ruVarGbl = super.gbl();
        return ruVarGbl != null ? ruVarGbl : this.msw.gbl();
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc
    public com.bytedance.adsdk.ypw.xq.ypw.emc ru() {
        com.bytedance.adsdk.ypw.xq.ypw.emc emcVarRu = super.ru();
        return emcVarRu != null ? emcVarRu : this.msw.ru();
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc
    public void ypw(Canvas canvas, Matrix matrix, int i10) {
        super.ypw(canvas, matrix, i10);
        this.uym.emc(canvas, matrix, i10);
    }
}
