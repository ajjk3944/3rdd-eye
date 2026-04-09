package Y6;

import a7.AbstractC3770c;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
abstract class c {

    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f24635a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f24636b;

        a(Constructor constructor, Class cls) {
            this.f24635a = constructor;
            this.f24636b = cls;
        }

        @Override // Y6.c
        public Object b() {
            return this.f24635a.newInstance(null);
        }

        public String toString() {
            return this.f24636b.getName();
        }
    }

    class b extends c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f24637a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f24638b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f24639c;

        b(Method method, Object obj, Class cls) {
            this.f24637a = method;
            this.f24638b = obj;
            this.f24639c = cls;
        }

        @Override // Y6.c
        public Object b() {
            return this.f24637a.invoke(this.f24638b, this.f24639c);
        }

        public String toString() {
            return this.f24639c.getName();
        }
    }

    /* renamed from: Y6.c$c, reason: collision with other inner class name */
    class C0940c extends c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f24640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f24641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24642c;

        C0940c(Method method, Class cls, int i10) {
            this.f24640a = method;
            this.f24641b = cls;
            this.f24642c = i10;
        }

        @Override // Y6.c
        public Object b() {
            return this.f24640a.invoke(null, this.f24641b, Integer.valueOf(this.f24642c));
        }

        public String toString() {
            return this.f24641b.getName();
        }
    }

    class d extends c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f24643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f24644b;

        d(Method method, Class cls) {
            this.f24643a = method;
            this.f24644b = cls;
        }

        @Override // Y6.c
        public Object b() {
            return this.f24643a.invoke(null, this.f24644b, Object.class);
        }

        public String toString() {
            return this.f24644b.getName();
        }
    }

    c() {
    }

    public static c a(Class cls) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalArgumentException {
        try {
            try {
                try {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new a(declaredConstructor, cls);
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new C0940c(declaredMethod2, cls, iIntValue);
                    } catch (IllegalAccessException unused2) {
                        throw new AssertionError();
                    }
                } catch (IllegalAccessException unused3) {
                    throw new AssertionError();
                } catch (NoSuchMethodException unused4) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new d(declaredMethod3, cls);
                } catch (InvocationTargetException e10) {
                    throw AbstractC3770c.t(e10);
                }
            } catch (NoSuchMethodException unused5) {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
            }
        } catch (Exception unused6) {
            throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
        }
    }

    abstract Object b();
}
