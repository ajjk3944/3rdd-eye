package xh;

import Yg.J;
import Zg.AbstractC3682n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.T;
import xh.h;

/* loaded from: classes4.dex */
public abstract class i implements xh.h {

    /* renamed from: e, reason: collision with root package name */
    public static final d f66115e = new d(null);

    /* renamed from: a, reason: collision with root package name */
    private final Member f66116a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f66117b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f66118c;

    /* renamed from: d, reason: collision with root package name */
    private final List f66119d;

    public static final class a extends i implements xh.g {

        /* renamed from: f, reason: collision with root package name */
        private final Object f66120f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor constructor, Object obj) {
            AbstractC6492s.i(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC6492s.h(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC6492s.h(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : AbstractC3682n.s(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f66120f = obj;
        }

        @Override // xh.h
        public Object call(Object[] args) {
            AbstractC6492s.i(args, "args");
            c(args);
            Constructor constructor = (Constructor) b();
            T t10 = new T(3);
            t10.a(this.f66120f);
            t10.b(args);
            t10.a(null);
            return constructor.newInstance(t10.d(new Object[t10.c()]));
        }
    }

    public static final class b extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor constructor) {
            AbstractC6492s.i(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC6492s.h(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC6492s.h(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC3682n.s(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // xh.h
        public Object call(Object[] args) {
            AbstractC6492s.i(args, "args");
            c(args);
            Constructor constructor = (Constructor) b();
            T t10 = new T(2);
            t10.b(args);
            t10.a(null);
            return constructor.newInstance(t10.d(new Object[t10.c()]));
        }
    }

    public static final class c extends i implements xh.g {

        /* renamed from: f, reason: collision with root package name */
        private final Object f66121f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor constructor, Object obj) {
            AbstractC6492s.i(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC6492s.h(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC6492s.h(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f66121f = obj;
        }

        @Override // xh.h
        public Object call(Object[] args) {
            AbstractC6492s.i(args, "args");
            c(args);
            Constructor constructor = (Constructor) b();
            T t10 = new T(2);
            t10.a(this.f66121f);
            t10.b(args);
            return constructor.newInstance(t10.d(new Object[t10.c()]));
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public static final class e extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor constructor) {
            AbstractC6492s.i(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC6492s.h(declaringClass, "getDeclaringClass(...)");
            Class declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC6492s.h(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // xh.h
        public Object call(Object[] args) {
            AbstractC6492s.i(args, "args");
            c(args);
            return ((Constructor) b()).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    public static abstract class f extends i {

        public static final class a extends f implements xh.g {

            /* renamed from: f, reason: collision with root package name */
            private final Object f66122f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                AbstractC6492s.i(field, "field");
                this.f66122f = obj;
            }

            @Override // xh.i.f, xh.h
            public Object call(Object[] args) {
                AbstractC6492s.i(args, "args");
                c(args);
                return ((Field) b()).get(this.f66122f);
            }
        }

        public static final class b extends f implements xh.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                AbstractC6492s.i(field, "field");
            }
        }

        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                AbstractC6492s.i(field, "field");
            }
        }

        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                AbstractC6492s.i(field, "field");
            }

            @Override // xh.i
            public void c(Object[] args) {
                AbstractC6492s.i(args, "args");
                super.c(args);
                d(AbstractC3682n.a0(args));
            }
        }

        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                AbstractC6492s.i(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10);
        }

        @Override // xh.h
        public Object call(Object[] args) {
            AbstractC6492s.i(args, "args");
            c(args);
            return ((Field) b()).get(e() != null ? AbstractC3682n.Z(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            AbstractC6492s.h(genericType, "getGenericType(...)");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    public static abstract class g extends i {

        /* renamed from: f, reason: collision with root package name */
        private final boolean f66123f;

        public static final class a extends g implements xh.g {

            /* renamed from: g, reason: collision with root package name */
            private final Object f66124g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, null);
                AbstractC6492s.i(field, "field");
                this.f66124g = obj;
            }

            @Override // xh.i.g, xh.h
            public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
                AbstractC6492s.i(args, "args");
                c(args);
                ((Field) b()).set(this.f66124g, AbstractC3682n.Z(args));
                return J.f24997a;
            }
        }

        public static final class b extends g implements xh.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, null);
                AbstractC6492s.i(field, "field");
            }

            @Override // xh.i.g, xh.h
            public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
                AbstractC6492s.i(args, "args");
                c(args);
                ((Field) b()).set(null, AbstractC3682n.K0(args));
                return J.f24997a;
            }
        }

        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, null);
                AbstractC6492s.i(field, "field");
            }
        }

        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, null);
                AbstractC6492s.i(field, "field");
            }

            @Override // xh.i.g, xh.i
            public void c(Object[] args) {
                AbstractC6492s.i(args, "args");
                super.c(args);
                d(AbstractC3682n.a0(args));
            }
        }

        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, null);
                AbstractC6492s.i(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10, z11);
        }

        @Override // xh.i
        public void c(Object[] args) {
            AbstractC6492s.i(args, "args");
            super.c(args);
            if (this.f66123f && AbstractC3682n.K0(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // xh.h
        public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
            AbstractC6492s.i(args, "args");
            c(args);
            ((Field) b()).set(e() != null ? AbstractC3682n.Z(args) : null, AbstractC3682n.K0(args));
            return J.f24997a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(Field field, boolean z10, boolean z11) {
            Class TYPE = Void.TYPE;
            AbstractC6492s.h(TYPE, "TYPE");
            super(field, TYPE, z11 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.f66123f = z10;
        }
    }

    public static abstract class h extends i {

        /* renamed from: f, reason: collision with root package name */
        private final boolean f66125f;

        public static final class a extends h implements xh.g {

            /* renamed from: g, reason: collision with root package name */
            private final Object f66126g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                AbstractC6492s.i(method, "method");
                this.f66126g = obj;
            }

            @Override // xh.h
            public Object call(Object[] args) {
                AbstractC6492s.i(args, "args");
                c(args);
                return f(this.f66126g, args);
            }
        }

        public static final class b extends h implements xh.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                AbstractC6492s.i(method, "method");
            }

            @Override // xh.h
            public Object call(Object[] args) {
                AbstractC6492s.i(args, "args");
                c(args);
                return f(null, args);
            }
        }

        public static final class c extends h implements xh.g {

            /* renamed from: g, reason: collision with root package name */
            private final Object f66127g;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, Object obj) {
                AbstractC6492s.i(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                AbstractC6492s.h(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC3682n.s(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.f66127g = obj;
            }

            @Override // xh.h
            public Object call(Object[] args) {
                AbstractC6492s.i(args, "args");
                c(args);
                T t10 = new T(2);
                t10.a(this.f66127g);
                t10.b(args);
                return f(null, t10.d(new Object[t10.c()]));
            }

            public final Object g() {
                return this.f66127g;
            }
        }

        public static final class d extends h implements xh.g {

            /* renamed from: g, reason: collision with root package name */
            private final Object[] f66128g;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] boundReceiverComponents) {
                AbstractC6492s.i(method, "method");
                AbstractC6492s.i(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                AbstractC6492s.h(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) AbstractC3682n.W(genericParameterTypes, boundReceiverComponents.length).toArray(new Type[0]), null);
                this.f66128g = boundReceiverComponents;
            }

            @Override // xh.h
            public Object call(Object[] args) {
                AbstractC6492s.i(args, "args");
                c(args);
                T t10 = new T(2);
                t10.b(this.f66128g);
                t10.b(args);
                return f(null, t10.d(new Object[t10.c()]));
            }

            public final Object[] g() {
                return this.f66128g;
            }

            public final int h() {
                return this.f66128g.length;
            }
        }

        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                AbstractC6492s.i(method, "method");
            }

            @Override // xh.h
            public Object call(Object[] args) {
                AbstractC6492s.i(args, "args");
                c(args);
                return f(args[0], args.length <= 1 ? new Object[0] : AbstractC3682n.s(args, 1, args.length));
            }
        }

        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, null, 4, null);
                AbstractC6492s.i(method, "method");
            }

            @Override // xh.h
            public Object call(Object[] args) {
                AbstractC6492s.i(args, "args");
                c(args);
                d(AbstractC3682n.a0(args));
                return f(null, args.length <= 1 ? new Object[0] : AbstractC3682n.s(args, 1, args.length));
            }
        }

        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                AbstractC6492s.i(method, "method");
            }

            @Override // xh.h
            public Object call(Object[] args) {
                AbstractC6492s.i(args, "args");
                c(args);
                return f(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z10, typeArr);
        }

        protected final Object f(Object obj, Object[] args) {
            AbstractC6492s.i(args, "args");
            return this.f66125f ? J.f24997a : ((Method) b()).invoke(obj, Arrays.copyOf(args, args.length));
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10, (i10 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            AbstractC6492s.h(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.f66125f = AbstractC6492s.d(getReturnType(), Void.TYPE);
        }
    }

    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    @Override // xh.h
    public List a() {
        return this.f66119d;
    }

    @Override // xh.h
    public final Member b() {
        return this.f66116a;
    }

    public void c(Object[] objArr) {
        h.a.a(this, objArr);
    }

    protected final void d(Object obj) {
        if (obj == null || !this.f66116a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class e() {
        return this.f66118c;
    }

    @Override // xh.h
    public final Type getReturnType() {
        return this.f66117b;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private i(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f66116a = r1
            r0.f66117b = r2
            r0.f66118c = r3
            if (r3 == 0) goto L27
            kotlin.jvm.internal.T r1 = new kotlin.jvm.internal.T
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = Zg.AbstractC3689v.o(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = Zg.AbstractC3682n.d1(r4)
        L2b:
            r0.f66119d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.i.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
