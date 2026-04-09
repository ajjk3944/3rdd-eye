package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TARGET_IDC = "target-idc";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f19639a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19640b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19641c;

    /* renamed from: d, reason: collision with root package name */
    private String f19642d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f19643e;

    /* renamed from: f, reason: collision with root package name */
    private PglSSCallBack f19644f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f19645a;

        /* renamed from: b, reason: collision with root package name */
        private int f19646b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f19647c = 0;

        /* renamed from: d, reason: collision with root package name */
        private String f19648d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f19645a)) {
                return null;
            }
            return new PglSSConfig(this.f19645a, this.f19646b, this.f19647c, this.f19648d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f19648d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f19645a = str;
            return this;
        }

        public Builder setCollectMode(int i) {
            this.f19647c = i;
            return this;
        }

        public Builder setOVRegionType(int i) {
            this.f19646b = i;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f19642d;
    }

    public String getAppId() {
        return this.f19639a;
    }

    public PglSSCallBack getCallBack() {
        return this.f19644f;
    }

    public int getCollectMode() {
        return this.f19641c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f19643e;
    }

    public int getOVRegionType() {
        return this.f19640b;
    }

    public void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f19644f = pglSSCallBack;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f19643e = map;
    }

    private PglSSConfig(String str, int i, int i3, String str2) {
        this.f19639a = str;
        this.f19640b = i;
        this.f19641c = i3;
        this.f19642d = str2;
    }
}
