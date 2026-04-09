package com.bytedance.sdk.openadsdk.core.cf.vt.lh;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.yu.cf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends com.bytedance.adsdk.ugeno.yu.yu.lh {

    /* renamed from: cf, reason: collision with root package name */
    private float f8164cf;

    public vt(Context context) {
        super(context);
        this.f8164cf = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[1]), 0.0f) <= 0.0f) {
                cf cfVar = this.ouw;
                if (cfVar != null) {
                    cfVar.ouw(this.f7018le, this.f7019lh.vt);
                }
                return true;
            }
            this.f8164cf = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("rate"), 100);
            float fOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + fOuw + " mTargetProgress=" + this.f8164cf);
            if (fOuw >= this.f8164cf) {
                cf cfVar2 = this.ouw;
                if (cfVar2 != null) {
                    cfVar2.ouw(this.f7018le, this.f7019lh.vt);
                }
                return true;
            }
        }
        return false;
    }
}
