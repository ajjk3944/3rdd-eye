package Mj;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Class f13358a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13359b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f13360c;

    /* renamed from: d, reason: collision with root package name */
    private final List f13361d;

    n(Class cls, Object obj, Method method, List list) {
        this.f13358a = cls;
        this.f13359b = obj;
        this.f13360c = method;
        this.f13361d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f13360c;
    }

    public Class b() {
        return this.f13358a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f13358a.getName(), this.f13360c.getName(), this.f13361d);
    }
}
