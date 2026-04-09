package a3;

import a3.p;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.e f14156c;

    public s(p.e eVar, boolean z10) {
        this.f14156c = eVar;
        this.f14155b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14156c.f14144b.a(this.f14155b);
    }
}
