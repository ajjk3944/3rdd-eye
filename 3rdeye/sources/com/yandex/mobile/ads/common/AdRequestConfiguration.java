package com.yandex.mobile.ads.common;

import android.location.Location;
import com.yandex.mobile.ads.impl.C4121h3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class AdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final String f23970a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23971b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23972c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23973d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f23974e;

    /* renamed from: f, reason: collision with root package name */
    private final Location f23975f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, String> f23976g;

    /* renamed from: h, reason: collision with root package name */
    private final String f23977h;
    private final AdTheme i;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f23978a;

        /* renamed from: b, reason: collision with root package name */
        private String f23979b;

        /* renamed from: c, reason: collision with root package name */
        private String f23980c;

        /* renamed from: d, reason: collision with root package name */
        private Location f23981d;

        /* renamed from: e, reason: collision with root package name */
        private String f23982e;

        /* renamed from: f, reason: collision with root package name */
        private List<String> f23983f;

        /* renamed from: g, reason: collision with root package name */
        private Map<String, String> f23984g;

        /* renamed from: h, reason: collision with root package name */
        private String f23985h;
        private AdTheme i;

        public Builder(String adUnitId) {
            l.f(adUnitId, "adUnitId");
            this.f23978a = adUnitId;
        }

        public final AdRequestConfiguration build() {
            return new AdRequestConfiguration(this.f23978a, this.f23979b, this.f23980c, this.f23982e, this.f23983f, this.f23981d, this.f23984g, this.f23985h, this.i, null);
        }

        public final Builder setAge(String str) {
            this.f23979b = str;
            return this;
        }

        public final Builder setBiddingData(String str) {
            this.f23985h = str;
            return this;
        }

        public final Builder setContextQuery(String str) {
            this.f23982e = str;
            return this;
        }

        public final Builder setContextTags(List<String> list) {
            this.f23983f = list;
            return this;
        }

        public final Builder setGender(String str) {
            this.f23980c = str;
            return this;
        }

        public final Builder setLocation(Location location) {
            this.f23981d = location;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.f23984g = map;
            return this;
        }

        public final Builder setPreferredTheme(AdTheme adTheme) {
            this.i = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, g gVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdRequestConfiguration.class.equals(obj.getClass())) {
            AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
            if (l.b(this.f23970a, adRequestConfiguration.f23970a) && l.b(this.f23971b, adRequestConfiguration.f23971b) && l.b(this.f23972c, adRequestConfiguration.f23972c) && l.b(this.f23973d, adRequestConfiguration.f23973d) && l.b(this.f23974e, adRequestConfiguration.f23974e) && l.b(this.f23975f, adRequestConfiguration.f23975f) && l.b(this.f23976g, adRequestConfiguration.f23976g) && l.b(this.f23977h, adRequestConfiguration.f23977h) && this.i == adRequestConfiguration.i) {
                return true;
            }
        }
        return false;
    }

    public final String getAdUnitId() {
        return this.f23970a;
    }

    public final String getAge() {
        return this.f23971b;
    }

    public final String getBiddingData() {
        return this.f23977h;
    }

    public final String getContextQuery() {
        return this.f23973d;
    }

    public final List<String> getContextTags() {
        return this.f23974e;
    }

    public final String getGender() {
        return this.f23972c;
    }

    public final Location getLocation() {
        return this.f23975f;
    }

    public final Map<String, String> getParameters() {
        return this.f23976g;
    }

    public final AdTheme getPreferredTheme() {
        return this.i;
    }

    public int hashCode() {
        String str = this.f23971b;
        int iA = C4121h3.a(this.f23970a, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.f23972c;
        int iHashCode = (iA + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23973d;
        int iHashCode2 = (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f23974e;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f23975f;
        int iHashCode4 = (iHashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f23976g;
        int iHashCode5 = (iHashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f23977h;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.i;
        return iHashCode6 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequestConfiguration(String str, String str2, String str3, String str4, List<String> list, Location location, Map<String, String> map, String str5, AdTheme adTheme) {
        this.f23970a = str;
        this.f23971b = str2;
        this.f23972c = str3;
        this.f23973d = str4;
        this.f23974e = list;
        this.f23975f = location;
        this.f23976g = map;
        this.f23977h = str5;
        this.i = adTheme;
    }
}
