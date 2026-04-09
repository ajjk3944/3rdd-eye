package p8;

import Li.N;
import Yg.m;
import Zg.AbstractC3689v;
import com.ui.wifiman.ui.discovery.prefs.lan.c;
import de.v;
import de.w;
import fc.EnumC5805b;
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

/* renamed from: p8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7243f extends com.ui.wifiman.ui.discovery.prefs.lan.d {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ th.l[] f57710k = {O.h(new F(C7243f.class, "configManager", "getConfigManager()Lcom/ui/wifiman/model/ui/DiscoveryLanListConfigManager;", 0))};

    /* renamed from: l, reason: collision with root package name */
    public static final int f57711l = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f57712g;

    /* renamed from: h, reason: collision with root package name */
    private final m f57713h;

    /* renamed from: i, reason: collision with root package name */
    private final N f57714i;

    /* renamed from: j, reason: collision with root package name */
    private final N f57715j;

    /* renamed from: p8.f$a */
    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f57716a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ci.c apply(v it) {
            AbstractC6492s.i(it, "it");
            return Ci.a.h(AbstractC3689v.o(new c.a(it.c() == EnumC5805b.IP), new c.b(it.c() == EnumC5805b.NAME)));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.f$b */
    public static final class b extends o<w> {
    }

    /* renamed from: p8.f$c */
    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f57717a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(v it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    public C7243f(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f57712g = di2;
        org.kodein.type.i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57713h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, w.class), null).a(this, f57710k[0]);
        gg.i iVarW = t0().b().N0(c.f57717a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f57714i = AbstractC8661g.d0(this, iVarW, Boolean.FALSE, false, null, 6, null);
        gg.i iVarW2 = t0().b().N0(a.f57716a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f57715j = AbstractC8661g.d0(this, iVarW2, Ci.a.h(AbstractC3689v.o(new c.a(false), new c.b(false))), false, null, 6, null);
    }

    private final w t0() {
        return (w) this.f57713h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v u0(com.ui.wifiman.ui.discovery.prefs.lan.c cVar, v it) {
        EnumC5805b enumC5805b;
        AbstractC6492s.i(it, "it");
        if (cVar instanceof c.a) {
            enumC5805b = EnumC5805b.IP;
        } else {
            if (!(cVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            enumC5805b = EnumC5805b.NAME;
        }
        return v.b(it, enumC5805b, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v v0(boolean z10, v it) {
        AbstractC6492s.i(it, "it");
        return v.b(it, null, z10, 1, null);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f57712g;
    }

    @Override // com.ui.wifiman.ui.discovery.prefs.lan.d
    public N n0() {
        return this.f57715j;
    }

    @Override // com.ui.wifiman.ui.discovery.prefs.lan.d
    public N o0() {
        return this.f57714i;
    }

    @Override // com.ui.wifiman.ui.discovery.prefs.lan.d
    public void p0(final com.ui.wifiman.ui.discovery.prefs.lan.c type) {
        AbstractC6492s.i(type, "type");
        C8658d.f66727a.d(t0().a(new InterfaceC6835l() { // from class: p8.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C7243f.u0(type, (v) obj);
            }
        }), this);
    }

    @Override // com.ui.wifiman.ui.discovery.prefs.lan.d
    public void q0(final boolean z10) {
        C8658d.f66727a.d(t0().a(new InterfaceC6835l() { // from class: p8.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C7243f.v0(z10, (v) obj);
            }
        }), this);
    }
}
