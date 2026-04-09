package nk;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Type f18359a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f18360b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18361c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f18362d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18363e;

    /* renamed from: f, reason: collision with root package name */
    public final r[] f18364f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18365g;

    public d(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
        this.f18359a = ok.f.a(type);
        this.f18360b = set;
        this.f18361c = obj;
        this.f18362d = method;
        this.f18363e = i11;
        this.f18364f = new r[i10 - i11];
        this.f18365g = z10;
    }

    public void a(j0 j0Var, e eVar) {
        r[] rVarArr = this.f18364f;
        if (rVarArr.length > 0) {
            Method method = this.f18362d;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = genericParameterTypes.length;
            int i10 = this.f18363e;
            for (int i11 = i10; i11 < length; i11++) {
                Type type = ((ParameterizedType) genericParameterTypes[i11]).getActualTypeArguments()[0];
                Set setF = ok.f.f(parameterAnnotations[i11]);
                rVarArr[i11 - i10] = (p0.b(this.f18359a, type) && this.f18360b.equals(setF)) ? j0Var.c(eVar, type, setF) : j0Var.b(type, setF, null);
            }
        }
    }

    public Object b(w wVar) {
        throw new AssertionError();
    }

    public final Object c(Object obj) {
        r[] rVarArr = this.f18364f;
        Object[] objArr = new Object[rVarArr.length + 1];
        objArr[0] = obj;
        System.arraycopy(rVarArr, 0, objArr, 1, rVarArr.length);
        try {
            return this.f18362d.invoke(this.f18361c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public void d(c0 c0Var, Object obj) {
        throw new AssertionError();
    }
}
