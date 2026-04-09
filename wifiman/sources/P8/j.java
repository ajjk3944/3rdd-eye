package P8;

import If.I;
import Li.N;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.wmw.g;
import kg.InterfaceC6465b;
import kg.n;
import kg.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import s9.d;
import ye.AbstractC8661g;

/* loaded from: classes3.dex */
public final class j extends I {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18321l = {O.h(new F(j.class, "wizardUpgrade", "getWizardUpgrade()Lcom/ui/wifiman/model/wmw/WifimanWizardFirmwareUpgrade;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f18322m = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f18323g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18324h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f18325i;

    /* renamed from: j, reason: collision with root package name */
    private final N f18326j;

    /* renamed from: k, reason: collision with root package name */
    private final N f18327k;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18328a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(g.c upgradeState) {
            AbstractC6492s.i(upgradeState, "upgradeState");
            d.b bVar = null;
            if (!(upgradeState instanceof g.c.a)) {
                if (upgradeState instanceof g.c.b.a) {
                    bVar = new d.b(R.string.wm_wizard_popup_fw_upgrade_download_message);
                } else if (upgradeState instanceof g.c.b.d) {
                    bVar = new d.b(R.string.wm_wizard_popup_fw_upgrade_upload_message);
                } else if (upgradeState instanceof g.c.b.C1537c) {
                    bVar = new d.b(R.string.wm_wizard_popup_fw_upgrade_upgrade_message);
                } else if (!(upgradeState instanceof g.c.b.AbstractC1535b)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new C6556a(bVar);
        }
    }

    static final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18329a = new b();

        b() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(C6556a it) {
            AbstractC6492s.i(it, "it");
            return !(it.b() == null);
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18330a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float apply(g.c upgradeState) {
            float fA;
            AbstractC6492s.i(upgradeState, "upgradeState");
            if (upgradeState instanceof g.c.a) {
                fA = 0.0f;
            } else {
                if (!(upgradeState instanceof g.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fA = ((g.c.b) upgradeState).a();
            }
            return Float.valueOf(fA);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends o<com.ui.wifiman.model.wmw.g> {
    }

    static final class e implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f18331a = new e();

        e() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g.c apply(C6556a c6556a, g.c state) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(state, "state");
            g.c.b.AbstractC1535b abstractC1535b = (g.c.b.AbstractC1535b) c6556a.a();
            return abstractC1535b != null ? abstractC1535b : state;
        }
    }

    public j(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18323g = di2;
        org.kodein.type.i iVarE = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18324h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, com.ui.wifiman.model.wmw.g.class), null).a(this, f18321l[0]);
        gg.i iVarI2 = gg.i.v(p0().f(), p0().getState(), e.f18331a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f18325i = iVarI2;
        gg.i iVarN0 = iVarI2.N0(c.f18330a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f18326j = AbstractC8661g.d0(this, iVarN0, Float.valueOf(0.0f), false, null, 6, null);
        gg.i iVarM0 = iVarI2.N0(a.f18328a).m0(b.f18329a);
        AbstractC6492s.h(iVarM0, "filter(...)");
        this.f18327k = AbstractC8661g.h0(this, iVarM0, null, null, 2, null);
    }

    private final com.ui.wifiman.model.wmw.g p0() {
        return (com.ui.wifiman.model.wmw.g) this.f18324h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f18323g;
    }

    @Override // If.I
    public N n0() {
        return this.f18327k;
    }

    @Override // If.I
    public N o0() {
        return this.f18326j;
    }
}
