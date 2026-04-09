package com.bytedance.adsdk.ypw.xq.xq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.ypw.xq.xq.bw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ypw extends emc {
    private final Paint gbl;
    private final List<emc> msw;
    private final RectF ru;
    private boolean sup;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> uym;
    private final RectF zz;

    /* renamed from: com.bytedance.adsdk.ypw.xq.xq.ypw$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[bw.ypw.values().length];
            emc = iArr;
            try {
                iArr[bw.ypw.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[bw.ypw.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ypw(com.bytedance.adsdk.ypw.zz zzVar, bw bwVar, List<bw> list, com.bytedance.adsdk.ypw.uym uymVar, Context context) {
        int i10;
        emc emcVar;
        bw.ypw ypwVarSup;
        int i11;
        super(zzVar, bwVar);
        this.msw = new ArrayList();
        this.zz = new RectF();
        this.ru = new RectF();
        this.gbl = new Paint();
        this.sup = true;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarYlm = bwVar.ylm();
        if (ypwVarYlm != null) {
            com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc = ypwVarYlm.emc();
            this.uym = emcVarEmc;
            emc(emcVarEmc);
            this.uym.emc(this);
        } else {
            this.uym = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(uymVar.sz().size());
        int size = list.size() - 1;
        emc emcVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            bw bwVar2 = list.get(size);
            emc emcVarEmc2 = emc.emc(this, bwVar2, zzVar, uymVar, context);
            if (emcVarEmc2 != null) {
                longSparseArray.put(emcVarEmc2.ypw().bw(), emcVarEmc2);
                if (emcVar2 != null) {
                    emcVar2.emc(emcVarEmc2);
                    emcVar2 = null;
                } else {
                    this.msw.add(0, emcVarEmc2);
                    if (bwVar2 != null && (ypwVarSup = bwVar2.sup()) != null && ((i11 = AnonymousClass1.emc[ypwVarSup.ordinal()]) == 1 || i11 == 2)) {
                        emcVar2 = emcVarEmc2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < longSparseArray.size(); i10++) {
            emc emcVar3 = (emc) longSparseArray.get(longSparseArray.keyAt(i10));
            if (emcVar3 != null && (emcVar = (emc) longSparseArray.get(emcVar3.ypw().sz())) != null) {
                emcVar3.ypw(emcVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc
    public void emc(boolean z10) {
        super.emc(z10);
        Iterator<emc> it = this.msw.iterator();
        while (it.hasNext()) {
            it.next().emc(z10);
        }
    }

    public List<emc> sup() {
        return this.msw;
    }

    public void ypw(boolean z10) {
        this.sup = z10;
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc
    public void ypw(Canvas canvas, Matrix matrix, int i10) {
        super.ypw(canvas, matrix, i10);
        com.bytedance.adsdk.ypw.bw.emc("CompositionLayer#draw");
        this.ru.set(0.0f, 0.0f, this.xq.msw(), this.xq.zz());
        matrix.mapRect(this.ru);
        boolean z10 = this.ypw.zz() && this.msw.size() > 1 && i10 != 255;
        if (z10) {
            this.gbl.setAlpha(i10);
            com.bytedance.adsdk.ypw.ycc.ycc.emc(canvas, this.ru, this.gbl);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.msw.size() - 1; size >= 0; size--) {
            if (((this.sup || !"__container".equals(this.xq.ycc())) && !this.ru.isEmpty()) ? canvas.clipRect(this.ru) : true) {
                this.msw.get(size).emc(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.ypw.bw.ypw("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc, com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        super.emc(rectF, matrix, z10);
        for (int size = this.msw.size() - 1; size >= 0; size--) {
            this.zz.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.msw.get(size).emc(this.zz, this.emc, true);
            rectF.union(this.zz);
        }
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc
    public void emc(float f10) {
        super.emc(f10);
        if (this.uym != null) {
            f10 = ((this.uym.uym().floatValue() * this.xq.emc().sup()) - this.xq.emc().ycc()) / (this.ypw.db().aa() + 0.01f);
        }
        if (this.uym == null) {
            f10 -= this.xq.xq();
        }
        if (this.xq.ypw() != 0.0f && !"__container".equals(this.xq.ycc())) {
            f10 /= this.xq.ypw();
        }
        for (int size = this.msw.size() - 1; size >= 0; size--) {
            this.msw.get(size).emc(f10);
        }
    }
}
