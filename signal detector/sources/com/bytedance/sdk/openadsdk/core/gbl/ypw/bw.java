package com.bytedance.sdk.openadsdk.core.gbl.ypw;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import org.json.JSONException;

/* loaded from: classes.dex */
public class bw extends com.bytedance.adsdk.ugeno.ypw.xq<FrameLayout> {
    public bw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    /* renamed from: xq, reason: merged with bridge method [inline-methods] */
    public FrameLayout emc() {
        FrameLayout frameLayout = new FrameLayout(this.ypw);
        com.bytedance.sdk.openadsdk.core.model.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.model.ypw();
        ypwVar.emc(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.ypw);
        pAGLogoView.initData(ypwVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
    }
}
