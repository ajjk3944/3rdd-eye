package th;

import Zg.AbstractC3689v;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.InterfaceC6493t;
import lh.AbstractC6596a;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public abstract class w {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62651a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62651a = iArr;
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f62652a = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class p02) {
            AbstractC6492s.i(p02, "p0");
            return p02.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(p pVar, boolean z10) {
        e eVarR = pVar.r();
        if (eVarR instanceof q) {
            return new v((q) eVarR);
        }
        if (!(eVarR instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + pVar);
        }
        d dVar = (d) eVarR;
        Class clsC = z10 ? AbstractC6596a.c(dVar) : AbstractC6596a.b(dVar);
        List listJ = pVar.j();
        if (listJ.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, listJ);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        r rVar = (r) AbstractC3689v.T0(listJ);
        if (rVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + pVar);
        }
        s sVarA = rVar.a();
        p pVarB = rVar.b();
        int i10 = sVarA == null ? -1 : a.f62651a[sVarA.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsC;
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC6492s.f(pVarB);
        Type typeD = d(pVarB, false, 1, null);
        return typeD instanceof Class ? clsC : new C8115a(typeD);
    }

    static /* synthetic */ Type d(p pVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(pVar, z10);
    }

    private static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((r) it.next()));
            }
            return new u(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((r) it2.next()));
            }
            return new u(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((r) it3.next()));
        }
        return new u(cls, typeE, arrayList3);
    }

    public static final Type f(p pVar) {
        Type typeE;
        AbstractC6492s.i(pVar, "<this>");
        return (!(pVar instanceof InterfaceC6493t) || (typeE = ((InterfaceC6493t) pVar).E()) == null) ? d(pVar, false, 1, null) : typeE;
    }

    private static final Type g(r rVar) {
        s sVarD = rVar.d();
        if (sVarD == null) {
            return x.f62653c.a();
        }
        p pVarC = rVar.c();
        AbstractC6492s.f(pVarC);
        int i10 = a.f62651a[sVarD.ordinal()];
        if (i10 == 1) {
            return new x(null, c(pVarC, true));
        }
        if (i10 == 2) {
            return c(pVarC, true);
        }
        if (i10 == 3) {
            return new x(c(pVarC, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            AbstractC6492s.h(name, "getName(...)");
            return name;
        }
        InterfaceC8780j interfaceC8780jN = AbstractC8783m.n(type, b.f62652a);
        return ((Class) AbstractC8783m.M(interfaceC8780jN)).getName() + kotlin.text.t.H("[]", AbstractC8783m.x(interfaceC8780jN));
    }
}
