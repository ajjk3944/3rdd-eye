package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ew {

    /* renamed from: a, reason: collision with root package name */
    private final String f27051a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27052b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27053c;

    public ew(String name, String format, String adUnitId) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(format, "format");
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        this.f27051a = name;
        this.f27052b = format;
        this.f27053c = adUnitId;
    }

    public final String a() {
        return this.f27053c;
    }

    public final String b() {
        return this.f27052b;
    }

    public final String c() {
        return this.f27051a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew)) {
            return false;
        }
        ew ewVar = (ew) obj;
        return kotlin.jvm.internal.l.b(this.f27051a, ewVar.f27051a) && kotlin.jvm.internal.l.b(this.f27052b, ewVar.f27052b) && kotlin.jvm.internal.l.b(this.f27053c, ewVar.f27053c);
    }

    public final int hashCode() {
        return this.f27053c.hashCode() + C4121h3.a(this.f27052b, this.f27051a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f27051a;
        String str2 = this.f27052b;
        return B4.f.c(j6.l.d("DebugPanelAdUnitData(name=", str, ", format=", str2, ", adUnitId="), this.f27053c, ")");
    }
}
