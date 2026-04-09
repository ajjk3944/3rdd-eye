package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.ra.lh.lh;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.pd;
import com.bytedance.sdk.openadsdk.utils.uoy;
import pk.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class PAGConfig implements InitConfig {
    private static String bly;

    /* renamed from: le, reason: collision with root package name */
    private boolean f7818le;
    private String ouw;
    private String pno;
    private String ra;
    private String tlj;
    private boolean vt;

    /* renamed from: lh, reason: collision with root package name */
    private int f7819lh = -1;
    private int yu = -1;
    private int fkw = 0;

    public static void debugLog(boolean z3) {
        if (pd.ouw() != null) {
            if (z3) {
                pd.ouw().lh(1);
                pd.ouw().ouw();
                return;
            }
            pd.ouw().lh(0);
            lh.ouw(lh.ouw.OFF);
            ko.lh();
            a.f32023b = false;
            a.f32024c = 7;
            qbp.vt();
        }
    }

    public static int getGDPRConsent() {
        if (!uoy.ra("getGdpr")) {
            return -1;
        }
        int iVt = pd.ouw().vt();
        if (iVt == 1) {
            return 0;
        }
        if (iVt == 0) {
            return 1;
        }
        return iVt;
    }

    public static int getPAConsent() {
        if (uoy.ra("getPAConsent")) {
            return pd.ouw().fkw();
        }
        return -1;
    }

    public static void setAppIconId(int i4) {
        if (pd.ouw() != null) {
            pd.ouw().yu(i4);
        }
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i4) {
        uoy.ra("setGdpr");
        if (i4 < -1 || i4 > 1) {
            i4 = -1;
        }
        pd.ouw().vt(i4);
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i4) {
        if (uoy.ra("setPAConsent")) {
            if (i4 == 1 || i4 == 0) {
                pd.ouw().fkw(i4);
            } else {
                pd.ouw().fkw(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        bly = str;
    }

    public static void setUserData(String str) {
        if (pd.ouw() != null) {
            pd.ouw().vt(str);
        }
    }

    public static /* synthetic */ void vt(PAGConfig pAGConfig, int i4) {
        if (i4 < -1 || i4 > 1) {
            i4 = -1;
        }
        pAGConfig.f7819lh = i4;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final String getAdxId() {
        return this.tlj;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final String getAppId() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final String getData() {
        return this.pno;
    }

    public final boolean getDebugLog() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final int getGdpr() {
        return this.f7819lh;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final int getPA() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final String getPackageName() {
        return TextUtils.isEmpty(this.ra) ? bly : this.ra;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final int getTitleBarTheme() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final boolean isSupportMultiProcess() {
        return this.f7818le;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final boolean isUseTextureView() {
        return true;
    }

    public static void ouw(PAGConfig pAGConfig, boolean z3) {
        pAGConfig.f7818le = z3;
        v8.a.f35976c = z3;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class Builder {
        private String bly;
        private String ouw;
        private String pno;
        private String[] ra;
        private boolean vt;

        /* renamed from: lh, reason: collision with root package name */
        private int f7821lh = -1;
        private int yu = -1;
        private int fkw = 0;

        /* renamed from: le, reason: collision with root package name */
        private boolean f7820le = false;
        private String tlj = "";

        public Builder appId(String str) {
            this.ouw = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.ouw = this.ouw;
            pAGConfig.fkw = this.fkw;
            PAGConfig.ouw(pAGConfig, this.f7820le);
            PAGConfig.vt(pAGConfig, this.f7821lh);
            pAGConfig.yu = this.yu;
            pAGConfig.vt = this.vt;
            pAGConfig.ra = this.pno;
            pAGConfig.pno = this.bly;
            pAGConfig.tlj = this.tlj;
            return pAGConfig;
        }

        public Builder debugLog(boolean z3) {
            this.vt = z3;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.ra = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.tlj = str;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i4) {
            this.f7821lh = i4;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i4) {
            if (i4 == 0 || i4 == 1) {
                this.yu = i4;
                return this;
            }
            this.yu = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.pno = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.bly = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z3) {
            this.f7820le = z3;
            return this;
        }

        public Builder titleBarTheme(int i4) {
            this.fkw = i4;
            return this;
        }

        @Deprecated
        public Builder appIcon(int i4) {
            return this;
        }

        public Builder useTextureView(boolean z3) {
            return this;
        }
    }
}
