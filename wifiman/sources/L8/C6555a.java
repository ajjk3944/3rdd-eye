package l8;

import Bc.a;
import Li.N;
import Yg.m;
import Zc.f;
import b8.EnumC4076c;
import com.ui.wifiman.ui.component.network.C5205c;
import i8.InterfaceC6084a;
import je.AbstractC6317r;
import je.u;
import ke.AbstractC6458c;
import kg.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import org.kodein.type.i;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import th.l;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: l8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6555a extends C5205c.b {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ l[] f52447m = {O.h(new F(C6555a.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(C6555a.class, "networkConnectionManager", "getNetworkConnectionManager()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), O.h(new F(C6555a.class, "wifiConnectionService", "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;", 0)), O.h(new F(C6555a.class, "cellSignalManager", "getCellSignalManager()Lcom/ui/wifiman/model/cellular/CellularSignalService;", 0))};

    /* renamed from: n, reason: collision with root package name */
    public static final int f52448n = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f52449g;

    /* renamed from: h, reason: collision with root package name */
    private final m f52450h;

    /* renamed from: i, reason: collision with root package name */
    private final m f52451i;

    /* renamed from: j, reason: collision with root package name */
    private final m f52452j;

    /* renamed from: k, reason: collision with root package name */
    private final m f52453k;

    /* renamed from: l, reason: collision with root package name */
    private final N f52454l;

    /* renamed from: l8.a$a, reason: collision with other inner class name */
    static final class C1936a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final C1936a f52455a = new C1936a();

        /* renamed from: l8.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1937a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52456a;

            static {
                int[] iArr = new int[EnumC4076c.values().length];
                try {
                    iArr[EnumC4076c.DISCONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC4076c.MOBILE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC4076c.WIFI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC4076c.ETHERNET.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC4076c.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f52456a = iArr;
            }
        }

        C1936a() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(Zc.e networkState, AbstractC6317r wifiState, a.b simPrimary, a.b simSecondary) {
            Object obj;
            Object c1554a;
            AbstractC6492s.i(networkState, "networkState");
            AbstractC6492s.i(wifiState, "wifiState");
            AbstractC6492s.i(simPrimary, "simPrimary");
            AbstractC6492s.i(simSecondary, "simSecondary");
            int i10 = C1937a.f52456a[networkState.g().ordinal()];
            if (i10 != 1) {
                V7.a aVarB = null;
                obj = null;
                obj = null;
                obj = null;
                if (i10 == 2) {
                    if (simPrimary instanceof a.b.AbstractC0054a.AbstractC0056b) {
                        aVarB = ((a.b.AbstractC0054a.AbstractC0056b) simPrimary).b();
                    } else if (simSecondary instanceof a.b.AbstractC0054a.AbstractC0056b) {
                        aVarB = ((a.b.AbstractC0054a.AbstractC0056b) simSecondary).b();
                    }
                    c1554a = new C5205c.a.C1554a(aVarB);
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        obj = C5205c.a.b.f44472a;
                    } else if (i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!(wifiState instanceof AbstractC6317r.a) && !(wifiState instanceof AbstractC6317r.b.C1875b)) {
                    if (!(wifiState instanceof AbstractC6317r.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC6317r.b.a aVar = (AbstractC6317r.b.a) wifiState;
                    AbstractC6458c abstractC6458cI = aVar.i();
                    c1554a = new C5205c.a.d(abstractC6458cI != null ? abstractC6458cI.b() : null, aVar.h());
                }
                obj = c1554a;
            } else {
                obj = C5205c.a.C1555c.f44475a;
            }
            return new C6556a(obj);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l8.a$b */
    public static final class b extends o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l8.a$c */
    public static final class c extends o<f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l8.a$d */
    public static final class d extends o<u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l8.a$e */
    public static final class e extends o<Bc.a> {
    }

    public C6555a(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f52449g = di2;
        i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        l[] lVarArr = f52447m;
        this.f52450h = interfaceC7810x2A.a(this, lVarArr[0]);
        i iVarE2 = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f52451i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, f.class), null).a(this, lVarArr[1]);
        i iVarE3 = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f52452j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, u.class), null).a(this, lVarArr[2]);
        i iVarE4 = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f52453k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, Bc.a.class), null).a(this, lVarArr[3]);
        gg.i iVarW = gg.i.t(q0().getState(), s0().a(), p0().e(), p0().d(), C1936a.f52455a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f52454l = AbstractC8661g.h0(this, iVarW, null, null, 2, null);
    }

    private final Bc.a p0() {
        return (Bc.a) this.f52453k.getValue();
    }

    private final f q0() {
        return (f) this.f52451i.getValue();
    }

    private final InterfaceC6084a r0() {
        return (InterfaceC6084a) this.f52450h.getValue();
    }

    private final u s0() {
        return (u) this.f52452j.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f52449g;
    }

    @Override // com.ui.wifiman.ui.component.network.C5205c.b
    public N n0() {
        return this.f52454l;
    }

    @Override // com.ui.wifiman.ui.component.network.C5205c.b
    public void o0() {
        C8658d.f66727a.d(r0().a(InterfaceC6084a.b.D.g.f48903a), this);
    }
}
