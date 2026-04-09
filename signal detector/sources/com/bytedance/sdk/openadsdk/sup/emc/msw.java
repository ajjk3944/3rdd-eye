package com.bytedance.sdk.openadsdk.sup.emc;

import com.bytedance.sdk.openadsdk.core.rtt;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw extends com.bytedance.sdk.component.emc.sba<JSONObject, JSONObject> {
    public static final HashSet<String> emc = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", "isViewable", "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", "muteVideo", "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));
    private final rtt ypw;

    public msw(rtt rttVar) {
        this.ypw = rttVar;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, rtt rttVar) {
        cfVar.emc(emc, new msw(rttVar));
    }

    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) {
        rtt.ypw ypwVar = new rtt.ypw();
        ypwVar.emc = "call";
        ypwVar.xq = str;
        ypwVar.dg = jSONObject;
        return this.ypw.emc(ypwVar, 3);
    }
}
