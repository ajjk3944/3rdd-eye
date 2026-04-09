package wh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Fh.l;
import Gh.AbstractC2914f;
import Gh.C2915g;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import di.AbstractC5398g;
import di.AbstractC5403l;
import di.C5392a;
import di.C5393b;
import di.C5402k;
import di.s;
import fi.AbstractC5833e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;
import li.C6608K;
import li.C6636n;
import li.C6638p;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Zh.c f65164a = new Zh.c("kotlin.jvm.JvmStatic");

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65165a;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.l.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f65165a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v12, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v14, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object a(di.C5393b r6, java.lang.ClassLoader r7) throws java.lang.NegativeArraySizeException {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.j1.a(di.b, java.lang.ClassLoader):java.lang.Object");
    }

    public static final AbstractC8339A b(Object obj) {
        AbstractC8339A abstractC8339A = obj instanceof AbstractC8339A ? (AbstractC8339A) obj : null;
        if (abstractC8339A != null) {
            return abstractC8339A;
        }
        C8365i0 c8365i0C = c(obj);
        return c8365i0C != null ? c8365i0C : d(obj);
    }

    public static final C8365i0 c(Object obj) {
        C8365i0 c8365i0 = obj instanceof C8365i0 ? (C8365i0) obj : null;
        if (c8365i0 != null) {
            return c8365i0;
        }
        AbstractC6489o abstractC6489o = obj instanceof AbstractC6489o ? (AbstractC6489o) obj : null;
        th.c cVarCompute = abstractC6489o != null ? abstractC6489o.compute() : null;
        if (cVarCompute instanceof C8365i0) {
            return (C8365i0) cVarCompute;
        }
        return null;
    }

    public static final K0 d(Object obj) {
        K0 k02 = obj instanceof K0 ? (K0) obj : null;
        if (k02 != null) {
            return k02;
        }
        kotlin.jvm.internal.I i10 = obj instanceof kotlin.jvm.internal.I ? (kotlin.jvm.internal.I) obj : null;
        th.c cVarCompute = i10 != null ? i10.compute() : null;
        if (cVarCompute instanceof K0) {
            return (K0) cVarCompute;
        }
        return null;
    }

    public static final List e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar) {
        Annotation annotationP;
        AbstractC6492s.i(aVar, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : annotations) {
            Bh.g0 g0VarJ = cVar.j();
            if (g0VarJ instanceof Fh.b) {
                annotationP = ((Fh.b) g0VarJ).d();
            } else if (g0VarJ instanceof l.a) {
                Gh.u uVarB = ((l.a) g0VarJ).b();
                C2915g c2915g = uVarB instanceof C2915g ? (C2915g) uVarB : null;
                annotationP = c2915g != null ? c2915g.R() : null;
            } else {
                annotationP = p(cVar);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class f(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object g(Type type) {
        AbstractC6492s.i(type, "type");
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (AbstractC6492s.d(cls, Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (AbstractC6492s.d(cls, Character.TYPE)) {
                    return (char) 0;
                }
                if (AbstractC6492s.d(cls, Byte.TYPE)) {
                    return (byte) 0;
                }
                if (AbstractC6492s.d(cls, Short.TYPE)) {
                    return (short) 0;
                }
                if (AbstractC6492s.d(cls, Integer.TYPE)) {
                    return 0;
                }
                if (AbstractC6492s.d(cls, Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (AbstractC6492s.d(cls, Long.TYPE)) {
                    return 0L;
                }
                if (AbstractC6492s.d(cls, Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (AbstractC6492s.d(cls, Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                throw new UnsupportedOperationException("Unknown primitive: " + type);
            }
        }
        return null;
    }

    public static final InterfaceC2491a h(Class moduleAnchor, kotlin.reflect.jvm.internal.impl.protobuf.n proto, Wh.c nameResolver, Wh.g typeTable, Wh.a metadataVersion, InterfaceC6839p createDescriptor) {
        List listW1;
        AbstractC6492s.i(moduleAnchor, "moduleAnchor");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        AbstractC6492s.i(createDescriptor, "createDescriptor");
        Fh.k kVarA = Z0.a(moduleAnchor);
        if (proto instanceof Uh.i) {
            listW1 = ((Uh.i) proto).v1();
        } else {
            if (!(proto instanceof Uh.n)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            listW1 = ((Uh.n) proto).w1();
        }
        List list = listW1;
        C6636n c6636nA = kVarA.a();
        Bh.G gB = kVarA.b();
        Wh.h hVarB = Wh.h.f23970b.b();
        AbstractC6492s.f(list);
        return (InterfaceC2491a) createDescriptor.invoke(new C6608K(new C6638p(c6636nA, nameResolver, gB, typeTable, hVarB, metadataVersion, null, null, list)), proto);
    }

    public static final Bh.b0 i(InterfaceC2491a interfaceC2491a) {
        AbstractC6492s.i(interfaceC2491a, "<this>");
        if (interfaceC2491a.d0() == null) {
            return null;
        }
        InterfaceC2503m interfaceC2503mB = interfaceC2491a.b();
        AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC2495e) interfaceC2503mB).J0();
    }

    public static final Zh.c j() {
        return f65164a;
    }

    public static final boolean k(th.p pVar) {
        pi.S sU;
        AbstractC6492s.i(pVar, "<this>");
        U0 u02 = pVar instanceof U0 ? (U0) pVar : null;
        return (u02 == null || (sU = u02.u()) == null || !bi.k.i(sU)) ? false : true;
    }

    public static final boolean l(th.p pVar) {
        pi.S sU;
        AbstractC6492s.i(pVar, "<this>");
        U0 u02 = pVar instanceof U0 ? (U0) pVar : null;
        return (u02 == null || (sU = u02.u()) == null || !bi.k.c(sU)) ? false : true;
    }

    private static final Class m(ClassLoader classLoader, Zh.b bVar, int i10) {
        Ah.c cVar = Ah.c.f771a;
        Zh.d dVarJ = bVar.a().j();
        AbstractC6492s.h(dVarJ, "toUnsafe(...)");
        Zh.b bVarN = cVar.n(dVarJ);
        if (bVarN != null) {
            bVar = bVarN;
        }
        String strB = bVar.f().b();
        AbstractC6492s.h(strB, "asString(...)");
        String strB2 = bVar.g().b();
        AbstractC6492s.h(strB2, "asString(...)");
        return n(classLoader, strB, strB2, i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final Class n(ClassLoader classLoader, String str, String str2, int i10) {
        if (AbstractC6492s.d(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + '.');
        }
        sb2.append(kotlin.text.t.K(str2, '.', '$', false, 4, null));
        if (i10 > 0) {
            sb2.append(";");
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return Fh.e.a(classLoader, string);
    }

    static /* synthetic */ Class o(ClassLoader classLoader, Zh.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m(classLoader, bVar, i10);
    }

    private static final Annotation p(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        InterfaceC2495e interfaceC2495eL = AbstractC5833e.l(cVar);
        Class clsQ = interfaceC2495eL != null ? q(interfaceC2495eL) : null;
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            Zh.f fVar = (Zh.f) entry.getKey();
            AbstractC5398g abstractC5398g = (AbstractC5398g) entry.getValue();
            ClassLoader classLoader = clsQ.getClassLoader();
            AbstractC6492s.h(classLoader, "getClassLoader(...)");
            Object objS = s(abstractC5398g, classLoader);
            Yg.s sVarA = objS != null ? Yg.z.a(fVar.b(), objS) : null;
            if (sVarA != null) {
                arrayList.add(sVarA);
            }
        }
        return (Annotation) xh.f.h(clsQ, Zg.U.r(arrayList), null, 4, null);
    }

    public static final Class q(InterfaceC2495e interfaceC2495e) {
        AbstractC6492s.i(interfaceC2495e, "<this>");
        Bh.g0 g0VarJ = interfaceC2495e.j();
        AbstractC6492s.h(g0VarJ, "getSource(...)");
        if (g0VarJ instanceof Sh.z) {
            Sh.x xVarD = ((Sh.z) g0VarJ).d();
            AbstractC6492s.g(xVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((Fh.f) xVarD).e();
        }
        if (g0VarJ instanceof l.a) {
            Gh.u uVarB = ((l.a) g0VarJ).b();
            AbstractC6492s.g(uVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((Gh.q) uVarB).v();
        }
        Zh.b bVarN = AbstractC5833e.n(interfaceC2495e);
        if (bVarN == null) {
            return null;
        }
        return m(AbstractC2914f.j(interfaceC2495e.getClass()), bVarN, 0);
    }

    public static final th.t r(AbstractC2510u abstractC2510u) {
        AbstractC6492s.i(abstractC2510u, "<this>");
        if (AbstractC6492s.d(abstractC2510u, AbstractC2509t.f1796e)) {
            return th.t.PUBLIC;
        }
        if (AbstractC6492s.d(abstractC2510u, AbstractC2509t.f1794c)) {
            return th.t.PROTECTED;
        }
        if (AbstractC6492s.d(abstractC2510u, AbstractC2509t.f1795d)) {
            return th.t.INTERNAL;
        }
        if (AbstractC6492s.d(abstractC2510u, AbstractC2509t.f1792a) || AbstractC6492s.d(abstractC2510u, AbstractC2509t.f1793b)) {
            return th.t.PRIVATE;
        }
        return null;
    }

    private static final Object s(AbstractC5398g abstractC5398g, ClassLoader classLoader) {
        if (abstractC5398g instanceof C5392a) {
            return p((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) ((C5392a) abstractC5398g).b());
        }
        if (abstractC5398g instanceof C5393b) {
            return a((C5393b) abstractC5398g, classLoader);
        }
        if (abstractC5398g instanceof C5402k) {
            Yg.s sVar = (Yg.s) ((C5402k) abstractC5398g).b();
            Zh.b bVar = (Zh.b) sVar.a();
            Zh.f fVar = (Zh.f) sVar.c();
            Class clsO = o(classLoader, bVar, 0, 4, null);
            if (clsO != null) {
                return i1.a(clsO, fVar.b());
            }
        } else if (abstractC5398g instanceof di.s) {
            s.b bVar2 = (s.b) ((di.s) abstractC5398g).b();
            if (bVar2 instanceof s.b.C1725b) {
                s.b.C1725b c1725b = (s.b.C1725b) bVar2;
                return m(classLoader, c1725b.b(), c1725b.a());
            }
            if (!(bVar2 instanceof s.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC2498h interfaceC2498hC = ((s.b.a) bVar2).a().N0().c();
            InterfaceC2495e interfaceC2495e = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
            if (interfaceC2495e != null) {
                return q(interfaceC2495e);
            }
        } else if (!(abstractC5398g instanceof AbstractC5403l) && !(abstractC5398g instanceof di.u)) {
            return abstractC5398g.b();
        }
        return null;
    }

    private static final List t(List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List listE;
        List<Annotation> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC6492s.d(AbstractC6596a.b(AbstractC6596a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                    list = new ArrayList();
                    for (Annotation annotation : list2) {
                        Class clsB = AbstractC6596a.b(AbstractC6596a.a(annotation));
                        if (!AbstractC6492s.d(clsB.getSimpleName(), "Container") || clsB.getAnnotation(kotlin.jvm.internal.Q.class) == null) {
                            listE = AbstractC3689v.e(annotation);
                        } else {
                            Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                            AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listE = AbstractC3682n.e((Annotation[]) objInvoke);
                        }
                        AbstractC3689v.C(list, listE);
                    }
                }
            }
        }
        return list;
    }
}
