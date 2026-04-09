package io.sentry;

/* loaded from: classes.dex */
public final class q implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12667a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12668d;

    public /* synthetic */ q(int i10, Object obj) {
        this.f12667a = i10;
        this.f12668d = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f12667a) {
            case 0:
                r.f12686a.set((b1) this.f12668d);
                break;
            default:
                ((io.sentry.util.a) this.f12668d).unlock();
                break;
        }
    }
}
