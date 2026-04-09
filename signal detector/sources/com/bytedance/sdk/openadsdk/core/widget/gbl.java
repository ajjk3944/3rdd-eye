package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class gbl extends FrameLayout {
    private PAGLogoView bw;
    private vk dg;
    private boolean emc;
    private String msw;
    private rie uym;
    private TextView xq;
    private com.bytedance.sdk.openadsdk.core.ycc.msw ycc;
    private aa ypw;
    private com.bytedance.sdk.openadsdk.core.xq.emc zz;

    public gbl(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.vk.vhn);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.xq.emc emcVar) {
        this.zz = emcVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            emc();
        }
    }

    private void ypw() {
        Context context = getContext();
        boolean z6 = this.uym.ono() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setGravity(1);
        bwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z6 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(vw.ypw(context, 327.0f), -2);
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
        this.ycc = mswVar2;
        mswVar2.setEllipsize(truncateAt);
        this.ycc.setGravity(17);
        this.ycc.setMaxLines(2);
        this.ycc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.ycc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = vw.ypw(context, 8.0f);
        bwVar.addView(this.ycc, layoutParams3);
        this.dg = new vk(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, vw.ypw(context, 16.0f));
        layoutParams4.topMargin = vw.ypw(context, 12.0f);
        this.dg.setVisibility(8);
        bwVar.addView(this.dg, layoutParams4);
        this.bw = PAGLogoView.createPAGLogoViewByMaterial(context, this.uym);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, vw.ypw(context, 14.0f));
        layoutParams5.gravity = 8388691;
        layoutParams5.leftMargin = vw.ypw(context, 18.0f);
        if (z6) {
            layoutParams5.bottomMargin = vw.ypw(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = vw.ypw(context, 24.0f);
        }
        addView(this.bw, layoutParams5);
    }

    public void emc(rie rieVar, String str, com.bytedance.sdk.openadsdk.core.xq.emc emcVar) {
        this.uym = rieVar;
        this.msw = str;
        this.zz = emcVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void emc() {
        if (this.emc) {
            return;
        }
        this.emc = true;
        ypw();
        if (this.ypw != null && this.uym.ya() != null && !TextUtils.isEmpty(this.uym.ya().emc())) {
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.uym.ya(), this.ypw, this.uym);
        }
        vk vkVar = this.dg;
        if (vkVar != null) {
            vw.emc((TextView) null, vkVar, this.uym);
            if (this.uym.mjd() != null) {
                this.dg.setVisibility(0);
            }
        }
        if (this.xq != null) {
            if (this.uym.mjd() != null && !TextUtils.isEmpty(this.uym.mjd().ypw())) {
                this.xq.setText(this.uym.mjd().ypw());
            } else if (!TextUtils.isEmpty(this.uym.hs())) {
                this.xq.setText(this.uym.hs());
            } else {
                this.xq.setVisibility(8);
            }
        }
        if (this.ycc != null) {
            String strXou = this.uym.xou();
            if (!TextUtils.isEmpty(strXou)) {
                this.ycc.setText(strXou);
            } else {
                this.ycc.setVisibility(8);
            }
        }
        this.bw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.gbl.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.emc(gbl.this.getContext(), gbl.this.uym, gbl.this.msw);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
