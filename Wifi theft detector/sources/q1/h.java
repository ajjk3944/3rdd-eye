package q1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class h implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f24004a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f24005b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public Runnable f24006c;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f24007a;

        public a(Runnable runnable) {
            this.f24007a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f24007a.run();
            } finally {
                h.this.a();
            }
        }
    }

    public h(Executor executor) {
        this.f24004a = executor;
    }

    public synchronized void a() {
        Runnable runnable = (Runnable) this.f24005b.poll();
        this.f24006c = runnable;
        if (runnable != null) {
            this.f24004a.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f24005b.offer(new a(runnable));
        if (this.f24006c == null) {
            a();
        }
    }
}
