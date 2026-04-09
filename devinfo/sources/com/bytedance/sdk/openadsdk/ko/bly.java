package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends tlj {
    public bly(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final com.bytedance.sdk.openadsdk.core.le.pno lh(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarLh = super.lh(context);
        pnoVarLh.setGravity(16);
        pnoVarLh.setMaxWidth(osn.ouw(context, 153.0f));
        pnoVarLh.setTextColor(-1);
        pnoVarLh.setTextSize(2, 13.0f);
        return pnoVarLh;
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final void ouw(Context context) {
        int iOuw = osn.ouw(context, 10.0f);
        int iOuw2 = osn.ouw(context, 6.0f);
        int iOuw3 = osn.ouw(context, 16.0f);
        int iOuw4 = osn.ouw(context, 15.0f);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        raVar.setLayoutParams(layoutParams);
        addView(raVar);
        com.bytedance.sdk.openadsdk.core.le.lh lhVarFkw = tlj.fkw(context);
        this.ouw = lhVarFkw;
        lhVarFkw.setId(rn.lgp);
        this.ouw.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        raVar.addView(this.ouw);
        com.bytedance.sdk.openadsdk.core.le.yu yuVarLe = tlj.le(context);
        this.vt = yuVarLe;
        yuVarLe.setId(rn.zrz);
        this.vt.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        raVar.addView(this.vt);
        com.bytedance.sdk.openadsdk.core.le.ra raVar2 = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        int i4 = rn.zjp;
        raVar2.setId(i4);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, osn.ouw(context, 48.0f));
        layoutParams2.addRule(12);
        raVar2.setLayoutParams(layoutParams2);
        raVar2.setBackgroundColor(Color.parseColor("#26000000"));
        raVar2.setGravity(16);
        raVar2.setPadding(iOuw4, 0, 0, 0);
        raVar.addView(raVar2);
        zih zihVarRa = tlj.ra(context);
        this.f8560lh = zihVarRa;
        int i10 = rn.kfa;
        zihVarRa.setId(i10);
        int iOuw5 = osn.ouw(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOuw5, iOuw5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = iOuw;
        layoutParams3.setMarginStart(iOuw);
        this.f8560lh.setLayoutParams(layoutParams3);
        raVar2.addView(this.f8560lh);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(17, i10);
        layoutParams4.addRule(1, i10);
        fkwVar.setLayoutParams(layoutParams4);
        fkwVar.setGravity(16);
        fkwVar.setOrientation(1);
        raVar2.addView(fkwVar);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarVt = vt(context);
        this.yu = pnoVarVt;
        pnoVarVt.setId(rn.yiz);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(osn.ouw(context, 130.0f), osn.ouw(context, 20.0f));
        layoutParams5.leftMargin = iOuw2;
        layoutParams5.setMarginStart(iOuw2);
        this.yu.setLayoutParams(layoutParams5);
        fkwVar.addView(this.yu);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarLh = lh(context);
        this.fkw = pnoVarLh;
        pnoVarLh.setId(rn.ixm);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = iOuw2;
        layoutParams6.setMarginStart(iOuw2);
        this.fkw.setLayoutParams(layoutParams6);
        fkwVar.addView(this.fkw);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarYu = yu(context);
        this.f8559le = pnoVarYu;
        pnoVarYu.setId(rn.yw);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(osn.ouw(context, 80.0f), osn.ouw(context, 30.0f));
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = iOuw;
        layoutParams7.setMarginEnd(iOuw);
        this.f8559le.setLayoutParams(layoutParams7);
        raVar2.addView(this.f8559le);
        View viewPno = tlj.pno(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, i4);
        layoutParams8.leftMargin = iOuw3;
        layoutParams8.bottomMargin = iOuw;
        viewPno.setLayoutParams(layoutParams8);
        raVar.addView(viewPno);
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final com.bytedance.sdk.openadsdk.core.le.pno vt(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setGravity(16);
        pnoVar.setMaxWidth(osn.ouw(context, 153.0f));
        pnoVar.setSingleLine();
        pnoVar.setText("Pangle");
        pnoVar.setTextColor(-1);
        pnoVar.setTextSize(2, 14.0f);
        return pnoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final com.bytedance.sdk.openadsdk.core.le.pno yu(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarYu = super.yu(context);
        pnoVarYu.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_download_corner_bg"));
        pnoVarYu.setTextSize(2, 14.0f);
        return pnoVarYu;
    }

    private bly(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private bly(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
    }
}
