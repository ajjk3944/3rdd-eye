package lr;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class h extends t1 {

    /* renamed from: d, reason: collision with root package name */
    public final Method f15619d;

    public h(Method method) {
        br.l.e(method, "method");
        this.f15619d = method;
    }

    @Override // lr.t1
    public final String i() {
        return t1.g(this.f15619d);
    }
}
