package xh;

import Bh.H;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.Y;
import Bh.b0;
import Bh.s0;
import Bh.t0;
import Yg.s;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;
import mh.InterfaceC6835l;
import pi.AbstractC7346d0;
import pi.F0;
import pi.J0;
import pi.S;
import si.AbstractC7984d;
import wh.Y0;
import wh.j1;

/* loaded from: classes4.dex */
public abstract class o {
    private static final boolean a(Member member) {
        if (member.getDeclaringClass() == null) {
            return false;
        }
        return !AbstractC6596a.e(r0).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(h hVar, int i10, InterfaceC2492b interfaceC2492b, boolean z10) {
        if (j.a(hVar) == i10) {
            return;
        }
        throw new Y0("Inconsistent number of parameters in the descriptor and Java reflection object: " + j.a(hVar) + " != " + i10 + "\nCalling: " + interfaceC2492b + "\nParameter types: " + hVar.a() + ")\nDefault: " + z10);
    }

    public static final Object h(Object obj, InterfaceC2492b descriptor) {
        S sL;
        Class clsT;
        Method methodM;
        AbstractC6492s.i(descriptor, "descriptor");
        return (((descriptor instanceof Y) && bi.k.e((t0) descriptor)) || (sL = l(descriptor)) == null || (clsT = t(sL)) == null || (methodM = m(clsT, descriptor)) == null) ? obj : methodM.invoke(obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final xh.h i(xh.h r3, Bh.InterfaceC2492b r4, boolean r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC6492s.i(r3, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.AbstractC6492s.i(r4, r0)
            boolean r0 = bi.k.a(r4)
            if (r0 != 0) goto L94
            java.util.List r0 = r4.p0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L2b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            goto L49
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            Bh.b0 r1 = (Bh.b0) r1
            pi.S r1 = r1.getType()
            kotlin.jvm.internal.AbstractC6492s.h(r1, r2)
            boolean r1 = bi.k.h(r1)
            if (r1 == 0) goto L2f
            goto L94
        L49:
            java.util.List r0 = r4.i()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L62
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L62
            goto L80
        L62:
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            Bh.s0 r1 = (Bh.s0) r1
            pi.S r1 = r1.getType()
            kotlin.jvm.internal.AbstractC6492s.h(r1, r2)
            boolean r1 = bi.k.h(r1)
            if (r1 == 0) goto L66
            goto L94
        L80:
            pi.S r0 = r4.getReturnType()
            if (r0 == 0) goto L8e
            boolean r0 = bi.k.c(r0)
            r1 = 1
            if (r0 != r1) goto L8e
            goto L94
        L8e:
            boolean r0 = q(r4)
            if (r0 == 0) goto L9a
        L94:
            xh.n r0 = new xh.n
            r0.<init>(r4, r3, r5)
            r3 = r0
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.o.i(xh.h, Bh.b, boolean):xh.h");
    }

    public static /* synthetic */ h j(h hVar, InterfaceC2492b interfaceC2492b, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(hVar, interfaceC2492b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method k(Class cls, InterfaceC2492b interfaceC2492b) {
        try {
            return cls.getDeclaredMethod("box-impl", m(cls, interfaceC2492b).getReturnType());
        } catch (NoSuchMethodException unused) {
            throw new Y0("No box method found in inline class: " + cls + " (calling " + interfaceC2492b + ')');
        }
    }

    private static final S l(InterfaceC2492b interfaceC2492b) {
        b0 b0VarK0 = interfaceC2492b.k0();
        b0 b0VarD0 = interfaceC2492b.d0();
        if (b0VarK0 != null) {
            return b0VarK0.getType();
        }
        if (b0VarD0 != null) {
            if (interfaceC2492b instanceof InterfaceC2502l) {
                return b0VarD0.getType();
            }
            InterfaceC2503m interfaceC2503mB = interfaceC2492b.b();
            InterfaceC2495e interfaceC2495e = interfaceC2503mB instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mB : null;
            if (interfaceC2495e != null) {
                return interfaceC2495e.u();
            }
        }
        return null;
    }

    public static final Method m(Class cls, InterfaceC2492b descriptor) {
        AbstractC6492s.i(cls, "<this>");
        AbstractC6492s.i(descriptor, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            throw new Y0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final List n(AbstractC7346d0 type) {
        AbstractC6492s.i(type, "type");
        List listO = o(F0.a(type));
        if (listO == null) {
            return null;
        }
        List list = listO;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC2498h interfaceC2498hC = type.N0().c();
        AbstractC6492s.g(interfaceC2498hC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsQ = j1.q((InterfaceC2495e) interfaceC2498hC);
        AbstractC6492s.f(clsQ);
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    private static final List o(AbstractC7346d0 abstractC7346d0) {
        Collection collectionE;
        if (!bi.k.i(abstractC7346d0)) {
            return null;
        }
        InterfaceC2498h interfaceC2498hC = abstractC7346d0.N0().c();
        AbstractC6492s.g(interfaceC2498hC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        H hT = AbstractC5833e.t((InterfaceC2495e) interfaceC2498hC);
        AbstractC6492s.f(hT);
        List<s> listC = hT.c();
        ArrayList arrayList = new ArrayList();
        for (s sVar : listC) {
            Zh.f fVar = (Zh.f) sVar.a();
            List listO = o((AbstractC7346d0) sVar.c());
            if (listO != null) {
                List list = listO;
                collectionE = new ArrayList(AbstractC3689v.w(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    collectionE.add(fVar.d() + '-' + ((String) it.next()));
                }
            } else {
                collectionE = AbstractC3689v.e(fVar.d());
            }
            AbstractC3689v.C(arrayList, collectionE);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(AbstractC7346d0 abstractC7346d0, InterfaceC2492b interfaceC2492b) {
        Method methodM;
        List listN = n(abstractC7346d0);
        if (listN != null) {
            return listN;
        }
        Class clsT = t(abstractC7346d0);
        if (clsT == null || (methodM = m(clsT, interfaceC2492b)) == null) {
            return null;
        }
        return AbstractC3689v.e(methodM);
    }

    private static final boolean q(InterfaceC2492b interfaceC2492b) {
        S sL = l(interfaceC2492b);
        return sL != null && bi.k.h(sL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(InterfaceC2492b interfaceC2492b, Member member, InterfaceC6835l interfaceC6835l) {
        ArrayList arrayList = new ArrayList();
        b0 b0VarK0 = interfaceC2492b.k0();
        S type = b0VarK0 != null ? b0VarK0.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (interfaceC2492b instanceof InterfaceC2502l) {
            InterfaceC2495e interfaceC2495eC = ((InterfaceC2502l) interfaceC2492b).C();
            AbstractC6492s.h(interfaceC2495eC, "getConstructedClass(...)");
            if (interfaceC2495eC.M()) {
                InterfaceC2503m interfaceC2503mB = interfaceC2495eC.b();
                AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((InterfaceC2495e) interfaceC2503mB).u());
            }
        } else {
            InterfaceC2503m interfaceC2503mB2 = interfaceC2492b.b();
            AbstractC6492s.h(interfaceC2503mB2, "getContainingDeclaration(...)");
            if ((interfaceC2503mB2 instanceof InterfaceC2495e) && ((Boolean) interfaceC6835l.invoke(interfaceC2503mB2)).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((InterfaceC2495e) interfaceC2503mB2).u());
                } else {
                    AbstractC7346d0 abstractC7346d0U = ((InterfaceC2495e) interfaceC2503mB2).u();
                    AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
                    arrayList.add(AbstractC7984d.B(abstractC7346d0U));
                }
            }
        }
        List listI = interfaceC2492b.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(((s0) it.next()).getType());
        }
        return arrayList;
    }

    public static final Class s(InterfaceC2503m interfaceC2503m) {
        if (!(interfaceC2503m instanceof InterfaceC2495e) || !bi.k.b(interfaceC2503m)) {
            return null;
        }
        InterfaceC2495e interfaceC2495e = (InterfaceC2495e) interfaceC2503m;
        Class clsQ = j1.q(interfaceC2495e);
        if (clsQ != null) {
            return clsQ;
        }
        throw new Y0("Class object for the class " + interfaceC2495e.getName() + " cannot be found (classId=" + AbstractC5833e.n((InterfaceC2498h) interfaceC2503m) + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class t(S s10) {
        Class clsS = s(s10.N0().c());
        if (clsS == null) {
            return null;
        }
        if (!J0.l(s10)) {
            return clsS;
        }
        S sK = bi.k.k(s10);
        if (sK == null || J0.l(sK) || kotlin.reflect.jvm.internal.impl.builtins.i.s0(sK)) {
            return null;
        }
        return clsS;
    }

    public static final String u(InterfaceC2498h interfaceC2498h) {
        AbstractC6492s.i(interfaceC2498h, "<this>");
        Zh.b bVarN = AbstractC5833e.n(interfaceC2498h);
        AbstractC6492s.f(bVarN);
        return Yh.b.b(bVarN.b());
    }
}
