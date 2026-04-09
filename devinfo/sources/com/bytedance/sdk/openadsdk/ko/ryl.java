package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl extends com.bytedance.sdk.openadsdk.core.le.ra {
    public ryl(Context context) {
        this(context, null);
    }

    private ryl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ryl(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
        setId(rn.ln);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(getContext());
        yuVar.setId(rn.smu);
        yuVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        yuVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        yuVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        yuVar.setBackgroundColor(Color.parseColor("#7f000000"));
        yuVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(yuVar);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        raVar.setId(rn.qni);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        raVar.setLayoutParams(layoutParams);
        addView(raVar);
        int iOuw = osn.ouw(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.widget.ouw(context);
        int i4 = rn.rrs;
        ouwVar.setId(i4);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOuw, iOuw);
        layoutParams2.addRule(14);
        ouwVar.setLayoutParams(layoutParams2);
        ouwVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        raVar.addView(ouwVar);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setId(rn.jvy);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOuw, iOuw);
        layoutParams3.addRule(8, i4);
        layoutParams3.addRule(19, i4);
        layoutParams3.addRule(5, i4);
        layoutParams3.addRule(7, i4);
        layoutParams3.addRule(18, i4);
        layoutParams3.addRule(6, i4);
        layoutParams3.addRule(14);
        pnoVar.setLayoutParams(layoutParams3);
        pnoVar.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_circle_solid_mian"));
        pnoVar.setGravity(17);
        pnoVar.setTextColor(-1);
        pnoVar.setTextSize(2, 19.0f);
        pnoVar.setTypeface(Typeface.defaultFromStyle(1));
        pnoVar.setVisibility(8);
        raVar.addView(pnoVar);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        int i10 = rn.fqk;
        pnoVar2.setId(i10);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i4);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = osn.ouw(context, 6.0f);
        pnoVar2.setLayoutParams(layoutParams4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pnoVar2.setEllipsize(truncateAt);
        pnoVar2.setMaxLines(1);
        pnoVar2.setTextColor(-1);
        pnoVar2.setTextSize(2, 12.0f);
        raVar.addView(pnoVar2);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar3.setId(rn.hun);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(osn.ouw(context, 100.0f), osn.ouw(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i10);
        layoutParams5.topMargin = osn.ouw(context, 20.0f);
        pnoVar3.setLayoutParams(layoutParams5);
        pnoVar3.setMinWidth(osn.ouw(context, 72.0f));
        pnoVar3.setMaxLines(1);
        pnoVar3.setEllipsize(truncateAt);
        pnoVar3.setTextColor(-1);
        pnoVar3.setTextSize(2, 14.0f);
        pnoVar3.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_ad_cover_btn_begin_bg"));
        pnoVar3.setGravity(17);
        int iOuw2 = osn.ouw(context, 10.0f);
        int iOuw3 = osn.ouw(context, 2.0f);
        pnoVar3.setPadding(iOuw2, iOuw3, iOuw2, iOuw3);
        pnoVar3.setVisibility(8);
        raVar.addView(pnoVar3);
    }
}
