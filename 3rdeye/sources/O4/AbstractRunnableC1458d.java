package O4;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable.java */
/* renamed from: O4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC1458d implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        a();
    }
}
