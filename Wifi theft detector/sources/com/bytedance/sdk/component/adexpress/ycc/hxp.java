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

    public void emc(double d10, int i10, int i11, int i12) {
        float f10 = i11;
        this.xq = (int) com.bytedance.sdk.component.adexpress.dg.uym.xq(getContext(), f10);
        this.dg = (int) com.bytedance.sdk.component.adexpress.dg.uym.xq(getContext(), f10);
        this.uym = d10;
        this.msw = i12;
        removeAllViews();
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.ypw.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
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
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.emc.measure(i10, i11);
        double d10 = this.uym;
        float f10 = this.xq;
        this.ypw.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d10) * f10) + 1.0f + ((f10 - 2.0f) * (d10 - ((int) d10)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.emc.getMeasuredHeight(), 1073741824));
        if (this.msw > 0.0f) {
            this.emc.setPadding(0, ((int) (r7.getMeasuredHeight() - this.msw)) / 2, 0, 0);
            this.ypw.setPadding(0, ((int) (this.emc.getMeasuredHeight() - this.msw)) / 2, 0, 0);
        }
    }
}
