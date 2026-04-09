package L4;

import I4.g;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f11227e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f11228f;

    /* renamed from: a, reason: collision with root package name */
    public final e f11229a;

    /* renamed from: b, reason: collision with root package name */
    public final e f11230b;

    /* renamed from: c, reason: collision with root package name */
    public final e f11231c;

    /* renamed from: d, reason: collision with root package name */
    public final e f11232d;

    public static final class a {

        /* renamed from: L4.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0444a extends C6490p implements InterfaceC6824a {
            C0444a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).k());
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f11233a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must be called on a background thread, was called on " + f.f11227e.j() + '.';
            }
        }

        /* synthetic */ class c extends C6490p implements InterfaceC6824a {
            c(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).l());
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f11234a = new d();

            d() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must be called on a blocking thread, was called on " + f.f11227e.j() + '.';
            }
        }

        /* synthetic */ class e extends C6490p implements InterfaceC6824a {
            e(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).m());
            }
        }

        /* renamed from: L4.f$a$f, reason: collision with other inner class name */
        static final class C0445f extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0445f f11235a = new C0445f();

            C0445f() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must not be called on a main thread, was called on " + f.f11227e.j() + '.';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void h(InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2) {
            if (((Boolean) interfaceC6824a.invoke()).booleanValue()) {
                return;
            }
            g.f().b((String) interfaceC6824a2.invoke());
            i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String j() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k() {
            String threadName = j();
            AbstractC6492s.h(threadName, "threadName");
            return t.W(threadName, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l() {
            String threadName = j();
            AbstractC6492s.h(threadName, "threadName");
            return t.W(threadName, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void e() {
            h(new C0444a(this), b.f11233a);
        }

        public final void f() {
            h(new c(this), d.f11234a);
        }

        public final void g() {
            h(new e(this), C0445f.f11235a);
        }

        public final boolean i() {
            return f.f11228f;
        }

        public final void n(boolean z10) {
            f.f11228f = z10;
        }

        private a() {
        }
    }

    public f(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        AbstractC6492s.i(backgroundExecutorService, "backgroundExecutorService");
        AbstractC6492s.i(blockingExecutorService, "blockingExecutorService");
        this.f11229a = new e(backgroundExecutorService);
        this.f11230b = new e(backgroundExecutorService);
        this.f11231c = new e(backgroundExecutorService);
        this.f11232d = new e(blockingExecutorService);
    }

    public static final void c() {
        f11227e.e();
    }

    public static final void d() {
        f11227e.f();
    }

    public static final void e() {
        f11227e.g();
    }

    public static final void f(boolean z10) {
        f11227e.n(z10);
    }
}
