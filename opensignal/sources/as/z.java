package as;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final qs.c f2263a;

    /* renamed from: b, reason: collision with root package name */
    public static final qs.b f2264b;

    static {
        qs.c cVar = new qs.c("kotlin.jvm.JvmField");
        f2263a = cVar;
        qs.b.j(cVar);
        qs.b.j(new qs.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f2264b = qs.b.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        br.l.e(str, "propertyName");
        if (c(str)) {
            return str;
        }
        return "get" + xu.l.d(str);
    }

    public static final String b(String str) {
        String strD;
        StringBuilder sb2 = new StringBuilder("set");
        if (c(str)) {
            strD = str.substring(2);
            br.l.d(strD, "this as java.lang.String).substring(startIndex)");
        } else {
            strD = xu.l.d(str);
        }
        sb2.append(strD);
        return sb2.toString();
    }

    public static final boolean c(String str) {
        br.l.e(str, "name");
        if (tt.s.n0(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (br.l.g(97, cCharAt) > 0 || br.l.g(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
