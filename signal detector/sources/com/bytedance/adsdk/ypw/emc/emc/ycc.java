package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import com.bytedance.adsdk.ypw.xq.ypw.yzg;
import java.util.List;

/* loaded from: classes.dex */
public class ycc implements gbl, sz, emc.InterfaceC0021emc {
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, PointF> bw;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, PointF> dg;
    private boolean msw;
    private final com.bytedance.adsdk.ypw.zz xq;
    private final com.bytedance.adsdk.ypw.xq.ypw.ypw ycc;
    private final String ypw;
    private final Path emc = new Path();
    private final ypw uym = new ypw();

    public ycc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.ypw ypwVar) {
        this.ypw = ypwVar.emc();
        this.xq = zzVar;
        com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emcVarEmc = ypwVar.xq().emc();
        this.dg = emcVarEmc;
        com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emcVarEmc2 = ypwVar.ypw().emc();
        this.bw = emcVarEmc2;
        this.ycc = ypwVar;
        emcVar.emc(emcVarEmc);
        emcVar.emc(emcVarEmc2);
        emcVarEmc.emc(this);
        emcVarEmc2.emc(this);
    }

    private void ypw() {
        this.msw = false;
        this.xq.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.sz
    public Path dg() {
        if (this.msw) {
            return this.emc;
        }
        this.emc.reset();
        if (this.ycc.bw()) {
            this.msw = true;
            return this.emc;
        }
        PointF pointFUym = this.dg.uym();
        float f2 = pointFUym.x / 2.0f;
        float f5 = pointFUym.y / 2.0f;
        float f6 = f2 * 0.55228f;
        float f7 = 0.55228f * f5;
        this.emc.reset();
        if (this.ycc.dg()) {
            float f8 = -f5;
            this.emc.moveTo(0.0f, f8);
            float f9 = 0.0f - f6;
            float f10 = -f2;
            float f11 = 0.0f - f7;
            this.emc.cubicTo(f9, f8, f10, f11, f10, 0.0f);
            float f12 = f7 + 0.0f;
            this.emc.cubicTo(f10, f12, f9, f5, 0.0f, f5);
            float f13 = f6 + 0.0f;
            this.emc.cubicTo(f13, f5, f2, f12, f2, 0.0f);
            this.emc.cubicTo(f2, f11, f13, f8, 0.0f, f8);
        } else {
            float f14 = -f5;
            this.emc.moveTo(0.0f, f14);
            float f15 = f6 + 0.0f;
            float f16 = 0.0f - f7;
            this.emc.cubicTo(f15, f14, f2, f16, f2, 0.0f);
            float f17 = f7 + 0.0f;
            this.emc.cubicTo(f2, f17, f15, f5, 0.0f, f5);
            float f18 = 0.0f - f6;
            float f19 = -f2;
            this.emc.cubicTo(f18, f5, f19, f17, f19, 0.0f);
            this.emc.cubicTo(f19, f16, f18, f14, 0.0f, f14);
        }
        PointF pointFUym2 = this.bw.uym();
        this.emc.offset(pointFUym2.x, pointFUym2.y);
        this.emc.close();
        this.uym.emc(this.emc);
        this.msw = true;
        return this.emc;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0021emc
    public void emc() {
        ypw();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
        for (int i = 0; i < list.size(); i++) {
            xq xqVar = list.get(i);
            if (xqVar instanceof ylm) {
                ylm ylmVar = (ylm) xqVar;
                if (ylmVar.ypw() == yzg.emc.SIMULTANEOUSLY) {
                    this.uym.emc(ylmVar);
                    ylmVar.emc(this);
                }
            }
        }
    }
}
