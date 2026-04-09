package cf;

import android.os.Process;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3733a;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f3734d;

    public /* synthetic */ k(Runnable runnable, int i10) {
        this.f3733a = i10;
        this.f3734d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f3733a) {
            case 0:
                this.f3734d.run();
                break;
            case 1:
                Process.setThreadPriority(0);
                this.f3734d.run();
                break;
            default:
                try {
                    this.f3734d.run();
                    break;
                } catch (Exception e4) {
                    kc.f.t("Executor", "Background execution failure.", e4);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f3733a) {
            case 0:
                return this.f3734d.toString();
            default:
                return super.toString();
        }
    }
}
