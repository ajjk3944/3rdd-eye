package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ycc.sra;

/* loaded from: classes.dex */
public class aa<E extends sra> implements uym<E> {
    protected int bw;
    protected com.bytedance.sdk.component.adexpress.dynamic.dg.uym dg;
    protected sra emc;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw xq;
    protected Context ypw;

    public aa(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar, int i) {
        this.bw = i;
        this.ypw = context;
        this.xq = bwVar;
        this.dg = uymVar;
        dg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    /* renamed from: bw, reason: merged with bridge method [inline-methods] */
    public E xq() {
        return (E) this.emc;
    }

    public void dg() {
        this.emc = new sra(this.ypw, this.dg.wo());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.ypw, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.ypw, 100 - this.bw);
        this.emc.setLayoutParams(layoutParams);
        try {
            this.emc.setGuideText(this.dg.but());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void emc() {
        this.emc.emc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    public void ypw() {
        this.emc.ypw();
    }

    public aa(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        this(context, bwVar, uymVar, 0);
    }
}
