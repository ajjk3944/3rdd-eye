package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class uym extends com.bytedance.sdk.openadsdk.core.ycc.uym {
    private boolean bw;
    private com.bytedance.sdk.openadsdk.core.ycc.msw dg;
    private aa emc;
    private msw xq;
    private boolean ycc;
    private com.bytedance.sdk.openadsdk.core.ycc.msw ypw;

    public uym(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (emc()) {
            ypw();
        }
    }

    public boolean emc() {
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.msw getDownloadButton() {
        return this.dg;
    }

    public msw getLoadingProgressBar() {
        return this.xq;
    }

    public void setProgress(int i) {
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.setProgress(i);
        }
    }

    public void ypw() {
        if (this.bw) {
            return;
        }
        this.bw = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        aa aaVar = new aa(context);
        this.emc = aaVar;
        aaVar.setId(520093745);
        int iYpw = vw.ypw(context, 64.0f);
        this.emc.setLayoutParams(new RelativeLayout.LayoutParams(iYpw, iYpw));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.ypw = mswVar;
        mswVar.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(vw.ypw(context, 219.0f), -2);
        layoutParams2.topMargin = vw.ypw(context, 16.0f);
        this.ypw.setLayoutParams(layoutParams2);
        this.ypw.setEllipsize(TextUtils.TruncateAt.END);
        this.ypw.setGravity(17);
        this.ypw.setMaxWidth(vw.ypw(context, 150.0f));
        this.ypw.setMaxLines(2);
        this.ypw.setTextColor(-1);
        this.ypw.setTextSize(1, 16.0f);
        msw mswVar2 = new msw(context);
        this.xq = mswVar2;
        mswVar2.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(vw.ypw(context, 219.0f), vw.ypw(context, 6.0f));
        layoutParams3.topMargin = vw.ypw(context, 24.0f);
        this.xq.setLayoutParams(layoutParams3);
        this.dg = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(vw.ypw(context, 138.0f), vw.ypw(context, 42.0f));
        layoutParams4.topMargin = vw.ypw(context, 48.0f);
        this.dg.setLayoutParams(layoutParams4);
        this.dg.setTextColor(-1);
        this.dg.setTextSize(16.0f);
        this.dg.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.dg.setBackground(gradientDrawable);
        linearLayout.addView(this.emc);
        linearLayout.addView(this.ypw);
        linearLayout.addView(this.xq);
        linearLayout.addView(this.dg);
        addView(linearLayout);
    }

    public void emc(rie rieVar, int i) {
        if (!this.bw || rieVar == null || this.ycc) {
            return;
        }
        this.ycc = true;
        boolean zOug = rieVar.oug();
        if (zOug || rieVar.ya() == null || TextUtils.isEmpty(rieVar.ya().emc())) {
            this.emc.setVisibility(8);
        } else {
            try {
                com.bytedance.sdk.openadsdk.ru.dg.emc(rieVar.ya()).xq(1).emc(new com.bytedance.sdk.openadsdk.ru.ypw(rieVar, rieVar.ya().emc(), new sf(this.emc)));
            } catch (Throwable unused) {
            }
        }
        if (zOug) {
            this.ypw.setText("Loading");
        } else if (TextUtils.isEmpty(rieVar.xou())) {
            this.ypw.setVisibility(8);
        } else {
            this.ypw.setText(rieVar.xou());
        }
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = this.dg;
        if (mswVar != null) {
            mswVar.setText(rieVar.xxo());
        }
    }
}
