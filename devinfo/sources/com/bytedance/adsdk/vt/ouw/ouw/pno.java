package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno implements cf, fkw, ouw.InterfaceC0040ouw {
    private final RectF bly;

    /* renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.lh.vt.ra f7156cf;

    /* renamed from: jg, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> f7157jg;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ko;

    /* renamed from: lh, reason: collision with root package name */
    private final boolean f7159lh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> mwh;
    float ouw;
    private final Paint pno;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> qbp;
    private final Path ra;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> rn;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> ryl;

    /* renamed from: th, reason: collision with root package name */
    private final int f7160th;
    private final List<mwh> tlj;
    private final com.bytedance.adsdk.vt.bly vm;
    private final String vt;
    private final com.bytedance.adsdk.vt.lh.lh.ouw yu;
    private com.bytedance.adsdk.vt.ouw.vt.zih zih;
    private com.bytedance.adsdk.vt.ouw.vt.lh zin;
    private final LongSparseArray<LinearGradient> fkw = new LongSparseArray<>();

    /* renamed from: le, reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f7158le = new LongSparseArray<>();

    public pno(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.fkw fkwVar) {
        Path path = new Path();
        this.ra = path;
        this.pno = new com.bytedance.adsdk.vt.ouw.ouw(1);
        this.bly = new RectF();
        this.tlj = new ArrayList();
        this.ouw = 0.0f;
        this.yu = ouwVar;
        this.vt = fkwVar.ra;
        this.f7159lh = fkwVar.pno;
        this.vm = blyVar;
        this.f7156cf = fkwVar.ouw;
        path.setFillType(fkwVar.vt);
        this.f7160th = (int) (raVar.ouw() / 32.0f);
        com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> ouwVarOuw = fkwVar.f7110lh.ouw();
        this.ryl = ouwVarOuw;
        ouwVarOuw.ouw(this);
        ouwVar.ouw(ouwVarOuw);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw2 = fkwVar.yu.ouw();
        this.mwh = ouwVarOuw2;
        ouwVarOuw2.ouw(this);
        ouwVar.ouw(ouwVarOuw2);
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw3 = fkwVar.fkw.ouw();
        this.f7157jg = ouwVarOuw3;
        ouwVarOuw3.ouw(this);
        ouwVar.ouw(ouwVarOuw3);
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw4 = fkwVar.f7109le.ouw();
        this.ko = ouwVarOuw4;
        ouwVarOuw4.ouw(this);
        ouwVar.ouw(ouwVarOuw4);
        if (ouwVar.vt() != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw5 = ouwVar.vt().ouw.ouw();
            this.qbp = ouwVarOuw5;
            ouwVarOuw5.ouw(this);
            ouwVar.ouw(this.qbp);
        }
        if (ouwVar.lh() != null) {
            this.zin = new com.bytedance.adsdk.vt.ouw.vt.lh(this, ouwVar, ouwVar.lh());
        }
    }

    private int vt() {
        int iRound = Math.round(this.f7157jg.ra() * this.f7160th);
        int iRound2 = Math.round(this.ko.ra() * this.f7160th);
        int iRound3 = Math.round(this.ryl.ra() * this.f7160th);
        int i4 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i4 = i4 * 31 * iRound2;
        }
        return iRound3 != 0 ? i4 * 31 * iRound3 : i4;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.vm.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            lh lhVar = list2.get(i4);
            if (lhVar instanceof mwh) {
                this.tlj.add((mwh) lhVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i4) {
        RadialGradient radialGradient;
        Shader radialGradient2;
        if (this.f7159lh) {
            return;
        }
        com.bytedance.adsdk.vt.fkw.ouw("GradientFillContent#draw");
        this.ra.reset();
        for (int i10 = 0; i10 < this.tlj.size(); i10++) {
            this.ra.addPath(this.tlj.get(i10).yu(), matrix);
        }
        this.ra.computeBounds(this.bly, false);
        if (this.f7156cf == com.bytedance.adsdk.vt.lh.vt.ra.LINEAR) {
            long jVt = vt();
            radialGradient = this.fkw.get(jVt);
            if (radialGradient == null) {
                PointF pointFLe = this.f7157jg.le();
                PointF pointFLe2 = this.ko.le();
                com.bytedance.adsdk.vt.lh.vt.yu yuVarLe = this.ryl.le();
                radialGradient2 = new LinearGradient(pointFLe.x, pointFLe.y, pointFLe2.x, pointFLe2.y, ouw(yuVarLe.vt), yuVarLe.ouw, Shader.TileMode.CLAMP);
                this.fkw.put(jVt, radialGradient2);
                radialGradient = radialGradient2;
            }
        } else {
            long jVt2 = vt();
            radialGradient = this.f7158le.get(jVt2);
            if (radialGradient == null) {
                PointF pointFLe3 = this.f7157jg.le();
                PointF pointFLe4 = this.ko.le();
                com.bytedance.adsdk.vt.lh.vt.yu yuVarLe2 = this.ryl.le();
                int[] iArrOuw = ouw(yuVarLe2.vt);
                float[] fArr = yuVarLe2.ouw;
                float f10 = pointFLe3.x;
                float f11 = pointFLe3.y;
                float fHypot = (float) Math.hypot(pointFLe4.x - f10, pointFLe4.y - f11);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient2 = new RadialGradient(f10, f11, fHypot, iArrOuw, fArr, Shader.TileMode.CLAMP);
                this.f7158le.put(jVt2, radialGradient2);
                radialGradient = radialGradient2;
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.pno.setShader(radialGradient);
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar = this.rn;
        if (ouwVar != null) {
            this.pno.setColorFilter(ouwVar.le());
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar2 = this.qbp;
        if (ouwVar2 != null) {
            float fFloatValue = ouwVar2.le().floatValue();
            if (fFloatValue == 0.0f) {
                this.pno.setMaskFilter(null);
            } else if (fFloatValue != this.ouw) {
                this.pno.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.ouw = fFloatValue;
        }
        com.bytedance.adsdk.vt.ouw.vt.lh lhVar = this.zin;
        if (lhVar != null) {
            lhVar.ouw(this.pno);
        }
        this.pno.setAlpha(com.bytedance.adsdk.vt.le.ra.ouw((int) ((((i4 / 255.0f) * this.mwh.le().intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.ra, this.pno);
        com.bytedance.adsdk.vt.fkw.vt("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z3) {
        this.ra.reset();
        for (int i4 = 0; i4 < this.tlj.size(); i4++) {
            this.ra.addPath(this.tlj.get(i4).yu(), matrix);
        }
        this.ra.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] ouw(int[] iArr) {
        if (this.zih == null) {
            return iArr;
        }
        throw null;
    }
}
