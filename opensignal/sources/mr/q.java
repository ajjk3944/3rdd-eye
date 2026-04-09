package mr;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import lq.b0;

/* loaded from: classes.dex */
public abstract class q extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16971e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16972f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(Method method, boolean z10, int i10) {
        z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        br.l.d(genericParameterTypes, "method.genericParameterTypes");
        this(method, z10, genericParameterTypes);
    }

    @Override // mr.v
    public void c(Object[] objArr) {
        switch (this.f16971e) {
            case 0:
                br.l.e(objArr, "args");
                io.sentry.config.a.F(this, objArr);
                if (this.f16972f && mq.l.v0(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.c(objArr);
                return;
        }
    }

    public Object e(Object obj, Object[] objArr) {
        br.l.e(objArr, "args");
        return this.f16972f ? b0.f15562a : ((Method) this.f16976a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // mr.g
    public Object s(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        br.l.e(objArr, "args");
        c(objArr);
        ((Field) this.f16976a).set(this.f16978c != null ? mq.l.m0(objArr) : null, mq.l.v0(objArr));
        return b0.f15562a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Method method, boolean z10, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        br.l.d(genericReturnType, "method.genericReturnType");
        super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr);
        this.f16972f = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Field field, boolean z10, boolean z11) {
        Class cls = Void.TYPE;
        br.l.d(cls, "TYPE");
        Class<?> declaringClass = z11 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        br.l.d(genericType, "field.genericType");
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f16972f = z10;
    }
}
