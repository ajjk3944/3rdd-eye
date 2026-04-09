package E8;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import com.ui.wifiman.model.speedtest.internet.f;
import gg.InterfaceC5910A;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import kd.C6455e;
import kd.InterfaceC6454d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.c;
import s9.d;

/* loaded from: classes3.dex */
public final class l extends k {

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4234n = {O.h(new kotlin.jvm.internal.F(l.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new kotlin.jvm.internal.F(l.class, "publicIpService", "getPublicIpService()Lcom/ui/wifiman/model/publicip/PublicIP$Service;", 0))};

    /* renamed from: o, reason: collision with root package name */
    public static final int f4235o = 8;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f4236j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f4237k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f4238l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f4239m;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4240a;

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
                iArr[f.b.SERVER_EVALUATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.b.SERVER_WAKEUP.ordinal()] = 4;
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
                iArr[f.b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f.b.RESULT_REPORT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f.b.END.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f4240a = iArr;
        }
    }

    public static final class b implements gg.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f4241a;

        public b(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f4241a = fVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                InternetSpeedtest.b bVarA = com.ui.wifiman.model.speedtest.internet.g.a(this.f4241a);
                nf.f fVar = null;
                if (bVarA != null) {
                    if (bVarA instanceof InternetSpeedtest.b.a) {
                        String strC = ((InternetSpeedtest.b.a) bVarA).c();
                        fVar = new nf.f(null, strC != null ? new d.c(strC) : null);
                    } else {
                        if (!(bVarA instanceof InternetSpeedtest.b.C1420b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String strC2 = ((InternetSpeedtest.b.C1420b) bVarA).c();
                        String strH = ((InternetSpeedtest.b.C1420b) bVarA).h();
                        String strI = ((InternetSpeedtest.b.C1420b) bVarA).i();
                        List listB = com.ui.wifiman.model.speedtest.internet.g.b(this.f4241a);
                        fVar = new nf.f(null, new d.a(strC2 + strH + strI + (listB != null ? Integer.valueOf(listB.size()) : null), new c(bVarA, this.f4241a)));
                    }
                }
                interfaceC5910A.onSuccess(new C6556a(fVar));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InternetSpeedtest.b f4242a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f4243b;

        c(InternetSpeedtest.b bVar, com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f4242a = bVar;
            this.f4243b = fVar;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(396594718);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(396594718, i10, -1, "com.ubnt.usurvey.ui.speedtest.InternetSpeedtestSession.getInternetServerProvider.<anonymous>.<anonymous>.<anonymous> (InternetSpeedtestSession.kt:73)");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC3689v.z0(AbstractC3689v.q(((InternetSpeedtest.b.C1420b) this.f4242a).c(), ((InternetSpeedtest.b.C1420b) this.f4242a).h(), ((InternetSpeedtest.b.C1420b) this.f4242a).i()), ", ", null, null, 0, null, null, 62, null));
            List listB = com.ui.wifiman.model.speedtest.internet.g.b(this.f4243b);
            if (listB != null) {
                Integer numValueOf = Integer.valueOf(listB.size());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    sb2.append(" ");
                    String string = context.getString(R.string.speedtest_result_detail_test_server_secondary_server_count_format);
                    AbstractC6492s.h(string, "getString(...)");
                    String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
                    AbstractC6492s.h(str, "format(...)");
                    sb2.append(str);
                }
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return sb2;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(com.ui.wifiman.model.speedtest.internet.f it) {
            AbstractC6492s.i(it, "it");
            return l.this.o(it);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<InterfaceC6454d> {
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f4245a = new g();

        g() {
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

    static final class h implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final h f4246a = new h();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4247a;

            static {
                int[] iArr = new int[Speedtest.e.values().length];
                try {
                    iArr[Speedtest.e.SETUP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Speedtest.e.LATENCY_CHECK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Speedtest.e.DOWNLOAD_INIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Speedtest.e.UPLOAD_INIT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Speedtest.e.DOWNLOAD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Speedtest.e.UPLOAD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Speedtest.e.RESULT_PROCESSING.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Speedtest.e.END.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f4247a = iArr;
            }
        }

        h() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final l9.C6556a a(Cc.j r11, com.ui.wifiman.model.speedtest.internet.f r12, l9.C6556a r13) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: E8.l.h.a(Cc.j, com.ui.wifiman.model.speedtest.internet.f, l9.a):l9.a");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gg.i speedtestStream, DI di2) {
        super(speedtestStream);
        AbstractC6492s.i(speedtestStream, "speedtestStream");
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, Cc.n.class), null);
        th.l[] lVarArr = f4234n;
        this.f4236j = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4237k = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, InterfaceC6454d.class), null).a(this, lVarArr[1]);
        gg.i iVarX0 = j().x0(new d());
        AbstractC6492s.h(iVarX0, "flatMapSingle(...)");
        this.f4238l = iVarX0;
        gg.i iVarW = gg.i.u(n().b(), j(), p().a().N0(g.f4245a).W(), h.f4246a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f4239m = iVarW;
    }

    private final Cc.n n() {
        return (Cc.n) this.f4236j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.z o(com.ui.wifiman.model.speedtest.internet.f fVar) {
        gg.z zVarI = gg.z.i(new b(fVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    private final InterfaceC6454d p() {
        return (InterfaceC6454d) this.f4237k.getValue();
    }

    @Override // E8.k
    public gg.i g() {
        return this.f4238l;
    }

    @Override // E8.k
    public gg.i k() {
        return this.f4239m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E8.k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long e(com.ui.wifiman.model.speedtest.internet.f state) {
        AbstractC6492s.i(state, "state");
        switch (a.f4240a[state.l().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            case 12:
                return null;
            case 5:
            case 6:
                Speedtest.a aVar = (Speedtest.a) state.a().b();
                return Long.valueOf(aVar != null ? aVar.a() : 0L);
            case 7:
            case 8:
                Speedtest.a aVar2 = (Speedtest.a) state.i().b();
                if (aVar2 != null) {
                    return Long.valueOf(aVar2.a());
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
