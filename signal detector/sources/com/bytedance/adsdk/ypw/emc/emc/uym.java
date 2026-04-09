package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class uym implements bw, gbl, emc.InterfaceC0021emc {
    private final String bw;
    private final com.bytedance.adsdk.ypw.xq.xq.emc dg;
    float emc;
    private final com.bytedance.adsdk.ypw.zz gbl;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> msw;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> ru;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> sup;
    private com.bytedance.adsdk.ypw.emc.ypw.xq sz;
    private final List<sz> uym;
    private final Paint xq;
    private final boolean ycc;
    private final Path ypw;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> zz;

    public uym(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.cf cfVar) {
        Path path = new Path();
        this.ypw = path;
        this.xq = new com.bytedance.adsdk.ypw.emc.emc(1);
        this.uym = new ArrayList();
        this.dg = emcVar;
        this.bw = cfVar.emc();
        this.ycc = cfVar.bw();
        this.gbl = zzVar;
        if (emcVar.ru() != null) {
            com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc = emcVar.ru().emc().emc();
            this.sup = emcVarEmc;
            emcVarEmc.emc(this);
            emcVar.emc(this.sup);
        }
        if (emcVar.gbl() != null) {
            this.sz = new com.bytedance.adsdk.ypw.emc.ypw.xq(this, emcVar, emcVar.gbl());
        }
        if (cfVar.ypw() == null || cfVar.xq() == null) {
            this.msw = null;
            this.zz = null;
            return;
        }
        path.setFillType(cfVar.dg());
        com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVarEmc2 = cfVar.ypw().emc();
        this.msw = emcVarEmc2;
        emcVarEmc2.emc(this);
        emcVar.emc(emcVarEmc2);
        com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVarEmc3 = cfVar.xq().emc();
        this.zz = emcVarEmc3;
        emcVarEmc3.emc(this);
        emcVar.emc(emcVarEmc3);
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0021emc
    public void emc() {
        this.gbl.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
        for (int i = 0; i < list2.size(); i++) {
            xq xqVar = list2.get(i);
            if (xqVar instanceof sz) {
                this.uym.add((sz) xqVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(Canvas canvas, Matrix matrix, int i) {
        if (this.ycc) {
            return;
        }
        com.bytedance.adsdk.ypw.bw.emc("FillContent#draw");
        this.xq.setColor((com.bytedance.adsdk.ypw.ycc.bw.emc((int) ((((i / 255.0f) * this.zz.uym().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.ypw.emc.ypw.ypw) this.msw).zz() & 16777215));
        com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> emcVar = this.ru;
        if (emcVar != null) {
            this.xq.setColorFilter(emcVar.uym());
        }
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVar2 = this.sup;
        if (emcVar2 != null) {
            float fFloatValue = emcVar2.uym().floatValue();
            if (fFloatValue == 0.0f) {
                this.xq.setMaskFilter(null);
            } else if (fFloatValue != this.emc) {
                this.xq.setMaskFilter(this.dg.ypw(fFloatValue));
            }
            this.emc = fFloatValue;
        }
        com.bytedance.adsdk.ypw.emc.ypw.xq xqVar = this.sz;
        if (xqVar != null) {
            xqVar.emc(this.xq);
        }
        this.ypw.reset();
        for (int i3 = 0; i3 < this.uym.size(); i3++) {
            this.ypw.addPath(this.uym.get(i3).dg(), matrix);
        }
        canvas.drawPath(this.ypw, this.xq);
        com.bytedance.adsdk.ypw.bw.ypw("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z6) {
        this.ypw.reset();
        for (int i = 0; i < this.uym.size(); i++) {
            this.ypw.addPath(this.uym.get(i).dg(), matrix);
        }
        this.ypw.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
