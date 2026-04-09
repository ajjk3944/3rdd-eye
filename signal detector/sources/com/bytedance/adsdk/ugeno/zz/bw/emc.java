package com.bytedance.adsdk.ugeno.zz.bw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.adsdk.ugeno.uym.msw;

/* loaded from: classes.dex */
public class emc extends FrameLayout {
    private LinearLayout bw;
    private float dg;
    private float emc;
    private dg msw;
    private Context uym;
    private double xq;
    private LinearLayout ycc;
    private float ypw;

    public emc(Context context) {
        super(context);
        this.uym = context;
        this.bw = new LinearLayout(context);
        this.ycc = new LinearLayout(context);
        this.bw.setOrientation(0);
        this.bw.setGravity(8388611);
        this.ycc.setOrientation(0);
        this.ycc.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.emc, (int) this.ypw);
        float f2 = this.dg;
        layoutParams.leftMargin = (int) f2;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f2;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void emc(double d6, int i, int i3, float f2, int i6) {
        removeAllViews();
        this.bw.removeAllViews();
        this.ycc.removeAllViews();
        this.emc = (int) msw.emc(this.uym, f2);
        this.ypw = (int) msw.emc(this.uym, f2);
        this.xq = d6;
        this.dg = i6;
        for (int i7 = 0; i7 < 5; i7++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.uym.dg.ypw(this.uym, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.ycc.addView(starImageView);
        }
        for (int i8 = 0; i8 < 5; i8++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.uym.dg.ypw(this.uym, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i3);
            this.bw.addView(starImageView2);
        }
        addView(this.bw);
        addView(this.ycc);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg dgVar = this.msw;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dg dgVar = this.msw;
        if (dgVar != null) {
            dgVar.msw();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        dg dgVar = this.msw;
        if (dgVar != null) {
            dgVar.emc(i, i3, i6, i7);
        }
        super.onLayout(z6, i, i3, i6, i7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        dg dgVar = this.msw;
        if (dgVar != null) {
            dgVar.emc(i, i3);
        }
        super.onMeasure(i, i3);
        this.bw.measure(i, i3);
        double dFloor = Math.floor(this.xq);
        float f2 = this.dg;
        this.ycc.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.xq - dFloor) * this.emc) + ((f2 + f2 + r2) * dFloor) + f2), 1073741824), View.MeasureSpec.makeMeasureSpec(this.bw.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        dg dgVar = this.msw;
        if (dgVar != null) {
            dgVar.ypw(i, i3, i6, i7);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
    }

    public void emc(dg dgVar) {
        this.msw = dgVar;
    }
}
