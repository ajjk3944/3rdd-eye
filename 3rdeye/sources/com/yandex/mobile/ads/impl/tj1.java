package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tj1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f33645a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33646b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f33647c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f33648d;

    /* renamed from: e, reason: collision with root package name */
    private final sy f33649e;

    public tj1(String packageName, String url, LinkedHashMap linkedHashMap, Integer num, sy syVar) {
        kotlin.jvm.internal.l.f(packageName, "packageName");
        kotlin.jvm.internal.l.f(url, "url");
        this.f33645a = packageName;
        this.f33646b = url;
        this.f33647c = linkedHashMap;
        this.f33648d = num;
        this.f33649e = syVar;
    }

    public final Map<String, Object> a() {
        return this.f33647c;
    }

    public final Integer b() {
        return this.f33648d;
    }

    public final sy c() {
        return this.f33649e;
    }

    public final String d() {
        return this.f33645a;
    }

    public final String e() {
        return this.f33646b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj1)) {
            return false;
        }
        tj1 tj1Var = (tj1) obj;
        return kotlin.jvm.internal.l.b(this.f33645a, tj1Var.f33645a) && kotlin.jvm.internal.l.b(this.f33646b, tj1Var.f33646b) && kotlin.jvm.internal.l.b(this.f33647c, tj1Var.f33647c) && kotlin.jvm.internal.l.b(this.f33648d, tj1Var.f33648d) && this.f33649e == tj1Var.f33649e;
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f33646b, this.f33645a.hashCode() * 31, 31);
        Map<String, Object> map = this.f33647c;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f33648d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        sy syVar = this.f33649e;
        return iHashCode2 + (syVar != null ? syVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f33645a;
        String str2 = this.f33646b;
        Map<String, Object> map = this.f33647c;
        Integer num = this.f33648d;
        sy syVar = this.f33649e;
        StringBuilder sbD = j6.l.d("PreferredPackage(packageName=", str, ", url=", str2, ", extras=");
        sbD.append(map);
        sbD.append(", flags=");
        sbD.append(num);
        sbD.append(", launchMode=");
        sbD.append(syVar);
        sbD.append(")");
        return sbD.toString();
    }
}
