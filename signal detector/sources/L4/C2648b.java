package l4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2648b extends R3.b {

    /* renamed from: d, reason: collision with root package name */
    public final Method f21859d = Class.class.getMethod("isRecord", null);

    /* renamed from: e, reason: collision with root package name */
    public final Method f21860e = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: f, reason: collision with root package name */
    public final Method f21861f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f21862g;

    public C2648b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f21861f = cls.getMethod("getName", null);
        this.f21862g = cls.getMethod("getType", null);
    }

    @Override // R3.b
    public final Method k(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override // R3.b
    public final Constructor l(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f21860e.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f21862g.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override // R3.b
    public final String[] o(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f21860e.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f21861f.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override // R3.b
    public final boolean t(Class cls) {
        try {
            return ((Boolean) this.f21859d.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }
}
