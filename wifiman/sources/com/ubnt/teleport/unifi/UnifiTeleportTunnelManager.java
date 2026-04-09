package com.ubnt.teleport.unifi;

import I7.P;
import Yg.J;
import Zg.AbstractC3689v;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.TeleportTunnelManager;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.UnifiTeleportTunnelManager;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.stun.TeleportStun;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class UnifiTeleportTunnelManager implements TeleportTunnelManager, TeleportTunnel.c {

    /* renamed from: a, reason: collision with root package name */
    private final TeleportStun f39419a;

    /* renamed from: b, reason: collision with root package name */
    private final com.wireguard.android.backend.a f39420b;

    /* renamed from: c, reason: collision with root package name */
    private final TeleportCloud.c f39421c;

    /* renamed from: d, reason: collision with root package name */
    private final TeleportTunnelManager.Storage f39422d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f39423e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f39424f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f39425g;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$Error;", "Lcom/ubnt/teleport/TeleportTunnelManager$Error;", "()V", "Storage", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$Error$Storage;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Error extends TeleportTunnelManager.Error {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$Error$Storage;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Storage extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Storage(String message, Throwable cause) {
                super(null);
                AbstractC6492s.i(message, "message");
                AbstractC6492s.i(cause, "cause");
                this.message = message;
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Set it) {
            ArrayList arrayList;
            HashMap map = UnifiTeleportTunnelManager.this.f39423e;
            UnifiTeleportTunnelManager unifiTeleportTunnelManager = UnifiTeleportTunnelManager.this;
            synchronized (map) {
                try {
                    AbstractC6492s.h(it, "it");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = it.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(TeleportTunnel.d.a(((UnifiTeleportTunnel.a) it2.next()).b()));
                    }
                    Iterator it3 = unifiTeleportTunnelManager.f39423e.entrySet().iterator();
                    while (it3.hasNext()) {
                        if (!linkedHashSet.contains(TeleportTunnel.d.a(((TeleportTunnel.d) ((Map.Entry) it3.next()).getKey()).g()))) {
                            it3.remove();
                        }
                    }
                    Set<UnifiTeleportTunnel.a> set = it;
                    arrayList = new ArrayList(AbstractC3689v.w(set, 10));
                    for (UnifiTeleportTunnel.a aVar : set) {
                        HashMap map2 = unifiTeleportTunnelManager.f39423e;
                        TeleportTunnel.d dVarA = TeleportTunnel.d.a(aVar.b());
                        Object p10 = map2.get(dVarA);
                        if (p10 == null) {
                            p10 = new P(aVar, unifiTeleportTunnelManager.f39421c, unifiTeleportTunnelManager.f39419a, unifiTeleportTunnelManager.f39420b);
                            map2.put(dVarA, p10);
                        }
                        arrayList.add((UnifiTeleportTunnel) p10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return arrayList;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39429a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a invoke(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TeleportTunnelManager.Storage.Error ? gg.i.k0(new Error.Storage("Failed to obtain tunnels", error)) : gg.i.k0(error);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f39430a = new c();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f39431a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Tunnel failed to close while tunnel deletion in process";
            }
        }

        c() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(Throwable th2) {
            N7.a.c(a.f39431a, th2);
            return AbstractC5912b.m();
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel f39432a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(UnifiTeleportTunnel unifiTeleportTunnel) {
            super(1);
            this.f39432a = unifiTeleportTunnel;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof TeleportTunnelManager.Storage.Error)) {
                return AbstractC5912b.D(error);
            }
            return AbstractC5912b.D(new Error.Storage("Failed to delete tunnel " + this.f39432a, error));
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f39433a = new e();

        e() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a invoke(List tunnels, C6556a c6556a) {
            TeleportTunnel.d dVar = (TeleportTunnel.d) c6556a.a();
            Object obj = null;
            String strG = dVar != null ? dVar.g() : null;
            if (strG != null) {
                AbstractC6492s.h(tunnels, "tunnels");
                Iterator it = tunnels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (TeleportTunnel.d.d(((UnifiTeleportTunnel) next).getConfig().b(), strG)) {
                        obj = next;
                        break;
                    }
                }
                obj = (UnifiTeleportTunnel) obj;
            }
            return new C6556a(obj);
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f39434a = new f();

        f() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a invoke(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TeleportTunnelManager.Storage.Error ? gg.i.k0(new Error.Storage("Failed to obtain main tunnel", error)) : gg.i.k0(error);
        }
    }

    public static final class g implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel.a f39435a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnelManager f39436b;

        public g(UnifiTeleportTunnel.a aVar, UnifiTeleportTunnelManager unifiTeleportTunnelManager) {
            this.f39435a = aVar;
            this.f39436b = unifiTeleportTunnelManager;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new P(this.f39435a, this.f39436b.f39421c, this.f39436b.f39419a, this.f39436b.f39420b));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel f39437a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnelManager f39438b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel f39439a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel f39440b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UnifiTeleportTunnel unifiTeleportTunnel, UnifiTeleportTunnel unifiTeleportTunnel2) {
                super(0);
                this.f39439a = unifiTeleportTunnel;
                this.f39440b = unifiTeleportTunnel2;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Tunnel closing current tunnel, setting new main tunnel. currentTunnel : " + this.f39439a + " , tunnel : " + this.f39440b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(UnifiTeleportTunnel unifiTeleportTunnel, UnifiTeleportTunnelManager unifiTeleportTunnelManager) {
            super(1);
            this.f39437a = unifiTeleportTunnel;
            this.f39438b = unifiTeleportTunnelManager;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(C6556a c6556a) {
            AbstractC5912b abstractC5912bM;
            UnifiTeleportTunnel.a config;
            UnifiTeleportTunnel unifiTeleportTunnel = (UnifiTeleportTunnel) c6556a.a();
            if (AbstractC6492s.d(unifiTeleportTunnel, this.f39437a)) {
                return AbstractC5912b.m();
            }
            N7.a.b(new a(unifiTeleportTunnel, this.f39437a));
            if (unifiTeleportTunnel == null || (abstractC5912bM = unifiTeleportTunnel.close()) == null) {
                abstractC5912bM = AbstractC5912b.m();
            }
            TeleportTunnelManager.Storage storage = this.f39438b.f39422d;
            UnifiTeleportTunnel unifiTeleportTunnel2 = this.f39437a;
            return AbstractC5912b.p(abstractC5912bM, storage.a((unifiTeleportTunnel2 == null || (config = unifiTeleportTunnel2.getConfig()) == null) ? null : config.b()));
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel f39441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(UnifiTeleportTunnel unifiTeleportTunnel) {
            super(1);
            this.f39441a = unifiTeleportTunnel;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof TeleportTunnelManager.Storage.Error)) {
                return AbstractC5912b.D(error);
            }
            return AbstractC5912b.D(new Error.Storage("Failed to set main tunnel " + this.f39441a, error));
        }
    }

    public static final class j implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel f39443b;

        public j(UnifiTeleportTunnel unifiTeleportTunnel) {
            this.f39443b = unifiTeleportTunnel;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                synchronized (UnifiTeleportTunnelManager.this.f39423e) {
                    UnifiTeleportTunnelManager.this.f39423e.put(TeleportTunnel.d.a(this.f39443b.getConfig().b()), this.f39443b);
                    J j10 = J.f24997a;
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel f39444a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(UnifiTeleportTunnel unifiTeleportTunnel) {
            super(1);
            this.f39444a = unifiTeleportTunnel;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof TeleportTunnelManager.Storage.Error)) {
                return AbstractC5912b.D(error);
            }
            return AbstractC5912b.D(new Error.Storage("Failed to store tunnel " + this.f39444a, error));
        }
    }

    public UnifiTeleportTunnelManager(TeleportStun stun, com.wireguard.android.backend.a wgBackend, TeleportCloud.c cloudFactory, TeleportTunnelManager.Storage tunnelStorage) {
        AbstractC6492s.i(stun, "stun");
        AbstractC6492s.i(wgBackend, "wgBackend");
        AbstractC6492s.i(cloudFactory, "cloudFactory");
        AbstractC6492s.i(tunnelStorage, "tunnelStorage");
        this.f39419a = stun;
        this.f39420b = wgBackend;
        this.f39421c = cloudFactory;
        this.f39422d = tunnelStorage;
        this.f39423e = new HashMap();
        gg.i iVarW = tunnelStorage.d().W();
        final a aVar = new a();
        gg.i iVarN0 = iVarW.N0(new n() { // from class: I7.G0
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelManager.t(aVar, obj);
            }
        });
        final b bVar = b.f39429a;
        gg.i iVarI2 = iVarN0.f1(new n() { // from class: I7.H0
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelManager.u(bVar, obj);
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI2, "tunnelStorage.tunnels\n  …)\n            .refCount()");
        this.f39424f = iVarI2;
        gg.i all = getAll();
        gg.i iVarB = tunnelStorage.b();
        final e eVar = e.f39433a;
        gg.i iVarV = gg.i.v(all, iVarB, new InterfaceC6465b() { // from class: I7.I0
            @Override // kg.InterfaceC6465b
            public final Object apply(Object obj, Object obj2) {
                return UnifiTeleportTunnelManager.y(eVar, obj, obj2);
            }
        });
        final f fVar = f.f39434a;
        gg.i iVarI22 = iVarV.f1(new n() { // from class: I7.J0
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelManager.z(fVar, obj);
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI22, "combineLatest(\n         …)\n            .refCount()");
        this.f39425g = iVarI22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f C(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f D(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f F(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List t(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dj.a u(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (Dj.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f w(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f x(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6556a y(InterfaceC6839p tmp0, Object obj, Object obj2) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (C6556a) tmp0.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dj.a z(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (Dj.a) tmp0.invoke(obj);
    }

    @Override // com.ubnt.teleport.TeleportTunnel.c
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public z d(UnifiTeleportTunnel.a configuration) {
        AbstractC6492s.i(configuration, "configuration");
        z zVarI = z.i(new g(configuration, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public AbstractC5912b b(UnifiTeleportTunnel unifiTeleportTunnel) {
        z zVarO0 = a().o0();
        final h hVar = new h(unifiTeleportTunnel, this);
        AbstractC5912b abstractC5912bT = zVarO0.t(new n() { // from class: I7.D0
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelManager.C(hVar, obj);
            }
        });
        final i iVar = new i(unifiTeleportTunnel);
        AbstractC5912b abstractC5912bO = abstractC5912bT.O(new n() { // from class: I7.E0
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelManager.D(iVar, obj);
            }
        });
        AbstractC6492s.h(abstractC5912bO, "override fun setMain(tun…    }\n            }\n    }");
        return abstractC5912bO;
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public AbstractC5912b c(UnifiTeleportTunnel tunnel) {
        AbstractC5912b abstractC5912bE;
        AbstractC6492s.i(tunnel, "tunnel");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new j(tunnel));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        synchronized (this.f39423e) {
            abstractC5912bE = this.f39422d.e(tunnel.getConfig());
        }
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912bR, abstractC5912bE);
        final k kVar = new k(tunnel);
        AbstractC5912b abstractC5912bO = abstractC5912bP.O(new n() { // from class: I7.F0
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelManager.F(kVar, obj);
            }
        });
        AbstractC6492s.h(abstractC5912bO, "tunnel: UnifiTeleportTun…          }\n            }");
        return abstractC5912bO;
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager
    public gg.i a() {
        return this.f39425g;
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager
    public gg.i getAll() {
        return this.f39424f;
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC5912b e(UnifiTeleportTunnel tunnel) {
        AbstractC6492s.i(tunnel, "tunnel");
        AbstractC5912b abstractC5912bClose = tunnel.close();
        final c cVar = c.f39430a;
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912bClose.O(new n() { // from class: I7.B0
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelManager.x(cVar, obj);
            }
        }), this.f39422d.c(tunnel.getConfig().b()));
        final d dVar = new d(tunnel);
        AbstractC5912b abstractC5912bO = abstractC5912bP.O(new n() { // from class: I7.C0
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelManager.w(dVar, obj);
            }
        });
        AbstractC6492s.h(abstractC5912bO, "tunnel: UnifiTeleportTun…          }\n            }");
        return abstractC5912bO;
    }
}
