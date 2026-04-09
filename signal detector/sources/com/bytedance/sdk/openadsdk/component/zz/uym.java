package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class uym extends com.bytedance.sdk.openadsdk.core.ycc.uym {
    private final com.bytedance.sdk.openadsdk.core.ycc.dg emc;
    private final com.bytedance.sdk.openadsdk.core.ycc.msw xq;
    private final com.bytedance.sdk.openadsdk.core.ycc.dg ypw;

    public uym(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iYpw = vw.ypw(context, 12.0f);
        int iYpw2 = vw.ypw(context, 16.0f);
        int iYpw3 = vw.ypw(context, 20.0f);
        int iYpw4 = vw.ypw(context, 24.0f);
        int iYpw5 = vw.ypw(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        this.emc = dgVar;
        dgVar.setId(520093713);
        int iYpw6 = vw.ypw(getContext(), 5.0f);
        dgVar.setPadding(iYpw6, iYpw6, iYpw6, iYpw6);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        dgVar.setScaleType(scaleType);
        dgVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.emc());
        dgVar.setImageResource(rie.dg(aa.emc(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iYpw5, iYpw5);
        layoutParams.topMargin = iYpw3;
        layoutParams.leftMargin = iYpw2;
        layoutParams.setMarginStart(iYpw2);
        dgVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        this.ypw = dgVar2;
        dgVar2.setId(520093714);
        dgVar2.setPadding(iYpw6, iYpw6, iYpw6, iYpw6);
        dgVar2.setScaleType(scaleType);
        dgVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.emc());
        dgVar2.setImageResource(rie.dg(aa.emc(), "tt_close_btn"));
        if (dgVar2.getDrawable() != null) {
            dgVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iYpw5, iYpw5);
        layoutParams2.topMargin = iYpw3;
        layoutParams2.rightMargin = iYpw2;
        layoutParams2.setMarginEnd(iYpw2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        dgVar2.setLayoutParams(layoutParams2);
        dgVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.xq = mswVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iYpw4);
        layoutParams3.topMargin = iYpw3;
        layoutParams3.rightMargin = iYpw2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iYpw2);
        layoutParams3.addRule(21);
        mswVar.setLayoutParams(layoutParams3);
        mswVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.ypw());
        mswVar.setGravity(17);
        mswVar.setPadding(iYpw, 0, iYpw, 0);
        mswVar.setTextColor(-1);
        mswVar.setTextSize(1, 14.0f);
        mswVar.setVisibility(4);
        addView(dgVar);
        addView(mswVar);
        addView(dgVar2);
    }

    public com.bytedance.sdk.openadsdk.core.ycc.msw getTopCountDown() {
        return this.xq;
    }

    public View getTopDislike() {
        return this.emc;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.dg getTopSkip() {
        return this.ypw;
    }
}
