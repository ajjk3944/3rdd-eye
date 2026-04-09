package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class gbl {
    private com.bytedance.sdk.openadsdk.core.ycc.msw bw;
    private com.bytedance.sdk.openadsdk.core.widget.aa dg;
    protected View emc = bw();
    private com.bytedance.sdk.openadsdk.core.widget.msw xq;
    protected Context ypw;

    public gbl(Context context) {
        this.ypw = context;
    }

    private View bw() {
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(this.ypw);
        bwVar.setGravity(1);
        bwVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.aa aaVar = new com.bytedance.sdk.openadsdk.core.widget.aa(this.ypw);
        this.dg = aaVar;
        aaVar.setId(520093745);
        int iYpw = vw.ypw(this.ypw, 64.0f);
        bwVar.addView(this.dg, new LinearLayout.LayoutParams(iYpw, iYpw));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(this.ypw);
        this.bw = mswVar;
        mswVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(vw.ypw(this.ypw, 219.0f), -2);
        layoutParams.topMargin = vw.ypw(this.ypw, 16.0f);
        this.bw.setLayoutParams(layoutParams);
        this.bw.setEllipsize(TextUtils.TruncateAt.END);
        this.bw.setGravity(17);
        this.bw.setMaxWidth(vw.ypw(this.ypw, 150.0f));
        this.bw.setMaxLines(2);
        this.bw.setTextColor(-1);
        this.bw.setTextSize(1, 16.0f);
        bwVar.addView(this.bw);
        this.xq = new com.bytedance.sdk.openadsdk.core.widget.msw(this.ypw);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(vw.ypw(this.ypw, 219.0f), vw.ypw(this.ypw, 6.0f));
        layoutParams2.topMargin = vw.ypw(this.ypw, 32.0f);
        bwVar.addView(this.xq, layoutParams2);
        return bwVar;
    }

    public void dg() {
        this.emc = null;
        this.ypw = null;
    }

    public View emc() {
        return this.emc;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.msw xq() {
        return this.bw;
    }

    public com.bytedance.sdk.openadsdk.core.widget.aa ypw() {
        return this.dg;
    }

    public void emc(int i) {
        this.xq.setProgress(i);
    }
}
