package P8;

import If.E;
import If.F;
import Li.N;
import Yg.s;
import com.ui.wifiman.model.wmw.g;
import gg.AbstractC5912b;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import l9.AbstractC6561f;
import l9.C6556a;
import org.kodein.di.DI;
import org.kodein.type.o;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class k extends F {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18332k = {O.h(new kotlin.jvm.internal.F(k.class, "wizardUpgrade", "getWizardUpgrade()Lcom/ui/wifiman/model/wmw/WifimanWizardFirmwareUpgrade;", 0))};

    /* renamed from: l, reason: collision with root package name */
    public static final int f18333l = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f18334g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18335h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f18336i;

    /* renamed from: j, reason: collision with root package name */
    private final N f18337j;

    static final class a implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18338a = new a();

        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(g.a upgradeAvailability, C6556a c6556a) {
            AbstractC6492s.i(upgradeAvailability, "upgradeAvailability");
            AbstractC6492s.i(c6556a, "<destruct>");
            g.c.b.AbstractC1535b abstractC1535b = (g.c.b.AbstractC1535b) c6556a.a();
            return new C6556a(abstractC1535b instanceof g.c.b.AbstractC1535b.C1536b ? new E.c(((g.c.b.AbstractC1535b.C1536b) abstractC1535b).b().toString()) : abstractC1535b instanceof g.c.b.AbstractC1535b.a ? new E.b(((g.c.b.AbstractC1535b.a) abstractC1535b).b().toString()) : upgradeAvailability instanceof g.a.C1534a ? new E.a(((g.a.C1534a) upgradeAvailability).a().c().toString()) : null);
        }
    }

    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            g.a aVar = (g.a) sVar.a();
            return !(((C6556a) sVar.c()).b() == null) ? k.this.q0().e() : aVar instanceof g.a.C1534a ? k.this.q0().d(((g.a.C1534a) aVar).a()) : AbstractC5912b.m();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<com.ui.wifiman.model.wmw.g> {
    }

    public k(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18334g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18335h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, com.ui.wifiman.model.wmw.g.class), null).a(this, f18332k[0]);
        gg.i iVarV = gg.i.v(q0().a(), q0().f(), a.f18338a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        gg.i iVarI2 = AbstractC6561f.e(iVarV).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f18336i = iVarI2;
        this.f18337j = AbstractC8661g.d0(this, iVarI2, new E.a(""), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.wmw.g q0() {
        return (com.ui.wifiman.model.wmw.g) this.f18335h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f18334g;
    }

    @Override // If.F
    public N n0() {
        return this.f18337j;
    }

    @Override // If.F
    public void o0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = Ag.c.f753a.a(q0().a(), q0().f()).o0().t(new b());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }
}
