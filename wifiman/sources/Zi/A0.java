package Zi;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6478d;
import kotlin.jvm.internal.C6479e;
import kotlin.jvm.internal.C6481g;
import kotlin.jvm.internal.C6485k;
import kotlin.jvm.internal.C6486l;
import kotlin.jvm.internal.C6495v;
import kotlinx.serialization.SerializationException;
import lh.AbstractC6596a;

/* loaded from: classes4.dex */
public abstract class A0 {
    private static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Vi.b b(th.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return d(dVar, new Vi.b[0]);
    }

    public static final Vi.b c(Class cls, Vi.b... args) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(cls, "<this>");
        AbstractC6492s.i(args, "args");
        if (cls.isEnum() && m(cls)) {
            return e(cls);
        }
        Vi.b bVarK = k(cls, (Vi.b[]) Arrays.copyOf(args, args.length));
        if (bVarK != null) {
            return bVarK;
        }
        Vi.b bVarH = h(cls);
        if (bVarH != null) {
            return bVarH;
        }
        Vi.b bVarF = f(cls, (Vi.b[]) Arrays.copyOf(args, args.length));
        if (bVarF != null) {
            return bVarF;
        }
        if (n(cls)) {
            return new Vi.f(AbstractC6596a.e(cls));
        }
        return null;
    }

    public static final Vi.b d(th.d dVar, Vi.b... args) {
        AbstractC6492s.i(dVar, "<this>");
        AbstractC6492s.i(args, "args");
        return c(AbstractC6596a.b(dVar), (Vi.b[]) Arrays.copyOf(args, args.length));
    }

    private static final Vi.b e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        AbstractC6492s.h(canonicalName, "getCanonicalName(...)");
        AbstractC6492s.g(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new I(canonicalName, (Enum[]) enumConstants);
    }

    private static final Vi.b f(Class cls, Vi.b... bVarArr) {
        Field field;
        Vi.b bVarJ;
        Object objG = g(cls);
        if (objG != null && (bVarJ = j(objG, (Vi.b[]) Arrays.copyOf(bVarArr, bVarArr.length))) != null) {
            return bVarJ;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            AbstractC6492s.h(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Class<?> cls3 = declaredClasses[i10];
                    if (AbstractC6492s.d(cls3.getSimpleName(), "$serializer")) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        cls2 = cls3;
                    }
                    i10++;
                } else if (!z10) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof Vi.b) {
                return (Vi.b) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final Object g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        AbstractC6492s.h(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(InterfaceC3721n0.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        AbstractC6492s.h(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final Vi.b h(java.lang.Class r11) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = kotlin.text.t.P(r0, r2, r3, r4, r1)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "kotlin."
            boolean r0 = kotlin.text.t.P(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L28:
            r7 = 1
            if (r4 >= r2) goto L56
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.AbstractC6492s.d(r9, r10)
            if (r9 == 0) goto L53
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.AbstractC6492s.d(r9, r11)
            if (r9 == 0) goto L53
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L53
            if (r5 == 0) goto L51
        L4f:
            r6 = r1
            goto L59
        L51:
            r5 = r7
            r6 = r8
        L53:
            int r4 = r4 + 1
            goto L28
        L56:
            if (r5 != 0) goto L59
            goto L4f
        L59:
            if (r6 != 0) goto L5c
            return r1
        L5c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L6c:
            if (r3 >= r2) goto L9d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.AbstractC6492s.d(r8, r9)
            if (r8 == 0) goto L9a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L9a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<Vi.b> r9 = Vi.b.class
            boolean r8 = kotlin.jvm.internal.AbstractC6492s.d(r8, r9)
            if (r8 == 0) goto L9a
            if (r4 == 0) goto L98
        L96:
            r5 = r1
            goto La0
        L98:
            r5 = r6
            r4 = r7
        L9a:
            int r3 = r3 + 1
            goto L6c
        L9d:
            if (r4 != 0) goto La0
            goto L96
        La0:
            if (r5 != 0) goto La3
            return r1
        La3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof Vi.b
            if (r0 == 0) goto Lae
            r1 = r11
            Vi.b r1 = (Vi.b) r1
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Zi.A0.h(java.lang.Class):Vi.b");
    }

    public static final Map i() {
        Map mapC = Zg.U.c();
        mapC.put(kotlin.jvm.internal.O.b(String.class), Wi.a.K(kotlin.jvm.internal.U.f51694a));
        mapC.put(kotlin.jvm.internal.O.b(Character.TYPE), Wi.a.E(C6481g.f51716a));
        mapC.put(kotlin.jvm.internal.O.b(char[].class), Wi.a.d());
        mapC.put(kotlin.jvm.internal.O.b(Double.TYPE), Wi.a.F(C6485k.f51725a));
        mapC.put(kotlin.jvm.internal.O.b(double[].class), Wi.a.e());
        mapC.put(kotlin.jvm.internal.O.b(Float.TYPE), Wi.a.G(C6486l.f51726a));
        mapC.put(kotlin.jvm.internal.O.b(float[].class), Wi.a.f());
        mapC.put(kotlin.jvm.internal.O.b(Long.TYPE), Wi.a.I(C6495v.f51728a));
        mapC.put(kotlin.jvm.internal.O.b(long[].class), Wi.a.i());
        mapC.put(kotlin.jvm.internal.O.b(Yg.E.class), Wi.a.z(Yg.E.f24986b));
        mapC.put(kotlin.jvm.internal.O.b(Integer.TYPE), Wi.a.H(kotlin.jvm.internal.r.f51727a));
        mapC.put(kotlin.jvm.internal.O.b(int[].class), Wi.a.g());
        mapC.put(kotlin.jvm.internal.O.b(Yg.C.class), Wi.a.y(Yg.C.f24981b));
        mapC.put(kotlin.jvm.internal.O.b(Short.TYPE), Wi.a.J(kotlin.jvm.internal.S.f51692a));
        mapC.put(kotlin.jvm.internal.O.b(short[].class), Wi.a.o());
        mapC.put(kotlin.jvm.internal.O.b(Yg.H.class), Wi.a.A(Yg.H.f24992b));
        mapC.put(kotlin.jvm.internal.O.b(Byte.TYPE), Wi.a.D(C6479e.f51714a));
        mapC.put(kotlin.jvm.internal.O.b(byte[].class), Wi.a.c());
        mapC.put(kotlin.jvm.internal.O.b(Yg.A.class), Wi.a.x(Yg.A.f24976b));
        mapC.put(kotlin.jvm.internal.O.b(Boolean.TYPE), Wi.a.C(C6478d.f51713a));
        mapC.put(kotlin.jvm.internal.O.b(boolean[].class), Wi.a.b());
        mapC.put(kotlin.jvm.internal.O.b(Yg.J.class), Wi.a.B(Yg.J.f24997a));
        mapC.put(kotlin.jvm.internal.O.b(Void.class), Wi.a.l());
        try {
            mapC.put(kotlin.jvm.internal.O.b(Ai.a.class), Wi.a.v(Ai.a.f849b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapC.put(kotlin.jvm.internal.O.b(Yg.F.class), Wi.a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapC.put(kotlin.jvm.internal.O.b(Yg.D.class), Wi.a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapC.put(kotlin.jvm.internal.O.b(Yg.I.class), Wi.a.t());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapC.put(kotlin.jvm.internal.O.b(Yg.B.class), Wi.a.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapC.put(kotlin.jvm.internal.O.b(Bi.b.class), Wi.a.w(Bi.b.f1826c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return Zg.U.b(mapC);
    }

    private static final Vi.b j(Object obj, Vi.b... bVarArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = Vi.b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (objInvoke instanceof Vi.b) {
                return (Vi.b) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final Vi.b k(Class cls, Vi.b... bVarArr) {
        Object objA = a(cls, "Companion");
        if (objA == null) {
            return null;
        }
        return j(objA, (Vi.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final boolean l(th.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return AbstractC6596a.b(dVar).isInterface();
    }

    private static final boolean m(Class cls) {
        return cls.getAnnotation(Vi.n.class) == null && cls.getAnnotation(Vi.c.class) == null;
    }

    private static final boolean n(Class cls) {
        if (cls.getAnnotation(Vi.c.class) != null) {
            return true;
        }
        Vi.n nVar = (Vi.n) cls.getAnnotation(Vi.n.class);
        return nVar != null && AbstractC6492s.d(kotlin.jvm.internal.O.b(nVar.with()), kotlin.jvm.internal.O.b(Vi.f.class));
    }

    public static final boolean o(th.d rootClass) {
        AbstractC6492s.i(rootClass, "rootClass");
        return AbstractC6596a.b(rootClass).isArray();
    }

    public static final Void p(th.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        B0.f(dVar);
        throw new KotlinNothingValueException();
    }

    public static final Void q(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        throw new SerializationException(B0.e(AbstractC6596a.e(cls)));
    }

    public static final Object[] r(ArrayList arrayList, th.d eClass) throws NegativeArraySizeException {
        AbstractC6492s.i(arrayList, "<this>");
        AbstractC6492s.i(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC6596a.b(eClass), arrayList.size());
        AbstractC6492s.g(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        AbstractC6492s.h(array, "toArray(...)");
        return array;
    }
}
