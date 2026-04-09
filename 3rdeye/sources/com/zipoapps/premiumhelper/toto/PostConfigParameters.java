package com.zipoapps.premiumhelper.toto;

import B4.g;
import c9.C2077A;
import c9.C2078B;
import com.singular.sdk.internal.Constants;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;

/* compiled from: PostConfigParameters.kt */
/* loaded from: classes3.dex */
public final class PostConfigParameters {
    private final String country;
    private final String deviceModel;
    private final long installTimestamp;
    private final String lang;
    private final String os;
    private final String osVersion;
    private final String userId;
    private final String versionName;

    public PostConfigParameters(long j4, String versionName, String userId, String country, String deviceModel, String os, String osVersion, String lang) {
        l.f(versionName, "versionName");
        l.f(userId, "userId");
        l.f(country, "country");
        l.f(deviceModel, "deviceModel");
        l.f(os, "os");
        l.f(osVersion, "osVersion");
        l.f(lang, "lang");
        this.installTimestamp = j4;
        this.versionName = versionName;
        this.userId = userId;
        this.country = country;
        this.deviceModel = deviceModel;
        this.os = os;
        this.osVersion = osVersion;
        this.lang = lang;
    }

    public static /* synthetic */ PostConfigParameters copy$default(PostConfigParameters postConfigParameters, long j4, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            j4 = postConfigParameters.installTimestamp;
        }
        long j10 = j4;
        if ((i & 2) != 0) {
            str = postConfigParameters.versionName;
        }
        String str8 = str;
        if ((i & 4) != 0) {
            str2 = postConfigParameters.userId;
        }
        String str9 = str2;
        if ((i & 8) != 0) {
            str3 = postConfigParameters.country;
        }
        return postConfigParameters.copy(j10, str8, str9, str3, (i & 16) != 0 ? postConfigParameters.deviceModel : str4, (i & 32) != 0 ? postConfigParameters.os : str5, (i & 64) != 0 ? postConfigParameters.osVersion : str6, (i & 128) != 0 ? postConfigParameters.lang : str7);
    }

    public final Map<String, String> asMap() {
        Map mapO = C2078B.o(new b9.l("installTimestamp", String.valueOf(this.installTimestamp)), new b9.l("version", this.versionName), new b9.l("userId", this.userId), new b9.l("country", this.country), new b9.l("deviceModel", this.deviceModel), new b9.l("os", this.os), new b9.l("osVersion", this.osVersion), new b9.l("lang", this.lang));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapO.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2077A.l(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), URLEncoder.encode((String) entry2.getValue(), Constants.ENCODING));
        }
        return linkedHashMap2;
    }

    public final long component1() {
        return this.installTimestamp;
    }

    public final String component2() {
        return this.versionName;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.country;
    }

    public final String component5() {
        return this.deviceModel;
    }

    public final String component6() {
        return this.os;
    }

    public final String component7() {
        return this.osVersion;
    }

    public final String component8() {
        return this.lang;
    }

    public final PostConfigParameters copy(long j4, String versionName, String userId, String country, String deviceModel, String os, String osVersion, String lang) {
        l.f(versionName, "versionName");
        l.f(userId, "userId");
        l.f(country, "country");
        l.f(deviceModel, "deviceModel");
        l.f(os, "os");
        l.f(osVersion, "osVersion");
        l.f(lang, "lang");
        return new PostConfigParameters(j4, versionName, userId, country, deviceModel, os, osVersion, lang);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostConfigParameters)) {
            return false;
        }
        PostConfigParameters postConfigParameters = (PostConfigParameters) obj;
        return this.installTimestamp == postConfigParameters.installTimestamp && l.b(this.versionName, postConfigParameters.versionName) && l.b(this.userId, postConfigParameters.userId) && l.b(this.country, postConfigParameters.country) && l.b(this.deviceModel, postConfigParameters.deviceModel) && l.b(this.os, postConfigParameters.os) && l.b(this.osVersion, postConfigParameters.osVersion) && l.b(this.lang, postConfigParameters.lang);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final long getInstallTimestamp() {
        return this.installTimestamp;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        long j4 = this.installTimestamp;
        return this.lang.hashCode() + g.n(g.n(g.n(g.n(g.n(g.n(((int) (j4 ^ (j4 >>> 32))) * 31, 31, this.versionName), 31, this.userId), 31, this.country), 31, this.deviceModel), 31, this.os), 31, this.osVersion);
    }

    public String toString() {
        long j4 = this.installTimestamp;
        String str = this.versionName;
        String str2 = this.userId;
        String str3 = this.country;
        String str4 = this.deviceModel;
        String str5 = this.os;
        String str6 = this.osVersion;
        String str7 = this.lang;
        StringBuilder sb = new StringBuilder("PostConfigParameters(installTimestamp=");
        sb.append(j4);
        sb.append(", versionName=");
        sb.append(str);
        com.google.android.gms.measurement.internal.a.l(sb, ", userId=", str2, ", country=", str3);
        com.google.android.gms.measurement.internal.a.l(sb, ", deviceModel=", str4, ", os=", str5);
        com.google.android.gms.measurement.internal.a.l(sb, ", osVersion=", str6, ", lang=", str7);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ PostConfigParameters(long j4, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, kotlin.jvm.internal.g gVar) {
        this(j4, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? Constants.PLATFORM : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7);
    }
}
