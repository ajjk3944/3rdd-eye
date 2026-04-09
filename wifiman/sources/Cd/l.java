package Cd;

import Cd.j;
import Cd.l;
import Cd.n;
import Ii.N;
import Ka.f;
import Yg.J;
import Yg.v;
import com.ui.speedtest.UiSpeedtestLib;
import com.ui.wifiman.model.speedtest.Speedtest;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import fe.AbstractC5818i;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import pd.s;
import td.AbstractC8079a;
import td.AbstractC8081c;
import td.InterfaceC8082d;
import ud.InterfaceC8160a;
import vd.InterfaceC8213a;
import wd.InterfaceC8330f;
import yd.InterfaceC8652a;
import zd.InterfaceC8730a;

/* loaded from: classes4.dex */
public final class l extends AbstractC8079a implements Cd.j {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8730a f2608c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8652a f2609d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8330f f2610e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8213a f2611f;

    /* renamed from: g, reason: collision with root package name */
    private f.a f2612g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f2613h;

    /* renamed from: i, reason: collision with root package name */
    private final s f2614i;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2615a;

        static {
            int[] iArr = new int[n.b.values().length];
            try {
                iArr[n.b.EVALUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.b.DOWNLOAD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.b.DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.b.UPLOAD_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.b.UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n.b.RESULT_SAVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n.b.RESULT_REPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n.b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[n.b.END.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f2615a = iArr;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f2616a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f2618c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n nVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f2618c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return l.this.new b(this.f2618c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f2616a;
            if (i10 == 0) {
                v.b(obj);
                f.a aVar = l.this.f2612g;
                String strA = Cd.j.f2592a.a(this.f2618c.o().a(), 8901);
                this.f2616a = 1;
                obj = aVar.b(strA, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            La.e eVar = (La.e) obj;
            Long lB = eVar.b();
            if (lB != null) {
                int iLongValue = (int) lB.longValue();
                Long lA = eVar.a();
                return new Speedtest.f.a.c(new j.d(iLongValue, lA != null ? kotlin.coroutines.jvm.internal.b.d((int) lA.longValue()) : null, eVar.d()));
            }
            throw new UiSpeedtestLib.Error.IO("Server " + this.f2618c.o().a() + " unreachable");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2619a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable err) {
            AbstractC6492s.i(err, "err");
            return err instanceof UiSpeedtestLib.Error ? z.z(new Speedtest.f.a.C1417a(td.f.a((UiSpeedtestLib.Error) err))) : z.p(err);
        }
    }

    public static final class d extends AbstractC8081c {

        /* renamed from: c, reason: collision with root package name */
        private final String f2620c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j.c f2621d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f2622e;

        public static final class a implements C {
            public a() {
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(d.this.c());
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        d(j.c cVar, l lVar) {
            this.f2621d = cVar;
            this.f2622e = lVar;
            this.f2620c = "Local Speed test " + cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC5912b o(l lVar, n it) {
            AbstractC6492s.i(it, "it");
            if (it.b() != null) {
                return lVar.f2611f.a(new InterfaceC8213a.C2254a(it, 0L, 2, null));
            }
            AbstractC5912b abstractC5912bM = AbstractC5912b.m();
            AbstractC6492s.f(abstractC5912bM);
            return abstractC5912bM;
        }

        @Override // td.AbstractC8081c
        protected String d() {
            return this.f2620c;
        }

        @Override // td.AbstractC8081c
        protected z e() {
            z zVarI = z.i(new a());
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public n c() {
            return n.f2635m.a(this.f2621d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean g(n state) {
            AbstractC6492s.i(state, "state");
            return state.c();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public gg.i j(n state) {
            AbstractC6492s.i(state, "state");
            gg.i iVarK = this.f2622e.k(state);
            final l lVar = this.f2622e;
            return n9.c.c(iVarK, new InterfaceC6835l() { // from class: Cd.m
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return l.d.o(lVar, (n) obj);
                }
            });
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f2624a;

        e(n nVar) {
            this.f2624a = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            n nVar = this.f2624a;
            return nVar.j((509 & 1) != 0 ? nVar.f2636a : null, (509 & 2) != 0 ? nVar.f2637b : it, (509 & 4) != 0 ? nVar.f2638c : null, (509 & 8) != 0 ? nVar.f2639d : null, (509 & 16) != 0 ? nVar.f2640e : null, (509 & 32) != 0 ? nVar.f2641f : null, (509 & 64) != 0 ? nVar.f2642g : null, (509 & 128) != 0 ? nVar.f2643h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? nVar.f2644i : null);
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f2625a;

        f(n nVar) {
            this.f2625a = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            n nVar = this.f2625a;
            return nVar.j((509 & 1) != 0 ? nVar.f2636a : null, (509 & 2) != 0 ? nVar.f2637b : null, (509 & 4) != 0 ? nVar.f2638c : it, (509 & 8) != 0 ? nVar.f2639d : null, (509 & 16) != 0 ? nVar.f2640e : null, (509 & 32) != 0 ? nVar.f2641f : null, (509 & 64) != 0 ? nVar.f2642g : null, (509 & 128) != 0 ? nVar.f2643h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? nVar.f2644i : null);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f2626a;

        g(n nVar) {
            this.f2626a = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            n nVar = this.f2626a;
            return nVar.j((509 & 1) != 0 ? nVar.f2636a : null, (509 & 2) != 0 ? nVar.f2637b : null, (509 & 4) != 0 ? nVar.f2638c : null, (509 & 8) != 0 ? nVar.f2639d : it, (509 & 16) != 0 ? nVar.f2640e : null, (509 & 32) != 0 ? nVar.f2641f : null, (509 & 64) != 0 ? nVar.f2642g : null, (509 & 128) != 0 ? nVar.f2643h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? nVar.f2644i : null);
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f2627a;

        h(n nVar) {
            this.f2627a = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            n nVar = this.f2627a;
            return nVar.j((509 & 1) != 0 ? nVar.f2636a : null, (509 & 2) != 0 ? nVar.f2637b : null, (509 & 4) != 0 ? nVar.f2638c : null, (509 & 8) != 0 ? nVar.f2639d : null, (509 & 16) != 0 ? nVar.f2640e : it, (509 & 32) != 0 ? nVar.f2641f : null, (509 & 64) != 0 ? nVar.f2642g : null, (509 & 128) != 0 ? nVar.f2643h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? nVar.f2644i : null);
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f2628a;

        i(n nVar) {
            this.f2628a = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            n nVar = this.f2628a;
            return nVar.j((509 & 1) != 0 ? nVar.f2636a : null, (509 & 2) != 0 ? nVar.f2637b : null, (509 & 4) != 0 ? nVar.f2638c : null, (509 & 8) != 0 ? nVar.f2639d : null, (509 & 16) != 0 ? nVar.f2640e : null, (509 & 32) != 0 ? nVar.f2641f : it, (509 & 64) != 0 ? nVar.f2642g : null, (509 & 128) != 0 ? nVar.f2643h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? nVar.f2644i : null);
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f2629a;

        j(n nVar) {
            this.f2629a = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            n nVar = this.f2629a;
            return nVar.j((509 & 1) != 0 ? nVar.f2636a : null, (509 & 2) != 0 ? nVar.f2637b : null, (509 & 4) != 0 ? nVar.f2638c : null, (509 & 8) != 0 ? nVar.f2639d : null, (509 & 16) != 0 ? nVar.f2640e : null, (509 & 32) != 0 ? nVar.f2641f : null, (509 & 64) != 0 ? nVar.f2642g : null, (509 & 128) != 0 ? nVar.f2643h : it, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? nVar.f2644i : null);
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f2630a;

        k(n nVar) {
            this.f2630a = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            n nVar = this.f2630a;
            return nVar.j((509 & 1) != 0 ? nVar.f2636a : null, (509 & 2) != 0 ? nVar.f2637b : null, (509 & 4) != 0 ? nVar.f2638c : null, (509 & 8) != 0 ? nVar.f2639d : null, (509 & 16) != 0 ? nVar.f2640e : null, (509 & 32) != 0 ? nVar.f2641f : null, (509 & 64) != 0 ? nVar.f2642g : null, (509 & 128) != 0 ? nVar.f2643h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? nVar.f2644i : it);
        }
    }

    /* renamed from: Cd.l$l, reason: collision with other inner class name */
    static final class C0129l implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f2632b;

        /* renamed from: Cd.l$l$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f2633a;

            a(n nVar) {
                this.f2633a = nVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n apply(Speedtest.f it) {
                AbstractC6492s.i(it, "it");
                n nVar = this.f2633a;
                return nVar.j((509 & 1) != 0 ? nVar.f2636a : null, (509 & 2) != 0 ? nVar.f2637b : null, (509 & 4) != 0 ? nVar.f2638c : null, (509 & 8) != 0 ? nVar.f2639d : null, (509 & 16) != 0 ? nVar.f2640e : null, (509 & 32) != 0 ? nVar.f2641f : null, (509 & 64) != 0 ? nVar.f2642g : it, (509 & 128) != 0 ? nVar.f2643h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? nVar.f2644i : null);
            }
        }

        C0129l(n nVar) {
            this.f2632b = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(W7.b ratesCache) {
            AbstractC6492s.i(ratesCache, "ratesCache");
            return l.this.f2609d.b(this.f2632b, ratesCache).N0(new a(this.f2632b));
        }
    }

    public l(InterfaceC8730a actionTimeDivider, InterfaceC8652a recorder, InterfaceC8330f reporter, InterfaceC8213a errorProcessor, InterfaceC8082d speedtestApiFactory, InterfaceC8160a statsCache) {
        AbstractC6492s.i(actionTimeDivider, "actionTimeDivider");
        AbstractC6492s.i(recorder, "recorder");
        AbstractC6492s.i(reporter, "reporter");
        AbstractC6492s.i(errorProcessor, "errorProcessor");
        AbstractC6492s.i(speedtestApiFactory, "speedtestApiFactory");
        AbstractC6492s.i(statsCache, "statsCache");
        this.f2608c = actionTimeDivider;
        this.f2609d = recorder;
        this.f2610e = reporter;
        this.f2611f = errorProcessor;
        this.f2612g = speedtestApiFactory.a();
        gg.i iVarI2 = statsCache.a().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2613h = iVarI2;
        this.f2614i = s.LOCAL;
    }

    private final gg.i g(n nVar) {
        f.a aVar = this.f2612g;
        j.c cVarO = nVar.o();
        Object objB = nVar.n().b();
        if (objB != null) {
            return td.g.a(aVar.a(i(cVarO, (j.d) objB)));
        }
        throw new IllegalStateException("Server evaluation should be done at this point");
    }

    private final gg.i h(n nVar) {
        gg.i iVarZ1 = Qi.l.c(null, new b(nVar, null), 1, null).O(Gg.a.d()).E(Gg.a.a()).F(c.f2619a).W().z1(new Speedtest.f.c(null));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }

    private final f.c.b i(j.c cVar, j.d dVar) {
        String strA0 = cVar.a().a0();
        AbstractC6492s.h(strA0, "toNormalizedString(...)");
        return new f.c.b(strA0, 8901, dVar.b(), false, dVar.c(), 8, null);
    }

    private final AbstractC8081c j(j.c cVar) {
        return new d(cVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i k(n nVar) {
        switch (a.f2615a[nVar.l().ordinal()]) {
            case 1:
                gg.i iVarN0 = h(nVar).N0(new e(nVar));
                AbstractC6492s.h(iVarN0, "map(...)");
                return iVarN0;
            case 2:
                gg.i iVarN02 = InterfaceC8730a.C2389a.a(this.f2608c, null, 1, null).N0(new f(nVar));
                AbstractC6492s.h(iVarN02, "map(...)");
                return iVarN02;
            case 3:
                gg.i iVarN03 = b(g(nVar)).N0(new g(nVar));
                AbstractC6492s.h(iVarN03, "map(...)");
                return iVarN03;
            case 4:
                gg.i iVarN04 = InterfaceC8730a.C2389a.a(this.f2608c, null, 1, null).N0(new h(nVar));
                AbstractC6492s.h(iVarN04, "map(...)");
                return iVarN04;
            case 5:
                gg.i iVarN05 = b(n(nVar)).N0(new i(nVar));
                AbstractC6492s.h(iVarN05, "map(...)");
                return iVarN05;
            case 6:
                return l(nVar);
            case 7:
                gg.i iVarN06 = this.f2610e.a(new InterfaceC8330f.a(nVar, 0L, 2, null)).N0(new j(nVar));
                AbstractC6492s.h(iVarN06, "map(...)");
                return iVarN06;
            case 8:
                gg.i iVarN07 = this.f2609d.a(nVar).N0(new k(nVar));
                AbstractC6492s.h(iVarN07, "map(...)");
                return iVarN07;
            case 9:
                gg.i iVarJ0 = gg.i.j0();
                AbstractC6492s.h(iVarJ0, "empty(...)");
                return iVarJ0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final gg.i l(n nVar) {
        gg.i iVarW = this.f2613h.o0().w(new C0129l(nVar));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    private final gg.i n(n nVar) {
        f.a aVar = this.f2612g;
        j.c cVarO = nVar.o();
        Object objB = nVar.n().b();
        if (objB != null) {
            return td.g.a(aVar.d(i(cVarO, (j.d) objB)));
        }
        throw new IllegalStateException("Server evaluation should be done at this point");
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public gg.i a(j.c params) {
        AbstractC6492s.i(params, "params");
        gg.i iVarF = j(params).f();
        AbstractC5912b abstractC5912bE0 = this.f2613h.E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        gg.i iVarI2 = AbstractC5818i.a(iVarF, abstractC5912bE0).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }
}
