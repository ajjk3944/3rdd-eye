package A5;

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f329b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static h f330c;

    /* renamed from: a, reason: collision with root package name */
    private F4.n f331a;

    private h() {
    }

    public static h c() {
        h hVar;
        synchronized (f329b) {
            AbstractC7901p.p(f330c != null, "MlKitContext has not been initialized");
            hVar = (h) AbstractC7901p.l(f330c);
        }
        return hVar;
    }

    public static h d(Context context) {
        h hVarE;
        synchronized (f329b) {
            hVarE = e(context, TaskExecutors.MAIN_THREAD);
        }
        return hVarE;
    }

    public static h e(Context context, Executor executor) {
        h hVar;
        synchronized (f329b) {
            AbstractC7901p.p(f330c == null, "MlKitContext is already initialized");
            h hVar2 = new h();
            f330c = hVar2;
            Context contextF = f(context);
            F4.n nVarE = F4.n.m(executor).d(F4.f.c(contextF, MlKitComponentDiscoveryService.class).b()).b(F4.c.s(contextF, Context.class, new Class[0])).b(F4.c.s(hVar2, h.class, new Class[0])).e();
            hVar2.f331a = nVarE;
            nVarE.p(true);
            hVar = f330c;
        }
        return hVar;
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public Object a(Class cls) {
        AbstractC7901p.p(f330c == this, "MlKitContext has been deleted");
        AbstractC7901p.l(this.f331a);
        return this.f331a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
