package N2;

import N2.c;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f4466b;

    public b(c cVar) {
        this.f4466b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f4466b;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f4469c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
