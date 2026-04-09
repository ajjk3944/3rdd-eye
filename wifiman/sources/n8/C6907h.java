package n8;

import Bc.a;
import Yg.z;
import Zc.e;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import n8.AbstractC6877a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s9.d;

/* renamed from: n8.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6907h extends AbstractC6877a {

    /* renamed from: d0, reason: collision with root package name */
    static final /* synthetic */ th.l[] f54420d0 = {O.h(new F(C6907h.class, "cellSignal", "getCellSignal()Lcom/ui/wifiman/model/cellular/CellularSignalService;", 0)), O.h(new F(C6907h.class, "networkConnection", "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0))};

    /* renamed from: e0, reason: collision with root package name */
    public static final int f54421e0 = 8;

    /* renamed from: S, reason: collision with root package name */
    private final Yg.m f54422S;

    /* renamed from: T, reason: collision with root package name */
    private final Yg.m f54423T;

    /* renamed from: U, reason: collision with root package name */
    private final boolean f54424U;

    /* renamed from: V, reason: collision with root package name */
    private final boolean f54425V;

    /* renamed from: W, reason: collision with root package name */
    private final gg.i f54426W;

    /* renamed from: X, reason: collision with root package name */
    private final gg.i f54427X;

    /* renamed from: Y, reason: collision with root package name */
    private final gg.i f54428Y;

    /* renamed from: Z, reason: collision with root package name */
    private final boolean f54429Z;

    /* renamed from: a0, reason: collision with root package name */
    private final gg.i f54430a0;

    /* renamed from: b0, reason: collision with root package name */
    private final gg.i f54431b0;

    /* renamed from: c0, reason: collision with root package name */
    private final boolean f54432c0;

    /* renamed from: n8.h$a */
    private static final class a implements AbstractC6877a.InterfaceC6879c {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ th.l[] f54433c = {O.h(new F(a.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0))};

        /* renamed from: a, reason: collision with root package name */
        private final Yg.m f54434a;

        /* renamed from: b, reason: collision with root package name */
        private final gg.i f54435b;

        /* renamed from: n8.h$a$a, reason: collision with other inner class name */
        static final class C1982a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1982a f54436a = new C1982a();

            C1982a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Cc.j it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: n8.h$a$b */
        public static final class b extends o<Cc.n> {
        }

        public a(DI di2) {
            AbstractC6492s.i(di2, "di");
            org.kodein.type.i iVarE = s.e(new b().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            this.f54434a = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, Cc.n.class), null).a(this, f54433c[0]);
            gg.i iVarI2 = b().b().N0(C1982a.f54436a).o1(1).i2();
            AbstractC6492s.h(iVarI2, "refCount(...)");
            this.f54435b = iVarI2;
        }

        private final Cc.n b() {
            return (Cc.n) this.f54434a.getValue();
        }

        @Override // n8.AbstractC6877a.InterfaceC6879c
        public gg.i a() {
            return this.f54435b;
        }
    }

    /* renamed from: n8.h$b */
    static final class b implements InterfaceC6465b {
        b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(a.b sim0, a.b sim1) {
            AbstractC6492s.i(sim0, "sim0");
            AbstractC6492s.i(sim1, "sim1");
            C6907h c6907h = C6907h.this;
            List listC = AbstractC3689v.c();
            a.b.AbstractC0054a.AbstractC0056b abstractC0056b = sim0 instanceof a.b.AbstractC0054a.AbstractC0056b ? (a.b.AbstractC0054a.AbstractC0056b) sim0 : null;
            V7.a aVarB = abstractC0056b != null ? abstractC0056b.b() : null;
            a.b.AbstractC0054a.AbstractC0056b abstractC0056b2 = sim1 instanceof a.b.AbstractC0054a.AbstractC0056b ? (a.b.AbstractC0054a.AbstractC0056b) sim1 : null;
            V7.a aVarB2 = abstractC0056b2 != null ? abstractC0056b2.b() : null;
            if (aVarB == null || aVarB2 == null) {
                if (aVarB == null) {
                    aVarB = aVarB2;
                }
                if (aVarB != null) {
                    listC.add(AbstractC6877a.I(c6907h, "0", new d.b(R.string.signal_strength), null, Ne.f.h(aVarB, true, null, 2, null), false, 20, null));
                }
            } else {
                listC.add(AbstractC6877a.I(c6907h, "0", new d.b(R.string.sim_card_num_format, AbstractC3689v.e(1)), null, Ne.f.h(aVarB, true, null, 2, null), false, 20, null));
                listC.add(AbstractC6877a.I(c6907h, "1", new d.b(R.string.sim_card_num_format, AbstractC3689v.e(2)), null, Ne.f.h(aVarB2, true, null, 2, null), false, 20, null));
            }
            return AbstractC3689v.a(listC);
        }
    }

    /* renamed from: n8.h$c */
    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f54438a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s apply(Zc.e it) {
            inet.ipaddr.g gVarA;
            AbstractC6492s.i(it, "it");
            List listA = it.a();
            e.a aVarB = it.b();
            if (aVarB == null || (gVarA = aVarB.a()) == null) {
                e.a aVarC = it.c();
                gVarA = aVarC != null ? aVarC.a() : null;
            }
            return z.a(listA, gVarA);
        }
    }

    /* renamed from: n8.h$d */
    static final class d implements InterfaceC6465b {
        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List cardItems, Yg.s sVar) {
            String strB;
            AbstractC6492s.i(cardItems, "cardItems");
            AbstractC6492s.i(sVar, "<destruct>");
            List list = (List) sVar.a();
            inet.ipaddr.g gVar = (inet.ipaddr.g) sVar.c();
            C6907h c6907h = C6907h.this;
            List listC = AbstractC3689v.c();
            listC.addAll(cardItems);
            listC.add(AbstractC6877a.I(c6907h, "gateway", new d.b(R.string.network_gateway), null, (gVar == null || (strB = L8.f.b(gVar, false)) == null) ? new d.b(R.string.value_not_available) : new d.c(strB), false, 20, null));
            d.b bVar = new d.b(R.string.dns_server);
            List listX0 = AbstractC3689v.X0(list, c6907h.A());
            ArrayList arrayList = new ArrayList();
            Iterator it = listX0.iterator();
            while (it.hasNext()) {
                String strB2 = L8.f.b((inet.ipaddr.g) it.next(), false);
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            ArrayList arrayList2 = arrayList;
            listC.add(AbstractC6877a.I(c6907h, "dns", bVar, null, arrayList2 != null ? new d.c(AbstractC3689v.z0(arrayList2, "\n", null, null, 0, null, null, 62, null)) : new d.b(R.string.value_not_available), false, 20, null));
            return AbstractC3689v.a(listC);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.h$e */
    public static final class e extends o<Bc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.h$f */
    public static final class f extends o<Zc.f> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6907h(DI di2) {
        super(di2, new a(di2));
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, Bc.a.class), null);
        th.l[] lVarArr = f54420d0;
        this.f54422S = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54423T = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, Zc.f.class), null).a(this, lVarArr[1]);
        gg.i iVarK0 = gg.i.K0(new C6556a(new d.b(R.string.device_tag_myself_long)));
        AbstractC6492s.h(iVarK0, "just(...)");
        this.f54426W = iVarK0;
        gg.i iVarK02 = gg.i.K0(AbstractC3689v.l());
        AbstractC6492s.h(iVarK02, "just(...)");
        this.f54427X = iVarK02;
        gg.i iVarW = gg.i.v(J().e(), J().d(), new b()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f54428Y = iVarW;
        gg.i iVarW2 = gg.i.v(super.x(), K().getState().N0(c.f54438a).W(), new d()).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f54430a0 = iVarW2;
        gg.i iVarK03 = gg.i.K0(Boolean.FALSE);
        AbstractC6492s.h(iVarK03, "just(...)");
        this.f54431b0 = iVarK03;
    }

    private final Bc.a J() {
        return (Bc.a) this.f54422S.getValue();
    }

    private final Zc.f K() {
        return (Zc.f) this.f54423T.getValue();
    }

    @Override // n8.AbstractC6877a
    protected boolean B() {
        return this.f54429Z;
    }

    @Override // n8.AbstractC6877a
    public boolean F() {
        return this.f54432c0;
    }

    @Override // n8.AbstractC6877a, n8.InterfaceC6904e
    public gg.i c() {
        return this.f54426W;
    }

    @Override // n8.AbstractC6877a, n8.InterfaceC6904e
    public gg.i f() {
        return this.f54431b0;
    }

    @Override // n8.AbstractC6877a
    protected boolean s() {
        return this.f54425V;
    }

    @Override // n8.AbstractC6877a
    public gg.i v() {
        return this.f54427X;
    }

    @Override // n8.AbstractC6877a
    public gg.i w() {
        return this.f54428Y;
    }

    @Override // n8.AbstractC6877a
    protected gg.i x() {
        return this.f54430a0;
    }

    @Override // n8.AbstractC6877a
    protected boolean y() {
        return this.f54424U;
    }
}
