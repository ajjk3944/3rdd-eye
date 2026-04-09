package Id;

import Id.d;
import Zg.AbstractC3689v;
import android.content.Context;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.TeleportTunnelManager;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.android.secure.AndroidPassphraseManager;
import com.ui.wifiman.model.teleport.session.TeleportSession;
import com.ui.wifiman.model.teleport.tunnel.config.TeleportTunnelDb;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.j;
import gg.k;
import gg.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class d implements TeleportTunnelManager.Storage {

    /* renamed from: g, reason: collision with root package name */
    public static final a f9062g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f9063a;

    /* renamed from: b, reason: collision with root package name */
    private final TeleportSession f9064b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5912b f9065c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f9066d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f9067e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f9068f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AndroidPassphraseManager f9069a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f9070b;

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f9071a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f9072b;

            /* renamed from: Id.d$b$a$a, reason: collision with other inner class name */
            static final class C0374a implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AtomicInteger f9073a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ d f9074b;

                C0374a(AtomicInteger atomicInteger, d dVar) {
                    this.f9073a = atomicInteger;
                    this.f9074b = dVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Throwable error) {
                    AbstractC6492s.i(error, "error");
                    if (!(error instanceof AndroidPassphraseManager.Error.StorageError)) {
                        return gg.i.k0(error);
                    }
                    int andIncrement = this.f9073a.getAndIncrement();
                    if (andIncrement != 0 && andIncrement < 3) {
                        return this.f9074b.f9065c.h(gg.i.d2(500L, TimeUnit.MILLISECONDS));
                    }
                    return gg.i.d2(500L, TimeUnit.MILLISECONDS);
                }
            }

            a(AtomicInteger atomicInteger, d dVar) {
                this.f9071a = atomicInteger;
                this.f9072b = dVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i errorStream) {
                AbstractC6492s.i(errorStream, "errorStream");
                return errorStream.p0(new C0374a(this.f9071a, this.f9072b));
            }
        }

        b(AndroidPassphraseManager androidPassphraseManager, d dVar) {
            this.f9069a = androidPassphraseManager;
            this.f9070b = dVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(AtomicInteger retryCounter) {
            AbstractC6492s.i(retryCounter, "retryCounter");
            return this.f9069a.a(AndroidPassphraseManager.a.TELEPORT).L(new a(retryCounter, this.f9070b));
        }
    }

    static final class c implements n {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(d dVar, String str, gg.j it) {
            AbstractC6492s.i(it, "it");
            TeleportTunnelDb.Companion companion = TeleportTunnelDb.INSTANCE;
            Context applicationContext = dVar.f9063a.getApplicationContext();
            AbstractC6492s.h(applicationContext, "getApplicationContext(...)");
            AbstractC6492s.f(str);
            it.h(companion.a(applicationContext, "tp", str).C());
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(final String passphrase) {
            AbstractC6492s.i(passphrase, "passphrase");
            final d dVar = d.this;
            return gg.i.N(new k() { // from class: Id.e
                @Override // gg.k
                public final void a(j jVar) {
                    d.c.c(dVar, passphrase, jVar);
                }
            }, EnumC5911a.LATEST);
        }
    }

    /* renamed from: Id.d$d, reason: collision with other inner class name */
    static final class C0375d implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9076a;

        /* renamed from: Id.d$d$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Jd.b f9077a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9078b;

            public a(Jd.b bVar, String str) {
                this.f9077a = bVar;
                this.f9078b = str;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    if (this.f9077a.c(this.f9078b) < 1) {
                        Z7.b.j("No Tunnel deleted since " + TeleportTunnel.d.f(this.f9078b) + " was not found in tunnel DB", null, null, 6, null);
                    }
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        C0375d(String str) {
            this.f9076a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Jd.b dao) {
            AbstractC6492s.i(dao, "dao");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(dao, this.f9076a));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9079a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            TeleportTunnel.d dVar = (TeleportTunnel.d) c6556a.a();
            String strG = dVar != null ? dVar.g() : null;
            String strB = strG != null ? TeleportTunnel.d.b(strG) : null;
            return new C6556a(strB != null ? TeleportTunnel.d.a(strB) : null);
        }
    }

    public static final class f implements InterfaceC5915e {
        public f() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                File databasePath = d.this.f9063a.getDatabasePath("tp");
                if (databasePath.exists() && !databasePath.delete()) {
                    throw new IllegalStateException("failed to delete teleport DB file");
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class g implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new AtomicInteger(0));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel.a f9081a;

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Jd.b f9082a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel.a f9083b;

            public a(Jd.b bVar, UnifiTeleportTunnel.a aVar) {
                this.f9082a = bVar;
                this.f9083b = aVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    if (this.f9082a.b(new Jd.a(0L, this.f9083b.a().b(), this.f9083b.a().a(), this.f9083b.b(), 1, null)) < 1) {
                        Z7.b.j("Failed to store tunnel " + TeleportTunnel.d.f(this.f9083b.b()), null, null, 6, null);
                    }
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        h(UnifiTeleportTunnel.a aVar) {
            this.f9081a = aVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Jd.b dao) {
            AbstractC6492s.i(dao, "dao");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(dao, this.f9081a));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class i implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f9084a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Jd.b it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f9085a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(List configurations) {
            AbstractC6492s.i(configurations, "configurations");
            List<Jd.a> list = configurations;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (Jd.a aVar : list) {
                arrayList.add(new UnifiTeleportTunnel.a(TeleportTunnel.d.b(aVar.d()), new TeleportCloud.e.a(aVar.a(), aVar.b()), null));
            }
            return AbstractC3689v.n1(arrayList);
        }
    }

    public d(Context context, AndroidPassphraseManager passphraseManager, TeleportSession teleportSession) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(passphraseManager, "passphraseManager");
        AbstractC6492s.i(teleportSession, "teleportSession");
        this.f9063a = context;
        this.f9064b = teleportSession;
        AbstractC5912b abstractC5912bClear = passphraseManager.clear();
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new f());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912bClear, abstractC5912bR);
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        this.f9065c = abstractC5912bP;
        z zVarI = z.i(new g());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI2 = zVarI.s(new b(passphraseManager, this)).w(new c()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f9066d = iVarI2;
        gg.i iVarI22 = teleportSession.a().N0(e.f9079a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f9067e = iVarI22;
        gg.i iVarI23 = iVarI2.I1(i.f9084a).N0(j.f9085a).W().X0(Gg.a.a()).F1(Gg.a.d()).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f9068f = iVarI23;
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager.Storage
    public AbstractC5912b a(String str) {
        return this.f9064b.e(str);
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager.Storage
    public gg.i b() {
        return this.f9067e;
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager.Storage
    public AbstractC5912b c(String id2) {
        AbstractC6492s.i(id2, "id");
        AbstractC5912b abstractC5912bW = this.f9066d.o0().t(new C0375d(id2)).L(Gg.a.a()).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager.Storage
    public gg.i d() {
        return this.f9068f;
    }

    @Override // com.ubnt.teleport.TeleportTunnelManager.Storage
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC5912b e(UnifiTeleportTunnel.a config) {
        AbstractC6492s.i(config, "config");
        AbstractC5912b abstractC5912bW = this.f9066d.o0().t(new h(config)).L(Gg.a.a()).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }
}
