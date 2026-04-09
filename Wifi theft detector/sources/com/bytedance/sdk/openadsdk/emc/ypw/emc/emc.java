package com.bytedance.sdk.openadsdk.emc.ypw.emc;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.vk;
import com.bytedance.sdk.openadsdk.core.zz.ul;

/* loaded from: classes.dex */
public class emc extends com.bytedance.sdk.openadsdk.core.zz.emc {
    private ul emc;
    private com.bytedance.sdk.openadsdk.emc.ypw.emc sup;

    public emc(@NonNull Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.emc
    public void emc(View view, int i10, vk vkVar) {
        ul ulVar = this.emc;
        if (ulVar != null) {
            ulVar.emc(view, i10, vkVar);
        }
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar) {
        this.sup = emcVar;
    }

    public void emc(ul ulVar) {
        this.emc = ulVar;
        ulVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
