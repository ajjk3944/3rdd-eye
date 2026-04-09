package kotlin.reflect.jvm.internal.impl.utils;

import xi.AbstractC8537d;

/* loaded from: classes4.dex */
public abstract class WrappedValues {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f52205a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f52206b = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    static class a {
        a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f52207a;

        /* synthetic */ b(Throwable th2, a aVar) {
            this(th2);
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        public Throwable b() {
            Throwable th2 = this.f52207a;
            if (th2 == null) {
                a(1);
            }
            return th2;
        }

        public String toString() {
            return this.f52207a.toString();
        }

        private b(Throwable th2) {
            if (th2 == null) {
                a(0);
            }
            this.f52207a = th2;
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i10 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i10 == 1 || i10 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i10 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static Object b(Object obj) {
        if (obj == null && (obj = f52205a) == null) {
            a(1);
        }
        return obj;
    }

    public static Object c(Throwable th2) {
        if (th2 == null) {
            a(3);
        }
        return new b(th2, null);
    }

    public static Object d(Object obj) {
        if (obj == null) {
            a(4);
        }
        return e(f(obj));
    }

    public static Object e(Object obj) {
        if (obj == null) {
            a(0);
        }
        if (obj == f52205a) {
            return null;
        }
        return obj;
    }

    public static Object f(Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable thB = ((b) obj).b();
        if (f52206b && AbstractC8537d.a(thB)) {
            throw new WrappedProcessCanceledException(thB);
        }
        throw AbstractC8537d.b(thB);
    }
}
