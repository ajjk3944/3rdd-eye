package q3;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f20709a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f20709a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f20709a);
        super.run();
    }
}
