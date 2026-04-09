package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ycc.db;
import com.bytedance.sdk.component.utils.rie;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yzg implements uym<db> {
    private String bw;
    private com.bytedance.sdk.component.adexpress.dynamic.dg.uym dg;
    private db emc;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw xq;
    private com.bytedance.sdk.component.adexpress.dynamic.dg.ru ycc;
    private Context ypw;

    public yzg(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar, String str, com.bytedance.sdk.component.adexpress.dynamic.dg.ru ruVar) {
        this.ypw = context;
        this.xq = bwVar;
        this.dg = uymVar;
        this.bw = str;
        this.ycc = ruVar;
        bw();
    }

    private void bw() {
        int iPxa = this.dg.pxa();
        final com.bytedance.sdk.component.adexpress.dynamic.ycc.emc dynamicClickListener = this.xq.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.bw)) {
            Context context = this.ypw;
            db dbVar = new db(context, com.bytedance.sdk.component.adexpress.xq.emc.zz(context), this.ycc);
            this.emc = dbVar;
            if (dbVar.getWriggleLayout() != null) {
                this.emc.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.emc.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.dg.ltx())) {
                    this.emc.getTopTextView().setText(rie.ypw(this.ypw, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.emc.getTopTextView().setText(this.dg.ltx());
                }
            }
        } else {
            Context context2 = this.ypw;
            this.emc = new db(context2, com.bytedance.sdk.component.adexpress.xq.emc.zz(context2), this.ycc);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.emc.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.ypw, iPxa)));
        this.emc.setLayoutParams(layoutParams);
        this.emc.setShakeText(this.dg.but());
        this.emc.setClipChildren(false);
        final View wriggleProgressIv = this.emc.getWriggleProgressIv();
        this.emc.setOnShakeViewListener(new db.emc() { // from class: com.bytedance.sdk.component.adexpress.dynamic.xq.yzg.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.uym
    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public db xq() {
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
