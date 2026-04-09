package P8;

import If.AbstractC3035o;
import If.C3034n;
import Li.N;
import P8.f;
import Pf.a;
import com.ubnt.usurvey.R;
import com.ui.common.semver.SemVer;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wifiman.model.wmw.g;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class d extends AbstractC3035o {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18234p = {O.h(new F(d.class, "wizard", "getWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;", 0)), O.h(new F(d.class, "wizardPopupController", "getWizardPopupController()Lcom/ubnt/usurvey/ui/wmw/popup/WmwPopupController;", 0)), O.h(new F(d.class, "wizardFwUpgrade", "getWizardFwUpgrade()Lcom/ui/wifiman/model/wmw/WifimanWizardFirmwareUpgrade;", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final int f18235q = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f18236g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18237h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f18238i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f18239j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f18240k;

    /* renamed from: l, reason: collision with root package name */
    private final N f18241l;

    /* renamed from: m, reason: collision with root package name */
    private final N f18242m;

    /* renamed from: n, reason: collision with root package name */
    private final N f18243n;

    /* renamed from: o, reason: collision with root package name */
    private final N f18244o;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18245a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            C3034n c3034n;
            a.C0659a c0659aA;
            Float fA;
            AbstractC6492s.i(c6556a, "<destruct>");
            Pf.a aVar = (Pf.a) c6556a.a();
            if (aVar == null || (c0659aA = aVar.a()) == null || (fA = c0659aA.a()) == null) {
                c3034n = null;
            } else {
                float fFloatValue = fA.floatValue();
                Boolean boolB = aVar.a().b();
                c3034n = new C3034n(fFloatValue, boolB != null ? boolB.booleanValue() : false);
            }
            return new C6556a(c3034n);
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18246a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(g.a availability) {
            boolean z10;
            AbstractC6492s.i(availability, "availability");
            if ((availability instanceof g.a.c) || (availability instanceof g.a.b)) {
                z10 = false;
            } else {
                if (!(availability instanceof g.a.C1534a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18247a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            SemVer semVerB;
            String string;
            AbstractC6492s.i(c6556a, "<destruct>");
            Pf.a aVar = (Pf.a) c6556a.a();
            return new C6556a((aVar == null || (semVerB = aVar.b()) == null || (string = semVerB.toString()) == null) ? null : new d.c(string));
        }
    }

    /* renamed from: P8.d$d, reason: collision with other inner class name */
    static final class C0644d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0644d f18248a = new C0644d();

        C0644d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9.d apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Pf.a aVar = (Pf.a) c6556a.a();
            return aVar != null ? Q8.a.f19239a.a(aVar.c()) : new d.b(R.string.wifiman_wizard);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends o<WifimanWizard> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends o<P8.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends o<com.ui.wifiman.model.wmw.g> {
    }

    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f18249a = new h();

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f18250a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Pf.a it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(WifimanWizard.a state) {
            AbstractC6492s.i(state, "state");
            if ((state instanceof WifimanWizard.a.c) || (state instanceof WifimanWizard.a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.c) || (state instanceof WifimanWizard.a.AbstractC1520a.d)) {
                gg.i iVarK0 = gg.i.K0(new C6556a(null));
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (!(state instanceof WifimanWizard.a.AbstractC1520a.C1521a)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarN0 = ((WifimanWizard.a.AbstractC1520a.C1521a) state).b().a().N0(a.f18250a);
            AbstractC6492s.h(iVarN0, "map(...)");
            return iVarN0;
        }
    }

    public d(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18236g = di2;
        org.kodein.type.i iVarE = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, WifimanWizard.class), null);
        th.l[] lVarArr = f18234p;
        this.f18237h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18238i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, P8.f.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18239j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, com.ui.wifiman.model.wmw.g.class), null).a(this, lVarArr[2]);
        gg.i iVarI2 = t0().getState().I1(h.f18249a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f18240k = iVarI2;
        gg.i iVarW = iVarI2.N0(C0644d.f18248a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f18241l = AbstractC8661g.d0(this, iVarW, new d.b(R.string.wifiman_wizard), false, null, 6, null);
        gg.i iVarW2 = iVarI2.N0(a.f18245a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f18242m = AbstractC8661g.h0(this, iVarW2, null, null, 2, null);
        gg.i iVarW3 = iVarI2.N0(c.f18247a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f18243n = AbstractC8661g.h0(this, iVarW3, null, null, 2, null);
        gg.i iVarW4 = u0().a().N0(b.f18246a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f18244o = AbstractC8661g.d0(this, iVarW4, Boolean.FALSE, false, null, 6, null);
    }

    private final WifimanWizard t0() {
        return (WifimanWizard) this.f18237h.getValue();
    }

    private final com.ui.wifiman.model.wmw.g u0() {
        return (com.ui.wifiman.model.wmw.g) this.f18239j.getValue();
    }

    private final P8.f v0() {
        return (P8.f) this.f18238i.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f18236g;
    }

    @Override // If.AbstractC3035o
    public N n0() {
        return this.f18242m;
    }

    @Override // If.AbstractC3035o
    public N o0() {
        return this.f18244o;
    }

    @Override // If.AbstractC3035o
    public N p0() {
        return this.f18243n;
    }

    @Override // If.AbstractC3035o
    public N q0() {
        return this.f18241l;
    }

    @Override // If.AbstractC3035o
    public void r0() {
        C8658d.f66727a.d(v0().b(f.a.COMPLIANCE), this);
    }

    @Override // If.AbstractC3035o
    public void s0() {
        C8658d.f66727a.d(v0().b(f.a.FW_UPDATE), this);
    }
}
