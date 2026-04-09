package D8;

import Bc.a;
import D8.j;
import V7.b;
import Zg.AbstractC3689v;
import af.C3806O;
import af.C3807P;
import com.ubnt.usurvey.R;
import ef.AbstractC5460b;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import java.util.List;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;

/* loaded from: classes3.dex */
public final class k implements j.a {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ th.l[] f3016d = {O.h(new F(k.class, "service", "getService()Lcom/ui/wifiman/model/cellular/CellularSignalService;", 0)), O.h(new F(k.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: e, reason: collision with root package name */
    public static final int f3017e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Yg.m f3018a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f3019b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f3020c;

    static final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a.b it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(k.this.i(it, 1));
        }
    }

    static final class b implements kg.n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a.b it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(k.this.i(it, 2));
        }
    }

    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3023a = new c();

        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a, C6556a c6556a2) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            C3806O c3806o = (C3806O) c6556a.a();
            C3806O c3806o2 = (C3806O) c6556a2.a();
            return (c3806o == null && c3806o2 == null) ? new C6556a(null) : new C6556a(new C3807P(new d.b(R.string.speed_factors_cellular_title), null, null, Ci.a.a(), c3806o, c3806o2, null, 66, null));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<Bc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<InterfaceC6084a> {
    }

    public k(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, Bc.a.class), null);
        th.l[] lVarArr = f3016d;
        this.f3018a = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3019b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        gg.i iVarI2 = gg.i.v(h().e().N0(new a()).W(), h().d().N0(new b()).W(), c.f3023a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f3020c = iVarI2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final af.C3806O.a g(java.util.List r5) {
        /*
            r4 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        L8:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()
            af.O$b r2 = (af.C3806O.b) r2
            W7.e r3 = r2.a()
            if (r3 == 0) goto L2b
            W7.e r2 = r2.a()
            kotlin.jvm.internal.AbstractC6492s.f(r2)
            W7.e r3 = W7.e.EXCELLENT
            int r2 = r2.compareTo(r3)
            if (r2 >= 0) goto L2b
            r2 = 1
            goto L2c
        L2b:
            r2 = r0
        L2c:
            int r1 = r1 + r2
            goto L8
        L2e:
            if (r1 <= 0) goto L36
            af.O$a$b r5 = new af.O$a$b
            r5.<init>(r1)
            return r5
        L36:
            af.O$a$a r5 = af.C3806O.a.C1006a.f26020a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.k.g(java.util.List):af.O$a");
    }

    private final Bc.a h() {
        return (Bc.a) this.f3018a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3806O i(a.b bVar, int i10) {
        if (!(bVar instanceof a.b.AbstractC0054a.AbstractC0056b)) {
            if ((bVar instanceof a.b.AbstractC0054a.C0055a) || (bVar instanceof a.b.AbstractC0054a.c) || (bVar instanceof a.b.AbstractC0059b)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        a.b.AbstractC0054a.AbstractC0056b abstractC0056b = (a.b.AbstractC0054a.AbstractC0056b) bVar;
        List listC = AbstractC3689v.c();
        String strA = abstractC0056b.a();
        if (strA != null) {
            listC.add(new C3806O.b(C3806O.b.a.PROVIDER, new d.c(strA), null, 4, null));
        }
        V7.b bVarC = abstractC0056b.c();
        if (bVarC != null) {
            listC.add(new C3806O.b(C3806O.b.a.STANDARD, new d.b(Ne.a.a(bVarC)), j(bVarC)));
        }
        V7.a aVarB = abstractC0056b.b();
        if (aVarB != null) {
            listC.add(new C3806O.b(C3806O.b.a.SIGNAL, Ne.f.h(aVarB, false, null, 2, null), Ne.f.b(aVarB.h())));
        }
        List listA = AbstractC3689v.a(listC);
        C3806O c3806o = new C3806O(String.valueOf(i10), new d.b(R.string.sim_card_num_format, AbstractC3689v.e(Integer.valueOf(i10))), listA, g(listA), false, 16, null);
        if (c3806o.d().isEmpty()) {
            return null;
        }
        return c3806o;
    }

    private final W7.e j(V7.b bVar) {
        if ((bVar instanceof b.e) || (bVar instanceof b.a)) {
            return W7.e.POOR;
        }
        if (bVar instanceof b.AbstractC0846b) {
            return W7.e.FAIR;
        }
        if ((bVar instanceof b.c) || (bVar instanceof b.d)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC6084a k() {
        return (InterfaceC6084a) this.f3019b.getValue();
    }

    @Override // D8.j
    public AbstractC5912b a(String id2) {
        AbstractC6492s.i(id2, "id");
        return k().a(new InterfaceC6084a.b.A(AbstractC5460b.a.C1745a.f46389b));
    }

    @Override // D8.j
    public gg.i b() {
        return this.f3020c;
    }
}
