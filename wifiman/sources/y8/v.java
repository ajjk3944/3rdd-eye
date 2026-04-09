package y8;

import Cc.InterfaceC2557a;
import inet.ipaddr.ipv4.C6180b;
import jd.C6292a;
import jd.InterfaceC6293b;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;

/* loaded from: classes3.dex */
public final class v extends t {

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f66508g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f66509h;

    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f66510a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            InterfaceC2557a interfaceC2557aB;
            AbstractC6492s.i(c6556a, "<destruct>");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            C6180b c6180bN = null;
            if ((bVar != null ? bVar.d() : null) == C6292a.c.GATEWAY) {
                return new C6556a(null);
            }
            if (bVar != null && (interfaceC2557aB = bVar.b()) != null && (c6180bN = interfaceC2557aB.n()) == null) {
                c6180bN = interfaceC2557aB.i();
            }
            return new C6556a(c6180bN);
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ dd.g f66511a;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f66512a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(dd.i it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        b(dd.g gVar) {
            this.f66511a = gVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Object objA = c6556a.a();
            if (objA == null) {
                gg.i iVarK0 = gg.i.K0(new C6556a(null));
                AbstractC6492s.f(iVarK0);
                return iVarK0;
            }
            dd.g gVar = this.f66511a;
            String strA0 = ((inet.ipaddr.g) objA).a0();
            AbstractC6492s.h(strA0, "toNormalizedString(...)");
            gg.i iVarN0 = gVar.a(strA0, DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT, 300).N0(a.f66512a);
            AbstractC6492s.f(iVarN0);
            return iVarN0;
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f66513a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            Object objN;
            InterfaceC2557a interfaceC2557aB;
            AbstractC6492s.i(c6556a, "<destruct>");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            if (bVar == null || (interfaceC2557aB = bVar.b()) == null) {
                objN = null;
            } else {
                objN = interfaceC2557aB.n();
                if (objN == null) {
                    objN = interfaceC2557aB.i();
                }
            }
            return new C6556a(objN);
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ dd.g f66514a;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f66515a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(dd.i it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        d(dd.g gVar) {
            this.f66514a = gVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Object objA = c6556a.a();
            if (objA == null) {
                gg.i iVarK0 = gg.i.K0(new C6556a(null));
                AbstractC6492s.f(iVarK0);
                return iVarK0;
            }
            dd.g gVar = this.f66514a;
            String strA0 = ((inet.ipaddr.g) objA).a0();
            AbstractC6492s.h(strA0, "toNormalizedString(...)");
            gg.i iVarN0 = gVar.a(strA0, DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT, 300).N0(a.f66515a);
            AbstractC6492s.f(iVarN0);
            return iVarN0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dd.g latencyService, Zc.c internetLatencyService, ad.i dnsLatencyService, InterfaceC6293b networkTopologyService) {
        super(internetLatencyService, dnsLatencyService);
        AbstractC6492s.i(latencyService, "latencyService");
        AbstractC6492s.i(internetLatencyService, "internetLatencyService");
        AbstractC6492s.i(dnsLatencyService, "dnsLatencyService");
        AbstractC6492s.i(networkTopologyService, "networkTopologyService");
        gg.i iVarI2 = networkTopologyService.d().N0(c.f66513a).W().I1(new d(latencyService)).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f66508g = iVarI2;
        gg.i iVarI22 = networkTopologyService.c().N0(a.f66510a).W().I1(new b(latencyService)).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f66509h = iVarI22;
    }

    @Override // y8.r
    public gg.i b() {
        return this.f66509h;
    }

    @Override // y8.r
    public gg.i d() {
        return this.f66508g;
    }
}
