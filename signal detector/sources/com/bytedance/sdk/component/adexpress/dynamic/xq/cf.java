package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ycc.yzg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cf implements uym<com.bytedance.sdk.component.adexpress.ycc.yzg> {
    private String bw;
    private com.bytedance.sdk.component.adexpress.dynamic.dg.uym dg;
    private com.bytedance.sdk.component.adexpress.ycc.yzg emc;
    private int msw;
    private int uym;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw xq;
    private int ycc;
    private Context ypw;
    private JSONObject zz;

    public cf(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar, String str, int i, int i3, int i6, JSONObject jSONObject) {
        this.ypw = context;
        this.xq = bwVar;
        this.dg = uymVar;
        this.bw = str;
        this.ycc = i;
        this.uym = i3;
        this.msw = i6;
        this.zz = jSONObject;
        bw();
    }

    private void bw() {
        final com.bytedance.sdk.component.adexpress.dynamic.ycc.emc dynamicClickListener = this.xq.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.bw)) {
            Context context = this.ypw;
            com.bytedance.sdk.component.adexpress.ycc.yzg yzgVar = new com.bytedance.sdk.component.adexpress.ycc.yzg(context, com.bytedance.sdk.component.adexpress.xq.emc.msw(context), this.ycc, this.uym, this.msw, this.zz);
            this.emc = yzgVar;
            if (yzgVar.getShakeLayout() != null) {
                this.emc.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.ypw;
            this.emc = new com.bytedance.sdk.component.adexpress.ycc.yzg(context2, com.bytedance.sdk.component.adexpress.xq.emc.uym(context2), this.ycc, this.uym, this.msw, this.zz);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.emc.setGravity(17);
        layoutParams.gravity = 17;
        this.emc.setLayoutParams(layoutParams);
        this.emc.setTranslationY(com.bytedance.sdk.component.adexpress.dg.uym.emc(this.ypw, this.dg.jp()));
        this.emc.setShakeText(this.dg.but());
        this.emc.setClipChildren(false);
        this.emc.setOnShakeViewListener(new yzg.emc() { // from class: com.bytedance.sdk.component.adexpress.dynamic.xq.cf.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ycc.yzg xq() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void emc() {
        this.emc.emc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void ypw() {
        this.emc.clearAnimation();
    }
}
