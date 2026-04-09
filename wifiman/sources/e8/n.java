package E8;

import Li.N;
import Zc.e;
import com.ubnt.usurvey.R;
import ff.EnumC5821b;
import gg.EnumC5911a;
import i8.InterfaceC6084a;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import p000if.AbstractC6149b;
import p000if.C6148a;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class n extends AbstractC6149b {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4248m = {O.h(new kotlin.jvm.internal.F(n.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new kotlin.jvm.internal.F(n.class, "networkConnection", "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0))};

    /* renamed from: n, reason: collision with root package name */
    public static final int f4249n = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f4250g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f4251h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f4252i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f4253j;

    /* renamed from: k, reason: collision with root package name */
    private final N f4254k;

    /* renamed from: l, reason: collision with root package name */
    private final N f4255l;

    public static final class a implements gg.k {
        public a() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(n.this.n0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<Zc.f> {
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4257a = new d();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4258a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f4259b;

            static {
                int[] iArr = new int[EnumC5821b.values().length];
                try {
                    iArr[EnumC5821b.INTERNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5821b.SERVER_UNREACHABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5821b.UNEXPECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4258a = iArr;
                int[] iArr2 = new int[e.b.values().length];
                try {
                    iArr2[e.b.DISCONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[e.b.CONNECTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[e.b.AUTHENTICATING.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[e.b.OBTAINING_IP.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[e.b.CONNECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                f4259b = iArr2;
            }
        }

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9.d apply(Zc.e networkConnectionState, C6148a c6148a) {
            AbstractC6492s.i(networkConnectionState, "networkConnectionState");
            AbstractC6492s.i(c6148a, "<destruct>");
            EnumC5821b enumC5821bA = c6148a.a();
            int i10 = a.f4259b[networkConnectionState.f().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                return new d.b(R.string.speedtest_failed_no_network_message);
            }
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            int i11 = a.f4258a[enumC5821bA.ordinal()];
            if (i11 == 1) {
                return new d.b(R.string.speedtest_failed_unexpected_message);
            }
            if (i11 == 2) {
                return new d.b(R.string.speedtest_failed_server_unreachable_message);
            }
            if (i11 == 3) {
                return new d.b(R.string.speedtest_failed_unexpected_message);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4260a = new e();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4261a;

            static {
                int[] iArr = new int[EnumC5821b.values().length];
                try {
                    iArr[EnumC5821b.INTERNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5821b.SERVER_UNREACHABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5821b.UNEXPECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4261a = iArr;
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.b apply(C6148a c6148a) {
            AbstractC6492s.i(c6148a, "<destruct>");
            int i10 = a.f4261a[c6148a.a().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return new d.b(R.string.speedtest_failed_title);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public n(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f4250g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f4248m;
        this.f4251h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4252i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, Zc.f.class), null).a(this, lVarArr[1]);
        gg.i iVarI2 = gg.i.N(new a(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f4253j = iVarI2;
        gg.i iVarN0 = iVarI2.N0(e.f4260a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f4254k = AbstractC8661g.d0(this, iVarN0, new d.b(R.string.speedtest_failed_title), false, null, 6, null);
        gg.i iVarW = gg.i.v(r0().getState(), iVarI2, d.f4257a).o0().W();
        AbstractC6492s.h(iVarW, "toFlowable(...)");
        this.f4255l = AbstractC8661g.d0(this, iVarW, new d.c(""), false, null, 6, null);
    }

    private final Zc.f r0() {
        return (Zc.f) this.f4252i.getValue();
    }

    private final InterfaceC6084a s0() {
        return (InterfaceC6084a) this.f4251h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f4250g;
    }

    @Override // p000if.AbstractC6149b
    public N getTitle() {
        return this.f4254k;
    }

    @Override // p000if.AbstractC6149b
    public N o0() {
        return this.f4255l;
    }

    @Override // p000if.AbstractC6149b
    public void p0() {
        C8658d.f66727a.d(s0().a(InterfaceC6084a.b.n.f48939a), this);
    }
}
