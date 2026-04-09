package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
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
    private String f19898a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19899b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19900c;

    /* renamed from: d, reason: collision with root package name */
    private String f19901d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f19902e;

    /* renamed from: f, reason: collision with root package name */
    private PglSSCallBack f19903f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f19904a;

        /* renamed from: b, reason: collision with root package name */
        private int f19905b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f19906c = 0;

        /* renamed from: d, reason: collision with root package name */
        private String f19907d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f19904a)) {
                return null;
            }
            return new PglSSConfig(this.f19904a, this.f19905b, this.f19906c, this.f19907d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f19907d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f19904a = str;
            return this;
        }

        public Builder setCollectMode(int i10) {
            this.f19906c = i10;
            return this;
        }

        public Builder setOVRegionType(int i10) {
            this.f19905b = i10;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f19901d;
    }

    public String getAppId() {
        return this.f19898a;
    }

    public PglSSCallBack getCallBack() {
        return this.f19903f;
    }

    public int getCollectMode() {
        return this.f19900c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f19902e;
    }

    public int getOVRegionType() {
        return this.f19899b;
    }

    public void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f19903f = pglSSCallBack;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f19902e = map;
    }

    private PglSSConfig(String str, int i10, int i11, String str2) {
        this.f19898a = str;
        this.f19899b = i10;
        this.f19900c = i11;
        this.f19901d = str2;
    }
}
