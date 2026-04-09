package j$.util.stream;

/* loaded from: classes2.dex */
public final class H3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f20876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f20877b;

    public H3(Runnable runnable, Runnable runnable2) {
        this.f20876a = runnable;
        this.f20877b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f20876a.run();
            this.f20877b.run();
        } catch (Throwable th) {
            try {
                this.f20877b.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
