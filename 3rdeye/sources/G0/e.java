package G0;

/* compiled from: CancellationSignal.java */
@Deprecated
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1846a;

    /* renamed from: b, reason: collision with root package name */
    public a f1847b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1848c;

    /* compiled from: CancellationSignal.java */
    public interface a {
        void b();
    }

    public final void a(a aVar) {
        synchronized (this) {
            while (this.f1848c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f1847b == aVar) {
                return;
            }
            this.f1847b = aVar;
            if (this.f1846a) {
                aVar.b();
            }
        }
    }
}
