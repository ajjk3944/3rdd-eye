package com.monetization.ads.mediation.base.model;

import java.util.Map;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class MediatedAdObjectInfo {
    private final String adContent;
    private final String adId;
    private final String adUnitId;
    private final Map<String, Object> extraData;

    public static final class Builder {
        private String adContent;
        private String adId;
        private String adUnitId;
        private Map<String, ? extends Object> extraData;

        public final MediatedAdObjectInfo build() {
            return new MediatedAdObjectInfo(this.adContent, this.adUnitId, this.adId, this.extraData, null);
        }

        public final Builder setAdContent(String str) {
            this.adContent = str;
            return this;
        }

        public final Builder setAdId(String str) {
            this.adId = str;
            return this;
        }

        public final Builder setAdUnitId(String str) {
            this.adUnitId = str;
            return this;
        }

        public final Builder setExtraData(Map<String, ? extends Object> map) {
            this.extraData = map;
            return this;
        }
    }

    public /* synthetic */ MediatedAdObjectInfo(String str, String str2, String str3, Map map, g gVar) {
        this(str, str2, str3, map);
    }

    public final String getAdContent() {
        return this.adContent;
    }

    public final String getAdId() {
        return this.adId;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    private MediatedAdObjectInfo(String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.adContent = str;
        this.adUnitId = str2;
        this.adId = str3;
        this.extraData = map;
    }
}
