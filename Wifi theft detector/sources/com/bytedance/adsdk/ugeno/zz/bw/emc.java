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
        float f10 = this.dg;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void emc(double d10, int i10, int i11, float f10, int i12) {
        removeAllViews();
        this.bw.removeAllViews();
        this.ycc.removeAllViews();
        this.emc = (int) msw.emc(this.uym, f10);
        this.ypw = (int) msw.emc(this.uym, f10);
        this.xq = d10;
        this.dg = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.uym.dg.ypw(this.uym, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.ycc.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.uym.dg.ypw(this.uym, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i11);
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        dg dgVar = this.msw;
        if (dgVar != null) {
            dgVar.emc(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        dg dgVar = this.msw;
        if (dgVar != null) {
            dgVar.emc(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.bw.measure(i10, i11);
        double dFloor = Math.floor(this.xq);
        this.ycc.measure(View.MeasureSpec.makeMeasureSpec((int) (((r0 + r0 + r2) * dFloor) + this.dg + ((this.xq - dFloor) * this.emc)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.bw.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        dg dgVar = this.msw;
        if (dgVar != null) {
            dgVar.ypw(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void emc(dg dgVar) {
        this.msw = dgVar;
    }
}
