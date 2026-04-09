package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.snmp4j.util.SnmpConfigurator;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    static Method f56981a;

    /* renamed from: b, reason: collision with root package name */
    static Method f56982b;

    /* renamed from: c, reason: collision with root package name */
    static Method f56983c;

    /* renamed from: d, reason: collision with root package name */
    static Method f56984d;

    /* renamed from: e, reason: collision with root package name */
    static Constructor f56985e;

    /* renamed from: f, reason: collision with root package name */
    static Class f56986f;

    /* renamed from: g, reason: collision with root package name */
    static e f56987g;

    /* renamed from: h, reason: collision with root package name */
    static Method f56988h;

    static class a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f56989a;

        a(ByteBuffer byteBuffer) {
            this.f56989a = byteBuffer;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return c.g(this.f56989a);
        }
    }

    static class b implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f56990a;

        b(ByteBuffer byteBuffer) {
            this.f56990a = byteBuffer;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return c.f(this.f56990a, c.f56982b);
        }
    }

    /* renamed from: org.msgpack.core.buffer.c$c, reason: collision with other inner class name */
    static class C2021c implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f56991a;

        C2021c(ByteBuffer byteBuffer) {
            this.f56991a = byteBuffer;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return c.h(this.f56991a);
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56992a;

        static {
            int[] iArr = new int[e.values().length];
            f56992a = iArr;
            try {
                iArr[e.ARGS_LONG_INT_REF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56992a[e.ARGS_LONG_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56992a[e.ARGS_INT_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56992a[e.ARGS_MB_INT_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum e {
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    static {
        Constructor<?> declaredConstructor;
        Method method;
        e eVar;
        try {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1);
            Class<?> cls = byteBufferAllocateDirect.getClass();
            f56986f = cls;
            try {
                try {
                    try {
                        declaredConstructor = cls.getDeclaredConstructor(Long.TYPE, Integer.TYPE, Object.class);
                        eVar = e.ARGS_LONG_INT_REF;
                    } catch (NoSuchMethodException unused) {
                        Class cls2 = f56986f;
                        Class cls3 = Integer.TYPE;
                        declaredConstructor = cls2.getDeclaredConstructor(cls3, cls3);
                        eVar = e.ARGS_INT_INT;
                    }
                } catch (NoSuchMethodException unused2) {
                    declaredConstructor = f56986f.getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                    eVar = e.ARGS_LONG_INT;
                }
                method = null;
            } catch (NoSuchMethodException unused3) {
                Class<?> cls4 = Class.forName("java.nio.MemoryBlock");
                Class cls5 = Integer.TYPE;
                Method declaredMethod = cls4.getDeclaredMethod("wrapFromJni", cls5, Long.TYPE);
                declaredMethod.setAccessible(true);
                declaredConstructor = f56986f.getDeclaredConstructor(cls4, cls5, cls5);
                method = declaredMethod;
                eVar = e.ARGS_MB_INT_INT;
            }
            f56985e = declaredConstructor;
            f56987g = eVar;
            f56988h = method;
            if (declaredConstructor == null) {
                throw new RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            declaredConstructor.setAccessible(true);
            Method declaredMethod2 = f56986f.getDeclaredMethod(SnmpConfigurator.O_ADDRESS, null);
            f56981a = declaredMethod2;
            declaredMethod2.setAccessible(true);
            if (MessageBuffer.javaVersion <= 8) {
                k(byteBufferAllocateDirect);
            } else {
                l(byteBufferAllocateDirect);
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    static void d(Object obj) {
        try {
            if (MessageBuffer.javaVersion > 8) {
                f56984d.invoke(MessageBuffer.unsafe, obj);
            } else {
                f56983c.invoke(f56982b.invoke(obj, null), null);
            }
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    static long e(Object obj) {
        try {
            return ((Long) f56981a.invoke(obj, null)).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object f(ByteBuffer byteBuffer, Method method) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = method.getReturnType().getDeclaredMethod("clean", null);
            Object objInvoke = method.invoke(byteBuffer, null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(objInvoke, null);
            return declaredMethod;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object g(ByteBuffer byteBuffer) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = byteBuffer.getClass().getDeclaredMethod("cleaner", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(byteBuffer, null);
            return declaredMethod;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object h(ByteBuffer byteBuffer) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Unsafe unsafe = MessageBuffer.unsafe;
            Method declaredMethod = unsafe.getClass().getDeclaredMethod("invokeCleaner", ByteBuffer.class);
            declaredMethod.invoke(unsafe, byteBuffer);
            return declaredMethod;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            return e10;
        }
    }

    static boolean i(Object obj) {
        return f56986f.isInstance(obj);
    }

    static ByteBuffer j(long j10, int i10, int i11, ByteBuffer byteBuffer) {
        try {
            int i12 = d.f56992a[f56987g.ordinal()];
            if (i12 == 1) {
                return (ByteBuffer) f56985e.newInstance(Long.valueOf(j10 + i10), Integer.valueOf(i11), byteBuffer);
            }
            if (i12 == 2) {
                return (ByteBuffer) f56985e.newInstance(Long.valueOf(j10 + i10), Integer.valueOf(i11));
            }
            if (i12 == 3) {
                return (ByteBuffer) f56985e.newInstance(Integer.valueOf(((int) j10) + i10), Integer.valueOf(i11));
            }
            if (i12 == 4) {
                return (ByteBuffer) f56985e.newInstance(f56988h.invoke(null, Long.valueOf(j10 + i10), Integer.valueOf(i11)), Integer.valueOf(i11), 0);
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static void k(ByteBuffer byteBuffer) {
        Object objDoPrivileged = AccessController.doPrivileged(new a(byteBuffer));
        if (objDoPrivileged instanceof Throwable) {
            throw new RuntimeException((Throwable) objDoPrivileged);
        }
        f56982b = (Method) objDoPrivileged;
        Object objDoPrivileged2 = AccessController.doPrivileged(new b(byteBuffer));
        if (objDoPrivileged2 instanceof Throwable) {
            throw new RuntimeException((Throwable) objDoPrivileged2);
        }
        f56983c = (Method) objDoPrivileged2;
    }

    private static void l(ByteBuffer byteBuffer) {
        Object objDoPrivileged = AccessController.doPrivileged(new C2021c(byteBuffer));
        if (objDoPrivileged instanceof Throwable) {
            throw new RuntimeException((Throwable) objDoPrivileged);
        }
        f56984d = (Method) objDoPrivileged;
    }
}
