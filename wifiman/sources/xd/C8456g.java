package xd;

import Zg.AbstractC3689v;
import com.ui.wifiman.model.speedtest.result.b;
import com.ui.wifiman.model.ubiquiti.uisp.UispController;
import gg.D;
import gg.z;
import hg.InterfaceC6043c;
import je.AbstractC6317r;
import je.u;
import kd.C6455e;
import kd.InterfaceC6454d;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import pd.s;
import xd.C8456g;

/* renamed from: xd.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8456g {

    /* renamed from: a, reason: collision with root package name */
    private final UispController f65606a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6454d f65607b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f65608c;

    /* renamed from: xd.g$a */
    public static abstract class a extends AbstractC8451b {

        /* renamed from: xd.g$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2319a extends a {

            /* renamed from: xd.g$a$a$a, reason: collision with other inner class name */
            public static final class C2320a extends AbstractC2319a {

                /* renamed from: a, reason: collision with root package name */
                private final Throwable f65609a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2320a(Throwable error) {
                    super(null);
                    AbstractC6492s.i(error, "error");
                    this.f65609a = error;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2320a) && AbstractC6492s.d(this.f65609a, ((C2320a) obj).f65609a);
                }

                public int hashCode() {
                    return this.f65609a.hashCode();
                }

                public String toString() {
                    return "Failed(error=" + this.f65609a + ")";
                }
            }

            /* renamed from: xd.g$a$a$b */
            public static final class b extends AbstractC2319a {

                /* renamed from: a, reason: collision with root package name */
                public static final b f65610a = new b();

                private b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return 2005342271;
                }

                public String toString() {
                    return "Success";
                }
            }

            public /* synthetic */ AbstractC2319a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC2319a() {
                super(null);
            }
        }

        /* renamed from: xd.g$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f65611a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1072725815;
            }

            public String toString() {
                return "UnavailableApi";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: xd.g$b */
    static final class b implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f65612a;

        b(com.ui.wifiman.model.speedtest.result.b bVar) {
            this.f65612a = bVar;
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UispController.b a(Wc.b ispInfo, Wc.b publicIp, C6556a c6556a) {
            s sVarG;
            b.AbstractC1432b abstractC1432bC;
            String strB;
            Long lH;
            Long lA;
            W7.a aVarC;
            W7.a aVarB;
            AbstractC6492s.i(ispInfo, "ispInfo");
            AbstractC6492s.i(publicIp, "publicIp");
            AbstractC6492s.i(c6556a, "<destruct>");
            W7.b bVar = (W7.b) c6556a.a();
            UispController.a aVar = (UispController.a) ispInfo.b();
            Long lValueOf = null;
            String strD = aVar != null ? aVar.d() : null;
            C6455e c6455e = (C6455e) publicIp.b();
            inet.ipaddr.g gVarC = c6455e != null ? c6455e.c() : null;
            Long lValueOf2 = (bVar == null || (aVarB = bVar.b()) == null) ? null : Long.valueOf(aVarB.d() * 1000000);
            Long lValueOf3 = (bVar == null || (aVarC = bVar.c()) == null) ? null : Long.valueOf(aVarC.d() * 1000000);
            b.c cVar = (b.c) AbstractC3689v.s0(this.f65612a.g());
            if (cVar == null || (sVarG = cVar.g()) == null) {
                throw new IllegalStateException();
            }
            b.c cVar2 = (b.c) AbstractC3689v.s0(this.f65612a.g());
            if (cVar2 != null && (abstractC1432bC = cVar2.c()) != null) {
                if (abstractC1432bC instanceof b.AbstractC1432b.AbstractC1433b) {
                    strB = ((b.AbstractC1432b.AbstractC1433b) abstractC1432bC).d();
                } else if (abstractC1432bC instanceof b.AbstractC1432b.a) {
                    strB = ((b.AbstractC1432b.a) abstractC1432bC).b();
                } else {
                    if (!(abstractC1432bC instanceof b.AbstractC1432b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strB = ((b.AbstractC1432b.c) abstractC1432bC).b();
                }
                String str = strB;
                if (str != null) {
                    b.c cVar3 = (b.c) AbstractC3689v.s0(this.f65612a.g());
                    Long lValueOf4 = (cVar3 == null || (lA = cVar3.a()) == null) ? null : Long.valueOf(lA.longValue() / 8);
                    b.c cVar4 = (b.c) AbstractC3689v.s0(this.f65612a.g());
                    if (cVar4 != null && (lH = cVar4.h()) != null) {
                        lValueOf = Long.valueOf(lH.longValue() / 8);
                    }
                    return new UispController.b(strD, gVarC, lValueOf2, lValueOf3, sVarG, str, lValueOf4, lValueOf);
                }
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: xd.g$c */
    static final class c implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f65614b;

        /* renamed from: xd.g$c$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8456g f65615a;

            a(C8456g c8456g) {
                this.f65615a = c8456g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c() {
                Z7.b.h("UISP Controller speedtest reported", null, 2, null);
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final D apply(UispController.b params) {
                AbstractC6492s.i(params, "params");
                return this.f65615a.f65606a.c(params).x(new InterfaceC6464a() { // from class: xd.h
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        C8456g.c.a.c();
                    }
                }).k(z.z(a.AbstractC2319a.b.f65610a));
            }
        }

        c(com.ui.wifiman.model.speedtest.result.b bVar) {
            this.f65614b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Boolean available) {
            AbstractC6492s.i(available, "available");
            if (available.booleanValue()) {
                z zVarS = C8456g.this.d(this.f65614b).s(new a(C8456g.this));
                AbstractC6492s.f(zVarS);
                return zVarS;
            }
            Z7.b.h("UISP Controller speedtest report skipped because of unavailable api", null, 2, null);
            z zVarZ = z.z(a.b.f65611a);
            AbstractC6492s.f(zVarZ);
            return zVarZ;
        }
    }

    /* renamed from: xd.g$d */
    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f65616a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("UISP Controller speedtest report subscribed", null, 2, null);
        }
    }

    /* renamed from: xd.g$e */
    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f65617a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            AbstractC6317r.b.a aVar = it instanceof AbstractC6317r.b.a ? (AbstractC6317r.b.a) it : null;
            return new C6556a(aVar != null ? aVar.f() : null);
        }
    }

    public C8456g(UispController uispController, InterfaceC6454d publicIPService, u wifiConnectionService) {
        AbstractC6492s.i(uispController, "uispController");
        AbstractC6492s.i(publicIPService, "publicIPService");
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        this.f65606a = uispController;
        this.f65607b = publicIPService;
        gg.i iVarW = wifiConnectionService.a().N0(e.f65617a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f65608c = iVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z d(com.ui.wifiman.model.speedtest.result.b bVar) {
        z zVarO0 = gg.i.u(this.f65606a.a(), this.f65607b.a(), this.f65608c, new b(bVar)).o0();
        AbstractC6492s.h(zVarO0, "firstOrError(...)");
        return zVarO0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a f(Throwable error) {
        AbstractC6492s.i(error, "error");
        Z7.b.h("UISP Controller speedtest report failed", null, 2, null);
        return new a.AbstractC2319a.C2320a(error);
    }

    public z e(com.ui.wifiman.model.speedtest.result.b result) {
        AbstractC6492s.i(result, "result");
        z zVarN = this.f65606a.b().o0().s(new c(result)).G(new n() { // from class: xd.f
            @Override // kg.n
            public final Object apply(Object obj) {
                return C8456g.f((Throwable) obj);
            }
        }).n(d.f65616a);
        AbstractC6492s.h(zVarN, "doOnSubscribe(...)");
        return zVarN;
    }
}
