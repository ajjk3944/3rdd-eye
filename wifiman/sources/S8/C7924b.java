package s8;

import Ge.g;
import Li.N;
import Yg.m;
import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kg.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s8.C7924b;
import th.l;
import uc.InterfaceC8157a;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: s8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7924b extends g.a {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ l[] f61379l = {O.h(new F(C7924b.class, "wifiRoamingNotificationService", "getWifiRoamingNotificationService()Lcom/ubnt/usurvey/ui/notification/NetworkConnectionNotificationService;", 0)), O.h(new F(C7924b.class, "vibrator", "getVibrator()Lcom/ui/wifiman/model/android/vibrator/AndroidVibrator;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f61380m = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f61381g;

    /* renamed from: h, reason: collision with root package name */
    private final m f61382h;

    /* renamed from: i, reason: collision with root package name */
    private final m f61383i;

    /* renamed from: j, reason: collision with root package name */
    private final Fg.c f61384j;

    /* renamed from: k, reason: collision with root package name */
    private final N f61385k;

    /* renamed from: s8.b$a */
    public static abstract class a {

        /* renamed from: s8.b$a$a, reason: collision with other inner class name */
        public static final class C2137a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Ge.g f61386a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2137a(Ge.g notification) {
                super(null);
                AbstractC6492s.i(notification, "notification");
                this.f61386a = notification;
            }

            public final Ge.g a() {
                return this.f61386a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2137a) && AbstractC6492s.d(this.f61386a, ((C2137a) obj).f61386a);
            }

            public int hashCode() {
                return this.f61386a.hashCode();
            }

            public String toString() {
                return "Add(notification=" + this.f61386a + ")";
            }
        }

        /* renamed from: s8.b$a$b, reason: collision with other inner class name */
        public static final class C2138b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f61387a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2138b(String notificationId) {
                super(null);
                AbstractC6492s.i(notificationId, "notificationId");
                this.f61387a = notificationId;
            }

            public final String a() {
                return this.f61387a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2138b) && AbstractC6492s.d(this.f61387a, ((C2138b) obj).f61387a);
            }

            public int hashCode() {
                return this.f61387a.hashCode();
            }

            public String toString() {
                return "Remove(notificationId=" + this.f61387a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: s8.b$b, reason: collision with other inner class name */
    static final class C2139b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2139b f61388a = new C2139b();

        /* renamed from: s8.b$b$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ge.g f61389a;

            a(Ge.g gVar) {
                this.f61389a = gVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a.C2138b apply(Long it) {
                AbstractC6492s.i(it, "it");
                return new a.C2138b(this.f61389a.getId());
            }
        }

        C2139b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Ge.g notification) {
            AbstractC6492s.i(notification, "notification");
            return gg.i.Q0(gg.i.K0(new a.C2137a(notification)), gg.i.d2(4000L, TimeUnit.MILLISECONDS).N0(new a(notification)));
        }
    }

    /* renamed from: s8.b$c */
    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f61390a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(a aVar, Ge.g it) {
            AbstractC6492s.i(it, "it");
            return AbstractC6492s.d(it.getId(), ((a.C2138b) aVar).a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(InterfaceC6835l interfaceC6835l, Object obj) {
            return ((Boolean) interfaceC6835l.invoke(obj)).booleanValue();
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ArrayList apply(ArrayList list, final a action) {
            AbstractC6492s.i(list, "list");
            AbstractC6492s.i(action, "action");
            synchronized (list) {
                try {
                    if (action instanceof a.C2137a) {
                        list.add(((a.C2137a) action).a());
                    } else {
                        if (!(action instanceof a.C2138b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: s8.c
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(C7924b.c.d(action, (g) obj));
                            }
                        };
                        list.removeIf(new Predicate() { // from class: s8.d
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return C7924b.c.e(interfaceC6835l, obj);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return list;
        }
    }

    /* renamed from: s8.b$d */
    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f61391a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(ArrayList list) {
            List listP0;
            AbstractC6492s.i(list, "list");
            synchronized (list) {
                listP0 = AbstractC3689v.P0(list);
            }
            return listP0;
        }
    }

    /* renamed from: s8.b$e */
    public static final class e implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f61393b;

        public e(String str) {
            this.f61393b = str;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                C7924b.this.f61384j.h(new a.C2138b(this.f61393b));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: s8.b$f */
    public static final class f extends o<InterfaceC7927e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: s8.b$g */
    public static final class g extends o<InterfaceC8157a> {
    }

    /* renamed from: s8.b$h */
    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f61394a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ci.c apply(List notifications) {
            AbstractC6492s.i(notifications, "notifications");
            return Ci.a.h(notifications);
        }
    }

    /* renamed from: s8.b$i */
    static final class i implements InterfaceC6469f {
        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(a action) {
            AbstractC6492s.i(action, "action");
            if (action instanceof a.C2137a) {
                C7924b.this.u0().a(InterfaceC8157a.EnumC2226a.TICK);
            } else if (!(action instanceof a.C2138b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public C7924b(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f61381g = di2;
        DI diD = d();
        org.kodein.type.i iVarE = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(diD, new org.kodein.type.d(iVarE, InterfaceC7927e.class), null);
        l[] lVarArr = f61379l;
        this.f61382h = interfaceC7810x2A.a(this, lVarArr[0]);
        DI diD2 = d();
        org.kodein.type.i iVarE2 = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f61383i = org.kodein.di.d.a(diD2, new org.kodein.type.d(iVarE2, InterfaceC8157a.class), null).a(this, lVarArr[1]);
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f61384j = cVarJ2;
        gg.i iVarW = s0(v0().a()).N0(h.f61394a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f61385k = AbstractC8661g.d0(this, iVarW, Ci.a.a(), false, null, 6, null);
    }

    private final gg.i s0(gg.i iVar) {
        gg.i iVarX0 = iVar.p0(C2139b.f61388a).T0(this.f61384j).a1().X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        gg.i iVarN0 = w0(iVarX0).s1(new q() { // from class: s8.a
            @Override // kg.q
            public final Object get() {
                return C7924b.t0();
            }
        }, c.f61390a).N0(d.f61391a);
        AbstractC6492s.h(iVarN0, "map(...)");
        gg.i iVarN = iVarN0.n(List.class);
        AbstractC6492s.h(iVarN, "cast(R::class.java)");
        return iVarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList t0() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8157a u0() {
        return (InterfaceC8157a) this.f61383i.getValue();
    }

    private final InterfaceC7927e v0() {
        return (InterfaceC7927e) this.f61382h.getValue();
    }

    private final gg.i w0(gg.i iVar) {
        gg.i iVarF0 = iVar.f0(new i());
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        return iVarF0;
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f61381g;
    }

    @Override // Ge.g.a
    public N n0() {
        return this.f61385k;
    }

    @Override // Ge.g.a
    public void o0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new e(id2));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        c8658d.d(abstractC5912bR, this);
    }
}
