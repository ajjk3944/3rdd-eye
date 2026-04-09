package j$.util.stream;

/* loaded from: classes2.dex */
public final class f8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f26581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f26582b;

    public f8(Runnable runnable, Runnable runnable2) {
        this.f26581a = runnable;
        this.f26582b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f26581a.run();
            this.f26582b.run();
        } catch (Throwable th2) {
            try {
                this.f26582b.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
