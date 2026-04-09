package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf extends ryl {
    public cf(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.ryl
    public final boolean ouw() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.ryl
    public final void ouw(int i4, int i10) {
        super.ouw(i4, i10);
        if (vpp.fkw(this.yu)) {
            vpp vppVar = this.yu;
            if (vppVar.wbf == 3 && vppVar.zih() == 0) {
                try {
                    FrameLayout frameLayout = (FrameLayout) this.f8029lh.rrs.findViewById(rn.tlj);
                    frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                    if (this.yu.jqy() == 1) {
                        int iOuw = osn.ouw(zih.ouw(), 90.0f);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iOuw;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
