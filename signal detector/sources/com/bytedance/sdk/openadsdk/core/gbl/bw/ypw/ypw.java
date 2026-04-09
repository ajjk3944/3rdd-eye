package com.bytedance.sdk.openadsdk.core.gbl.bw.ypw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.adsdk.ugeno.dg.dg.xq {
    private String gbl;

    public ypw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        com.bytedance.adsdk.ugeno.ypw.xq xqVar;
        com.bytedance.adsdk.ugeno.ypw.xq xqVarYpw;
        Map<String, String> map = this.bw;
        if (map != null && map.size() > 0) {
            String str = this.bw.get("id");
            this.gbl = this.bw.get("state");
            if (TextUtils.isEmpty(str) || (xqVarYpw = (xqVar = this.ypw).ypw(xqVar)) == null) {
                return false;
            }
            com.bytedance.adsdk.ugeno.ypw.xq xqVarBw = xqVarYpw.bw(str);
            if (xqVarBw instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw.emc) {
                ((com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw.emc) xqVarBw).emc(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.gbl.bw.ypw.ypw.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (!TextUtils.equals(ypw.this.gbl, "complete") || ((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).emc == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).emc.emc(((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).ypw, ((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).ycc, ((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).xq.ypw());
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        if (!TextUtils.equals(ypw.this.gbl, "start") || ((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).emc == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).emc.emc(((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).ypw, ((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).ycc, ((com.bytedance.adsdk.ugeno.dg.dg.xq) ypw.this).xq.ypw());
                    }
                });
            }
        }
        return false;
    }
}
