package com.bytedance.sdk.openadsdk.sup.emc;

import com.bytedance.sdk.openadsdk.core.rtt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym extends com.bytedance.sdk.component.emc.dg<JSONObject, JSONObject> {
    private final rtt emc;
    private final String ypw;

    public uym(String str, rtt rttVar) {
        this.emc = rttVar;
        this.ypw = str;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, rtt rttVar) {
        cfVar.emc("appInfo", new uym("appInfo", rttVar));
        cfVar.emc("adInfo", new uym("adInfo", rttVar));
        cfVar.emc("sendLog", new uym("sendLog", rttVar));
        cfVar.emc("playable_style", new uym("playable_style", rttVar));
        cfVar.emc("getTemplateInfo", new uym("getTemplateInfo", rttVar));
        cfVar.emc("getTeMaiAds", new uym("getTeMaiAds", rttVar));
        cfVar.emc("isViewable", new uym("isViewable", rttVar));
        cfVar.emc("getScreenSize", new uym("getScreenSize", rttVar));
        cfVar.emc("getCloseButtonInfo", new uym("getCloseButtonInfo", rttVar));
        cfVar.emc("getVolume", new uym("getVolume", rttVar));
        cfVar.emc("removeLoading", new uym("removeLoading", rttVar));
        cfVar.emc("sendReward", new uym("sendReward", rttVar));
        cfVar.emc("subscribe_app_ad", new uym("subscribe_app_ad", rttVar));
        cfVar.emc("download_app_ad", new uym("download_app_ad", rttVar));
        cfVar.emc("cancel_download_app_ad", new uym("cancel_download_app_ad", rttVar));
        cfVar.emc("unsubscribe_app_ad", new uym("unsubscribe_app_ad", rttVar));
        cfVar.emc("landscape_click", new uym("landscape_click", rttVar));
        cfVar.emc("clickEvent", new uym("clickEvent", rttVar));
        cfVar.emc("renderDidFinish", new uym("renderDidFinish", rttVar));
        cfVar.emc("dynamicTrack", new uym("dynamicTrack", rttVar));
        cfVar.emc("skipVideo", new uym("skipVideo", rttVar));
        cfVar.emc("muteVideo", new uym("muteVideo", rttVar));
        cfVar.emc("changeVideoState", new uym("changeVideoState", rttVar));
        cfVar.emc("getCurrentVideoState", new uym("getCurrentVideoState", rttVar));
        cfVar.emc("send_temai_product_ids", new uym("send_temai_product_ids", rttVar));
        cfVar.emc("getMaterialMeta", new uym("getMaterialMeta", rttVar));
        cfVar.emc("endcard_load", new uym("endcard_load", rttVar));
        cfVar.emc("pauseWebView", new uym("pauseWebView", rttVar));
        cfVar.emc("pauseWebViewTimers", new uym("pauseWebViewTimers", rttVar));
        cfVar.emc("webview_time_track", new uym("webview_time_track", rttVar));
        cfVar.emc("openPrivacy", new uym("openPrivacy", rttVar));
        cfVar.emc("openAdLandPageLinks", new uym("openAdLandPageLinks", rttVar));
        cfVar.emc("getNativeSiteCustomData", new uym("getNativeSiteCustomData", rttVar));
        cfVar.emc("close", new uym("close", rttVar));
    }

    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) {
        rtt.ypw ypwVar = new rtt.ypw();
        ypwVar.emc = "call";
        ypwVar.xq = this.ypw;
        ypwVar.dg = jSONObject;
        return this.emc.emc(ypwVar, 3);
    }
}
