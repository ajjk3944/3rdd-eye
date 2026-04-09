package Fh;

import Gh.AbstractC2914f;
import Sh.x;
import Zg.AbstractC3682n;
import Zh.b;
import di.C5397f;
import gi.EnumC5923e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import lh.AbstractC6596a;

/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f6670a = new c();

    private c() {
    }

    private final C5397f a(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            Zh.b bVarE = AbstractC2914f.e(cls);
            Zh.b bVarM = Ah.c.f771a.m(bVarE.a());
            if (bVarM != null) {
                bVarE = bVarM;
            }
            return new C5397f(bVarE, i10);
        }
        if (!AbstractC6492s.d(cls, Void.TYPE)) {
            kotlin.reflect.jvm.internal.impl.builtins.l primitiveType = EnumC5923e.get(cls.getName()).getPrimitiveType();
            AbstractC6492s.h(primitiveType, "getPrimitiveType(...)");
            return i10 > 0 ? new C5397f(Zh.b.f25401d.c(primitiveType.getArrayTypeFqName()), i10 - 1) : new C5397f(Zh.b.f25401d.c(primitiveType.getTypeFqName()), i10);
        }
        b.a aVar = Zh.b.f25401d;
        Zh.c cVarL = o.a.f51854f.l();
        AbstractC6492s.h(cVarL, "toSafe(...)");
        return new C5397f(aVar.c(cVarL), i10);
    }

    private final void c(Class cls, x.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = AbstractC6477c.a(cls.getDeclaredConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            Zh.f fVar = Zh.h.f25430j;
            m mVar = m.f6684a;
            AbstractC6492s.f(constructor);
            x.e eVarA = dVar.a(fVar, mVar.a(constructor));
            if (eVarA != null) {
                Iterator itA2 = AbstractC6477c.a(constructor.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    AbstractC6492s.f(annotation);
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                AbstractC6492s.f(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Iterator itA3 = AbstractC6477c.a(parameterAnnotations[i10]);
                        while (itA3.hasNext()) {
                            Annotation annotation2 = (Annotation) itA3.next();
                            Class clsB = AbstractC6596a.b(AbstractC6596a.a(annotation2));
                            Zh.b bVarE = AbstractC2914f.e(clsB);
                            AbstractC6492s.f(annotation2);
                            x.a aVarC = eVarA.c(i10 + length, bVarE, new b(annotation2));
                            if (aVarC != null) {
                                f6670a.h(aVarC, annotation2, clsB);
                            }
                        }
                    }
                }
                eVarA.a();
            }
        }
    }

    private final void d(Class cls, x.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = AbstractC6477c.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            Zh.f fVarH = Zh.f.h(field.getName());
            AbstractC6492s.h(fVarH, "identifier(...)");
            m mVar = m.f6684a;
            AbstractC6492s.f(field);
            x.c cVarB = dVar.b(fVarH, mVar.b(field), null);
            if (cVarB != null) {
                Iterator itA2 = AbstractC6477c.a(field.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    AbstractC6492s.f(annotation);
                    f(cVarB, annotation);
                }
                cVarB.a();
            }
        }
    }

    private final void e(Class cls, x.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = AbstractC6477c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            Zh.f fVarH = Zh.f.h(method.getName());
            AbstractC6492s.h(fVarH, "identifier(...)");
            m mVar = m.f6684a;
            AbstractC6492s.f(method);
            x.e eVarA = dVar.a(fVarH, mVar.c(method));
            if (eVarA != null) {
                Iterator itA2 = AbstractC6477c.a(method.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    AbstractC6492s.f(annotation);
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                AbstractC6492s.h(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Iterator itA3 = AbstractC6477c.a(annotationArr[i10]);
                    while (itA3.hasNext()) {
                        Annotation annotation2 = (Annotation) itA3.next();
                        Class clsB = AbstractC6596a.b(AbstractC6596a.a(annotation2));
                        Zh.b bVarE = AbstractC2914f.e(clsB);
                        AbstractC6492s.f(annotation2);
                        x.a aVarC = eVarA.c(i10, bVarE, new b(annotation2));
                        if (aVarC != null) {
                            f6670a.h(aVarC, annotation2, clsB);
                        }
                    }
                }
                eVarA.a();
            }
        }
    }

    private final void f(x.c cVar, Annotation annotation) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class clsB = AbstractC6596a.b(AbstractC6596a.a(annotation));
        x.a aVarB = cVar.b(AbstractC2914f.e(clsB), new b(annotation));
        if (aVarB != null) {
            f6670a.h(aVarB, annotation, clsB);
        }
    }

    private final void g(x.a aVar, Zh.f fVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (AbstractC6492s.d(enclosingClass, Class.class)) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.b(fVar, a((Class) obj));
            return;
        }
        if (i.f6677a.contains(enclosingClass)) {
            aVar.c(fVar, obj);
            return;
        }
        if (AbstractC2914f.l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            AbstractC6492s.f(enclosingClass);
            Zh.b bVarE = AbstractC2914f.e(enclosingClass);
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            Zh.f fVarH = Zh.f.h(((Enum) obj).name());
            AbstractC6492s.h(fVarH, "identifier(...)");
            aVar.e(fVar, bVarE, fVarH);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            AbstractC6492s.h(interfaces, "getInterfaces(...)");
            Class cls = (Class) AbstractC3682n.Q0(interfaces);
            AbstractC6492s.f(cls);
            x.a aVarF = aVar.f(fVar, AbstractC2914f.e(cls));
            if (aVarF == null) {
                return;
            }
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(aVarF, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        x.b bVarD = aVar.d(fVar);
        if (bVarD == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i10 = 0;
        if (componentType.isEnum()) {
            AbstractC6492s.f(componentType);
            Zh.b bVarE2 = AbstractC2914f.e(componentType);
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i10 < length) {
                Object obj2 = objArr[i10];
                AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                Zh.f fVarH2 = Zh.f.h(((Enum) obj2).name());
                AbstractC6492s.h(fVarH2, "identifier(...)");
                bVarD.c(bVarE2, fVarH2);
                i10++;
            }
        } else if (AbstractC6492s.d(componentType, Class.class)) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i10 < length2) {
                Object obj3 = objArr2[i10];
                AbstractC6492s.g(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarD.b(a((Class) obj3));
                i10++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i10 < length3) {
                Object obj4 = objArr3[i10];
                AbstractC6492s.f(componentType);
                x.a aVarE = bVarD.e(AbstractC2914f.e(componentType));
                if (aVarE != null) {
                    AbstractC6492s.g(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(aVarE, (Annotation) obj4, componentType);
                }
                i10++;
            }
        } else {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i10 < length4) {
                bVarD.d(objArr4[i10]);
                i10++;
            }
        }
        bVarD.a();
    }

    private final void h(x.a aVar, Annotation annotation, Class cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = AbstractC6477c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                AbstractC6492s.f(objInvoke);
                Zh.f fVarH = Zh.f.h(method.getName());
                AbstractC6492s.h(fVarH, "identifier(...)");
                g(aVar, fVarH, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class klass, x.c visitor) {
        AbstractC6492s.i(klass, "klass");
        AbstractC6492s.i(visitor, "visitor");
        Iterator itA = AbstractC6477c.a(klass.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            AbstractC6492s.f(annotation);
            f(visitor, annotation);
        }
        visitor.a();
    }

    public final void i(Class klass, x.d memberVisitor) {
        AbstractC6492s.i(klass, "klass");
        AbstractC6492s.i(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}
