package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends lh {
    public ra(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[0]), 0);
            Map<String, String> map = this.fkw;
            if (map == null || map.isEmpty() || iOuw == com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("type"), 0)) {
                this.ouw.ouw(this.f7018le, this.f7019lh.vt);
            }
        }
        return false;
    }
}
