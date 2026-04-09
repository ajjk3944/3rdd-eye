package E8;

import Cc.InterfaceC2557a;
import Cd.j;
import Vd.c;
import Zg.AbstractC3689v;
import b8.AbstractC4075b;
import com.ubnt.usurvey.product.m;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.advanced.b;
import com.ui.wifiman.ui.component.network.AbstractC5210h;
import com.ui.wifiman.ui.component.network.C5211i;
import com.ui.wifiman.ui.component.network.C5212j;
import com.ui.wifiman.ui.component.network.C5213k;
import gg.InterfaceC5910A;
import hf.t;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import jd.C6292a;
import jd.InterfaceC6293b;
import kd.C6455e;
import kd.InterfaceC6454d;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import l9.C6556a;
import n8.AbstractC6912m;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public final class h extends k {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4172p = {O.h(new kotlin.jvm.internal.F(h.class, "topologyService", "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;", 0)), O.h(new kotlin.jvm.internal.F(h.class, "publicIpService", "getPublicIpService()Lcom/ui/wifiman/model/publicip/PublicIP$Service;", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final int f4173q = 8;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f4174j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f4175k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f4176l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f4177m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f4178n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f4179o;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4180a;

        static {
            int[] iArr = new int[b.EnumC1419b.values().length];
            try {
                iArr[b.EnumC1419b.CONSOLE_LATENCY_CHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC1419b.CONSOLE_DOWNLOAD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.EnumC1419b.CONSOLE_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.EnumC1419b.CONSOLE_UPLOAD_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.EnumC1419b.CONSOLE_UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.EnumC1419b.EVALUATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.EnumC1419b.DOWNLOAD_SETUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.EnumC1419b.DOWNLOAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.EnumC1419b.UPLOAD_SETUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.EnumC1419b.UPLOAD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.EnumC1419b.RESULT_SAVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.EnumC1419b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.EnumC1419b.RESULT_REPORT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[b.EnumC1419b.END.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f4180a = iArr;
        }
    }

    static final class b implements InterfaceC6465b {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4182a;

            static {
                int[] iArr = new int[b.EnumC1419b.values().length];
                try {
                    iArr[b.EnumC1419b.CONSOLE_LATENCY_CHECK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.EnumC1419b.CONSOLE_DOWNLOAD_SETUP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.EnumC1419b.CONSOLE_DOWNLOAD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.EnumC1419b.CONSOLE_UPLOAD_SETUP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.EnumC1419b.CONSOLE_UPLOAD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b.EnumC1419b.EVALUATION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[b.EnumC1419b.DOWNLOAD_SETUP.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[b.EnumC1419b.DOWNLOAD.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[b.EnumC1419b.UPLOAD_SETUP.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[b.EnumC1419b.UPLOAD.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[b.EnumC1419b.RESULT_SAVE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[b.EnumC1419b.RESULT_REPORT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[b.EnumC1419b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[b.EnumC1419b.END.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                f4182a = iArr;
            }
        }

        b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5213k apply(com.ui.wifiman.model.speedtest.advanced.b state, C6556a c6556a) {
            InterfaceC2557a interfaceC2557aB;
            InterfaceC8439a.d dVarF;
            InterfaceC2557a interfaceC2557aB2;
            InterfaceC8439a.d dVarF2;
            InterfaceC2557a interfaceC2557aB3;
            InterfaceC8439a.d dVarF3;
            InterfaceC2557a interfaceC2557aB4;
            InterfaceC8439a.d dVarF4;
            InterfaceC2557a interfaceC2557aB5;
            InterfaceC8439a.d dVarF5;
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(c6556a, "<destruct>");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            com.ubnt.usurvey.product.l lVar = null;
            switch (a.f4182a[state.r().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    h hVar = h.this;
                    if (bVar != null && (interfaceC2557aB = bVar.b()) != null && (dVarF = interfaceC2557aB.f()) != null) {
                        lVar = (com.ubnt.usurvey.product.l) dVarF.N();
                    }
                    return hVar.o(lVar, AbstractC5210h.b.a.f44496a);
                case 4:
                case 5:
                    h hVar2 = h.this;
                    if (bVar != null && (interfaceC2557aB2 = bVar.b()) != null && (dVarF2 = interfaceC2557aB2.f()) != null) {
                        lVar = (com.ubnt.usurvey.product.l) dVarF2.N();
                    }
                    return hVar2.o(lVar, AbstractC5210h.b.C1557b.f44497a);
                case 6:
                case 7:
                case 8:
                    h hVar3 = h.this;
                    if (bVar != null && (interfaceC2557aB3 = bVar.b()) != null && (dVarF3 = interfaceC2557aB3.f()) != null) {
                        lVar = (com.ubnt.usurvey.product.l) dVarF3.N();
                    }
                    return hVar3.s(lVar, AbstractC5210h.b.a.f44496a);
                case 9:
                case 10:
                    h hVar4 = h.this;
                    if (bVar != null && (interfaceC2557aB4 = bVar.b()) != null && (dVarF4 = interfaceC2557aB4.f()) != null) {
                        lVar = (com.ubnt.usurvey.product.l) dVarF4.N();
                    }
                    return hVar4.s(lVar, AbstractC5210h.b.C1557b.f44497a);
                case 11:
                case 12:
                case 13:
                case 14:
                    h hVar5 = h.this;
                    if (bVar != null && (interfaceC2557aB5 = bVar.b()) != null && (dVarF5 = interfaceC2557aB5.f()) != null) {
                        lVar = (com.ubnt.usurvey.product.l) dVarF5.N();
                    }
                    return hVar5.s(lVar, AbstractC5210h.a.f44495a);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4183a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C5213k it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it);
        }
    }

    public static final class d implements gg.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f4184a;

        public d(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f4184a = bVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                c.a aVarW = this.f4184a.w();
                nf.f fVar = null;
                if (aVarW != null) {
                    String strC = aVarW.c();
                    fVar = new nf.f(null, strC != null ? new d.c(strC) : null);
                }
                interfaceC5910A.onSuccess(new C6556a(fVar));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(com.ui.wifiman.model.speedtest.advanced.b it) {
            AbstractC6492s.i(it, "it");
            return h.this.r(it);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<InterfaceC6293b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<InterfaceC6454d> {
    }

    /* renamed from: E8.h$h, reason: collision with other inner class name */
    static final class C0180h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0180h f4186a = new C0180h();

        C0180h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Wc.b bVar) throws URISyntaxException {
            c.b bVar2;
            URL urlA;
            AbstractC6492s.i(bVar, "<destruct>");
            C6455e c6455e = (C6455e) bVar.a();
            if (c6455e == null || (urlA = c6455e.a()) == null) {
                bVar2 = null;
            } else {
                URI uri = urlA.toURI();
                AbstractC6492s.h(uri, "toURI(...)");
                bVar2 = new c.b(uri, N9.b.f16117a.B(), null, null, 12, null);
            }
            return new C6556a(bVar2);
        }
    }

    static final class i implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final i f4187a = new i();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4188a;

            static {
                int[] iArr = new int[b.EnumC1419b.values().length];
                try {
                    iArr[b.EnumC1419b.CONSOLE_LATENCY_CHECK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.EnumC1419b.CONSOLE_DOWNLOAD_SETUP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.EnumC1419b.CONSOLE_DOWNLOAD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.EnumC1419b.CONSOLE_UPLOAD_SETUP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.EnumC1419b.CONSOLE_UPLOAD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b.EnumC1419b.EVALUATION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[b.EnumC1419b.DOWNLOAD_SETUP.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[b.EnumC1419b.DOWNLOAD.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[b.EnumC1419b.UPLOAD_SETUP.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[b.EnumC1419b.UPLOAD.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[b.EnumC1419b.RESULT_SAVE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[b.EnumC1419b.RESULT_REPORT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[b.EnumC1419b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[b.EnumC1419b.END.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                f4188a = iArr;
            }
        }

        i() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(C6292a.b myself, C6556a c6556a, com.ui.wifiman.model.speedtest.advanced.b speedtestState, C6556a c6556a2) {
            InterfaceC7929a interfaceC7929aO;
            t.c.a aVar;
            t.c.a aVar2;
            InterfaceC7929a aVar3;
            Speedtest.a aVar4;
            Speedtest.a aVar5;
            Speedtest.a aVar6;
            Speedtest.a aVar7;
            InterfaceC2557a interfaceC2557aB;
            AbstractC6492s.i(myself, "myself");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(speedtestState, "speedtestState");
            AbstractC6492s.i(c6556a2, "<destruct>");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            InterfaceC7929a interfaceC7929aB = (c.b) c6556a2.a();
            if (interfaceC7929aB == null) {
                interfaceC7929aB = N9.b.f16117a.B();
            }
            t.b bVar2 = new t.b(interfaceC7929aB);
            if (bVar == null || (interfaceC2557aB = bVar.b()) == null || (interfaceC7929aO = AbstractC6912m.f(interfaceC2557aB, m.c.NORMAL, null, 2, null)) == null) {
                interfaceC7929aO = Pe.a.f18599a.o();
            }
            t.b bVar3 = new t.b(interfaceC7929aO);
            b.EnumC1419b enumC1419bR = speedtestState.r();
            int[] iArr = a.f4188a;
            switch (iArr[enumC1419bR.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    aVar = t.c.a.IDLE;
                    break;
                case 6:
                    aVar = t.c.a.IDLE;
                    break;
                case 7:
                case 8:
                    aVar = t.c.a.DOWN;
                    break;
                case 9:
                case 10:
                    aVar = t.c.a.UP;
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                    aVar = t.c.a.COMPLETE;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            t.c.a aVar8 = aVar;
            j.d dVar = (j.d) speedtestState.t().b();
            AbstractC4075b abstractC4075bA = dVar != null ? AbstractC4075b.f33002a.a(dVar.b()) : null;
            j.d dVar2 = (j.d) speedtestState.t().b();
            Integer numA = dVar2 != null ? dVar2.a() : null;
            Speedtest.f fVarA = speedtestState.a();
            if (!(fVarA instanceof Speedtest.f.a)) {
                fVarA = null;
            }
            W7.a aVarB = (fVarA == null || (aVar7 = (Speedtest.a) fVarA.b()) == null) ? null : W7.a.f23676b.b(aVar7.a());
            Speedtest.f fVarI = speedtestState.i();
            if (!(fVarI instanceof Speedtest.f.a)) {
                fVarI = null;
            }
            t.c cVar = new t.c(aVar8, abstractC4075bA, numA, aVarB, (fVarI == null || (aVar6 = (Speedtest.a) fVarI.b()) == null) ? null : W7.a.f23676b.b(aVar6.a()));
            switch (iArr[speedtestState.r().ordinal()]) {
                case 1:
                    aVar2 = t.c.a.IDLE;
                    break;
                case 2:
                case 3:
                    aVar2 = t.c.a.DOWN;
                    break;
                case 4:
                case 5:
                    aVar2 = t.c.a.UP;
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    aVar2 = t.c.a.COMPLETE;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            t.c.a aVar9 = aVar2;
            Integer num = (Integer) speedtestState.o().b();
            AbstractC4075b abstractC4075bA2 = num != null ? AbstractC4075b.f33002a.a(num.intValue()) : null;
            Integer num2 = (Integer) speedtestState.n().b();
            Integer numValueOf = num2 != null ? Integer.valueOf(num2.intValue()) : null;
            Speedtest.f fVarL = speedtestState.l();
            if (!(fVarL instanceof Speedtest.f.a)) {
                fVarL = null;
            }
            W7.a aVarB2 = (fVarL == null || (aVar5 = (Speedtest.a) fVarL.b()) == null) ? null : W7.a.f23676b.b(aVar5.a());
            Speedtest.f fVarP = speedtestState.p();
            if (!(fVarP instanceof Speedtest.f.a)) {
                fVarP = null;
            }
            t.c cVar2 = new t.c(aVar9, abstractC4075bA2, numValueOf, aVarB2, (fVarP == null || (aVar4 = (Speedtest.a) fVarP.b()) == null) ? null : W7.a.f23676b.b(aVar4.a()));
            InterfaceC2557a interfaceC2557aB2 = myself.b();
            if (interfaceC2557aB2 == null || (aVar3 = AbstractC6912m.f(interfaceC2557aB2, m.c.NORMAL, null, 2, null)) == null) {
                aVar3 = new c.a(2131166181, null, 2, null);
            }
            return new C6556a(new t.a.C1805a(bVar2, cVar2, bVar3, cVar, new t.b(aVar3)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gg.i speedtestStream, DI di2) {
        super(speedtestStream);
        AbstractC6492s.i(speedtestStream, "speedtestStream");
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, InterfaceC6293b.class), null);
        th.l[] lVarArr = f4172p;
        this.f4174j = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4175k = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, InterfaceC6454d.class), null).a(this, lVarArr[1]);
        this.f4176l = true;
        gg.i iVarX0 = j().x0(new e());
        AbstractC6492s.h(iVarX0, "flatMapSingle(...)");
        this.f4177m = iVarX0;
        gg.i iVarW = gg.i.t(u().b(), u().d(), j(), t().a().N0(C0180h.f4186a).W(), i.f4187a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f4178n = iVarW;
        gg.i iVarW2 = gg.i.v(j(), u().d(), new b()).N0(c.f4183a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f4179o = iVarW2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5213k o(com.ubnt.usurvey.product.l lVar, AbstractC5210h.b bVar) {
        s9.b bVarQ;
        C5211i c5211i = new C5211i(N9.b.f16117a.B());
        if (lVar == null || (bVarQ = k8.j.a(lVar)) == null) {
            bVarQ = q();
        }
        return new C5213k(c5211i, AbstractC3689v.e(new C5212j(new C5211i(bVarQ), bVar)));
    }

    private final s9.b q() {
        return Pe.a.f18599a.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.z r(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        gg.z zVarI = gg.z.i(new d(bVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5213k s(com.ubnt.usurvey.product.l lVar, AbstractC5210h abstractC5210h) {
        s9.b bVarQ;
        if (lVar == null || (bVarQ = k8.j.a(lVar)) == null) {
            bVarQ = q();
        }
        return new C5213k(new C5211i(bVarQ), AbstractC3689v.e(new C5212j(new C5211i(N9.b.f16117a.I()), abstractC5210h)));
    }

    private final InterfaceC6454d t() {
        return (InterfaceC6454d) this.f4175k.getValue();
    }

    private final InterfaceC6293b u() {
        return (InterfaceC6293b) this.f4174j.getValue();
    }

    @Override // E8.k
    public gg.i d() {
        return this.f4179o;
    }

    @Override // E8.k
    public gg.i g() {
        return this.f4177m;
    }

    @Override // E8.k
    public boolean h() {
        return this.f4176l;
    }

    @Override // E8.k
    public gg.i k() {
        return this.f4178n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E8.k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long e(com.ui.wifiman.model.speedtest.advanced.b state) {
        AbstractC6492s.i(state, "state");
        switch (a.f4180a[state.r().ordinal()]) {
            case 1:
                if (((Integer) state.e().b()) != null) {
                    return Long.valueOf(r3.intValue());
                }
                return null;
            case 2:
            case 3:
                Speedtest.a aVar = (Speedtest.a) state.l().b();
                if (aVar != null) {
                    return Long.valueOf(aVar.a());
                }
                return null;
            case 4:
            case 5:
                Speedtest.a aVar2 = (Speedtest.a) state.p().b();
                if (aVar2 != null) {
                    return Long.valueOf(aVar2.a());
                }
                return null;
            case 6:
                if (((j.d) state.t().b()) != null) {
                    return Long.valueOf(r3.b());
                }
                return null;
            case 7:
            case 8:
                Speedtest.a aVar3 = (Speedtest.a) state.a().b();
                if (aVar3 != null) {
                    return Long.valueOf(aVar3.a());
                }
                return null;
            case 9:
            case 10:
                Speedtest.a aVar4 = (Speedtest.a) state.i().b();
                if (aVar4 != null) {
                    return Long.valueOf(aVar4.a());
                }
                return null;
            case 11:
            case 12:
            case 13:
            case 14:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
