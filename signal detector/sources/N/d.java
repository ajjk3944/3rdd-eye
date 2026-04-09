package N;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2960a;

    /* renamed from: b, reason: collision with root package name */
    public c f2961b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2962c;

    public final void a(c cVar) {
        synchronized (this) {
            while (this.f2962c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f2961b == cVar) {
                return;
            }
            this.f2961b = cVar;
            if (this.f2960a) {
                cVar.onCancel();
            }
        }
    }
}
