package sd;

import Cc.InterfaceC2557a;
import Cc.m;
import Dc.j;
import com.ui.wifiman.model.ubiquiti.console.e;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jd.C6292a;
import jd.InterfaceC6293b;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import sd.InterfaceC7939a;
import xa.InterfaceC8439a;

/* renamed from: sd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7940b implements InterfaceC7939a {

    /* renamed from: a, reason: collision with root package name */
    private final gg.i f61443a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f61444b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f61445c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f61446d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f61447e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f61448f;

    /* renamed from: sd.b$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f61449a;

        /* renamed from: b, reason: collision with root package name */
        private final Vd.a f61450b;

        public /* synthetic */ a(String str, Vd.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, aVar);
        }

        public final String a() {
            return this.f61449a;
        }

        public final Vd.a b() {
            return this.f61450b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return e.b.h(this.f61449a, aVar.f61449a) && AbstractC6492s.d(this.f61450b, aVar.f61450b);
        }

        public int hashCode() {
            return (e.b.j(this.f61449a) * 31) + this.f61450b.hashCode();
        }

        public String toString() {
            return "ConsoleGateway(consoleId=" + e.b.l(this.f61449a) + ", device=" + this.f61450b + ")";
        }

        private a(String consoleId, Vd.a device) {
            AbstractC6492s.i(consoleId, "consoleId");
            AbstractC6492s.i(device, "device");
            this.f61449a = consoleId;
            this.f61450b = device;
        }
    }

    /* renamed from: sd.b$b, reason: collision with other inner class name */
    static final class C2148b implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final C2148b f61451a = new C2148b();

        C2148b() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7939a.AbstractC2146a a(C6556a c6556a, C6556a c6556a2, Boolean internetSpeedTestSupported) {
            InterfaceC8439a.d dVarB;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(internetSpeedTestSupported, "internetSpeedTestSupported");
            inet.ipaddr.g gVar = (inet.ipaddr.g) c6556a.a();
            a aVar = (a) c6556a2.a();
            if (internetSpeedTestSupported.booleanValue() && gVar != null) {
                if ((aVar != null ? aVar.a() : null) != null && (dVarB = aVar.b().b()) != null && m.a(dVarB)) {
                    return new InterfaceC7939a.AbstractC2146a.C2147a(gVar, aVar.a(), null);
                }
            }
            return InterfaceC7939a.AbstractC2146a.b.f61442a;
        }
    }

    /* renamed from: sd.b$c */
    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f61452a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC7939a.AbstractC2146a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Advanced speedtest availability: " + it, null, 2, null);
        }
    }

    /* renamed from: sd.b$d */
    static final class d implements n {

        /* renamed from: sd.b$d$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f61454a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Wc.b bVar) {
                AbstractC6492s.i(bVar, "<destruct>");
                return new C6556a((List) bVar.a());
            }
        }

        /* renamed from: sd.b$d$b, reason: collision with other inner class name */
        static final class C2149b implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Td.a f61455a;

            C2149b(Td.a aVar) {
                this.f61455a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v3, types: [sd.b$a] */
            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a, C6556a c6556a2) {
                Vd.a aVar;
                Object next;
                AbstractC6492s.i(c6556a, "<destruct>");
                AbstractC6492s.i(c6556a2, "<destruct>");
                Set set = (Set) c6556a.a();
                List list = (List) c6556a2.a();
                DefaultConstructorMarker aVar2 = null;
                if (set != null) {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            Vd.a aVar3 = (Vd.a) next;
                            if (aVar3.a() != null && set.contains(aVar3.a())) {
                                break;
                            }
                        }
                        aVar = (Vd.a) next;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        aVar2 = new a(this.f61455a.d(), aVar, aVar2);
                    }
                }
                return new C6556a(aVar2);
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarV;
            AbstractC6492s.i(c6556a, "<destruct>");
            Td.a aVar = (Td.a) c6556a.a();
            return (aVar == null || (iVarV = gg.i.v(C7940b.this.f61444b, aVar.a().N0(a.f61454a), new C2149b(aVar))) == null) ? gg.i.K0(new C6556a(null)) : iVarV;
        }
    }

    /* renamed from: sd.b$e */
    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f61456a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            j jVarJ;
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
            return new C6556a((interfaceC2557a == null || (jVarJ = interfaceC2557a.j()) == null) ? null : jVarJ.w());
        }
    }

    /* renamed from: sd.b$f */
    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f61457a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
            return new C6556a(interfaceC2557a != null ? interfaceC2557a.k() : null);
        }
    }

    /* renamed from: sd.b$g */
    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f61458a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            InterfaceC2557a interfaceC2557aB;
            AbstractC6492s.i(c6556a, "<destruct>");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            InterfaceC2557a interfaceC2557a = null;
            if (bVar != null && (interfaceC2557aB = bVar.b()) != null) {
                j jVarJ = interfaceC2557aB.j();
                if ((jVarJ != null ? jVarJ.J() : null) != null) {
                    interfaceC2557a = interfaceC2557aB;
                }
            }
            return new C6556a(interfaceC2557a);
        }
    }

    /* renamed from: sd.b$h */
    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f61459a = new h();

        /* renamed from: sd.b$h$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f61460a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean apply(Wc.b bVar) {
                AbstractC6492s.i(bVar, "<destruct>");
                Vd.b bVar2 = (Vd.b) bVar.a();
                return Boolean.valueOf(bVar2 != null ? bVar2.a() : false);
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarN0;
            AbstractC6492s.i(c6556a, "<destruct>");
            Td.a aVar = (Td.a) c6556a.a();
            return (aVar == null || (iVarN0 = aVar.e().N0(a.f61460a)) == null) ? gg.i.K0(Boolean.FALSE) : iVarN0;
        }
    }

    public C7940b(InterfaceC6293b topologyService, Sd.d localConsoleService) {
        AbstractC6492s.i(topologyService, "topologyService");
        AbstractC6492s.i(localConsoleService, "localConsoleService");
        gg.i iVarN0 = topologyService.d().N0(g.f61458a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f61443a = iVarN0;
        gg.i iVarW = iVarN0.N0(f.f61457a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f61444b = iVarW;
        gg.i iVarW2 = iVarN0.N0(e.f61456a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f61445c = iVarW2;
        gg.i iVarW3 = localConsoleService.b().I1(new d()).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f61446d = iVarW3;
        gg.i iVarW4 = localConsoleService.b().I1(h.f61459a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f61447e = iVarW4;
        gg.i iVarI2 = gg.i.u(iVarW2, iVarW3, iVarW4, C2148b.f61451a).W().f0(c.f61452a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f61448f = iVarI2;
    }

    @Override // sd.InterfaceC7939a
    public gg.i a() {
        return this.f61448f;
    }
}
