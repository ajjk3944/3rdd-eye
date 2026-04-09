package mr;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r extends q implements f {

    /* renamed from: g, reason: collision with root package name */
    public final Object f16973g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Method method, Object obj) {
        super(method, false, 4);
        br.l.e(method, "method");
        this.f16973g = obj;
    }

    @Override // mr.q, mr.g
    public final Object s(Object[] objArr) {
        br.l.e(objArr, "args");
        io.sentry.config.a.F(this, objArr);
        return e(this.f16973g, objArr);
    }
}
