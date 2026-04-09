package lr;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends t1 {

    /* renamed from: d, reason: collision with root package name */
    public final List f15611d;

    public f(Class cls) throws SecurityException {
        br.l.e(cls, "jClass");
        Object[] declaredMethods = cls.getDeclaredMethods();
        br.l.d(declaredMethods, "jClass.declaredMethods");
        dv.h hVar = new dv.h(9);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            br.l.d(declaredMethods, "copyOf(...)");
            mq.l.y0(declaredMethods, hVar);
        }
        this.f15611d = mq.l.X(declaredMethods);
    }

    @Override // lr.t1
    public final String i() {
        return mq.o.x0(this.f15611d, "", "<init>(", ")V", b.f15598x, 24);
    }
}
