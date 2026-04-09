package lr;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class l extends t1 {

    /* renamed from: d, reason: collision with root package name */
    public final Method f15632d;

    /* renamed from: g, reason: collision with root package name */
    public final Method f15633g;

    public l(Method method, Method method2) {
        br.l.e(method, "getterMethod");
        this.f15632d = method;
        this.f15633g = method2;
    }

    @Override // lr.t1
    public final String i() {
        return t1.g(this.f15632d);
    }
}
