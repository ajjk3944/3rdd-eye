package y8;

import Cc.InterfaceC2557a;
import Te.B0;
import Te.H;
import Te.K;
import Te.N;
import Zg.AbstractC3689v;
import b8.AbstractC4075b;
import com.ubnt.usurvey.R;
import java.util.List;
import jd.C6292a;
import jd.InterfaceC6293b;
import kg.InterfaceC6465b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import n8.AbstractC6912m;
import s9.InterfaceC7929a;
import s9.d;
import y8.AbstractC8627a;

/* loaded from: classes3.dex */
public abstract class i extends y8.f {

    /* renamed from: i, reason: collision with root package name */
    public static final a f66457i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f66458j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final N f66459k = N.PRIMARY;

    /* renamed from: l, reason: collision with root package name */
    private static final N f66460l = N.COMPARE_1;

    /* renamed from: m, reason: collision with root package name */
    private static final N f66461m = N.COMPARE_2;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f66462d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f66463e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f66464f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f66465g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f66466h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final dd.i f66467a;

        /* renamed from: b, reason: collision with root package name */
        private final dd.i f66468b;

        /* renamed from: c, reason: collision with root package name */
        private final dd.i f66469c;

        /* renamed from: d, reason: collision with root package name */
        private final dd.i f66470d;

        /* renamed from: e, reason: collision with root package name */
        private final List f66471e;

        public b(dd.i latencyInternet, dd.i iVar, dd.i iVar2, dd.i dnsResolveTime, List packetLossHistory) {
            AbstractC6492s.i(latencyInternet, "latencyInternet");
            AbstractC6492s.i(dnsResolveTime, "dnsResolveTime");
            AbstractC6492s.i(packetLossHistory, "packetLossHistory");
            this.f66467a = latencyInternet;
            this.f66468b = iVar;
            this.f66469c = iVar2;
            this.f66470d = dnsResolveTime;
            this.f66471e = packetLossHistory;
        }

        public final dd.i a() {
            return this.f66467a;
        }

        public final dd.i b() {
            return this.f66468b;
        }

        public final dd.i c() {
            return this.f66469c;
        }

        public final dd.i d() {
            return this.f66470d;
        }

        public final List e() {
            return this.f66471e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f66467a, bVar.f66467a) && AbstractC6492s.d(this.f66468b, bVar.f66468b) && AbstractC6492s.d(this.f66469c, bVar.f66469c) && AbstractC6492s.d(this.f66470d, bVar.f66470d) && AbstractC6492s.d(this.f66471e, bVar.f66471e);
        }

        public int hashCode() {
            int iHashCode = this.f66467a.hashCode() * 31;
            dd.i iVar = this.f66468b;
            int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            dd.i iVar2 = this.f66469c;
            return ((((iHashCode2 + (iVar2 != null ? iVar2.hashCode() : 0)) * 31) + this.f66470d.hashCode()) * 31) + this.f66471e.hashCode();
        }

        public String toString() {
            return "LatencyChartData(latencyInternet=" + this.f66467a + ", latencyGateway=" + this.f66468b + ", latencyAp=" + this.f66469c + ", dnsResolveTime=" + this.f66470d + ", packetLossHistory=" + this.f66471e + ")";
        }
    }

    static final class c implements InterfaceC6465b {
        c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [s9.d] */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a, C6556a c6556a2) {
            InterfaceC7929a interfaceC7929aC;
            Zf.b bVarI;
            s9.d bVar;
            String name;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            C6292a.b bVar2 = (C6292a.b) c6556a.a();
            dd.i iVar = (dd.i) c6556a2.a();
            Object b02 = null;
            if ((bVar2 != null ? bVar2.d() : null) == C6292a.c.GATEWAY) {
                return new C6556a(null);
            }
            if (bVar2 != null && iVar != null) {
                N n10 = N.COMPARE_2;
                InterfaceC2557a interfaceC2557aB = bVar2.b();
                if (interfaceC2557aB == null || (interfaceC7929aC = AbstractC6912m.c(interfaceC2557aB, i.this.d())) == null) {
                    interfaceC7929aC = Pe.a.f18599a.c();
                }
                InterfaceC7929a interfaceC7929a = interfaceC7929aC;
                InterfaceC2557a interfaceC2557aB2 = bVar2.b();
                s9.d bVar3 = (interfaceC2557aB2 == null || (name = interfaceC2557aB2.getName()) == null) ? new d.b(R.string.device_type_ap) : new d.c(name);
                InterfaceC2557a interfaceC2557aB3 = bVar2.b();
                boolean z10 = (interfaceC2557aB3 != null ? interfaceC2557aB3.getName() : null) != null;
                InterfaceC2557a interfaceC2557aB4 = bVar2.b();
                if (interfaceC2557aB4 == null || (bVarI = interfaceC2557aB4.n()) == null) {
                    InterfaceC2557a interfaceC2557aB5 = bVar2.b();
                    bVarI = interfaceC2557aB5 != null ? interfaceC2557aB5.i() : null;
                }
                if (bVarI != null) {
                    String strA0 = bVarI.a0();
                    AbstractC6492s.h(strA0, "toNormalizedString(...)");
                    b02 = new d.c(strA0);
                }
                ?? r10 = b02;
                AbstractC4075b abstractC4075bD = iVar.d();
                if (abstractC4075bD == null || (bVar = Ne.d.c(abstractC4075bD, true)) == null) {
                    bVar = new d.b(R.string.value_not_available);
                }
                b02 = new B0("apStat", n10, interfaceC7929a, bVar3, z10, null, r10, bVar, iVar.d() == null, null, 32, null);
            }
            return new C6556a(b02);
        }
    }

    static final class d implements InterfaceC6465b {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [s9.d] */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a, C6556a c6556a2) {
            InterfaceC7929a interfaceC7929aO;
            Zf.b bVarI;
            s9.d bVar;
            String name;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            C6292a.b bVar2 = (C6292a.b) c6556a.a();
            dd.i iVar = (dd.i) c6556a2.a();
            Object b02 = null;
            if (bVar2 != null && iVar != null) {
                N n10 = N.COMPARE_1;
                InterfaceC2557a interfaceC2557aB = bVar2.b();
                if (interfaceC2557aB == null || (interfaceC7929aO = AbstractC6912m.c(interfaceC2557aB, i.this.d())) == null) {
                    interfaceC7929aO = Pe.a.f18599a.o();
                }
                InterfaceC7929a interfaceC7929a = interfaceC7929aO;
                InterfaceC2557a interfaceC2557aB2 = bVar2.b();
                s9.d bVar3 = (interfaceC2557aB2 == null || (name = interfaceC2557aB2.getName()) == null) ? new d.b(R.string.device_type_network_gateway) : new d.c(name);
                InterfaceC2557a interfaceC2557aB3 = bVar2.b();
                boolean z10 = (interfaceC2557aB3 != null ? interfaceC2557aB3.getName() : null) != null;
                InterfaceC2557a interfaceC2557aB4 = bVar2.b();
                if (interfaceC2557aB4 == null || (bVarI = interfaceC2557aB4.n()) == null) {
                    InterfaceC2557a interfaceC2557aB5 = bVar2.b();
                    bVarI = interfaceC2557aB5 != null ? interfaceC2557aB5.i() : null;
                }
                if (bVarI != null) {
                    String strA0 = bVarI.a0();
                    AbstractC6492s.h(strA0, "toNormalizedString(...)");
                    b02 = new d.c(strA0);
                }
                ?? r10 = b02;
                AbstractC4075b abstractC4075bD = iVar.d();
                if (abstractC4075bD == null || (bVar = Ne.d.c(abstractC4075bD, true)) == null) {
                    bVar = new d.b(R.string.value_not_available);
                }
                b02 = new B0("cmpConnected", n10, interfaceC7929a, bVar3, z10, null, r10, bVar, iVar.d() == null, null, 32, null);
            }
            return new C6556a(b02);
        }
    }

    static final class e implements kg.i {

        /* renamed from: a, reason: collision with root package name */
        public static final e f66474a = new e();

        e() {
        }

        @Override // kg.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b a(dd.i latency, C6556a c6556a, C6556a c6556a2, dd.i dnsResolveTime, List packetLossHistory) {
            AbstractC6492s.i(latency, "latency");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(dnsResolveTime, "dnsResolveTime");
            AbstractC6492s.i(packetLossHistory, "packetLossHistory");
            return new b(latency, (dd.i) c6556a.a(), (dd.i) c6556a2.a(), dnsResolveTime, packetLossHistory);
        }
    }

    static final class f implements InterfaceC6465b {
        f() {
        }

        private static final List b(List list, List list2, N n10) {
            list.add(new H.a(n10, list2));
            return null;
        }

        private static final void c(List list, kotlin.jvm.internal.N n10, i iVar, long j10, long j11) {
            Object obj = n10.f51689a;
            AbstractC6492s.f(obj);
            list.add(new K(((Number) obj).floatValue(), iVar.h(j10, j11)));
            n10.f51689a = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
        
            r27 = (Wc.c) r27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
        
            if (r27 != null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x012b, code lost:
        
            r27 = (Wc.c) r26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x012f, code lost:
        
            r26 = r27;
            r27 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0283  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x03b7  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x03d2  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01eb  */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Te.J apply(y8.i.b r45, java.util.List r46) {
            /*
                Method dump skipped, instructions count: 1297
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y8.i.f.apply(y8.i$b, java.util.List):Te.J");
        }
    }

    static final class g implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f66476a = new g();

        g() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(dd.i internetStats, C6556a c6556a, C6556a c6556a2) {
            s9.d bVar;
            AbstractC6492s.i(internetStats, "internetStats");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            B0 b02 = (B0) c6556a.a();
            B0 b03 = (B0) c6556a2.a();
            List listC = AbstractC3689v.c();
            N n10 = N.PRIMARY;
            if (b02 == null) {
                n10 = null;
            }
            N n11 = n10;
            s9.b bVarB = N9.b.f16117a.B();
            d.b bVar2 = new d.b(R.string.internet);
            d.c cVar = new d.c(internetStats.c());
            AbstractC4075b abstractC4075bD = internetStats.d();
            if (abstractC4075bD == null || (bVar = Ne.d.c(abstractC4075bD, true)) == null) {
                bVar = new d.b(R.string.value_not_available);
            }
            listC.add(new B0("internet", n11, bVarB, bVar2, true, null, cVar, bVar, internetStats.d() == null, null, 32, null));
            if (b02 != null) {
                listC.add(0, b02);
            }
            if (b03 != null) {
                listC.add(0, b03);
            }
            return AbstractC3689v.a(listC);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AbstractC8627a.b bVar, r latencyOperator, InterfaceC6293b networkTopologyService) {
        gg.i iVarA;
        super(null);
        AbstractC6492s.i(latencyOperator, "latencyOperator");
        AbstractC6492s.i(networkTopologyService, "networkTopologyService");
        gg.i iVarS = gg.i.s(latencyOperator.c(), latencyOperator.d(), latencyOperator.b(), latencyOperator.e(), latencyOperator.a(), e.f66474a);
        AbstractC6492s.h(iVarS, "combineLatest(...)");
        gg.i iVarG = g(iVarS);
        this.f66462d = iVarG;
        gg.i iVarE1 = gg.i.v(iVarG, (bVar == null || (iVarA = bVar.a()) == null) ? gg.i.K0(AbstractC3689v.l()) : iVarA, new f()).e1();
        AbstractC6492s.h(iVarE1, "onBackpressureLatest(...)");
        this.f66463e = iVarE1;
        gg.i iVarW = gg.i.v(networkTopologyService.d(), latencyOperator.d(), new d()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f66464f = iVarW;
        gg.i iVarW2 = gg.i.v(networkTopologyService.c(), latencyOperator.b(), new c()).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f66465g = iVarW2;
        gg.i iVarI2 = gg.i.u(latencyOperator.c(), iVarW, iVarW2, g.f66476a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f66466h = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4075b m(AbstractC4075b abstractC4075b, AbstractC4075b abstractC4075b2) {
        return (abstractC4075b == null || abstractC4075b2 == null || abstractC4075b.compareTo(abstractC4075b2) <= 0) ? (abstractC4075b == null || abstractC4075b2 != null) ? abstractC4075b2 : abstractC4075b : abstractC4075b;
    }

    protected final gg.i n() {
        return this.f66463e;
    }

    protected final gg.i o() {
        return this.f66466h;
    }
}
