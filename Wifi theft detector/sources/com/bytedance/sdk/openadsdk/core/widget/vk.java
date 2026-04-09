package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class vk extends View {
    private Drawable bw;
    private Drawable dg;
    private final Path emc;
    private int xq;
    private float ycc;
    private final boolean ypw;

    public vk(Context context) {
        this(context, false);
    }

    private void emc() {
        Context context = getContext();
        this.dg = rie.xq(context, this.ypw ? "tt_star_thick_dark" : "tt_star_thick");
        this.bw = rie.xq(context, "tt_star");
    }

    private void ypw() {
        int width = getWidth();
        int height = getHeight();
        if (this.ycc <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.emc.reset();
        this.emc.addRect(new RectF(0.0f, 0.0f, width * this.ycc, height), Path.Direction.CCW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.xq <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.dg.draw(canvas);
            canvas.translate(this.xq, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.emc);
        for (int i11 = 0; i11 < 5; i11++) {
            this.bw.draw(canvas);
            canvas.translate(this.xq, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.xq * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.xq, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ypw();
    }

    public vk(Context context, boolean z10) {
        super(context);
        this.emc = new Path();
        this.ypw = z10;
        emc();
    }

    public void emc(double d10, int i10) {
        int iEmc = (int) vw.emc(getContext(), i10, false);
        this.xq = iEmc;
        this.dg.setBounds(0, 0, iEmc, iEmc);
        Drawable drawable = this.bw;
        int i11 = this.xq;
        drawable.setBounds(0, 0, i11, i11);
        this.ycc = ((float) d10) / 5.0f;
        ypw();
        requestLayout();
    }
}
