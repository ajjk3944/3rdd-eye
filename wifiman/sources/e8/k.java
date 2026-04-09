package E8;

import E8.k;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.speedtest.Speedtest;
import ff.EnumC5820a;
import gg.InterfaceC5910A;
import hf.C6036h;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import l9.AbstractC6561f;
import l9.C6556a;
import m9.C6783c;
import mh.InterfaceC6835l;
import s9.d;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: h, reason: collision with root package name */
    public static final b f4203h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f4204i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final gg.i f4205a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f4206b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f4207c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4208d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f4209e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f4210f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f4211g;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4223a;

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
                iArr[Speedtest.e.DOWNLOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Speedtest.e.UPLOAD_INIT.ordinal()] = 5;
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
            f4223a = iArr;
        }
    }

    static final class d implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f4225a;

            a(N n10) {
                this.f4225a = n10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Long it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(this.f4225a.f51689a);
            }
        }

        static final class b implements kg.p {

            /* renamed from: a, reason: collision with root package name */
            public static final b f4226a = new b();

            b() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(C6556a it) {
                AbstractC6492s.i(it, "it");
                return !(it.b() == null);
            }
        }

        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f4227a;

            c(N n10) {
                this.f4227a = n10;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Speedtest.d it) {
                AbstractC6492s.i(it, "it");
                this.f4227a.f51689a = it;
            }
        }

        /* renamed from: E8.k$d$d, reason: collision with other inner class name */
        static final class C0183d implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f4228a;

            C0183d(a aVar) {
                this.f4228a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(Speedtest.d speedtestState) {
                AbstractC6492s.i(speedtestState, "speedtestState");
                return this.f4228a.j(speedtestState);
            }
        }

        static final class e implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f4229a = new e();

            e() {
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final nf.b apply(nf.b previous, C6556a c6556a) {
                AbstractC6492s.i(previous, "previous");
                AbstractC6492s.i(c6556a, "<destruct>");
                C6036h c6036h = (C6036h) c6556a.a();
                return c6036h != null ? new nf.b(true, c6036h) : new nf.b(false, previous.a());
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            a aVar = (a) sVar.a();
            gg.y yVar = (gg.y) sVar.c();
            N n10 = new N();
            gg.i iVarU0 = gg.i.H0(50L, TimeUnit.MILLISECONDS, yVar).e1().N0(new a(n10)).e1().Y0(Gg.a.a(), false, 1).m0(b.f4226a).U0(k.this.j().f0(new c(n10)).E0());
            AbstractC6492s.h(iVarU0, "mergeWith(...)");
            return AbstractC6561f.e(iVarU0).K(new C0183d(aVar)).q1(nf.b.f54638c.a(), e.f4229a);
        }
    }

    public static final class e implements gg.C {
        public e() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Yg.z.a(new a(k.this, 0, 0, null, 7, null), C6783c.f53633a.h("SpeedtestChart")));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class f implements kg.n {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4232a;

            static {
                int[] iArr = new int[nf.g.values().length];
                try {
                    iArr[nf.g.LATENCY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nf.g.DOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[nf.g.UP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4232a = iArr;
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nf.c apply(Speedtest.d state) {
            boolean zH;
            d.c cVar;
            AbstractC6492s.i(state, "state");
            nf.g gVarB = k.this.b(state);
            int[] iArr = a.f4232a;
            int i10 = iArr[gVarB.ordinal()];
            if (i10 == 1) {
                zH = k.this.h();
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                zH = k.this.e(state) != null;
            }
            int i11 = iArr[gVarB.ordinal()];
            if (i11 == 1) {
                Long lE = k.this.e(state);
                if (lE != null) {
                    String str = String.format("%d", Arrays.copyOf(new Object[]{Long.valueOf(lE.longValue())}, 1));
                    AbstractC6492s.h(str, "format(...)");
                    cVar = new d.c(str);
                } else {
                    cVar = new d.c("");
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (k.this.e(state) != null) {
                    String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(r1.longValue() / 1000000.0d)}, 1));
                    AbstractC6492s.h(str2, "format(...)");
                    cVar = new d.c(str2);
                } else {
                    cVar = new d.c("");
                }
            }
            s9.d dVarF = k.this.f(state);
            if (dVarF == null) {
                dVarF = new d.c("");
            }
            return new nf.c(zH, gVarB, cVar, dVarF);
        }
    }

    static final class g implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final g f4233a = new g();

        g() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nf.c apply(nf.c previous, nf.c current) {
            AbstractC6492s.i(previous, "previous");
            AbstractC6492s.i(current, "current");
            return current.f() ? current : nf.c.b(previous, false, null, null, null, 14, null);
        }
    }

    public k(gg.i speedtestStream) {
        AbstractC6492s.i(speedtestStream, "speedtestStream");
        gg.i iVarI2 = speedtestStream.o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f4205a = iVarI2;
        gg.z zVarI = gg.z.i(new e());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI22 = zVarI.w(new d()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f4206b = iVarI22;
        gg.i iVarK0 = gg.i.K0(new C6556a(null));
        AbstractC6492s.h(iVarK0, "just(...)");
        this.f4207c = iVarK0;
        gg.i iVarI23 = iVarI2.N0(new f()).q1(nf.c.f54641e.a(), g.f4233a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f4209e = iVarI23;
        gg.i iVarK02 = gg.i.K0(new C6556a(null));
        AbstractC6492s.h(iVarK02, "just(...)");
        this.f4210f = iVarK02;
        gg.i iVarK03 = gg.i.K0(new C6556a(null));
        AbstractC6492s.h(iVarK03, "just(...)");
        this.f4211g = iVarK03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nf.g b(Speedtest.d dVar) {
        switch (c.f4223a[dVar.h().ordinal()]) {
            case 1:
            case 2:
                return nf.g.LATENCY;
            case 3:
            case 4:
                return nf.g.DOWN;
            case 5:
            case 6:
            case 7:
            case 8:
                return nf.g.UP;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public gg.i c() {
        return this.f4206b;
    }

    public gg.i d() {
        return this.f4211g;
    }

    protected Long e(Speedtest.d state) {
        AbstractC6492s.i(state, "state");
        switch (c.f4223a[state.h().ordinal()]) {
            case 1:
            case 2:
                return Long.valueOf(((Integer) state.e().b()) != null ? r5.intValue() : 0L);
            case 3:
            case 4:
                Speedtest.a aVar = (Speedtest.a) state.a().b();
                return Long.valueOf(aVar != null ? aVar.a() : 0L);
            case 5:
            case 6:
                Speedtest.a aVar2 = (Speedtest.a) state.i().b();
                if (aVar2 != null) {
                    return Long.valueOf(aVar2.a());
                }
                return null;
            case 7:
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    protected s9.d f(Speedtest.d state) {
        AbstractC6492s.i(state, "state");
        switch (c.f4223a[state.h().ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new d.b(R.string.unit_mbps);
            case 2:
                return new d.b(R.string.unit_ms);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public abstract gg.i g();

    public boolean h() {
        return this.f4208d;
    }

    public gg.i i() {
        return this.f4209e;
    }

    public final gg.i j() {
        return this.f4205a;
    }

    public abstract gg.i k();

    /* JADX INFO: Access modifiers changed from: private */
    final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f4212a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6835l f4213b;

        /* renamed from: c, reason: collision with root package name */
        private final long f4214c;

        /* renamed from: d, reason: collision with root package name */
        private final LinkedList f4215d;

        /* renamed from: e, reason: collision with root package name */
        private long f4216e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f4217f;

        /* renamed from: E8.k$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0182a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4218a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f4219b;

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
                    iArr[Speedtest.e.DOWNLOAD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Speedtest.e.UPLOAD_INIT.ordinal()] = 5;
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
                f4218a = iArr;
                int[] iArr2 = new int[nf.g.values().length];
                try {
                    iArr2[nf.g.LATENCY.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[nf.g.DOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[nf.g.UP.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                f4219b = iArr2;
            }
        }

        public static final class b implements gg.C {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f4221b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Speedtest.d f4222c;

            public b(k kVar, Speedtest.d dVar) {
                this.f4221b = kVar;
                this.f4222c = dVar;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                C6556a c6556a;
                EnumC5820a enumC5820a;
                try {
                    synchronized (a.this) {
                        try {
                            Long lE = this.f4221b.e(this.f4222c);
                            if (lE != null) {
                                a.this.f4216e = Math.max(lE.longValue(), a.this.f4216e);
                                a.this.f4215d.add(lE);
                                if (a.this.f4215d.size() > a.this.f4212a) {
                                    a.this.f4215d.removeFirst();
                                }
                            } else if (((Boolean) a.this.f4213b.invoke(this.f4222c)).booleanValue()) {
                                a.this.f4215d.clear();
                            }
                            LinkedList linkedList = a.this.f4215d;
                            C6036h c6036hI = null;
                            if (linkedList.isEmpty()) {
                                linkedList = null;
                            }
                            if (linkedList != null) {
                                a aVar = a.this;
                                int i10 = C0182a.f4219b[this.f4221b.b(this.f4222c).ordinal()];
                                if (i10 == 1 || i10 == 2) {
                                    enumC5820a = EnumC5820a.DOWN;
                                } else {
                                    if (i10 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    enumC5820a = EnumC5820a.UP;
                                }
                                c6036hI = aVar.i(enumC5820a);
                            }
                            c6556a = new C6556a(c6036hI);
                        } finally {
                        }
                    }
                    interfaceC5910A.onSuccess(c6556a);
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        public a(k kVar, int i10, int i11, InterfaceC6835l clearAtStep) {
            AbstractC6492s.i(clearAtStep, "clearAtStep");
            this.f4217f = kVar;
            this.f4212a = i11;
            this.f4213b = clearAtStep;
            long j10 = i10 * 1000000;
            this.f4214c = j10;
            this.f4215d = new LinkedList();
            this.f4216e = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(Speedtest.d it) {
            AbstractC6492s.i(it, "it");
            switch (C0182a.f4218a[it.h().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return true;
                case 7:
                case 8:
                    return false;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C6036h i(EnumC5820a enumC5820a) {
            C6036h c6036h;
            float fMin;
            synchronized (this) {
                try {
                    int i10 = this.f4212a;
                    float[] fArr = new float[i10];
                    double d10 = this.f4216e;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (((Long) AbstractC3689v.t0(this.f4215d, ((r5.size() - 1) - this.f4212a) + i11)) != null) {
                            double dLongValue = r5.longValue() / d10;
                            fMin = (float) ((0.8d * dLongValue) + Math.min(0.2d, dLongValue * 10));
                        } else {
                            fMin = 0.0f;
                        }
                        fArr[i11] = fMin;
                    }
                    c6036h = new C6036h(enumC5820a, fArr);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c6036h;
        }

        public final gg.z j(Speedtest.d state) {
            AbstractC6492s.i(state, "state");
            gg.z zVarI = gg.z.i(new b(this.f4217f, state));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }

        public /* synthetic */ a(k kVar, int i10, int i11, InterfaceC6835l interfaceC6835l, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, (i12 & 1) != 0 ? 10 : i10, (i12 & 2) != 0 ? 60 : i11, (i12 & 4) != 0 ? new InterfaceC6835l() { // from class: E8.j
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(k.a.b((Speedtest.d) obj));
                }
            } : interfaceC6835l);
        }
    }
}
