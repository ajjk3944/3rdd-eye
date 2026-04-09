package wh;

import java.lang.ref.SoftReference;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public abstract class a1 {

    public static class a extends b implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6824a f65117b;

        /* renamed from: c, reason: collision with root package name */
        private volatile SoftReference f65118c;

        public a(Object obj, InterfaceC6824a interfaceC6824a) {
            if (interfaceC6824a == null) {
                e(0);
            }
            this.f65118c = null;
            this.f65117b = interfaceC6824a;
            if (obj != null) {
                this.f65118c = new SoftReference(a(obj));
            }
        }

        private static /* synthetic */ void e(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // wh.a1.b, mh.InterfaceC6824a
        public Object invoke() {
            Object obj;
            SoftReference softReference = this.f65118c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            Object objInvoke = this.f65117b.invoke();
            this.f65118c = new SoftReference(a(objInvoke));
            return objInvoke;
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Object f65119a = new a();

        static class a {
            a() {
            }
        }

        protected Object a(Object obj) {
            return obj == null ? f65119a : obj;
        }

        public final Object b(Object obj, Object obj2) {
            return invoke();
        }

        protected Object c(Object obj) {
            if (obj == f65119a) {
                return null;
            }
            return obj;
        }

        public abstract Object invoke();
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static a b(Object obj, InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a == null) {
            a(0);
        }
        return new a(obj, interfaceC6824a);
    }

    public static a c(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a == null) {
            a(1);
        }
        return b(null, interfaceC6824a);
    }
}
