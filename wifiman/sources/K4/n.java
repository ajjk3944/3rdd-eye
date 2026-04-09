package k4;

/* loaded from: classes3.dex */
final class n extends j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f51209b;

    n(t tVar) {
        this.f51209b = tVar;
    }

    @Override // k4.j
    public final void a() {
        synchronized (this.f51209b.f51220f) {
            try {
                if (this.f51209b.f51225k.get() > 0 && this.f51209b.f51225k.decrementAndGet() > 0) {
                    this.f51209b.f51216b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                t tVar = this.f51209b;
                if (tVar.f51227m != null) {
                    tVar.f51216b.c("Unbind from service.", new Object[0]);
                    t tVar2 = this.f51209b;
                    tVar2.f51215a.unbindService(tVar2.f51226l);
                    this.f51209b.f51221g = false;
                    this.f51209b.f51227m = null;
                    this.f51209b.f51226l = null;
                }
                this.f51209b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
