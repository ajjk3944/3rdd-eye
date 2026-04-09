package je;

import Yg.J;
import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import je.C6298D;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* renamed from: je.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6298D implements InterfaceC6297C {

    /* renamed from: a, reason: collision with root package name */
    private final T7.d f50740a;

    /* renamed from: b, reason: collision with root package name */
    private LinkedBlockingDeque f50741b;

    /* renamed from: c, reason: collision with root package name */
    private Fg.a f50742c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5912b f50743d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5912b f50744e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5912b f50745f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f50746g;

    /* renamed from: je.D$a */
    static final class a implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f50748b;

        a(long j10) {
            this.f50748b = j10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            C6298D c6298d = C6298D.this;
            return Boolean.valueOf(c6298d.g(c6298d.f50740a.a() - this.f50748b));
        }
    }

    /* renamed from: je.D$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f50749a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ fe.u f50750b;

        b(long j10, fe.u uVar) {
            this.f50749a = j10;
            this.f50750b = uVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.S(this.f50749a, TimeUnit.MILLISECONDS, this.f50750b.a());
        }
    }

    /* renamed from: je.D$c */
    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f50751a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Wifi Connection History - record subscribed", null, 2, null);
        }
    }

    /* renamed from: je.D$d */
    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f50752a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Wifi Connection History - record disposed", null, 2, null);
        }
    }

    /* renamed from: je.D$e */
    public static final class e implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f50754b;

        public e(long j10) {
            this.f50754b = j10;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                C6298D c6298d = C6298D.this;
                c6298d.h(c6298d.new a(this.f50754b));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: je.D$f */
    static final class f implements kg.n {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(C6298D c6298d, AbstractC6317r abstractC6317r) {
            return c6298d.f50741b.add(new Wc.c(c6298d.f50740a.a(), abstractC6317r));
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            b((AbstractC6317r) obj);
            return J.f24997a;
        }

        public final void b(final AbstractC6317r state) {
            AbstractC6492s.i(state, "state");
            final C6298D c6298d = C6298D.this;
            c6298d.h(new InterfaceC6824a() { // from class: je.E
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return Boolean.valueOf(C6298D.f.c(c6298d, state));
                }
            });
        }
    }

    public C6298D(u connectionService, fe.u schedulers, T7.d systemTimeProvider, long j10, long j11) {
        AbstractC6492s.i(connectionService, "connectionService");
        AbstractC6492s.i(schedulers, "schedulers");
        AbstractC6492s.i(systemTimeProvider, "systemTimeProvider");
        this.f50740a = systemTimeProvider;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f50741b = linkedBlockingDeque;
        Fg.a aVarK2 = Fg.a.k2(AbstractC3689v.i1(linkedBlockingDeque));
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f50742c = aVarK2;
        AbstractC5912b abstractC5912bE0 = connectionService.a().N0(new f()).E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f50743d = abstractC5912bE0;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new e(j10));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bP = abstractC5912bR.P(new b(j11, schedulers));
        AbstractC6492s.h(abstractC5912bP, "repeatWhen(...)");
        this.f50744e = abstractC5912bP;
        AbstractC5912b abstractC5912bF0 = AbstractC5912b.I(abstractC5912bE0, abstractC5912bP).B(c.f50751a).B(d.f50752a).W(schedulers.a()).f0().x0(1).l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f50745f = abstractC5912bF0;
        gg.i iVarI2 = this.f50742c.e1().Y0(schedulers.a(), false, 1).U0(a()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f50746g = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(long j10) {
        Iterator it = this.f50741b.iterator();
        AbstractC6492s.h(it, "iterator(...)");
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            Wc.c cVar = (Wc.c) it.next();
            if (!z10) {
                z10 = true;
            } else {
                if (cVar.c() > j10) {
                    break;
                }
                this.f50741b.removeFirst();
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(InterfaceC6824a interfaceC6824a) {
        if (((Boolean) interfaceC6824a.invoke()).booleanValue()) {
            this.f50742c.h(AbstractC3689v.i1(this.f50741b));
        }
    }

    @Override // je.InterfaceC6297C
    public AbstractC5912b a() {
        return this.f50745f;
    }

    @Override // je.InterfaceC6297C
    public gg.i b() {
        return this.f50746g;
    }

    public /* synthetic */ C6298D(u uVar, fe.u uVar2, T7.d dVar, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, uVar2, dVar, (i10 & 8) != 0 ? 35000L : j10, (i10 & 16) != 0 ? 2000L : j11);
    }
}
