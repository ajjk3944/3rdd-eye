package Gh;

import Bh.v0;
import Bh.w0;
import Qh.InterfaceC3444a;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.T;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public final class q extends u implements j, A, Qh.g {

    /* renamed from: a, reason: collision with root package name */
    private final Class f7489a;

    /* synthetic */ class a extends AbstractC6489o implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7490a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            AbstractC6492s.i(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return O.b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* synthetic */ class b extends AbstractC6489o implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7491a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(Constructor p02) {
            AbstractC6492s.i(p02, "p0");
            return new t(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return O.b(t.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }
    }

    /* synthetic */ class c extends AbstractC6489o implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7492a = new c();

        c() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            AbstractC6492s.i(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return O.b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* synthetic */ class d extends AbstractC6489o implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f7493a = new d();

        d() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(Field p02) {
            AbstractC6492s.i(p02, "p0");
            return new w(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return O.b(w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }
    }

    /* synthetic */ class e extends AbstractC6489o implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7494a = new e();

        e() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z invoke(Method p02) {
            AbstractC6492s.i(p02, "p0");
            return new z(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return O.b(z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }
    }

    public q(Class klass) {
        AbstractC6492s.i(klass, "klass");
        this.f7489a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R(Class cls) {
        String simpleName = cls.getSimpleName();
        AbstractC6492s.h(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Zh.f S(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!Zh.f.l(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Zh.f.h(simpleName);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (qVar.A()) {
            AbstractC6492s.f(method);
            if (qVar.d0(method)) {
                return false;
            }
        }
        return true;
    }

    private final boolean d0(Method method) {
        String name = method.getName();
        if (AbstractC6492s.d(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC6492s.h(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (AbstractC6492s.d(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // Qh.g
    public boolean A() {
        return this.f7489a.isEnum();
    }

    @Override // Gh.A
    public int D() {
        return this.f7489a.getModifiers();
    }

    @Override // Qh.g
    public boolean E() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolF = C2910b.f7461a.f(this.f7489a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @Override // Qh.g
    public boolean H() {
        return this.f7489a.isInterface();
    }

    @Override // Qh.g
    public Qh.D I() {
        return null;
    }

    @Override // Qh.g
    public InterfaceC8780j N() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArrC = C2910b.f7461a.c(this.f7489a);
        if (clsArrC != null) {
            ArrayList arrayList = new ArrayList(clsArrC.length);
            for (Class cls : clsArrC) {
                arrayList.add(new s(cls));
            }
            InterfaceC8780j interfaceC8780jD0 = AbstractC3689v.d0(arrayList);
            if (interfaceC8780jD0 != null) {
                return interfaceC8780jD0;
            }
        }
        return AbstractC8783m.i();
    }

    @Override // Qh.s
    public boolean Q() {
        return Modifier.isStatic(D());
    }

    @Override // Qh.g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public List m() throws SecurityException {
        Constructor<?>[] declaredConstructors = this.f7489a.getDeclaredConstructors();
        AbstractC6492s.h(declaredConstructors, "getDeclaredConstructors(...)");
        return AbstractC8783m.Z(AbstractC8783m.N(AbstractC8783m.D(AbstractC3682n.Q(declaredConstructors), a.f7490a), b.f7491a));
    }

    @Override // Gh.j
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Class v() {
        return this.f7489a;
    }

    @Override // Qh.g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public List C() {
        Field[] declaredFields = this.f7489a.getDeclaredFields();
        AbstractC6492s.h(declaredFields, "getDeclaredFields(...)");
        return AbstractC8783m.Z(AbstractC8783m.N(AbstractC8783m.D(AbstractC3682n.Q(declaredFields), c.f7492a), d.f7493a));
    }

    @Override // Qh.g
    public Collection a() {
        Class cls;
        cls = Object.class;
        if (AbstractC6492s.d(this.f7489a, cls)) {
            return AbstractC3689v.l();
        }
        T t10 = new T(2);
        Object genericSuperclass = this.f7489a.getGenericSuperclass();
        t10.a(genericSuperclass != null ? genericSuperclass : Object.class);
        t10.b(this.f7489a.getGenericInterfaces());
        List listO = AbstractC3689v.o(t10.d(new Type[t10.c()]));
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listO, 10));
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add(new s((Type) it.next()));
        }
        return arrayList;
    }

    @Override // Qh.g
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public List K() {
        Class<?>[] declaredClasses = this.f7489a.getDeclaredClasses();
        AbstractC6492s.h(declaredClasses, "getDeclaredClasses(...)");
        return AbstractC8783m.Z(AbstractC8783m.O(AbstractC8783m.D(AbstractC3682n.Q(declaredClasses), n.f7486a), o.f7487a));
    }

    @Override // Qh.g
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public List M() throws SecurityException {
        Method[] declaredMethods = this.f7489a.getDeclaredMethods();
        AbstractC6492s.h(declaredMethods, "getDeclaredMethods(...)");
        return AbstractC8783m.Z(AbstractC8783m.N(AbstractC8783m.C(AbstractC3682n.Q(declaredMethods), new p(this)), e.f7494a));
    }

    @Override // Qh.g
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public q f() {
        Class<?> declaringClass = this.f7489a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    @Override // Qh.g
    public Zh.c e() {
        return AbstractC2914f.e(this.f7489a).a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && AbstractC6492s.d(this.f7489a, ((q) obj).f7489a);
    }

    @Override // Qh.g
    public Collection g() {
        Object[] objArrD = C2910b.f7461a.d(this.f7489a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new D(obj));
        }
        return arrayList;
    }

    @Override // Qh.InterfaceC3447d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Qh.t
    public Zh.f getName() {
        if (!this.f7489a.isAnonymousClass()) {
            Zh.f fVarH = Zh.f.h(this.f7489a.getSimpleName());
            AbstractC6492s.f(fVarH);
            return fVarH;
        }
        String name = this.f7489a.getName();
        AbstractC6492s.h(name, "getName(...)");
        Zh.f fVarH2 = Zh.f.h(kotlin.text.t.h1(name, ".", null, 2, null));
        AbstractC6492s.f(fVarH2);
        return fVarH2;
    }

    @Override // Qh.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = this.f7489a.getTypeParameters();
        AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // Qh.s
    public w0 getVisibility() {
        int iD = D();
        return Modifier.isPublic(iD) ? v0.h.f1820c : Modifier.isPrivate(iD) ? v0.e.f1817c : Modifier.isProtected(iD) ? Modifier.isStatic(iD) ? Eh.c.f4760c : Eh.b.f4759c : Eh.a.f4758c;
    }

    @Override // Qh.InterfaceC3447d
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return this.f7489a.hashCode();
    }

    @Override // Qh.s
    public boolean isAbstract() {
        return Modifier.isAbstract(D());
    }

    @Override // Qh.s
    public boolean isFinal() {
        return Modifier.isFinal(D());
    }

    @Override // Qh.InterfaceC3447d
    public /* bridge */ /* synthetic */ InterfaceC3444a l(Zh.c cVar) {
        return l(cVar);
    }

    @Override // Qh.g
    public boolean n() {
        return this.f7489a.isAnnotation();
    }

    @Override // Qh.g
    public boolean p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolE = C2910b.f7461a.e(this.f7489a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // Qh.g
    public boolean t() {
        return false;
    }

    public String toString() {
        return q.class.getName() + ": " + this.f7489a;
    }

    @Override // Gh.j, Qh.InterfaceC3447d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementV = v();
        return (annotatedElementV == null || (declaredAnnotations = annotatedElementV.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? AbstractC3689v.l() : listB;
    }

    @Override // Gh.j, Qh.InterfaceC3447d
    public C2915g l(Zh.c fqName) {
        Annotation[] declaredAnnotations;
        AbstractC6492s.i(fqName, "fqName");
        AnnotatedElement annotatedElementV = v();
        if (annotatedElementV == null || (declaredAnnotations = annotatedElementV.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }
}
