package com.bytedance.adsdk.ugeno.bly.fkw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.yu;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends FrameLayout {
    private float fkw;

    /* renamed from: le, reason: collision with root package name */
    private LinearLayout f6827le;

    /* renamed from: lh, reason: collision with root package name */
    private float f6828lh;
    yu ouw;
    private Context pno;
    private LinearLayout ra;
    private float vt;
    private double yu;

    public ouw(Context context) {
        super(context);
        this.pno = context;
        this.f6827le = new LinearLayout(context);
        this.ra = new LinearLayout(context);
        this.f6827le.setOrientation(0);
        this.f6827le.setGravity(8388611);
        this.ra.setOrientation(0);
        this.ra.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.vt, (int) this.f6828lh);
        float f10 = this.fkw;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.fkw();
        }
        super.onLayout(z3, i4, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(i4, i10);
        }
        super.onMeasure(i4, i10);
        this.f6827le.measure(i4, i10);
        double dFloor = Math.floor(this.yu);
        float f10 = this.fkw;
        this.ra.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.yu - dFloor) * this.vt) + ((f10 + f10 + r2) * dFloor) + f10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f6827le.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i4, i10);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
    }

    public final void ouw(double d10, int i4, int i10, float f10, int i11) {
        removeAllViews();
        this.f6827le.removeAllViews();
        this.ra.removeAllViews();
        this.vt = (int) ra.ouw(this.pno, f10);
        this.f6828lh = (int) ra.ouw(this.pno, f10);
        this.yu = d10;
        this.fkw = i11;
        for (int i12 = 0; i12 < 5; i12++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.ra.yu.vt(this.pno, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
            this.ra.addView(starImageView);
        }
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.ra.yu.vt(this.pno, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i10);
            this.f6827le.addView(starImageView2);
        }
        addView(this.f6827le);
        addView(this.ra);
        requestLayout();
    }
}
