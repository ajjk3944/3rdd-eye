package com.bytedance.adsdk.ypw.xq.xq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class ru extends dg {
    private Path msw;
    private int ru;
    private int zz;

    public ru(com.bytedance.adsdk.ypw.zz zzVar, bw bwVar, Context context) {
        super(zzVar, bwVar);
        this.msw = null;
        this.zz = -1;
        this.ru = -1;
        if (((dg) this).uym != null) {
            float fEmc = com.bytedance.adsdk.ypw.ycc.ycc.emc();
            this.zz = (int) (((dg) this).uym.emc() * fEmc);
            this.ru = (int) (((dg) this).uym.ypw() * fEmc);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.zz, this.ru);
            Path path = new Path();
            this.msw = path;
            float f10 = fEmc * 40.0f;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        }
    }

    private static void emc(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.dg, com.bytedance.adsdk.ypw.xq.xq.emc
    public void ypw(Canvas canvas, Matrix matrix, int i10) {
        View viewEmc = this.ypw.emc();
        if (this.zz <= 0 || viewEmc == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        emc(i10);
        float fYcc = ycc();
        emc(viewEmc, this.zz, this.ru);
        viewEmc.setAlpha(fYcc);
        canvas.clipPath(this.msw);
        viewEmc.draw(canvas);
        canvas.restore();
    }
}
