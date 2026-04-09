package M8;

import Af.C2428c;
import Af.p;
import Af.v;
import Cc.InterfaceC2557a;
import Gf.i;
import Zg.AbstractC3689v;
import a8.C3771a;
import ch.AbstractC4260a;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import h9.C5969a;
import ic.EnumC6140a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ke.AbstractC6456a;
import ke.AbstractC6458c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import le.C6585f;
import le.C6588i;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import n8.AbstractC6912m;
import ne.C6937a;
import s9.InterfaceC7929a;
import s9.d;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f13021a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13022a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13023b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13024c;

        static {
            int[] iArr = new int[S8.a.values().length];
            try {
                iArr[S8.a.BE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f13022a = iArr;
            int[] iArr2 = new int[S8.c.values().length];
            try {
                iArr2[S8.c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[S8.c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[S8.c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f13023b = iArr2;
            int[] iArr3 = new int[EnumC6140a.values().length];
            try {
                iArr3[EnumC6140a.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[EnumC6140a.SIGNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f13024c = iArr3;
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            InterfaceC2557a.b bVarA = ((C3284a) obj).a();
            String name = bVarA != null ? bVarA.getName() : null;
            InterfaceC2557a.b bVarA2 = ((C3284a) obj2).a();
            return AbstractC4260a.e(name, bVarA2 != null ? bVarA2.getName() : null);
        }
    }

    public static final class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13025a;

        public c(boolean z10) {
            this.f13025a = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        
            if (r2.f13025a != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        
            if (r2.f13025a != false) goto L10;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                le.i r3 = (le.C6588i) r3
                ke.c r3 = r3.r()
                le.i r4 = (le.C6588i) r4
                ke.c r4 = r4.r()
                if (r3 != 0) goto L12
                if (r4 != 0) goto L12
                r3 = 0
                goto L29
            L12:
                r0 = 1
                r1 = -1
                if (r3 != 0) goto L1e
                boolean r3 = r2.f13025a
                if (r3 == 0) goto L1c
            L1a:
                r3 = r1
                goto L29
            L1c:
                r3 = r0
                goto L29
            L1e:
                if (r4 != 0) goto L25
                boolean r3 = r2.f13025a
                if (r3 == 0) goto L1a
                goto L1c
            L25:
                int r3 = r3.compareTo(r4)
            L29:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: M8.r.c.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public static final class d implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13026a;

        public d(boolean z10) {
            this.f13026a = z10;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC6492s.k(((C6588i) obj).hashCode(), ((C6588i) obj2).hashCode());
        }
    }

    static {
        Comparator comparatorThenComparing = new c(false).thenComparing(new d(false));
        AbstractC6492s.h(comparatorThenComparing, "thenComparing(...)");
        f13021a = comparatorThenComparing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(InterfaceC6835l interfaceC6835l, C3284a c3284a, C3284a c3284a2) {
        AbstractC6492s.f(c3284a2);
        Comparable comparable = (Comparable) interfaceC6835l.invoke(c3284a2);
        AbstractC6492s.f(c3284a);
        return AbstractC4260a.e(comparable, (Comparable) interfaceC6835l.invoke(c3284a));
    }

    public static final C2428c.a h(C6588i c6588i, C6937a c6937a) {
        S8.l lVarA;
        AbstractC6492s.i(c6588i, "<this>");
        S8.c cVarA = c6588i.f().a();
        List listC = AbstractC3689v.c();
        AbstractC6456a abstractC6456aM = c6588i.m();
        if (abstractC6456aM instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a.C1907a) {
            listC.add(p.a.f721a);
        } else if (abstractC6456aM instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a.b) {
            listC.add(p.c.f723a);
        } else if (!(abstractC6456aM instanceof AbstractC6456a.AbstractC1905a.b) && !(abstractC6456aM instanceof AbstractC6456a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return new C2428c.a(cVarA, c6588i.e(), AbstractC3689v.a(listC), c6588i.f().d(), c6588i.f().b(), c6588i.q(), (c6937a == null || (lVarA = c6937a.a()) == null) ? c6588i.q() : lVarA);
    }

    public static final i.c i(C6585f c6585f, S8.c cVar) {
        d.c cVar2;
        boolean z10;
        AbstractC6492s.i(c6585f, "<this>");
        String strB = c6585f.b();
        long jN = n(c6585f);
        boolean z11 = c6585f.e() != null;
        AbstractC6458c abstractC6458cR = c6585f.c().r();
        if (abstractC6458cR instanceof AbstractC6458c.a) {
            cVar2 = new d.c(((AbstractC6458c.a) abstractC6458cR).b());
        } else {
            if (!(abstractC6458cR instanceof AbstractC6458c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar2 = new d.c(c6585f.c().e().toString());
        }
        AbstractC6458c abstractC6458cR2 = c6585f.c().r();
        if (abstractC6458cR2 instanceof AbstractC6458c.a) {
            z10 = false;
        } else {
            if (!(abstractC6458cR2 instanceof AbstractC6458c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            z10 = true;
        }
        List listL = l(c6585f, false, false, false, 5, null);
        List listA = c6585f.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C6588i c6588i = (C6588i) it.next();
            Integer numValueOf = (cVar == null || cVar == c6588i.f().a()) ? Integer.valueOf(c6588i.f().d()) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        List listV0 = AbstractC3689v.V0(AbstractC3689v.g0(arrayList));
        C6588i c6588iC = cVar == null ? c6585f.c() : c6585f.d(cVar);
        return new i.c(strB, new Gf.j(jN, cVar2, z11, z10, listV0, listL, Ne.f.h(c6588iC != null ? c6588iC.q() : null, true, null, 2, null), null));
    }

    public static final List j(C6585f c6585f, boolean z10, boolean z11, boolean z12) {
        Object next;
        v.a aVar;
        AbstractC6492s.i(c6585f, "<this>");
        ArrayList arrayList = new ArrayList();
        if (z12) {
            Iterator it = c6585f.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C6588i) next).l() == S8.a.BE) {
                    break;
                }
            }
            if (((C6588i) next) != null && (aVar = v.a.f740a) != null) {
                arrayList.add(aVar);
            }
        }
        if (z10 && c6585f.e() != null) {
            arrayList.add(p.a.f721a);
        }
        S8.j jVarP = c6585f.c().p();
        if (jVarP != null) {
            S8.j jVar = z11 ? jVarP : null;
            if (jVar != null) {
                arrayList.add(new Af.x(jVar));
            }
        }
        return arrayList;
    }

    public static final List k(C6588i c6588i, boolean z10, boolean z11) {
        AbstractC6492s.i(c6588i, "<this>");
        ArrayList arrayList = new ArrayList();
        S8.j jVarP = c6588i.p();
        if (jVarP != null) {
            if (!z10) {
                jVarP = null;
            }
            if (jVarP != null) {
                arrayList.add(new Af.x(jVarP));
            }
        }
        if (z11) {
            S8.a aVarL = c6588i.l();
            if ((aVarL == null ? -1 : a.f13022a[aVarL.ordinal()]) == 1) {
                arrayList.add(v.a.f740a);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List l(C6585f c6585f, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        return j(c6585f, z10, z11, z12);
    }

    public static /* synthetic */ List m(C6588i c6588i, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return k(c6588i, z10, z11);
    }

    public static final long n(C6585f c6585f) {
        AbstractC6492s.i(c6585f, "<this>");
        return o(c6585f.c());
    }

    public static final long o(C6588i c6588i) {
        AbstractC6492s.i(c6588i, "<this>");
        String strB = c6588i.r().b();
        if (strB == null) {
            strB = c6588i.k();
        }
        return p(strB);
    }

    public static final long p(String ssid) {
        AbstractC6492s.i(ssid, "ssid");
        return C6733v0.a.h(C6733v0.f52951b, Math.abs(ssid.hashCode()) % 360, 1.0f, 0.8f, 1.0f, null, 16, null);
    }

    public static final C2428c q(Map signals, InterfaceC2557a.b bVar, Map statistics, boolean z10) {
        C5969a c5969aE;
        String string;
        String name;
        AbstractC6492s.i(signals, "signals");
        AbstractC6492s.i(statistics, "statistics");
        C6588i c6588i = (C6588i) AbstractC3689v.r0(signals.values());
        if (c6588i == null || (c5969aE = c6588i.e()) == null || (string = c5969aE.toString()) == null) {
            throw new IllegalArgumentException("no signals");
        }
        InterfaceC7929a interfaceC7929aE = (!z10 || bVar == null) ? null : AbstractC6912m.e(bVar, m.c.SMALL, Pe.a.f18599a.c());
        s9.d bVar2 = (bVar == null || (name = bVar.getName()) == null) ? new d.b(R.string.wifi_network_detail_access_points_name_fallback) : new d.c(name);
        boolean z11 = false;
        boolean z12 = (bVar != null ? bVar.getName() : null) != null;
        List listC = AbstractC3689v.c();
        Iterator it = signals.entrySet().iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            C6588i c6588i2 = (C6588i) ((Map.Entry) it.next()).getValue();
            if (!c6588i2.c().isEmpty()) {
                z11 = true;
            }
            if (c6588i2.l() == S8.a.BE) {
                z13 = true;
            }
        }
        if (z11) {
            listC.add(Af.w.f742a);
        }
        if (z13) {
            listC.add(v.a.f740a);
        }
        Yg.J j10 = Yg.J.f24997a;
        List listA = AbstractC3689v.a(listC);
        C6588i c6588i3 = (C6588i) signals.get(S8.c.GHZ_2_4);
        C2428c.a aVarH = c6588i3 != null ? h(c6588i3, (C6937a) statistics.get(S8.k.a(c6588i3.k()))) : null;
        C6588i c6588i4 = (C6588i) signals.get(S8.c.GHZ_5);
        C2428c.a aVarH2 = c6588i4 != null ? h(c6588i4, (C6937a) statistics.get(S8.k.a(c6588i4.k()))) : null;
        C6588i c6588i5 = (C6588i) signals.get(S8.c.GHZ_6);
        return new C2428c(string, interfaceC7929aE, bVar2, z12, listA, aVarH, aVarH2, c6588i5 != null ? h(c6588i5, (C6937a) statistics.get(S8.k.a(c6588i5.k()))) : null);
    }

    public static /* synthetic */ C2428c r(Map map, InterfaceC2557a.b bVar, Map map2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return q(map, bVar, map2, z10);
    }

    public static final List s(List signals, final C3771a devices, final Map statistics, EnumC6140a sortType, S8.c cVar) {
        Comparator comparatorZ;
        AbstractC6492s.i(signals, "signals");
        AbstractC6492s.i(devices, "devices");
        AbstractC6492s.i(statistics, "statistics");
        AbstractC6492s.i(sortType, "sortType");
        C3771a c3771a = new C3771a();
        Iterator it = signals.iterator();
        while (it.hasNext()) {
            C6588i c6588i = (C6588i) it.next();
            ((List) c3771a.b(c6588i.i(), new InterfaceC6824a() { // from class: M8.k
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return r.y();
                }
            })).add(c6588i);
        }
        final List listC = AbstractC3689v.c();
        c3771a.c(new InterfaceC6835l() { // from class: M8.l
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return r.t(listC, devices, statistics, (List) obj);
            }
        });
        List listL1 = AbstractC3689v.l1(AbstractC3689v.a(listC));
        int i10 = a.f13024c[sortType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i11 = cVar == null ? -1 : a.f13023b[cVar.ordinal()];
            if (i11 == -1) {
                comparatorZ = z(new InterfaceC6835l() { // from class: M8.m
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return r.u((C3284a) obj);
                    }
                });
            } else if (i11 == 1) {
                comparatorZ = z(new InterfaceC6835l() { // from class: M8.n
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return r.v((C3284a) obj);
                    }
                });
            } else if (i11 == 2) {
                comparatorZ = z(new InterfaceC6835l() { // from class: M8.o
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return r.w((C3284a) obj);
                    }
                });
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                comparatorZ = z(new InterfaceC6835l() { // from class: M8.p
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return r.x((C3284a) obj);
                    }
                });
            }
            AbstractC3689v.B(listL1, comparatorZ);
        } else if (listL1.size() > 1) {
            AbstractC3689v.B(listL1, new b());
        }
        List<C3284a> list = listL1;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (C3284a c3284a : list) {
            arrayList.add(r(c3284a.b(), c3284a.a(), c3284a.c(), false, 8, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J t(List list, C3771a c3771a, Map map, List apSignals) {
        C6588i c6588i;
        AbstractC6492s.i(apSignals, "apSignals");
        while (!apSignals.isEmpty()) {
            HashMap map2 = new HashMap();
            for (S8.c cVar : S8.c.getEntries()) {
                Iterator it = apSignals.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    if (((C6588i) it.next()).f().a() == cVar) {
                        break;
                    }
                    i10++;
                }
                Integer numValueOf = Integer.valueOf(i10);
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null && (c6588i = (C6588i) apSignals.remove(numValueOf.intValue())) != null) {
                    map2.put(cVar, c6588i);
                }
            }
            if (map2.isEmpty()) {
                throw new IllegalStateException("signal by band map should not be empty here");
            }
            Collection collectionValues = map2.values();
            AbstractC6492s.h(collectionValues, "<get-values>(...)");
            list.add(new C3284a(map2, (InterfaceC2557a.b) c3771a.a(((C6588i) AbstractC3689v.p0(collectionValues)).i()), map));
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W7.f u(C3284a device) {
        Object next;
        AbstractC6492s.i(device, "device");
        Collection collectionValues = device.b().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((C6588i) obj).q() != null) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                S8.l lVarQ = ((C6588i) next).q();
                AbstractC6492s.f(lVarQ);
                do {
                    Object next2 = it.next();
                    S8.l lVarQ2 = ((C6588i) next2).q();
                    AbstractC6492s.f(lVarQ2);
                    if (lVarQ.compareTo(lVarQ2) < 0) {
                        next = next2;
                        lVarQ = lVarQ2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C6588i c6588i = (C6588i) next;
        if (c6588i != null) {
            return c6588i.q();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W7.f v(C3284a it) {
        AbstractC6492s.i(it, "it");
        C6588i c6588i = (C6588i) it.b().get(S8.c.GHZ_2_4);
        if (c6588i != null) {
            return c6588i.q();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W7.f w(C3284a it) {
        AbstractC6492s.i(it, "it");
        C6588i c6588i = (C6588i) it.b().get(S8.c.GHZ_5);
        if (c6588i != null) {
            return c6588i.q();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W7.f x(C3284a it) {
        AbstractC6492s.i(it, "it");
        C6588i c6588i = (C6588i) it.b().get(S8.c.GHZ_6);
        if (c6588i != null) {
            return c6588i.q();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List y() {
        return new LinkedList();
    }

    private static final Comparator z(final InterfaceC6835l interfaceC6835l) {
        return new Comparator() { // from class: M8.q
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return r.A(interfaceC6835l, (C3284a) obj, (C3284a) obj2);
            }
        };
    }
}
