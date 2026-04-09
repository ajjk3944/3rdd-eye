package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.le.qbp;
import com.bytedance.sdk.component.adexpress.le.th;
import com.bytedance.sdk.component.adexpress.le.vpp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends zih<com.bytedance.sdk.component.adexpress.le.le> {
    public le(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, int i4, int i10, int i11, JSONObject jSONObject) {
        super(context, fkwVar, raVar);
        this.vt = context;
        this.yu = raVar;
        this.f7271lh = fkwVar;
        this.ouw = new com.bytedance.sdk.component.adexpress.le.le(this.vt, i4, i10, i11, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, 300.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, raVar.yu.xn <= 0 ? com.bytedance.sdk.component.adexpress.yu.vt() ? 0 : 120 : r9);
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setClipChildren(false);
        this.ouw.setSlideText(this.yu.yu.vm);
        vpp vppVar = this.ouw;
        if (vppVar instanceof com.bytedance.sdk.component.adexpress.le.le) {
            ((com.bytedance.sdk.component.adexpress.le.le) vppVar).setShakeText(this.yu.yu.mwe);
            final qbp shakeView = ((com.bytedance.sdk.component.adexpress.le.le) this.ouw).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new th.ouw() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.le.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.f7271lh.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.zih
    public final void yu() {
    }
}
