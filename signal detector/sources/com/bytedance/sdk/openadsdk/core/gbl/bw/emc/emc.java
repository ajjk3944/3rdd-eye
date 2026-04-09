package com.bytedance.sdk.openadsdk.core.gbl.bw.emc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dg.ycc;
import com.bytedance.adsdk.ugeno.ypw.xq;
import java.util.Map;

/* loaded from: classes.dex */
public class emc extends com.bytedance.adsdk.ugeno.dg.ypw.emc {
    public emc(xq xqVar, String str, ycc.emc emcVar) {
        super(xqVar, str, emcVar);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.ypw.emc
    public void emc() {
        xq xqVar;
        xq xqVarYpw;
        Map<String, String> map = this.ycc;
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = this.ycc.get("id");
        if (TextUtils.isEmpty(str) || (xqVarYpw = (xqVar = this.xq).ypw(xqVar)) == null) {
            return;
        }
        xq xqVarBw = xqVarYpw.bw(str);
        if (xqVarBw instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw.emc) {
            com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw.emc emcVar = (com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw.emc) xqVarBw;
            emcVar.dg();
            emcVar.emc(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.gbl.bw.emc.emc.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    emc.this.xq();
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.dg.ypw.emc
    public void ypw() {
    }
}
