package Q0;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.K;
import Ii.S0;
import Q0.U;
import dh.AbstractC5376a;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final a f19088c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f19089d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final C3443u f19090e = new C3443u();

    /* renamed from: f, reason: collision with root package name */
    private static final Ii.K f19091f = new c(Ii.K.f9272M);

    /* renamed from: a, reason: collision with root package name */
    private final C3430g f19092a;

    /* renamed from: b, reason: collision with root package name */
    private Ii.N f19093b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f19094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3429f f19095b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3429f c3429f, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f19095b = c3429f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f19095b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f19094a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C3429f c3429f = this.f19095b;
                this.f19094a = 1;
                if (c3429f.j(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class c extends AbstractC5376a implements Ii.K {
        public c(K.a aVar) {
            super(aVar);
        }

        @Override // Ii.K
        public void s(InterfaceC5384i interfaceC5384i, Throwable th2) {
        }
    }

    public r(C3430g c3430g, InterfaceC5384i interfaceC5384i) {
        this.f19092a = c3430g;
        this.f19093b = Ii.O.a(f19091f.plus(T0.l.a()).plus(interfaceC5384i).plus(S0.a((InterfaceC3091y0) interfaceC5384i.get(InterfaceC3091y0.f9363O))));
    }

    public U a(S s10, G g10, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        if (!(s10.c() instanceof C3440q)) {
            return null;
        }
        Yg.s sVarB = AbstractC3441s.b(f19090e.a(((C3440q) s10.c()).g(), s10.f(), s10.d()), s10, this.f19092a, g10, interfaceC6835l2);
        List list = (List) sVarB.a();
        Object objC = sVarB.c();
        if (list == null) {
            return new U.b(objC, false, 2, null);
        }
        C3429f c3429f = new C3429f(list, objC, s10, this.f19092a, interfaceC6835l, g10);
        AbstractC3063k.d(this.f19093b, null, Ii.P.UNDISPATCHED, new b(c3429f, null), 1, null);
        return new U.a(c3429f);
    }

    public /* synthetic */ r(C3430g c3430g, InterfaceC5384i interfaceC5384i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C3430g() : c3430g, (i10 & 2) != 0 ? C5385j.f46088a : interfaceC5384i);
    }
}
