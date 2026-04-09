package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class hxp extends FrameLayout {
    private Drawable bw;
    private float dg;
    LinearLayout emc;
    private float msw;
    private double uym;
    private float xq;
    private Drawable ycc;
    LinearLayout ypw;
    private static final int zz = (com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.ypw("", 0.0f, true)[1] / 2) + 1;
    private static final int ru = (com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.ypw("", 0.0f, true)[1] / 2) + 3;

    public hxp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.emc = new LinearLayout(getContext());
        this.ypw = new LinearLayout(getContext());
        this.emc.setOrientation(0);
        this.emc.setGravity(8388611);
        this.ypw.setOrientation(0);
        this.ypw.setGravity(8388611);
        this.bw = com.bytedance.sdk.component.utils.rie.xq(context, "tt_star_thick");
        this.ycc = com.bytedance.sdk.component.utils.rie.xq(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.xq, (int) this.dg));
        imageView.setPadding(1, zz, 1, ru);
        return imageView;
    }

    public void emc(double d6, int i, int i3, int i6) {
        float f2 = i3;
        this.xq = (int) com.bytedance.sdk.component.adexpress.dg.uym.xq(getContext(), f2);
        this.dg = (int) com.bytedance.sdk.component.adexpress.dg.uym.xq(getContext(), f2);
        this.uym = d6;
        this.msw = i6;
        removeAllViews();
        for (int i7 = 0; i7 < 5; i7++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.ypw.addView(starImageView);
        }
        for (int i8 = 0; i8 < 5; i8++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.emc.addView(starImageView2);
        }
        addView(this.emc);
        addView(this.ypw);
        requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.bw;
    }

    public Drawable getStarFillDrawable() {
        return this.ycc;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        this.emc.measure(i, i3);
        double d6 = this.uym;
        float f2 = this.xq;
        this.ypw.measure(View.MeasureSpec.makeMeasureSpec((int) (((d6 - ((int) d6)) * (f2 - 2.0f)) + (((int) d6) * f2) + 1.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.emc.getMeasuredHeight(), 1073741824));
        if (this.msw > 0.0f) {
            this.emc.setPadding(0, ((int) (r7.getMeasuredHeight() - this.msw)) / 2, 0, 0);
            this.ypw.setPadding(0, ((int) (this.emc.getMeasuredHeight() - this.msw)) / 2, 0, 0);
        }
    }
}
