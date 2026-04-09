package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import c9.C2078B;
import c9.C2092m;
import c9.C2100u;
import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.om;
import com.yandex.mobile.ads.impl.rh0;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pp1 {

    /* renamed from: a, reason: collision with root package name */
    private final rh0 f31868a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31869b;

    /* renamed from: c, reason: collision with root package name */
    private final kf0 f31870c;

    /* renamed from: d, reason: collision with root package name */
    private final sp1 f31871d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Object> f31872e;

    /* renamed from: f, reason: collision with root package name */
    private om f31873f;

    public pp1(rh0 url, String method, kf0 headers, sp1 sp1Var, Map<Class<?>, ? extends Object> tags) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(method, "method");
        kotlin.jvm.internal.l.f(headers, "headers");
        kotlin.jvm.internal.l.f(tags, "tags");
        this.f31868a = url;
        this.f31869b = method;
        this.f31870c = headers;
        this.f31871d = sp1Var;
        this.f31872e = tags;
    }

    public final sp1 a() {
        return this.f31871d;
    }

    public final om b() {
        om omVar = this.f31873f;
        if (omVar != null) {
            return omVar;
        }
        int i = om.f31424n;
        om omVarA = om.b.a(this.f31870c);
        this.f31873f = omVarA;
        return omVarA;
    }

    public final Map<Class<?>, Object> c() {
        return this.f31872e;
    }

    public final kf0 d() {
        return this.f31870c;
    }

    public final boolean e() {
        return this.f31868a.h();
    }

    public final String f() {
        return this.f31869b;
    }

    public final rh0 g() {
        return this.f31868a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f31869b);
        sb.append(", url=");
        sb.append(this.f31868a);
        if (this.f31870c.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (b9.l<? extends String, ? extends String> lVar : this.f31870c) {
                int i10 = i + 1;
                if (i < 0) {
                    C2092m.a0();
                    throw null;
                }
                b9.l<? extends String, ? extends String> lVar2 = lVar;
                String str = (String) lVar2.f18083b;
                String str2 = (String) lVar2.f18084c;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i10;
            }
            sb.append(']');
        }
        if (!this.f31872e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f31872e);
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }

    public final String a(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        return this.f31870c.a(name);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private rh0 f31874a;

        /* renamed from: b, reason: collision with root package name */
        private String f31875b;

        /* renamed from: c, reason: collision with root package name */
        private kf0.a f31876c;

        /* renamed from: d, reason: collision with root package name */
        private sp1 f31877d;

        /* renamed from: e, reason: collision with root package name */
        private Map<Class<?>, Object> f31878e;

        public a() {
            this.f31878e = new LinkedHashMap();
            this.f31875b = "GET";
            this.f31876c = new kf0.a();
        }

        public final void a(String name, String value) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(value, "value");
            kf0.a aVar = this.f31876c;
            aVar.getClass();
            kf0.b.b(name);
            kf0.b.b(value, name);
            aVar.a(name, value);
        }

        public final a b(String name, String value) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(value, "value");
            kf0.a aVar = this.f31876c;
            aVar.getClass();
            kf0.b.b(name);
            kf0.b.b(value, name);
            aVar.a(name);
            aVar.a(name, value);
            return this;
        }

        public a(pp1 request) {
            LinkedHashMap linkedHashMapU;
            kotlin.jvm.internal.l.f(request, "request");
            this.f31878e = new LinkedHashMap();
            this.f31874a = request.g();
            this.f31875b = request.f();
            this.f31877d = request.a();
            if (request.c().isEmpty()) {
                linkedHashMapU = new LinkedHashMap();
            } else {
                linkedHashMapU = C2078B.u(request.c());
            }
            this.f31878e = linkedHashMapU;
            this.f31876c = request.d().b();
        }

        public final pp1 a() {
            Map mapUnmodifiableMap;
            rh0 rh0Var = this.f31874a;
            if (rh0Var != null) {
                String str = this.f31875b;
                kf0 kf0VarA = this.f31876c.a();
                sp1 sp1Var = this.f31877d;
                Map<Class<?>, Object> map = this.f31878e;
                byte[] bArr = t82.f33480a;
                kotlin.jvm.internal.l.f(map, "<this>");
                if (map.isEmpty()) {
                    mapUnmodifiableMap = C2100u.f18582b;
                } else {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                    kotlin.jvm.internal.l.c(mapUnmodifiableMap);
                }
                return new pp1(rh0Var, str, kf0VarA, sp1Var, mapUnmodifiableMap);
            }
            throw new IllegalStateException("url == null");
        }

        public final void a(om cacheControl) {
            kotlin.jvm.internal.l.f(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                this.f31876c.a("Cache-Control");
                return;
            }
            kf0.a aVar = this.f31876c;
            aVar.getClass();
            kf0.b.b("Cache-Control");
            kf0.b.b(string, "Cache-Control");
            aVar.a("Cache-Control");
            aVar.a("Cache-Control", string);
        }

        public final a a(kf0 headers) {
            kotlin.jvm.internal.l.f(headers, "headers");
            this.f31876c = headers.b();
            return this;
        }

        public final a a(String method, sp1 sp1Var) {
            kotlin.jvm.internal.l.f(method, "method");
            if (method.length() > 0) {
                if (sp1Var == null) {
                    if (kh0.b(method)) {
                        throw new IllegalArgumentException(C1154e9.i("method ", method, " must have a request body.").toString());
                    }
                } else if (!kh0.a(method)) {
                    throw new IllegalArgumentException(C1154e9.i("method ", method, " must not have a request body.").toString());
                }
                this.f31875b = method;
                this.f31877d = sp1Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true");
        }

        public final void a(String name) {
            kotlin.jvm.internal.l.f(name, "name");
            this.f31876c.a(name);
        }

        public final a a(rh0 url) {
            kotlin.jvm.internal.l.f(url, "url");
            this.f31874a = url;
            return this;
        }

        public final a a(URL url) {
            kotlin.jvm.internal.l.f(url, "url");
            String string = url.toString();
            kotlin.jvm.internal.l.e(string, "toString(...)");
            rh0 url2 = new rh0.a().a(null, string).a();
            kotlin.jvm.internal.l.f(url2, "url");
            this.f31874a = url2;
            return this;
        }
    }
}
