package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra implements cf, fkw, ouw.InterfaceC0040ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> bly;

    /* renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.bly f7162cf;
    private final String fkw;

    /* renamed from: le, reason: collision with root package name */
    private final boolean f7163le;

    /* renamed from: lh, reason: collision with root package name */
    private final Paint f7164lh;
    private com.bytedance.adsdk.vt.ouw.vt.lh mwh;
    float ouw;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> pno;
    private final List<mwh> ra;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ryl;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> tlj;
    private final Path vt;
    private final com.bytedance.adsdk.vt.lh.lh.ouw yu;

    public ra(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.ko koVar) {
        Path path = new Path();
        this.vt = path;
        this.f7164lh = new com.bytedance.adsdk.vt.ouw.ouw(1);
        this.ra = new ArrayList();
        this.yu = ouwVar;
        this.fkw = koVar.vt;
        this.f7163le = koVar.fkw;
        this.f7162cf = blyVar;
        if (ouwVar.vt() != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = ouwVar.vt().ouw.ouw();
            this.ryl = ouwVarOuw;
            ouwVarOuw.ouw(this);
            ouwVar.ouw(this.ryl);
        }
        if (ouwVar.lh() != null) {
            this.mwh = new com.bytedance.adsdk.vt.ouw.vt.lh(this, ouwVar, ouwVar.lh());
        }
        if (koVar.f7113lh == null || koVar.yu == null) {
            this.pno = null;
            this.bly = null;
            return;
        }
        path.setFillType(koVar.ouw);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw2 = koVar.f7113lh.ouw();
        this.pno = ouwVarOuw2;
        ouwVarOuw2.ouw(this);
        ouwVar.ouw(ouwVarOuw2);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw3 = koVar.yu.ouw();
        this.bly = ouwVarOuw3;
        ouwVarOuw3.ouw(this);
        ouwVar.ouw(ouwVarOuw3);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.f7162cf.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            lh lhVar = list2.get(i4);
            if (lhVar instanceof mwh) {
                this.ra.add((mwh) lhVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i4) {
        if (this.f7163le) {
            return;
        }
        com.bytedance.adsdk.vt.fkw.ouw("FillContent#draw");
        this.f7164lh.setColor((com.bytedance.adsdk.vt.le.ra.ouw((int) ((((i4 / 255.0f) * this.bly.le().intValue()) / 100.0f) * 255.0f)) << 24) | (((com.bytedance.adsdk.vt.ouw.vt.vt) this.pno).pno() & 16777215));
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar = this.tlj;
        if (ouwVar != null) {
            this.f7164lh.setColorFilter(ouwVar.le());
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar2 = this.ryl;
        if (ouwVar2 != null) {
            float fFloatValue = ouwVar2.le().floatValue();
            if (fFloatValue == 0.0f) {
                this.f7164lh.setMaskFilter(null);
            } else if (fFloatValue != this.ouw) {
                this.f7164lh.setMaskFilter(this.yu.vt(fFloatValue));
            }
            this.ouw = fFloatValue;
        }
        com.bytedance.adsdk.vt.ouw.vt.lh lhVar = this.mwh;
        if (lhVar != null) {
            lhVar.ouw(this.f7164lh);
        }
        this.vt.reset();
        for (int i10 = 0; i10 < this.ra.size(); i10++) {
            this.vt.addPath(this.ra.get(i10).yu(), matrix);
        }
        canvas.drawPath(this.vt, this.f7164lh);
        com.bytedance.adsdk.vt.fkw.vt("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z3) {
        this.vt.reset();
        for (int i4 = 0; i4 < this.ra.size(); i4++) {
            this.vt.addPath(this.ra.get(i4).yu(), matrix);
        }
        this.vt.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
