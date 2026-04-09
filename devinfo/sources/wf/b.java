package wf;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final Method f36635a = Class.class.getMethod("isRecord", null);

    /* renamed from: b, reason: collision with root package name */
    public final Method f36636b = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: c, reason: collision with root package name */
    public final Method f36637c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f36638d;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f36637c = cls.getMethod("getName", null);
        this.f36638d = cls.getMethod("getType", null);
    }

    @Override // me.t1
    public final Method l(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // me.t1
    public final Constructor m(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f36636b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i4 = 0; i4 < objArr.length; i4++) {
                clsArr[i4] = (Class) this.f36638d.invoke(objArr[i4], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // me.t1
    public final String[] q(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f36636b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i4 = 0; i4 < objArr.length; i4++) {
                strArr[i4] = (String) this.f36637c.invoke(objArr[i4], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // me.t1
    public final boolean u(Class cls) {
        try {
            return ((Boolean) this.f36635a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }
}
