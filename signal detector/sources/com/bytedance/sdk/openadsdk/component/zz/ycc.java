package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.aa;
import com.bytedance.sdk.openadsdk.core.widget.vk;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class ycc extends xq {
    private final vk qh;
    private final com.bytedance.sdk.openadsdk.core.ycc.bw sz;

    public ycc(Context context, rie rieVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        this.sz = bwVar;
        bwVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = vw.ypw(context, 24.0f);
        layoutParams.topMargin = vw.ypw(context, 56.0f);
        bwVar.setLayoutParams(layoutParams);
        bwVar.setClickable(false);
        bwVar.setGravity(16);
        bwVar.setOrientation(0);
        aa aaVar = new aa(context);
        this.ycc = aaVar;
        aaVar.setId(520093759);
        this.ycc.setLayoutParams(new LinearLayout.LayoutParams(vw.ypw(context, 24.0f), vw.ypw(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.uym = mswVar;
        mswVar.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = vw.ypw(context, 8.0f);
        this.uym.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = this.uym;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar2.setEllipsize(truncateAt);
        this.uym.setMaxLines(2);
        this.uym.setTextColor(Color.parseColor("#161823"));
        this.uym.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.ycc.uym uymVar = new com.bytedance.sdk.openadsdk.core.ycc.uym(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(vw.ypw(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = vw.ypw(context, 24.0f);
        layoutParams3.rightMargin = vw.ypw(context, 24.0f);
        uymVar.setLayoutParams(layoutParams3);
        aa aaVar2 = new aa(context);
        this.zz = aaVar2;
        int i = com.bytedance.sdk.openadsdk.utils.vk.uw;
        aaVar2.setId(i);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(vw.ypw(context, 80.0f), vw.ypw(context, 80.0f));
        layoutParams4.addRule(14);
        this.zz.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.ru = mswVar3;
        int i3 = com.bytedance.sdk.openadsdk.utils.vk.lr;
        mswVar3.setId(i3);
        this.ru.setTextSize(24.0f);
        this.ru.setTextColor(Color.parseColor("#161823"));
        this.ru.setGravity(17);
        this.ru.setMaxLines(1);
        this.ru.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i);
        layoutParams5.topMargin = vw.ypw(context, 12.0f);
        layoutParams5.addRule(14);
        this.ru.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar4 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.gbl = mswVar4;
        int i6 = com.bytedance.sdk.openadsdk.utils.vk.xof;
        mswVar4.setId(i6);
        this.gbl.setTextSize(16.0f);
        this.gbl.setTextColor(Color.parseColor("#80161823"));
        this.gbl.setGravity(17);
        this.gbl.setMaxLines(2);
        this.gbl.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i3);
        layoutParams6.topMargin = vw.ypw(context, 4.0f);
        layoutParams6.addRule(14);
        this.gbl.setLayoutParams(layoutParams6);
        vk vkVar = new vk(context);
        this.qh = vkVar;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = vw.ypw(context, 12.0f);
        vkVar.setLayoutParams(layoutParams7);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar5 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.bw = mswVar5;
        mswVar5.setId(520093717);
        this.bw.setBackground(gbl.emc(context, "tt_reward_full_video_backup_btn_bg"));
        this.bw.setEllipsize(truncateAt);
        this.bw.setLines(1);
        this.bw.setGravity(17);
        this.bw.setTextColor(-1);
        this.bw.setTextSize(16.0f);
        this.bw.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, vw.ypw(context, 44.0f));
        layoutParams8.addRule(3, i6);
        layoutParams8.topMargin = vw.ypw(context, 54.0f);
        layoutParams8.addRule(14);
        this.bw.setLayoutParams(layoutParams8);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, rieVar);
        this.dg = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, vw.ypw(context, 14.0f));
        layoutParams9.leftMargin = vw.ypw(context, 16.0f);
        layoutParams9.bottomMargin = vw.ypw(context, 24.0f);
        layoutParams9.addRule(12);
        this.dg.setLayoutParams(layoutParams9);
        addView(this.msw);
        bwVar.addView(this.ycc);
        bwVar.addView(this.uym);
        addView(bwVar);
        uymVar.addView(this.zz);
        uymVar.addView(this.ru);
        uymVar.addView(this.gbl);
        uymVar.addView(vkVar);
        uymVar.addView(this.bw);
        addView(uymVar);
        addView(this.dg);
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public com.bytedance.sdk.openadsdk.core.ycc.dg getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public com.bytedance.sdk.openadsdk.core.ycc.msw getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public vk getScoreBar() {
        return this.qh;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public View getUserInfo() {
        return this.sz;
    }
}
