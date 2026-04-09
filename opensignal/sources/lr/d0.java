package lr;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d0 implements br.e {

    /* renamed from: a, reason: collision with root package name */
    public static final tt.k f15606a = new tt.k("<v#(\\d+)>");

    public static Method B(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) throws NoSuchMethodException, SecurityException {
        Class clsX;
        Method methodB;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodD = D(cls, str, clsArr, cls2);
        if (methodD != null) {
            return methodD;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodB = B(superclass, str, clsArr, cls2, z10)) != null) {
            return methodB;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        br.l.d(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            br.l.d(cls3, "superInterface");
            Method methodB2 = B(cls3, str, clsArr, cls2, z10);
            if (methodB2 != null) {
                return methodB2;
            }
            if (z10 && (clsX = kc.f.X(xr.d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodD2 = D(clsX, str, clsArr, cls2);
                if (methodD2 != null) {
                    return methodD2;
                }
            }
        }
        return null;
    }

    public static Method D(Class cls, String str, Class[] clsArr, Class cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (br.l.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            br.l.d(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (br.l.a(method.getName(), str) && br.l.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final ArrayList A(String str) {
        int iA0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (tt.l.r0("VZCBSIFJD", cCharAt)) {
                iA0 = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new lq.k("Unknown type prefix in the method signature: ".concat(str), 1);
                }
                iA0 = tt.l.A0(str, ';', i10, 4) + 1;
            }
            arrayList.add(C(str, i10, iA0));
            i10 = iA0;
        }
        return arrayList;
    }

    public final Class C(String str, int i10, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = xr.d.d(a());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> clsLoadClass = classLoaderD.loadClass(tt.s.k0(strSubstring, '/', '.'));
            br.l.d(clsLoadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            Class clsC = C(str, i10 + 1, i11);
            qs.c cVar = z1.f15721a;
            br.l.e(clsC, "<this>");
            return Array.newInstance((Class<?>) clsC, 0).getClass();
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            br.l.d(cls, "TYPE");
            return cls;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new lq.k("Unknown type prefix in the method signature: ".concat(str), 1);
    }

    public final void c(ArrayList arrayList, String str, boolean z10) {
        ArrayList arrayListA = A(str);
        arrayList.addAll(arrayListA);
        int size = (arrayListA.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class cls = Integer.TYPE;
            br.l.d(cls, "TYPE");
            arrayList.add(cls);
        }
        if (!z10) {
            arrayList.add(Object.class);
        } else {
            arrayList.remove(br.g.class);
            arrayList.add(br.g.class);
        }
    }

    public final Method f(String str, String str2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodB;
        br.l.e(str, "name");
        br.l.e(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) A(str2).toArray(new Class[0]);
        Class clsC = C(str2, tt.l.A0(str2, ')', 0, 6) + 1, str2.length());
        Method methodB2 = B(w(), str, clsArr, clsC, false);
        if (methodB2 != null) {
            return methodB2;
        }
        if (!w().isInterface() || (methodB = B(Object.class, str, clsArr, clsC, false)) == null) {
            return null;
        }
        return methodB;
    }

    public abstract Collection g();

    public abstract Collection h(qs.g gVar);

    public abstract rr.m0 j(int i10);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l(at.n r8, lr.b0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            br.l.e(r8, r0)
            java.lang.String r0 = "belonginess"
            br.l.e(r9, r0)
            lr.c0 r0 = new lr.c0
            r1 = 19
            r0.<init>(r1, r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = i3.g.q(r8, r2, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L22:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r8.next()
            rr.l r3 = (rr.l) r3
            boolean r4 = r3 instanceof rr.d
            if (r4 == 0) goto L50
            r4 = r3
            rr.d r4 = (rr.d) r4
            as.p r5 = r4.c()
            as.p r6 = rr.p.f21704h
            boolean r5 = br.l.a(r5, r6)
            if (r5 != 0) goto L50
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L50
            lq.b0 r4 = lq.b0.f15562a
            java.lang.Object r3 = r3.w0(r0, r4)
            lr.r r3 = (lr.r) r3
            goto L51
        L50:
            r3 = r2
        L51:
            if (r3 == 0) goto L22
            r1.add(r3)
            goto L22
        L57:
            java.util.List r8 = mq.o.Q0(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.d0.l(at.n, lr.b0):java.util.List");
    }

    public Class w() {
        Class clsA = a();
        List list = xr.d.f25493a;
        br.l.e(clsA, "<this>");
        Class cls = (Class) xr.d.f25495c.get(clsA);
        return cls == null ? a() : cls;
    }

    public abstract Collection z(qs.g gVar);
}
