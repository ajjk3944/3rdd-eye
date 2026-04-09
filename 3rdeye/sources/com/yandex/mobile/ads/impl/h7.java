package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f28104a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28105b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28106c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28107d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f28108e;

    /* renamed from: f, reason: collision with root package name */
    private final Location f28109f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, String> f28110g;

    /* renamed from: h, reason: collision with root package name */
    private final String f28111h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final hq1 f28112j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f28113k;

    /* renamed from: l, reason: collision with root package name */
    private final String f28114l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f28115a;

        /* renamed from: b, reason: collision with root package name */
        private String f28116b;

        /* renamed from: c, reason: collision with root package name */
        private String f28117c;

        /* renamed from: d, reason: collision with root package name */
        private Location f28118d;

        /* renamed from: e, reason: collision with root package name */
        private String f28119e;

        /* renamed from: f, reason: collision with root package name */
        private List<String> f28120f;

        /* renamed from: g, reason: collision with root package name */
        private Map<String, String> f28121g;

        /* renamed from: h, reason: collision with root package name */
        private String f28122h;
        private String i;

        /* renamed from: j, reason: collision with root package name */
        private hq1 f28123j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f28124k;

        public a(String adUnitId) {
            kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
            this.f28115a = adUnitId;
        }

        public final h7 a() {
            return new h7(this.f28115a, this.f28116b, this.f28117c, this.f28119e, this.f28120f, this.f28118d, this.f28121g, this.f28122h, this.i, this.f28123j, this.f28124k, null);
        }

        public final a b(String str) {
            this.f28119e = str;
            return this;
        }

        public final a c(String str) {
            this.f28117c = str;
            return this;
        }

        public final a d(String str) {
            this.f28122h = str;
            return this;
        }

        public final a b() {
            this.i = null;
            return this;
        }

        public final a a(String str) {
            this.f28116b = str;
            return this;
        }

        public final a a(List<String> list) {
            this.f28120f = list;
            return this;
        }

        public final a a(Location location) {
            this.f28118d = location;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f28121g = map;
            return this;
        }

        public final a a(hq1 hq1Var) {
            this.f28123j = hq1Var;
            return this;
        }

        public final a a(boolean z10) {
            this.f28124k = z10;
            return this;
        }
    }

    public h7(String adUnitId, String str, String str2, String str3, List<String> list, Location location, Map<String, String> map, String str4, String str5, hq1 hq1Var, boolean z10, String str6) {
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        this.f28104a = adUnitId;
        this.f28105b = str;
        this.f28106c = str2;
        this.f28107d = str3;
        this.f28108e = list;
        this.f28109f = location;
        this.f28110g = map;
        this.f28111h = str4;
        this.i = str5;
        this.f28112j = hq1Var;
        this.f28113k = z10;
        this.f28114l = str6;
    }

    public static h7 a(h7 h7Var, Map map, String str, int i) {
        String adUnitId = h7Var.f28104a;
        String str2 = h7Var.f28105b;
        String str3 = h7Var.f28106c;
        String str4 = h7Var.f28107d;
        List<String> list = h7Var.f28108e;
        Location location = h7Var.f28109f;
        if ((i & 64) != 0) {
            map = h7Var.f28110g;
        }
        Map map2 = map;
        String str5 = h7Var.f28111h;
        String str6 = h7Var.i;
        hq1 hq1Var = h7Var.f28112j;
        boolean z10 = h7Var.f28113k;
        if ((i & 2048) != 0) {
            str = h7Var.f28114l;
        }
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        return new h7(adUnitId, str2, str3, str4, list, location, map2, str5, str6, hq1Var, z10, str);
    }

    public final String b() {
        return this.f28105b;
    }

    public final String c() {
        return this.f28107d;
    }

    public final List<String> d() {
        return this.f28108e;
    }

    public final String e() {
        return this.f28106c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return kotlin.jvm.internal.l.b(this.f28104a, h7Var.f28104a) && kotlin.jvm.internal.l.b(this.f28105b, h7Var.f28105b) && kotlin.jvm.internal.l.b(this.f28106c, h7Var.f28106c) && kotlin.jvm.internal.l.b(this.f28107d, h7Var.f28107d) && kotlin.jvm.internal.l.b(this.f28108e, h7Var.f28108e) && kotlin.jvm.internal.l.b(this.f28109f, h7Var.f28109f) && kotlin.jvm.internal.l.b(this.f28110g, h7Var.f28110g) && kotlin.jvm.internal.l.b(this.f28111h, h7Var.f28111h) && kotlin.jvm.internal.l.b(this.i, h7Var.i) && this.f28112j == h7Var.f28112j && this.f28113k == h7Var.f28113k && kotlin.jvm.internal.l.b(this.f28114l, h7Var.f28114l);
    }

    public final Location f() {
        return this.f28109f;
    }

    public final String g() {
        return this.f28111h;
    }

    public final Map<String, String> h() {
        return this.f28110g;
    }

    public final int hashCode() {
        int iHashCode = this.f28104a.hashCode() * 31;
        String str = this.f28105b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28106c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28107d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f28108e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Location location = this.f28109f;
        int iHashCode6 = (iHashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Map<String, String> map = this.f28110g;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.f28111h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        hq1 hq1Var = this.f28112j;
        int iA = m6.a(this.f28113k, (iHashCode9 + (hq1Var == null ? 0 : hq1Var.hashCode())) * 31, 31);
        String str6 = this.f28114l;
        return iA + (str6 != null ? str6.hashCode() : 0);
    }

    public final hq1 i() {
        return this.f28112j;
    }

    public final String j() {
        return this.f28114l;
    }

    public final String k() {
        return this.i;
    }

    public final boolean l() {
        return this.f28113k;
    }

    public final String toString() {
        String str = this.f28104a;
        String str2 = this.f28105b;
        String str3 = this.f28106c;
        String str4 = this.f28107d;
        List<String> list = this.f28108e;
        Location location = this.f28109f;
        Map<String, String> map = this.f28110g;
        String str5 = this.f28111h;
        String str6 = this.i;
        hq1 hq1Var = this.f28112j;
        boolean z10 = this.f28113k;
        String str7 = this.f28114l;
        StringBuilder sbD = j6.l.d("AdRequestData(adUnitId=", str, ", age=", str2, ", gender=");
        com.google.android.gms.measurement.internal.a.l(sbD, str3, ", contextQuery=", str4, ", contextTags=");
        sbD.append(list);
        sbD.append(", location=");
        sbD.append(location);
        sbD.append(", parameters=");
        sbD.append(map);
        sbD.append(", openBiddingData=");
        sbD.append(str5);
        sbD.append(", readyResponse=");
        sbD.append(str6);
        sbD.append(", preferredTheme=");
        sbD.append(hq1Var);
        sbD.append(", shouldLoadImagesAutomatically=");
        sbD.append(z10);
        sbD.append(", preloadType=");
        sbD.append(str7);
        sbD.append(")");
        return sbD.toString();
    }

    public final String a() {
        return this.f28104a;
    }
}
