package kotlinx.coroutines.debug.internal;

import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Result;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.x;
import l9.l;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22337a;

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement f22338b;

    /* renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f22339c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentWeakMap f22340d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f22341e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f22342f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f22343g;

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentWeakMap f22344h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ C0429b f22345i;

    public static final class a implements c9.c, d9.c {
    }

    /* renamed from: kotlinx.coroutines.debug.internal.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0429b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f22346a = AtomicIntegerFieldUpdater.newUpdater(C0429b.class, "installations$volatile");

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicLongFieldUpdater f22347b = AtomicLongFieldUpdater.newUpdater(C0429b.class, "sequenceNumber$volatile");
        private volatile /* synthetic */ int installations$volatile;
        private volatile /* synthetic */ long sequenceNumber$volatile;

        public C0429b() {
        }

        public /* synthetic */ C0429b(i iVar) {
            this();
        }
    }

    static {
        b bVar = new b();
        f22337a = bVar;
        f22338b = new a.a().b();
        f22339c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f22340d = new ConcurrentWeakMap(false, 1, null);
        f22341e = true;
        f22342f = true;
        f22343g = bVar.b();
        f22344h = new ConcurrentWeakMap(true);
        f22345i = new C0429b(null);
    }

    public final l b() {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            p.c(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            objB = Result.b((l) x.b(objNewInstance, 1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        return (l) (Result.g(objB) ? null : objB);
    }

    public final boolean c(a aVar) {
        throw null;
    }
}
