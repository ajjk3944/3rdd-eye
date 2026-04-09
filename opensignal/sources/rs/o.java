package rs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final b f21770a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21771b;

    /* renamed from: c, reason: collision with root package name */
    public final b f21772c;

    /* renamed from: d, reason: collision with root package name */
    public final n f21773d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f21774e;

    public o(b bVar, Object obj, b bVar2, n nVar, Class cls) {
        if (bVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (nVar.f21768d == j0.MESSAGE && bVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f21770a = bVar;
        this.f21771b = obj;
        this.f21772c = bVar2;
        this.f21773d = nVar;
        if (!q.class.isAssignableFrom(cls)) {
            this.f21774e = null;
            return;
        }
        try {
            this.f21774e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e4) {
            String name = cls.getName();
            throw new RuntimeException(h0.b.s(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e4);
        }
    }

    public final Object a(Object obj) {
        if (this.f21773d.f21768d.getJavaType() != k0.ENUM) {
            return obj;
        }
        try {
            return this.f21774e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.f21773d.f21768d.getJavaType() == k0.ENUM ? Integer.valueOf(((q) obj).getNumber()) : obj;
    }
}
