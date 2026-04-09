package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zih extends le {
    private LinearLayout jqy;
    private TextView ouw;
    private TextView qbp;
    private TextView vpp;
    private TextView vt;
    private TextView zin;

    public zih(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.ouw = new TextView(this.f7229cf);
        this.vt = new TextView(this.f7229cf);
        this.qbp = new TextView(this.f7229cf);
        this.jqy = new LinearLayout(this.f7229cf);
        this.zin = new TextView(this.f7229cf);
        this.vpp = new TextView(this.f7229cf);
        this.ouw.setTag(9);
        this.vt.setTag(10);
        this.qbp.setTag(12);
        this.jqy.addView(this.qbp);
        this.jqy.addView(this.vpp);
        this.jqy.addView(this.vt);
        this.jqy.addView(this.zin);
        this.jqy.addView(this.ouw);
        addView(this.jqy, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public final FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.ra, this.pno);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final boolean lh() {
        this.ouw.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.ouw.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.vt.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.vt.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.qbp.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.qbp.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        this.qbp.setText("Function");
        this.vt.setText("Permission list");
        this.zin.setText(" | ");
        this.vpp.setText(" | ");
        this.ouw.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        if (raVar != null) {
            this.qbp.setTextColor(raVar.le());
            this.qbp.setTextSize(this.ryl.yu.pno);
            this.vt.setTextColor(this.ryl.le());
            this.vt.setTextSize(this.ryl.yu.pno);
            this.zin.setTextColor(this.ryl.le());
            this.vpp.setTextColor(this.ryl.le());
            this.ouw.setTextColor(this.ryl.le());
            this.ouw.setTextSize(this.ryl.yu.pno);
            return false;
        }
        this.qbp.setTextColor(-1);
        this.qbp.setTextSize(12.0f);
        this.vt.setTextColor(-1);
        this.vt.setTextSize(12.0f);
        this.zin.setTextColor(-1);
        this.vpp.setTextColor(-1);
        this.ouw.setTextColor(-1);
        this.ouw.setTextSize(12.0f);
        return false;
    }
}
