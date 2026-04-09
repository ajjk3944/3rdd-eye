package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.component.utils.xmt;

/* loaded from: classes.dex */
public class gbl implements uym<ViewGroup> {
    private final com.bytedance.sdk.component.adexpress.ycc.ru emc;
    private final FrameLayout ypw;

    public gbl(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar, String str, String str2) {
        com.bytedance.sdk.component.adexpress.ycc.ru ruVar = new com.bytedance.sdk.component.adexpress.ycc.ru(context);
        this.emc = ruVar;
        ruVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.ypw = frameLayout;
        frameLayout.addView(ruVar, new FrameLayout.LayoutParams(-2, -2));
        double dNw = uymVar.nw();
        dNw = dNw == 0.0d ? 1.0d : dNw;
        double dWbn = uymVar.wbn();
        double d6 = dWbn != 0.0d ? dWbn : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!"20".equals(str2)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (bwVar.getDynamicWidth() * 0.32d * dNw), (int) (bwVar.getDynamicWidth() * 0.32d * d6));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            emc(context, frameLayout, uymVar);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 81;
            layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, uymVar.pxa() > 0 ? uymVar.pxa() : com.bytedance.sdk.component.adexpress.dg.ypw() ? 0 : 120);
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setClipChildren(false);
        }
    }

    private void emc(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -xmt.emc(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(rie.ypw(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, xmt.emc(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(rie.ypw(context, "tt_splash_brush_mask_hint")));
        if (uymVar != null && !TextUtils.isEmpty(uymVar.but())) {
            textView2.setText(uymVar.but());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public ViewGroup xq() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void ypw() {
        this.emc.ycc();
        ViewParent parent = this.ypw.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.ypw);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void emc() {
        this.emc.msw();
    }
}
