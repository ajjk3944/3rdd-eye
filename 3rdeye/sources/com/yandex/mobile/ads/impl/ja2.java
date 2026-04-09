package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ja2 implements wf2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f29038a;

    /* renamed from: b, reason: collision with root package name */
    private final bq0 f29039b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29040c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, List<String>> f29041d;

    public ja2(String vendor, bq0 bq0Var, String str, HashMap events) {
        kotlin.jvm.internal.l.f(vendor, "vendor");
        kotlin.jvm.internal.l.f(events, "events");
        this.f29038a = vendor;
        this.f29039b = bq0Var;
        this.f29040c = str;
        this.f29041d = events;
    }

    @Override // com.yandex.mobile.ads.impl.wf2
    public final Map<String, List<String>> a() {
        Map<String, List<String>> mapUnmodifiableMap = Collections.unmodifiableMap(this.f29041d);
        kotlin.jvm.internal.l.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final bq0 b() {
        return this.f29039b;
    }

    public final String c() {
        return this.f29040c;
    }

    public final String d() {
        return this.f29038a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja2)) {
            return false;
        }
        ja2 ja2Var = (ja2) obj;
        return kotlin.jvm.internal.l.b(this.f29038a, ja2Var.f29038a) && kotlin.jvm.internal.l.b(this.f29039b, ja2Var.f29039b) && kotlin.jvm.internal.l.b(this.f29040c, ja2Var.f29040c) && kotlin.jvm.internal.l.b(this.f29041d, ja2Var.f29041d);
    }

    public final int hashCode() {
        int iHashCode = this.f29038a.hashCode() * 31;
        bq0 bq0Var = this.f29039b;
        int iHashCode2 = (iHashCode + (bq0Var == null ? 0 : bq0Var.hashCode())) * 31;
        String str = this.f29040c;
        return this.f29041d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.f29038a + ", javaScriptResource=" + this.f29039b + ", parameters=" + this.f29040c + ", events=" + this.f29041d + ")";
    }
}
