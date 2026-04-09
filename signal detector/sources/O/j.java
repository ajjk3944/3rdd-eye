package O;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f3057a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f3057a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f3057a);
        super.run();
    }
}
