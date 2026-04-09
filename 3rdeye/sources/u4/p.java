package u4;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class p extends m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f46579c;

    public p(u uVar) {
        this.f46579c = uVar;
    }

    @Override // u4.m
    public final void a() {
        synchronized (this.f46579c.f46591f) {
            try {
                if (this.f46579c.f46595k.get() > 0 && this.f46579c.f46595k.decrementAndGet() > 0) {
                    this.f46579c.f46587b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                u uVar = this.f46579c;
                if (uVar.f46597m != null) {
                    uVar.f46587b.a("Unbind from service.", new Object[0]);
                    u uVar2 = this.f46579c;
                    uVar2.f46586a.unbindService(uVar2.f46596l);
                    u uVar3 = this.f46579c;
                    uVar3.f46592g = false;
                    uVar3.f46597m = null;
                    uVar3.f46596l = null;
                }
                this.f46579c.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
