package km;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f28471y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f28472z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a, reason: collision with root package name */
    public final va.o f28473a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f28474b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f28475c;

    /* renamed from: d, reason: collision with root package name */
    public final Annotation[] f28476d;

    /* renamed from: e, reason: collision with root package name */
    public final Annotation[][] f28477e;

    /* renamed from: f, reason: collision with root package name */
    public final Type[] f28478f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28479h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28480i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28481k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f28482l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28483m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28484n;

    /* renamed from: o, reason: collision with root package name */
    public String f28485o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28486p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28487q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f28488r;

    /* renamed from: s, reason: collision with root package name */
    public String f28489s;

    /* renamed from: t, reason: collision with root package name */
    public rl.m f28490t;

    /* renamed from: u, reason: collision with root package name */
    public rl.p f28491u;

    /* renamed from: v, reason: collision with root package name */
    public LinkedHashSet f28492v;

    /* renamed from: w, reason: collision with root package name */
    public c1[] f28493w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28494x;

    public t0(va.o oVar, Class cls, Method method) {
        this.f28473a = oVar;
        this.f28474b = cls;
        this.f28475c = method;
        this.f28476d = method.getAnnotations();
        this.f28478f = method.getGenericParameterTypes();
        this.f28477e = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z3) {
        String str3 = this.f28485o;
        Method method = this.f28475c;
        if (str3 != null) {
            throw c1.l(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f28485o = str;
        this.f28486p = z3;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f28471y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw c1.l(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f28489s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f28492v = linkedHashSet;
    }

    public final void c(int i4, Type type) {
        if (c1.j(type)) {
            throw c1.m(this.f28475c, i4, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
