package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f3534a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3535b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f3536c = new HashMap();

    public static final String c(String className) {
        kotlin.jvm.internal.p.e(className, "className");
        return s9.r.F(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    public static final j f(Object object) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.p.e(object, "object");
        boolean z10 = object instanceof j;
        boolean z11 = object instanceof d;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((d) object, (j) object);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((d) object, null);
        }
        if (z10) {
            return (j) object;
        }
        Class<?> cls = object.getClass();
        q qVar = f3534a;
        if (qVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        Object obj = f3536c.get(cls);
        kotlin.jvm.internal.p.b(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            qVar.a((Constructor) list.get(0), object);
            return new SingleGeneratedAdapterObserver(null);
        }
        int size = list.size();
        f[] fVarArr = new f[size];
        for (int i10 = 0; i10 < size; i10++) {
            f3534a.a((Constructor) list.get(i10), object);
            fVarArr[i10] = null;
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    public final f a(Constructor constructor, Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.p.d(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            androidx.appcompat.app.z.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Constructor b(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            kotlin.jvm.internal.p.d(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                kotlin.jvm.internal.p.d(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.p.d(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.p.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (fullPackage.length() != 0) {
                strC = fullPackage + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            kotlin.jvm.internal.p.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Map map = f3535b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    public final boolean e(Class cls) {
        return cls != null && m.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f3536c.put(cls, z8.q.e(constructorB));
            return 2;
        }
        if (b.f3485c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            kotlin.jvm.internal.p.d(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f3536c.get(superclass);
            kotlin.jvm.internal.p.b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.p.d(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                kotlin.jvm.internal.p.d(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f3536c.get(intrface);
                kotlin.jvm.internal.p.b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f3536c.put(cls, arrayList);
        return 2;
    }
}
