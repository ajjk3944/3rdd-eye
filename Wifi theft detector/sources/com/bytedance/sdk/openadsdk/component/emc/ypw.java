package com.bytedance.sdk.openadsdk.component.emc;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.core.zz.msw;
import com.bytedance.sdk.openadsdk.core.zz.zz;
import com.bytedance.sdk.openadsdk.ul.emc.emc.dg;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ypw {
    public static emc emc(rie rieVar, Activity activity, com.bytedance.sdk.openadsdk.component.msw.emc emcVar) {
        emc emcVar2 = new emc(activity.getApplicationContext(), rieVar, "open_ad", 4, emcVar);
        emcVar2.emc(activity.findViewById(R.id.content));
        emc(activity.getApplicationContext(), rieVar, emcVar2);
        emc(emcVar2, rieVar);
        return emcVar2;
    }

    public static msw ypw(rie rieVar, Activity activity, final com.bytedance.sdk.openadsdk.component.msw.emc emcVar, com.bytedance.sdk.openadsdk.component.zz.ypw ypwVar) {
        msw mswVar = new msw(activity.getApplicationContext(), rieVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.emc.ypw.2
            @Override // com.bytedance.sdk.openadsdk.core.xq.emc, com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
            public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(emcVar.xq()));
                emc(map);
                super.emc(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        mswVar.emc((View) ypwVar);
        emc(activity.getApplicationContext(), rieVar, mswVar);
        emc(mswVar, rieVar);
        return mswVar;
    }

    public static zz emc(rie rieVar, Activity activity, final com.bytedance.sdk.openadsdk.component.msw.emc emcVar, com.bytedance.sdk.openadsdk.component.zz.ypw ypwVar) {
        zz zzVar = new zz(activity, rieVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.emc.ypw.1
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
            public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(emcVar.xq()));
                emc(map);
                super.emc(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        zzVar.emc(ypwVar);
        emc(activity.getApplicationContext(), rieVar, zzVar);
        emc(zzVar, rieVar);
        return zzVar;
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar, rie rieVar) {
        HashMap map = new HashMap();
        map.put("click_area", Integer.valueOf(rieVar.ndl()));
        map.put("openad_creative_type", rie.bw(rieVar) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(dr.xq(rieVar) ? 3 : 1));
        ypwVar.emc(map);
    }

    private static void emc(Context context, rie rieVar, com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar) {
        if (rieVar == null || rieVar.sx() != 4) {
            return;
        }
        ypwVar.emc(dg.emc(context, "open_ad"));
    }
}
