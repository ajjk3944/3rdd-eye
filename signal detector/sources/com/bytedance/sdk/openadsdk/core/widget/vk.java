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
        for (int i = 0; i < 5; i++) {
            this.dg.draw(canvas);
            canvas.translate(this.xq, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.emc);
        for (int i3 = 0; i3 < 5; i3++) {
            this.bw.draw(canvas);
            canvas.translate(this.xq, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.xq * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.xq, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        ypw();
    }

    public vk(Context context, boolean z6) {
        super(context);
        this.emc = new Path();
        this.ypw = z6;
        emc();
    }

    public void emc(double d6, int i) {
        int iEmc = (int) vw.emc(getContext(), i, false);
        this.xq = iEmc;
        this.dg.setBounds(0, 0, iEmc, iEmc);
        Drawable drawable = this.bw;
        int i3 = this.xq;
        drawable.setBounds(0, 0, i3, i3);
        this.ycc = ((float) d6) / 5.0f;
        ypw();
        requestLayout();
    }
}
