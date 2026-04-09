package androidx.lifecycle;

import Zg.AbstractC3689v;
import f.AbstractC5487d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f31674a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f31675b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f31676c = new HashMap();

    private r() {
    }

    private final InterfaceC4010h a(Constructor constructor, Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            AbstractC6492s.h(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC5487d.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor b(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            AbstractC6492s.h(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                AbstractC6492s.h(name, "name");
                name = name.substring(fullPackage.length() + 1);
                AbstractC6492s.h(name, "this as java.lang.String).substring(startIndex)");
            }
            AbstractC6492s.h(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (fullPackage.length() != 0) {
                strC = fullPackage + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            AbstractC6492s.g(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        AbstractC6492s.i(className, "className");
        return kotlin.text.t.L(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Map map = f31675b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class cls) {
        return cls != null && InterfaceC4016n.class.isAssignableFrom(cls);
    }

    public static final InterfaceC4015m f(Object object) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(object, "object");
        boolean z10 = object instanceof InterfaceC4015m;
        boolean z11 = object instanceof InterfaceC4007e;
        if (z10 && z11) {
            return new C4008f((InterfaceC4007e) object, (InterfaceC4015m) object);
        }
        if (z11) {
            return new C4008f((InterfaceC4007e) object, null);
        }
        if (z10) {
            return (InterfaceC4015m) object;
        }
        Class<?> cls = object.getClass();
        r rVar = f31674a;
        if (rVar.d(cls) != 2) {
            return new z(object);
        }
        Object obj = f31676c.get(cls);
        AbstractC6492s.f(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            rVar.a((Constructor) list.get(0), object);
            return new M(null);
        }
        int size = list.size();
        InterfaceC4010h[] interfaceC4010hArr = new InterfaceC4010h[size];
        for (int i10 = 0; i10 < size; i10++) {
            f31674a.a((Constructor) list.get(i10), object);
            interfaceC4010hArr[i10] = null;
        }
        return new C4006d(interfaceC4010hArr);
    }

    private final int g(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f31676c.put(cls, AbstractC3689v.e(constructorB));
            return 2;
        }
        if (C4005c.f31643c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            AbstractC6492s.h(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f31676c.get(superclass);
            AbstractC6492s.f(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC6492s.h(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                AbstractC6492s.h(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f31676c.get(intrface);
                AbstractC6492s.f(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f31676c.put(cls, arrayList);
        return 2;
    }
}
