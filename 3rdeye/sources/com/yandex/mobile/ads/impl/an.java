package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    private final pp1 f24747a;

    /* renamed from: b, reason: collision with root package name */
    private final pq1 f24748b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final pp1 f24749a;

        public a(long j4, pp1 request) {
            kotlin.jvm.internal.l.f(request, "request");
            this.f24749a = request;
        }

        public final an a() {
            an anVar = new an(this.f24749a, null);
            return (anVar.b() == null || !this.f24749a.b().a()) ? anVar : new an(null, null);
        }
    }

    public an(pp1 pp1Var, pq1 pq1Var) {
        this.f24747a = pp1Var;
        this.f24748b = pq1Var;
    }

    public final pq1 a() {
        return this.f24748b;
    }

    public final pp1 b() {
        return this.f24747a;
    }
}
