package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class fw {

    /* renamed from: a, reason: collision with root package name */
    private final String f27466a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27467b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27468c;

    /* renamed from: d, reason: collision with root package name */
    private final iw f27469d;

    public fw(String name, String format, String adUnitId, iw mediation) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(format, "format");
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.l.f(mediation, "mediation");
        this.f27466a = name;
        this.f27467b = format;
        this.f27468c = adUnitId;
        this.f27469d = mediation;
    }

    public final String a() {
        return this.f27468c;
    }

    public final String b() {
        return this.f27467b;
    }

    public final iw c() {
        return this.f27469d;
    }

    public final String d() {
        return this.f27466a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw)) {
            return false;
        }
        fw fwVar = (fw) obj;
        return kotlin.jvm.internal.l.b(this.f27466a, fwVar.f27466a) && kotlin.jvm.internal.l.b(this.f27467b, fwVar.f27467b) && kotlin.jvm.internal.l.b(this.f27468c, fwVar.f27468c) && kotlin.jvm.internal.l.b(this.f27469d, fwVar.f27469d);
    }

    public final int hashCode() {
        return this.f27469d.hashCode() + C4121h3.a(this.f27468c, C4121h3.a(this.f27467b, this.f27466a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f27466a;
        String str2 = this.f27467b;
        String str3 = this.f27468c;
        iw iwVar = this.f27469d;
        StringBuilder sbD = j6.l.d("DebugPanelAdUnitFullData(name=", str, ", format=", str2, ", adUnitId=");
        sbD.append(str3);
        sbD.append(", mediation=");
        sbD.append(iwVar);
        sbD.append(")");
        return sbD.toString();
    }
}
