package com.bytedance.sdk.openadsdk.core.cf.vt;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends com.bytedance.adsdk.ugeno.vt.lh<FrameLayout> {
    public fkw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        FrameLayout frameLayout = new FrameLayout(this.vt);
        com.bytedance.sdk.openadsdk.core.model.vt vtVar = new com.bytedance.sdk.openadsdk.core.model.vt();
        vtVar.fkw = true;
        PAGLogoView pAGLogoView = new PAGLogoView(this.vt);
        pAGLogoView.initData(vtVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() throws JSONException {
        super.vt();
    }
}
