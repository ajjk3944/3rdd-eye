package rc;

import Zg.AbstractC3689v;
import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ui.wifiman.db.RoomPersistentInstance;
import fe.AbstractC5818i;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import hc.InterfaceC5974b;
import hg.InterfaceC6043c;
import j4.AbstractC6246a;
import j4.InterfaceC6247b;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kg.p;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import rc.h;

/* loaded from: classes4.dex */
public final class h implements InterfaceC7586b, InterfaceC7585a {

    /* renamed from: i, reason: collision with root package name */
    public static final b f60231i = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6247b f60232a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5974b f60233b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f60234c;

    /* renamed from: d, reason: collision with root package name */
    private final a f60235d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f60236e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5912b f60237f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC5912b f60238g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC5912b f60239h;

    private static final class a extends RoomPersistentInstance {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Mb.a dao) {
            super(dao);
            AbstractC6492s.i(dao, "dao");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ui.wifiman.db.RoomPersistentInstance
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Mb.c e(Mb.c persistent) {
            AbstractC6492s.i(persistent, "persistent");
            return persistent;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ui.wifiman.db.RoomPersistentInstance
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Mb.c f() {
            return new Mb.c(0, 0, null, false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ui.wifiman.db.RoomPersistentInstance
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Mb.c g(Mb.c instance) {
            AbstractC6492s.i(instance, "instance");
            return instance;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f60240a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.e("AppReview auto request error", it, null, 4, null);
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f60241a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("AppReview auto request subscribed", null, 2, null);
        }
    }

    static final class e implements n {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Mb.c c(Mb.c currentState) {
            int iC;
            AbstractC6492s.i(currentState, "currentState");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lF = currentState.f();
            int i10 = 1;
            if (lF != null) {
                long jLongValue = lF.longValue();
                Locale locale = Locale.US;
                Calendar calendar = Calendar.getInstance(locale);
                calendar.setTime(new Date(jLongValue));
                if (calendar.get(7) != Calendar.getInstance(locale).get(7)) {
                    Z7.b.h("Updating app lauch day count to " + (currentState.c() + 1), null, 2, null);
                    iC = currentState.c() + 1;
                } else {
                    Z7.b.h("lauch day stays at " + currentState.c(), null, 2, null);
                    iC = currentState.c();
                }
                i10 = iC;
            }
            return Mb.c.b(currentState, 0, i10, Long.valueOf(jCurrentTimeMillis), false, 9, null);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Mb.c cVar) {
            AbstractC6492s.i(cVar, "<unused var>");
            return h.this.f60235d.a(new InterfaceC6835l() { // from class: rc.i
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return h.e.c((Mb.c) obj);
                }
            });
        }
    }

    static final class f implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final f f60243a = new f();

        f() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Mb.c it) {
            AbstractC6492s.i(it, "it");
            return !it.d();
        }
    }

    static final class g implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f60245a;

            /* renamed from: rc.h$g$a$a, reason: collision with other inner class name */
            public static final class C2098a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f60246a;

                public C2098a(h hVar) {
                    this.f60246a = hVar;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a(h hVar) {
                this.f60245a = hVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Mb.c d(Mb.c it) {
                AbstractC6492s.i(it, "it");
                return Mb.c.b(it, 0, 0, null, true, 7, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e() {
                Z7.b.h("App review marked as shown", null, 2, null);
            }

            @Override // kg.n
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(AbstractC6246a reviewInfo) {
                AbstractC6492s.i(reviewInfo, "reviewInfo");
                AbstractC5912b abstractC5912bX = this.f60245a.f60235d.a(new InterfaceC6835l() { // from class: rc.j
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return h.g.a.d((Mb.c) obj);
                    }
                }).x(new InterfaceC6464a() { // from class: rc.k
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        h.g.a.e();
                    }
                });
                h hVar = this.f60245a;
                Activity activity = hVar.f60234c;
                if (activity == null) {
                    throw new IllegalStateException("no activity is registered");
                }
                AbstractC5912b abstractC5912bR = hVar.r(activity, reviewInfo);
                AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new C2098a(this.f60245a));
                AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
                return AbstractC5912b.p(abstractC5912bX, abstractC5912bR, abstractC5912bR2);
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Mb.c cVar) {
            AbstractC6492s.i(cVar, "<unused var>");
            return h.this.o().t(new a(h.this));
        }
    }

    /* renamed from: rc.h$h, reason: collision with other inner class name */
    static final class C2099h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2099h f60247a = new C2099h();

        C2099h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.e("App review error", it, null, 4, null);
            return AbstractC5912b.m();
        }
    }

    static final class i implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final i f60248a = new i();

        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Mb.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("App Review state emission " + it, null, 2, null);
        }
    }

    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f60249a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Mb.c reviewState) {
            AbstractC6492s.i(reviewState, "reviewState");
            boolean z10 = false;
            if (reviewState.d()) {
                Z7.b.h("App Review flow already shown, ignoring auto start", null, 2, null);
            } else if (reviewState.c() >= 5) {
                z10 = true;
            } else {
                Z7.b.h("App launch day count [" + reviewState.c() + "] not matched requirements [5]", null, 2, null);
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class k implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final k f60250a = new k();

        k() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Boolean showReviewFlow) {
            AbstractC6492s.i(showReviewFlow, "showReviewFlow");
            return showReviewFlow.booleanValue();
        }
    }

    static final class l implements n {
        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean showReviewFlow) {
            AbstractC6492s.i(showReviewFlow, "showReviewFlow");
            return showReviewFlow.booleanValue() ? AbstractC5912b.a0(2000L, TimeUnit.MILLISECONDS).g(h.this.a()) : AbstractC5912b.m();
        }
    }

    public h(InterfaceC6247b reviewManager, InterfaceC5974b toastService, Mb.a dao) {
        AbstractC6492s.i(reviewManager, "reviewManager");
        AbstractC6492s.i(toastService, "toastService");
        AbstractC6492s.i(dao, "dao");
        this.f60232a = reviewManager;
        this.f60233b = toastService;
        a aVar = new a(dao);
        this.f60235d = aVar;
        gg.i iVarI2 = aVar.b().f0(i.f60248a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f60236e = iVarI2;
        AbstractC5912b abstractC5912bT = iVarI2.o0().t(new e());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        AbstractC5912b abstractC5912bB = AbstractC5818i.b(abstractC5912bT);
        this.f60237f = abstractC5912bB;
        AbstractC5912b abstractC5912bT2 = iVarI2.N0(j.f60249a).m0(k.f60250a).o0().t(new l());
        AbstractC6492s.h(abstractC5912bT2, "flatMapCompletable(...)");
        AbstractC5912b abstractC5912bB2 = AbstractC5818i.b(abstractC5912bT2);
        this.f60238g = abstractC5912bB2;
        AbstractC5912b abstractC5912bY = AbstractC5912b.H(AbstractC3689v.o(abstractC5912bB, abstractC5912bB2)).z(c.f60240a).B(d.f60241a).y(new InterfaceC6464a() { // from class: rc.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                h.n();
            }
        });
        AbstractC6492s.h(abstractC5912bY, "doOnDispose(...)");
        this.f60239h = AbstractC5818i.b(abstractC5912bY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n() {
        Z7.b.h("AppReview auto request disposed", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z o() {
        z zVarE = z.i(new C() { // from class: rc.d
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                h.p(this.f60225a, interfaceC5910A);
            }
        }).O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        return zVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(h hVar, final InterfaceC5910A emitter) {
        AbstractC6492s.i(emitter, "emitter");
        hVar.f60232a.b().addOnCompleteListener(new OnCompleteListener() { // from class: rc.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                h.q(emitter, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(InterfaceC5910A interfaceC5910A, Task task) {
        AbstractC6492s.i(task, "task");
        if (task.isSuccessful()) {
            interfaceC5910A.onSuccess(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            exception = new IllegalStateException("failed to obtain review info or the error");
        }
        interfaceC5910A.c(exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b r(final Activity activity, final AbstractC6246a abstractC6246a) {
        AbstractC5912b abstractC5912bL = AbstractC5912b.r(new InterfaceC5915e() { // from class: rc.f
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                h.s(this.f60227a, activity, abstractC6246a, interfaceC5913c);
            }
        }).W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(h hVar, Activity activity, AbstractC6246a abstractC6246a, final InterfaceC5913c emitter) {
        AbstractC6492s.i(emitter, "emitter");
        Z7.b.h("Requesting the app review dialog", null, 2, null);
        hVar.f60232a.a(activity, abstractC6246a).addOnCompleteListener(new OnCompleteListener() { // from class: rc.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                h.t(emitter, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(InterfaceC5913c interfaceC5913c, Task task) {
        AbstractC6492s.i(task, "task");
        if (task.isSuccessful()) {
            Z7.b.h("App review request successfully completed", null, 2, null);
            interfaceC5913c.a();
        } else {
            Exception exception = task.getException();
            if (exception == null) {
                exception = new IllegalStateException("failed to request the review and obtain the errorr");
            }
            interfaceC5913c.c(exception);
        }
    }

    @Override // rc.InterfaceC7586b
    public AbstractC5912b a() {
        AbstractC5912b abstractC5912bO = this.f60236e.o0().r(f.f60243a).k(new g()).O(C2099h.f60247a);
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    @Override // rc.InterfaceC7585a
    public void b(Activity activity) {
        AbstractC6492s.i(activity, "activity");
        this.f60234c = activity;
    }

    @Override // rc.InterfaceC7586b
    public AbstractC5912b c() {
        return this.f60239h;
    }

    @Override // rc.InterfaceC7585a
    public void d(Activity activity) {
        AbstractC6492s.i(activity, "activity");
        if (AbstractC6492s.d(this.f60234c, activity)) {
            this.f60234c = null;
        }
    }
}
