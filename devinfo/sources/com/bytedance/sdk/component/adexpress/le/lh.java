package com.bytedance.sdk.component.adexpress.le;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends FrameLayout {
    private ImageView fkw;

    /* renamed from: le, reason: collision with root package name */
    private TextView f7332le;

    /* renamed from: lh, reason: collision with root package name */
    private Context f7333lh;
    public zih ouw;
    public AnimatorSet vt;
    private ImageView yu;

    public lh(Context context) {
        super(context);
        this.vt = new AnimatorSet();
        this.f7333lh = context;
        FrameLayout frameLayout = new FrameLayout(context);
        this.ouw = new zih(this.f7333lh);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7333lh, 95.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7333lh, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.ouw, layoutParams);
        this.yu = new ImageView(this.f7333lh);
        int iOuw = cd.ouw(this.f7333lh, 60.0f);
        this.yu.setImageDrawable(com.bytedance.sdk.component.adexpress.yu.pno.ouw(1, null, null, new int[]{iOuw, iOuw}, Integer.valueOf(cd.ouw(this.f7333lh, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7333lh, 75.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7333lh, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.yu, layoutParams2);
        this.fkw = new ImageView(this.f7333lh);
        int iOuw2 = cd.ouw(this.f7333lh, 50.0f);
        this.fkw.setImageDrawable(com.bytedance.sdk.component.adexpress.yu.pno.ouw(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iOuw2, iOuw2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7333lh, 63.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7333lh, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.fkw, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.f7333lh);
        this.f7332le = textView;
        textView.setTextColor(-1);
        this.f7332le.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.f7332le, layoutParams4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.fkw, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.fkw, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.vt.setDuration(800L);
        this.vt.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public final void setGuideText(String str) {
        this.f7332le.setText(str);
    }
}
