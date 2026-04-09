package com.bytedance.sdk.openadsdk.core.cf.vt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends com.bytedance.adsdk.ugeno.bly.le.vt {
    public ouw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt
    public final void ryl(String str) {
        super.ryl(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(vpp.ouw(this.vt, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
