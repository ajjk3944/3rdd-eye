package com.bytedance.adsdk.vt.lh.lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.vt.lh.lh.fkw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends ouw {

    /* renamed from: cf, reason: collision with root package name */
    public final List<ouw> f7094cf;

    /* renamed from: jg, reason: collision with root package name */
    private final RectF f7095jg;
    private final RectF ko;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> mwh;
    private final Paint rn;
    public boolean ryl;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.lh.lh.vt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[fkw.vt.values().length];
            ouw = iArr;
            try {
                iArr[fkw.vt.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[fkw.vt.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public vt(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar, List<fkw> list, com.bytedance.adsdk.vt.ra raVar, Context context) {
        int i4;
        ouw ouwVar;
        fkw.vt vtVar;
        int i10;
        super(blyVar, fkwVar);
        this.f7094cf = new ArrayList();
        this.f7095jg = new RectF();
        this.ko = new RectF();
        this.rn = new Paint();
        this.ryl = true;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2 = fkwVar.f7074th;
        if (vtVar2 != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = vtVar2.ouw();
            this.mwh = ouwVarOuw;
            ouw(ouwVarOuw);
            this.mwh.ouw(this);
        } else {
            this.mwh = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(raVar.pno.size());
        int size = list.size() - 1;
        ouw ouwVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            fkw fkwVar2 = list.get(size);
            ouw ouwVarOuw2 = ouw.ouw(this, fkwVar2, blyVar, raVar, context);
            if (ouwVarOuw2 != null) {
                longSparseArray.put(ouwVarOuw2.f7085lh.yu, ouwVarOuw2);
                if (ouwVar2 != null) {
                    ouwVar2.ouw(ouwVarOuw2);
                    ouwVar2 = null;
                } else {
                    this.f7094cf.add(0, ouwVarOuw2);
                    if (fkwVar2 != null && (vtVar = fkwVar2.zin) != null && ((i10 = AnonymousClass1.ouw[vtVar.ordinal()]) == 1 || i10 == 2)) {
                        ouwVar2 = ouwVarOuw2;
                    }
                }
            }
            size--;
        }
        for (i4 = 0; i4 < longSparseArray.size(); i4++) {
            ouw ouwVar3 = (ouw) longSparseArray.get(longSparseArray.keyAt(i4));
            if (ouwVar3 != null && (ouwVar = (ouw) longSparseArray.get(ouwVar3.f7085lh.f7072le)) != null) {
                ouwVar3.vt(ouwVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void ouw(boolean z3) {
        super.ouw(z3);
        Iterator<ouw> it = this.f7094cf.iterator();
        while (it.hasNext()) {
            it.next().ouw(z3);
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i4) {
        super.vt(canvas, matrix, i4);
        com.bytedance.adsdk.vt.fkw.ouw("CompositionLayer#draw");
        RectF rectF = this.ko;
        fkw fkwVar = this.f7085lh;
        rectF.set(0.0f, 0.0f, fkwVar.ko, fkwVar.rn);
        matrix.mapRect(this.ko);
        boolean z3 = this.vt.jqy && this.f7094cf.size() > 1 && i4 != 255;
        if (z3) {
            this.rn.setAlpha(i4);
            com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.ko, this.rn);
        } else {
            canvas.save();
        }
        if (z3) {
            i4 = 255;
        }
        for (int size = this.f7094cf.size() - 1; size >= 0; size--) {
            if (((this.ryl || !"__container".equals(this.f7085lh.f7073lh)) && !this.ko.isEmpty()) ? canvas.clipRect(this.ko) : true) {
                this.f7094cf.get(size).ouw(canvas, matrix, i4);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.vt.fkw.vt("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z3) {
        super.ouw(rectF, matrix, z3);
        for (int size = this.f7094cf.size() - 1; size >= 0; size--) {
            this.f7095jg.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f7094cf.get(size).ouw(this.f7095jg, this.ouw, true);
            rectF.union(this.f7095jg);
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void ouw(float f10) {
        super.ouw(f10);
        if (this.mwh != null) {
            f10 = ((this.mwh.le().floatValue() * this.f7085lh.vt.ryl) - this.f7085lh.vt.tlj) / (this.vt.ouw.vt() + 0.01f);
        }
        if (this.mwh == null) {
            fkw fkwVar = this.f7085lh;
            f10 -= fkwVar.f7071jg / fkwVar.vt.vt();
        }
        fkw fkwVar2 = this.f7085lh;
        if (fkwVar2.mwh != 0.0f && !"__container".equals(fkwVar2.f7073lh)) {
            f10 /= this.f7085lh.mwh;
        }
        for (int size = this.f7094cf.size() - 1; size >= 0; size--) {
            this.f7094cf.get(size).ouw(f10);
        }
    }
}
