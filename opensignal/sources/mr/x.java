package mr;

import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x extends z implements f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f16983d;

    public x(Method method, Object obj) {
        super(method, mq.w.f16945a);
        this.f16983d = obj;
    }

    @Override // mr.g
    public final Object s(Object[] objArr) {
        br.l.e(objArr, "args");
        io.sentry.config.a.F(this, objArr);
        return this.f16984a.invoke(this.f16983d, Arrays.copyOf(objArr, objArr.length));
    }
}
