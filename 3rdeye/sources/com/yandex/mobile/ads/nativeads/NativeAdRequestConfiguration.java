package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class NativeAdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final String f36831a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36832b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36833c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36834d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f36835e;

    /* renamed from: f, reason: collision with root package name */
    private final Location f36836f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, String> f36837g;

    /* renamed from: h, reason: collision with root package name */
    private final String f36838h;
    private final AdTheme i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f36839j;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f36840a;

        /* renamed from: b, reason: collision with root package name */
        private String f36841b;

        /* renamed from: c, reason: collision with root package name */
        private String f36842c;

        /* renamed from: d, reason: collision with root package name */
        private Location f36843d;

        /* renamed from: e, reason: collision with root package name */
        private String f36844e;

        /* renamed from: f, reason: collision with root package name */
        private List<String> f36845f;

        /* renamed from: g, reason: collision with root package name */
        private Map<String, String> f36846g;

        /* renamed from: h, reason: collision with root package name */
        private String f36847h;
        private AdTheme i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f36848j;

        public Builder(String adUnitId) {
            l.f(adUnitId, "adUnitId");
            this.f36840a = adUnitId;
            this.f36848j = true;
        }

        public final NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this.f36840a, this.f36841b, this.f36842c, this.f36844e, this.f36845f, this.f36843d, this.f36846g, this.f36847h, this.i, this.f36848j, null);
        }

        public final Builder setAge(String age) {
            l.f(age, "age");
            this.f36841b = age;
            return this;
        }

        public final Builder setBiddingData(String biddingData) {
            l.f(biddingData, "biddingData");
            this.f36847h = biddingData;
            return this;
        }

        public final Builder setContextQuery(String contextQuery) {
            l.f(contextQuery, "contextQuery");
            this.f36844e = contextQuery;
            return this;
        }

        public final Builder setContextTags(List<String> contextTags) {
            l.f(contextTags, "contextTags");
            this.f36845f = contextTags;
            return this;
        }

        public final Builder setGender(String gender) {
            l.f(gender, "gender");
            this.f36842c = gender;
            return this;
        }

        public final Builder setLocation(Location location) {
            l.f(location, "location");
            this.f36843d = location;
            return this;
        }

        public final Builder setParameters(Map<String, String> parameters) {
            l.f(parameters, "parameters");
            this.f36846g = parameters;
            return this;
        }

        public final Builder setPreferredTheme(AdTheme preferredTheme) {
            l.f(preferredTheme, "preferredTheme");
            this.i = preferredTheme;
            return this;
        }

        public final Builder setShouldLoadImagesAutomatically(boolean z10) {
            this.f36848j = z10;
            return this;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z10, kotlin.jvm.internal.g gVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme, z10);
    }

    public final String getAdUnitId() {
        return this.f36831a;
    }

    public final String getAge() {
        return this.f36832b;
    }

    public final String getBiddingData() {
        return this.f36838h;
    }

    public final String getContextQuery() {
        return this.f36834d;
    }

    public final List<String> getContextTags() {
        return this.f36835e;
    }

    public final String getGender() {
        return this.f36833c;
    }

    public final Location getLocation() {
        return this.f36836f;
    }

    public final Map<String, String> getParameters() {
        return this.f36837g;
    }

    public final AdTheme getPreferredTheme() {
        return this.i;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.f36839j;
    }

    private NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List<String> list, Location location, Map<String, String> map, String str5, AdTheme adTheme, boolean z10) {
        this.f36831a = str;
        this.f36832b = str2;
        this.f36833c = str3;
        this.f36834d = str4;
        this.f36835e = list;
        this.f36836f = location;
        this.f36837g = map;
        this.f36838h = str5;
        this.i = adTheme;
        this.f36839j = z10;
    }
}
