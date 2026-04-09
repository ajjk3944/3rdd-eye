package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    final s f18129a;

    /* renamed from: b, reason: collision with root package name */
    final String f18130b;

    /* renamed from: c, reason: collision with root package name */
    final r f18131c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    final z f18132d;

    /* renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f18133e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private volatile c f18134f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        s f18135a;

        /* renamed from: b, reason: collision with root package name */
        String f18136b;

        /* renamed from: c, reason: collision with root package name */
        r.a f18137c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        z f18138d;

        /* renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f18139e;

        public a() {
            this.f18139e = Collections.EMPTY_MAP;
            this.f18136b = "GET";
            this.f18137c = new r.a();
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f18135a = sVar;
            return this;
        }

        public a b(String str) {
            String str2;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str.substring(4);
            } else {
                str2 = str;
            }
            return a(s.b(str2));
        }

        public a c() {
            return a("GET", (z) null);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a c(z zVar) {
            return a("POST", zVar);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }

        public a a(String str, String str2) {
            this.f18137c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.f18137c.b(str);
            return this;
        }

        public a(y yVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f18139e = map;
            this.f18135a = yVar.f18129a;
            this.f18136b = yVar.f18130b;
            this.f18138d = yVar.f18132d;
            this.f18139e = yVar.f18133e.isEmpty() ? map : new LinkedHashMap<>(yVar.f18133e);
            this.f18137c = yVar.f18131c.a();
        }

        public a a(r rVar) {
            this.f18137c = rVar.a();
            return this;
        }

        public a a(c cVar) {
            String string = cVar.toString();
            return string.isEmpty() ? a("Cache-Control") : b("Cache-Control", string);
        }

        public a b(String str, String str2) {
            this.f18137c.c(str, str2);
            return this;
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.f17629d);
        }

        public a a(@Nullable z zVar) {
            return a("DELETE", zVar);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public a a(String str, @Nullable z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.f18136b = str;
                    this.f18138d = zVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public y a() {
            if (this.f18135a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public y(a aVar) {
        this.f18129a = aVar.f18135a;
        this.f18130b = aVar.f18136b;
        this.f18131c = aVar.f18137c.a();
        this.f18132d = aVar.f18138d;
        this.f18133e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.f18139e);
    }

    @Nullable
    public String a(String str) {
        return this.f18131c.b(str);
    }

    public c b() {
        c cVar = this.f18134f;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f18131c);
        this.f18134f = cVarA;
        return cVarA;
    }

    public r c() {
        return this.f18131c;
    }

    public boolean d() {
        return this.f18129a.h();
    }

    public String e() {
        return this.f18130b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.f18129a;
    }

    public String toString() {
        return "Request{method=" + this.f18130b + ", url=" + this.f18129a + ", tags=" + this.f18133e + '}';
    }

    @Nullable
    public z a() {
        return this.f18132d;
    }
}
