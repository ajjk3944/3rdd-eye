package w8;

import Li.N;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import md.C6796a;
import md.InterfaceC6797b;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: w8.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8280C extends com.ui.wifiman.ui.settings.preferences.u {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ th.l[] f64495k = {O.h(new F(C8280C.class, "settingsManager", "getSettingsManager()Lcom/ui/wifiman/model/settings/AppSettingsManager;", 0)), O.h(new F(C8280C.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: l, reason: collision with root package name */
    public static final int f64496l = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f64497g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f64498h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f64499i;

    /* renamed from: j, reason: collision with root package name */
    private final N f64500j;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.C$a */
    public static final class a extends org.kodein.type.o<InterfaceC6797b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.C$b */
    public static final class b extends org.kodein.type.o<InterfaceC6084a> {
    }

    /* renamed from: w8.C$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f64501a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T7.c apply(C6796a settings) {
            AbstractC6492s.i(settings, "settings");
            return settings.g();
        }
    }

    public C8280C(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f64497g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6797b.class), null);
        th.l[] lVarArr = f64495k;
        this.f64498h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64499i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        gg.i iVarW = q0().b().N0(c.f64501a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f64500j = AbstractC8661g.d0(this, iVarW, T7.c.METRIC, false, null, 6, null);
    }

    private final InterfaceC6797b q0() {
        return (InterfaceC6797b) this.f64498h.getValue();
    }

    private final InterfaceC6084a r0() {
        return (InterfaceC6084a) this.f64499i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6796a s0(T7.c cVar, C6796a it) {
        AbstractC6492s.i(it, "it");
        return C6796a.b(it, null, cVar, false, false, false, false, false, 125, null);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f64497g;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.u
    public N n0() {
        return this.f64500j;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.u
    public void o0(final T7.c system) {
        AbstractC6492s.i(system, "system");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bG = q0().a(new InterfaceC6835l() { // from class: w8.B
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C8280C.s0(system, (C6796a) obj);
            }
        }).g(r0().a(InterfaceC6084a.b.n.f48939a));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        c8658d.d(abstractC5912bG, this);
    }
}
