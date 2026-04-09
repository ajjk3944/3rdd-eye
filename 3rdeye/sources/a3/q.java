package a3;

import a3.p;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.d.a f14153c;

    public q(p.d.a aVar, boolean z10) {
        this.f14153c = aVar;
        this.f14152b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.d.a aVar = this.f14153c;
        aVar.getClass();
        h3.l.a();
        p.d dVar = p.d.this;
        boolean z10 = dVar.f14137a;
        boolean z11 = this.f14152b;
        dVar.f14137a = z11;
        if (z10 != z11) {
            dVar.f14138b.a(z11);
        }
    }
}
