package N8;

import Li.N;
import N8.a;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import u8.InterfaceC8140a;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class p extends Hf.c {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ th.l[] f15484l = {O.h(new F(p.class, "wizardManager", "getWizardManager()Lcom/ubnt/usurvey/ui/wizard/AppWizardManager;", 0)), O.h(new F(p.class, "popupController", "getPopupController()Lcom/ubnt/usurvey/ui/popup/ApplicationPopupController;", 0)), O.h(new F(p.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.g(new D(p.class, "wizardFinished", "<v#0>", 0)), O.g(new D(p.class, "hidePopupsStream", "<v#1>", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f15485m = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f15486g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f15487h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f15488i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f15489j;

    /* renamed from: k, reason: collision with root package name */
    private final N f15490k;

    static final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(a.AbstractC0585a.C0586a it) {
            AbstractC6492s.i(it, "it");
            return p.this.s0().a(new InterfaceC6084a.b.C6085c(null, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends org.kodein.type.o<N8.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<InterfaceC8140a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<InterfaceC6084a> {
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f15492a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a.AbstractC0585a.b it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.a());
        }
    }

    public p(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f15486g = di2;
        org.kodein.type.i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, N8.a.class), null);
        th.l[] lVarArr = f15484l;
        this.f15487h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f15488i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC8140a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f15489j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6084a.class), null).a(this, lVarArr[2]);
        gg.i iVarZ0 = t0().getState().Z0(a.AbstractC0585a.b.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        gg.i iVarN0 = iVarZ0.N0(e.f15492a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f15490k = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
    }

    private final InterfaceC8140a r0() {
        return (InterfaceC8140a) this.f15488i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a s0() {
        return (InterfaceC6084a) this.f15489j.getValue();
    }

    private final N8.a t0() {
        return (N8.a) this.f15487h.getValue();
    }

    private final void u0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT0 = w0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: N8.o
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return p.v0(this.f15483a);
            }
        }, 1, null)).t0(new a());
        AbstractC6492s.h(abstractC5912bT0, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i v0(p pVar) {
        gg.i iVarZ0 = pVar.t0().getState().Z0(a.AbstractC0585a.C0586a.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        return iVarZ0;
    }

    private static final gg.i w0(C8658d.a aVar) {
        return aVar.c(null, f15484l[3]);
    }

    private final void x0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bE0 = z0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: N8.n
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return p.y0(this.f15482a);
            }
        }, 1, null)).E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        c8658d.d(abstractC5912bE0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i y0(p pVar) {
        gg.i iVarC0 = pVar.r0().b().c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i z0(C8658d.a aVar) {
        return aVar.c(null, f15484l[4]);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f15486g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        u0();
        x0();
    }

    @Override // Hf.c
    public N n0() {
        return this.f15490k;
    }
}
