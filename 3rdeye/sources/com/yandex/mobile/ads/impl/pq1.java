package com.yandex.mobile.ads.impl;

import N7.G8;
import c9.C2099t;
import com.yandex.mobile.ads.impl.kf0;
import g0.C4356c;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class pq1 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final pp1 f31883a;

    /* renamed from: b, reason: collision with root package name */
    private final gm1 f31884b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31885c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31886d;

    /* renamed from: e, reason: collision with root package name */
    private final cf0 f31887e;

    /* renamed from: f, reason: collision with root package name */
    private final kf0 f31888f;

    /* renamed from: g, reason: collision with root package name */
    private final tq1 f31889g;

    /* renamed from: h, reason: collision with root package name */
    private final pq1 f31890h;
    private final pq1 i;

    /* renamed from: j, reason: collision with root package name */
    private final pq1 f31891j;

    /* renamed from: k, reason: collision with root package name */
    private final long f31892k;

    /* renamed from: l, reason: collision with root package name */
    private final long f31893l;

    /* renamed from: m, reason: collision with root package name */
    private final w50 f31894m;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private pp1 f31895a;

        /* renamed from: b, reason: collision with root package name */
        private gm1 f31896b;

        /* renamed from: c, reason: collision with root package name */
        private int f31897c;

        /* renamed from: d, reason: collision with root package name */
        private String f31898d;

        /* renamed from: e, reason: collision with root package name */
        private cf0 f31899e;

        /* renamed from: f, reason: collision with root package name */
        private kf0.a f31900f;

        /* renamed from: g, reason: collision with root package name */
        private tq1 f31901g;

        /* renamed from: h, reason: collision with root package name */
        private pq1 f31902h;
        private pq1 i;

        /* renamed from: j, reason: collision with root package name */
        private pq1 f31903j;

        /* renamed from: k, reason: collision with root package name */
        private long f31904k;

        /* renamed from: l, reason: collision with root package name */
        private long f31905l;

        /* renamed from: m, reason: collision with root package name */
        private w50 f31906m;

        public a() {
            this.f31897c = -1;
            this.f31900f = new kf0.a();
        }

        public final a a(tq1 tq1Var) {
            this.f31901g = tq1Var;
            return this;
        }

        public final int b() {
            return this.f31897c;
        }

        public final a c() {
            kf0.a aVar = this.f31900f;
            aVar.getClass();
            kf0.b.b("Proxy-Authenticate");
            kf0.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
            aVar.a("Proxy-Authenticate");
            aVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
            return this;
        }

        public final pq1 a() {
            int i = this.f31897c;
            if (i < 0) {
                throw new IllegalStateException(C4356c.h(i, "code < 0: ").toString());
            }
            pp1 pp1Var = this.f31895a;
            if (pp1Var == null) {
                throw new IllegalStateException("request == null");
            }
            gm1 gm1Var = this.f31896b;
            if (gm1Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f31898d;
            if (str != null) {
                return new pq1(pp1Var, gm1Var, str, i, this.f31899e, this.f31900f.a(), this.f31901g, this.f31902h, this.i, this.f31903j, this.f31904k, this.f31905l, this.f31906m);
            }
            throw new IllegalStateException("message == null");
        }

        public final a b(pq1 pq1Var) {
            a(pq1Var, "networkResponse");
            this.f31902h = pq1Var;
            return this;
        }

        public a(pq1 response) {
            kotlin.jvm.internal.l.f(response, "response");
            this.f31897c = -1;
            this.f31895a = response.o();
            this.f31896b = response.m();
            this.f31897c = response.d();
            this.f31898d = response.i();
            this.f31899e = response.f();
            this.f31900f = response.g().b();
            this.f31901g = response.a();
            this.f31902h = response.j();
            this.i = response.b();
            this.f31903j = response.l();
            this.f31904k = response.p();
            this.f31905l = response.n();
            this.f31906m = response.e();
        }

        public final a b(long j4) {
            this.f31904k = j4;
            return this;
        }

        public final a c(pq1 pq1Var) {
            if (pq1Var.a() == null) {
                this.f31903j = pq1Var;
                return this;
            }
            throw new IllegalArgumentException("priorResponse.body != null");
        }

        public final a a(pq1 pq1Var) {
            a(pq1Var, "cacheResponse");
            this.i = pq1Var;
            return this;
        }

        private static void a(pq1 pq1Var, String str) {
            if (pq1Var != null) {
                if (pq1Var.a() == null) {
                    if (pq1Var.j() == null) {
                        if (pq1Var.b() == null) {
                            if (pq1Var.l() != null) {
                                throw new IllegalArgumentException(G8.s(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(G8.s(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(G8.s(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(G8.s(str, ".body != null").toString());
            }
        }

        public final a a(int i) {
            this.f31897c = i;
            return this;
        }

        public final a a(cf0 cf0Var) {
            this.f31899e = cf0Var;
            return this;
        }

        public final a a(kf0 headers) {
            kotlin.jvm.internal.l.f(headers, "headers");
            this.f31900f = headers.b();
            return this;
        }

        public final void a(w50 deferredTrailers) {
            kotlin.jvm.internal.l.f(deferredTrailers, "deferredTrailers");
            this.f31906m = deferredTrailers;
        }

        public final a a(String message) {
            kotlin.jvm.internal.l.f(message, "message");
            this.f31898d = message;
            return this;
        }

        public final a a(gm1 protocol) {
            kotlin.jvm.internal.l.f(protocol, "protocol");
            this.f31896b = protocol;
            return this;
        }

        public final a a(long j4) {
            this.f31905l = j4;
            return this;
        }

        public final a a(pp1 request) {
            kotlin.jvm.internal.l.f(request, "request");
            this.f31895a = request;
            return this;
        }
    }

    public pq1(pp1 request, gm1 protocol, String message, int i, cf0 cf0Var, kf0 headers, tq1 tq1Var, pq1 pq1Var, pq1 pq1Var2, pq1 pq1Var3, long j4, long j10, w50 w50Var) {
        kotlin.jvm.internal.l.f(request, "request");
        kotlin.jvm.internal.l.f(protocol, "protocol");
        kotlin.jvm.internal.l.f(message, "message");
        kotlin.jvm.internal.l.f(headers, "headers");
        this.f31883a = request;
        this.f31884b = protocol;
        this.f31885c = message;
        this.f31886d = i;
        this.f31887e = cf0Var;
        this.f31888f = headers;
        this.f31889g = tq1Var;
        this.f31890h = pq1Var;
        this.i = pq1Var2;
        this.f31891j = pq1Var3;
        this.f31892k = j4;
        this.f31893l = j10;
        this.f31894m = w50Var;
    }

    public final tq1 a() {
        return this.f31889g;
    }

    public final pq1 b() {
        return this.i;
    }

    public final List<ao> c() {
        String str;
        kf0 kf0Var = this.f31888f;
        int i = this.f31886d;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return C2099t.f18581b;
            }
            str = "Proxy-Authenticate";
        }
        return ih0.a(kf0Var, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        tq1 tq1Var = this.f31889g;
        if (tq1Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        t82.a((Closeable) tq1Var.c());
    }

    public final int d() {
        return this.f31886d;
    }

    public final w50 e() {
        return this.f31894m;
    }

    public final cf0 f() {
        return this.f31887e;
    }

    public final kf0 g() {
        return this.f31888f;
    }

    public final boolean h() {
        int i = this.f31886d;
        return 200 <= i && i < 300;
    }

    public final String i() {
        return this.f31885c;
    }

    public final pq1 j() {
        return this.f31890h;
    }

    public final a k() {
        return new a(this);
    }

    public final pq1 l() {
        return this.f31891j;
    }

    public final gm1 m() {
        return this.f31884b;
    }

    public final long n() {
        return this.f31893l;
    }

    public final pp1 o() {
        return this.f31883a;
    }

    public final long p() {
        return this.f31892k;
    }

    public final String toString() {
        return "Response{protocol=" + this.f31884b + ", code=" + this.f31886d + ", message=" + this.f31885c + ", url=" + this.f31883a.g() + "}";
    }

    public static String a(pq1 pq1Var, String name) {
        pq1Var.getClass();
        kotlin.jvm.internal.l.f(name, "name");
        String strA = pq1Var.f31888f.a(name);
        if (strA == null) {
            return null;
        }
        return strA;
    }
}
