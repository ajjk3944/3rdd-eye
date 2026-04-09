package p8;

import Li.N;
import Yg.m;
import Zg.AbstractC3689v;
import com.ui.wifiman.ui.discovery.prefs.bluetooth.c;
import de.p;
import de.q;
import fc.EnumC5804a;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: p8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7240c extends com.ui.wifiman.ui.discovery.prefs.bluetooth.d {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ th.l[] f57700k = {O.h(new F(C7240c.class, "configManager", "getConfigManager()Lcom/ui/wifiman/model/ui/DiscoveryBluetoothListConfigManager;", 0))};

    /* renamed from: l, reason: collision with root package name */
    public static final int f57701l = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f57702g;

    /* renamed from: h, reason: collision with root package name */
    private final m f57703h;

    /* renamed from: i, reason: collision with root package name */
    private final N f57704i;

    /* renamed from: j, reason: collision with root package name */
    private final N f57705j;

    /* renamed from: p8.c$a */
    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f57706a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ci.c apply(p it) {
            AbstractC6492s.i(it, "it");
            return Ci.a.h(AbstractC3689v.o(new c.b(it.d() == EnumC5804a.NAME), new c.C1561c(it.d() == EnumC5804a.SIGNAL), new c.a(it.d() == EnumC5804a.MAC)));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.c$b */
    public static final class b extends o<q> {
    }

    /* renamed from: p8.c$c, reason: collision with other inner class name */
    static final class C2031c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2031c f57707a = new C2031c();

        C2031c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(p it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.e());
        }
    }

    public C7240c(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f57702g = di2;
        org.kodein.type.i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57703h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, q.class), null).a(this, f57700k[0]);
        gg.i iVarW = t0().b().N0(C2031c.f57707a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f57704i = AbstractC8661g.d0(this, iVarW, Boolean.FALSE, false, null, 6, null);
        gg.i iVarW2 = t0().b().N0(a.f57706a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f57705j = AbstractC8661g.d0(this, iVarW2, Ci.a.h(AbstractC3689v.o(new c.b(false), new c.C1561c(false), new c.a(false))), false, null, 6, null);
    }

    private final q t0() {
        return (q) this.f57703h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p u0(com.ui.wifiman.ui.discovery.prefs.bluetooth.c cVar, p it) {
        EnumC5804a enumC5804a;
        AbstractC6492s.i(it, "it");
        if (cVar instanceof c.b) {
            enumC5804a = EnumC5804a.NAME;
        } else if (cVar instanceof c.C1561c) {
            enumC5804a = EnumC5804a.SIGNAL;
        } else {
            if (!(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            enumC5804a = EnumC5804a.MAC;
        }
        return p.b(it, enumC5804a, false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p v0(boolean z10, p it) {
        AbstractC6492s.i(it, "it");
        return p.b(it, null, z10, false, 5, null);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f57702g;
    }

    @Override // com.ui.wifiman.ui.discovery.prefs.bluetooth.d
    public N n0() {
        return this.f57705j;
    }

    @Override // com.ui.wifiman.ui.discovery.prefs.bluetooth.d
    public N o0() {
        return this.f57704i;
    }

    @Override // com.ui.wifiman.ui.discovery.prefs.bluetooth.d
    public void p0(final com.ui.wifiman.ui.discovery.prefs.bluetooth.c type) {
        AbstractC6492s.i(type, "type");
        C8658d.f66727a.d(t0().a(new InterfaceC6835l() { // from class: p8.a
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C7240c.u0(type, (p) obj);
            }
        }), this);
    }

    @Override // com.ui.wifiman.ui.discovery.prefs.bluetooth.d
    public void q0(final boolean z10) {
        C8658d.f66727a.d(t0().a(new InterfaceC6835l() { // from class: p8.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C7240c.v0(z10, (p) obj);
            }
        }), this);
    }
}
