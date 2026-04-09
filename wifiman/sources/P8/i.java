package P8;

import If.B;
import Li.N;
import Li.P;
import Li.y;
import Li.z;
import com.ubnt.usurvey.R;
import i8.InterfaceC6084a;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s9.d;
import sh.C7974i;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class i extends B {

    /* renamed from: g, reason: collision with root package name */
    private final DI f18313g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18314h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f18315i;

    /* renamed from: j, reason: collision with root package name */
    private final N f18316j;

    /* renamed from: k, reason: collision with root package name */
    private final z f18317k;

    /* renamed from: l, reason: collision with root package name */
    private final y f18318l;

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18311n = {O.h(new F(i.class, "discovery", "getDiscovery()Lcom/ui/wifiman/model/wmw/WifimanWizardDiscovery;", 0)), O.h(new F(i.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.g(new D(i.class, "discoveredDeviceStream", "<v#0>", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final a f18310m = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f18312o = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18319a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Ag.b.c(new C7974i(1, it.size()));
        }
    }

    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Integer it) {
            AbstractC6492s.i(it, "it");
            i.this.b().j(B.a.C0377a.f9121a);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends o<com.ui.wifiman.model.wmw.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends o<InterfaceC6084a> {
    }

    public i(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18313g = di2;
        org.kodein.type.i iVarE = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, com.ui.wifiman.model.wmw.d.class), null);
        th.l[] lVarArr = f18311n;
        this.f18314h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18315i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        v0();
        this.f18316j = P.a(new d.b(R.string.wm_wizard_popup_discovery_nothing_found));
        this.f18317k = P.a(new d.b(R.string.wm_wizard_popup_discovery_wizard_more_info));
        this.f18318l = Li.F.b(0, 1, Ki.a.DROP_OLDEST, 1, null);
    }

    private final com.ui.wifiman.model.wmw.d r0() {
        return (com.ui.wifiman.model.wmw.d) this.f18314h.getValue();
    }

    private final InterfaceC6084a t0() {
        return (InterfaceC6084a) this.f18315i.getValue();
    }

    private final void v0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(x0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: P8.h
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return i.w0(this.f18309a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i w0(i iVar) {
        gg.i iVarF0 = iVar.r0().a().p0(b.f18319a).U().Y1(1000L, TimeUnit.MILLISECONDS).f0(iVar.new c());
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        return iVarF0;
    }

    private static final gg.i x0(C8658d.a aVar) {
        return aVar.c(null, f18311n[2]);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f18313g;
    }

    @Override // If.B
    public N n0() {
        return this.f18316j;
    }

    @Override // If.B
    public void p0() {
        C8658d.f66727a.d(t0().a(new InterfaceC6084a.b.o("https://eu.store.ui.com/collections/unifi-accessories/products/wifiman-wizard-ea")), this);
    }

    @Override // If.B
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public y b() {
        return this.f18318l;
    }

    @Override // If.B
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public z o0() {
        return this.f18317k;
    }
}
