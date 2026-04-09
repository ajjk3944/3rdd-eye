package Lg;

import Kg.d;
import Lg.h;
import Lg.l;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class g extends Lg.b {

    /* renamed from: h, reason: collision with root package name */
    private static Ej.b f11690h = Ej.c.i(g.class);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11691a;

        static {
            int[] iArr = new int[javax.jmdns.impl.constants.e.values().length];
            f11691a = iArr;
            try {
                iArr[javax.jmdns.impl.constants.e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11691a[javax.jmdns.impl.constants.e.TYPE_A6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11691a[javax.jmdns.impl.constants.e.TYPE_AAAA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11691a[javax.jmdns.impl.constants.e.TYPE_ANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11691a[javax.jmdns.impl.constants.e.TYPE_HINFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11691a[javax.jmdns.impl.constants.e.TYPE_PTR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11691a[javax.jmdns.impl.constants.e.TYPE_SRV.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11691a[javax.jmdns.impl.constants.e.TYPE_TXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static class b extends g {
        b(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
            super(str, eVar, dVar, z10);
        }

        @Override // Lg.g
        public boolean C(l lVar) {
            String lowerCase = d().toLowerCase();
            return lVar.F0().p().equals(lowerCase) || lVar.K0().containsKey(lowerCase);
        }

        @Override // Lg.b
        public boolean o(Lg.b bVar) {
            return bVar != null;
        }

        @Override // Lg.g
        public void z(l lVar, Set set) {
            String lowerCase = d().toLowerCase();
            if (lVar.F0().p().equalsIgnoreCase(lowerCase)) {
                set.addAll(lVar.F0().a(f(), q(), javax.jmdns.impl.constants.a.f50179d));
            } else {
                if (lVar.J0().containsKey(lowerCase)) {
                    new f(d(), javax.jmdns.impl.constants.e.TYPE_PTR, f(), q()).z(lVar, set);
                    return;
                }
                Iterator it = lVar.K0().values().iterator();
                while (it.hasNext()) {
                    A(lVar, set, (q) ((Kg.d) it.next()));
                }
            }
        }
    }

    private static class c extends g {
        c(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
            super(str, eVar, dVar, z10);
        }

        @Override // Lg.g
        public boolean C(l lVar) {
            String lowerCase = d().toLowerCase();
            return lVar.F0().p().equals(lowerCase) || lVar.K0().containsKey(lowerCase);
        }

        @Override // Lg.g
        public void z(l lVar, Set set) {
            h.a aVarJ = lVar.F0().j(g(), true, javax.jmdns.impl.constants.a.f50179d);
            if (aVarJ != null) {
                set.add(aVarJ);
            }
        }
    }

    private static class d extends g {
        d(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
            super(str, eVar, dVar, z10);
        }

        @Override // Lg.g
        public boolean C(l lVar) {
            String lowerCase = d().toLowerCase();
            return lVar.F0().p().equals(lowerCase) || lVar.K0().containsKey(lowerCase);
        }

        @Override // Lg.g
        public void z(l lVar, Set set) {
            h.a aVarJ = lVar.F0().j(g(), true, javax.jmdns.impl.constants.a.f50179d);
            if (aVarJ != null) {
                set.add(aVarJ);
            }
        }
    }

    private static class e extends g {
        e(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
            super(str, eVar, dVar, z10);
        }
    }

    private static class f extends g {
        f(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
            super(str, eVar, dVar, z10);
        }

        @Override // Lg.g
        public void z(l lVar, Set set) {
            Iterator it = lVar.K0().values().iterator();
            while (it.hasNext()) {
                A(lVar, set, (q) ((Kg.d) it.next()));
            }
            if (p()) {
                Iterator it2 = lVar.J0().values().iterator();
                while (it2.hasNext()) {
                    set.add(new h.e("_services._dns-sd._udp.local.", javax.jmdns.impl.constants.d.CLASS_IN, false, javax.jmdns.impl.constants.a.f50179d, ((l.j) it2.next()).f()));
                }
                return;
            }
            if (!l()) {
                j();
                return;
            }
            String str = (String) e().get(d.a.Instance);
            if (str == null || str.length() <= 0) {
                return;
            }
            InetAddress inetAddressN = lVar.F0().n();
            if (str.equalsIgnoreCase(inetAddressN != null ? inetAddressN.getHostAddress() : "")) {
                if (r()) {
                    set.add(lVar.F0().k(javax.jmdns.impl.constants.e.TYPE_A, false, javax.jmdns.impl.constants.a.f50179d));
                }
                if (s()) {
                    set.add(lVar.F0().k(javax.jmdns.impl.constants.e.TYPE_AAAA, false, javax.jmdns.impl.constants.a.f50179d));
                }
            }
        }
    }

    /* renamed from: Lg.g$g, reason: collision with other inner class name */
    private static class C0464g extends g {
        C0464g(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
            super(str, eVar, dVar, z10);
        }

        @Override // Lg.g
        public boolean C(l lVar) {
            String lowerCase = d().toLowerCase();
            return lVar.F0().p().equals(lowerCase) || lVar.K0().containsKey(lowerCase);
        }

        @Override // Lg.g
        public void z(l lVar, Set set) {
            String lowerCase = d().toLowerCase();
            if (lVar.F0().p().equalsIgnoreCase(lowerCase)) {
                set.addAll(lVar.F0().a(f(), q(), javax.jmdns.impl.constants.a.f50179d));
            } else if (lVar.J0().containsKey(lowerCase)) {
                new f(d(), javax.jmdns.impl.constants.e.TYPE_PTR, f(), q()).z(lVar, set);
            } else {
                A(lVar, set, (q) lVar.K0().get(lowerCase));
            }
        }
    }

    private static class h extends g {
        h(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
            super(str, eVar, dVar, z10);
        }

        @Override // Lg.g
        public boolean C(l lVar) {
            String lowerCase = d().toLowerCase();
            return lVar.F0().p().equals(lowerCase) || lVar.K0().containsKey(lowerCase);
        }

        @Override // Lg.g
        public void z(l lVar, Set set) {
            A(lVar, set, (q) lVar.K0().get(d().toLowerCase()));
        }
    }

    g(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
        super(str, eVar, dVar, z10);
    }

    public static g D(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
        switch (a.f11691a[eVar.ordinal()]) {
            case 1:
                return new c(str, eVar, dVar, z10);
            case 2:
                return new d(str, eVar, dVar, z10);
            case 3:
                return new d(str, eVar, dVar, z10);
            case 4:
                return new b(str, eVar, dVar, z10);
            case 5:
                return new e(str, eVar, dVar, z10);
            case 6:
                return new f(str, eVar, dVar, z10);
            case 7:
                return new C0464g(str, eVar, dVar, z10);
            case 8:
                return new h(str, eVar, dVar, z10);
            default:
                return new g(str, eVar, dVar, z10);
        }
    }

    protected void A(l lVar, Set set, q qVar) {
        if (qVar == null || !qVar.Z()) {
            return;
        }
        if (d().equalsIgnoreCase(qVar.u()) || d().equalsIgnoreCase(qVar.A()) || d().equalsIgnoreCase(qVar.U())) {
            k kVarF0 = lVar.F0();
            javax.jmdns.impl.constants.d dVarF = f();
            int i10 = javax.jmdns.impl.constants.a.f50179d;
            set.addAll(kVarF0.a(dVarF, true, i10));
            set.addAll(qVar.K(f(), true, i10, lVar.F0()));
        }
        f11690h.o("{} DNSQuestion({}).addAnswersForServiceInfo(): info: {}\n{}", lVar.G0(), d(), qVar, set);
    }

    boolean B(Lg.b bVar) {
        return n(bVar) && o(bVar) && d().equals(bVar.d());
    }

    public boolean C(l lVar) {
        return false;
    }

    @Override // Lg.b
    public boolean k(long j10) {
        return false;
    }

    @Override // Lg.b
    public void y(StringBuilder sb2) {
    }

    public void z(l lVar, Set set) {
    }
}
