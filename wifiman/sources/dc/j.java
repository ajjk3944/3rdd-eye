package Dc;

import Cc.AbstractC2558b;
import Ec.t;
import Fc.a;
import Gc.a;
import Ic.a;
import Jc.a;
import Lc.a;
import Mc.a;
import Nc.b;
import Qc.a;
import Rc.a;
import Sc.b;
import Tc.a;
import Uc.e;
import Zg.AbstractC3689v;
import Zg.d0;
import a8.C3772b;
import com.ui.wifiman.model.discovery.engine.bonjour.a;
import com.ui.wifiman.model.discovery.engine.snmp.a;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import xa.InterfaceC8439a;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class j implements Cc.k {

    /* renamed from: k, reason: collision with root package name */
    public static final a f3194k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final inet.ipaddr.g f3195a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f3196b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumMap f3197c;

    /* renamed from: d, reason: collision with root package name */
    private final C3772b f3198d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3199e;

    /* renamed from: f, reason: collision with root package name */
    private final BigInteger f3200f;

    /* renamed from: g, reason: collision with root package name */
    private final Yg.m f3201g;

    /* renamed from: h, reason: collision with root package name */
    private final C3772b f3202h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f3203i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f3204j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(inet.ipaddr.g ipAddress, C5969a c5969a, EnumMap internalResults) {
        AbstractC6492s.i(ipAddress, "ipAddress");
        AbstractC6492s.i(internalResults, "internalResults");
        this.f3195a = ipAddress;
        this.f3196b = c5969a;
        this.f3197c = internalResults;
        C5969a c5969aL = l();
        this.f3198d = c5969aL != null ? C3772b.f25747c.b(c5969aL) : null;
        String string = ipAddress.toString();
        AbstractC6492s.h(string, "toString(...)");
        this.f3199e = string;
        BigInteger value = ipAddress.getValue();
        AbstractC6492s.h(value, "getValue(...)");
        this.f3200f = value;
        this.f3201g = Yg.n.b(new InterfaceC6824a() { // from class: Dc.f
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.O(this.f3191a);
            }
        });
        C5969a c5969aL2 = l();
        this.f3202h = c5969aL2 != null ? C3772b.f25747c.b(c5969aL2) : null;
        this.f3203i = Yg.n.b(new InterfaceC6824a() { // from class: Dc.g
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.Q(this.f3192a);
            }
        });
        this.f3204j = Yg.n.b(new InterfaceC6824a() { // from class: Dc.h
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.R(this.f3193a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set O(j jVar) {
        Set setB = d0.b();
        if (jVar.l() != null) {
            setB.add(jVar.l());
        }
        Collection collectionValues = jVar.f3197c.values();
        AbstractC6492s.h(collectionValues, "<get-values>(...)");
        Iterator it = AbstractC8783m.O(AbstractC3689v.d0(collectionValues), new InterfaceC6835l() { // from class: Dc.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return j.P((t.b) obj);
            }
        }).iterator();
        while (it.hasNext()) {
            setB.add((C5969a) it.next());
        }
        return d0.a(setB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5969a P(t.b bVar) {
        t.a aVar = bVar instanceof t.a ? (t.a) bVar : null;
        if (aVar != null) {
            return aVar.g();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Q(j jVar) {
        Uc.a aVarH;
        Set setJ;
        String strL;
        a.C0794a c0794aL = jVar.L();
        if (c0794aL != null && (strL = c0794aL.l()) != null) {
            return strL;
        }
        b.a aVarI = jVar.I();
        String str = (aVarI == null || (setJ = aVarI.j()) == null) ? null : (String) AbstractC3689v.r0(setJ);
        if (str != null) {
            return str;
        }
        a.C0455a c0455aE = jVar.E();
        String strK = c0455aE != null ? c0455aE.k() : null;
        if (strK != null) {
            return strK;
        }
        a.C0514a c0514aF = jVar.F();
        String strI = c0514aF != null ? c0514aF.i() : null;
        if (strI != null) {
            return strI;
        }
        e.a aVarM = jVar.M();
        String name = (aVarM == null || (aVarH = aVarM.h()) == null) ? null : aVarH.getName();
        if (name != null) {
            return name;
        }
        a.C0703a c0703aK = jVar.K();
        String strI2 = c0703aK != null ? c0703aK.i() : null;
        if (strI2 != null) {
            return strI2;
        }
        String strO = jVar.o();
        if (strO != null) {
            return kotlin.text.t.H0(strO, ".localdomain");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TreeSet R(j jVar) {
        List listJ;
        Set setQ;
        TreeSet treeSet = new TreeSet();
        b.a aVarI = jVar.I();
        if (aVarI != null && (setQ = aVarI.q()) != null) {
            Iterator it = setQ.iterator();
            while (it.hasNext()) {
                treeSet.add((String) it.next());
            }
        }
        a.b bVarZ = jVar.z();
        if (bVarZ != null && (listJ = bVarZ.j()) != null) {
            Iterator it2 = listJ.iterator();
            while (it2.hasNext()) {
                treeSet.add((String) it2.next());
            }
        }
        return treeSet;
    }

    public final a.C0295a A() {
        Object obj = this.f3197c.get(t.c.ARP);
        if (obj instanceof a.C0295a) {
            return (a.C0295a) obj;
        }
        return null;
    }

    public final a.C1395a B() {
        Object obj = this.f3197c.get(t.c.BONJOUR);
        if (obj instanceof a.C1395a) {
            return (a.C1395a) obj;
        }
        return null;
    }

    public final a.C0369a C() {
        Object obj = this.f3197c.get(t.c.GATEWAY);
        if (obj instanceof a.C0369a) {
            return (a.C0369a) obj;
        }
        return null;
    }

    public final a.b D() {
        Object obj = this.f3197c.get(t.c.HOSTNAME);
        if (obj instanceof a.b) {
            return (a.b) obj;
        }
        return null;
    }

    public final a.C0455a E() {
        Object obj = this.f3197c.get(t.c.MIKROTIK);
        if (obj instanceof a.C0455a) {
            return (a.C0455a) obj;
        }
        return null;
    }

    public final a.C0514a F() {
        Object obj = this.f3197c.get(t.c.MYSELF);
        if (obj instanceof a.C0514a) {
            return (a.C0514a) obj;
        }
        return null;
    }

    public final b.C0593b G() {
        Object obj = this.f3197c.get(t.c.NETBIOS);
        if (obj instanceof b.C0593b) {
            return (b.C0593b) obj;
        }
        return null;
    }

    public final a.C1402a H() {
        Object obj = this.f3197c.get(t.c.SNMP);
        if (obj instanceof a.C1402a) {
            return (a.C1402a) obj;
        }
        return null;
    }

    public final b.a I() {
        Object obj = this.f3197c.get(t.c.UBNT);
        if (obj instanceof b.a) {
            return (b.a) obj;
        }
        return null;
    }

    public final a.b J() {
        Object obj = this.f3197c.get(t.c.UBNT_HTTP_SPEEDTEST);
        if (obj instanceof a.b) {
            return (a.b) obj;
        }
        return null;
    }

    public final a.C0703a K() {
        Object obj = this.f3197c.get(t.c.UBNT_TCP_SPEEDTEST);
        if (obj instanceof a.C0703a) {
            return (a.C0703a) obj;
        }
        return null;
    }

    public final a.C0794a L() {
        Object obj = this.f3197c.get(t.c.UNIFI);
        if (obj instanceof a.C0794a) {
            return (a.C0794a) obj;
        }
        return null;
    }

    public final e.a M() {
        Object obj = this.f3197c.get(t.c.UPNP);
        if (obj instanceof e.a) {
            return (e.a) obj;
        }
        return null;
    }

    public final S8.g N() {
        S8.g gVarP;
        a.C0794a c0794aL = L();
        if (c0794aL != null && (gVarP = c0794aL.p()) != null) {
            return gVarP;
        }
        a.C0703a c0703aK = K();
        if (c0703aK != null) {
            return c0703aK.l();
        }
        return null;
    }

    public String b() {
        Uc.a aVarH;
        InterfaceC8439a.d dVarN;
        String strH;
        a.C0514a c0514aF = F();
        if (c0514aF != null && (strH = c0514aF.h()) != null) {
            return strH;
        }
        a.C0794a c0794aL = L();
        if (c0794aL != null && (dVarN = c0794aL.n()) != null) {
            return dVarN.getName();
        }
        b.a aVarI = I();
        String strP = aVarI != null ? aVarI.p() : null;
        if (strP != null) {
            return strP;
        }
        a.C0794a c0794aL2 = L();
        String strK = c0794aL2 != null ? c0794aL2.k() : null;
        if (strK != null) {
            return strK;
        }
        a.C0455a c0455aE = E();
        String strL = c0455aE != null ? c0455aE.l() : null;
        if (strL != null) {
            return strL;
        }
        e.a aVarM = M();
        String strB = (aVarM == null || (aVarH = aVarM.h()) == null) ? null : aVarH.b();
        if (strB != null) {
            return strB;
        }
        a.C0703a c0703aK = K();
        if (c0703aK != null) {
            return c0703aK.h();
        }
        return null;
    }

    public com.ui.wifiman.model.vendor.d c() {
        Uc.a aVarH;
        com.ui.wifiman.model.vendor.d dVarK;
        a.C0514a c0514aF = F();
        if (c0514aF != null && (dVarK = c0514aF.k()) != null) {
            return dVarK;
        }
        b.a aVarI = I();
        if (aVarI != null) {
            return aVarI.t();
        }
        a.C0794a c0794aL = L();
        com.ui.wifiman.model.vendor.d dVarO = c0794aL != null ? c0794aL.o() : null;
        if (dVarO != null) {
            return dVarO;
        }
        a.C0455a c0455aE = E();
        com.ui.wifiman.model.vendor.d dVarO2 = c0455aE != null ? c0455aE.o() : null;
        if (dVarO2 != null) {
            return dVarO2;
        }
        a.C1395a c1395aB = B();
        com.ui.wifiman.model.vendor.d dVarJ = c1395aB != null ? c1395aB.j() : null;
        if (dVarJ != null) {
            return dVarJ;
        }
        e.a aVarM = M();
        com.ui.wifiman.model.vendor.d dVarC = (aVarM == null || (aVarH = aVarM.h()) == null) ? null : aVarH.c();
        if (dVarC != null) {
            return dVarC;
        }
        a.C0295a c0295aA = A();
        com.ui.wifiman.model.vendor.d dVarH = c0295aA != null ? c0295aA.h() : null;
        if (dVarH != null) {
            return dVarH;
        }
        a.b bVarZ = z();
        if (bVarZ != null) {
            return bVarZ.k();
        }
        return null;
    }

    @Override // Cc.k
    public AbstractC2558b d() {
        AbstractC2558b abstractC2558bG;
        a.C0514a c0514aF = F();
        if (c0514aF != null && (abstractC2558bG = c0514aF.g()) != null) {
            return abstractC2558bG;
        }
        a.C0794a c0794aL = L();
        AbstractC2558b abstractC2558bH = c0794aL != null ? c0794aL.h() : null;
        if (abstractC2558bH != null) {
            return abstractC2558bH;
        }
        b.a aVarI = I();
        AbstractC2558b abstractC2558bK = aVarI != null ? aVarI.k() : null;
        if (abstractC2558bK != null) {
            return abstractC2558bK;
        }
        a.C0455a c0455aE = E();
        AbstractC2558b abstractC2558bH2 = c0455aE != null ? c0455aE.h() : null;
        if (abstractC2558bH2 != null) {
            return abstractC2558bH2;
        }
        a.C0703a c0703aK = K();
        AbstractC2558b abstractC2558bG2 = c0703aK != null ? c0703aK.g() : null;
        if (abstractC2558bG2 != null) {
            return abstractC2558bG2;
        }
        a.C1395a c1395aB = B();
        AbstractC2558b abstractC2558bH3 = c1395aB != null ? c1395aB.h() : null;
        if (abstractC2558bH3 != null) {
            return abstractC2558bH3;
        }
        e.a aVarM = M();
        AbstractC2558b abstractC2558bG3 = aVarM != null ? aVarM.g() : null;
        if (abstractC2558bG3 != null) {
            return abstractC2558bG3;
        }
        a.C0369a c0369aC = C();
        AbstractC2558b.g.C0123b c0123bG = c0369aC != null ? c0369aC.g() : null;
        if (c0123bG != null) {
            return c0123bG;
        }
        a.b bVarZ = z();
        if (bVarZ != null) {
            return bVarZ.i();
        }
        return null;
    }

    public Long e() {
        a.C0514a c0514aF = F();
        if (c0514aF != null) {
            return Long.valueOf(c0514aF.j());
        }
        b.a aVarI = I();
        Long lS = aVarI != null ? aVarI.s() : null;
        if (lS != null) {
            return lS;
        }
        a.C0455a c0455aE = E();
        if (c0455aE != null) {
            return c0455aE.n();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (AbstractC6492s.d(this.f3195a, jVar.f3195a) && AbstractC6492s.d(l(), jVar.l()) && AbstractC6492s.d(d(), jVar.d()) && AbstractC6492s.d(this.f3197c, jVar.f3197c)) {
                return true;
            }
        }
        return false;
    }

    public InterfaceC8439a.d f() {
        InterfaceC8439a.d dVarN;
        a.C0794a c0794aL = L();
        if (c0794aL != null && (dVarN = c0794aL.n()) != null) {
            return dVarN;
        }
        b.a aVarI = I();
        if (aVarI != null) {
            return aVarI.r();
        }
        return null;
    }

    @Override // Cc.k
    public C3772b getId() {
        return this.f3198d;
    }

    public String getName() {
        return (String) this.f3203i.getValue();
    }

    public String h() {
        String strM;
        b.a aVarI = I();
        if (aVarI != null && (strM = aVarI.m()) != null) {
            return strM;
        }
        a.C0455a c0455aE = E();
        String strI = c0455aE != null ? c0455aE.i() : null;
        if (strI != null) {
            return strI;
        }
        a.C0514a c0514aF = F();
        if (c0514aF != null) {
            return c0514aF.l();
        }
        return null;
    }

    public int hashCode() {
        return ("m" + l() + ":ip" + this.f3195a).hashCode();
    }

    public C6205b i() {
        Object next;
        inet.ipaddr.g gVar = this.f3195a;
        C6205b c6205b = gVar instanceof C6205b ? (C6205b) gVar : null;
        if (c6205b != null) {
            return c6205b;
        }
        Collection collectionValues = this.f3197c.values();
        AbstractC6492s.h(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((t.b) next).e() != null) {
                break;
            }
        }
        t.b bVar = (t.b) next;
        if (bVar != null) {
            return bVar.e();
        }
        return null;
    }

    public Set k() {
        return (Set) this.f3201g.getValue();
    }

    public C5969a l() {
        return this.f3196b;
    }

    public C6180b n() {
        Object next;
        inet.ipaddr.g gVar = this.f3195a;
        C6180b c6180b = gVar instanceof C6180b ? (C6180b) gVar : null;
        if (c6180b != null) {
            return c6180b;
        }
        Collection collectionValues = this.f3197c.values();
        AbstractC6492s.h(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((t.b) next).d() != null) {
                break;
            }
        }
        t.b bVar = (t.b) next;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public String o() {
        String strG;
        a.b bVarD = D();
        if (bVarD != null && (strG = bVarD.g()) != null) {
            return strG;
        }
        a.C0794a c0794aL = L();
        if (c0794aL != null) {
            return c0794aL.i();
        }
        return null;
    }

    public Set q() {
        Map mapO;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(this.f3195a);
        b.a aVarI = I();
        if (aVarI != null && (mapO = aVarI.o()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = mapO.entrySet().iterator();
            while (it.hasNext()) {
                inet.ipaddr.g gVar = (inet.ipaddr.g) ((Map.Entry) it.next()).getValue();
                if (gVar.g1()) {
                    gVar = null;
                }
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
            linkedHashSet.addAll(arrayList);
        }
        return linkedHashSet;
    }

    public String toString() {
        return "DiscoveredDevice[" + this.f3195a + "][" + l() + "]";
    }

    public final C3772b u() {
        return this.f3202h;
    }

    public final Boolean v() {
        b.a aVarI = I();
        if (aVarI != null) {
            return Boolean.valueOf(aVarI.n());
        }
        a.C0455a c0455aE = E();
        if (c0455aE != null) {
            return c0455aE.j();
        }
        return null;
    }

    public final inet.ipaddr.g w() {
        return this.f3195a;
    }

    public final BigInteger x() {
        return this.f3200f;
    }

    public final String y() {
        return this.f3199e;
    }

    public final a.b z() {
        Object obj = this.f3197c.get(t.c.AP);
        if (obj instanceof a.b) {
            return (a.b) obj;
        }
        return null;
    }
}
