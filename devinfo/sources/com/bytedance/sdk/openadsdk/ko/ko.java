package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko extends com.bytedance.sdk.openadsdk.core.le.ra {
    public ko(Context context) {
        this(context, null);
    }

    private ko(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ko(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
        setId(rn.hsa);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        int i4 = rn.f8712ak;
        pnoVar.setId(i4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        pnoVar.setLayoutParams(layoutParams);
        pnoVar.setIncludeFontPadding(false);
        pnoVar.setText(vpp.ouw(context, "tt_video_without_wifi_tips"));
        pnoVar.setTextColor(Color.parseColor("#cacaca"));
        pnoVar.setTextSize(2, 14.0f);
        addView(pnoVar);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        raVar.setId(rn.f8727rh);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i4);
        layoutParams2.addRule(13);
        raVar.setLayoutParams(layoutParams2);
        addView(raVar);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setId(rn.vrp);
        int iOuw = osn.ouw(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOuw, iOuw);
        layoutParams3.addRule(15);
        yuVar.setLayoutParams(layoutParams3);
        yuVar.setImageDrawable(vpp.lh(context, "tt_new_play_video"));
        yuVar.setScaleType(ImageView.ScaleType.FIT_XY);
        raVar.addView(yuVar);
    }
}
