package t5;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f61796a = c();

    class a extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f61797b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61798c;

        a(Method method, Object obj) {
            this.f61797b = method;
            this.f61798c = obj;
        }

        @Override // t5.p
        public Object d(Class cls) {
            p.b(cls);
            return this.f61797b.invoke(this.f61798c, cls);
        }
    }

    class b extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f61799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f61800c;

        b(Method method, int i10) {
            this.f61799b = method;
            this.f61800c = i10;
        }

        @Override // t5.p
        public Object d(Class cls) {
            p.b(cls);
            return this.f61799b.invoke(null, cls, Integer.valueOf(this.f61800c));
        }
    }

    class c extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f61801b;

        c(Method method) {
            this.f61801b = method;
        }

        @Override // t5.p
        public Object d(Class cls) {
            p.b(cls);
            return this.f61801b.invoke(null, cls, Object.class);
        }
    }

    class d extends p {
        d() {
        }

        @Override // t5.p
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String strA = C8032c.a(cls);
        if (strA == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strA);
    }

    private static p c() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, iIntValue);
            }
        } catch (Exception unused3) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new c(declaredMethod3);
        }
    }

    public abstract Object d(Class cls);
}
