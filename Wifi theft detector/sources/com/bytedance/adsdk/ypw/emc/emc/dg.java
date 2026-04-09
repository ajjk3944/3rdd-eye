package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class dg implements bw, sz, emc.InterfaceC0106emc {
    private final RectF bw;
    private final Path dg;
    private final Paint emc;
    private com.bytedance.adsdk.ypw.emc.ypw.vk gbl;
    private final List<xq> msw;
    private List<sz> ru;
    private final boolean uym;
    private final Matrix xq;
    private final String ycc;
    private final RectF ypw;
    private final com.bytedance.adsdk.ypw.zz zz;

    public dg(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.vk vkVar, com.bytedance.adsdk.ypw.uym uymVar) {
        this(zzVar, emcVar, vkVar.emc(), vkVar.xq(), emc(zzVar, uymVar, emcVar, vkVar.ypw()), emc(vkVar.ypw()));
    }

    private boolean bw() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.msw.size(); i11++) {
            if ((this.msw.get(i11) instanceof bw) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<xq> emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, List<com.bytedance.adsdk.ypw.xq.ypw.xq> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            xq xqVarEmc = list.get(i10).emc(zzVar, uymVar, emcVar);
            if (xqVarEmc != null) {
                arrayList.add(xqVarEmc);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.sz
    public Path dg() {
        this.xq.reset();
        com.bytedance.adsdk.ypw.emc.ypw.vk vkVar = this.gbl;
        if (vkVar != null) {
            this.xq.set(vkVar.dg());
        }
        this.dg.reset();
        if (this.uym) {
            return this.dg;
        }
        for (int size = this.msw.size() - 1; size >= 0; size--) {
            xq xqVar = this.msw.get(size);
            if (xqVar instanceof sz) {
                this.dg.addPath(((sz) xqVar).dg(), this.xq);
            }
        }
        return this.dg;
    }

    public Matrix xq() {
        com.bytedance.adsdk.ypw.emc.ypw.vk vkVar = this.gbl;
        if (vkVar != null) {
            return vkVar.dg();
        }
        this.xq.reset();
        return this.xq;
    }

    public List<sz> ypw() {
        if (this.ru == null) {
            this.ru = new ArrayList();
            for (int i10 = 0; i10 < this.msw.size(); i10++) {
                xq xqVar = this.msw.get(i10);
                if (xqVar instanceof sz) {
                    this.ru.add((sz) xqVar);
                }
            }
        }
        return this.ru;
    }

    public dg(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, String str, boolean z10, List<xq> list, com.bytedance.adsdk.ypw.xq.emc.sup supVar) {
        this.emc = new com.bytedance.adsdk.ypw.emc.emc();
        this.ypw = new RectF();
        this.xq = new Matrix();
        this.dg = new Path();
        this.bw = new RectF();
        this.ycc = str;
        this.zz = zzVar;
        this.uym = z10;
        this.msw = list;
        if (supVar != null) {
            com.bytedance.adsdk.ypw.emc.ypw.vk vkVarRu = supVar.ru();
            this.gbl = vkVarRu;
            vkVarRu.emc(emcVar);
            this.gbl.emc(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            xq xqVar = list.get(size);
            if (xqVar instanceof ru) {
                arrayList.add((ru) xqVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((ru) arrayList.get(size2)).emc(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.ypw.xq.emc.sup emc(List<com.bytedance.adsdk.ypw.xq.ypw.xq> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.ypw.xq.ypw.xq xqVar = list.get(i10);
            if (xqVar instanceof com.bytedance.adsdk.ypw.xq.emc.sup) {
                return (com.bytedance.adsdk.ypw.xq.emc.sup) xqVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0106emc
    public void emc() {
        this.zz.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.msw.size());
        arrayList.addAll(list);
        for (int size = this.msw.size() - 1; size >= 0; size--) {
            xq xqVar = this.msw.get(size);
            xqVar.emc(arrayList, this.msw.subList(0, size));
            arrayList.add(xqVar);
        }
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(Canvas canvas, Matrix matrix, int i10) {
        if (this.uym) {
            return;
        }
        this.xq.set(matrix);
        com.bytedance.adsdk.ypw.emc.ypw.vk vkVar = this.gbl;
        if (vkVar != null) {
            this.xq.preConcat(vkVar.dg());
            i10 = (int) (((((this.gbl.emc() == null ? 100 : this.gbl.emc().uym().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.zz.zz() && bw() && i10 != 255;
        if (z10) {
            this.ypw.set(0.0f, 0.0f, 0.0f, 0.0f);
            emc(this.ypw, this.xq, true);
            this.emc.setAlpha(i10);
            com.bytedance.adsdk.ypw.ycc.ycc.emc(canvas, this.ypw, this.emc);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.msw.size() - 1; size >= 0; size--) {
            xq xqVar = this.msw.get(size);
            if (xqVar instanceof bw) {
                ((bw) xqVar).emc(canvas, this.xq, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        this.xq.set(matrix);
        com.bytedance.adsdk.ypw.emc.ypw.vk vkVar = this.gbl;
        if (vkVar != null) {
            this.xq.preConcat(vkVar.dg());
        }
        this.bw.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.msw.size() - 1; size >= 0; size--) {
            xq xqVar = this.msw.get(size);
            if (xqVar instanceof bw) {
                ((bw) xqVar).emc(this.bw, this.xq, z10);
                rectF.union(this.bw);
            }
        }
    }
}
