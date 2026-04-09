package com.bytedance.sdk.openadsdk.xq;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class uym extends LinearLayout {
    private final FilterWord emc;
    private final ru xq;
    private msw ypw;

    public uym(Context context, FilterWord filterWord, ru ruVar) {
        super(context);
        setOrientation(1);
        this.emc = filterWord;
        this.xq = ruVar;
        emc();
    }

    private void emc() {
        xq();
        ypw();
    }

    private void xq() {
        String name = this.emc.getName();
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = vw.ypw(getContext(), 12.0f);
        layoutParams.gravity = 17;
        mswVar.setGravity(17);
        mswVar.setText(name);
        mswVar.setTextColor(Color.argb(85, 22, 24, 35));
        mswVar.setTextSize(this.xq.zz() ? 14 : 10);
        addView(mswVar, layoutParams);
    }

    private void ypw() {
        this.ypw = new msw(getContext(), this.xq);
        new LinearLayout.LayoutParams(-1, -2);
        this.ypw.emc(this.emc.getOptions());
        addView(this.ypw);
    }
}
