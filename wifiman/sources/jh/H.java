package Jh;

import Zh.b;
import kotlin.jvm.internal.AbstractC6492s;
import vi.AbstractC8233a;

/* loaded from: classes4.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f10097a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final Zh.c f10098b;

    /* renamed from: c, reason: collision with root package name */
    public static final Zh.b f10099c;

    /* renamed from: d, reason: collision with root package name */
    private static final Zh.b f10100d;

    /* renamed from: e, reason: collision with root package name */
    private static final Zh.b f10101e;

    static {
        Zh.c cVar = new Zh.c("kotlin.jvm.JvmField");
        f10098b = cVar;
        b.a aVar = Zh.b.f25401d;
        f10099c = aVar.c(cVar);
        f10100d = aVar.c(new Zh.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f10101e = b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private H() {
    }

    public static final String b(String propertyName) {
        AbstractC6492s.i(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return "get" + AbstractC8233a.a(propertyName);
    }

    public static final boolean c(String name) {
        AbstractC6492s.i(name, "name");
        return kotlin.text.t.P(name, "get", false, 2, null) || kotlin.text.t.P(name, "is", false, 2, null);
    }

    public static final boolean d(String name) {
        AbstractC6492s.i(name, "name");
        return kotlin.text.t.P(name, "set", false, 2, null);
    }

    public static final String e(String propertyName) {
        String strA;
        AbstractC6492s.i(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(propertyName)) {
            strA = propertyName.substring(2);
            AbstractC6492s.h(strA, "substring(...)");
        } else {
            strA = AbstractC8233a.a(propertyName);
        }
        sb2.append(strA);
        return sb2.toString();
    }

    public static final boolean f(String name) {
        AbstractC6492s.i(name, "name");
        if (!kotlin.text.t.P(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return AbstractC6492s.k(97, cCharAt) > 0 || AbstractC6492s.k(cCharAt, 122) > 0;
    }

    public final Zh.b a() {
        return f10101e;
    }
}
