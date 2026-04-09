package sa;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: RequestFactory.java */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Method f46299a;

    /* renamed from: b, reason: collision with root package name */
    public final U9.t f46300b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46301c;

    /* renamed from: d, reason: collision with root package name */
    public final String f46302d;

    /* renamed from: e, reason: collision with root package name */
    public final U9.s f46303e;

    /* renamed from: f, reason: collision with root package name */
    public final U9.v f46304f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f46305g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f46306h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final q<?>[] f46307j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f46308k;

    /* compiled from: RequestFactory.java */
    public static final class a {

        /* renamed from: x, reason: collision with root package name */
        public static final Pattern f46309x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y, reason: collision with root package name */
        public static final Pattern f46310y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a, reason: collision with root package name */
        public final w f46311a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f46312b;

        /* renamed from: c, reason: collision with root package name */
        public final Annotation[] f46313c;

        /* renamed from: d, reason: collision with root package name */
        public final Annotation[][] f46314d;

        /* renamed from: e, reason: collision with root package name */
        public final Type[] f46315e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f46316f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f46317g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f46318h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f46319j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f46320k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f46321l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f46322m;

        /* renamed from: n, reason: collision with root package name */
        public String f46323n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f46324o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f46325p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f46326q;

        /* renamed from: r, reason: collision with root package name */
        public String f46327r;

        /* renamed from: s, reason: collision with root package name */
        public U9.s f46328s;

        /* renamed from: t, reason: collision with root package name */
        public U9.v f46329t;

        /* renamed from: u, reason: collision with root package name */
        public LinkedHashSet f46330u;

        /* renamed from: v, reason: collision with root package name */
        public q<?>[] f46331v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f46332w;

        public a(w wVar, Method method) {
            this.f46311a = wVar;
            this.f46312b = method;
            this.f46313c = method.getAnnotations();
            this.f46315e = method.getGenericParameterTypes();
            this.f46314d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f46323n;
            Method method = this.f46312b;
            if (str3 != null) {
                throw A.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f46323n = str;
            this.f46324o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = f46309x;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw A.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f46327r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f46330u = linkedHashSet;
        }

        public final void c(int i, Type type) {
            if (A.g(type)) {
                throw A.j(this.f46312b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public t(a aVar) {
        this.f46299a = aVar.f46312b;
        this.f46300b = aVar.f46311a.f46340c;
        this.f46301c = aVar.f46323n;
        this.f46302d = aVar.f46327r;
        this.f46303e = aVar.f46328s;
        this.f46304f = aVar.f46329t;
        this.f46305g = aVar.f46324o;
        this.f46306h = aVar.f46325p;
        this.i = aVar.f46326q;
        this.f46307j = aVar.f46331v;
        this.f46308k = aVar.f46332w;
    }
}
