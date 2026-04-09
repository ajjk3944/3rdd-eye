package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.cf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.uym.xq.xq;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.lt;
import com.bytedance.sdk.openadsdk.utils.tp;
import q2.b;
import u2.d;

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
        public Builder appIcon(int i10) {
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

        public Builder debugLog(boolean z10) {
            this.ypw = z10;
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

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
            this.xq = i10;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
            if (i10 == 0 || i10 == 1) {
                this.dg = i10;
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

        public Builder supportMultiProcess(boolean z10) {
            this.ycc = z10;
            return this;
        }

        public Builder titleBarTheme(int i10) {
            this.bw = i10;
            return this;
        }

        public Builder useTextureView(boolean z10) {
            return this;
        }
    }

    public static void debugLog(boolean z10) {
        if (lt.emc() != null) {
            if (z10) {
                lt.emc().xq(1);
                lt.emc().emc();
                return;
            }
            lt.emc().xq(0);
            xq.emc(xq.emc.OFF);
            cf.xq();
            d.d();
            ul.ypw();
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

    public static void setAppIconId(int i10) {
        if (lt.emc() != null) {
            lt.emc().dg(i10);
        }
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        tp.zz("setGdpr");
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        lt.emc().ypw(i10);
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
        if (tp.zz("setPAConsent")) {
            if (i10 == 1 || i10 == 0) {
                lt.emc().bw(i10);
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
    public void xq(int i10) {
        this.bw = i10;
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
    public void emc(boolean z10) {
        this.ypw = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(int i10) {
        this.dg = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.xq = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(boolean z10) {
        this.ycc = z10;
        b.g(z10);
    }
}
