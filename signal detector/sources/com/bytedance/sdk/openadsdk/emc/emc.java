package com.bytedance.sdk.openadsdk.emc;

import A.f;
import android.text.TextUtils;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.settings.uym;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.sba.dg;
import com.bytedance.sdk.openadsdk.sba.xq;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.Map;

/* loaded from: classes.dex */
public class emc {
    public static boolean emc(PAGLoadListener pAGLoadListener) {
        if (uym.emc()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(TTAdConstant.STYLE_SIZE_RADIO_1_1, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static void emc(final msw mswVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.emc.1
            @Override // java.lang.Runnable
            public void run() {
                if (!qh.bw()) {
                    PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (!zz.ypw().sup()) {
                    xq.emc(new dg() { // from class: com.bytedance.sdk.openadsdk.emc.emc.1.1
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("load_ad");
                            emcVarE.xq(adSlot.getCodeId());
                            emcVarE.dg(tp.xq(adSlot.getDurationSlotType()));
                            emcVarE.emc(BuildConfig.VERSION_NAME);
                            emcVarE.uym(tp.emc(adSlot).toString());
                            return emcVarE;
                        }
                    });
                    iyl.dg(mswVar);
                } else {
                    PAGLoadListener pAGLoadListener3 = pAGLoadListener;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(10004, com.bytedance.sdk.openadsdk.core.msw.emc(10004));
                    }
                }
            }
        };
        if (qh.bw()) {
            runnable.run();
        } else {
            qh.ypw().post(runnable);
        }
    }

    public static void emc(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!qh.bw() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey("creative_id") && extraInfo.get("creative_id") != null) {
            builder.setCreativeId(extraInfo.get("creative_id").toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean emc(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
