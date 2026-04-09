package com.ui.wifiman.model.speedtest.internet;

import Ia.a;
import Ii.N;
import Ka.f;
import P7.c;
import Yg.J;
import Zg.AbstractC3689v;
import com.ui.speedtest.UiSpeedtestLib;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import com.ui.wifiman.model.speedtest.internet.b;
import com.ui.wifiman.model.speedtest.internet.f;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import fe.AbstractC5818i;
import gg.AbstractC5912b;
import gg.D;
import gg.InterfaceC5910A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import td.AbstractC8079a;
import td.AbstractC8081c;
import td.InterfaceC8082d;
import ud.InterfaceC8160a;
import vd.InterfaceC8213a;
import wd.InterfaceC8330f;
import yd.InterfaceC8652a;
import zd.InterfaceC8730a;

/* loaded from: classes4.dex */
public final class b extends AbstractC8079a implements InternetSpeedtest {

    /* renamed from: o, reason: collision with root package name */
    public static final C5185a f42969o = new C5185a(null);

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8730a f42970c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8652a f42971d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8330f f42972e;

    /* renamed from: f, reason: collision with root package name */
    private final P7.a f42973f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8213a f42974g;

    /* renamed from: h, reason: collision with root package name */
    private final InternetSpeedtest.d f42975h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC8082d f42976i;

    /* renamed from: j, reason: collision with root package name */
    private final pd.s f42977j;

    /* renamed from: k, reason: collision with root package name */
    private final Ia.a f42978k;

    /* renamed from: l, reason: collision with root package name */
    private String f42979l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f42980m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.z f42981n;

    public static final class A implements gg.C {
        public A() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(b.this.f42976i.d(b.this.f42979l));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class B implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f42984b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f42985a;

            a(com.ui.wifiman.model.speedtest.internet.f fVar) {
                this.f42985a = fVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f it) {
                AbstractC6492s.i(it, "it");
                com.ui.wifiman.model.speedtest.internet.f fVar = this.f42985a;
                return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : it, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : null);
            }
        }

        B(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f42984b = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(W7.b ratesCache) {
            AbstractC6492s.i(ratesCache, "ratesCache");
            return b.this.f42971d.b(this.f42984b, ratesCache).N0(new a(this.f42984b));
        }
    }

    static final class C implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f42986a;

        C(List list) {
            this.f42986a = list;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(f.a it) {
            AbstractC6492s.i(it, "it");
            return td.g.a(it.d(new f.c.a(this.f42986a)));
        }
    }

    /* renamed from: com.ui.wifiman.model.speedtest.internet.b$a, reason: case insensitive filesystem */
    public static final class C5185a {
        public /* synthetic */ C5185a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5185a() {
        }
    }

    /* renamed from: com.ui.wifiman.model.speedtest.internet.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1424b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42987a;

        static {
            int[] iArr = new int[f.b.values().length];
            try {
                iArr[f.b.TOKEN_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.b.SERVER_FETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.b.SERVER_WAKEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.b.SERVER_EVALUATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.b.DOWNLOAD_INTERNET_SETUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.b.DOWNLOAD_INTERNET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.b.UPLOAD_INTERNET_SETUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f.b.UPLOAD_INTERNET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f.b.RESULT_SAVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f.b.RESULT_REPORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f.b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f.b.END.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f42987a = iArr;
        }
    }

    /* renamed from: com.ui.wifiman.model.speedtest.internet.b$c, reason: case insensitive filesystem */
    public static final class C5186c implements gg.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f42988a;

        public C5186c(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f42988a = fVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(this.f42988a);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wifiman.model.speedtest.internet.f s10) {
            AbstractC6492s.i(s10, "s");
            P7.a aVar = b.this.f42973f;
            InternetSpeedtest.b bVarA = com.ui.wifiman.model.speedtest.internet.g.a(s10);
            String strD = bVarA != null ? bVarA.d() : null;
            if (strD == null) {
                throw new IllegalStateException("main server must be evaluated when reporting speedtest startup");
            }
            InternetSpeedtest.b bVarA2 = com.ui.wifiman.model.speedtest.internet.g.a(s10);
            String strC = bVarA2 != null ? bVarA2.c() : null;
            if (strC != null) {
                return aVar.d(new c.o(strD, strC));
            }
            throw new IllegalStateException("main server must be evaluated when reporting speedtest startup");
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f42990a;

        e(List list) {
            this.f42990a = list;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(f.a it) {
            AbstractC6492s.i(it, "it");
            return td.g.a(it.a(new f.c.a(this.f42990a)));
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f42991a;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f42992a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f.a f42993b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InternetSpeedtest.b f42994c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, InternetSpeedtest.b bVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f42993b = aVar;
                this.f42994c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f42993b, this.f42994c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objG = AbstractC5467b.g();
                int i10 = this.f42992a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    f.a aVar = this.f42993b;
                    String strD = this.f42994c.d();
                    this.f42992a = 1;
                    objB = aVar.b(strD, this);
                    if (objB == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    objB = obj;
                }
                La.e eVar = (La.e) objB;
                Long lB = eVar.b();
                if (lB != null) {
                    int iLongValue = (int) lB.longValue();
                    Long lA = eVar.a();
                    return new InternetSpeedtest.b.C1420b(eVar.c(), null, null, null, null, null, null, null, null, kotlin.coroutines.jvm.internal.b.d(iLongValue), lA != null ? kotlin.coroutines.jvm.internal.b.d((int) lA.longValue()) : null, null, 2558, null);
                }
                throw new UiSpeedtestLib.Error.IO("Server " + this.f42994c.d() + " unreachable");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        f(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f42991a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(f.a client) {
            AbstractC6492s.i(client, "client");
            InternetSpeedtest.b bVarA = com.ui.wifiman.model.speedtest.internet.g.a(this.f42991a);
            if (bVarA != null) {
                return Qi.l.c(null, new a(client, bVarA, null), 1, null).O(Gg.a.d()).E(Gg.a.a());
            }
            throw new IllegalStateException("main test server must be available when evaluation started");
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f42995a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest.f apply(InternetSpeedtest.b.C1420b it) {
            AbstractC6492s.i(it, "it");
            return new Speedtest.f.a.c(it);
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f42996a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable err) {
            AbstractC6492s.i(err, "err");
            return err instanceof UiSpeedtestLib.Error ? gg.z.z(new Speedtest.f.a.C1417a(td.f.a((UiSpeedtestLib.Error) err))) : gg.z.p(err);
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f42997a;

        i(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f42997a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f42997a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : it, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : null);
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f42998a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest.f apply(InternetSpeedtest.d.a it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof InternetSpeedtest.d.a.b) {
                return new Speedtest.f.a.c(it);
            }
            if (it instanceof InternetSpeedtest.d.a.C1422a) {
                return new Speedtest.f.c(it);
            }
            if (it instanceof InternetSpeedtest.d.a.c) {
                return new Speedtest.f.a.C1417a(new InternetSpeedtest.Error.NoServerAvailable(null, 1, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class k implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final k f42999a = new k();

        k() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            return it instanceof Speedtest.f.a;
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43000a;

        l(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43000a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f evaluationState) {
            AbstractC6492s.i(evaluationState, "evaluationState");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f43000a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : evaluationState, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : null);
        }
    }

    public static final class m extends AbstractC8081c {

        /* renamed from: c, reason: collision with root package name */
        private final String f43001c = "Internet speedtest";

        /* renamed from: d, reason: collision with root package name */
        private final com.ui.wifiman.model.speedtest.internet.f f43002d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f43003e;

        public static final class a implements gg.C {
            public a() {
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(m.this.c());
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        m(InternetSpeedtest.a aVar, b bVar) {
            this.f43003e = bVar;
            this.f43002d = com.ui.wifiman.model.speedtest.internet.f.f43086n.a(aVar, aVar.a(), aVar.b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC5912b o(b bVar, com.ui.wifiman.model.speedtest.internet.f it) {
            AbstractC6492s.i(it, "it");
            if (it.b() != null) {
                return bVar.f42974g.a(new InterfaceC8213a.C2254a(it, 0L, 2, null));
            }
            AbstractC5912b abstractC5912bM = AbstractC5912b.m();
            AbstractC6492s.f(abstractC5912bM);
            return abstractC5912bM;
        }

        @Override // td.AbstractC8081c
        protected String d() {
            return this.f43001c;
        }

        @Override // td.AbstractC8081c
        protected gg.z e() {
            gg.z zVarI = gg.z.i(new a());
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public com.ui.wifiman.model.speedtest.internet.f c() {
            return this.f43002d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean g(com.ui.wifiman.model.speedtest.internet.f state) {
            AbstractC6492s.i(state, "state");
            if (state.b() != null) {
                Z7.b.j("Error occurred while running Internet speedtest", state.b(), null, 4, null);
            }
            return state.c();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public gg.i j(com.ui.wifiman.model.speedtest.internet.f state) {
            AbstractC6492s.i(state, "state");
            gg.i iVarT = this.f43003e.t(state);
            final b bVar = this.f43003e;
            return n9.c.c(iVarT, new InterfaceC6835l() { // from class: Bd.f
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return b.m.o(bVar, (com.ui.wifiman.model.speedtest.internet.f) obj);
                }
            });
        }
    }

    public static final class n implements gg.C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new Speedtest.f.a.c(Boolean.TRUE));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class o implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43006b;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f43007a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f.a f43008b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.c.a.C0423a f43009c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, f.c.a.C0423a c0423a, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f43008b = aVar;
                this.f43009c = c0423a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f43008b, this.f43009c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f43007a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    f.a aVar = this.f43008b;
                    String strB = this.f43009c.b();
                    this.f43007a = 1;
                    if (aVar.c(strB, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        o(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43006b = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(f.a client) {
            AbstractC6492s.i(client, "client");
            List listQ = b.this.q(this.f43006b);
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listQ, 10));
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                arrayList.add(Qi.g.c(null, new a(client, (f.c.a.C0423a) it.next(), null), 1, null).W(Gg.a.d()).L(Gg.a.a()));
            }
            return AbstractC5912b.H(arrayList).Y(1000L, TimeUnit.MILLISECONDS).M();
        }
    }

    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43010a;

        p(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43010a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f43010a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : new Speedtest.f.a.c(Boolean.TRUE), (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : null);
        }
    }

    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43011a;

        q(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43011a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f43011a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : it, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : null);
        }
    }

    static final class r implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43012a;

        r(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43012a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f43012a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : it, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : null);
        }
    }

    static final class s implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43013a;

        s(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43013a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f43013a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : it, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : null);
        }
    }

    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43014a;

        t(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43014a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f43014a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : it, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : null);
        }
    }

    static final class u implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43015a;

        u(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43015a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f43015a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : it, (3583 & 2048) != 0 ? fVar.f43098l : null);
        }
    }

    static final class v implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43016a;

        v(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43016a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f43016a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : null, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : it);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f43017a;

        w(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new w(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f43017a;
            if (i10 == 0) {
                Yg.v.b(obj);
                Ia.a aVar = b.this.f42978k;
                this.f43017a = 1;
                obj = aVar.c(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((w) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class x implements InterfaceC6469f {
        x() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(a.c token) {
            AbstractC6492s.i(token, "token");
            Z7.b.h("Received token: " + token, null, 2, null);
            b.this.f42979l = token.a();
        }
    }

    static final class y implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final y f43020a = new y();

        y() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest.f apply(a.c it) {
            AbstractC6492s.i(it, "it");
            return new Speedtest.f.a.c(it.a());
        }
    }

    static final class z implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f43021a;

        z(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f43021a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.internet.f apply(Speedtest.f token) {
            AbstractC6492s.i(token, "token");
            com.ui.wifiman.model.speedtest.internet.f fVar = this.f43021a;
            return fVar.j((3583 & 1) != 0 ? fVar.f43087a : null, (3583 & 2) != 0 ? fVar.f43088b : token, (3583 & 4) != 0 ? fVar.f43089c : null, (3583 & 8) != 0 ? fVar.f43090d : null, (3583 & 16) != 0 ? fVar.f43091e : null, (3583 & 32) != 0 ? fVar.f43092f : null, (3583 & 64) != 0 ? fVar.f43093g : null, (3583 & 128) != 0 ? fVar.f43094h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? fVar.f43095i : null, (3583 & 512) != 0 ? fVar.f43096j : null, (3583 & 1024) != 0 ? fVar.f43097k : null, (3583 & 2048) != 0 ? fVar.f43098l : null);
        }
    }

    public b(InterfaceC8730a actionTimeDivider, InterfaceC8652a recorder, InterfaceC8330f reporter, P7.a analytics, InterfaceC8213a errorProcessor, InternetSpeedtest.d serverService, InterfaceC8082d speedtestApiFactory, InterfaceC8160a statsCache) {
        AbstractC6492s.i(actionTimeDivider, "actionTimeDivider");
        AbstractC6492s.i(recorder, "recorder");
        AbstractC6492s.i(reporter, "reporter");
        AbstractC6492s.i(analytics, "analytics");
        AbstractC6492s.i(errorProcessor, "errorProcessor");
        AbstractC6492s.i(serverService, "serverService");
        AbstractC6492s.i(speedtestApiFactory, "speedtestApiFactory");
        AbstractC6492s.i(statsCache, "statsCache");
        this.f42970c = actionTimeDivider;
        this.f42971d = recorder;
        this.f42972e = reporter;
        this.f42973f = analytics;
        this.f42974g = errorProcessor;
        this.f42975h = serverService;
        this.f42976i = speedtestApiFactory;
        this.f42977j = pd.s.INTERNET;
        this.f42978k = speedtestApiFactory.b(null);
        gg.i iVarI2 = statsCache.a().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42980m = iVarI2;
        gg.z zVarI = gg.z.i(new A());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.z zVarE = zVarI.e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f42981n = zVarE;
    }

    private final AbstractC5912b m(com.ui.wifiman.model.speedtest.internet.f fVar) {
        gg.z zVarI = gg.z.i(new C5186c(fVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI.t(new d());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    private final gg.i n(List list) {
        gg.i iVarW = this.f42981n.w(new e(list));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    private final gg.i o(com.ui.wifiman.model.speedtest.internet.f fVar) {
        gg.i iVarN0 = this.f42981n.s(new f(fVar)).A(g.f42995a).F(h.f42996a).W().z1(new Speedtest.f.c(null)).N0(new i(fVar));
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    private final gg.i p(com.ui.wifiman.model.speedtest.internet.f fVar) {
        gg.i iVarN0 = this.f42975h.c().N0(j.f42998a).z1(new Speedtest.f.c(null)).R1(k.f42999a).N0(new l(fVar));
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List q(com.ui.wifiman.model.speedtest.internet.f fVar) {
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        InternetSpeedtest.b bVarA = com.ui.wifiman.model.speedtest.internet.g.a(fVar);
        if (bVarA == null) {
            throw new IllegalStateException("main test server must be available when starting speedtest");
        }
        String strD = bVarA.d();
        Integer num = (Integer) fVar.e().b();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Integer numB = bVarA.b();
            if (numB == null) {
                throw new IllegalStateException("main server not reachable");
            }
            iIntValue = numB.intValue();
        }
        arrayList.add(new f.c.a.C0423a(strD, iIntValue, bVarA.e()));
        List<InternetSpeedtest.b> listB = com.ui.wifiman.model.speedtest.internet.g.b(fVar);
        if (listB != null) {
            for (InternetSpeedtest.b bVar : listB) {
                String strD2 = bVar.d();
                Integer numB2 = bVar.b();
                if (numB2 != null) {
                    arrayList.add(new f.c.a.C0423a(strD2, numB2.intValue(), bVar.e()));
                }
            }
        }
        return arrayList;
    }

    private final AbstractC8081c r(InternetSpeedtest.a aVar) {
        return new m(aVar, this);
    }

    private final gg.i s(com.ui.wifiman.model.speedtest.internet.f fVar) {
        AbstractC5912b abstractC5912bT = this.f42981n.t(new o(fVar));
        gg.z zVarI = gg.z.i(new n());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarN0 = abstractC5912bT.k(zVarI).W().z1(new Speedtest.f.c(null)).N0(new p(fVar));
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i t(com.ui.wifiman.model.speedtest.internet.f fVar) {
        switch (C1424b.f42987a[fVar.l().ordinal()]) {
            case 1:
                return u(fVar);
            case 2:
                return p(fVar);
            case 3:
                return s(fVar);
            case 4:
                return o(fVar);
            case 5:
                gg.i iVarN0 = m(fVar).h(InterfaceC8730a.C2389a.a(this.f42970c, null, 1, null)).N0(new q(fVar));
                AbstractC6492s.h(iVarN0, "map(...)");
                return iVarN0;
            case 6:
                gg.i iVarN02 = b(n(q(fVar))).N0(new r(fVar));
                AbstractC6492s.h(iVarN02, "map(...)");
                return iVarN02;
            case 7:
                gg.i iVarN03 = InterfaceC8730a.C2389a.a(this.f42970c, null, 1, null).N0(new s(fVar));
                AbstractC6492s.h(iVarN03, "map(...)");
                return iVarN03;
            case 8:
                gg.i iVarN04 = b(y(q(fVar))).N0(new t(fVar));
                AbstractC6492s.h(iVarN04, "map(...)");
                return iVarN04;
            case 9:
                return w(fVar);
            case 10:
                gg.i iVarN05 = this.f42972e.a(new InterfaceC8330f.a(fVar, 0L, 2, null)).N0(new u(fVar));
                AbstractC6492s.h(iVarN05, "map(...)");
                return iVarN05;
            case 11:
                gg.i iVarN06 = this.f42971d.a(fVar).N0(new v(fVar));
                AbstractC6492s.h(iVarN06, "map(...)");
                return iVarN06;
            case 12:
                gg.i iVarJ0 = gg.i.j0();
                AbstractC6492s.h(iVarJ0, "empty(...)");
                return iVarJ0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final gg.i u(com.ui.wifiman.model.speedtest.internet.f fVar) {
        gg.i iVarN0 = Qi.l.c(null, new w(null), 1, null).O(Gg.a.d()).E(Gg.a.a()).o(new x()).A(y.f43020a).G(new kg.n() { // from class: Bd.e
            @Override // kg.n
            public final Object apply(Object obj) {
                return com.ui.wifiman.model.speedtest.internet.b.v((Throwable) obj);
            }
        }).W().z1(new Speedtest.f.c(null)).N0(new z(fVar));
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Speedtest.f v(Throwable it) {
        AbstractC6492s.i(it, "it");
        return new Speedtest.f.a.C1417a(it);
    }

    private final gg.i w(com.ui.wifiman.model.speedtest.internet.f fVar) {
        gg.i iVarW = this.f42980m.o0().w(new B(fVar));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    private final gg.i y(List list) {
        gg.i iVarW = this.f42981n.w(new C(list));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public gg.i a(InternetSpeedtest.a params) {
        AbstractC6492s.i(params, "params");
        gg.i iVarF = r(params).f();
        AbstractC5912b abstractC5912bE0 = this.f42980m.E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        gg.i iVarI2 = AbstractC5818i.a(iVarF, abstractC5912bE0).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }
}
