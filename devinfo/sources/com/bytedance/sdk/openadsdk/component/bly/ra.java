package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends com.bytedance.sdk.openadsdk.core.le.ra {

    /* renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.le.pno f7866lh;
    private final com.bytedance.sdk.openadsdk.core.le.yu ouw;
    private final com.bytedance.sdk.openadsdk.core.le.yu vt;

    public ra(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iOuw = osn.ouw(context, 12.0f);
        int iOuw2 = osn.ouw(context, 16.0f);
        int iOuw3 = osn.ouw(context, 20.0f);
        int iOuw4 = osn.ouw(context, 24.0f);
        int iOuw5 = osn.ouw(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        this.ouw = yuVar;
        yuVar.setId(520093713);
        int iOuw6 = osn.ouw(getContext(), 5.0f);
        yuVar.setPadding(iOuw6, iOuw6, iOuw6, iOuw6);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        yuVar.setScaleType(scaleType);
        yuVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
        yuVar.setImageResource(vpp.yu(zih.ouw(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOuw5, iOuw5);
        layoutParams.topMargin = iOuw3;
        layoutParams.leftMargin = iOuw2;
        layoutParams.setMarginStart(iOuw2);
        yuVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        this.vt = yuVar2;
        yuVar2.setId(520093714);
        yuVar2.setPadding(iOuw6, iOuw6, iOuw6, iOuw6);
        yuVar2.setScaleType(scaleType);
        yuVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
        yuVar2.setImageResource(vpp.yu(zih.ouw(), "tt_close_btn"));
        if (yuVar2.getDrawable() != null) {
            yuVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOuw5, iOuw5);
        layoutParams2.topMargin = iOuw3;
        layoutParams2.rightMargin = iOuw2;
        layoutParams2.setMarginEnd(iOuw2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        yuVar2.setLayoutParams(layoutParams2);
        yuVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.f7866lh = pnoVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iOuw4);
        layoutParams3.topMargin = iOuw3;
        layoutParams3.rightMargin = iOuw2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iOuw2);
        layoutParams3.addRule(21);
        pnoVar.setLayoutParams(layoutParams3);
        pnoVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.vt());
        pnoVar.setGravity(17);
        pnoVar.setPadding(iOuw, 0, iOuw, 0);
        pnoVar.setTextColor(-1);
        pnoVar.setTextSize(1, 14.0f);
        pnoVar.setVisibility(4);
        addView(yuVar);
        addView(pnoVar);
        addView(yuVar2);
    }

    public final com.bytedance.sdk.openadsdk.core.le.pno getTopCountDown() {
        return this.f7866lh;
    }

    public final View getTopDislike() {
        return this.ouw;
    }

    public final com.bytedance.sdk.openadsdk.core.le.yu getTopSkip() {
        return this.vt;
    }
}
