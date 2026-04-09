package com.bytedance.sdk.component.adexpress.le;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends vpp {
    private int fkw;

    /* renamed from: le, reason: collision with root package name */
    private AnimatorSet f7342le;

    /* renamed from: lh, reason: collision with root package name */
    private ImageView f7343lh;
    private TextView ouw;
    private ImageView vt;
    private ImageView yu;

    public pno(Context context) {
        super(context);
        this.f7342le = new AnimatorSet();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(81);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, cd.ouw(context, 100.0f)));
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        imageView.setId(2097610751);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cd.ouw(context, 19.0f), cd.ouw(context, 15.0f));
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_white_slide_up"));
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(2097610750);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(cd.ouw(context, 19.0f), cd.ouw(context, 15.0f));
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = cd.ouw(context, 7.0f);
        imageView2.setLayoutParams(layoutParams2);
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_white_slide_up"));
        ImageView imageView3 = new ImageView(context);
        imageView3.setId(2097610749);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(cd.ouw(context, 19.0f), cd.ouw(context, 15.0f));
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = cd.ouw(context, 14.0f);
        imageView3.setLayoutParams(layoutParams3);
        imageView3.setScaleType(scaleType);
        imageView3.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_white_slide_up"));
        frameLayout.addView(imageView);
        frameLayout.addView(imageView2);
        frameLayout.addView(imageView3);
        linearLayout2.addView(frameLayout);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout2.addView(view);
        TextView textView = new TextView(context);
        textView.setId(2097610748);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(0, 0, 0, cd.ouw(context, 5.0f));
        textView.setLayoutParams(layoutParams4);
        textView.setGravity(1);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        addView(linearLayout);
        this.vt = (ImageView) findViewById(2097610751);
        this.f7343lh = (ImageView) findViewById(2097610750);
        this.yu = (ImageView) findViewById(2097610749);
        this.ouw = (TextView) findViewById(2097610748);
    }

    public final float getAlphaColor() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp
    public final void ouw(Context context) {
    }

    public final void setAlphaColor(int i4) {
        if (i4 < 0 || i4 > 60) {
            return;
        }
        int i10 = i4 + 195;
        ImageView imageView = this.yu;
        int iRgb = Color.rgb(i10, i10, i10);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i11 = ((i4 + 20) % 60) + 195;
        this.f7343lh.setColorFilter(Color.rgb(i11, i11, i11), mode);
        int i12 = ((i4 + 40) % 60) + 195;
        this.vt.setColorFilter(Color.rgb(i12, i12, i12), mode);
    }

    public final void setButtonText(String str) {
        if (this.ouw == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.ouw.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp
    public final void vt() {
        this.f7342le.cancel();
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp
    public final void ouw() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }
}
