package Mj;

import Mj.r;
import dh.InterfaceC5380e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;

/* loaded from: classes2.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Class f13456a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f13457b;

    /* renamed from: c, reason: collision with root package name */
    private final HttpUrl f13458c;

    /* renamed from: d, reason: collision with root package name */
    final String f13459d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13460e;

    /* renamed from: f, reason: collision with root package name */
    private final Headers f13461f;

    /* renamed from: g, reason: collision with root package name */
    private final MediaType f13462g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f13463h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f13464i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f13465j;

    /* renamed from: k, reason: collision with root package name */
    private final r[] f13466k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f13467l;

    static final class a {

        /* renamed from: y, reason: collision with root package name */
        private static final Pattern f13468y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z, reason: collision with root package name */
        private static final Pattern f13469z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a, reason: collision with root package name */
        final x f13470a;

        /* renamed from: b, reason: collision with root package name */
        final Class f13471b;

        /* renamed from: c, reason: collision with root package name */
        final Method f13472c;

        /* renamed from: d, reason: collision with root package name */
        final Annotation[] f13473d;

        /* renamed from: e, reason: collision with root package name */
        final Annotation[][] f13474e;

        /* renamed from: f, reason: collision with root package name */
        final Type[] f13475f;

        /* renamed from: g, reason: collision with root package name */
        boolean f13476g;

        /* renamed from: h, reason: collision with root package name */
        boolean f13477h;

        /* renamed from: i, reason: collision with root package name */
        boolean f13478i;

        /* renamed from: j, reason: collision with root package name */
        boolean f13479j;

        /* renamed from: k, reason: collision with root package name */
        boolean f13480k;

        /* renamed from: l, reason: collision with root package name */
        boolean f13481l;

        /* renamed from: m, reason: collision with root package name */
        boolean f13482m;

        /* renamed from: n, reason: collision with root package name */
        boolean f13483n;

        /* renamed from: o, reason: collision with root package name */
        String f13484o;

        /* renamed from: p, reason: collision with root package name */
        boolean f13485p;

        /* renamed from: q, reason: collision with root package name */
        boolean f13486q;

        /* renamed from: r, reason: collision with root package name */
        boolean f13487r;

        /* renamed from: s, reason: collision with root package name */
        String f13488s;

        /* renamed from: t, reason: collision with root package name */
        Headers f13489t;

        /* renamed from: u, reason: collision with root package name */
        MediaType f13490u;

        /* renamed from: v, reason: collision with root package name */
        Set f13491v;

        /* renamed from: w, reason: collision with root package name */
        r[] f13492w;

        /* renamed from: x, reason: collision with root package name */
        boolean f13493x;

        a(x xVar, Class cls, Method method) {
            this.f13470a = xVar;
            this.f13471b = cls;
            this.f13472c = method;
            this.f13473d = method.getAnnotations();
            this.f13475f = method.getGenericParameterTypes();
            this.f13474e = method.getParameterAnnotations();
        }

        private static Class a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private Headers c(String[] strArr, boolean z10) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw B.n(this.f13472c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f13490u = MediaType.e(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw B.o(this.f13472c, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z10) {
                    builder.e(strSubstring, strTrim);
                } else {
                    builder.a(strSubstring, strTrim);
                }
            }
            return builder.f();
        }

        private void d(String str, String str2, boolean z10) {
            String str3 = this.f13484o;
            if (str3 != null) {
                throw B.n(this.f13472c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f13484o = str;
            this.f13485p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f13468y.matcher(strSubstring).find()) {
                    throw B.n(this.f13472c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f13488s = str2;
            this.f13491v = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof Rj.b) {
                d("DELETE", ((Rj.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof Rj.f) {
                d("GET", ((Rj.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof Rj.g) {
                d("HEAD", ((Rj.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof Rj.n) {
                d("PATCH", ((Rj.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof Rj.o) {
                d("POST", ((Rj.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof Rj.p) {
                d("PUT", ((Rj.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof Rj.m) {
                d("OPTIONS", ((Rj.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof Rj.h) {
                Rj.h hVar = (Rj.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof Rj.k) {
                Rj.k kVar = (Rj.k) annotation;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw B.n(this.f13472c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f13489t = c(strArrValue, kVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof Rj.l) {
                if (this.f13486q) {
                    throw B.n(this.f13472c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f13487r = true;
            } else if (annotation instanceof Rj.e) {
                if (this.f13487r) {
                    throw B.n(this.f13472c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f13486q = true;
            }
        }

        private r f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            r rVar;
            if (annotationArr != null) {
                rVar = null;
                for (Annotation annotation : annotationArr) {
                    r rVarG = g(i10, type, annotationArr, annotation);
                    if (rVarG != null) {
                        if (rVar != null) {
                            throw B.p(this.f13472c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        rVar = rVarG;
                    }
                }
            } else {
                rVar = null;
            }
            if (rVar != null) {
                return rVar;
            }
            if (z10) {
                try {
                    if (B.h(type) == InterfaceC5380e.class) {
                        this.f13493x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw B.p(this.f13472c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        private r g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Rj.y) {
                j(i10, type);
                if (this.f13483n) {
                    throw B.p(this.f13472c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f13479j) {
                    throw B.p(this.f13472c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f13480k) {
                    throw B.p(this.f13472c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f13481l) {
                    throw B.p(this.f13472c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f13482m) {
                    throw B.p(this.f13472c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f13488s != null) {
                    throw B.p(this.f13472c, i10, "@Url cannot be used with @%s URL", this.f13484o);
                }
                this.f13483n = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new r.p(this.f13472c, i10);
                }
                throw B.p(this.f13472c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof Rj.s) {
                j(i10, type);
                if (this.f13480k) {
                    throw B.p(this.f13472c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f13481l) {
                    throw B.p(this.f13472c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f13482m) {
                    throw B.p(this.f13472c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f13483n) {
                    throw B.p(this.f13472c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f13488s == null) {
                    throw B.p(this.f13472c, i10, "@Path can only be used with relative url on @%s", this.f13484o);
                }
                this.f13479j = true;
                Rj.s sVar = (Rj.s) annotation;
                String strValue = sVar.value();
                i(i10, strValue);
                return new r.k(this.f13472c, i10, strValue, this.f13470a.i(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof Rj.t) {
                j(i10, type);
                Rj.t tVar = (Rj.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class clsH = B.h(type);
                this.f13480k = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    if (!clsH.isArray()) {
                        return new r.l(strValue2, this.f13470a.i(type, annotationArr), zEncoded);
                    }
                    return new r.l(strValue2, this.f13470a.i(a(clsH.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new r.l(strValue2, this.f13470a.i(B.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw B.p(this.f13472c, i10, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Rj.v) {
                j(i10, type);
                boolean zEncoded2 = ((Rj.v) annotation).encoded();
                Class clsH2 = B.h(type);
                this.f13481l = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    if (!clsH2.isArray()) {
                        return new r.n(this.f13470a.i(type, annotationArr), zEncoded2);
                    }
                    return new r.n(this.f13470a.i(a(clsH2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new r.n(this.f13470a.i(B.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw B.p(this.f13472c, i10, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Rj.u) {
                j(i10, type);
                Class clsH3 = B.h(type);
                this.f13482m = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw B.p(this.f13472c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = B.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw B.p(this.f13472c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = B.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new r.m(this.f13472c, i10, this.f13470a.i(B.g(1, parameterizedType), annotationArr), ((Rj.u) annotation).encoded());
                }
                throw B.p(this.f13472c, i10, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof Rj.i) {
                j(i10, type);
                Rj.i iVar = (Rj.i) annotation;
                String strValue3 = iVar.value();
                Class clsH4 = B.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    if (!clsH4.isArray()) {
                        return new r.f(strValue3, this.f13470a.i(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                    }
                    return new r.f(strValue3, this.f13470a.i(a(clsH4.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                }
                if (type instanceof ParameterizedType) {
                    return new r.f(strValue3, this.f13470a.i(B.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                }
                throw B.p(this.f13472c, i10, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Rj.j) {
                if (type == Headers.class) {
                    return new r.h(this.f13472c, i10);
                }
                j(i10, type);
                Class clsH5 = B.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw B.p(this.f13472c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeI2 = B.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw B.p(this.f13472c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = B.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new r.g(this.f13472c, i10, this.f13470a.i(B.g(1, parameterizedType2), annotationArr), ((Rj.j) annotation).allowUnsafeNonAsciiValues());
                }
                throw B.p(this.f13472c, i10, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof Rj.c) {
                j(i10, type);
                if (!this.f13486q) {
                    throw B.p(this.f13472c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Rj.c cVar = (Rj.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f13476g = true;
                Class clsH6 = B.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    if (!clsH6.isArray()) {
                        return new r.d(strValue4, this.f13470a.i(type, annotationArr), zEncoded3);
                    }
                    return new r.d(strValue4, this.f13470a.i(a(clsH6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new r.d(strValue4, this.f13470a.i(B.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw B.p(this.f13472c, i10, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Rj.d) {
                j(i10, type);
                if (!this.f13486q) {
                    throw B.p(this.f13472c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsH7 = B.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw B.p(this.f13472c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = B.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw B.p(this.f13472c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = B.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    h hVarI = this.f13470a.i(B.g(1, parameterizedType3), annotationArr);
                    this.f13476g = true;
                    return new r.e(this.f13472c, i10, hVarI, ((Rj.d) annotation).encoded());
                }
                throw B.p(this.f13472c, i10, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (!(annotation instanceof Rj.q)) {
                if (annotation instanceof Rj.r) {
                    j(i10, type);
                    if (!this.f13487r) {
                        throw B.p(this.f13472c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f13477h = true;
                    Class clsH8 = B.h(type);
                    if (!Map.class.isAssignableFrom(clsH8)) {
                        throw B.p(this.f13472c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeI4 = B.i(type, clsH8, Map.class);
                    if (!(typeI4 instanceof ParameterizedType)) {
                        throw B.p(this.f13472c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                    Type typeG4 = B.g(0, parameterizedType4);
                    if (String.class == typeG4) {
                        Type typeG5 = B.g(1, parameterizedType4);
                        if (MultipartBody.Part.class.isAssignableFrom(B.h(typeG5))) {
                            throw B.p(this.f13472c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new r.j(this.f13472c, i10, this.f13470a.g(typeG5, annotationArr, this.f13473d), ((Rj.r) annotation).encoding());
                    }
                    throw B.p(this.f13472c, i10, "@PartMap keys must be of type String: " + typeG4, new Object[0]);
                }
                if (annotation instanceof Rj.a) {
                    j(i10, type);
                    if (this.f13486q || this.f13487r) {
                        throw B.p(this.f13472c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f13478i) {
                        throw B.p(this.f13472c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        h hVarG = this.f13470a.g(type, annotationArr, this.f13473d);
                        this.f13478i = true;
                        return new r.c(this.f13472c, i10, hVarG);
                    } catch (RuntimeException e10) {
                        throw B.q(this.f13472c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof Rj.x)) {
                    return null;
                }
                j(i10, type);
                Class clsH9 = B.h(type);
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    r rVar = this.f13492w[i11];
                    if ((rVar instanceof r.q) && ((r.q) rVar).f13437a.equals(clsH9)) {
                        throw B.p(this.f13472c, i10, "@Tag type " + clsH9.getName() + " is duplicate of " + s.f13439b.a(this.f13472c, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new r.q(clsH9);
            }
            j(i10, type);
            if (!this.f13487r) {
                throw B.p(this.f13472c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            Rj.q qVar = (Rj.q) annotation;
            this.f13477h = true;
            String strValue5 = qVar.value();
            Class clsH10 = B.h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsH10)) {
                    if (clsH10.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(clsH10.getComponentType())) {
                            return r.o.f13434a.b();
                        }
                        throw B.p(this.f13472c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (MultipartBody.Part.class.isAssignableFrom(clsH10)) {
                        return r.o.f13434a;
                    }
                    throw B.p(this.f13472c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (MultipartBody.Part.class.isAssignableFrom(B.h(B.g(0, (ParameterizedType) type)))) {
                        return r.o.f13434a.c();
                    }
                    throw B.p(this.f13472c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw B.p(this.f13472c, i10, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
            }
            Headers headersI = Headers.i("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsH10)) {
                if (!clsH10.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(clsH10)) {
                        throw B.p(this.f13472c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new r.i(this.f13472c, i10, headersI, this.f13470a.g(type, annotationArr, this.f13473d));
                }
                Class clsA = a(clsH10.getComponentType());
                if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                    throw B.p(this.f13472c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new r.i(this.f13472c, i10, headersI, this.f13470a.g(clsA, annotationArr, this.f13473d)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeG6 = B.g(0, (ParameterizedType) type);
                if (MultipartBody.Part.class.isAssignableFrom(B.h(typeG6))) {
                    throw B.p(this.f13472c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new r.i(this.f13472c, i10, headersI, this.f13470a.g(typeG6, annotationArr, this.f13473d)).c();
            }
            throw B.p(this.f13472c, i10, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
        }

        static Set h(String str) {
            Matcher matcher = f13468y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i10, String str) {
            if (!f13469z.matcher(str).matches()) {
                throw B.p(this.f13472c, i10, "@Path parameter name must match %s. Found: %s", f13468y.pattern(), str);
            }
            if (!this.f13491v.contains(str)) {
                throw B.p(this.f13472c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f13488s, str);
            }
        }

        private void j(int i10, Type type) {
            if (B.j(type)) {
                throw B.p(this.f13472c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        v b() {
            for (Annotation annotation : this.f13473d) {
                e(annotation);
            }
            if (this.f13484o == null) {
                throw B.n(this.f13472c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f13485p) {
                if (this.f13487r) {
                    throw B.n(this.f13472c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f13486q) {
                    throw B.n(this.f13472c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f13474e.length;
            this.f13492w = new r[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f13492w[i11] = f(i11, this.f13475f[i11], this.f13474e[i11], i11 == i10);
                i11++;
            }
            if (this.f13488s == null && !this.f13483n) {
                throw B.n(this.f13472c, "Missing either @%s URL or @Url parameter.", this.f13484o);
            }
            boolean z10 = this.f13486q;
            if (!z10 && !this.f13487r && !this.f13485p && this.f13478i) {
                throw B.n(this.f13472c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f13476g) {
                throw B.n(this.f13472c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f13487r || this.f13477h) {
                return new v(this);
            }
            throw B.n(this.f13472c, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    v(a aVar) {
        this.f13456a = aVar.f13471b;
        this.f13457b = aVar.f13472c;
        this.f13458c = aVar.f13470a.f13499c;
        this.f13459d = aVar.f13484o;
        this.f13460e = aVar.f13488s;
        this.f13461f = aVar.f13489t;
        this.f13462g = aVar.f13490u;
        this.f13463h = aVar.f13485p;
        this.f13464i = aVar.f13486q;
        this.f13465j = aVar.f13487r;
        this.f13466k = aVar.f13492w;
        this.f13467l = aVar.f13493x;
    }

    static v b(x xVar, Class cls, Method method) {
        return new a(xVar, cls, method).b();
    }

    Request a(Object obj, Object[] objArr) {
        r[] rVarArr = this.f13466k;
        int length = objArr.length;
        if (length != rVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + rVarArr.length + ")");
        }
        u uVar = new u(this.f13459d, this.f13458c, this.f13460e, this.f13461f, this.f13462g, this.f13463h, this.f13464i, this.f13465j);
        if (this.f13467l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            rVarArr[i10].a(uVar, objArr[i10]);
        }
        return uVar.k().g(n.class, new n(this.f13456a, obj, this.f13457b, arrayList)).b();
    }
}
