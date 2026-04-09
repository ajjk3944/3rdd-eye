package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class zz extends FrameLayout {
    private TextView bw;
    private vk dg;
    private boolean emc;
    private com.bytedance.sdk.openadsdk.core.xq.emc gbl;
    private rie msw;
    private boolean ru;
    private com.bytedance.sdk.openadsdk.core.ycc.msw uym;
    private TextView xq;
    private PAGLogoView ycc;
    private aa ypw;
    private String zz;

    public zz(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.vk.se);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.xq.emc emcVar) {
        this.gbl = emcVar;
        TextView textView = this.bw;
        if (textView != null) {
            textView.setOnClickListener(emcVar);
            this.bw.setOnTouchListener(this.gbl);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            emc();
        }
    }

    private void ypw() {
        Context context = getContext();
        boolean z10 = this.msw.ono() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setGravity(1);
        bwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z10 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(vw.ypw(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iYpw = vw.ypw(context, 24.0f);
        layoutParams.rightMargin = iYpw;
        layoutParams.leftMargin = iYpw;
        addView(bwVar, layoutParams);
        aa aaVar = new aa(context);
        this.ypw = aaVar;
        aaVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(vw.ypw(context, 80.0f), vw.ypw(context, 80.0f));
        layoutParams2.bottomMargin = vw.ypw(context, 12.0f);
        bwVar.addView(this.ypw, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.xq = mswVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar.setEllipsize(truncateAt);
        this.xq.setGravity(17);
        this.xq.setMaxLines(2);
        this.xq.setMaxWidth(vw.ypw(context, 180.0f));
        this.xq.setTextColor(-1);
        this.xq.setTextSize(2, 24.0f);
        bwVar.addView(this.xq, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.uym = mswVar2;
        mswVar2.setEllipsize(truncateAt);
        this.uym.setGravity(17);
        this.uym.setMaxLines(2);
        this.uym.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.uym.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = vw.ypw(context, 8.0f);
        bwVar.addView(this.uym, layoutParams3);
        this.dg = new vk(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, vw.ypw(context, 16.0f));
        layoutParams4.topMargin = vw.ypw(context, 12.0f);
        this.dg.setVisibility(8);
        bwVar.addView(this.dg, layoutParams4);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.bw = mswVar3;
        mswVar3.setId(520093707);
        this.bw.setGravity(17);
        this.bw.setText(com.bytedance.sdk.component.utils.rie.emc(context, "tt_video_download_apk"));
        this.bw.setTextColor(-1);
        this.bw.setTextSize(2, 16.0f);
        this.bw.setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, vw.ypw(context, 44.0f));
        layoutParams5.topMargin = vw.ypw(context, 54.0f);
        bwVar.addView(this.bw, layoutParams5);
        if (!this.ru && this.msw.gn() && dr.xq(this.msw)) {
            this.bw.setVisibility(8);
        }
        this.ycc = PAGLogoView.createPAGLogoViewByMaterial(context, this.msw);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, vw.ypw(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = vw.ypw(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = vw.ypw(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = vw.ypw(context, 24.0f);
        }
        addView(this.ycc, layoutParams6);
    }

    public void emc(rie rieVar, String str, com.bytedance.sdk.openadsdk.core.xq.emc emcVar, boolean z10) {
        this.msw = rieVar;
        this.zz = str;
        this.ru = z10;
        this.gbl = emcVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void emc() {
        if (this.emc) {
            return;
        }
        this.emc = true;
        ypw();
        this.bw.setOnClickListener(this.gbl);
        this.bw.setOnTouchListener(this.gbl);
        String strXxo = this.msw.xxo();
        if (!TextUtils.isEmpty(strXxo)) {
            this.bw.setText(strXxo);
        }
        if (this.ypw != null && this.msw.ya() != null && !TextUtils.isEmpty(this.msw.ya().emc())) {
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.msw.ya(), this.ypw, this.msw);
        }
        vk vkVar = this.dg;
        if (vkVar != null) {
            vw.emc((TextView) null, vkVar, this.msw);
            if (this.msw.mjd() != null) {
                this.dg.setVisibility(0);
            }
        }
        if (this.xq != null) {
            if (this.msw.mjd() != null && !TextUtils.isEmpty(this.msw.mjd().ypw())) {
                this.xq.setText(this.msw.mjd().ypw());
            } else if (!TextUtils.isEmpty(this.msw.hs())) {
                this.xq.setText(this.msw.hs());
            } else {
                this.xq.setVisibility(8);
            }
        }
        if (this.uym != null) {
            String strXou = this.msw.xou();
            if (!TextUtils.isEmpty(strXou)) {
                this.uym.setText(strXou);
            } else {
                this.uym.setVisibility(8);
            }
        }
        this.ycc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.zz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.emc(zz.this.getContext(), zz.this.msw, zz.this.zz);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
