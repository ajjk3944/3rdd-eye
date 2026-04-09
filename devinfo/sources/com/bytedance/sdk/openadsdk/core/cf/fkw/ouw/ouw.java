package com.bytedance.sdk.openadsdk.core.cf.fkw.ouw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.ugeno.yu.le;
import com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends com.bytedance.adsdk.ugeno.yu.vt.ouw {
    public ouw(lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        lh lhVarVt;
        Map<String, String> map = this.f7011le;
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = this.f7011le.get(FacebookMediationAdapter.KEY_ID);
        if (TextUtils.isEmpty(str) || (lhVarVt = lh.vt(this.f7012lh)) == null) {
            return;
        }
        lh lhVarFkw = lhVarVt.fkw(str);
        if (lhVarFkw instanceof com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw) {
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw ouwVar = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw) lhVarFkw;
            T t10 = ouwVar.fkw;
            if (t10 != 0) {
                ((vt) t10).ouw();
            }
            ouwVar.ouw(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.cf.fkw.ouw.ouw.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ouw.this.lh();
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void vt() {
    }
}
