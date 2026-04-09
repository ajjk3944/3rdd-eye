package wh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2515z;
import Gh.AbstractC2914f;
import Zg.AbstractC3689v;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC6482h;
import kotlin.text.InterfaceC6518l;
import mh.InterfaceC6839p;
import org.snmp4j.smi.SMIConstants;
import wh.a1;

/* renamed from: wh.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8355d0 implements InterfaceC6482h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f65125a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Class f65126b = DefaultConstructorMarker.class;

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.text.p f65127c = new kotlin.text.p("<v#(\\d+)>");

    /* renamed from: wh.d0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.text.p a() {
            return AbstractC8355d0.f65127c;
        }

        private a() {
        }
    }

    /* renamed from: wh.d0$b */
    public abstract class b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ th.l[] f65128c = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a, reason: collision with root package name */
        private final a1.a f65129a;

        public b() {
            this.f65129a = a1.c(new C8357e0(AbstractC8355d0.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fh.k c(AbstractC8355d0 abstractC8355d0) {
            return Z0.a(abstractC8355d0.b());
        }

        public final Fh.k b() {
            Object objB = this.f65129a.b(this, f65128c[0]);
            AbstractC6492s.h(objB, "getValue(...)");
            return (Fh.k) objB;
        }
    }

    /* renamed from: wh.d0$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final List f65131a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f65132b;

        public c(List parameters, Class cls) {
            AbstractC6492s.i(parameters, "parameters");
            this.f65131a = parameters;
            this.f65132b = cls;
        }

        public final List a() {
            return this.f65131a;
        }

        public final Class b() {
            return this.f65132b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: wh.d0$d */
    protected static final class d {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d DECLARED = new d("DECLARED", 0);
        public static final d INHERITED = new d("INHERITED", 1);

        private static final /* synthetic */ d[] $values() {
            return new d[]{DECLARED, INHERITED};
        }

        static {
            d[] dVarArr$values = $values();
            $VALUES = dVarArr$values;
            $ENTRIES = AbstractC5827b.a(dVarArr$values);
        }

        private d(String str, int i10) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public final boolean accept(InterfaceC2492b member) {
            AbstractC6492s.i(member, "member");
            return member.h().isReal() == (this == DECLARED);
        }
    }

    /* renamed from: wh.d0$e */
    public static final class e extends C8366j {
        e(AbstractC8355d0 abstractC8355d0) {
            super(abstractC8355d0);
        }

        @Override // Dh.AbstractC2609o, Bh.InterfaceC2505o
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public AbstractC8339A f(InterfaceC2502l descriptor, Yg.J data) {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C(AbstractC2510u abstractC2510u, AbstractC2510u abstractC2510u2) {
        Integer numD = AbstractC2509t.d(abstractC2510u, abstractC2510u2);
        if (numD != null) {
            return numD.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D(InterfaceC6839p interfaceC6839p, Object obj, Object obj2) {
        return ((Number) interfaceC6839p.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence F(Bh.Y descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return kotlin.reflect.jvm.internal.impl.renderer.n.f52071k.O(descriptor) + " | " + f1.f65142a.f(descriptor).a();
    }

    private final Method N(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) throws NoSuchMethodException, SecurityException {
        Method methodN;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodT = T(cls, str, clsArr, cls2);
        if (methodT != null) {
            return methodT;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodN = N(superclass, str, clsArr, cls2, z10)) != null) {
            return methodN;
        }
        Iterator itA = AbstractC6477c.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls3 = (Class) itA.next();
            AbstractC6492s.f(cls3);
            Method methodN2 = N(cls3, str, clsArr, cls2, z10);
            if (methodN2 != null) {
                return methodN2;
            }
            if (z10) {
                Class clsA = Fh.e.a(AbstractC2914f.j(cls3), cls3.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr[0] = cls3;
                    Method methodT2 = T(clsA, str, clsArr, cls2);
                    if (methodT2 != null) {
                        return methodT2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final c O(String str, boolean z10) {
        int iJ0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (true) {
            if (str.charAt(i10) == ')') {
                return new c(arrayList, z10 ? Q(str, i10 + 1, str.length()) : null);
            }
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (kotlin.text.t.V("VZCBSIFJD", cCharAt, false, 2, null)) {
                iJ0 = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new Y0("Unknown type prefix in the method signature: " + str);
                }
                iJ0 = kotlin.text.t.j0(str, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(Q(str, i10, iJ0));
            i10 = iJ0;
        }
    }

    private final Class Q(String str, int i10, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderJ = AbstractC2914f.j(b());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            AbstractC6492s.h(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderJ.loadClass(kotlin.text.t.K(strSubstring, '/', '.', false, 4, null));
            AbstractC6492s.h(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            AbstractC6492s.h(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return j1.f(Q(str, i10 + 1, i11));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                return Character.TYPE;
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                return Double.TYPE;
            default:
                throw new Y0("Unknown type prefix in the method signature: " + str);
        }
    }

    private final Constructor R(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method T(Class cls, String str, Class[] clsArr, Class cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC6492s.d(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC6492s.h(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (AbstractC6492s.d(method.getName(), str) && AbstractC6492s.d(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final void q(List list, List list2, boolean z10) {
        if (AbstractC6492s.d(AbstractC3689v.D0(list2), f65126b)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class TYPE = Integer.TYPE;
            AbstractC6492s.h(TYPE, "TYPE");
            list.add(TYPE);
        }
        Class cls = z10 ? f65126b : Object.class;
        AbstractC6492s.f(cls);
        list.add(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence y(InterfaceC2515z descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return kotlin.reflect.jvm.internal.impl.renderer.n.f52071k.O(descriptor) + " | " + f1.f65142a.g(descriptor).a();
    }

    public final Bh.Y A(String name, String signature) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signature, "signature");
        InterfaceC6518l interfaceC6518lL = f65127c.l(signature);
        if (interfaceC6518lL != null) {
            String str = (String) interfaceC6518lL.a().a().b().get(1);
            Bh.Y yI = I(Integer.parseInt(str));
            if (yI != null) {
                return yI;
            }
            throw new Y0("Local property #" + str + " not found in " + b());
        }
        Zh.f fVarH = Zh.f.h(name);
        AbstractC6492s.h(fVarH, "identifier(...)");
        Collection collectionM = M(fVarH);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionM) {
            if (AbstractC6492s.d(f1.f65142a.f((Bh.Y) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Y0("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (Bh.Y) AbstractC3689v.R0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC2510u visibility = ((Bh.Y) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = Zg.U.g(linkedHashMap, new C8349a0(Z.f65114a)).values();
        AbstractC6492s.h(collectionValues, "<get-values>(...)");
        List list = (List) AbstractC3689v.A0(collectionValues);
        if (list.size() == 1) {
            AbstractC6492s.f(list);
            return (Bh.Y) AbstractC3689v.q0(list);
        }
        Zh.f fVarH2 = Zh.f.h(name);
        AbstractC6492s.h(fVarH2, "identifier(...)");
        String strZ0 = AbstractC3689v.z0(M(fVarH2), "\n", null, null, 0, null, C8351b0.f65120a, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strZ0.length() == 0 ? " no members found" : '\n' + strZ0);
        throw new Y0(sb2.toString());
    }

    public abstract Collection G();

    public abstract Collection H(Zh.f fVar);

    public abstract Bh.Y I(int i10);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.util.Collection K(ii.InterfaceC6164k r8, wh.AbstractC8355d0.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.AbstractC6492s.i(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.AbstractC6492s.i(r9, r0)
            wh.d0$e r0 = new wh.d0$e
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = ii.InterfaceC6167n.a.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            Bh.m r3 = (Bh.InterfaceC2503m) r3
            boolean r4 = r3 instanceof Bh.InterfaceC2492b
            if (r4 == 0) goto L4e
            r4 = r3
            Bh.b r4 = (Bh.InterfaceC2492b) r4
            Bh.u r5 = r4.getVisibility()
            Bh.u r6 = Bh.AbstractC2509t.f1799h
            boolean r5 = kotlin.jvm.internal.AbstractC6492s.d(r5, r6)
            if (r5 != 0) goto L4e
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L4e
            Yg.J r4 = Yg.J.f24997a
            java.lang.Object r3 = r3.t0(r0, r4)
            wh.A r3 = (wh.AbstractC8339A) r3
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r3 == 0) goto L20
            r1.add(r3)
            goto L20
        L55:
            java.util.List r8 = Zg.AbstractC3689v.i1(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.AbstractC8355d0.K(ii.k, wh.d0$d):java.util.Collection");
    }

    protected Class L() {
        Class clsK = AbstractC2914f.k(b());
        return clsK == null ? b() : clsK;
    }

    public abstract Collection M(Zh.f fVar);

    public final Constructor s(String desc) {
        AbstractC6492s.i(desc, "desc");
        return R(b(), O(desc, false).a());
    }

    public final Constructor u(String desc) {
        AbstractC6492s.i(desc, "desc");
        Class clsB = b();
        ArrayList arrayList = new ArrayList();
        q(arrayList, O(desc, false).a(), true);
        Yg.J j10 = Yg.J.f24997a;
        return R(clsB, arrayList);
    }

    public final Method w(String name, String desc, boolean z10) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(desc, "desc");
        if (AbstractC6492s.d(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(b());
        }
        c cVarO = O(desc, true);
        q(arrayList, cVarO.a(), false);
        Class clsL = L();
        String str = name + "$default";
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsB = cVarO.b();
        AbstractC6492s.f(clsB);
        return N(clsL, str, clsArr, clsB, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Bh.InterfaceC2515z x(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.AbstractC8355d0.x(java.lang.String, java.lang.String):Bh.z");
    }

    public final Method z(String name, String desc) {
        Method methodN;
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(desc, "desc");
        if (AbstractC6492s.d(name, "<init>")) {
            return null;
        }
        c cVarO = O(desc, true);
        Class[] clsArr = (Class[]) cVarO.a().toArray(new Class[0]);
        Class clsB = cVarO.b();
        AbstractC6492s.f(clsB);
        Method methodN2 = N(L(), name, clsArr, clsB, false);
        if (methodN2 != null) {
            return methodN2;
        }
        if (!L().isInterface() || (methodN = N(Object.class, name, clsArr, clsB, false)) == null) {
            return null;
        }
        return methodN;
    }
}
