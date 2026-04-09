package com.bytedance.sdk.openadsdk.api.init;

import J1.c;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.cf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.uym.xq.xq;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.lt;
import com.bytedance.sdk.openadsdk.utils.tp;

/* loaded from: classes.dex */
public final class PAGConfig implements InitConfig {
    private static String zz;
    private String emc;
    private String msw;
    private String ru;
    private String uym;
    private boolean ycc;
    private boolean ypw;
    private int xq = -1;
    private int dg = -1;
    private int bw = 0;

    public static class Builder {
        private String emc;
        private String msw;
        private String[] uym;
        private boolean ypw;
        private String zz;
        private int xq = -1;
        private int dg = -1;
        private int bw = 0;
        private boolean ycc = false;
        private String ru = "";

        @Deprecated
        public Builder appIcon(int i) {
            return this;
        }

        public Builder appId(String str) {
            this.emc = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.ypw(this.emc);
            pAGConfig.xq(this.bw);
            pAGConfig.ypw(this.ycc);
            pAGConfig.emc(this.xq);
            pAGConfig.ypw(this.dg);
            pAGConfig.emc(this.ypw);
            pAGConfig.xq(this.msw);
            pAGConfig.emc(this.zz);
            pAGConfig.dg(this.ru);
            return pAGConfig;
        }

        public Builder debugLog(boolean z6) {
            this.ypw = z6;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.uym = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.ru = str;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i) {
            this.xq = i;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i) {
            if (i == 0 || i == 1) {
                this.dg = i;
                return this;
            }
            this.dg = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.msw = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.zz = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z6) {
            this.ycc = z6;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.bw = i;
            return this;
        }

        public Builder useTextureView(boolean z6) {
            return this;
        }
    }

    public static void debugLog(boolean z6) {
        if (lt.emc() != null) {
            if (z6) {
                lt.emc().xq(1);
                lt.emc().emc();
            } else {
                lt.emc().xq(0);
                xq.emc(xq.emc.OFF);
                cf.xq();
                ul.ypw();
            }
        }
    }

    public static int getGDPRConsent() {
        if (!tp.zz("getGdpr")) {
            return -1;
        }
        int iYpw = lt.emc().ypw();
        if (iYpw == 1) {
            return 0;
        }
        if (iYpw == 0) {
            return 1;
        }
        return iYpw;
    }

    public static int getPAConsent() {
        if (tp.zz("getPAConsent")) {
            return lt.emc().bw();
        }
        return -1;
    }

    public static void setAppIconId(int i) {
        if (lt.emc() != null) {
            lt.emc().dg(i);
        }
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i) {
        tp.zz("setGdpr");
        if (i < -1 || i > 1) {
            i = -1;
        }
        lt.emc().ypw(i);
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i) {
        if (tp.zz("setPAConsent")) {
            if (i == 1 || i == 0) {
                lt.emc().bw(i);
            } else {
                lt.emc().bw(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        zz = str;
    }

    public static void setUserData(String str) {
        if (lt.emc() != null) {
            lt.emc().ypw(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.ru;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.msw;
    }

    public boolean getDebugLog() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.uym) ? zz : this.uym;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.bw;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.ycc;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg(String str) {
        this.ru = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(int i) {
        this.bw = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(String str) {
        this.msw = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(String str) {
        this.uym = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(String str) {
        this.emc = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(boolean z6) {
        this.ypw = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(int i) {
        this.dg = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.xq = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(boolean z6) {
        this.ycc = z6;
        c.f2038c = z6;
    }
}
