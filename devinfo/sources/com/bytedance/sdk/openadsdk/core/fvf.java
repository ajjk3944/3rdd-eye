package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.ra.lh.lh;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import pk.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fvf implements uq {
    private static final Map<Integer, String> ouw = new HashMap<Integer, String>() { // from class: com.bytedance.sdk.openadsdk.core.fvf.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "screen_scale");
            put(6, "app_set_id_scope");
            put(7, "app_set_id");
            put(8, "installed_source");
            put(9, "app_running_time");
            put(10, "vendor");
            put(11, "model");
            put(12, "user_agent_device");
            put(13, "user_agent_webview");
            put(14, "sys_compiling_time");
            put(15, "sec_did");
            put(16, "url");
            put(17, "X-Argus");
            put(18, "X-Ladon");
            put(19, "X-Khronos");
            put(20, "X-Gorgon");
            put(21, "pangle_m");
            put(22, "screen_height");
            put(23, "screen_width");
            put(24, "rom_version");
            put(25, "carrier_name");
            put(26, "os_version");
            put(27, "conn_type");
            put(28, "boot");
            put(29, "feature_data");
            put(30, "t_ver");
            put(31, "aab");
            put(32, "w_ver");
            put(33, "is_fold");
            put(34, "abi");
            put(35, "is_multi");
        }
    };
    private int vt = 0;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.openadsdk.core.uq
    /* renamed from: fkw, reason: merged with bridge method [inline-methods] */
    public fvf vt(String str) {
        bly.ouw().ouw(str);
        return this;
    }

    private static void le() {
        try {
            com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.fvf.4
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f8751lh = "bidding_token";
                    return ouwVar;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAdManagerImpl", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.openadsdk.core.uq
    /* renamed from: yu, reason: merged with bridge method [inline-methods] */
    public fvf ouw(String str) throws JSONException {
        mwh mwhVar;
        bly blyVarOuw = bly.ouw();
        if (TextUtils.isEmpty(str) && (mwhVar = bly.ouw) != null) {
            mwhVar.ouw("appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", "appid cannot be empty");
        blyVarOuw.vt = str;
        if (!TextUtils.isEmpty(str)) {
            bly.ouw("app_id", str);
            com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(7, false);
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final String lh() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq fkw(int i4) {
        bly.ouw().ra = i4;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq lh(int i4) {
        this.vt = i4;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq ouw(int i4) {
        bly blyVarOuw = bly.ouw();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "title_bar_theme", Integer.valueOf(i4));
        }
        blyVarOuw.fkw = i4;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq vt(int i4) {
        Integer num;
        bly blyVarOuw = bly.ouw();
        if (i4 == 1) {
            i4 = 0;
        } else if (i4 == 0) {
            i4 = 1;
        }
        if ((i4 != 0 && i4 != 1 && i4 != -1) || ((num = blyVarOuw.f8050le) != null && num.intValue() == i4)) {
            return this;
        }
        blyVarOuw.f8050le = Integer.valueOf(i4);
        if (com.bytedance.sdk.openadsdk.utils.bs.le()) {
            jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.2
                final /* synthetic */ Integer ouw;
                final /* synthetic */ int vt;

                public AnonymousClass2(Integer num2, int i42) {
                    num = num2;
                    i = i42;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bly.ouw(num, i);
                }
            });
            return this;
        }
        bly.ouw(num2, i42);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq lh(String str) {
        bly blyVarOuw = bly.ouw();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "adx_id", str);
        }
        blyVarOuw.pno = str;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final int fkw() {
        return bly.ouw().ra;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq ouw() {
        com.bytedance.sdk.component.utils.ko.ouw("PangleSDK-7808");
        a.f32025d = "PangleSDK-7808";
        com.bytedance.sdk.component.utils.qbp.ouw("PangleSDK-7808");
        com.bytedance.sdk.component.utils.ko.vt();
        com.bytedance.sdk.component.ra.lh.lh.ouw(lh.ouw.DEBUG);
        a.f32023b = true;
        a.f32024c = 3;
        com.bytedance.sdk.component.utils.qbp.ouw();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final int vt() {
        return bly.ouw().tlj();
    }

    private static JSONObject vt(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final int yu() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq yu(int i4) {
        bly blyVarOuw = bly.ouw();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_icon_id", "icon_id", Integer.valueOf(i4));
        }
        blyVarOuw.yu = i4;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    @Override // com.bytedance.sdk.openadsdk.core.uq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String ouw(com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest r17) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.fvf.ouw(com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest):java.lang.String");
    }

    private static JSONObject ouw(JSONObject jSONObject, boolean z3) {
        JSONObject jSONObjectOuw;
        if (z3) {
            jSONObjectOuw = PangleEncryptManager.encryptType4(jSONObject, new ex(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            tc.ouw(jSONObjectOuw);
        } else {
            jSONObjectOuw = com.bytedance.sdk.component.utils.ouw.ouw(jSONObject);
        }
        return jSONObjectOuw != null ? jSONObjectOuw : new JSONObject();
    }
}
