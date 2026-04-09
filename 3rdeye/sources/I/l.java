package I;

/* compiled from: Futures.java */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A4.a f2364b;

    public l(A4.a aVar) {
        this.f2364b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2364b.cancel(true);
    }
}
