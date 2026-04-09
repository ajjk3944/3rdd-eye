package com.ui.wifiman.model.ubiquiti.console;

import Td.a;
import eb.InterfaceC5443g;
import gg.D;
import gg.i;
import gg.z;
import h9.C5969a;
import java.security.cert.Certificate;
import java.util.Set;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mb.j;
import xa.o;

/* loaded from: classes4.dex */
public final class g implements com.ui.wifiman.model.ubiquiti.console.f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f43729c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final cb.c f43730a;

    /* renamed from: b, reason: collision with root package name */
    private final o f43731b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43732a;

        b(String str) {
            this.f43732a = str;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("Direct Console[" + this.f43732a + "] connection subscribed", "UnifiConsoleConnectionService");
        }
    }

    static final class c implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43734b;

        c(String str) {
            this.f43734b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(InterfaceC5443g connection) {
            AbstractC6492s.i(connection, "connection");
            return g.this.i(this.f43734b, connection, a.EnumC0795a.DIRECT);
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43735a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            UnifiConsoleConnectionError unifiConsoleConnectionErrorC = UnifiConsoleConnectionError.INSTANCE.c(error);
            if (unifiConsoleConnectionErrorC != null) {
                error = unifiConsoleConnectionErrorC;
            }
            return i.k0(error);
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43736a;

        e(String str) {
            this.f43736a = str;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("WebRTC Console[" + this.f43736a + "] connection subscribed", "UnifiConsoleConnectionService");
        }
    }

    static final class f implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43738b;

        f(String str) {
            this.f43738b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(InterfaceC5443g connection) {
            AbstractC6492s.i(connection, "connection");
            return g.this.i(this.f43738b, connection, a.EnumC0795a.WEBRTC);
        }
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.console.g$g, reason: collision with other inner class name */
    static final class C1498g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1498g f43739a = new C1498g();

        C1498g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            UnifiConsoleConnectionError unifiConsoleConnectionErrorC = UnifiConsoleConnectionError.INSTANCE.c(error);
            if (unifiConsoleConnectionErrorC != null) {
                error = unifiConsoleConnectionErrorC;
            }
            return i.k0(error);
        }
    }

    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43740a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.EnumC0795a f43741b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f43742c;

        h(String str, a.EnumC0795a enumC0795a, g gVar) {
            this.f43740a = str;
            this.f43741b = enumC0795a;
            this.f43742c = gVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Td.a apply(InterfaceC5443g.c networkDataClient) {
            AbstractC6492s.i(networkDataClient, "networkDataClient");
            return new Td.d(this.f43740a, this.f43741b, new com.ui.wifiman.model.ubiquiti.console.network.api.b(networkDataClient), this.f43742c.f43731b, null);
        }
    }

    public g(cb.c unifiCore, o productCatalog) {
        AbstractC6492s.i(unifiCore, "unifiCore");
        AbstractC6492s.i(productCatalog, "productCatalog");
        this.f43730a = unifiCore;
        this.f43731b = productCatalog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str) {
        Z7.b.g("WebRTC Console[" + str + "] connection finished", "UnifiConsoleConnectionService");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(String str) {
        Z7.b.g("Direct Console[" + str + "] connection finished", "UnifiConsoleConnectionService");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z i(String str, InterfaceC5443g interfaceC5443g, a.EnumC0795a enumC0795a) {
        z zVarA = interfaceC5443g.a(j.NETWORK).A(new h(str, enumC0795a, this));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    @Override // com.ui.wifiman.model.ubiquiti.console.f
    public i a(final String id2, inet.ipaddr.g ip, C5969a mac, String ncaToken, Set trustedCerts) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(ip, "ip");
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(ncaToken, "ncaToken");
        AbstractC6492s.i(trustedCerts, "trustedCerts");
        cb.c cVar = this.f43730a;
        String strR0 = ip.r0();
        AbstractC6492s.h(strR0, "toFullString(...)");
        InterfaceC5443g interfaceC5443gE = cVar.e(id2, strR0, mac.d(":"), ncaToken);
        interfaceC5443gE.c((Certificate[]) trustedCerts.toArray(new Certificate[0]));
        i iVarF1 = interfaceC5443gE.connect().g0(new b(id2)).Z(new InterfaceC6464a() { // from class: Qd.l
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.ubiquiti.console.g.h(id2);
            }
        }).x0(new c(id2)).f1(d.f43735a);
        AbstractC6492s.h(iVarF1, "onErrorResumeNext(...)");
        return iVarF1;
    }

    @Override // com.ui.wifiman.model.ubiquiti.console.f
    public i b(final String id2) {
        AbstractC6492s.i(id2, "id");
        i iVarF1 = cb.c.h(this.f43730a, id2, false, null, 6, null).connect().g0(new e(id2)).Z(new InterfaceC6464a() { // from class: Qd.k
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.ubiquiti.console.g.g(id2);
            }
        }).x0(new f(id2)).f1(C1498g.f43739a);
        AbstractC6492s.h(iVarF1, "onErrorResumeNext(...)");
        return iVarF1;
    }
}
