package wh;

import Gh.AbstractC2914f;
import Yh.d;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wh.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8374n {

    /* renamed from: wh.n$a */
    public static final class a extends AbstractC8374n {

        /* renamed from: a, reason: collision with root package name */
        private final Class f65176a;

        /* renamed from: b, reason: collision with root package name */
        private final List f65177b;

        /* renamed from: wh.n$a$a, reason: collision with other inner class name */
        public static final class C2303a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class jClass) throws SecurityException {
            super(null);
            AbstractC6492s.i(jClass, "jClass");
            this.f65176a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            AbstractC6492s.h(declaredMethods, "getDeclaredMethods(...)");
            this.f65177b = AbstractC3682n.T0(declaredMethods, new C2303a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            AbstractC6492s.h(returnType, "getReturnType(...)");
            return AbstractC2914f.f(returnType);
        }

        @Override // wh.AbstractC8374n
        public String a() {
            return AbstractC3689v.z0(this.f65177b, "", "<init>(", ")V", 0, null, C8372m.f65173a, 24, null);
        }

        public final List d() {
            return this.f65177b;
        }
    }

    /* renamed from: wh.n$b */
    public static final class b extends AbstractC8374n {

        /* renamed from: a, reason: collision with root package name */
        private final Constructor f65178a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(null);
            AbstractC6492s.i(constructor, "constructor");
            this.f65178a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            AbstractC6492s.f(cls);
            return AbstractC2914f.f(cls);
        }

        @Override // wh.AbstractC8374n
        public String a() {
            Class<?>[] parameterTypes = this.f65178a.getParameterTypes();
            AbstractC6492s.h(parameterTypes, "getParameterTypes(...)");
            return AbstractC3682n.I0(parameterTypes, "", "<init>(", ")V", 0, null, C8376o.f65185a, 24, null);
        }

        public final Constructor d() {
            return this.f65178a;
        }
    }

    /* renamed from: wh.n$c */
    public static final class c extends AbstractC8374n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f65179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            AbstractC6492s.i(method, "method");
            this.f65179a = method;
        }

        @Override // wh.AbstractC8374n
        public String a() {
            return h1.d(this.f65179a);
        }

        public final Method b() {
            return this.f65179a;
        }
    }

    /* renamed from: wh.n$d */
    public static final class d extends AbstractC8374n {

        /* renamed from: a, reason: collision with root package name */
        private final d.b f65180a;

        /* renamed from: b, reason: collision with root package name */
        private final String f65181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d.b signature) {
            super(null);
            AbstractC6492s.i(signature, "signature");
            this.f65180a = signature;
            this.f65181b = signature.a();
        }

        @Override // wh.AbstractC8374n
        public String a() {
            return this.f65181b;
        }

        public final String b() {
            return this.f65180a.d();
        }
    }

    /* renamed from: wh.n$e */
    public static final class e extends AbstractC8374n {

        /* renamed from: a, reason: collision with root package name */
        private final d.b f65182a;

        /* renamed from: b, reason: collision with root package name */
        private final String f65183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d.b signature) {
            super(null);
            AbstractC6492s.i(signature, "signature");
            this.f65182a = signature;
            this.f65183b = signature.a();
        }

        @Override // wh.AbstractC8374n
        public String a() {
            return this.f65183b;
        }

        public final String b() {
            return this.f65182a.d();
        }

        public final String c() {
            return this.f65182a.e();
        }
    }

    public /* synthetic */ AbstractC8374n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private AbstractC8374n() {
    }
}
