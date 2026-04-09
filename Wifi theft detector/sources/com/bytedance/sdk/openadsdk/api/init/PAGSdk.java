package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.uym.dg;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.common.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.lt;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.msw.emc;
import com.bytedance.sdk.openadsdk.multipro.xq;
import com.bytedance.sdk.openadsdk.utils.iyl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    public interface PAGInitCallback {
        void fail(int i10, String str);

        void success();
    }

    static {
        emc.emc();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && qh.dg() == 0) {
            emc.emc.add(pAGInitCallback);
        }
    }

    public static void closeMultiWebViewFileLock() {
        xq.emc();
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (ycc.emc()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            iyl.bw(new msw("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    aa.ypw(context);
                    biddingTokenCallback.onBiddingTokenCollected(emc.emc(pAGBiddingRequest));
                    com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(false);
                }
            });
        }
    }

    public static String getSDKVersion() {
        return lt.emc() != null ? lt.emc().xq() : "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // java.lang.Runnable
            public void run() {
                emc.emc(context, pAGConfig, pAGInitCallback);
            }
        });
        qh.msw();
    }

    public static boolean isInitSuccess() {
        return qh.dg() == 1;
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        rie.emc(str);
        dg.emc(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && aa.dg().yzg() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.vk.xq.emc().emc(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z10) {
        ycc.emc(z10);
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (ycc.emc()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            iyl.bw(new msw("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                    com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(false);
                }
            });
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (ycc.emc()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            iyl.bw(new msw("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                    com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(false);
                }
            });
        }
    }

    public static String getBiddingToken(Context context) {
        if (ycc.emc()) {
            return null;
        }
        aa.ypw(context);
        return getBiddingToken();
    }

    public static String getBiddingToken(Context context, String str) {
        if (ycc.emc()) {
            return null;
        }
        aa.ypw(context);
        return getBiddingToken(str);
    }

    public static String getBiddingToken(String str) {
        if (ycc.emc()) {
            return null;
        }
        if (aa.emc() == null || lt.emc() == null) {
            return "";
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setSlotId(str);
        return lt.emc().emc(pAGBiddingRequest);
    }

    public static String getBiddingToken() {
        if (ycc.emc()) {
            return null;
        }
        return (aa.emc() == null || lt.emc() == null) ? "" : lt.emc().emc((PAGBiddingRequest) null);
    }
}
