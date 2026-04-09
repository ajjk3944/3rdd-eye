package F3;

import android.content.Context;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: h, reason: collision with root package name */
    private static final ExecutorService f5901h = Executors.newSingleThreadExecutor();

    /* renamed from: i, reason: collision with root package name */
    private static final ExecutorService f5902i = Executors.newSingleThreadExecutor();

    /* renamed from: j, reason: collision with root package name */
    public static final long f5903j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    private static f0 f5904k;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5905a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5906b;

    /* renamed from: c, reason: collision with root package name */
    private final E f5907c;

    /* renamed from: d, reason: collision with root package name */
    private final d0 f5908d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f5909e;

    /* renamed from: f, reason: collision with root package name */
    private final i0 f5910f;

    /* renamed from: g, reason: collision with root package name */
    private final g0 f5911g;

    private f0(Context context, E e10, g0 g0Var, D d10) {
        ExecutorService executorService = f5901h;
        ExecutorService executorService2 = f5902i;
        this.f5909e = new TreeMap();
        context.getApplicationContext();
        this.f5907c = e10;
        this.f5905a = executorService;
        this.f5906b = executorService2;
        this.f5911g = g0Var;
        this.f5908d = new d0(context, d10.b(), d10.a(), "firebase", 5L, 5L, g0Var);
        this.f5910f = new i0(context);
    }

    public static synchronized f0 a(Context context) {
        try {
            if (f5904k == null) {
                f5904k = new f0(context, E.a(context), new g0(context), I.f5860a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f5904k;
    }
}
