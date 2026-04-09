package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qd0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f32148a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32149b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32150c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32151d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f32152e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f32153f;

    /* renamed from: g, reason: collision with root package name */
    private final hq1 f32154g;

    public qd0(String adUnitId, String str, String str2, String str3, List<String> list, Map<String, String> map, hq1 hq1Var) {
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        this.f32148a = adUnitId;
        this.f32149b = str;
        this.f32150c = str2;
        this.f32151d = str3;
        this.f32152e = list;
        this.f32153f = map;
        this.f32154g = hq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd0)) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        return kotlin.jvm.internal.l.b(this.f32148a, qd0Var.f32148a) && kotlin.jvm.internal.l.b(this.f32149b, qd0Var.f32149b) && kotlin.jvm.internal.l.b(this.f32150c, qd0Var.f32150c) && kotlin.jvm.internal.l.b(this.f32151d, qd0Var.f32151d) && kotlin.jvm.internal.l.b(this.f32152e, qd0Var.f32152e) && kotlin.jvm.internal.l.b(this.f32153f, qd0Var.f32153f) && this.f32154g == qd0Var.f32154g;
    }

    public final int hashCode() {
        int iHashCode = this.f32148a.hashCode() * 31;
        String str = this.f32149b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32150c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f32151d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f32152e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.f32153f;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        hq1 hq1Var = this.f32154g;
        return iHashCode6 + (hq1Var != null ? hq1Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f32148a;
        String str2 = this.f32149b;
        String str3 = this.f32150c;
        String str4 = this.f32151d;
        List<String> list = this.f32152e;
        Map<String, String> map = this.f32153f;
        hq1 hq1Var = this.f32154g;
        StringBuilder sbD = j6.l.d("FullscreenCacheParams(adUnitId=", str, ", age=", str2, ", gender=");
        com.google.android.gms.measurement.internal.a.l(sbD, str3, ", contextQuery=", str4, ", contextTags=");
        sbD.append(list);
        sbD.append(", parameters=");
        sbD.append(map);
        sbD.append(", preferredTheme=");
        sbD.append(hq1Var);
        sbD.append(")");
        return sbD.toString();
    }
}
