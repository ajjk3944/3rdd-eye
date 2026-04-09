package com.bytedance.sdk.openadsdk.core.gbl.ypw;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.rie;

/* loaded from: classes.dex */
public class emc extends com.bytedance.adsdk.ugeno.zz.ycc.ypw {
    public emc(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.zz.ycc.ypw
    public void qh(String str) {
        super.qh(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(rie.emc(this.ypw, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.zz.ycc.emc) this.bw).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
