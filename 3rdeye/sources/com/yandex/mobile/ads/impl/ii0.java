package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ii0 {

    /* renamed from: a, reason: collision with root package name */
    private final ue f28698a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28699b;

    /* renamed from: c, reason: collision with root package name */
    private final ni0 f28700c;

    public ii0(ue appMetricaIdentifiers, String mauid, ni0 identifiersType) {
        kotlin.jvm.internal.l.f(appMetricaIdentifiers, "appMetricaIdentifiers");
        kotlin.jvm.internal.l.f(mauid, "mauid");
        kotlin.jvm.internal.l.f(identifiersType, "identifiersType");
        this.f28698a = appMetricaIdentifiers;
        this.f28699b = mauid;
        this.f28700c = identifiersType;
    }

    public final ue a() {
        return this.f28698a;
    }

    public final ni0 b() {
        return this.f28700c;
    }

    public final String c() {
        return this.f28699b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii0)) {
            return false;
        }
        ii0 ii0Var = (ii0) obj;
        return kotlin.jvm.internal.l.b(this.f28698a, ii0Var.f28698a) && kotlin.jvm.internal.l.b(this.f28699b, ii0Var.f28699b) && this.f28700c == ii0Var.f28700c;
    }

    public final int hashCode() {
        return this.f28700c.hashCode() + C4121h3.a(this.f28699b, this.f28698a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Identifiers(appMetricaIdentifiers=" + this.f28698a + ", mauid=" + this.f28699b + ", identifiersType=" + this.f28700c + ")";
    }
}
