package com.bytedance.sdk.openadsdk.core.cf.le;

import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.yu.cf;
import com.bytedance.adsdk.ugeno.yu.mwh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements mwh {
    @Override // com.bytedance.adsdk.ugeno.yu.mwh
    public final boolean ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, MotionEvent motionEvent, cf cfVar, com.bytedance.adsdk.ugeno.yu.yu.lh lhVar2) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            T t10 = lhVar.fkw;
            if (x10 >= 0.0f && x10 < t10.getWidth() && y10 >= 0.0f && y10 < t10.getHeight() && cfVar != null) {
                cfVar.ouw(lhVar2.f7018le, lhVar2.f7019lh.vt);
            }
        }
        return true;
    }
}
