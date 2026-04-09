package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class emc implements bw, gbl, emc.InterfaceC0106emc {

    /* renamed from: aa, reason: collision with root package name */
    private com.bytedance.adsdk.ypw.emc.ypw.xq f9219aa;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> cf;
    protected final com.bytedance.adsdk.ypw.xq.xq.emc emc;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> gbl;
    private final com.bytedance.adsdk.ypw.zz msw;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> qh;
    private final float[] ru;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Integer> sup;
    private final List<com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float>> sz;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> vk;
    float xq;
    final Paint ypw;
    private final PathMeasure dg = new PathMeasure();
    private final Path bw = new Path();
    private final Path ycc = new Path();
    private final RectF uym = new RectF();
    private final List<C0105emc> zz = new ArrayList();

    /* renamed from: com.bytedance.adsdk.ypw.emc.emc.emc$emc, reason: collision with other inner class name */
    public static final class C0105emc {
        private final List<sz> emc;
        private final ylm ypw;

        private C0105emc(ylm ylmVar) {
            this.emc = new ArrayList();
            this.ypw = ylmVar;
        }
    }

    public emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, Paint.Cap cap, Paint.Join join, float f10, com.bytedance.adsdk.ypw.xq.emc.dg dgVar, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar, List<com.bytedance.adsdk.ypw.xq.emc.ypw> list, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar2) {
        com.bytedance.adsdk.ypw.emc.emc emcVar2 = new com.bytedance.adsdk.ypw.emc.emc(1);
        this.ypw = emcVar2;
        this.xq = 0.0f;
        this.msw = zzVar;
        this.emc = emcVar;
        emcVar2.setStyle(Paint.Style.STROKE);
        emcVar2.setStrokeCap(cap);
        emcVar2.setStrokeJoin(join);
        emcVar2.setStrokeMiter(f10);
        this.sup = dgVar.emc();
        this.gbl = ypwVar.emc();
        if (ypwVar2 == null) {
            this.qh = null;
        } else {
            this.qh = ypwVar2.emc();
        }
        this.sz = new ArrayList(list.size());
        this.ru = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.sz.add(list.get(i10).emc());
        }
        emcVar.emc(this.sup);
        emcVar.emc(this.gbl);
        for (int i11 = 0; i11 < this.sz.size(); i11++) {
            emcVar.emc(this.sz.get(i11));
        }
        com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> emcVar3 = this.qh;
        if (emcVar3 != null) {
            emcVar.emc(emcVar3);
        }
        this.sup.emc(this);
        this.gbl.emc(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.sz.get(i12).emc(this);
        }
        com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> emcVar4 = this.qh;
        if (emcVar4 != null) {
            emcVar4.emc(this);
        }
        if (emcVar.ru() != null) {
            com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc = emcVar.ru().emc().emc();
            this.vk = emcVarEmc;
            emcVarEmc.emc(this);
            emcVar.emc(this.vk);
        }
        if (emcVar.gbl() != null) {
            this.f9219aa = new com.bytedance.adsdk.ypw.emc.ypw.xq(this, emcVar, emcVar.gbl());
        }
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0106emc
    public void emc() {
        this.msw.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(java.util.List<com.bytedance.adsdk.ypw.emc.emc.xq> r8, java.util.List<com.bytedance.adsdk.ypw.emc.emc.xq> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            com.bytedance.adsdk.ypw.emc.emc.xq r3 = (com.bytedance.adsdk.ypw.emc.emc.xq) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.ypw.emc.emc.ylm
            if (r4 == 0) goto L1f
            com.bytedance.adsdk.ypw.emc.emc.ylm r3 = (com.bytedance.adsdk.ypw.emc.emc.ylm) r3
            com.bytedance.adsdk.ypw.xq.ypw.yzg$emc r4 = r3.ypw()
            com.bytedance.adsdk.ypw.xq.ypw.yzg$emc r5 = com.bytedance.adsdk.ypw.xq.ypw.yzg.emc.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.emc(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            com.bytedance.adsdk.ypw.emc.emc.xq r3 = (com.bytedance.adsdk.ypw.emc.emc.xq) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.ypw.emc.emc.ylm
            if (r4 == 0) goto L55
            r4 = r3
            com.bytedance.adsdk.ypw.emc.emc.ylm r4 = (com.bytedance.adsdk.ypw.emc.emc.ylm) r4
            com.bytedance.adsdk.ypw.xq.ypw.yzg$emc r5 = r4.ypw()
            com.bytedance.adsdk.ypw.xq.ypw.yzg$emc r6 = com.bytedance.adsdk.ypw.xq.ypw.yzg.emc.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<com.bytedance.adsdk.ypw.emc.emc.emc$emc> r3 = r7.zz
            r3.add(r0)
        L4c:
            com.bytedance.adsdk.ypw.emc.emc.emc$emc r0 = new com.bytedance.adsdk.ypw.emc.emc.emc$emc
            r0.<init>(r4)
            r4.emc(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof com.bytedance.adsdk.ypw.emc.emc.sz
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            com.bytedance.adsdk.ypw.emc.emc.emc$emc r0 = new com.bytedance.adsdk.ypw.emc.emc.emc$emc
            r0.<init>(r2)
        L60:
            java.util.List r4 = com.bytedance.adsdk.ypw.emc.emc.emc.C0105emc.emc(r0)
            com.bytedance.adsdk.ypw.emc.emc.sz r3 = (com.bytedance.adsdk.ypw.emc.emc.sz) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<com.bytedance.adsdk.ypw.emc.emc.emc$emc> r8 = r7.zz
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.emc.emc.emc.emc(java.util.List, java.util.List):void");
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(Canvas canvas, Matrix matrix, int i10) {
        com.bytedance.adsdk.ypw.bw.emc("StrokeContent#draw");
        if (com.bytedance.adsdk.ypw.ycc.ycc.ypw(matrix)) {
            com.bytedance.adsdk.ypw.bw.ypw("StrokeContent#draw");
            return;
        }
        this.ypw.setAlpha(com.bytedance.adsdk.ypw.ycc.bw.emc((int) ((((i10 / 255.0f) * ((com.bytedance.adsdk.ypw.emc.ypw.ycc) this.sup).zz()) / 100.0f) * 255.0f), 0, 255));
        this.ypw.setStrokeWidth(((com.bytedance.adsdk.ypw.emc.ypw.dg) this.gbl).zz() * com.bytedance.adsdk.ypw.ycc.ycc.emc(matrix));
        if (this.ypw.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.ypw.bw.ypw("StrokeContent#draw");
            return;
        }
        emc(matrix);
        com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> emcVar = this.cf;
        if (emcVar != null) {
            this.ypw.setColorFilter(emcVar.uym());
        }
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVar2 = this.vk;
        if (emcVar2 != null) {
            float fFloatValue = emcVar2.uym().floatValue();
            if (fFloatValue == 0.0f) {
                this.ypw.setMaskFilter(null);
            } else if (fFloatValue != this.xq) {
                this.ypw.setMaskFilter(this.emc.ypw(fFloatValue));
            }
            this.xq = fFloatValue;
        }
        com.bytedance.adsdk.ypw.emc.ypw.xq xqVar = this.f9219aa;
        if (xqVar != null) {
            xqVar.emc(this.ypw);
        }
        for (int i11 = 0; i11 < this.zz.size(); i11++) {
            C0105emc c0105emc = this.zz.get(i11);
            if (c0105emc.ypw != null) {
                emc(canvas, c0105emc, matrix);
            } else {
                com.bytedance.adsdk.ypw.bw.emc("StrokeContent#buildPath");
                this.bw.reset();
                for (int size = c0105emc.emc.size() - 1; size >= 0; size--) {
                    this.bw.addPath(((sz) c0105emc.emc.get(size)).dg(), matrix);
                }
                com.bytedance.adsdk.ypw.bw.ypw("StrokeContent#buildPath");
                com.bytedance.adsdk.ypw.bw.emc("StrokeContent#drawPath");
                canvas.drawPath(this.bw, this.ypw);
                com.bytedance.adsdk.ypw.bw.ypw("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.ypw.bw.ypw("StrokeContent#draw");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(android.graphics.Canvas r17, com.bytedance.adsdk.ypw.emc.emc.emc.C0105emc r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.emc.emc.emc.emc(android.graphics.Canvas, com.bytedance.adsdk.ypw.emc.emc.emc$emc, android.graphics.Matrix):void");
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        com.bytedance.adsdk.ypw.bw.emc("StrokeContent#getBounds");
        this.bw.reset();
        for (int i10 = 0; i10 < this.zz.size(); i10++) {
            C0105emc c0105emc = this.zz.get(i10);
            for (int i11 = 0; i11 < c0105emc.emc.size(); i11++) {
                this.bw.addPath(((sz) c0105emc.emc.get(i11)).dg(), matrix);
            }
        }
        this.bw.computeBounds(this.uym, false);
        float fZz = ((com.bytedance.adsdk.ypw.emc.ypw.dg) this.gbl).zz();
        RectF rectF2 = this.uym;
        float f10 = fZz / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.uym);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.ypw.bw.ypw("StrokeContent#getBounds");
    }

    private void emc(Matrix matrix) {
        com.bytedance.adsdk.ypw.bw.emc("StrokeContent#applyDashPattern");
        if (this.sz.isEmpty()) {
            com.bytedance.adsdk.ypw.bw.ypw("StrokeContent#applyDashPattern");
            return;
        }
        float fEmc = com.bytedance.adsdk.ypw.ycc.ycc.emc(matrix);
        for (int i10 = 0; i10 < this.sz.size(); i10++) {
            this.ru[i10] = this.sz.get(i10).uym().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.ru;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.ru;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.ru;
            fArr3[i10] = fArr3[i10] * fEmc;
        }
        com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> emcVar = this.qh;
        this.ypw.setPathEffect(new DashPathEffect(this.ru, emcVar == null ? 0.0f : fEmc * emcVar.uym().floatValue()));
        com.bytedance.adsdk.ypw.bw.ypw("StrokeContent#applyDashPattern");
    }
}
