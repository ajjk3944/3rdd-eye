package Fh;

import Gh.AbstractC2914f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f6684a = new m();

    private m() {
    }

    public final String a(Constructor constructor) {
        AbstractC6492s.i(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = AbstractC6477c.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            AbstractC6492s.f(cls);
            sb2.append(AbstractC2914f.f(cls));
        }
        sb2.append(")V");
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public final String b(Field field) {
        AbstractC6492s.i(field, "field");
        Class<?> type = field.getType();
        AbstractC6492s.h(type, "getType(...)");
        return AbstractC2914f.f(type);
    }

    public final String c(Method method) {
        AbstractC6492s.i(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = AbstractC6477c.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            AbstractC6492s.f(cls);
            sb2.append(AbstractC2914f.f(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        AbstractC6492s.h(returnType, "getReturnType(...)");
        sb2.append(AbstractC2914f.f(returnType));
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
