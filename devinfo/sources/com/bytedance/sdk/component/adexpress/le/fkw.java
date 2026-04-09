package com.bytedance.sdk.component.adexpress.le;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends FrameLayout {
    public AnimatorSet ouw;
    private ImageView vt;

    public fkw(Context context) {
        super(context);
        ImageView imageView = new ImageView(getContext());
        this.vt = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_white_hand"));
        int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOuw, iOuw);
        layoutParams.gravity = 17;
        addView(this.vt, layoutParams);
        this.ouw = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.vt, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.vt, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.ouw.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }
}
