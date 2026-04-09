package Uc;

import Cc.AbstractC2558b;
import Mj.x;
import Rj.y;
import Uc.e;
import android.net.wifi.WifiManager;
import b7.C4073a;
import c7.C4227a;
import com.ui.wifiman.model.vendor.d;
import ee.AbstractC5456b;
import gg.AbstractC5912b;
import gg.C;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.j;
import gg.z;
import hg.InterfaceC6043c;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import kotlin.text.C6510d;
import kotlin.text.C6516j;
import kotlin.text.InterfaceC6518l;
import kotlin.text.r;
import kotlin.text.t;
import m9.C6783c;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public final class i implements Uc.e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f22340e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f22341a;

    /* renamed from: b, reason: collision with root package name */
    private final d.b f22342b;

    /* renamed from: c, reason: collision with root package name */
    private final z f22343c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f22344d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LUc/i$b;", "", "", "url", "Lgg/z;", "LVc/g;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;)Lgg/z;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        @Rj.f
        z<Vc.g> a(@y String url);
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final inet.ipaddr.g f22345a;

        /* renamed from: b, reason: collision with root package name */
        private final String f22346b;

        /* renamed from: c, reason: collision with root package name */
        private final String f22347c;

        /* renamed from: d, reason: collision with root package name */
        private final String f22348d;

        /* renamed from: e, reason: collision with root package name */
        private final String f22349e;

        public c(inet.ipaddr.g address, String response) {
            AbstractC6492s.i(address, "address");
            AbstractC6492s.i(response, "response");
            this.f22345a = address;
            this.f22346b = a(response, "LOCATION");
            this.f22347c = a(response, "SERVER");
            this.f22348d = a(response, "USN");
            this.f22349e = a(response, "ST");
        }

        private final String a(String str, String str2) {
            C6516j c6516j;
            InterfaceC6518l interfaceC6518lD = kotlin.text.p.d(new kotlin.text.p(str2 + ":\\s(.*)$", r.MULTILINE), str, 0, 2, null);
            if (interfaceC6518lD == null || (c6516j = interfaceC6518lD.c().get(1)) == null) {
                return null;
            }
            return c6516j.a();
        }

        public final inet.ipaddr.g b() {
            return this.f22345a;
        }

        public final String c() {
            return this.f22346b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && AbstractC6492s.d(((c) obj).f22345a, this.f22345a);
        }

        public int hashCode() {
            return this.f22345a.hashCode();
        }

        public String toString() {
            return "UPNP DISCOVERY RESPONSE " + this.f22345a + " [Server: " + this.f22347c + ", Location: " + this.f22346b + "]";
        }
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f22350a = new d();

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap apply(HashMap map, e.a result) {
            AbstractC6492s.i(map, "map");
            AbstractC6492s.i(result, "result");
            map.put(result.c(), result);
            return map;
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f22351a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(HashMap it) {
            AbstractC6492s.i(it, "it");
            ArrayList arrayList = new ArrayList(it.size());
            Iterator it2 = it.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add((e.a) ((Map.Entry) it2.next()).getValue());
            }
            return arrayList;
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f22352a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.b("UPNP packet sending error", it, null, 4, null);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f22353a = new g();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f22354a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable it) {
                AbstractC6492s.i(it, "it");
                return gg.i.d2(5000L, TimeUnit.MILLISECONDS);
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(a.f22354a);
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f22355a = new h();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f22356a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Object it) {
                AbstractC6492s.i(it, "it");
                return gg.i.d2(5000L, TimeUnit.MILLISECONDS);
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(a.f22356a);
        }
    }

    /* renamed from: Uc.i$i, reason: collision with other inner class name */
    static final class C0828i implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C0828i f22357a = new C0828i();

        C0828i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            Z7.b.e("UPNP packet sender failed", error, null, 4, null);
        }
    }

    static final class j implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final j f22358a = new j();

        j() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("UPNP Device Discovery subscribed", null, 2, null);
        }
    }

    static final class k implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final k f22359a = new k();

        k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("UPNP Device found on " + it + ".address - " + it, null, 2, null);
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f22360a = new l();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f22361a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable it) {
                AbstractC6492s.i(it, "it");
                return gg.i.d2(5000L, TimeUnit.MILLISECONDS);
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(a.f22361a);
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f22362a = new m();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f22363a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Object it) {
                AbstractC6492s.i(it, "it");
                return gg.i.d2(5000L, TimeUnit.MILLISECONDS);
            }
        }

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(a.f22363a);
        }
    }

    public static final class n implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f22364a;

        public n(N n10) {
            this.f22364a = n10;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                byte[] bytes = "M-SEARCH * HTTP/1.1\r\nHOST: 239.255.255.250:1900\r\nMAN: \"ssdp:discover\"\r\nMX: 1\r\nST: ssdp:all\r\n\r\n".getBytes(C6510d.f52215b);
                AbstractC6492s.h(bytes, "getBytes(...)");
                ((DatagramSocket) this.f22364a.f51689a).send(new DatagramPacket(bytes, 94, InetAddress.getByName("239.255.255.250"), 1900));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class o implements kg.n {
        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(c it) {
            AbstractC6492s.i(it, "it");
            return i.this.n(it, 10000L);
        }
    }

    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f22366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f22367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f22368c;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f22369a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f22370b;

            a(i iVar, c cVar) {
                this.f22369a = iVar;
                this.f22370b = cVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e.a apply(Vc.g xmlDevice) {
                AbstractC2558b abstractC2558bO;
                AbstractC6492s.i(xmlDevice, "xmlDevice");
                Vc.a aVarD = Vc.b.d(xmlDevice, this.f22369a.f22342b, this.f22370b.b(), System.currentTimeMillis());
                List listG = aVarD.g();
                i iVar = this.f22369a;
                Iterator it = listG.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        abstractC2558bO = null;
                        break;
                    }
                    abstractC2558bO = iVar.o((Uc.a) it.next());
                    if (abstractC2558bO != null) {
                        break;
                    }
                }
                return new e.a(aVarD, abstractC2558bO);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f22371a;

            b(c cVar) {
                this.f22371a = cVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("UPNP Device details periodic fetch subscribed for " + this.f22371a.c(), null, 2, null);
            }
        }

        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f22372a;

            c(c cVar) {
                this.f22372a = cVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(e.a it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("UPNP Device details sucess for " + this.f22372a.b(), null, 2, null);
            }
        }

        static final class d implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f22373a;

            d(c cVar) {
                this.f22373a = cVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                Z7.b.j("UPNP Device description fetch failed for " + this.f22373a.c(), it, null, 4, null);
            }
        }

        static final class e implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f22374a;

            static final class a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f22375a;

                a(long j10) {
                    this.f22375a = j10;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Throwable it) {
                    AbstractC6492s.i(it, "it");
                    return gg.i.d2(this.f22375a, TimeUnit.MILLISECONDS);
                }
            }

            e(long j10) {
                this.f22374a = j10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.p0(new a(this.f22374a));
            }
        }

        static final class f implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f22376a;

            static final class a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f22377a;

                a(long j10) {
                    this.f22377a = j10;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Object it) {
                    AbstractC6492s.i(it, "it");
                    return gg.i.d2(this.f22377a, TimeUnit.MILLISECONDS);
                }
            }

            f(long j10) {
                this.f22376a = j10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.p0(new a(this.f22376a));
            }
        }

        p(c cVar, i iVar, long j10) {
            this.f22366a = cVar;
            this.f22367b = iVar;
            this.f22368c = j10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(b bVar) {
            return bVar.a(this.f22366a.c()).O(Gg.a.d()).A(new a(this.f22367b, this.f22366a)).n(new b(this.f22366a)).o(new c(this.f22366a)).m(new d(this.f22366a)).L(new e(this.f22368c)).K(new f(this.f22368c));
        }
    }

    public static final class q implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess((b) new x.b().b(C4227a.f(new C4073a.b().a(Vc.g.class, new Vc.f()).b())).c("http://localhost/").a(Nj.g.e()).e().b(b.class));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public i(WifiManager wifiManager, d.b vendorManager) {
        AbstractC6492s.i(wifiManager, "wifiManager");
        AbstractC6492s.i(vendorManager, "vendorManager");
        this.f22341a = wifiManager;
        this.f22342b = vendorManager;
        z zVarI = z.i(new q());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f22343c = zVarE;
        gg.i iVarP0 = j().U().p0(new o());
        AbstractC6492s.h(iVarP0, "flatMap(...)");
        gg.i iVarI2 = i(iVarP0).e1().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f22344d = iVarI2;
    }

    private final gg.i i(gg.i iVar) {
        gg.i iVarN0 = iVar.q1(new HashMap(), d.f22350a).N0(e.f22351a);
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    private final gg.i j() {
        gg.i iVarN1 = gg.i.N(new gg.k() { // from class: Uc.h
            @Override // gg.k
            public final void a(j jVar) {
                i.k(this.f22339a, jVar);
            }
        }, EnumC5911a.LATEST).F1(C6783c.f53633a.h("UPNPDiscoveryReceive")).g0(j.f22358a).f0(k.f22359a).p1(l.f22360a).n1(m.f22362a);
        AbstractC6492s.h(iVarN1, "repeatWhen(...)");
        return iVarN1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(i iVar, gg.j it) {
        AbstractC6492s.i(it, "it");
        final N n10 = new N();
        final N n11 = new N();
        final N n12 = new N();
        it.d(new InterfaceC6468e() { // from class: Uc.f
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                i.l(n12, n11, n10);
            }
        });
        try {
            WifiManager.MulticastLock multicastLockCreateMulticastLock = iVar.f22341a.createMulticastLock("UPNP");
            n10.f51689a = multicastLockCreateMulticastLock;
            multicastLockCreateMulticastLock.acquire();
        } catch (Throwable unused) {
            Z7.b.e("UPNP Multicast lock acquire error", null, null, 6, null);
        }
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            n11.f51689a = datagramSocket;
            datagramSocket.setReuseAddress(true);
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new n(n11));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            n12.f51689a = abstractC5912bR.z(f.f22352a).W(C6783c.f53633a.h("UPNPDiscoverySend")).Q(g.f22353a).P(h.f22355a).U(new InterfaceC6464a() { // from class: Uc.g
                @Override // kg.InterfaceC6464a
                public final void run() {
                    i.m();
                }
            }, C0828i.f22357a);
            byte[] bArr = new byte[1024];
            while (true) {
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 1024);
                ((DatagramSocket) n11.f51689a).receive(datagramPacket);
                byte[] data = datagramPacket.getData();
                AbstractC6492s.h(data, "getData(...)");
                String str = new String(data, 0, datagramPacket.getLength(), C6510d.f52215b);
                if (t.N(str, "HTTP/1.1 200", true)) {
                    InetAddress address = datagramPacket.getAddress();
                    AbstractC6492s.h(address, "getAddress(...)");
                    it.h(new c(AbstractC5456b.a(address), str));
                }
            }
        } catch (Throwable th2) {
            DatagramSocket datagramSocket2 = (DatagramSocket) n11.f51689a;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            InterfaceC6043c interfaceC6043c = (InterfaceC6043c) n12.f51689a;
            if (interfaceC6043c != null) {
                interfaceC6043c.dispose();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(N n10, N n11, N n12) {
        InterfaceC6043c interfaceC6043c = (InterfaceC6043c) n10.f51689a;
        if (interfaceC6043c != null) {
            interfaceC6043c.dispose();
        }
        try {
            DatagramSocket datagramSocket = (DatagramSocket) n11.f51689a;
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        } catch (Throwable unused) {
        }
        WifiManager.MulticastLock multicastLock = (WifiManager.MulticastLock) n12.f51689a;
        if (multicastLock == null || !multicastLock.isHeld()) {
            return;
        }
        try {
            WifiManager.MulticastLock multicastLock2 = (WifiManager.MulticastLock) n12.f51689a;
            if (multicastLock2 != null) {
                multicastLock2.release();
            }
        } catch (Throwable th2) {
            Z7.b.e("UPNP error", th2, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i n(c cVar, long j10) {
        gg.i iVarW;
        if (cVar.c() != null && (iVarW = this.f22343c.w(new p(cVar, this, j10))) != null) {
            return iVarW;
        }
        gg.i iVarJ0 = gg.i.j0();
        AbstractC6492s.h(iVarJ0, "empty(...)");
        return iVarJ0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC2558b o(Uc.a aVar) {
        Uc.b type = aVar.getType();
        if (type == null) {
            return null;
        }
        if (!AbstractC6492s.d(type.b(), "schemas-upnp-org")) {
            type = null;
        }
        if (type == null) {
            return null;
        }
        String strA = type.a();
        switch (strA.hashCode()) {
            case -1383044512:
                if (strA.equals("WLANAccessPointDevice")) {
                    return AbstractC2558b.g.a.f2493b;
                }
                return null;
            case -719352354:
                if (strA.equals("Scanner")) {
                    return AbstractC2558b.k.f2500b;
                }
                return null;
            case -548680585:
                if (!strA.equals("DimmableLight")) {
                    return null;
                }
                break;
            case 137378165:
                if (!strA.equals("BinaryLight")) {
                    return null;
                }
                break;
            case 142072291:
                if (strA.equals("TelephonyClient")) {
                    return AbstractC2558b.i.f2498b;
                }
                return null;
            case 629487261:
                if (strA.equals("DigitalSecurityCamera")) {
                    return AbstractC2558b.c.f2487b;
                }
                return null;
            case 777115609:
                if (strA.equals("InternetGatewayDevice")) {
                    return AbstractC2558b.g.C0123b.f2494b;
                }
                return null;
            case 1349935098:
                if (strA.equals("Printer")) {
                    return AbstractC2558b.j.f2499b;
                }
                return null;
            case 2003504061:
                if (strA.equals("SensorManagement")) {
                    return AbstractC2558b.e.C0122b.f2491b;
                }
                return null;
            default:
                return null;
        }
        return AbstractC2558b.e.a.f2490b;
    }

    @Override // Ec.t
    public gg.i b() {
        return this.f22344d;
    }
}
