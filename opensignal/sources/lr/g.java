package lr;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class g extends t1 {

    /* renamed from: d, reason: collision with root package name */
    public final Constructor f15616d;

    public g(Constructor constructor) {
        br.l.e(constructor, "constructor");
        this.f15616d = constructor;
    }

    @Override // lr.t1
    public final String i() {
        Class<?>[] parameterTypes = this.f15616d.getParameterTypes();
        br.l.d(parameterTypes, "constructor.parameterTypes");
        return mq.l.u0(parameterTypes, "<init>(", ")V", b.f15599y, 24);
    }
}
