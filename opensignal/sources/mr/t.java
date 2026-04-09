package mr;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends q implements f {

    /* renamed from: g, reason: collision with root package name */
    public final Object f16974g;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Method method, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        br.l.d(genericParameterTypes, "method.genericParameterTypes");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : mq.l.h0(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f16974g = obj;
    }

    @Override // mr.q, mr.g
    public final Object s(Object[] objArr) {
        br.l.e(objArr, "args");
        io.sentry.config.a.F(this, objArr);
        br.a0 a0Var = new br.a0(2);
        a0Var.a(this.f16974g);
        a0Var.c(objArr);
        ArrayList arrayList = a0Var.f2897a;
        return e(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
