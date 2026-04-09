package P8;

import If.AbstractC3022b;
import If.EnumC3021a;
import Li.N;
import P8.f;
import com.ui.wifiman.model.wmw.WifimanWizard;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class m extends AbstractC3022b {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18356l = {O.h(new F(m.class, "wizard", "getWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;", 0)), O.h(new F(m.class, "wizardPopupController", "getWizardPopupController()Lcom/ubnt/usurvey/ui/wmw/popup/WmwPopupController;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f18357m = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f18358g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18359h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f18360i;

    /* renamed from: j, reason: collision with root package name */
    private final N f18361j;

    /* renamed from: k, reason: collision with root package name */
    private final N f18362k;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18363a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC3021a apply(f.b popupState) {
            AbstractC6492s.i(popupState, "popupState");
            if (popupState instanceof f.b.C0647b) {
                return ((f.b.C0647b) popupState).a();
            }
            if (popupState instanceof f.b.a) {
                return EnumC3021a.LOADING;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends o<WifimanWizard> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<f> {
    }

    public m(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18358g = di2;
        org.kodein.type.i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, WifimanWizard.class), null);
        th.l[] lVarArr = f18356l;
        this.f18359h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18360i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, f.class), null).a(this, lVarArr[1]);
        gg.i iVarW = s0().getState().N0(a.f18363a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f18361j = AbstractC8661g.d0(this, iVarW, EnumC3021a.LOADING, false, null, 6, null);
        this.f18362k = AbstractC8661g.d0(this, s0().e(), Boolean.TRUE, false, null, 6, null);
    }

    private final WifimanWizard r0() {
        return (WifimanWizard) this.f18359h.getValue();
    }

    private final f s0() {
        return (f) this.f18360i.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f18358g;
    }

    @Override // If.AbstractC3022b
    public N n0() {
        return this.f18361j;
    }

    @Override // If.AbstractC3022b
    public void o0() {
        C8658d.f66727a.d(s0().a(), this);
    }

    @Override // If.AbstractC3022b
    public void p0() {
        C8658d.f66727a.d(s0().close(), this);
    }

    @Override // If.AbstractC3022b
    public void q0() {
        C8658d.f66727a.d(r0().b(null), this);
    }
}
