package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class ru extends RelativeLayout {
    public ru(Context context) {
        super(context);
        emc();
    }

    private void emc() {
        Context context = getContext();
        int iYpw = vw.ypw(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, vw.ypw(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        dgVar.setId(520093720);
        dgVar.setClickable(true);
        dgVar.setFocusable(true);
        dgVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_leftbackicon_selector"));
        int iYpw2 = vw.ypw(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iYpw2, iYpw2);
        layoutParams.leftMargin = iYpw;
        layoutParams.addRule(15);
        addView(dgVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        dgVar2.setId(520093716);
        dgVar2.setClickable(true);
        dgVar2.setFocusable(true);
        dgVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iYpw2, iYpw2);
        layoutParams2.leftMargin = iYpw;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(dgVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar3 = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        int i = com.bytedance.sdk.openadsdk.utils.vk.yuz;
        dgVar3.setId(i);
        dgVar3.setImageDrawable(rie.xq(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iYpw2, iYpw2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iYpw;
        addView(dgVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar.setId(com.bytedance.sdk.openadsdk.utils.vk.vum);
        mswVar.setSingleLine(true);
        mswVar.setEllipsize(TextUtils.TruncateAt.END);
        mswVar.setGravity(17);
        mswVar.setTextColor(-16777216);
        mswVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(vw.ypw(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i);
        int iYpw3 = vw.ypw(context, 25.0f);
        layoutParams4.rightMargin = iYpw3;
        layoutParams4.leftMargin = iYpw3;
        addView(mswVar, layoutParams4);
    }
}
