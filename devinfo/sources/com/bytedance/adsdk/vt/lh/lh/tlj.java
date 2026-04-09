package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends yu {

    /* renamed from: cf, reason: collision with root package name */
    private Path f7092cf;

    /* renamed from: jg, reason: collision with root package name */
    private int f7093jg;
    private int mwh;

    public tlj(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        super(blyVar, fkwVar);
        this.f7092cf = null;
        this.mwh = -1;
        this.f7093jg = -1;
        if (((yu) this).ryl != null) {
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
            com.bytedance.adsdk.vt.tlj tljVar = ((yu) this).ryl;
            this.mwh = (int) (tljVar.ouw * fOuw);
            this.f7093jg = (int) (tljVar.vt * fOuw);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.mwh, this.f7093jg);
            Path path = new Path();
            this.f7092cf = path;
            float f10 = fOuw * 40.0f;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.yu, com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i4) {
        View view = this.vt.jae;
        if (this.mwh <= 0 || view == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ouw(i4);
        float f10 = this.tlj;
        int i10 = this.mwh;
        int i11 = this.f7093jg;
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setAlpha(f10);
        canvas.clipPath(this.f7092cf);
        view.draw(canvas);
        canvas.restore();
    }
}
