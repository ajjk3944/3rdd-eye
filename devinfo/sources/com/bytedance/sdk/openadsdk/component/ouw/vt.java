package com.bytedance.sdk.openadsdk.component.ouw;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static void ouw(com.bytedance.sdk.openadsdk.core.lh.vt vtVar, vpp vppVar) {
        HashMap map = new HashMap();
        map.put("click_area", Integer.valueOf(vppVar.mwh()));
        map.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(od.lh(vppVar) ? 3 : 1));
        vtVar.ouw(map);
    }

    public static void ouw(Context context, vpp vppVar, com.bytedance.sdk.openadsdk.core.lh.vt vtVar) {
        if (vppVar == null || vppVar.f8305pd != 4) {
            return;
        }
        vtVar.ouw(yu.ouw(context, "open_ad"));
    }
}
