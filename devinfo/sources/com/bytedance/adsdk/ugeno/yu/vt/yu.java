package com.bytedance.adsdk.ugeno.yu.vt;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends ouw {
    public yu(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt;
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVarCf;
        Map<String, String> map = this.f7011le;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f7011le.get("name");
        if (TextUtils.isEmpty(str) || (lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.f7012lh)) == null || (ouwVarCf = lhVarVt.pno(str).cf(str)) == null) {
            return;
        }
        ValueAnimator valueAnimator = ouwVarCf.ouw;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        ouwVarCf.f6914lh = new com.bytedance.adsdk.ugeno.ouw.vt() { // from class: com.bytedance.adsdk.ugeno.yu.vt.yu.1
            @Override // com.bytedance.adsdk.ugeno.ouw.vt
            public final void vt() {
                yu.this.lh();
            }

            @Override // com.bytedance.adsdk.ugeno.ouw.vt
            public final void ouw() {
            }
        };
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void vt() {
    }
}
