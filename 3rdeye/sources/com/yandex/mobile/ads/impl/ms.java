package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ms {

    /* renamed from: a, reason: collision with root package name */
    private final String f30497a;

    /* renamed from: b, reason: collision with root package name */
    private final t8 f30498b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30499c;

    public ms(String adUnitId, t8 t8Var, String str) {
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        this.f30497a = adUnitId;
        this.f30498b = t8Var;
        this.f30499c = str;
    }

    public final t8 a() {
        return this.f30498b;
    }

    public final String b() {
        return this.f30497a;
    }

    public final String c() {
        return this.f30499c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        return kotlin.jvm.internal.l.b(this.f30497a, msVar.f30497a) && kotlin.jvm.internal.l.b(this.f30498b, msVar.f30498b) && kotlin.jvm.internal.l.b(this.f30499c, msVar.f30499c);
    }

    public final int hashCode() {
        int iHashCode = this.f30497a.hashCode() * 31;
        t8 t8Var = this.f30498b;
        int iHashCode2 = (iHashCode + (t8Var == null ? 0 : t8Var.hashCode())) * 31;
        String str = this.f30499c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f30497a;
        t8 t8Var = this.f30498b;
        String str2 = this.f30499c;
        StringBuilder sb = new StringBuilder("CoreAdInfo(adUnitId=");
        sb.append(str);
        sb.append(", adSize=");
        sb.append(t8Var);
        sb.append(", data=");
        return B4.f.c(sb, str2, ")");
    }
}
