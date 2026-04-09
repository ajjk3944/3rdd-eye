package sa;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Invocation.java */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Method f46217a;

    /* renamed from: b, reason: collision with root package name */
    public final List<?> f46218b;

    public k(Method method, ArrayList arrayList) {
        this.f46217a = method;
        this.f46218b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f46217a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f46218b);
    }
}
