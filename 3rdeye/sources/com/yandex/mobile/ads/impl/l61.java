package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class l61 {

    /* renamed from: a, reason: collision with root package name */
    private final h7 f29903a;

    /* renamed from: b, reason: collision with root package name */
    private final r91 f29904b;

    /* renamed from: c, reason: collision with root package name */
    private final u91 f29905c;

    /* renamed from: d, reason: collision with root package name */
    private final bq1<p61> f29906d;

    /* renamed from: e, reason: collision with root package name */
    private final int f29907e;

    public l61(h7 adRequestData, r91 nativeResponseType, u91 sourceType, bq1<p61> requestPolicy, int i) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(nativeResponseType, "nativeResponseType");
        kotlin.jvm.internal.l.f(sourceType, "sourceType");
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        this.f29903a = adRequestData;
        this.f29904b = nativeResponseType;
        this.f29905c = sourceType;
        this.f29906d = requestPolicy;
        this.f29907e = i;
    }

    public final h7 a() {
        return this.f29903a;
    }

    public final int b() {
        return this.f29907e;
    }

    public final r91 c() {
        return this.f29904b;
    }

    public final bq1<p61> d() {
        return this.f29906d;
    }

    public final u91 e() {
        return this.f29905c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l61)) {
            return false;
        }
        l61 l61Var = (l61) obj;
        return kotlin.jvm.internal.l.b(this.f29903a, l61Var.f29903a) && this.f29904b == l61Var.f29904b && this.f29905c == l61Var.f29905c && kotlin.jvm.internal.l.b(this.f29906d, l61Var.f29906d) && this.f29907e == l61Var.f29907e;
    }

    public final int hashCode() {
        return this.f29907e + ((this.f29906d.hashCode() + ((this.f29905c.hashCode() + ((this.f29904b.hashCode() + (this.f29903a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        h7 h7Var = this.f29903a;
        r91 r91Var = this.f29904b;
        u91 u91Var = this.f29905c;
        bq1<p61> bq1Var = this.f29906d;
        int i = this.f29907e;
        StringBuilder sb = new StringBuilder("NativeAdRequestData(adRequestData=");
        sb.append(h7Var);
        sb.append(", nativeResponseType=");
        sb.append(r91Var);
        sb.append(", sourceType=");
        sb.append(u91Var);
        sb.append(", requestPolicy=");
        sb.append(bq1Var);
        sb.append(", adsCount=");
        return B4.i.j(sb, i, ")");
    }
}
