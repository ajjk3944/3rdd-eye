package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg extends com.bytedance.sdk.openadsdk.core.le.ra {
    public jg(Context context) {
        this(context, null);
    }

    private jg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private jg(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iOuw = osn.ouw(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar.setId(rn.fn);
        lhVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        lhVar.setBackgroundColor(0);
        addView(lhVar);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setId(rn.byv);
        yuVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        yuVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lhVar.addView(yuVar);
        com.bytedance.sdk.openadsdk.core.le.le leVar = new com.bytedance.sdk.openadsdk.core.le.le(context);
        leVar.setId(rn.ehk);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOuw, iOuw);
        layoutParams.gravity = 17;
        leVar.setLayoutParams(layoutParams);
        leVar.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_video_loading_progress_bar"));
        lhVar.addView(leVar);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar2.setId(rn.f8719ki);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        yuVar2.setLayoutParams(layoutParams2);
        yuVar2.setScaleType(ImageView.ScaleType.CENTER);
        yuVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_play_movebar_textpage"));
        yuVar2.setVisibility(8);
        addView(yuVar2);
        View rylVar = new ryl(context);
        rylVar.setId(rn.ln);
        rylVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(rylVar);
    }
}
