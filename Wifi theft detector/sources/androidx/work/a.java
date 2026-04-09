package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4329a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4330b;

    /* renamed from: c, reason: collision with root package name */
    public final t f4331c;

    /* renamed from: d, reason: collision with root package name */
    public final i f4332d;

    /* renamed from: e, reason: collision with root package name */
    public final p f4333e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4334f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4335g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4336h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4337i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4338j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4339k;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0051a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f4340a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f4341b;

        public ThreadFactoryC0051a(boolean z10) {
            this.f4341b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f4341b ? "WM.task-" : "androidx.work-") + this.f4340a.incrementAndGet());
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Executor f4343a;

        /* renamed from: b, reason: collision with root package name */
        public t f4344b;

        /* renamed from: c, reason: collision with root package name */
        public i f4345c;

        /* renamed from: d, reason: collision with root package name */
        public Executor f4346d;

        /* renamed from: e, reason: collision with root package name */
        public p f4347e;

        /* renamed from: f, reason: collision with root package name */
        public String f4348f;

        /* renamed from: g, reason: collision with root package name */
        public int f4349g = 4;

        /* renamed from: h, reason: collision with root package name */
        public int f4350h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f4351i = Integer.MAX_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public int f4352j = 20;

        public a a() {
            return new a(this);
        }
    }

    public a(b bVar) {
        Executor executor = bVar.f4343a;
        if (executor == null) {
            this.f4329a = a(false);
        } else {
            this.f4329a = executor;
        }
        Executor executor2 = bVar.f4346d;
        if (executor2 == null) {
            this.f4339k = true;
            this.f4330b = a(true);
        } else {
            this.f4339k = false;
            this.f4330b = executor2;
        }
        t tVar = bVar.f4344b;
        if (tVar == null) {
            this.f4331c = t.c();
        } else {
            this.f4331c = tVar;
        }
        i iVar = bVar.f4345c;
        if (iVar == null) {
            this.f4332d = i.c();
        } else {
            this.f4332d = iVar;
        }
        p pVar = bVar.f4347e;
        if (pVar == null) {
            this.f4333e = new d2.a();
        } else {
            this.f4333e = pVar;
        }
        this.f4335g = bVar.f4349g;
        this.f4336h = bVar.f4350h;
        this.f4337i = bVar.f4351i;
        this.f4338j = bVar.f4352j;
        this.f4334f = bVar.f4348f;
    }

    public final Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    public final ThreadFactory b(boolean z10) {
        return new ThreadFactoryC0051a(z10);
    }

    public String c() {
        return this.f4334f;
    }

    public g d() {
        return null;
    }

    public Executor e() {
        return this.f4329a;
    }

    public i f() {
        return this.f4332d;
    }

    public int g() {
        return this.f4337i;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f4338j / 2 : this.f4338j;
    }

    public int i() {
        return this.f4336h;
    }

    public int j() {
        return this.f4335g;
    }

    public p k() {
        return this.f4333e;
    }

    public Executor l() {
        return this.f4330b;
    }

    public t m() {
        return this.f4331c;
    }
}
