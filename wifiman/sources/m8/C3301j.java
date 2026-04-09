package M8;

import Ef.c;
import Li.N;
import Zg.AbstractC3689v;
import de.C5351B;
import de.InterfaceC5352C;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import ic.EnumC6140a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: M8.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3301j extends Ef.d {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ th.l[] f13007l = {O.h(new kotlin.jvm.internal.F(C3301j.class, "screenConfig", "getScreenConfig()Lcom/ui/wifiman/model/ui/WifiNetworkDetailHomeConfigManager;", 0)), O.h(new kotlin.jvm.internal.F(C3301j.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f13008m = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f13009g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f13010h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f13011i;

    /* renamed from: j, reason: collision with root package name */
    private final List f13012j;

    /* renamed from: k, reason: collision with root package name */
    private final N f13013k;

    /* renamed from: M8.j$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13014a;

        static {
            int[] iArr = new int[EnumC6140a.values().length];
            try {
                iArr[EnumC6140a.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6140a.SIGNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13014a = iArr;
        }
    }

    /* renamed from: M8.j$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13015a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC6140a apply(C5351B it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }
    }

    /* renamed from: M8.j$c */
    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ci.c apply(EnumC6140a selected) {
            AbstractC6492s.i(selected, "selected");
            return C3301j.this.s0(selected);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.j$d */
    public static final class d extends org.kodein.type.o<InterfaceC5352C> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.j$e */
    public static final class e extends org.kodein.type.o<InterfaceC6084a> {
    }

    public C3301j(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f13009g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC5352C.class), null);
        th.l[] lVarArr = f13007l;
        this.f13010h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f13011i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        List listO = AbstractC3689v.o(EnumC6140a.NAME, EnumC6140a.SIGNAL);
        this.f13012j = listO;
        gg.i iVarN0 = r0().b().N0(b.f13015a).W().N0(new c());
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f13013k = AbstractC8661g.d0(this, iVarN0, s0((EnumC6140a) AbstractC3689v.q0(listO)), false, null, 6, null);
    }

    private final InterfaceC5352C r0() {
        return (InterfaceC5352C) this.f13010h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ci.c s0(EnumC6140a enumC6140a) {
        Ef.c aVar;
        List list = this.f13012j;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i10 = a.f13014a[((EnumC6140a) it.next()).ordinal()];
            if (i10 == 1) {
                aVar = new c.a(enumC6140a == EnumC6140a.NAME);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new c.b(enumC6140a == EnumC6140a.SIGNAL);
            }
            arrayList.add(aVar);
        }
        return Ci.a.h(arrayList);
    }

    private final InterfaceC6084a t0() {
        return (InterfaceC6084a) this.f13011i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5351B u0(Ef.c cVar, C5351B it) {
        EnumC6140a enumC6140a;
        AbstractC6492s.i(it, "it");
        if (cVar instanceof c.a) {
            enumC6140a = EnumC6140a.NAME;
        } else {
            if (!(cVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            enumC6140a = EnumC6140a.SIGNAL;
        }
        return it.a(enumC6140a);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f13009g;
    }

    @Override // Ef.d
    public N n0() {
        return this.f13013k;
    }

    @Override // Ef.d
    public void o0(final Ef.c type) {
        AbstractC6492s.i(type, "type");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bG = r0().a(new InterfaceC6835l() { // from class: M8.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C3301j.u0(type, (C5351B) obj);
            }
        }).g(t0().a(InterfaceC6084a.b.n.f48939a));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        c8658d.d(abstractC5912bG, this);
    }
}
