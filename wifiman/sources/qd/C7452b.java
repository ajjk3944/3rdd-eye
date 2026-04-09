package qd;

import Ii.C3048c0;
import Ii.N;
import Ka.h;
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
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import pd.s;
import qd.C7452b;
import qd.C7454d;
import qd.InterfaceC7451a;
import td.AbstractC8079a;
import td.AbstractC8081c;
import td.InterfaceC8082d;
import ud.InterfaceC8160a;
import vd.InterfaceC8213a;
import wd.InterfaceC8330f;
import yd.InterfaceC8652a;
import zd.InterfaceC8730a;

/* renamed from: qd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7452b extends AbstractC8079a implements InterfaceC7451a {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8730a f58614c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8652a f58615d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8330f f58616e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8213a f58617f;

    /* renamed from: g, reason: collision with root package name */
    private h.a f58618g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f58619h;

    /* renamed from: i, reason: collision with root package name */
    private final s f58620i;

    /* renamed from: qd.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58621a;

        static {
            int[] iArr = new int[C7454d.b.values().length];
            try {
                iArr[C7454d.b.EVALUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C7454d.b.DOWNLOAD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C7454d.b.DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C7454d.b.UPLOAD_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C7454d.b.UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C7454d.b.RESULT_SAVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C7454d.b.RESULT_REPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C7454d.b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C7454d.b.END.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f58621a = iArr;
        }
    }

    /* renamed from: qd.b$b, reason: collision with other inner class name */
    static final class C2064b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f58622a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7454d f58624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2064b(C7454d c7454d, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f58624c = c7454d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C7452b.this.new C2064b(this.f58624c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f58622a;
            if (i10 == 0) {
                v.b(obj);
                h.a aVar = C7452b.this.f58618g;
                String strA = Cd.j.f2592a.a(this.f58624c.o().a(), this.f58624c.o().d());
                this.f58622a = 1;
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
                return new Speedtest.f.a.c(new InterfaceC7451a.b(iLongValue, lA != null ? kotlin.coroutines.jvm.internal.b.d((int) lA.longValue()) : null));
            }
            throw new UiSpeedtestLib.Error.IO("Server " + this.f58624c.o().a() + " unreachable");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((C2064b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: qd.b$c */
    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f58625a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable err) {
            AbstractC6492s.i(err, "err");
            return err instanceof UiSpeedtestLib.Error ? z.z(new Speedtest.f.a.C1417a(td.f.a((UiSpeedtestLib.Error) err))) : z.p(err);
        }
    }

    /* renamed from: qd.b$d */
    public static final class d extends AbstractC8081c {

        /* renamed from: c, reason: collision with root package name */
        private final String f58626c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7451a.C2063a f58627d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7452b f58628e;

        /* renamed from: qd.b$d$a */
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

        d(InterfaceC7451a.C2063a c2063a, C7452b c7452b) {
            this.f58627d = c2063a;
            this.f58628e = c7452b;
            this.f58626c = "A2A Speed test " + c2063a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC5912b o(C7452b c7452b, C7454d it) {
            AbstractC6492s.i(it, "it");
            if (it.b() != null) {
                return c7452b.f58617f.a(new InterfaceC8213a.C2254a(it, 0L, 2, null));
            }
            AbstractC5912b abstractC5912bM = AbstractC5912b.m();
            AbstractC6492s.f(abstractC5912bM);
            return abstractC5912bM;
        }

        @Override // td.AbstractC8081c
        protected String d() {
            return this.f58626c;
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
        public C7454d c() {
            return C7454d.f58641m.a(this.f58627d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean g(C7454d state) {
            AbstractC6492s.i(state, "state");
            return state.c();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public gg.i j(C7454d state) {
            AbstractC6492s.i(state, "state");
            gg.i iVarK = this.f58628e.k(state);
            final C7452b c7452b = this.f58628e;
            return n9.c.c(iVarK, new InterfaceC6835l() { // from class: qd.c
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C7452b.d.o(c7452b, (C7454d) obj);
                }
            });
        }
    }

    /* renamed from: qd.b$e */
    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7454d f58630a;

        e(C7454d c7454d) {
            this.f58630a = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7454d apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            C7454d c7454d = this.f58630a;
            return c7454d.j((509 & 1) != 0 ? c7454d.f58642a : null, (509 & 2) != 0 ? c7454d.f58643b : it, (509 & 4) != 0 ? c7454d.f58644c : null, (509 & 8) != 0 ? c7454d.f58645d : null, (509 & 16) != 0 ? c7454d.f58646e : null, (509 & 32) != 0 ? c7454d.f58647f : null, (509 & 64) != 0 ? c7454d.f58648g : null, (509 & 128) != 0 ? c7454d.f58649h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c7454d.f58650i : null);
        }
    }

    /* renamed from: qd.b$f */
    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7454d f58631a;

        f(C7454d c7454d) {
            this.f58631a = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7454d apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            C7454d c7454d = this.f58631a;
            return c7454d.j((509 & 1) != 0 ? c7454d.f58642a : null, (509 & 2) != 0 ? c7454d.f58643b : null, (509 & 4) != 0 ? c7454d.f58644c : it, (509 & 8) != 0 ? c7454d.f58645d : null, (509 & 16) != 0 ? c7454d.f58646e : null, (509 & 32) != 0 ? c7454d.f58647f : null, (509 & 64) != 0 ? c7454d.f58648g : null, (509 & 128) != 0 ? c7454d.f58649h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c7454d.f58650i : null);
        }
    }

    /* renamed from: qd.b$g */
    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7454d f58632a;

        g(C7454d c7454d) {
            this.f58632a = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7454d apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            C7454d c7454d = this.f58632a;
            return c7454d.j((509 & 1) != 0 ? c7454d.f58642a : null, (509 & 2) != 0 ? c7454d.f58643b : null, (509 & 4) != 0 ? c7454d.f58644c : null, (509 & 8) != 0 ? c7454d.f58645d : it, (509 & 16) != 0 ? c7454d.f58646e : null, (509 & 32) != 0 ? c7454d.f58647f : null, (509 & 64) != 0 ? c7454d.f58648g : null, (509 & 128) != 0 ? c7454d.f58649h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c7454d.f58650i : null);
        }
    }

    /* renamed from: qd.b$h */
    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7454d f58633a;

        h(C7454d c7454d) {
            this.f58633a = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7454d apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            C7454d c7454d = this.f58633a;
            return c7454d.j((509 & 1) != 0 ? c7454d.f58642a : null, (509 & 2) != 0 ? c7454d.f58643b : null, (509 & 4) != 0 ? c7454d.f58644c : null, (509 & 8) != 0 ? c7454d.f58645d : null, (509 & 16) != 0 ? c7454d.f58646e : it, (509 & 32) != 0 ? c7454d.f58647f : null, (509 & 64) != 0 ? c7454d.f58648g : null, (509 & 128) != 0 ? c7454d.f58649h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c7454d.f58650i : null);
        }
    }

    /* renamed from: qd.b$i */
    static final class i implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7454d f58634a;

        i(C7454d c7454d) {
            this.f58634a = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7454d apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            C7454d c7454d = this.f58634a;
            return c7454d.j((509 & 1) != 0 ? c7454d.f58642a : null, (509 & 2) != 0 ? c7454d.f58643b : null, (509 & 4) != 0 ? c7454d.f58644c : null, (509 & 8) != 0 ? c7454d.f58645d : null, (509 & 16) != 0 ? c7454d.f58646e : null, (509 & 32) != 0 ? c7454d.f58647f : it, (509 & 64) != 0 ? c7454d.f58648g : null, (509 & 128) != 0 ? c7454d.f58649h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c7454d.f58650i : null);
        }
    }

    /* renamed from: qd.b$j */
    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7454d f58635a;

        j(C7454d c7454d) {
            this.f58635a = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7454d apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            C7454d c7454d = this.f58635a;
            return c7454d.j((509 & 1) != 0 ? c7454d.f58642a : null, (509 & 2) != 0 ? c7454d.f58643b : null, (509 & 4) != 0 ? c7454d.f58644c : null, (509 & 8) != 0 ? c7454d.f58645d : null, (509 & 16) != 0 ? c7454d.f58646e : null, (509 & 32) != 0 ? c7454d.f58647f : null, (509 & 64) != 0 ? c7454d.f58648g : null, (509 & 128) != 0 ? c7454d.f58649h : it, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c7454d.f58650i : null);
        }
    }

    /* renamed from: qd.b$k */
    static final class k implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7454d f58636a;

        k(C7454d c7454d) {
            this.f58636a = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7454d apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            C7454d c7454d = this.f58636a;
            return c7454d.j((509 & 1) != 0 ? c7454d.f58642a : null, (509 & 2) != 0 ? c7454d.f58643b : null, (509 & 4) != 0 ? c7454d.f58644c : null, (509 & 8) != 0 ? c7454d.f58645d : null, (509 & 16) != 0 ? c7454d.f58646e : null, (509 & 32) != 0 ? c7454d.f58647f : null, (509 & 64) != 0 ? c7454d.f58648g : null, (509 & 128) != 0 ? c7454d.f58649h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c7454d.f58650i : it);
        }
    }

    /* renamed from: qd.b$l */
    static final class l implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7454d f58638b;

        /* renamed from: qd.b$l$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7454d f58639a;

            a(C7454d c7454d) {
                this.f58639a = c7454d;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C7454d apply(Speedtest.f it) {
                AbstractC6492s.i(it, "it");
                C7454d c7454d = this.f58639a;
                return c7454d.j((509 & 1) != 0 ? c7454d.f58642a : null, (509 & 2) != 0 ? c7454d.f58643b : null, (509 & 4) != 0 ? c7454d.f58644c : null, (509 & 8) != 0 ? c7454d.f58645d : null, (509 & 16) != 0 ? c7454d.f58646e : null, (509 & 32) != 0 ? c7454d.f58647f : null, (509 & 64) != 0 ? c7454d.f58648g : it, (509 & 128) != 0 ? c7454d.f58649h : null, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c7454d.f58650i : null);
            }
        }

        l(C7454d c7454d) {
            this.f58638b = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(W7.b ratesCache) {
            AbstractC6492s.i(ratesCache, "ratesCache");
            return C7452b.this.f58615d.b(this.f58638b, ratesCache).N0(new a(this.f58638b));
        }
    }

    public C7452b(InterfaceC8730a actionTimeDivider, InterfaceC8652a recorder, InterfaceC8330f reporter, InterfaceC8213a errorProcessor, InterfaceC8160a statsCache, InterfaceC8082d speedtestApiFactory) {
        AbstractC6492s.i(actionTimeDivider, "actionTimeDivider");
        AbstractC6492s.i(recorder, "recorder");
        AbstractC6492s.i(reporter, "reporter");
        AbstractC6492s.i(errorProcessor, "errorProcessor");
        AbstractC6492s.i(statsCache, "statsCache");
        AbstractC6492s.i(speedtestApiFactory, "speedtestApiFactory");
        this.f58614c = actionTimeDivider;
        this.f58615d = recorder;
        this.f58616e = reporter;
        this.f58617f = errorProcessor;
        this.f58618g = speedtestApiFactory.c();
        gg.i iVarI2 = statsCache.a().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f58619h = iVarI2;
        this.f58620i = s.APP_TO_APP;
    }

    private final gg.i g(C7454d c7454d) {
        h.a aVar = this.f58618g;
        InterfaceC7451a.C2063a c2063aO = c7454d.o();
        Object objB = c7454d.n().b();
        if (objB != null) {
            return td.g.a(aVar.a(i(c2063aO, (InterfaceC7451a.b) objB)));
        }
        throw new IllegalStateException("Server evaluation should be done at this point");
    }

    private final gg.i h(C7454d c7454d) {
        gg.i iVarZ1 = Qi.l.b(C3048c0.d(), new C2064b(c7454d, null)).O(Gg.a.d()).E(Gg.a.a()).F(c.f58625a).W().z1(new Speedtest.f.c(null));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }

    private final h.b i(InterfaceC7451a.C2063a c2063a, InterfaceC7451a.b bVar) {
        String strA0 = c2063a.a().a0();
        AbstractC6492s.h(strA0, "toNormalizedString(...)");
        return new h.b(strA0, c2063a.d(), bVar.b(), false, 8, null);
    }

    private final AbstractC8081c j(InterfaceC7451a.C2063a c2063a) {
        return new d(c2063a, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i k(C7454d c7454d) {
        switch (a.f58621a[c7454d.l().ordinal()]) {
            case 1:
                gg.i iVarN0 = h(c7454d).N0(new e(c7454d));
                AbstractC6492s.h(iVarN0, "map(...)");
                return iVarN0;
            case 2:
                gg.i iVarN02 = InterfaceC8730a.C2389a.a(this.f58614c, null, 1, null).N0(new f(c7454d));
                AbstractC6492s.h(iVarN02, "map(...)");
                return iVarN02;
            case 3:
                gg.i iVarN03 = b(g(c7454d)).N0(new g(c7454d));
                AbstractC6492s.h(iVarN03, "map(...)");
                return iVarN03;
            case 4:
                gg.i iVarN04 = InterfaceC8730a.C2389a.a(this.f58614c, null, 1, null).N0(new h(c7454d));
                AbstractC6492s.h(iVarN04, "map(...)");
                return iVarN04;
            case 5:
                gg.i iVarN05 = b(n(c7454d)).N0(new i(c7454d));
                AbstractC6492s.h(iVarN05, "map(...)");
                return iVarN05;
            case 6:
                return l(c7454d);
            case 7:
                gg.i iVarN06 = this.f58616e.a(new InterfaceC8330f.a(c7454d, 0L, 2, null)).N0(new j(c7454d));
                AbstractC6492s.h(iVarN06, "map(...)");
                return iVarN06;
            case 8:
                gg.i iVarN07 = this.f58615d.a(c7454d).N0(new k(c7454d));
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

    private final gg.i l(C7454d c7454d) {
        gg.i iVarW = this.f58619h.o0().w(new l(c7454d));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    private final gg.i n(C7454d c7454d) {
        h.a aVar = this.f58618g;
        InterfaceC7451a.C2063a c2063aO = c7454d.o();
        Object objB = c7454d.n().b();
        if (objB != null) {
            return td.g.a(aVar.d(i(c2063aO, (InterfaceC7451a.b) objB)));
        }
        throw new IllegalStateException("Server evaluation should be done at this point");
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public gg.i a(InterfaceC7451a.C2063a params) {
        AbstractC6492s.i(params, "params");
        gg.i iVarF = j(params).f();
        AbstractC5912b abstractC5912bE0 = this.f58619h.E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        gg.i iVarI2 = AbstractC5818i.a(iVarF, abstractC5912bE0).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }
}
