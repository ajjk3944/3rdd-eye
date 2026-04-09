package H8;

import Be.N;
import Fd.C;
import Fd.s;
import H8.d;
import Li.N;
import Zg.AbstractC3689v;
import Zg.U;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.ui.teleport.deeplink.a;
import com.ui.wifiman.model.teleport.h;
import com.ui.wifiman.model.teleport.invitation.TeleportInvitationService;
import com.ui.wifiman.ui.teleport.AbstractC5249b;
import com.ui.wifiman.ui.teleport.AbstractC5250c;
import com.ui.wifiman.ui.teleport.AbstractC5251d;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.r;
import gg.z;
import i8.InterfaceC6084a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.AbstractC6561f;
import l9.C6556a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;
import sh.AbstractC7978m;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class j extends AbstractC5251d {

    /* renamed from: t, reason: collision with root package name */
    static final /* synthetic */ th.l[] f7719t = {O.h(new F(j.class, "teleportAvailableService", "getTeleportAvailableService()Lcom/ui/wifiman/model/teleport/TeleportAvailableService;", 0)), O.h(new F(j.class, "teleportConsoles", "getTeleportConsoles()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;", 0)), O.h(new F(j.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(j.class, "deeplinkConsoleConnection", "getDeeplinkConsoleConnection()Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessor;", 0)), O.h(new F(j.class, "pickerEditModeManager", "getPickerEditModeManager()Lcom/ubnt/usurvey/ui/teleport/TeleportConsolePickerVM$EditModeManager;", 0)), O.h(new F(j.class, "teleportInvitationService", "getTeleportInvitationService()Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;", 0))};

    /* renamed from: u, reason: collision with root package name */
    public static final int f7720u = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f7721g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f7722h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f7723i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f7724j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f7725k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f7726l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f7727m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f7728n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f7729o;

    /* renamed from: p, reason: collision with root package name */
    private final N f7730p;

    /* renamed from: q, reason: collision with root package name */
    private final N f7731q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f7732r;

    /* renamed from: s, reason: collision with root package name */
    private final N f7733s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PASTE_INVITATION = new a("PASTE_INVITATION", 0, "paste");
        public static final a REMOVE_CONNECTION = new a("REMOVE_CONNECTION", 1, "remove");

        /* renamed from: id, reason: collision with root package name */
        private final String f7734id;

        private static final /* synthetic */ a[] $values() {
            return new a[]{PASTE_INVITATION, REMOVE_CONNECTION};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2) {
            this.f7734id = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String getId() {
            return this.f7734id;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7735a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PASTE_INVITATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.REMOVE_CONNECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7735a = iArr;
        }
    }

    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7736a = new c();

        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5250c apply(List consoles, Boolean inEditMode) {
            Object next;
            AbstractC6492s.i(consoles, "consoles");
            AbstractC6492s.i(inEditMode, "inEditMode");
            List list = consoles;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((com.ui.wifiman.model.teleport.h) next).C()) {
                    break;
                }
            }
            com.ui.wifiman.model.teleport.h hVar = (com.ui.wifiman.model.teleport.h) next;
            boolean z10 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((com.ui.wifiman.model.teleport.h) it2.next()) instanceof h.c) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (hVar == null) {
                return new AbstractC5250c.b(new d.b(R.string.teleport));
            }
            String strL = hVar.l();
            return new AbstractC5250c.a(strL != null ? new d.c(strL) : new d.b(R.string.teleport), z10, inEditMode.booleanValue());
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            return ((it instanceof TeleportInvitationService.Error.ClipboardEmpty) || (it instanceof TeleportInvitationService.Error.InvitationNotValid)) ? j.this.E0().a(InterfaceC6084a.b.E.c.f48906a).i(gg.n.h()) : gg.n.i(it);
        }
    }

    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(TeleportCloud.e.b publicSecret) {
            AbstractC6492s.i(publicSecret, "publicSecret");
            return j.this.E0().a(new InterfaceC6084a.b.E.d(publicSecret.a()));
        }
    }

    static final class f implements kg.n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wifiman.model.teleport.h it) {
            AbstractC6492s.i(it, "it");
            return j.this.E0().a(new InterfaceC6084a.b.E.C1822a(it.j(), null));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<s> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<C> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: H8.j$j, reason: collision with other inner class name */
    public static final class C0314j extends org.kodein.type.o<com.ubnt.usurvey.ui.teleport.deeplink.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<TeleportInvitationService> {
    }

    static final class m implements InterfaceC6465b {
        m() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5249b apply(s.a teleportAvailableState, a.AbstractC1276a deeplinkProcessingState) {
            AbstractC6492s.i(teleportAvailableState, "teleportAvailableState");
            AbstractC6492s.i(deeplinkProcessingState, "deeplinkProcessingState");
            return deeplinkProcessingState instanceof a.AbstractC1276a.b ? AbstractC5249b.C1634b.f45007a : j.this.F0(teleportAvailableState);
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f7741a = new n();

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return Boolean.valueOf(((com.ui.wifiman.model.teleport.h) c6556a.a()) instanceof h.c);
        }
    }

    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f7742a = new o();

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ci.c apply(Boolean consoleDeletable) {
            AbstractC6492s.i(consoleDeletable, "consoleDeletable");
            List listC = AbstractC3689v.c();
            listC.add(new N.a(a.PASTE_INVITATION.getId(), Pe.a.f18599a.j(), new d.b(R.string.teleport_tunnel_paste_invitation), false, null, 24, null));
            if (consoleDeletable.booleanValue()) {
                listC.add(new N.a(a.REMOVE_CONNECTION.getId(), N9.b.f16117a.L(), new d.b(R.string.teleport_tunnel_remove), false, N.a.EnumC0068a.DESTRUCTIVE, 8, null));
            }
            return Ci.a.h(AbstractC3689v.a(listC));
        }
    }

    public j(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7721g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, s.class), null);
        th.l[] lVarArr = f7719t;
        this.f7722h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7723i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, C.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7724j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6084a.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new C0314j().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7725k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, com.ubnt.usurvey.ui.teleport.deeplink.a.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7726l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, d.b.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7727m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, TeleportInvitationService.class), null).a(this, lVarArr[5]);
        gg.i iVarW = gg.i.v(B0().getState(), z0().getState(), new m()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f7728n = iVarW;
        gg.i iVarW2 = gg.i.v(C0().getAll(), A0().a(), c.f7736a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f7729o = iVarW2;
        this.f7730p = AbstractC8661g.d0(this, iVarW2, new AbstractC5250c.b(new d.c("")), false, null, 6, null);
        this.f7731q = AbstractC8661g.d0(this, iVarW, AbstractC5249b.C1634b.f45007a, false, null, 6, null);
        InterfaceC5826a entries = a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(((a) obj).getId(), obj);
        }
        this.f7732r = linkedHashMap;
        gg.i iVarW3 = C0().a().N0(n.f7741a).W().N0(o.f7742a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f7733s = AbstractC8661g.d0(this, iVarW3, Ci.a.a(), false, null, 6, null);
    }

    private final d.b A0() {
        return (d.b) this.f7726l.getValue();
    }

    private final s B0() {
        return (s) this.f7722h.getValue();
    }

    private final C C0() {
        return (C) this.f7723i.getValue();
    }

    private final TeleportInvitationService D0() {
        return (TeleportInvitationService) this.f7727m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a E0() {
        return (InterfaceC6084a) this.f7724j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5249b F0(s.a aVar) {
        if (aVar instanceof s.a.AbstractC0251a.C0252a) {
            return AbstractC5249b.c.f45008a;
        }
        if (AbstractC6492s.d(aVar, s.a.b.f6459a)) {
            return AbstractC5249b.C1634b.f45007a;
        }
        if (AbstractC6492s.d(aVar, s.a.c.C0253a.f6460a)) {
            return AbstractC5249b.a.C1632a.f45003a;
        }
        if (AbstractC6492s.d(aVar, s.a.c.b.f6461a)) {
            return AbstractC5249b.a.C1633b.f45004a;
        }
        if (AbstractC6492s.d(aVar, s.a.c.C0254c.f6462a)) {
            return AbstractC5249b.a.c.f45005a;
        }
        if (AbstractC6492s.d(aVar, s.a.c.d.f6463a)) {
            return AbstractC5249b.a.d.f45006a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final com.ubnt.usurvey.ui.teleport.deeplink.a z0() {
        return (com.ubnt.usurvey.ui.teleport.deeplink.a) this.f7725k.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f7721g;
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public Li.N n0() {
        return this.f7731q;
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public Li.N o0() {
        return this.f7733s;
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public Li.N p0() {
        return this.f7730p;
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public void q0() {
        C8658d.f66727a.d(E0().a(InterfaceC6084a.b.D.g.f48903a), this);
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public void r0() {
        C8658d.f66727a.d(A0().update(true), this);
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public void s0() {
        C8658d.f66727a.d(A0().update(false), this);
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public void t0() {
        C8658d.f66727a.d(A0().update(false), this);
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public void u0() {
        C8658d.f66727a.d(E0().a(new InterfaceC6084a.b.t(null)), this);
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public void v0() {
        C8658d.f66727a.d(E0().a(i8.o.f48968a), this);
    }

    @Override // com.ui.wifiman.ui.teleport.AbstractC5251d
    public void w0(String id2) {
        AbstractC5912b abstractC5912bK;
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        Object obj = this.f7732r.get(id2);
        AbstractC6492s.f(obj);
        int i10 = b.f7735a[((a) obj).ordinal()];
        if (i10 == 1) {
            abstractC5912bK = D0().a().X().s(new d()).k(new e());
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z zVarO0 = C0().a().o0();
            AbstractC6492s.h(zVarO0, "firstOrError(...)");
            abstractC5912bK = AbstractC6561f.f(zVarO0).k(new f());
        }
        AbstractC6492s.f(abstractC5912bK);
        c8658d.d(abstractC5912bK, this);
    }
}
