package com.monetization.ads.quality.base.model.configuration;

import com.google.android.gms.measurement.internal.a;
import com.yandex.mobile.ads.impl.C4121h3;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class AdQualityVerificationAdConfiguration {
    private final String adContent;
    private final String adNetworkCreativeId;
    private final String adNetworkUnitId;
    private final Object adObject;
    private final AdQualityVerifierAdType adType;
    private final String adUnitId;
    private final Map<String, Object> extraData;
    private final String mediationId;
    private final AdQualityVerifiableNetwork verifiableAdNetwork;

    public AdQualityVerificationAdConfiguration(AdQualityVerifiableNetwork verifiableAdNetwork, String adUnitId, Object adObject, AdQualityVerifierAdType adType, String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        l.f(verifiableAdNetwork, "verifiableAdNetwork");
        l.f(adUnitId, "adUnitId");
        l.f(adObject, "adObject");
        l.f(adType, "adType");
        this.verifiableAdNetwork = verifiableAdNetwork;
        this.adUnitId = adUnitId;
        this.adObject = adObject;
        this.adType = adType;
        this.adContent = str;
        this.adNetworkUnitId = str2;
        this.mediationId = str3;
        this.adNetworkCreativeId = str4;
        this.extraData = map;
    }

    public static /* synthetic */ AdQualityVerificationAdConfiguration copy$default(AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            adQualityVerifiableNetwork = adQualityVerificationAdConfiguration.verifiableAdNetwork;
        }
        if ((i & 2) != 0) {
            str = adQualityVerificationAdConfiguration.adUnitId;
        }
        if ((i & 4) != 0) {
            obj = adQualityVerificationAdConfiguration.adObject;
        }
        if ((i & 8) != 0) {
            adQualityVerifierAdType = adQualityVerificationAdConfiguration.adType;
        }
        if ((i & 16) != 0) {
            str2 = adQualityVerificationAdConfiguration.adContent;
        }
        if ((i & 32) != 0) {
            str3 = adQualityVerificationAdConfiguration.adNetworkUnitId;
        }
        if ((i & 64) != 0) {
            str4 = adQualityVerificationAdConfiguration.mediationId;
        }
        if ((i & 128) != 0) {
            str5 = adQualityVerificationAdConfiguration.adNetworkCreativeId;
        }
        if ((i & 256) != 0) {
            map = adQualityVerificationAdConfiguration.extraData;
        }
        String str6 = str5;
        Map map2 = map;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        Object obj3 = obj;
        return adQualityVerificationAdConfiguration.copy(adQualityVerifiableNetwork, str, obj3, adQualityVerifierAdType, str9, str7, str8, str6, map2);
    }

    public final AdQualityVerifiableNetwork component1() {
        return this.verifiableAdNetwork;
    }

    public final String component2() {
        return this.adUnitId;
    }

    public final Object component3() {
        return this.adObject;
    }

    public final AdQualityVerifierAdType component4() {
        return this.adType;
    }

    public final String component5() {
        return this.adContent;
    }

    public final String component6() {
        return this.adNetworkUnitId;
    }

    public final String component7() {
        return this.mediationId;
    }

    public final String component8() {
        return this.adNetworkCreativeId;
    }

    public final Map<String, Object> component9() {
        return this.extraData;
    }

    public final AdQualityVerificationAdConfiguration copy(AdQualityVerifiableNetwork verifiableAdNetwork, String adUnitId, Object adObject, AdQualityVerifierAdType adType, String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        l.f(verifiableAdNetwork, "verifiableAdNetwork");
        l.f(adUnitId, "adUnitId");
        l.f(adObject, "adObject");
        l.f(adType, "adType");
        return new AdQualityVerificationAdConfiguration(verifiableAdNetwork, adUnitId, adObject, adType, str, str2, str3, str4, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerificationAdConfiguration)) {
            return false;
        }
        AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = (AdQualityVerificationAdConfiguration) obj;
        return this.verifiableAdNetwork == adQualityVerificationAdConfiguration.verifiableAdNetwork && l.b(this.adUnitId, adQualityVerificationAdConfiguration.adUnitId) && l.b(this.adObject, adQualityVerificationAdConfiguration.adObject) && this.adType == adQualityVerificationAdConfiguration.adType && l.b(this.adContent, adQualityVerificationAdConfiguration.adContent) && l.b(this.adNetworkUnitId, adQualityVerificationAdConfiguration.adNetworkUnitId) && l.b(this.mediationId, adQualityVerificationAdConfiguration.mediationId) && l.b(this.adNetworkCreativeId, adQualityVerificationAdConfiguration.adNetworkCreativeId) && l.b(this.extraData, adQualityVerificationAdConfiguration.extraData);
    }

    public final String getAdContent() {
        return this.adContent;
    }

    public final String getAdNetworkCreativeId() {
        return this.adNetworkCreativeId;
    }

    public final String getAdNetworkUnitId() {
        return this.adNetworkUnitId;
    }

    public final Object getAdObject() {
        return this.adObject;
    }

    public final AdQualityVerifierAdType getAdType() {
        return this.adType;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getMediationId() {
        return this.mediationId;
    }

    public final AdQualityVerifiableNetwork getVerifiableAdNetwork() {
        return this.verifiableAdNetwork;
    }

    public int hashCode() {
        int iHashCode = (this.adType.hashCode() + ((this.adObject.hashCode() + C4121h3.a(this.adUnitId, this.verifiableAdNetwork.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.adContent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adNetworkUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediationId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adNetworkCreativeId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.extraData;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        AdQualityVerifiableNetwork adQualityVerifiableNetwork = this.verifiableAdNetwork;
        String str = this.adUnitId;
        Object obj = this.adObject;
        AdQualityVerifierAdType adQualityVerifierAdType = this.adType;
        String str2 = this.adContent;
        String str3 = this.adNetworkUnitId;
        String str4 = this.mediationId;
        String str5 = this.adNetworkCreativeId;
        Map<String, Object> map = this.extraData;
        StringBuilder sb = new StringBuilder("AdQualityVerificationAdConfiguration(verifiableAdNetwork=");
        sb.append(adQualityVerifiableNetwork);
        sb.append(", adUnitId=");
        sb.append(str);
        sb.append(", adObject=");
        sb.append(obj);
        sb.append(", adType=");
        sb.append(adQualityVerifierAdType);
        sb.append(", adContent=");
        a.l(sb, str2, ", adNetworkUnitId=", str3, ", mediationId=");
        a.l(sb, str4, ", adNetworkCreativeId=", str5, ", extraData=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ AdQualityVerificationAdConfiguration(AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i, g gVar) {
        this(adQualityVerifiableNetwork, str, obj, adQualityVerifierAdType, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : map);
    }
}
