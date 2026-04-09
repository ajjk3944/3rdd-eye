package com.bytedance.sdk.openadsdk.core.cf.fkw.vt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.cf;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends com.bytedance.adsdk.ugeno.yu.yu.lh {

    /* renamed from: cf, reason: collision with root package name */
    String f8119cf;

    public ouw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt;
        Map<String, String> map = this.fkw;
        if (map != null && map.size() > 0) {
            String str = this.fkw.get(FacebookMediationAdapter.KEY_ID);
            this.f8119cf = this.fkw.get("state");
            if (TextUtils.isEmpty(str) || (lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.vt)) == null) {
                return false;
            }
            com.bytedance.adsdk.ugeno.vt.lh lhVarFkw = lhVarVt.fkw(str);
            if (lhVarFkw instanceof com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw) {
                ((com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw) lhVarFkw).ouw(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.cf.fkw.vt.ouw.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        ouw ouwVar;
                        cf cfVar;
                        super.onAnimationEnd(animator);
                        if (!TextUtils.equals(ouw.this.f8119cf, "complete") || (cfVar = (ouwVar = ouw.this).ouw) == null) {
                            return;
                        }
                        cfVar.ouw(ouwVar.f7018le, ouwVar.f7019lh.vt);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        ouw ouwVar;
                        cf cfVar;
                        super.onAnimationStart(animator);
                        if (!TextUtils.equals(ouw.this.f8119cf, "start") || (cfVar = (ouwVar = ouw.this).ouw) == null) {
                            return;
                        }
                        cfVar.ouw(ouwVar.f7018le, ouwVar.f7019lh.vt);
                    }
                });
            }
        }
        return false;
    }
}
