package m2;

import Yg.J;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class y implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f53117a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f53118b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f53119c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f53120d;

    public y(Executor executor) {
        AbstractC6492s.i(executor, "executor");
        this.f53117a = executor;
        this.f53118b = new ArrayDeque();
        this.f53120d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable command, y this$0) {
        AbstractC6492s.i(command, "$command");
        AbstractC6492s.i(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.f53120d) {
            try {
                Object objPoll = this.f53118b.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f53119c = runnable;
                if (objPoll != null) {
                    this.f53117a.execute(runnable);
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        AbstractC6492s.i(command, "command");
        synchronized (this.f53120d) {
            try {
                this.f53118b.offer(new Runnable() { // from class: m2.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.b(command, this);
                    }
                });
                if (this.f53119c == null) {
                    c();
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
