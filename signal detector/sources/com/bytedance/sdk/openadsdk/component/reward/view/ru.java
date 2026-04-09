package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class ru extends gbl {
    public ru(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        super(emcVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.gbl
    public boolean emc() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.gbl
    public void emc(int i, int i3) {
        super.emc(i, i3);
        if (rie.bw(this.dg) && this.dg.se() == 3 && this.dg.pxj() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.xq.iyl.findViewById(vk.sup);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.dg.ono() == 1) {
                    int iYpw = vw.ypw(aa.emc(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iYpw;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
