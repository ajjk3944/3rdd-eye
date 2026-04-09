package xh;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.H;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import lh.AbstractC6596a;
import org.snmp4j.asn1.BER;
import wh.Y0;

/* loaded from: classes4.dex */
public abstract class f {
    public static final Object g(Class annotationClass, Map values, List methods) throws IllegalArgumentException {
        AbstractC6492s.i(annotationClass, "annotationClass");
        AbstractC6492s.i(values, "values");
        AbstractC6492s.i(methods, "methods");
        Yg.m mVarB = Yg.n.b(new b(values));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new d(annotationClass, values, Yg.n.b(new c(annotationClass, values)), mVarB, methods));
        AbstractC6492s.g(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    private static final boolean i(Class cls, List list, Map map, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zD;
        boolean z10;
        th.d dVarA;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (!AbstractC6492s.d((annotation == null || (dVarA = AbstractC6596a.a(annotation)) == null) ? null : AbstractC6596a.b(dVarA), cls)) {
            return false;
        }
        List<Method> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z10 = true;
        } else {
            for (Method method : list2) {
                Object obj2 = map.get(method.getName());
                Object objInvoke = method.invoke(obj, null);
                if (obj2 instanceof boolean[]) {
                    AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    zD = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                    zD = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    zD = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    zD = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                    zD = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    zD = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                    zD = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    zD = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof Object[]) {
                    AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    zD = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                } else {
                    zD = AbstractC6492s.d(obj2, objInvoke);
                }
                if (!zD) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Map map) {
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * BER.MAX_OID_LENGTH);
        }
        return iHashCode;
    }

    private static final int k(Yg.m mVar) {
        return ((Number) mVar.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(Class cls, Map map) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        H.w0(map.entrySet(), sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : e.f66114a);
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        String string;
        AbstractC6492s.i(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            AbstractC6492s.h(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            AbstractC6492s.h(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            AbstractC6492s.h(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            AbstractC6492s.h(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            AbstractC6492s.h(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            AbstractC6492s.h(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            AbstractC6492s.h(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            AbstractC6492s.h(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            AbstractC6492s.h(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    private static final String n(Yg.m mVar) {
        return (String) mVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Class cls, Map map, Yg.m mVar, Yg.m mVar2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(mVar2));
                }
            } else if (name.equals("toString")) {
                return n(mVar);
            }
        }
        if (AbstractC6492s.d(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, AbstractC3682n.Q0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(AbstractC3682n.d1(objArr));
        sb2.append(')');
        throw new Y0(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void p(int i10, String str, Class cls) {
        String strL;
        th.d dVarB = AbstractC6492s.d(cls, Class.class) ? O.b(th.d.class) : (cls.isArray() && AbstractC6492s.d(cls.getComponentType(), Class.class)) ? O.b(th.d[].class) : AbstractC6596a.e(cls);
        if (AbstractC6492s.d(dVarB.l(), O.b(Object[].class).l())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dVarB.l());
            sb2.append('<');
            Class<?> componentType = AbstractC6596a.b(dVarB).getComponentType();
            AbstractC6492s.h(componentType, "getComponentType(...)");
            sb2.append(AbstractC6596a.e(componentType).l());
            sb2.append('>');
            strL = sb2.toString();
        } else {
            strL = dVarB.l();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof th.d) {
            obj = AbstractC6596a.b((th.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof th.d[]) {
                AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                th.d[] dVarArr = (th.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (th.d dVar : dVarArr) {
                    arrayList.add(AbstractC6596a.b(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
