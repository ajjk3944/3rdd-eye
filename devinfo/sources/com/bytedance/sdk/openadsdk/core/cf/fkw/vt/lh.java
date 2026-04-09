package com.bytedance.sdk.openadsdk.core.cf.fkw.vt;

import android.content.Context;
import com.bytedance.adsdk.ugeno.yu.cf;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends com.bytedance.adsdk.ugeno.yu.yu.lh {

    /* renamed from: cf, reason: collision with root package name */
    private boolean f8118cf;

    public lh(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        Map<String, String> map = this.fkw;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.f8118cf = false;
        }
        if (this.fkw.containsKey("percent")) {
            float fOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("percent"), -1.0f);
            if (fOuw >= 0.0f && jLongValue >= (fOuw / 100.0f) * jLongValue2 && !this.f8118cf) {
                this.f8118cf = true;
                cf cfVar = this.ouw;
                if (cfVar != null) {
                    cfVar.ouw(this.f7018le, this.f7019lh.vt);
                }
            }
        } else if (jLongValue >= com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("interval"), -1) && !this.f8118cf) {
            this.f8118cf = true;
            cf cfVar2 = this.ouw;
            if (cfVar2 != null) {
                cfVar2.ouw(this.f7018le, this.f7019lh.vt);
            }
        }
        return true;
    }
}
