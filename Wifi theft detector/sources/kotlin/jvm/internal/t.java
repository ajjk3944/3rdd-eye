package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes4.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final u f22043a;

    /* renamed from: b, reason: collision with root package name */
    public static final r9.c[] f22044b;

    static {
        u uVar = null;
        try {
            uVar = (u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new u();
        }
        f22043a = uVar;
        f22044b = new r9.c[0];
    }

    public static r9.g a(FunctionReference functionReference) {
        return f22043a.a(functionReference);
    }

    public static r9.c b(Class cls) {
        return f22043a.b(cls);
    }

    public static r9.f c(Class cls) {
        return f22043a.c(cls, "");
    }

    public static r9.p d(r9.p pVar) {
        return f22043a.d(pVar);
    }

    public static r9.i e(MutablePropertyReference0 mutablePropertyReference0) {
        return f22043a.e(mutablePropertyReference0);
    }

    public static r9.j f(MutablePropertyReference1 mutablePropertyReference1) {
        return f22043a.f(mutablePropertyReference1);
    }

    public static r9.k g(MutablePropertyReference2 mutablePropertyReference2) {
        return f22043a.g(mutablePropertyReference2);
    }

    public static r9.m h(PropertyReference0 propertyReference0) {
        return f22043a.h(propertyReference0);
    }

    public static r9.n i(PropertyReference1 propertyReference1) {
        return f22043a.i(propertyReference1);
    }

    public static r9.o j(PropertyReference2 propertyReference2) {
        return f22043a.j(propertyReference2);
    }

    public static String k(m mVar) {
        return f22043a.k(mVar);
    }

    public static String l(Lambda lambda) {
        return f22043a.l(lambda);
    }

    public static r9.p m(Class cls) {
        return f22043a.m(b(cls), Collections.EMPTY_LIST, false);
    }

    public static r9.p n(Class cls, r9.q qVar) {
        return f22043a.m(b(cls), Collections.singletonList(qVar), false);
    }

    public static r9.p o(Class cls, r9.q qVar, r9.q qVar2) {
        return f22043a.m(b(cls), Arrays.asList(qVar, qVar2), false);
    }
}
