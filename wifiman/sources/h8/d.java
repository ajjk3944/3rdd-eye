package H8;

import Fd.B;
import Fd.C;
import Fd.D;
import K8.d;
import Li.N;
import Li.y;
import Od.a;
import Zc.e;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.teleport.h;
import com.ui.wifiman.model.ubiquiti.cloud.UnifiCloudClient;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.console.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import com.ui.wifiman.ui.teleport.consoles.h;
import com.ui.wifiman.ui.teleport.consoles.i;
import com.ui.wifiman.ui.teleport.z;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.InterfaceC7929a;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class d extends com.ui.wifiman.ui.teleport.consoles.i implements K8.d {

    /* renamed from: g, reason: collision with root package name */
    private final DI f7663g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f7664h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f7665i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f7666j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f7667k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f7668l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f7669m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f7670n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f7671o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f7672p;

    /* renamed from: q, reason: collision with root package name */
    private final y f7673q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f7674r;

    /* renamed from: s, reason: collision with root package name */
    private final gg.i f7675s;

    /* renamed from: t, reason: collision with root package name */
    private final gg.i f7676t;

    /* renamed from: u, reason: collision with root package name */
    private final C8658d.a f7677u;

    /* renamed from: v, reason: collision with root package name */
    private final N f7678v;

    /* renamed from: x, reason: collision with root package name */
    static final /* synthetic */ th.l[] f7661x = {O.h(new F(d.class, "teleportManager", "getTeleportManager()Lcom/ui/wifiman/model/teleport/TeleportManager;", 0)), O.h(new F(d.class, "teleportConsoleService", "getTeleportConsoleService()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;", 0)), O.h(new F(d.class, "teleportConnection", "getTeleportConnection()Lcom/ui/wifiman/model/teleport/TeleportConnection;", 0)), O.h(new F(d.class, "cloudSessionService", "getCloudSessionService()Lcom/ui/wifiman/model/ubiquiti/UbiquitiSsoAccountSessionService;", 0)), O.h(new F(d.class, "cloudStatusService", "getCloudStatusService()Lcom/ui/wifiman/model/ubiquiti/cloud/status/UbiquitiCloudStatus$Service;", 0)), O.h(new F(d.class, "accountManager", "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0)), O.h(new F(d.class, "networkConnection", "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), O.h(new F(d.class, "editModeManager", "getEditModeManager()Lcom/ubnt/usurvey/ui/teleport/TeleportConsolePickerVM$EditModeManager;", 0)), O.h(new F(d.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(d.class, "itemsStream", "getItemsStream()Lio/reactivex/rxjava3/core/Flowable;", 0))};

    /* renamed from: w, reason: collision with root package name */
    public static final a f7660w = new a(null);

    /* renamed from: y, reason: collision with root package name */
    public static final int f7662y = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        gg.i a();

        AbstractC5912b update(boolean z10);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c CONNECTED = new c("CONNECTED", 0);
        public static final c CONNECTING = new c("CONNECTING", 1);
        public static final c DISCONNECTED = new c("DISCONNECTED", 2);

        private static final /* synthetic */ c[] $values() {
            return new c[]{CONNECTED, CONNECTING, DISCONNECTED};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: H8.d$d, reason: collision with other inner class name */
    private static final class EnumC0312d {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC0312d[] $VALUES;
        public static final EnumC0312d NO_ACCOUNT = new EnumC0312d("NO_ACCOUNT", 0);
        public static final EnumC0312d IN_PROGRESS = new EnumC0312d("IN_PROGRESS", 1);
        public static final EnumC0312d DONE = new EnumC0312d("DONE", 2);
        public static final EnumC0312d UNAUTHORIZED = new EnumC0312d("UNAUTHORIZED", 3);

        private static final /* synthetic */ EnumC0312d[] $values() {
            return new EnumC0312d[]{NO_ACCOUNT, IN_PROGRESS, DONE, UNAUTHORIZED};
        }

        static {
            EnumC0312d[] enumC0312dArr$values = $values();
            $VALUES = enumC0312dArr$values;
            $ENTRIES = AbstractC5827b.a(enumC0312dArr$values);
        }

        private EnumC0312d(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC0312d valueOf(String str) {
            return (EnumC0312d) Enum.valueOf(EnumC0312d.class, str);
        }

        public static EnumC0312d[] values() {
            return (EnumC0312d[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7679a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7680b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7679a = iArr;
            int[] iArr2 = new int[h.a.EnumC1637a.values().length];
            try {
                iArr2[h.a.EnumC1637a.CONNECTION_NOT_POSSIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h.a.EnumC1637a.CONNECTABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h.a.EnumC1637a.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f7680b = iArr2;
        }
    }

    public static final class f implements InterfaceC5915e {
        public f() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                d.this.b().j(i.a.C1638a.f45047a);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f7682a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.f() == e.b.CONNECTED);
        }
    }

    static final class h implements kg.j {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7684a;

            static {
                int[] iArr = new int[EnumC0312d.values().length];
                try {
                    iArr[EnumC0312d.DONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0312d.NO_ACCOUNT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0312d.UNAUTHORIZED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC0312d.IN_PROGRESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f7684a = iArr;
            }
        }

        h() {
        }

        @Override // kg.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(List consoles, EnumC0312d consolesFetchState, c mainConsoleState, Boolean networkConnected, Wc.b bVar, Boolean inEditMode) {
            int i10;
            int i11;
            AbstractC6492s.i(consoles, "consoles");
            AbstractC6492s.i(consolesFetchState, "consolesFetchState");
            AbstractC6492s.i(mainConsoleState, "mainConsoleState");
            AbstractC6492s.i(networkConnected, "networkConnected");
            AbstractC6492s.i(bVar, "<destruct>");
            AbstractC6492s.i(inEditMode, "inEditMode");
            Od.a aVar = (Od.a) bVar.a();
            d dVar = d.this;
            List listC = AbstractC3689v.c();
            List list = consoles;
            int i12 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ((((com.ui.wifiman.model.teleport.h) it.next()) instanceof h.a) && (i12 = i12 + 1) < 0) {
                        AbstractC3689v.u();
                    }
                }
            }
            int i13 = 1;
            if (i12 == 0) {
                Iterator it2 = AbstractC3689v.X0(list, com.ui.wifiman.model.teleport.h.f43292a.a()).iterator();
                while (it2.hasNext()) {
                    listC.add(dVar.u0((com.ui.wifiman.model.teleport.h) it2.next(), mainConsoleState, networkConnected.booleanValue(), aVar, inEditMode.booleanValue()));
                    i13 = i13;
                }
                int i14 = i13;
                if (!inEditMode.booleanValue() && (i11 = a.f7684a[consolesFetchState.ordinal()]) != i14 && i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listC.add(new h.b("loading1"));
                    listC.add(new h.b("loading2"));
                    listC.add(new h.b("loading3"));
                }
            } else if (consoles.size() < 5) {
                Iterator it3 = AbstractC3689v.X0(consoles, com.ui.wifiman.model.teleport.h.f43292a.a()).iterator();
                while (it3.hasNext()) {
                    listC.add(dVar.u0((com.ui.wifiman.model.teleport.h) it3.next(), mainConsoleState, networkConnected.booleanValue(), aVar, inEditMode.booleanValue()));
                }
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List<com.ui.wifiman.model.teleport.h> list2 = consoles;
                for (com.ui.wifiman.model.teleport.h hVar : list2) {
                    if (hVar.h()) {
                        arrayList.add(hVar);
                    } else {
                        arrayList2.add(hVar);
                    }
                }
                if (arrayList.isEmpty() || arrayList2.isEmpty()) {
                    Iterator it4 = AbstractC3689v.X0(list2, com.ui.wifiman.model.teleport.h.f43292a.a()).iterator();
                    while (it4.hasNext()) {
                        listC.add(dVar.u0((com.ui.wifiman.model.teleport.h) it4.next(), mainConsoleState, networkConnected.booleanValue(), aVar, inEditMode.booleanValue()));
                    }
                } else {
                    listC.add(new h.c("headerLastUsed", new d.b(R.string.teleport_console_picker_category_last_used)));
                    Iterator it5 = AbstractC3689v.X0(arrayList, com.ui.wifiman.model.teleport.h.f43292a.a()).iterator();
                    while (it5.hasNext()) {
                        listC.add(dVar.u0((com.ui.wifiman.model.teleport.h) it5.next(), mainConsoleState, networkConnected.booleanValue(), aVar, inEditMode.booleanValue()));
                        arrayList2 = arrayList2;
                    }
                    listC.add(new h.c("headerOther", new d.b(R.string.teleport_console_picker_category_other)));
                    Iterator it6 = AbstractC3689v.X0(arrayList2, com.ui.wifiman.model.teleport.h.f43292a.a()).iterator();
                    while (it6.hasNext()) {
                        listC.add(dVar.u0((com.ui.wifiman.model.teleport.h) it6.next(), mainConsoleState, networkConnected.booleanValue(), aVar, inEditMode.booleanValue()));
                    }
                }
            }
            if (!inEditMode.booleanValue() && (i10 = a.f7684a[consolesFetchState.ordinal()]) != 1) {
                if (i10 == 2 || i10 == 3) {
                    listC.add(h.d.f45045a);
                } else if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return AbstractC3689v.a(listC);
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f7685a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c apply(TeleportConnection.a it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof TeleportConnection.a.b.C1440a) {
                return c.CONNECTED;
            }
            if (it instanceof TeleportConnection.a.b.AbstractC1441b) {
                return c.CONNECTING;
            }
            if (it instanceof TeleportConnection.a.C1439a) {
                return c.DISCONNECTED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class j implements kg.n {
        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TeleportConnection.Error.NoVpnProfile ? d.this.I0().a(new InterfaceC6084a.b.E.e(true)) : error instanceof TeleportConnection.Error ? AbstractC5912b.m() : AbstractC5912b.D(error);
        }
    }

    static final class k implements kg.n {
        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) c6556a.a();
            return d.this.I0().a(new InterfaceC6084a.b.t(bVar != null ? bVar.c() : null));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<D> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<C> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<TeleportConnection> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<Ld.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p extends org.kodein.type.o<a.InterfaceC0616a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends org.kodein.type.o<UiSSOAccountManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class s extends org.kodein.type.o<b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class t extends org.kodein.type.o<InterfaceC6084a> {
    }

    static final class u implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final u f7688a = new u();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f7689a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC0312d apply(b.a it) {
                AbstractC6492s.i(it, "it");
                if (it instanceof b.a.C1495a) {
                    UnifiCloudClient.Error errorA = ((b.a.C1495a) it).a();
                    if (errorA instanceof UnifiCloudClient.Error.Unauthorized) {
                        return EnumC0312d.UNAUTHORIZED;
                    }
                    if (errorA instanceof UnifiCloudClient.Error.IO) {
                        return EnumC0312d.IN_PROGRESS;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if ((it instanceof b.a.C1496b) || (it instanceof b.a.c)) {
                    return EnumC0312d.IN_PROGRESS;
                }
                if (it instanceof b.a.d) {
                    return EnumC0312d.DONE;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Ld.e eVar = (Ld.e) c6556a.a();
            return eVar != null ? eVar.d().b().N0(a.f7689a) : gg.i.K0(EnumC0312d.NO_ACCOUNT);
        }
    }

    public d(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7663g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, D.class), null);
        th.l[] lVarArr = f7661x;
        this.f7664h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7665i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, C.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7666j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, TeleportConnection.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7667k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, Ld.f.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7668l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, a.InterfaceC0616a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7669m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, UiSSOAccountManager.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7670n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, Zc.f.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new s().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7671o = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, b.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new t().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7672p = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, InterfaceC6084a.class), null).a(this, lVarArr[8]);
        this.f7673q = Li.F.b(0, 1, Ki.a.DROP_OLDEST, 1, null);
        gg.i iVarW = z0().a().I1(u.f7688a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f7674r = iVarW;
        gg.i iVarW2 = F0().getState().N0(i.f7685a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f7675s = iVarW2;
        gg.i iVarW3 = E0().getState().N0(g.f7682a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f7676t = iVarW3;
        this.f7677u = C8658d.c(C8658d.f66727a, this, null, new InterfaceC6824a() { // from class: H8.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return d.J0(this.f7659a);
            }
        }, 1, null);
        this.f7678v = AbstractC8661g.d0(this, D0(), AbstractC3689v.l(), false, null, 6, null);
    }

    private final a.InterfaceC0616a A0() {
        return (a.InterfaceC0616a) this.f7668l.getValue();
    }

    private final b B0() {
        return (b) this.f7671o.getValue();
    }

    private final gg.i D0() {
        return this.f7677u.c(this, f7661x[9]);
    }

    private final Zc.f E0() {
        return (Zc.f) this.f7670n.getValue();
    }

    private final TeleportConnection F0() {
        return (TeleportConnection) this.f7666j.getValue();
    }

    private final C G0() {
        return (C) this.f7665i.getValue();
    }

    private final D H0() {
        return (D) this.f7664h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a I0() {
        return (InterfaceC6084a) this.f7672p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i J0(d dVar) {
        gg.i iVarR = gg.i.r(dVar.G0().getAll(), dVar.f7674r, dVar.f7675s, dVar.f7676t, dVar.A0().a(), dVar.B0().a(), dVar.new h());
        AbstractC6492s.h(iVarR, "combineLatest(...)");
        return iVarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ui.wifiman.ui.teleport.consoles.h.a u0(com.ui.wifiman.model.teleport.h r16, H8.d.c r17, boolean r18, Od.a r19, boolean r20) {
        /*
            r15 = this;
            r0 = r16
            Fd.B r1 = r16.s()
            r2 = 0
            r3 = r15
            if (r1 == 0) goto L14
            com.ui.wifiman.ui.teleport.z r1 = r15.v0(r1)
            r4 = r19
            r9 = r1
            r1 = r18
            goto L19
        L14:
            r1 = r18
            r4 = r19
            r9 = r2
        L19:
            Id.a r1 = Id.b.a(r0, r1, r4)
            java.lang.String r5 = r16.j()
            s9.a r6 = r15.x0(r16)
            java.lang.String r4 = r16.l()
            if (r4 == 0) goto L31
            s9.d$c r7 = new s9.d$c
            r7.<init>(r4)
            goto L3a
        L31:
            s9.d$b r4 = new s9.d$b
            r7 = 2131821324(0x7f11030c, float:1.9275388E38)
            r4.<init>(r7)
            r7 = r4
        L3a:
            boolean r4 = r1 instanceof Id.a.b
            if (r4 == 0) goto L47
            s9.d$b r8 = new s9.d$b
            r10 = 2131821509(0x7f1103c5, float:1.9275763E38)
            r8.<init>(r10)
            goto L77
        L47:
            boolean r8 = r1 instanceof Id.a.C0370a
            if (r8 == 0) goto L54
            s9.d$b r8 = new s9.d$b
            r10 = 2131821294(0x7f1102ee, float:1.9275327E38)
            r8.<init>(r10)
            goto L77
        L54:
            boolean r8 = r1 instanceof Id.a.c.b
            if (r8 != 0) goto L6f
            boolean r8 = r1 instanceof Id.a.c.d
            if (r8 == 0) goto L5d
            goto L6f
        L5d:
            boolean r8 = r1 instanceof Id.a.c
            if (r8 == 0) goto L69
            r8 = r1
            Id.a$c r8 = (Id.a.c) r8
            s9.d r8 = H8.o.b(r8)
            goto L77
        L69:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L6f:
            s9.d$b r8 = new s9.d$b
            r10 = 2131821293(0x7f1102ed, float:1.9275325E38)
            r8.<init>(r10)
        L77:
            boolean r10 = r16.C()
            if (r10 == 0) goto L9c
            int[] r10 = H8.d.e.f7679a
            int r11 = r17.ordinal()
            r10 = r10[r11]
            r11 = 1
            if (r10 == r11) goto L99
            r11 = 2
            if (r10 == r11) goto L95
            r11 = 3
            if (r10 != r11) goto L8f
            goto L9c
        L8f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L95:
            com.ui.wifiman.ui.teleport.consoles.h$a$a r1 = com.ui.wifiman.ui.teleport.consoles.h.a.EnumC1637a.CONNECTED
        L97:
            r10 = r1
            goto Lad
        L99:
            com.ui.wifiman.ui.teleport.consoles.h$a$a r1 = com.ui.wifiman.ui.teleport.consoles.h.a.EnumC1637a.CONNECTED
            goto L97
        L9c:
            if (r4 == 0) goto L9f
            goto Lac
        L9f:
            boolean r2 = r1 instanceof Id.a.C0370a
            if (r2 == 0) goto La6
            com.ui.wifiman.ui.teleport.consoles.h$a$a r2 = com.ui.wifiman.ui.teleport.consoles.h.a.EnumC1637a.CONNECTABLE
            goto Lac
        La6:
            boolean r1 = r1 instanceof Id.a.c
            if (r1 == 0) goto Lc3
            com.ui.wifiman.ui.teleport.consoles.h$a$a r2 = com.ui.wifiman.ui.teleport.consoles.h.a.EnumC1637a.CONNECTION_NOT_POSSIBLE
        Lac:
            r10 = r2
        Lad:
            boolean r14 = r0 instanceof com.ui.wifiman.model.teleport.h.c
            com.ui.wifiman.model.teleport.n$b r0 = r16.y()
            boolean r0 = r0 instanceof com.ui.wifiman.model.teleport.n.b.a.c
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            com.ui.wifiman.ui.teleport.consoles.h$a r0 = new com.ui.wifiman.ui.teleport.consoles.h$a
            r4 = r0
            r11 = r14
            r13 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        Lc3:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H8.d.u0(com.ui.wifiman.model.teleport.h, H8.d$c, boolean, Od.a, boolean):com.ui.wifiman.ui.teleport.consoles.h$a");
    }

    private final AbstractC5912b w0() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new f());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    private final UiSSOAccountManager y0() {
        return (UiSSOAccountManager) this.f7669m.getValue();
    }

    private final Ld.f z0() {
        return (Ld.f) this.f7667k.getValue();
    }

    @Override // com.ui.wifiman.ui.teleport.consoles.i
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public y b() {
        return this.f7673q;
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f7663g;
    }

    @Override // com.ui.wifiman.ui.teleport.consoles.i
    public N n0() {
        return this.f7678v;
    }

    @Override // com.ui.wifiman.ui.teleport.consoles.i
    public void o0(h.a item) {
        AbstractC6492s.i(item, "item");
        C8658d.f66727a.d(I0().a(new InterfaceC6084a.b.E.C1822a(e.b.d(item.a()), null)), this);
    }

    @Override // com.ui.wifiman.ui.teleport.consoles.i
    public void p0(com.ui.wifiman.ui.teleport.consoles.h item) {
        AbstractC5912b abstractC5912bM;
        AbstractC6492s.i(item, "item");
        if (!(item instanceof h.a)) {
            if (!(item instanceof h.b) && !(item instanceof h.c) && !(item instanceof h.d)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        C8658d c8658d = C8658d.f66727a;
        h.a aVar = (h.a) item;
        h.a.EnumC1637a enumC1637aB = aVar.b();
        int i10 = enumC1637aB == null ? -1 : e.f7680b[enumC1637aB.ordinal()];
        if (i10 == -1) {
            abstractC5912bM = AbstractC5912b.m();
            AbstractC6492s.h(abstractC5912bM, "complete(...)");
        } else if (i10 == 1) {
            abstractC5912bM = I0().a(new InterfaceC6084a.b.E.C1823b(e.b.d(aVar.a()), null));
        } else if (i10 == 2) {
            abstractC5912bM = H0().b(e.b.d(aVar.a())).g(F0().connect().X(AbstractC5912b.a0(50L, TimeUnit.MILLISECONDS)).O(new j())).g(w0());
            AbstractC6492s.h(abstractC5912bM, "andThen(...)");
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC5912bM = w0();
        }
        c8658d.d(abstractC5912bM, this);
    }

    @Override // com.ui.wifiman.ui.teleport.consoles.i
    public void q0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = y0().e().o0().t(new k());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    public z v0(B b10) {
        return d.a.a(this, b10);
    }

    public InterfaceC7929a x0(com.ui.wifiman.model.teleport.h hVar) {
        return d.a.b(this, hVar);
    }
}
