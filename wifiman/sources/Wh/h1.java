package wh;

import Gh.AbstractC2914f;
import Zg.AbstractC3682n;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class h1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Class cls) {
        AbstractC6492s.f(cls);
        return AbstractC2914f.f(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC6492s.h(parameterTypes, "getParameterTypes(...)");
        sb2.append(AbstractC3682n.I0(parameterTypes, "", "(", ")", 0, null, g1.f65146a, 24, null));
        Class<?> returnType = method.getReturnType();
        AbstractC6492s.h(returnType, "getReturnType(...)");
        sb2.append(AbstractC2914f.f(returnType));
        return sb2.toString();
    }
}
