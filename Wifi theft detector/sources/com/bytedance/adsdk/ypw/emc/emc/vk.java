package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class vk implements bw, gbl, ru, sz, emc.InterfaceC0106emc {
    private final String bw;
    private final com.bytedance.adsdk.ypw.xq.xq.emc dg;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> msw;
    private dg ru;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> uym;
    private final com.bytedance.adsdk.ypw.zz xq;
    private final boolean ycc;
    private final com.bytedance.adsdk.ypw.emc.ypw.vk zz;
    private final Matrix emc = new Matrix();
    private final Path ypw = new Path();

    public vk(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.sup supVar) {
        this.xq = zzVar;
        this.dg = emcVar;
        this.bw = supVar.emc();
        this.ycc = supVar.bw();
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc = supVar.ypw().emc();
        this.uym = emcVarEmc;
        emcVar.emc(emcVarEmc);
        emcVarEmc.emc(this);
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc2 = supVar.xq().emc();
        this.msw = emcVarEmc2;
        emcVar.emc(emcVarEmc2);
        emcVarEmc2.emc(this);
        com.bytedance.adsdk.ypw.emc.ypw.vk vkVarRu = supVar.dg().ru();
        this.zz = vkVarRu;
        vkVarRu.emc(emcVar);
        vkVarRu.emc(this);
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.sz
    public Path dg() {
        Path pathDg = this.ru.dg();
        this.ypw.reset();
        float fFloatValue = this.uym.uym().floatValue();
        float fFloatValue2 = this.msw.uym().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.emc.set(this.zz.ypw(i10 + fFloatValue2));
            this.ypw.addPath(pathDg, this.emc);
        }
        return this.ypw;
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.ru
    public void emc(ListIterator<xq> listIterator) {
        if (this.ru != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.ru = new dg(this.xq, this.dg, "Repeater", this.ycc, arrayList, null);
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
        this.ru.emc(list, list2);
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.uym.uym().floatValue();
        float fFloatValue2 = this.msw.uym().floatValue();
        float fFloatValue3 = this.zz.ypw().uym().floatValue() / 100.0f;
        float fFloatValue4 = this.zz.xq().uym().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.emc.set(matrix);
            float f10 = i11;
            this.emc.preConcat(this.zz.ypw(f10 + fFloatValue2));
            this.ru.emc(canvas, this.emc, (int) (i10 * com.bytedance.adsdk.ypw.ycc.bw.emc(fFloatValue3, fFloatValue4, f10 / fFloatValue)));
        }
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        this.ru.emc(rectF, matrix, z10);
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0106emc
    public void emc() {
        this.xq.invalidateSelf();
    }
}
