package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ag<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f24636a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24637b;

    /* renamed from: c, reason: collision with root package name */
    private final T f24638c;

    /* renamed from: d, reason: collision with root package name */
    private final ir0 f24639d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24640e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24641f;

    public ag(String name, String type, T t10, ir0 ir0Var, boolean z10, boolean z11) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(type, "type");
        this.f24636a = name;
        this.f24637b = type;
        this.f24638c = t10;
        this.f24639d = ir0Var;
        this.f24640e = z10;
        this.f24641f = z11;
    }

    public static ag a(ag agVar, sw0 sw0Var) {
        String name = agVar.f24636a;
        String type = agVar.f24637b;
        ir0 ir0Var = agVar.f24639d;
        boolean z10 = agVar.f24640e;
        boolean z11 = agVar.f24641f;
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(type, "type");
        return new ag(name, type, sw0Var, ir0Var, z10, z11);
    }

    public final String b() {
        return this.f24636a;
    }

    public final String c() {
        return this.f24637b;
    }

    public final T d() {
        return this.f24638c;
    }

    public final boolean e() {
        return this.f24640e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return kotlin.jvm.internal.l.b(this.f24636a, agVar.f24636a) && kotlin.jvm.internal.l.b(this.f24637b, agVar.f24637b) && kotlin.jvm.internal.l.b(this.f24638c, agVar.f24638c) && kotlin.jvm.internal.l.b(this.f24639d, agVar.f24639d) && this.f24640e == agVar.f24640e && this.f24641f == agVar.f24641f;
    }

    public final boolean f() {
        return this.f24641f;
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f24637b, this.f24636a.hashCode() * 31, 31);
        T t10 = this.f24638c;
        int iHashCode = (iA + (t10 == null ? 0 : t10.hashCode())) * 31;
        ir0 ir0Var = this.f24639d;
        return (this.f24641f ? 1231 : 1237) + m6.a(this.f24640e, (iHashCode + (ir0Var != null ? ir0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String str = this.f24636a;
        String str2 = this.f24637b;
        T t10 = this.f24638c;
        ir0 ir0Var = this.f24639d;
        boolean z10 = this.f24640e;
        boolean z11 = this.f24641f;
        StringBuilder sbD = j6.l.d("Asset(name=", str, ", type=", str2, ", value=");
        sbD.append(t10);
        sbD.append(", link=");
        sbD.append(ir0Var);
        sbD.append(", isClickable=");
        sbD.append(z10);
        sbD.append(", isRequired=");
        sbD.append(z11);
        sbD.append(")");
        return sbD.toString();
    }

    public final ir0 a() {
        return this.f24639d;
    }
}
