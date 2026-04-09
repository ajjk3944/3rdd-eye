package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C4139k0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i80 {

    /* renamed from: a, reason: collision with root package name */
    private final ns f28583a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28584b;

    /* renamed from: c, reason: collision with root package name */
    private final C4139k0.a f28585c;

    /* renamed from: d, reason: collision with root package name */
    private final h80 f28586d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f28587e;

    /* renamed from: f, reason: collision with root package name */
    private final C4075b f28588f;

    public i80(ns adType, long j4, C4139k0.a activityInteractionType, h80 h80Var, Map<String, ? extends Object> reportData, C4075b c4075b) {
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(activityInteractionType, "activityInteractionType");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        this.f28583a = adType;
        this.f28584b = j4;
        this.f28585c = activityInteractionType;
        this.f28586d = h80Var;
        this.f28587e = reportData;
        this.f28588f = c4075b;
    }

    public final C4075b a() {
        return this.f28588f;
    }

    public final C4139k0.a b() {
        return this.f28585c;
    }

    public final ns c() {
        return this.f28583a;
    }

    public final h80 d() {
        return this.f28586d;
    }

    public final Map<String, Object> e() {
        return this.f28587e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i80)) {
            return false;
        }
        i80 i80Var = (i80) obj;
        return this.f28583a == i80Var.f28583a && this.f28584b == i80Var.f28584b && this.f28585c == i80Var.f28585c && kotlin.jvm.internal.l.b(this.f28586d, i80Var.f28586d) && kotlin.jvm.internal.l.b(this.f28587e, i80Var.f28587e) && kotlin.jvm.internal.l.b(this.f28588f, i80Var.f28588f);
    }

    public final long f() {
        return this.f28584b;
    }

    public final int hashCode() {
        int iHashCode = this.f28583a.hashCode() * 31;
        long j4 = this.f28584b;
        int iHashCode2 = (this.f28585c.hashCode() + ((((int) (j4 ^ (j4 >>> 32))) + iHashCode) * 31)) * 31;
        h80 h80Var = this.f28586d;
        int iHashCode3 = (this.f28587e.hashCode() + ((iHashCode2 + (h80Var == null ? 0 : h80Var.hashCode())) * 31)) * 31;
        C4075b c4075b = this.f28588f;
        return iHashCode3 + (c4075b != null ? c4075b.hashCode() : 0);
    }

    public final String toString() {
        return "FalseClickData(adType=" + this.f28583a + ", startTime=" + this.f28584b + ", activityInteractionType=" + this.f28585c + ", falseClick=" + this.f28586d + ", reportData=" + this.f28587e + ", abExperiments=" + this.f28588f + ")";
    }
}
