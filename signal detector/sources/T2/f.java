package T2;

import android.os.Process;

/* loaded from: classes.dex */
public final class f extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3583a = 1;

    public /* synthetic */ f(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f3583a) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
    }

    public /* synthetic */ f(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
