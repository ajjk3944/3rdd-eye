package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw implements cf, fkw, ouw.InterfaceC0040ouw {

    /* renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f7152cf;

    /* renamed from: jg, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f7153jg;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ko;

    /* renamed from: lh, reason: collision with root package name */
    float f7155lh;
    private final List<com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float>> mwh;
    protected final com.bytedance.adsdk.vt.lh.lh.ouw ouw;
    private final com.bytedance.adsdk.vt.bly pno;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> rn;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Integer> ryl;
    private final float[] tlj;
    final Paint vt;
    private com.bytedance.adsdk.vt.ouw.vt.lh zih;
    private final PathMeasure yu = new PathMeasure();
    private final Path fkw = new Path();

    /* renamed from: le, reason: collision with root package name */
    private final Path f7154le = new Path();
    private final RectF ra = new RectF();
    private final List<C0039ouw> bly = new ArrayList();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.ouw.ouw.ouw$ouw, reason: collision with other inner class name */
    public static final class C0039ouw {
        final List<mwh> ouw;
        final zin vt;

        public /* synthetic */ C0039ouw(zin zinVar, byte b10) {
            this(zinVar);
        }

        private C0039ouw(zin zinVar) {
            this.ouw = new ArrayList();
            this.vt = zinVar;
        }
    }

    public ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, Paint.Cap cap, Paint.Join join, float f10, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, List<com.bytedance.adsdk.vt.lh.ouw.vt> list, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2) {
        com.bytedance.adsdk.vt.ouw.ouw ouwVar2 = new com.bytedance.adsdk.vt.ouw.ouw(1);
        this.vt = ouwVar2;
        this.f7155lh = 0.0f;
        this.pno = blyVar;
        this.ouw = ouwVar;
        ouwVar2.setStyle(Paint.Style.STROKE);
        ouwVar2.setStrokeCap(cap);
        ouwVar2.setStrokeJoin(join);
        ouwVar2.setStrokeMiter(f10);
        this.ryl = yuVar.ouw();
        this.f7152cf = vtVar.ouw();
        if (vtVar2 == null) {
            this.f7153jg = null;
        } else {
            this.f7153jg = vtVar2.ouw();
        }
        this.mwh = new ArrayList(list.size());
        this.tlj = new float[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.mwh.add(list.get(i4).ouw());
        }
        ouwVar.ouw(this.ryl);
        ouwVar.ouw(this.f7152cf);
        for (int i10 = 0; i10 < this.mwh.size(); i10++) {
            ouwVar.ouw(this.mwh.get(i10));
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar3 = this.f7153jg;
        if (ouwVar3 != null) {
            ouwVar.ouw(ouwVar3);
        }
        this.ryl.ouw(this);
        this.f7152cf.ouw(this);
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.mwh.get(i11).ouw(this);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar4 = this.f7153jg;
        if (ouwVar4 != null) {
            ouwVar4.ouw(this);
        }
        if (ouwVar.vt() != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = ouwVar.vt().ouw.ouw();
            this.rn = ouwVarOuw;
            ouwVarOuw.ouw(this);
            ouwVar.ouw(this.rn);
        }
        if (ouwVar.lh() != null) {
            this.zih = new com.bytedance.adsdk.vt.ouw.vt.lh(this, ouwVar, ouwVar.lh());
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.pno.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(java.util.List<com.bytedance.adsdk.vt.ouw.ouw.lh> r8, java.util.List<com.bytedance.adsdk.vt.ouw.ouw.lh> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L20
            java.lang.Object r3 = r8.get(r0)
            com.bytedance.adsdk.vt.ouw.ouw.lh r3 = (com.bytedance.adsdk.vt.ouw.ouw.lh) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.vt.ouw.ouw.zin
            if (r4 == 0) goto L1d
            com.bytedance.adsdk.vt.ouw.ouw.zin r3 = (com.bytedance.adsdk.vt.ouw.ouw.zin) r3
            com.bytedance.adsdk.vt.lh.vt.th$ouw r4 = r3.vt
            com.bytedance.adsdk.vt.lh.vt.th$ouw r5 = com.bytedance.adsdk.vt.lh.vt.th.ouw.INDIVIDUALLY
            if (r4 != r5) goto L1d
            r2 = r3
        L1d:
            int r0 = r0 + (-1)
            goto L8
        L20:
            if (r2 == 0) goto L25
            r2.ouw(r7)
        L25:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2b:
            if (r8 < 0) goto L67
            java.lang.Object r0 = r9.get(r8)
            com.bytedance.adsdk.vt.ouw.ouw.lh r0 = (com.bytedance.adsdk.vt.ouw.ouw.lh) r0
            boolean r3 = r0 instanceof com.bytedance.adsdk.vt.ouw.ouw.zin
            r4 = 0
            if (r3 == 0) goto L52
            r3 = r0
            com.bytedance.adsdk.vt.ouw.ouw.zin r3 = (com.bytedance.adsdk.vt.ouw.ouw.zin) r3
            com.bytedance.adsdk.vt.lh.vt.th$ouw r5 = r3.vt
            com.bytedance.adsdk.vt.lh.vt.th$ouw r6 = com.bytedance.adsdk.vt.lh.vt.th.ouw.INDIVIDUALLY
            if (r5 != r6) goto L52
            if (r1 == 0) goto L48
            java.util.List<com.bytedance.adsdk.vt.ouw.ouw.ouw$ouw> r0 = r7.bly
            r0.add(r1)
        L48:
            com.bytedance.adsdk.vt.ouw.ouw.ouw$ouw r0 = new com.bytedance.adsdk.vt.ouw.ouw.ouw$ouw
            r0.<init>(r3, r4)
            r3.ouw(r7)
            r1 = r0
            goto L64
        L52:
            boolean r3 = r0 instanceof com.bytedance.adsdk.vt.ouw.ouw.mwh
            if (r3 == 0) goto L64
            if (r1 != 0) goto L5d
            com.bytedance.adsdk.vt.ouw.ouw.ouw$ouw r1 = new com.bytedance.adsdk.vt.ouw.ouw.ouw$ouw
            r1.<init>(r2, r4)
        L5d:
            java.util.List<com.bytedance.adsdk.vt.ouw.ouw.mwh> r3 = r1.ouw
            com.bytedance.adsdk.vt.ouw.ouw.mwh r0 = (com.bytedance.adsdk.vt.ouw.ouw.mwh) r0
            r3.add(r0)
        L64:
            int r8 = r8 + (-1)
            goto L2b
        L67:
            if (r1 == 0) goto L6e
            java.util.List<com.bytedance.adsdk.vt.ouw.ouw.ouw$ouw> r8 = r7.bly
            r8.add(r1)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.ouw.ouw.ouw.ouw(java.util.List, java.util.List):void");
    }

    public void ouw(Canvas canvas, Matrix matrix, int i4) {
        com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#draw");
        if (com.bytedance.adsdk.vt.le.pno.vt(matrix)) {
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#draw");
            return;
        }
        this.vt.setAlpha(com.bytedance.adsdk.vt.le.ra.ouw((int) ((((i4 / 255.0f) * ((com.bytedance.adsdk.vt.ouw.vt.le) this.ryl).pno()) / 100.0f) * 255.0f)));
        this.vt.setStrokeWidth(com.bytedance.adsdk.vt.le.pno.ouw(matrix) * ((com.bytedance.adsdk.vt.ouw.vt.yu) this.f7152cf).pno());
        if (this.vt.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#draw");
            return;
        }
        com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#applyDashPattern");
        if (this.mwh.isEmpty()) {
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#applyDashPattern");
        } else {
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw(matrix);
            for (int i10 = 0; i10 < this.mwh.size(); i10++) {
                this.tlj[i10] = this.mwh.get(i10).le().floatValue();
                if (i10 % 2 == 0) {
                    float[] fArr = this.tlj;
                    if (fArr[i10] < 1.0f) {
                        fArr[i10] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.tlj;
                    if (fArr2[i10] < 0.1f) {
                        fArr2[i10] = 0.1f;
                    }
                }
                float[] fArr3 = this.tlj;
                fArr3[i10] = fArr3[i10] * fOuw;
            }
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar = this.f7153jg;
            this.vt.setPathEffect(new DashPathEffect(this.tlj, ouwVar == null ? 0.0f : ouwVar.le().floatValue() * fOuw));
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#applyDashPattern");
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar2 = this.ko;
        if (ouwVar2 != null) {
            this.vt.setColorFilter(ouwVar2.le());
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar3 = this.rn;
        if (ouwVar3 != null) {
            float fFloatValue = ouwVar3.le().floatValue();
            if (fFloatValue == 0.0f) {
                this.vt.setMaskFilter(null);
            } else if (fFloatValue != this.f7155lh) {
                this.vt.setMaskFilter(this.ouw.vt(fFloatValue));
            }
            this.f7155lh = fFloatValue;
        }
        com.bytedance.adsdk.vt.ouw.vt.lh lhVar = this.zih;
        if (lhVar != null) {
            lhVar.ouw(this.vt);
        }
        for (int i11 = 0; i11 < this.bly.size(); i11++) {
            C0039ouw c0039ouw = this.bly.get(i11);
            if (c0039ouw.vt != null) {
                ouw(canvas, c0039ouw, matrix);
            } else {
                com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#buildPath");
                this.fkw.reset();
                for (int size = c0039ouw.ouw.size() - 1; size >= 0; size--) {
                    this.fkw.addPath(c0039ouw.ouw.get(size).yu(), matrix);
                }
                com.bytedance.adsdk.vt.fkw.vt("StrokeContent#buildPath");
                com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#drawPath");
                canvas.drawPath(this.fkw, this.vt);
                com.bytedance.adsdk.vt.fkw.vt("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.vt.fkw.vt("StrokeContent#draw");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ouw(android.graphics.Canvas r17, com.bytedance.adsdk.vt.ouw.ouw.ouw.C0039ouw r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.ouw.ouw.ouw.ouw(android.graphics.Canvas, com.bytedance.adsdk.vt.ouw.ouw.ouw$ouw, android.graphics.Matrix):void");
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z3) {
        com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#getBounds");
        this.fkw.reset();
        for (int i4 = 0; i4 < this.bly.size(); i4++) {
            C0039ouw c0039ouw = this.bly.get(i4);
            for (int i10 = 0; i10 < c0039ouw.ouw.size(); i10++) {
                this.fkw.addPath(c0039ouw.ouw.get(i10).yu(), matrix);
            }
        }
        this.fkw.computeBounds(this.ra, false);
        float fPno = ((com.bytedance.adsdk.vt.ouw.vt.yu) this.f7152cf).pno();
        RectF rectF2 = this.ra;
        float f10 = fPno / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.ra);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.vt.fkw.vt("StrokeContent#getBounds");
    }
}
