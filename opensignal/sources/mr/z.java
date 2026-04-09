package mr;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Method f16984a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16985b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f16986c;

    public z(Method method, List list) {
        this.f16984a = method;
        this.f16985b = list;
        Class<?> returnType = method.getReturnType();
        br.l.d(returnType, "unboxMethod.returnType");
        this.f16986c = returnType;
    }

    @Override // mr.g
    public final List a() {
        return this.f16985b;
    }

    @Override // mr.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // mr.g
    public final Type i() {
        return this.f16986c;
    }
}
