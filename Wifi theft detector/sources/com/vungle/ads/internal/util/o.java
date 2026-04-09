package com.vungle.ads.internal.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class o {

    @Nullable
    private String adSource;

    @Nullable
    private Boolean adoEnabled;

    @Nullable
    private String creativeId;

    @Nullable
    private String eventId;

    @Nullable
    private String mediationName;

    @Nullable
    private Boolean partialDownloadEnabled;

    @Nullable
    private String placementRefId;

    @Nullable
    private String vmVersion;

    private final int hashCode(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.p.a(o.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        o oVar = (o) obj;
        return kotlin.jvm.internal.p.a(this.placementRefId, oVar.placementRefId) && kotlin.jvm.internal.p.a(this.creativeId, oVar.creativeId) && kotlin.jvm.internal.p.a(this.eventId, oVar.eventId) && kotlin.jvm.internal.p.a(this.adSource, oVar.adSource) && kotlin.jvm.internal.p.a(this.mediationName, oVar.mediationName) && kotlin.jvm.internal.p.a(this.vmVersion, oVar.vmVersion) && kotlin.jvm.internal.p.a(this.partialDownloadEnabled, oVar.partialDownloadEnabled) && kotlin.jvm.internal.p.a(this.adoEnabled, oVar.adoEnabled);
    }

    @Nullable
    public final String getAdSource$vungle_ads_release() {
        return this.adSource;
    }

    @Nullable
    public final Boolean getAdoEnabled$vungle_ads_release() {
        return this.adoEnabled;
    }

    @Nullable
    public final String getCreativeId$vungle_ads_release() {
        return this.creativeId;
    }

    @Nullable
    public final String getEventId$vungle_ads_release() {
        return this.eventId;
    }

    @Nullable
    public final String getMediationName$vungle_ads_release() {
        return this.mediationName;
    }

    @Nullable
    public final Boolean getPartialDownloadEnabled$vungle_ads_release() {
        return this.partialDownloadEnabled;
    }

    @Nullable
    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @Nullable
    public final String getVmVersion$vungle_ads_release() {
        return this.vmVersion;
    }

    public final void setAdSource$vungle_ads_release(@Nullable String str) {
        this.adSource = str;
    }

    public final void setAdoEnabled$vungle_ads_release(@Nullable Boolean bool) {
        this.adoEnabled = bool;
    }

    public final void setCreativeId$vungle_ads_release(@Nullable String str) {
        this.creativeId = str;
    }

    public final void setEventId$vungle_ads_release(@Nullable String str) {
        this.eventId = str;
    }

    public final void setMediationName$vungle_ads_release(@Nullable String str) {
        this.mediationName = str;
    }

    public final void setPartialDownloadEnabled$vungle_ads_release(@Nullable Boolean bool) {
        this.partialDownloadEnabled = bool;
    }

    public final void setPlacementRefId$vungle_ads_release(@Nullable String str) {
        this.placementRefId = str;
    }

    public final void setVmVersion$vungle_ads_release(@Nullable String str) {
        this.vmVersion = str;
    }

    @NotNull
    public String toString() {
        return "LogEntry(placementRefId=" + this.placementRefId + ", creativeId=" + this.creativeId + ", eventId=" + this.eventId + ", adSource=" + this.adSource + ", mediationName=" + this.mediationName + ", vmVersion=" + this.vmVersion + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", adoEnabled=" + this.adoEnabled + ')';
    }

    public int hashCode() {
        int iHashCode = ((((((((((hashCode(this.placementRefId) * 31) + hashCode(this.creativeId)) * 31) + hashCode(this.eventId)) * 31) + hashCode(this.adSource)) * 31) + hashCode(this.mediationName)) * 31) + hashCode(this.vmVersion)) * 31;
        Boolean bool = this.partialDownloadEnabled;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.adoEnabled;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
