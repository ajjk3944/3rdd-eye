package com.bytedance.sdk.openadsdk.cf;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.ycc.msw;
import com.bytedance.sdk.openadsdk.core.ycc.uym;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class ypw extends uym {
    public ypw(Context context) {
        this(context, null);
    }

    private void emc(Context context) {
        setId(vk.sg);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(getContext());
        dgVar.setId(vk.kv);
        dgVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        dgVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        dgVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        dgVar.setBackgroundColor(Color.parseColor("#7f000000"));
        dgVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(dgVar);
        uym uymVar = new uym(context);
        uymVar.setId(vk.etw);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        uymVar.setLayoutParams(layoutParams);
        addView(uymVar);
        int iYpw = vw.ypw(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.emc emcVar = new com.bytedance.sdk.openadsdk.core.widget.emc(context);
        int i10 = vk.wo;
        emcVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iYpw, iYpw);
        layoutParams2.addRule(14);
        emcVar.setLayoutParams(layoutParams2);
        emcVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        uymVar.addView(emcVar);
        msw mswVar = new msw(context);
        mswVar.setId(vk.xxg);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iYpw, iYpw);
        layoutParams3.addRule(8, i10);
        layoutParams3.addRule(19, i10);
        layoutParams3.addRule(5, i10);
        layoutParams3.addRule(7, i10);
        layoutParams3.addRule(18, i10);
        layoutParams3.addRule(6, i10);
        layoutParams3.addRule(14);
        mswVar.setLayoutParams(layoutParams3);
        mswVar.setBackground(gbl.emc(context, "tt_circle_solid_mian"));
        mswVar.setGravity(17);
        mswVar.setTextColor(-1);
        mswVar.setTextSize(2, 19.0f);
        mswVar.setTypeface(Typeface.defaultFromStyle(1));
        mswVar.setVisibility(8);
        uymVar.addView(mswVar);
        msw mswVar2 = new msw(context);
        int i11 = vk.yz;
        mswVar2.setId(i11);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i10);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = vw.ypw(context, 6.0f);
        mswVar2.setLayoutParams(layoutParams4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar2.setEllipsize(truncateAt);
        mswVar2.setMaxLines(1);
        mswVar2.setTextColor(-1);
        mswVar2.setTextSize(2, 12.0f);
        uymVar.addView(mswVar2);
        msw mswVar3 = new msw(context);
        mswVar3.setId(vk.wpn);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(vw.ypw(context, 100.0f), vw.ypw(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i11);
        layoutParams5.topMargin = vw.ypw(context, 20.0f);
        mswVar3.setLayoutParams(layoutParams5);
        mswVar3.setMinWidth(vw.ypw(context, 72.0f));
        mswVar3.setMaxLines(1);
        mswVar3.setEllipsize(truncateAt);
        mswVar3.setTextColor(-1);
        mswVar3.setTextSize(2, 14.0f);
        mswVar3.setBackground(gbl.emc(context, "tt_ad_cover_btn_begin_bg"));
        mswVar3.setGravity(17);
        int iYpw2 = vw.ypw(context, 10.0f);
        int iYpw3 = vw.ypw(context, 2.0f);
        mswVar3.setPadding(iYpw2, iYpw3, iYpw2, iYpw3);
        mswVar3.setVisibility(8);
        uymVar.addView(mswVar3);
    }

    public ypw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ypw(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        emc(context);
    }
}
