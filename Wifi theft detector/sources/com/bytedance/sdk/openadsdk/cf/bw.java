package com.bytedance.sdk.openadsdk.cf;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.core.ycc.msw;
import com.bytedance.sdk.openadsdk.core.ycc.uym;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class bw extends uym {
    public bw(Context context) {
        this(context, null);
    }

    private void emc(Context context) {
        setId(vk.vyk);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        msw mswVar = new msw(context);
        int i10 = vk.xxo;
        mswVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        mswVar.setLayoutParams(layoutParams);
        mswVar.setIncludeFontPadding(false);
        mswVar.setText(rie.emc(context, "tt_video_without_wifi_tips"));
        mswVar.setTextColor(Color.parseColor("#cacaca"));
        mswVar.setTextSize(2, 14.0f);
        addView(mswVar);
        uym uymVar = new uym(context);
        uymVar.setId(vk.ng);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i10);
        layoutParams2.addRule(13);
        uymVar.setLayoutParams(layoutParams2);
        addView(uymVar);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        dgVar.setId(vk.ye);
        int iYpw = vw.ypw(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iYpw, iYpw);
        layoutParams3.addRule(15);
        dgVar.setLayoutParams(layoutParams3);
        dgVar.setImageDrawable(rie.xq(context, "tt_new_play_video"));
        dgVar.setScaleType(ImageView.ScaleType.FIT_XY);
        uymVar.addView(dgVar);
    }

    public bw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bw(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        emc(context);
    }
}
