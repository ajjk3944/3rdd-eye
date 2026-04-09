package H8;

import H8.l;
import Id.f;
import L0.C3174d;
import Li.N;
import Md.g;
import Qe.c;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.teleport.invitation.TeleportInvitationProcessor;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import i8.InterfaceC6084a;
import java.net.URI;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import org.kodein.type.s;
import rj.InterfaceC7733m2;
import rj.InterfaceC7810x2;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;
import sf.AbstractC7952c;
import sf.C7951b;
import vf.C8224d;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class l extends AbstractC7952c implements K8.d, Id.f {

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ th.l[] f7744s = {O.h(new F(l.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(l.class, "productCatalog", "getProductCatalog()Lcom/ui/product/catalog/uidb/UiDBProductCatalogRx3;", 0)), O.h(new F(l.class, "teleportConnection", "getTeleportConnection()Lcom/ui/wifiman/model/teleport/TeleportConnection;", 0)), O.g(new D(l.class, "stream", "<v#0>", 0))};

    /* renamed from: t, reason: collision with root package name */
    public static final int f7745t = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f7746g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f7747h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f7748i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f7749j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f7750k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f7751l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f7752m;

    /* renamed from: n, reason: collision with root package name */
    private final N f7753n;

    /* renamed from: o, reason: collision with root package name */
    private final N f7754o;

    /* renamed from: p, reason: collision with root package name */
    private final N f7755p;

    /* renamed from: q, reason: collision with root package name */
    private final N f7756q;

    /* renamed from: r, reason: collision with root package name */
    private final N f7757r;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC7929a f7758a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7759b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7760c;

        public a(InterfaceC7929a interfaceC7929a, String str, String str2) {
            this.f7758a = interfaceC7929a;
            this.f7759b = str;
            this.f7760c = str2;
        }

        public final InterfaceC7929a a() {
            return this.f7758a;
        }

        public final String b() {
            return this.f7760c;
        }

        public final String c() {
            return this.f7759b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f7758a, aVar.f7758a) && AbstractC6492s.d(this.f7759b, aVar.f7759b) && AbstractC6492s.d(this.f7760c, aVar.f7760c);
        }

        public int hashCode() {
            InterfaceC7929a interfaceC7929a = this.f7758a;
            int iHashCode = (interfaceC7929a == null ? 0 : interfaceC7929a.hashCode()) * 31;
            String str = this.f7759b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f7760c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "SiteInfo(icon=" + this.f7758a + ", name=" + this.f7759b + ", location=" + this.f7760c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class b {

        public static abstract class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f7761a;

            /* renamed from: H8.l$b$a$a, reason: collision with other inner class name */
            public static final class C0315a extends a {

                /* renamed from: b, reason: collision with root package name */
                private final a f7762b;

                public C0315a(a aVar) {
                    super(null);
                    this.f7762b = aVar;
                }

                @Override // H8.l.b
                protected a e() {
                    return this.f7762b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0315a) && AbstractC6492s.d(this.f7762b, ((C0315a) obj).f7762b);
                }

                @Override // H8.l.b
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public d.b c() {
                    return new d.b(R.string.teleport_tunnel_error_teleport_host_offline_message);
                }

                public int hashCode() {
                    a aVar = this.f7762b;
                    if (aVar == null) {
                        return 0;
                    }
                    return aVar.hashCode();
                }

                @Override // H8.l.b
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public d.b g() {
                    return new d.b(R.string.teleport_tunnel_error_teleport_host_offline_title);
                }

                public String toString() {
                    return "HostOffline(site=" + this.f7762b + ")";
                }
            }

            /* renamed from: H8.l$b$a$b, reason: collision with other inner class name */
            public static final class C0316b extends a {

                /* renamed from: b, reason: collision with root package name */
                private final a f7763b;

                /* renamed from: H8.l$b$a$b$a, reason: collision with other inner class name */
                static final class C0317a implements mh.q {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0317a f7764a = new C0317a();

                    C0317a() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final C8224d.a c(int i10, String str) {
                        AbstractC6492s.i(str, "<unused var>");
                        return new C8224d.a("report", "");
                    }

                    public final CharSequence b(Context it, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(it, "it");
                        interfaceC3540l.U(672667678);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(672667678, i10, -1, "com.ubnt.usurvey.ui.teleport.TeleportInvitationVM.State.Error.HostUnreachable.<get-message>.<anonymous> (TeleportInvitationVM.kt:306)");
                        }
                        C8224d c8224d = C8224d.f63596a;
                        String string = it.getString(R.string.teleport_tunnel_error_io_message);
                        AbstractC6492s.h(string, "getString(...)");
                        long jA = c8224d.a(interfaceC3540l, C8224d.f63597b);
                        interfaceC3540l.U(-1443176900);
                        Object objF = interfaceC3540l.f();
                        if (objF == InterfaceC3540l.f21100a.a()) {
                            objF = new InterfaceC6839p() { // from class: H8.m
                                @Override // mh.InterfaceC6839p
                                public final Object invoke(Object obj, Object obj2) {
                                    return l.b.a.C0316b.C0317a.c(((Integer) obj).intValue(), (String) obj2);
                                }
                            };
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        C3174d c3174dD = C8224d.d(c8224d, string, jA, null, (InterfaceC6839p) objF, 4, null);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                        interfaceC3540l.J();
                        return c3174dD;
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                        return b((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    }
                }

                public C0316b(a aVar) {
                    super(null);
                    this.f7763b = aVar;
                }

                @Override // H8.l.b
                protected a e() {
                    return this.f7763b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0316b) && AbstractC6492s.d(this.f7763b, ((C0316b) obj).f7763b);
                }

                @Override // H8.l.b
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public d.a c() {
                    return new d.a("tunnelConnection", C0317a.f7764a);
                }

                public int hashCode() {
                    a aVar = this.f7763b;
                    if (aVar == null) {
                        return 0;
                    }
                    return aVar.hashCode();
                }

                @Override // H8.l.b
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public d.b g() {
                    return new d.b(R.string.teleport_tunnel_error_io_title);
                }

                public String toString() {
                    return "HostUnreachable(site=" + this.f7763b + ")";
                }
            }

            public static final class c extends a {

                /* renamed from: b, reason: collision with root package name */
                public static final c f7765b = new c();

                /* renamed from: c, reason: collision with root package name */
                private static final a f7766c = null;

                private c() {
                    super(null);
                }

                @Override // H8.l.b.a, H8.l.b
                public boolean a() {
                    return false;
                }

                @Override // H8.l.b
                protected a e() {
                    return f7766c;
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                @Override // H8.l.b
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public d.b c() {
                    return new d.b(R.string.teleport_invitation_link_already_in_use_subtitle);
                }

                public int hashCode() {
                    return 1803040604;
                }

                @Override // H8.l.b
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public d.b g() {
                    return new d.b(R.string.teleport_invitation_link_already_in_use_title);
                }

                public String toString() {
                    return "InvitationAlreadyUsed";
                }
            }

            public static final class d extends a {

                /* renamed from: b, reason: collision with root package name */
                public static final d f7767b = new d();

                /* renamed from: c, reason: collision with root package name */
                private static final a f7768c = null;

                private d() {
                    super(null);
                }

                @Override // H8.l.b.a, H8.l.b
                public boolean a() {
                    return false;
                }

                @Override // H8.l.b
                protected a e() {
                    return f7768c;
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                @Override // H8.l.b
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public d.b c() {
                    return new d.b(R.string.teleport_tunnel_error_teleport_token_invalid_message);
                }

                public int hashCode() {
                    return -1736462178;
                }

                @Override // H8.l.b
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public d.b g() {
                    return new d.b(R.string.teleport_tunnel_error_teleport_token_invalid_title);
                }

                public String toString() {
                    return "InvitationInvalid";
                }
            }

            public static final class e extends a {

                /* renamed from: b, reason: collision with root package name */
                private final a f7769b;

                /* renamed from: c, reason: collision with root package name */
                private final s9.d f7770c;

                /* renamed from: d, reason: collision with root package name */
                private final s9.d f7771d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(a aVar, s9.d title, s9.d message) {
                    super(null);
                    AbstractC6492s.i(title, "title");
                    AbstractC6492s.i(message, "message");
                    this.f7769b = aVar;
                    this.f7770c = title;
                    this.f7771d = message;
                }

                @Override // H8.l.b
                public s9.d c() {
                    return this.f7771d;
                }

                @Override // H8.l.b
                protected a e() {
                    return this.f7769b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return AbstractC6492s.d(this.f7769b, eVar.f7769b) && AbstractC6492s.d(this.f7770c, eVar.f7770c) && AbstractC6492s.d(this.f7771d, eVar.f7771d);
                }

                @Override // H8.l.b
                public s9.d g() {
                    return this.f7770c;
                }

                public int hashCode() {
                    a aVar = this.f7769b;
                    return ((((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f7770c.hashCode()) * 31) + this.f7771d.hashCode();
                }

                public String toString() {
                    return "TunnelSetupFailed(site=" + this.f7769b + ", title=" + this.f7770c + ", message=" + this.f7771d + ")";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // H8.l.b
            public boolean a() {
                return this.f7761a;
            }

            private a() {
                super(null);
            }
        }

        /* renamed from: H8.l$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0318b extends b {

            /* renamed from: H8.l$b$b$a */
            public static final class a extends AbstractC0318b {

                /* renamed from: a, reason: collision with root package name */
                private final a f7772a;

                /* renamed from: b, reason: collision with root package name */
                private final boolean f7773b;

                /* renamed from: H8.l$b$b$a$a, reason: collision with other inner class name */
                static final class C0319a implements mh.q {
                    C0319a() {
                    }

                    public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(context, "context");
                        interfaceC3540l.U(-980711930);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-980711930, i10, -1, "com.ubnt.usurvey.ui.teleport.TeleportInvitationVM.State.Loaded.CreatingTunnel.<get-message>.<anonymous> (TeleportInvitationVM.kt:281)");
                        }
                        String string = context.getString(R.string.teleport_invitation_subtitle_creating_tunnel);
                        AbstractC6492s.h(string, "getString(...)");
                        String str = String.format(string, Arrays.copyOf(new Object[]{a.this.d()}, 1));
                        AbstractC6492s.h(str, "format(...)");
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                        interfaceC3540l.J();
                        return str;
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                        return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    }
                }

                public a(a aVar) {
                    super(null);
                    this.f7772a = aVar;
                }

                @Override // H8.l.b
                public boolean a() {
                    return this.f7773b;
                }

                @Override // H8.l.b
                protected a e() {
                    return this.f7772a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && AbstractC6492s.d(this.f7772a, ((a) obj).f7772a);
                }

                public int hashCode() {
                    a aVar = this.f7772a;
                    if (aVar == null) {
                        return 0;
                    }
                    return aVar.hashCode();
                }

                @Override // H8.l.b
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public d.a c() {
                    return new d.a(d(), new C0319a());
                }

                public String toString() {
                    return "CreatingTunnel(site=" + this.f7772a + ")";
                }
            }

            /* renamed from: H8.l$b$b$b, reason: collision with other inner class name */
            public static final class C0320b extends AbstractC0318b {

                /* renamed from: a, reason: collision with root package name */
                private final a f7775a;

                /* renamed from: b, reason: collision with root package name */
                private final boolean f7776b;

                public C0320b(a aVar) {
                    super(null);
                    this.f7775a = aVar;
                    this.f7776b = true;
                }

                @Override // H8.l.b
                public boolean a() {
                    return this.f7776b;
                }

                @Override // H8.l.b
                protected a e() {
                    return this.f7775a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0320b) && AbstractC6492s.d(this.f7775a, ((C0320b) obj).f7775a);
                }

                public int hashCode() {
                    a aVar = this.f7775a;
                    if (aVar == null) {
                        return 0;
                    }
                    return aVar.hashCode();
                }

                @Override // H8.l.b
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public d.b c() {
                    return new d.b(R.string.teleport_invitation_subtitle);
                }

                public String toString() {
                    return "Idle(site=" + this.f7775a + ")";
                }
            }

            /* renamed from: H8.l$b$b$c */
            public static final class c extends AbstractC0318b {

                /* renamed from: a, reason: collision with root package name */
                private final a f7777a;

                /* renamed from: b, reason: collision with root package name */
                private final boolean f7778b;

                /* renamed from: H8.l$b$b$c$a */
                static final class a implements mh.q {
                    a() {
                    }

                    public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(context, "context");
                        interfaceC3540l.U(-72407343);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-72407343, i10, -1, "com.ubnt.usurvey.ui.teleport.TeleportInvitationVM.State.Loaded.TunnelCreated.<get-message>.<anonymous> (TeleportInvitationVM.kt:290)");
                        }
                        String string = context.getString(R.string.teleport_invitation_subtitle_creating_tunnel);
                        AbstractC6492s.h(string, "getString(...)");
                        String str = String.format(string, Arrays.copyOf(new Object[]{c.this.d()}, 1));
                        AbstractC6492s.h(str, "format(...)");
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                        interfaceC3540l.J();
                        return str;
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                        return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    }
                }

                public c(a aVar) {
                    super(null);
                    this.f7777a = aVar;
                }

                @Override // H8.l.b
                public boolean a() {
                    return this.f7778b;
                }

                @Override // H8.l.b
                protected a e() {
                    return this.f7777a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && AbstractC6492s.d(this.f7777a, ((c) obj).f7777a);
                }

                public int hashCode() {
                    a aVar = this.f7777a;
                    if (aVar == null) {
                        return 0;
                    }
                    return aVar.hashCode();
                }

                @Override // H8.l.b
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public d.a c() {
                    return new d.a(d(), new a());
                }

                public String toString() {
                    return "TunnelCreated(site=" + this.f7777a + ")";
                }
            }

            /* renamed from: H8.l$b$b$d */
            static final class d implements mh.q {
                d() {
                }

                public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(context, "context");
                    interfaceC3540l.U(-683996585);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-683996585, i10, -1, "com.ubnt.usurvey.ui.teleport.TeleportInvitationVM.State.Loaded.<get-title>.<anonymous> (TeleportInvitationVM.kt:270)");
                    }
                    String string = context.getString(R.string.teleport_invitation_title_format);
                    AbstractC6492s.h(string, "getString(...)");
                    String str = String.format(string, Arrays.copyOf(new Object[]{AbstractC0318b.this.d()}, 1));
                    AbstractC6492s.h(str, "format(...)");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                    interfaceC3540l.J();
                    return str;
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                }
            }

            public /* synthetic */ AbstractC0318b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // H8.l.b
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public d.a g() {
                return new d.a(d(), new d());
            }

            private AbstractC0318b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f7781a = new c();

            /* renamed from: b, reason: collision with root package name */
            private static final a f7782b = null;

            /* renamed from: c, reason: collision with root package name */
            private static final boolean f7783c = false;

            private c() {
                super(null);
            }

            @Override // H8.l.b
            public boolean a() {
                return f7783c;
            }

            @Override // H8.l.b
            protected a e() {
                return f7782b;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            @Override // H8.l.b
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public d.b c() {
                return new d.b(R.string.teleport_invitation_subtitle);
            }

            public int hashCode() {
                return 256383042;
            }

            @Override // H8.l.b
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public d.b g() {
                return new d.b(R.string.teleport_invitation_title_progress);
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean a();

        public final InterfaceC7929a b() {
            a aVarE = e();
            if (aVarE != null) {
                return aVarE.a();
            }
            return null;
        }

        public abstract s9.d c();

        protected final String d() {
            String strC;
            a aVarE = e();
            return (aVarE == null || (strC = aVarE.c()) == null) ? "" : strC;
        }

        protected abstract a e();

        public final s9.d f() {
            String strB;
            a aVarE = e();
            if (aVarE == null || (strB = aVarE.b()) == null) {
                return null;
            }
            return new d.c(strB);
        }

        public abstract s9.d g();

        private b() {
        }
    }

    static final class c implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f7785a = new a();

            /* renamed from: H8.l$c$a$a, reason: collision with other inner class name */
            public static final class C0321a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Throwable f7786a;

                public C0321a(Throwable th2) {
                    this.f7786a = th2;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        Z7.b.j("Teleport connection failed", this.f7786a, null, 4, null);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable it) {
                AbstractC6492s.i(it, "it");
                if (!(it instanceof TeleportConnection.Error)) {
                    return AbstractC5912b.D(it);
                }
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C0321a(it));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(b state) {
            AbstractC6492s.i(state, "state");
            if ((state instanceof b.c) || (state instanceof b.a) || (state instanceof b.AbstractC0318b.C0320b) || (state instanceof b.AbstractC0318b.a)) {
                return AbstractC5912b.m();
            }
            if (state instanceof b.AbstractC0318b.c) {
                return AbstractC5912b.p(l.this.C0().connect().X(AbstractC5912b.a0(50L, TimeUnit.MILLISECONDS)).O(a.f7785a), l.this.D0().a(InterfaceC6084a.b.n.f48939a), l.this.D0().a(new InterfaceC6084a.b.C6085c(c.a.TELEPORT)));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f7787a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(b it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.b());
        }
    }

    static final class e implements kg.n {

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/C4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends org.kodein.type.o<TeleportCloud.e.b> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/D4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends org.kodein.type.o<TeleportInvitationProcessor> {
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportInvitationProcessor apply(C7951b it) {
            AbstractC6492s.i(it, "it");
            InterfaceC7733m2 interfaceC7733m2F = org.kodein.di.d.f(l.this.getDi());
            TeleportCloud.e.b bVar = new TeleportCloud.e.b(it.a());
            InterfaceC7733m2 interfaceC7733m2G = interfaceC7733m2F.g();
            org.kodein.type.i iVarE = s.e(new a().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            org.kodein.type.d dVar = new org.kodein.type.d(iVarE, TeleportCloud.e.b.class);
            org.kodein.type.i iVarE2 = s.e(new b().getSuperType());
            AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            return (TeleportInvitationProcessor) interfaceC7733m2G.b(dVar, new org.kodein.type.d(iVarE2, TeleportInvitationProcessor.class), null, bVar);
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f7789a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(TeleportInvitationProcessor it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }
    }

    static final class g implements kg.g {
        g() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b a(TeleportInvitationProcessor.a siteState, TeleportInvitationProcessor.b tunnelCreationState, InterfaceC8290a catalogBrowser) {
            b cVar;
            AbstractC6492s.i(siteState, "siteState");
            AbstractC6492s.i(tunnelCreationState, "tunnelCreationState");
            AbstractC6492s.i(catalogBrowser, "catalogBrowser");
            if (siteState instanceof TeleportInvitationProcessor.a.b) {
                return b.c.f7781a;
            }
            if (siteState instanceof TeleportInvitationProcessor.a.C1453a) {
                return l.this.H0(((TeleportInvitationProcessor.a.C1453a) siteState).a(), null, catalogBrowser);
            }
            if (!(siteState instanceof TeleportInvitationProcessor.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (tunnelCreationState instanceof TeleportInvitationProcessor.b.C1454b) {
                cVar = new b.AbstractC0318b.C0320b(l.this.A0(((TeleportInvitationProcessor.a.c) siteState).a(), catalogBrowser));
            } else if (tunnelCreationState instanceof TeleportInvitationProcessor.b.c) {
                cVar = new b.AbstractC0318b.a(l.this.A0(((TeleportInvitationProcessor.a.c) siteState).a(), catalogBrowser));
            } else {
                if (!(tunnelCreationState instanceof TeleportInvitationProcessor.b.d)) {
                    if (tunnelCreationState instanceof TeleportInvitationProcessor.b.a) {
                        return l.this.H0(((TeleportInvitationProcessor.b.a) tunnelCreationState).a(), ((TeleportInvitationProcessor.a.c) siteState).a(), catalogBrowser);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new b.AbstractC0318b.c(l.this.A0(((TeleportInvitationProcessor.a.c) siteState).a(), catalogBrowser));
            }
            return cVar;
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f7791a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(b it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.a());
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f7792a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(b it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.c());
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f7793a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(TeleportInvitationProcessor it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    public static final class k implements gg.k {
        public k() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(l.this.p0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: H8.l$l, reason: collision with other inner class name */
    public static final class C0322l extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<xa.o> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<TeleportConnection> {
    }

    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f7795a = new o();

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(b it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.f());
        }
    }

    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final p f7796a = new p();

        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(TeleportInvitationProcessor manager) {
            AbstractC6492s.i(manager, "manager");
            return manager.b();
        }
    }

    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final q f7797a = new q();

        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9.d apply(b it) {
            AbstractC6492s.i(it, "it");
            return it.g();
        }
    }

    public l(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7746g = di2;
        org.kodein.type.i iVarE = s.e(new C0322l().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f7744s;
        this.f7747h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7748i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, xa.o.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7749j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, TeleportConnection.class), null).a(this, lVarArr[2]);
        gg.i iVarI2 = gg.i.N(new k(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        gg.i iVarK = iVarI2.N0(new e()).k();
        AbstractC6492s.h(iVarK, "cache(...)");
        this.f7750k = iVarK;
        gg.i iVarI22 = iVarK.I1(p.f7796a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f7751l = iVarI22;
        gg.i iVarI23 = gg.i.u(iVarI22, iVarK.I1(f.f7789a), B0().b(), new g()).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f7752m = iVarI23;
        gg.i iVarW = iVarI23.N0(d.f7787a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f7753n = AbstractC8661g.h0(this, iVarW, null, null, 2, null);
        gg.i iVarW2 = iVarI23.N0(q.f7797a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f7754o = AbstractC8661g.d0(this, iVarW2, new d.c(""), false, null, 6, null);
        gg.i iVarW3 = iVarI23.N0(o.f7795a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f7755p = AbstractC8661g.h0(this, iVarW3, null, null, 2, null);
        gg.i iVarW4 = iVarI23.N0(i.f7792a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f7756q = AbstractC8661g.h0(this, iVarW4, null, null, 2, null);
        gg.i iVarW5 = iVarI23.N0(h.f7791a).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f7757r = AbstractC8661g.d0(this, iVarW5, Boolean.FALSE, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a A0(TeleportCloud.b bVar, InterfaceC8290a interfaceC8290a) {
        URI uriA;
        InterfaceC8439a.d dVar;
        String strB = bVar.b();
        InterfaceC7929a bVar2 = null;
        com.ubnt.usurvey.product.m mVarB = (strB == null || (dVar = (InterfaceC8439a.d) interfaceC8290a.d(strB)) == null) ? null : com.ubnt.usurvey.product.o.b(dVar, m.c.NORMAL);
        if (mVarB != null) {
            if (mVarB instanceof m.a) {
                bVar2 = new c.a(((m.a) mVarB).a(), null, 2, null);
            } else {
                if (!(mVarB instanceof m.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = new c.b(((m.b) mVarB).a(), null, null, null, 14, null);
            }
        } else if (bVar.d() != null && bVar.c() != null) {
            g.a aVar = Md.g.f13109a;
            String strD = bVar.d();
            AbstractC6492s.f(strD);
            Integer numC = bVar.c();
            AbstractC6492s.f(numC);
            String strB2 = g.a.b(aVar, strD, numC.intValue(), null, 4, null);
            if (strB2 != null && (uriA = L8.j.f11266a.a(strB2)) != null) {
                bVar2 = new c.b(uriA, null, null, null, 14, null);
            }
        }
        return new a(bVar2, bVar.h(), bVar.g());
    }

    private final xa.o B0() {
        return (xa.o) this.f7748i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeleportConnection C0() {
        return (TeleportConnection) this.f7749j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a D0() {
        return (InterfaceC6084a) this.f7747h.getValue();
    }

    private final void E0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(G0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: H8.k
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return l.F0(this.f7743a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i F0(l lVar) {
        gg.i iVarC0 = lVar.f7752m.t0(lVar.new c()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i G0(C8658d.a aVar) {
        return aVar.c(null, f7744s[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b H0(TeleportInvitationProcessor.Error error, TeleportCloud.b bVar, InterfaceC8290a interfaceC8290a) {
        if (error instanceof TeleportInvitationProcessor.Error.NetworkUnreachableError) {
            return new b.a.C0315a(bVar != null ? A0(bVar, interfaceC8290a) : null);
        }
        if (error instanceof TeleportInvitationProcessor.Error.CloudError) {
            return new b.a.C0316b(bVar != null ? A0(bVar, interfaceC8290a) : null);
        }
        if (error instanceof TeleportInvitationProcessor.Error.TokenAlreadyAdded) {
            return b.a.c.f7765b;
        }
        if (error instanceof TeleportInvitationProcessor.Error.TokenProbablyUsed) {
            return b.a.d.f7767b;
        }
        if (!(error instanceof TeleportInvitationProcessor.Error.TunnelCreationFailed)) {
            throw new NoWhenBranchMatchedException();
        }
        a aVarA0 = bVar != null ? A0(bVar, interfaceC8290a) : null;
        TeleportInvitationProcessor.Error.TunnelCreationFailed tunnelCreationFailed = (TeleportInvitationProcessor.Error.TunnelCreationFailed) error;
        s9.d dVarD = K8.b.d(I0(tunnelCreationFailed.getCause()));
        if (dVarD == null) {
            dVarD = new d.c("");
        }
        s9.d dVarA = K8.b.a(I0(tunnelCreationFailed.getCause()));
        if (dVarA == null) {
            dVarA = new d.c("");
        }
        return new b.a.e(aVarA0, dVarD, dVarA);
    }

    @Override // Id.f
    public Id.c B(UnifiTeleportTunnel.Error error) {
        return f.a.a(this, error);
    }

    public Id.c I0(TeleportConnection.Error error) {
        return f.a.c(this, error);
    }

    @Override // Id.f
    public Id.c S(UnifiConsoleConnectionError unifiConsoleConnectionError) {
        return f.a.d(this, unifiConsoleConnectionError);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f7746g;
    }

    @Override // sf.AbstractC7952c
    public N getTitle() {
        return this.f7754o;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        E0();
    }

    @Override // sf.AbstractC7952c
    public N n0() {
        return this.f7753n;
    }

    @Override // sf.AbstractC7952c
    public N o0() {
        return this.f7756q;
    }

    @Override // sf.AbstractC7952c
    public N q0() {
        return this.f7755p;
    }

    @Override // sf.AbstractC7952c
    public N r0() {
        return this.f7757r;
    }

    @Override // sf.AbstractC7952c
    public void s0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT0 = this.f7750k.t0(j.f7793a);
        AbstractC6492s.h(abstractC5912bT0, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT0, this);
    }

    @Override // Id.f
    public Id.c t(TeleportCloud.Error error) {
        return f.a.b(this, error);
    }

    @Override // sf.AbstractC7952c
    public void t0() {
        C8658d.f66727a.d(D0().a(InterfaceC6084a.b.H.f48911a), this);
    }
}
