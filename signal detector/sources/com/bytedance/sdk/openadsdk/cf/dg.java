package com.bytedance.sdk.openadsdk.cf;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.ycc.uym;
import com.bytedance.sdk.openadsdk.core.ycc.ycc;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class dg extends uym {
    public dg(Context context) {
        this(context, null);
    }

    private void emc(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iYpw = vw.ypw(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar.setId(vk.gyw);
        xqVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        xqVar.setBackgroundColor(0);
        addView(xqVar);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        dgVar.setId(vk.qp);
        dgVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        dgVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        xqVar.addView(dgVar);
        ycc yccVar = new ycc(context);
        yccVar.setId(vk.iat);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iYpw, iYpw);
        layoutParams.gravity = 17;
        yccVar.setLayoutParams(layoutParams);
        yccVar.setIndeterminateDrawable(gbl.emc(context, "tt_video_loading_progress_bar"));
        xqVar.addView(yccVar);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        dgVar2.setId(vk.hs);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        dgVar2.setLayoutParams(layoutParams2);
        dgVar2.setScaleType(ImageView.ScaleType.CENTER);
        dgVar2.setImageDrawable(gbl.emc(context, "tt_play_movebar_textpage"));
        dgVar2.setVisibility(8);
        addView(dgVar2);
        View ypwVar = new ypw(context);
        ypwVar.setId(vk.sg);
        ypwVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(ypwVar);
    }

    public dg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public dg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emc(context);
    }
}
