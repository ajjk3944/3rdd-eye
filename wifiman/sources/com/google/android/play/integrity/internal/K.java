package com.google.android.play.integrity.internal;

/* loaded from: classes3.dex */
final class K extends G {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C5030f f38121g;

    K(C5030f c5030f) {
        this.f38121g = c5030f;
    }

    @Override // com.google.android.play.integrity.internal.G
    public final void b() {
        synchronized (this.f38121g.f38134f) {
            try {
                if (this.f38121g.f38140l.get() > 0 && this.f38121g.f38140l.decrementAndGet() > 0) {
                    this.f38121g.f38130b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C5030f c5030f = this.f38121g;
                if (c5030f.f38142n != null) {
                    c5030f.f38130b.d("Unbind from service.", new Object[0]);
                    C5030f c5030f2 = this.f38121g;
                    c5030f2.f38129a.unbindService(c5030f2.f38141m);
                    this.f38121g.f38135g = false;
                    this.f38121g.f38142n = null;
                    this.f38121g.f38141m = null;
                }
                this.f38121g.x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
