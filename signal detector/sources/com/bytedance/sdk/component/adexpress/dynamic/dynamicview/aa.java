package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class aa extends ycc {
    private TextView emc;
    private LinearLayout rie;
    private TextView sra;
    private TextView ul;
    private TextView ylm;
    private TextView ypw;

    public aa(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.emc = new TextView(this.gbl);
        this.ypw = new TextView(this.gbl);
        this.ul = new TextView(this.gbl);
        this.rie = new LinearLayout(this.gbl);
        this.ylm = new TextView(this.gbl);
        this.sra = new TextView(this.gbl);
        this.emc.setTag(9);
        this.ypw.setTag(10);
        this.ul.setTag(12);
        this.rie.addView(this.ul);
        this.rie.addView(this.sra);
        this.rie.addView(this.ypw);
        this.rie.addView(this.ylm);
        this.rie.addView(this.emc);
        addView(this.rie, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public boolean dg() {
        this.emc.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.emc.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.ypw.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.ypw.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.ul.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.ul.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.uym, this.msw);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        this.ul.setText("Function");
        this.ypw.setText("Permission list");
        this.ylm.setText(" | ");
        this.sra.setText(" | ");
        this.emc.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar = this.sup;
        if (uymVar != null) {
            this.ul.setTextColor(uymVar.uym());
            this.ul.setTextSize(this.sup.bw());
            this.ypw.setTextColor(this.sup.uym());
            this.ypw.setTextSize(this.sup.bw());
            this.ylm.setTextColor(this.sup.uym());
            this.sra.setTextColor(this.sup.uym());
            this.emc.setTextColor(this.sup.uym());
            this.emc.setTextSize(this.sup.bw());
            return false;
        }
        this.ul.setTextColor(-1);
        this.ul.setTextSize(12.0f);
        this.ypw.setTextColor(-1);
        this.ypw.setTextSize(12.0f);
        this.ylm.setTextColor(-1);
        this.sra.setTextColor(-1);
        this.emc.setTextColor(-1);
        this.emc.setTextSize(12.0f);
        return false;
    }
}
