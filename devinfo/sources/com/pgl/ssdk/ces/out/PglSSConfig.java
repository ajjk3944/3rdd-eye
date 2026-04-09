package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
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
    private String f21510a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21511b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21512c;

    /* renamed from: d, reason: collision with root package name */
    private String f21513d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f21514e;

    /* renamed from: f, reason: collision with root package name */
    private PglSSCallBack f21515f;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f21516a;

        /* renamed from: b, reason: collision with root package name */
        private int f21517b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f21518c = 0;

        /* renamed from: d, reason: collision with root package name */
        private String f21519d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f21516a)) {
                return null;
            }
            return new PglSSConfig(this.f21516a, this.f21517b, this.f21518c, this.f21519d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f21519d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f21516a = str;
            return this;
        }

        public Builder setCollectMode(int i4) {
            this.f21518c = i4;
            return this;
        }

        public Builder setOVRegionType(int i4) {
            this.f21517b = i4;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public final String getAdSdkVersion() {
        return this.f21513d;
    }

    public final String getAppId() {
        return this.f21510a;
    }

    public final PglSSCallBack getCallBack() {
        return this.f21515f;
    }

    public final int getCollectMode() {
        return this.f21512c;
    }

    public final Map<String, Object> getCustomInfo() {
        return this.f21514e;
    }

    public final int getOVRegionType() {
        return this.f21511b;
    }

    public final void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f21515f = pglSSCallBack;
    }

    public final void setCustomInfo(Map<String, Object> map) {
        this.f21514e = map;
    }

    private PglSSConfig(String str, int i4, int i10, String str2) {
        this.f21510a = str;
        this.f21511b = i4;
        this.f21512c = i10;
        this.f21513d = str2;
    }
}
