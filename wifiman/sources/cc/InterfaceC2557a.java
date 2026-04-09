package Cc;

import Zg.AbstractC3689v;
import a8.C3772b;
import com.ui.wifiman.model.bluetooth.le.a;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC6492s;
import le.C6588i;
import wc.C8321a;
import xa.InterfaceC8439a;

/* renamed from: Cc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2557a extends k {

    /* renamed from: Cc.a$a, reason: collision with other inner class name */
    public static final class C0116a {
        public static AbstractC2558b a(InterfaceC2557a interfaceC2557a) {
            AbstractC2558b abstractC2558bD;
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null && (abstractC2558bD = jVarJ.d()) != null) {
                return abstractC2558bD;
            }
            C8321a c8321aP = interfaceC2557a.p();
            if (c8321aP != null) {
                return c8321aP.n();
            }
            return null;
        }

        public static String b(InterfaceC2557a interfaceC2557a) {
            String strH;
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null && (strH = jVarJ.h()) != null) {
                return strH;
            }
            a.C1388a c1388aG = interfaceC2557a.g();
            if (c1388aG != null) {
                return c1388aG.b();
            }
            return null;
        }

        public static String c(InterfaceC2557a interfaceC2557a) {
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null) {
                return jVarJ.o();
            }
            return null;
        }

        public static Set d(InterfaceC2557a interfaceC2557a) {
            List listB;
            Object next;
            Set setQ;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null && (setQ = jVarJ.q()) != null) {
                linkedHashSet.addAll(setQ);
            }
            C8321a c8321aP = interfaceC2557a.p();
            if (c8321aP != null && (listB = c8321aP.b()) != null) {
                Iterator it = listB.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((com.ui.wifiman.model.bluetooth.le.j) next) instanceof yc.r) {
                        break;
                    }
                }
                com.ui.wifiman.model.bluetooth.le.j jVar = (com.ui.wifiman.model.bluetooth.le.j) next;
                if (jVar != null) {
                    yc.r rVar = (yc.r) jVar;
                    if (rVar.a() != null) {
                        inet.ipaddr.g gVarA = rVar.a();
                        AbstractC6492s.f(gVarA);
                        linkedHashSet.add(gVarA);
                    }
                }
            }
            return linkedHashSet;
        }

        public static C6180b e(InterfaceC2557a interfaceC2557a) {
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null) {
                return jVarJ.n();
            }
            return null;
        }

        public static C6205b f(InterfaceC2557a interfaceC2557a) {
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null) {
                return jVarJ.i();
            }
            return null;
        }

        public static C5969a g(InterfaceC2557a interfaceC2557a) {
            C5969a c5969aL;
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null && (c5969aL = jVarJ.l()) != null) {
                return c5969aL;
            }
            C8321a c8321aP = interfaceC2557a.p();
            if (c8321aP != null) {
                return c8321aP.h();
            }
            C6588i c6588i = (C6588i) AbstractC3689v.r0(interfaceC2557a.m());
            if (c6588i != null) {
                return c6588i.e();
            }
            return null;
        }

        public static Set h(InterfaceC2557a interfaceC2557a) {
            C5969a c5969aD;
            C5969a c5969aH;
            Set setK;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null && (setK = jVarJ.k()) != null) {
                linkedHashSet.addAll(setK);
            }
            C8321a c8321aP = interfaceC2557a.p();
            if (c8321aP != null && (c5969aH = c8321aP.h()) != null) {
                linkedHashSet.add(c5969aH);
            }
            C8321a c8321aP2 = interfaceC2557a.p();
            if (c8321aP2 != null && (c5969aD = c8321aP2.d()) != null) {
                linkedHashSet.add(c5969aD);
            }
            return linkedHashSet;
        }

        public static String i(InterfaceC2557a interfaceC2557a) {
            String strB;
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null && (strB = jVarJ.b()) != null) {
                return strB;
            }
            InterfaceC8439a.d dVarF = interfaceC2557a.f();
            if (dVarF != null) {
                return dVarF.getName();
            }
            a.C1388a c1388aG = interfaceC2557a.g();
            if (c1388aG != null) {
                return c1388aG.d();
            }
            return null;
        }

        public static String j(InterfaceC2557a interfaceC2557a) {
            String strC;
            l config = interfaceC2557a.getConfig();
            if (config != null && (strC = config.c()) != null) {
                return strC;
            }
            Dc.j jVarJ = interfaceC2557a.j();
            String name = jVarJ != null ? jVarJ.getName() : null;
            if (name != null) {
                return name;
            }
            C8321a c8321aP = interfaceC2557a.p();
            String strI = c8321aP != null ? c8321aP.i() : null;
            if (strI != null) {
                return strI;
            }
            a.C1388a c1388aG = interfaceC2557a.g();
            if (c1388aG != null) {
                return c1388aG.e();
            }
            return null;
        }

        public static InterfaceC8439a.d k(InterfaceC2557a interfaceC2557a) {
            InterfaceC8439a.d dVarF;
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null && (dVarF = jVarJ.f()) != null) {
                return dVarF;
            }
            C8321a c8321aP = interfaceC2557a.p();
            if (c8321aP != null) {
                return c8321aP.j();
            }
            return null;
        }

        public static Long l(InterfaceC2557a interfaceC2557a) {
            List<com.ui.wifiman.model.bluetooth.le.j> listB;
            Long lE;
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null && (lE = jVarJ.e()) != null) {
                return lE;
            }
            C8321a c8321aP = interfaceC2557a.p();
            if (c8321aP == null || (listB = c8321aP.b()) == null) {
                return null;
            }
            for (com.ui.wifiman.model.bluetooth.le.j jVar : listB) {
                yc.r rVar = jVar instanceof yc.r ? (yc.r) jVar : null;
                Long lC = rVar != null ? rVar.c() : null;
                if (lC != null) {
                    return lC;
                }
            }
            return null;
        }

        public static com.ui.wifiman.model.vendor.d m(InterfaceC2557a interfaceC2557a) {
            com.ui.wifiman.model.vendor.d dVarC;
            Dc.j jVarJ = interfaceC2557a.j();
            if (jVarJ != null && (dVarC = jVarJ.c()) != null) {
                return dVarC;
            }
            C6588i c6588i = (C6588i) AbstractC3689v.r0(interfaceC2557a.m());
            com.ui.wifiman.model.vendor.d dVarU = c6588i != null ? c6588i.u() : null;
            if (dVarU != null) {
                return dVarU;
            }
            C8321a c8321aP = interfaceC2557a.p();
            com.ui.wifiman.model.vendor.d dVarO = c8321aP != null ? c8321aP.o() : null;
            if (dVarO != null) {
                return dVarO;
            }
            a.C1388a c1388aG = interfaceC2557a.g();
            if (c1388aG != null) {
                return c1388aG.f();
            }
            return null;
        }
    }

    /* renamed from: Cc.a$b */
    public interface b extends InterfaceC2557a {

        /* renamed from: Cc.a$b$a, reason: collision with other inner class name */
        public static final class C0117a {
            public static AbstractC2558b a(b bVar) {
                return C0116a.a(bVar);
            }

            public static String b(b bVar) {
                return C0116a.b(bVar);
            }

            public static String c(b bVar) {
                return C0116a.c(bVar);
            }

            public static Set d(b bVar) {
                return C0116a.d(bVar);
            }

            public static C6180b e(b bVar) {
                return C0116a.e(bVar);
            }

            public static C6205b f(b bVar) {
                return C0116a.f(bVar);
            }

            public static C5969a g(b bVar) {
                return C0116a.g(bVar);
            }

            public static Set h(b bVar) {
                return C0116a.h(bVar);
            }

            public static String i(b bVar) {
                return C0116a.i(bVar);
            }

            public static String j(b bVar) {
                return C0116a.j(bVar);
            }

            public static InterfaceC8439a.d k(b bVar) {
                return C0116a.k(bVar);
            }

            public static Long l(b bVar) {
                return C0116a.l(bVar);
            }

            public static com.ui.wifiman.model.vendor.d m(b bVar) {
                return C0116a.m(bVar);
            }
        }

        @Override // Cc.k
        C3772b getId();
    }

    String b();

    com.ui.wifiman.model.vendor.d c();

    @Override // Cc.k
    AbstractC2558b d();

    Long e();

    InterfaceC8439a.d f();

    a.C1388a g();

    l getConfig();

    String getName();

    String h();

    C6205b i();

    Dc.j j();

    Set k();

    C5969a l();

    TreeSet m();

    C6180b n();

    String o();

    C8321a p();

    Set q();
}
