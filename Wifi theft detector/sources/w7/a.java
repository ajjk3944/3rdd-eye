package w7;

import a8.b;
import android.content.Context;
import b8.c;
import b8.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static a f24835d = new a();

    /* renamed from: a, reason: collision with root package name */
    public ExecutorService f24836a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24837b = false;

    /* renamed from: c, reason: collision with root package name */
    public long f24838c;

    /* renamed from: w7.a$a, reason: collision with other inner class name */
    public class RunnableC0497a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24839a;

        public RunnableC0497a(Context context) {
            this.f24839a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (f.c(this.f24839a)) {
                    return;
                }
                f.d(this.f24839a);
            } catch (Exception e10) {
                c.a("WYSubnetScanner initLocalDb exception", e10);
            }
        }
    }

    public static a b() {
        return f24835d;
    }

    public ExecutorService a() {
        if (this.f24836a == null) {
            this.f24836a = Executors.newCachedThreadPool();
        }
        return this.f24836a;
    }

    public void c(Context context) {
        new Thread(new RunnableC0497a(context)).start();
    }

    public Map d(Context context) {
        e(context);
        HashMap map = new HashMap();
        f.m(context, map);
        return map;
    }

    public void e(Context context) {
        if (System.currentTimeMillis() - this.f24838c > 5000) {
            this.f24838c = System.currentTimeMillis();
            new a8.a().f(new y7.a(context).d());
        }
    }

    public void f(Context context, z7.a aVar) {
        if (aVar != null) {
            new b().s(context, new y7.a(context).d(), aVar);
        }
    }
}
