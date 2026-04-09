package com.ubnt.usurvey.ui.teleport.deeplink;

import Fd.D;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.ui.teleport.deeplink.TeleportDeepLinkConsoleConnectProcessorImpl;
import com.ubnt.usurvey.ui.teleport.deeplink.a;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import ec.AbstractC5452a;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.r;
import gg.z;
import hc.C5973a;
import hc.InterfaceC5974b;
import hg.InterfaceC6043c;
import i8.InterfaceC6084a;
import i8.s;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class TeleportDeepLinkConsoleConnectProcessorImpl implements com.ubnt.usurvey.ui.teleport.deeplink.a {

    /* renamed from: k, reason: collision with root package name */
    public static final a f40976k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f40977l = 8;

    /* renamed from: a, reason: collision with root package name */
    private final UiSSOAccountManager f40978a;

    /* renamed from: b, reason: collision with root package name */
    private final D f40979b;

    /* renamed from: c, reason: collision with root package name */
    private final TeleportConnection f40980c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6084a f40981d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5974b f40982e;

    /* renamed from: f, reason: collision with root package name */
    private final Fg.c f40983f;

    /* renamed from: g, reason: collision with root package name */
    private final Fg.a f40984g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f40985h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5912b f40986i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f40987j;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "DeepLinkInvalid", "Account", "ConsoleNotFound", "VPNProfileNotCreated", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$Account;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$ConsoleNotFound;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$DeepLinkInvalid;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$VPNProfileNotCreated;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$Account;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error;", "<init>", "()V", "NotFound", "FailedToSet", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$Account$FailedToSet;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$Account$NotFound;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Account extends Error {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$Account$FailedToSet;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$Account;", "Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;", "id", "<init>", "(Ljava/util/UUID;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/UUID;", "getId-Nupd-q8", "()Ljava/util/UUID;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class FailedToSet extends Account {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final UUID id;

                public /* synthetic */ FailedToSet(UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
                    this(uuid);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private FailedToSet(UUID id2) {
                    super(null);
                    AbstractC6492s.i(id2, "id");
                    this.id = id2;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$Account$NotFound;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$Account;", "Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;", "id", "<init>", "(Ljava/util/UUID;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/UUID;", "getId-Nupd-q8", "()Ljava/util/UUID;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class NotFound extends Account {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final UUID id;

                public /* synthetic */ NotFound(UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
                    this(uuid);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private NotFound(UUID id2) {
                    super(null);
                    AbstractC6492s.i(id2, "id");
                    this.id = id2;
                }
            }

            public /* synthetic */ Account(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Account() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$ConsoleNotFound;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error;", "Lcom/ui/wifiman/model/ubiquiti/console/e$b;", "id", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getId-AfJffNI", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConsoleNotFound extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String id;

            public /* synthetic */ ConsoleNotFound(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private ConsoleNotFound(String id2) {
                super(null);
                AbstractC6492s.i(id2, "id");
                this.id = id2;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$DeepLinkInvalid;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error;", "Li8/s$f;", "deepLink", "<init>", "(Li8/s$f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Li8/s$f;", "getDeepLink", "()Li8/s$f;", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class DeepLinkInvalid extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final s.f deepLink;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeepLinkInvalid(s.f deepLink) {
                super(null);
                AbstractC6492s.i(deepLink, "deepLink");
                this.deepLink = deepLink;
                this.message = "Deep link data invalid: " + deepLink;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$VPNProfileNotCreated;", "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VPNProfileNotCreated extends Error {

            /* renamed from: a, reason: collision with root package name */
            public static final VPNProfileNotCreated f40993a = new VPNProfileNotCreated();

            private VPNProfileNotCreated() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof VPNProfileNotCreated);
            }

            public int hashCode() {
                return 1659992706;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "VPNProfileNotCreated";
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.f f40995b;

        public b(s.f fVar) {
            this.f40995b = fVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                TeleportDeepLinkConsoleConnectProcessorImpl.this.f40983f.h(this.f40995b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class c implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.f f40997b;

        public c(s.f fVar) {
            this.f40997b = fVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(e.b.a(TeleportDeepLinkConsoleConnectProcessorImpl.this.r(this.f40997b)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class d implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f40999a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof TeleportConnection.Error.NoVpnProfile ? AbstractC5912b.D(Error.VPNProfileNotCreated.f40993a) : AbstractC5912b.D(error);
            }
        }

        d() {
        }

        public final gg.f a(String consoleId) {
            AbstractC6492s.i(consoleId, "consoleId");
            return AbstractC5912b.p(TeleportDeepLinkConsoleConnectProcessorImpl.this.f40979b.b(consoleId), TeleportDeepLinkConsoleConnectProcessorImpl.this.f40980c.connect().X(AbstractC5912b.a0(200L, TimeUnit.MILLISECONDS)).O(a.f40999a));
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((e.b) obj).n());
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f41000a = new e();

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Throwable f41001a;

            public a(Throwable th2) {
                this.f41001a = th2;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.j("Failed to connect teleport while processing Teleport connect deeplink", this.f41001a, null, 4, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof TeleportConnection.Error)) {
                return AbstractC5912b.D(error);
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(error));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f41002a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("DeepLink-TeleportConnect - teleport connection subscribed", null, 2, null);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f41003a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Ld.e eVar = (Ld.e) c6556a.a();
            if (eVar != null) {
                return eVar.d().a();
            }
            gg.i iVarK0 = gg.i.K0(AbstractC3689v.l());
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    public static final class h implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.f f41005b;

        public h(s.f fVar) {
            this.f41005b = fVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(b.a.a(TeleportDeepLinkConsoleConnectProcessorImpl.this.q(this.f41005b)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class i implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f41007b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UUID f41008a;

            /* renamed from: com.ubnt.usurvey.ui.teleport.deeplink.TeleportDeepLinkConsoleConnectProcessorImpl$i$a$a, reason: collision with other inner class name */
            public static final class C1273a implements gg.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f41009a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ UUID f41010b;

                public C1273a(List list, UUID uuid) {
                    this.f41009a = list;
                    this.f41010b = uuid;
                }

                @Override // gg.q
                public final void a(gg.o oVar) {
                    Object next;
                    try {
                        AbstractC6492s.f(this.f41009a);
                        Iterator it = this.f41009a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (b.a.d(((com.ui.wifiman.model.ubiquiti.cloud.sso.b) next).e(), this.f41010b)) {
                                    break;
                                }
                            }
                        }
                        com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) next;
                        if (bVar != null) {
                            oVar.onSuccess(bVar);
                        } else {
                            oVar.a();
                        }
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            a(UUID uuid) {
                this.f41008a = uuid;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r apply(List accounts) {
                AbstractC6492s.i(accounts, "accounts");
                gg.n nVarC = gg.n.c(new C1273a(accounts, this.f41008a));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UUID f41011a;

            b(UUID uuid) {
                this.f41011a = uuid;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof TimeoutException ? z.p(new Error.Account.NotFound(this.f41011a, null)) : z.p(error);
            }
        }

        i(long j10) {
            this.f41007b = j10;
        }

        public final gg.D a(UUID id2) {
            AbstractC6492s.i(id2, "id");
            return TeleportDeepLinkConsoleConnectProcessorImpl.this.f40978a.a().v0(new a(id2)).o0().Q(this.f41007b, TimeUnit.MILLISECONDS).F(new b(id2));
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((b.a) obj).g());
        }
    }

    static final class j implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f41013a;

            a(com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar) {
                this.f41013a = bVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof UiSSOAccountManager.Error)) {
                    return AbstractC5912b.D(error);
                }
                Z7.b.e("Failed to set account " + b.a.f(this.f41013a.e()) + " as primary account", error, null, 4, null);
                return AbstractC5912b.D(new Error.Account.FailedToSet(this.f41013a.e(), null));
            }
        }

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wifiman.model.ubiquiti.cloud.sso.b account) {
            AbstractC6492s.i(account, "account");
            return TeleportDeepLinkConsoleConnectProcessorImpl.this.f40978a.b(account).O(new a(account));
        }
    }

    static final class k implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s.f f41014a;

        k(s.f fVar) {
            this.f41014a = fVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("DeepLink-TeleportConnect - set account '" + this.f41014a.c() + "' as primary account subscribed", null, 2, null);
        }
    }

    public static final class l implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.f f41016b;

        public l(s.f fVar) {
            this.f41016b = fVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(e.b.a(TeleportDeepLinkConsoleConnectProcessorImpl.this.r(this.f41016b)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class m implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f41018b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f41019a;

            /* renamed from: com.ubnt.usurvey.ui.teleport.deeplink.TeleportDeepLinkConsoleConnectProcessorImpl$m$a$a, reason: collision with other inner class name */
            public static final class C1274a implements gg.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f41020a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f41021b;

                public C1274a(List list, String str) {
                    this.f41020a = list;
                    this.f41021b = str;
                }

                @Override // gg.q
                public final void a(gg.o oVar) {
                    Object next;
                    try {
                        AbstractC6492s.f(this.f41020a);
                        Iterator it = this.f41020a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (e.b.h(((com.ui.wifiman.model.ubiquiti.console.e) next).f(), this.f41021b)) {
                                    break;
                                }
                            }
                        }
                        com.ui.wifiman.model.ubiquiti.console.e eVar = (com.ui.wifiman.model.ubiquiti.console.e) next;
                        if (eVar != null) {
                            oVar.onSuccess(eVar);
                        } else {
                            oVar.a();
                        }
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            a(String str) {
                this.f41019a = str;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r apply(List consoles) {
                AbstractC6492s.i(consoles, "consoles");
                gg.n nVarC = gg.n.c(new C1274a(consoles, this.f41019a));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f41022a;

            b(String str) {
                this.f41022a = str;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof TimeoutException ? z.p(new Error.ConsoleNotFound(this.f41022a, null)) : z.p(error);
            }
        }

        m(long j10) {
            this.f41018b = j10;
        }

        public final gg.D a(String id2) {
            AbstractC6492s.i(id2, "id");
            return TeleportDeepLinkConsoleConnectProcessorImpl.this.f40985h.v0(new a(id2)).o0().Q(this.f41018b, TimeUnit.MILLISECONDS).F(new b(id2));
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((e.b) obj).n());
        }
    }

    static final class n implements kg.n {
        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wifiman.model.ubiquiti.console.e console) {
            AbstractC6492s.i(console, "console");
            return TeleportDeepLinkConsoleConnectProcessorImpl.this.f40979b.b(console.f());
        }
    }

    static final class o implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s.f f41024a;

        o(s.f fVar) {
            this.f41024a = fVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("DeepLink-TeleportConnect - set console'" + this.f41024a.b() + "' as primary subscribed", null, 2, null);
        }
    }

    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final p f41025a = new p();

        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.AbstractC1276a apply(Boolean it) {
            AbstractC6492s.i(it, "it");
            if (AbstractC6492s.d(it, Boolean.TRUE)) {
                return a.AbstractC1276a.b.f41032a;
            }
            if (AbstractC6492s.d(it, Boolean.FALSE)) {
                return a.AbstractC1276a.C1277a.f41031a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class q implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportDeepLinkConsoleConnectProcessorImpl f41027a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s.f f41028b;

            /* renamed from: com.ubnt.usurvey.ui.teleport.deeplink.TeleportDeepLinkConsoleConnectProcessorImpl$q$a$a, reason: collision with other inner class name */
            public static final class C1275a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TeleportDeepLinkConsoleConnectProcessorImpl f41029a;

                public C1275a(TeleportDeepLinkConsoleConnectProcessorImpl teleportDeepLinkConsoleConnectProcessorImpl) {
                    this.f41029a = teleportDeepLinkConsoleConnectProcessorImpl;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        this.f41029a.f40982e.a(new C5973a(new AbstractC5452a.C1741a(R.string.teleport_deeplink_connection_failed, new Object[0]), false, 2, null));
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a(TeleportDeepLinkConsoleConnectProcessorImpl teleportDeepLinkConsoleConnectProcessorImpl, s.f fVar) {
                this.f41027a = teleportDeepLinkConsoleConnectProcessorImpl;
                this.f41028b = fVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (error instanceof Error.VPNProfileNotCreated) {
                    return this.f41027a.f40981d.a(new InterfaceC6084a.b.E.e(true));
                }
                if (!(error instanceof Error)) {
                    return AbstractC5912b.D(error);
                }
                Z7.b.j("DeepLink-TeleportConnect - Failed to process the deeplink: " + this.f41028b, error, null, 4, null);
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1275a(this.f41027a));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportDeepLinkConsoleConnectProcessorImpl f41030a;

            b(TeleportDeepLinkConsoleConnectProcessorImpl teleportDeepLinkConsoleConnectProcessorImpl) {
                this.f41030a = teleportDeepLinkConsoleConnectProcessorImpl;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                this.f41030a.f40984g.h(Boolean.TRUE);
            }
        }

        q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(TeleportDeepLinkConsoleConnectProcessorImpl teleportDeepLinkConsoleConnectProcessorImpl) {
            teleportDeepLinkConsoleConnectProcessorImpl.f40984g.h(Boolean.FALSE);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(s.f fVar) {
            TeleportDeepLinkConsoleConnectProcessorImpl teleportDeepLinkConsoleConnectProcessorImpl = TeleportDeepLinkConsoleConnectProcessorImpl.this;
            AbstractC6492s.f(fVar);
            AbstractC5912b abstractC5912bB = AbstractC5912b.p(TeleportDeepLinkConsoleConnectProcessorImpl.v(teleportDeepLinkConsoleConnectProcessorImpl, fVar, 0L, 1, null), TeleportDeepLinkConsoleConnectProcessorImpl.y(TeleportDeepLinkConsoleConnectProcessorImpl.this, fVar, 0L, 1, null), TeleportDeepLinkConsoleConnectProcessorImpl.this.s(fVar)).O(new a(TeleportDeepLinkConsoleConnectProcessorImpl.this, fVar)).B(new b(TeleportDeepLinkConsoleConnectProcessorImpl.this));
            final TeleportDeepLinkConsoleConnectProcessorImpl teleportDeepLinkConsoleConnectProcessorImpl2 = TeleportDeepLinkConsoleConnectProcessorImpl.this;
            return abstractC5912bB.w(new InterfaceC6464a() { // from class: com.ubnt.usurvey.ui.teleport.deeplink.b
                @Override // kg.InterfaceC6464a
                public final void run() {
                    TeleportDeepLinkConsoleConnectProcessorImpl.q.c(teleportDeepLinkConsoleConnectProcessorImpl2);
                }
            });
        }
    }

    public TeleportDeepLinkConsoleConnectProcessorImpl(UiSSOAccountManager accountManager, Ld.f cloudSessionService, D teleportConsoleManager, TeleportConnection teleportConnection, InterfaceC6084a viewRouter, InterfaceC5974b toastService) {
        AbstractC6492s.i(accountManager, "accountManager");
        AbstractC6492s.i(cloudSessionService, "cloudSessionService");
        AbstractC6492s.i(teleportConsoleManager, "teleportConsoleManager");
        AbstractC6492s.i(teleportConnection, "teleportConnection");
        AbstractC6492s.i(viewRouter, "viewRouter");
        AbstractC6492s.i(toastService, "toastService");
        this.f40978a = accountManager;
        this.f40979b = teleportConsoleManager;
        this.f40980c = teleportConnection;
        this.f40981d = viewRouter;
        this.f40982e = toastService;
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f40983f = cVarJ2;
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f40984g = aVarK2;
        gg.i iVarW = cloudSessionService.a().I1(g.f41003a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f40985h = iVarW;
        AbstractC5912b abstractC5912bL1 = cVarJ2.e1().Y0(Gg.a.a(), false, 1).L1(new q());
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        this.f40986i = abstractC5912bL1;
        gg.i iVarI2 = aVarK2.N0(p.f41025a).e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f40987j = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID q(s.f fVar) {
        try {
            UUID uuidFromString = UUID.fromString(fVar.c());
            AbstractC6492s.h(uuidFromString, "fromString(...)");
            return b.a.b(uuidFromString);
        } catch (IllegalArgumentException unused) {
            throw new Error.DeepLinkInvalid(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r(s.f fVar) {
        return e.b.d(fVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b s(s.f fVar) {
        z zVarI = z.i(new c(fVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bX = zVarI.t(new d()).O(e.f41000a).B(f.f41002a).x(new InterfaceC6464a() { // from class: I8.b
            @Override // kg.InterfaceC6464a
            public final void run() {
                TeleportDeepLinkConsoleConnectProcessorImpl.t();
            }
        });
        AbstractC6492s.h(abstractC5912bX, "doOnComplete(...)");
        return abstractC5912bX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        Z7.b.h("DeepLink-TeleportConnect - teleport connection finished successfully", null, 2, null);
    }

    private final AbstractC5912b u(final s.f fVar, long j10) {
        z zVarI = z.i(new h(fVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bX = zVarI.s(new i(j10)).t(new j()).B(new k(fVar)).x(new InterfaceC6464a() { // from class: I8.a
            @Override // kg.InterfaceC6464a
            public final void run() {
                TeleportDeepLinkConsoleConnectProcessorImpl.w(fVar);
            }
        });
        AbstractC6492s.h(abstractC5912bX, "doOnComplete(...)");
        return abstractC5912bX;
    }

    static /* synthetic */ AbstractC5912b v(TeleportDeepLinkConsoleConnectProcessorImpl teleportDeepLinkConsoleConnectProcessorImpl, s.f fVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 5000;
        }
        return teleportDeepLinkConsoleConnectProcessorImpl.u(fVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(s.f fVar) {
        Z7.b.h("DeepLink-TeleportConnect - set account '" + fVar.c() + "' as primary finished successfully", null, 2, null);
    }

    private final AbstractC5912b x(final s.f fVar, long j10) {
        z zVarI = z.i(new l(fVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bX = zVarI.s(new m(j10)).t(new n()).B(new o(fVar)).x(new InterfaceC6464a() { // from class: I8.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                TeleportDeepLinkConsoleConnectProcessorImpl.z(fVar);
            }
        });
        AbstractC6492s.h(abstractC5912bX, "doOnComplete(...)");
        return abstractC5912bX;
    }

    static /* synthetic */ AbstractC5912b y(TeleportDeepLinkConsoleConnectProcessorImpl teleportDeepLinkConsoleConnectProcessorImpl, s.f fVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 15000;
        }
        return teleportDeepLinkConsoleConnectProcessorImpl.x(fVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(s.f fVar) {
        Z7.b.h("DeepLink-TeleportConnect - set console'" + fVar.b() + "' as primary finished successfully", null, 2, null);
    }

    @Override // com.ubnt.usurvey.ui.teleport.deeplink.a
    public AbstractC5912b a() {
        return this.f40986i;
    }

    @Override // com.ubnt.usurvey.ui.teleport.deeplink.a
    public AbstractC5912b b(s.f deepLink) {
        AbstractC6492s.i(deepLink, "deepLink");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(deepLink));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // com.ubnt.usurvey.ui.teleport.deeplink.a
    public gg.i getState() {
        return this.f40987j;
    }
}
