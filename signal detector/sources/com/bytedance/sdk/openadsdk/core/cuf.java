package com.bytedance.sdk.openadsdk.core;

import A.f;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cuf implements xmt {
    private static final Map<Integer, String> emc = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.cuf.1
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
    private int ypw = 0;

    public static void msw() {
        try {
            com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.cuf.4
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    return f.e("bidding_token");
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAdManagerImpl", th.getMessage());
        }
    }

    public static void uym() {
        try {
            com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.cuf.3
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    return f.e("bidding_token");
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAdManagerImpl", th.getMessage());
        }
    }

    public static void ycc() {
        try {
            com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.cuf.2
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    return f.e("bidding_token");
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAdManagerImpl", th.getMessage());
        }
    }

    private boolean zz() {
        return "TX".equals(com.bytedance.sdk.openadsdk.core.settings.gbl.xq().pxa()) || TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.gbl.xq().pxa());
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    /* renamed from: bw, reason: merged with bridge method [inline-methods] */
    public cuf ypw(String str) {
        zz.ypw().xq(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public cuf emc(String str) throws JSONException {
        zz.ypw().emc(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public String xq() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public xmt bw(int i) {
        zz.ypw().bw(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public int dg() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public xmt emc(int i) {
        zz.ypw().ycc(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public xmt xq(int i) {
        this.ypw = i;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public xmt ypw(int i) {
        zz.ypw().dg(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public int bw() {
        return zz.ypw().gbl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public xmt dg(int i) {
        zz.ypw().xq(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public xmt emc() {
        com.bytedance.sdk.component.utils.cf.emc("PangleSDK-7852");
        com.bytedance.sdk.component.utils.ul.emc("PangleSDK-7852");
        com.bytedance.sdk.component.utils.cf.ypw();
        com.bytedance.sdk.component.uym.emc.emc();
        com.bytedance.sdk.component.utils.ul.emc();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public xmt xq(String str) {
        zz.ypw().msw(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmt
    public int ypw() {
        return zz.ypw().ru();
    }

    private JSONObject ypw(PAGBiddingRequest pAGBiddingRequest) {
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.aa.dg().sf(r4) == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x02a8, TryCatch #0 {all -> 0x02a8, blocks: (B:3:0x0008, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:11:0x002f, B:18:0x004a, B:20:0x004e, B:22:0x0058, B:24:0x005c, B:27:0x007e, B:28:0x0092, B:30:0x00ad, B:34:0x00cc, B:33:0x00bb, B:35:0x00d3, B:37:0x00eb, B:41:0x0102, B:43:0x011f, B:45:0x012c, B:46:0x0135, B:48:0x0205, B:49:0x0215, B:52:0x0231, B:54:0x023c, B:55:0x024e, B:57:0x025f, B:59:0x026c, B:60:0x0282, B:62:0x0288, B:63:0x028b, B:65:0x0291, B:66:0x029d, B:38:0x00f1, B:40:0x00fd, B:14:0x003a, B:16:0x0040), top: B:70:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: all -> 0x02a8, TryCatch #0 {all -> 0x02a8, blocks: (B:3:0x0008, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:11:0x002f, B:18:0x004a, B:20:0x004e, B:22:0x0058, B:24:0x005c, B:27:0x007e, B:28:0x0092, B:30:0x00ad, B:34:0x00cc, B:33:0x00bb, B:35:0x00d3, B:37:0x00eb, B:41:0x0102, B:43:0x011f, B:45:0x012c, B:46:0x0135, B:48:0x0205, B:49:0x0215, B:52:0x0231, B:54:0x023c, B:55:0x024e, B:57:0x025f, B:59:0x026c, B:60:0x0282, B:62:0x0288, B:63:0x028b, B:65:0x0291, B:66:0x029d, B:38:0x00f1, B:40:0x00fd, B:14:0x003a, B:16:0x0040), top: B:70:0x0008 }] */
    @Override // com.bytedance.sdk.openadsdk.core.xmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String emc(com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest r15) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cuf.emc(com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest):java.lang.String");
    }

    private JSONObject emc(JSONObject jSONObject, boolean z6) {
        JSONObject jSONObjectEmc;
        if (z6) {
            jSONObjectEmc = PangleEncryptManager.encryptType4(jSONObject, new hxp(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            ee.emc(jSONObjectEmc);
        } else {
            jSONObjectEmc = com.bytedance.sdk.component.utils.emc.emc(jSONObject);
        }
        return jSONObjectEmc != null ? jSONObjectEmc : new JSONObject();
    }
}
