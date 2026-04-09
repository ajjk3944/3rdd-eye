package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class un implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public un(oc2 oc2Var) {
        this.a = 1;
        this.b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + this.b.getAndIncrement());
                return thread;
            case 1:
                int andIncrement = this.b.getAndIncrement();
                return new Thread(runnable, ex0.j(new StringBuilder(String.valueOf(andIncrement).length() + 31), "AdWorker(SCION_TASK_EXECUTOR) #", andIncrement));
            default:
                int andIncrement2 = this.b.getAndIncrement();
                return new Thread(runnable, ex0.j(new StringBuilder(String.valueOf(andIncrement2).length() + 14), "AdWorker(NG) #", andIncrement2));
        }
    }

    public un(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new AtomicInteger(1);
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }
}
