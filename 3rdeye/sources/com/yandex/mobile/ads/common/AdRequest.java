package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class AdRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f23954a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23955b;

    /* renamed from: c, reason: collision with root package name */
    private final Location f23956c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23957d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f23958e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f23959f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23960g;

    /* renamed from: h, reason: collision with root package name */
    private final AdTheme f23961h;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f23962a;

        /* renamed from: b, reason: collision with root package name */
        private String f23963b;

        /* renamed from: c, reason: collision with root package name */
        private Location f23964c;

        /* renamed from: d, reason: collision with root package name */
        private String f23965d;

        /* renamed from: e, reason: collision with root package name */
        private List<String> f23966e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f23967f;

        /* renamed from: g, reason: collision with root package name */
        private String f23968g;

        /* renamed from: h, reason: collision with root package name */
        private AdTheme f23969h;

        public final AdRequest build() {
            return new AdRequest(this.f23962a, this.f23963b, this.f23964c, this.f23965d, this.f23966e, this.f23967f, this.f23968g, this.f23969h, null);
        }

        public final Builder setAge(String str) {
            this.f23962a = str;
            return this;
        }

        public final Builder setBiddingData(String str) {
            this.f23968g = str;
            return this;
        }

        public final Builder setContextQuery(String str) {
            this.f23965d = str;
            return this;
        }

        public final Builder setContextTags(List<String> list) {
            this.f23966e = list;
            return this;
        }

        public final Builder setGender(String str) {
            this.f23963b = str;
            return this;
        }

        public final Builder setLocation(Location location) {
            this.f23964c = location;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.f23967f = map;
            return this;
        }

        public final Builder setPreferredTheme(AdTheme adTheme) {
            this.f23969h = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequest(String str, String str2, Location location, String str3, List list, Map map, String str4, AdTheme adTheme, g gVar) {
        this(str, str2, location, str3, list, map, str4, adTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdRequest.class.equals(obj.getClass())) {
            AdRequest adRequest = (AdRequest) obj;
            if (l.b(this.f23954a, adRequest.f23954a) && l.b(this.f23955b, adRequest.f23955b) && l.b(this.f23957d, adRequest.f23957d) && l.b(this.f23958e, adRequest.f23958e) && l.b(this.f23956c, adRequest.f23956c) && l.b(this.f23959f, adRequest.f23959f) && l.b(this.f23960g, adRequest.f23960g) && this.f23961h == adRequest.f23961h) {
                return true;
            }
        }
        return false;
    }

    public final String getAge() {
        return this.f23954a;
    }

    public final String getBiddingData() {
        return this.f23960g;
    }

    public final String getContextQuery() {
        return this.f23957d;
    }

    public final List<String> getContextTags() {
        return this.f23958e;
    }

    public final String getGender() {
        return this.f23955b;
    }

    public final Location getLocation() {
        return this.f23956c;
    }

    public final Map<String, String> getParameters() {
        return this.f23959f;
    }

    public final AdTheme getPreferredTheme() {
        return this.f23961h;
    }

    public int hashCode() {
        String str = this.f23954a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23955b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23957d;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f23958e;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f23956c;
        int iHashCode5 = (iHashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f23959f;
        int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f23960g;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f23961h;
        return iHashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequest(String str, String str2, Location location, String str3, List<String> list, Map<String, String> map, String str4, AdTheme adTheme) {
        this.f23954a = str;
        this.f23955b = str2;
        this.f23956c = location;
        this.f23957d = str3;
        this.f23958e = list;
        this.f23959f = map;
        this.f23960g = str4;
        this.f23961h = adTheme;
    }
}
