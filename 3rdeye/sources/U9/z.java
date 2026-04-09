package U9;

import N7.C1154e9;
import U9.s;
import U9.t;
import c9.C2078B;
import c9.C2092m;
import c9.C2100u;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Request.kt */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final t f12795a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12796b;

    /* renamed from: c, reason: collision with root package name */
    public final s f12797c;

    /* renamed from: d, reason: collision with root package name */
    public final D f12798d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, Object> f12799e;

    /* renamed from: f, reason: collision with root package name */
    public C1607d f12800f;

    /* compiled from: Request.kt */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public t f12801a;

        /* renamed from: d, reason: collision with root package name */
        public D f12804d;

        /* renamed from: e, reason: collision with root package name */
        public LinkedHashMap f12805e = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public String f12802b = "GET";

        /* renamed from: c, reason: collision with root package name */
        public s.a f12803c = new s.a();

        public final void a(String str, String value) {
            kotlin.jvm.internal.l.f(value, "value");
            this.f12803c.a(str, value);
        }

        public final z b() {
            Map mapUnmodifiableMap;
            t tVar = this.f12801a;
            if (tVar == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.f12802b;
            s sVarD = this.f12803c.d();
            D d10 = this.f12804d;
            LinkedHashMap linkedHashMap = this.f12805e;
            byte[] bArr = V9.b.f13053a;
            kotlin.jvm.internal.l.f(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                mapUnmodifiableMap = C2100u.f18582b;
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                kotlin.jvm.internal.l.e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new z(tVar, str, sVarD, d10, mapUnmodifiableMap);
        }

        public final void c(String str, String value) {
            kotlin.jvm.internal.l.f(value, "value");
            s.a aVar = this.f12803c;
            aVar.getClass();
            s.b.a(str);
            s.b.b(value, str);
            aVar.f(str);
            aVar.c(str, value);
        }

        public final void d(String method, D d10) {
            kotlin.jvm.internal.l.f(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (d10 == null) {
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(C1154e9.i("method ", method, " must have a request body.").toString());
                }
            } else if (!E.u.K(method)) {
                throw new IllegalArgumentException(C1154e9.i("method ", method, " must not have a request body.").toString());
            }
            this.f12802b = method;
            this.f12804d = d10;
        }

        public final void e(Class type, Object obj) {
            kotlin.jvm.internal.l.f(type, "type");
            if (obj == null) {
                this.f12805e.remove(type);
                return;
            }
            if (this.f12805e.isEmpty()) {
                this.f12805e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f12805e;
            Object objCast = type.cast(obj);
            kotlin.jvm.internal.l.c(objCast);
            linkedHashMap.put(type, objCast);
        }

        public final void f(String url) {
            kotlin.jvm.internal.l.f(url, "url");
            if (y9.n.a0(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = "http:".concat(strSubstring);
            } else if (y9.n.a0(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                kotlin.jvm.internal.l.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = "https:".concat(strSubstring2);
            }
            kotlin.jvm.internal.l.f(url, "<this>");
            t.a aVar = new t.a();
            aVar.c(null, url);
            this.f12801a = aVar.a();
        }
    }

    public z(t url, String method, s sVar, D d10, Map<Class<?>, ? extends Object> map) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(method, "method");
        this.f12795a = url;
        this.f12796b = method;
        this.f12797c = sVar;
        this.f12798d = d10;
        this.f12799e = map;
    }

    public final a a() {
        a aVar = new a();
        aVar.f12805e = new LinkedHashMap();
        aVar.f12801a = this.f12795a;
        aVar.f12802b = this.f12796b;
        aVar.f12804d = this.f12798d;
        Map<Class<?>, Object> map = this.f12799e;
        aVar.f12805e = map.isEmpty() ? new LinkedHashMap() : C2078B.u(map);
        aVar.f12803c = this.f12797c.e();
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f12796b);
        sb.append(", url=");
        sb.append(this.f12795a);
        s sVar = this.f12797c;
        if (sVar.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (b9.l<? extends String, ? extends String> lVar : sVar) {
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
        Map<Class<?>, Object> map = this.f12799e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
