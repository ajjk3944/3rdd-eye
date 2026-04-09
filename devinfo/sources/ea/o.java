package ea;

import android.os.Process;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22507a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f22508b;

    public /* synthetic */ o(int i4, Runnable runnable) {
        this.f22507a = i4;
        this.f22508b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f22507a) {
            case 0:
                try {
                    this.f22508b.run();
                    break;
                } catch (Exception e2) {
                    ii.a.k("Executor", "Background execution failure.", e2);
                    return;
                }
            case 1:
                this.f22508b.run();
                break;
            default:
                Process.setThreadPriority(10);
                this.f22508b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f22507a) {
            case 1:
                return this.f22508b.toString();
            default:
                return super.toString();
        }
    }
}
