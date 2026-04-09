package X0;

import T.InterfaceC3540l;
import X0.c;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.Q;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.T;
import kotlin.text.t;
import lh.AbstractC6596a;
import sh.AbstractC7978m;
import sh.C7974i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24005a = new a();

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean a(Class[] clsArr, Class[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                break;
            }
            Class cls = clsArr[i10];
            int i12 = i11 + 1;
            Class cls2 = clsArr2[i11];
            if (!AbstractC6492s.d(AbstractC6596a.e(cls), AbstractC6596a.e(cls2)) && !cls.isAssignableFrom(cls2)) {
                z10 = false;
            }
            arrayList.add(Boolean.valueOf(z10));
            i10++;
            i11 = i12;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final int b(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil((i10 + i11) / 10.0d);
    }

    private final int c(int i10) {
        return (int) Math.ceil(i10 / 31.0d);
    }

    private final Method d(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methodArr[i10];
            if (!AbstractC6492s.d(str, method2.getName())) {
                if (!t.P(method2.getName(), str + '-', false, 2, null)) {
                    continue;
                }
                i10++;
            }
            if (f24005a.a(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i10++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    private final Method e(Class cls, String str, Object... objArr) throws SecurityException {
        Method method;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i10 = 0;
        while (true) {
            method = null;
            method = null;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i10++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iB = b(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                C7974i c7974iS = AbstractC7978m.s(0, iB);
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(c7974iS, 10));
                Iterator it = c7974iS.iterator();
                while (it.hasNext()) {
                    ((Q) it).d();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                T t10 = new T(3);
                t10.b(clsArr);
                t10.a(InterfaceC3540l.class);
                t10.b(clsArr2);
                return d(declaredMethods, str, (Class[]) t10.d(new Class[t10.c()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method2 : cls.getDeclaredMethods()) {
                    if (!AbstractC6492s.d(method2.getName(), str)) {
                        if (!t.P(method2.getName(), str + '-', false, 2, null)) {
                        }
                    }
                    method = method2;
                    break;
                }
                return method;
            }
        } catch (ReflectiveOperationException unused2) {
            return method;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object f(Class cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }

    private final Object h(Method method, Object obj, InterfaceC3540l interfaceC3540l, Object... objArr) {
        Object objF;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i10 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (AbstractC6492s.d(parameterTypes[length], InterfaceC3540l.class)) {
                    i10 = length;
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        int i12 = i10 + 1;
        int iB = b(i10, obj != null ? 1 : 0) + i12;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iB ? c(i10) : 0) + iB != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        int i13 = 0;
        while (i13 < length2) {
            if (i13 >= 0 && i13 < i10) {
                objF = (i13 < 0 || i13 > AbstractC3682n.g0(objArr)) ? f24005a.f(method.getParameterTypes()[i13]) : objArr[i13];
            } else if (i13 == i10) {
                objF = interfaceC3540l;
            } else if (i12 <= i13 && i13 < iB) {
                objF = 0;
            } else {
                if (iB > i13 || i13 >= length2) {
                    throw new IllegalStateException("Unexpected index");
                }
                objF = 2097151;
            }
            objArr2[i13] = objF;
            i13++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public final void g(String str, String str2, InterfaceC3540l interfaceC3540l, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodE = e(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodE != null) {
                methodE.setAccessible(true);
                if (Modifier.isStatic(methodE.getModifiers())) {
                    h(methodE, null, interfaceC3540l, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    h(methodE, cls.getConstructor(null).newInstance(null), interfaceC3540l, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e10) {
            c.a.c(c.f24009a, "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null, 2, null);
            throw e10;
        }
    }
}
