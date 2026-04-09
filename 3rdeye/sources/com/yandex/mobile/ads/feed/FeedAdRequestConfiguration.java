package com.yandex.mobile.ads.feed;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class FeedAdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final String f24037a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24038b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24039c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24040d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f24041e;

    /* renamed from: f, reason: collision with root package name */
    private final Location f24042f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, String> f24043g;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f24044a;

        /* renamed from: b, reason: collision with root package name */
        private String f24045b;

        /* renamed from: c, reason: collision with root package name */
        private String f24046c;

        /* renamed from: d, reason: collision with root package name */
        private String f24047d;

        /* renamed from: e, reason: collision with root package name */
        private List<String> f24048e;

        /* renamed from: f, reason: collision with root package name */
        private Location f24049f;

        /* renamed from: g, reason: collision with root package name */
        private Map<String, String> f24050g;

        public Builder(String adUnitId) {
            l.f(adUnitId, "adUnitId");
            this.f24044a = adUnitId;
        }

        public final FeedAdRequestConfiguration build() {
            return new FeedAdRequestConfiguration(this.f24044a, this.f24045b, this.f24046c, this.f24047d, this.f24048e, this.f24049f, this.f24050g);
        }

        public final Builder setAge(String str) {
            this.f24045b = str;
            return this;
        }

        public final Builder setContextQuery(String str) {
            this.f24047d = str;
            return this;
        }

        public final Builder setContextTags(List<String> list) {
            this.f24048e = list;
            return this;
        }

        public final Builder setGender(String str) {
            this.f24046c = str;
            return this;
        }

        public final Builder setLocation(Location location) {
            this.f24049f = location;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.f24050g = map;
            return this;
        }
    }

    public FeedAdRequestConfiguration(String adUnitId, String str, String str2, String str3, List<String> list, Location location, Map<String, String> map) {
        l.f(adUnitId, "adUnitId");
        this.f24037a = adUnitId;
        this.f24038b = str;
        this.f24039c = str2;
        this.f24040d = str3;
        this.f24041e = list;
        this.f24042f = location;
        this.f24043g = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !FeedAdRequestConfiguration.class.equals(obj.getClass())) {
            return false;
        }
        FeedAdRequestConfiguration feedAdRequestConfiguration = (FeedAdRequestConfiguration) obj;
        return l.b(this.f24037a, feedAdRequestConfiguration.f24037a) && l.b(this.f24038b, feedAdRequestConfiguration.f24038b) && l.b(this.f24039c, feedAdRequestConfiguration.f24039c) && l.b(this.f24040d, feedAdRequestConfiguration.f24040d) && l.b(this.f24041e, feedAdRequestConfiguration.f24041e) && l.b(this.f24042f, feedAdRequestConfiguration.f24042f) && l.b(this.f24043g, feedAdRequestConfiguration.f24043g);
    }

    public final String getAdUnitId() {
        return this.f24037a;
    }

    public final String getAge() {
        return this.f24038b;
    }

    public final String getContextQuery() {
        return this.f24040d;
    }

    public final List<String> getContextTags() {
        return this.f24041e;
    }

    public final String getGender() {
        return this.f24039c;
    }

    public final Location getLocation() {
        return this.f24042f;
    }

    public final Map<String, String> getParameters() {
        return this.f24043g;
    }

    public int hashCode() {
        int iHashCode = this.f24037a.hashCode() * 31;
        String str = this.f24038b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24039c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24040d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f24041e;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f24042f;
        int iHashCode6 = (iHashCode5 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f24043g;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }
}
